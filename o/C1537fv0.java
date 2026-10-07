package o;

/* JADX INFO: renamed from: o.fv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1537fv0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC0471Hf n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537fv0(InterfaceC0471Hf interfaceC0471Hf, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC0471Hf;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1537fv0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1537fv0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            obj = ((C0497If) this.n).y(this);
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
