package o;

/* JADX INFO: loaded from: classes.dex */
public final class Cs0 extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ LB n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cs0(LB lb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = lb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f206o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
