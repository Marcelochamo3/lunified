package o;

/* JADX INFO: renamed from: o.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824Uv extends AbstractC0499Ih {
    public C0954Zv l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0954Zv f561o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824Uv(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f561o = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f561o.j(null, this);
    }
}
