package o;

import android.content.SharedPreferences;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3316yC {
    public final SharedPreferences a;
    public final OV b;

    public C3316yC(SharedPreferences sharedPreferences, OV ov) {
        AbstractC1474fG.j(ov, "directClient");
        this.a = sharedPreferences;
        this.b = ov;
    }

    public final JSONObject a(C1951k70 c1951k70, Long l) throws IOException {
        Object objK;
        try {
            objK = new JSONObject(b(c1951k70, l));
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (C2536q80.a(objK) == null) {
            return (JSONObject) objK;
        }
        throw new IOException("Hola devolvió una respuesta inválida");
    }

    public final String b(C1951k70 c1951k70, Long l) throws SocketTimeoutException {
        NV nvB = this.b.b();
        nvB.c(20L, TimeUnit.SECONDS);
        C1855j80 c1855j80M = AbstractC1468fA.m(new OV(nvB), c1951k70, l);
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80M.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (c1855j80M.p()) {
                if (AbstractC1899jh0.O(strQ)) {
                    throw new IOException("Hola devolvió una respuesta vacía");
                }
                AbstractC3409z9.g(c1855j80M, null);
                return strQ;
            }
            throw new IOException("Hola respondió HTTP " + c1855j80M.f840o);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80M, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List c(String str, String str2, String str3, String str4, Long l) throws IOException {
        C2349oE c2349oE = new C2349oE();
        Object obj = null;
        c2349oE.g(null, "https://client.hola.org/client_cgi/zgettunnels");
        C2349oE c2349oEF = c2349oE.b().f();
        Locale locale = Locale.US;
        c2349oEF.a("country", AbstractC1701hf0.i(locale, "US", str4, locale, "toLowerCase(...)"));
        c2349oEF.a("limit", "5");
        c2349oEF.a("ping_id", String.valueOf(Math.random()));
        c2349oEF.a("ext_ver", str3);
        c2349oEF.a("browser", "1.240.275");
        c2349oEF.a("uuid", str);
        c2349oEF.a("session_key", str2);
        C2446pE c2446pEB = c2349oEF.b();
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.m = c2446pEB;
        c0560Kq.j("User-Agent", "ExoStreamPlayer/3.11.23 (Linux;Android 8.0.0) ExoPlayerLib/2.9.3");
        c0560Kq.j("Accept", "application/json");
        long j = 0;
        Mr0.c(j, j, j);
        c0560Kq.m("POST", new C2243n70(0, 0, null, new byte[0]));
        JSONObject jSONObjectA = a(c0560Kq.c(), l);
        String strOptString = jSONObjectA.optString("agent_key");
        AbstractC1474fG.g(strOptString);
        String str5 = AbstractC1899jh0.O(strOptString) ^ true ? strOptString : null;
        if (str5 == null) {
            C3074vm0 c3074vm0M = Vb0.M(Vb0.O("error", "message", "error_msg"), new C3219xC(0, jSONObjectA));
            Iterator it = c3074vm0M.a.iterator();
            while (it.hasNext()) {
                Object objB = c3074vm0M.b.b(it.next());
                String str6 = (String) objB;
                AbstractC1474fG.g(str6);
                if (!AbstractC1899jh0.O(str6)) {
                    obj = objB;
                    break;
                }
            }
            String str7 = (String) obj;
            throw new IOException(str7 != null ? AbstractC1119bh0.D0(120, str7) : "Hola no devolvió credenciales");
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("port");
        if (jSONObjectOptJSONObject != null) {
            int iOptInt = jSONObjectOptJSONObject.optInt("peer", 0);
            Integer numValueOf = Integer.valueOf(iOptInt);
            if (1 > iOptInt || iOptInt >= 65536) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectA.optJSONObject("ip_list");
                if (jSONObjectOptJSONObject2 == null) {
                    throw new IOException("Hola no devolvió servidores para ".concat(str4));
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObjectA.optJSONObject("vendor");
                String strConcat = "user-uuid-".concat(str);
                long jCurrentTimeMillis = System.currentTimeMillis() + 1200000;
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject2, next, "optString(...)");
                    if (!AbstractC1899jh0.O(strJ)) {
                        Object objOptString = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString(next) : obj;
                        if (objOptString == null) {
                            objOptString = "";
                        }
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new C3122wC(strJ, iIntValue, strConcat, str5, str4, jCurrentTimeMillis, objOptString));
                        arrayList = arrayList2;
                        jSONObjectOptJSONObject3 = jSONObjectOptJSONObject3;
                        obj = null;
                    }
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3.isEmpty()) {
                    throw new IOException("Hola no devolvió servidores para ".concat(str4));
                }
                List listZ0 = AbstractC0911Ye.z0(arrayList3);
                Collections.shuffle(listZ0);
                return listZ0;
            }
        }
        throw new IOException("Hola no devolvió un puerto peer válido");
    }

    public final String d(String str, String str2, Long l) {
        JSONObject jSONObjectPut = new JSONObject().put("login", "1").put("ver", str2);
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://client.hola.org/client_cgi/background_init?uuid=".concat(str));
        c0560Kq.j("User-Agent", "ExoStreamPlayer/3.11.23 (Linux;Android 8.0.0) ExoPlayerLib/2.9.3");
        c0560Kq.j("Accept", "application/json");
        String string = jSONObjectPut.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json; charset=utf-8")));
        String strOptString = a(c0560Kq.c(), l).optString("key");
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString == null) {
            throw new IOException("Hola no devolvió una clave de sesión");
        }
        if (this.a.edit().putString("hola_session_key", strOptString).commit()) {
            return strOptString;
        }
        throw new IllegalStateException("No se pudo persistir la sesión Hola".toString());
    }
}
