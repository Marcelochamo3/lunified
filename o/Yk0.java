package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Yk0 extends El0 {
    public Yk0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        C3458zk0 c3458zk0 = El0.l;
        if (cF == '>') {
            c2392ok0.k.p = true;
            c2392ok0.k();
            c2392ok0.o(c3458zk0);
        } else if (cF == 65535) {
            c2392ok0.l(this);
            c2392ok0.o(c3458zk0);
        } else {
            c1207cd.B();
            c2392ok0.m(this);
            c2392ok0.o(El0.S);
        }
    }
}
