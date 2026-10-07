package o;

/* JADX INFO: loaded from: classes.dex */
public final class B20 extends AbstractC0499Ih {
    public C20 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f180o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f180o |= Integer.MIN_VALUE;
        return this.n.a(null, 0, this);
    }
}
