package o;

/* JADX INFO: renamed from: o.qq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2598qq0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1734hw f994o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2598qq0(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f994o = interfaceC1734hw;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2598qq0) o(obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2598qq0 c2598qq0 = new C2598qq0(this.f994o, interfaceC0473Hh);
        c2598qq0.n = obj;
        return c2598qq0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            Object obj2 = this.n;
            this.m = 1;
            if (this.f994o.l(obj2, this) == enumC1706hi) {
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
