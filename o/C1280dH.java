package o;

/* JADX INFO: renamed from: o.dH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1280dH extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ C0628Nh n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1280dH(C0628Nh c0628Nh, int i) {
        super(1);
        this.m = i;
        this.n = c0628Nh;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                C0628Nh c0628Nh = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh, "current");
                C0628Nh c0628Nh2 = this.n;
                return Boolean.valueOf(AbstractC1474fG.b(c0628Nh.a, c0628Nh2.a) && AbstractC1474fG.b(c0628Nh.d, c0628Nh2.d) && AbstractC1474fG.b(c0628Nh.e, c0628Nh2.e));
            case 1:
                C0628Nh c0628Nh3 = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh3, "it");
                return Boolean.valueOf(AbstractC1474fG.b(c0628Nh3.a, this.n.a));
            case 2:
                C0628Nh c0628Nh4 = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh4, "it");
                return Boolean.valueOf(AbstractC1474fG.b(c0628Nh4.a, this.n.a));
            case 3:
                C0628Nh c0628Nh5 = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh5, "current");
                C0628Nh c0628Nh6 = this.n;
                return Boolean.valueOf(AbstractC1474fG.b(c0628Nh5.a, c0628Nh6.a) && AbstractC1474fG.b(c0628Nh5.d, c0628Nh6.d) && AbstractC1474fG.b(c0628Nh5.e, c0628Nh6.e));
            default:
                C0628Nh c0628Nh7 = (C0628Nh) obj;
                AbstractC1474fG.j(c0628Nh7, "old");
                C0628Nh c0628Nh8 = this.n;
                return Boolean.valueOf(AbstractC1474fG.b(c0628Nh7.a, c0628Nh8.a) && AbstractC1474fG.b(c0628Nh7.d, c0628Nh8.d) && AbstractC1474fG.b(c0628Nh7.e, c0628Nh8.e));
        }
    }
}
