package io.sentry;

/* JADX INFO: renamed from: io.sentry.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0108z0 implements K {
    public static final C0108z0 b = new C0108z0();
    public final I1 a = I1.empty();

    @Override // io.sentry.K
    /* JADX INFO: renamed from: a */
    public final K clone() {
        return b;
    }

    @Override // io.sentry.K
    public final W b() {
        return null;
    }

    @Override // io.sentry.K
    public final void c(C0041f c0041f, C0104y c0104y) {
    }

    public final Object clone() {
        return b;
    }

    @Override // io.sentry.K
    public final void d(boolean z) {
    }

    @Override // io.sentry.K
    public final r e() {
        return null;
    }

    @Override // io.sentry.K
    public final void f(C0041f c0041f) {
    }

    @Override // io.sentry.K
    public final boolean g() {
        return true;
    }

    @Override // io.sentry.K
    public final void h() {
    }

    @Override // io.sentry.K
    public final void i() {
    }

    @Override // io.sentry.K
    public final boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.K
    public final void j(long j) {
    }

    @Override // io.sentry.K
    public final W k(f2 f2Var, g2 g2Var) {
        return D0.a;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t l(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final void m(U0 u0) {
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t n(Throwable th) {
        return o(th, new C0104y());
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t o(Throwable th, C0104y c0104y) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t p(String str) {
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t q(String str, EnumC0094u1 enumC0094u1) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t r(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y, J0 j0) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t s(K1 k1, C0104y c0104y) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final I1 t() {
        return this.a;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t u(C0088s1 c0088s1, C0104y c0104y) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final void v(U0 u0) {
        u0.c(B0.a);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t w(C0083q1 c0083q1, C0104y c0104y) {
        return io.sentry.protocol.t.m;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t x(C0088s1 c0088s1) {
        return u(c0088s1, new C0104y());
    }
}
