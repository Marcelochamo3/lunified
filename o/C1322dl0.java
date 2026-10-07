package o;

/* JADX INFO: renamed from: o.dl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1322dl0 extends El0 {
    public C1322dl0() {
        super("Comment", 46);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cM = c1207cd.m();
        C1711hk0 c1711hk0 = c2392ok0.n;
        if (cM == 0) {
            c2392ok0.m(this);
            c1207cd.a();
            c1711hk0.E((char) 65533);
        } else if (cM == '-') {
            c2392ok0.o(El0.g0);
            c2392ok0.a.a();
        } else {
            if (cM != 65535) {
                c1711hk0.F(c1207cd.k('-', 0));
                return;
            }
            c2392ok0.l(this);
            c2392ok0.i();
            c2392ok0.o(El0.l);
        }
    }
}
