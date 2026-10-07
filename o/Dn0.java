package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Dn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Dn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Dn0 dn0 = new Dn0(2, interfaceC0473Hh);
        dn0.n = obj;
        return dn0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                String str = C3068vj0.a;
                this.m = 1;
                obj = AbstractC1376eG.J(AbstractC1910jn.b, new C2584qj0(2, null), this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            objK = (List) obj;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj2 = C1233cq.l;
        if (objK instanceof C2439p80) {
            objK = obj2;
        }
        if (!(!((List) objK).isEmpty())) {
            objK = null;
        }
        List<C1387eR> list = (List) objK;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (C1387eR c1387eR : list) {
            AbstractC1474fG.h(c1387eR, "null cannot be cast to non-null type com.skidush.clonex.adapters.AppAdapter.Item");
            arrayList.add(c1387eR);
        }
        return new C0882Xb("FUTBOL PY", arrayList);
    }
}
