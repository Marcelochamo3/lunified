package o;

/* JADX INFO: loaded from: classes.dex */
public final class VJ extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ WJ n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJ(WJ wj, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = wj;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        VJ vj = (VJ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        vj.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        VJ vj = new VJ(this.n, interfaceC0473Hh);
        vj.m = obj;
        return vj;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.m;
        WJ wj = this.n;
        if (wj.l.d.compareTo(TJ.m) >= 0) {
            wj.l.a(wj);
        } else {
            AH ah = (AH) interfaceC1608gi.t().q(C2691rp.v);
            if (ah != null) {
                ah.f(null);
            }
        }
        return C2985uq0.a;
    }
}
