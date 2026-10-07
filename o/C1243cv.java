package o;

/* JADX INFO: renamed from: o.cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1243cv extends AbstractC0499Ih {
    public String l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1340dv f727o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243cv(C1340dv c1340dv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f727o = c1340dv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f727o.g(null, this);
    }
}
