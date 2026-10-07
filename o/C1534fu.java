package o;

/* JADX INFO: renamed from: o.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1534fu extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ InterfaceC1734hw f785o;
    public /* synthetic */ Throwable p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1534fu(int i, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        super(i, interfaceC0473Hh);
        this.m = i2;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) obj;
        Throwable th = (Throwable) obj2;
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj3;
        switch (this.m) {
            case 0:
                C1534fu c1534fu = new C1534fu(3, interfaceC0473Hh, 0);
                c1534fu.f785o = interfaceC1734hw;
                c1534fu.p = th;
                return c1534fu.r(C2985uq0.a);
            default:
                C1534fu c1534fu2 = new C1534fu(3, interfaceC0473Hh, 1);
                c1534fu2.f785o = interfaceC1734hw;
                c1534fu2.p = th;
                return c1534fu2.r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) {
        switch (this.m) {
            case 0:
                EnumC1706hi enumC1706hi = EnumC1706hi.l;
                int i = this.n;
                if (i == 0) {
                    Jp0.O(obj);
                    InterfaceC1734hw interfaceC1734hw = this.f785o;
                    C1144bu c1144bu = new C1144bu(this.p);
                    this.f785o = null;
                    this.n = 1;
                    if (interfaceC1734hw.l(c1144bu, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            default:
                EnumC1706hi enumC1706hi2 = EnumC1706hi.l;
                int i2 = this.n;
                if (i2 == 0) {
                    Jp0.O(obj);
                    InterfaceC1734hw interfaceC1734hw2 = this.f785o;
                    BB bb = new BB(this.p);
                    this.f785o = null;
                    this.n = 1;
                    if (interfaceC1734hw2.l(bb, this) == enumC1706hi2) {
                        return enumC1706hi2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
        }
    }
}
