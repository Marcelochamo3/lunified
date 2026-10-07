package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Cl0 extends El0 {
    public Cl0() {
        super("TagOpen", 7);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cM = c1207cd.m();
        C1207cd c1207cd2 = c2392ok0.a;
        if (cM == '!') {
            c2392ok0.o(El0.c0);
            c1207cd2.a();
            return;
        }
        if (cM == '/') {
            c2392ok0.o(El0.t);
            c1207cd2.a();
            return;
        }
        if (cM == '?') {
            C1711hk0 c1711hk0 = c2392ok0.n;
            c1711hk0.C();
            c1711hk0.p = true;
            c2392ok0.o(El0.b0);
            return;
        }
        if (c1207cd.u()) {
            c2392ok0.c(true);
            c2392ok0.o(El0.u);
        } else {
            c2392ok0.m(this);
            c2392ok0.e('<');
            c2392ok0.o(El0.l);
        }
    }
}
