package io.sentry.transport;

import io.sentry.AbstractC0049h1;
import io.sentry.B;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0052i1;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m extends ThreadPoolExecutor {
    public final int l;
    public AbstractC0049h1 m;
    public final ILogger n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0052i1 f150o;
    public final C0072p0 p;

    public m(int i, B b, a aVar, ILogger iLogger, InterfaceC0052i1 interfaceC0052i1) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), b, aVar);
        this.m = null;
        this.p = new C0072p0(10, false);
        this.l = i;
        this.n = iLogger;
        this.f150o = interfaceC0052i1;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        C0072p0 c0072p0 = this.p;
        try {
            super.afterExecute(runnable, th);
        } finally {
            c0072p0.getClass();
            int i = n.l;
            ((n) c0072p0.l).releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C0072p0 c0072p0 = this.p;
        if (n.a((n) c0072p0.l) < this.l) {
            n.b((n) c0072p0.l);
            return super.submit(runnable);
        }
        this.m = this.f150o.y();
        this.n.h(EnumC0094u1.WARNING, "Submit cancelled", new Object[0]);
        return new l();
    }
}
