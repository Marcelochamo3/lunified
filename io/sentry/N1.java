package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N1 implements U0, V1 {
    public final /* synthetic */ Q1 l;

    public /* synthetic */ N1(Q1 q1) {
        this.l = q1;
    }

    @Override // io.sentry.U0
    public void c(Q q) {
        Q1 q1 = this.l;
        q1.getClass();
        q.n(new C0039e0(q1, 2, q));
    }

    @Override // io.sentry.V1
    public void d(T1 t1) {
        Q1 q1 = this.l;
        h2 h2Var = q1.q;
        if (h2Var != null) {
            h2Var.e(t1);
        }
        P1 p1 = q1.f;
        g2 g2Var = q1.r;
        if (g2Var.e == null) {
            if (p1.a) {
                q1.o(p1.b, null);
            }
        } else if (!g2Var.d || q1.x()) {
            q1.i();
        }
    }
}
