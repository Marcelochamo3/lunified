package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: o.yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3378yt extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f1139o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3378yt(List list, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f1139o = list;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3378yt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3378yt c3378yt = new C3378yt(this.f1139o, interfaceC0473Hh);
        c3378yt.n = obj;
        return c3378yt;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List list = this.f1139o;
            if (list.isEmpty()) {
                return C1330dq.l;
            }
            if (list.size() > 32) {
                throw new IllegalArgumentException("Se admiten hasta 32 páginas por lote".toString());
            }
            Mb0 mb0A = Nb0.a(8);
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, null, 0, new C3281xt(mb0A, (C3184wt) it.next(), null), 3));
            }
            this.m = 1;
            obj = AbstractC1370eA.b(arrayList, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC3327yN.C((Iterable) obj, linkedHashMap);
        return linkedHashMap;
    }
}
