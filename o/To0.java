package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class To0 extends Ph0 implements InterfaceC0827Uy {
    public int m;
    public /* synthetic */ InterfaceC1734hw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Qo0 f543o;
    public final /* synthetic */ Wo0 p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public To0(Wo0 wo0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(3, interfaceC0473Hh);
        this.p = wo0;
        this.q = str;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        To0 to0 = new To0(this.p, this.q, (InterfaceC0473Hh) obj3);
        to0.n = (InterfaceC1734hw) obj;
        to0.f543o = (Qo0) obj2;
        return to0.r(C2985uq0.a);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x025b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0294 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) {
        InterfaceC1734hw interfaceC1734hw;
        Qo0 qo0;
        Object objL;
        int i;
        Object objPrevious;
        Object next;
        C0456Gq c0456Gq;
        List list;
        int iNextIndex;
        Ma0 ma0;
        Object next2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.m;
        Wo0 wo0 = this.p;
        if (i2 != 0) {
            if (i2 == 1) {
                qo0 = this.f543o;
                interfaceC1734hw = this.n;
                Jp0.O(obj);
                objL = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            return C2985uq0.a;
        }
        Jp0.O(obj);
        interfaceC1734hw = this.n;
        qo0 = this.f543o;
        if (qo0 instanceof Po0) {
            C0560Kq c0560KqO = wo0.b.o();
            c0560KqO.getClass();
            G80 g80A = G80.a(1, "SELECT * FROM episodes WHERE tvShow = ? ORDER BY season, number");
            g80A.o(1, this.q);
            C2538q90 c2538q90J = UK.j((F80) c0560KqO.m, new String[]{"episodes"}, new CallableC0534Jq(c0560KqO, g80A, 1));
            this.n = interfaceC1734hw;
            this.f543o = qo0;
            this.m = 1;
            objL = Nr0.l(c2538q90J, this);
            if (objL == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            i = 2;
        }
        this.n = null;
        this.f543o = null;
        this.m = i;
        if (interfaceC1734hw.l(qo0, this) == enumC1706hi) {
            return enumC1706hi;
        }
        return C2985uq0.a;
        List list2 = (List) objL;
        Po0 po0 = (Po0) qo0;
        for (Ma0 ma1 : po0.a.k) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                Ma0 ma2 = ((C0456Gq) obj2).f;
                if (AbstractC1474fG.b(ma2 != null ? ma2.a : null, ma1.a)) {
                    arrayList.add(obj2);
                }
            }
            ma1.getClass();
            ma1.f = arrayList;
        }
        boolean zIsEmpty = list2.isEmpty();
        C2109lo0 c2109lo0 = po0.a;
        if (!zIsEmpty || !(!c2109lo0.k.isEmpty())) {
            List list3 = c2109lo0.k;
            ListIterator listIterator = list3.listIterator(list3.size());
            loop3: while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                Ma0 ma3 = (Ma0) objPrevious;
                C0456Gq c0456Gq2 = (C0456Gq) AbstractC0911Ye.j0(ma3.f);
                if (c0456Gq2 != null && c0456Gq2.h) {
                    break;
                }
                List list4 = ma3.f;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (((C0456Gq) it.next()).h) {
                            break loop3;
                        }
                    }
                }
            }
            Ma0 ma4 = (Ma0) objPrevious;
            if (ma4 != null) {
                C0456Gq c0456Gq3 = (C0456Gq) AbstractC0911Ye.j0(ma4.f);
                if (c0456Gq3 != null && c0456Gq3.h && (ma0 = (Ma0) AbstractC0911Ye.e0(list3.indexOf(ma4) + 1, list3)) != null) {
                    ma4 = ma0;
                }
            } else {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Ma0 ma5 = (Ma0) next;
                    if (ma5.f.isEmpty() || ((c0456Gq = (C0456Gq) AbstractC0911Ye.j0(ma5.f)) != null && !c0456Gq.h)) {
                        break;
                    }
                }
                ma4 = (Ma0) next;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (((C0456Gq) obj3).j != null) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it3 = AbstractC0911Ye.r0(arrayList2, new C1749i30(11)).iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((C0456Gq) it3.next()).j != null) {
                    break;
                }
                i3++;
            }
            Integer num = new Integer(i3);
            if (num.intValue() == -1) {
                num = null;
            }
            if (num == null) {
                if (ma4 == null || (list = ma4.f) == null) {
                    num = null;
                } else {
                    ListIterator listIterator2 = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((C0456Gq) listIterator2.previous()).h) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    }
                    Integer num2 = new Integer(iNextIndex);
                    int iIntValue = num2.intValue();
                    if (iIntValue == -1 || iIntValue + 1 >= list2.size()) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        num = new Integer(num2.intValue() + 1);
                    } else {
                        num = null;
                    }
                }
            }
            if (num == null && ma4 != null && (ma4.f.isEmpty() || AbstractC1474fG.b(AbstractC0911Ye.j0(c2109lo0.k), ma4))) {
                wo0.getClass();
                C0548Ke c0548KeO = AbstractC3021v9.o(wo0);
                ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
                Ro0 ro0 = new Ro0(wo0, ma4, c2109lo0, null);
                i = 2;
                AbstractC1376eG.w(c0548KeO, executorC0891Xk, 0, ro0, 2);
            }
            this.n = null;
            this.f543o = null;
            this.m = i;
            if (interfaceC1734hw.l(qo0, this) == enumC1706hi) {
                return enumC1706hi;
            }
            return C2985uq0.a;
        }
        Iterator it4 = c2109lo0.k.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((Ma0) next2).b == 0);
        Ma0 ma6 = (Ma0) next2;
        if (ma6 == null) {
            ma6 = (Ma0) AbstractC0911Ye.b0(c2109lo0.k);
        }
        C2109lo0 c2109lo1 = new C2109lo0(this.q, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
        wo0.getClass();
        AbstractC1376eG.w(AbstractC3021v9.o(wo0), AbstractC1910jn.b, 0, new Ro0(wo0, ma6, c2109lo1, null), 2);
        i = 2;
        this.n = null;
        this.f543o = null;
        this.m = i;
        if (interfaceC1734hw.l(qo0, this) == enumC1706hi) {
            return enumC1706hi;
        }
        return C2985uq0.a;
    }
}
