package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Sn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Ds0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sn0(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Sn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Sn0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                C1816io0 c1816io0 = C1816io0.b;
                Ds0 ds0 = this.n;
                this.m = 1;
                if (C1816io0.I(ds0, this) == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return C2985uq0.a;
    }
}
