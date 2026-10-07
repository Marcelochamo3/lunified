package o;

/* JADX INFO: loaded from: classes.dex */
public final class LF implements InterfaceC2159mI {
    public final /* synthetic */ int a;
    public final Object b;

    public LF() {
        this.a = 1;
        this.b = AP.m(IJ.m, new C0503Il(this));
    }

    @Override // o.InterfaceC2159mI
    public final void a(C1909jm0 c1909jm0, Object obj) {
        switch (this.a) {
            case 0:
                AbstractC1474fG.j(c1909jm0, "encoder");
                throw new IllegalStateException("unsupported".toString());
            default:
                AbstractC1474fG.j(c1909jm0, "encoder");
                AbstractC1474fG.j(b(), "descriptor");
                AbstractC1474fG.j(b(), "descriptor");
                return;
        }
    }

    @Override // o.InterfaceC2159mI
    public final Zb0 b() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("unsupported".toString());
            default:
                return (Zb0) ((CJ) this.b).getValue();
        }
    }

    public LF(InterfaceC2159mI interfaceC2159mI) {
        this.a = 0;
        this.b = interfaceC2159mI;
    }
}
