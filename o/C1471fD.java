package o;

/* JADX INFO: renamed from: o.fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1471fD extends AD {
    public C1471fD() {
        super("InTableBody", 12);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        C3414zD c3414zD = AD.t;
        if (iW == 1) {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            String str = c2101lk0.f921o;
            if (!str.equals("tr")) {
                if (AbstractC1021ah0.d(str, AbstractC1468fA.x)) {
                    c1081bD.s(this);
                    c1081bD.j("tr");
                    return c1081bD.h(c2101lk0);
                }
                if (AbstractC1021ah0.d(str, AbstractC1468fA.D)) {
                    return d(abstractC3015v6, c1081bD);
                }
                c1081bD.getClass();
                return c3414zD.c(abstractC3015v6, c1081bD);
            }
            c1081bD.n("tbody", "tfoot", "thead", "template");
            c1081bD.F(c2101lk0);
            c1081bD.l = AD.y;
        } else {
            if (iW != 2) {
                c1081bD.getClass();
                return c3414zD.c(abstractC3015v6, c1081bD);
            }
            String str2 = ((C2003kk0) abstractC3015v6).f921o;
            if (!AbstractC1021ah0.d(str2, AbstractC1468fA.J)) {
                if (str2.equals("table")) {
                    return d(abstractC3015v6, c1081bD);
                }
                if (AbstractC1021ah0.d(str2, AbstractC1468fA.E)) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.getClass();
                return c3414zD.c(abstractC3015v6, c1081bD);
            }
            if (!c1081bD.B(str2)) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.n("tbody", "tfoot", "thead", "template");
            c1081bD.g();
            c1081bD.l = c3414zD;
        }
        return true;
    }

    public final boolean d(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (!c1081bD.B("tbody") && !c1081bD.B("thead") && !c1081bD.y("tfoot")) {
            c1081bD.s(this);
            return false;
        }
        c1081bD.n("tbody", "tfoot", "thead", "template");
        c1081bD.i(c1081bD.a().f1103o.m);
        return c1081bD.h(abstractC3015v6);
    }
}
