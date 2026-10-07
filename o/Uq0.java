package o;

/* JADX INFO: loaded from: classes.dex */
public final class Uq0 extends AbstractC0499Ih {
    public LB l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LB f560o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uq0(LB lb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f560o = lb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f560o.a(null, this);
    }
}
