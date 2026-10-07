package o;

/* JADX INFO: renamed from: o.ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2415ow extends AbstractC0499Ih {
    public C2512pw l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2512pw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f958o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415ow(C2512pw c2512pw, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2512pw;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f958o |= Integer.MIN_VALUE;
        return this.n.l(null, this);
    }
}
