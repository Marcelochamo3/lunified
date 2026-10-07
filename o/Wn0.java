package o;

/* JADX INFO: loaded from: classes.dex */
public final class Wn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f604o;
    public final /* synthetic */ C1816io0 p;
    public final /* synthetic */ Ds0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wn0(String str, boolean z, C1816io0 c1816io0, Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f604o = z;
        this.p = c1816io0;
        this.q = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Wn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Wn0(this.n, this.f604o, this.p, this.q, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C1816io0 c1816io0 = this.p;
        Ds0 ds0 = this.q;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            return Js0.a((Js0) obj, null, null, null, null, null, null, true, 2047);
        }
        Jp0.O(obj);
        if (this.n == null || this.f604o) {
            str = ds0.l;
        } else {
            this.m = 1;
            C1816io0 c1816io1 = C1816io0.b;
            c1816io0.getClass();
            obj = AbstractC1376eG.J(AbstractC1910jn.b, new Vn0(ds0, null), this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        }
        this.m = 2;
        obj = C1816io0.q(c1816io0, ds0, str, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        return Js0.a((Js0) obj, null, null, null, null, null, null, true, 2047);
        str = (String) obj;
        this.m = 2;
        obj = C1816io0.q(c1816io0, ds0, str, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        return Js0.a((Js0) obj, null, null, null, null, null, null, true, 2047);
    }
}
