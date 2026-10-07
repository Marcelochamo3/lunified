package o;

/* JADX INFO: renamed from: o.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876Wv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Ds0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876Wv(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0876Wv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0876Wv(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            C0954Zv c0954Zv = C0954Zv.b;
            this.m = 1;
            obj = C0954Zv.p(c0954Zv, this.n, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return obj;
    }
}
