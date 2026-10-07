package o;

import com.skidush.clonex.models.Video$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class QW implements Q30 {
    public static final QW b = new QW();
    public static final List c;
    public static final C2938uM d;
    public static final Rh0 e;
    public static List f;
    public static long g;
    public static final LinkedHashMap h;
    public static final LinkedHashMap i;
    public static final LinkedHashMap j;

    static {
        List listK = AbstractC0937Ze.K("https://api.ppv.st/api", "https://api.ppv.cx/api");
        c = listK;
        d = new C2938uM(1);
        e = new Rh0(C2428p3.L);
        f = C1233cq.l;
        h = new LinkedHashMap();
        i = new LinkedHashMap();
        j = new LinkedHashMap();
    }

    public static final List p(String str) {
        String str2 = (String) i.get(str);
        if (str2 == null) {
            return C1233cq.l;
        }
        String str3 = (String) h.get(str);
        if (str3 == null) {
            str3 = "Main";
        }
        return AbstractC2506pt.A(new Ds0(str2, str3, null, null, 60));
    }

    public static final String q(String str) throws Exception {
        Iterator it = c.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            try {
                return s(((String) it.next()) + "/" + str);
            } catch (Exception e3) {
                e2 = e3;
                e2.getMessage();
            }
        }
        if (e2 != null) {
            throw e2;
        }
        throw new Exception("No se pudo contactar la API de ppv.st");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public static final List r(JSONObject jSONObject) throws JSONException {
        boolean zBooleanValue;
        boolean z = true;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("streams");
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2 += z ? 1 : 0) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
            int iOptInt = jSONObject2.optInt("id", -1);
            Integer numValueOf = Integer.valueOf(iOptInt);
            if (iOptInt < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                String strOptString = jSONObject2.optString("uri_name");
                AbstractC1474fG.g(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    String strOptString2 = jSONObject2.optString("name");
                    AbstractC1474fG.g(strOptString2);
                    String str = strOptString2.length() > 0 ? strOptString2 : null;
                    if (str != null) {
                        String strOptString3 = jSONObject2.optString("poster");
                        AbstractC1474fG.g(strOptString3);
                        String str2 = strOptString3.length() > 0 ? strOptString3 : null;
                        String strOptString4 = jSONObject2.optString("iframe");
                        AbstractC1474fG.g(strOptString4);
                        if (strOptString4.length() <= 0) {
                            strOptString4 = null;
                        }
                        long jOptLong = jSONObject2.optLong("starts_at", 0L);
                        long jOptLong2 = jSONObject2.optLong("ends_at", 0L);
                        Object objOpt = jSONObject2.opt("always_live");
                        if (objOpt instanceof Boolean) {
                            zBooleanValue = ((Boolean) objOpt).booleanValue();
                        } else if (!(objOpt instanceof Number)) {
                            if (!AbstractC1474fG.b(objOpt != null ? objOpt.toString() : null, "1")) {
                                if (!AbstractC1899jh0.N(objOpt != null ? objOpt.toString() : null, "true", z)) {
                                    zBooleanValue = false;
                                }
                            }
                            zBooleanValue = true;
                        } else if (((Number) objOpt).intValue() == z) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        boolean z2 = !zBooleanValue && jOptLong > 0 && jOptLong <= System.currentTimeMillis() / 1000;
                        String strN = AbstractC1674hK.n(iIntValue, "ppv-");
                        h.put(strN, str);
                        j.put(strN, strOptString);
                        if (strOptString4 != null) {
                            i.put(strN, strOptString4);
                        }
                        Boolean bool = Boolean.TRUE;
                        arrayList.add(new C1387eR(strN, str, null, null, null, null, null, null, str2, null, null, null, null, null, AbstractC3327yN.z(new C1101bX("is_tv_channel", bool), new C1101bX("is_live_channel", Boolean.valueOf(z2)), new C1101bX("ppv_event_card", bool), new C1101bX("ppv_starts_at", Long.valueOf(jOptLong)), new C1101bX("ppv_ends_at", Long.valueOf(jOptLong2)), new C1101bX("ppv_always_live", Boolean.valueOf(zBooleanValue))), 16124));
                        z = true;
                    }
                }
            }
        }
        return arrayList;
    }

    public static String s(String str) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        c0560Kq.j("Accept", "application/json, text/plain, */*");
        c0560Kq.j("Referer", "https://ppv.st/");
        c0560Kq.j("Origin", "https://ppv.st");
        C1855j80 c1855j80G = ((OV) e.getValue()).c(c0560Kq.c()).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : "";
            if (c1855j80G.p()) {
                if (AbstractC1899jh0.U(AbstractC1119bh0.H0(strQ).toString(), "<!", false)) {
                    throw new Exception("DDoS-Guard bloqueó la petición a ".concat(str));
                }
                AbstractC3409z9.g(c1855j80G, null);
                return strQ;
            }
            throw new Exception("HTTP " + c1855j80G.f840o + " desde " + str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    @Override // o.Q30
    public final Object a(String str, int i2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        String str2 = (String) h.get(str);
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
        return AbstractC1376eG.J(AbstractC1910jn.b, new PW(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/FIFA_World_Cup_2026_logo.svg/400px-FIFA_World_Cup_2026_logo.svg.png";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new OW(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "EVENTOS 3";
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
        throw new Exception("Not implemented");
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
        Rh0 rh0 = F20.a;
        return AbstractC1376eG.J(AbstractC1910jn.b, new E20(ds0.l, ds0.m, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }
}
