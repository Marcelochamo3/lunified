package o;

/* JADX INFO: renamed from: o.wj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3165wj0 extends AbstractC0499Ih {
    public C3359yj0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C3359yj0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3165wj0(C3359yj0 c3359yj0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c3359yj0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1100o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}
