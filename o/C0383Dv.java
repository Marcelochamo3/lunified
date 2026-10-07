package o;

/* JADX INFO: renamed from: o.Dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383Dv extends AbstractC0499Ih {
    public C0421Fh l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0954Zv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f224o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383Dv(C0954Zv c0954Zv, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0954Zv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f224o |= Integer.MIN_VALUE;
        return this.n.v(null, 0L, 0L, null, this);
    }
}
