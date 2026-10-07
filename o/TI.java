package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TI extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((TI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        TI ti = new TI(2, interfaceC0473Hh);
        ti.n = obj;
        return ti;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        InterfaceC1608gi interfaceC1608gi;
        Collection collection;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC1608gi = (InterfaceC1608gi) this.n;
                    Jp0.O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.n;
                    Jp0.O(obj);
                }
                return AbstractC0911Ye.m0(collection, AbstractC0911Ye.Z((Iterable) obj));
            }
            Jp0.O(obj);
            interfaceC1608gi = (InterfaceC1608gi) this.n;
            PI pi = ZI.c;
            this.n = interfaceC1608gi;
            this.m = 1;
            obj = pi.a("https://www.lacartoons.com", this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            C0660On c0660On = (C0660On) obj;
            ZI zi = ZI.b;
            ArrayList arrayListP = ZI.p(c0660On);
            List listA = true ^ arrayListP.isEmpty() ? AbstractC2506pt.A(new C0882Xb("Agregadas Recientemente", arrayListP)) : c1233cq;
            C3370yp c3370ypW = c0660On.W("ul.botontes-categorias li form");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            ArrayList<C1101bX> arrayList = new ArrayList();
            Iterator it = c3370ypW.iterator();
            while (true) {
                C1101bX c1101bX = null;
                if (!it.hasNext()) {
                    break;
                }
                C3176wp c3176wp = (C3176wp) it.next();
                C3176wp c3176wpX = c3176wp.X("input[name=Categoria_id]");
                String strD = c3176wpX != null ? c3176wpX.d("value") : null;
                if (strD != null) {
                    C3176wp c3176wpX2 = c3176wp.X("input[type=submit]");
                    String strD2 = c3176wpX2 != null ? c3176wpX2.d("value") : null;
                    if (strD2 != null) {
                        c1101bX = new C1101bX(strD, strD2);
                    }
                }
                if (c1101bX != null) {
                    arrayList.add(c1101bX);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
            for (C1101bX c1101bX2 : arrayList) {
                arrayList2.add(AbstractC1376eG.c(interfaceC1608gi, null, 0, new SI((String) c1101bX2.l, (String) c1101bX2.m, null), 3));
            }
            this.n = listA;
            this.m = 2;
            obj = AbstractC1370eA.b(arrayList2, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            collection = listA;
            return AbstractC0911Ye.m0(collection, AbstractC0911Ye.Z((Iterable) obj));
        } catch (Exception unused) {
            return c1233cq;
        }
    }
}
