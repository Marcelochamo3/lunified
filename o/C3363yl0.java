package o;

/* JADX INFO: renamed from: o.yl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C3363yl0 extends El0 {
    public C3363yl0() {
        super("BogusDoctype", 65);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        char cF = c1207cd.f();
        C3458zk0 c3458zk0 = El0.l;
        if (cF == '>') {
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
        } else {
            if (cF != 65535) {
                return;
            }
            c2392ok0.j();
            c2392ok0.o(c3458zk0);
        }
    }
}
