package o;

/* JADX INFO: renamed from: o.mt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2216mt0 extends AbstractC0499Ih {
    public C1292dT l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f925o;
    public final /* synthetic */ C1292dT p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216mt0(C1292dT c1292dT, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c1292dT;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f925o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
