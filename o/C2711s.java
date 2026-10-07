package o;

/* JADX INFO: renamed from: o.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2711s extends AbstractC0499Ih {
    public C2247n90 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2538q90 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1016o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2711s(C2538q90 c2538q90, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2538q90;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1016o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
