package o;

/* JADX INFO: renamed from: o.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0381Dt extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C0433Ft m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381Dt(C0433Ft c0433Ft, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c0433Ft;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C0433Ft.a(this.m, null, null, this);
    }
}
