package o;

/* JADX INFO: loaded from: classes.dex */
public final class PM extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ InterfaceC0412Ey n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PM(AbstractC3226xJ abstractC3226xJ, int i) {
        super(1);
        this.m = i;
        this.n = (InterfaceC0412Ey) abstractC3226xJ;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                String str = (String) obj;
                AbstractC1474fG.j(str, "pin");
                this.n.b(str);
                break;
            default:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "pin");
                this.n.b(str2);
                break;
        }
        return C2985uq0.a;
    }
}
