package o;

/* JADX INFO: renamed from: o.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0461Gv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC0775Sy n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ds0 f289o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461Gv(InterfaceC0775Sy interfaceC0775Sy, Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC0775Sy;
        this.f289o = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0461Gv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0461Gv(this.n, this.f289o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            obj = this.n.i(this.f289o, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return obj;
    }
}
