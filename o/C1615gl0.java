package o;

/* JADX INFO: renamed from: o.gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C1615gl0 extends El0 {
    public C1615gl0() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // o.El0
    public final void d(C2392ok0 c2392ok0, C1207cd c1207cd) {
        Vk0 vk0 = El0.n;
        int[] iArrB = c2392ok0.b(null, false);
        if (iArrB == null) {
            c2392ok0.e('&');
        } else {
            c2392ok0.f(new String(iArrB, 0, iArrB.length));
        }
        c2392ok0.o(vk0);
    }
}
