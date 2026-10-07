package o;

/* JADX INFO: renamed from: o.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1110bd implements InterfaceC2159mI {
    public static final C1110bd a = new C1110bd();
    public static final C1455f30 b = new C1455f30("kotlin.Char", C1260d30.l);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.g(cCharValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
