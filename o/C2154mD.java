package o;

/* JADX INFO: renamed from: o.mD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2154mD extends AD {
    public C2154mD() {
        super("Initial", 0);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (AD.a(abstractC3015v6)) {
            return true;
        }
        if (abstractC3015v6.r()) {
            c1081bD.E((C1711hk0) abstractC3015v6);
        } else {
            boolean zS = abstractC3015v6.s();
            C2735sD c2735sD = AD.m;
            if (!zS) {
                c1081bD.l = c2735sD;
                return c1081bD.h(abstractC3015v6);
            }
            C1808ik0 c1808ik0 = (C1808ik0) abstractC3015v6;
            C0686Pn c0686Pn = new C0686Pn(c1081bD.h.b(c1808ik0.n.toString()), c1808ik0.p.toString(), c1808ik0.q.toString());
            String str = c1808ik0.f834o;
            if (str != null) {
                c0686Pn.e("pubSysKey", str);
            }
            c1081bD.d.I(c0686Pn);
            if (c1808ik0.r) {
                c1081bD.d.w = 2;
            }
            c1081bD.l = c2735sD;
        }
        return true;
    }
}
