package o;

/* JADX INFO: loaded from: classes.dex */
public final class ST extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ PT n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ST(PT pt, int i) {
        super(1);
        this.m = i;
        this.n = pt;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                String str = (String) obj;
                AbstractC1474fG.j(str, "key");
                return Boolean.valueOf(!this.n.c().contains(str));
            default:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "key");
                return Boolean.valueOf(!this.n.c().contains(str2));
        }
    }
}
