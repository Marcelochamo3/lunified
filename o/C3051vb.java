package o;

/* JADX INFO: renamed from: o.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3051vb extends AbstractC0499Ih {
    public Object l;
    public VS m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1074o;
    public final /* synthetic */ C0441Gb p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3051vb(C0441Gb c0441Gb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c0441Gb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f1074o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.v(null, this);
    }
}
