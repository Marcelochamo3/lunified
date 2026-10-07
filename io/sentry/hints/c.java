package io.sentry.hints;

import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.protocol.t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {
    public final CountDownLatch l = new CountDownLatch(1);
    public final long m;
    public final ILogger n;

    public c(long j, ILogger iLogger) {
        this.m = j;
        this.n = iLogger;
    }

    @Override // io.sentry.hints.f
    public final boolean c() {
        try {
            return this.l.await(this.m, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.n.v(EnumC0094u1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public abstract boolean e(t tVar);

    public abstract void f(t tVar);
}
