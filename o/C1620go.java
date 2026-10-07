package o;

/* JADX INFO: renamed from: o.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1620go implements InterfaceC2159mI {
    public static final C1620go a = new C1620go();
    public static final C1455f30 b = new C1455f30("kotlin.Double", C1260d30.m);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.h(dDoubleValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
