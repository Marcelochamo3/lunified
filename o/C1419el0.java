package o;

/* JADX INFO: renamed from: o.el0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1419el0 extends El0 {
    public C1419el0() {
        super("CommentEndDash", 47);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        C1322dl0 c1322dl0 = El0.f0;
        C1711hk0 c1711hk0 = c2392ok0.n;
        if (cF == 0) {
            c2392ok0.m(this);
            c1711hk0.E('-');
            c1711hk0.E((char) 65533);
            c2392ok0.o(c1322dl0);
            return;
        }
        if (cF == '-') {
            c2392ok0.o(El0.h0);
            return;
        }
        if (cF != 65535) {
            c1711hk0.E('-');
            c1711hk0.E(cF);
            c2392ok0.o(c1322dl0);
        } else {
            c2392ok0.l(this);
            c2392ok0.i();
            c2392ok0.o(El0.l);
        }
    }
}
