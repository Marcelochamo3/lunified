package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Vo0 extends Ph0 implements InterfaceC0801Ty {
    public /* synthetic */ Qo0 m;
    public /* synthetic */ C2109lo0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ List f581o;
    public /* synthetic */ List p;
    public /* synthetic */ List q;

    public Vo0(InterfaceC0473Hh interfaceC0473Hh) {
        super(6, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    @Override // o.R7
    public final Object r(Object obj) {
        ?? arrayList;
        Object next;
        ?? A;
        Object next2;
        Jp0.O(obj);
        Qo0 qo0 = this.m;
        C2109lo0 c2109lo0 = this.n;
        List list = this.f581o;
        List list2 = this.p;
        List list3 = this.q;
        if (!(qo0 instanceof Po0)) {
            return qo0;
        }
        Po0 po0 = (Po0) qo0;
        C2109lo0 c2109lo1 = po0.a;
        List<Ma0> list4 = c2109lo1.k;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList2, ((Ma0) it.next()).f);
        }
        if (!(!AbstractC1474fG.b(arrayList2, list))) {
            list4 = null;
        }
        C2109lo0 c2109lo2 = po0.a;
        if (list4 != null) {
            arrayList = new ArrayList(AbstractC1016af.O(list4, 10));
            for (Ma0 ma0 : list4) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    Ma0 ma1 = ((C0456Gq) obj2).f;
                    if (AbstractC1474fG.b(ma1 != null ? ma1.a : null, ma0.a)) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((C0456Gq) it2.next()).f = ma0;
                }
                String str = ma0.a;
                int i = ma0.b;
                String str2 = ma0.c;
                String str3 = ma0.d;
                C2109lo0 c2109lo3 = ma0.e;
                AbstractC1474fG.j(str, "id");
                arrayList.add(new Ma0(str, i, str2, str3, c2109lo3, arrayList3));
            }
        } else {
            arrayList = c2109lo2.k;
        }
        List listR0 = AbstractC0911Ye.r0(arrayList, new C2147m8(17));
        List<Cd0> list5 = c2109lo2.f900o;
        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(list5, 10));
        for (Cd0 cd0 : list5) {
            if (cd0 instanceof C1387eR) {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!AbstractC1474fG.b(((C1387eR) next2).a, ((C1387eR) cd0).a));
                C1387eR c1387eR = (C1387eR) next2;
                if (c1387eR != null) {
                    C1387eR c1387eR2 = (C1387eR) cd0;
                    if (!(!c1387eR2.g(c1387eR))) {
                        c1387eR = null;
                    }
                    if (c1387eR != null) {
                        C1387eR c1387eRF = C1387eR.f(c1387eR2, null, null, 32767);
                        c1387eRF.h(c1387eR);
                        A = c1387eRF;
                    } else {
                        A = (C1387eR) cd0;
                    }
                } else {
                    A = (C1387eR) cd0;
                }
            } else {
                if (!(cd0 instanceof C2109lo0)) {
                    throw new C0730Rf();
                }
                Iterator it4 = list3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!AbstractC1474fG.b(((C2109lo0) next).a, ((C2109lo0) cd0).a));
                C2109lo0 c2109lo4 = (C2109lo0) next;
                if (c2109lo4 != null) {
                    C2109lo0 c2109lo5 = (C2109lo0) cd0;
                    if (!(!(c2109lo5.q == c2109lo4.q))) {
                        c2109lo4 = null;
                    }
                    if (c2109lo4 != null) {
                        A = C2109lo0.a(c2109lo5, null, null, null, null, null, null, AQ.w);
                        A.q = c2109lo4.q;
                    }
                }
                A = (C2109lo0) cd0;
            }
            arrayList4.add(A);
        }
        C2109lo0 c2109lo0A = C2109lo0.a(c2109lo1, null, null, null, null, listR0, arrayList4, 30719);
        if (c2109lo0 != null) {
            c2109lo0A.q = c2109lo0.q;
        }
        return new Po0(c2109lo0A);
    }
}
