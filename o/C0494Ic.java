package o;

/* JADX INFO: renamed from: o.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494Ic extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0520Jc f325o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0494Ic(AbstractC0520Jc abstractC0520Jc, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f325o = abstractC0520Jc;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0494Ic) o((InterfaceC2622r30) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0494Ic c0494Ic = new C0494Ic(this.f325o, interfaceC0473Hh);
        c0494Ic.n = obj;
        return c0494Ic;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC2622r30 interfaceC2622r30 = (InterfaceC2622r30) this.n;
            this.m = 1;
            if (this.f325o.c(interfaceC2622r30, this) == enumC1706hi) {
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
