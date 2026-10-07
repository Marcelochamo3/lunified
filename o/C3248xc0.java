package o;

import android.content.Context;

/* JADX INFO: renamed from: o.xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3248xc0 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1119o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ InterfaceC1608gi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3248xc0(String str, String str2, Context context, InterfaceC1608gi interfaceC1608gi, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.f1119o = str;
        this.p = str2;
        this.q = context;
        this.r = interfaceC1608gi;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                Context context = this.q;
                InterfaceC1608gi interfaceC1608gi = this.r;
                return new C3248xc0(this.f1119o, this.p, context, interfaceC1608gi, (InterfaceC0473Hh) obj, 0).r(C2985uq0.a);
            default:
                Context context2 = this.q;
                InterfaceC1608gi interfaceC1608gi2 = this.r;
                return new C3248xc0(this.f1119o, this.p, context2, interfaceC1608gi2, (InterfaceC0473Hh) obj, 1).r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        switch (this.m) {
            case 0:
                int i = this.n;
                if (i == 0) {
                    Jp0.O(obj);
                    C1791ib0 c1791ib0 = C1791ib0.a;
                    OV ovD = C1791ib0.d(false);
                    this.n = 1;
                    obj = C3442zc0.w(this.f1119o, this.p, this.q, this.r, ovD, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return obj;
            default:
                int i2 = this.n;
                if (i2 == 0) {
                    Jp0.O(obj);
                    OV ovC = C1791ib0.a.c();
                    this.n = 1;
                    obj = C3442zc0.w(this.f1119o, this.p, this.q, this.r, ovC, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return obj;
        }
    }
}
