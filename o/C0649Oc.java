package o;

/* JADX INFO: renamed from: o.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0649Oc extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0675Pc f437o;
    public final /* synthetic */ InterfaceC1734hw p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649Oc(C0675Pc c0675Pc, InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f437o = c0675Pc;
        this.p = interfaceC1734hw;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0649Oc) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0649Oc c0649Oc = new C0649Oc(this.f437o, this.p, interfaceC0473Hh);
        c0649Oc.n = obj;
        return c0649Oc;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            IF r1 = new IF();
            C0675Pc c0675Pc = this.f437o;
            InterfaceC1538fw interfaceC1538fw = c0675Pc.f457o;
            C0623Nc c0623Nc = new C0623Nc(r1, interfaceC1608gi, c0675Pc, this.p);
            this.m = 1;
            if (interfaceC1538fw.a(c0623Nc, this) == enumC1706hi) {
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
