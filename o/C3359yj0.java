package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3359yj0 {
    public static final C3359yj0 a = new C3359yj0();
    public static final I60 b = new I60("^[A-Za-z0-9_./{}-]+$");
    public static final I60 c = new I60("^[A-Za-z0-9_-]+(?:\\.[A-Za-z0-9_-]+)*$");
    public static final OV d;
    public static final YS e;
    public static volatile C2196mj0 f;
    public static volatile long g;

    static {
        NV nvH = AbstractC1370eA.h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(8L, timeUnit);
        nvH.i(8L, timeUnit);
        nvH.h = false;
        d = new OV(nvH);
        e = AbstractC1923jt0.a();
        f = C2196mj0.x;
    }

    public static C2196mj0 c(JSONObject jSONObject) throws JSONException {
        Map map;
        if (jSONObject.getInt("schema") != 1) {
            throw new IllegalStateException("schema no soportado".toString());
        }
        String string = jSONObject.getString("revision");
        String str = "getString(...)";
        AbstractC1474fG.i(string, "getString(...)");
        String string2 = AbstractC1119bh0.E0(string).toString();
        Pattern patternCompile = Pattern.compile("^[A-Za-z0-9._-]{1,80}$");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        AbstractC1474fG.j(string2, "input");
        if (!patternCompile.matcher(string2).matches()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("endpoints");
        String string3 = jSONObject2.getString("api_base");
        AbstractC1474fG.i(string3, "getString(...)");
        String strG = g(string3, "/api/v4");
        String string4 = jSONObject2.getString("vecima_base");
        AbstractC1474fG.i(string4, "getString(...)");
        String strG2 = g(string4, "/sls/v1");
        String string5 = jSONObject2.getString("live");
        AbstractC1474fG.i(string5, "getString(...)");
        String strH = h(string5);
        String string6 = jSONObject2.getString("next");
        AbstractC1474fG.i(string6, "getString(...)");
        String strH2 = h(string6);
        String string7 = jSONObject2.getString("fallback");
        AbstractC1474fG.i(string7, "getString(...)");
        String strH3 = h(string7);
        String string8 = jSONObject2.getString("detail");
        AbstractC1474fG.i(string8, "getString(...)");
        String strH4 = h(string8);
        String string9 = jSONObject2.getString("vecima");
        AbstractC1474fG.i(string9, "getString(...)");
        String strH5 = h(string9);
        if (!AbstractC1119bh0.W(strH, "{country}", false) || !AbstractC1119bh0.W(strH2, "{country}", false) || !AbstractC1119bh0.W(strH3, "{country}", false)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!AbstractC1119bh0.W(strH4, "{country}", false) || !AbstractC1119bh0.W(strH4, "{cid}", false) || !AbstractC1119bh0.W(strH5, "{cid}", false)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("playback");
        String string10 = jSONObject3.getString("type_content");
        AbstractC1474fG.i(string10, "getString(...)");
        String string11 = AbstractC1119bh0.E0(string10).toString();
        int length = string11.length();
        if (1 <= length && length < 41) {
            Pattern patternCompile2 = Pattern.compile("^[A-Za-z0-9_{}-]+$");
            AbstractC1474fG.i(patternCompile2, "compile(...)");
            if (patternCompile2.matcher(string11).matches()) {
                String strJ = AbstractC1701hf0.j(jSONObject3, "index_cam", "optString(...)");
                if (strJ.length() <= 0) {
                    strJ = null;
                }
                if (strJ != null) {
                    Pattern patternCompile3 = Pattern.compile("^[0-9]{1,3}$");
                    AbstractC1474fG.i(patternCompile3, "compile(...)");
                    if (!patternCompile3.matcher(strJ).matches()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("fields");
                JSONObject jSONObject5 = jSONObject.getJSONObject("filters");
                String str2 = strJ;
                String string12 = jSONObject2.getString("country");
                if (!AbstractC1474fG.b(string12, "PY")) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                AbstractC1474fG.i(string12, "also(...)");
                AbstractC1474fG.g(jSONObject4);
                C3421zK c3421zKD = d(jSONObject4, "content_id");
                C3421zK c3421zKD2 = d(jSONObject4, "title");
                C3421zK c3421zKD3 = d(jSONObject4, "home");
                C3421zK c3421zKD4 = d(jSONObject4, "away");
                C3421zK c3421zKD5 = d(jSONObject4, "league");
                C3421zK c3421zKD6 = d(jSONObject4, "sport");
                C3421zK c3421zKD7 = d(jSONObject4, "poster");
                C3421zK c3421zKD8 = d(jSONObject4, "dash");
                AbstractC1474fG.g(jSONObject5);
                Set setE = e(jSONObject5, "filler_sports");
                Set setE2 = e(jSONObject5, "filler_leagues");
                Set setE3 = e(jSONObject5, "filler_teams");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clearkeys");
                if (jSONObjectOptJSONObject == null) {
                    map = C1330dq.l;
                } else {
                    if (jSONObjectOptJSONObject.length() > 16) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        Iterator<String> it = itKeys;
                        String string13 = jSONObjectOptJSONObject.getString(itKeys.next());
                        AbstractC1474fG.i(string13, str);
                        String string14 = AbstractC1119bh0.E0(string13).toString();
                        JSONObject jSONObject6 = jSONObjectOptJSONObject;
                        Pattern patternCompile4 = Pattern.compile("(?i)^[0-9a-f]{32}:[0-9a-f]{32}$");
                        AbstractC1474fG.i(patternCompile4, "compile(...)");
                        AbstractC1474fG.j(string14, "input");
                        if (!patternCompile4.matcher(string14).matches()) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        String str3 = str;
                        List listS0 = AbstractC1119bh0.s0(string14, new char[]{':'}, 2, 2);
                        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
                        Iterator it2 = listS0.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = it2;
                            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
                            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                            arrayList.add(lowerCase);
                            it2 = it3;
                        }
                        if (linkedHashMap.put((String) arrayList.get(0), (String) arrayList.get(1)) != null) {
                            throw new IllegalArgumentException("KID ClearKey duplicado".toString());
                        }
                        itKeys = it;
                        str = str3;
                        jSONObjectOptJSONObject = jSONObject6;
                    }
                    map = linkedHashMap;
                }
                return new C2196mj0(string2, strG, strG2, string12, strH, strH2, strH3, strH4, strH5, string11, str2, c3421zKD, c3421zKD2, c3421zKD3, c3421zKD4, c3421zKD5, c3421zKD6, c3421zKD7, c3421zKD8, setE, setE2, setE3, map);
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static C3421zK d(JSONObject jSONObject, String str) throws JSONException {
        String str2;
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        AbstractC1474fG.i(jSONArray, "getJSONArray(...)");
        C3421zK c3421zKF = f(jSONArray);
        if (!(!c3421zKF.isEmpty()) || c3421zKF.a() > 12) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!c3421zKF.isEmpty()) {
            ListIterator listIterator = c3421zKF.listIterator(0);
            do {
                C3324yK c3324yK = (C3324yK) listIterator;
                if (c3324yK.hasNext()) {
                    str2 = (String) c3324yK.next();
                    if (str2.length() > 160) {
                        break;
                    }
                }
            } while (c.d(str2));
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return c3421zKF;
    }

    public static Set e(JSONObject jSONObject, String str) throws JSONException {
        C3324yK c3324yK;
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        AbstractC1474fG.i(jSONArray, "getJSONArray(...)");
        C3421zK c3421zKF = f(jSONArray);
        if (c3421zKF.a() <= 30) {
            if (!c3421zKF.isEmpty()) {
                ListIterator listIterator = c3421zKF.listIterator(0);
                do {
                    c3324yK = (C3324yK) listIterator;
                    if (c3324yK.hasNext()) {
                    }
                } while (((String) c3324yK.next()).length() <= 120);
            }
            return AbstractC0911Ye.B0(c3421zKF);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static C3421zK f(JSONArray jSONArray) throws JSONException {
        C3421zK c3421zK = new C3421zK();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            AbstractC1474fG.i(string, "getString(...)");
            c3421zK.add(string);
        }
        return AbstractC2506pt.h(c3421zK);
    }

    public static String g(String str, String str2) {
        C2446pE c2446pEB;
        String string = null;
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null) {
            throw new IllegalStateException("URL inválida".toString());
        }
        if (!AbstractC1474fG.b(c2446pEB.a, "https")) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!AbstractC1474fG.b(c2446pEB.d, "api.tigosports.com.py")) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c2446pEB.e != 443) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c2446pEB.b.length() != 0 || c2446pEB.c.length() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        List list = c2446pEB.g;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            C0622Nb.J(list, sb);
            string = sb.toString();
        }
        if (string != null || c2446pEB.h != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (AbstractC1899jh0.U(c2446pEB.b(), str2, false)) {
            return AbstractC1119bh0.G0(str, '/');
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static String h(String str) {
        String strI0 = AbstractC1119bh0.I0(AbstractC1119bh0.E0(str).toString(), '/');
        int length = strI0.length();
        if (1 > length || length >= 241) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!b.d(strI0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (AbstractC1119bh0.W(strI0, "..", false) || AbstractC1119bh0.W(strI0, "://", false)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return strI0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(InterfaceC0473Hh interfaceC0473Hh) {
        C3165wj0 c3165wj0;
        C3359yj0 c3359yj0;
        if (interfaceC0473Hh instanceof C3165wj0) {
            c3165wj0 = (C3165wj0) interfaceC0473Hh;
            int i = c3165wj0.f1100o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3165wj0.f1100o = i - Integer.MIN_VALUE;
            } else {
                c3165wj0 = new C3165wj0(this, interfaceC0473Hh);
            }
        } else {
            c3165wj0 = new C3165wj0(this, interfaceC0473Hh);
        }
        Object objC = c3165wj0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3165wj0.f1100o;
        try {
            if (i2 == 0) {
                Jp0.O(objC);
                OV ov = d;
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u("https://raw.githubusercontent.com/Autorprategshs/mariposa/refs/heads/main/adds?t=" + (System.currentTimeMillis() / 300000));
                c0560Kq.j("Accept", "application/json");
                c0560Kq.j("Cache-Control", "no-cache");
                A50 a50C = ov.c(c0560Kq.c());
                c3165wj0.l = this;
                c3165wj0.f1100o = 1;
                objC = Jp0.c(a50C, Long.MAX_VALUE, c3165wj0);
                if (objC == enumC1706hi) {
                    return enumC1706hi;
                }
                c3359yj0 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3359yj0 = c3165wj0.l;
                Jp0.O(objC);
            }
            Wg0 wg0 = (Wg0) objC;
            int i3 = wg0.a;
            String str = wg0.b;
            if (200 <= i3 && i3 < 300 && str.length() <= 65536) {
                JSONObject jSONObject = new JSONObject(str);
                c3359yj0.getClass();
                return c(jSONObject);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:36:0x0089, B:38:0x008d, B:39:0x008f), top: B:46:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3262xj0 c3262xj0;
        YS ys;
        VS vs;
        VS vs2;
        Throwable th;
        long j;
        C2196mj0 c2196mj0;
        VS vs3;
        C2196mj0 c2196mj1;
        if (interfaceC0473Hh instanceof C3262xj0) {
            c3262xj0 = (C3262xj0) interfaceC0473Hh;
            int i = c3262xj0.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3262xj0.p = i - Integer.MIN_VALUE;
            } else {
                c3262xj0 = new C3262xj0(this, interfaceC0473Hh);
            }
        } else {
            c3262xj0 = new C3262xj0(this, interfaceC0473Hh);
        }
        Object obj = c3262xj0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3262xj0.p;
        try {
            if (i2 == 0) {
                Jp0.O(obj);
                if (System.currentTimeMillis() - g < 300000) {
                    return f;
                }
                ys = e;
                c3262xj0.l = ys;
                c3262xj0.p = 1;
                if (ys.d(null, c3262xj0) == enumC1706hi) {
                    vs = ys;
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c3262xj0.m;
                    vs2 = c3262xj0.l;
                    try {
                        Jp0.O(obj);
                        vs2 = vs2;
                        c2196mj1 = (C2196mj0) obj;
                        if (c2196mj1 == null) {
                            c2196mj1 = f;
                        }
                        f = c2196mj1;
                        g = j;
                        VS vs4 = vs2;
                        c2196mj0 = f;
                        vs3 = vs4;
                        ((YS) vs3).e(null);
                        return c2196mj0;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                VS vs5 = c3262xj0.l;
                Jp0.O(obj);
                vs = vs5;
            }
            vs = ys;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - g < 300000) {
                c2196mj0 = f;
                vs3 = vs;
            } else {
                C3359yj0 c3359yj0 = a;
                c3262xj0.l = vs;
                c3262xj0.m = jCurrentTimeMillis;
                c3262xj0.p = 2;
                Object objA = c3359yj0.a(c3262xj0);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                j = jCurrentTimeMillis;
                vs2 = vs;
                obj = objA;
                c2196mj1 = (C2196mj0) obj;
                if (c2196mj1 == null) {
                    c2196mj1 = f;
                }
                f = c2196mj1;
                g = j;
                VS vs6 = vs2;
                c2196mj0 = f;
                vs3 = vs6;
            }
            ((YS) vs3).e(null);
            return c2196mj0;
        } catch (Throwable th3) {
            vs2 = vs;
            th = th3;
            ((YS) vs2).e(null);
            throw th;
        }
    }
}
