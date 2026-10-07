package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ja0 extends Ph0 implements InterfaceC0775Sy {
    public ArrayList m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public YS f345o;
    public int p;
    public final /* synthetic */ La0 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ja0(La0 la0, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = la0;
        this.r = str;
        this.s = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ja0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ja0(this.q, this.r, this.s, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0114 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) {
        ArrayList arrayList;
        YS ys;
        ArrayList arrayList2;
        Ia0 ia0;
        C1830iw c1830iw;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.p;
        C2985uq0 c2985uq0 = C2985uq0.a;
        La0 la0 = this.q;
        if (i == 0) {
            Jp0.O(obj);
            la0.getClass();
            String str = this.r;
            AbstractC1474fG.j(str, "<set-?>");
            la0.d = str;
            la0.e = 1;
            C3438za0 c3438za0 = C3438za0.a;
            this.p = 1;
            la0.b.l(c3438za0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Jp0.O(obj);
                }
                if (i == 3) {
                    YS ys2 = this.f345o;
                    ArrayList arrayList3 = this.n;
                    ArrayList arrayList4 = this.m;
                    Jp0.O(obj);
                    ys = ys2;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    ia0 = new Ia0(arrayList2, this.r, ys, arrayList, this.q, null);
                    this.m = null;
                    this.n = null;
                    this.f345o = null;
                    this.p = 4;
                    c1830iw = new C1830iw(g(), this, 1);
                    if (AP.x(c1830iw, c1830iw, ia0) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return c2985uq0;
            }
            Jp0.O(obj);
        }
        Q30.a.getClass();
        List list = P30.b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list) {
            Q30 q30 = (Q30) obj2;
            if (q30.l() && AbstractC1474fG.b(q30.m(), this.s)) {
                arrayList5.add(obj2);
            }
        }
        if (arrayList5.isEmpty()) {
            C2771sg0 c2771sg0 = la0.b;
            Ca0 ca0 = new Ca0(C1233cq.l);
            this.p = 2;
            c2771sg0.l(ca0, this);
            return c2985uq0 == enumC1706hi ? enumC1706hi : c2985uq0;
        }
        ArrayList arrayList6 = new ArrayList(AbstractC1016af.O(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            arrayList6.add(new X30((Q30) it.next(), V30.f565o));
        }
        ArrayList arrayListY0 = AbstractC0911Ye.y0(arrayList6);
        YS ysA = AbstractC1923jt0.a();
        C2771sg0 c2771sg1 = la0.b;
        Ca0 ca1 = new Ca0(AbstractC0911Ye.x0(arrayListY0));
        this.m = arrayList5;
        this.n = arrayListY0;
        this.f345o = ysA;
        this.p = 3;
        c2771sg1.l(ca1, this);
        if (c2985uq0 == enumC1706hi) {
            return enumC1706hi;
        }
        arrayList = arrayListY0;
        ys = ysA;
        arrayList2 = arrayList5;
        ia0 = new Ia0(arrayList2, this.r, ys, arrayList, this.q, null);
        this.m = null;
        this.n = null;
        this.f345o = null;
        this.p = 4;
        c1830iw = new C1830iw(g(), this, 1);
        if (AP.x(c1830iw, c1830iw, ia0) == enumC1706hi) {
            return enumC1706hi;
        }
        return c2985uq0;
    }
}
