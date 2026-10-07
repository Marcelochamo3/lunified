package o;

/* JADX INFO: renamed from: o.kD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1959kD extends AD {
    public C1959kD() {
        super("InTemplate", 17);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        C3220xD c3220xD = AD.r;
        if (iW != 0) {
            C2929uD c2929uD = AD.f167o;
            if (iW == 1) {
                String str = ((C2101lk0) abstractC3015v6).f921o;
                if (!AbstractC1021ah0.d(str, AbstractC1468fA.M)) {
                    if (AbstractC1021ah0.d(str, AbstractC1468fA.N)) {
                        c1081bD.O();
                        C3414zD c3414zD = AD.t;
                        c1081bD.P(c3414zD);
                        c1081bD.l = c3414zD;
                        return c1081bD.h(abstractC3015v6);
                    }
                    if (str.equals("col")) {
                        c1081bD.O();
                        C1373eD c1373eD = AD.w;
                        c1081bD.P(c1373eD);
                        c1081bD.l = c1373eD;
                        return c1081bD.h(abstractC3015v6);
                    }
                    if (str.equals("tr")) {
                        c1081bD.O();
                        C1471fD c1471fD = AD.x;
                        c1081bD.P(c1471fD);
                        c1081bD.l = c1471fD;
                        return c1081bD.h(abstractC3015v6);
                    }
                    if (!str.equals("td") && !str.equals("th")) {
                        c1081bD.O();
                        c1081bD.P(c3220xD);
                        c1081bD.l = c3220xD;
                        return c1081bD.h(abstractC3015v6);
                    }
                    c1081bD.O();
                    C1569gD c1569gD = AD.y;
                    c1081bD.P(c1569gD);
                    c1081bD.l = c1569gD;
                    return c1081bD.h(abstractC3015v6);
                }
                c1081bD.getClass();
                c2929uD.c(abstractC3015v6, c1081bD);
            } else if (iW != 2) {
                if (iW != 3 && iW != 4) {
                    if (iW != 5 || !c1081bD.K("template")) {
                        return true;
                    }
                    c1081bD.s(this);
                    c1081bD.N("template");
                    c1081bD.m();
                    c1081bD.O();
                    c1081bD.T();
                    if (c1081bD.l == AD.C || c1081bD.r.size() >= 12) {
                        return true;
                    }
                    return c1081bD.h(abstractC3015v6);
                }
                c1081bD.getClass();
                c3220xD.c(abstractC3015v6, c1081bD);
            } else {
                if (!((C2003kk0) abstractC3015v6).f921o.equals("template")) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.getClass();
                c2929uD.c(abstractC3015v6, c1081bD);
            }
        } else {
            c1081bD.getClass();
            c3220xD.c(abstractC3015v6, c1081bD);
        }
        return true;
    }
}
