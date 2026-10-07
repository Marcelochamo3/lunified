package o;

/* JADX INFO: loaded from: classes.dex */
public final class BR extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ AG n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BR(AG ag, int i) {
        super(1);
        this.m = i;
        this.n = ag;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                String str = (String) obj;
                AbstractC1474fG.j(str, "it");
                this.n.q.setText(str);
                break;
            case 1:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "it");
                this.n.r.setText(str2);
                break;
            case 2:
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "it");
                this.n.s.setText(str3);
                break;
            default:
                String str4 = (String) obj;
                AbstractC1474fG.j(str4, "it");
                this.n.p.setText(str4);
                break;
        }
        return C2985uq0.a;
    }
}
