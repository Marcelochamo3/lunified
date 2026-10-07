package o;

/* JADX INFO: renamed from: o.rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2694rq0 implements InterfaceC1734hw {
    public final InterfaceC1022ai l;
    public final Object m;
    public final C2598qq0 n;

    public C2694rq0(InterfaceC1734hw interfaceC1734hw, InterfaceC1022ai interfaceC1022ai) {
        this.l = interfaceC1022ai;
        this.m = Ou0.G(interfaceC1022ai);
        this.n = new C2598qq0(interfaceC1734hw, null);
    }

    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Object objD = zy0.D(this.l, obj, this.m, this.n, interfaceC0473Hh);
        return objD == EnumC1706hi.l ? objD : C2985uq0.a;
    }
}
