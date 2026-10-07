package o;

/* JADX INFO: renamed from: o.uD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2929uD extends AD {
    public C2929uD() {
        super("InHead", 3);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            c1081bD.C((C1613gk0) abstractC3015v6);
            return true;
        }
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        if (iW == 0) {
            c1081bD.s(this);
            return false;
        }
        if (iW == 1) {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            String str = c2101lk0.f921o;
            if (str.equals("html")) {
                return AD.r.c(abstractC3015v6, c1081bD);
            }
            if (AbstractC1021ah0.d(str, AbstractC1468fA.b)) {
                C3176wp c3176wpG = c1081bD.G(c2101lk0);
                if (str.equals("base") && c3176wpG.r("href") && !c1081bD.n) {
                    String strB = c3176wpG.b("href");
                    if (strB.length() != 0) {
                        c1081bD.f = strB;
                        c1081bD.n = true;
                        C0660On c0660On = c1081bD.d;
                        c0660On.getClass();
                        c0660On.N(strB);
                    }
                }
            } else if (str.equals("meta")) {
                c1081bD.G(c2101lk0);
            } else {
                boolean zEquals = str.equals("title");
                C3317yD c3317yD = AD.s;
                if (zEquals) {
                    c1081bD.c.o(El0.n);
                    c1081bD.m = c1081bD.l;
                    c1081bD.l = c3317yD;
                    c1081bD.F(c2101lk0);
                } else if (AbstractC1021ah0.d(str, AbstractC1468fA.c)) {
                    AD.b(c2101lk0, c1081bD);
                } else if (str.equals("noscript")) {
                    c1081bD.F(c2101lk0);
                    c1081bD.l = AD.p;
                } else if (str.equals("script")) {
                    c1081bD.c.o(El0.q);
                    c1081bD.m = c1081bD.l;
                    c1081bD.l = c3317yD;
                    c1081bD.F(c2101lk0);
                } else {
                    if (str.equals("head")) {
                        c1081bD.s(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        c1081bD.i("head");
                        return c1081bD.h(abstractC3015v6);
                    }
                    c1081bD.F(c2101lk0);
                    c1081bD.q.add(null);
                    c1081bD.u = false;
                    C1959kD c1959kD = AD.C;
                    c1081bD.l = c1959kD;
                    c1081bD.P(c1959kD);
                }
            }
        } else if (iW == 2) {
            String str2 = ((C2003kk0) abstractC3015v6).f921o;
            if (str2.equals("head")) {
                c1081bD.g();
                c1081bD.l = AD.q;
            } else {
                if (AbstractC1021ah0.d(str2, AbstractC1468fA.d)) {
                    c1081bD.i("head");
                    return c1081bD.h(abstractC3015v6);
                }
                if (!str2.equals("template")) {
                    c1081bD.s(this);
                    return false;
                }
                if (c1081bD.K(str2)) {
                    c1081bD.u(true);
                    if (!c1081bD.b(str2)) {
                        c1081bD.s(this);
                    }
                    c1081bD.N(str2);
                    c1081bD.m();
                    c1081bD.O();
                    c1081bD.T();
                } else {
                    c1081bD.s(this);
                }
            }
        } else {
            if (iW != 3) {
                c1081bD.i("head");
                return c1081bD.h(abstractC3015v6);
            }
            c1081bD.E((C1711hk0) abstractC3015v6);
        }
        return true;
    }
}
