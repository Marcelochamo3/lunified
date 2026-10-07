package o;

/* JADX INFO: loaded from: classes.dex */
public final class WI extends AbstractC0499Ih {
    public ZI l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ZI n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f593o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WI(ZI zi, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = zi;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f593o |= Integer.MIN_VALUE;
        return this.n.d(0, this);
    }
}
