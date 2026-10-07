package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2282ne extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282ne(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2282ne) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2282ne(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        String str = this.m;
        if (AbstractC1899jh0.O(str) || this.n > 1) {
            return C1233cq.l;
        }
        String lowerCase = AbstractC1119bh0.E0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        Collection collectionValues = C2379oe.j.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            String lowerCase2 = ((C1387eR) obj2).b.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
            if (AbstractC1119bh0.W(lowerCase2, lowerCase, false)) {
                arrayList.add(obj2);
            }
        }
        List listR0 = AbstractC0911Ye.r0(arrayList, new N2(6));
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(listR0, 10));
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            C1387eR c1387eRF = C1387eR.f((C1387eR) it.next(), null, null, 32767);
            c1387eRF.u = EnumC3203x3.R;
            arrayList2.add(c1387eRF);
        }
        return arrayList2;
    }
}
