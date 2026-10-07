package o;

/* JADX INFO: renamed from: o.kl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2005kl0 extends El0 {
    public C2005kl0() {
        super("DoctypeName", 52);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zV = c1207cd.v();
        C1808ik0 c1808ik0 = c2392ok0.m;
        if (zV) {
            c1808ik0.n.append(c1207cd.i());
            return;
        }
        char cF = c1207cd.f();
        if (cF == 0) {
            c2392ok0.m(this);
            c1808ik0.n.append((char) 65533);
            return;
        }
        if (cF != ' ') {
            C3458zk0 c3458zk0 = El0.l;
            if (cF == '>') {
                c2392ok0.j();
                c2392ok0.o(c3458zk0);
                return;
            }
            if (cF == 65535) {
                c2392ok0.l(this);
                c1808ik0.r = true;
                c2392ok0.j();
                c2392ok0.o(c3458zk0);
                return;
            }
            if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                c1808ik0.n.append(cF);
                return;
            }
        }
        c2392ok0.o(El0.m0);
    }
}
