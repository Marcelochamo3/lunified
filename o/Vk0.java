package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Vk0 extends El0 {
    public Vk0() {
        super("Rcdata", 2);
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
        if (cM == '&') {
            c2392ok0.o(El0.f247o);
            c1207cd2.a();
        } else if (cM == '<') {
            c2392ok0.o(El0.v);
            c1207cd2.a();
        } else if (cM != 65535) {
            c2392ok0.f(c1207cd.h());
        } else {
            c2392ok0.h(new C1905jk0());
        }
    }
}
