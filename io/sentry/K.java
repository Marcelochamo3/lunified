package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public interface K {
    /* JADX INFO: renamed from: a */
    K clone();

    W b();

    void c(C0041f c0041f, C0104y c0104y);

    void d(boolean z);

    r e();

    void f(C0041f c0041f);

    boolean g();

    void h();

    void i();

    boolean isEnabled();

    void j(long j);

    W k(f2 f2Var, g2 g2Var);

    io.sentry.protocol.t l(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y);

    void m(U0 u0);

    io.sentry.protocol.t n(Throwable th);

    io.sentry.protocol.t o(Throwable th, C0104y c0104y);

    io.sentry.protocol.t p(String str);

    io.sentry.protocol.t q(String str, EnumC0094u1 enumC0094u1);

    io.sentry.protocol.t r(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y, J0 j0);

    io.sentry.protocol.t s(K1 k1, C0104y c0104y);

    I1 t();

    io.sentry.protocol.t u(C0088s1 c0088s1, C0104y c0104y);

    void v(U0 u0);

    io.sentry.protocol.t w(C0083q1 c0083q1, C0104y c0104y);

    io.sentry.protocol.t x(C0088s1 c0088s1);
}
