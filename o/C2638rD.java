package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.rD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2638rD extends AD {
    public C2638rD() {
        super("ForeignContent", 23);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        F6 f6;
        F6 f7;
        F6 f8;
        C3176wp c3176wpA;
        int iW = AbstractC1701hf0.w(abstractC3015v6.m);
        if (iW == 0) {
            c1081bD.s(this);
        } else if (iW == 1) {
            C2101lk0 c2101lk0 = (C2101lk0) abstractC3015v6;
            if (AbstractC1021ah0.c(c2101lk0.f921o, AbstractC1468fA.O)) {
                return c1081bD.l.c(abstractC3015v6, c1081bD);
            }
            if (c2101lk0.f921o.equals("font") && (((f6 = c2101lk0.q) != null && f6.p("color") != -1) || (((f7 = c2101lk0.q) != null && f7.p("face") != -1) || ((f8 = c2101lk0.q) != null && f8.p("size") != -1)))) {
                return c1081bD.l.c(abstractC3015v6, c1081bD);
            }
            c1081bD.H(c2101lk0, c1081bD.a().f1103o.n);
        } else if (iW == 2) {
            C2003kk0 c2003kk0 = (C2003kk0) abstractC3015v6;
            if (c2003kk0.f921o.equals("br") || c2003kk0.f921o.equals("p")) {
                return c1081bD.l.c(abstractC3015v6, c1081bD);
            }
            if (c2003kk0.f921o.equals("script") && c1081bD.e.size() != 0 && (c3176wpA = c1081bD.a()) != null) {
                C2678ri0 c2678ri0 = c3176wpA.f1103o;
                if (c2678ri0.m.equals("script") && c2678ri0.n.equals("http://www.w3.org/2000/svg")) {
                    c1081bD.g();
                    return true;
                }
            }
            ArrayList arrayList = c1081bD.e;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Stack unexpectedly empty");
            }
            int size = arrayList.size() - 1;
            C3176wp c3176wp = (C3176wp) arrayList.get(size);
            if (!c3176wp.u(c2003kk0.f921o)) {
                c1081bD.s(this);
            }
            while (size != 0) {
                if (c3176wp.u(c2003kk0.f921o)) {
                    String str = c3176wp.f1103o.m;
                    for (int size2 = c1081bD.e.size() - 1; size2 >= 0 && !c1081bD.g().u(str); size2--) {
                    }
                    return true;
                }
                size--;
                c3176wp = (C3176wp) arrayList.get(size);
                if (c3176wp.f1103o.n.equals("http://www.w3.org/1999/xhtml")) {
                    return c1081bD.l.c(abstractC3015v6, c1081bD);
                }
            }
        } else if (iW == 3) {
            c1081bD.E((C1711hk0) abstractC3015v6);
        } else if (iW == 4) {
            C1613gk0 c1613gk0 = (C1613gk0) abstractC3015v6;
            if (c1613gk0.n.equals(AD.J)) {
                c1081bD.s(this);
            } else if (AD.a(c1613gk0)) {
                c1081bD.C(c1613gk0);
            } else {
                c1081bD.C(c1613gk0);
                c1081bD.u = false;
            }
        }
        return true;
    }
}
