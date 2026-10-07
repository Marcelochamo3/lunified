package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023u implements io.sentry.hints.a, io.sentry.hints.k {
    public final boolean l;

    public C0023u(boolean z) {
        this.l = z;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String d() {
        return this.l ? "anr_background" : "anr_foreground";
    }
}
