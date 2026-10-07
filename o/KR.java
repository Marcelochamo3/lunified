package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class KR extends Ph0 implements InterfaceC0801Ty {
    public /* synthetic */ HR m;
    public /* synthetic */ C1387eR n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ List f359o;
    public /* synthetic */ List p;

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [o.eR] */
    @Override // o.R7
    public final Object r(Object obj) {
        Object next;
        ?? A;
        Object next2;
        Jp0.O(obj);
        HR hr = this.m;
        C1387eR c1387eR = this.n;
        List list = this.f359o;
        List list2 = this.p;
        if (!(hr instanceof GR)) {
            return hr;
        }
        C1387eR c1387eR2 = ((GR) hr).a;
        List list3 = c1387eR2.m;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                C1387eR c1387eRF = C1387eR.f(c1387eR2, null, arrayList, 24575);
                if (c1387eR != null) {
                    c1387eRF.h(c1387eR);
                }
                return new GR(c1387eRF);
            }
            Cd0 cd0 = (Cd0) it.next();
            if (cd0 instanceof C1387eR) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!AbstractC1474fG.b(((C1387eR) next2).a, ((C1387eR) cd0).a));
                C1387eR c1387eR3 = (C1387eR) next2;
                if (c1387eR3 != null) {
                    C1387eR c1387eR4 = (C1387eR) cd0;
                    if (!(true ^ c1387eR4.g(c1387eR3))) {
                        c1387eR3 = null;
                    }
                    if (c1387eR3 != null) {
                        A = C1387eR.f(c1387eR4, null, null, 32767);
                        A.h(c1387eR3);
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
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!AbstractC1474fG.b(((C2109lo0) next).a, ((C2109lo0) cd0).a));
                C2109lo0 c2109lo0 = (C2109lo0) next;
                if (c2109lo0 != null) {
                    C2109lo0 c2109lo1 = (C2109lo0) cd0;
                    C2109lo0 c2109lo2 = (c2109lo1.q == c2109lo0.q) ^ true ? c2109lo0 : null;
                    if (c2109lo2 != null) {
                        A = C2109lo0.a(c2109lo1, null, null, null, null, null, null, AQ.w);
                        A.q = c2109lo2.q;
                    } else {
                        A = (C2109lo0) cd0;
                    }
                } else {
                    A = (C2109lo0) cd0;
                }
            }
            arrayList.add(A);
        }
    }
}
