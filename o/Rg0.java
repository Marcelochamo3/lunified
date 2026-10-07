package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rg0 extends AbstractC0499Ih {
    public String l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LB f493o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rg0(LB lb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f493o = lb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f493o.a(null, this);
    }
}
