package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PC extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ InterfaceC1734hw f452o;
    public /* synthetic */ MC p;
    public final /* synthetic */ RC q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PC(RC rc, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.q = rc;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) obj;
        MC mc = (MC) obj2;
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj3;
        switch (this.m) {
            case 0:
                PC pc = new PC(this.q, interfaceC0473Hh, 0);
                pc.f452o = interfaceC1734hw;
                pc.p = mc;
                return pc.r(C2985uq0.a);
            default:
                PC pc2 = new PC(this.q, interfaceC0473Hh, 1);
                pc2.f452o = interfaceC1734hw;
                pc2.p = mc;
                return pc2.r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) {
        switch (this.m) {
            case 0:
                EnumC1706hi enumC1706hi = EnumC1706hi.l;
                int i = this.n;
                if (i == 0) {
                    Jp0.O(obj);
                    InterfaceC1734hw interfaceC1734hw = this.f452o;
                    MC mc = this.p;
                    if (mc instanceof LC) {
                        List list = ((LC) mc).a;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC1406ef.Q(arrayList, ((C0882Xb) it.next()).b);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (obj2 instanceof C1387eR) {
                                arrayList2.add(obj2);
                            }
                        }
                        C1583gR c1583gRP = this.q.b.p();
                        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((C1387eR) it2.next()).a);
                        }
                        C2538q90 c2538q90V = c1583gRP.v(arrayList3);
                        C0517Iz c0517Iz = new C0517Iz(interfaceC1734hw, 2);
                        this.f452o = null;
                        this.n = 1;
                        if (c2538q90V.a(c0517Iz, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                    } else {
                        C1233cq c1233cq = C1233cq.l;
                        this.f452o = null;
                        this.n = 2;
                        if (interfaceC1734hw.l(c1233cq, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            default:
                EnumC1706hi enumC1706hi2 = EnumC1706hi.l;
                int i2 = this.n;
                if (i2 == 0) {
                    Jp0.O(obj);
                    InterfaceC1734hw interfaceC1734hw2 = this.f452o;
                    MC mc2 = this.p;
                    if (mc2 instanceof LC) {
                        List list2 = ((LC) mc2).a;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            AbstractC1406ef.Q(arrayList4, ((C0882Xb) it3.next()).b);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (obj3 instanceof C2109lo0) {
                                arrayList5.add(obj3);
                            }
                        }
                        C2303no0 c2303no0R = this.q.b.r();
                        ArrayList arrayList6 = new ArrayList(AbstractC1016af.O(arrayList5, 10));
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((C2109lo0) it4.next()).a);
                        }
                        C2538q90 c2538q90H = c2303no0R.h(arrayList6);
                        C0517Iz c0517Iz2 = new C0517Iz(interfaceC1734hw2, 3);
                        this.f452o = null;
                        this.n = 1;
                        if (c2538q90H.a(c0517Iz2, this) == enumC1706hi2) {
                            return enumC1706hi2;
                        }
                    } else {
                        C1233cq c1233cq2 = C1233cq.l;
                        this.f452o = null;
                        this.n = 2;
                        if (interfaceC1734hw2.l(c1233cq2, this) == enumC1706hi2) {
                            return enumC1706hi2;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
        }
    }
}
