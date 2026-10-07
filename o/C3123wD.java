package o;

/* JADX INFO: renamed from: o.wD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3123wD extends AD {
    public C3123wD() {
        super("AfterHead", 5);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            c1081bD.C((C1613gk0) abstractC3015v6);
        } else if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
        } else if (abstractC3015v6.s()) {
            c1081bD.s(this);
        } else {
            boolean zW = abstractC3015v6.w();
            C2929uD c2929uD = AD.f167o;
            if (zW) {
                C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
                String str = c2101lk0.f921o;
                boolean zEquals = str.equals("html");
                C3220xD c3220xD = AD.r;
                if (zEquals) {
                    c1081bD.getClass();
                    return c3220xD.c(abstractC3015v6, c1081bD);
                }
                if (str.equals("body")) {
                    c1081bD.F(c2101lk0);
                    c1081bD.u = false;
                    c1081bD.l = c3220xD;
                } else if (str.equals("frameset")) {
                    c1081bD.F(c2101lk0);
                    c1081bD.l = AD.E;
                } else if (AbstractC1021ah0.d(str, AbstractC1468fA.h)) {
                    c1081bD.s(this);
                    C3176wp c3176wp = c1081bD.f691o;
                    c1081bD.e.add(c3176wp);
                    c2929uD.c(abstractC3015v6, c1081bD);
                    c1081bD.S(c3176wp);
                } else {
                    if (str.equals("head")) {
                        c1081bD.s(this);
                        return false;
                    }
                    c1081bD.j("body");
                    c1081bD.u = true;
                    c1081bD.h(abstractC3015v6);
                }
            } else if (abstractC3015v6.v()) {
                String str2 = ((C2003kk0) abstractC3015v6).f921o;
                if (AbstractC1021ah0.d(str2, AbstractC1468fA.e)) {
                    c1081bD.j("body");
                    c1081bD.u = true;
                    c1081bD.h(abstractC3015v6);
                } else {
                    if (!str2.equals("template")) {
                        c1081bD.s(this);
                        return false;
                    }
                    c1081bD.getClass();
                    c2929uD.c(abstractC3015v6, c1081bD);
                }
            } else {
                c1081bD.j("body");
                c1081bD.u = true;
                c1081bD.h(abstractC3015v6);
            }
        }
        return true;
    }
}
