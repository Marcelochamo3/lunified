package o;

import android.content.Context;
import android.os.SystemClock;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Lx0 implements Q30 {
    public static volatile boolean e;
    public static volatile long f;
    public static volatile long g;
    public static volatile Throwable h;
    public static final Lx0 b = new Lx0();
    public static final YS c = AbstractC1923jt0.a();
    public static final Object d = new Object();
    public static final Set i = Lc0.T("portal100006", "portal100008", "portal100081");
    public static final ConcurrentHashMap j = new ConcurrentHashMap();
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public static final ConcurrentHashMap l = new ConcurrentHashMap();
    public static final I60 m = new I60("\\p{M}+");
    public static final I60 n = new I60("\\b(?:vs\\.?|versus|contra)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I60 f389o = new I60("\\b(?:mundial|copa\\s+(?:mundial|del\\s+mundo)|world\\s+cup|fifa)\\b");
    public static final I60 p = new I60("^(?:semi[\\s-]*finals?|semifinal(?:es)?|quarter[\\s-]*finals?|cuartos?\\s+de\\s+final|round\\s+of\\s+(?:16|32|64)|octavos?\\s+de\\s+final|dieciseisavos?\\s+de\\s+final|(?:group|grupo)\\s+[a-z0-9]+|(?:group\\s+stage|fase\\s+de\\s+grupos?)|(?:third[\\s-]+place\\s+(?:play[\\s-]*off|match)|(?:partido\\s+por\\s+el\\s+)?(?:tercer|3er)\\s+puesto)|jornada\\s+\\d+|fecha\\s+\\d+)(?:\\s*$|\\s*(?::|[-–—])\\s*)");
    public static final I60 q = new I60("^(?:(?:partido\\s+por\\s+la\\s+)?(?:gran\\s+)?final|(?:grand\\s+)?finals?)(?:\\s*$|\\s*(?::|[-–—])\\s*)");
    public static final C1698he r = new C1698he(new C1698he(new C1749i30(14), 4), 3);
    public static final I60 s = new I60("(?i)^(.*?)(?:\\s+(?:temp(?:orada)?\\.?|season|s|t)\\s*\\.?\\s*(\\d+))$");

    public static void B(long j2, String str) {
        if (j2 <= 0) {
            return;
        }
        C2532q60 c2532q60 = new C2532q60();
        synchronized (d) {
            try {
                long jD = com.skidush.clonex.bridge.N7.a.d();
                if (jD <= 0 || jD == j2) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (f == j2 && jElapsedRealtime - g < 5000) {
                        Throwable th = h;
                        if (th != null) {
                            String message = th.getMessage();
                            if (message == null) {
                                message = "No se pudo revalidar el proveedor";
                            }
                            throw new IllegalStateException(message, th);
                        }
                        return;
                    }
                    C2532q60 c2532q61 = new C2532q60();
                    try {
                        AbstractC1376eG.C(new C1931jx0(j2, c2532q61, str, c2532q60, null));
                        if (c2532q61.l) {
                            f = j2;
                            g = SystemClock.elapsedRealtime();
                            h = null;
                        }
                        if (c2532q60.l) {
                            C1152by0 c1152by0 = C1152by0.b;
                            C1152by0.u();
                        }
                    } catch (Throwable th2) {
                        if (c2532q61.l) {
                            f = j2;
                            g = SystemClock.elapsedRealtime();
                            h = th2;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static C1541fx0 C(int i2, int i3, String str, String str2, String str3, String str4) throws JSONException {
        int iIntValue;
        boolean zB = AbstractC1474fG.b(str, "series");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalCountry", "");
        jSONObject.put("tags", "");
        jSONObject.put("year", "");
        jSONObject.put("audio", "");
        if (zB) {
            String strH = com.skidush.clonex.bridge.N7.a.h(9);
            if (strH != null) {
                if (!(!AbstractC1899jh0.O(strH))) {
                    strH = null;
                }
                if (strH != null) {
                    Integer numJ = AbstractC1802ih0.J(strH);
                    if (numJ != null) {
                        if (numJ.intValue() <= 0) {
                            numJ = null;
                        }
                        if (numJ != null) {
                            iIntValue = numJ.intValue();
                        }
                    }
                    throw new IllegalStateException("Configuración protegida no válida");
                }
            }
            throw new IllegalStateException("Configuración protegida no disponible");
        }
        String strH2 = com.skidush.clonex.bridge.N7.a.h(7);
        if (strH2 != null) {
            if (!(!AbstractC1899jh0.O(strH2))) {
                strH2 = null;
            }
            if (strH2 != null) {
                Integer numJ2 = AbstractC1802ih0.J(strH2);
                if (numJ2 != null) {
                    if (numJ2.intValue() <= 0) {
                        numJ2 = null;
                    }
                    if (numJ2 != null) {
                        iIntValue = numJ2.intValue();
                    }
                }
                throw new IllegalStateException("Configuración protegida no válida");
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
        jSONObject.put("columnId", iIntValue);
        jSONObject.put("language", "es");
        jSONObject.put("pageSize", U9.h(i3, 1, 100));
        if (i2 < 1) {
            i2 = 1;
        }
        jSONObject.put("pageNum", i2);
        jSONObject.put(str2, str3);
        if (str4 != null && !AbstractC1899jh0.O(str4)) {
            jSONObject.put("year", str4);
        }
        JSONObject jSONObjectN = N(6, jSONObject);
        O(jSONObjectN, "Filtro");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        List listG = G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("assetList") : null);
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            w((JSONObject) it.next());
        }
        List listR0 = AbstractC0911Ye.r0(listG, r);
        return new C1541fx0(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("totalSize", listR0.size()) : listR0.size(), listR0);
    }

    public static ArrayList D(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("tags");
        AbstractC1474fG.i(strOptString, "optString(...)");
        List listS0 = AbstractC1119bh0.s0(strOptString, new char[]{',', '/', '|'}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1119bh0.E0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            if ((!AbstractC1899jh0.O(str2)) && !AbstractC1899jh0.N(str2, "N/A", true)) {
                arrayList2.add(obj);
            }
        }
        List<String> listX = AbstractC0911Ye.X(arrayList2);
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(listX, 10));
        for (String str3 : listX) {
            arrayList3.add(new C2420oz(AbstractC1701hf0.e(str, "|tags|", str3), str3));
        }
        return arrayList3;
    }

    public static String E(JSONObject jSONObject, List list) {
        String strJ;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("posterList");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && AbstractC1899jh0.N(jSONObjectOptJSONObject.optString("fileType"), str, true) && (strJ = J(jSONObjectOptJSONObject.optString("fileUrl"))) != null) {
                    return strJ;
                }
            }
        }
        return null;
    }

    public static boolean F(String str) {
        String string = AbstractC1119bh0.E0(str).toString();
        Locale locale = Locale.ROOT;
        return AbstractC1119bh0.W(AbstractC1701hf0.i(locale, "ROOT", string, locale, "toLowerCase(...)"), "18+", false);
    }

    public static List G(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(it.a());
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        return arrayList;
    }

    public static C1387eR H(JSONObject jSONObject) {
        w(jSONObject);
        String strT = AbstractC1701hf0.t("xuper-movie:", jSONObject.optString("contentId"));
        String strOptString = jSONObject.optString("name");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("alias");
        }
        String str = strOptString;
        AbstractC1474fG.i(str, "ifBlank(...)");
        String strJ = J(jSONObject.optString("description"));
        String strJ2 = J(jSONObject.optString("releaseTime"));
        Integer numZ = z(jSONObject.optString("duration"));
        Double dP = P(jSONObject);
        String strE = E(jSONObject, AbstractC0937Ze.K("icon", "poster", "stage"));
        String strE2 = E(jSONObject, AbstractC0937Ze.K("stage", "poster", "icon"));
        ArrayList arrayListD = D(jSONObject, "movies");
        String strOptString2 = jSONObject.optString("director");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        C1387eR c1387eR = new C1387eR(strT, str, strJ, strJ2, numZ, null, "HD", dP, strE, strE2, arrayListD, M(strOptString2), null, null, null, 28704);
        c1387eR.t = "RECOMENDADO PARA PELÍCULAS Y SERIES";
        return c1387eR;
    }

    public static String I(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC1474fG.i(strNormalize, "normalize(...)");
        I60 i60 = m;
        i60.getClass();
        String strReplaceAll = i60.l.matcher(strNormalize).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        Locale locale = Locale.ROOT;
        String strI = AbstractC1701hf0.i(locale, "ROOT", strReplaceAll, locale, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll2 = patternCompile.matcher(strI).replaceAll(" ");
        AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
        return AbstractC1119bh0.E0(strReplaceAll2).toString();
    }

    public static String J(String str) {
        String string;
        if (str == null || (string = AbstractC1119bh0.E0(str).toString()) == null || string.length() <= 0 || AbstractC1899jh0.N(string, "null", true)) {
            return null;
        }
        return string;
    }

    public static C0882Xb K(C1639gx0 c1639gx0) throws JSONException {
        List listL = L(c1639gx0.b, 1, 30);
        ArrayList arrayList = new ArrayList();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            Cd0 cd0S = S((JSONObject) it.next());
            if (cd0S != null) {
                arrayList.add(cd0S);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String str = c1639gx0.a;
        C0882Xb c0882Xb = new C0882Xb(str, arrayList);
        StringBuilder sb = new StringBuilder("xuper-section|");
        int i2 = c1639gx0.b;
        sb.append(i2);
        sb.append("|");
        sb.append(str);
        c0882Xb.f = sb.toString();
        c0882Xb.g = AbstractC1674hK.n(i2, "xuper-section-");
        return c0882Xb;
    }

    public static List L(int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalCountry", "");
        jSONObject.put("tags", "");
        jSONObject.put("year", "");
        jSONObject.put("audio", "");
        jSONObject.put("columnId", i2);
        jSONObject.put("language", "es");
        jSONObject.put("pageSize", i4);
        if (i3 < 1) {
            i3 = 1;
        }
        jSONObject.put("pageNum", i3);
        JSONObject jSONObjectN = N(6, jSONObject);
        O(jSONObjectN, "Sección");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        List listG = G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("assetList") : null);
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            w((JSONObject) it.next());
        }
        return listG;
    }

    public static ArrayList M(String str) {
        List listS0 = AbstractC1119bh0.s0(str, new char[]{',', '/', '|'}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1119bh0.E0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC1899jh0.O((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List<String> listX = AbstractC0911Ye.X(arrayList2);
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(listX, 10));
        for (String str2 : listX) {
            Locale locale = Locale.ROOT;
            arrayList3.add(new C1688hY(AbstractC1701hf0.i(locale, "ROOT", str2, locale, "toLowerCase(...)"), str2, null, null, 12));
        }
        return arrayList3;
    }

    public static JSONObject N(int i2, JSONObject jSONObject) {
        SystemClock.elapsedRealtime();
        try {
            com.skidush.clonex.bridge.N7 n7 = com.skidush.clonex.bridge.N7.a;
            long jD = n7.d();
            try {
                String string = jSONObject.toString();
                AbstractC1474fG.i(string, "toString(...)");
                String strE = n7.e(i2, string);
                if (strE == null) {
                    throw new IllegalStateException("No se pudo conectar con el proveedor");
                }
                JSONObject jSONObject2 = new JSONObject(strE);
                String strOptString = jSONObject2.optString("returnCode");
                if (!AbstractC1474fG.b(strOptString, "0") && !i.contains(strOptString) && jD > 0) {
                    if (AbstractC1899jh0.O(strOptString)) {
                        strOptString = "missing_return_code";
                    }
                    B(jD, strOptString);
                    String string2 = jSONObject.toString();
                    AbstractC1474fG.i(string2, "toString(...)");
                    String strE2 = n7.e(i2, string2);
                    if (strE2 == null) {
                        throw new IllegalStateException("No se pudo conectar con el proveedor");
                    }
                    JSONObject jSONObject3 = new JSONObject(strE2);
                    SystemClock.elapsedRealtime();
                    return jSONObject3;
                }
                SystemClock.elapsedRealtime();
                return jSONObject2;
            } catch (IllegalStateException e2) {
                if (jD <= 0) {
                    throw e2;
                }
                B(jD, "transport_failure");
                com.skidush.clonex.bridge.N7 n8 = com.skidush.clonex.bridge.N7.a;
                String string3 = jSONObject.toString();
                AbstractC1474fG.i(string3, "toString(...)");
                String strE3 = n8.e(i2, string3);
                if (strE3 == null) {
                    throw new IllegalStateException("No se pudo conectar con el proveedor");
                }
                JSONObject jSONObject4 = new JSONObject(strE3);
                SystemClock.elapsedRealtime();
                return jSONObject4;
            }
        } catch (Throwable th) {
            SystemClock.elapsedRealtime();
            throw th;
        }
    }

    public static void O(JSONObject jSONObject, String str) {
        if (AbstractC1474fG.b(jSONObject.optString("returnCode"), "0")) {
            return;
        }
        String strOptString = jSONObject.optString("returnCode");
        AbstractC1474fG.i(strOptString, "optString(...)");
        String strD0 = AbstractC1119bh0.D0(24, strOptString);
        if (AbstractC1899jh0.O(strD0)) {
            strD0 = "desconocido";
        }
        throw new IllegalStateException(str + " no disponible (código " + strD0 + ")");
    }

    public static Double P(JSONObject jSONObject) {
        if (!jSONObject.has("score") || jSONObject.isNull("score")) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("score");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble) || dOptDouble <= 0.0d) {
            return null;
        }
        return dValueOf;
    }

    public static Ma0 Q(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("contentId");
        return new Ma0("xuper-season:" + strOptString + ":" + jSONObject.optInt("volumnCount", 0), ((Number) R(jSONObject).m).intValue(), jSONObject.optString("name"), E(jSONObject, AbstractC0937Ze.K("icon", "poster", "stage")), null, null, 48);
    }

    public static C1101bX R(JSONObject jSONObject) {
        for (String str : AbstractC0937Ze.K(jSONObject.optString("name"), jSONObject.optString("alias"))) {
            AbstractC1474fG.g(str);
            String string = AbstractC1119bh0.E0(str).toString();
            I60 i60 = s;
            i60.getClass();
            AbstractC1474fG.j(string, "input");
            Matcher matcher = i60.l.matcher(string);
            AbstractC1474fG.i(matcher, "matcher(...)");
            JN jn = !matcher.matches() ? null : new JN(matcher, string);
            if (jn != null) {
                String string2 = AbstractC1119bh0.E0((String) ((HN) jn.a()).get(1)).toString();
                Integer numJ = AbstractC1802ih0.J((String) ((HN) jn.a()).get(2));
                int iIntValue = numJ != null ? numJ.intValue() : 1;
                if (true ^ AbstractC1899jh0.O(string2)) {
                    return new C1101bX(string2, Integer.valueOf(iIntValue));
                }
            }
        }
        String strOptString = jSONObject.optString("name");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("alias");
        }
        return new C1101bX(strOptString, 1);
    }

    public static Cd0 S(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("programType");
        AbstractC1474fG.i(strOptString, "optString(...)");
        Locale locale = Locale.ROOT;
        String strI = AbstractC1701hf0.i(locale, "ROOT", strOptString, locale, "toLowerCase(...)");
        if (AbstractC1474fG.b(strI, "movie")) {
            return U(jSONObject);
        }
        if (AbstractC1474fG.b(strI, "teleplay")) {
            return T(jSONObject);
        }
        String strOptString2 = jSONObject.optString("type");
        if (AbstractC1474fG.b(strOptString2, "1")) {
            return U(jSONObject);
        }
        if (AbstractC1474fG.b(strOptString2, "0")) {
            return T(jSONObject);
        }
        return null;
    }

    public static C2109lo0 T(JSONObject jSONObject) {
        w(jSONObject);
        String strOptString = jSONObject.optString("contentId");
        String str = (String) R(jSONObject).l;
        String strT = AbstractC1701hf0.t("xuper-series:", strOptString);
        String strJ = J(jSONObject.optString("description"));
        String strJ2 = J(jSONObject.optString("releaseTime"));
        Integer numZ = z(jSONObject.optString("duration"));
        Double dP = P(jSONObject);
        String strE = E(jSONObject, AbstractC0937Ze.K("icon", "poster", "stage"));
        String strE2 = E(jSONObject, AbstractC0937Ze.K("stage", "poster", "icon"));
        List listA = AbstractC2506pt.A(Q(jSONObject));
        ArrayList arrayListD = D(jSONObject, "series");
        String strOptString2 = jSONObject.optString("director");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        C2109lo0 c2109lo0 = new C2109lo0(strT, str, strJ, strJ2, numZ, null, "HD", dP, strE, strE2, strOptString, listA, arrayListD, M(strOptString2), null, null, 49184);
        c2109lo0.r = "RECOMENDADO PARA PELÍCULAS Y SERIES";
        return c2109lo0;
    }

    public static C1387eR U(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (AbstractC1899jh0.O(strOptString)) {
            strOptString = jSONObject.optString("alias");
        }
        AbstractC1474fG.i(strOptString, "ifBlank(...)");
        String strI = I(strOptString);
        boolean zA = true;
        if (!p.a(strI)) {
            if (!n.a(strI)) {
                zA = false;
            } else if (!q.a(strI)) {
                zA = f389o.a(I(AbstractC0911Ye.h0(AbstractC0937Ze.K(jSONObject.optString("name"), jSONObject.optString("alias"), jSONObject.optString("description"), jSONObject.optString("tags")), " ", null, null, null, 62)));
            }
        }
        if (zA) {
            return null;
        }
        return H(jSONObject);
    }

    public static final List p(int i2, String str) throws JSONException {
        C1541fx0 c1541fx0C;
        if (i2 < 1) {
            i2 = 1;
        }
        for (int i3 = Integer.parseInt("2026"); 1899 < i3; i3--) {
            String strValueOf = String.valueOf(i3);
            String strE = AbstractC1701hf0.e(str, ":", strValueOf);
            ConcurrentHashMap concurrentHashMap = l;
            Integer num = (Integer) concurrentHashMap.get(strE);
            if (num == null) {
                C1541fx0 c1541fx0C2 = C(1, 100, str, "year", strValueOf, null);
                int i4 = (c1541fx0C2.b + 99) / 100;
                Integer numValueOf = Integer.valueOf(i4);
                concurrentHashMap.put(strE, Integer.valueOf(i4));
                c1541fx0C = c1541fx0C2;
                num = numValueOf;
            } else {
                c1541fx0C = null;
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                if (i2 > iIntValue) {
                    i2 -= iIntValue;
                } else {
                    if (i2 != 1 || c1541fx0C == null) {
                        c1541fx0C = C(i2, 100, str, "year", strValueOf, null);
                    }
                    List list = c1541fx0C.a;
                    if (!list.isEmpty()) {
                        return list;
                    }
                    int i5 = i2 - 1;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    concurrentHashMap.put(strE, Integer.valueOf(i5));
                    i2 = 1;
                }
            }
        }
        return C1233cq.l;
    }

    public static final JSONObject q(String str, String str2) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentId", str);
        jSONObject.put("type", str2);
        jSONObject.put("sortType", "0");
        jSONObject.put("language", "es");
        JSONObject jSONObjectN = N(4, jSONObject);
        O(jSONObjectN, "Detalle");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectN.optJSONObject("data");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("assetData")) == null) {
            throw new IllegalStateException("El proveedor no devolvió el detalle solicitado");
        }
        w(jSONObjectOptJSONObject);
        return jSONObjectOptJSONObject;
    }

    public static final List r(String str, List list) throws JSONException {
        if (list.isEmpty()) {
            return C1233cq.l;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("columnId", -1);
        jSONObject.put("contentId", str);
        jSONObject.put("seriesContentId", str);
        jSONObject.put("startTime", 0);
        jSONObject.put("type", "1");
        jSONObject.put("authType", "1");
        jSONObject.put("episodeNumberList", new JSONArray((Collection) list));
        JSONObject jSONObjectN = N(7, jSONObject);
        O(jSONObjectN, "Reproducción de serie");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        return G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("episodeList") : null);
    }

    public static final List s(int i2, String str) throws JSONException {
        if (AbstractC1899jh0.O(str)) {
            return C1233cq.l;
        }
        JSONObject jSONObject = new JSONObject();
        String strH = com.skidush.clonex.bridge.N7.a.h(9);
        if (strH != null) {
            if (!(!AbstractC1899jh0.O(strH))) {
                strH = null;
            }
            if (strH != null) {
                Integer numJ = AbstractC1802ih0.J(strH);
                if (numJ != null) {
                    if (numJ.intValue() <= 0) {
                        numJ = null;
                    }
                    if (numJ != null) {
                        jSONObject.put("columnId", String.valueOf(numJ.intValue()));
                        jSONObject.put("value", AbstractC1119bh0.E0(str).toString());
                        jSONObject.put("type", "1");
                        if (i2 < 1) {
                            i2 = 1;
                        }
                        jSONObject.put("pageNum", i2);
                        jSONObject.put("pageSize", 100);
                        JSONObject jSONObjectN = N(3, jSONObject);
                        O(jSONObjectN, "Búsqueda");
                        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("searchItemList") : null;
                        ArrayList arrayList = new ArrayList();
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            for (int i3 = 0; i3 < length; i3++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                                AbstractC1406ef.Q(arrayList, G(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("itemList") : null));
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (hashSet.add(((JSONObject) obj).optString("contentId"))) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            w((JSONObject) it.next());
                        }
                        return arrayList2;
                    }
                }
                throw new IllegalStateException("Configuración protegida no válida");
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
    }

    public static final ArrayList t() {
        int iL = AbstractC1923jt0.L(10);
        int iL2 = AbstractC1923jt0.L(11);
        C2420oz c2420oz = new C2420oz(AbstractC1674hK.p("xuper-section|", iL, "|Kids"), "Kids");
        C2420oz c2420oz2 = new C2420oz(AbstractC1674hK.p("xuper-section|", iL2, "|Anime"), "Anime");
        C1233cq c1233cq = C1233cq.l;
        ArrayList arrayListL = AbstractC0937Ze.L(c2420oz, c2420oz2, new C2420oz("movies|year|2026", "Películas · 2026", c1233cq), new C2420oz("series|year|2026", "Series · 2026", c1233cq), new C2420oz("both|year|2026", "Todo · 2026", c1233cq));
        for (int i2 = 2025; 2009 < i2; i2--) {
            arrayListL.add(new C2420oz(AbstractC1674hK.n(i2, "movies|year|"), AbstractC1674hK.n(i2, "Películas · ")));
            arrayListL.add(new C2420oz(AbstractC1674hK.n(i2, "series|year|"), AbstractC1674hK.n(i2, "Series · ")));
            arrayListL.add(new C2420oz(AbstractC1674hK.n(i2, "both|year|"), AbstractC1674hK.n(i2, "Todo · ")));
        }
        for (C1101bX c1101bX : AbstractC0937Ze.K(new C1101bX("Action", "Acción"), new C1101bX("Adventure", "Aventura"), new C1101bX("Animation", "Animación"), new C1101bX("Biography", "Biografía"), new C1101bX("Comedy", "Comedia"), new C1101bX("Crime", "Crimen"), new C1101bX("Documentary", "Documental"), new C1101bX("Drama", "Drama"), new C1101bX("Family", "Familia"), new C1101bX("Fantasy", "Fantasía"), new C1101bX("History", "Historia"), new C1101bX("Horror", "Terror"), new C1101bX("Mystery", "Misterio"), new C1101bX("Romance", "Romance"), new C1101bX("Sci-Fi", "Ciencia ficción"), new C1101bX("Sport", "Deportes"), new C1101bX("Thriller", "Suspenso"), new C1101bX("War", "Guerra"), new C1101bX("Western", "Western"))) {
            String str = (String) c1101bX.l;
            String str2 = (String) c1101bX.m;
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("movies|tags|", str), AbstractC1701hf0.t("Películas · ", str2)));
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("series|tags|", str), AbstractC1701hf0.t("Series · ", str2)));
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("both|tags|", str), AbstractC1701hf0.t("Todo · ", str2)));
        }
        for (C1101bX c1101bX2 : AbstractC0937Ze.K(new C1101bX("United States of America", "Estados Unidos"), new C1101bX("Mexico", "México"), new C1101bX("Spain", "España"), new C1101bX("Korea", "Corea"), new C1101bX("Japan", "Japón"), new C1101bX("Turkey", "Turquía"), new C1101bX("Colombia", "Colombia"), new C1101bX("Argentina", "Argentina"), new C1101bX("Brazil", "Brasil"), new C1101bX("France", "Francia"))) {
            String str3 = (String) c1101bX2.l;
            String str4 = (String) c1101bX2.m;
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("movies|originalCountry|", str3), AbstractC1701hf0.t("Películas · ", str4)));
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("series|originalCountry|", str3), AbstractC1701hf0.t("Series · ", str4)));
            arrayListL.add(new C2420oz(AbstractC1701hf0.t("both|originalCountry|", str3), AbstractC1701hf0.t("Todo · ", str4)));
        }
        return arrayListL;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList u(JSONObject jSONObject, String str) {
        Iterator it;
        C2446pE c2446pEB;
        String str2;
        Object obj;
        String str3;
        String str4;
        String strH = com.skidush.clonex.bridge.N7.a.h(1);
        if (strH != null) {
            C2446pE c2446pE = null;
            if (!(!AbstractC1899jh0.O(strH))) {
                strH = null;
            }
            if (strH != null) {
                ArrayList arrayList = new ArrayList();
                for (JSONObject jSONObject2 : G(jSONObject.optJSONArray("subtitleList"))) {
                    String strOptString = jSONObject2.optString("language");
                    if (AbstractC1899jh0.O(strOptString)) {
                        strOptString = "Subtítulo";
                    }
                    for (JSONObject jSONObject3 : G(jSONObject2.optJSONArray("file"))) {
                        String strOptString2 = jSONObject3.optString("url");
                        AbstractC1474fG.i(strOptString2, "optString(...)");
                        String string = AbstractC1119bh0.E0(strOptString2).toString();
                        AbstractC1474fG.j(string, "<this>");
                        try {
                            C2349oE c2349oE = new C2349oE();
                            c2349oE.g(c2446pE, string);
                            c2446pEB = c2349oE.b();
                        } catch (IllegalArgumentException unused) {
                            c2446pEB = c2446pE;
                        }
                        if (c2446pEB != null && c2446pEB.b.length() <= 0 && c2446pEB.c.length() <= 0) {
                            if (c2446pEB.j) {
                                str2 = c2446pEB.i;
                            } else {
                                C2349oE c2349oEF = c2446pEB.f();
                                c2349oEF.j("https");
                                if (c2446pEB.e == 80) {
                                    c2349oEF.h(443);
                                }
                                str2 = c2349oEF.b().i;
                            }
                            obj = str2;
                        } else {
                            obj = c2446pE;
                        }
                        if (obj != null) {
                            String strOptString3 = jSONObject3.optString("fileType");
                            AbstractC1474fG.i(strOptString3, "optString(...)");
                            Locale locale = Locale.ROOT;
                            switch (AbstractC1701hf0.i(locale, "ROOT", strOptString3, locale, "toLowerCase(...)")) {
                                case "webvtt":
                                    str4 = "text/vtt";
                                    str3 = str4;
                                    break;
                                case "ass":
                                    str4 = "text/x-ssa";
                                    str3 = str4;
                                    break;
                                case "srt":
                                    str4 = "application/x-subrip";
                                    str3 = str4;
                                    break;
                                case "ssa":
                                    str4 = "text/x-ssa";
                                    str3 = str4;
                                    break;
                                case "vtt":
                                    str4 = "text/vtt";
                                    str3 = str4;
                                    break;
                                default:
                                    str3 = c2446pE;
                                    break;
                            }
                            if (str3 != 0) {
                                arrayList.add(new Es0(strOptString, obj, false, str3, 4));
                            }
                        }
                        c2446pE = null;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = G(jSONObject.optJSONArray("totalMovieList")).iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObject4 = (JSONObject) it2.next();
                    for (JSONObject jSONObject5 : G(jSONObject4.optJSONArray("movieList"))) {
                        String strOptString4 = jSONObject5.optString("contentId");
                        AbstractC1474fG.g(strOptString4);
                        if (AbstractC1899jh0.O(strOptString4)) {
                            it = it2;
                        } else {
                            String strOptString5 = jSONObject5.optString("videoFormat");
                            if (AbstractC1899jh0.O(strOptString5)) {
                                strOptString5 = "ts";
                            }
                            Locale locale2 = Locale.ROOT;
                            String str5 = strH + "/" + strOptString4 + "_media." + AbstractC1701hf0.i(locale2, "ROOT", strOptString5, locale2, "toLowerCase(...)");
                            String strOptString6 = jSONObject5.optString("quality");
                            if (AbstractC1899jh0.O(strOptString6)) {
                                String strOptString7 = jSONObject4.optString("quality");
                                if (AbstractC1899jh0.O(strOptString7)) {
                                    strOptString7 = "Automático";
                                }
                                strOptString6 = strOptString7;
                            }
                            String strOptString8 = jSONObject5.optString("audioInfo");
                            String strConcat = "xuper-source:".concat(strOptString4);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                Iterator it3 = it2;
                                if (hashSet.add(((Es0) obj2).m)) {
                                    arrayList3.add(obj2);
                                }
                                it2 = it3;
                            }
                            it = it2;
                            Js0 js0 = new Js0(str5, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, str, (String) null, (String) null, (List) arrayList3, false, 3518);
                            k.put(strConcat, js0);
                            List listK = AbstractC0937Ze.K(strOptString6, strOptString8);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : listK) {
                                if (!AbstractC1899jh0.O((String) obj3)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            Ds0 ds0 = new Ds0(strConcat, AbstractC0911Ye.h0(arrayList4, " · ", null, null, null, 62), str5, null, 56);
                            ds0.r = js0;
                            arrayList2.add(ds0);
                        }
                        it2 = it;
                    }
                }
                return arrayList2;
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
    }

    public static final ArrayList v(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str2);
        jSONObject.put("contentId", str);
        jSONObject.put("start", 0);
        jSONObject.put("end", 50);
        jSONObject.put("rows", 10);
        JSONObject jSONObjectN = N(5, jSONObject);
        O(jSONObjectN, "Contenido similar");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        List listG = G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("assetList") : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (!AbstractC1474fG.b(((JSONObject) obj).optString("contentId"), str)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((JSONObject) obj2).optString("contentId"))) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            w((JSONObject) it.next());
        }
        return arrayList2;
    }

    public static void w(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("contentId");
        AbstractC1474fG.g(strOptString);
        if (!AbstractC1899jh0.O(strOptString)) {
            j.put(strOptString, jSONObject);
        }
    }

    public static List x(int i2, int i3, int i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("columnId", i2);
        jSONObject.put("columnType", "2");
        jSONObject.put("pageSize", i4);
        if (i3 < 1) {
            i3 = 1;
        }
        jSONObject.put("pageNum", i3);
        jSONObject.put("encryptVersion", 0);
        JSONObject jSONObjectN = N(1, jSONObject);
        O(jSONObjectN, "Catálogo");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        List listG = G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("assetList") : null);
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            w((JSONObject) it.next());
        }
        return listG;
    }

    public static Integer z(String str) {
        if (str == null) {
            str = "";
        }
        List listS0 = AbstractC1119bh0.s0(str, new char[]{':'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            Integer numJ = AbstractC1802ih0.J((String) it.next());
            if (numJ != null) {
                arrayList.add(numJ);
            }
        }
        int size = arrayList.size();
        if (size == 2) {
            return Integer.valueOf(((Number) arrayList.get(0)).intValue() + (((Number) arrayList.get(1)).intValue() >= 30 ? 1 : 0));
        }
        if (size != 3) {
            return null;
        }
        return Integer.valueOf(((Number) arrayList.get(1)).intValue() + (((Number) arrayList.get(0)).intValue() * 60) + (((Number) arrayList.get(2)).intValue() >= 30 ? 1 : 0));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:33:0x008f, B:35:0x0095), top: B:55:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1833ix0 c1833ix0;
        C2532q60 c2532q60;
        YS ys;
        VS vs;
        VS vs2;
        C2532q60 c2532q61;
        VS vs3;
        if (interfaceC0473Hh instanceof C1833ix0) {
            c1833ix0 = (C1833ix0) interfaceC0473Hh;
            int i2 = c1833ix0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1833ix0.p = i2 - Integer.MIN_VALUE;
            } else {
                c1833ix0 = new C1833ix0(this, interfaceC0473Hh);
            }
        } else {
            c1833ix0 = new C1833ix0(this, interfaceC0473Hh);
        }
        Object obj = c1833ix0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1833ix0.p;
        try {
            if (i3 == 0) {
                Jp0.O(obj);
                if (com.skidush.clonex.bridge.N7.a.c(System.currentTimeMillis() / 1000)) {
                    return C2985uq0.a;
                }
                c2532q60 = new C2532q60();
                ys = c;
                c1833ix0.l = c2532q60;
                c1833ix0.m = ys;
                c1833ix0.p = 1;
                if (ys.d(null, c1833ix0) == enumC1706hi) {
                    vs = ys;
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs2 = c1833ix0.m;
                    c2532q61 = c1833ix0.l;
                    try {
                        Jp0.O(obj);
                        vs2 = vs2;
                        c2532q61.l = true;
                        if (!e) {
                            MyApplication myApplication = MyApplication.l;
                            Context applicationContext = Jp0.s().getApplicationContext();
                            AbstractC1474fG.i(applicationContext, "getApplicationContext(...)");
                            applicationContext.getSharedPreferences("xuper_direct_api", 0).edit().remove("profile_state").apply();
                            e = true;
                        }
                        c2532q60 = c2532q61;
                        vs3 = vs2;
                        ((YS) vs3).e(null);
                        if (c2532q60.l) {
                            synchronized (d) {
                                f = 0L;
                                g = 0L;
                                h = null;
                            }
                            C1152by0 c1152by0 = C1152by0.b;
                            C1152by0.u();
                        }
                        return C2985uq0.a;
                    } catch (Throwable th) {
                        th = th;
                        ((YS) vs2).e(null);
                        throw th;
                    }
                }
                VS vs4 = c1833ix0.m;
                C2532q60 c2532q62 = c1833ix0.l;
                Jp0.O(obj);
                c2532q60 = c2532q62;
                vs = vs4;
            }
            vs = ys;
            vs3 = vs;
            if (!com.skidush.clonex.bridge.N7.a.c(System.currentTimeMillis() / 1000)) {
                c1833ix0.l = c2532q60;
                c1833ix0.m = vs;
                c1833ix0.p = 2;
                if (Ec0.a.n(new C1248cx0(null, null, null), c1833ix0) == enumC1706hi) {
                    return enumC1706hi;
                }
                c2532q61 = c2532q60;
                vs2 = vs;
                c2532q61.l = true;
                if (!e) {
                    MyApplication myApplication2 = MyApplication.l;
                    Context applicationContext2 = Jp0.s().getApplicationContext();
                    AbstractC1474fG.i(applicationContext2, "getApplicationContext(...)");
                    applicationContext2.getSharedPreferences("xuper_direct_api", 0).edit().remove("profile_state").apply();
                    e = true;
                }
                c2532q60 = c2532q61;
                vs3 = vs2;
            }
            ((YS) vs3).e(null);
            if (c2532q60.l) {
                synchronized (d) {
                    f = 0L;
                    g = 0L;
                    h = null;
                    C1152by0 c1152by1 = C1152by0.b;
                    C1152by0.u();
                }
            }
            return C2985uq0.a;
        } catch (Throwable th2) {
            th = th2;
            vs2 = vs;
            ((YS) vs2).e(null);
            throw th;
        }
    }

    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Kx0(str, i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Ax0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2224mx0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object d(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Hx0(i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Cx0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return "https://static.vecteezy.com/system/resources/thumbnails/012/657/549/small/illustration-negative-film-reel-roll-tapes-for-movie-cinema-video-logo-vector.jpg";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C3193wx0(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "RECOMENDADO PARA PELÍCULAS Y SERIES";
    }

    @Override // o.Q30
    public final Object h(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C2902tx0(str, i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object i(int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Bx0(i2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Gx0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object k(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1688hY(str, str, null, null, 12);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Ix0 ix0;
        if (interfaceC0473Hh instanceof Ix0) {
            ix0 = (Ix0) interfaceC0473Hh;
            int i2 = ix0.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ix0.n = i2 - Integer.MIN_VALUE;
            } else {
                ix0 = new Ix0(this, interfaceC0473Hh);
            }
        } else {
            ix0 = new Ix0(this, interfaceC0473Hh);
        }
        Object objJ = ix0.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = ix0.n;
        if (i3 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            Jx0 jx0 = new Jx0(ds0, null);
            ix0.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, jx0, ix0);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    public final void y() {
        j.clear();
        k.clear();
        l.clear();
        synchronized (d) {
            f = 0L;
            g = 0L;
            h = null;
        }
        C1152by0.b.t();
        com.skidush.clonex.bridge.N7.a.g();
    }
}
