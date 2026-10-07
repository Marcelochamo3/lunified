package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A30 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ E30 m;

    public /* synthetic */ A30(E30 e30, int i) {
        this.l = i;
        this.m = e30;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                this.m.n();
                break;
            case 1:
                E30 e30 = this.m;
                if (!e30.W) {
                    InterfaceC2844tP interfaceC2844tP = e30.B;
                    interfaceC2844tP.getClass();
                    interfaceC2844tP.e(e30);
                }
                break;
            default:
                this.m.Q = true;
                break;
        }
    }
}
