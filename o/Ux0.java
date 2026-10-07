package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ux0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f563o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ux0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f563o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ux0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ux0(this.f563o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        Ox0 ox0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.m;
                Jp0.O(obj);
            }
            ox0 = (Ox0) ((Mx0) obj).c.get(str);
            if (ox0 != null) {
                return C1152by0.r(ox0);
            }
            throw new IllegalArgumentException("Canal no disponible");
        }
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        this.n = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        String strL0 = AbstractC1119bh0.l0(this.f563o, "xuper-live:");
        C1152by0 c1152by0 = C1152by0.b;
        this.m = strL0;
        this.n = 2;
        Object objQ = C1152by0.q(c1152by0, this);
        if (objQ == enumC1706hi) {
            return enumC1706hi;
        }
        str = strL0;
        obj = objQ;
        ox0 = (Ox0) ((Mx0) obj).c.get(str);
        if (ox0 != null) {
            return C1152by0.r(ox0);
        }
        throw new IllegalArgumentException("Canal no disponible");
    }
}
