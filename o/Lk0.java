package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Lk0 extends El0 {
    public Lk0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        Jk0 jk0 = El0.N;
        if (cF == 0) {
            c2392ok0.m(this);
            c2392ok0.e((char) 65533);
            c2392ok0.o(jk0);
        } else if (cF == '-') {
            c2392ok0.e(cF);
            c2392ok0.o(El0.P);
        } else if (cF == '<') {
            c2392ok0.e(cF);
            c2392ok0.o(El0.Q);
        } else if (cF != 65535) {
            c2392ok0.e(cF);
            c2392ok0.o(jk0);
        } else {
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
        }
    }
}
