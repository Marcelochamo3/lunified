package o;

/* JADX INFO: loaded from: classes.dex */
public final class KB extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ LB n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f358o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KB(LB lb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = lb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f358o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
