package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {
    public final I1 a;
    public volatile L0 b;
    public volatile Q c;

    public Z1(I1 i1, L0 l0, Q q) {
        io.sentry.config.a.C(l0, "ISentryClient is required.");
        this.b = l0;
        io.sentry.config.a.C(q, "Scope is required.");
        this.c = q;
        io.sentry.config.a.C(i1, "Options is required");
        this.a = i1;
    }

    public Z1(Z1 z1) {
        this.a = z1.a;
        this.b = z1.b;
        this.c = z1.c.a();
    }
}
