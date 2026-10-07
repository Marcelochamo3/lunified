package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JR extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ InterfaceC1734hw f342o;
    public /* synthetic */ HR p;
    public final /* synthetic */ MR q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JR(MR mr, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.q = mr;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) obj;
        HR hr = (HR) obj2;
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj3;
        switch (this.m) {
            case 0:
                JR jr = new JR(this.q, interfaceC0473Hh, 0);
                jr.f342o = interfaceC1734hw;
                jr.p = hr;
                return jr.r(C2985uq0.a);
            default:
                JR jr2 = new JR(this.q, interfaceC0473Hh, 1);
                jr2.f342o = interfaceC1734hw;
                jr2.p = hr;
                return jr2.r(C2985uq0.a);
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
                    InterfaceC1734hw interfaceC1734hw = this.f342o;
                    HR hr = this.p;
                    if (hr instanceof GR) {
                        List list = ((GR) hr).a.m;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof C1387eR) {
                                arrayList.add(obj2);
                            }
                        }
                        C1583gR c1583gRP = this.q.b.p();
                        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C1387eR) it.next()).a);
                        }
                        C2538q90 c2538q90V = c1583gRP.v(arrayList2);
                        C0517Iz c0517Iz = new C0517Iz(interfaceC1734hw, 4);
                        this.f342o = null;
                        this.n = 1;
                        if (c2538q90V.a(c0517Iz, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                    } else {
                        C1233cq c1233cq = C1233cq.l;
                        this.f342o = null;
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
                    InterfaceC1734hw interfaceC1734hw2 = this.f342o;
                    HR hr2 = this.p;
                    if (hr2 instanceof GR) {
                        List list2 = ((GR) hr2).a.m;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof C2109lo0) {
                                arrayList3.add(obj3);
                            }
                        }
                        C2303no0 c2303no0R = this.q.b.r();
                        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((C2109lo0) it2.next()).a);
                        }
                        C2538q90 c2538q90H = c2303no0R.h(arrayList4);
                        C0517Iz c0517Iz2 = new C0517Iz(interfaceC1734hw2, 5);
                        this.f342o = null;
                        this.n = 1;
                        if (c2538q90H.a(c0517Iz2, this) == enumC1706hi2) {
                            return enumC1706hi2;
                        }
                    } else {
                        C1233cq c1233cq2 = C1233cq.l;
                        this.f342o = null;
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
