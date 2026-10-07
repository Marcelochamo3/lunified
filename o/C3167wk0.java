package o;

/* JADX INFO: renamed from: o.wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3167wk0 extends El0 {
    public C3167wk0() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        if (cF == '!') {
            c2392ok0.f("<!");
            c2392ok0.o(El0.E);
            return;
        }
        if (cF == '/') {
            c2392ok0.d();
            c2392ok0.o(El0.C);
        } else if (cF != 65535) {
            c2392ok0.f("<");
            c1207cd.B();
            c2392ok0.o(El0.q);
        } else {
            c2392ok0.f("<");
            c2392ok0.l(this);
            c2392ok0.o(El0.l);
        }
    }
}
