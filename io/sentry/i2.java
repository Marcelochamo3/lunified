package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends io.sentry.hints.c implements io.sentry.hints.h, io.sentry.hints.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f114o;

    public i2(long j, ILogger iLogger) {
        super(j, iLogger);
        this.f114o = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = (io.sentry.protocol.t) this.f114o.get();
        return tVar2 != null && tVar2.equals(tVar);
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.t tVar) {
        this.f114o.set(tVar);
    }
}
