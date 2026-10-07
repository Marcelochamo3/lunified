package o;

import android.util.Base64;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3068vj0 {
    public static C2390oj0 c;
    public static long d;
    public static final OV g;
    public static final String a = AbstractC3238xV.a("kBuKR8y3X9AltGrnQC+HsEksCs4XZ5hJkLRW3eodeJxN81fvRUGzQyxya1gsqZyF");
    public static final I60 b = new I60("(?i)(?:cenc:)?default_KID\\s*=\\s*[\"'](?:urn:uuid:)?([0-9a-f-]{32,36})[\"']");
    public static final LinkedHashMap e = new LinkedHashMap();
    public static final LinkedHashMap f = new LinkedHashMap();

    static {
        NV nvH = AbstractC1370eA.h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(20L, timeUnit);
        nvH.i(30L, timeUnit);
        g = new OV(nvH);
    }

    public static final String a(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC1474fG.i(strNormalize, "normalize(...)");
        Pattern patternCompile = Pattern.compile("\\p{M}+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        Pattern patternCompile2 = Pattern.compile("\\b(en vivo|live|directo)\\b");
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(lowerCase).replaceAll("");
        AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
        Pattern patternCompile3 = Pattern.compile("[^a-z0-9]+");
        AbstractC1474fG.i(patternCompile3, "compile(...)");
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(" ");
        AbstractC1474fG.i(strReplaceAll3, "replaceAll(...)");
        return AbstractC1119bh0.E0(strReplaceAll3).toString();
    }

    public static final C2293nj0 b(String str, OV ov) {
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str);
            c0560Kq.j("Accept", "application/dash+xml, application/vnd.apple.mpegurl, */*");
            c0560Kq.j("User-Agent", (String) AbstractC3327yN.w("User-Agent", e("", "")));
            C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
            try {
                int i = c1855j80G.f840o;
                C1855j80 c1855j80 = c1855j80G.p() ? c1855j80G : null;
                C2293nj0 c2293nj0 = new C2293nj0(i, c1855j80 != null ? c1855j80.t(524288L).q() : null);
                AbstractC3409z9.g(c1855j80G, null);
                return c2293nj0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return new C2293nj0(-1, null);
        }
    }

    public static final Js0 c(Js0 js0, String str, C2196mj0 c2196mj0) {
        Object next;
        if (str == null || AbstractC1899jh0.O(str) || AbstractC1899jh0.N(js0.n, "hls", true)) {
            return js0;
        }
        String str2 = js0.l;
        if (AbstractC1899jh0.L(AbstractC1119bh0.A0(str2, '?', str2), ".m3u8", true)) {
            return js0;
        }
        List listQ = Vb0.Q(new C2591qn(new C1732hv(Vb0.M(I60.c(b, str), X10.F), true, X10.G), X10.v, 0));
        Map map = c2196mj0.w;
        Iterator it = listQ.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!map.containsKey((String) next));
        String str3 = (String) next;
        if (str3 == null) {
            return js0;
        }
        String str4 = (String) AbstractC3327yN.w(str3, c2196mj0.w);
        String strD = d(str3);
        byte[] bytes = ("{\"keys\":[{\"kty\":\"oct\",\"k\":\"" + d(str4) + "\",\"kid\":\"" + strD + "\"}],\"type\":\"temporary\"}").getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        return Js0.a(js0, "dash", "clearkey", bytes, null, str3, null, false, 3795);
    }

    public static String d(String str) {
        ArrayList<String> arrayListV = AbstractC1119bh0.V(str);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListV, 10));
        for (String str2 : arrayListV) {
            AbstractC3021v9.e(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        String strEncodeToString = Base64.encodeToString(AbstractC0911Ye.u0(arrayList), 11);
        AbstractC1474fG.i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static Map e(String str, String str2) {
        return AbstractC3327yN.z(new C1101bX("Authorization", AbstractC1701hf0.t("Bearer ", str)), new C1101bX("country", "PY"), new C1101bX("space", "PY"), new C1101bX("logm", "auth0"), new C1101bX("user_uuid", str2), new C1101bX("Origin", "https://www.tigosports.com.py"), new C1101bX("Referer", "https://www.tigosports.com.py/"), new C1101bX("Accept", "application/json, text/plain, */*"), new C1101bX("Accept-Language", "es-PY,es;q=0.9"), new C1101bX("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"));
    }
}
