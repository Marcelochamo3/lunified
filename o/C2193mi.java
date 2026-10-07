package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2193mi extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f917o;
    public final /* synthetic */ F80 p;
    public final /* synthetic */ String[] q;
    public final /* synthetic */ Callable r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193mi(boolean z, F80 f80, String[] strArr, Callable callable, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f917o = z;
        this.p = f80;
        this.q = strArr;
        this.r = callable;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2193mi) o((InterfaceC1734hw) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2193mi c2193mi = new C2193mi(this.f917o, this.p, this.q, this.r, interfaceC0473Hh);
        c2193mi.n = obj;
        return c2193mi;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            C2096li c2096li = new C2096li(this.f917o, this.p, (InterfaceC1734hw) this.n, this.q, this.r, null);
            this.m = 1;
            if (zy0.n(c2096li, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
