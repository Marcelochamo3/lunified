package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Wk0 extends El0 {
    public Wk0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        int iX = c1207cd.x();
        String strL = c1207cd.l(El0.B0);
        if (strL.length() > 0) {
            c2392ok0.k.H(iX, strL, c1207cd.x());
        }
        int iX2 = c1207cd.x();
        char cF = c1207cd.f();
        if (cF == 0) {
            c2392ok0.m(this);
            c2392ok0.k.E((char) 65533, iX2, c1207cd.x());
            return;
        }
        if (cF != ' ') {
            if (cF != '\"' && cF != '`') {
                C3458zk0 c3458zk0 = El0.l;
                if (cF == 65535) {
                    c2392ok0.l(this);
                    c2392ok0.o(c3458zk0);
                    return;
                }
                if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                    if (cF == '&') {
                        int[] iArrB = c2392ok0.b('>', true);
                        if (iArrB != null) {
                            c2392ok0.k.F(iX2, c1207cd.x(), iArrB);
                            return;
                        } else {
                            c2392ok0.k.E('&', iX2, c1207cd.x());
                            return;
                        }
                    }
                    if (cF != '\'') {
                        switch (cF) {
                            case C3080vp0.g0 /* 60 */:
                            case '=':
                                break;
                            case '>':
                                c2392ok0.k();
                                c2392ok0.o(c3458zk0);
                                break;
                            default:
                                c2392ok0.k.E(cF, iX2, c1207cd.x());
                                break;
                        }
                        return;
                    }
                }
            }
            c2392ok0.m(this);
            c2392ok0.k.E(cF, iX2, c1207cd.x());
            return;
        }
        c2392ok0.o(El0.S);
    }
}
