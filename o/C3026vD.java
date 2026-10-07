package o;

/* JADX INFO: renamed from: o.vD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3026vD extends AD {
    public C3026vD() {
        super("InHeadNoscript", 4);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (abstractC3015v6.s()) {
            c1081bD.s(this);
        } else {
            if (abstractC3015v6.w() && ((C2101lk0) abstractC3015v6).f921o.equals("html")) {
                C3220xD c3220xD = AD.r;
                c1081bD.getClass();
                return c3220xD.c(abstractC3015v6, c1081bD);
            }
            boolean zV = abstractC3015v6.v();
            C2929uD c2929uD = AD.f167o;
            if (!zV || !((C2003kk0) abstractC3015v6).f921o.equals("noscript")) {
                if (AD.a(abstractC3015v6) || abstractC3015v6.r() || (abstractC3015v6.w() && AbstractC1021ah0.d(((C2101lk0) abstractC3015v6).f921o, AbstractC1468fA.g))) {
                    c1081bD.getClass();
                    return c2929uD.c(abstractC3015v6, c1081bD);
                }
                if (abstractC3015v6.v() && ((C2003kk0) abstractC3015v6).f921o.equals("br")) {
                    c1081bD.s(this);
                    C1613gk0 c1613gk0 = new C1613gk0(5, 4);
                    c1613gk0.n = abstractC3015v6.toString();
                    c1081bD.C(c1613gk0);
                    return true;
                }
                if ((abstractC3015v6.w() && AbstractC1021ah0.d(((C2101lk0) abstractC3015v6).f921o, AbstractC1468fA.K)) || abstractC3015v6.v()) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.s(this);
                C1613gk0 c1613gk1 = new C1613gk0(5, 4);
                c1613gk1.n = abstractC3015v6.toString();
                c1081bD.C(c1613gk1);
                return true;
            }
            c1081bD.g();
            c1081bD.l = c2929uD;
        }
        return true;
    }
}
