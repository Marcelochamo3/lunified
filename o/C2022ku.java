package o;

/* JADX INFO: renamed from: o.ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2022ku implements InterfaceC1538fw {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C2022ku(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    @Override // o.InterfaceC1538fw
    public final Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2221mw c2221mw;
        C2022ku c2022ku;
        switch (this.l) {
            case 0:
                InterfaceC1538fw[] interfaceC1538fwArr = (InterfaceC1538fw[]) this.m;
                Object objF = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, new C1826iu(interfaceC1538fwArr, 0), new C1924ju((InterfaceC0473Hh) null, (C2314nu) this.n, 0), interfaceC1538fwArr);
                return objF == EnumC1706hi.l ? objF : C2985uq0.a;
            case 1:
                if (interfaceC0473Hh instanceof C2221mw) {
                    c2221mw = (C2221mw) interfaceC0473Hh;
                    int i = c2221mw.m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c2221mw.m = i - Integer.MIN_VALUE;
                    } else {
                        c2221mw = new C2221mw(this, interfaceC0473Hh);
                    }
                } else {
                    c2221mw = new C2221mw(this, interfaceC0473Hh);
                }
                Object objH = c2221mw.l;
                Object obj = EnumC1706hi.l;
                int i2 = c2221mw.m;
                if (i2 != 0) {
                    if (i2 == 1) {
                        interfaceC1734hw = c2221mw.p;
                        c2022ku = c2221mw.f926o;
                        Jp0.O(objH);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jp0.O(objH);
                    }
                    return C2985uq0.a;
                }
                Jp0.O(objH);
                c2221mw.f926o = this;
                c2221mw.p = interfaceC1734hw;
                c2221mw.m = 1;
                objH = Nr0.h((InterfaceC1538fw) this.m, interfaceC1734hw, c2221mw);
                if (objH == obj) {
                    return obj;
                }
                c2022ku = this;
                Throwable th = (Throwable) objH;
                if (th != null) {
                    InterfaceC0827Uy interfaceC0827Uy = (InterfaceC0827Uy) c2022ku.n;
                    c2221mw.f926o = null;
                    c2221mw.p = null;
                    c2221mw.m = 2;
                    if (interfaceC0827Uy.f(interfaceC1734hw, th, c2221mw) == obj) {
                        return obj;
                    }
                }
                return C2985uq0.a;
            case 2:
                Object objF2 = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, C2428p3.E, new C1924ju((InterfaceC0473Hh) null, (InterfaceC0853Vy) this.n, 1), (InterfaceC1538fw[]) this.m);
                return objF2 == EnumC1706hi.l ? objF2 : C2985uq0.a;
            case 3:
                Object objF3 = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, C2428p3.E, new C1924ju((InterfaceC0473Hh) null, this.n, 2), (InterfaceC1538fw[]) this.m);
                return objF3 == EnumC1706hi.l ? objF3 : C2985uq0.a;
            case 4:
                Object objF4 = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, C2428p3.E, new C1924ju((InterfaceC0473Hh) null, this.n, 3), (InterfaceC1538fw[]) this.m);
                return objF4 == EnumC1706hi.l ? objF4 : C2985uq0.a;
            case 5:
                InterfaceC1538fw[] interfaceC1538fwArr2 = (InterfaceC1538fw[]) this.m;
                Object objF5 = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, new C1826iu(interfaceC1538fwArr2, 1), new C1924ju((InterfaceC0473Hh) null, (IB) this.n, 5), interfaceC1538fwArr2);
                return objF5 == EnumC1706hi.l ? objF5 : C2985uq0.a;
            default:
                InterfaceC1538fw[] interfaceC1538fwArr3 = (InterfaceC1538fw[]) this.m;
                Object objF6 = AbstractC1370eA.f(interfaceC0473Hh, interfaceC1734hw, new C1826iu(interfaceC1538fwArr3, 2), new C1924ju((InterfaceC0473Hh) null, (RC) this.n, 6), interfaceC1538fwArr3);
                return objF6 == EnumC1706hi.l ? objF6 : C2985uq0.a;
        }
    }
}
