package o;

/* JADX INFO: renamed from: o.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0285Ab extends AbstractC0499Ih {
    public C0441Gb l;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f173o;
    public final /* synthetic */ C0441Gb p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285Ab(C0441Gb c0441Gb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c0441Gb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f173o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.j(null, this);
    }
}
