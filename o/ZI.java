package o;

import com.skidush.clonex.models.Video$Type;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ZI implements Q30 {
    public static final ZI b = new ZI();
    public static final PI c;

    static {
        C0362Da c0362Da = new C0362Da(new File("cacheDir", "okhttpcache"));
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        X10 x12 = X10.q;
        AbstractC1406ef.S(arrayList, x12);
        X10 x13 = X10.r;
        AbstractC1406ef.S(arrayList2, x13);
        arrayList.add(x11);
        arrayList2.add(x11);
        nvO.k = c0362Da;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvO.i(30L, timeUnit);
        nvO.e(30L, timeUnit);
        nvO.h = true;
        OV ov = new OV(nvO);
        C1583gR c1583gR = new C1583gR(12);
        NV nvO2 = AbstractC1701hf0.o();
        ArrayList arrayList3 = nvO2.c;
        arrayList3.add(x9);
        ArrayList arrayList4 = nvO2.d;
        arrayList4.add(x10);
        AbstractC1406ef.S(arrayList3, x12);
        AbstractC1406ef.S(arrayList4, x13);
        arrayList3.add(x11);
        arrayList4.add(x11);
        c1583gR.m = new OV(nvO2);
        c1583gR.f("https://www.lacartoons.com");
        ((ArrayList) c1583gR.f793o).add(new P9(1));
        c1583gR.m = ov;
        c = (PI) c1583gR.m().b(PI.class);
    }

    public static ArrayList p(C0660On c0660On) {
        C3176wp c3176wpX;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = c0660On.W("div.conjuntos-series").iterator();
        while (it.hasNext()) {
            for (C3176wp c3176wp : ((C3176wp) it.next()).W("a[href^=/serie/], a[href*=/serie/]")) {
                String strD = c3176wp.d("href");
                AbstractC1474fG.g(strD);
                if (!AbstractC1899jh0.O(strD) && (c3176wpX = c3176wp.X("div.serie")) != null) {
                    C3176wp c3176wpX2 = c3176wpX.X("img");
                    String strD2 = c3176wpX2 != null ? c3176wpX2.d("src") : null;
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    C3176wp c3176wpX3 = c3176wpX.X("p.nombre-serie");
                    String strZ = c3176wpX3 != null ? c3176wpX3.Z() : null;
                    String str = strZ == null ? "" : strZ;
                    if (!AbstractC1899jh0.U(strD2, "http", false)) {
                        strD2 = "https://www.lacartoons.com".concat(strD2);
                    }
                    String str2 = strD2;
                    if (!AbstractC1899jh0.U(strD, "http", false)) {
                        strD = "https://www.lacartoons.com".concat(strD);
                    }
                    String str3 = strD;
                    AbstractC1474fG.g(str3);
                    arrayList.add(new C2109lo0(str3, str, null, null, null, null, null, null, str2, str2, null, null, null, null, null, null, 64764));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C2109lo0 c2109lo0 = (C2109lo0) obj;
            if ((!AbstractC1899jh0.O(c2109lo0.a)) && (!AbstractC1899jh0.O(c2109lo0.b))) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(((C2109lo0) obj2).a)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: Exception -> 0x00a3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a3, blocks: (B:16:0x0036, B:23:0x0050, B:24:0x0066, B:26:0x006c, B:29:0x007c, B:41:0x009e, B:33:0x0086, B:35:0x008e, B:39:0x0097, B:20:0x0043), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: Exception -> 0x00a3, TRY_ENTER, TryCatch #1 {Exception -> 0x00a3, blocks: (B:16:0x0036, B:23:0x0050, B:24:0x0066, B:26:0x006c, B:29:0x007c, B:41:0x009e, B:33:0x0086, B:35:0x008e, B:39:0x0097, B:20:0x0043), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: Exception -> 0x00a3, TryCatch #1 {Exception -> 0x00a3, blocks: (B:16:0x0036, B:23:0x0050, B:24:0x0066, B:26:0x006c, B:29:0x007c, B:41:0x009e, B:33:0x0086, B:35:0x008e, B:39:0x0097, B:20:0x0043), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: Exception -> 0x00a3, TryCatch #1 {Exception -> 0x00a3, blocks: (B:16:0x0036, B:23:0x0050, B:24:0x0066, B:26:0x006c, B:29:0x007c, B:41:0x009e, B:33:0x0086, B:35:0x008e, B:39:0x0097, B:20:0x0043), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: Exception -> 0x00a3, TryCatch #1 {Exception -> 0x00a3, blocks: (B:16:0x0036, B:23:0x0050, B:24:0x0066, B:26:0x006c, B:29:0x007c, B:41:0x009e, B:33:0x0086, B:35:0x008e, B:39:0x0097, B:20:0x0043), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        XI xi;
        ArrayList arrayList;
        C3176wp c3176wpX;
        String strD;
        C3176wp c3176wpX2;
        String strD2;
        C2420oz c2420oz;
        if (interfaceC0473Hh instanceof XI) {
            xi = (XI) interfaceC0473Hh;
            int i2 = xi.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xi.n = i2 - Integer.MIN_VALUE;
            } else {
                xi = new XI(this, interfaceC0473Hh);
            }
        } else {
            xi = new XI(this, interfaceC0473Hh);
        }
        Object objT = xi.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = xi.n;
        C1233cq c1233cq = C1233cq.l;
        try {
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jp0.O(objT);
                        return (List) objT;
                    }
                    Jp0.O(objT);
                    C3370yp<C3176wp> c3370ypW = ((C0660On) objT).W("ul.botontes-categorias li form");
                    AbstractC1474fG.i(c3370ypW, "select(...)");
                    arrayList = new ArrayList();
                    for (C3176wp c3176wp : c3370ypW) {
                        c3176wpX = c3176wp.X("input[name=Categoria_id]");
                        if (c3176wpX != null) {
                            strD = c3176wpX.d("value");
                        } else {
                            strD = null;
                        }
                        if (strD != null) {
                            c3176wpX2 = c3176wp.X("input[type=submit]");
                            if (c3176wpX2 != null) {
                                strD2 = c3176wpX2.d("value");
                            } else {
                                strD2 = null;
                            }
                            if (strD2 == null) {
                                c2420oz = null;
                            } else {
                                c2420oz = new C2420oz(strD, strD2, c1233cq);
                            }
                        } else {
                            c2420oz = null;
                        }
                        if (c2420oz != null) {
                            arrayList.add(c2420oz);
                        }
                    }
                    return arrayList;
                }
                Jp0.O(objT);
                if (!AbstractC1899jh0.O(str)) {
                    if (i > 1) {
                        return c1233cq;
                    }
                    YI yi = new YI(2, null);
                    xi.n = 2;
                    objT = Pu0.t(str, yi, xi);
                    if (objT == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return (List) objT;
                }
                PI pi = c;
                xi.n = 1;
                objT = pi.a("https://www.lacartoons.com", xi);
                if (objT == enumC1706hi) {
                    return enumC1706hi;
                }
                C3370yp<C3176wp> c3370ypW2 = ((C0660On) objT).W("ul.botontes-categorias li form");
                AbstractC1474fG.i(c3370ypW2, "select(...)");
                arrayList = new ArrayList();
                while (r8.hasNext()) {
                    c3176wpX = c3176wp.X("input[name=Categoria_id]");
                    if (c3176wpX != null) {
                        strD = c3176wpX.d("value");
                    } else {
                        strD = null;
                    }
                    if (strD != null) {
                        c3176wpX2 = c3176wp.X("input[type=submit]");
                        if (c3176wpX2 != null) {
                            strD2 = c3176wpX2.d("value");
                        } else {
                            strD2 = null;
                        }
                        if (strD2 == null) {
                            c2420oz = null;
                        } else {
                            c2420oz = new C2420oz(strD, strD2, c1233cq);
                        }
                    } else {
                        c2420oz = null;
                    }
                    if (c2420oz != null) {
                        arrayList.add(c2420oz);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return c1233cq;
            }
        } catch (Exception unused2) {
            return c1233cq;
        }
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("La Cartoons no ofrece películas, solo series");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        QI qi;
        ZI zi;
        C3370yp<C3176wp> c3370ypW;
        if (interfaceC0473Hh instanceof QI) {
            qi = (QI) interfaceC0473Hh;
            int i = qi.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi.p = i - Integer.MIN_VALUE;
            } else {
                qi = new QI(this, interfaceC0473Hh);
            }
        } else {
            qi = new QI(this, interfaceC0473Hh);
        }
        Object objA = qi.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = qi.p;
        if (i2 == 0) {
            Jp0.O(objA);
            qi.l = this;
            qi.m = str;
            qi.p = 1;
            objA = c.a(str, qi);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            zi = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = qi.m;
            zi = qi.l;
            Jp0.O(objA);
        }
        C0660On c0660On = (C0660On) objA;
        Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.z0(str, "?t="));
        ArrayList arrayList = new ArrayList();
        C3370yp c3370ypW2 = c0660On.W("section.contenedor-episodio-temporada div.episodio-panel");
        if (numJ != null && c3370ypW2.size() >= numJ.intValue()) {
            c3370ypW = ((C3176wp) c3370ypW2.get(numJ.intValue() - 1)).W("ul.listas-de-episodion li a");
        } else if (numJ != null) {
            c3370ypW = c0660On.W("ul.listas-de-episodion li a[href*=?t=" + numJ + "]");
        } else {
            c3370ypW = c0660On.W("ul.listas-de-episodion li a");
        }
        for (C3176wp c3176wp : c3370ypW) {
            String strD = c3176wp.d("href");
            AbstractC1474fG.g(strD);
            if (!AbstractC1899jh0.O(strD)) {
                String strZ = c3176wp.Z();
                AbstractC1474fG.i(strZ, "text(...)");
                String string = AbstractC1119bh0.E0(strZ).toString();
                zi.getClass();
                Integer numJ2 = AbstractC1802ih0.J(AbstractC1119bh0.E0(AbstractC1119bh0.B0(AbstractC1119bh0.x0(string, "Capitulo ", ""), "-")).toString());
                int iIntValue = numJ2 != null ? numJ2.intValue() : 0;
                if (!AbstractC1899jh0.U(strD, "http", false)) {
                    strD = "https://www.lacartoons.com".concat(strD);
                }
                String str3 = strD;
                AbstractC1474fG.g(str3);
                arrayList.add(new C0456Gq(str3, iIntValue, string, null, null, null, null, 120));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        WI wi;
        String str;
        ZI zi;
        if (interfaceC0473Hh instanceof WI) {
            wi = (WI) interfaceC0473Hh;
            int i2 = wi.f593o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wi.f593o = i2 - Integer.MIN_VALUE;
            } else {
                wi = new WI(this, interfaceC0473Hh);
            }
        } else {
            wi = new WI(this, interfaceC0473Hh);
        }
        Object objA = wi.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = wi.f593o;
        try {
            if (i3 == 0) {
                Jp0.O(objA);
                if (i <= 1) {
                    str = "https://www.lacartoons.com";
                } else {
                    str = "https://www.lacartoons.com/?page=" + i;
                }
                PI pi = c;
                wi.l = this;
                wi.f593o = 1;
                objA = pi.a(str, wi);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                zi = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zi = wi.l;
                Jp0.O(objA);
            }
            zi.getClass();
            return p((C0660On) objA);
        } catch (Exception unused) {
            return C1233cq.l;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        UI ui;
        if (interfaceC0473Hh instanceof UI) {
            ui = (UI) interfaceC0473Hh;
            int i = ui.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ui.n = i - Integer.MIN_VALUE;
            } else {
                ui = new UI(this, interfaceC0473Hh);
            }
        } else {
            ui = new UI(this, interfaceC0473Hh);
        }
        Object objA = ui.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = ui.n;
        if (i2 == 0) {
            Jp0.O(objA);
            if (!AbstractC1899jh0.U(str, "http", false)) {
                str = "https://www.lacartoons.com".concat(str);
            }
            ui.n = 1;
            objA = c.a(str, ui);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C3176wp c3176wpX = ((C0660On) objA).X("iframe[src]");
        Ds0 ds0 = null;
        String strD = c3176wpX != null ? c3176wpX.d("src") : null;
        String str2 = strD == null ? "" : strD;
        AbstractC1899jh0.U(str2, "http", false);
        if (!AbstractC1899jh0.O(str2)) {
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, str2);
                String string = c2349oE.b().d;
                AbstractC1474fG.j(string, "<this>");
                int iE0 = AbstractC1119bh0.e0(string, "www.", 0, false, 2);
                if (iE0 >= 0) {
                    string = AbstractC1119bh0.o0(string, iE0, 4 + iE0, "").toString();
                }
                String strB0 = AbstractC1119bh0.B0(string, ".");
                if (strB0.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = strB0.charAt(0);
                    sb.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC3021v9.C(cCharAt) : String.valueOf(cCharAt)));
                    String strSubstring = strB0.substring(1);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    strB0 = sb.toString();
                }
                ds0 = new Ds0(str2, strB0, str2, null, 56);
            } catch (Exception unused) {
            }
        }
        return ds0 != null ? AbstractC2506pt.A(ds0) : C1233cq.l;
    }

    @Override // o.Q30
    public final String f() {
        return "https://graphicmama.com/blog/wp-content/uploads/2016/10/Group-17.png";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new TI(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "INFANTILES";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        RI ri;
        ZI zi;
        String strD;
        Object next;
        String str2;
        ZI zi2;
        C3176wp c3176wpX;
        C3176wp c3176wpX2;
        if (interfaceC0473Hh instanceof RI) {
            ri = (RI) interfaceC0473Hh;
            int i2 = ri.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ri.r = i2 - Integer.MIN_VALUE;
            } else {
                ri = new RI(this, interfaceC0473Hh);
            }
        } else {
            ri = new RI(this, interfaceC0473Hh);
        }
        Object objA = ri.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = ri.r;
        PI pi = c;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = ri.f486o;
                    str = ri.m;
                    zi = ri.l;
                    Jp0.O(objA);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = ri.n;
                    String str4 = ri.m;
                    zi2 = ri.l;
                    try {
                        Jp0.O(objA);
                        strD = str3;
                        str = str4;
                    } catch (Exception unused) {
                        str = str4;
                        return new C2420oz(str, str, C1233cq.l);
                    }
                }
                zi2.getClass();
                return new C2420oz(str, strD, p((C0660On) objA));
            }
            Jp0.O(objA);
            ri.l = this;
            ri.m = str;
            ri.f486o = i;
            ri.r = 1;
            objA = pi.a("https://www.lacartoons.com", ri);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            zi = this;
            C3370yp c3370ypW = ((C0660On) objA).W("ul.botontes-categorias li form");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            Iterator it = c3370ypW.iterator();
            do {
                strD = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c3176wpX2 = ((C3176wp) next).X("input[name=Categoria_id]");
            } while (!AbstractC1474fG.b(c3176wpX2 != null ? c3176wpX2.d("value") : null, str));
            C3176wp c3176wp = (C3176wp) next;
            if (c3176wp != null && (c3176wpX = c3176wp.X("input[type=submit]")) != null) {
                strD = c3176wpX.d("value");
            }
            if (strD == null) {
                strD = str;
            }
            if (i <= 1) {
                str2 = "https://www.lacartoons.com/?Categoria_id=" + str;
            } else {
                str2 = "https://www.lacartoons.com/?Categoria_id=" + str + "&page=" + i;
            }
            ri.l = zi;
            ri.m = str;
            ri.n = strD;
            ri.r = 2;
            objA = pi.a(str2, ri);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            zi2 = zi;
            zi2.getClass();
            return new C2420oz(str, strD, p((C0660On) objA));
        } catch (Exception unused2) {
        }
    }

    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Este proveedor no contiene películas solo Series animadas.");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e A[PHI: r10
  0x008e: PHI (r10v14 java.lang.String) = (r10v7 java.lang.String), (r10v17 java.lang.String) binds: [B:50:0x00c0, B:35:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        VI vi;
        ZI zi;
        String string;
        String strZ;
        String str2;
        String strZ2;
        String strZ3;
        int iIntValue;
        String str3;
        Integer numJ;
        C3176wp c3176wpX;
        String strU;
        C3370yp c3370ypW;
        Object next;
        C3176wp c3176wpX2;
        String strZ4;
        String strU2;
        String strConcat = str;
        if (interfaceC0473Hh instanceof VI) {
            vi = (VI) interfaceC0473Hh;
            int i = vi.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi.p = i - Integer.MIN_VALUE;
            } else {
                vi = new VI(this, interfaceC0473Hh);
            }
        } else {
            vi = new VI(this, interfaceC0473Hh);
        }
        Object objA = vi.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = vi.p;
        if (i2 == 0) {
            Jp0.O(objA);
            if (!AbstractC1899jh0.U(strConcat, "http", false)) {
                strConcat = "https://www.lacartoons.com".concat(strConcat);
            }
            vi.l = this;
            vi.m = strConcat;
            vi.p = 1;
            objA = c.a(strConcat, vi);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            zi = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strConcat = vi.m;
            zi = vi.l;
            Jp0.O(objA);
        }
        String str4 = strConcat;
        C0660On c0660On = (C0660On) objA;
        C3176wp c3176wpX3 = c0660On.X("div.contenedor-informacion-serie img");
        String strD = c3176wpX3 != null ? c3176wpX3.d("src") : null;
        String string2 = "";
        if (strD == null) {
            strD = "";
        }
        C3176wp c3176wpX4 = c0660On.X("h2.subtitulo-serie-seccion");
        if (c3176wpX4 == null || (strU2 = c3176wpX4.U()) == null || (string = AbstractC1119bh0.E0(strU2).toString()) == null) {
            C3176wp c3176wpX5 = c0660On.X("p.nombre-serie");
            if (c3176wpX5 == null || (strZ2 = c3176wpX5.Z()) == null) {
                C3176wp c3176wpX6 = c0660On.X("h1,h2,h3");
                string = (c3176wpX6 == null || (strZ = c3176wpX6.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
                if (string != null) {
                    str2 = string;
                }
            } else {
                string2 = AbstractC1119bh0.E0(strZ2).toString();
            }
            str2 = string2;
        } else {
            str2 = string;
        }
        C3176wp c3176wpX7 = c0660On.X("div.informacion-serie-seccion");
        if (c3176wpX7 == null || (c3370ypW = c3176wpX7.W("p")) == null) {
            strZ3 = null;
        } else {
            Iterator it = c3370ypW.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strZ4 = ((C3176wp) next).Z();
                AbstractC1474fG.i(strZ4, "text(...)");
            } while (!AbstractC1899jh0.U(strZ4, "Reseña", false));
            C3176wp c3176wp = (C3176wp) next;
            if (c3176wp == null || (c3176wpX2 = c3176wp.X("span")) == null) {
                strZ3 = null;
            } else {
                strZ3 = c3176wpX2.Z();
            }
        }
        String string3 = (c3176wpX7 == null || (c3176wpX = c3176wpX7.X("span.valoracion1")) == null || (strU = c3176wpX.U()) == null) ? null : AbstractC1119bh0.E0(strU).toString();
        Double dI = string3 != null ? AbstractC1705hh0.I(string3) : null;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it2 = c0660On.W("section.contenedor-episodio-temporada h4.accordion").iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            String strZ5 = ((C3176wp) it2.next()).Z();
            AbstractC1474fG.i(strZ5, "text(...)");
            String string4 = AbstractC1119bh0.E0(strZ5).toString();
            Pattern patternCompile = Pattern.compile("Temporada\\s+(\\d+)");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            AbstractC1474fG.j(string4, "input");
            Matcher matcher = patternCompile.matcher(string4);
            AbstractC1474fG.i(matcher, "matcher(...)");
            JN jnA = AbstractC1370eA.a(matcher, 0, string4);
            if (jnA == null || (str3 = (String) AbstractC0911Ye.e0(1, jnA.a())) == null || (numJ = AbstractC1802ih0.J(str3)) == null) {
                i3++;
                iIntValue = i3;
            } else {
                iIntValue = numJ.intValue();
            }
            zi.getClass();
            arrayList.add(new Ma0(str4 + "?t=" + iIntValue, iIntValue, AbstractC1674hK.n(iIntValue, "Temporada "), null, null, null, 56));
        }
        if (arrayList.isEmpty()) {
            zi.getClass();
            arrayList.add(new Ma0(str4 + "?t=1", 1, "Temporada 1", null, null, null, 56));
        }
        if (!AbstractC1899jh0.U(strD, "http", false)) {
            strD = "https://www.lacartoons.com".concat(strD);
        }
        return new C2109lo0(str4, str2, strZ3, null, null, null, null, dI, strD, null, null, arrayList, null, null, null, null, 63096);
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Esta función no está disponible en La Cartoons");
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        int i = AbstractC3473zs.a;
        return C0622Nb.m(ds0.n, ds0, interfaceC0473Hh, 4);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }
}
