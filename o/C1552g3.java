package o;

/* JADX INFO: renamed from: o.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1552g3 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f790o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1552g3(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.f790o = str;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj;
        switch (this.m) {
            case 0:
                return new C1552g3(this.f790o, 0, interfaceC0473Hh).r(C2985uq0.a);
            case 1:
                return new C1552g3(this.f790o, 1, interfaceC0473Hh).r(C2985uq0.a);
            case 2:
                return new C1552g3(this.f790o, 2, interfaceC0473Hh).r(C2985uq0.a);
            default:
                return new C1552g3(this.f790o, 3, interfaceC0473Hh).r(C2985uq0.a);
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
                    InterfaceC1356e3 interfaceC1356e3 = C2525q3.c;
                    this.n = 1;
                    obj = interfaceC1356e3.b(this.f790o, this);
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
            case 1:
                EnumC1706hi enumC1706hi2 = EnumC1706hi.l;
                int i2 = this.n;
                if (i2 == 0) {
                    Jp0.O(obj);
                    InterfaceC1356e3 interfaceC1356e4 = (InterfaceC1356e3) C2525q3.d.getValue();
                    this.n = 1;
                    obj = interfaceC1356e4.b(this.f790o, this);
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
            case 2:
                EnumC1706hi enumC1706hi3 = EnumC1706hi.l;
                int i3 = this.n;
                if (i3 == 0) {
                    Jp0.O(obj);
                    RX rx = C1590gY.c;
                    this.n = 1;
                    obj = rx.a(this.f790o, this);
                    if (obj == enumC1706hi3) {
                        return enumC1706hi3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return obj;
            default:
                EnumC1706hi enumC1706hi4 = EnumC1706hi.l;
                int i4 = this.n;
                if (i4 == 0) {
                    Jp0.O(obj);
                    RX rx2 = (RX) C1590gY.d.getValue();
                    this.n = 1;
                    obj = rx2.a(this.f790o, this);
                    if (obj == enumC1706hi4) {
                        return enumC1706hi4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return obj;
        }
    }
}
