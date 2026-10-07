package o;

import java.util.List;

/* JADX INFO: renamed from: o.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1796ie extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f831o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1796ie(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f831o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1796ie) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1796ie c1796ie = new C1796ie(this.f831o, interfaceC0473Hh);
        c1796ie.n = obj;
        return c1796ie;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                int i2 = this.f831o;
                C3380yu c3380yuQ = C2379oe.q();
                this.m = 1;
                c3380yuQ.getClass();
                obj = AbstractC1376eG.J(AbstractC1910jn.b, new C3186wu(c3380yuQ, i2, null), this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            objK = (List) obj;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return objK instanceof C2439p80 ? C1233cq.l : objK;
    }
}
