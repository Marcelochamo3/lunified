package o;

import com.skidush.clonex.database.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BY extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ InterfaceC1734hw f185o;
    public /* synthetic */ AbstractC3338yY p;
    public final /* synthetic */ AppDatabase q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BY(AppDatabase appDatabase, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.q = appDatabase;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) obj;
        AbstractC3338yY abstractC3338yY = (AbstractC3338yY) obj2;
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj3;
        switch (this.m) {
            case 0:
                BY by = new BY(this.q, interfaceC0473Hh, 0);
                by.f185o = interfaceC1734hw;
                by.p = abstractC3338yY;
                return by.r(C2985uq0.a);
            default:
                BY by2 = new BY(this.q, interfaceC0473Hh, 1);
                by2.f185o = interfaceC1734hw;
                by2.p = abstractC3338yY;
                return by2.r(C2985uq0.a);
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
                    InterfaceC1734hw interfaceC1734hw = this.f185o;
                    AbstractC3338yY abstractC3338yY = this.p;
                    if (abstractC3338yY instanceof C3241xY) {
                        List list = ((C3241xY) abstractC3338yY).a.d;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof C1387eR) {
                                arrayList.add(obj2);
                            }
                        }
                        C1583gR c1583gRP = this.q.p();
                        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((C1387eR) it.next()).a);
                        }
                        C2538q90 c2538q90V = c1583gRP.v(arrayList2);
                        C0517Iz c0517Iz = new C0517Iz(interfaceC1734hw, 7);
                        this.f185o = null;
                        this.n = 1;
                        if (c2538q90V.a(c0517Iz, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                    } else {
                        C1233cq c1233cq = C1233cq.l;
                        this.f185o = null;
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
                    InterfaceC1734hw interfaceC1734hw2 = this.f185o;
                    AbstractC3338yY abstractC3338yY2 = this.p;
                    if (abstractC3338yY2 instanceof C3241xY) {
                        List list2 = ((C3241xY) abstractC3338yY2).a.d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof C2109lo0) {
                                arrayList3.add(obj3);
                            }
                        }
                        C2303no0 c2303no0R = this.q.r();
                        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((C2109lo0) it2.next()).a);
                        }
                        C2538q90 c2538q90H = c2303no0R.h(arrayList4);
                        C0517Iz c0517Iz2 = new C0517Iz(interfaceC1734hw2, 8);
                        this.f185o = null;
                        this.n = 1;
                        if (c2538q90H.a(c0517Iz2, this) == enumC1706hi2) {
                            return enumC1706hi2;
                        }
                    } else {
                        C1233cq c1233cq2 = C1233cq.l;
                        this.f185o = null;
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
