package o;

/* JADX INFO: renamed from: o.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2251nD extends AD {
    public C2251nD() {
        super("InFrameset", 19);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            c1081bD.C((C1613gk0) abstractC3015v6);
        } else if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
        } else {
            if (abstractC3015v6.s()) {
                c1081bD.s(this);
                return false;
            }
            if (abstractC3015v6.w()) {
                C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
                String str = c2101lk0.f921o;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c1081bD.F(c2101lk0);
                        break;
                    case "html":
                        C3220xD c3220xD = AD.r;
                        c1081bD.getClass();
                        return c3220xD.c(c2101lk0, c1081bD);
                    case "frame":
                        c1081bD.G(c2101lk0);
                        break;
                    case "noframes":
                        C2929uD c2929uD = AD.f167o;
                        c1081bD.getClass();
                        return c2929uD.c(c2101lk0, c1081bD);
                    default:
                        c1081bD.s(this);
                        return false;
                }
            } else if (abstractC3015v6.v() && ((C2003kk0) abstractC3015v6).f921o.equals("frameset")) {
                if (c1081bD.b("html")) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.g();
                if (!c1081bD.b("frameset")) {
                    c1081bD.l = AD.F;
                }
            } else {
                if (!abstractC3015v6.u()) {
                    c1081bD.s(this);
                    return false;
                }
                if (!c1081bD.b("html")) {
                    c1081bD.s(this);
                }
            }
        }
        return true;
    }
}
