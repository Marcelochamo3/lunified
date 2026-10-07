package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import io.sentry.C0041f;
import io.sentry.C0062m;
import io.sentry.EnumC0094u1;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC1516fl;
import o.InterfaceC1283dK;

/* JADX INFO: loaded from: classes.dex */
public final class S implements DefaultLifecycleObserver {
    public final AtomicLong l;
    public final AtomicBoolean m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0062m f65o;
    public final Timer p;
    public final Object q;
    public final io.sentry.K r;
    public final boolean s;
    public final boolean t;
    public final io.sentry.transport.f u;

    public S(io.sentry.K k, long j, boolean z, boolean z2) {
        io.sentry.transport.d dVar = io.sentry.transport.d.l;
        this.l = new AtomicLong(0L);
        this.m = new AtomicBoolean(false);
        this.p = new Timer(true);
        this.q = new Object();
        this.n = j;
        this.s = z;
        this.t = z2;
        this.r = k;
        this.u = dVar;
    }

    public final void b(String str) {
        if (this.t) {
            C0041f c0041f = new C0041f();
            c0041f.n = "navigation";
            c0041f.b(str, "state");
            c0041f.p = "app.lifecycle";
            c0041f.q = EnumC0094u1.INFO;
            this.r.f(c0041f);
        }
    }

    public final void c() {
        synchronized (this.q) {
            try {
                C0062m c0062m = this.f65o;
                if (c0062m != null) {
                    c0062m.cancel();
                    this.f65o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.a(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.b(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.c(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.d(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1283dK interfaceC1283dK) {
        c();
        long jB = this.u.b();
        C0008e c0008e = new C0008e(1, this);
        io.sentry.K k = this.r;
        k.m(c0008e);
        AtomicLong atomicLong = this.l;
        long j = atomicLong.get();
        AtomicBoolean atomicBoolean = this.m;
        if (j == 0 || j + this.n <= jB) {
            if (this.s) {
                C0041f c0041f = new C0041f();
                c0041f.n = "session";
                c0041f.b("start", "state");
                c0041f.p = "app.lifecycle";
                c0041f.q = EnumC0094u1.INFO;
                k.f(c0041f);
                k.i();
            }
            k.t().getReplayController().start();
        } else if (!atomicBoolean.get()) {
            k.t().getReplayController().i();
        }
        atomicBoolean.set(false);
        atomicLong.set(jB);
        b("foreground");
        B.b.a(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1283dK interfaceC1283dK) {
        this.l.set(this.u.b());
        this.r.t().getReplayController().f();
        synchronized (this.q) {
            try {
                c();
                if (this.p != null) {
                    C0062m c0062m = new C0062m(2, this);
                    this.f65o = c0062m;
                    this.p.schedule(c0062m, this.n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B.b.a(true);
        b("background");
    }
}
