package o;

/* JADX INFO: renamed from: o.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1112be extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f699o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1112be(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f699o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1112be) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1112be(this.n, this.f699o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        String str = this.n;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else if (i == 2) {
                Jp0.O(obj);
                C1600ge c1600ge = C1600ge.a;
                this.m = 3;
                obj = AbstractC1376eG.J(AbstractC1910jn.b, new C0884Xd(this.f699o, str, (String) obj, null), this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            return obj;
        }
        Jp0.O(obj);
        this.m = 1;
        Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new V60(2, null), this);
        if (objJ != enumC1706hi) {
            objJ = C2985uq0.a;
        }
        if (objJ == enumC1706hi) {
            return enumC1706hi;
        }
        C1600ge c1600ge2 = C1600ge.a;
        this.m = 2;
        obj = C1600ge.d(c1600ge2, str, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        C1600ge c1600ge3 = C1600ge.a;
        this.m = 3;
        obj = AbstractC1376eG.J(AbstractC1910jn.b, new C0884Xd(this.f699o, str, (String) obj, null), this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        return obj;
    }
}
