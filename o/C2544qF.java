package o;

/* JADX INFO: renamed from: o.qF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2544qF extends AbstractC0499Ih {
    public VS l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2834tF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f988o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2544qF(C2834tF c2834tF, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2834tF;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f988o |= Integer.MIN_VALUE;
        return this.n.i(this);
    }
}
