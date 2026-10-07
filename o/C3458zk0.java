package o;

/* JADX INFO: renamed from: o.zk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3458zk0 extends El0 {
    public C3458zk0() {
        super("Data", 0);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cM = c1207cd.m();
        if (cM == 0) {
            c2392ok0.m(this);
            c2392ok0.e(c1207cd.f());
            return;
        }
        C1207cd c1207cd2 = c2392ok0.a;
        if (cM == '&') {
            c2392ok0.o(El0.m);
            c1207cd2.a();
        } else if (cM == '<') {
            c2392ok0.o(El0.s);
            c1207cd2.a();
        } else if (cM != 65535) {
            c2392ok0.f(c1207cd.h());
        } else {
            c2392ok0.h(new C1905jk0());
        }
    }
}
