package o;

/* JADX INFO: loaded from: classes.dex */
public final class HI extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ds0 f299o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HI(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f299o = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((HI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new HI(this.f299o, interfaceC0473Hh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String strX0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        String str = this.n;
        try {
            if (str != 0) {
                if (str == 1) {
                    Jp0.O(obj);
                    return (Js0) obj;
                }
                if (str == 2) {
                    String str2 = this.m;
                    Jp0.O(obj);
                    str = str2;
                    str = strX0;
                    return (Js0) obj;
                }
                if (str == 3) {
                    Jp0.O(obj);
                    return (Js0) obj;
                }
                if (str != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                return (Js0) obj;
            }
            Jp0.O(obj);
            Ds0 ds0 = this.f299o;
            String str3 = ds0.l;
            String strB0 = AbstractC1119bh0.W(str3, "::", false) ? AbstractC1119bh0.B0(str3, "::") : "";
            JI ji = JI.b;
            boolean zW = AbstractC1119bh0.W(str3, "::", false);
            strX0 = str3;
            if (zW) {
                strX0 = AbstractC1119bh0.x0(str3, "::", str3);
            }
            if (AbstractC1474fG.b(strB0, "wish")) {
                Mg0 mg0 = new Mg0();
                this.n = 1;
                obj = Mg0.h(mg0, strX0, this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
                return (Js0) obj;
            }
            if (!AbstractC1474fG.b(strB0, "lion")) {
                int i = AbstractC3473zs.a;
                this.n = 4;
                obj = C0622Nb.m(strX0, ds0, this, 4);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
                return (Js0) obj;
            }
            LB lb = new LB(3);
            this.m = strX0;
            this.n = 2;
            obj = lb.a(strX0, this);
            if (obj == enumC1706hi) {
                str = strX0;
                return enumC1706hi;
            }
            str = strX0;
            return (Js0) obj;
        } catch (Exception e) {
            e.getMessage();
            C1340dv c1340dv = new C1340dv();
            this.m = null;
            this.n = 3;
            obj = C1340dv.f(c1340dv, str, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
