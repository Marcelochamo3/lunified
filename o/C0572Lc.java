package o;

/* JADX INFO: renamed from: o.Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572Lc extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C0675Pc n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1734hw f384o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0572Lc(C0675Pc c0675Pc, InterfaceC1734hw interfaceC1734hw, Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c0675Pc;
        this.f384o = interfaceC1734hw;
        this.p = obj;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0572Lc) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0572Lc(this.n, this.f384o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC0827Uy interfaceC0827Uy = this.n.p;
            this.m = 1;
            if (interfaceC0827Uy.f(this.f384o, this.p, this) == enumC1706hi) {
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
