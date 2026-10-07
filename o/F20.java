package o;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class F20 {
    public static final Rh0 a = new Rh0(C2428p3.O);
    public static final Set b = Lc0.T("embedindia.st", "embedindia.com");
    public static final List c = AbstractC0937Ze.K(new I60("[\"']?(https?://[^\"'\\s]+\\.m3u8[^\"'\\s]*)[\"']?"), new I60("file\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("source\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("src\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("hls\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("url\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("stream\\s*:\\s*[\"'](https?://[^\"']+\\.m3u8[^\"']*)[\"']"), new I60("[\"']?(https?://[^\"'\\s]+\\.mpd[^\"'\\s]*)[\"']?"));

    public static final String a(String str, String str2) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        c0560Kq.j("Referer", str2);
        c0560Kq.j("Origin", "https://ppv.st");
        c0560Kq.j("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        c0560Kq.j("Accept-Language", "es-AR,es;q=0.9,en;q=0.8");
        C1855j80 c1855j80G = ((OV) a.getValue()).c(c0560Kq.c()).g();
        C1951k70 c1951k70 = c1855j80G.l;
        try {
            String str3 = c1951k70.a.d;
            if (c1855j80G.p()) {
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                if (abstractC2051l80 == null) {
                    throw new Exception("Respuesta vacía de ".concat(str));
                }
                String strQ = abstractC2051l80.q();
                AbstractC3409z9.g(c1855j80G, null);
                return strQ;
            }
            throw new Exception("HTTP " + c1855j80G.f840o + " desde " + c1951k70.a.d);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static final String b(String str) {
        String str2;
        Iterator it = c.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            JN jnB = ((I60) it.next()).b(str, 0);
            str2 = jnB != null ? (String) AbstractC0911Ye.e0(1, jnB.a()) : null;
            if (str2 != null && str2.length() != 0) {
                break;
            }
        }
        return str2;
    }
}
