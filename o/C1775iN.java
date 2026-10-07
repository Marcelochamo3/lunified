package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.iN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1775iN extends Ph0 implements InterfaceC0775Sy {
    public C2771sg0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2067lN f829o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775iN(C2067lN c2067lN, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f829o = c2067lN;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1775iN) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1775iN(this.f829o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) {
        C2771sg0 c2771sg0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C2067lN c2067lN = this.f829o;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    c2771sg0 = this.m;
                    Jp0.O(obj);
                    C1481fN c1481fN = new C1481fN((C1767iF) obj);
                    this.m = null;
                    this.n = 3;
                    c2771sg0.l(c1481fN, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return c2985uq0;
            }
            Jp0.O(obj);
            C2771sg0 c2771sg1 = c2067lN.b;
            C1091bN c1091bN = C1091bN.a;
            this.n = 1;
            c2771sg1.l(c1091bN, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            c2771sg0 = c2067lN.b;
            C2834tF c2834tF = C2834tF.a;
            this.m = c2771sg0;
            this.n = 2;
            obj = c2834tF.i(this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            C1481fN c1481fN2 = new C1481fN((C1767iF) obj);
            this.m = null;
            this.n = 3;
            c2771sg0.l(c1481fN2, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            return c2985uq0;
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                C2771sg0 c2771sg2 = c2067lN.b;
                C1286dN c1286dN = new C1286dN(e);
                this.m = null;
                this.n = 4;
                c2771sg2.l(c1286dN, this);
                if (c2985uq0 == enumC1706hi) {
                    return enumC1706hi;
                }
            }
        }
    }
}
