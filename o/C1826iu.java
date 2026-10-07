package o;

/* JADX INFO: renamed from: o.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1826iu extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ InterfaceC1538fw[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1826iu(InterfaceC1538fw[] interfaceC1538fwArr, int i) {
        super(0);
        this.m = i;
        this.n = interfaceC1538fwArr;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return new C0952Zt[this.n.length];
            case 1:
                return new C3412zB[this.n.length];
            default:
                return new Object[this.n.length];
        }
    }
}
