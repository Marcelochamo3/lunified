package o;

/* JADX INFO: renamed from: o.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1276dD extends AD {
    public C1276dD() {
        super("InCaption", 10);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        boolean zV = abstractC3015v6.v();
        C3414zD c3414zD = AD.t;
        if (zV && ((C2003kk0) abstractC3015v6).f921o.equals("caption")) {
            if (!c1081bD.B("caption")) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.u(false);
            if (!c1081bD.b("caption")) {
                c1081bD.s(this);
            }
            c1081bD.N("caption");
            c1081bD.m();
            c1081bD.l = c3414zD;
            return true;
        }
        if ((!abstractC3015v6.w() || !AbstractC1021ah0.d(((C2101lk0) abstractC3015v6).f921o, AbstractC1468fA.A)) && (!abstractC3015v6.v() || !((C2003kk0) abstractC3015v6).f921o.equals("table"))) {
            if (abstractC3015v6.v() && AbstractC1021ah0.d(((C2003kk0) abstractC3015v6).f921o, AbstractC1468fA.L)) {
                c1081bD.s(this);
                return false;
            }
            C3220xD c3220xD = AD.r;
            c1081bD.getClass();
            return c3220xD.c(abstractC3015v6, c1081bD);
        }
        if (!c1081bD.B("caption")) {
            c1081bD.s(this);
            return false;
        }
        c1081bD.u(false);
        if (!c1081bD.b("caption")) {
            c1081bD.s(this);
        }
        c1081bD.N("caption");
        c1081bD.m();
        c1081bD.l = c3414zD;
        c3414zD.c(abstractC3015v6, c1081bD);
        return true;
    }
}
