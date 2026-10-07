package o;

/* JADX INFO: renamed from: o.y20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3299y20 extends AbstractC0499Ih {
    public C20 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C20 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1130o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3299y20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f1130o |= Integer.MIN_VALUE;
        return this.n.d(0, this);
    }
}
