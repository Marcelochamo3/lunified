package io.sentry.exception;

import io.sentry.protocol.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    public final j l;
    public final Throwable m;
    public final Thread n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f110o;

    public a(j jVar, Throwable th, Thread thread, boolean z) {
        this.l = jVar;
        io.sentry.config.a.C(th, "Throwable is required.");
        this.m = th;
        io.sentry.config.a.C(thread, "Thread is required.");
        this.n = thread;
        this.f110o = z;
    }
}
