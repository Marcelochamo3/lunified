package o;

/* JADX INFO: renamed from: o.iH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1769iH extends AbstractC0499Ih {
    public String l;
    public String m;
    public C2933uH n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f828o;
    public final /* synthetic */ C2933uH p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769iH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f828o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.h(null, 0, this);
    }
}
