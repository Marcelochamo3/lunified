package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Dl0 extends El0 {
    public Dl0() {
        super("EndTagOpen", 8);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zN = c1207cd.n();
        C3458zk0 c3458zk0 = El0.l;
        if (zN) {
            c2392ok0.l(this);
            c2392ok0.f("</");
            c2392ok0.o(c3458zk0);
            return;
        }
        if (c1207cd.u()) {
            c2392ok0.c(false);
            c2392ok0.o(El0.u);
            return;
        }
        if (c1207cd.s('>')) {
            c2392ok0.m(this);
            c2392ok0.o(c3458zk0);
            c2392ok0.a.a();
        } else {
            c2392ok0.m(this);
            C1711hk0 c1711hk0 = c2392ok0.n;
            c1711hk0.C();
            c1711hk0.p = true;
            c1711hk0.E('/');
            c2392ok0.o(El0.b0);
        }
    }
}
