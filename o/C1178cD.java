package o;

/* JADX INFO: renamed from: o.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1178cD extends AD {
    public C1178cD() {
        super("InTableText", 9);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (abstractC3015v6.m == 5) {
            C1613gk0 c1613gk0 = (C1613gk0) abstractC3015v6;
            if (c1613gk0.n.equals(AD.J)) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.getClass();
            c1081bD.s.add(c1613gk0.clone());
            return true;
        }
        if (c1081bD.s.size() > 0) {
            AbstractC3015v6 abstractC3015v7 = c1081bD.g;
            for (C1613gk0 c1613gk1 : c1081bD.s) {
                c1081bD.g = c1613gk1;
                if (AD.a(c1613gk1)) {
                    c1081bD.C(c1613gk1);
                } else {
                    c1081bD.s(this);
                    boolean zD = AbstractC1021ah0.d(c1081bD.a().f1103o.m, AbstractC1468fA.C);
                    C3220xD c3220xD = AD.r;
                    if (zD) {
                        c1081bD.v = true;
                        c3220xD.c(c1613gk1, c1081bD);
                        c1081bD.v = false;
                    } else {
                        c3220xD.c(c1613gk1, c1081bD);
                    }
                }
            }
            c1081bD.g = abstractC3015v7;
            c1081bD.s.clear();
        }
        c1081bD.l = c1081bD.m;
        return c1081bD.h(abstractC3015v6);
    }
}
