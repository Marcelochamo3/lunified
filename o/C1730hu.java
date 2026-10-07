package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1730hu extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ List f819o;
    public final /* synthetic */ Ut0 p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1730hu(Ut0 ut0, Object obj, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.p = ut0;
        this.q = obj;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj3;
        switch (this.m) {
            case 0:
                C1730hu c1730hu = new C1730hu((C2314nu) this.p, (C1046au) this.q, interfaceC0473Hh, 0);
                c1730hu.n = list;
                c1730hu.f819o = list2;
                return c1730hu.r(C2985uq0.a);
            default:
                C1730hu c1730hu2 = new C1730hu((IB) this.p, (AB) this.q, interfaceC0473Hh, 1);
                c1730hu2.n = list;
                c1730hu2.f819o = list2;
                return c1730hu2.r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        switch (this.m) {
            case 0:
                Jp0.O(obj);
                List list = this.n;
                List<C2109lo0> list2 = this.f819o;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (UK.E((C1387eR) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1046au c1046au = (C1046au) this.q;
                    C2314nu c2314nu = (C2314nu) this.p;
                    if (!zHasNext) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list) {
                            if (!UK.E((C1387eR) obj3)) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(C2314nu.e(c2314nu, (C1387eR) it2.next(), c1046au.a));
                        }
                        ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(list2, 10));
                        for (C2109lo0 c2109lo0 : list2) {
                            String str = c1046au.a;
                            c2314nu.getClass();
                            C2109lo0 c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                            c2109lo0A.q = c2109lo0.q;
                            c2109lo0A.r = str;
                            arrayList5.add(c2109lo0A);
                        }
                        return new C0952Zt(arrayList2, arrayList4, arrayList5);
                    }
                    arrayList2.add(C2314nu.e(c2314nu, (C1387eR) it.next(), c1046au.a));
                }
                break;
            default:
                Jp0.O(obj);
                List list3 = this.n;
                List<C0456Gq> list4 = this.f819o;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list3) {
                    if (!UK.E((C1387eR) obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList(AbstractC1016af.O(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    AB ab = (AB) this.q;
                    IB ib = (IB) this.p;
                    if (!zHasNext2) {
                        ArrayList arrayList8 = new ArrayList(AbstractC1016af.O(list4, 10));
                        for (C0456Gq c0456Gq : list4) {
                            C2109lo0 c2109lo1 = c0456Gq.e;
                            if (c2109lo1 != null) {
                                C2109lo0 c2109lo0F = ab.b.r().f(c2109lo1.a);
                                if (c2109lo0F != null) {
                                    c2109lo1 = c2109lo0F;
                                }
                            } else {
                                c2109lo1 = null;
                            }
                            c0456Gq.e = c2109lo1;
                            Ma0 ma0 = c0456Gq.f;
                            if (ma0 != null) {
                                Ma0 ma0X = ab.b.q().x(ma0.a);
                                if (ma0X != null) {
                                    ma0 = ma0X;
                                }
                            } else {
                                ma0 = null;
                            }
                            c0456Gq.f = ma0;
                            String str2 = ab.a;
                            ib.getClass();
                            C0456Gq c0456GqF = C0456Gq.f(c0456Gq);
                            c0456GqF.g(c0456Gq);
                            c0456GqF.k = str2;
                            C2109lo0 c2109lo2 = c0456GqF.e;
                            if (c2109lo2 != null) {
                                c2109lo2.r = str2;
                            }
                            arrayList8.add(c0456GqF);
                        }
                        return new C3412zB(arrayList7, arrayList8);
                    }
                    C1387eR c1387eR = (C1387eR) it3.next();
                    String str3 = ab.a;
                    ib.getClass();
                    C1387eR c1387eRF = C1387eR.f(c1387eR, null, null, 32767);
                    c1387eRF.h(c1387eR);
                    c1387eRF.t = str3;
                    arrayList7.add(c1387eRF);
                }
                break;
        }
    }
}
