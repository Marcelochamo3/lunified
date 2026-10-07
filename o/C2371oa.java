package o;

/* JADX INFO: renamed from: o.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2371oa implements InterfaceC2159mI {
    public static final C2371oa a = new C2371oa();
    public static final C1455f30 b = new C1455f30("kotlin.Byte", C1260d30.k);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.f(bByteValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
