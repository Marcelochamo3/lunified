package o;

/* JADX INFO: loaded from: classes.dex */
public final enum Kk0 extends El0 {
    public Kk0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        C3458zk0 c3458zk0 = El0.l;
        int[] iArrB = c2392ok0.b(null, false);
        if (iArrB == null) {
            c2392ok0.e('&');
        } else {
            c2392ok0.f(new String(iArrB, 0, iArrB.length));
        }
        c2392ok0.o(c3458zk0);
    }
}
