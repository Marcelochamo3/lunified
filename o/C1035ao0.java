package o;

/* JADX INFO: renamed from: o.ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1035ao0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f681o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1035ao0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f681o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1035ao0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1035ao0 c1035ao0 = new C1035ao0(this.f681o, interfaceC0473Hh);
        c1035ao0.n = obj;
        return c1035ao0;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC1323dm interfaceC1323dm;
        Object obj2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                interfaceC1323dm = (InterfaceC1323dm) this.n;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.n;
                Jp0.O(obj);
            }
            return new C1101bX(obj2, obj);
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
        String str = this.f681o;
        C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new Yn0(str, null), 3);
        C1420em c1420emC2 = AbstractC1376eG.c(interfaceC1608gi, null, 0, new Zn0(str, null), 3);
        this.n = c1420emC2;
        this.m = 1;
        Object objY = c1420emC.y(this);
        if (objY == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC1323dm = c1420emC2;
        obj = objY;
        this.n = obj;
        this.m = 2;
        Object objK = interfaceC1323dm.K(this);
        if (objK == enumC1706hi) {
            return enumC1706hi;
        }
        obj2 = obj;
        obj = objK;
        return new C1101bX(obj2, obj);
    }
}
