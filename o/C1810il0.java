package o;

/* JADX INFO: renamed from: o.il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1810il0 extends El0 {
    public C1810il0() {
        super("Doctype", 50);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        C1907jl0 c1907jl0 = El0.k0;
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            c2392ok0.o(c1907jl0);
            return;
        }
        if (cF != '>') {
            if (cF != 65535) {
                c2392ok0.m(this);
                c2392ok0.o(c1907jl0);
                return;
            }
            c2392ok0.l(this);
        }
        c2392ok0.m(this);
        C1808ik0 c1808ik0 = c2392ok0.m;
        c1808ik0.C();
        c1808ik0.r = true;
        c2392ok0.j();
        c2392ok0.o(El0.l);
    }
}
