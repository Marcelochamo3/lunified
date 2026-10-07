package o;

/* JADX INFO: renamed from: o.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1977kV implements InterfaceC2159mI {
    public static final C1977kV a = new C1977kV();
    public static final C1879jV b = C1879jV.a;

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        AbstractC1474fG.j(c1909jm0, "encoder");
        throw new C1401ec0("'kotlin.Nothing' cannot be serialized");
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
