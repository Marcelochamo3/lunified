package o;

/* JADX INFO: renamed from: o.q90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2538q90 implements InterfaceC1538fw {
    public final InterfaceC0775Sy l;

    public C2538q90(C2193mi c2193mi) {
        this.l = c2193mi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.InterfaceC1538fw
    public final Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2711s c2711s;
        Throwable th;
        C2247n90 c2247n90;
        if (interfaceC0473Hh instanceof C2711s) {
            c2711s = (C2711s) interfaceC0473Hh;
            int i = c2711s.f1016o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2711s.f1016o = i - Integer.MIN_VALUE;
            } else {
                c2711s = new C2711s(this, interfaceC0473Hh);
            }
        } else {
            c2711s = new C2711s(this, interfaceC0473Hh);
        }
        Object obj = c2711s.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2711s.f1016o;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2247n90 = c2711s.l;
            try {
                Jp0.O(obj);
                c2247n90.t();
                return c2985uq0;
            } catch (Throwable th2) {
                th = th2;
                c2247n90.t();
                throw th;
            }
        }
        Jp0.O(obj);
        C2247n90 c2247n91 = new C2247n90(interfaceC1734hw, c2711s.g());
        try {
            c2711s.l = c2247n91;
            c2711s.f1016o = 1;
            Object objI = this.l.i(c2247n91, c2711s);
            if (objI != enumC1706hi) {
                objI = c2985uq0;
            }
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
            c2247n90 = c2247n91;
            c2247n90.t();
            return c2985uq0;
        } catch (Throwable th3) {
            th = th3;
            c2247n90 = c2247n91;
            c2247n90.t();
            throw th;
        }
    }
}
