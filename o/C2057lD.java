package o;

/* JADX INFO: renamed from: o.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2057lD extends AD {
    public C2057lD() {
        super("AfterBody", 18);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        C3176wp c3176wpW = c1081bD.w("html");
        boolean zA = AD.a(abstractC3015v6);
        C3220xD c3220xD = AD.r;
        if (zA) {
            if (c3176wpW != null) {
                C1081bD.D((C1613gk0) abstractC3015v6, c3176wpW);
                return true;
            }
            c3220xD.c(abstractC3015v6, c1081bD);
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
            return c3220xD.c(abstractC3015v6, c1081bD);
        }
        if (abstractC3015v6.v() && ((C2003kk0) abstractC3015v6).f921o.equals("html")) {
            c1081bD.l = AD.G;
            return true;
        }
        if (abstractC3015v6.u()) {
            return true;
        }
        c1081bD.s(this);
        if (!c1081bD.K("body")) {
            c1081bD.e.add(c1081bD.d.b0());
        }
        c1081bD.l = c3220xD;
        return c1081bD.h(abstractC3015v6);
    }
}
