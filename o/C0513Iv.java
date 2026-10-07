package o;

/* JADX INFO: renamed from: o.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513Iv extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ Ds0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0513Iv(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0513Iv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0513Iv c0513Iv = new C0513Iv(this.n, interfaceC0473Hh);
        c0513Iv.m = obj;
        return c0513Iv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        C1233cq c1233cq = C1233cq.l;
        Ds0 ds0 = this.n;
        Jp0.O(obj);
        try {
            Ds0 ds0R = C0954Zv.r(ds0);
            if (ds0R == null) {
                objK = c1233cq;
            } else {
                objK = C0954Zv.s(ds0R.l) ? C0954Zv.q(ds0R) : AbstractC2506pt.A(ds0R);
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Throwable thA = C2536q80.a(objK);
        if (thA == null) {
            return objK;
        }
        String str = ds0.m;
        thA.getMessage();
        return c1233cq;
    }
}
