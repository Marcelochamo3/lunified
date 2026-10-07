package o;

/* JADX INFO: renamed from: o.al0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1029al0 extends El0 {
    public C1029al0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zQ = c1207cd.q("--");
        C1711hk0 c1711hk0 = c2392ok0.n;
        if (zQ) {
            c1711hk0.C();
            c2392ok0.o(El0.d0);
            return;
        }
        if (c1207cd.r("DOCTYPE")) {
            c2392ok0.o(El0.j0);
            return;
        }
        if (c1207cd.q("[CDATA[")) {
            c2392ok0.d();
            c2392ok0.o(El0.z0);
        } else {
            c2392ok0.m(this);
            c1711hk0.C();
            c1711hk0.p = true;
            c2392ok0.o(El0.b0);
        }
    }
}
