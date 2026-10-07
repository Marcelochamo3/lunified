package o;

/* JADX INFO: renamed from: o.z20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3396z20 extends AbstractC0499Ih {
    public C20 l;
    public Ds0 m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1144o;
    public final /* synthetic */ C20 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3396z20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f1144o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.n(null, this);
    }
}
