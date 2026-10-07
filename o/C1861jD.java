package o;

/* JADX INFO: renamed from: o.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1861jD extends AD {
    public C1861jD() {
        super("InSelectInTable", 16);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        boolean zW = abstractC3015v6.w();
        String[] strArr = AbstractC1468fA.I;
        if (zW && AbstractC1021ah0.d(((C2101lk0) abstractC3015v6).f921o, strArr)) {
            c1081bD.s(this);
            c1081bD.N("select");
            c1081bD.T();
            return c1081bD.h(abstractC3015v6);
        }
        if (abstractC3015v6.v()) {
            C2003kk0 c2003kk0 = (C2003kk0) abstractC3015v6;
            if (AbstractC1021ah0.d(c2003kk0.f921o, strArr)) {
                c1081bD.s(this);
                if (!c1081bD.B(c2003kk0.f921o)) {
                    return false;
                }
                c1081bD.N("select");
                c1081bD.T();
                return c1081bD.h(abstractC3015v6);
            }
        }
        C1765iD c1765iD = AD.A;
        c1081bD.getClass();
        return c1765iD.c(abstractC3015v6, c1081bD);
    }
}
