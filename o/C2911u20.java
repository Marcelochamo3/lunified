package o;

/* JADX INFO: renamed from: o.u20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2911u20 extends AbstractC0499Ih {
    public C20 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1052o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2911u20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1052o |= Integer.MIN_VALUE;
        return this.n.i(0, this);
    }
}
