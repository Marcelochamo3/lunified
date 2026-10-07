package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Bl0 extends El0 {
    public Bl0() {
        super("PLAINTEXT", 6);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cM = c1207cd.m();
        if (cM == 0) {
            c2392ok0.m(this);
            c1207cd.a();
            c2392ok0.e((char) 65533);
        } else if (cM != 65535) {
            c2392ok0.f(c1207cd.j((char) 0));
        } else {
            c2392ok0.h(new C1905jk0());
        }
    }
}
