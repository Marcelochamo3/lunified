package o;

/* JADX INFO: renamed from: o.c30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1162c30 implements InterfaceC2159mI {
    public final C1065b30 a;

    public AbstractC1162c30(InterfaceC2159mI interfaceC2159mI) {
        this.a = new C1065b30(interfaceC2159mI.b());
    }

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        AbstractC1474fG.j(c1909jm0, "encoder");
        int iC = c(obj);
        AbstractC1474fG.j(this.a, "descriptor");
        d(c1909jm0, obj, iC);
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        return this.a;
    }

    public abstract int c(Object obj);

    public abstract void d(C1909jm0 c1909jm0, Object obj, int i);
}
