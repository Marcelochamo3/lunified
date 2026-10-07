package o;

/* JADX INFO: renamed from: o.zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3414zD extends AD {
    public C3414zD() {
        super("InTable", 8);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (abstractC3015v6.q() && AbstractC1021ah0.d(c1081bD.a().f1103o.m, AbstractC1468fA.C)) {
            c1081bD.s.clear();
            c1081bD.m = c1081bD.l;
            c1081bD.l = AD.u;
            return c1081bD.h(abstractC3015v6);
        }
        if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
            return true;
        }
        if (abstractC3015v6.s()) {
            c1081bD.s(this);
            return false;
        }
        boolean zW = abstractC3015v6.w();
        C2929uD c2929uD = AD.f167o;
        if (!zW) {
            if (!abstractC3015v6.v()) {
                if (!abstractC3015v6.u()) {
                    d(abstractC3015v6, c1081bD);
                    return true;
                }
                if (c1081bD.b("html")) {
                    c1081bD.s(this);
                }
                return true;
            }
            String str = ((C2003kk0) abstractC3015v6).f921o;
            if (str.equals("table")) {
                if (!c1081bD.B(str)) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.N("table");
                c1081bD.T();
            } else {
                if (AbstractC1021ah0.d(str, AbstractC1468fA.B)) {
                    c1081bD.s(this);
                    return false;
                }
                if (!str.equals("template")) {
                    d(abstractC3015v6, c1081bD);
                    return true;
                }
                c1081bD.getClass();
                c2929uD.c(abstractC3015v6, c1081bD);
            }
            return true;
        }
        C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
        String str2 = c2101lk0.f921o;
        if (str2.equals("caption")) {
            c1081bD.o();
            c1081bD.q.add(null);
            c1081bD.F(c2101lk0);
            c1081bD.l = AD.v;
        } else if (str2.equals("colgroup")) {
            c1081bD.o();
            c1081bD.F(c2101lk0);
            c1081bD.l = AD.w;
        } else {
            if (str2.equals("col")) {
                c1081bD.o();
                c1081bD.j("colgroup");
                return c1081bD.h(abstractC3015v6);
            }
            if (AbstractC1021ah0.d(str2, AbstractC1468fA.u)) {
                c1081bD.o();
                c1081bD.F(c2101lk0);
                c1081bD.l = AD.x;
            } else {
                if (AbstractC1021ah0.d(str2, AbstractC1468fA.v)) {
                    c1081bD.o();
                    c1081bD.j("tbody");
                    return c1081bD.h(abstractC3015v6);
                }
                if (str2.equals("table")) {
                    c1081bD.s(this);
                    if (!c1081bD.B(str2)) {
                        return false;
                    }
                    c1081bD.N(str2);
                    if (c1081bD.T()) {
                        return c1081bD.h(abstractC3015v6);
                    }
                    c1081bD.F(c2101lk0);
                    return true;
                }
                if (AbstractC1021ah0.d(str2, AbstractC1468fA.w)) {
                    c1081bD.getClass();
                    return c2929uD.c(abstractC3015v6, c1081bD);
                }
                if (str2.equals("input")) {
                    if (!c2101lk0.L() || !c2101lk0.q.k("type").equalsIgnoreCase("hidden")) {
                        d(abstractC3015v6, c1081bD);
                        return true;
                    }
                    c1081bD.G(c2101lk0);
                } else {
                    if (!str2.equals("form")) {
                        d(abstractC3015v6, c1081bD);
                        return true;
                    }
                    c1081bD.s(this);
                    if (c1081bD.p != null || c1081bD.K("template")) {
                        return false;
                    }
                    c1081bD.I(c2101lk0, false, false);
                }
            }
        }
        return true;
    }

    public final void d(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        c1081bD.s(this);
        c1081bD.v = true;
        AD.r.c(abstractC3015v6, c1081bD);
        c1081bD.v = false;
    }
}
