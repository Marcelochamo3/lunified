package o;

/* JADX INFO: renamed from: o.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616Mv extends AbstractC0499Ih {
    public Ds0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0954Zv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f404o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0616Mv(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f404o |= Integer.MIN_VALUE;
        return this.n.w(null, this);
    }
}
