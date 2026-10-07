package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.lH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2061lH extends Ph0 implements InterfaceC0775Sy {
    public Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f893o;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2061lH) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2061lH c2061lH = new C2061lH(2, interfaceC0473Hh);
        c2061lH.f893o = obj;
        return c2061lH;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0303  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objY;
        InterfaceC1323dm interfaceC1323dm;
        List list;
        Object objK;
        C2933uH c2933uH;
        String strD;
        C2109lo0 c2109lo0;
        String strZ;
        Object next;
        Cd0 c1387eR;
        String strZ2;
        String strZ3;
        String strZ4;
        List listS0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.m;
                InterfaceC1323dm interfaceC1323dm2 = (InterfaceC1323dm) this.f893o;
                Jp0.O(obj);
                interfaceC1323dm = interfaceC1323dm2;
                objY = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2933uH = (C2933uH) this.m;
                list = (List) this.f893o;
                Jp0.O(obj);
                objK = obj;
            }
            C2933uH c2933uH2 = C2933uH.b;
            c2933uH.getClass();
            listS0 = AbstractC0911Ye.s0(20, C2933uH.v((C0660On) objK));
            if (!listS0.isEmpty()) {
                list.add(new C0882Xb("Animes agregados", listS0));
            }
            return list;
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.f893o;
        C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C1865jH(2, null), 3);
        C1420em c1420emC2 = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C1963kH(2, null), 3);
        ArrayList arrayList = new ArrayList();
        this.f893o = c1420emC2;
        this.m = arrayList;
        this.n = 1;
        objY = c1420emC.y(this);
        if (objY == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC1323dm = c1420emC2;
        list = arrayList;
        C0660On c0660On = (C0660On) objY;
        C3370yp c3370ypW = c0660On.W(".hero__items");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c3370ypW.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3176wp c3176wp = (C3176wp) it.next();
            C3370yp c3370ypW2 = c3176wp.W("a.slider-show[href]");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            Iterator it2 = c3370ypW2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                strZ4 = ((C3176wp) next).Z();
                AbstractC1474fG.i(strZ4, "text(...)");
            } while (!AbstractC1119bh0.W(strZ4, "Detalles", true));
            C3176wp c3176wp2 = (C3176wp) next;
            if (c3176wp2 == null) {
                c1387eR = null;
            } else {
                C2933uH c2933uH3 = C2933uH.b;
                String strB = c3176wp2.b("href");
                AbstractC1474fG.i(strB, "absUrl(...)");
                String strY = C2933uH.y(strB);
                if (strY != null) {
                    C3176wp c3176wpX = c3176wp.X(".hero__text h2");
                    String string = (c3176wpX == null || (strZ3 = c3176wpX.Z()) == null) ? null : AbstractC1119bh0.E0(strZ3).toString();
                    String str = string == null ? "" : string;
                    if (AbstractC1899jh0.O(str)) {
                        c1387eR = null;
                    } else {
                        String strU = C2933uH.u(c3176wp.d("data-setbg"));
                        C3176wp c3176wpX2 = c3176wp.X(".hero__text p");
                        String string2 = (c3176wpX2 == null || (strZ2 = c3176wpX2.Z()) == null) ? null : AbstractC1119bh0.E0(strZ2).toString();
                        C3176wp c3176wpX3 = c3176wp.X(".ainfo");
                        String strZ5 = c3176wpX3 != null ? c3176wpX3.Z() : null;
                        c1387eR = C2933uH.s(strZ5 != null ? strZ5 : "") ? new C1387eR(strY, str, string2, null, null, null, null, null, strU, strU, null, null, null, null, null, 31992) : new C2109lo0(strY, str, string2, null, null, null, null, null, strU, strU, null, null, null, null, null, null, 64760);
                    }
                } else {
                    c1387eR = null;
                }
            }
            if (c1387eR != null) {
                arrayList2.add(c1387eR);
            }
        }
        C2933uH c2933uH4 = C2933uH.b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(C2933uH.x((Cd0) obj2))) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            list.add(new C0882Xb("Featured", arrayList3));
        }
        C3370yp<C3176wp> c3370ypW3 = c0660On.W(".dir1 .card");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        ArrayList arrayList4 = new ArrayList();
        for (C3176wp c3176wp3 : c3370ypW3) {
            C3176wp c3176wpX4 = c3176wp3.X("a[href]");
            if (c3176wpX4 == null) {
                c2109lo0 = null;
            } else {
                C2933uH c2933uH5 = C2933uH.b;
                String strB2 = c3176wpX4.b("href");
                AbstractC1474fG.i(strB2, "absUrl(...)");
                List<String> pathSegments = Uri.parse(strB2).getPathSegments();
                if (pathSegments.size() >= 2) {
                    String str2 = pathSegments.get(1);
                    AbstractC1474fG.i(str2, "get(...)");
                    if (AbstractC1802ih0.J(str2) == null) {
                        pathSegments = null;
                    }
                } else {
                    pathSegments = null;
                }
                String str3 = pathSegments != null ? (String) AbstractC0911Ye.d0(pathSegments) : null;
                if (str3 != null) {
                    C3176wp c3176wpX5 = c3176wp3.X(".card-title");
                    String string3 = (c3176wpX5 == null || (strZ = c3176wpX5.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
                    String str4 = string3 == null ? "" : string3;
                    if (AbstractC1899jh0.O(str4)) {
                        c2109lo0 = null;
                    } else {
                        C3176wp c3176wpX6 = c3176wp3.X("img");
                        if (c3176wpX6 == null || (strD = c3176wpX6.d("data-animepic")) == null) {
                            strD = null;
                        } else if (AbstractC1899jh0.O(strD)) {
                            C3176wp c3176wpX7 = c3176wp3.X("img");
                            if (c3176wpX7 != null) {
                                strD = c3176wpX7.d("src");
                            } else {
                                strD = null;
                            }
                        }
                        c2109lo0 = new C2109lo0(str3, str4, null, null, null, null, null, null, C2933uH.u(strD), null, null, null, null, null, null, null, 65276);
                    }
                } else {
                    c2109lo0 = null;
                }
            }
            if (c2109lo0 != null) {
                arrayList4.add(c2109lo0);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (hashSet2.add(((C2109lo0) obj3).a)) {
                arrayList5.add(obj3);
            }
        }
        if (!arrayList5.isEmpty()) {
            list.add(new C0882Xb("Últimos episodios", arrayList5));
        }
        C2933uH c2933uH6 = C2933uH.b;
        this.f893o = list;
        this.m = c2933uH6;
        this.n = 2;
        objK = interfaceC1323dm.K(this);
        if (objK == enumC1706hi) {
            return enumC1706hi;
        }
        c2933uH = c2933uH6;
        C2933uH c2933uH7 = C2933uH.b;
        c2933uH.getClass();
        listS0 = AbstractC0911Ye.s0(20, C2933uH.v((C0660On) objK));
        if (!listS0.isEmpty()) {
            list.add(new C0882Xb("Animes agregados", listS0));
        }
        return list;
    }
}
