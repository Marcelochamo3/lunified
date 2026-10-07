package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0071p implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {
    public boolean l = false;
    public boolean m = false;
    public final CountDownLatch n = new CountDownLatch(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f118o;
    public final ILogger p;
    public final String q;
    public final Queue r;

    public C0071p(long j, ILogger iLogger, String str, b2 b2Var) {
        this.f118o = j;
        this.q = str;
        this.r = b2Var;
        this.p = iLogger;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.l;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z) {
        this.m = z;
        this.n.countDown();
    }

    @Override // io.sentry.hints.f
    public final boolean c() {
        try {
            return this.n.await(this.f118o, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.p.v(EnumC0094u1.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean d() {
        return this.m;
    }

    @Override // io.sentry.hints.g
    public final void e(boolean z) {
        this.l = z;
    }
}
