package o;

/* JADX INFO: renamed from: o.ql0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2588ql0 extends El0 {
    public C2588ql0() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            c2392ok0.o(El0.s0);
            return;
        }
        if (cF == '\"') {
            c2392ok0.m(this);
            c2392ok0.o(El0.v0);
            return;
        }
        if (cF == '\'') {
            c2392ok0.m(this);
            c2392ok0.o(El0.w0);
            return;
        }
        C3458zk0 c3458zk0 = El0.l;
        if (cF == '>') {
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
            return;
        }
        C1808ik0 c1808ik0 = c2392ok0.m;
        if (cF != 65535) {
            c2392ok0.m(this);
            c1808ik0.r = true;
            c2392ok0.o(El0.y0);
        } else {
            c2392ok0.l(this);
            c1808ik0.r = true;
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
        }
    }
}
