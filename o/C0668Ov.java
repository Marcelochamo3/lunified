package o;

/* JADX INFO: renamed from: o.Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0668Ov extends AbstractC0499Ih {
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0954Zv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f444o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668Ov(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f444o |= Integer.MIN_VALUE;
        return this.n.c(null, null, this);
    }
}
