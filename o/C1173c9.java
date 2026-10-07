package o;

/* JADX INFO: renamed from: o.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173c9 implements InterfaceC2159mI {
    public static final C1173c9 a = new C1173c9();
    public static final C1455f30 b = new C1455f30("kotlin.Boolean", C1260d30.j);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.e(zBooleanValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
