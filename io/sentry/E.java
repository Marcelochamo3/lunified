package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class E implements K {
    public static final E a = new E();

    @Override // io.sentry.K
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K clone() {
        return AbstractC0031b1.d().clone();
    }

    @Override // io.sentry.K
    public final W b() {
        return AbstractC0031b1.d().b();
    }

    @Override // io.sentry.K
    public final void c(C0041f c0041f, C0104y c0104y) {
        AbstractC0031b1.d().c(c0041f, c0104y);
    }

    @Override // io.sentry.K
    public final void d(boolean z) {
        AbstractC0031b1.c();
    }

    @Override // io.sentry.K
    public final r e() {
        return AbstractC0031b1.d().e();
    }

    @Override // io.sentry.K
    public final void f(C0041f c0041f) {
        c(c0041f, new C0104y());
    }

    @Override // io.sentry.K
    public final boolean g() {
        return AbstractC0031b1.d().g();
    }

    @Override // io.sentry.K
    public final void h() {
        AbstractC0031b1.d().h();
    }

    @Override // io.sentry.K
    public final void i() {
        AbstractC0031b1.d().i();
    }

    @Override // io.sentry.K
    public final boolean isEnabled() {
        return AbstractC0031b1.g();
    }

    @Override // io.sentry.K
    public final void j(long j) {
        AbstractC0031b1.d().j(j);
    }

    @Override // io.sentry.K
    public final W k(f2 f2Var, g2 g2Var) {
        return AbstractC0031b1.d().k(f2Var, g2Var);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t l(io.sentry.protocol.A a2, d2 d2Var, C0104y c0104y) {
        return r(a2, d2Var, c0104y, null);
    }

    @Override // io.sentry.K
    public final void m(U0 u0) {
        AbstractC0031b1.d().m(u0);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t n(Throwable th) {
        return o(th, new C0104y());
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t o(Throwable th, C0104y c0104y) {
        return AbstractC0031b1.d().o(th, c0104y);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t p(String str) {
        return q(str, EnumC0094u1.INFO);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t q(String str, EnumC0094u1 enumC0094u1) {
        return AbstractC0031b1.d().q(str, enumC0094u1);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t r(io.sentry.protocol.A a2, d2 d2Var, C0104y c0104y, J0 j0) {
        return AbstractC0031b1.d().r(a2, d2Var, c0104y, j0);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t s(K1 k1, C0104y c0104y) {
        return AbstractC0031b1.d().s(k1, c0104y);
    }

    @Override // io.sentry.K
    public final I1 t() {
        return AbstractC0031b1.d().t();
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t u(C0088s1 c0088s1, C0104y c0104y) {
        return AbstractC0031b1.d().u(c0088s1, c0104y);
    }

    @Override // io.sentry.K
    public final void v(U0 u0) {
        AbstractC0031b1.h(u0);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t w(C0083q1 c0083q1, C0104y c0104y) {
        return AbstractC0031b1.d().w(c0083q1, c0104y);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t x(C0088s1 c0088s1) {
        return u(c0088s1, new C0104y());
    }
}
