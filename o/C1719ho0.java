package o;

/* JADX INFO: renamed from: o.ho0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1719ho0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f817o;
    public final /* synthetic */ String p;
    public final /* synthetic */ byte[] q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719ho0(boolean z, String str, byte[] bArr, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f817o = z;
        this.p = str;
        this.q = bArr;
        this.r = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1719ho0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1719ho0 c1719ho0 = new C1719ho0(this.f817o, this.p, this.q, this.r, interfaceC0473Hh);
        c1719ho0.n = obj;
        return c1719ho0;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            Ec0 ec0 = Ec0.a;
            C1621go0 c1621go0 = new C1621go0(this.f817o, interfaceC1608gi, this.p, this.q, this.r, null);
            this.m = 1;
            obj = ec0.n(c1621go0, this);
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
