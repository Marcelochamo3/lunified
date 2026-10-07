package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rn0 extends AbstractC0499Ih {
    public VS l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C1816io0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f495o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rn0(C1816io0 c1816io0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c1816io0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f495o |= Integer.MIN_VALUE;
        return this.n.o(null, this);
    }
}
