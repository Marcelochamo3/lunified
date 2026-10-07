package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2217mu extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2314nu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217mu(C2314nu c2314nu, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2314nu;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2217mu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2217mu(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        InterfaceC0473Hh interfaceC0473Hh = null;
        C2314nu c2314nu = this.n;
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
        c2314nu.c.f(C1241cu.a);
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        C2120lu c2120lu = new C2120lu(c2314nu, null);
        this.m = 1;
        obj = AbstractC1376eG.J(executorC0891Xk, c2120lu, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        List<C1046au> list = (List) obj;
        if (list.isEmpty()) {
            C2771sg0 c2771sg0 = c2314nu.c;
            C1233cq c1233cq = C1233cq.l;
            c2771sg0.f(new C1338du(c1233cq, c1233cq, c1233cq));
            return c2985uq0;
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (C1046au c1046au : list) {
            C1583gR c1583gRP = c1046au.b.p();
            c1583gRP.getClass();
            C2538q90 c2538q90J = UK.j((F80) c1583gRP.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP, G80.a(0, "SELECT * FROM movies WHERE isFavorite = 1"), 2));
            C2303no0 c2303no0R = c1046au.b.r();
            c2303no0R.getClass();
            arrayList.add(new C2802sw(c2538q90J, UK.j((F80) c2303no0R.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R, G80.a(0, "SELECT * FROM tv_shows WHERE isFavorite = 1"), 2)), new C1730hu(c2314nu, c1046au, interfaceC0473Hh, 0)));
        }
        C2022ku c2022ku = new C2022ku(new C2022ku((InterfaceC1538fw[]) AbstractC0911Ye.x0(arrayList).toArray(new InterfaceC1538fw[0]), 0, c2314nu), 1, new C1534fu(3, null, 0));
        C1632gu c1632gu = new C1632gu(0, c2314nu);
        this.m = 2;
        return c2022ku.a(c1632gu, this) == enumC1706hi ? enumC1706hi : c2985uq0;
    }
}
