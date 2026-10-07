package o;

/* JADX INFO: renamed from: o.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0742Rr implements QK {
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;

    public /* synthetic */ C0742Rr(int i, boolean z) {
        this.l = i;
        this.m = z;
    }

    @Override // o.QK
    public final void b(Object obj) {
        InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj;
        switch (this.l) {
            case 0:
                interfaceC2176mZ.E(this.m);
                break;
            default:
                interfaceC2176mZ.s(this.m);
                break;
        }
    }
}
