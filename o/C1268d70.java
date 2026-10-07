package o;

/* JADX INFO: renamed from: o.d70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1268d70 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1478fK f733o;
    public final /* synthetic */ TJ p;
    public final /* synthetic */ InterfaceC0775Sy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268d70(C1478fK c1478fK, TJ tj, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f733o = c1478fK;
        this.p = tj;
        this.q = interfaceC0775Sy;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1268d70) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1268d70 c1268d70 = new C1268d70(this.f733o, this.p, this.q, interfaceC0473Hh);
        c1268d70.n = obj;
        return c1268d70;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            C3362yl c3362yl = AbstractC1910jn.a;
            C1079bB c1079bB = ((C1079bB) FM.a).q;
            C1170c70 c1170c70 = new C1170c70(this.f733o, this.p, interfaceC1608gi, this.q, null);
            this.m = 1;
            if (AbstractC1376eG.J(c1079bB, c1170c70, this) == enumC1706hi) {
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
