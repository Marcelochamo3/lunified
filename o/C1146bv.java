package o;

/* JADX INFO: renamed from: o.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1146bv extends AbstractC0499Ih {
    public Object l;
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1340dv f707o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146bv(C1340dv c1340dv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f707o = c1340dv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return C1340dv.f(this.f707o, null, this);
    }
}
