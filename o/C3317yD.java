package o;

/* JADX INFO: renamed from: o.yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3317yD extends AD {
    public C3317yD() {
        super("Text", 7);
    }

    @Override // o.AD
    public final boolean c(AbstractC3015v6 abstractC3015v6, C1081bD c1081bD) {
        if (abstractC3015v6.q()) {
            c1081bD.C((C1613gk0) abstractC3015v6);
            return true;
        }
        if (abstractC3015v6.u()) {
            c1081bD.s(this);
            c1081bD.g();
            c1081bD.l = c1081bD.m;
            return c1081bD.h(abstractC3015v6);
        }
        if (!abstractC3015v6.v()) {
            return true;
        }
        c1081bD.g();
        c1081bD.l = c1081bD.m;
        return true;
    }
}
