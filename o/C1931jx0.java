package o;

/* JADX INFO: renamed from: o.jx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1931jx0 extends Ph0 implements InterfaceC0775Sy {
    public VS m;
    public C2532q60 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f859o;
    public C2532q60 p;
    public long q;
    public int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ C2532q60 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ C2532q60 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1931jx0(long j, C2532q60 c2532q60, String str, C2532q60 c2532q61, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.s = j;
        this.t = c2532q60;
        this.u = str;
        this.v = c2532q61;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1931jx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1931jx0(this.s, this.t, this.u, this.v, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        YS ys;
        C2532q60 c2532q60;
        String str;
        C2532q60 c2532q61;
        long j;
        VS vs;
        VS vs2;
        Throwable th;
        C2532q60 c2532q62;
        VS vs3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.r;
        try {
            if (i == 0) {
                Jp0.O(obj);
                ys = Lx0.c;
                this.m = ys;
                c2532q60 = this.t;
                this.n = c2532q60;
                str = this.u;
                this.f859o = str;
                c2532q61 = this.v;
                this.p = c2532q61;
                j = this.s;
                this.q = j;
                this.r = 1;
                if (ys.d(null, this) == enumC1706hi) {
                    vs = ys;
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2532q62 = this.n;
                    vs2 = this.m;
                    try {
                        Jp0.O(obj);
                        vs2 = vs2;
                        c2532q62.l = true;
                        vs3 = vs2;
                        ((YS) vs3).e(null);
                        return C2985uq0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                j = this.q;
                c2532q61 = this.p;
                str = this.f859o;
                c2532q60 = this.n;
                VS vs4 = this.m;
                Jp0.O(obj);
                vs = vs4;
            }
            vs = ys;
            long jD = com.skidush.clonex.bridge.N7.a.d();
            if (jD <= 0 || jD == j) {
                c2532q60.l = true;
                Long l = new Long(j);
                this.m = vs;
                this.n = c2532q61;
                this.f859o = null;
                this.p = null;
                this.r = 2;
                if (Ec0.a.n(new C1248cx0(l, str, null), this) == enumC1706hi) {
                    return enumC1706hi;
                }
                c2532q62 = c2532q61;
                vs2 = vs;
                c2532q62.l = true;
                vs3 = vs2;
            } else {
                vs3 = vs;
            }
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
