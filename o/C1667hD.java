package o;

/* JADX INFO: renamed from: o.hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1667hD extends AD {
    public C1667hD() {
        super("InCell", 14);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        boolean zV = abstractC3015v6.v();
        C3220xD c3220xD = AD.r;
        if (!zV) {
            if (!abstractC3015v6.w() || !AbstractC1021ah0.d(((C2101lk0) abstractC3015v6).f921o, AbstractC1468fA.A)) {
                c1081bD.getClass();
                return c3220xD.c(abstractC3015v6, c1081bD);
            }
            if (!c1081bD.B("td") && !c1081bD.B("th")) {
                c1081bD.s(this);
                return false;
            }
            if (c1081bD.B("td")) {
                c1081bD.i("td");
            } else {
                c1081bD.i("th");
            }
            return c1081bD.h(abstractC3015v6);
        }
        String str = ((C2003kk0) abstractC3015v6).f921o;
        if (AbstractC1021ah0.d(str, AbstractC1468fA.x)) {
            boolean zB = c1081bD.B(str);
            C1569gD c1569gD = AD.y;
            if (!zB) {
                c1081bD.s(this);
                c1081bD.l = c1569gD;
                return false;
            }
            c1081bD.u(false);
            if (!c1081bD.b(str)) {
                c1081bD.s(this);
            }
            c1081bD.N(str);
            c1081bD.m();
            c1081bD.l = c1569gD;
            return true;
        }
        if (AbstractC1021ah0.d(str, AbstractC1468fA.y)) {
            c1081bD.s(this);
            return false;
        }
        if (!AbstractC1021ah0.d(str, AbstractC1468fA.z)) {
            c1081bD.getClass();
            return c3220xD.c(abstractC3015v6, c1081bD);
        }
        if (!c1081bD.B(str)) {
            c1081bD.s(this);
            return false;
        }
        if (c1081bD.B("td")) {
            c1081bD.i("td");
        } else {
            c1081bD.i("th");
        }
        return c1081bD.h(abstractC3015v6);
    }
}
