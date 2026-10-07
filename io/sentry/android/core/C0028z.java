package io.sentry.android.core;

import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0028z extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f87o;
    public final boolean p;
    public final boolean q;

    public C0028z(long j, ILogger iLogger, long j2, boolean z, boolean z2) {
        super(j, iLogger);
        this.f87o = j2;
        this.p = z;
        this.q = z2;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return Long.valueOf(this.f87o);
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String d() {
        return this.q ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.t tVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.t tVar) {
    }
}
