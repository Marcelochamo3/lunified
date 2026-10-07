package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Wq0 implements InterfaceC2339o7 {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1041ar0 m;

    public /* synthetic */ Wq0(C1041ar0 c1041ar0, int i) {
        this.l = i;
        this.m = c1041ar0;
    }

    @Override // o.InterfaceC2339o7
    public final C1951k70 e(K80 k80, C1855j80 c1855j80) {
        switch (this.l) {
            case 0:
                C1041ar0 c1041ar0 = this.m;
                AbstractC1474fG.j(c1041ar0, "$credentials");
                AbstractC1474fG.j(c1855j80, "response");
                if (c1855j80.l.c.a("Proxy-Authorization") == null) {
                    C0560Kq c0560KqA = c1855j80.l.a();
                    c0560KqA.j("Proxy-Authorization", AbstractC3021v9.c(c1041ar0.d, c1041ar0.e));
                    return c0560KqA.c();
                }
                if (C3084vr0.t != c1041ar0) {
                    return null;
                }
                C3084vr0.x = c1041ar0.a;
                C3084vr0.t = null;
                C3084vr0.v.incrementAndGet();
                if (!C3084vr0.n) {
                    return null;
                }
                C3084vr0 c3084vr0 = C3084vr0.a;
                C3084vr0.e();
                return null;
            case 1:
                C1041ar0 c1041ar1 = this.m;
                AbstractC1474fG.j(c1041ar1, "$credentials");
                AbstractC1474fG.j(c1855j80, "response");
                if (c1855j80.l.c.a("Proxy-Authorization") == null) {
                    C0560Kq c0560KqA2 = c1855j80.l.a();
                    c0560KqA2.j("Proxy-Authorization", AbstractC3021v9.c(c1041ar1.d, c1041ar1.e));
                    return c0560KqA2.c();
                }
                if (C3084vr0.u != c1041ar1) {
                    return null;
                }
                C3084vr0.u = null;
                return null;
            case 2:
                C1041ar0 c1041ar2 = this.m;
                AbstractC1474fG.j(c1041ar2, "$credentials");
                AbstractC1474fG.j(c1855j80, "response");
                C1951k70 c1951k70 = c1855j80.l;
                if (c1951k70.c.a("Proxy-Authorization") != null) {
                    return null;
                }
                C0560Kq c0560KqA3 = c1951k70.a();
                c0560KqA3.j("Proxy-Authorization", AbstractC3021v9.c(c1041ar2.d, c1041ar2.e));
                return c0560KqA3.c();
            default:
                C1041ar0 c1041ar3 = this.m;
                AbstractC1474fG.j(c1041ar3, "$credentials");
                AbstractC1474fG.j(c1855j80, "response");
                C1951k70 c1951k71 = c1855j80.l;
                if (c1951k71.c.a("Proxy-Authorization") != null) {
                    return null;
                }
                C0560Kq c0560KqA4 = c1951k71.a();
                c0560KqA4.j("Proxy-Authorization", AbstractC3021v9.c(c1041ar3.d, c1041ar3.e));
                return c0560KqA4.c();
        }
    }
}
