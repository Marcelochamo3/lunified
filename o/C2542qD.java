package o;

/* JADX INFO: renamed from: o.qD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2542qD extends AD {
    public C2542qD() {
        super("AfterAfterFrameset", 22);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
            return true;
        }
        if (abstractC3015v6.s() || AD.a(abstractC3015v6) || (abstractC3015v6.w() && ((C2101lk0) abstractC3015v6).f921o.equals("html"))) {
            C3220xD c3220xD = AD.r;
            c1081bD.getClass();
            return c3220xD.c(abstractC3015v6, c1081bD);
        }
        if (abstractC3015v6.u()) {
            return true;
        }
        if (!abstractC3015v6.w() || !((C2101lk0) abstractC3015v6).f921o.equals("noframes")) {
            c1081bD.s(this);
            return false;
        }
        C2929uD c2929uD = AD.f167o;
        c1081bD.getClass();
        return c2929uD.c(abstractC3015v6, c1081bD);
    }
}
