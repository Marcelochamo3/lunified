package o;

/* JADX INFO: renamed from: o.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1148bw implements InterfaceC2159mI {
    public static final C1148bw a = new C1148bw();
    public static final C1455f30 b = new C1455f30("kotlin.Float", C1260d30.n);

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AbstractC1474fG.j(c1909jm0, "encoder");
        c1909jm0.k(fFloatValue);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return b;
    }
}
