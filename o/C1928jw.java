package o;

/* JADX INFO: renamed from: o.jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1928jw extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ InterfaceC1538fw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2622r30 f857o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1928jw(InterfaceC1538fw interfaceC1538fw, InterfaceC2622r30 interfaceC2622r30, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = interfaceC1538fw;
        this.f857o = interfaceC2622r30;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1928jw) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1928jw(this.n, this.f857o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            C1632gu c1632gu = new C1632gu(1, this.f857o);
            this.m = 1;
            if (this.n.a(c1632gu, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
