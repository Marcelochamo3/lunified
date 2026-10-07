package o;

/* JADX INFO: renamed from: o.bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1097bT extends AbstractC0499Ih {
    public String l;
    public Object m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f695o;
    public final /* synthetic */ C1292dT p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097bT(C1292dT c1292dT, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c1292dT;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f695o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
