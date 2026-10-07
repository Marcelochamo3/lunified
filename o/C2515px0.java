package o;

/* JADX INFO: renamed from: o.px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2515px0 extends Ph0 implements InterfaceC0775Sy {
    public Jb0 m;
    public C1639gx0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f983o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Jb0 q;
    public final /* synthetic */ C1639gx0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2515px0(Jb0 jb0, C1639gx0 c1639gx0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = jb0;
        this.r = c1639gx0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2515px0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2515px0 c2515px0 = new C2515px0(this.q, this.r, interfaceC0473Hh);
        c2515px0.p = obj;
        return c2515px0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C1639gx0 c1639gx0;
        Jb0 jb0;
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f983o;
        if (i == 0) {
            Jp0.O(obj);
            this.p = (InterfaceC1608gi) this.p;
            Jb0 jb1 = this.q;
            this.m = jb1;
            C1639gx0 c1639gx1 = this.r;
            this.n = c1639gx1;
            this.f983o = 1;
            Mb0 mb0 = (Mb0) jb1;
            if (mb0.a(this) == enumC1706hi) {
                return enumC1706hi;
            }
            c1639gx0 = c1639gx1;
            jb0 = mb0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1639gx0 = this.n;
            jb0 = this.m;
            Jp0.O(obj);
        }
        try {
            try {
                objK = Lx0.K(c1639gx0);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (objK instanceof C2439p80) {
                objK = null;
            }
            return (C0882Xb) objK;
        } finally {
            ((Mb0) jb0).c();
        }
    }
}
