package o;

/* JADX INFO: loaded from: classes.dex */
public final class KI extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ InterfaceC0621Na n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KI(InterfaceC0621Na interfaceC0621Na, int i) {
        super(1);
        this.m = i;
        this.n = interfaceC0621Na;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                this.n.cancel();
                break;
            case 1:
                this.n.cancel();
                break;
            default:
                this.n.cancel();
                break;
        }
        return C2985uq0.a;
    }
}
