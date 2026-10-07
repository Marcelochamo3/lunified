package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Qk0 extends El0 {
    public Qk0() {
        super("AttributeName", 34);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        int iX = c1207cd.x();
        String strL = c1207cd.l(El0.A0);
        AbstractC2198mk0 abstractC2198mk0 = c2392ok0.k;
        int iX2 = c1207cd.x();
        abstractC2198mk0.getClass();
        String strReplace = strL.replace((char) 0, (char) 65533);
        abstractC2198mk0.J(iX, iX2);
        StringBuilder sb = abstractC2198mk0.s;
        if (sb.length() == 0) {
            abstractC2198mk0.r = strReplace;
        } else {
            sb.append(strReplace);
        }
        int iX3 = c1207cd.x();
        char cF = c1207cd.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            c2392ok0.o(El0.U);
            return;
        }
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
            switch (cF) {
                case C3080vp0.g0 /* 60 */:
                    break;
                case '=':
                    c2392ok0.o(El0.V);
                    break;
                case '>':
                    c2392ok0.k();
                    c2392ok0.o(c3458zk0);
                    break;
                default:
                    AbstractC2198mk0 abstractC2198mk1 = c2392ok0.k;
                    abstractC2198mk1.J(iX3, c1207cd.x());
                    abstractC2198mk1.s.append(cF);
                    break;
            }
            return;
        }
        c2392ok0.m(this);
        AbstractC2198mk0 abstractC2198mk2 = c2392ok0.k;
        abstractC2198mk2.J(iX3, c1207cd.x());
        abstractC2198mk2.s.append(cF);
    }
}
