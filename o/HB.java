package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HB extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ IB n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HB(IB ib, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ib;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((HB) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new HB(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        InterfaceC0473Hh interfaceC0473Hh = null;
        IB ib = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
        }
        Jp0.O(obj);
        ib.c.f(CB.a);
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        GB gb = new GB(ib, null);
        this.m = 1;
        obj = AbstractC1376eG.J(executorC0891Xk, gb, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        List<AB> list = (List) obj;
        if (list.isEmpty()) {
            C2771sg0 c2771sg0 = ib.c;
            C1233cq c1233cq = C1233cq.l;
            c2771sg0.f(new DB(c1233cq, c1233cq));
            return c2985uq0;
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (AB ab : list) {
            C1583gR c1583gRP = ab.b.p();
            c1583gRP.getClass();
            C2538q90 c2538q90J = UK.j((F80) c1583gRP.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP, G80.a(0, "SELECT * FROM movies WHERE lastEngagementTimeUtcMillis IS NOT NULL ORDER BY lastEngagementTimeUtcMillis DESC"), 3));
            C0560Kq c0560KqO = ab.b.o();
            c0560KqO.getClass();
            arrayList.add(new C2802sw(c2538q90J, UK.j((F80) c0560KqO.m, new String[]{"episodes"}, new CallableC0534Jq(c0560KqO, G80.a(0, "SELECT * FROM episodes WHERE lastEngagementTimeUtcMillis IS NOT NULL ORDER BY lastEngagementTimeUtcMillis DESC"), 2)), new C1730hu(ib, ab, interfaceC0473Hh, 1)));
        }
        C2022ku c2022ku = new C2022ku(new C2022ku((InterfaceC1538fw[]) AbstractC0911Ye.x0(arrayList).toArray(new InterfaceC1538fw[0]), 5, ib), 1, new C1534fu(3, null, 1));
        C1632gu c1632gu = new C1632gu(5, ib);
        this.m = 2;
        return c2022ku.a(c1632gu, this) == enumC1706hi ? enumC1706hi : c2985uq0;
    }
}
