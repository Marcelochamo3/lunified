package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.Gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0443Gd extends Ph0 implements InterfaceC0775Sy {
    public Object m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f283o;
    public /* synthetic */ Object p;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0443Gd) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0443Gd c0443Gd = new C0443Gd(2, interfaceC0473Hh);
        c0443Gd.p = obj;
        return c0443Gd;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0214  */
    /* JADX WARN: Code duplicated, block: B:81:0x0217  */
    /* JADX WARN: Code duplicated, block: B:84:0x022f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0230  */
    /* JADX WARN: Code duplicated, block: B:88:0x0235  */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objY;
        InterfaceC1323dm interfaceC1323dm;
        List list;
        InterfaceC1323dm interfaceC1323dm2;
        Object objK;
        InterfaceC1323dm interfaceC1323dm3;
        ?? c2109lo0;
        String strR;
        String strD;
        String strD2;
        C0660On c0660On;
        Object objK2;
        List list2;
        ArrayList arrayListU;
        C0660On c0660On2;
        ArrayList arrayListU2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f283o;
        boolean z = false;
        ArrayList arrayList = null;
        if (i != 0) {
            if (i == 1) {
                list = this.n;
                InterfaceC1323dm interfaceC1323dm4 = (InterfaceC1323dm) this.m;
                InterfaceC1323dm interfaceC1323dm5 = (InterfaceC1323dm) this.p;
                Jp0.O(obj);
                interfaceC1323dm2 = interfaceC1323dm5;
                interfaceC1323dm = interfaceC1323dm4;
                objY = obj;
            } else if (i == 2) {
                list = (List) this.m;
                interfaceC1323dm3 = (InterfaceC1323dm) this.p;
                Jp0.O(obj);
                objK = obj;
                c0660On = (C0660On) objK;
                if (c0660On != null) {
                    C0650Od c0650Od = C0650Od.b;
                    C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
                    AbstractC1474fG.i(c3370ypW, "select(...)");
                    arrayListU = C0650Od.u(c3370ypW);
                    if (!(!arrayListU.isEmpty())) {
                        arrayListU = null;
                    }
                    if (arrayListU != null) {
                        list.add(new C0882Xb("Acción", arrayListU));
                    }
                }
                this.p = list;
                arrayList = null;
                this.m = null;
                this.f283o = 3;
                objK2 = interfaceC1323dm3.K(this);
                if (objK2 == enumC1706hi) {
                    return enumC1706hi;
                }
                list2 = list;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.p;
                Jp0.O(obj);
                objK2 = obj;
            }
            c0660On2 = (C0660On) objK2;
            if (c0660On2 != null) {
                C0650Od c0650Od2 = C0650Od.b;
                C3370yp c3370ypW2 = c0660On2.W("article.item[id^=post-]");
                AbstractC1474fG.i(c3370ypW2, "select(...)");
                arrayListU2 = C0650Od.u(c3370ypW2);
                if (!arrayListU2.isEmpty()) {
                    arrayList = arrayListU2;
                }
                if (arrayList != null) {
                    list2.add(new C0882Xb("Comedia", arrayList));
                }
            }
            return list2;
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.p;
        C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C0417Fd(2, null), 3);
        C1420em c1420emC2 = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C0365Dd(2, null), 3);
        C1420em c1420emC3 = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C0391Ed(2, null), 3);
        ArrayList arrayList2 = new ArrayList();
        this.p = c1420emC2;
        this.m = c1420emC3;
        this.n = arrayList2;
        this.f283o = 1;
        objY = c1420emC.y(this);
        if (objY == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC1323dm = c1420emC3;
        list = arrayList2;
        interfaceC1323dm2 = c1420emC2;
        C0660On c0660On3 = (C0660On) objY;
        if (c0660On3 != null) {
            C3370yp c3370ypW3 = c0660On3.W("aside[id^=dtw_content_featured] li");
            AbstractC1474fG.i(c3370ypW3, "select(...)");
            C0650Od c0650Od3 = C0650Od.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = c3370ypW3.iterator();
            while (it.hasNext()) {
                C3176wp c3176wpX = ((C3176wp) it.next()).X("a[href]");
                if (c3176wpX != null && (strR = C0650Od.r(c3176wpX.d("href"))) != null) {
                    String strD3 = c3176wpX.d("title");
                    AbstractC1474fG.i(strD3, "attr(...)");
                    String string = AbstractC1119bh0.E0(strD3).toString();
                    if (AbstractC1899jh0.O(string)) {
                        C3176wp c3176wpX2 = c3176wpX.X("img");
                        if (c3176wpX2 == null || (strD2 = c3176wpX2.d("alt")) == null) {
                            c2109lo0 = z;
                            c2109lo0 = z;
                            c2109lo0 = z;
                            c2109lo0 = z;
                            string = null;
                        } else {
                            string = AbstractC1119bh0.E0(strD2).toString();
                        }
                        if (string == null) {
                            c2109lo0 = z;
                            c2109lo0 = z;
                            string = "";
                        }
                    }
                    c2109lo0 = z;
                    c2109lo0 = z;
                    c2109lo0 = z;
                    c2109lo0 = z;
                    String str = string;
                    if (AbstractC1899jh0.O(str)) {
                        c2109lo0 = 0;
                    } else {
                        C3176wp c3176wpX3 = c3176wpX.X("img");
                        String strR2 = C0650Od.r((c3176wpX3 == null || (strD = c3176wpX3.d("data-src")) == null) ? null : AbstractC1899jh0.O(strD) ? c3176wpX3.d("src") : strD);
                        if (AbstractC1119bh0.W(strR, "/ver-pelicula/", false)) {
                            c2109lo0 = new C1387eR(strR, str, null, null, null, null, null, null, strR2, strR2, null, null, null, null, null, 31996);
                        } else if (AbstractC1119bh0.W(strR, "/ver-serie/", false)) {
                            c2109lo0 = new C2109lo0(strR, str, null, null, null, null, null, null, strR2, strR2, null, null, null, null, null, null, 64764);
                        } else {
                            c2109lo0 = 0;
                        }
                    }
                }
                if (c2109lo0 != 0) {
                    arrayList3.add(c2109lo0);
                }
                z = false;
            }
            C0650Od c0650Od4 = C0650Od.b;
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (hashSet.add(C0650Od.v((Cd0) obj2))) {
                    arrayList4.add(obj2);
                }
            }
            if (!arrayList4.isEmpty()) {
                list.add(new C0882Xb("Featured", arrayList4));
            }
            C0650Od c0650Od5 = C0650Od.b;
            C3370yp c3370ypW4 = c0660On3.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW4, "select(...)");
            ArrayList arrayListU3 = C0650Od.u(c3370ypW4);
            if (!arrayListU3.isEmpty()) {
                list.add(new C0882Xb("Últimos estrenos", arrayListU3));
            }
        }
        this.p = interfaceC1323dm;
        this.m = list;
        this.n = null;
        this.f283o = 2;
        objK = interfaceC1323dm2.K(this);
        if (objK == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC1323dm3 = interfaceC1323dm;
        c0660On = (C0660On) objK;
        if (c0660On != null) {
            C0650Od c0650Od6 = C0650Od.b;
            C3370yp c3370ypW5 = c0660On.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW5, "select(...)");
            arrayListU = C0650Od.u(c3370ypW5);
            if (!(!arrayListU.isEmpty())) {
                arrayListU = null;
            }
            if (arrayListU != null) {
                list.add(new C0882Xb("Acción", arrayListU));
            }
        }
        this.p = list;
        arrayList = null;
        this.m = null;
        this.f283o = 3;
        objK2 = interfaceC1323dm3.K(this);
        if (objK2 == enumC1706hi) {
            return enumC1706hi;
        }
        list2 = list;
        c0660On2 = (C0660On) objK2;
        if (c0660On2 != null) {
            C0650Od c0650Od7 = C0650Od.b;
            C3370yp c3370ypW6 = c0660On2.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW6, "select(...)");
            arrayListU2 = C0650Od.u(c3370ypW6);
            if (!arrayListU2.isEmpty()) {
                arrayList = arrayListU2;
            }
            if (arrayList != null) {
                list2.add(new C0882Xb("Comedia", arrayList));
            }
        }
        return list2;
    }
}
