package o;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: o.jN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1871jN extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2067lN n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f843o;
    public final /* synthetic */ C1767iF p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871jN(C2067lN c2067lN, Context context, C1767iF c1767iF, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2067lN;
        this.f843o = context;
        this.p = c1767iF;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1871jN) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1871jN(this.n, this.f843o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C2067lN c2067lN = this.n;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c2067lN.b;
                    C1579gN c1579gN = new C1579gN((File) obj);
                    this.m = 3;
                    c2771sg0.l(c1579gN, this);
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
            C1188cN c1188cN = C1188cN.a;
            this.m = 1;
            c2771sg1.l(c1188cN, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            C2834tF c2834tF = C2834tF.a;
            Context context = this.f843o;
            C1767iF c1767iF = this.p;
            this.m = 2;
            obj = c2834tF.f(context, c1767iF, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            C2771sg0 c2771sg2 = c2067lN.b;
            C1579gN c1579gN2 = new C1579gN((File) obj);
            this.m = 3;
            c2771sg2.l(c1579gN2, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            return c2985uq0;
        } catch (Exception e) {
            C2771sg0 c2771sg3 = c2067lN.b;
            C1286dN c1286dN = new C1286dN(e);
            this.m = 4;
            c2771sg3.l(c1286dN, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
