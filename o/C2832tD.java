package o;

/* JADX INFO: renamed from: o.tD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2832tD extends AD {
    public C2832tD() {
        super("BeforeHead", 2);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            c1081bD.C((C1613gk0) abstractC3015v6);
            return true;
        }
        if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
            return true;
        }
        if (abstractC3015v6.s()) {
            c1081bD.s(this);
            return false;
        }
        if (abstractC3015v6.w() && ((C2101lk0) abstractC3015v6).f921o.equals("html")) {
            return AD.r.c(abstractC3015v6, c1081bD);
        }
        if (abstractC3015v6.w()) {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            if (c2101lk0.f921o.equals("head")) {
                c1081bD.f691o = c1081bD.F(c2101lk0);
                c1081bD.l = AD.f167o;
                return true;
            }
        }
        if (abstractC3015v6.v() && AbstractC1021ah0.d(((C2003kk0) abstractC3015v6).f921o, AbstractC1468fA.f)) {
            c1081bD.j("head");
            return c1081bD.h(abstractC3015v6);
        }
        if (abstractC3015v6.v()) {
            c1081bD.s(this);
            return false;
        }
        c1081bD.j("head");
        return c1081bD.h(abstractC3015v6);
    }
}
