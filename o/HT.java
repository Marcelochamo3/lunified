package o;

/* JADX INFO: loaded from: classes.dex */
public final class HT extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ C2532q60 m;
    public final /* synthetic */ C2532q60 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ YT f301o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ M5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HT(C2532q60 c2532q60, C2532q60 c2532q61, YT yt, boolean z, M5 m5) {
        super(1);
        this.m = c2532q60;
        this.n = c2532q61;
        this.f301o = yt;
        this.p = z;
        this.q = m5;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        DT dt = (DT) obj;
        AbstractC1474fG.j(dt, "entry");
        this.m.l = true;
        this.n.l = true;
        this.f301o.v(dt, this.p, this.q);
        return C2985uq0.a;
    }
}
