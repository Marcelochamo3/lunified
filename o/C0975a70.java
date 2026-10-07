package o;

/* JADX INFO: renamed from: o.a70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975a70 extends Ph0 implements InterfaceC0775Sy {
    public VS m;
    public InterfaceC0775Sy n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f673o;
    public final /* synthetic */ VS p;
    public final /* synthetic */ InterfaceC0775Sy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975a70(VS vs, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = vs;
        this.q = interfaceC0775Sy;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0975a70) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0975a70(this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC0775Sy interfaceC0775Sy;
        YS ys;
        VS vs;
        VS vs2;
        Throwable th;
        VS vs3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f673o;
        try {
            if (i == 0) {
                Jp0.O(obj);
                VS vs4 = this.p;
                this.m = vs4;
                interfaceC0775Sy = this.q;
                this.n = interfaceC0775Sy;
                this.f673o = 1;
                ys = (YS) vs4;
                if (ys.d(null, this) == enumC1706hi) {
                    vs = ys;
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs2 = this.m;
                    try {
                        Jp0.O(obj);
                        vs3 = vs2;
                        ((YS) vs3).e(null);
                        return C2985uq0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                interfaceC0775Sy = this.n;
                VS vs5 = this.m;
                Jp0.O(obj);
                vs = vs5;
            }
            vs = ys;
            Z60 z60 = new Z60(interfaceC0775Sy, null);
            this.m = vs;
            this.n = null;
            this.f673o = 2;
            if (zy0.n(z60, this) == enumC1706hi) {
                return enumC1706hi;
            }
            vs3 = vs;
            ((YS) vs3).e(null);
            return C2985uq0.a;
        } catch (Throwable th3) {
            vs2 = vs;
            th = th3;
            ((YS) vs2).e(null);
            throw th;
        }
    }
}
