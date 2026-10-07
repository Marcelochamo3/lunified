package o;

/* JADX INFO: renamed from: o.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0468Hc extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1734hw f306o;
    public final /* synthetic */ AbstractC0520Jc p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468Hc(InterfaceC1734hw interfaceC1734hw, AbstractC0520Jc abstractC0520Jc, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f306o = interfaceC1734hw;
        this.p = abstractC0520Jc;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0468Hc) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0468Hc c0468Hc = new C0468Hc(this.f306o, this.p, interfaceC0473Hh);
        c0468Hc.n = obj;
        return c0468Hc;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i == 0) {
            Jp0.O(obj);
            G50 g50D = this.p.d((InterfaceC1608gi) this.n);
            this.m = 1;
            Object objF = Sr0.f(this.f306o, g50D, true, this);
            if (objF != enumC1706hi) {
                objF = c2985uq0;
            }
            if (objF == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return c2985uq0;
    }
}
