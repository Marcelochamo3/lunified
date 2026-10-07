package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Fk0 extends El0 {
    public Fk0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zU = c1207cd.u();
        C1207cd c1207cd2 = c2392ok0.a;
        if (zU) {
            c2392ok0.d();
            c2392ok0.h.append(c1207cd.m());
            c2392ok0.f("<");
            c2392ok0.e(c1207cd.m());
            c2392ok0.o(El0.M);
            c1207cd2.a();
            return;
        }
        if (!c1207cd.s('/')) {
            c2392ok0.e('<');
            c2392ok0.o(El0.G);
        } else {
            c2392ok0.d();
            c2392ok0.o(El0.K);
            c1207cd2.a();
        }
    }
}
