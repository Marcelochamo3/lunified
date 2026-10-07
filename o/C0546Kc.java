package o;

/* JADX INFO: renamed from: o.Kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0546Kc extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0675Pc f365o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0546Kc(C0675Pc c0675Pc, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f365o = c0675Pc;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0546Kc) o((InterfaceC1734hw) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0546Kc c0546Kc = new C0546Kc(this.f365o, interfaceC0473Hh);
        c0546Kc.n = obj;
        return c0546Kc;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) this.n;
            this.m = 1;
            if (this.f365o.e(interfaceC1734hw, this) == enumC1706hi) {
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
