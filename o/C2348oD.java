package o;

/* JADX INFO: renamed from: o.oD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2348oD extends AD {
    public C2348oD() {
        super("AfterFrameset", 20);
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
            C3220xD c3220xD = AD.r;
            c1081bD.getClass();
            return c3220xD.c(abstractC3015v6, c1081bD);
        }
        if (abstractC3015v6.v() && ((C2003kk0) abstractC3015v6).f921o.equals("html")) {
            c1081bD.l = AD.H;
            return true;
        }
        if (abstractC3015v6.w() && ((C2101lk0) abstractC3015v6).f921o.equals("noframes")) {
            C2929uD c2929uD = AD.f167o;
            c1081bD.getClass();
            return c2929uD.c(abstractC3015v6, c1081bD);
        }
        if (abstractC3015v6.u()) {
            return true;
        }
        c1081bD.s(this);
        return false;
    }
}
