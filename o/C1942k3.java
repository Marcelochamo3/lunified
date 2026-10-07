package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1942k3 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1942k3) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1942k3 c1942k3 = new C1942k3(2, interfaceC0473Hh);
        c1942k3.n = obj;
        return c1942k3;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C1844j3(2, null), 3);
            List<C1101bX> list = C2525q3.e;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            for (C1101bX c1101bX : list) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, null, 0, new C1748i3((String) c1101bX.l, (String) c1101bX.m, null), 3));
            }
            ArrayList arrayListM0 = AbstractC0911Ye.m0(AbstractC2506pt.A(c1420emC), arrayList);
            this.m = 1;
            obj = AbstractC1370eA.b(arrayListM0, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return AbstractC0911Ye.Z((Iterable) obj);
    }
}
