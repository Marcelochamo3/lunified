package o;

import android.content.Context;

/* JADX INFO: renamed from: o.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2253nF extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f933o;
    public final /* synthetic */ C1767iF p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2253nF(Context context, C1767iF c1767iF, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.f933o = context;
        this.p = c1767iF;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj;
        switch (this.m) {
            case 0:
                return new C2253nF(this.f933o, this.p, interfaceC0473Hh, 0).r(C2985uq0.a);
            default:
                return new C2253nF(this.f933o, this.p, interfaceC0473Hh, 1).r(C2985uq0.a);
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
                    C2834tF c2834tF = C2834tF.a;
                    OV ov = (OV) C2834tF.e.getValue();
                    this.n = 1;
                    obj = c2834tF.e(this.f933o, this, this.p, ov);
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
                EnumC1706hi enumC1706hi2 = EnumC1706hi.l;
                int i2 = this.n;
                if (i2 == 0) {
                    Jp0.O(obj);
                    C2834tF c2834tF2 = C2834tF.a;
                    OV ovA = C2834tF.a(true, true);
                    this.n = 1;
                    obj = c2834tF2.e(this.f933o, this, this.p, ovA);
                    if (obj == enumC1706hi2) {
                        return enumC1706hi2;
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
