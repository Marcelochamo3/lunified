package o;

/* JADX INFO: renamed from: o.xx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3290xx0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290xx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3290xx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3290xx0 c3290xx0 = new C3290xx0(this.n, interfaceC0473Hh);
        c3290xx0.m = obj;
        return c3290xx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        Jp0.O(obj);
        try {
            objK = Lx0.q(this.n, "1");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            return null;
        }
        return objK;
    }
}
