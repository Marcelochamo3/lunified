package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Te0 extends Ph0 implements InterfaceC0775Sy {
    public ArrayList m;
    public int n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Te0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Te0(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        ArrayList arrayList;
        Exception e;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i == 0) {
            Jp0.O(obj);
            ArrayList arrayList2 = new ArrayList();
            try {
                Pe0 pe0 = C1603gf0.g;
                this.m = arrayList2;
                this.n = 1;
                Object objA = pe0.a("https://sololatino.net", this);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                arrayList = arrayList2;
                obj = objA;
            } catch (Exception e2) {
                arrayList = arrayList2;
                e = e2;
                e.getMessage();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.m;
            try {
                Jp0.O(obj);
            } catch (Exception e3) {
                e = e3;
                e.getMessage();
            }
        }
        C0660On c0660On = (C0660On) obj;
        List listS0 = AbstractC0911Ye.s0(12, C1603gf0.q(c0660On));
        if (!listS0.isEmpty()) {
            arrayList.add(new C0882Xb("Featured", listS0));
        }
        for (C3176wp c3176wp : c0660On.W("section")) {
            C3176wp c3176wpX = c3176wp.X(".section-title");
            String strZ = c3176wpX != null ? c3176wpX.Z() : null;
            if (strZ != null) {
                C1603gf0 c1603gf0 = C1603gf0.b;
                ArrayList arrayListV = C1603gf0.v(c3176wp);
                if (!arrayListV.isEmpty()) {
                    arrayList.add(new C0882Xb(strZ, AbstractC0911Ye.s0(12, arrayListV)));
                }
            }
        }
        return arrayList;
    }
}
