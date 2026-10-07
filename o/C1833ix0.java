package o;

/* JADX INFO: renamed from: o.ix0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1833ix0 extends AbstractC0499Ih {
    public C2532q60 l;
    public VS m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Lx0 f838o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833ix0(Lx0 lx0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f838o = lx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f838o.A(this);
    }
}
