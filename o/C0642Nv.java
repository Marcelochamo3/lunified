package o;

/* JADX INFO: renamed from: o.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642Nv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0642Nv) o((Ds0) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0642Nv c0642Nv = new C0642Nv(2, interfaceC0473Hh);
        c0642Nv.n = obj;
        return c0642Nv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            Ds0 ds0 = (Ds0) this.n;
            C0954Zv c0954Zv = C0954Zv.b;
            this.m = 1;
            obj = c0954Zv.n(ds0, this);
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
