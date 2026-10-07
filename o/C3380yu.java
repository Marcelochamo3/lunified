package o;

import android.net.Uri;
import android.util.Base64;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3380yu extends AbstractC3473zs {
    public static volatile C2701ru e;
    public static volatile String f;
    public static volatile String g;
    public static volatile C1101bX h;
    public static volatile String i;
    public static final List j = AbstractC0937Ze.K("https://apis-data10.tcore131ybdf.ru", "https://apis-data-defra10.tcore131ybdf.ru");
    public static final Map k = AbstractC3327yN.z(new C1101bX("football", 1), new C1101bX("basketball", 2), new C1101bX("tennis", 3), new C1101bX("baseball", 4), new C1101bX("cricket", 6), new C1101bX("motorsport", 7), new C1101bX("rugby", 8), new C1101bX("american-football", 9), new C1101bX("aussie-rules", 10), new C1101bX("hockey", 11), new C1101bX("badminton", 12), new C1101bX("volleyball", 13), new C1101bX("fighting", 14), new C1101bX("cycling", 15), new C1101bX("handball", 16), new C1101bX("other", 90), new C1101bX("others", 90));
    public static final Map l = AbstractC3327yN.z(new C1101bX(1, "Fútbol"), new C1101bX(2, "Baloncesto"), new C1101bX(3, "Tenis"), new C1101bX(4, "Béisbol"), new C1101bX(6, "Cricket"), new C1101bX(7, "Motor"), new C1101bX(8, "Rugby"), new C1101bX(9, "Fútbol Americano"), new C1101bX(10, "Aussie Rules"), new C1101bX(11, "Hockey"), new C1101bX(12, "Bádminton"), new C1101bX(13, "Voleibol"), new C1101bX(14, "Boxeo / MMA"), new C1101bX(15, "Ciclismo"), new C1101bX(16, "Balonmano"), new C1101bX(90, "Otros"));
    public static volatile List m;
    public final List b = AbstractC0937Ze.K("https://www.fctv33hd.garden", "https://fctv33hd.garden");
    public final List c = AbstractC2506pt.A(new I60("mp\\d+[a-z0-9]+\\.my"));
    public final OV d;

    public C3380yu() {
        C3084vr0 c3084vr0 = C3084vr0.a;
        NV nvO = AbstractC1701hf0.o();
        X9 x9 = Sr0.a;
        ArrayList arrayList = nvO.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nvO.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvO);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvO.e(20L, timeUnit);
        nvO.i(20L, timeUnit);
        nvO.h = true;
        this.d = new OV(nvO);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    public static final Js0 f(C3380yu c3380yu, String str) {
        Object objK;
        String str2;
        JN jnA;
        Integer numValueOf;
        String str3;
        Integer numJ;
        String str4;
        Integer numJ2;
        String lowerCase;
        c3380yu.getClass();
        try {
            Uri uri = Uri.parse(str);
            objK = uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = str;
        }
        String str5 = (String) objK;
        String strL = c3380yu.l(str, str5);
        try {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            AbstractC1474fG.g(pathSegments);
            String str6 = (String) AbstractC0911Ye.e0(2, pathSegments);
            if (str6 == null) {
                str6 = (String) AbstractC0911Ye.j0(pathSegments);
            }
            I60 i60 = new I60("\\d+");
            if (str6 == null) {
                str6 = "";
            }
            List listQ = Vb0.Q(Vb0.M(I60.c(i60, str6), E1.A));
            if (!listQ.isEmpty()) {
                str2 = (String) AbstractC0911Ye.i0(listQ);
            } else if (strL == null || (jnA = AbstractC1370eA.a(AbstractC1701hf0.m("\"?matchId\"?\\s*:\\s*\"?(\\d{4,})\"?", "compile(...)", strL, "matcher(...)"), 0, strL)) == null || (str2 = (String) ((HN) jnA.a()).get(1)) == null) {
                str2 = null;
            }
        } catch (Throwable th2) {
            Jp0.k(th2);
        }
        if (str2 == null) {
            return null;
        }
        try {
            List<String> pathSegments2 = Uri.parse(str).getPathSegments();
            AbstractC1474fG.i(pathSegments2, "getPathSegments(...)");
            String str7 = (String) AbstractC0911Ye.e0(1, pathSegments2);
            if (str7 != null) {
                lowerCase = str7.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            Integer num = (Integer) k.get(lowerCase);
            if (num != null) {
                numValueOf = Integer.valueOf(num.intValue());
            } else if (strL == null) {
                numValueOf = null;
            } else {
                JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("\"?sportType\"?\\s*:\\s*\"?(\\d+)\"?", "compile(...)", strL, "matcher(...)"), 0, strL);
                if (jnA2 == null || (str4 = (String) ((HN) jnA2.a()).get(1)) == null || (numJ2 = AbstractC1802ih0.J(str4)) == null) {
                    JN jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("void 0[x0-9]*,\\s*\\d+,\\s*(\\d+),\\s*\"", "compile(...)", strL, "matcher(...)"), 0, strL);
                    if (jnA3 == null || (str3 = (String) ((HN) jnA3.a()).get(1)) == null || (numJ = AbstractC1802ih0.J(str3)) == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(numJ.intValue());
                    }
                } else {
                    numValueOf = Integer.valueOf(numJ2.intValue());
                }
            }
        } catch (Throwable th3) {
            Jp0.k(th3);
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        List listO = o(strL);
        if (!listO.isEmpty()) {
            m = listO;
        }
        ArrayList arrayListM0 = AbstractC0911Ye.m0(c3380yu.r().b, listO);
        Iterable iterable = m;
        if (iterable == null) {
            iterable = C1233cq.l;
        }
        return c3380yu.s(iIntValue, str2, str5, AbstractC0911Ye.X(AbstractC0911Ye.m0(AbstractC0911Ye.m0(arrayListM0, iterable), j)));
    }

    public static String m(String str) {
        Object objK;
        String str2;
        if (str == null || AbstractC1899jh0.O(str) || !AbstractC1899jh0.U(str, "http", false)) {
            return null;
        }
        try {
            List list = m;
            if (list == null || (str2 = (String) AbstractC0911Ye.d0(list)) == null) {
                str2 = (String) AbstractC0911Ye.b0(j);
            }
            String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.x0(str2, "://", str2), "/");
            String strX0 = AbstractC1119bh0.x0(strB0, ".", strB0);
            String encodedPath = Uri.parse(str).getEncodedPath();
            if (encodedPath == null) {
                return null;
            }
            objK = "https://logos1." + strX0 + encodedPath;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return (String) (objK instanceof C2439p80 ? null : objK);
    }

    public static List o(String str) {
        return str == null ? C1233cq.l : Vb0.Q(new C2591qn(Vb0.M(I60.c(new I60("apis-data(?:-defra)?\\d*\\.[a-z0-9.]+\\.[a-z]+"), str), E1.z), X10.v, 0));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    public static ArrayList p(byte[] bArr) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        String strN;
        ArrayList arrayList = new ArrayList();
        Iterator it = new C2605qu(0, bArr).a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C2411ou) next).a != 10);
        C2411ou c2411ou = (C2411ou) next;
        if (c2411ou != null) {
            ArrayList arrayListA = new C2605qu(0, c2411ou.a()).a();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListA) {
                if (((C2411ou) obj).a == 2) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2++;
                ArrayList arrayListA2 = new C2605qu(0, ((C2411ou) it2.next()).a()).a();
                Iterator it3 = arrayListA2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((C2411ou) next2).a != 1);
                C2411ou c2411ou2 = (C2411ou) next2;
                if (c2411ou2 != null) {
                    Iterator it4 = arrayListA2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                    } while (((C2411ou) next3).a != 9);
                    C2411ou c2411ou3 = (C2411ou) next3;
                    if (c2411ou3 != null) {
                        Iterator it5 = arrayListA2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it5.next();
                            C2411ou c2411ou4 = (C2411ou) next4;
                            if (c2411ou4.a == 3 && c2411ou4.b == 2) {
                                break;
                            }
                        }
                        C2411ou c2411ou5 = (C2411ou) next4;
                        if (c2411ou5 != null) {
                            strN = c2411ou5.b();
                            if (!(true ^ AbstractC1899jh0.O(strN))) {
                                strN = null;
                            }
                            if (strN == null) {
                                strN = AbstractC1674hK.n(i2, "Servidor ");
                            }
                        } else {
                            strN = AbstractC1674hK.n(i2, "Servidor ");
                        }
                        arrayList.add(new C2798su(c2411ou2.c, c2411ou3.c, strN));
                    }
                }
            }
        }
        return arrayList;
    }

    public static String u(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' <= cCharAt && cCharAt < 127) {
                cCharAt = (char) (((cCharAt + 14) % 94) + 33);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2895tu(str, this, null), interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://jack01eo.mp771987cdm.my";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Fctv33";
    }

    @Override // o.AbstractC3473zs
    public final List e() {
        return this.c;
    }

    public final Js0 g(String str) {
        String strQ = q();
        return new Js0(str, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Mobile Safari/537.36"), new C1101bX("Referer", strQ), new C1101bX("Origin", AbstractC1119bh0.G0(strQ, '/')), new C1101bX("Accept", "*/*"), new C1101bX("sec-ch-ua", "\"Chromium\";v=\"146\", \"Not-A.Brand\";v=\"24\", \"Google Chrome\";v=\"146\""), new C1101bX("sec-ch-ua-mobile", "?1"), new C1101bX("sec-ch-ua-platform", "\"Android\"")), "hls", (String) null, (String) null, (byte[]) null, (String) null, strQ, (String) null, (List) null, false, 3960);
    }

    public final String h() {
        Object objK;
        try {
            String str = r().a;
            if (str == null) {
                str = "https://www.fctv33hd.garden/es";
            }
            Uri uri = Uri.parse(str);
            objK = uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = "https://www.fctv33hd.garden";
        }
        return (String) objK;
    }

    public final C1101bX i() {
        Object objK;
        Object objK2;
        int i2 = 2;
        int i3 = 1;
        String strL = g;
        if (strL == null) {
            strL = l(AbstractC1701hf0.d(AbstractC1119bh0.G0(q(), '/'), "/player.html"), h());
            if (strL != null) {
                g = strL;
            } else {
                strL = null;
            }
        }
        String strL2 = f;
        if (strL2 == null) {
            String str = r().a;
            if (str == null) {
                str = "https://www.fctv33hd.garden/es";
            }
            strL2 = l(str, h());
            if (strL2 != null) {
                f = strL2;
            } else {
                strL2 = null;
            }
        }
        ArrayList<String> arrayListP = X5.P(new String[]{strL, strL2});
        ArrayList arrayList = new ArrayList();
        for (String str2 : arrayListP) {
            C3074vm0 c3074vm0M = Vb0.M(I60.c(new I60("https?://[a-z0-9.\\-]+/statics/[a-z0-9]+\\.js"), str2), E1.w);
            C3074vm0 c3074vm0M2 = Vb0.M(I60.c(new I60("(?<!:)//[a-z0-9.\\-]+/statics/[a-z0-9]+\\.js"), str2), E1.x);
            JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("https?://statics[0-9]*\\.[a-z0-9.\\-]+", "compile(...)", str2, "matcher(...)"), 0, str2);
            Rb0 rb0M = jnA != null ? Vb0.M(I60.c(new I60("/statics/[a-z0-9]+\\.js"), str2), new C5(jnA.c(), i3)) : C1624gq.a;
            Rb0 rb0O = Vb0.O(c3074vm0M, c3074vm0M2);
            X10 x10 = X10.s;
            AbstractC1406ef.Q(arrayList, Vb0.Q(new C2591qn(Vb0.J(Vb0.O(Vb0.J(rb0O, x10), rb0M), x10), X10.v, 0)));
        }
        Iterator it = AbstractC0911Ye.X(arrayList).iterator();
        while (it.hasNext()) {
            String strL3 = l((String) it.next(), h());
            if (strL3 != null) {
                int iE0 = AbstractC1119bh0.e0(strL3, "/token-", 0, false, 6);
                while (iE0 >= 0) {
                    int i4 = iE0 + 700;
                    int length = strL3.length();
                    if (i4 > length) {
                        i4 = length;
                    }
                    String strSubstring = strL3.substring(iE0, i4);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    List listQ = Vb0.Q(Vb0.M(I60.c(new I60("atob\\('([A-Za-z0-9+/=]+)'\\)"), strSubstring), E1.v));
                    if (listQ.size() >= i2) {
                        try {
                            byte[] bArrDecode = Base64.decode((String) listQ.get(0), 0);
                            AbstractC1474fG.i(bArrDecode, "decode(...)");
                            objK = new String(bArrDecode, AbstractC1305dd.a);
                        } catch (Throwable th) {
                            objK = Jp0.k(th);
                        }
                        if (objK instanceof C2439p80) {
                            objK = null;
                        }
                        String str3 = (String) objK;
                        try {
                            byte[] bArrDecode2 = Base64.decode((String) listQ.get(1), 0);
                            AbstractC1474fG.i(bArrDecode2, "decode(...)");
                            objK2 = new String(bArrDecode2, AbstractC1305dd.a);
                        } catch (Throwable th2) {
                            objK2 = Jp0.k(th2);
                        }
                        if (objK2 instanceof C2439p80) {
                            objK2 = null;
                        }
                        String str4 = (String) objK2;
                        if (str3 != null && str4 != null) {
                            int[] iArr = {16, 24, 32};
                            int length2 = str3.length();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= 3) {
                                    i5 = -1;
                                    break;
                                }
                                if (length2 == iArr[i5]) {
                                    break;
                                }
                                i5++;
                            }
                            if ((i5 >= 0) && str4.length() == 16) {
                                return new C1101bX(str3, str4);
                            }
                        }
                    }
                    iE0 = AbstractC1119bh0.e0(strL3, "/token-", iE0 + 1, false, 4);
                    i2 = 2;
                }
            }
        }
        return null;
    }

    public final byte[] j(String str, String str2) {
        return (byte[]) k(str, str2, null).l;
    }

    public final C1101bX k(String str, String str2, String str3) {
        Object objK;
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            c0560Kq.j("Origin", AbstractC1119bh0.G0(str2, '/'));
            c0560Kq.j("Referer", AbstractC1119bh0.G0(str2, '/') + "/");
            c0560Kq.j("Cache-Control", "no-cache");
            c0560Kq.j("Pragma", "no-cache");
            C1855j80 c1855j80G = this.d.c(c0560Kq.c()).g();
            try {
                if (!c1855j80G.p()) {
                    C1101bX c1101bX = new C1101bX(null, null);
                    AbstractC3409z9.g(c1855j80G, null);
                    return c1101bX;
                }
                String strF = str3 != null ? c1855j80G.f(str3, null) : null;
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                objK = new C1101bX(abstractC2051l80 != null ? abstractC2051l80.f() : null, strF);
                AbstractC3409z9.g(c1855j80G, null);
                if (C2536q80.a(objK) != null) {
                    objK = new C1101bX(null, null);
                }
                return (C1101bX) objK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
    }

    public final String l(String str, String str2) {
        Object objK;
        Object obj = null;
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            c0560Kq.j("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            c0560Kq.j("Accept-Language", "es-419,es;q=0.9,en;q=0.8");
            c0560Kq.j("Referer", str2);
            C1855j80 c1855j80G = this.d.c(c0560Kq.c()).g();
            try {
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                objK = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                AbstractC3409z9.g(c1855j80G, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objK = Jp0.k(th3);
        }
        Throwable thA = C2536q80.a(objK);
        if (thA == null) {
            obj = objK;
        } else {
            thA.getMessage();
        }
        return (String) obj;
    }

    public final C1101bX n() {
        Object objK;
        C1101bX c1101bX;
        String str;
        C1101bX c1101bX2 = h;
        if (c1101bX2 != null) {
            return c1101bX2;
        }
        C2701ru c2701ruR = r();
        String str2 = c2701ruR.f;
        if (str2 == null || (str = c2701ruR.g) == null) {
            try {
                objK = i();
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (objK instanceof C2439p80) {
                objK = null;
            }
            c1101bX = (C1101bX) objK;
            if (c1101bX == null) {
                c1101bX = new C1101bX("a7981cc9eb2f4d19dcfea57b101ecd89", "8017d3a8f1400d2f");
            }
        } else {
            c1101bX = new C1101bX(str2, str);
        }
        h = c1101bX;
        AbstractC1119bh0.D0(6, (String) c1101bX.l);
        AbstractC1119bh0.D0(4, (String) c1101bX.m);
        return c1101bX;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:10:0x0019, B:13:0x003f, B:15:0x0069, B:17:0x006f, B:21:0x0075, B:23:0x008a, B:28:0x00b9, B:30:0x00d2, B:25:0x0098, B:27:0x00ac), top: B:44:0x0019 }] */
    public final String q() {
        Object objK;
        String strU;
        JN jnA;
        ZF zfB;
        String str = i;
        if (str != null) {
            return str;
        }
        String str2 = r().e;
        if (str2 != null) {
            i = str2;
            return str2;
        }
        try {
            byte[] bArrJ = j(AbstractC0911Ye.b0(t()) + "/api/common/params", h());
            if (bArrJ == null) {
                objK = null;
            } else {
                String strR = AbstractC1899jh0.R(u(new String(bArrJ, AbstractC1305dd.a)), "\\\"", "\"", false);
                Pattern patternCompile = Pattern.compile("\"seth\"\\s*:\\s*\\{");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strR);
                AbstractC1474fG.i(matcher, "matcher(...)");
                JN jnA2 = AbstractC1370eA.a(matcher, 0, strR);
                int i2 = (jnA2 == null || (zfB = jnA2.b()) == null) ? 0 : zfB.m;
                Pattern patternCompile2 = Pattern.compile("\"iframePlayerDomains\"\\s*:\\s*\\[([^\\]]*)\\]");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                Matcher matcher2 = patternCompile2.matcher(strR);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                JN jnA3 = AbstractC1370eA.a(matcher2, i2, strR);
                if (jnA3 == null || (str = (String) ((HN) jnA3.a()).get(1)) == null) {
                    Pattern patternCompile3 = Pattern.compile("\"iframePlayerDomains\"\\s*:\\s*\\[([^\\]]*)\\]");
                    AbstractC1474fG.i(patternCompile3, "compile(...)");
                    Matcher matcher3 = patternCompile3.matcher(strR);
                    AbstractC1474fG.i(matcher3, "matcher(...)");
                    JN jnA4 = AbstractC1370eA.a(matcher3, 0, strR);
                    if (jnA4 != null) {
                        String str3 = (String) ((HN) jnA4.a()).get(1);
                        Pattern patternCompile4 = Pattern.compile("\"([a-z0-9.-]+\\.[a-z]{2,})\"");
                        AbstractC1474fG.i(patternCompile4, "compile(...)");
                        AbstractC1474fG.j(str3, "input");
                        Matcher matcher4 = patternCompile4.matcher(str3);
                        AbstractC1474fG.i(matcher4, "matcher(...)");
                        jnA = AbstractC1370eA.a(matcher4, 0, str3);
                        if (jnA != null) {
                            objK = (String) ((HN) jnA.a()).get(1);
                        } else {
                            objK = null;
                        }
                    } else {
                        objK = null;
                    }
                } else {
                    Pattern patternCompile5 = Pattern.compile("\"([a-z0-9.-]+\\.[a-z]{2,})\"");
                    AbstractC1474fG.i(patternCompile5, "compile(...)");
                    AbstractC1474fG.j(str3, "input");
                    Matcher matcher5 = patternCompile5.matcher(str3);
                    AbstractC1474fG.i(matcher5, "matcher(...)");
                    jnA = AbstractC1370eA.a(matcher5, 0, str3);
                    if (jnA != null) {
                        objK = (String) ((HN) jnA.a()).get(1);
                    } else {
                        objK = null;
                    }
                }
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        String str4 = (String) (objK instanceof C2439p80 ? null : objK);
        if (str4 == null || (strU = AbstractC1701hf0.u("https://", str4, "/")) == null) {
            strU = "https://zac07eo.mpipzni2naturally32kistomach.ru/";
        }
        i = strU;
        return strU;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    public final C2701ru r() {
        Object objK;
        List list;
        Integer num;
        Long lValueOf;
        C1233cq c1233cq = C1233cq.l;
        C2701ru c2701ru = e;
        if (c2701ru != null) {
            return c2701ru;
        }
        try {
            String strL = l("https://raw.githubusercontent.com/sudamericaplay/digital_tv_normal/refs/heads/main/fc.json", "https://raw.githubusercontent.com/sudamericaplay/digital_tv_normal/refs/heads/main/fc.json");
            if (strL == null) {
                objK = null;
            } else {
                JSONObject jSONObject = new JSONObject(strL);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live");
                String strOptString = jSONObject.optString("page");
                AbstractC1474fG.g(strOptString);
                String str = AbstractC1899jh0.U(strOptString, "http", false) ? strOptString : null;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("apiBases");
                if (jSONArrayOptJSONArray != null) {
                    ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList();
                    YF it = zfL.iterator();
                    while (it.n) {
                        String strOptString2 = jSONArrayOptJSONArray.optString(it.a());
                        AbstractC1474fG.g(strOptString2);
                        if (!AbstractC1899jh0.U(strOptString2, "http", false)) {
                            strOptString2 = null;
                        }
                        if (strOptString2 != null) {
                            arrayList.add(strOptString2);
                        }
                    }
                    list = arrayList;
                } else {
                    list = c1233cq;
                }
                int i2 = -1;
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("statusField", -1);
                    Integer numValueOf = Integer.valueOf(iOptInt);
                    if (iOptInt >= 0) {
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                } else {
                    num = null;
                }
                if (jSONObjectOptJSONObject == null) {
                    lValueOf = null;
                } else {
                    if (!jSONObjectOptJSONObject.has("finishThreshold")) {
                        jSONObjectOptJSONObject = null;
                    }
                    if (jSONObjectOptJSONObject != null) {
                        lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("finishThreshold"));
                    } else {
                        lValueOf = null;
                    }
                }
                String strOptString3 = jSONObject.optString("playerReferer");
                AbstractC1474fG.g(strOptString3);
                String str2 = AbstractC1899jh0.U(strOptString3, "http", false) ? strOptString3 : null;
                String strOptString4 = jSONObject.optString("hlsKey");
                int[] iArr = {16, 24, 32};
                int length = strOptString4.length();
                for (int i3 = 0; i3 < 3; i3++) {
                    if (length == iArr[i3]) {
                        i2 = i3;
                        break;
                    }
                }
                String str3 = i2 >= 0 ? strOptString4 : null;
                String strOptString5 = jSONObject.optString("hlsIv");
                objK = new C2701ru(str, list, num, lValueOf, str2, str3, strOptString5.length() == 16 ? strOptString5 : null);
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2701ru c2701ru2 = (C2701ru) (objK instanceof C2439p80 ? null : objK);
        if (c2701ru2 == null) {
            c2701ru2 = new C2701ru(null, c1233cq, null, null, null, null, null);
        }
        e = c2701ru2;
        c2701ru2.b.size();
        return c2701ru2;
    }

    public final Js0 s(int i2, String str, String str2, List list) {
        String strW;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            byte[] bArrJ = j(str3 + "/api/match/detail?matchId=" + str + "&sportType=" + i2 + "&language=4&stream=true", str2);
            if (bArrJ != null) {
                ArrayList<C2798su> arrayListP = p(bArrJ);
                if (arrayListP.isEmpty()) {
                    continue;
                } else {
                    arrayListP.size();
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListP, 10));
                    Iterator it2 = arrayListP.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C2798su) it2.next()).c);
                    }
                    arrayList.toString();
                    ArrayList<C1101bX> arrayList2 = new ArrayList(AbstractC1016af.O(arrayListP, 10));
                    for (C2798su c2798su : arrayListP) {
                        arrayList2.add(new C1101bX(Long.valueOf(c2798su.a), Long.valueOf(c2798su.b)));
                    }
                    for (C1101bX c1101bX : arrayList2) {
                        C1101bX c1101bXV = v(str3, str, i2, ((Number) c1101bX.l).longValue(), ((Number) c1101bX.m).longValue(), str2);
                        if (c1101bXV != null) {
                            String str4 = (String) c1101bXV.l;
                            String str5 = (String) c1101bXV.m;
                            if (str5 != null && (strW = w(str4, str5)) != null) {
                                str4 = strW;
                            }
                            return g(str4);
                        }
                    }
                }
            }
        }
        return null;
    }

    public final List t() {
        List list = r().b;
        List list2 = m;
        if (list2 != null) {
            return AbstractC0911Ye.X(AbstractC0911Ye.m0(AbstractC0911Ye.m0(list, list2), j));
        }
        String strL = f;
        if (strL == null) {
            String str = r().a;
            if (str == null) {
                str = "https://www.fctv33hd.garden/es";
            }
            strL = l(str, h());
            if (strL != null) {
                f = strL;
            } else {
                strL = null;
            }
        }
        List listO = o(strL);
        if (!listO.isEmpty()) {
            m = listO;
        }
        return AbstractC0911Ye.X(AbstractC0911Ye.m0(AbstractC0911Ye.m0(list, listO), j));
    }

    public final C1101bX v(String str, String str2, int i2, long j2, long j3, String str3) {
        Object next;
        String strC;
        Object next2;
        for (String str4 : AbstractC0937Ze.K("&continent=SA&country=US", "&continent=EU&country=US", "")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ZF zf = new ZF(0, 999999, 1);
            C1947k50 c1947k50 = AbstractC2045l50.l;
            AbstractC1474fG.j(c1947k50, "random");
            try {
                C1101bX c1101bXK = k(str + "/api/stream/detail?matchId=" + str2 + "&sportType=" + i2 + "&streamId=" + j2 + "&usls=rbp&siteType=" + j3 + str4 + ("&rbcb=" + jCurrentTimeMillis + AbstractC3409z9.t(c1947k50, zf)), str3, "rb-session");
                byte[] bArr = (byte[]) c1101bXK.l;
                String str5 = (String) c1101bXK.m;
                if (bArr != null) {
                    Iterator it = new C2605qu(0, bArr).a().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C2411ou) next).a != 10);
                    C2411ou c2411ou = (C2411ou) next;
                    if (c2411ou == null) {
                        strC = null;
                        break;
                    }
                    ArrayList arrayListA = new C2605qu(0, c2411ou.a()).a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : arrayListA) {
                        if (((C2411ou) obj).a == 2) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            strC = null;
                            break;
                        }
                        Iterator it3 = new C2605qu(0, ((C2411ou) it2.next()).a()).a().iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (((C2411ou) next2).a != 4);
                        C2411ou c2411ou2 = (C2411ou) next2;
                        if (c2411ou2 != null) {
                            String strB = c2411ou2.b();
                            Pattern patternCompile = Pattern.compile("https?://[^\\s\"'<>]+\\.m3u8[^\\s\"'<>]*");
                            AbstractC1474fG.i(patternCompile, "compile(...)");
                            String strU = u(strB);
                            Matcher matcher = patternCompile.matcher(strU);
                            AbstractC1474fG.i(matcher, "matcher(...)");
                            JN jnA = AbstractC1370eA.a(matcher, 0, strU);
                            if (jnA != null) {
                                strC = jnA.c();
                                break;
                            }
                        }
                    }
                    if (strC != null) {
                        return new C1101bX(strC, str5);
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }
        return null;
    }

    public final String w(String str, String str2) {
        String str3;
        String strConcat;
        try {
            C1101bX c1101bXN = n();
            String str4 = (String) c1101bXN.l;
            String str5 = (String) c1101bXN.m;
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            Charset charset = AbstractC1305dd.a;
            byte[] bytes = str4.getBytes(charset);
            AbstractC1474fG.i(bytes, "getBytes(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            byte[] bytes2 = str5.getBytes(charset);
            AbstractC1474fG.i(bytes2, "getBytes(...)");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
            byte[] bytes3 = str2.getBytes(charset);
            AbstractC1474fG.i(bytes3, "getBytes(...)");
            String str6 = URLEncoder.encode(Base64.encodeToString(cipher.doFinal(bytes3), 2), "UTF-8") + "a";
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String str7 = "";
            if (uri.getPort() != -1) {
                str3 = ":" + uri.getPort();
            } else {
                str3 = "";
            }
            String str8 = scheme + "://" + host + str3;
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                encodedPath = "";
            }
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null && (strConcat = "?".concat(encodedQuery)) != null) {
                str7 = strConcat;
            }
            return str8 + "/token-" + str6 + encodedPath + str7;
        } catch (Exception e2) {
            e2.getMessage();
            return str;
        }
    }
}
