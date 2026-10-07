package o;

/* JADX INFO: renamed from: o.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1382eM implements InterfaceC2159mI {
    public static final C1382eM a = new C1382eM();
    public static final C1455f30 b = new C1455f30("kotlin.Long", C1260d30.p);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.m(jLongValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
