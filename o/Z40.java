package o;

/* JADX INFO: loaded from: classes.dex */
public final class Z40 extends AbstractC0499Ih {
    public C0971a50 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0971a50 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f651o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z40(C0971a50 c0971a50, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0971a50;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f651o |= Integer.MIN_VALUE;
        this.n.a(null, this);
        return EnumC1706hi.l;
    }
}
