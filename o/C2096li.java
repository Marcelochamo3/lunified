package o;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2096li extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f899o;
    public final /* synthetic */ F80 p;
    public final /* synthetic */ InterfaceC1734hw q;
    public final /* synthetic */ String[] r;
    public final /* synthetic */ Callable s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096li(boolean z, F80 f80, InterfaceC1734hw interfaceC1734hw, String[] strArr, Callable callable, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f899o = z;
        this.p = f80;
        this.q = interfaceC1734hw;
        this.r = strArr;
        this.s = callable;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2096li) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2096li c2096li = new C2096li(this.f899o, this.p, this.q, this.r, this.s, interfaceC0473Hh);
        c2096li.n = obj;
        return c2096li;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        AbstractC1217ci abstractC1217ci;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            I9 i9A = UK.a(-1, 0, 6);
            C2720s4 c2720s4 = new C2720s4(this.r, i9A);
            i9A.o(c2985uq0);
            AbstractC1701hf0.s(interfaceC1608gi.t().q(AbstractC2396om0.l));
            boolean z = this.f899o;
            F80 f80 = this.p;
            if (z) {
                Map map = f80.k;
                Object c3180wr = map.get("TransactionDispatcher");
                if (c3180wr == null) {
                    P3 p3 = f80.c;
                    if (p3 == null) {
                        AbstractC1474fG.U("internalTransactionExecutor");
                        throw null;
                    }
                    c3180wr = new C3180wr(p3);
                    map.put("TransactionDispatcher", c3180wr);
                }
                abstractC1217ci = (AbstractC1217ci) c3180wr;
            } else {
                Map map2 = f80.k;
                Object c3180wr2 = map2.get("QueryDispatcher");
                if (c3180wr2 == null) {
                    Executor executor = f80.b;
                    if (executor == null) {
                        AbstractC1474fG.U("internalQueryExecutor");
                        throw null;
                    }
                    c3180wr2 = new C3180wr(executor);
                    map2.put("QueryDispatcher", c3180wr2);
                }
                abstractC1217ci = (AbstractC1217ci) c3180wr2;
            }
            AbstractC1217ci abstractC1217ci2 = abstractC1217ci;
            I9 i9A2 = UK.a(0, 0, 7);
            AbstractC1376eG.w(interfaceC1608gi, abstractC1217ci2, 0, new C1998ki(this.p, c2720s4, i9A, this.s, i9A2, null), 2);
            this.m = 1;
            Object objF = Sr0.f(this.q, i9A2, true, this);
            if (objF != enumC1706hi) {
                objF = c2985uq0;
            }
            if (objF == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return c2985uq0;
    }
}
