package o;

/* JADX INFO: renamed from: o.r20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2620r20 extends AbstractC0499Ih {
    public String l;
    public C20 m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C20 f997o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2620r20(C20 c20, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f997o = c20;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f997o.h(null, 0, this);
    }
}
