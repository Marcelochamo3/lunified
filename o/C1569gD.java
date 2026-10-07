package o;

/* JADX INFO: renamed from: o.gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1569gD extends AD {
    public C1569gD() {
        super("InRow", 13);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        boolean zW = abstractC3015v6.w();
        C3414zD c3414zD = AD.t;
        C1471fD c1471fD = AD.x;
        if (zW) {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            String str = c2101lk0.f921o;
            if (AbstractC1021ah0.d(str, AbstractC1468fA.x)) {
                c1081bD.p();
                c1081bD.F(c2101lk0);
                c1081bD.l = AD.z;
                c1081bD.q.add(null);
                return true;
            }
            if (!AbstractC1021ah0.d(str, AbstractC1468fA.F)) {
                c1081bD.getClass();
                return c3414zD.c(abstractC3015v6, c1081bD);
            }
            if (!c1081bD.B("tr")) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.p();
            c1081bD.g();
            c1081bD.l = c1471fD;
            return c1081bD.h(abstractC3015v6);
        }
        if (!abstractC3015v6.v()) {
            c1081bD.getClass();
            return c3414zD.c(abstractC3015v6, c1081bD);
        }
        String str2 = ((C2003kk0) abstractC3015v6).f921o;
        if (str2.equals("tr")) {
            if (!c1081bD.B(str2)) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.p();
            c1081bD.g();
            c1081bD.l = c1471fD;
            return true;
        }
        if (str2.equals("table")) {
            if (!c1081bD.B("tr")) {
                c1081bD.s(this);
                return false;
            }
            c1081bD.p();
            c1081bD.g();
            c1081bD.l = c1471fD;
            return c1081bD.h(abstractC3015v6);
        }
        if (!AbstractC1021ah0.d(str2, AbstractC1468fA.u)) {
            if (AbstractC1021ah0.d(str2, AbstractC1468fA.G)) {
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
        if (!c1081bD.B("tr")) {
            return false;
        }
        c1081bD.p();
        c1081bD.g();
        c1081bD.l = c1471fD;
        return c1081bD.h(abstractC3015v6);
    }
}
