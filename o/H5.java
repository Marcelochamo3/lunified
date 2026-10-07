package o;

import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import android.util.EventLog;
import com.skidush.clonex.models.Video$Type;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class H5 implements Q30 {
    public static final H5 b = new H5();
    public static final String c = AbstractC3238xV.a("kBuKR8y3X9A+v3ykTmidvVM+E9wLO55V0aNS3f9ffoAPqE39Tg+sQzB0flgu6ovOfcRHsRHpEN9k+lK0nKqMG0eLDMjwco+H5iafHCTrK4/lU7g=");
    public static final OV d = new OV(AbstractC1370eA.h());
    public static final BA e = new BA();
    public static final LinkedHashMap f = new LinkedHashMap();
    public static final LinkedHashMap g = new LinkedHashMap();
    public static final LinkedHashMap h = new LinkedHashMap();
    public static final YS i = AbstractC1923jt0.a();
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final Rh0 k;

    static {
        int i2 = 0;
        AbstractC1474fG.i(Pattern.compile("(?:cenc:)?default_KID\\s*=\\s*[\"']([0-9a-fA-F-]{32,36})[\"']", C3325yL.p(2)), "compile(...)");
        Iterator it = Lc0.T(J60.IGNORE_CASE, J60.DOT_MATCHES_ALL).iterator();
        while (it.hasNext()) {
            i2 |= ((J60) it.next()).l;
        }
        AbstractC1474fG.i(Pattern.compile("<(?:[\\w.-]+:)?pssh(?:\\s[^>]*)?>(.*?)</(?:[\\w.-]+:)?pssh>", C3325yL.p(i2)), "compile(...)");
        k = new Rh0(C2428p3.f963o);
    }

    public static Js0 p(String str, String str2, String str3, Set set) {
        int i2 = 0;
        String lowerCase = AbstractC1899jh0.R(AbstractC1119bh0.B0(str2, ":"), "-", "", false).toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        Map mapZ = AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"), new C1101bX("Origin", "https://www.clarovideo.com"), new C1101bX("Referer", "https://www.clarovideo.com/"));
        List listT0 = AbstractC1119bh0.t0(str2, new String[]{":"}, 2, 2);
        String str4 = (String) listT0.get(0);
        String strEncodeToString = Base64.encodeToString(q((String) listT0.get(1)), 11);
        LinkedHashSet linkedHashSetS = Lc0.S(set, str4);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(linkedHashSetS, 10));
        Iterator it = linkedHashSetS.iterator();
        while (it.hasNext()) {
            String lowerCase2 = AbstractC1899jh0.R((String) it.next(), "-", "", false).toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
            arrayList.add(lowerCase2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str5 = (String) obj;
            if (str5.length() == 32) {
                int i3 = 0;
                while (true) {
                    if (i3 >= str5.length()) {
                        arrayList2.add(obj);
                        break;
                    }
                    char cCharAt = str5.charAt(i3);
                    if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                        break;
                    }
                    i3++;
                }
            }
        }
        byte[] bytes = AbstractC1701hf0.u("{\"keys\":[", AbstractC0911Ye.h0(AbstractC0911Ye.X(arrayList2), ",", null, null, new C5(strEncodeToString, i2), 30), "],\"type\":\"temporary\"}").getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        return new Js0(str, mapZ, "dash", "clearkey", (String) null, bytes, str3, (String) null, lowerCase, (List) null, false, 3728);
    }

    public static byte[] q(String str) {
        ArrayList<String> arrayListV = AbstractC1119bh0.V(str);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListV, 10));
        for (String str2 : arrayListV) {
            AbstractC3021v9.e(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        return AbstractC0911Ye.u0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    public static Set r(String str, String str2) {
        Object objK;
        String str3;
        LinkedHashSet linkedHashSet;
        Throwable th;
        Object objK2;
        LinkedHashSet linkedHashSet2;
        int i2;
        int i3;
        LinkedHashSet linkedHashSet3;
        int i4;
        int i5;
        AbstractC2051l80 abstractC2051l80;
        Throwable th2;
        try {
            C0785Ti c0785Ti = new C0785Ti();
            Uri uri = Uri.parse(str);
            byte[] bytes = str2.getBytes(AbstractC1305dd.a);
            AbstractC1474fG.i(bytes, "getBytes(...)");
            objK = c0785Ti.D(uri, new ByteArrayInputStream(bytes));
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        C0733Ri c0733Ri = (C0733Ri) objK;
        if (c0733Ri == null) {
            return C1722hq.l;
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        int size = c0733Ri.m.size();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            EY eyB = c0733Ri.b(i8);
            AbstractC1474fG.i(eyB, "getPeriod(...)");
            Iterator it = eyB.c.iterator();
            while (it.hasNext()) {
                for (AbstractC1853j70 abstractC1853j70 : ((V1) it.next()).c) {
                    C2433p50 c2433p50 = abstractC1853j70.p;
                    if (c2433p50 == null) {
                        linkedHashSet = linkedHashSet4;
                    } else {
                        AbstractC0985aF abstractC0985aF = abstractC1853j70.m;
                        AbstractC1474fG.i(abstractC0985aF, "baseUrls");
                        C2922u8 c2922u8 = (C2922u8) AbstractC0911Ye.d0(abstractC0985aF);
                        if (c2922u8 == null || (str3 = c2922u8.a) == null) {
                            str3 = str;
                        }
                        AbstractC1474fG.g(str3);
                        String strC = AbstractC3045vW.C(str3, c2433p50.c);
                        AbstractC1474fG.i(strC, "resolveUriString(...)");
                        StringBuilder sb = new StringBuilder();
                        sb.append(strC);
                        sb.append("|");
                        long j2 = c2433p50.a;
                        sb.append(j2);
                        sb.append("|");
                        linkedHashSet = linkedHashSet4;
                        long j3 = c2433p50.b;
                        sb.append(j3);
                        if (linkedHashSet5.add(sb.toString())) {
                            int i9 = i7 + 1;
                            if (i7 >= 2) {
                                linkedHashSet2 = linkedHashSet5;
                                i2 = size;
                                i3 = i9;
                            } else {
                                C0560Kq c0560Kq = new C0560Kq();
                                c0560Kq.u(strC);
                                c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
                                c0560Kq.j("Origin", "https://www.clarovideo.com");
                                c0560Kq.j("Referer", "https://www.clarovideo.com/");
                                if (j3 != -1) {
                                    c0560Kq.j("Range", "bytes=" + j2 + "-" + ((j3 + j2) - 1));
                                }
                                try {
                                    A50 a50C = d.c(c0560Kq.c());
                                    a50C.q.g(8L, TimeUnit.SECONDS);
                                    C1855j80 c1855j80G = a50C.g();
                                    try {
                                        if (c1855j80G.p() && (abstractC2051l80 = c1855j80G.r) != null && abstractC2051l80.i() <= 2097152) {
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[16384];
                                            InputStream inputStreamA = abstractC2051l80.a();
                                            while (true) {
                                                try {
                                                    int i10 = inputStreamA.read(bArr);
                                                    if (i10 < 0) {
                                                        break;
                                                    }
                                                    try {
                                                        if (byteArrayOutputStream.size() + i10 > 2097152) {
                                                            break;
                                                        }
                                                        byteArrayOutputStream.write(bArr, i6, i10);
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        th = null;
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th5) {
                                                            AbstractC3409z9.g(inputStreamA, th2);
                                                            throw th5;
                                                        }
                                                    }
                                                    th = th;
                                                    Throwable th6 = th;
                                                    try {
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        AbstractC3409z9.g(c1855j80G, th6);
                                                        throw th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = null;
                                                    th2 = th8;
                                                }
                                            }
                                            th = null;
                                            try {
                                                AbstractC3409z9.g(inputStreamA, null);
                                                objK2 = byteArrayOutputStream.toByteArray();
                                            } catch (Throwable th9) {
                                                th = th9;
                                            }
                                        } else {
                                            objK2 = null;
                                            th = null;
                                        }
                                        try {
                                            AbstractC3409z9.g(c1855j80G, th);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            objK2 = Jp0.k(th);
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        th = null;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    th = null;
                                }
                                if (objK2 instanceof C2439p80) {
                                    objK2 = th;
                                }
                                byte[] bArr2 = (byte[]) objK2;
                                if (bArr2 == null) {
                                    linkedHashSet2 = linkedHashSet5;
                                    i2 = size;
                                    i3 = i9;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    int i11 = 4;
                                    while (true) {
                                        int i12 = i11 + 27;
                                        if (i12 > bArr2.length) {
                                            break;
                                        }
                                        if (bArr2[i11] == 116 && bArr2[i11 + 1] == 101 && bArr2[i11 + 2] == 110 && bArr2[i11 + 3] == 99) {
                                            int i13 = i11 - 4;
                                            i5 = i9;
                                            long j4 = ((long) (((bArr2[i11 - 3] & 255) << 16) | ((bArr2[i13] & 255) << 24) | ((bArr2[i11 - 2] & 255) << 8) | (bArr2[i11 - 1] & 255))) & 4294967295L;
                                            int i14 = i11 + 11;
                                            linkedHashSet3 = linkedHashSet5;
                                            i4 = size;
                                            if (j4 >= 31) {
                                                long j5 = ((long) i13) + j4;
                                                if (j5 <= bArr2.length && i12 <= j5) {
                                                    arrayList.add(X5.M(bArr2, i14, i12));
                                                    i11 = (int) j5;
                                                }
                                            }
                                            i9 = i5;
                                            linkedHashSet5 = linkedHashSet3;
                                            size = i4;
                                        } else {
                                            linkedHashSet3 = linkedHashSet5;
                                            i4 = size;
                                            i5 = i9;
                                        }
                                        i11++;
                                        i9 = i5;
                                        linkedHashSet5 = linkedHashSet3;
                                        size = i4;
                                    }
                                    linkedHashSet2 = linkedHashSet5;
                                    i2 = size;
                                    i3 = i9;
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        linkedHashSet.add(X5.R((byte[]) it2.next(), E1.f226o));
                                    }
                                    if (!linkedHashSet.isEmpty()) {
                                        return linkedHashSet;
                                    }
                                }
                            }
                            linkedHashSet4 = linkedHashSet;
                            i7 = i3;
                        }
                        linkedHashSet5 = linkedHashSet2;
                        size = i2;
                        i6 = 0;
                    }
                    linkedHashSet2 = linkedHashSet5;
                    i2 = size;
                    linkedHashSet4 = linkedHashSet;
                    linkedHashSet5 = linkedHashSet2;
                    size = i2;
                    i6 = 0;
                }
            }
            i8++;
            i6 = 0;
        }
        return linkedHashSet4;
    }

    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        String str2 = (String) f.get(str);
        return new C1387eR(str, str2 == null ? str : str2, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        String str2 = (String) f.get(str);
        if (str2 == null) {
            str2 = "Claro AR";
        }
        return AbstractC2506pt.A(new Ds0(str, str2, null, null, 60));
    }

    @Override // o.Q30
    public final String f() {
        return "https://static.vecteezy.com/system/resources/thumbnails/007/688/855/small/tv-logo-free-vector.jpg";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) throws IOException {
        D5 d5;
        ArrayList arrayList;
        H5 h5;
        List<C3401z5> listA;
        List<A5> listA2;
        C3304y5 c3304y5A;
        C3304y5 c3304y5B;
        Object objK;
        C1387eR c1387eR;
        Object objK2;
        if (interfaceC0473Hh instanceof D5) {
            d5 = (D5) interfaceC0473Hh;
            int i2 = d5.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5.p = i2 - Integer.MIN_VALUE;
            } else {
                d5 = new D5(this, interfaceC0473Hh);
            }
        } else {
            d5 = new D5(this, interfaceC0473Hh);
        }
        Object obj = d5.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = d5.p;
        LinkedHashMap linkedHashMap = h;
        LinkedHashMap linkedHashMap2 = g;
        LinkedHashMap linkedHashMap3 = f;
        LinkedHashMap linkedHashMap4 = j;
        if (i3 == 0) {
            Jp0.O(obj);
            ArrayList arrayList2 = new ArrayList();
            linkedHashMap4.clear();
            linkedHashMap3.clear();
            linkedHashMap2.clear();
            linkedHashMap.clear();
            String str = W8.a;
            d5.l = this;
            d5.m = arrayList2;
            d5.p = 1;
            if (W8.b(d5) == enumC1706hi) {
                return enumC1706hi;
            }
            arrayList = arrayList2;
            h5 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = d5.m;
            h5 = d5.l;
            Jp0.O(obj);
        }
        h5.getClass();
        String str2 = c;
        AbstractC1474fG.j(str2, "<this>");
        C2349oE c2349oE = new C2349oE();
        C1387eR c1387eR2 = null;
        c2349oE.g(null, str2);
        C2349oE c2349oEF = c2349oE.b().f();
        c2349oEF.a("_refresh", String.valueOf(System.currentTimeMillis()));
        C2446pE c2446pEB = c2349oEF.b();
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.m = c2446pEB;
        c0560Kq.j("Cache-Control", "no-cache, no-store, max-age=0");
        c0560Kq.j("Pragma", "no-cache");
        C1855j80 c1855j80G = d.c(c0560Kq.c()).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (!c1855j80G.p()) {
                throw new IOException("Catálogo Argentina HTTP " + c1855j80G.f840o);
            }
            if (AbstractC1899jh0.O(strQ)) {
                throw new IOException("El catálogo Argentina respondió vacío");
            }
            B5 b5 = (B5) e.b(strQ, B5.class);
            if (b5 != null && (listA = b5.a()) != null) {
                if (!(!listA.isEmpty())) {
                    listA = null;
                }
                if (listA != null) {
                    AbstractC3409z9.g(c1855j80G, null);
                    for (C3401z5 c3401z5 : listA) {
                        String strB = c3401z5.b();
                        if (strB != null && (listA2 = c3401z5.a()) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (A5 a5 : listA2) {
                                String strD = a5.d();
                                if (strD == null || (c3304y5A = a5.a()) == null || (c3304y5B = a5.b()) == null) {
                                    c1387eR = c1387eR2;
                                } else {
                                    try {
                                        String str3 = W8.a;
                                        objK = W8.a(c3304y5A.b(), c3304y5A.c(), c3304y5A.a());
                                    } catch (Throwable th) {
                                        objK = Jp0.k(th);
                                    }
                                    Throwable thA = C2536q80.a(objK);
                                    if (thA == null) {
                                        String str4 = (String) objK;
                                        try {
                                            String str5 = W8.a;
                                            objK2 = W8.a(c3304y5B.b(), c3304y5B.c(), c3304y5B.a());
                                        } catch (Throwable th2) {
                                            objK2 = Jp0.k(th2);
                                        }
                                        Throwable thA2 = C2536q80.a(objK2);
                                        if (thA2 == null) {
                                            String str6 = (String) objK2;
                                            Integer numJ = AbstractC1802ih0.J(str4);
                                            if (numJ != null) {
                                                int iIntValue = numJ.intValue();
                                                if (AbstractC1119bh0.W(str6, ":", false)) {
                                                    String str7 = "claroar-" + iIntValue;
                                                    linkedHashMap3.put(str7, strD);
                                                    linkedHashMap2.put(str7, new Integer(iIntValue));
                                                    linkedHashMap.put(str7, str6);
                                                    c1387eR = new C1387eR(str7, strD, null, null, null, null, null, null, a5.c(), null, null, null, null, null, AbstractC3327yN.y(new C1101bX("is_tv_channel", Boolean.TRUE)), 16124);
                                                }
                                            }
                                        } else {
                                            thA2.getMessage();
                                        }
                                    } else {
                                        thA.getMessage();
                                    }
                                    c1387eR = null;
                                }
                                if (c1387eR != null) {
                                    arrayList3.add(c1387eR);
                                }
                                c1387eR2 = null;
                            }
                            if (!arrayList3.isEmpty()) {
                                linkedHashMap4.put(strB, arrayList3);
                                arrayList.add(new C0882Xb(strB, arrayList3));
                            }
                        }
                        c1387eR2 = null;
                    }
                    if (arrayList.isEmpty()) {
                        throw new IOException("No se pudo construir la lista de canales Argentina");
                    }
                    return arrayList;
                }
            }
            throw new IOException("El catálogo Argentina no contiene categorías");
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3409z9.g(c1855j80G, th3);
                throw th4;
            }
        }
    }

    @Override // o.Q30
    public final String getName() {
        return "ARGENTINA SOLO CANALES";
    }

    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2420oz(str, str);
    }

    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2109lo0(str, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
    }

    @Override // o.Q30
    public final Object k(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f  */
    /* JADX WARN: Code duplicated, block: B:107:0x029b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x017a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0202 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0224  */
    /* JADX WARN: Code duplicated, block: B:91:0x022c  */
    /* JADX WARN: Code duplicated, block: B:93:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0234  */
    /* JADX WARN: Code duplicated, block: B:97:0x023d  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        E5 e5;
        H5 h5;
        String str;
        int iIntValue;
        String str2;
        String str3;
        C1722hq c1722hq;
        String str4;
        boolean z;
        String str5;
        String str6;
        C2916u5 c2916u5;
        int i2;
        String str7;
        F80 f80;
        C3110w5 c3110w5;
        C3485zy c3485zyA;
        String str8;
        boolean z2;
        Set setR;
        String str9;
        String str10;
        H5 h6;
        String str11;
        String str12;
        Set setR2;
        F80 f81;
        String str13;
        Ds0 ds1 = ds0;
        if (interfaceC0473Hh instanceof E5) {
            e5 = (E5) interfaceC0473Hh;
            int i3 = e5.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e5.t = i3 - Integer.MIN_VALUE;
            } else {
                e5 = new E5(this, interfaceC0473Hh);
            }
        } else {
            e5 = new E5(this, interfaceC0473Hh);
        }
        Object objJ = e5.r;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = e5.t;
        C1722hq c1722hq2 = C1722hq.l;
        H5 h7 = b;
        Rh0 rh0 = k;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    String str14 = e5.n;
                    Ds0 ds2 = (Ds0) e5.m;
                    H5 h8 = e5.l;
                    Jp0.O(objJ);
                    h5 = h8;
                    str = str14;
                    ds1 = ds2;
                } else if (i4 == 2) {
                    i2 = e5.q;
                    c2916u5 = (C2916u5) e5.p;
                    str5 = e5.f229o;
                    str6 = e5.n;
                    str = (String) e5.m;
                    h5 = e5.l;
                    Jp0.O(objJ);
                    c1722hq = c1722hq2;
                    str4 = "";
                    str8 = (String) objJ;
                    if (str8 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        String str15 = c2916u5.b;
                        if (str8 == null) {
                            str8 = str4;
                        }
                        setR = r(str15, str8);
                    } else {
                        setR = c1722hq;
                    }
                    EventLog.writeEvent(1397638484, "claroar_manifest|source=cache|mpd=" + z2 + "|kids=" + setR.size());
                    if (z2) {
                        return p(c2916u5.b, str6, str5, setR);
                    }
                    iIntValue = i2;
                    str2 = str6;
                    str3 = str5;
                    C3207x5 c3207x5 = (C3207x5) rh0.getValue();
                    f80 = c3207x5.a;
                    f80.b();
                    c3110w5 = c3207x5.c;
                    c3485zyA = c3110w5.a();
                    z = true;
                    c3485zyA.o(1, str);
                    try {
                        f80.c();
                        try {
                            c3485zyA.f();
                            f80.m();
                            f80.j();
                            c3110w5.d(c3485zyA);
                            EventLog.writeEvent(1397638484, "claroar_api|getmedia=true");
                            C1600ge c1600ge = C1600ge.a;
                            e5.l = h5;
                            e5.m = str;
                            e5.n = str2;
                            e5.f229o = str3;
                            e5.p = null;
                            e5.t = 3;
                            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1307de(iIntValue, null), e5);
                            if (objJ == enumC1706hi) {
                                return enumC1706hi;
                            }
                            str7 = str;
                            str9 = ((C0858Wd) objJ).a;
                            EventLog.writeEvent(1397638484, "claroar_api|success=true");
                            e5.l = h5;
                            e5.m = str7;
                            e5.n = str2;
                            e5.f229o = str3;
                            e5.p = str9;
                            e5.t = 4;
                            objJ = h5.s(str9, e5);
                            if (objJ == enumC1706hi) {
                                return enumC1706hi;
                            }
                            str10 = str7;
                            h6 = h5;
                            str11 = str3;
                        } catch (Throwable th) {
                            f80.j();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c3110w5.d(c3485zyA);
                        throw th2;
                    }
                } else if (i4 == 3) {
                    String str16 = e5.f229o;
                    str2 = e5.n;
                    str7 = (String) e5.m;
                    h5 = e5.l;
                    Jp0.O(objJ);
                    str3 = str16;
                    c1722hq = c1722hq2;
                    str4 = "";
                    z = true;
                    str9 = ((C0858Wd) objJ).a;
                    EventLog.writeEvent(1397638484, "claroar_api|success=true");
                    e5.l = h5;
                    e5.m = str7;
                    e5.n = str2;
                    e5.f229o = str3;
                    e5.p = str9;
                    e5.t = 4;
                    objJ = h5.s(str9, e5);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                    str10 = str7;
                    h6 = h5;
                    str11 = str3;
                } else {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str17 = (String) e5.p;
                    str11 = e5.f229o;
                    str2 = e5.n;
                    String str18 = (String) e5.m;
                    h6 = e5.l;
                    Jp0.O(objJ);
                    str9 = str17;
                    c1722hq = c1722hq2;
                    str10 = str18;
                    str4 = "";
                    z = true;
                }
                str12 = (String) objJ;
                if (str12 == null) {
                    z = false;
                }
                if (z) {
                    if (str12 == null) {
                        str13 = str4;
                    } else {
                        str13 = str12;
                    }
                    h6.getClass();
                    setR2 = r(str9, str13);
                } else {
                    setR2 = c1722hq;
                }
                EventLog.writeEvent(1397638484, "claroar_manifest|source=fresh|mpd=" + z + "|kids=" + setR2.size());
                if (z) {
                    throw new IOException("Claro no devolvió un manifiesto DASH válido");
                }
                h6.getClass();
                C3207x5 c3207x6 = (C3207x5) rh0.getValue();
                C2916u5 c2916u6 = new C2916u5(str10, str9, "dash", System.currentTimeMillis());
                f81 = c3207x6.a;
                f81.b();
                f81.c();
                try {
                    c3207x6.b.h(c2916u6);
                    f81.m();
                    f81.j();
                    EventLog.writeEvent(1397638484, "claroar_cache|write=true");
                    return p(str9, str2, str11, setR2);
                } catch (Throwable th3) {
                    f81.j();
                    throw th3;
                }
            }
            Jp0.O(objJ);
            String str19 = ds1.l;
            e5.l = this;
            e5.m = ds1;
            e5.n = str19;
            e5.t = 1;
            if (o(str19, e5) == enumC1706hi) {
                return enumC1706hi;
            }
            h5 = this;
            str = str19;
            Integer num = (Integer) g.get(str);
            if (num == null) {
                throw new Exception(AbstractC1701hf0.t("group_id no encontrado para ", str));
            }
            iIntValue = num.intValue();
            str2 = (String) h.get(str);
            if (str2 == null) {
                throw new Exception(AbstractC1701hf0.t("key_pair no encontrado para ", str));
            }
            str3 = (String) f.get(str);
            if (str3 == null) {
                str3 = ds1.m;
            }
            h5.getClass();
            C3207x5 c3207x7 = (C3207x5) rh0.getValue();
            c3207x7.getClass();
            G80 g80A = G80.a(1, "SELECT * FROM ar_dash_cache WHERE channelId = ? LIMIT 1");
            g80A.o(1, str);
            F80 f82 = c3207x7.a;
            f82.b();
            Cursor cursorW = U9.w(f82, g80A);
            try {
                c1722hq = c1722hq2;
                str4 = "";
                C2916u5 c2916u7 = cursorW.moveToFirst() ? new C2916u5(cursorW.getString(AbstractC3409z9.m(cursorW, "channelId")), cursorW.getString(AbstractC3409z9.m(cursorW, "dashUrl")), cursorW.getString(AbstractC3409z9.m(cursorW, "streamType")), cursorW.getLong(AbstractC3409z9.m(cursorW, "savedAt"))) : null;
                cursorW.close();
                g80A.l();
                if (c2916u7 != null) {
                    EventLog.writeEvent(1397638484, "claroar_cache|read=true");
                    if (!AbstractC1899jh0.N(c2916u7.c, "hls", true)) {
                        e5.l = h5;
                        e5.m = str;
                        e5.n = str2;
                        e5.f229o = str3;
                        e5.p = c2916u7;
                        e5.q = iIntValue;
                        e5.t = 2;
                        Object objS = h7.s(c2916u7.b, e5);
                        if (objS == enumC1706hi) {
                            return enumC1706hi;
                        }
                        str5 = str3;
                        str6 = str2;
                        c2916u5 = c2916u7;
                        i2 = iIntValue;
                        objJ = objS;
                        str8 = (String) objJ;
                        if (str8 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            String str110 = c2916u5.b;
                            if (str8 == null) {
                                str8 = str4;
                            }
                            setR = r(str110, str8);
                        } else {
                            setR = c1722hq;
                        }
                        EventLog.writeEvent(1397638484, "claroar_manifest|source=cache|mpd=" + z2 + "|kids=" + setR.size());
                        if (z2) {
                            return p(c2916u5.b, str6, str5, setR);
                        }
                        iIntValue = i2;
                        str2 = str6;
                        str3 = str5;
                    }
                    C3207x5 c3207x8 = (C3207x5) rh0.getValue();
                    f80 = c3207x8.a;
                    f80.b();
                    c3110w5 = c3207x8.c;
                    c3485zyA = c3110w5.a();
                    z = true;
                    c3485zyA.o(1, str);
                    f80.c();
                    c3485zyA.f();
                    f80.m();
                    f80.j();
                    c3110w5.d(c3485zyA);
                } else {
                    z = true;
                }
                EventLog.writeEvent(1397638484, "claroar_api|getmedia=true");
                C1600ge c1600ge2 = C1600ge.a;
                e5.l = h5;
                e5.m = str;
                e5.n = str2;
                e5.f229o = str3;
                e5.p = null;
                e5.t = 3;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1307de(iIntValue, null), e5);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                str7 = str;
                str9 = ((C0858Wd) objJ).a;
                EventLog.writeEvent(1397638484, "claroar_api|success=true");
                e5.l = h5;
                e5.m = str7;
                e5.n = str2;
                e5.f229o = str3;
                e5.p = str9;
                e5.t = 4;
                objJ = h5.s(str9, e5);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                str10 = str7;
                h6 = h5;
                str11 = str3;
                str12 = (String) objJ;
                if (str12 == null) {
                    z = false;
                }
                if (z) {
                    if (str12 == null) {
                        str13 = str4;
                    } else {
                        str13 = str12;
                    }
                    h6.getClass();
                    setR2 = r(str9, str13);
                } else {
                    setR2 = c1722hq;
                }
                EventLog.writeEvent(1397638484, "claroar_manifest|source=fresh|mpd=" + z + "|kids=" + setR2.size());
                if (z) {
                    throw new IOException("Claro no devolvió un manifiesto DASH válido");
                }
                h6.getClass();
                C3207x5 c3207x9 = (C3207x5) rh0.getValue();
                C2916u5 c2916u8 = new C2916u5(str10, str9, "dash", System.currentTimeMillis());
                f81 = c3207x9.a;
                f81.b();
                f81.c();
                c3207x9.b.h(c2916u8);
                f81.m();
                f81.j();
                EventLog.writeEvent(1397638484, "claroar_cache|write=true");
                return p(str9, str2, str11, setR2);
            } catch (Throwable th4) {
                cursorW.close();
                g80A.l();
                throw th4;
            }
        } catch (Exception e2) {
            EventLog.writeEvent(1397638484, "claroar_api|success=false");
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        F5 f5;
        YS ys;
        Throwable th;
        VS vs;
        VS vs2;
        VS vs3;
        if (interfaceC0473Hh instanceof F5) {
            f5 = (F5) interfaceC0473Hh;
            int i2 = f5.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f5.p = i2 - Integer.MIN_VALUE;
            } else {
                f5 = new F5(this, interfaceC0473Hh);
            }
        } else {
            f5 = new F5(this, interfaceC0473Hh);
        }
        Object obj = f5.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = f5.p;
        LinkedHashMap linkedHashMap = h;
        LinkedHashMap linkedHashMap2 = g;
        C2985uq0 c2985uq0 = C2985uq0.a;
        try {
            if (i3 == 0) {
                Jp0.O(obj);
                if (!AbstractC1899jh0.U(str, "claroar-", false)) {
                    return c2985uq0;
                }
                if (linkedHashMap2.containsKey(str) && linkedHashMap.containsKey(str)) {
                    return c2985uq0;
                }
                f5.l = str;
                YS ys2 = i;
                f5.m = ys2;
                f5.p = 1;
                Object objD = ys2.d(null, f5);
                ys = ys2;
                if (objD == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs = (VS) f5.l;
                    try {
                        Jp0.O(obj);
                        vs2 = vs;
                        vs3 = vs2;
                        vs3 = ys;
                        ((YS) vs3).e(null);
                        return c2985uq0;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs).e(null);
                        throw th;
                    }
                }
                YS ys3 = f5.m;
                String str2 = (String) f5.l;
                Jp0.O(obj);
                ys = ys3;
                str = str2;
            }
            if (linkedHashMap2.containsKey(str)) {
                if (!linkedHashMap.containsKey(str)) {
                    vs3 = ys;
                }
                vs3 = ys;
                ((YS) vs3).e(null);
                return c2985uq0;
            }
            H5 h5 = b;
            f5.l = ys;
            f5.m = null;
            f5.p = 2;
            if (h5.g(f5) == enumC1706hi) {
                return enumC1706hi;
            }
            vs2 = ys;
            vs3 = vs2;
            vs3 = ys;
            ((YS) vs3).e(null);
            return c2985uq0;
        } catch (Throwable th3) {
            YS ys4 = ys;
            th = th3;
            vs = ys4;
            ((YS) vs).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:18:0x0075, B:20:0x007b, B:22:0x007f), top: B:54:0x0075, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ac -> B:52:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00bf -> B:51:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(java.lang.String r12, o.InterfaceC0473Hh r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof o.G5
            if (r0 == 0) goto L13
            r0 = r13
            o.G5 r0 = (o.G5) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.G5 r0 = new o.G5
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f271o
            o.hi r1 = o.EnumC1706hi.l
            int r2 = r0.q
            r3 = 1
            r4 = 3
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r12 = r0.n
            int r2 = r0.m
            java.lang.String r5 = r0.l
            o.Jp0.O(r13)
            goto Lc0
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            o.Jp0.O(r13)
            r13 = 0
            r13 = r12
            r12 = 0
            r2 = 3
        L3e:
            r5 = 0
            if (r12 >= r2) goto Lc4
            o.OV r6 = o.H5.d     // Catch: java.lang.Throwable -> L8b
            o.Kq r7 = new o.Kq     // Catch: java.lang.Throwable -> L8b
            r7.<init>()     // Catch: java.lang.Throwable -> L8b
            r7.u(r13)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = "User-Agent"
            java.lang.String r9 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"
            r7.j(r8, r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = "Origin"
            java.lang.String r9 = "https://www.clarovideo.com"
            r7.j(r8, r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = "Referer"
            java.lang.String r9 = "https://www.clarovideo.com/"
            r7.j(r8, r9)     // Catch: java.lang.Throwable -> L8b
            o.k70 r7 = r7.c()     // Catch: java.lang.Throwable -> L8b
            o.A50 r6 = r6.c(r7)     // Catch: java.lang.Throwable -> L8b
            o.z50 r7 = r6.q     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L8b
            r9 = 5
            r7.g(r9, r8)     // Catch: java.lang.Throwable -> L8b
            o.j80 r6 = r6.g()     // Catch: java.lang.Throwable -> L8b
            boolean r7 = r6.p()     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L86
            o.l80 r7 = r6.r     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L86
            java.lang.String r7 = r7.q()     // Catch: java.lang.Throwable -> L84
            goto L87
        L84:
            r7 = move-exception
            goto L8d
        L86:
            r7 = r5
        L87:
            o.AbstractC3409z9.g(r6, r5)     // Catch: java.lang.Throwable -> L8b
            goto L97
        L8b:
            r6 = move-exception
            goto L93
        L8d:
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r8 = move-exception
            o.AbstractC3409z9.g(r6, r7)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L93:
            o.p80 r7 = o.Jp0.k(r6)
        L97:
            boolean r6 = r7 instanceof o.C2439p80
            if (r6 == 0) goto L9c
            goto L9d
        L9c:
            r5 = r7
        L9d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Laa
            java.lang.String r6 = "<MPD"
            boolean r6 = o.AbstractC1119bh0.W(r5, r6, r3)
            if (r6 != r3) goto Laa
            return r5
        Laa:
            int r5 = r12 + 1
            if (r5 >= r4) goto Lc1
            r0.l = r13
            r0.m = r2
            r0.n = r12
            r0.q = r3
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = o.AbstractC1376eG.q(r5, r0)
            if (r5 != r1) goto Lbf
            return r1
        Lbf:
            r5 = r13
        Lc0:
            r13 = r5
        Lc1:
            int r12 = r12 + r3
            goto L3e
        Lc4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.H5.s(java.lang.String, o.Hh):java.lang.Object");
    }
}
