package o;

/* JADX INFO: renamed from: o.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1532ft extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532ft(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1532ft) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1532ft(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            String strConcat = this.n;
            if (!AbstractC1899jh0.U(strConcat, "fana-show|", false)) {
                strConcat = "fana-show|".concat(strConcat);
            }
            C2109lo0 c2109lo0 = (C2109lo0) C2409ot.f.get(strConcat);
            if (c2109lo0 != null) {
                if (!(!c2109lo0.k.isEmpty())) {
                    c2109lo0 = null;
                }
                if (c2109lo0 != null) {
                    return c2109lo0;
                }
            }
            C2409ot c2409ot = C2409ot.b;
            this.m = 1;
            obj = c2409ot.z(strConcat, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return (C2109lo0) obj;
    }
}
