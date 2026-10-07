package o;

/* JADX INFO: loaded from: classes.dex */
public final class SI extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f509o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SI(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f509o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((SI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new SI(this.n, this.f509o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            ZI zi = ZI.b;
            this.m = 1;
            obj = zi.h(this.n, 1, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        C2420oz c2420oz = (C2420oz) obj;
        if (!c2420oz.c.isEmpty()) {
            return new C0882Xb(this.f509o, c2420oz.c);
        }
        return null;
    }
}
