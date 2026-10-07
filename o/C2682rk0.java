package o;

/* JADX INFO: renamed from: o.rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2682rk0 extends El0 {
    public C2682rk0() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        if (!c1207cd.u()) {
            c2392ok0.f("</");
            c2392ok0.o(El0.n);
            return;
        }
        c2392ok0.c(false);
        AbstractC2198mk0 abstractC2198mk0 = c2392ok0.k;
        char cM = c1207cd.m();
        abstractC2198mk0.getClass();
        abstractC2198mk0.I(String.valueOf(cM));
        c2392ok0.h.append(c1207cd.m());
        c2392ok0.o(El0.x);
        c2392ok0.a.a();
    }
}
