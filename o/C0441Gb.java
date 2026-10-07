package o;

import android.content.SharedPreferences;
import android.util.Base64;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.models.Video$Type;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0441Gb implements Q30 {
    public static final C0441Gb b = new C0441Gb();
    public static final TP c;
    public static final TP d;
    public static final OV e;
    public static volatile C2179mb f;
    public static final YS g;
    public static final YS h;
    public static C2082lb i;
    public static C2082lb j;
    public static C1984kb k;
    public static final List l;

    static {
        Pattern pattern = TP.e;
        c = AbstractC1474fG.o("application/json; charset=utf-8");
        d = AbstractC1474fG.o("text/plain; charset=utf-8");
        NV nvH = AbstractC1370eA.h();
        nvH.h = true;
        nvH.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(25L, timeUnit);
        nvH.i(40L, timeUnit);
        nvH.c.add(new C2480pg(2));
        e = new OV(nvH);
        g = AbstractC1923jt0.a();
        h = AbstractC1923jt0.a();
        C1233cq c1233cq = C1233cq.l;
        l = AbstractC0937Ze.K(new C2420oz("action", "Acción", c1233cq), new C2420oz("adventure", "Aventura", c1233cq), new C2420oz("animation", "Animación", c1233cq), new C2420oz("classic", "Clásicos", c1233cq), new C2420oz("comedy", "Comedia", c1233cq), new C2420oz("crime", "Crimen", c1233cq), new C2420oz("documentary", "Documental", c1233cq), new C2420oz("drama", "Drama", c1233cq), new C2420oz("family", "Familia", c1233cq), new C2420oz("horror", "Terror", c1233cq), new C2420oz("kids", "Infantil", c1233cq), new C2420oz("romance", "Romance", c1233cq), new C2420oz("thriller", "Suspenso", c1233cq));
    }

    public static String A(JSONObject jSONObject, String str) {
        Object next;
        Object next2;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof String) {
            if (!(!AbstractC1899jh0.O((String) objOpt))) {
                objOpt = null;
            }
            return (String) objOpt;
        }
        JSONArray jSONArray = objOpt instanceof JSONArray ? (JSONArray) objOpt : null;
        if (jSONArray == null) {
            return null;
        }
        C3421zK c3421zKB = B(jSONArray);
        ListIterator listIterator = c3421zKB.listIterator(0);
        do {
            C3324yK c3324yK = (C3324yK) listIterator;
            if (!c3324yK.hasNext()) {
                next = null;
                break;
            }
            next = c3324yK.next();
        } while (!AbstractC1474fG.b(((JSONObject) next).optString("lang"), "es-MX"));
        JSONObject jSONObject2 = (JSONObject) next;
        if (jSONObject2 != null && (strOptString3 = jSONObject2.optString("n")) != null) {
            if (!(!AbstractC1899jh0.O(strOptString3))) {
                strOptString3 = null;
            }
            if (strOptString3 != null) {
                return strOptString3;
            }
        }
        ListIterator listIterator2 = c3421zKB.listIterator(0);
        do {
            C3324yK c3324yK2 = (C3324yK) listIterator2;
            if (!c3324yK2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = c3324yK2.next();
        } while (!AbstractC1474fG.b(((JSONObject) next2).optString("lang"), "es-AR"));
        JSONObject jSONObject3 = (JSONObject) next2;
        if (jSONObject3 == null || (strOptString = jSONObject3.optString("n")) == null || !(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString != null) {
            return strOptString;
        }
        JSONObject jSONObject4 = (JSONObject) AbstractC0911Ye.d0(c3421zKB);
        if (jSONObject4 == null || (strOptString2 = jSONObject4.optString("n")) == null || !(!AbstractC1899jh0.O(strOptString2))) {
            return null;
        }
        return strOptString2;
    }

    public static C3421zK B(JSONArray jSONArray) {
        C3421zK c3421zK = new C3421zK();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                c3421zK.add(jSONObjectOptJSONObject);
            }
        }
        return AbstractC2506pt.h(c3421zK);
    }

    public static ArrayList C(JSONObject jSONObject) {
        Object next;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("log");
        C3421zK c3421zKH = null;
        List listB = jSONArrayOptJSONArray2 != null ? B(jSONArrayOptJSONArray2) : null;
        List<String> list = C1233cq.l;
        if (listB == null) {
            listB = list;
        }
        Iterator it = listB.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC1474fG.b(((JSONObject) next).optString("lang"), "es-MX"));
        JSONObject jSONObject2 = (JSONObject) next;
        if (jSONObject2 == null) {
            jSONObject2 = (JSONObject) AbstractC0911Ye.d0(listB);
        }
        if (jSONObject2 != null && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("n")) != null) {
            C3421zK c3421zK = new C3421zK();
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString = jSONArrayOptJSONArray.optString(i2);
                AbstractC1474fG.g(strOptString);
                if (!(!AbstractC1899jh0.O(strOptString))) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    c3421zK.add(strOptString);
                }
            }
            c3421zKH = AbstractC2506pt.h(c3421zK);
        }
        if (c3421zKH != null) {
            list = c3421zKH;
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (String str : list) {
            Locale locale = Locale.ROOT;
            String strI = AbstractC1701hf0.i(locale, "ROOT", str, locale, "toLowerCase(...)");
            Pattern patternCompile = Pattern.compile("[^a-z0-9áéíóúñ]+");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(strI).replaceAll("-");
            AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
            arrayList.add(new C2420oz(AbstractC1119bh0.F0(strReplaceAll, '-'), str));
        }
        return arrayList;
    }

    public static C1387eR D(JSONObject jSONObject, C2179mb c2179mb) {
        String strS;
        String strOptString = jSONObject.optString("nu");
        String strT = AbstractC1701hf0.t("movie|", strOptString);
        String strA = A(jSONObject, "lon");
        if (strA == null) {
            AbstractC1474fG.g(strOptString);
            strS = AbstractC1899jh0.S(strOptString, '-', ' ');
        } else {
            strS = strA;
        }
        String strA2 = A(jSONObject, "lold");
        if (strA2 == null) {
            strA2 = A(jSONObject, "lod");
        }
        String str = strA2;
        String strOptString2 = jSONObject.optString("rdt");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        String strD0 = AbstractC1119bh0.D0(10, strOptString2);
        if (strD0.length() != 10) {
            strD0 = null;
        }
        Integer numH = H(jSONObject.optInt("rt", 0));
        double dOptDouble = jSONObject.optDouble("score", Double.NaN);
        return new C1387eR(strT, strS, str, strD0, numH, null, null, !Double.isNaN(dOptDouble) ? Double.valueOf(dOptDouble) : null, y(jSONObject, "0-7x10", 420, c2179mb), y(jSONObject, "0-16x9", 960, c2179mb), C(jSONObject), null, null, null, null, 30816);
    }

    public static Cd0 E(JSONObject jSONObject, C2179mb c2179mb) {
        String strOptString = jSONObject.optString("cty");
        if (strOptString == null) {
            return null;
        }
        int iHashCode = strOptString.hashCode();
        if (iHashCode != -1262569159) {
            if (iHashCode == 104087344) {
                if (strOptString.equals("movie")) {
                    return D(jSONObject, c2179mb);
                }
                return null;
            }
            if (iHashCode == 1042916217 && strOptString.equals("tvseries")) {
                return F(jSONObject, c2179mb, C1233cq.l);
            }
            return null;
        }
        if (!strOptString.equals("tvepisode")) {
            return null;
        }
        String strJ = AbstractC1701hf0.j(jSONObject, "cnu", "optString(...)");
        if (AbstractC1899jh0.O(strJ)) {
            return null;
        }
        String strA = A(jSONObject, "lostl");
        if (strA == null && (strA = A(jSONObject, "losetl")) == null && (strA = A(jSONObject, "lon")) == null) {
            strA = AbstractC1899jh0.S(strJ, '-', ' ');
        }
        return new C2109lo0(strJ, strA, A(jSONObject, "lod"), null, null, null, null, null, y(jSONObject, "0-7x10", 420, c2179mb), y(jSONObject, "0-16x9", 960, c2179mb), null, null, null, null, null, null, 64760);
    }

    public static C2109lo0 F(JSONObject jSONObject, C2179mb c2179mb, List list) {
        String strOptString = jSONObject.optString("nu");
        AbstractC1474fG.g(strOptString);
        String strA = A(jSONObject, "lon");
        if (strA == null) {
            strA = AbstractC1899jh0.S(strOptString, '-', ' ');
        }
        String str = strA;
        String strA2 = A(jSONObject, "lold");
        if (strA2 == null) {
            strA2 = A(jSONObject, "lod");
        }
        String str2 = strA2;
        String strOptString2 = jSONObject.optString("rdt");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        String strD0 = AbstractC1119bh0.D0(10, strOptString2);
        String str3 = strD0.length() == 10 ? strD0 : null;
        Integer numH = H(jSONObject.optInt("rt", 0));
        double dOptDouble = jSONObject.optDouble("score", Double.NaN);
        return new C2109lo0(strOptString, str, str2, str3, numH, null, null, !Double.isNaN(dOptDouble) ? Double.valueOf(dOptDouble) : null, y(jSONObject, "0-7x10", 420, c2179mb), y(jSONObject, "0-16x9", 960, c2179mb), jSONObject.optString("id"), list, C(jSONObject), null, null, null, 57440);
    }

    public static Integer H(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf((numValueOf.intValue() + 30) / 60);
        }
        return null;
    }

    public static String I(Cd0 cd0) {
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

    public static String J(String str, C2179mb c2179mb) {
        return str + (AbstractC1119bh0.X(str, '?') ? '&' : '?') + AbstractC0911Ye.h0(AbstractC0937Ze.K("ipr=true", AbstractC1701hf0.t("acl=", c2179mb.c), "reg=" + c2179mb.b, "dt=web", AbstractC1701hf0.t("client=", c2179mb.a("xClientId").concat("-web")), "pf=main"), "&", null, null, null, 62);
    }

    public static String r(String str) {
        String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.w0(str, '|', str), '/');
        return AbstractC1119bh0.y0(strF0, '/', strF0);
    }

    public static String s() {
        MyApplication myApplication = MyApplication.l;
        SharedPreferences sharedPreferences = Jp0.s().getSharedPreferences("canela_tv_provider", 0);
        String string = sharedPreferences.getString("device_id", null);
        if (string != null) {
            String str = AbstractC1899jh0.O(string) ^ true ? string : null;
            if (str != null) {
                return str;
            }
        }
        String string2 = UUID.randomUUID().toString();
        AbstractC1474fG.i(string2, "toString(...)");
        sharedPreferences.edit().putString("device_id", string2).apply();
        return string2;
    }

    public static Object u(C1951k70 c1951k70, AbstractC0499Ih abstractC0499Ih) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2567qb(c1951k70, null), abstractC0499Ih);
    }

    public static Object w(String str, AbstractC0499Ih abstractC0499Ih) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.d();
        c0560Kq.j("Referer", "https://www.canela.tv/");
        return u(c0560Kq.c(), abstractC0499Ih);
    }

    public static String y(JSONObject jSONObject, String str, int i2, C2179mb c2179mb) throws UnsupportedEncodingException {
        String strJ = AbstractC1701hf0.j(jSONObject, "id", "optString(...)");
        if (AbstractC1899jh0.O(strJ)) {
            return null;
        }
        String strEncode = URLEncoder.encode(jSONObject.optString("ut"), "UTF-8");
        return c2179mb.a("imageResizeURL") + "/image/" + strJ + "/" + str + ".jpg?width=" + i2 + "&updatedTime=" + strEncode + "&dt=Web";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(String str, String str2, C2179mb c2179mb, InterfaceC0473Hh interfaceC0473Hh) {
        C0389Eb c0389Eb;
        long j2;
        if (interfaceC0473Hh instanceof C0389Eb) {
            c0389Eb = (C0389Eb) interfaceC0473Hh;
            int i2 = c0389Eb.f240o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0389Eb.f240o = i2 - Integer.MIN_VALUE;
            } else {
                c0389Eb = new C0389Eb(this, interfaceC0473Hh);
            }
        } else {
            c0389Eb = new C0389Eb(this, interfaceC0473Hh);
        }
        Object objU = c0389Eb.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0389Eb.f240o;
        if (i3 == 0) {
            Jp0.O(objU);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1984kb c1984kb = k;
            if (c1984kb != null) {
                if (c1984kb.c <= 3000 + jCurrentTimeMillis) {
                    c1984kb = null;
                }
                if (c1984kb != null) {
                    return c1984kb;
                }
            }
            String string = new JSONObject().put("uniqueId", s()).toString();
            AbstractC1474fG.i(string, "toString(...)");
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(c2179mb.a("clientRegURL").concat("/device/app/register"));
            c0560Kq.m("POST", C2743sL.k(string, d));
            c0560Kq.j("X-Authorization", str);
            c0560Kq.j("Authorization", "Bearer " + str2);
            c0560Kq.j("X-Client-Id", c2179mb.a("xClientId").concat("-mobileweb"));
            c0560Kq.j("Referer", "https://www.canela.tv/");
            C1951k70 c1951k70C = c0560Kq.c();
            c0389Eb.l = jCurrentTimeMillis;
            c0389Eb.f240o = 1;
            objU = u(c1951k70C, c0389Eb);
            if (objU == enumC1706hi) {
                return enumC1706hi;
            }
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c0389Eb.l;
            Jp0.O(objU);
        }
        JSONObject jSONObjectOptJSONObject = ((JSONObject) objU).optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            throw new IllegalStateException("Canela TV no pudo registrar el dispositivo".toString());
        }
        String strOptString = jSONObjectOptJSONObject.optString("secret");
        long jF = U9.f(jSONObjectOptJSONObject.optLong("expiry", 30L), 10L);
        AbstractC1474fG.g(strOptString);
        if (AbstractC1899jh0.O(strOptString)) {
            throw new IllegalStateException("Canela TV devolvió una firma vacía".toString());
        }
        C1984kb c1984kb2 = new C1984kb(jF, (1000 * jF) + j2, strOptString);
        k = c1984kb2;
        return c1984kb2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0415Fb c0415Fb;
        Object obj;
        int i3;
        C0441Gb c0441Gb;
        C2179mb c2179mb;
        JSONArray jSONArrayOptJSONArray;
        Iterable iterableB;
        ArrayList arrayList;
        Iterator it;
        HashSet hashSet;
        ArrayList arrayList2;
        Cd0 cd0E;
        if (interfaceC0473Hh instanceof C0415Fb) {
            c0415Fb = (C0415Fb) interfaceC0473Hh;
            int i4 = c0415Fb.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0415Fb.q = i4 - Integer.MIN_VALUE;
            } else {
                c0415Fb = new C0415Fb(this, interfaceC0473Hh);
            }
        } else {
            c0415Fb = new C0415Fb(this, interfaceC0473Hh);
        }
        Object objW = c0415Fb.f262o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = c0415Fb.q;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = c0415Fb.n;
                str = (String) c0415Fb.m;
                C0441Gb c0441Gb2 = c0415Fb.l;
                Jp0.O(objW);
                i3 = i6;
                c0441Gb = c0441Gb2;
                obj = objW;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2179mb = (C2179mb) c0415Fb.m;
                c0441Gb = c0415Fb.l;
                Jp0.O(objW);
            }
            jSONArrayOptJSONArray = ((JSONObject) objW).optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                c0441Gb.getClass();
                iterableB = B(jSONArrayOptJSONArray);
            } else {
                iterableB = null;
            }
            if (iterableB == null) {
                iterableB = C1233cq.l;
            }
            arrayList = new ArrayList();
            it = iterableB.iterator();
            while (it.hasNext()) {
                cd0E = E((JSONObject) it.next(), c2179mb);
                if (cd0E != null) {
                    arrayList.add(cd0E);
                }
            }
            hashSet = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                c0441Gb.getClass();
                if (hashSet.add(I((Cd0) obj2))) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        Jp0.O(objW);
        if (AbstractC1899jh0.O(str)) {
            return l;
        }
        c0415Fb.l = this;
        c0415Fb.m = str;
        c0415Fb.n = i2;
        c0415Fb.q = 1;
        Object objT = t(c0415Fb);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        obj = objT;
        i3 = i2;
        c0441Gb = this;
        C2179mb c2179mb2 = (C2179mb) obj;
        String strEncode = URLEncoder.encode(AbstractC1119bh0.E0(str).toString(), "UTF-8");
        String str2 = c2179mb2.a("searchURL") + "/content/search?mode=detail&st=published&term=" + strEncode + "&pageNumber=" + i3 + "&pageSize=30";
        c0441Gb.getClass();
        String strJ = J(str2, c2179mb2);
        c0415Fb.l = c0441Gb;
        c0415Fb.m = c2179mb2;
        c0415Fb.q = 2;
        objW = w(strJ, c0415Fb);
        if (objW == enumC1706hi) {
            return enumC1706hi;
        }
        c2179mb = c2179mb2;
        jSONArrayOptJSONArray = ((JSONObject) objW).optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            c0441Gb.getClass();
            iterableB = B(jSONArrayOptJSONArray);
        } else {
            iterableB = null;
        }
        if (iterableB == null) {
            iterableB = C1233cq.l;
        }
        arrayList = new ArrayList();
        it = iterableB.iterator();
        while (it.hasNext()) {
            cd0E = E((JSONObject) it.next(), c2179mb);
            if (cd0E != null) {
                arrayList.add(cd0E);
            }
        }
        hashSet = new HashSet();
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            c0441Gb.getClass();
            if (hashSet.add(I((Cd0) obj2))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3245xb c3245xb;
        C0441Gb c0441Gb;
        C0441Gb c0441Gb2;
        C2179mb c2179mb;
        if (interfaceC0473Hh instanceof C3245xb) {
            c3245xb = (C3245xb) interfaceC0473Hh;
            int i2 = c3245xb.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3245xb.p = i2 - Integer.MIN_VALUE;
            } else {
                c3245xb = new C3245xb(this, interfaceC0473Hh);
            }
        } else {
            c3245xb = new C3245xb(this, interfaceC0473Hh);
        }
        Object objT = c3245xb.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c3245xb.p;
        if (i3 != 0) {
            if (i3 == 1) {
                str = (String) c3245xb.m;
                c0441Gb = c3245xb.l;
                Jp0.O(objT);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2179mb = (C2179mb) c3245xb.m;
                c0441Gb2 = c3245xb.l;
                Jp0.O(objT);
            }
            c0441Gb2.getClass();
            return D((JSONObject) objT, c2179mb);
        }
        Jp0.O(objT);
        c3245xb.l = this;
        c3245xb.m = str;
        c3245xb.p = 1;
        objT = t(c3245xb);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb = this;
        C2179mb c2179mb2 = (C2179mb) objT;
        c0441Gb.getClass();
        String strR = r(str);
        c3245xb.l = c0441Gb;
        c3245xb.m = c2179mb2;
        c3245xb.p = 2;
        Object objX = c0441Gb.x("movie", strR, c2179mb2, c3245xb);
        if (objX == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb2 = c0441Gb;
        objT = objX;
        c2179mb = c2179mb2;
        c0441Gb2.getClass();
        return D((JSONObject) objT, c2179mb);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f4 -> B:32:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object c(java.lang.String r22, java.lang.String r23, o.InterfaceC0473Hh r24) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0441Gb.c(java.lang.String, java.lang.String, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0311Bb c0311Bb;
        if (interfaceC0473Hh instanceof C0311Bb) {
            c0311Bb = (C0311Bb) interfaceC0473Hh;
            int i3 = c0311Bb.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0311Bb.n = i3 - Integer.MIN_VALUE;
            } else {
                c0311Bb = new C0311Bb(this, interfaceC0473Hh);
            }
        } else {
            c0311Bb = new C0311Bb(this, interfaceC0473Hh);
        }
        Object objQ = c0311Bb.l;
        Object obj = EnumC1706hi.l;
        int i4 = c0311Bb.n;
        if (i4 == 0) {
            Jp0.O(objQ);
            c0311Bb.n = 1;
            objQ = q(i2, "series", "tvseries", c0311Bb);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objQ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objQ) {
            if (obj2 instanceof C2109lo0) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        String strA0 = AbstractC1119bh0.A0(str, '|', str);
        if (!AbstractC1119bh0.X(str, '|')) {
            strA0 = null;
        }
        String str2 = "movie";
        if (!AbstractC1474fG.b(strA0, "movie") && (AbstractC1474fG.b(strA0, "tvepisode") || !(video$Type instanceof Is0))) {
            str2 = "tvepisode";
        }
        String strR = r(str);
        if (AbstractC1899jh0.O(strR)) {
            return C1233cq.l;
        }
        return AbstractC2506pt.A(new Ds0("canela-play|" + str2 + "|" + strR, "Canela TV", null, AbstractC3327yN.z(new C1101bX("Referer", "https://www.canela.tv/"), new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36")), 52));
    }

    @Override // o.Q30
    public final String f() {
        return "https://www.canela.tv/favicon.ico";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3148wb c3148wb;
        C0441Gb c0441Gb;
        Object next;
        String strA;
        if (interfaceC0473Hh instanceof C3148wb) {
            c3148wb = (C3148wb) interfaceC0473Hh;
            int i2 = c3148wb.f1094o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3148wb.f1094o = i2 - Integer.MIN_VALUE;
            } else {
                c3148wb = new C3148wb(this, interfaceC0473Hh);
            }
        } else {
            c3148wb = new C3148wb(this, interfaceC0473Hh);
        }
        Object objT = c3148wb.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c3148wb.f1094o;
        if (i3 == 0) {
            Jp0.O(objT);
            c3148wb.l = this;
            c3148wb.f1094o = 1;
            objT = t(c3148wb);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c0441Gb = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0441Gb = c3148wb.l;
            Jp0.O(objT);
        }
        C2179mb c2179mb = (C2179mb) objT;
        JSONArray jSONArrayOptJSONArray = new JSONObject(c2179mb.f).getJSONObject("data").optJSONArray("t");
        C1233cq c1233cq = C1233cq.l;
        if (jSONArrayOptJSONArray != null) {
            c0441Gb.getClass();
            C3421zK c3421zKB = B(jSONArrayOptJSONArray);
            if (c3421zKB != null) {
                int i4 = 0;
                ListIterator listIterator = c3421zKB.listIterator(0);
                do {
                    C3324yK c3324yK = (C3324yK) listIterator;
                    if (!c3324yK.hasNext()) {
                        next = null;
                        break;
                    }
                    next = c3324yK.next();
                } while (!AbstractC1474fG.b(((JSONObject) next).optString("nu"), "home"));
                JSONObject jSONObject = (JSONObject) next;
                if (jSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("c");
                    Iterable iterableB = jSONArrayOptJSONArray2 != null ? B(jSONArrayOptJSONArray2) : null;
                    if (iterableB == null) {
                        iterableB = c1233cq;
                    }
                    for (Object obj : iterableB) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0937Ze.N();
                            throw null;
                        }
                        JSONObject jSONObject2 = (JSONObject) obj;
                        JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("cd");
                        Iterable iterableB2 = jSONArrayOptJSONArray3 != null ? B(jSONArrayOptJSONArray3) : null;
                        if (iterableB2 == null) {
                            iterableB2 = c1233cq;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = iterableB2.iterator();
                        while (it.hasNext()) {
                            Cd0 cd0E = E((JSONObject) it.next(), c2179mb);
                            if (cd0E != null) {
                                arrayList2.add(cd0E);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (hashSet.add(I((Cd0) obj2))) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            if (i4 == 0) {
                                strA = "Featured";
                            } else {
                                strA = A(jSONObject2, "lon");
                                if (strA == null) {
                                    strA = "Canela TV";
                                }
                            }
                            arrayList.add(new C0882Xb(strA, arrayList3));
                        }
                        i4 = i5;
                    }
                    return arrayList;
                }
            }
        }
        return c1233cq;
    }

    @Override // o.Q30
    public final String getName() {
        return "Canela TV";
    }

    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C2954ub(str, i2, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3342yb c3342yb;
        if (interfaceC0473Hh instanceof C3342yb) {
            c3342yb = (C3342yb) interfaceC0473Hh;
            int i3 = c3342yb.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3342yb.n = i3 - Integer.MIN_VALUE;
            } else {
                c3342yb = new C3342yb(this, interfaceC0473Hh);
            }
        } else {
            c3342yb = new C3342yb(this, interfaceC0473Hh);
        }
        Object objQ = c3342yb.l;
        Object obj = EnumC1706hi.l;
        int i4 = c3342yb.n;
        if (i4 == 0) {
            Jp0.O(objQ);
            c3342yb.n = 1;
            objQ = q(i2, "movies", "movie", c3342yb);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objQ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objQ) {
            if (obj2 instanceof C1387eR) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0285Ab c0285Ab;
        C0441Gb c0441Gb;
        String strR;
        C2179mb c2179mb;
        JSONObject jSONObject;
        Object objZ;
        C0441Gb c0441Gb2;
        C2179mb c2179mb2;
        JSONObject jSONObject2;
        if (interfaceC0473Hh instanceof C0285Ab) {
            c0285Ab = (C0285Ab) interfaceC0473Hh;
            int i2 = c0285Ab.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0285Ab.q = i2 - Integer.MIN_VALUE;
            } else {
                c0285Ab = new C0285Ab(this, interfaceC0473Hh);
            }
        } else {
            c0285Ab = new C0285Ab(this, interfaceC0473Hh);
        }
        Object objT = c0285Ab.f173o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0285Ab.q;
        if (i3 != 0) {
            if (i3 == 1) {
                str = (String) c0285Ab.m;
                c0441Gb = c0285Ab.l;
                Jp0.O(objT);
            } else if (i3 == 2) {
                strR = (String) c0285Ab.n;
                C2179mb c2179mb3 = (C2179mb) c0285Ab.m;
                C0441Gb c0441Gb3 = c0285Ab.l;
                Jp0.O(objT);
                c2179mb = c2179mb3;
                c0441Gb = c0441Gb3;
                jSONObject = (JSONObject) objT;
                String strOptString = jSONObject.optString("id");
                AbstractC1474fG.i(strOptString, "optString(...)");
                c0285Ab.l = c0441Gb;
                c0285Ab.m = c2179mb;
                c0285Ab.n = jSONObject;
                c0285Ab.q = 3;
                objZ = c0441Gb.z(strOptString, strR, c2179mb, c0285Ab);
                if (objZ == enumC1706hi) {
                    return enumC1706hi;
                }
                c0441Gb2 = c0441Gb;
                c2179mb2 = c2179mb;
                objT = objZ;
                jSONObject2 = jSONObject;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject2 = (JSONObject) c0285Ab.n;
                c2179mb2 = (C2179mb) c0285Ab.m;
                c0441Gb2 = c0285Ab.l;
                Jp0.O(objT);
            }
            c0441Gb2.getClass();
            return F(jSONObject2, c2179mb2, (List) objT);
        }
        Jp0.O(objT);
        c0285Ab.l = this;
        c0285Ab.m = str;
        c0285Ab.q = 1;
        objT = t(c0285Ab);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb = this;
        C2179mb c2179mb4 = (C2179mb) objT;
        c0441Gb.getClass();
        strR = r(str);
        c0285Ab.l = c0441Gb;
        c0285Ab.m = c2179mb4;
        c0285Ab.n = strR;
        c0285Ab.q = 2;
        Object objX = c0441Gb.x("tvseries", strR, c2179mb4, c0285Ab);
        if (objX == enumC1706hi) {
            return enumC1706hi;
        }
        c2179mb = c2179mb4;
        objT = objX;
        jSONObject = (JSONObject) objT;
        String strOptString2 = jSONObject.optString("id");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        c0285Ab.l = c0441Gb;
        c0285Ab.m = c2179mb;
        c0285Ab.n = jSONObject;
        c0285Ab.q = 3;
        objZ = c0441Gb.z(strOptString2, strR, c2179mb, c0285Ab);
        if (objZ == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb2 = c0441Gb;
        c2179mb2 = c2179mb;
        objT = objZ;
        jSONObject2 = jSONObject;
        c0441Gb2.getClass();
        return F(jSONObject2, c2179mb2, (List) objT);
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

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0337Cb c0337Cb;
        if (interfaceC0473Hh instanceof C0337Cb) {
            c0337Cb = (C0337Cb) interfaceC0473Hh;
            int i2 = c0337Cb.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0337Cb.n = i2 - Integer.MIN_VALUE;
            } else {
                c0337Cb = new C0337Cb(this, interfaceC0473Hh);
            }
        } else {
            c0337Cb = new C0337Cb(this, interfaceC0473Hh);
        }
        Object objP = c0337Cb.l;
        Object obj = EnumC1706hi.l;
        int i3 = c0337Cb.n;
        if (i3 == 0) {
            Jp0.O(objP);
            boolean zU = AbstractC1899jh0.U(ds0.l, "canela-play|", false);
            String str = ds0.l;
            if (!zU) {
                String str2 = ds0.n;
                String str3 = AbstractC1899jh0.O(str2) ? str : str2;
                return new Js0(str3, ds0.f223o, AbstractC1119bh0.W(str3, ".m3u8", false) ? "hls" : null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4088);
            }
            List listS0 = AbstractC1119bh0.s0(AbstractC1119bh0.l0(str, "canela-play|"), new char[]{'|'}, 2, 2);
            if (listS0.size() != 2) {
                throw new IllegalStateException("Identificador de Canela inválido".toString());
            }
            String str4 = (String) listS0.get(1);
            String str5 = (String) listS0.get(0);
            c0337Cb.n = 1;
            objP = p(str4, str5, c0337Cb);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objP);
        }
        return new Js0((String) objP, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36"), new C1101bX("Referer", "https://www.canela.tv/"), new C1101bX("Origin", "https://www.canela.tv")), "hls", (String) null, (String) null, (byte[]) null, (String) null, "https://www.canela.tv/", (String) null, (List) null, false, 3960);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0281 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2276nb c2276nb;
        String str3;
        String str4;
        Object objT;
        C0441Gb c0441Gb;
        C2179mb c2179mb;
        C0441Gb c0441Gb2;
        String str5;
        String str6;
        C2082lb c2082lb;
        String str7;
        String str8;
        String str9;
        Object objU;
        if (interfaceC0473Hh instanceof C2276nb) {
            c2276nb = (C2276nb) interfaceC0473Hh;
            int i2 = c2276nb.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2276nb.t = i2 - Integer.MIN_VALUE;
            } else {
                c2276nb = new C2276nb(this, interfaceC0473Hh);
            }
        } else {
            c2276nb = new C2276nb(this, interfaceC0473Hh);
        }
        Object obj = c2276nb.r;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2276nb.t;
        if (i3 != 0) {
            if (i3 == 1) {
                str4 = c2276nb.n;
                String str10 = c2276nb.m;
                c0441Gb = c2276nb.l;
                Jp0.O(obj);
                objT = obj;
                str3 = str10;
            } else if (i3 == 2) {
                C2179mb c2179mb2 = c2276nb.f938o;
                String str11 = c2276nb.n;
                String str12 = c2276nb.m;
                C0441Gb c0441Gb3 = c2276nb.l;
                Jp0.O(obj);
                c0441Gb2 = c0441Gb3;
                str5 = str12;
                str6 = str11;
                c2179mb = c2179mb2;
                String str13 = (String) obj;
                c2082lb = i;
                if (c2082lb != null || (str7 = c2082lb.a) == null) {
                    throw new IllegalStateException("Canela TV no conserva el token de aplicación".toString());
                }
                c2276nb.l = c0441Gb2;
                c2276nb.m = str5;
                c2276nb.n = str6;
                c2276nb.f938o = c2179mb;
                c2276nb.p = str13;
                c2276nb.q = str7;
                c2276nb.t = 3;
                Object objG = c0441Gb2.G(str13, str7, c2179mb, c2276nb);
                if (objG == enumC1706hi) {
                    return enumC1706hi;
                }
                str8 = str13;
                obj = objG;
                C1984kb c1984kb = (C1984kb) obj;
                c0441Gb2.getClass();
                String strS = s();
                String str14 = c1984kb.a;
                double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
                String string = new JSONObject().put("alg", "HS256").put("typ", "JWT").toString();
                AbstractC1474fG.i(string, "toString(...)");
                C2276nb c2276nb2 = c2276nb;
                String string2 = new JSONObject().put("deviceId", strS).put("aud", "playback-auth-service").put("iat", dCurrentTimeMillis).put("exp", dCurrentTimeMillis + c1984kb.b).toString();
                AbstractC1474fG.i(string2, "toString(...)");
                Charset charset = AbstractC1305dd.a;
                byte[] bytes = string.getBytes(charset);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 11);
                AbstractC1474fG.i(strEncodeToString, "encodeToString(...)");
                byte[] bytes2 = string2.getBytes(charset);
                AbstractC1474fG.i(bytes2, "getBytes(...)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 11);
                AbstractC1474fG.i(strEncodeToString2, "encodeToString(...)");
                String strE = AbstractC1701hf0.e(strEncodeToString, ".", strEncodeToString2);
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(Base64.decode(str14, 0), "HmacSHA256"));
                byte[] bytes3 = strE.getBytes(charset);
                AbstractC1474fG.i(bytes3, "getBytes(...)");
                byte[] bArrDoFinal = mac.doFinal(bytes3);
                AbstractC1474fG.i(bArrDoFinal, "doFinal(...)");
                String strEncodeToString3 = Base64.encodeToString(bArrDoFinal, 11);
                AbstractC1474fG.i(strEncodeToString3, "encodeToString(...)");
                String strE2 = AbstractC1701hf0.e(strE, ".", strEncodeToString3);
                JSONObject jSONObjectPut = new JSONObject().put("deviceName", "mobileweb").put("deviceId", s()).put("contentId", str5).put("contentTypeId", "vod").put("catalogType", str6).put("mediaFormat", "hls").put("drm", "none").put("delivery", "streaming").put("disableSsai", "false").put("deviceManufacturer", "web").put("deviceModelName", "web").put("deviceModelNumber", "chrome").put("deviceOs", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36").put("supportedAudioCodecs", "mp4a").put("supportedVideoCodecs", "avc,av01").put("supportedMaxWVSecurityLevel", "L3").put("deviceToken", strE2);
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u(c2179mb.a("contentAuthURL").concat("/media/content/authorize"));
                String string3 = jSONObjectPut.toString();
                AbstractC1474fG.i(string3, "toString(...)");
                c0560Kq.m("POST", C2743sL.k(string3, c));
                c0560Kq.j("X-Device-Id", strE2);
                c0560Kq.j("X-Authorization", str8);
                c0560Kq.j("Authorization", "Bearer " + str7);
                c0560Kq.j("X-Client-Id", c2179mb.a("xClientId").concat("-mobileweb"));
                c0560Kq.j("Referer", "https://www.canela.tv/");
                C1951k70 c1951k70C = c0560Kq.c();
                str9 = null;
                c2276nb2.l = null;
                c2276nb2.m = null;
                c2276nb2.n = null;
                c2276nb2.f938o = null;
                c2276nb2.p = null;
                c2276nb2.q = null;
                c2276nb2.t = 4;
                objU = u(c1951k70C, c2276nb2);
                if (objU == enumC1706hi) {
                    return enumC1706hi;
                }
            } else if (i3 == 3) {
                str7 = c2276nb.q;
                str8 = c2276nb.p;
                c2179mb = c2276nb.f938o;
                str6 = c2276nb.n;
                str5 = c2276nb.m;
                c0441Gb2 = c2276nb.l;
                Jp0.O(obj);
                C1984kb c1984kb2 = (C1984kb) obj;
                c0441Gb2.getClass();
                String strS2 = s();
                String str15 = c1984kb2.a;
                double dCurrentTimeMillis2 = System.currentTimeMillis() / 1000.0d;
                String string4 = new JSONObject().put("alg", "HS256").put("typ", "JWT").toString();
                AbstractC1474fG.i(string4, "toString(...)");
                C2276nb c2276nb3 = c2276nb;
                String string5 = new JSONObject().put("deviceId", strS2).put("aud", "playback-auth-service").put("iat", dCurrentTimeMillis2).put("exp", dCurrentTimeMillis2 + c1984kb2.b).toString();
                AbstractC1474fG.i(string5, "toString(...)");
                Charset charset2 = AbstractC1305dd.a;
                byte[] bytes4 = string4.getBytes(charset2);
                AbstractC1474fG.i(bytes4, "getBytes(...)");
                String strEncodeToString4 = Base64.encodeToString(bytes4, 11);
                AbstractC1474fG.i(strEncodeToString4, "encodeToString(...)");
                byte[] bytes5 = string5.getBytes(charset2);
                AbstractC1474fG.i(bytes5, "getBytes(...)");
                String strEncodeToString5 = Base64.encodeToString(bytes5, 11);
                AbstractC1474fG.i(strEncodeToString5, "encodeToString(...)");
                String strE3 = AbstractC1701hf0.e(strEncodeToString4, ".", strEncodeToString5);
                Mac mac2 = Mac.getInstance("HmacSHA256");
                mac2.init(new SecretKeySpec(Base64.decode(str15, 0), "HmacSHA256"));
                byte[] bytes6 = strE3.getBytes(charset2);
                AbstractC1474fG.i(bytes6, "getBytes(...)");
                byte[] bArrDoFinal2 = mac2.doFinal(bytes6);
                AbstractC1474fG.i(bArrDoFinal2, "doFinal(...)");
                String strEncodeToString6 = Base64.encodeToString(bArrDoFinal2, 11);
                AbstractC1474fG.i(strEncodeToString6, "encodeToString(...)");
                String strE4 = AbstractC1701hf0.e(strE3, ".", strEncodeToString6);
                JSONObject jSONObjectPut2 = new JSONObject().put("deviceName", "mobileweb").put("deviceId", s()).put("contentId", str5).put("contentTypeId", "vod").put("catalogType", str6).put("mediaFormat", "hls").put("drm", "none").put("delivery", "streaming").put("disableSsai", "false").put("deviceManufacturer", "web").put("deviceModelName", "web").put("deviceModelNumber", "chrome").put("deviceOs", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36").put("supportedAudioCodecs", "mp4a").put("supportedVideoCodecs", "avc,av01").put("supportedMaxWVSecurityLevel", "L3").put("deviceToken", strE4);
                C0560Kq c0560Kq2 = new C0560Kq();
                c0560Kq2.u(c2179mb.a("contentAuthURL").concat("/media/content/authorize"));
                String string6 = jSONObjectPut2.toString();
                AbstractC1474fG.i(string6, "toString(...)");
                c0560Kq2.m("POST", C2743sL.k(string6, c));
                c0560Kq2.j("X-Device-Id", strE4);
                c0560Kq2.j("X-Authorization", str8);
                c0560Kq2.j("Authorization", "Bearer " + str7);
                c0560Kq2.j("X-Client-Id", c2179mb.a("xClientId").concat("-mobileweb"));
                c0560Kq2.j("Referer", "https://www.canela.tv/");
                C1951k70 c1951k70C2 = c0560Kq2.c();
                str9 = null;
                c2276nb3.l = null;
                c2276nb3.m = null;
                c2276nb3.n = null;
                c2276nb3.f938o = null;
                c2276nb3.p = null;
                c2276nb3.q = null;
                c2276nb3.t = 4;
                objU = u(c1951k70C2, c2276nb3);
                if (objU == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                objU = obj;
                str9 = null;
            }
            JSONObject jSONObject = (JSONObject) objU;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("contentUrl") : str9;
            if (strOptString == null) {
                strOptString = "";
            }
            if (AbstractC1899jh0.U(strOptString, "http", false)) {
                return strOptString;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("header");
            String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : str9;
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            throw new IllegalStateException(("Canela TV no autorizó el video" + (AbstractC1899jh0.O(strOptString2) ? "" : ": ".concat(strOptString2))).toString());
        }
        Jp0.O(obj);
        c2276nb.l = this;
        str3 = str;
        c2276nb.m = str3;
        str4 = str2;
        c2276nb.n = str4;
        c2276nb.t = 1;
        objT = t(c2276nb);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb = this;
        c2179mb = (C2179mb) objT;
        c2276nb.l = c0441Gb;
        c2276nb.m = str3;
        c2276nb.n = str4;
        c2276nb.f938o = c2179mb;
        c2276nb.t = 2;
        Object objV = c0441Gb.v(c2179mb, c2276nb);
        if (objV == enumC1706hi) {
            return enumC1706hi;
        }
        c0441Gb2 = c0441Gb;
        str5 = str3;
        obj = objV;
        str6 = str4;
        String str16 = (String) obj;
        c2082lb = i;
        if (c2082lb != null) {
        }
        throw new IllegalStateException("Canela TV no conserva el token de aplicación".toString());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable q(int i2, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2373ob c2373ob;
        Object obj;
        String str3;
        C0441Gb c0441Gb;
        String str4;
        C2179mb c2179mb;
        JSONArray jSONArrayOptJSONArray;
        Iterable iterableB;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        HashSet hashSet;
        ArrayList arrayList4;
        Cd0 cd0E;
        JSONArray jSONArrayOptJSONArray2;
        Iterable iterableB2;
        if (interfaceC0473Hh instanceof C2373ob) {
            c2373ob = (C2373ob) interfaceC0473Hh;
            int i3 = c2373ob.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2373ob.r = i3 - Integer.MIN_VALUE;
            } else {
                c2373ob = new C2373ob(this, interfaceC0473Hh);
            }
        } else {
            c2373ob = new C2373ob(this, interfaceC0473Hh);
        }
        Object obj2 = c2373ob.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c2373ob.r;
        C1233cq c1233cq = C1233cq.l;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = c2373ob.f949o;
                String str5 = (String) c2373ob.n;
                str = c2373ob.m;
                C0441Gb c0441Gb2 = c2373ob.l;
                Jp0.O(obj2);
                str3 = str5;
                c0441Gb = c0441Gb2;
                obj = obj2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2179mb = (C2179mb) c2373ob.n;
                str4 = c2373ob.m;
                c0441Gb = c2373ob.l;
                Jp0.O(obj2);
            }
            jSONArrayOptJSONArray = ((JSONObject) obj2).optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                c0441Gb.getClass();
                iterableB = B(jSONArrayOptJSONArray);
            } else {
                iterableB = null;
            }
            if (iterableB == null) {
                iterableB = c1233cq;
            }
            arrayList = new ArrayList();
            it = iterableB.iterator();
            while (it.hasNext()) {
                jSONArrayOptJSONArray2 = ((JSONObject) it.next()).optJSONArray("cd");
                if (jSONArrayOptJSONArray2 != null) {
                    iterableB2 = B(jSONArrayOptJSONArray2);
                } else {
                    iterableB2 = null;
                }
                if (iterableB2 == null) {
                    iterableB2 = c1233cq;
                }
                AbstractC1406ef.Q(arrayList, iterableB2);
            }
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (AbstractC1474fG.b(((JSONObject) obj3).optString("cty"), str4)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList3 = new ArrayList();
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                cd0E = E((JSONObject) it2.next(), c2179mb);
                if (cd0E != null) {
                    arrayList3.add(cd0E);
                }
            }
            hashSet = new HashSet();
            arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                c0441Gb.getClass();
                if (hashSet.add(I((Cd0) obj4))) {
                    arrayList4.add(obj4);
                }
            }
            return arrayList4;
        }
        Jp0.O(obj2);
        c2373ob.l = this;
        c2373ob.m = str;
        c2373ob.n = str2;
        c2373ob.f949o = i2;
        c2373ob.r = 1;
        Object objT = t(c2373ob);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        obj = objT;
        str3 = str2;
        c0441Gb = this;
        C2179mb c2179mb2 = (C2179mb) obj;
        String str6 = (String) c2179mb2.e.get(str);
        if (str6 == null) {
            return c1233cq;
        }
        StringBuilder sbS = AbstractC1674hK.s(c2179mb2.a("catalogURL"), "/catalog/storefront/");
        AbstractC1701hf0.r(sbS, c2179mb2.d, "/", str6, "/containers?pageNumber=");
        sbS.append(i2);
        sbS.append("&pageSize=5");
        String string = sbS.toString();
        c0441Gb.getClass();
        String strJ = J(string, c2179mb2);
        c2373ob.l = c0441Gb;
        c2373ob.m = str3;
        c2373ob.n = c2179mb2;
        c2373ob.r = 2;
        Object objW = w(strJ, c2373ob);
        if (objW == enumC1706hi) {
            return enumC1706hi;
        }
        str4 = str3;
        obj2 = objW;
        c2179mb = c2179mb2;
        jSONArrayOptJSONArray = ((JSONObject) obj2).optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            c0441Gb.getClass();
            iterableB = B(jSONArrayOptJSONArray);
        } else {
            iterableB = null;
        }
        if (iterableB == null) {
            iterableB = c1233cq;
        }
        arrayList = new ArrayList();
        it = iterableB.iterator();
        while (it.hasNext()) {
            jSONArrayOptJSONArray2 = ((JSONObject) it.next()).optJSONArray("cd");
            if (jSONArrayOptJSONArray2 != null) {
                iterableB2 = B(jSONArrayOptJSONArray2);
            } else {
                iterableB2 = null;
            }
            if (iterableB2 == null) {
                iterableB2 = c1233cq;
            }
            AbstractC1406ef.Q(arrayList, iterableB2);
        }
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            if (AbstractC1474fG.b(((JSONObject) obj3).optString("cty"), str4)) {
                arrayList2.add(obj3);
            }
        }
        arrayList3 = new ArrayList();
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            cd0E = E((JSONObject) it2.next(), c2179mb);
            if (cd0E != null) {
                arrayList3.add(cd0E);
            }
        }
        hashSet = new HashSet();
        arrayList4 = new ArrayList();
        while (r12.hasNext()) {
            c0441Gb.getClass();
            if (hashSet.add(I((Cd0) obj4))) {
                arrayList4.add(obj4);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0226 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:39:0x0088, B:41:0x0092, B:45:0x009b, B:48:0x00ab, B:49:0x00b4, B:51:0x00ba, B:52:0x00d0, B:53:0x00f2, B:55:0x00f8, B:57:0x0106, B:60:0x010d, B:61:0x0127, B:62:0x0128, B:65:0x0132, B:67:0x013a, B:71:0x0152, B:75:0x015f, B:33:0x0075, B:36:0x007b), top: B:109:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba A[Catch: all -> 0x0055, LOOP:1: B:49:0x00b4->B:51:0x00ba, LOOP_END, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:39:0x0088, B:41:0x0092, B:45:0x009b, B:48:0x00ab, B:49:0x00b4, B:51:0x00ba, B:52:0x00d0, B:53:0x00f2, B:55:0x00f8, B:57:0x0106, B:60:0x010d, B:61:0x0127, B:62:0x0128, B:65:0x0132, B:67:0x013a, B:71:0x0152, B:75:0x015f, B:33:0x0075, B:36:0x007b), top: B:109:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:39:0x0088, B:41:0x0092, B:45:0x009b, B:48:0x00ab, B:49:0x00b4, B:51:0x00ba, B:52:0x00d0, B:53:0x00f2, B:55:0x00f8, B:57:0x0106, B:60:0x010d, B:61:0x0127, B:62:0x0128, B:65:0x0132, B:67:0x013a, B:71:0x0152, B:75:0x015f, B:33:0x0075, B:36:0x007b), top: B:109:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bc A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:14:0x003c, B:79:0x01a6, B:81:0x01b0, B:83:0x01bc, B:88:0x01c6, B:89:0x01cf, B:91:0x01d5, B:93:0x01ee, B:96:0x01f8, B:99:0x0201, B:100:0x0205, B:104:0x0226, B:105:0x0231), top: B:108:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [o.VS] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object t(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2470pb c2470pb;
        ?? r2;
        VS vs;
        C2179mb c2179mb;
        VS vs2;
        JSONArray jSONArrayOptJSONArray;
        Iterable<JSONObject> iterableB;
        int iX;
        LinkedHashMap linkedHashMap;
        JSONObject jSONObjectOptJSONObject;
        String str;
        String str2;
        Object objW;
        String str3;
        LinkedHashMap linkedHashMap2;
        String str4;
        ?? r3;
        String strOptString;
        String lowerCase;
        CharSequence charSequence;
        ?? r5;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray2;
        C3421zK c3421zKB;
        ArrayList arrayList;
        String strOptString2;
        String strOptString3;
        C1101bX c1101bX;
        if (interfaceC0473Hh instanceof C2470pb) {
            c2470pb = (C2470pb) interfaceC0473Hh;
            int i2 = c2470pb.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2470pb.r = i2 - Integer.MIN_VALUE;
            } else {
                c2470pb = new C2470pb(this, interfaceC0473Hh);
            }
        } else {
            c2470pb = new C2470pb(this, interfaceC0473Hh);
        }
        Object objW2 = c2470pb.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        ?? r6 = c2470pb.r;
        Iterable<JSONObject> iterable = C1233cq.l;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    VS vs3 = c2470pb.l;
                    Jp0.O(objW2);
                    vs = vs3;
                } else if (r6 == 2) {
                    VS vs4 = c2470pb.l;
                    Jp0.O(objW2);
                    vs2 = vs4;
                    vs2 = vs;
                    JSONObject jSONObject2 = (JSONObject) objW2;
                    jSONArrayOptJSONArray = jSONObject2.optJSONArray("config");
                    if (jSONArrayOptJSONArray != null) {
                        iterableB = B(jSONArrayOptJSONArray);
                    } else {
                        iterableB = null;
                    }
                    if (iterableB == null) {
                        iterableB = iterable;
                    }
                    iX = AbstractC3327yN.x(AbstractC1016af.O(iterableB, 10));
                    if (iX < 16) {
                        iX = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iX);
                    for (JSONObject jSONObject3 : iterableB) {
                        linkedHashMap.put(jSONObject3.optString("key"), jSONObject3.optString("value"));
                    }
                    for (String str5 : AbstractC0937Ze.K("catalogURL", "imageResizeURL", "vodMetaDataURL", "oAuthURL", "clientRegURL", "contentAuthURL", "clientID", "clientSecret", "xClientId", "guestFlatURL", "searchURL")) {
                        charSequence = (CharSequence) linkedHashMap.get(str5);
                        if (charSequence != null || AbstractC1899jh0.O(charSequence)) {
                            throw new IllegalStateException(("Canela config: falta " + str5).toString());
                        }
                    }
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject("geo");
                    str = "us";
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("country")) != null) {
                        Locale locale = Locale.ROOT;
                        AbstractC1474fG.i(locale, "ROOT");
                        lowerCase = strOptString.toLowerCase(locale);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                        if (AbstractC1899jh0.O(lowerCase)) {
                            str = lowerCase;
                        }
                    }
                    if (AbstractC1474fG.b(str, "ar")) {
                        str2 = "es-AR";
                    } else {
                        str2 = "es-MX";
                    }
                    C2179mb c2179mb2 = new C2179mb(linkedHashMap, str, str2, "", C1330dq.l, "");
                    String strJ = J(c2179mb2.a("catalogURL") + "/catalog/storefront/landingscreen?ivg=false&sfInfo=true", c2179mb2);
                    c2470pb.l = vs2;
                    c2470pb.m = linkedHashMap;
                    c2470pb.n = str;
                    c2470pb.f973o = str2;
                    c2470pb.r = 3;
                    objW = w(strJ, c2470pb);
                    if (objW == enumC1706hi) {
                        return enumC1706hi;
                    }
                    str3 = str;
                    linkedHashMap2 = linkedHashMap;
                    str4 = str2;
                    objW2 = objW;
                    r3 = vs2;
                } else {
                    if (r6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = c2470pb.f973o;
                    String str7 = c2470pb.n;
                    LinkedHashMap linkedHashMap3 = c2470pb.m;
                    r2 = c2470pb.l;
                    try {
                        Jp0.O(objW2);
                        str4 = str6;
                        str3 = str7;
                        linkedHashMap2 = linkedHashMap3;
                        r3 = r2;
                    } catch (Throwable th) {
                        th = th;
                        ((YS) r2).e(null);
                        throw th;
                    }
                }
                jSONObject = (JSONObject) objW2;
                jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    throw new IllegalStateException("Canela TV no entregó el storefront".toString());
                }
                String strOptString4 = jSONObjectOptJSONObject2.optString("id");
                jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("t");
                if (jSONArrayOptJSONArray2 != null) {
                    c3421zKB = B(jSONArrayOptJSONArray2);
                } else {
                    c3421zKB = null;
                }
                if (c3421zKB == null) {
                    iterable = c3421zKB;
                }
                arrayList = new ArrayList();
                for (JSONObject jSONObject4 : iterable) {
                    strOptString2 = jSONObject4.optString("nu");
                    strOptString3 = jSONObject4.optString("id");
                    AbstractC1474fG.g(strOptString2);
                    if (AbstractC1899jh0.O(strOptString2)) {
                        c1101bX = null;
                    } else {
                        AbstractC1474fG.g(strOptString3);
                        if (AbstractC1899jh0.O(strOptString3)) {
                            c1101bX = null;
                        } else {
                            c1101bX = new C1101bX(strOptString2, strOptString3);
                        }
                    }
                    if (c1101bX != null) {
                        arrayList.add(c1101bX);
                    }
                }
                Map mapA = AbstractC3327yN.A(arrayList);
                AbstractC1474fG.g(strOptString4);
                String string = jSONObject.toString();
                AbstractC1474fG.i(string, "toString(...)");
                C2179mb c2179mb3 = new C2179mb(linkedHashMap2, str3, str4, strOptString4, mapA, string);
                f = c2179mb3;
                c2179mb = c2179mb3;
                r5 = r3;
                ((YS) r5).e(null);
                return c2179mb;
            }
            Jp0.O(objW2);
            C2179mb c2179mb4 = f;
            if (c2179mb4 != null) {
                return c2179mb4;
            }
            YS ys = g;
            c2470pb.l = ys;
            c2470pb.r = 1;
            if (ys.d(null, c2470pb) == enumC1706hi) {
                return enumC1706hi;
            }
            vs = ys;
            c2179mb = f;
            if (c2179mb != null) {
                r5 = vs;
            } else {
                c2470pb.l = vs;
                c2470pb.r = 2;
                objW2 = w("https://config-service-cdn.cms.api.canela.tv/launch/config?device=web&client=canela-canela-web", c2470pb);
                if (objW2 == enumC1706hi) {
                    vs2 = vs;
                    return enumC1706hi;
                }
                vs2 = vs;
                JSONObject jSONObject5 = (JSONObject) objW2;
                jSONArrayOptJSONArray = jSONObject5.optJSONArray("config");
                if (jSONArrayOptJSONArray != null) {
                    iterableB = B(jSONArrayOptJSONArray);
                } else {
                    iterableB = null;
                }
                if (iterableB == null) {
                    iterableB = iterable;
                }
                iX = AbstractC3327yN.x(AbstractC1016af.O(iterableB, 10));
                if (iX < 16) {
                    iX = 16;
                }
                linkedHashMap = new LinkedHashMap(iX);
                while (r8.hasNext()) {
                    linkedHashMap.put(jSONObject3.optString("key"), jSONObject3.optString("value"));
                }
                while (r8.hasNext()) {
                    charSequence = (CharSequence) linkedHashMap.get(str5);
                    if (charSequence != null) {
                    }
                    throw new IllegalStateException(("Canela config: falta " + str5).toString());
                }
                jSONObjectOptJSONObject = jSONObject5.optJSONObject("geo");
                str = "us";
                if (jSONObjectOptJSONObject != null) {
                    Locale locale2 = Locale.ROOT;
                    AbstractC1474fG.i(locale2, "ROOT");
                    lowerCase = strOptString.toLowerCase(locale2);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    if (AbstractC1899jh0.O(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (AbstractC1474fG.b(str, "ar")) {
                    str2 = "es-AR";
                } else {
                    str2 = "es-MX";
                }
                C2179mb c2179mb5 = new C2179mb(linkedHashMap, str, str2, "", C1330dq.l, "");
                String strJ2 = J(c2179mb5.a("catalogURL") + "/catalog/storefront/landingscreen?ivg=false&sfInfo=true", c2179mb5);
                c2470pb.l = vs2;
                c2470pb.m = linkedHashMap;
                c2470pb.n = str;
                c2470pb.f973o = str2;
                c2470pb.r = 3;
                objW = w(strJ2, c2470pb);
                if (objW == enumC1706hi) {
                    return enumC1706hi;
                }
                str3 = str;
                linkedHashMap2 = linkedHashMap;
                str4 = str2;
                objW2 = objW;
                r3 = vs2;
                jSONObject = (JSONObject) objW2;
                jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    throw new IllegalStateException("Canela TV no entregó el storefront".toString());
                }
                String strOptString5 = jSONObjectOptJSONObject2.optString("id");
                jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("t");
                if (jSONArrayOptJSONArray2 != null) {
                    c3421zKB = B(jSONArrayOptJSONArray2);
                } else {
                    c3421zKB = null;
                }
                if (c3421zKB == null) {
                    iterable = c3421zKB;
                }
                arrayList = new ArrayList();
                while (r5.hasNext()) {
                    strOptString2 = jSONObject4.optString("nu");
                    strOptString3 = jSONObject4.optString("id");
                    AbstractC1474fG.g(strOptString2);
                    if (AbstractC1899jh0.O(strOptString2)) {
                        AbstractC1474fG.g(strOptString3);
                        if (AbstractC1899jh0.O(strOptString3)) {
                            c1101bX = null;
                        } else {
                            c1101bX = new C1101bX(strOptString2, strOptString3);
                        }
                    } else {
                        c1101bX = null;
                    }
                    if (c1101bX != null) {
                        arrayList.add(c1101bX);
                    }
                }
                Map mapA2 = AbstractC3327yN.A(arrayList);
                AbstractC1474fG.g(strOptString5);
                String string2 = jSONObject.toString();
                AbstractC1474fG.i(string2, "toString(...)");
                C2179mb c2179mb6 = new C2179mb(linkedHashMap2, str3, str4, strOptString5, mapA2, string2);
                f = c2179mb6;
                c2179mb = c2179mb6;
                r5 = r3;
            }
            ((YS) r5).e(null);
            return c2179mb;
        } catch (Throwable th2) {
            th = th2;
            r2 = r6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:21:0x0059, B:42:0x0104, B:44:0x0115, B:46:0x0125, B:47:0x012b, B:49:0x012f, B:54:0x013e, B:55:0x0142, B:71:0x020f, B:72:0x021a, B:29:0x0081, B:31:0x0089, B:38:0x009a), top: B:76:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x012f A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:21:0x0059, B:42:0x0104, B:44:0x0115, B:46:0x0125, B:47:0x012b, B:49:0x012f, B:54:0x013e, B:55:0x0142, B:71:0x020f, B:72:0x021a, B:29:0x0081, B:31:0x0089, B:38:0x009a), top: B:76:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:21:0x0059, B:42:0x0104, B:44:0x0115, B:46:0x0125, B:47:0x012b, B:49:0x012f, B:54:0x013e, B:55:0x0142, B:71:0x020f, B:72:0x021a, B:29:0x0081, B:31:0x0089, B:38:0x009a), top: B:76:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cc A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:59:0x01c2, B:61:0x01cc, B:63:0x01db, B:67:0x01f7, B:68:0x0202, B:69:0x0203, B:70:0x020e), top: B:75:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01db A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:59:0x01c2, B:61:0x01cc, B:63:0x01db, B:67:0x01f7, B:68:0x0202, B:69:0x0203, B:70:0x020e), top: B:75:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f7 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:59:0x01c2, B:61:0x01cc, B:63:0x01db, B:67:0x01f7, B:68:0x0202, B:69:0x0203, B:70:0x020e), top: B:75:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0203 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:59:0x01c2, B:61:0x01cc, B:63:0x01db, B:67:0x01f7, B:68:0x0202, B:69:0x0203, B:70:0x020e), top: B:75:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x020f A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #1 {all -> 0x005e, blocks: (B:21:0x0059, B:42:0x0104, B:44:0x0115, B:46:0x0125, B:47:0x012b, B:49:0x012f, B:54:0x013e, B:55:0x0142, B:71:0x020f, B:72:0x021a, B:29:0x0081, B:31:0x0089, B:38:0x009a), top: B:76:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [o.VS] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object v(C2179mb c2179mb, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3051vb c3051vb;
        ?? r3;
        C2179mb c2179mb2;
        YS ys;
        VS vs;
        long j2;
        C2179mb c2179mb3;
        C2082lb c2082lb;
        VS vs2;
        C2082lb c2082lb2;
        ?? r4;
        long j3;
        String str;
        VS vs3;
        JSONObject jSONObject;
        String strOptString;
        ?? r6;
        JSONObject jSONObjectOptJSONObject;
        String strOptString2;
        if (interfaceC0473Hh instanceof C3051vb) {
            c3051vb = (C3051vb) interfaceC0473Hh;
            int i2 = c3051vb.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3051vb.q = i2 - Integer.MIN_VALUE;
            } else {
                c3051vb = new C3051vb(this, interfaceC0473Hh);
            }
        } else {
            c3051vb = new C3051vb(this, interfaceC0473Hh);
        }
        Object objU = c3051vb.f1074o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        ?? r7 = c3051vb.q;
        try {
            if (r7 != 0) {
                if (r7 == 1) {
                    VS vs4 = c3051vb.m;
                    C2179mb c2179mb4 = (C2179mb) c3051vb.l;
                    Jp0.O(objU);
                    c2179mb2 = c2179mb4;
                    vs = vs4;
                } else if (r7 == 2) {
                    j2 = c3051vb.n;
                    VS vs5 = c3051vb.m;
                    c2179mb3 = (C2179mb) c3051vb.l;
                    Jp0.O(objU);
                    vs3 = vs5;
                    jSONObject = (JSONObject) objU;
                    strOptString = jSONObject.optString("access_token");
                    AbstractC1474fG.g(strOptString);
                    if (!AbstractC1899jh0.O(strOptString)) {
                        throw new IllegalStateException("Canela TV no entregó el token de aplicación".toString());
                    }
                    long jOptLong = jSONObject.optLong("expires_in", 3600L);
                    Long.signum(jOptLong);
                    c2082lb = new C2082lb((jOptLong * 1000) + j2, strOptString);
                    i = c2082lb;
                    c2179mb2 = c2179mb3;
                    vs2 = vs3;
                    c2082lb2 = j;
                    if (c2082lb2 != null) {
                        if (c2082lb2.b <= j2 + 60000) {
                            c2082lb2 = null;
                        }
                        if (c2082lb2 != null) {
                            str = c2082lb2.a;
                            r6 = vs2;
                        }
                        ((YS) r6).e(null);
                        return str;
                    }
                    JSONObject jSONObjectPut = new JSONObject().put("deviceId", s()).put("deviceName", "web");
                    C0560Kq c0560Kq = new C0560Kq();
                    c0560Kq.u(c2179mb2.a("guestFlatURL").concat("/platform/access/token"));
                    String string = jSONObjectPut.toString();
                    AbstractC1474fG.i(string, "toString(...)");
                    c0560Kq.m("POST", C2743sL.k(string, c));
                    c0560Kq.j("Authorization", "Bearer " + c2082lb.a);
                    c0560Kq.j("x-client-id", c2179mb2.a("xClientId").concat("-web"));
                    c0560Kq.j("Referer", "https://www.canela.tv/");
                    C1951k70 c1951k70C = c0560Kq.c();
                    c3051vb.l = vs2;
                    c3051vb.m = null;
                    c3051vb.getClass();
                    c3051vb.n = j2;
                    c3051vb.q = 3;
                    objU = u(c1951k70C, c3051vb);
                    if (objU == enumC1706hi) {
                        return enumC1706hi;
                    }
                    r4 = vs2;
                    j3 = j2;
                } else {
                    if (r7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = c3051vb.n;
                    r3 = (VS) c3051vb.l;
                    try {
                        Jp0.O(objU);
                        r4 = r3;
                    } catch (Throwable th) {
                        th = th;
                        ((YS) r3).e(null);
                        throw th;
                    }
                }
                jSONObjectOptJSONObject = ((JSONObject) objU).optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    throw new IllegalStateException("Canela TV no registró la sesión invitada".toString());
                }
                strOptString2 = jSONObjectOptJSONObject.optString("token");
                AbstractC1474fG.g(strOptString2);
                if (AbstractC1899jh0.O(strOptString2)) {
                    throw new IllegalStateException("Canela TV devolvió una sesión invitada vacía".toString());
                }
                j = new C2082lb((jSONObjectOptJSONObject.optLong("expires_in", 86400L) * 1000) + j3, strOptString2);
                r6 = r4;
                str = strOptString2;
                ((YS) r6).e(null);
                return str;
            }
            Jp0.O(objU);
            c2179mb2 = c2179mb;
            c3051vb.l = c2179mb2;
            ys = h;
            c3051vb.m = ys;
            c3051vb.q = 1;
            if (ys.d(null, c3051vb) == enumC1706hi) {
                vs = ys;
                return enumC1706hi;
            }
            vs = ys;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2082lb c2082lb3 = i;
            if (c2082lb3 != null) {
                if (c2082lb3.b <= jCurrentTimeMillis + 60000) {
                    c2082lb3 = null;
                }
                if (c2082lb3 != null) {
                    c2082lb = c2082lb3;
                    j2 = jCurrentTimeMillis;
                    vs2 = vs;
                }
                c2082lb2 = j;
                if (c2082lb2 != null) {
                    if (c2082lb2.b <= j2 + 60000) {
                        c2082lb2 = null;
                    }
                    if (c2082lb2 != null) {
                        str = c2082lb2.a;
                        r6 = vs2;
                    }
                    ((YS) r6).e(null);
                    return str;
                }
                JSONObject jSONObjectPut2 = new JSONObject().put("deviceId", s()).put("deviceName", "web");
                C0560Kq c0560Kq2 = new C0560Kq();
                c0560Kq2.u(c2179mb2.a("guestFlatURL").concat("/platform/access/token"));
                String string2 = jSONObjectPut2.toString();
                AbstractC1474fG.i(string2, "toString(...)");
                c0560Kq2.m("POST", C2743sL.k(string2, c));
                c0560Kq2.j("Authorization", "Bearer " + c2082lb.a);
                c0560Kq2.j("x-client-id", c2179mb2.a("xClientId").concat("-web"));
                c0560Kq2.j("Referer", "https://www.canela.tv/");
                C1951k70 c1951k70C2 = c0560Kq2.c();
                c3051vb.l = vs2;
                c3051vb.m = null;
                c3051vb.getClass();
                c3051vb.n = j2;
                c3051vb.q = 3;
                objU = u(c1951k70C2, c3051vb);
                if (objU == enumC1706hi) {
                    return enumC1706hi;
                }
                r4 = vs2;
                j3 = j2;
                jSONObjectOptJSONObject = ((JSONObject) objU).optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    throw new IllegalStateException("Canela TV no registró la sesión invitada".toString());
                }
                strOptString2 = jSONObjectOptJSONObject.optString("token");
                AbstractC1474fG.g(strOptString2);
                if (AbstractC1899jh0.O(strOptString2)) {
                    throw new IllegalStateException("Canela TV devolvió una sesión invitada vacía".toString());
                }
                j = new C2082lb((jSONObjectOptJSONObject.optLong("expires_in", 86400L) * 1000) + j3, strOptString2);
                r6 = r4;
                str = strOptString2;
                ((YS) r6).e(null);
                return str;
            }
            Na0 na0 = new Na0(22);
            na0.o("client_id", c2179mb2.a("clientID"));
            na0.o("client_secret", c2179mb2.a("clientSecret"));
            na0.o("grant_type", "client_credentials");
            na0.o("audience", "edge-service");
            na0.o("scope", "offline openid");
            C0540Jw c0540Jw = new C0540Jw((ArrayList) na0.n, (ArrayList) na0.f414o);
            C0560Kq c0560Kq3 = new C0560Kq();
            c0560Kq3.u(c2179mb2.a("oAuthURL"));
            c0560Kq3.m("POST", c0540Jw);
            C1951k70 c1951k70C3 = c0560Kq3.c();
            c3051vb.l = c2179mb2;
            c3051vb.m = vs;
            c3051vb.getClass();
            c3051vb.n = jCurrentTimeMillis;
            c3051vb.q = 2;
            Object objU2 = u(c1951k70C3, c3051vb);
            if (objU2 == enumC1706hi) {
                return enumC1706hi;
            }
            j2 = jCurrentTimeMillis;
            c2179mb3 = c2179mb2;
            objU = objU2;
            vs3 = vs;
            jSONObject = (JSONObject) objU;
            strOptString = jSONObject.optString("access_token");
            AbstractC1474fG.g(strOptString);
            if (!AbstractC1899jh0.O(strOptString)) {
                throw new IllegalStateException("Canela TV no entregó el token de aplicación".toString());
            }
            long jOptLong2 = jSONObject.optLong("expires_in", 3600L);
            Long.signum(jOptLong2);
            c2082lb = new C2082lb((jOptLong2 * 1000) + j2, strOptString);
            i = c2082lb;
            c2179mb2 = c2179mb3;
            vs2 = vs3;
            c2082lb2 = j;
            if (c2082lb2 != null) {
                if (c2082lb2.b <= j2 + 60000) {
                    c2082lb2 = null;
                }
                if (c2082lb2 != null) {
                    str = c2082lb2.a;
                    r6 = vs2;
                }
                ((YS) r6).e(null);
                return str;
            }
            JSONObject jSONObjectPut3 = new JSONObject().put("deviceId", s()).put("deviceName", "web");
            C0560Kq c0560Kq4 = new C0560Kq();
            c0560Kq4.u(c2179mb2.a("guestFlatURL").concat("/platform/access/token"));
            String string3 = jSONObjectPut3.toString();
            AbstractC1474fG.i(string3, "toString(...)");
            c0560Kq4.m("POST", C2743sL.k(string3, c));
            c0560Kq4.j("Authorization", "Bearer " + c2082lb.a);
            c0560Kq4.j("x-client-id", c2179mb2.a("xClientId").concat("-web"));
            c0560Kq4.j("Referer", "https://www.canela.tv/");
            C1951k70 c1951k70C4 = c0560Kq4.c();
            c3051vb.l = vs2;
            c3051vb.m = null;
            c3051vb.getClass();
            c3051vb.n = j2;
            c3051vb.q = 3;
            objU = u(c1951k70C4, c3051vb);
            if (objU == enumC1706hi) {
                return enumC1706hi;
            }
            r4 = vs2;
            j3 = j2;
            jSONObjectOptJSONObject = ((JSONObject) objU).optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                throw new IllegalStateException("Canela TV no registró la sesión invitada".toString());
            }
            strOptString2 = jSONObjectOptJSONObject.optString("token");
            AbstractC1474fG.g(strOptString2);
            if (AbstractC1899jh0.O(strOptString2)) {
                throw new IllegalStateException("Canela TV devolvió una sesión invitada vacía".toString());
            }
            j = new C2082lb((jSONObjectOptJSONObject.optLong("expires_in", 86400L) * 1000) + j3, strOptString2);
            r6 = r4;
            str = strOptString2;
            ((YS) r6).e(null);
            return str;
        } catch (Throwable th2) {
            th = th2;
            r3 = r7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, String str2, C2179mb c2179mb, InterfaceC0473Hh interfaceC0473Hh) throws JSONException {
        C3439zb c3439zb;
        if (interfaceC0473Hh instanceof C3439zb) {
            c3439zb = (C3439zb) interfaceC0473Hh;
            int i2 = c3439zb.f1156o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3439zb.f1156o = i2 - Integer.MIN_VALUE;
            } else {
                c3439zb = new C3439zb(this, interfaceC0473Hh);
            }
        } else {
            c3439zb = new C3439zb(this, interfaceC0473Hh);
        }
        Object objW = c3439zb.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c3439zb.f1156o;
        if (i3 == 0) {
            Jp0.O(objW);
            String strJ = J(c2179mb.a("vodMetaDataURL") + "/content/urn/resource/catalog/" + str + "/" + str2, c2179mb);
            c3439zb.l = str2;
            c3439zb.f1156o = 1;
            objW = w(strJ, c3439zb);
            if (objW == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c3439zb.l;
            Jp0.O(objW);
        }
        JSONObject jSONObject = (JSONObject) objW;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.optInt("code", -1) != 0) {
            throw new IllegalStateException(("Canela TV no encontró " + str2).toString());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        AbstractC1474fG.i(jSONObject2, "getJSONObject(...)");
        return jSONObject2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object z(String str, String str2, C2179mb c2179mb, InterfaceC0473Hh interfaceC0473Hh) {
        C0363Db c0363Db;
        C0441Gb c0441Gb;
        Object obj;
        C2179mb c2179mb2;
        String str3;
        C3421zK c3421zKB;
        Ma0 ma0;
        String str4 = str;
        if (interfaceC0473Hh instanceof C0363Db) {
            c0363Db = (C0363Db) interfaceC0473Hh;
            int i2 = c0363Db.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0363Db.r = i2 - Integer.MIN_VALUE;
            } else {
                c0363Db = new C0363Db(this, interfaceC0473Hh);
            }
        } else {
            c0363Db = new C0363Db(this, interfaceC0473Hh);
        }
        Object obj2 = c0363Db.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0363Db.r;
        Iterable<JSONObject> iterable = C1233cq.l;
        if (i3 == 0) {
            Jp0.O(obj2);
            if (AbstractC1899jh0.O(str)) {
                return iterable;
            }
            String strJ = J(c2179mb.a("vodMetaDataURL") + "/content/series/" + str4 + "/seasons?pageNumber=1&pageSize=30&sortBy=snum&sortOrder=asc", c2179mb);
            c0363Db.l = this;
            c0363Db.m = str4;
            c0363Db.n = str2;
            c0363Db.f217o = c2179mb;
            c0363Db.r = 1;
            Object objW = w(strJ, c0363Db);
            if (objW == enumC1706hi) {
                return enumC1706hi;
            }
            c0441Gb = this;
            obj = objW;
            c2179mb2 = c2179mb;
            str3 = str2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2179mb c2179mb3 = c0363Db.f217o;
            str3 = c0363Db.n;
            String str5 = c0363Db.m;
            C0441Gb c0441Gb2 = c0363Db.l;
            Jp0.O(obj2);
            c2179mb2 = c2179mb3;
            str4 = str5;
            c0441Gb = c0441Gb2;
            obj = obj2;
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            c0441Gb.getClass();
            c3421zKB = B(jSONArrayOptJSONArray);
        } else {
            c3421zKB = null;
        }
        if (c3421zKB != null) {
            iterable = c3421zKB;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : iterable) {
            String strJ2 = AbstractC1701hf0.j(jSONObject, "id", "optString(...)");
            int iOptInt = jSONObject.optInt("snum", 0);
            if (AbstractC1899jh0.O(strJ2) || iOptInt <= 0) {
                ma0 = null;
            } else {
                String str6 = "canela-season|" + str4 + "|" + strJ2 + "|" + iOptInt + "|" + str3;
                String strA = A(jSONObject, "lon");
                if (strA == null) {
                    strA = AbstractC1674hK.n(iOptInt, "Temporada ");
                }
                ma0 = new Ma0(str6, iOptInt, strA, y(jSONObject, "0-7x10", 420, c2179mb2), null, null, 48);
            }
            if (ma0 != null) {
                arrayList.add(ma0);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(new Integer(((Ma0) obj3).b))) {
                arrayList2.add(obj3);
            }
        }
        return AbstractC0911Ye.r0(arrayList2, new N2(2));
    }
}
