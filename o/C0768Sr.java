package o;

/* JADX INFO: renamed from: o.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0768Sr implements QK, RK {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1042as m;

    public /* synthetic */ C0768Sr(C1042as c1042as, int i) {
        this.l = i;
        this.m = c1042as;
    }

    @Override // o.QK
    public void b(Object obj) {
        InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj;
        switch (this.l) {
            case 0:
                interfaceC2176mZ.m(this.m.O);
                break;
            default:
                interfaceC2176mZ.H(this.m.M);
                break;
        }
    }

    @Override // o.RK
    public void d(Object obj, C3188wv c3188wv) {
        C1042as c1042as = this.m;
        c1042as.getClass();
        ((InterfaceC2176mZ) obj).I(c1042as.f, new C2079lZ(c3188wv));
    }
}
