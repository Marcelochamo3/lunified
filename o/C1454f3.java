package o;

/* JADX INFO: renamed from: o.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1454f3 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f768o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1454f3(int i, int i2, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.m = i2;
        this.f768o = str;
        this.p = i;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) obj;
        switch (this.m) {
            case 0:
                return new C1454f3(this.p, 0, this.f768o, interfaceC0473Hh).r(C2985uq0.a);
            default:
                return new C1454f3(this.p, 1, this.f768o, interfaceC0473Hh).r(C2985uq0.a);
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
                    obj = interfaceC1356e3.d(this.f768o, this.p, this);
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
                    obj = interfaceC1356e4.d(this.f768o, this.p, this);
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
