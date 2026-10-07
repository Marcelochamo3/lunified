package o;

/* JADX INFO: renamed from: o.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0936Zd extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C1600ge m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0936Zd(C1600ge c1600ge, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c1600ge;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C1600ge.d(this.m, null, this);
    }
}
