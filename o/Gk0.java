package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Gk0 extends El0 {
    public Gk0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        if (!c1207cd.u()) {
            c2392ok0.f("</");
            c2392ok0.o(El0.G);
            return;
        }
        c2392ok0.c(false);
        AbstractC2198mk0 abstractC2198mk0 = c2392ok0.k;
        char cM = c1207cd.m();
        abstractC2198mk0.getClass();
        abstractC2198mk0.I(String.valueOf(cM));
        c2392ok0.h.append(c1207cd.m());
        c2392ok0.o(El0.L);
        c2392ok0.a.a();
    }
}
