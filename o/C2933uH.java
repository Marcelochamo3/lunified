package o;

import android.net.Uri;
import android.util.Base64;
import com.skidush.clonex.models.Video$Type;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.uH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2933uH implements Q30 {
    public static final C2933uH b = new C2933uH();
    public static final OV c;
    public static final I60 d;
    public static final I60 e;
    public static final I60 f;
    public static final I60 g;
    public static final Set h;
    public static final List i;

    static {
        C2112lq c2112lq = new C2112lq(3);
        NV nvH = AbstractC1370eA.h();
        nvH.j = c2112lq;
        nvH.h = true;
        nvH.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(20L, timeUnit);
        nvH.i(35L, timeUnit);
        nvH.c.add(new C2480pg(7));
        c = new OV(nvH);
        J60 j60 = J60.DOT_MATCHES_ALL;
        d = new I60("var\\s+animes\\s*=\\s*(\\{.*?\\});\\s*var\\s+mode", AbstractC1370eA.O(j60));
        e = new I60("var\\s+servers\\s*=\\s*(\\[.*?\\]);", AbstractC1370eA.O(j60));
        J60 j61 = J60.IGNORE_CASE;
        f = new I60("https://jkanime\\.net/jkplayer/umv?\\?[^\\\"']+", j61);
        g = new I60("https?://[^\\s\\\"'<>]+\\.m3u8[^\\s\\\"'<>]*", j61);
        h = Lc0.T("mediafire", "mega", "terabox");
        C1233cq c1233cq = C1233cq.l;
        i = AbstractC0937Ze.K(new C2420oz("accion", "Acción", c1233cq), new C2420oz("aventura", "Aventura", c1233cq), new C2420oz("comedia", "Comedia", c1233cq), new C2420oz("ciencia-ficcion", "Ciencia ficción", c1233cq), new C2420oz("deportes", "Deportes", c1233cq), new C2420oz("drama", "Drama", c1233cq), new C2420oz("ecchi", "Ecchi", c1233cq), new C2420oz("fantasia", "Fantasía", c1233cq), new C2420oz("harem", "Harem", c1233cq), new C2420oz("historico", "Histórico", c1233cq), new C2420oz("isekai", "Isekai", c1233cq), new C2420oz("misterio", "Misterio", c1233cq), new C2420oz("musica", "Música", c1233cq), new C2420oz("psicologico", "Psicológico", c1233cq), new C2420oz("romance", "Romance", c1233cq), new C2420oz("seinen", "Seinen", c1233cq), new C2420oz("shoujo", "Shoujo", c1233cq), new C2420oz("shounen", "Shounen", c1233cq), new C2420oz("sobrenatural", "Sobrenatural", c1233cq), new C2420oz("terror", "Terror", c1233cq));
    }

    public static String p(String str) {
        String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.x0(str, "https://jkanime.net", str), '/');
        return AbstractC1119bh0.A0(strF0, '/', strF0);
    }

    public static String r(String str) {
        String strZ = RN.z(str, "").Z();
        AbstractC1474fG.i(strZ, "text(...)");
        return AbstractC1119bh0.E0(AbstractC1899jh0.R(strZ, "\\/", "/", false)).toString();
    }

    public static boolean s(String str) {
        return AbstractC1119bh0.W(str, "pelicula", true) || AbstractC1119bh0.W(str, "película", true) || AbstractC1899jh0.N(str, "movie", true);
    }

    public static String u(String str) {
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC1899jh0.O(string)) {
            return null;
        }
        if (AbstractC1899jh0.U(string, "http://", false) || AbstractC1899jh0.U(string, "https://", false)) {
            return string;
        }
        return AbstractC1899jh0.U(string, "//", false) ? "https:".concat(string) : new URL(new URL("https://jkanime.net/"), string).toString();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    public static List v(C0660On c0660On) {
        String str;
        String strR = c0660On.R();
        AbstractC1474fG.i(strR, "html(...)");
        JN jnB = d.b(strR, 0);
        if (jnB == null || (str = (String) AbstractC0911Ye.e0(1, jnB.a())) == null) {
            ArrayList arrayListW = w(c0660On);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListW) {
                if (obj instanceof Cd0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject, "slug", "optString(...)");
                String strJ2 = AbstractC1701hf0.j(jSONObjectOptJSONObject, "title", "optString(...)");
                if (!AbstractC1899jh0.O(strJ) && !AbstractC1899jh0.O(strJ2)) {
                    String strU = u(jSONObjectOptJSONObject.optString("image"));
                    String strOptString = jSONObjectOptJSONObject.optString("synopsis");
                    AbstractC1474fG.g(strOptString);
                    if (!(!AbstractC1899jh0.O(strOptString))) {
                        strOptString = null;
                    }
                    String str2 = strOptString;
                    String strOptString2 = jSONObjectOptJSONObject.optString("tipo");
                    AbstractC1474fG.i(strOptString2, "optString(...)");
                    if (s(strOptString2)) {
                        arrayList2.add(new C1387eR(strJ, strJ2, str2, null, null, null, null, null, strU, null, null, null, null, null, null, 32504));
                    } else {
                        String strOptString3 = jSONObjectOptJSONObject.optString("type");
                        AbstractC1474fG.i(strOptString3, "optString(...)");
                        if (s(strOptString3)) {
                            arrayList2.add(new C1387eR(strJ, strJ2, str2, null, null, null, null, null, strU, null, null, null, null, null, null, 32504));
                        } else {
                            arrayList2.add(new C2109lo0(strJ, strJ2, str2, null, null, null, null, null, strU, null, null, null, null, null, null, null, 65272));
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(x((Cd0) obj2))) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList w(C0660On c0660On) {
        String string;
        String str;
        String str2;
        String strD;
        String strZ;
        C3370yp<C3176wp> c3370ypW = c0660On.W(".anime__item");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX = c3176wp.X("h5 a[href], a[href]");
            Object objZ = null;
            if (c3176wpX != null) {
                String strB = c3176wpX.b("href");
                AbstractC1474fG.i(strB, "absUrl(...)");
                String strY = y(strB);
                if (strY != null) {
                    C3176wp c3176wpX2 = c3176wp.X("h5 a, h3 a");
                    String string2 = (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
                    String str3 = string2 == null ? "" : string2;
                    if (!AbstractC1899jh0.O(str3)) {
                        C3176wp c3176wpX3 = c3176wp.X(".anime__item__pic, img");
                        if (c3176wpX3 == null || (strD = c3176wpX3.d("data-setbg")) == null) {
                            strD = null;
                        } else if (AbstractC1899jh0.O(strD)) {
                            strD = c3176wpX3.d("data-src");
                            if (AbstractC1899jh0.O(strD)) {
                                strD = c3176wpX3.d("src");
                            }
                        }
                        String strU = u(strD);
                        C3176wp c3176wpX4 = c3176wp.X("li.anime");
                        objZ = c3176wpX4 != null ? c3176wpX4.Z() : null;
                        objZ = s(objZ != null ? objZ : "") ? new C1387eR(strY, str3, null, null, null, null, null, null, strU, null, null, null, null, null, null, 32508) : new C2109lo0(strY, str3, null, null, null, null, null, null, strU, null, null, null, null, null, null, null, 65276);
                    }
                }
            }
            if (objZ != null) {
                arrayList.add(objZ);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Cd0 cd0 = (Cd0) obj;
            if (cd0 instanceof C1387eR) {
                str = ((C1387eR) cd0).a;
                str2 = "movie:";
            } else {
                if (cd0 instanceof C2109lo0) {
                    str = ((C2109lo0) cd0).a;
                    str2 = "tv:";
                } else {
                    string = cd0.toString();
                }
                if (hashSet.add(string)) {
                    arrayList2.add(obj);
                }
            }
            string = AbstractC1701hf0.t(str2, str);
            if (hashSet.add(string)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String x(Cd0 cd0) {
        String str;
        String str2;
        if (cd0 instanceof C1387eR) {
            str = ((C1387eR) cd0).a;
            str2 = "movie:";
        } else {
            if (!(cd0 instanceof C2109lo0)) {
                throw new C0730Rf();
            }
            str = ((C2109lo0) cd0).a;
            str2 = "tv:";
        }
        return AbstractC1701hf0.t(str2, str);
    }

    public static String y(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        AbstractC1474fG.i(pathSegments, "getPathSegments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : pathSegments) {
            String str2 = (String) obj;
            AbstractC1474fG.g(str2);
            if (!AbstractC1899jh0.O(str2)) {
                arrayList.add(obj);
            }
        }
        String str3 = (String) AbstractC0911Ye.d0(arrayList);
        if (str3 == null || Lc0.T("buscar", "directorio", "genero", "jkplayer", "ajax").contains(str3)) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2836tH c2836tH;
        C2933uH c2933uH;
        if (interfaceC0473Hh instanceof C2836tH) {
            c2836tH = (C2836tH) interfaceC0473Hh;
            int i3 = c2836tH.f1041o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2836tH.f1041o = i3 - Integer.MIN_VALUE;
            } else {
                c2836tH = new C2836tH(this, interfaceC0473Hh);
            }
        } else {
            c2836tH = new C2836tH(this, interfaceC0473Hh);
        }
        Object objQ = c2836tH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c2836tH.f1041o;
        if (i4 == 0) {
            Jp0.O(objQ);
            if (AbstractC1899jh0.O(str)) {
                return i;
            }
            String str2 = "https://jkanime.net/buscar?q=" + URLEncoder.encode(AbstractC1119bh0.E0(str).toString(), "UTF-8") + "&p=" + i2;
            c2836tH.l = this;
            c2836tH.f1041o = 1;
            objQ = q(str2, c2836tH);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            c2933uH = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2933uH = c2836tH.l;
            Jp0.O(objQ);
        }
        c2933uH.getClass();
        return w((C0660On) objQ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2158mH c2158mH;
        if (interfaceC0473Hh instanceof C2158mH) {
            c2158mH = (C2158mH) interfaceC0473Hh;
            int i2 = c2158mH.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2158mH.n = i2 - Integer.MIN_VALUE;
            } else {
                c2158mH = new C2158mH(this, interfaceC0473Hh);
            }
        } else {
            c2158mH = new C2158mH(this, interfaceC0473Hh);
        }
        Object objT = c2158mH.l;
        Object obj = EnumC1706hi.l;
        int i3 = c2158mH.n;
        if (i3 == 0) {
            Jp0.O(objT);
            String strP = p(str);
            c2158mH.n = 1;
            objT = t(strP, c2158mH);
            if (objT == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objT);
        }
        C1085bH c1085bH = (C1085bH) objT;
        C0456Gq c0456Gq = (C0456Gq) AbstractC0911Ye.d0(c1085bH.i);
        int i4 = c0456Gq != null ? c0456Gq.b : 1;
        String str2 = c1085bH.c;
        String str3 = c1085bH.d;
        String str4 = c1085bH.e;
        Integer num = c1085bH.f;
        String str5 = null;
        String str6 = null;
        Double d2 = null;
        String str7 = c1085bH.g;
        return new C1387eR(c1085bH.a + "/" + i4, str2, str3, str4, num, str5, str6, d2, str7, str7, c1085bH.h, null, null, null, null, 30944);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1671hH c1671hH;
        int iIntValue;
        if (interfaceC0473Hh instanceof C1671hH) {
            c1671hH = (C1671hH) interfaceC0473Hh;
            int i2 = c1671hH.f811o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1671hH.f811o = i2 - Integer.MIN_VALUE;
            } else {
                c1671hH = new C1671hH(this, interfaceC0473Hh);
            }
        } else {
            c1671hH = new C1671hH(this, interfaceC0473Hh);
        }
        Object objT = c1671hH.m;
        Object obj = EnumC1706hi.l;
        int i3 = c1671hH.f811o;
        if (i3 == 0) {
            Jp0.O(objT);
            String strP = p(AbstractC1119bh0.B0(str, "/season/"));
            Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.x0(str, "/season/", "1"));
            iIntValue = numJ != null ? numJ.intValue() : 1;
            c1671hH.l = iIntValue;
            c1671hH.f811o = 1;
            objT = t(strP, c1671hH);
            if (objT == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = c1671hH.l;
            Jp0.O(objT);
        }
        return AbstractC0911Ye.s0(50, AbstractC0911Ye.Y((iIntValue - 1) * 50, ((C1085bH) objT).i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2546qH c2546qH;
        C2933uH c2933uH;
        if (interfaceC0473Hh instanceof C2546qH) {
            c2546qH = (C2546qH) interfaceC0473Hh;
            int i3 = c2546qH.f989o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2546qH.f989o = i3 - Integer.MIN_VALUE;
            } else {
                c2546qH = new C2546qH(this, interfaceC0473Hh);
            }
        } else {
            c2546qH = new C2546qH(this, interfaceC0473Hh);
        }
        Object objQ = c2546qH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c2546qH.f989o;
        if (i4 == 0) {
            Jp0.O(objQ);
            c2546qH.l = this;
            c2546qH.f989o = 1;
            objQ = q("https://jkanime.net/directorio?tipo=animes&p=" + i2, c2546qH);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            c2933uH = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2933uH = c2546qH.l;
            Jp0.O(objQ);
        }
        c2933uH.getClass();
        List listV = v((C0660On) objQ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (obj instanceof C2109lo0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2352oH c2352oH;
        String str2;
        String string;
        if (interfaceC0473Hh instanceof C2352oH) {
            c2352oH = (C2352oH) interfaceC0473Hh;
            int i2 = c2352oH.f947o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2352oH.f947o = i2 - Integer.MIN_VALUE;
            } else {
                c2352oH = new C2352oH(this, interfaceC0473Hh);
            }
        } else {
            c2352oH = new C2352oH(this, interfaceC0473Hh);
        }
        Object obj = c2352oH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2352oH.f947o;
        if (i3 == 0) {
            Jp0.O(obj);
            String strT = AbstractC1701hf0.t("https://jkanime.net/", AbstractC1119bh0.F0(AbstractC1119bh0.x0(str, "https://jkanime.net", str), '/'));
            c2352oH.l = strT;
            c2352oH.f947o = 1;
            Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1573gH(strT, C1330dq.l, null), c2352oH);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strT;
            obj = objJ;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c2352oH.l;
            Jp0.O(obj);
        }
        String str3 = (String) obj;
        ArrayList arrayList = new ArrayList();
        C2494pn c2494pn = new C2494pn(Vb0.M(I60.c(f, str3), C1182cH.f711o).iterator(), X10.v);
        int i4 = 0;
        while (c2494pn.hasNext()) {
            Object next = c2494pn.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            String str4 = (String) next;
            arrayList.add(new Ds0(str4, AbstractC1674hK.n(i5, "JKPlayer "), str4, AbstractC3327yN.z(new C1101bX("Referer", str2), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36")), 48));
            i4 = i5;
        }
        JN jnB = e.b(str3, 0);
        String str5 = jnB != null ? (String) AbstractC0911Ye.e0(1, jnB.a()) : null;
        if (str5 != null && !AbstractC1899jh0.O(str5)) {
            JSONArray jSONArray = new JSONArray(str5);
            int length = jSONArray.length();
            int i6 = 0;
            while (i6 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                if (jSONObjectOptJSONObject != null) {
                    String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject, "server", "optString(...)");
                    if (!AbstractC1899jh0.O(strJ)) {
                        String lowerCase = strJ.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                        if (!h.contains(lowerCase)) {
                            try {
                                byte[] bArrDecode = Base64.decode(jSONObjectOptJSONObject.optString("remote"), 0);
                                AbstractC1474fG.i(bArrDecode, "decode(...)");
                                string = AbstractC1119bh0.E0(new String(bArrDecode, AbstractC1305dd.a)).toString();
                            } catch (Throwable unused) {
                                string = "";
                            }
                            if (AbstractC1899jh0.U(string, "http", false)) {
                                arrayList.add(new Ds0(string, strJ, string, AbstractC3327yN.z(new C1101bX("Referer", str2), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36")), 48));
                            }
                        }
                    }
                }
                i6++;
                jSONArray = jSONArray;
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Ds0) obj2).l)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // o.Q30
    public final String f() {
        return "https://cdn.jkdesa.com/assets3/css/img/favicon.ico?v=2.0.184";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C2061lH(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "JKAnime";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1769iH c1769iH;
        Object next;
        String strS;
        String str2;
        C2933uH c2933uH;
        String str3;
        if (interfaceC0473Hh instanceof C1769iH) {
            c1769iH = (C1769iH) interfaceC0473Hh;
            int i3 = c1769iH.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1769iH.q = i3 - Integer.MIN_VALUE;
            } else {
                c1769iH = new C1769iH(this, interfaceC0473Hh);
            }
        } else {
            c1769iH = new C1769iH(this, interfaceC0473Hh);
        }
        Object obj = c1769iH.f828o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c1769iH.q;
        if (i4 == 0) {
            Jp0.O(obj);
            String strDecode = Uri.decode(str);
            AbstractC1474fG.i(strDecode, "decode(...)");
            String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.x0(strDecode, "/genero/", str), '/');
            Iterator it = i.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((C2420oz) next).a, strF0));
            C2420oz c2420oz = (C2420oz) next;
            if (c2420oz == null || (strS = c2420oz.b) == null) {
                strS = AbstractC1899jh0.S(strF0, '-', ' ');
                if (strS.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(strS.charAt(0));
                    AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                    sb.append((Object) upperCase);
                    String strSubstring = strS.substring(1);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    strS = sb.toString();
                }
            }
            c1769iH.l = strF0;
            c1769iH.m = strS;
            c1769iH.n = this;
            c1769iH.q = 1;
            Object objQ = q("https://jkanime.net/genero/" + strF0 + "/?p=" + i2, c1769iH);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strF0;
            c2933uH = this;
            String str4 = strS;
            obj = objQ;
            str3 = str4;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2933uH = c1769iH.n;
            str3 = c1769iH.m;
            str2 = c1769iH.l;
            Jp0.O(obj);
        }
        c2933uH.getClass();
        ArrayList arrayListW = w((C0660On) obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListW) {
            if (obj2 instanceof Cd0) {
                arrayList.add(obj2);
            }
        }
        return new C2420oz(str2, str3, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2255nH c2255nH;
        C2933uH c2933uH;
        if (interfaceC0473Hh instanceof C2255nH) {
            c2255nH = (C2255nH) interfaceC0473Hh;
            int i3 = c2255nH.f934o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2255nH.f934o = i3 - Integer.MIN_VALUE;
            } else {
                c2255nH = new C2255nH(this, interfaceC0473Hh);
            }
        } else {
            c2255nH = new C2255nH(this, interfaceC0473Hh);
        }
        Object objQ = c2255nH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c2255nH.f934o;
        if (i4 == 0) {
            Jp0.O(objQ);
            c2255nH.l = this;
            c2255nH.f934o = 1;
            objQ = q("https://jkanime.net/directorio?tipo=peliculas&p=" + i2, c2255nH);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            c2933uH = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2933uH = c2255nH.l;
            Jp0.O(objQ);
        }
        c2933uH.getClass();
        List listV = v((C0660On) objQ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2449pH c2449pH;
        C2933uH c2933uH;
        if (interfaceC0473Hh instanceof C2449pH) {
            c2449pH = (C2449pH) interfaceC0473Hh;
            int i2 = c2449pH.f968o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2449pH.f968o = i2 - Integer.MIN_VALUE;
            } else {
                c2449pH = new C2449pH(this, interfaceC0473Hh);
            }
        } else {
            c2449pH = new C2449pH(this, interfaceC0473Hh);
        }
        Object objT = c2449pH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2449pH.f968o;
        if (i3 == 0) {
            Jp0.O(objT);
            String strP = p(str);
            c2449pH.l = this;
            c2449pH.f968o = 1;
            objT = t(strP, c2449pH);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c2933uH = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2933uH = c2449pH.l;
            Jp0.O(objT);
        }
        C1085bH c1085bH = (C1085bH) objT;
        String str2 = c1085bH.a;
        c2933uH.getClass();
        ArrayList arrayListV = AbstractC0911Ye.V(50, c1085bH.i);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListV, 10));
        int i4 = 0;
        for (Object obj : arrayListV) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            List list = (List) obj;
            arrayList.add(new Ma0(c1085bH.a + "/season/" + i5, i5, AbstractC1674hK.m(((C0456Gq) AbstractC0911Ye.b0(list)).b, ((C0456Gq) AbstractC0911Ye.i0(list)).b, "Episodios ", " - "), c1085bH.g, null, list, 16));
            i4 = i5;
        }
        String str3 = c1085bH.c;
        String str4 = c1085bH.d;
        String str5 = c1085bH.e;
        Integer num = c1085bH.f;
        String str6 = null;
        String str7 = null;
        Double d2 = null;
        String str8 = c1085bH.g;
        return new C2109lo0(str2, str3, str4, str5, num, str6, str7, d2, str8, str8, null, arrayList, c1085bH.h, null, null, null, 58592);
    }

    @Override // o.Q30
    public final Object k(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        String strS = AbstractC1899jh0.S(str, '-', ' ');
        if (strS.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strS.charAt(0));
            AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = strS.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strS = sb.toString();
        }
        return new C1688hY(str, strS, null, null, 12);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2642rH c2642rH;
        C2933uH c2933uH;
        String str;
        JN jnB;
        String strR;
        if (interfaceC0473Hh instanceof C2642rH) {
            c2642rH = (C2642rH) interfaceC0473Hh;
            int i2 = c2642rH.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2642rH.p = i2 - Integer.MIN_VALUE;
            } else {
                c2642rH = new C2642rH(this, interfaceC0473Hh);
            }
        } else {
            c2642rH = new C2642rH(this, interfaceC0473Hh);
        }
        Object objM = c2642rH.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2642rH.p;
        if (i3 != 0) {
            if (i3 == 1) {
                Jp0.O(objM);
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c2642rH.m;
            c2933uH = c2642rH.l;
            Jp0.O(objM);
            jnB = g.b((String) objM, 0);
            if (jnB != null) {
                String strC = jnB.c();
                c2933uH.getClass();
                strR = r(strC);
                if (strR != null) {
                    return new Js0(strR, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"), new C1101bX("Referer", str), new C1101bX("Origin", "https://jkanime.net")), "hls", (String) null, (String) null, (byte[]) null, (String) null, str, (String) null, (List) null, false, 3960);
                }
            }
            throw new IllegalStateException("JKAnime no entregó un enlace HLS válido".toString());
        }
        Jp0.O(objM);
        String str2 = ds0.n;
        if (AbstractC1899jh0.O(str2)) {
            str2 = ds0.l;
        }
        if (!AbstractC1119bh0.W(str2, "jkanime.net/jkplayer/", false)) {
            int i4 = AbstractC3473zs.a;
            c2642rH.p = 1;
            objM = C0622Nb.m(str2, ds0, c2642rH, 4);
            return objM == enumC1706hi ? enumC1706hi : objM;
        }
        Map map = ds0.f223o;
        if (map == null) {
            map = C1330dq.l;
        }
        c2642rH.l = this;
        c2642rH.m = str2;
        c2642rH.p = 2;
        Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1573gH(str2, map, null), c2642rH);
        if (objJ == enumC1706hi) {
            return enumC1706hi;
        }
        c2933uH = this;
        String str3 = str2;
        objM = objJ;
        str = str3;
        jnB = g.b((String) objM, 0);
        if (jnB != null) {
            String strC2 = jnB.c();
            c2933uH.getClass();
            strR = r(strC2);
            if (strR != null) {
                return new Js0(strR, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"), new C1101bX("Referer", str), new C1101bX("Origin", "https://jkanime.net")), "hls", (String) null, (String) null, (byte[]) null, (String) null, str, (String) null, (List) null, false, 3960);
            }
        }
        throw new IllegalStateException("JKAnime no entregó un enlace HLS válido".toString());
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1377eH c1377eH;
        if (interfaceC0473Hh instanceof C1377eH) {
            c1377eH = (C1377eH) interfaceC0473Hh;
            int i2 = c1377eH.f750o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1377eH.f750o = i2 - Integer.MIN_VALUE;
            } else {
                c1377eH = new C1377eH(this, interfaceC0473Hh);
            }
        } else {
            c1377eH = new C1377eH(this, interfaceC0473Hh);
        }
        Object objJ = c1377eH.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1377eH.f750o;
        if (i3 == 0) {
            Jp0.O(objJ);
            c1377eH.l = str;
            c1377eH.f750o = 1;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1573gH(str, C1330dq.l, null), c1377eH);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c1377eH.l;
            Jp0.O(objJ);
        }
        C0660On c0660OnZ = RN.z((String) objJ, str);
        AbstractC1474fG.i(c0660OnZ, "parse(...)");
        return c0660OnZ;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02af  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0305  */
    /* JADX WARN: Code duplicated, block: B:130:0x0313  */
    /* JADX WARN: Code duplicated, block: B:133:0x031e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0326  */
    /* JADX WARN: Code duplicated, block: B:141:0x0350  */
    /* JADX WARN: Code duplicated, block: B:143:0x0361  */
    /* JADX WARN: Code duplicated, block: B:153:0x0380  */
    /* JADX WARN: Code duplicated, block: B:156:0x0398  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public final Object t(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2739sH c2739sH;
        String str2;
        Object objQ;
        C2933uH c2933uH;
        String strD;
        Integer numJ;
        EnumC1706hi enumC1706hi;
        String str3;
        Integer numJ2;
        String strConcat;
        ?? arrayList;
        C3176wp c3176wpX;
        String strD2;
        String str4;
        EnumC1706hi enumC1706hi2;
        Integer num;
        String str5;
        ?? r29;
        String str6;
        String str7;
        int i2;
        String str8;
        C3370yp c3370ypW;
        C3370yp c3370ypW2;
        Object obj;
        String strZ;
        JN jnA;
        C3370yp c3370ypW3;
        Object next;
        String strZ2;
        JN jnA2;
        String str9;
        String strZ3;
        String strZ4;
        int i3;
        int iOptInt;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArrayOptJSONArray;
        int length;
        ArrayList arrayList2;
        YF it;
        JSONObject jSONObject;
        String str10;
        String strN;
        String strD0;
        String strOptString;
        String strOptString2;
        String strConcat2;
        JSONObject jSONObjectOptJSONObject;
        String str11 = str;
        if (interfaceC0473Hh instanceof C2739sH) {
            c2739sH = (C2739sH) interfaceC0473Hh;
            int i4 = c2739sH.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2739sH.v = i4 - Integer.MIN_VALUE;
            } else {
                c2739sH = new C2739sH(this, interfaceC0473Hh);
            }
        } else {
            c2739sH = new C2739sH(this, interfaceC0473Hh);
        }
        Object objJ = c2739sH.t;
        EnumC1706hi enumC1706hi3 = EnumC1706hi.l;
        int i5 = c2739sH.v;
        String str12 = "/";
        if (i5 != 0) {
            if (i5 == 1) {
                String str13 = c2739sH.n;
                String str14 = c2739sH.m;
                c2933uH = (C2933uH) c2739sH.l;
                Jp0.O(objJ);
                str2 = str13;
                str11 = str14;
                objQ = objJ;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = c2739sH.s;
                List list = (List) c2739sH.r;
                String str15 = c2739sH.q;
                Integer num2 = c2739sH.p;
                String str16 = c2739sH.f1022o;
                String str17 = c2739sH.n;
                String str18 = c2739sH.m;
                String str19 = (String) c2739sH.l;
                Jp0.O(objJ);
                i2 = i6;
                str11 = str19;
                r29 = list;
                str5 = str15;
                str3 = "/";
                num = num2;
                str6 = str16;
                str7 = str17;
                str8 = str18;
                str4 = null;
            }
            JSONObject jSONObject2 = (JSONObject) objJ;
            iOptInt = jSONObject2.optInt("total", 0);
            if (iOptInt < 1) {
                iOptInt = 1;
            }
            linkedHashMap = new LinkedHashMap();
            jSONArrayOptJSONArray = jSONObject2.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            length = jSONArrayOptJSONArray.length();
            for (i3 = 0; i3 < length; i3++) {
                jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    linkedHashMap.put(new Integer(jSONObjectOptJSONObject.optInt("number")), jSONObjectOptJSONObject);
                }
            }
            ZF zf = new ZF(1, iOptInt, 1);
            arrayList2 = new ArrayList(AbstractC1016af.O(zf, 10));
            it = zf.iterator();
            while (it.n) {
                int iA = it.a();
                jSONObject = (JSONObject) linkedHashMap.get(new Integer(iA));
                if (jSONObject != null || (strOptString2 = jSONObject.optString("image")) == null) {
                    str10 = str8;
                } else {
                    if (!(!AbstractC1899jh0.O(strOptString2))) {
                        strOptString2 = str4;
                    }
                    if (strOptString2 == null || (strConcat2 = "https://cdn.jkdesa.com/assets/images/animes/video/image/".concat(strOptString2)) == null) {
                        str10 = str8;
                    } else {
                        str10 = strConcat2;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str11);
                String str20 = str3;
                sb.append(str20);
                sb.append(iA);
                String string = sb.toString();
                if (jSONObject == null && (strN = jSONObject.optString("title")) != null) {
                    if (!(!AbstractC1899jh0.O(strN))) {
                        strN = str4;
                    }
                    if (strN == null) {
                    }
                    String str21 = strN;
                    if (jSONObject != null || (strOptString = jSONObject.optString("timestamp")) == null) {
                        strD0 = str4;
                    } else {
                        strD0 = AbstractC1119bh0.D0(10, strOptString);
                    }
                    arrayList2.add(new C0456Gq(string, iA, str21, strD0, str10, null, null, 96));
                    str3 = str20;
                }
                String str22 = strN;
                if (jSONObject != null) {
                    strD0 = str4;
                } else {
                    strD0 = str4;
                }
                arrayList2.add(new C0456Gq(string, iA, str22, strD0, str10, null, null, 96));
                str3 = str20;
            }
            return new C1085bH(str11, i2, str7, str6, str5, num, str8, r29, arrayList2);
        }
        Jp0.O(objJ);
        str2 = "https://jkanime.net/" + str11 + "/";
        c2739sH.l = this;
        c2739sH.m = str11;
        c2739sH.n = str2;
        c2739sH.v = 1;
        objQ = q(str2, c2739sH);
        if (objQ == enumC1706hi3) {
            return enumC1706hi3;
        }
        c2933uH = this;
        C0660On c0660On = (C0660On) objQ;
        C3176wp c3176wpX2 = c0660On.X("[data-anime]");
        if (c3176wpX2 == null || (strD = c3176wpX2.d("data-anime")) == null || (numJ = AbstractC1802ih0.J(strD)) == null) {
            throw new IllegalStateException(("JKAnime no informó el ID de " + str11).toString());
        }
        int iIntValue = numJ.intValue();
        C3176wp c3176wpX3 = c0660On.X(".anime_pic img");
        String strD3 = c3176wpX3 != null ? c3176wpX3.d("src") : null;
        c2933uH.getClass();
        String strU = u(strD3);
        C3176wp c3176wpX4 = c0660On.X(".anime_info h3");
        String string2 = (c3176wpX4 == null || (strZ4 = c3176wpX4.Z()) == null) ? null : AbstractC1119bh0.E0(strZ4).toString();
        if (string2 == null) {
            string2 = "";
        }
        if (AbstractC1899jh0.O(string2)) {
            string2 = AbstractC1899jh0.S(str11, '-', ' ');
            if (string2.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String strValueOf = String.valueOf(string2.charAt(0));
                AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                sb2.append((Object) upperCase);
                String strSubstring = string2.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                string2 = sb2.toString();
            }
        }
        C3176wp c3176wpX5 = c0660On.X(".anime_info p.scroll");
        String string3 = (c3176wpX5 == null || (strZ3 = c3176wpX5.Z()) == null) ? null : AbstractC1119bh0.E0(strZ3).toString();
        C3370yp c3370ypW4 = c0660On.W(".anime_data");
        AbstractC1474fG.i(c3370ypW4, "select(...)");
        C3176wp c3176wp = (C3176wp) AbstractC0911Ye.d0(c3370ypW4);
        if (c3176wp != null && (c3370ypW3 = c3176wp.W("li")) != null) {
            Iterator it2 = c3370ypW3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    enumC1706hi = enumC1706hi3;
                    str3 = str12;
                    next = null;
                    break;
                }
                next = it2.next();
                String strZ5 = ((C3176wp) next).Z();
                AbstractC1474fG.i(strZ5, "text(...)");
                str3 = str12;
                enumC1706hi = enumC1706hi3;
                if (AbstractC1119bh0.W(strZ5, "Duracion", true)) {
                    break;
                }
                str12 = str3;
                enumC1706hi3 = enumC1706hi;
            }
            C3176wp c3176wp2 = (C3176wp) next;
            if (c3176wp2 != null && (strZ2 = c3176wp2.Z()) != null && (jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("(\\d+)", "compile(...)", strZ2, "matcher(...)"), 0, strZ2)) != null && (str9 = (String) ((HN) jnA2.a()).get(1)) != null) {
                numJ2 = AbstractC1802ih0.J(str9);
            }
            if (c3176wp != null || (c3370ypW2 = c3176wp.W("li")) == null) {
                strConcat = null;
            } else {
                Iterator it3 = c3370ypW2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next2 = it3.next();
                    String strZ6 = ((C3176wp) next2).Z();
                    AbstractC1474fG.i(strZ6, "text(...)");
                    Iterator it4 = it3;
                    if (AbstractC1119bh0.W(strZ6, "Emitido", true)) {
                        obj = next2;
                        break;
                    }
                    it3 = it4;
                }
                C3176wp c3176wp3 = (C3176wp) obj;
                if (c3176wp3 == null || (strZ = c3176wp3.Z()) == null || (jnA = AbstractC1370eA.a(AbstractC1701hf0.m("(?:19|20)\\d{2}", "compile(...)", strZ, "matcher(...)"), 0, strZ)) == null) {
                    strConcat = null;
                } else {
                    strConcat = jnA.c().concat("-01-01");
                }
            }
            if (c3176wp != null || (c3370ypW = c3176wp.W("a[href*=/genero/]")) == null) {
                arrayList = 0;
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = c3370ypW.iterator();
                while (it5.hasNext()) {
                    C3176wp c3176wp4 = (C3176wp) it5.next();
                    String strD4 = c3176wp4.d("href");
                    AbstractC1474fG.i(strD4, "attr(...)");
                    Iterator it6 = it5;
                    String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.x0(strD4, "/genero/", strD4), '/');
                    String strZ7 = c3176wp4.Z();
                    AbstractC1474fG.i(strZ7, "text(...)");
                    String string4 = AbstractC1119bh0.E0(strZ7).toString();
                    if (!(!AbstractC1899jh0.O(string4))) {
                        string4 = null;
                    }
                    C2420oz c2420oz = string4 != null ? new C2420oz(strF0, string4) : null;
                    if (c2420oz != null) {
                        arrayList3.add(c2420oz);
                    }
                    it5 = it6;
                }
                HashSet hashSet = new HashSet();
                arrayList = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (hashSet.add(((C2420oz) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (arrayList == 0) {
                arrayList = C1233cq.l;
            }
            c3176wpX = c0660On.X("meta[name=csrf-token]");
            if (c3176wpX != null) {
                strD2 = c3176wpX.d("content");
            } else {
                strD2 = null;
            }
            if (strD2 != null) {
                throw new IllegalStateException("JKAnime no entregó el token de episodios".toString());
            }
            c2739sH.l = str11;
            c2739sH.m = strU;
            c2739sH.n = string2;
            c2739sH.f1022o = string3;
            c2739sH.p = numJ2;
            c2739sH.q = strConcat;
            c2739sH.r = arrayList;
            c2739sH.s = iIntValue;
            c2739sH.v = 2;
            str4 = null;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1475fH(iIntValue, strD2, str2, null), c2739sH);
            enumC1706hi2 = enumC1706hi;
            if (objJ == enumC1706hi2) {
                return enumC1706hi2;
            }
            num = numJ2;
            str5 = strConcat;
            r29 = arrayList;
            str6 = string3;
            str7 = string2;
            i2 = iIntValue;
            str8 = strU;
            JSONObject jSONObject3 = (JSONObject) objJ;
            iOptInt = jSONObject3.optInt("total", 0);
            if (iOptInt < 1) {
                iOptInt = 1;
            }
            linkedHashMap = new LinkedHashMap();
            jSONArrayOptJSONArray = jSONObject3.optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            length = jSONArrayOptJSONArray.length();
            while (i3 < length) {
                jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    linkedHashMap.put(new Integer(jSONObjectOptJSONObject.optInt("number")), jSONObjectOptJSONObject);
                }
            }
            ZF zf2 = new ZF(1, iOptInt, 1);
            arrayList2 = new ArrayList(AbstractC1016af.O(zf2, 10));
            it = zf2.iterator();
            while (it.n) {
                int iA2 = it.a();
                jSONObject = (JSONObject) linkedHashMap.get(new Integer(iA2));
                if (jSONObject != null) {
                    str10 = str8;
                } else {
                    str10 = str8;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str11);
                String str23 = str3;
                sb3.append(str23);
                sb3.append(iA2);
                String string5 = sb3.toString();
                strN = jSONObject == null ? AbstractC1674hK.n(iA2, "Episodio ") : AbstractC1674hK.n(iA2, "Episodio ");
                String str24 = strN;
                if (jSONObject != null) {
                    strD0 = str4;
                } else {
                    strD0 = str4;
                }
                arrayList2.add(new C0456Gq(string5, iA2, str24, strD0, str10, null, null, 96));
                str3 = str23;
            }
            return new C1085bH(str11, i2, str7, str6, str5, num, str8, r29, arrayList2);
        }
        enumC1706hi = enumC1706hi3;
        str3 = "/";
        numJ2 = null;
        if (c3176wp != null) {
            strConcat = null;
        } else {
            strConcat = null;
        }
        if (c3176wp != null) {
            arrayList = 0;
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C1233cq.l;
        }
        c3176wpX = c0660On.X("meta[name=csrf-token]");
        if (c3176wpX != null) {
            strD2 = c3176wpX.d("content");
        } else {
            strD2 = null;
        }
        if (strD2 != null) {
            throw new IllegalStateException("JKAnime no entregó el token de episodios".toString());
        }
        c2739sH.l = str11;
        c2739sH.m = strU;
        c2739sH.n = string2;
        c2739sH.f1022o = string3;
        c2739sH.p = numJ2;
        c2739sH.q = strConcat;
        c2739sH.r = arrayList;
        c2739sH.s = iIntValue;
        c2739sH.v = 2;
        str4 = null;
        objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1475fH(iIntValue, strD2, str2, null), c2739sH);
        enumC1706hi2 = enumC1706hi;
        if (objJ == enumC1706hi2) {
            return enumC1706hi2;
        }
        num = numJ2;
        str5 = strConcat;
        r29 = arrayList;
        str6 = string3;
        str7 = string2;
        i2 = iIntValue;
        str8 = strU;
        JSONObject jSONObject4 = (JSONObject) objJ;
        iOptInt = jSONObject4.optInt("total", 0);
        if (iOptInt < 1) {
            iOptInt = 1;
        }
        linkedHashMap = new LinkedHashMap();
        jSONArrayOptJSONArray = jSONObject4.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        length = jSONArrayOptJSONArray.length();
        while (i3 < length) {
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject != null) {
                linkedHashMap.put(new Integer(jSONObjectOptJSONObject.optInt("number")), jSONObjectOptJSONObject);
            }
        }
        ZF zf3 = new ZF(1, iOptInt, 1);
        arrayList2 = new ArrayList(AbstractC1016af.O(zf3, 10));
        it = zf3.iterator();
        while (it.n) {
            int iA3 = it.a();
            jSONObject = (JSONObject) linkedHashMap.get(new Integer(iA3));
            if (jSONObject != null) {
                str10 = str8;
            } else {
                str10 = str8;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str11);
            String str25 = str3;
            sb4.append(str25);
            sb4.append(iA3);
            String string6 = sb4.toString();
            if (jSONObject == null) {
            }
            String str26 = strN;
            if (jSONObject != null) {
                strD0 = str4;
            } else {
                strD0 = str4;
            }
            arrayList2.add(new C0456Gq(string6, iA3, str26, strD0, str10, null, null, 96));
            str3 = str25;
        }
        return new C1085bH(str11, i2, str7, str6, str5, num, str8, r29, arrayList2);
    }
}
