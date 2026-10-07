package o;

/* JADX INFO: renamed from: o.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1650h3 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f806o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1650h3(int i, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        super(1, interfaceC0473Hh);
        this.m = i2;
        this.f806o = i;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj;
        switch (this.m) {
            case 0:
                return new C1650h3(this.f806o, interfaceC0473Hh, 0).r(C2985uq0.a);
            default:
                return new C1650h3(this.f806o, interfaceC0473Hh, 1).r(C2985uq0.a);
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
                    obj = interfaceC1356e3.c(this.f806o, this);
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
                    InterfaceC1356e3 interfaceC1356e4 = (InterfaceC1356e3) C2525q3.d.getValue();
                    this.n = 1;
                    obj = interfaceC1356e4.c(this.f806o, this);
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
