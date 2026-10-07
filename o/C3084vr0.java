package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.vr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3084vr0 {
    public static AH A;
    public static final Object B;
    public static volatile long C;
    public static volatile long D;
    public static final C2771sg0 E;
    public static final C2917u50 F;
    public static final Proxy G;
    public static final C2687rn H;
    public static final C2793sr0 I;
    public static final C1306dd0 J;
    public static final C2600qr0 K;
    public static final Rh0 L;
    public static final C3084vr0 a = new C3084vr0();
    public static final List b = AbstractC0937Ze.K("AE", "AR", "AT", "AU", "BE", "BG", "BR", "CA", "CH", "CI", "CL", "CN", "CO", "CR", "CY", "CZ", "DE", "DK", "EC", "EE", "EG", "ES", "FI", "FR", "GB", "GE", "GH", "GR", "GT", "HK", "HR", "HU", "ID", "IE", "IL", "IN", "IS", "IT", "JO", "JP", "KE", "KG", "KR", "KW", "KZ", "LK", "LT", "LU", "LV", "MA", "MN", "MT", "MX", "MY", "NG", "NI", "NL", "NO", "NZ", "PA", "PE", "PH", "PK", "PL", "PR", "PT", "PY", "RO", "RU", "SA", "SE", "SG", "SI", "SK", "TH", "TR", "TW", "UA", "US", "UY", "VN", "ZA");
    public static final List c = AbstractC0937Ze.K("AR", "AT", "AU", "BE", "BG", "BR", "CA", "CH", "CL", "CO", "CZ", "DE", "DK", "EC", "ES", "FI", "FR", "GB", "GR", "HK", "HR", "HU", "ID", "IE", "IL", "IN", "IS", "IT", "JP", "KR", "MX", "NL", "NO", "NZ", "PL", "RO", "RU", "SE", "SG", "SK", "TR", "US");
    public static final TP d;
    public static final C0421Fh e;
    public static final YS f;
    public static final YS g;
    public static final YS h;
    public static final YS i;
    public static Context j;
    public static SharedPreferences k;
    public static final Rh0 l;
    public static volatile boolean m;
    public static volatile boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f1083o;
    public static volatile C1041ar0 p;
    public static final AtomicBoolean q;
    public static volatile C1041ar0 r;
    public static volatile boolean s;
    public static volatile C1041ar0 t;
    public static volatile C1041ar0 u;
    public static final AtomicLong v;
    public static volatile long w;
    public static volatile EnumC1139br0 x;
    public static volatile ProxySelector y;
    public static C1703hg0 z;

    static {
        Pattern pattern = TP.e;
        d = AbstractC1474fG.o("application/json; charset=utf-8");
        e = zy0.c(Sr0.z(U9.a(), AbstractC1910jn.b));
        f = AbstractC1923jt0.a();
        g = AbstractC1923jt0.a();
        h = AbstractC1923jt0.a();
        i = AbstractC1923jt0.a();
        l = new Rh0(C1693hb0.x);
        q = new AtomicBoolean(false);
        v = new AtomicLong(0L);
        B = new Object();
        C2771sg0 c2771sg0 = new C2771sg0(C1627gr0.a);
        E = c2771sg0;
        F = new C2917u50(c2771sg0);
        G = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("127.0.0.1", 9));
        H = new C2687rn(2);
        I = new C2793sr0();
        J = new C1306dd0(16);
        K = new C2600qr0();
        L = new Rh0(C1693hb0.w);
    }

    public static void A(EnumC1139br0 enumC1139br0, String str) {
        int iOrdinal = enumC1139br0.ordinal();
        if (iOrdinal == 0) {
            Cr0.C.f(str);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Cr0.A.f(str);
        }
    }

    public static void B(C1041ar0 c1041ar0) {
        int i2;
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        SharedPreferences.Editor editorPutString = sharedPreferences.edit().putString("proxy_host", c1041ar0.b).putInt("proxy_port", c1041ar0.c).putString("proxy_token", c1041ar0.d).putString("proxy_password", c1041ar0.e).putString("proxy_provider", c1041ar0.a.l).putLong("proxy_expires_at", c1041ar0.f).putString("proxy_country", c1041ar0.g).putString("proxy_selection", c1041ar0.h).putString("proxy_exit_ip", c1041ar0.i).putString("proxy_exit_country", c1041ar0.j).putString("proxy_isp", c1041ar0.k).putString("proxy_organization", c1041ar0.l);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = c1041ar0.m;
        if (AbstractC1474fG.b(bool2, bool)) {
            i2 = 0;
        } else if (AbstractC1474fG.b(bool2, Boolean.TRUE)) {
            i2 = 1;
        } else {
            if (bool2 != null) {
                throw new C0730Rf();
            }
            i2 = -1;
        }
        editorPutString.putInt("proxy_hosting", i2).commit();
    }

    public static Object C(InterfaceC0473Hh interfaceC0473Hh) {
        Object objJ;
        if (!m) {
            throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
        }
        boolean z2 = n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        return (!z2 && (objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2696rr0(2, null), interfaceC0473Hh)) == EnumC1706hi.l) ? objJ : c2985uq0;
    }

    public static ArrayList D() {
        C0404Eq c0404Eq = EnumC1139br0.r;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(c0404Eq, 10));
        G g2 = new G(0, c0404Eq);
        while (g2.hasNext()) {
            EnumC1139br0 enumC1139br0 = (EnumC1139br0) g2.next();
            arrayList.add(new Zq0(enumC1139br0.l, enumC1139br0.m));
        }
        return arrayList;
    }

    public static String E(Long l2) throws JSONException, IOException {
        JSONObject jSONObjectPut = new JSONObject().put("clientApp", new JSONObject().put("name", "URBAN_VPN_BROWSER_EXTENSION").put("browser", "CHROME"));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://api-pro.urban-vpn.com/rest/v1/registrations/clientApps/URBAN_VPN_BROWSER_EXTENSION/users/anonymous");
        M(c0560Kq);
        String string = jSONObjectPut.toString();
        AbstractC1474fG.i(string, "toString(...)");
        c0560Kq.m("POST", C2743sL.k(string, d));
        String strOptString = m(c0560Kq.c(), l2).optString("value");
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString == null) {
            throw new IOException("Urban no devolvio auth_token");
        }
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.edit().putString("auth_token", strOptString).commit()) {
            return strOptString;
        }
        throw new IllegalStateException("No se pudo persistir la identidad Urban".toString());
    }

    public static void F(boolean z2) {
        Object c1431er0;
        if (m && s()) {
            C1703hg0 c1703hg0 = z;
            if (c1703hg0 == null || !c1703hg0.a()) {
                EnumC1139br0 enumC1139br0H = H();
                String strW = w(enumC1139br0H, L(enumC1139br0H));
                long j2 = D;
                C1041ar0 c1041ar0 = p;
                C2771sg0 c2771sg0 = E;
                Object value = c2771sg0.getValue();
                C1431er0 c1431er1 = value instanceof C1431er0 ? (C1431er0) value : null;
                if (c1041ar0 == null || c1431er1 == null) {
                    c1431er0 = C1529fr0.a;
                } else {
                    EnumC1139br0 enumC1139br0 = c1431er1.a;
                    String str = c1431er1.b;
                    String str2 = c1431er1.c;
                    String str3 = c1431er1.d;
                    Boolean bool = c1431er1.e;
                    long j3 = c1431er1.f;
                    AbstractC1474fG.j(enumC1139br0, "provider");
                    AbstractC1474fG.j(str, "country");
                    AbstractC1474fG.j(str2, "exitIp");
                    AbstractC1474fG.j(str3, "isp");
                    c1431er0 = new C1431er0(enumC1139br0, str, str2, str3, bool, j3, true);
                }
                c2771sg0.f(c1431er0);
                z = AbstractC1376eG.w(e, null, 0, new C2890tr0(z2, enumC1139br0H, strW, j2, c1041ar0, null), 3);
            }
        }
    }

    public static String G(String str, Long l2) throws IOException {
        Object objK;
        String strOptString = l(l2, new C2406or0(str, new JSONObject().put("type", "accs").put("clientApp", new JSONObject().put("name", "URBAN_VPN_BROWSER_EXTENSION")), 1)).optString("value");
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString == null) {
            throw new IOException("Urban no devolvio security_token");
        }
        try {
            byte[] bArrDecode = Base64.decode((String) AbstractC1119bh0.s0(strOptString, new char[]{'.'}, 0, 6).get(1), 11);
            AbstractC1474fG.g(bArrDecode);
            objK = Long.valueOf(new JSONObject(new String(bArrDecode, AbstractC1305dd.a)).optLong("exp") * 1000);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = 0L;
        }
        long jLongValue = ((Number) objK).longValue();
        Long lValueOf = Long.valueOf(jLongValue);
        if (jLongValue <= System.currentTimeMillis()) {
            lValueOf = null;
        }
        long jLongValue2 = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis() + 72000000;
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("security_token", strOptString).putLong("security_expires_at", jLongValue2).commit();
            return strOptString;
        }
        AbstractC1474fG.U("prefs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public static EnumC1139br0 H() {
        C3325yL c3325yL = EnumC1139br0.n;
        String strB = Cr0.B.b();
        if (strB == null) {
            strB = "HOLA";
        } else {
            if (!(!AbstractC1899jh0.O(strB))) {
                strB = null;
            }
            if (strB == null) {
                strB = "HOLA";
            }
        }
        c3325yL.getClass();
        return C3325yL.u(strB);
    }

    public static void I(String str) {
        AbstractC1474fG.j(str, "countryCode");
        if (!m) {
            throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
        }
        EnumC1139br0 enumC1139br0H = H();
        String strW = w(enumC1139br0H, str);
        if (AbstractC1474fG.b(L(enumC1139br0H), strW)) {
            return;
        }
        D++;
        C1703hg0 c1703hg0 = z;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        z = null;
        AH ah = A;
        if (ah != null) {
            ah.f(null);
        }
        A(enumC1139br0H, strW);
        e();
        p = null;
        if (s()) {
            E.f(C1529fr0.a);
            d(null);
            F(false);
        }
    }

    public static void J(boolean z2) {
        Object objK;
        if (!m) {
            throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
        }
        D++;
        f1083o = z2;
        if (z2) {
            EnumC1139br0 enumC1139br0H = H();
            A(enumC1139br0H, w(enumC1139br0H, L(enumC1139br0H)));
            p = null;
            E.f(C1529fr0.a);
            d(null);
            F(false);
            return;
        }
        C1703hg0 c1703hg0 = z;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        AH ah = A;
        if (ah != null) {
            ah.f(null);
        }
        p = null;
        E.f(C1627gr0.a);
        Object obj = B;
        synchronized (obj) {
            obj.notifyAll();
        }
        if (!m || !q.compareAndSet(true, false) || !AbstractC1474fG.G("PROXY_OVERRIDE")) {
            return;
        }
        Context context = j;
        if (context == null) {
            AbstractC1474fG.U("appContext");
            throw null;
        }
        Executor executorA = Build.VERSION.SDK_INT >= 28 ? AbstractC0317Bh.a(context) : new F2(new Handler(context.getMainLooper()));
        AbstractC1474fG.i(executorA, "getMainExecutor(...)");
        try {
            if (!AbstractC1474fG.G("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            C0334By c0334By = AbstractC2506pt.c;
            UU uu = new UU(12);
            if (!Kv0.a.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            if (((ProxyControllerBoundaryInterface) c0334By.m) == null) {
                c0334By.m = Lv0.a.getProxyController();
            }
            ((ProxyControllerBoundaryInterface) c0334By.m).clearProxyOverride(uu, executorA);
            objK = C2985uq0.a;
            if (C2536q80.a(objK) != null) {
                q.set(true);
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
    }

    public static void K(String str) {
        AbstractC1474fG.j(str, "providerCode");
        if (!m) {
            throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
        }
        EnumC1139br0.n.getClass();
        EnumC1139br0 enumC1139br0U = C3325yL.u(str);
        if (H() == enumC1139br0U) {
            return;
        }
        D++;
        C1703hg0 c1703hg0 = z;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        z = null;
        AH ah = A;
        if (ah != null) {
            ah.f(null);
        }
        String str2 = enumC1139br0U.l;
        AbstractC1474fG.j(str2, "value");
        Cr0.B.f(str2);
        A(enumC1139br0U, w(enumC1139br0U, L(enumC1139br0U)));
        e();
        p = null;
        if (s()) {
            E.f(C1529fr0.a);
            d(null);
            F(false);
        }
    }

    public static String L(EnumC1139br0 enumC1139br0) {
        String str;
        int iOrdinal = enumC1139br0.ordinal();
        if (iOrdinal == 0) {
            String strB = Cr0.C.b();
            if (strB != null) {
                str = true ^ AbstractC1899jh0.O(strB) ? strB : null;
                if (str != null) {
                    return str;
                }
            }
            return "AR";
        }
        if (iOrdinal != 1) {
            throw new C0730Rf();
        }
        String strB2 = Cr0.A.b();
        if (strB2 != null) {
            str = true ^ AbstractC1899jh0.O(strB2) ? strB2 : null;
            if (str != null) {
                return str;
            }
        }
        return "AUTO";
    }

    public static void M(C0560Kq c0560Kq) {
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        c0560Kq.j("Accept", "application/json");
        c0560Kq.j("Origin", "chrome-extension://eppiocemhmnlbhjplcgkofciiegomcon");
        c0560Kq.j("X-Client-App", "URBAN_VPN_BROWSER_EXTENSION");
    }

    public static C1041ar0 N(C1041ar0 c1041ar0, Long l2) throws IOException {
        Object objK;
        NV nv = new NV();
        Proxy proxyA = c1041ar0.a();
        String str = c1041ar0.n;
        nv.g(proxyA);
        X9 x9 = Sr0.a;
        ArrayList arrayList = nv.c;
        arrayList.add(x9);
        X9 x10 = Sr0.b;
        ArrayList arrayList2 = nv.d;
        arrayList2.add(x10);
        X9 x11 = AbstractC1370eA.m;
        AbstractC1406ef.S(arrayList, X10.q);
        AbstractC1406ef.S(arrayList2, X10.r);
        arrayList.add(x11);
        arrayList2.add(x11);
        nv.h(new Wq0(c1041ar0, 3));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nv.e(15L, timeUnit);
        nv.i(15L, timeUnit);
        nv.c(20L, timeUnit);
        nv.f(H);
        Rh0 rh0 = C2376oc0.a;
        C2376oc0.b(nv, false);
        OV ov = new OV(nv);
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://geo.geosurf.io/");
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        c0560Kq.d();
        C1855j80 c1855j80M = AbstractC1468fA.m(ov, c0560Kq.c(), l2);
        try {
            if (!c1855j80M.p()) {
                int i2 = c1855j80M.f840o;
                throw new Yq0(i2, "Handshake de proxy HTTP " + i2);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80M.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            try {
                objK = new JSONObject(strQ);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (C2536q80.a(objK) != null) {
                throw new IOException("El proxy no devolvio verificacion GEO valida");
            }
            JSONObject jSONObject = (JSONObject) objK;
            String strOptString = jSONObject.optString("ip");
            AbstractC1474fG.g(strOptString);
            String str2 = AbstractC1899jh0.O(strOptString) ^ true ? strOptString : null;
            if (str2 == null) {
                throw new IOException("El proxy no devolvio una IP de salida");
            }
            String strOptString2 = jSONObject.optString("country");
            AbstractC1474fG.i(strOptString2, "optString(...)");
            Locale locale = Locale.US;
            AbstractC1474fG.i(locale, "US");
            String upperCase = strOptString2.toUpperCase(locale);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            String strOptString3 = jSONObject.optString("isp");
            String strOptString4 = jSONObject.optString("organization");
            AbstractC1474fG.g(strOptString3);
            AbstractC1474fG.g(strOptString4);
            boolean zT = t(strOptString3, strOptString4, str);
            Boolean boolValueOf = zT ? Boolean.valueOf(zT) : null;
            AbstractC3409z9.g(c1855j80M, null);
            String str3 = c1041ar0.h;
            boolean zB = AbstractC1474fG.b(str3, "AUTO");
            EnumC1139br0 enumC1139br0 = c1041ar0.a;
            if (!zB && (!AbstractC1899jh0.O(upperCase)) && !AbstractC1899jh0.N(upperCase, str3, true)) {
                throw new IOException(enumC1139br0.m + " conectó desde " + upperCase + ", no desde " + str3);
            }
            AbstractC1474fG.j(enumC1139br0, "provider");
            String str4 = c1041ar0.b;
            AbstractC1474fG.j(str4, "host");
            String str5 = c1041ar0.d;
            AbstractC1474fG.j(str5, "username");
            String str6 = c1041ar0.e;
            AbstractC1474fG.j(str6, "password");
            String str7 = c1041ar0.g;
            AbstractC1474fG.j(str7, "country");
            AbstractC1474fG.j(str3, "selectionCode");
            AbstractC1474fG.j(str, "vendor");
            return new C1041ar0(enumC1139br0, str4, c1041ar0.c, str5, str6, c1041ar0.f, str7, str3, str2, upperCase, strOptString3, strOptString4, boolValueOf, str);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC3409z9.g(c1855j80M, th2);
                throw th3;
            }
        }
    }

    public static final void a(C1041ar0 c1041ar0) {
        p = c1041ar0;
        E.f(new C1431er0(c1041ar0.a, c1041ar0.g, c1041ar0.i, c1041ar0.k, c1041ar0.m, c1041ar0.f, false));
        Object obj = B;
        synchronized (obj) {
            obj.notifyAll();
        }
        String str = c1041ar0.a.m;
        d(c1041ar0);
        long j2 = c1041ar0.f;
        AH ah = A;
        if (ah != null) {
            ah.f(null);
        }
        A = AbstractC1376eG.w(e, null, 0, new C2987ur0(U9.f((j2 - System.currentTimeMillis()) - 120000, 30000L), null), 3);
    }

    public static void b(NV nv) {
        if (s()) {
            c(nv);
            return;
        }
        C1041ar0 c1041ar0 = r;
        if (c1041ar0 != null) {
            if (c1041ar0.f <= System.currentTimeMillis() + 90000) {
                c1041ar0 = null;
            }
            if (c1041ar0 == null) {
                return;
            }
            nv.g(c1041ar0.a());
            nv.h(new Wq0(c1041ar0, 2));
        }
    }

    public static void c(NV nv) {
        C2793sr0 c2793sr0 = I;
        AbstractC1474fG.j(c2793sr0, "proxySelector");
        if (!AbstractC1474fG.b(c2793sr0, nv.n)) {
            nv.D = null;
        }
        nv.n = c2793sr0;
        nv.h(J);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public static void d(C1041ar0 c1041ar0) {
        String str;
        Object objK;
        if (!m || !AbstractC1474fG.G("PROXY_OVERRIDE")) {
            return;
        }
        if (c1041ar0 != null) {
            str = c1041ar0.b + ":" + c1041ar0.c;
            if (str == null) {
                str = "127.0.0.1:9";
            }
        } else {
            str = "127.0.0.1:9";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new C2334o40(str));
        C2431p40 c2431p40 = new C2431p40(arrayList, arrayList2);
        Context context = j;
        if (context == null) {
            AbstractC1474fG.U("appContext");
            throw null;
        }
        Executor executorA = Build.VERSION.SDK_INT >= 28 ? AbstractC0317Bh.a(context) : new F2(new Handler(context.getMainLooper()));
        AbstractC1474fG.i(executorA, "getMainExecutor(...)");
        try {
            if (!AbstractC1474fG.G("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            AbstractC2506pt.c.A(c2431p40, executorA, new UU(12));
            q.set(true);
            objK = C2985uq0.a;
            C2536q80.a(objK);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
    }

    public static void e() {
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("proxy_host").remove("proxy_port").remove("proxy_token").remove("proxy_password").remove("proxy_provider").remove("proxy_expires_at").remove("proxy_country").remove("proxy_selection").remove("proxy_exit_ip").remove("proxy_exit_country").remove("proxy_isp").remove("proxy_organization").remove("proxy_hosting").apply();
        } else {
            AbstractC1474fG.U("prefs");
            throw null;
        }
    }

    public static List f() {
        List<String> list;
        EnumC1139br0 enumC1139br0H = H();
        Locale locale = Locale.getDefault();
        AbstractC1474fG.i(locale, "getDefault(...)");
        int iOrdinal = enumC1139br0H.ordinal();
        if (iOrdinal == 0) {
            list = c;
        } else {
            if (iOrdinal != 1) {
                throw new C0730Rf();
            }
            list = b;
        }
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (String str : list) {
            arrayList.add(new Xq0(str, g(str, locale)));
        }
        List listR0 = AbstractC0911Ye.r0(arrayList, new WN(1, locale));
        return enumC1139br0H == EnumC1139br0.p ? AbstractC0911Ye.m0(AbstractC2506pt.A(new Xq0("AUTO", "Automático (servidor más rápido)")), listR0) : listR0;
    }

    public static String g(String str, Locale locale) {
        AbstractC1474fG.j(str, "code");
        AbstractC1474fG.j(locale, "locale");
        if (AbstractC1899jh0.N(str, "AUTO", true)) {
            return "Automático";
        }
        Locale locale2 = Locale.US;
        AbstractC1474fG.i(locale2, "US");
        String upperCase = str.toUpperCase(locale2);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        String displayCountry = new Locale("", upperCase).getDisplayCountry(locale);
        AbstractC1474fG.g(displayCountry);
        if (!(!AbstractC1899jh0.O(displayCountry))) {
            displayCountry = null;
        }
        return displayCountry == null ? upperCase : displayCountry;
    }

    public static JSONObject l(Long l2, InterfaceC0412Ey interfaceC0412Ey) throws IOException {
        List listK = AbstractC0937Ze.K("https://api-pro.urban-vpn.com/rest/v1", "https://api-pro.falais.com/rest/v1");
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string = sharedPreferences.getString("api_base", null);
        if (string == null || !listK.contains(string)) {
            string = null;
        }
        Yq0 th = null;
        for (String str : AbstractC0911Ye.X(X5.P(new String[]{string, "https://api-pro.urban-vpn.com/rest/v1", "https://api-pro.falais.com/rest/v1"}))) {
            try {
                JSONObject jSONObjectM = m((C1951k70) interfaceC0412Ey.b(str), l2);
                SharedPreferences sharedPreferences2 = k;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putString("api_base", str).apply();
                    return jSONObjectM;
                }
                AbstractC1474fG.U("prefs");
                throw null;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof Yq0) {
                    List listK2 = AbstractC0937Ze.K(401, 404, 429);
                    int i2 = th.l;
                    if (listK2.contains(Integer.valueOf(i2))) {
                        continue;
                    } else if (i2 < 500) {
                        throw th;
                    }
                }
            }
        }
        if (th == null) {
            throw new IOException("Urban API no disponible");
        }
        throw th;
    }

    public static JSONObject m(C1951k70 c1951k70, Long l2) throws SocketTimeoutException {
        C1855j80 c1855j80M = AbstractC1468fA.m((OV) L.getValue(), c1951k70, l2);
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80M.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (!c1855j80M.p()) {
                int i2 = c1855j80M.f840o;
                throw new Yq0(i2, "Urban HTTP " + i2);
            }
            if (AbstractC1899jh0.O(strQ)) {
                throw new IOException("Respuesta Urban vacia");
            }
            JSONObject jSONObject = new JSONObject(strQ);
            AbstractC3409z9.g(c1855j80M, null);
            return jSONObject;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80M, th);
                throw th2;
            }
        }
    }

    public static String n(String str, String str2, Long l2) throws IOException {
        String strOptString = l(l2, new C2406or0(str, new JSONObject().put("type", "accs-proxy").put("clientApp", new JSONObject().put("name", "URBAN_VPN_BROWSER_EXTENSION")).put("signature", str2), 0)).optString("value");
        AbstractC1474fG.g(strOptString);
        if (!(!AbstractC1899jh0.O(strOptString))) {
            strOptString = null;
        }
        if (strOptString != null) {
            return strOptString;
        }
        throw new IOException("Urban no devolvio proxy_token");
    }

    public static boolean p() {
        Object objK;
        String str;
        Iterator it = Vb0.O(System.getProperty("http.proxyHost"), System.getProperty("https.proxyHost")).iterator();
        do {
            boolean z2 = false;
            if (!it.hasNext()) {
                try {
                    ProxySelector proxySelector = y;
                    List<Proxy> listSelect = proxySelector != null ? proxySelector.select(URI.create("https://example.com")) : null;
                    if (listSelect == null) {
                        listSelect = C1233cq.l;
                    }
                    if (!listSelect.isEmpty()) {
                        Iterator<T> it2 = listSelect.iterator();
                        while (it2.hasNext()) {
                            if (((Proxy) it2.next()).type() != Proxy.Type.DIRECT) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objK = Boolean.valueOf(z2);
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                Object obj = Boolean.TRUE;
                if (objK instanceof C2439p80) {
                    objK = obj;
                }
                return ((Boolean) objK).booleanValue();
            }
            str = (String) it.next();
        } while (!(!(str == null || AbstractC1899jh0.O(str))));
        return true;
    }

    public static boolean q() {
        C1041ar0 c1041ar0;
        return s && !s() && (c1041ar0 = r) != null && c1041ar0.f > System.currentTimeMillis() + 90000;
    }

    public static boolean s() {
        return m && f1083o;
    }

    public static boolean t(String str, String str2, String str3) {
        String str4 = str + " " + str2 + " " + str3;
        Locale locale = Locale.US;
        String strI = AbstractC1701hf0.i(locale, "US", str4, locale, "toLowerCase(...)");
        List listK = AbstractC0937Ze.K("baehost", "interbs", "sondatech", "latitude.sh", "latitude sh", "ipxon", "ran finkels", "datacenter", "data center", "hosting", "cloud server", "cloud hosting");
        if (listK.isEmpty()) {
            return false;
        }
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            if (AbstractC1119bh0.W(strI, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static C1041ar0 u(EnumC1139br0 enumC1139br0, String str) {
        Boolean bool = null;
        if (!m) {
            return null;
        }
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string = sharedPreferences.getString("proxy_host", null);
        String str2 = string == null ? "" : string;
        SharedPreferences sharedPreferences2 = k;
        if (sharedPreferences2 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        int i2 = sharedPreferences2.getInt("proxy_port", 0);
        SharedPreferences sharedPreferences3 = k;
        if (sharedPreferences3 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string2 = sharedPreferences3.getString("proxy_token", null);
        String str3 = string2 == null ? "" : string2;
        SharedPreferences sharedPreferences4 = k;
        if (sharedPreferences4 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string3 = sharedPreferences4.getString("proxy_password", null);
        String str4 = string3 == null ? "" : string3;
        SharedPreferences sharedPreferences5 = k;
        if (sharedPreferences5 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        long j2 = sharedPreferences5.getLong("proxy_expires_at", 0L);
        SharedPreferences sharedPreferences6 = k;
        if (sharedPreferences6 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string4 = sharedPreferences6.getString("proxy_country", "Automático");
        if (string4 == null) {
            string4 = "";
        }
        SharedPreferences sharedPreferences7 = k;
        if (sharedPreferences7 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string5 = sharedPreferences7.getString("proxy_selection", "AUTO");
        String str5 = string5 == null ? "" : string5;
        C3325yL c3325yL = EnumC1139br0.n;
        SharedPreferences sharedPreferences8 = k;
        if (sharedPreferences8 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string6 = sharedPreferences8.getString("proxy_provider", null);
        c3325yL.getClass();
        EnumC1139br0 enumC1139br0U = C3325yL.u(string6);
        if (AbstractC1899jh0.O(str2) || AbstractC1899jh0.O(str3) || AbstractC1899jh0.O(str4) || 1 > i2 || i2 >= 65536 || !BlindajeCrypto.a.j(j2, str5, str) || enumC1139br0U != enumC1139br0) {
            return null;
        }
        if (AbstractC1899jh0.O(string4)) {
            string4 = "Automático";
        }
        SharedPreferences sharedPreferences9 = k;
        if (sharedPreferences9 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string7 = sharedPreferences9.getString("proxy_exit_ip", null);
        String str6 = string7 == null ? "" : string7;
        SharedPreferences sharedPreferences10 = k;
        if (sharedPreferences10 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string8 = sharedPreferences10.getString("proxy_exit_country", null);
        String str7 = string8 == null ? "" : string8;
        SharedPreferences sharedPreferences11 = k;
        if (sharedPreferences11 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string9 = sharedPreferences11.getString("proxy_isp", null);
        String str8 = string9 == null ? "" : string9;
        SharedPreferences sharedPreferences12 = k;
        if (sharedPreferences12 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string10 = sharedPreferences12.getString("proxy_organization", null);
        String str9 = string10 != null ? string10 : "";
        SharedPreferences sharedPreferences13 = k;
        if (sharedPreferences13 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        int i3 = sharedPreferences13.getInt("proxy_hosting", -1);
        if (i3 == 0) {
            bool = Boolean.FALSE;
        } else if (i3 == 1) {
            bool = Boolean.TRUE;
        }
        return new C1041ar0(enumC1139br0U, str2, i2, str3, str4, j2, string4, str5, str6, str7, str8, str9, bool, null, C1672hI.a.e);
    }

    public static String v() {
        SharedPreferences sharedPreferences = k;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        String string = sharedPreferences.getString("security_token", null);
        SharedPreferences sharedPreferences2 = k;
        if (sharedPreferences2 == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        long j2 = sharedPreferences2.getLong("security_expires_at", 0L);
        if (string != null && (!AbstractC1899jh0.O(string)) && BlindajeCrypto.a.j(j2, "", null)) {
            return string;
        }
        return null;
    }

    public static String w(EnumC1139br0 enumC1139br0, String str) {
        String string = AbstractC1119bh0.E0(str).toString();
        Locale locale = Locale.US;
        AbstractC1474fG.i(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        if (AbstractC1474fG.b(upperCase, "UK")) {
            upperCase = "GB";
        }
        int iOrdinal = enumC1139br0.ordinal();
        if (iOrdinal == 0) {
            if (!c.contains(upperCase)) {
                upperCase = null;
            }
            if (upperCase == null) {
                return "AR";
            }
        } else {
            if (iOrdinal != 1) {
                throw new C0730Rf();
            }
            if (!AbstractC1474fG.b(upperCase, "AUTO") && !b.contains(upperCase)) {
                upperCase = null;
            }
            if (upperCase == null) {
                return "AUTO";
            }
        }
        return upperCase;
    }

    public static C1236cr0 y(String str, Long l2) throws JSONException, IOException {
        try {
            return new C1236cr0(str, G(str, l2));
        } catch (Yq0 e2) {
            if (e2.l != 401) {
                throw e2;
            }
            String strE = E(l2);
            return new C1236cr0(strE, G(strE, l2));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:68|127|69|131|70|71|72|73|113|74|75|123|76|(1:78)(1:79)) */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #3 {all -> 0x00b3, blocks: (B:104:0x021a, B:33:0x009a, B:35:0x009e, B:43:0x00b6, B:57:0x00df, B:58:0x00e1, B:59:0x0109, B:61:0x010f, B:62:0x0130, B:46:0x00c2, B:48:0x00c6, B:50:0x00ca), top: B:119:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[Catch: all -> 0x00b3, TryCatch #3 {all -> 0x00b3, blocks: (B:104:0x021a, B:33:0x009a, B:35:0x009e, B:43:0x00b6, B:57:0x00df, B:58:0x00e1, B:59:0x0109, B:61:0x010f, B:62:0x0130, B:46:0x00c2, B:48:0x00c6, B:50:0x00ca), top: B:119:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0 A[PHI: r5
  0x00b0: PHI (r5v19 o.VS) = (r5v6 o.VS), (r5v6 o.VS), (r5v20 o.VS) binds: [B:55:0x00dc, B:39:0x00ae, B:81:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[Catch: all -> 0x00b3, TryCatch #3 {all -> 0x00b3, blocks: (B:104:0x021a, B:33:0x009a, B:35:0x009e, B:43:0x00b6, B:57:0x00df, B:58:0x00e1, B:59:0x0109, B:61:0x010f, B:62:0x0130, B:46:0x00c2, B:48:0x00c6, B:50:0x00ca), top: B:119:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00df A[Catch: all -> 0x00b3, TryCatch #3 {all -> 0x00b3, blocks: (B:104:0x021a, B:33:0x009a, B:35:0x009e, B:43:0x00b6, B:57:0x00df, B:58:0x00e1, B:59:0x0109, B:61:0x010f, B:62:0x0130, B:46:0x00c2, B:48:0x00c6, B:50:0x00ca), top: B:119:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010f A[Catch: all -> 0x00b3, LOOP:0: B:59:0x0109->B:61:0x010f, LOOP_END, TryCatch #3 {all -> 0x00b3, blocks: (B:104:0x021a, B:33:0x009a, B:35:0x009e, B:43:0x00b6, B:57:0x00df, B:58:0x00e1, B:59:0x0109, B:61:0x010f, B:62:0x0130, B:46:0x00c2, B:48:0x00c6, B:50:0x00ca), top: B:119:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0146 A[Catch: all -> 0x020b, TryCatch #8 {all -> 0x020b, blocks: (B:64:0x0140, B:66:0x0146, B:68:0x015d), top: B:129:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015d A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #8 {all -> 0x020b, blocks: (B:64:0x0140, B:66:0x0146, B:68:0x015d), top: B:129:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f8 A[Catch: all -> 0x0201, TryCatch #1 {all -> 0x0201, blocks: (B:92:0x01f4, B:94:0x01f8, B:97:0x0204), top: B:115:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0204 A[Catch: all -> 0x0201, TRY_LEAVE, TryCatch #1 {all -> 0x0201, blocks: (B:92:0x01f4, B:94:0x01f8, B:97:0x0204), top: B:115:0x01f4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f4, code lost:
    
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
    
        r7 = r7;
        r8 = r18;
        r9 = r19;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01a6 -> B:117:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01d2 -> B:115:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01dd -> B:115:0x01f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r24, o.InterfaceC0473Hh r25) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3084vr0.h(boolean, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:26:0x009c, B:32:0x00ac, B:35:0x00c0, B:37:0x00c4, B:38:0x00cd, B:41:0x00d3, B:43:0x00db, B:46:0x00e5, B:48:0x00eb, B:52:0x00fb, B:61:0x0125, B:73:0x015d, B:77:0x0190, B:76:0x018c, B:64:0x012f, B:69:0x0138, B:70:0x0139, B:72:0x013d, B:80:0x0197, B:81:0x019a, B:56:0x0102, B:58:0x0106, B:60:0x010a, B:82:0x019b, B:83:0x019e, B:84:0x019f, B:45:0x00e1, B:85:0x01a0, B:86:0x01a3, B:30:0x00a6), top: B:95:0x009c, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object i(boolean z2, EnumC1139br0 enumC1139br0, String str, Long l2, boolean z3, InterfaceC0473Hh interfaceC0473Hh) {
        C2115lr0 c2115lr0;
        Long l3;
        boolean z4;
        String str2;
        boolean z5;
        EnumC1139br0 enumC1139br1;
        YS ys;
        boolean z6;
        boolean z7;
        Long l4;
        String str3;
        EnumC1139br0 enumC1139br2;
        C3084vr0 c3084vr0;
        C1041ar0 c1041ar0U;
        SharedPreferences sharedPreferences;
        String string;
        String strV;
        String str4;
        String str5;
        C1333dr0 c1333dr0O;
        String strN;
        if (interfaceC0473Hh instanceof C2115lr0) {
            c2115lr0 = (C2115lr0) interfaceC0473Hh;
            int i2 = c2115lr0.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2115lr0.t = i2 - Integer.MIN_VALUE;
            } else {
                c2115lr0 = new C2115lr0(this, interfaceC0473Hh);
            }
        } else {
            c2115lr0 = new C2115lr0(this, interfaceC0473Hh);
        }
        Object obj = c2115lr0.r;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2115lr0.t;
        if (i3 != 0) {
            if (i3 == 1) {
                z5 = c2115lr0.m;
                z4 = c2115lr0.l;
                l3 = c2115lr0.p;
                str2 = c2115lr0.f902o;
                enumC1139br1 = c2115lr0.n;
                Jp0.O(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = c2115lr0.m;
                z7 = c2115lr0.l;
                ys = c2115lr0.q;
                l4 = c2115lr0.p;
                str3 = c2115lr0.f902o;
                enumC1139br2 = c2115lr0.n;
                Jp0.O(obj);
            }
            c3084vr0 = a;
            if (!z7) {
                try {
                    c1041ar0U = u(enumC1139br2, str3);
                    if (c1041ar0U != null) {
                        if (!z6) {
                            try {
                                c1041ar0U = N(c1041ar0U, l4);
                            } catch (Throwable unused) {
                                e();
                                new Integer(Log.w("UrbanProxy", "Credenciales cacheadas no validas; renovando servidor"));
                                if (enumC1139br2 == EnumC1139br0.f706o) {
                                    c1041ar0U = c3084vr0.x(str3, l4, z6);
                                    B(c1041ar0U);
                                } else {
                                    sharedPreferences = k;
                                    if (sharedPreferences == null) {
                                        AbstractC1474fG.U("prefs");
                                        throw null;
                                    }
                                    string = sharedPreferences.getString("auth_token", null);
                                    if (string != null) {
                                        string = E(l4);
                                    } else {
                                        string = E(l4);
                                    }
                                    strV = v();
                                    if (strV == null) {
                                        C1236cr0 c1236cr0Y = y(string, l4);
                                        str4 = c1236cr0Y.a;
                                        str5 = c1236cr0Y.b;
                                    } else {
                                        str4 = string;
                                        str5 = strV;
                                    }
                                    try {
                                        c1333dr0O = c3084vr0.o(str5, str3, l4);
                                    } catch (Yq0 e2) {
                                        if (e2.l != 401) {
                                            throw e2;
                                        }
                                        SharedPreferences sharedPreferences2 = k;
                                        if (sharedPreferences2 == null) {
                                            AbstractC1474fG.U("prefs");
                                            throw null;
                                        }
                                        sharedPreferences2.edit().remove("security_token").remove("security_expires_at").apply();
                                        C1236cr0 c1236cr0Y2 = y(str4, l4);
                                        str4 = c1236cr0Y2.a;
                                        str5 = c1236cr0Y2.b;
                                        c1333dr0O = c3084vr0.o(str5, str3, l4);
                                    }
                                    try {
                                        strN = n(str5, c1333dr0O.c, l4);
                                    } catch (Yq0 e3) {
                                        int i4 = e3.l;
                                        if (i4 != 401 && i4 != 400) {
                                            throw e3;
                                        }
                                        SharedPreferences sharedPreferences3 = k;
                                        if (sharedPreferences3 == null) {
                                            AbstractC1474fG.U("prefs");
                                            throw null;
                                        }
                                        sharedPreferences3.edit().remove("security_token").remove("security_expires_at").apply();
                                        String str6 = y(str4, l4).b;
                                        c1333dr0O = c3084vr0.o(str6, str3, l4);
                                        strN = n(str6, c1333dr0O.c, l4);
                                    }
                                    c1041ar0U = new C1041ar0(EnumC1139br0.p, c1333dr0O.a, c1333dr0O.b, strN, "1", c1333dr0O.d, c1333dr0O.e, c1333dr0O.f, null, null, null, null, null, null, 16128);
                                    if (!z6) {
                                        c1041ar0U = N(c1041ar0U, l4);
                                    }
                                    B(c1041ar0U);
                                }
                            }
                        }
                    } else if (enumC1139br2 == EnumC1139br0.f706o) {
                        c1041ar0U = c3084vr0.x(str3, l4, z6);
                        B(c1041ar0U);
                    } else {
                        sharedPreferences = k;
                        if (sharedPreferences == null) {
                            AbstractC1474fG.U("prefs");
                            throw null;
                        }
                        string = sharedPreferences.getString("auth_token", null);
                        if (string != null || AbstractC1899jh0.O(string)) {
                            string = E(l4);
                        }
                        strV = v();
                        if (strV == null) {
                            C1236cr0 c1236cr0Y3 = y(string, l4);
                            str4 = c1236cr0Y3.a;
                            str5 = c1236cr0Y3.b;
                        } else {
                            str4 = string;
                            str5 = strV;
                        }
                        c1333dr0O = c3084vr0.o(str5, str3, l4);
                        strN = n(str5, c1333dr0O.c, l4);
                        c1041ar0U = new C1041ar0(EnumC1139br0.p, c1333dr0O.a, c1333dr0O.b, strN, "1", c1333dr0O.d, c1333dr0O.e, c1333dr0O.f, null, null, null, null, null, null, 16128);
                        if (!z6) {
                            c1041ar0U = N(c1041ar0U, l4);
                        }
                        B(c1041ar0U);
                    }
                } catch (Throwable th) {
                    ys.e(null);
                    throw th;
                }
            } else if (enumC1139br2 == EnumC1139br0.f706o) {
                c1041ar0U = c3084vr0.x(str3, l4, z6);
                B(c1041ar0U);
            } else {
                sharedPreferences = k;
                if (sharedPreferences == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                string = sharedPreferences.getString("auth_token", null);
                if (string != null) {
                    string = E(l4);
                } else {
                    string = E(l4);
                }
                strV = v();
                if (strV == null) {
                    C1236cr0 c1236cr0Y4 = y(string, l4);
                    str4 = c1236cr0Y4.a;
                    str5 = c1236cr0Y4.b;
                } else {
                    str4 = string;
                    str5 = strV;
                }
                c1333dr0O = c3084vr0.o(str5, str3, l4);
                strN = n(str5, c1333dr0O.c, l4);
                c1041ar0U = new C1041ar0(EnumC1139br0.p, c1333dr0O.a, c1333dr0O.b, strN, "1", c1333dr0O.d, c1333dr0O.e, c1333dr0O.f, null, null, null, null, null, null, 16128);
                if (!z6) {
                    c1041ar0U = N(c1041ar0U, l4);
                }
                B(c1041ar0U);
            }
            ys.e(null);
            return c1041ar0U;
        }
        Jp0.O(obj);
        c2115lr0.n = enumC1139br0;
        c2115lr0.f902o = str;
        l3 = l2;
        c2115lr0.p = l3;
        c2115lr0.l = z2;
        c2115lr0.m = z3;
        c2115lr0.t = 1;
        if (C(c2115lr0) == enumC1706hi) {
            return enumC1706hi;
        }
        z4 = z2;
        str2 = str;
        z5 = z3;
        enumC1139br1 = enumC1139br0;
        c2115lr0.n = enumC1139br1;
        c2115lr0.f902o = str2;
        c2115lr0.p = l3;
        YS ys2 = f;
        c2115lr0.q = ys2;
        c2115lr0.l = z4;
        c2115lr0.m = z5;
        c2115lr0.t = 2;
        if (ys2.d(null, c2115lr0) == enumC1706hi) {
            return enumC1706hi;
        }
        ys = ys2;
        z6 = z5;
        z7 = z4;
        l4 = l3;
        str3 = str2;
        enumC1139br2 = enumC1139br1;
        c3084vr0 = a;
        if (!z7) {
            c1041ar0U = u(enumC1139br2, str3);
            if (c1041ar0U != null) {
                if (!z6) {
                    c1041ar0U = N(c1041ar0U, l4);
                }
            } else if (enumC1139br2 == EnumC1139br0.f706o) {
                c1041ar0U = c3084vr0.x(str3, l4, z6);
                B(c1041ar0U);
            } else {
                sharedPreferences = k;
                if (sharedPreferences == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                string = sharedPreferences.getString("auth_token", null);
                if (string != null) {
                    string = E(l4);
                } else {
                    string = E(l4);
                }
                strV = v();
                if (strV == null) {
                    C1236cr0 c1236cr0Y5 = y(string, l4);
                    str4 = c1236cr0Y5.a;
                    str5 = c1236cr0Y5.b;
                } else {
                    str4 = string;
                    str5 = strV;
                }
                c1333dr0O = c3084vr0.o(str5, str3, l4);
                strN = n(str5, c1333dr0O.c, l4);
                c1041ar0U = new C1041ar0(EnumC1139br0.p, c1333dr0O.a, c1333dr0O.b, strN, "1", c1333dr0O.d, c1333dr0O.e, c1333dr0O.f, null, null, null, null, null, null, 16128);
                if (!z6) {
                    c1041ar0U = N(c1041ar0U, l4);
                }
                B(c1041ar0U);
            }
        } else if (enumC1139br2 == EnumC1139br0.f706o) {
            c1041ar0U = c3084vr0.x(str3, l4, z6);
            B(c1041ar0U);
        } else {
            sharedPreferences = k;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            string = sharedPreferences.getString("auth_token", null);
            if (string != null) {
                string = E(l4);
            } else {
                string = E(l4);
            }
            strV = v();
            if (strV == null) {
                C1236cr0 c1236cr0Y6 = y(string, l4);
                str4 = c1236cr0Y6.a;
                str5 = c1236cr0Y6.b;
            } else {
                str4 = string;
                str5 = strV;
            }
            c1333dr0O = c3084vr0.o(str5, str3, l4);
            strN = n(str5, c1333dr0O.c, l4);
            c1041ar0U = new C1041ar0(EnumC1139br0.p, c1333dr0O.a, c1333dr0O.b, strN, "1", c1333dr0O.d, c1333dr0O.e, c1333dr0O.f, null, null, null, null, null, null, 16128);
            if (!z6) {
                c1041ar0U = N(c1041ar0U, l4);
            }
            B(c1041ar0U);
        }
        ys.e(null);
        return c1041ar0U;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {all -> 0x0094, blocks: (B:67:0x00e7, B:64:0x00e0, B:66:0x00e4, B:70:0x00f1, B:35:0x007f, B:37:0x0083, B:56:0x00b1, B:57:0x00b3, B:45:0x0096, B:47:0x009a, B:49:0x009e, B:15:0x0030, B:62:0x00db, B:59:0x00c0), top: B:75:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:67:0x00e7, B:64:0x00e0, B:66:0x00e4, B:70:0x00f1, B:35:0x007f, B:37:0x0083, B:56:0x00b1, B:57:0x00b3, B:45:0x0096, B:47:0x009a, B:49:0x009e, B:15:0x0030, B:62:0x00db, B:59:0x00c0), top: B:75:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:67:0x00e7, B:64:0x00e0, B:66:0x00e4, B:70:0x00f1, B:35:0x007f, B:37:0x0083, B:56:0x00b1, B:57:0x00b3, B:45:0x0096, B:47:0x009a, B:49:0x009e, B:15:0x0030, B:62:0x00db, B:59:0x00c0), top: B:75:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:67:0x00e7, B:64:0x00e0, B:66:0x00e4, B:70:0x00f1, B:35:0x007f, B:37:0x0083, B:56:0x00b1, B:57:0x00b3, B:45:0x0096, B:47:0x009a, B:49:0x009e, B:15:0x0030, B:62:0x00db, B:59:0x00c0), top: B:75:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.vr0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object j(boolean z2, InterfaceC0473Hh interfaceC0473Hh) {
        C2212mr0 c2212mr0;
        ?? r12;
        ?? r13;
        YS ys;
        C1041ar0 c1041ar0;
        ?? r14;
        ?? r15;
        YS ys2;
        C1041ar0 c1041ar1;
        C1041ar0 c1041ar2;
        if (interfaceC0473Hh instanceof C2212mr0) {
            c2212mr0 = (C2212mr0) interfaceC0473Hh;
            int i2 = c2212mr0.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2212mr0.q = i2 - Integer.MIN_VALUE;
            } else {
                c2212mr0 = new C2212mr0(this, interfaceC0473Hh);
            }
        } else {
            c2212mr0 = new C2212mr0(this, interfaceC0473Hh);
        }
        C2212mr0 c2212mr1 = c2212mr0;
        Object objI = c2212mr1.f922o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2212mr1.q;
        boolean z3 = true;
        try {
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        boolean z4 = c2212mr1.l;
                        Jp0.O(objI);
                        r13 = z4;
                    } else {
                        if (i3 == 2) {
                            boolean z5 = c2212mr1.l;
                            ys = c2212mr1.n;
                            c1041ar0 = (C1041ar0) c2212mr1.m;
                            Jp0.O(objI);
                            r14 = z5;
                            r15 = r14;
                            ys2 = ys;
                            if (r15 == 0) {
                                c1041ar2 = u;
                                if (c1041ar2 != null) {
                                    if (BlindajeCrypto.a.j(c1041ar2.f, c1041ar2.h, "US")) {
                                        c1041ar2 = null;
                                    }
                                    if (c1041ar2 != null) {
                                        r12 = ys2;
                                    }
                                }
                                if (r15 != 0) {
                                    u = null;
                                }
                                long nanos = TimeUnit.MILLISECONDS.toNanos(24000L) + System.nanoTime();
                                ?? r1 = a;
                                EnumC1139br0 enumC1139br0 = EnumC1139br0.p;
                                Long l2 = new Long(nanos);
                                c2212mr1.m = ys2;
                                c2212mr1.n = null;
                                c2212mr1.q = 3;
                                objI = r1.i(r15, enumC1139br0, "US", l2, false, c2212mr1);
                                z2 = ys2;
                                if (objI == enumC1706hi) {
                                    return enumC1706hi;
                                }
                            } else {
                                if (u != c1041ar0 && (c1041ar1 = u) != null) {
                                    if (BlindajeCrypto.a.j(c1041ar1.f, c1041ar1.h, "US")) {
                                        c1041ar1 = null;
                                    }
                                    if (c1041ar1 != null) {
                                        r12 = ys2;
                                    }
                                }
                                if (r15 != 0) {
                                    u = null;
                                }
                                long nanos2 = TimeUnit.MILLISECONDS.toNanos(24000L) + System.nanoTime();
                                ?? r2 = a;
                                EnumC1139br0 enumC1139br1 = EnumC1139br0.p;
                                Long l3 = new Long(nanos2);
                                c2212mr1.m = ys2;
                                c2212mr1.n = null;
                                c2212mr1.q = 3;
                                objI = r2.i(r15, enumC1139br1, "US", l3, false, c2212mr1);
                                z2 = ys2;
                                if (objI == enumC1706hi) {
                                    return enumC1706hi;
                                }
                            }
                            Boolean boolValueOf = Boolean.valueOf(z3);
                            ((YS) r12).e(null);
                            return boolValueOf;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        VS vs = (VS) c2212mr1.m;
                        Jp0.O(objI);
                        z2 = vs;
                    }
                    u = (C1041ar0) objI;
                    r12 = z2;
                    Boolean boolValueOf2 = Boolean.valueOf(z3);
                    ((YS) r12).e(null);
                    return boolValueOf2;
                }
                Jp0.O(objI);
                if (!m) {
                    throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
                }
                c2212mr1.l = z2;
                c2212mr1.q = 1;
                if (C(c2212mr1) == enumC1706hi) {
                    r13 = z2;
                    return enumC1706hi;
                }
                r13 = z2;
                C1041ar0 c1041ar3 = u;
                ys = i;
                c2212mr1.m = c1041ar3;
                c2212mr1.n = ys;
                c2212mr1.l = r13;
                c2212mr1.q = 2;
                if (ys.d(null, c2212mr1) == enumC1706hi) {
                    return enumC1706hi;
                }
                c1041ar0 = c1041ar3;
                r14 = r13;
                r15 = r14;
                ys2 = ys;
                if (r15 == 0) {
                    c1041ar2 = u;
                    if (c1041ar2 != null) {
                        if (BlindajeCrypto.a.j(c1041ar2.f, c1041ar2.h, "US")) {
                            c1041ar2 = null;
                        }
                        if (c1041ar2 != null) {
                            r12 = ys2;
                        }
                    }
                    if (r15 != 0) {
                        u = null;
                    }
                    long nanos3 = TimeUnit.MILLISECONDS.toNanos(24000L) + System.nanoTime();
                    ?? r3 = a;
                    EnumC1139br0 enumC1139br2 = EnumC1139br0.p;
                    Long l4 = new Long(nanos3);
                    c2212mr1.m = ys2;
                    c2212mr1.n = null;
                    c2212mr1.q = 3;
                    objI = r3.i(r15, enumC1139br2, "US", l4, false, c2212mr1);
                    z2 = ys2;
                    if (objI == enumC1706hi) {
                        return enumC1706hi;
                    }
                    u = (C1041ar0) objI;
                    r12 = z2;
                } else {
                    if (u != c1041ar0) {
                        if (BlindajeCrypto.a.j(c1041ar1.f, c1041ar1.h, "US")) {
                            c1041ar1 = null;
                        }
                        if (c1041ar1 != null) {
                            r12 = ys2;
                        }
                    }
                    if (r15 != 0) {
                        u = null;
                    }
                    long nanos4 = TimeUnit.MILLISECONDS.toNanos(24000L) + System.nanoTime();
                    ?? r4 = a;
                    EnumC1139br0 enumC1139br3 = EnumC1139br0.p;
                    Long l5 = new Long(nanos4);
                    c2212mr1.m = ys2;
                    c2212mr1.n = null;
                    c2212mr1.q = 3;
                    objI = r4.i(r15, enumC1139br3, "US", l5, false, c2212mr1);
                    z2 = ys2;
                    if (objI == enumC1706hi) {
                        return enumC1706hi;
                    }
                    u = (C1041ar0) objI;
                    r12 = z2;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z3);
                ((YS) r12).e(null);
                return boolValueOf3;
            } catch (Throwable th) {
                if (th instanceof CancellationException) {
                    throw th;
                }
                u = null;
                z3 = false;
                r12 = z2;
            }
        } catch (Throwable th2) {
            ((YS) z2).e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0101 -> B:52:0x0104). Please report as a decompilation issue!!! */
    public final Object k(InterfaceC0473Hh interfaceC0473Hh) {
        C2309nr0 c2309nr0;
        C3084vr0 c3084vr0;
        Iterator it;
        C3084vr0 c3084vr1;
        Object objI;
        C3084vr0 c3084vr2;
        if (interfaceC0473Hh instanceof C2309nr0) {
            c2309nr0 = (C2309nr0) interfaceC0473Hh;
            int i2 = c2309nr0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2309nr0.p = i2 - Integer.MIN_VALUE;
            } else {
                c2309nr0 = new C2309nr0(this, interfaceC0473Hh);
            }
        } else {
            c2309nr0 = new C2309nr0(this, interfaceC0473Hh);
        }
        Object obj = c2309nr0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2309nr0.p;
        if (i3 != 0) {
            if (i3 == 1) {
                c3084vr0 = c2309nr0.l;
                Jp0.O(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c2309nr0.m;
                c3084vr2 = c2309nr0.l;
                try {
                    Jp0.O(obj);
                } catch (Throwable unused) {
                    c3084vr1 = c3084vr2;
                    while (it.hasNext()) {
                        C1101bX c1101bX = (C1101bX) it.next();
                        EnumC1139br0 enumC1139br0 = (EnumC1139br0) c1101bX.l;
                        String str = (String) c1101bX.m;
                        try {
                            c2309nr0.l = c3084vr1;
                            c2309nr0.m = it;
                            c2309nr0.p = 2;
                            objI = c3084vr1.i(false, enumC1139br0, str, null, false, c2309nr0);
                            if (objI == enumC1706hi) {
                                return enumC1706hi;
                            }
                            c3084vr2 = c3084vr1;
                            obj = objI;
                        } catch (Throwable unused2) {
                        }
                    }
                    return Boolean.FALSE;
                }
            }
            r = (C1041ar0) obj;
            s = true;
            return Boolean.TRUE;
        }
        Jp0.O(obj);
        if (!m) {
            throw new IllegalStateException("UrbanProxyManager.init debe ejecutarse primero".toString());
        }
        c2309nr0.l = this;
        c2309nr0.p = 1;
        if (C(c2309nr0) == enumC1706hi) {
            return enumC1706hi;
        }
        c3084vr0 = this;
        c3084vr0.getClass();
        if (s()) {
            return Boolean.TRUE;
        }
        C1041ar0 c1041ar0 = r;
        if (c1041ar0 != null) {
            BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
            if (!BlindajeCrypto.a.j(c1041ar0.f, c1041ar0.h, null) || !Lc0.T("PY", "AR").contains(c1041ar0.h)) {
                c1041ar0 = null;
            }
            if (c1041ar0 != null) {
                s = true;
                return Boolean.TRUE;
            }
        }
        List<C1101bX> listI = BlindajeCrypto.a.i(H().l, false);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listI, 10));
        for (C1101bX c1101bX2 : listI) {
            String str2 = (String) c1101bX2.l;
            String str3 = (String) c1101bX2.m;
            EnumC1139br0.n.getClass();
            arrayList.add(new C1101bX(C3325yL.u(str2), str3));
        }
        C3084vr0 c3084vr3 = c3084vr0;
        it = arrayList.iterator();
        c3084vr1 = c3084vr3;
        while (it.hasNext()) {
            C1101bX c1101bX3 = (C1101bX) it.next();
            EnumC1139br0 enumC1139br1 = (EnumC1139br0) c1101bX3.l;
            String str4 = (String) c1101bX3.m;
            c2309nr0.l = c3084vr1;
            c2309nr0.m = it;
            c2309nr0.p = 2;
            objI = c3084vr1.i(false, enumC1139br1, str4, null, false, c2309nr0);
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
            c3084vr2 = c3084vr1;
            obj = objI;
            r = (C1041ar0) obj;
            s = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final C1333dr0 o(String str, String str2, Long l2) throws IOException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (AbstractC1474fG.b(str2, "AUTO")) {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u("https://stats.urban-vpn.com/api/rest/v2/entrypoints/autoserver");
            M(c0560Kq);
            c0560Kq.j("Authorization", "Bearer " + str);
            c0560Kq.d();
            JSONObject jSONObjectOptJSONObject3 = m(c0560Kq.c(), l2).optJSONObject("server");
            if (jSONObjectOptJSONObject3 == null) {
                throw new IOException("Urban no devolvio un servidor");
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("country");
            String strOptString = (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("code")) == null) ? null : jSONObjectOptJSONObject2.optString("iso2");
            if (strOptString == null) {
                strOptString = "";
            }
            String strOptString2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("title") : null;
            C1333dr0 c1333dr0Z = z(jSONObjectOptJSONObject3, "AUTO", strOptString, strOptString2 != null ? strOptString2 : "");
            if (c1333dr0Z != null) {
                return c1333dr0Z;
            }
            throw new IOException("Urban no devolvio una direccion de proxy valida");
        }
        C0560Kq c0560Kq2 = new C0560Kq();
        c0560Kq2.u("https://stats.urban-vpn.com/api/rest/v2/entrypoints/countries");
        M(c0560Kq2);
        c0560Kq2.j("Pragma", "no-cache");
        c0560Kq2.j("Cache-Control", "no-cache");
        c0560Kq2.j("Authorization", "Bearer " + str);
        c0560Kq2.d();
        JSONObject jSONObjectOptJSONObject5 = m(c0560Kq2.c(), l2).optJSONObject("countries");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONArray("elements") : null;
        if (jSONArrayOptJSONArray == null) {
            throw new IOException("Urban no devolvio la lista de paises");
        }
        int length = jSONArrayOptJSONArray.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                jSONObjectOptJSONObject = null;
                break;
            }
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject.optJSONObject("code");
                String strOptString3 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optString("iso2") : null;
                if (strOptString3 == null) {
                    strOptString3 = "";
                }
                if (AbstractC1899jh0.N(strOptString3, str2, true)) {
                    break;
                }
            }
            i2++;
        }
        if (jSONObjectOptJSONObject == null) {
            throw new IOException("El pais seleccionado no esta disponible");
        }
        String strOptString4 = jSONObjectOptJSONObject.optString("title");
        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject.optJSONObject("servers");
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optJSONArray("elements") : null;
        if (jSONArrayOptJSONArray2 == null) {
            throw new IOException("Urban no devolvio servidores para el pais");
        }
        ArrayList arrayList = new ArrayList();
        int length2 = jSONArrayOptJSONArray2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i3);
            if (jSONObjectOptJSONObject8 != null) {
                String strOptString5 = jSONObjectOptJSONObject8.optString("accessType");
                AbstractC1474fG.g(strOptString5);
                if (!(!AbstractC1899jh0.O(strOptString5)) || AbstractC1899jh0.N(strOptString5, "ACCESSIBLE", true)) {
                    AbstractC1474fG.g(strOptString4);
                    C1333dr0 c1333dr0Z2 = z(jSONObjectOptJSONObject8, str2, str2, strOptString4);
                    if (c1333dr0Z2 != null) {
                        arrayList.add(c1333dr0Z2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new IOException("No hay servidores accesibles para el pais seleccionado");
        }
        return (C1333dr0) AbstractC0911Ye.o0(arrayList, AbstractC2045l50.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(long j2, InterfaceC0473Hh interfaceC0473Hh) {
        C2503pr0 c2503pr0;
        YS ys;
        if (interfaceC0473Hh instanceof C2503pr0) {
            c2503pr0 = (C2503pr0) interfaceC0473Hh;
            int i2 = c2503pr0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2503pr0.p = i2 - Integer.MIN_VALUE;
            } else {
                c2503pr0 = new C2503pr0(this, interfaceC0473Hh);
            }
        } else {
            c2503pr0 = new C2503pr0(this, interfaceC0473Hh);
        }
        Object obj = c2503pr0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2503pr0.p;
        boolean z2 = true;
        if (i3 == 0) {
            Jp0.O(obj);
            YS ys2 = h;
            c2503pr0.m = ys2;
            c2503pr0.l = j2;
            c2503pr0.p = 1;
            if (ys2.d(null, c2503pr0) == enumC1706hi) {
                return enumC1706hi;
            }
            ys = ys2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c2503pr0.l;
            ys = c2503pr0.m;
            Jp0.O(obj);
        }
        try {
            AtomicLong atomicLong = v;
            if (atomicLong.get() != j2) {
                z2 = false;
            } else {
                C1041ar0 c1041ar0 = t;
                if (c1041ar0 != null) {
                    x = c1041ar0.a;
                    if (n) {
                        e();
                    }
                }
                t = null;
                atomicLong.incrementAndGet();
            }
            return Boolean.valueOf(z2);
        } finally {
            ys.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0208  */
    /* JADX WARN: Code duplicated, block: B:10:0x005f  */
    public final C1041ar0 x(String str, Long l2, boolean z2) throws Throwable {
        String strR;
        Object objK;
        String str2;
        List<C3122wC> listC;
        char c2;
        C3316yC c3316yC = (C3316yC) l.getValue();
        c3316yC.getClass();
        AbstractC1474fG.j(str, "countryCode");
        String string = AbstractC1119bh0.E0(str).toString();
        Locale locale = Locale.US;
        AbstractC1474fG.i(locale, "US");
        String upperCase = string.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        SharedPreferences sharedPreferences = c3316yC.a;
        String string2 = sharedPreferences.getString("hola_uuid", null);
        if (string2 != null) {
            strR = string2.toLowerCase(locale);
            AbstractC1474fG.i(strR, "toLowerCase(...)");
            Pattern patternCompile = Pattern.compile("[0-9a-f]{32}");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            if (!patternCompile.matcher(strR).matches()) {
                strR = null;
            }
            if (strR == null) {
                String string3 = UUID.randomUUID().toString();
                AbstractC1474fG.i(string3, "toString(...)");
                strR = AbstractC1899jh0.R(string3, "-", "", false);
                if (!sharedPreferences.edit().putString("hola_uuid", strR).commit()) {
                    throw new IllegalStateException("No se pudo persistir la identidad Hola".toString());
                }
            }
        } else {
            String string4 = UUID.randomUUID().toString();
            AbstractC1474fG.i(string4, "toString(...)");
            strR = AbstractC1899jh0.R(string4, "-", "", false);
            if (!sharedPreferences.edit().putString("hola_uuid", strR).commit()) {
                throw new IllegalStateException("No se pudo persistir la identidad Hola".toString());
            }
        }
        String str3 = strR;
        boolean z3 = !z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string5 = sharedPreferences.getString("hola_ext_version", null);
        if (string5 == null || !(!AbstractC1899jh0.O(string5))) {
            string5 = null;
        }
        long j2 = sharedPreferences.getLong("hola_ext_checked_at", 0L);
        if (string5 == null || jCurrentTimeMillis - j2 >= 604800000) {
            if (z3) {
                try {
                    C0560Kq c0560Kq = new C0560Kq();
                    c0560Kq.u("https://hola.org/access/my/settings#/about");
                    c0560Kq.j("User-Agent", "ExoStreamPlayer/3.11.23 (Linux;Android 8.0.0) ExoPlayerLib/2.9.3");
                    c0560Kq.d();
                    String strX0 = AbstractC1119bh0.x0(c3316yC.b(c0560Kq.c(), l2), "window.pub_config.init({\"WWW version\":\"", "");
                    String strA0 = AbstractC1119bh0.A0(strX0, '\"', strX0);
                    Pattern patternCompile2 = Pattern.compile("[0-9.]{3,32}");
                    AbstractC1474fG.i(patternCompile2, "compile(...)");
                    boolean zMatches = patternCompile2.matcher(strA0).matches();
                    objK = strA0;
                    if (!zMatches) {
                        objK = null;
                    }
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                boolean z4 = objK instanceof C2439p80;
                Object obj = objK;
                if (z4) {
                    obj = null;
                }
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                string5 = str2;
            } else if (string5 == null) {
                string5 = "1.240.275";
            }
            sharedPreferences.edit().putString("hola_ext_version", string5).putLong("hola_ext_checked_at", jCurrentTimeMillis).apply();
        }
        String str4 = string5;
        String string6 = sharedPreferences.getString("hola_session_key", null);
        if (string6 == null || !(!AbstractC1899jh0.O(string6))) {
            string6 = null;
        }
        if (string6 == null) {
            string6 = c3316yC.d(str3, str4, l2);
        }
        try {
            listC = c3316yC.c(str3, string6, str4, upperCase, l2);
        } catch (Throwable th2) {
            try {
                listC = c3316yC.c(str3, c3316yC.d(str3, str4, l2), str4, upperCase, l2);
            } catch (Throwable th3) {
                AbstractC3409z9.a(th3, th2);
                throw th3;
            }
        }
        Throwable th4 = null;
        C1041ar0 c1041ar0 = null;
        for (C3122wC c3122wC : listC) {
            EnumC1139br0 enumC1139br0 = EnumC1139br0.f706o;
            String str5 = c3122wC.a;
            Locale locale2 = Locale.getDefault();
            AbstractC1474fG.i(locale2, "getDefault(...)");
            C1041ar0 c1041ar1 = new C1041ar0(enumC1139br0, str5, c3122wC.b, c3122wC.c, c3122wC.d, c3122wC.f, g(c3122wC.e, locale2), c3122wC.e, null, null, null, null, null, c3122wC.g, 7936);
            if (z2) {
                return c1041ar1;
            }
            try {
                C1041ar0 c1041ar0N = N(c1041ar1, l2);
                Boolean bool = c1041ar0N.m;
                Boolean bool2 = Boolean.FALSE;
                if (AbstractC1474fG.b(bool, bool2)) {
                    return c1041ar0N;
                }
                Boolean bool3 = c1041ar0 != null ? c1041ar0.m : null;
                char c3 = 2;
                if (AbstractC1474fG.b(bool3, bool2)) {
                    c2 = 0;
                } else if (bool3 == null) {
                    c2 = 1;
                } else {
                    if (!AbstractC1474fG.b(bool3, Boolean.TRUE)) {
                        throw new C0730Rf();
                    }
                    c2 = 2;
                }
                if (AbstractC1474fG.b(bool, bool2)) {
                    c3 = 0;
                } else if (bool == null) {
                    c3 = 1;
                } else if (!AbstractC1474fG.b(bool, Boolean.TRUE)) {
                    throw new C0730Rf();
                }
                if (c1041ar0 == null || c3 < c2) {
                    c1041ar0 = c1041ar0N;
                }
            } catch (Throwable th5) {
                th4 = th5;
            }
        }
        if (c1041ar0 != null) {
            return c1041ar0;
        }
        if (th4 == null) {
            throw new IOException("Hola no entregó un túnel peer utilizable");
        }
        throw th4;
    }

    public final C1333dr0 z(JSONObject jSONObject, String str, String str2, String str3) {
        String str4;
        String strG;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("address");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("primary") : null;
        if (jSONObjectOptJSONObject2 == null) {
            return null;
        }
        String strOptString = jSONObjectOptJSONObject2.optString("host");
        AbstractC1474fG.g(strOptString);
        String str5 = AbstractC1899jh0.O(strOptString) ^ true ? strOptString : null;
        if (str5 == null) {
            return null;
        }
        int iOptInt = jSONObjectOptJSONObject2.optInt("port");
        Integer numValueOf = Integer.valueOf(iOptInt);
        if (1 > iOptInt || iOptInt >= 65536) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        String strOptString2 = jSONObject.optString("signature");
        AbstractC1474fG.g(strOptString2);
        String str6 = AbstractC1899jh0.O(strOptString2) ^ true ? strOptString2 : null;
        if (str6 == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("signatureExpirationTime", 0L);
        Long lValueOf = Long.valueOf(jOptLong);
        if (jOptLong <= System.currentTimeMillis()) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis() + 1500000;
        String str7 = AbstractC1899jh0.O(str2) ^ true ? str2 : null;
        if (str7 == null) {
            String str8 = AbstractC1899jh0.O(str3) ^ true ? str3 : null;
            if (str8 == null) {
                strG = "Automático";
            } else {
                str4 = str8;
            }
            return new C1333dr0(str5, iIntValue, str6, jLongValue, str4, str);
        }
        Locale locale = Locale.getDefault();
        AbstractC1474fG.i(locale, "getDefault(...)");
        strG = g(str7, locale);
        str4 = strG;
        return new C1333dr0(str5, iIntValue, str6, jLongValue, str4, str);
    }
}
