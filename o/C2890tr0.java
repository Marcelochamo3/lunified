package o;

/* JADX INFO: renamed from: o.tr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2890tr0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1046o;
    public final /* synthetic */ EnumC1139br0 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ C1041ar0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2890tr0(boolean z, EnumC1139br0 enumC1139br0, String str, long j, C1041ar0 c1041ar0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f1046o = z;
        this.p = enumC1139br0;
        this.q = str;
        this.r = j;
        this.s = c1041ar0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2890tr0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2890tr0 c2890tr0 = new C2890tr0(this.f1046o, this.p, this.q, this.r, this.s, interfaceC0473Hh);
        c2890tr0.n = obj;
        return c2890tr0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    @Override // o.R7
    public final Object r(Object obj) {
        C1041ar0 c1041ar0;
        String strD0;
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        try {
            if (i == 0) {
                Jp0.O(obj);
                InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
                C3084vr0 c3084vr0 = C3084vr0.a;
                boolean z = this.f1046o;
                EnumC1139br0 enumC1139br0 = this.p;
                String str = this.q;
                this.n = interfaceC1608gi;
                this.m = 1;
                obj = c3084vr0.i(z, enumC1139br0, str, null, false, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            C1041ar0 c1041ar1 = (C1041ar0) obj;
            C3084vr0 c3084vr1 = C3084vr0.a;
            if (C3084vr0.s() && this.r == C3084vr0.D) {
                EnumC1139br0 enumC1139br0H = C3084vr0.H();
                EnumC1139br0 enumC1139br1 = this.p;
                if (enumC1139br0H == enumC1139br1 && AbstractC1474fG.b(C3084vr0.w(enumC1139br1, C3084vr0.L(enumC1139br1)), this.q)) {
                    C3084vr0.a(c1041ar1);
                }
            }
        } catch (Throwable th) {
            C3084vr0 c3084vr2 = C3084vr0.a;
            if (!C3084vr0.s() || this.r != C3084vr0.D) {
                return c2985uq0;
            }
            C1041ar0 c1041ar2 = this.s;
            if (c1041ar2 == null) {
                c1041ar0 = null;
            } else {
                if (c1041ar2.f <= System.currentTimeMillis() + 90000) {
                    c1041ar2 = null;
                }
                if (c1041ar2 != null) {
                    try {
                        objK = C3084vr0.N(c1041ar2, null);
                    } catch (Throwable th2) {
                        objK = Jp0.k(th2);
                    }
                    if (objK instanceof C2439p80) {
                        objK = null;
                    }
                    c1041ar0 = (C1041ar0) objK;
                } else {
                    c1041ar0 = null;
                }
            }
            if (c1041ar0 != null) {
                C3084vr0.a(c1041ar0);
                return c2985uq0;
            }
            C3084vr0 c3084vr3 = C3084vr0.a;
            C3084vr0.p = null;
            C3084vr0 c3084vr4 = C3084vr0.a;
            C3084vr0.d(null);
            EnumC1139br0 enumC1139br2 = this.p;
            if (th instanceof Yq0) {
                int i2 = th.l;
                if (i2 == 401) {
                    strD0 = "La identidad guardada fue rechazada";
                } else if (i2 == 407) {
                    strD0 = "El proxy rechazo las credenciales";
                } else if (i2 != 429) {
                    strD0 = enumC1139br2.m + " respondió HTTP " + i2;
                } else {
                    strD0 = AbstractC1701hf0.d(enumC1139br2.m, " limitó temporalmente las solicitudes");
                }
            } else {
                String message = th.getMessage();
                strD0 = message != null ? AbstractC1119bh0.D0(120, message) : AbstractC1701hf0.t("No se pudo conectar con ", enumC1139br2.m);
            }
            C3084vr0.E.f(new C1725hr0(strD0));
            Object obj2 = C3084vr0.B;
            synchronized (obj2) {
                obj2.notifyAll();
                String str2 = this.p.m;
            }
        }
        return c2985uq0;
    }
}
