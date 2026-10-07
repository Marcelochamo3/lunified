package o;

/* JADX INFO: renamed from: o.pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2491pl0 extends El0 {
    public C2491pl0() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        C1808ik0 c1808ik0 = c2392ok0.m;
        if (cF == 0) {
            c2392ok0.m(this);
            c1808ik0.p.append((char) 65533);
            return;
        }
        if (cF == '\'') {
            c2392ok0.o(El0.r0);
            return;
        }
        C3458zk0 c3458zk0 = El0.l;
        if (cF == '>') {
            c2392ok0.m(this);
            c1808ik0.r = true;
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
            return;
        }
        if (cF != 65535) {
            c1808ik0.p.append(cF);
            return;
        }
        c2392ok0.l(this);
        c1808ik0.r = true;
        c2392ok0.j();
        c2392ok0.o(c3458zk0);
    }
}
