package o;

import org.json.JSONException;

/* JADX INFO: renamed from: o.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2640rF extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2640rF(int i, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        super(i, interfaceC0473Hh);
        this.m = i2;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj;
        switch (this.m) {
            case 0:
                return new C2640rF(1, interfaceC0473Hh, 0).r(C2985uq0.a);
            default:
                return new C2640rF(1, interfaceC0473Hh, 1).r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) throws JSONException, C0778Tb {
        switch (this.m) {
            case 0:
                EnumC1706hi enumC1706hi = EnumC1706hi.l;
                int i = this.n;
                if (i == 0) {
                    Jp0.O(obj);
                    C2834tF c2834tF = C2834tF.a;
                    OV ov = (OV) C2834tF.d.getValue();
                    this.n = 1;
                    obj = C2834tF.b(c2834tF, ov, this);
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
                    OV ovA = C2834tF.a(true, false);
                    this.n = 1;
                    obj = C2834tF.b(c2834tF2, ovA, this);
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
