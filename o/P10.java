package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class P10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Z10 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3336yW f446o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P10(Z10 z10, C3336yW c3336yW, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = z10;
        this.f446o = c3336yW;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((P10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new P10(this.n, this.f446o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        I9 i9;
        K10 k10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C3336yW c3336yW = this.f446o;
        Z10 z10 = this.n;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    Jp0.O(obj);
                    i9 = z10.e;
                    k10 = new K10(c3336yW, (Uri) obj);
                    this.m = 3;
                    if (i9.e(k10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            }
            Jp0.O(obj);
            I9 i10 = z10.e;
            C10 c10 = C10.a;
            this.m = 1;
            if (i10.e(c10, this) == enumC1706hi) {
                return enumC1706hi;
            }
            Rh0 rh0 = AW.a;
            this.m = 2;
            obj = AbstractC1376eG.J(AbstractC1910jn.b, new C3433zW(c3336yW, null), this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            i9 = z10.e;
            k10 = new K10(c3336yW, (Uri) obj);
            this.m = 3;
            if (i9.e(k10, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } catch (Exception e) {
            I9 i11 = z10.e;
            D10 d10 = new D10(e, c3336yW);
            this.m = 4;
            if (i11.e(d10, this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
        return C2985uq0.a;
    }
}
