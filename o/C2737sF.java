package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.sF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2737sF extends Ph0 implements InterfaceC0775Sy {
    public Exception m;
    public int n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2737sF) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2737sF(2, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Exception exc;
        Exception e;
        C1767iF c1767iF;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        InterfaceC0473Hh interfaceC0473Hh = null;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = this.m;
                    try {
                        Jp0.O(obj);
                        c1767iF = (C1767iF) obj;
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof CancellationException) {
                            throw e;
                        }
                        AbstractC3409z9.a(e, exc);
                        throw e;
                    }
                }
                if (c1767iF.a <= 150 || new C1863jF(c1767iF.b).compareTo(new C1863jF("5.6.5")) > 0) {
                    return c1767iF;
                }
                return null;
            }
            Jp0.O(obj);
            C0856Wb c0856Wb = C0856Wb.a;
            C2640rF c2640rF = new C2640rF(i2, interfaceC0473Hh, 0);
            C2640rF c2640rF2 = new C2640rF(i2, interfaceC0473Hh, 1);
            this.n = 1;
            obj = c0856Wb.c("manifiesto de actualización", true, c2640rF, c2640rF2, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            c1767iF = (C1767iF) obj;
            if (c1767iF.a <= 150) {
            }
            return c1767iF;
        } catch (Exception e3) {
            if (e3 instanceof CancellationException) {
                throw e3;
            }
            try {
                C2834tF c2834tF = C2834tF.a;
                OV ov = (OV) C2834tF.d.getValue();
                this.m = e3;
                this.n = 2;
                c2834tF.g(ov, this);
                return enumC1706hi;
            } catch (Exception e4) {
                exc = e3;
                e = e4;
                if (e instanceof CancellationException) {
                    throw e;
                }
                AbstractC3409z9.a(e, exc);
                throw e;
            }
        }
    }
}
