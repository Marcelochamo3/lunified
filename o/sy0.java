package o;

/* JADX INFO: loaded from: classes.dex */
public final class sy0 extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ty0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1036o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ty0 ty0Var, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = ty0Var;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1036o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
