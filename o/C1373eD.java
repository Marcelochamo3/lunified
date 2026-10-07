package o;

/* JADX INFO: renamed from: o.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1373eD extends AD {
    public C1373eD() {
        super("InColumnGroup", 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            c1081bD.C((C1613gk0) abstractC3015v6);
            return true;
        }
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        if (iW != 0) {
            C2929uD c2929uD = AD.f167o;
            if (iW == 1) {
                C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
                String str = c2101lk0.f921o;
                str.getClass();
                switch (str) {
                    case "template":
                        c1081bD.getClass();
                        c2929uD.c(abstractC3015v6, c1081bD);
                        break;
                    case "col":
                        c1081bD.G(c2101lk0);
                        break;
                    case "html":
                        C3220xD c3220xD = AD.r;
                        c1081bD.getClass();
                        return c3220xD.c(abstractC3015v6, c1081bD);
                    default:
                        return d(abstractC3015v6, c1081bD);
                }
            } else if (iW == 2) {
                String str2 = ((C2003kk0) abstractC3015v6).f921o;
                str2.getClass();
                if (str2.equals("template")) {
                    c1081bD.getClass();
                    c2929uD.c(abstractC3015v6, c1081bD);
                } else {
                    if (!str2.equals("colgroup")) {
                        return d(abstractC3015v6, c1081bD);
                    }
                    if (!c1081bD.b(str2)) {
                        c1081bD.s(this);
                        return false;
                    }
                    c1081bD.g();
                    c1081bD.l = AD.t;
                }
            } else {
                if (iW != 3) {
                    if (iW != 5) {
                        return d(abstractC3015v6, c1081bD);
                    }
                    if (c1081bD.b("html")) {
                        return true;
                    }
                    return d(abstractC3015v6, c1081bD);
                }
                c1081bD.E((C1711hk0) abstractC3015v6);
            }
        } else {
            c1081bD.s(this);
        }
        return true;
    }

    public final boolean d(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (!c1081bD.b("colgroup")) {
            c1081bD.s(this);
            return false;
        }
        c1081bD.g();
        c1081bD.l = AD.t;
        c1081bD.h(abstractC3015v6);
        return true;
    }
}
