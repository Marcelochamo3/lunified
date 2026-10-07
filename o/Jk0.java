package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Jk0 extends El0 {
    public Jk0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cM = c1207cd.m();
        if (cM == 0) {
            c2392ok0.m(this);
            c1207cd.a();
            c2392ok0.e((char) 65533);
            return;
        }
        C1207cd c1207cd2 = c2392ok0.a;
        if (cM == '-') {
            c2392ok0.e(cM);
            c2392ok0.o(El0.O);
            c1207cd2.a();
        } else if (cM == '<') {
            c2392ok0.e(cM);
            c2392ok0.o(El0.Q);
            c1207cd2.a();
        } else if (cM != 65535) {
            c2392ok0.f(c1207cd.k('-', '<', 0));
        } else {
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
        }
    }
}
