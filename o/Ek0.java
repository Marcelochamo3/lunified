package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Ek0 extends El0 {
    public Ek0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        if (c1207cd.n()) {
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
            return;
        }
        char cF = c1207cd.f();
        Ck0 ck0 = El0.G;
        if (cF == 0) {
            c2392ok0.m(this);
            c2392ok0.e((char) 65533);
            c2392ok0.o(ck0);
        } else {
            if (cF == '-') {
                c2392ok0.e(cF);
                return;
            }
            if (cF == '<') {
                c2392ok0.o(El0.J);
            } else if (cF != '>') {
                c2392ok0.e(cF);
                c2392ok0.o(ck0);
            } else {
                c2392ok0.e(cF);
                c2392ok0.o(El0.q);
            }
        }
    }
}
