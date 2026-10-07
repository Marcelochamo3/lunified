package o;

/* JADX INFO: renamed from: o.kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2026kw extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1478fK f881o;
    public final /* synthetic */ TJ p;
    public final /* synthetic */ InterfaceC1538fw q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2026kw(C1478fK c1478fK, TJ tj, InterfaceC1538fw interfaceC1538fw, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f881o = c1478fK;
        this.p = tj;
        this.q = interfaceC1538fw;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2026kw) o((InterfaceC2622r30) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2026kw c2026kw = new C2026kw(this.f881o, this.p, this.q, interfaceC0473Hh);
        c2026kw.n = obj;
        return c2026kw;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        InterfaceC2622r30 interfaceC2622r30;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC2622r30 interfaceC2622r31 = (InterfaceC2622r30) this.n;
            C1928jw c1928jw = new C1928jw(this.q, interfaceC2622r31, null);
            this.n = interfaceC2622r31;
            this.m = 1;
            if (AbstractC1376eG.B(this.f881o, this.p, c1928jw, this) == enumC1706hi) {
                return enumC1706hi;
            }
            interfaceC2622r30 = interfaceC2622r31;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2622r30 = (InterfaceC2622r30) this.n;
            Jp0.O(obj);
        }
        ((C2526q30) interfaceC2622r30).b(null);
        return C2985uq0.a;
    }
}
