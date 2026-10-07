package o;

/* JADX INFO: renamed from: o.iD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1765iD extends AD {
    public C1765iD() {
        super("InSelect", 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        if (iW == 0) {
            c1081bD.s(this);
            return false;
        }
        C2929uD c2929uD = AD.f167o;
        if (iW != 1) {
            if (iW == 2) {
                String str = ((C2003kk0) abstractC3015v6).f921o;
                str.getClass();
                switch (str) {
                    case "template":
                        c1081bD.getClass();
                        return c2929uD.c(abstractC3015v6, c1081bD);
                    case "option":
                        if (!c1081bD.b("option")) {
                            c1081bD.s(this);
                            break;
                        } else {
                            c1081bD.g();
                            break;
                        }
                        break;
                    case "select":
                        if (!c1081bD.z(str)) {
                            c1081bD.s(this);
                            return false;
                        }
                        c1081bD.N(str);
                        c1081bD.T();
                        break;
                        break;
                    case "optgroup":
                        if (c1081bD.b("option") && c1081bD.k(c1081bD.a()) != null && c1081bD.k(c1081bD.a()).u("optgroup")) {
                            c1081bD.i("option");
                        }
                        if (!c1081bD.b("optgroup")) {
                            c1081bD.s(this);
                            break;
                        } else {
                            c1081bD.g();
                            break;
                        }
                        break;
                    default:
                        c1081bD.s(this);
                        return false;
                }
            } else if (iW == 3) {
                c1081bD.E((C1711hk0) abstractC3015v6);
            } else if (iW == 4) {
                C1613gk0 c1613gk0 = (C1613gk0) abstractC3015v6;
                if (c1613gk0.n.equals(AD.J)) {
                    c1081bD.s(this);
                    return false;
                }
                c1081bD.C(c1613gk0);
            } else {
                if (iW != 5) {
                    c1081bD.s(this);
                    return false;
                }
                if (!c1081bD.b("html")) {
                    c1081bD.s(this);
                }
            }
        } else {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            String str2 = c2101lk0.f921o;
            if (str2.equals("html")) {
                C3220xD c3220xD = AD.r;
                c1081bD.getClass();
                return c3220xD.c(c2101lk0, c1081bD);
            }
            if (str2.equals("option")) {
                if (c1081bD.b("option")) {
                    c1081bD.i("option");
                }
                c1081bD.F(c2101lk0);
            } else {
                if (!str2.equals("optgroup")) {
                    if (str2.equals("select")) {
                        c1081bD.s(this);
                        return c1081bD.i("select");
                    }
                    if (AbstractC1021ah0.d(str2, AbstractC1468fA.H)) {
                        c1081bD.s(this);
                        if (!c1081bD.z("select")) {
                            return false;
                        }
                        c1081bD.i("select");
                        return c1081bD.h(c2101lk0);
                    }
                    if (str2.equals("script") || str2.equals("template")) {
                        c1081bD.getClass();
                        return c2929uD.c(abstractC3015v6, c1081bD);
                    }
                    c1081bD.s(this);
                    return false;
                }
                if (c1081bD.b("option")) {
                    c1081bD.i("option");
                }
                if (c1081bD.b("optgroup")) {
                    c1081bD.i("optgroup");
                }
                c1081bD.F(c2101lk0);
            }
        }
        return true;
    }
}
