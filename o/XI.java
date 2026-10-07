package o;

/* JADX INFO: loaded from: classes.dex */
public final class XI extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ ZI m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XI(ZI zi, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = zi;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, 0, this);
    }
}
