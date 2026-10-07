package o;

import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2409ot implements Q30 {
    public static final C2409ot b = new C2409ot();
    public static final BA c = new BA();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final ConcurrentHashMap g = new ConcurrentHashMap();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();

    public static Map A(C0821Us c0821Us) {
        Map map = c0821Us.f;
        return map.isEmpty() ? AbstractC3327yN.y(new C1101bX("sortByAsc", AbstractC2506pt.A("order"))) : map;
    }

    public static C1387eR C(C0613Ms c0613Ms, int i) {
        return b.B(c0613Ms, c0613Ms.h, (i & 4) != 0);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection] */
    public static final Object p(C2409ot c2409ot, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0847Vs c0847Vs;
        ArrayList arrayList;
        String strD;
        Iterator it;
        Collection arrayList2;
        Iterator it2;
        Iterable iterable;
        OH ohA;
        String strD2;
        Iterator it3;
        boolean z;
        TH thC;
        ?? A;
        TH thC2;
        OH ohA2;
        String strD3;
        String strZ;
        Set setB0;
        C0743Rs c0743Rs;
        OH ohA3;
        c2409ot.getClass();
        if (interfaceC0473Hh instanceof C0847Vs) {
            c0847Vs = (C0847Vs) interfaceC0473Hh;
            int i = c0847Vs.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0847Vs.n = i - Integer.MIN_VALUE;
            } else {
                c0847Vs = new C0847Vs(c2409ot, interfaceC0473Hh);
            }
        } else {
            c0847Vs = new C0847Vs(c2409ot, interfaceC0473Hh);
        }
        Object objJ = c0847Vs.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0847Vs.n;
        C0821Us c0821Us = null;
        if (i2 == 0) {
            Jp0.O(objJ);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u("https://watch.fanatiz.com/api/generic/cinematics?tag=fanatizProd");
            c0560Kq.d();
            C1951k70 c1951k70C = c0560Kq.c();
            c0847Vs.n = 1;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C0485Ht(c1951k70C, "cinematics", null), c0847Vs);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        String str = (String) objJ;
        AbstractC1474fG.j(str, "body");
        TH thF = U9.v(str).f();
        TH thC3 = AbstractC2506pt.c(thF, "data");
        if (thC3 != null) {
            thF = thC3;
        }
        TH thC4 = AbstractC2506pt.c(thF, "props");
        if (thC4 == null || (thC2 = AbstractC2506pt.c(thC4, "filters")) == null || (ohA2 = AbstractC2506pt.a(thC2, "items")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (QH qh : ohA2.l) {
                AbstractC1474fG.g(qh);
                TH thF2 = AbstractC2506pt.f(qh);
                if (thF2 == null || (strD3 = AbstractC2506pt.d(thF2, "path")) == null || (strZ = O9.z(thF2.i("name"))) == null) {
                    c0743Rs = null;
                } else {
                    TH thC5 = AbstractC2506pt.c(thF2, "geolocation");
                    if (thC5 == null || (ohA3 = AbstractC2506pt.a(thC5, "deny")) == null) {
                        setB0 = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = ohA3.l.iterator();
                        while (it4.hasNext()) {
                            String strG = AbstractC2506pt.G((QH) it4.next());
                            if (strG != null) {
                                arrayList3.add(strG);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            String upperCase = ((String) it5.next()).toUpperCase(Locale.ROOT);
                            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                            arrayList4.add(upperCase);
                        }
                        setB0 = AbstractC0911Ye.B0(arrayList4);
                    }
                    if (setB0 == null) {
                        setB0 = C1722hq.l;
                    }
                    c0743Rs = new C0743Rs(strD3, strZ, setB0);
                }
                if (c0743Rs != null) {
                    arrayList.add(c0743Rs);
                }
            }
        }
        C1233cq c1233cq = C1233cq.l;
        List list = arrayList;
        if (arrayList == null) {
            list = c1233cq;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TH thC6 = AbstractC2506pt.c(thF, "scenes");
        if (thC6 != null) {
            Iterator it6 = ((C3033vK) thC6.l.entrySet()).iterator();
            while (((C2936uK) it6).hasNext()) {
                QH qh2 = (QH) ((C2936uK) it6).b().getValue();
                AbstractC1474fG.g(qh2);
                TH thF3 = AbstractC2506pt.f(qh2);
                if (thF3 == null || (strD = AbstractC2506pt.d(thF3, "route")) == null) {
                    it = it6;
                } else {
                    OH ohA4 = AbstractC2506pt.a(thF3, "script");
                    if (ohA4 != null) {
                        arrayList2 = new ArrayList();
                        for (QH qh3 : ohA4.l) {
                            AbstractC1474fG.g(qh3);
                            TH thF4 = AbstractC2506pt.f(qh3);
                            if (thF4 == null || (ohA = AbstractC2506pt.a(thF4, "playlists")) == null) {
                                it2 = it6;
                                iterable = null;
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it7 = ohA.l.iterator();
                                while (it7.hasNext()) {
                                    TH thF5 = AbstractC2506pt.f((QH) it7.next());
                                    if (thF5 == null || (strD2 = AbstractC2506pt.d(thF5, "_id")) == null) {
                                        it3 = it6;
                                    } else {
                                        TH thC7 = AbstractC2506pt.c(thF5, "options");
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        if (thC7 != null && (thC = AbstractC2506pt.c(thC7, "params")) != null) {
                                            Iterator it8 = ((C3033vK) thC.l.entrySet()).iterator();
                                            while (((C2936uK) it8).hasNext()) {
                                                C3130wK c3130wKB = ((C2936uK) it8).b();
                                                String str2 = (String) c3130wKB.getKey();
                                                QH qh4 = (QH) c3130wKB.getValue();
                                                qh4.getClass();
                                                Iterator it9 = it6;
                                                if (qh4 instanceof OH) {
                                                    OH ohE = qh4.e();
                                                    A = new ArrayList();
                                                    Iterator it10 = ohE.l.iterator();
                                                    while (it10.hasNext()) {
                                                        Iterator it11 = it10;
                                                        String strG2 = AbstractC2506pt.G((QH) it10.next());
                                                        if (strG2 != null) {
                                                            A.add(strG2);
                                                        }
                                                        it10 = it11;
                                                    }
                                                } else {
                                                    String strG3 = AbstractC2506pt.G(qh4);
                                                    A = strG3 != null ? AbstractC2506pt.A(strG3) : c1233cq;
                                                }
                                                if (!A.isEmpty()) {
                                                    AbstractC1474fG.g(str2);
                                                    linkedHashMap2.put(str2, A);
                                                }
                                                it6 = it9;
                                            }
                                        }
                                        it3 = it6;
                                        String strD4 = AbstractC2506pt.d(thF5, "type");
                                        if (strD4 == null) {
                                            strD4 = "HorizontalPlaylist";
                                        }
                                        String strZ2 = O9.z(thC7 != null ? thC7.i("customTitle") : null);
                                        String strD5 = thC7 != null ? AbstractC2506pt.d(thC7, "cardType") : null;
                                        String strD6 = thC7 != null ? AbstractC2506pt.d(thC7, "imageCut") : null;
                                        QH qhI = thF5.i("hidden");
                                        if (qhI == null) {
                                            z = false;
                                        } else {
                                            if (!(qhI instanceof VH)) {
                                                qhI = null;
                                            }
                                            if (qhI == null || !qhI.a()) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                        }
                                        c0821Us = new C0821Us(strD2, strD4, strZ2, strD5, strD6, linkedHashMap2, z);
                                    }
                                    if (c0821Us != null) {
                                        arrayList5.add(c0821Us);
                                    }
                                    it6 = it3;
                                    c0821Us = null;
                                }
                                it2 = it6;
                                iterable = arrayList5;
                            }
                            if (iterable == null) {
                                iterable = c1233cq;
                            }
                            AbstractC1406ef.Q(arrayList2, iterable);
                            it6 = it2;
                            c0821Us = null;
                        }
                        it = it6;
                    } else {
                        it = it6;
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = c1233cq;
                    }
                    if (!arrayList2.isEmpty()) {
                        linkedHashMap.put(strD, arrayList2);
                    }
                }
                it6 = it;
                c0821Us = null;
            }
        }
        return new C0665Os(list, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable q(C2409ot c2409ot, InterfaceC0473Hh interfaceC0473Hh) {
        C0873Ws c0873Ws;
        Serializable serializableK;
        TH thC;
        c2409ot.getClass();
        if (interfaceC0473Hh instanceof C0873Ws) {
            c0873Ws = (C0873Ws) interfaceC0473Hh;
            int i = c0873Ws.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0873Ws.n = i - Integer.MIN_VALUE;
            } else {
                c0873Ws = new C0873Ws(c2409ot, interfaceC0473Hh);
            }
        } else {
            c0873Ws = new C0873Ws(c2409ot, interfaceC0473Hh);
        }
        Object objJ = c0873Ws.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0873Ws.n;
        try {
            if (i2 == 0) {
                Jp0.O(objJ);
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u("https://watch.fanatiz.com/api/generic/geolocation");
                c0560Kq.d();
                C1951k70 c1951k70C = c0560Kq.c();
                c0873Ws.n = 1;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C0485Ht(c1951k70C, "geolocation", null), c0873Ws);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objJ);
            }
            TH thC2 = AbstractC2506pt.c(U9.v((String) objJ).f(), "data");
            serializableK = (thC2 == null || (thC = AbstractC2506pt.c(thC2, "country")) == null) ? null : AbstractC2506pt.d(thC, "iso_code");
        } catch (Throwable th) {
            serializableK = Jp0.k(th);
        }
        if (serializableK instanceof C2439p80) {
            return null;
        }
        return serializableK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r(C2409ot c2409ot, C0821Us c0821Us, int i, InterfaceC0473Hh interfaceC0473Hh) throws IOException {
        C0899Xs c0899Xs;
        c2409ot.getClass();
        if (interfaceC0473Hh instanceof C0899Xs) {
            c0899Xs = (C0899Xs) interfaceC0473Hh;
            int i2 = c0899Xs.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0899Xs.p = i2 - Integer.MIN_VALUE;
            } else {
                c0899Xs = new C0899Xs(c2409ot, interfaceC0473Hh);
            }
        } else {
            c0899Xs = new C0899Xs(c2409ot, interfaceC0473Hh);
        }
        Object objN = c0899Xs.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0899Xs.p;
        if (i3 == 0) {
            Jp0.O(objN);
            if (i < 1) {
                i = 1;
            }
            C0329Bt c0329Bt = C0329Bt.a;
            List listA = AbstractC2506pt.A(new C3184wt(c0821Us.a, i, A(c0821Us)));
            c0899Xs.l = c0821Us;
            c0899Xs.m = i;
            c0899Xs.p = 1;
            objN = zy0.n(new C3378yt(listA, null), c0899Xs);
            if (objN == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c0899Xs.m;
            C0821Us c0821Us2 = c0899Xs.l;
            Jp0.O(objN);
            i = i4;
            c0821Us = c0821Us2;
        }
        String str = (String) ((Map) objN).get(new C3087vt(c0821Us.a, i));
        if (str != null) {
            return O9.A(str);
        }
        throw new IOException("No se encontró la lista de contenido solicitada");
    }

    public static final boolean s(C0821Us c0821Us, C0795Ts c0795Ts) {
        String str = c0821Us.c;
        if (str == null) {
            str = c0795Ts.a;
        }
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return AbstractC1899jh0.N(c0821Us.d, "VerticalCard", true) || AbstractC1119bh0.W(lowerCase, "programa", false);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, o.ot] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ed -> B:42:0x00f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object t(o.C2409ot r16, o.C0665Os r17, o.InterfaceC0473Hh r18) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2409ot.t(o.ot, o.Os, o.Hh):java.lang.Object");
    }

    public static final List u(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0613Ms c0613MsA = (C0613Ms) it.next();
            C1101bX c1101bX = new C1101bX(c0613MsA.b, c0613MsA.a);
            C0613Ms c0613Ms = (C0613Ms) linkedHashMap.get(c1101bX);
            if (c0613Ms != null) {
                String str = c0613Ms.d;
                if (str == null) {
                    str = c0613MsA.d;
                }
                String str2 = str;
                String str3 = c0613Ms.e;
                if (str3 == null) {
                    str3 = c0613MsA.e;
                }
                String str4 = str3;
                String str5 = c0613Ms.f;
                if (str5 == null) {
                    str5 = c0613MsA.f;
                }
                String str6 = str5;
                String str7 = c0613Ms.g;
                if (str7 == null) {
                    str7 = c0613MsA.g;
                }
                String str8 = str7;
                boolean z = c0613Ms.h || c0613MsA.h;
                C0769Ss c0769Ss = c0613Ms.i;
                if (c0769Ss == null) {
                    c0769Ss = c0613MsA.i;
                }
                C0769Ss c0769Ss2 = c0769Ss;
                C0769Ss c0769Ss3 = c0613Ms.j;
                if (c0769Ss3 == null) {
                    c0769Ss3 = c0613MsA.j;
                }
                C0769Ss c0769Ss4 = c0769Ss3;
                C0769Ss c0769Ss5 = c0613Ms.k;
                if (c0769Ss5 == null) {
                    c0769Ss5 = c0613MsA.k;
                }
                C0769Ss c0769Ss6 = c0769Ss5;
                C2893tt c2893tt = c0613Ms.l;
                if (c2893tt == null) {
                    c2893tt = c0613MsA.l;
                }
                C2893tt c2893tt2 = c2893tt;
                C2893tt c2893tt3 = c0613Ms.m;
                if (c2893tt3 == null) {
                    c2893tt3 = c0613MsA.m;
                }
                C2893tt c2893tt4 = c2893tt3;
                String str9 = c0613Ms.n;
                if (str9 == null) {
                    str9 = c0613MsA.n;
                }
                String str10 = str9;
                List list2 = c0613Ms.f403o;
                c0613MsA = C0613Ms.a(c0613Ms, str2, str4, str6, str8, z, c0769Ss2, c0769Ss4, c0769Ss6, c2893tt2, c2893tt4, str10, list2.isEmpty() ? c0613MsA.f403o : list2, null, 32775);
            }
            linkedHashMap.put(c1101bX, c0613MsA);
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC1474fG.i(collectionValues, "<get-values>(...)");
        return AbstractC0911Ye.x0(collectionValues);
    }

    public static final ArrayList v(List list) {
        Cd0 cd0B;
        HashSet hashSet = new HashSet();
        ArrayList<C0613Ms> arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((C0613Ms) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        for (C0613Ms c0613Ms : arrayList) {
            AbstractC1474fG.j(c0613Ms, "card");
            boolean z = c0613Ms.b == EnumC0639Ns.l && c0613Ms.f403o.isEmpty();
            C2409ot c2409ot = b;
            if (z) {
                cd0B = c2409ot.D(c0613Ms);
            } else {
                boolean z2 = c0613Ms.h;
                cd0B = c2409ot.B(c0613Ms, z2, z2);
            }
            arrayList2.add(cd0B);
        }
        return arrayList2;
    }

    public static String w(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(str))) {
            str = null;
        }
        if (str != null) {
            return x(str2, "100", new C0769Ss(str, null));
        }
        return null;
    }

    public static String x(String str, String str2, C0769Ss c0769Ss) {
        if (c0769Ss == null) {
            return null;
        }
        String str3 = c0769Ss.a;
        if (str3 != null) {
            if (!(!AbstractC1899jh0.O(str3))) {
                str3 = null;
            }
            if (str3 != null) {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, "https://watch.fanatiz.com/api/images");
                C2349oE c2349oEF = c2349oE.b().f();
                c2349oEF.a("id", str3);
                c2349oEF.a("cut", str);
                c2349oEF.a("scale", str2);
                return c2349oEF.b().i;
            }
        }
        String strT = c0769Ss.b;
        if (strT == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(strT))) {
            strT = null;
        }
        if (strT == null) {
            return null;
        }
        if (!AbstractC1899jh0.U(strT, "http://", false) && !AbstractC1899jh0.U(strT, "https://", false)) {
            strT = AbstractC1701hf0.t("https://watch.fanatiz.com/", AbstractC1119bh0.I0(strT, '/'));
        }
        return strT;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r12 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C1387eR B(o.C0613Ms r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2409ot.B(o.Ms, boolean, boolean):o.eR");
    }

    public final C2109lo0 D(C0613Ms c0613Ms) {
        String strT = AbstractC1701hf0.t("fana-show|", c0613Ms.a);
        String str = c0613Ms.f;
        String strD0 = str != null ? AbstractC1119bh0.D0(10, str) : null;
        C0769Ss c0769Ss = c0613Ms.j;
        C0769Ss c0769Ss2 = c0613Ms.i;
        String strX = x("mediumv", "100", c0769Ss2 == null ? c0769Ss : c0769Ss2);
        if (c0769Ss == null) {
            c0769Ss = c0769Ss2;
        }
        C2109lo0 c2109lo0 = new C2109lo0(strT, c0613Ms.c, c0613Ms.d, strD0, null, null, null, null, strX, x("backdrop", "100", c0769Ss), c0613Ms.a, null, null, null, null, null, 63728);
        c2109lo0.r = "EVENTOS 2";
        f.put(strT, c2109lo0);
        return c2109lo0;
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2312nt(str, i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1387eR c1387eR = (C1387eR) d.get(str);
        if (c1387eR != null) {
            return c1387eR;
        }
        C1387eR c1387eR2 = new C1387eR(str, "Contenido deportivo", null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
        c1387eR2.t = "EVENTOS 2";
        return c1387eR2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0925Ys c0925Ys;
        if (interfaceC0473Hh instanceof C0925Ys) {
            c0925Ys = (C0925Ys) interfaceC0473Hh;
            int i = c0925Ys.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0925Ys.n = i - Integer.MIN_VALUE;
            } else {
                c0925Ys = new C0925Ys(this, interfaceC0473Hh);
            }
        } else {
            c0925Ys = new C0925Ys(this, interfaceC0473Hh);
        }
        Object objJ = c0925Ys.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0925Ys.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C0951Zs c0951Zs = new C0951Zs(str, str2, null);
            c0925Ys.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c0951Zs, c0925Ys);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1630gt(i, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1336dt c1336dt;
        Collection collection;
        String str2;
        String str3;
        String strN;
        String str4;
        String strN2;
        if (interfaceC0473Hh instanceof C1336dt) {
            c1336dt = (C1336dt) interfaceC0473Hh;
            int i = c1336dt.f746o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1336dt.f746o = i - Integer.MIN_VALUE;
            } else {
                c1336dt = new C1336dt(this, interfaceC0473Hh);
            }
        } else {
            c1336dt = new C1336dt(this, interfaceC0473Hh);
        }
        Object obj = c1336dt.m;
        Object obj2 = EnumC1706hi.l;
        int i2 = c1336dt.f746o;
        ConcurrentHashMap concurrentHashMap = h;
        int i3 = 0;
        if (i2 == 0) {
            Jp0.O(obj);
            if (AbstractC1899jh0.U(str, "fana-episode|", false) && ((collection = (Collection) concurrentHashMap.get(str)) == null || collection.isEmpty())) {
                String strL0 = AbstractC1119bh0.l0(str, "fana-episode|");
                String strA0 = AbstractC1119bh0.A0(strL0, '|', strL0);
                if (!(!AbstractC1899jh0.O(strA0))) {
                    strA0 = null;
                }
                if (strA0 != null) {
                    c1336dt.l = str;
                    c1336dt.f746o = 1;
                    if (z(strA0, c1336dt) == obj2) {
                        return obj2;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c1336dt.l;
            Jp0.O(obj);
        }
        List list = (List) concurrentHashMap.get(str);
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                for (Object obj3 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0937Ze.N();
                        throw null;
                    }
                    C2990ut c2990ut = (C2990ut) obj3;
                    String strT = AbstractC1701hf0.t("fana-video|", c2990ut.a);
                    String str5 = c2990ut.b;
                    if (str5 == null) {
                        String str6 = c2990ut.c;
                        if (str6 != null) {
                            strN2 = str6.toUpperCase(Locale.ROOT);
                            AbstractC1474fG.i(strN2, "toUpperCase(...)");
                        } else {
                            strN2 = null;
                        }
                        if (strN2 == null) {
                            strN2 = AbstractC1674hK.n(i4, "Señal ");
                        }
                        str4 = strN2;
                    } else {
                        str4 = str5;
                    }
                    arrayList.add(new Ds0(strT, str4, null, null, 60));
                    i3 = i4;
                }
                return arrayList;
            }
        }
        C0613Ms c0613Ms = (C0613Ms) e.get(str);
        if (c0613Ms != null) {
            List list2 = c0613Ms.f403o;
            if (true ^ list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(list2, 10));
                for (Object obj4 : list2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0937Ze.N();
                        throw null;
                    }
                    C2990ut c2990ut2 = (C2990ut) obj4;
                    String strT2 = AbstractC1701hf0.t("fana-video|", c2990ut2.a);
                    String str7 = c2990ut2.b;
                    if (str7 == null) {
                        String str8 = c2990ut2.c;
                        if (str8 != null) {
                            strN = str8.toUpperCase(Locale.ROOT);
                            AbstractC1474fG.i(strN, "toUpperCase(...)");
                        } else {
                            strN = null;
                        }
                        if (strN == null) {
                            strN = AbstractC1674hK.n(i5, "Señal ");
                        }
                        str3 = strN;
                    } else {
                        str3 = str7;
                    }
                    arrayList2.add(new Ds0(strT2, str3, null, null, 60));
                    i3 = i5;
                }
                return arrayList2;
            }
        }
        if (!AbstractC1899jh0.U(str, "fana-event|", false)) {
            return C1233cq.l;
        }
        String strConcat = "fana-event|".concat(AbstractC1119bh0.l0(str, "fana-event|"));
        if (c0613Ms == null || (str2 = c0613Ms.c) == null) {
            str2 = "Señal deportiva";
        }
        return AbstractC2506pt.A(new Ds0(strConcat, str2, null, null, 60));
    }

    @Override // o.Q30
    public final String f() {
        return "https://nextjs.fanatiz.com/fanatiz/web/general/icon.webp";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1142bt(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "EVENTOS 2";
    }

    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1044at(str, i, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C1239ct c1239ct;
        if (interfaceC0473Hh instanceof C1239ct) {
            c1239ct = (C1239ct) interfaceC0473Hh;
            int i2 = c1239ct.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1239ct.n = i2 - Integer.MIN_VALUE;
            } else {
                c1239ct = new C1239ct(this, interfaceC0473Hh);
            }
        } else {
            c1239ct = new C1239ct(this, interfaceC0473Hh);
        }
        Object objH = c1239ct.l;
        Object obj = EnumC1706hi.l;
        int i3 = c1239ct.n;
        if (i3 == 0) {
            Jp0.O(objH);
            c1239ct.n = 1;
            objH = h("fana-route|/", i, c1239ct);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objH);
        }
        List list = ((C2420oz) objH).c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C1387eR) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1434et c1434et;
        if (interfaceC0473Hh instanceof C1434et) {
            c1434et = (C1434et) interfaceC0473Hh;
            int i = c1434et.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1434et.n = i - Integer.MIN_VALUE;
            } else {
                c1434et = new C1434et(this, interfaceC0473Hh);
            }
        } else {
            c1434et = new C1434et(this, interfaceC0473Hh);
        }
        Object objJ = c1434et.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1434et.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C1532ft c1532ft = new C1532ft(str, null);
            c1434et.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c1532ft, c1434et);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1688hY(str, "", null, null, 12);
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1728ht c1728ht;
        C0355Ct c0355Ct;
        Ds0 ds1 = ds0;
        if (interfaceC0473Hh instanceof C1728ht) {
            c1728ht = (C1728ht) interfaceC0473Hh;
            int i = c1728ht.f818o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1728ht.f818o = i - Integer.MIN_VALUE;
            } else {
                c1728ht = new C1728ht(this, interfaceC0473Hh);
            }
        } else {
            c1728ht = new C1728ht(this, interfaceC0473Hh);
        }
        Object objN = c1728ht.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1728ht.f818o;
        if (i2 == 0) {
            Jp0.O(objN);
            boolean zU = AbstractC1899jh0.U(ds1.l, "fana-video|", false);
            c0355Ct = null;
            String str = ds1.l;
            if (zU) {
                C0433Ft c0433Ft = C0433Ft.a;
                String strL0 = AbstractC1119bh0.l0(str, "fana-video|");
                c1728ht.l = ds1;
                c1728ht.f818o = 1;
                objN = Ec0.a.n(new C0407Et("video", strL0, null), c1728ht);
                if (objN == enumC1706hi) {
                    return enumC1706hi;
                }
                c0355Ct = (C0355Ct) objN;
            } else if (AbstractC1899jh0.U(str, "fana-event|", false)) {
                C0433Ft c0433Ft2 = C0433Ft.a;
                String strL1 = AbstractC1119bh0.l0(str, "fana-event|");
                c1728ht.l = ds1;
                c1728ht.f818o = 2;
                objN = Ec0.a.n(new C0407Et("event", strL1, null), c1728ht);
                if (objN == enumC1706hi) {
                    return enumC1706hi;
                }
                c0355Ct = (C0355Ct) objN;
            }
        } else if (i2 == 1) {
            ds1 = c1728ht.l;
            Jp0.O(objN);
            c0355Ct = (C0355Ct) objN;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ds1 = c1728ht.l;
            Jp0.O(objN);
            c0355Ct = (C0355Ct) objN;
        }
        if (c0355Ct == null) {
            throw new IOException("No se encontró una señal reproducible");
        }
        return new Js0(c0355Ct.a, c0355Ct.c, c0355Ct.b, (String) null, (String) null, (byte[]) null, ds1.m, (String) null, (String) null, (List) null, false, 4024);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable y(C0665Os c0665Os, String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C2020kt c2020kt;
        int i2;
        List<C0821Us> list;
        Object objK;
        C1101bX c1101bX;
        if (interfaceC0473Hh instanceof C2020kt) {
            c2020kt = (C2020kt) interfaceC0473Hh;
            int i3 = c2020kt.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2020kt.p = i3 - Integer.MIN_VALUE;
            } else {
                c2020kt = new C2020kt(this, interfaceC0473Hh);
            }
        } else {
            c2020kt = new C2020kt(this, interfaceC0473Hh);
        }
        Object obj = c2020kt.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c2020kt.p;
        if (i4 == 0) {
            Jp0.O(obj);
            List list2 = (List) c0665Os.b.get(str);
            C1233cq c1233cq = C1233cq.l;
            if (list2 == null) {
                list2 = c1233cq;
            }
            List<C0821Us> listQ = Vb0.Q(Vb0.P(new C1732hv(AbstractC0911Ye.U(list2), false, C2118lt.s), 30));
            if (listQ.isEmpty()) {
                return c1233cq;
            }
            int i5 = i;
            if (i5 < 1) {
                i5 = 1;
            }
            C0329Bt c0329Bt = C0329Bt.a;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(listQ, 10));
            for (C0821Us c0821Us : listQ) {
                arrayList.add(new C3184wt(c0821Us.a, i5, A(c0821Us)));
            }
            c2020kt.l = listQ;
            c2020kt.m = i5;
            c2020kt.p = 1;
            Object objN = zy0.n(new C3378yt(arrayList, null), c2020kt);
            if (objN == enumC1706hi) {
                return enumC1706hi;
            }
            i2 = i5;
            list = listQ;
            obj = objN;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c2020kt.m;
            list = c2020kt.l;
            Jp0.O(obj);
        }
        Map map = (Map) obj;
        ArrayList arrayList2 = new ArrayList();
        for (C0821Us c0821Us2 : list) {
            String str2 = (String) map.get(new C3087vt(c0821Us2.a, i2));
            if (str2 != null) {
                try {
                    C0795Ts c0795TsA = O9.A(str2);
                    List list3 = c0795TsA.b;
                    ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C0613Ms.a((C0613Ms) it.next(), null, null, null, null, false, null, null, null, null, null, null, null, c0821Us2.a(), 32767));
                    }
                    objK = new C1101bX(c0821Us2, new C0795Ts(c0795TsA.c, c0795TsA.a, arrayList3));
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                if (objK instanceof C2439p80) {
                    objK = null;
                }
                c1101bX = (C1101bX) objK;
            } else {
                c1101bX = null;
            }
            if (c1101bX != null) {
                arrayList2.add(c1101bX);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object z(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2215mt c2215mt;
        String str2;
        C2409ot c2409ot;
        String str3;
        O9 o9;
        C2409ot c2409ot2;
        String str4;
        String str5;
        String str6;
        C1233cq c1233cq;
        ArrayList arrayList;
        String strD;
        String str7;
        C2409ot c2409ot3;
        String str8;
        String str9;
        String str10;
        C1233cq c1233cq2;
        List list;
        C2796st c2796st;
        String strD2;
        C1233cq c1233cq3;
        String str11;
        C2409ot c2409ot4;
        String str12;
        String str13;
        ArrayList arrayList2;
        C2699rt c2699rt;
        String str14;
        C2990ut c2990ut;
        String strConcat = str;
        if (interfaceC0473Hh instanceof C2215mt) {
            c2215mt = (C2215mt) interfaceC0473Hh;
            int i = c2215mt.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2215mt.r = i - Integer.MIN_VALUE;
            } else {
                c2215mt = new C2215mt(this, interfaceC0473Hh);
            }
        } else {
            c2215mt = new C2215mt(this, interfaceC0473Hh);
        }
        Object obj = c2215mt.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2215mt.r;
        if (i2 == 0) {
            Jp0.O(obj);
            if (!AbstractC1899jh0.U(strConcat, "fana-show|", false)) {
                strConcat = "fana-show|".concat(strConcat);
            }
            String strL0 = AbstractC1119bh0.l0(strConcat, "fana-show|");
            O9 o10 = O9.s;
            C0329Bt c0329Bt = C0329Bt.a;
            c2215mt.l = this;
            c2215mt.m = strConcat;
            c2215mt.n = strL0;
            c2215mt.f924o = o10;
            c2215mt.r = 1;
            Object objA = c0329Bt.a(strL0, c2215mt);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strL0;
            obj = objA;
            c2409ot = this;
            str3 = strConcat;
            o9 = o10;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o9 = c2215mt.f924o;
            str2 = c2215mt.n;
            str3 = c2215mt.m;
            c2409ot = c2215mt.l;
            Jp0.O(obj);
        }
        String str15 = (String) obj;
        o9.getClass();
        AbstractC1474fG.j(str15, "body");
        TH thF = U9.v(str15).f();
        TH thC = AbstractC2506pt.c(thF, "data");
        if (thC != null) {
            thF = thC;
        }
        String str16 = "id";
        if (AbstractC2506pt.d(thF, "id") == null) {
            throw new IOException("La serie no tiene un identificador válido");
        }
        I60 i60 = AbstractC2603qt.a;
        String strA = AbstractC2603qt.a(AbstractC2506pt.d(thF, "title"));
        if (strA == null) {
            throw new IOException("La serie no tiene un título válido");
        }
        OH ohA = AbstractC2506pt.a(thF, "seasons");
        C1233cq c1233cq4 = C1233cq.l;
        if (ohA != null) {
            arrayList = new ArrayList();
            Iterator it = ohA.l.iterator();
            while (it.hasNext()) {
                QH qh = (QH) it.next();
                AbstractC1474fG.g(qh);
                TH thF2 = AbstractC2506pt.f(qh);
                if (thF2 == null || (strD = AbstractC2506pt.d(thF2, str16)) == null) {
                    str7 = str16;
                    c2409ot3 = c2409ot;
                    str8 = str2;
                    str9 = str3;
                    it = it;
                    str10 = strA;
                    c1233cq2 = c1233cq4;
                    c2796st = null;
                } else {
                    OH ohA2 = AbstractC2506pt.a(thF2, "episodes");
                    if (ohA2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = ohA2.l.iterator();
                        while (it2.hasNext()) {
                            QH qh2 = (QH) it2.next();
                            AbstractC1474fG.g(qh2);
                            Iterator it3 = it2;
                            TH thF3 = AbstractC2506pt.f(qh2);
                            if (thF3 == null || (strD2 = AbstractC2506pt.d(thF3, str16)) == null) {
                                str11 = str16;
                                c2409ot4 = c2409ot;
                                str12 = str2;
                                str13 = str3;
                                strA = strA;
                                c1233cq3 = c1233cq4;
                                c2699rt = null;
                            } else {
                                c1233cq3 = c1233cq4;
                                OH ohA3 = AbstractC2506pt.a(thF3, "videos");
                                if (ohA3 != null) {
                                    arrayList2 = new ArrayList();
                                    Iterator it4 = ohA3.l.iterator();
                                    while (it4.hasNext()) {
                                        QH qh3 = (QH) it4.next();
                                        AbstractC1474fG.g(qh3);
                                        Iterator it5 = it4;
                                        TH thF4 = AbstractC2506pt.f(qh3);
                                        if (thF4 == null) {
                                            str14 = str3;
                                        } else {
                                            str14 = str3;
                                            String strD3 = AbstractC2506pt.d(thF4, str16);
                                            if (strD3 != null) {
                                                str16 = str16;
                                                c2409ot = c2409ot;
                                                str2 = str2;
                                                c2990ut = new C2990ut(strD3, AbstractC2506pt.d(thF4, "name"), AbstractC2506pt.d(thF4, "language"));
                                            }
                                            if (c2990ut != null) {
                                                arrayList2.add(c2990ut);
                                            }
                                            it4 = it5;
                                            str3 = str14;
                                            str16 = str16;
                                            c2409ot = c2409ot;
                                            str2 = str2;
                                        }
                                        c2990ut = null;
                                        if (c2990ut != null) {
                                            arrayList2.add(c2990ut);
                                        }
                                        it4 = it5;
                                        str3 = str14;
                                        str16 = str16;
                                        c2409ot = c2409ot;
                                        str2 = str2;
                                    }
                                    str11 = str16;
                                    c2409ot4 = c2409ot;
                                    str12 = str2;
                                    str13 = str3;
                                } else {
                                    str11 = str16;
                                    c2409ot4 = c2409ot;
                                    str12 = str2;
                                    str13 = str3;
                                    arrayList2 = null;
                                }
                                List list2 = arrayList2 == null ? c1233cq3 : arrayList2;
                                I60 i61 = AbstractC2603qt.a;
                                String strA2 = AbstractC2603qt.a(AbstractC2506pt.d(thF3, "title"));
                                if (strA2 == null) {
                                    strA2 = "Episodio";
                                }
                                String str17 = strA2;
                                Integer numB = AbstractC2506pt.b(thF3, "number");
                                c2699rt = new C2699rt(strD2, str17, numB != null ? numB.intValue() : 0, AbstractC2506pt.d(thF3, "released"), AbstractC2506pt.d(thF3, "poster_image_id"), AbstractC2506pt.d(thF3, "banner_image_id"), list2);
                            }
                            if (c2699rt != null) {
                                arrayList3.add(c2699rt);
                            }
                            c1233cq4 = c1233cq3;
                            it2 = it3;
                            strA = strA;
                            str3 = str13;
                            str16 = str11;
                            c2409ot = c2409ot4;
                            str2 = str12;
                        }
                        str7 = str16;
                        c2409ot3 = c2409ot;
                        str8 = str2;
                        str9 = str3;
                        str10 = strA;
                        c1233cq2 = c1233cq4;
                        list = arrayList3;
                    } else {
                        str7 = str16;
                        c2409ot3 = c2409ot;
                        str8 = str2;
                        str9 = str3;
                        str10 = strA;
                        c1233cq2 = c1233cq4;
                        list = null;
                    }
                    if (list == null) {
                        list = c1233cq2;
                    }
                    Integer numB2 = AbstractC2506pt.b(thF2, "year");
                    int iIntValue = numB2 != null ? numB2.intValue() : 0;
                    I60 i62 = AbstractC2603qt.a;
                    String strA3 = AbstractC2603qt.a(AbstractC2506pt.d(thF2, "name"));
                    if (strA3 == null) {
                        strA3 = "Temporada";
                    }
                    c2796st = new C2796st(iIntValue, strD, strA3, list);
                }
                if (c2796st != null) {
                    arrayList.add(c2796st);
                }
                it = it;
                c1233cq4 = c1233cq2;
                strA = str10;
                str3 = str9;
                str16 = str7;
                c2409ot = c2409ot3;
                str2 = str8;
            }
            c2409ot2 = c2409ot;
            str4 = str2;
            str5 = str3;
            str6 = strA;
            c1233cq = c1233cq4;
        } else {
            c2409ot2 = c2409ot;
            str4 = str2;
            str5 = str3;
            str6 = strA;
            c1233cq = c1233cq4;
            arrayList = null;
        }
        Iterable iterable = arrayList == null ? c1233cq : arrayList;
        I60 i63 = AbstractC2603qt.a;
        String strA4 = AbstractC2603qt.a(AbstractC2506pt.d(thF, "overview"));
        String strD4 = AbstractC2506pt.d(thF, "poster_image_id");
        String strD5 = AbstractC2506pt.d(thF, "banner_image_id");
        int i3 = 10;
        ArrayList<Ma0> arrayList4 = new ArrayList(AbstractC1016af.O(iterable, 10));
        int i4 = 0;
        for (Object obj2 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            C2796st c2796st2 = (C2796st) obj2;
            Ma0 ma0 = new Ma0(c2796st2.a, i5, c2796st2.c, w(strD4, "mediumv"), null, null, 48);
            List<C2699rt> list3 = c2796st2.d;
            ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(list3, i3));
            for (C2699rt c2699rt2 : list3) {
                String str18 = c2699rt2.a;
                StringBuilder sb = new StringBuilder("fana-episode|");
                String str19 = str4;
                sb.append(str19);
                sb.append("|");
                sb.append(str18);
                String string = sb.toString();
                h.put(string, c2699rt2.g);
                String str20 = c2699rt2.f;
                if (str20 == null) {
                    str20 = c2699rt2.e;
                }
                C0456Gq c0456Gq = new C0456Gq(string, c2699rt2.c, c2699rt2.b, c2699rt2.d, w(str20, "backdrop"), null, ma0, 32);
                c0456Gq.k = "EVENTOS 2";
                arrayList5.add(c0456Gq);
                str4 = str19;
            }
            ma0.f = arrayList5;
            g.put(ma0.a, arrayList5);
            arrayList4.add(ma0);
            str4 = str4;
            i4 = i5;
            i3 = 10;
        }
        c2409ot2.getClass();
        C2109lo0 c2109lo0 = new C2109lo0(str5, str6, strA4, null, null, null, null, null, w(strD4, "mediumv"), w(strD5, "backdrop"), str4, arrayList4, null, null, null, null, 61688);
        c2109lo0.r = "EVENTOS 2";
        for (Ma0 ma1 : arrayList4) {
            ma1.e = c2109lo0;
            Iterator it6 = ma1.f.iterator();
            while (it6.hasNext()) {
                ((C0456Gq) it6.next()).e = c2109lo0;
            }
        }
        f.put(str5, c2109lo0);
        return c2109lo0;
    }
}
