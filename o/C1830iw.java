package o;

/* JADX INFO: renamed from: o.iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1830iw extends R90 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1830iw(InterfaceC1022ai interfaceC1022ai, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(interfaceC0473Hh, interfaceC1022ai);
        this.p = i;
    }

    @Override // o.JH
    public final boolean D(Throwable th) {
        switch (this.p) {
            case 0:
                if (th instanceof C1696hd) {
                    return true;
                }
                return z(th);
            default:
                return false;
        }
    }
}
