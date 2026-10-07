package o;

import android.util.Base64;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.tV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2850tV extends AbstractC3473zs {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ int b;
    public final List c;
    public final OV d;

    public C2850tV(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = AbstractC2506pt.A("https://vimeos.net");
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
                TimeUnit timeUnit = TimeUnit.SECONDS;
                nvO.i(15L, timeUnit);
                nvO.e(15L, timeUnit);
                this.d = new OV(nvO);
                break;
            default:
                this.c = AbstractC0937Ze.K("https://nupupload.top/", "https://nupload.top", "https://ap.nupload.me/", "https://nupload.me/");
                C3084vr0 c3084vr1 = C3084vr0.a;
                NV nvO2 = AbstractC1701hf0.o();
                X9 x12 = Sr0.a;
                ArrayList arrayList3 = nvO2.c;
                arrayList3.add(x12);
                X9 x13 = Sr0.b;
                ArrayList arrayList4 = nvO2.d;
                arrayList4.add(x13);
                X9 x14 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList3, X10.q);
                AbstractC1406ef.S(arrayList4, X10.r);
                arrayList3.add(x14);
                arrayList4.add(x14);
                nvO2.h = true;
                nvO2.i = true;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                nvO2.e(30L, timeUnit2);
                nvO2.i(30L, timeUnit2);
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.b(nvO2);
                this.d = new OV(nvO2);
                break;
        }
    }

    public static String f(String str, String str2) {
        String string = AbstractC1119bh0.E0(str).toString();
        if (AbstractC1899jh0.U(string, "http://", false) || AbstractC1899jh0.U(string, "https://", false)) {
            return string;
        }
        if (AbstractC1899jh0.U(string, "//", false)) {
            return "https:".concat(string);
        }
        if (!AbstractC1899jh0.U(string, "/", false)) {
            return string;
        }
        URL url = new URL(str2);
        return url.getProtocol() + "://" + url.getHost() + string;
    }

    public static String g(String str) {
        C2446pE c2446pEB;
        String strH;
        Object objK;
        AbstractC1474fG.j(str, "<this>");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null || (strH = c2446pEB.h()) == null) {
            return null;
        }
        try {
            objK = URLDecoder.decode(strH, "UTF-8");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj = strH;
        if (!(objK instanceof C2439p80)) {
            obj = objK;
        }
        AbstractC1474fG.i(obj, "getOrDefault(...)");
        String string = AbstractC1119bh0.E0((String) obj).toString();
        if (AbstractC1899jh0.U(string, "http://", false) || AbstractC1899jh0.U(string, "https://", false)) {
            return string;
        }
        return null;
    }

    public static String h(String str, String str2) {
        C2446pE c2446pEB;
        String lowerCase;
        String str3;
        String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.l0(AbstractC1119bh0.E0(str).toString(), "src="), '\"', '\'');
        if (AbstractC1899jh0.O(strF0)) {
            return null;
        }
        String strG = g(strF0);
        if (strG != null) {
            return strG;
        }
        String strF = f(strF0, str2);
        if (AbstractC1899jh0.U(strF, "http", false) && !AbstractC1474fG.b(strF, str2)) {
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, strF);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
                c2446pEB = null;
            }
            if (c2446pEB == null || (str3 = c2446pEB.d) == null) {
                lowerCase = null;
            } else {
                lowerCase = str3.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            if (!AbstractC1119bh0.W(lowerCase, "nupload.top", false) && !AbstractC1119bh0.W(lowerCase, "nupload.me", false) && !AbstractC1119bh0.W(lowerCase, "nupupload.top", false)) {
                return strF;
            }
        }
        return null;
    }

    public static String i(String str) {
        Object objK;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC1474fG.i(bArrDecode, "decode(...)");
            objK = new String(bArrDecode, AbstractC1305dd.a);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        return (String) objK;
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        switch (this.b) {
            case 0:
                return AbstractC1376eG.J(AbstractC1910jn.b, new C2753sV(this, str, null), interfaceC0473Hh);
            default:
                System.out.getClass();
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u(str);
                c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                c0560Kq.j("Referer", "https://vimeos.net/");
                C1855j80 c1855j80G = this.d.c(c0560Kq.c()).g();
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                if (abstractC2051l80 == null) {
                    throw new Exception("Failed to fetch Vimeos HTML");
                }
                String strQ = abstractC2051l80.q();
                URI uri = new URI(c1855j80G.l.a.i);
                String strE = AbstractC1701hf0.e(uri.getScheme(), "://", uri.getHost());
                Pattern patternCompile = Pattern.compile("eval\\(function\\(p,a,c,k,e,d\\).*?\\.split\\('\\|'\\)\\)\\)", C3325yL.p(32));
                AbstractC1474fG.i(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strQ);
                AbstractC1474fG.i(matcher, "matcher(...)");
                JN jnA = AbstractC1370eA.a(matcher, 0, strQ);
                if (jnA == null) {
                    throw new Exception("No se encontró el bloque JS (P.A.C.K.E.R) en el HTML");
                }
                String strA = new LH(jnA.c()).a();
                if (strA == null) {
                    throw new Exception("No se pudo desempaquetar el JavaScript");
                }
                List listQ = Vb0.Q(Vb0.M(I60.c(new I60("https?://[a-zA-Z0-9.-]+\\.[a-z]{2,}/hls2/[^\"'\\s]+"), strA), Iu0.n));
                if (listQ.isEmpty()) {
                    listQ = Vb0.Q(Vb0.M(I60.c(new I60("https?://[a-zA-Z0-9.-]+\\.[a-z]{2,}(?::\\d+)?/[^\"'\\s]+\\.m3u8(?:\\?[^\"'\\s]+)?"), strA), X10.Q));
                }
                if (listQ.isEmpty()) {
                    throw new Exception("Video URL no encontrada en el JS desofuscado");
                }
                return new Js0(AbstractC1899jh0.R((String) AbstractC0911Ye.b0(listQ), "\\/", "/", false), AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36"), new C1101bX("Referer", AbstractC1701hf0.d(strE, "/")), new C1101bX("Origin", strE), new C1101bX("Accept", "*/*"), new C1101bX("Connection", "keep-alive")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
        }
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        switch (this.b) {
            case 0:
                return "https://nupload.top/";
            default:
                return "https://vimeos.net";
        }
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        switch (this.b) {
            case 0:
                return "Nuupload";
            default:
                return "Vimeos";
        }
    }
}
