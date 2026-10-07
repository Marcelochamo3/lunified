package o;

/* JADX INFO: loaded from: classes.dex */
public final class Bd0 implements InterfaceC2159mI {
    public static final Bd0 a = new Bd0();
    public static final C1455f30 b = new C1455f30("kotlin.Short", C1260d30.q);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.p(sShortValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
