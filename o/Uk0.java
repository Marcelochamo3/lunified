package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Uk0 extends El0 {
    public Uk0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        int iX = c1207cd.x();
        String strG = c1207cd.g(true);
        if (strG.length() > 0) {
            c2392ok0.k.H(iX, strG, c1207cd.x());
        } else {
            c2392ok0.k.x = true;
        }
        int iX2 = c1207cd.x();
        char cF = c1207cd.f();
        if (cF == 0) {
            c2392ok0.m(this);
            c2392ok0.k.E((char) 65533, iX2, c1207cd.x());
            return;
        }
        if (cF == 65535) {
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
            return;
        }
        if (cF != '&') {
            if (cF != '\'') {
                c2392ok0.k.E(cF, iX2, c1207cd.x());
                return;
            } else {
                c2392ok0.o(El0.Z);
                return;
            }
        }
        int[] iArrB = c2392ok0.b('\'', true);
        if (iArrB != null) {
            c2392ok0.k.F(iX2, c1207cd.x(), iArrB);
        } else {
            c2392ok0.k.E('&', iX2, c1207cd.x());
        }
    }
}
