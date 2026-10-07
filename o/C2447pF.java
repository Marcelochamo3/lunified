package o;

/* JADX INFO: renamed from: o.pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2447pF extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C2834tF m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447pF(C2834tF c2834tF, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c2834tF;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C2834tF.b(this.m, null, this);
    }
}
