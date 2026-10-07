package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Ck0 extends El0 {
    public Ck0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        if (c1207cd.n()) {
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
            return;
        }
        char cM = c1207cd.m();
        if (cM == 0) {
            c2392ok0.m(this);
            c1207cd.a();
            c2392ok0.e((char) 65533);
            return;
        }
        C1207cd c1207cd2 = c2392ok0.a;
        if (cM == '-') {
            c2392ok0.e('-');
            c2392ok0.o(El0.H);
            c1207cd2.a();
        } else if (cM != '<') {
            c2392ok0.f(c1207cd.k('-', '<', 0));
        } else {
            c2392ok0.o(El0.J);
            c1207cd2.a();
        }
    }
}
