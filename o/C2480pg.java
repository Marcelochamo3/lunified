package o;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: o.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2480pg implements InterfaceC1181cG {
    public static final C2480pg b = new C2480pg(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C2480pg(int i) {
        this.a = i;
    }

    private final C1855j80 b(D50 d50) {
        Long lD;
        C1855j80 c1855j80B = d50.b(d50.e);
        C2446pE c2446pE = c1855j80B.l.a;
        if (c2446pE.j && c1855j80B.p != null) {
            Object obj = AbstractC1889jc0.a;
            String str = c2446pE.d;
            AbstractC1474fG.j(str, "host");
            if ((AbstractC1899jh0.N(str, AbstractC1360e5.b, true) || AbstractC1899jh0.N(str, "updates.neoplay.es", true) || AbstractC1899jh0.N(str, "dns.google", true) || AbstractC1899jh0.N(str, "cloudflare-dns.com", true)) && (lD = AbstractC1889jc0.d(c1855j80B.f("Date", null))) != null) {
                long jLongValue = lD.longValue();
                if (1577836800000L <= jLongValue && jLongValue < 4102444800001L) {
                    AbstractC1889jc0.a(jLongValue);
                    Object obj2 = AbstractC1889jc0.a;
                    synchronized (obj2) {
                        obj2.notifyAll();
                    }
                }
            }
        }
        return c1855j80B;
    }

    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) throws IOException {
        switch (this.a) {
            case 0:
                A50 a50 = d50.a;
                a50.getClass();
                synchronized (a50) {
                    try {
                        if (!a50.z) {
                            throw new IllegalStateException("released".toString());
                        }
                        if (!(!a50.y)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (!(!a50.x)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C2792sr c2792sr = a50.t;
                AbstractC1474fG.g(c2792sr);
                OV ov = a50.l;
                AbstractC1474fG.j(ov, "client");
                try {
                    C2599qr c2599qr = new C2599qr(a50, a50.p, c2792sr, c2792sr.a(d50.f, d50.g, d50.h, ov.M, ov.q, !AbstractC1474fG.b(d50.e.b, "GET")).k(ov, d50));
                    a50.w = c2599qr;
                    a50.B = c2599qr;
                    synchronized (a50) {
                        a50.x = true;
                        a50.y = true;
                    }
                    if (a50.A) {
                        throw new IOException("Canceled");
                    }
                    return D50.a(d50, 0, c2599qr, null, 61).b(d50.e);
                } catch (IOException e) {
                    c2792sr.c(e);
                    throw new M80(e);
                } catch (M80 e2) {
                    c2792sr.c(e2.m);
                    throw e2;
                }
            case 1:
                C0560Kq c0560KqA = d50.e.a();
                c0560KqA.j("User-Agent", (String) AbstractC0911Ye.o0(AbstractC0937Ze.K("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0"), AbstractC2045l50.l));
                c0560KqA.j("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
                c0560KqA.j("Accept-Language", "en-US,en;q=0.5");
                return d50.b(c0560KqA.c());
            case 2:
                C0560Kq c0560KqA2 = d50.e.a();
                c0560KqA2.j("User-Agent", "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36");
                c0560KqA2.j("Accept-Language", "es-MX,es;q=0.9,en;q=0.7");
                return d50.b(c0560KqA2.c());
            case 3:
                C0560Kq c0560KqA3 = d50.e.a();
                c0560KqA3.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                c0560KqA3.j("Accept-Language", "es-ES,es;q=0.9,en;q=0.7");
                return d50.b(c0560KqA3.c());
            case 4:
                C1951k70 c1951k70 = d50.e;
                C2446pE c2446pE = c1951k70.a;
                if (!c2446pE.j || !AbstractC1474fG.b(c2446pE.d, "watch.fanatiz.com")) {
                    throw new IllegalArgumentException("Destino Fanatiz no permitido".toString());
                }
                C0560Kq c0560KqA4 = c1951k70.a();
                c0560KqA4.j("User-Agent", "Mozilla/5.0 (Linux; Android 12; TV) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                c0560KqA4.j("Accept", "application/json");
                c0560KqA4.j("Accept-Language", "es-419,es;q=0.9,en;q=0.7");
                c0560KqA4.j("Origin", "https://watch.fanatiz.com");
                c0560KqA4.j("Referer", "https://watch.fanatiz.com/");
                c0560KqA4.j("Cache-Control", "no-cache");
                c0560KqA4.j("Pragma", "no-cache");
                return d50.b(c0560KqA4.c());
            case 5:
                C0560Kq c0560KqA5 = d50.e.a();
                c0560KqA5.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                return d50.b(c0560KqA5.c());
            case 6:
                C0560Kq c0560KqA6 = d50.e.a();
                c0560KqA6.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                return d50.b(c0560KqA6.c());
            case 7:
                C0560Kq c0560KqA7 = d50.e.a();
                c0560KqA7.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                c0560KqA7.j("Accept-Language", "es-ES,es;q=0.9,en;q=0.7");
                return d50.b(c0560KqA7.c());
            case 8:
                C1951k70 c1951k71 = d50.e;
                String lowerCase = c1951k71.a.d.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (AbstractC1474fG.b(lowerCase, "watch.fanatiz.com") && AbstractC1474fG.b(c1951k71.a.b(), "/api/images")) {
                    C0560Kq c0560KqA8 = c1951k71.a();
                    c0560KqA8.j("User-Agent", "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36");
                    c0560KqA8.j("Referer", "https://watch.fanatiz.com/");
                    c0560KqA8.j("Accept", "image/avif,image/webp,image/apng,image/*,*/*;q=0.8");
                    return d50.b(c0560KqA8.c());
                }
                if (!AbstractC1899jh0.L(lowerCase, ".phncdn.com", false) && !AbstractC1474fG.b(lowerCase, "phncdn.com")) {
                    return d50.b(c1951k71);
                }
                C0560Kq c0560KqA9 = c1951k71.a();
                c0560KqA9.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/150.0.0.0 Safari/537.36");
                c0560KqA9.j("Referer", "https://es.pornhub.com/");
                c0560KqA9.j("Origin", "https://es.pornhub.com");
                c0560KqA9.j("Accept", "image/avif,image/webp,image/apng,image/*,*/*;q=0.8");
                return d50.b(c0560KqA9.c());
            case 9:
                C0560Kq c0560KqA10 = d50.e.a();
                c0560KqA10.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");
                return d50.b(c0560KqA10.c());
            case 10:
                C0560Kq c0560KqA11 = d50.e.a();
                c0560KqA11.a("User-Agent", "TemporaryUserAgent");
                return d50.b(c0560KqA11.c());
            case 11:
                C0560Kq c0560KqA12 = d50.e.a();
                c0560KqA12.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36");
                c0560KqA12.j("Accept", "text/html,application/xhtml+xml");
                c0560KqA12.j("Accept-Language", "es-ES,es;q=0.9");
                c0560KqA12.j("Referer", "https://pelisflix1.link/");
                return d50.b(c0560KqA12.c());
            case 12:
                C0560Kq c0560KqA13 = d50.e.a();
                c0560KqA13.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/115.0.0.0 Safari/537.36");
                return d50.b(c0560KqA13.c());
            case 13:
                C0560Kq c0560KqA14 = d50.e.a();
                c0560KqA14.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");
                return d50.b(c0560KqA14.c());
            case 14:
                C0560Kq c0560KqA15 = d50.e.a();
                c0560KqA15.j("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36");
                c0560KqA15.j("Accept-Language", "es-ES,es;q=0.9,en;q=0.7");
                return d50.b(c0560KqA15.c());
            case 15:
                C0560Kq c0560KqA16 = d50.e.a();
                c0560KqA16.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36");
                return d50.b(c0560KqA16.c());
            case 16:
                return b(d50);
            default:
                C0560Kq c0560KqA17 = d50.e.a();
                c0560KqA17.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");
                return d50.b(c0560KqA17.c());
        }
    }
}
