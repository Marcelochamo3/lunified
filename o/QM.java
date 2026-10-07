package o;

/* JADX INFO: loaded from: classes.dex */
public final class QM extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ AbstractActivityC1116bg n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QM(AbstractActivityC1116bg abstractActivityC1116bg, int i) {
        super(0);
        this.m = i;
        this.n = abstractActivityC1116bg;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return this.n.c();
            case 1:
                return this.n.e();
            case 2:
                return this.n.d();
            case 3:
                return this.n.c();
            case 4:
                return this.n.e();
            default:
                return this.n.d();
        }
    }
}
