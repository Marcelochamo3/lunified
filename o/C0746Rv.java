package o;

/* JADX INFO: renamed from: o.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746Rv extends AbstractC0499Ih {
    public C0954Zv l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0954Zv f497o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746Rv(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f497o = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f497o.b(null, this);
    }
}
