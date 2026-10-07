package io.sentry.android.replay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.C0072p0;
import io.sentry.C0083q1;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.C0105y0;
import io.sentry.E;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import io.sentry.K;
import io.sentry.M0;
import io.sentry.M1;
import io.sentry.N0;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC1474fG;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public final class ReplayIntegration implements InterfaceC0002a0, Closeable, N0, ComponentCallbacks {
    public final Context l;
    public I1 m;
    public K n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f88o;
    public io.sentry.android.replay.capture.g s;
    public r v;
    public final Rh0 p = new Rh0(a.f89o);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public M0 t = C0105y0.n;
    public final C0072p0 u = new C0072p0(8, false);

    public ReplayIntegration(Context context) {
        this.l = context;
    }

    @Override // io.sentry.N0
    public final M0 K() {
        return this.t;
    }

    public final void a(c cVar) {
        this.t = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.q.get()) {
            try {
                this.l.unregisterComponentCallbacks(this);
            } catch (Throwable unused) {
            }
            stop();
            w wVar = this.f88o;
            if (wVar != null) {
                wVar.close();
            }
            this.f88o = null;
        }
    }

    @Override // io.sentry.N0
    public final void f() {
        q qVar;
        if (this.q.get() && this.r.get()) {
            w wVar = this.f88o;
            if (wVar != null && (qVar = wVar.s) != null) {
                qVar.x.set(false);
                WeakReference weakReference = qVar.q;
                qVar.c(weakReference != null ? (View) weakReference.get() : null);
            }
            io.sentry.android.replay.capture.g gVar = this.s;
            if (gVar != null) {
                gVar.h();
            }
        }
    }

    @Override // io.sentry.N0
    public final void i() {
        q qVar;
        View view;
        ViewTreeObserver viewTreeObserver;
        if (this.q.get() && this.r.get()) {
            io.sentry.android.replay.capture.g gVar = this.s;
            if (gVar != null) {
                gVar.g.set(io.sentry.config.a.j());
            }
            w wVar = this.f88o;
            if (wVar == null || (qVar = wVar.s) == null) {
                return;
            }
            WeakReference weakReference = qVar.q;
            if (weakReference != null && (view = (View) weakReference.get()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnDrawListener(qVar);
            }
            qVar.x.set(true);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        Double d;
        E e = E.a;
        this.m = i1;
        if (Build.VERSION.SDK_INT < 26) {
            i1.getLogger().h(EnumC0094u1.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d2 = i1.getExperimental().a.a;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = i1.getExperimental().a.b) == null || d.doubleValue() <= 0.0d)) {
            i1.getLogger().h(EnumC0094u1.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.n = e;
        I1 i2 = this.m;
        if (i2 == null) {
            AbstractC1474fG.U("options");
            throw null;
        }
        i2.addScopeObserver(new k(0, this));
        this.f88o = new w(i1, this, this, this.u);
        this.q.set(true);
        try {
            this.l.registerComponentCallbacks(this);
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
        }
        io.sentry.config.a.a(ReplayIntegration.class);
        C0088s1.j().f("maven:io.sentry:sentry-android-replay");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC1474fG.j(configuration, "newConfig");
        if (this.q.get() && this.r.get()) {
            w wVar = this.f88o;
            if (wVar != null) {
                wVar.f();
            }
            I1 i1 = this.m;
            if (i1 == null) {
                AbstractC1474fG.U("options");
                throw null;
            }
            M1 m1 = i1.getExperimental().a;
            AbstractC1474fG.i(m1, "options.experimental.sessionReplay");
            r rVarG = io.sentry.config.a.g(this.l, m1);
            this.v = rVarG;
            io.sentry.android.replay.capture.g gVar = this.s;
            if (gVar != null) {
                gVar.d(rVarG);
            }
            w wVar2 = this.f88o;
            if (wVar2 != null) {
                r rVar = this.v;
                if (rVar != null) {
                    wVar2.a(rVar);
                } else {
                    AbstractC1474fG.U("recorderConfig");
                    throw null;
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // io.sentry.N0
    public final void start() {
        io.sentry.android.replay.capture.g mVar;
        if (this.q.get()) {
            if (this.r.getAndSet(true)) {
                I1 i1 = this.m;
                if (i1 != null) {
                    i1.getLogger().h(EnumC0094u1.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                    return;
                } else {
                    AbstractC1474fG.U("options");
                    throw null;
                }
            }
            Rh0 rh0 = this.p;
            SecureRandom secureRandom = (SecureRandom) rh0.getValue();
            I1 i2 = this.m;
            if (i2 == null) {
                AbstractC1474fG.U("options");
                throw null;
            }
            Double d = i2.getExperimental().a.a;
            AbstractC1474fG.j(secureRandom, "<this>");
            boolean z = d != null && d.doubleValue() >= secureRandom.nextDouble();
            if (!z) {
                I1 i3 = this.m;
                if (i3 == null) {
                    AbstractC1474fG.U("options");
                    throw null;
                }
                Double d2 = i3.getExperimental().a.b;
                if (d2 == null || d2.doubleValue() <= 0.0d) {
                    I1 i4 = this.m;
                    if (i4 != null) {
                        i4.getLogger().h(EnumC0094u1.INFO, "Session replay is not started, full session was not sampled and errorSampleRate is not specified", new Object[0]);
                        return;
                    } else {
                        AbstractC1474fG.U("options");
                        throw null;
                    }
                }
            }
            I1 i5 = this.m;
            if (i5 == null) {
                AbstractC1474fG.U("options");
                throw null;
            }
            M1 m1 = i5.getExperimental().a;
            AbstractC1474fG.i(m1, "options.experimental.sessionReplay");
            r rVarG = io.sentry.config.a.g(this.l, m1);
            this.v = rVarG;
            io.sentry.transport.d dVar = io.sentry.transport.d.l;
            if (z) {
                I1 i6 = this.m;
                if (i6 == null) {
                    AbstractC1474fG.U("options");
                    throw null;
                }
                mVar = new io.sentry.android.replay.capture.p(i6, this.n, dVar, rVarG, null, 16);
            } else {
                I1 i7 = this.m;
                if (i7 == null) {
                    AbstractC1474fG.U("options");
                    throw null;
                }
                mVar = new io.sentry.android.replay.capture.m(i7, this.n, rVarG, (SecureRandom) rh0.getValue());
            }
            this.s = mVar;
            mVar.k(0, new io.sentry.protocol.t((UUID) null), true);
            w wVar = this.f88o;
            if (wVar != null) {
                r rVar = this.v;
                if (rVar != null) {
                    wVar.a(rVar);
                } else {
                    AbstractC1474fG.U("recorderConfig");
                    throw null;
                }
            }
        }
    }

    @Override // io.sentry.N0
    public final void stop() {
        if (this.q.get()) {
            AtomicBoolean atomicBoolean = this.r;
            if (atomicBoolean.get()) {
                w wVar = this.f88o;
                if (wVar != null) {
                    wVar.f();
                }
                io.sentry.android.replay.capture.g gVar = this.s;
                if (gVar != null) {
                    gVar.l();
                }
                atomicBoolean.set(false);
                io.sentry.android.replay.capture.g gVar2 = this.s;
                if (gVar2 != null) {
                    io.sentry.config.a.s(gVar2.c(), gVar2.a);
                }
                this.s = null;
            }
        }
    }

    @Override // io.sentry.N0
    public final void t(C0083q1 c0083q1, C0104y c0104y) {
        AtomicReference atomicReference;
        int i = 1;
        AtomicBoolean atomicBoolean = this.q;
        if (atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = this.r;
            if (atomicBoolean2.get()) {
                if (!c0083q1.c() && c0083q1.b() == null) {
                    I1 i1 = this.m;
                    if (i1 != null) {
                        i1.getLogger().h(EnumC0094u1.DEBUG, "Event is not error or crash, not capturing for event %s", c0083q1.l);
                        return;
                    } else {
                        AbstractC1474fG.U("options");
                        throw null;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(c0083q1.b() != null);
                String strValueOf = String.valueOf(c0083q1.l);
                if (atomicBoolean.get() && atomicBoolean2.get()) {
                    io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
                    io.sentry.android.replay.capture.g gVar = this.s;
                    if (tVar.equals((gVar == null || (atomicReference = gVar.j) == null) ? null : (io.sentry.protocol.t) atomicReference.get())) {
                        I1 i2 = this.m;
                        if (i2 != null) {
                            i2.getLogger().h(EnumC0094u1.DEBUG, "Replay id is not set, not capturing for event %s", strValueOf);
                            return;
                        } else {
                            AbstractC1474fG.U("options");
                            throw null;
                        }
                    }
                    io.sentry.android.replay.capture.g gVar2 = this.s;
                    if (gVar2 != null) {
                        gVar2.j(AbstractC1474fG.b(boolValueOf, Boolean.TRUE), strValueOf, c0104y, new f(i, this));
                    }
                    io.sentry.android.replay.capture.g gVar3 = this.s;
                    this.s = gVar3 != null ? gVar3.a() : null;
                }
            }
        }
    }
}
