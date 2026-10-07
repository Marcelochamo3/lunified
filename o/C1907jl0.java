package o;

/* JADX INFO: renamed from: o.jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1907jl0 extends El0 {
    public C1907jl0() {
        super("BeforeDoctypeName", 51);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zU = c1207cd.u();
        C2005kl0 c2005kl0 = El0.l0;
        C1808ik0 c1808ik0 = c2392ok0.m;
        if (zU) {
            c1808ik0.C();
            c2392ok0.o(c2005kl0);
            return;
        }
        char cF = c1207cd.f();
        if (cF == 0) {
            c2392ok0.m(this);
            c1808ik0.C();
            c1808ik0.n.append((char) 65533);
            c2392ok0.o(c2005kl0);
            return;
        }
        if (cF != ' ') {
            if (cF == 65535) {
                c2392ok0.l(this);
                c1808ik0.C();
                c1808ik0.r = true;
                c2392ok0.j();
                c2392ok0.o(El0.l);
                return;
            }
            if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                return;
            }
            c1808ik0.C();
            c1808ik0.n.append(cF);
            c2392ok0.o(c2005kl0);
        }
    }
}
