package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Sk0 extends El0 {
    public Sk0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        Wk0 wk0 = El0.Y;
        if (cF == 0) {
            c2392ok0.m(this);
            c2392ok0.k.E((char) 65533, c1207cd.x() - 1, c1207cd.x());
            c2392ok0.o(wk0);
            return;
        }
        if (cF != ' ') {
            if (cF == '\"') {
                c2392ok0.o(El0.W);
                return;
            }
            if (cF != '`') {
                C3458zk0 c3458zk0 = El0.l;
                if (cF == 65535) {
                    c2392ok0.l(this);
                    c2392ok0.k();
                    c2392ok0.o(c3458zk0);
                    return;
                }
                if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                    return;
                }
                if (cF == '&') {
                    c1207cd.B();
                    c2392ok0.o(wk0);
                    return;
                }
                if (cF == '\'') {
                    c2392ok0.o(El0.X);
                    return;
                }
                switch (cF) {
                    case C3080vp0.g0 /* 60 */:
                    case '=':
                        break;
                    case '>':
                        c2392ok0.m(this);
                        c2392ok0.k();
                        c2392ok0.o(c3458zk0);
                        break;
                    default:
                        c1207cd.B();
                        c2392ok0.o(wk0);
                        break;
                }
                return;
            }
            c2392ok0.m(this);
            c2392ok0.k.E(cF, c1207cd.x() - 1, c1207cd.x());
            c2392ok0.o(wk0);
        }
    }
}
