package o;

/* JADX INFO: renamed from: o.Hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0487Hv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC0471Hf n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f314o;
    public final /* synthetic */ Ds0 p;
    public final /* synthetic */ InterfaceC0775Sy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487Hv(InterfaceC0471Hf interfaceC0471Hf, long j, Ds0 ds0, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC0471Hf;
        this.f314o = j;
        this.p = ds0;
        this.q = interfaceC0775Sy;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0487Hv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0487Hv(this.n, this.f314o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Ds0 ds0 = this.p;
        InterfaceC1022ai interfaceC1022ai = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                if (((JH) interfaceC1022ai).U()) {
                    return c2985uq0;
                }
                long j = this.f314o;
                C0461Gv c0461Gv = new C0461Gv(this.q, ds0, null);
                this.m = 1;
                obj = Nr0.I(j, c0461Gv, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            Js0 js0 = (Js0) obj;
            if (!((JH) interfaceC1022ai).U() && (!AbstractC1899jh0.O(js0.l))) {
                String str = ds0.m;
                ((C0497If) interfaceC1022ai).X(new C0331Bv(js0, ds0));
            }
        } catch (Exception e) {
            String str2 = ds0.m;
            e.getMessage();
        }
        return c2985uq0;
    }
}
