package o;

import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JI implements Q30 {
    public static final JI b = new JI();
    public static final OV c;
    public static volatile String d;
    public static volatile String e;
    public static volatile long f;

    static {
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
        nvO.h = true;
        nvO.i = true;
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvO);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvO.e(30L, timeUnit);
        nvO.i(30L, timeUnit);
        c = new OV(nvO);
    }

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(str))) {
            str = null;
        }
        if (str != null) {
            return "https://image.tmdb.org/t/p/w500".concat(str);
        }
        return null;
    }

    public static String B(String str) {
        String string = new JSONObject().put("grant_type", "refresh_token").put("refresh_token", str).toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        C2243n70 c2243n70K = C2743sL.k(string, AbstractC1474fG.o("application/json"));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://securetoken.googleapis.com/v1/token?key=AIzaSyCEvQwLPt1CFDPCVy1bLptJ6SzO356G3sk");
        c0560Kq.m("POST", c2243n70K);
        c0560Kq.j("Content-Type", "application/json");
        C1855j80 c1855j80G = c.c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.p()) {
                throw new Exception("refresh HTTP " + c1855j80G.f840o);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            D(new JSONObject(abstractC2051l80 != null ? abstractC2051l80.q() : "{}"), "refresh_token");
            String str2 = d;
            AbstractC1474fG.g(str2);
            AbstractC3409z9.g(c1855j80G, null);
            return str2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static String C() {
        String string = new JSONObject().put("returnSecureToken", true).toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        C2243n70 c2243n70K = C2743sL.k(string, AbstractC1474fG.o("application/json"));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyCEvQwLPt1CFDPCVy1bLptJ6SzO356G3sk");
        c0560Kq.m("POST", c2243n70K);
        c0560Kq.j("Content-Type", "application/json");
        C1855j80 c1855j80G = c.c(c0560Kq.c()).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            D(new JSONObject(abstractC2051l80 != null ? abstractC2051l80.q() : "{}"), "refreshToken");
            String str = d;
            AbstractC1474fG.g(str);
            AbstractC3409z9.g(c1855j80G, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static void D(JSONObject jSONObject, String str) throws Exception {
        String strOptString = jSONObject.optString("idToken");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("id_token");
        }
        AbstractC1474fG.g(strOptString);
        if (AbstractC1899jh0.O(strOptString)) {
            throw new Exception("Kingred: respuesta sin idToken");
        }
        d = strOptString;
        String strOptString2 = jSONObject.optString(str);
        AbstractC1474fG.g(strOptString2);
        if (!(!AbstractC1899jh0.O(strOptString2))) {
            strOptString2 = null;
        }
        if (strOptString2 != null) {
            e = strOptString2;
        }
        String strOptString3 = jSONObject.optString("expiresIn");
        if (AbstractC1899jh0.O(strOptString3)) {
            strOptString3 = jSONObject.optString("expires_in");
        }
        AbstractC1474fG.i(strOptString3, "ifBlank(...)");
        Long lK = AbstractC1802ih0.K(strOptString3);
        f = (U9.f((lK != null ? lK.longValue() : 3600L) - ((long) 120), 60L) * ((long) 1000)) + System.currentTimeMillis();
    }

    public static final String p(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videos");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("results") : null;
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && AbstractC1899jh0.N(jSONObjectOptJSONObject2.optString("site"), "YouTube", true) && AbstractC1899jh0.N(jSONObjectOptJSONObject2.optString("type"), "Trailer", true)) {
                return AbstractC1701hf0.t("https://www.youtube.com/watch?v=", jSONObjectOptJSONObject2.optString("key"));
            }
        }
        return null;
    }

    public static final List q(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("results");
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
            C1387eR c1387eRY = jSONObjectOptJSONObject != null ? y(jSONObjectOptJSONObject) : null;
            if (c1387eRY != null) {
                arrayList.add(c1387eRY);
            }
        }
        return arrayList;
    }

    public static final List r(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("results");
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
            C2109lo0 c2109lo0Z = jSONObjectOptJSONObject != null ? z(jSONObjectOptJSONObject) : null;
            if (c2109lo0Z != null) {
                arrayList.add(c2109lo0Z);
            }
        }
        return arrayList;
    }

    public static final ArrayList s(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject, "url", "optString(...)");
                if (!AbstractC1899jh0.O(strJ) && linkedHashSet.add(strJ)) {
                    String strOptString = jSONObjectOptJSONObject.optString("idioma");
                    if (AbstractC1899jh0.O(strOptString)) {
                        strOptString = "Servidor";
                    }
                    String strA0 = AbstractC1119bh0.A0(strOptString, ' ', strOptString);
                    if (!AbstractC1899jh0.O(strA0)) {
                        strOptString = strA0;
                    }
                    String strX0 = AbstractC1119bh0.W(strJ, "::", false) ? AbstractC1119bh0.x0(strJ, "::", strJ) : strJ;
                    arrayList.add(new Ds0(strJ, AbstractC1701hf0.e(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strX0, "//", strX0), "/"), " · ", strOptString), null, null, 60));
                }
            }
        }
        return arrayList;
    }

    public static final String t(String str) {
        JI ji = b;
        String strU = AbstractC1701hf0.u("https://firebasestorage.googleapis.com/v0/b/duo-play.appspot.com/o/", str, "?alt=media");
        try {
            return x(strU, AbstractC3327yN.y(new C1101bX("Authorization", "Bearer ".concat(ji.w()))));
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            if (AbstractC1119bh0.W(message, "401", false) || AbstractC1119bh0.W(message, "403", false)) {
                f = 0L;
                try {
                    return x(strU, AbstractC3327yN.y(new C1101bX("Authorization", "Bearer ".concat(ji.w()))));
                } catch (Exception e3) {
                    e3.getMessage();
                    e2.getMessage();
                    return null;
                }
            }
            e2.getMessage();
            return null;
        }
    }

    public static final JSONObject u(String str, C1101bX... c1101bXArr) {
        StringBuilder sb = new StringBuilder(AbstractC1701hf0.u("https://api.themoviedb.org/3", str, "?api_key=ebd14909725916cf0de3ada4e0c45804&language=es-ES"));
        for (C1101bX c1101bX : c1101bXArr) {
            sb.append("&" + ((String) c1101bX.l) + "=" + ((String) c1101bX.m));
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return new JSONObject(x(string, C1330dq.l));
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(str))) {
            str = null;
        }
        if (str != null) {
            return "https://image.tmdb.org/t/p/w1280".concat(str);
        }
        return null;
    }

    public static String x(String str, Map map) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
        for (Map.Entry entry : map.entrySet()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1855j80 c1855j80G = c.c(c0560Kq.c()).g();
        try {
            if (c1855j80G.p()) {
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : "";
                AbstractC3409z9.g(c1855j80G, null);
                return strQ;
            }
            throw new Exception("HTTP " + c1855j80G.f840o + " para " + str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static C1387eR y(JSONObject jSONObject) {
        String strValueOf = String.valueOf(jSONObject.optInt("id"));
        String strOptString = jSONObject.optString("title");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("name");
        }
        String str = strOptString;
        AbstractC1474fG.i(str, "ifBlank(...)");
        String strOptString2 = jSONObject.optString("overview");
        AbstractC1474fG.g(strOptString2);
        if (!(!AbstractC1899jh0.O(strOptString2))) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("release_date");
        AbstractC1474fG.g(strOptString3);
        String str2 = AbstractC1899jh0.O(strOptString3) ^ true ? strOptString3 : null;
        double dOptDouble = jSONObject.optDouble("vote_average");
        return new C1387eR(strValueOf, str, strOptString2, str2, null, null, null, (Double.isNaN(dOptDouble) || dOptDouble <= 0.0d) ? null : Double.valueOf(dOptDouble), A(jSONObject.optString("poster_path")), v(jSONObject.optString("backdrop_path")), null, null, null, null, null, 31856);
    }

    public static C2109lo0 z(JSONObject jSONObject) {
        String strValueOf = String.valueOf(jSONObject.optInt("id"));
        String strOptString = jSONObject.optString("name");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("title");
        }
        String str = strOptString;
        AbstractC1474fG.i(str, "ifBlank(...)");
        String strOptString2 = jSONObject.optString("overview");
        AbstractC1474fG.g(strOptString2);
        if (!(!AbstractC1899jh0.O(strOptString2))) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("first_air_date");
        AbstractC1474fG.g(strOptString3);
        String str2 = AbstractC1899jh0.O(strOptString3) ^ true ? strOptString3 : null;
        double dOptDouble = jSONObject.optDouble("vote_average");
        return new C2109lo0(strValueOf, str, strOptString2, str2, null, null, null, (Double.isNaN(dOptDouble) || dOptDouble <= 0.0d) ? null : Double.valueOf(dOptDouble), A(jSONObject.optString("poster_path")), v(jSONObject.optString("backdrop_path")), null, null, null, null, null, null, 64624);
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new II(str, i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new BI(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C3322yI(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new GI(i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new EI(video$Type, str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return "https://firebasestorage.googleapis.com/v0/b/duo-play.appspot.com/o/logo.png";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new AI(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "PELICULAS Y SERIES 4";
    }

    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C3419zI(str, i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new CI(i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new FI(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new DI(str, i, null), interfaceC0473Hh);
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
        return AbstractC1376eG.J(AbstractC1910jn.b, new HI(ds0, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    public final String w() {
        Object objK;
        String str = d;
        if (str != null && System.currentTimeMillis() < f) {
            return str;
        }
        synchronized (this) {
            String str2 = d;
            if (str2 != null && System.currentTimeMillis() < f) {
                return str2;
            }
            String str3 = e;
            if (str3 != null) {
                try {
                    objK = B(str3);
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                if (objK instanceof C2439p80) {
                    objK = null;
                }
                String str4 = (String) objK;
                if (str4 != null) {
                    return str4;
                }
            }
            return C();
        }
    }
}
