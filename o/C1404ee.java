package o;

/* JADX INFO: renamed from: o.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1404ee extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C1600ge m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404ee(C1600ge c1600ge, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c1600ge;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(0, null, this);
    }
}
