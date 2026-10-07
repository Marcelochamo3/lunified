package io.sentry.android.core;

import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class M implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f61o;
    public final ILogger p;
    public CountDownLatch n = new CountDownLatch(1);
    public boolean l = false;
    public boolean m = false;

    public M(long j, ILogger iLogger) {
        this.f61o = j;
        io.sentry.config.a.C(iLogger, "ILogger is required.");
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
            return this.n.await(this.f61o, TimeUnit.MILLISECONDS);
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
