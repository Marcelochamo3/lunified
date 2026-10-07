package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0720Qv extends Ph0 implements InterfaceC0775Sy {
    public int m;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0720Qv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0720Qv(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objA;
        String strZ;
        Cd0 cd0A;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                InterfaceC0305Av interfaceC0305Av = C0954Zv.d;
                this.m = 1;
                objA = interfaceC0305Av.a("https://flixlatam.com", "https://flixlatam.com", this);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                objA = obj;
            }
            ArrayList arrayList = new ArrayList();
            C3370yp c3370ypW = ((C0660On) objA).W("#contenedor .module .items");
            AbstractC1474fG.g(c3370ypW);
            int i2 = 0;
            for (Object obj2 : c3370ypW) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                C3176wp c3176wp = (C3176wp) obj2;
                C3176wp c3176wpX = c3176wp.X("header h1, header h2");
                if (c3176wpX != null && (strZ = c3176wpX.Z()) != null) {
                    C0954Zv c0954Zv = C0954Zv.b;
                    String strU = C0954Zv.u(strZ);
                    if (strU != null) {
                        C3370yp c3370ypW2 = c3176wp.W("article.item");
                        AbstractC1474fG.i(c3370ypW2, "select(...)");
                        ArrayList<Cd0> arrayListA = C0954Zv.A(c3370ypW2);
                        if (arrayListA.isEmpty()) {
                            continue;
                        } else {
                            if (i2 == 0) {
                                ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayListA, 10));
                                for (Cd0 cd0 : arrayListA) {
                                    C0954Zv c0954Zv2 = C0954Zv.b;
                                    if (cd0 instanceof C1387eR) {
                                        C1387eR c1387eR = (C1387eR) cd0;
                                        String str = c1387eR.i;
                                        if (str == null) {
                                            str = c1387eR.h;
                                        }
                                        cd0A = C1387eR.f(c1387eR, str, null, 32255);
                                    } else {
                                        if (!(cd0 instanceof C2109lo0)) {
                                            throw new C0730Rf();
                                        }
                                        C2109lo0 c2109lo0 = (C2109lo0) cd0;
                                        String str2 = c2109lo0.i;
                                        if (str2 == null) {
                                            str2 = c2109lo0.h;
                                        }
                                        cd0A = C2109lo0.a(c2109lo0, null, null, null, str2, null, null, 65023);
                                    }
                                    arrayList2.add(cd0A);
                                }
                                arrayList.add(new C0882Xb("Featured", arrayList2));
                            }
                            arrayList.add(new C0882Xb(strU, arrayListA));
                        }
                    }
                }
                i2 = i3;
            }
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return C1233cq.l;
        }
    }
}
