package o;

/* JADX INFO: renamed from: o.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902Xv extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C0954Zv m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902Xv(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, 0, this);
    }
}
