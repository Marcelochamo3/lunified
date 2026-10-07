package o;

/* JADX INFO: renamed from: o.ll0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C2103ll0 extends El0 {
    public C2103ll0() {
        super("AfterDoctypeName", 53);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        boolean zN = c1207cd.n();
        C3458zk0 c3458zk0 = El0.l;
        C1808ik0 c1808ik0 = c2392ok0.m;
        if (zN) {
            c2392ok0.l(this);
            c1808ik0.r = true;
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
            return;
        }
        if (c1207cd.t('\t', '\n', '\r', '\f', ' ')) {
            c1207cd.a();
            return;
        }
        boolean zS = c1207cd.s('>');
        C1207cd c1207cd2 = c2392ok0.a;
        if (zS) {
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
            c1207cd2.a();
        } else if (c1207cd.r("PUBLIC")) {
            c1808ik0.f834o = "PUBLIC";
            c2392ok0.o(El0.n0);
        } else if (c1207cd.r("SYSTEM")) {
            c1808ik0.f834o = "SYSTEM";
            c2392ok0.o(El0.t0);
        } else {
            c2392ok0.m(this);
            c1808ik0.r = true;
            c2392ok0.o(El0.y0);
            c1207cd2.a();
        }
    }
}
