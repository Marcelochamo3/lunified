package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Pk0 extends El0 {
    public Pk0() {
        super("BeforeAttributeName", 33);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        Qk0 qk0 = El0.T;
        if (cF == 0) {
            c1207cd.B();
            c2392ok0.m(this);
            c2392ok0.k.N();
            c2392ok0.o(qk0);
            return;
        }
        if (cF != ' ') {
            if (cF != '\"' && cF != '\'') {
                if (cF == '/') {
                    c2392ok0.o(El0.a0);
                    return;
                }
                C3458zk0 c3458zk0 = El0.l;
                if (cF == 65535) {
                    c2392ok0.l(this);
                    c2392ok0.o(c3458zk0);
                    return;
                }
                if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                    return;
                }
                switch (cF) {
                    case C3080vp0.g0 /* 60 */:
                        c1207cd.B();
                        c2392ok0.m(this);
                        break;
                    case '=':
                        break;
                    case '>':
                        break;
                    default:
                        c2392ok0.k.N();
                        c1207cd.B();
                        c2392ok0.o(qk0);
                        return;
                }
                c2392ok0.k();
                c2392ok0.o(c3458zk0);
                return;
            }
            c2392ok0.m(this);
            c2392ok0.k.N();
            AbstractC2198mk0 abstractC2198mk0 = c2392ok0.k;
            abstractC2198mk0.J(c1207cd.x() - 1, c1207cd.x());
            abstractC2198mk0.s.append(cF);
            c2392ok0.o(qk0);
        }
    }
}
