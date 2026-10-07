package o;

/* JADX INFO: loaded from: classes.dex */
public final class ZX extends AbstractC0499Ih {
    public C1590gY l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1590gY f657o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZX(C1590gY c1590gY, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f657o = c1590gY;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f657o.b(null, this);
    }
}
