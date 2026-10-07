package o;

import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class E20 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f227o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E20(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f227o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((E20) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        E20 e20 = new E20(this.n, this.f227o, interfaceC0473Hh);
        e20.m = obj;
        return e20;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Object objK;
        String strA;
        String strB;
        C2446pE c2446pEB;
        C2446pE c2446pEB2;
        String str = this.n;
        Jp0.O(obj);
        try {
            String host = new URI(str).getHost();
            objK = host != null ? AbstractC1119bh0.l0(host, "www.") : null;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        String str2 = (String) objK;
        if (str2 != null) {
            Set set = F20.b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (!AbstractC1474fG.b(str2, str3)) {
                            if (AbstractC1899jh0.L(str2, "." + str3, false)) {
                            }
                        }
                        Rh0 rh0 = F20.a;
                        AbstractC1474fG.j(str, "<this>");
                        try {
                            C2349oE c2349oE = new C2349oE();
                            c2349oE.g(null, str);
                            c2446pEB = c2349oE.b();
                        } catch (IllegalArgumentException unused) {
                            c2446pEB = null;
                        }
                        if (c2446pEB == null) {
                            throw new IllegalArgumentException("Embed PPV inválido");
                        }
                        if (!c2446pEB.j) {
                            throw new IllegalArgumentException("El embed PPV no usa HTTPS".toString());
                        }
                        List list = c2446pEB.f;
                        int iIndexOf = list.indexOf("embed");
                        String strF0 = iIndexOf >= 0 ? AbstractC1119bh0.F0(AbstractC0911Ye.h0(AbstractC0911Ye.Y(iIndexOf + 1, list), "/", null, null, null, 62), '/') : "";
                        if (!(!AbstractC1899jh0.O(strF0))) {
                            throw new IllegalArgumentException("Embed PPV sin identificador".toString());
                        }
                        C2349oE c2349oEF = c2446pEB.f();
                        c2349oEF.d("/fetch");
                        c2349oEF.i = null;
                        c2349oEF.h = null;
                        C2446pE c2446pEB3 = c2349oEF.b();
                        C0560Kq c0560Kq = new C0560Kq();
                        c0560Kq.m = c2446pEB3;
                        BigInteger bigInteger = D20.a;
                        byte[] bytes = strF0.getBytes(AbstractC1305dd.a);
                        AbstractC1474fG.i(bytes, "getBytes(...)");
                        if (!(!(bytes.length == 0)) || bytes.length > 512) {
                            throw new IllegalArgumentException("Identificador PPV inválido".toString());
                        }
                        byte[] bArr = {10};
                        int length = bytes.length;
                        ArrayList arrayList = new ArrayList(5);
                        do {
                            int i = length & Yu0.b.k0;
                            length >>>= 7;
                            if (length != 0) {
                                i |= 128;
                            }
                            arrayList.add(Byte.valueOf((byte) i));
                        } while (length != 0);
                        byte[] bArrT = X5.T(X5.T(bArr, AbstractC0911Ye.u0(arrayList)), bytes);
                        Pattern pattern = TP.e;
                        TP tpO = AbstractC1474fG.o("application/octet-stream");
                        int length2 = bArrT.length;
                        Mr0.c(bArrT.length, 0, length2);
                        c0560Kq.m("POST", new C2243n70(length2, 0, tpO, bArrT));
                        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
                        c0560Kq.j("Referer", str);
                        byte[] bArr2 = new byte[32];
                        D20.c.nextBytes(bArr2);
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr2);
                        AbstractC1474fG.i(bArrDigest, "digest(...)");
                        c0560Kq.j("indians", X5.R(bArrDigest, X10.f611o));
                        c0560Kq.j("Accept", "*/*");
                        C1951k70 c1951k70C = c0560Kq.c();
                        long jNanoTime = System.nanoTime();
                        C1855j80 c1855j80G = ((OV) F20.a.getValue()).c(c1951k70C).g();
                        try {
                            if (!c1855j80G.p()) {
                                throw new Exception("El servidor PPV respondió HTTP " + c1855j80G.f840o);
                            }
                            String strF = c1855j80G.f("island", null);
                            if (strF == null) {
                                throw new Exception("La respuesta PPV no incluyó la clave del stream");
                            }
                            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                            if (abstractC2051l80 == null) {
                                throw new Exception("La respuesta PPV llegó vacía");
                            }
                            String strB2 = D20.b(strF, abstractC2051l80.f());
                            AbstractC3409z9.g(c1855j80G, null);
                            try {
                                C2349oE c2349oE2 = new C2349oE();
                                c2349oE2.g(null, strB2);
                                c2446pEB2 = c2349oE2.b();
                            } catch (IllegalArgumentException unused2) {
                                c2446pEB2 = null;
                            }
                            if (c2446pEB2 == null) {
                                throw new Exception("PPV devolvió una URL multimedia inválida");
                            }
                            if (!c2446pEB2.j || !AbstractC1119bh0.W(c2446pEB2.b(), ".m3u8", true)) {
                                throw new IllegalArgumentException("PPV no devolvió un HLS HTTPS".toString());
                            }
                            Map mapZ = AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"), new C1101bX("Referer", str), new C1101bX("Origin", c2446pEB.a + "://" + c2446pEB.d), new C1101bX("Accept", "*/*"));
                            C0560Kq c0560Kq2 = new C0560Kq();
                            c0560Kq2.u(c2446pEB2.i);
                            for (Map.Entry entry : mapZ.entrySet()) {
                                c0560Kq2.j((String) entry.getKey(), (String) entry.getValue());
                            }
                            C1855j80 c1855j80G2 = ((OV) F20.a.getValue()).c(c0560Kq2.c()).g();
                            try {
                                if (c1855j80G2.p()) {
                                    if (!AbstractC1899jh0.U(AbstractC1119bh0.H0(c1855j80G2.t(4096L).q()).toString(), "#EXTM3U", false)) {
                                        throw new Exception("PPV devolvió un manifiesto HLS inválido");
                                    }
                                    AbstractC3409z9.g(c1855j80G2, null);
                                    TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                                    return new Js0(c2446pEB2.i, mapZ, "hls", (String) null, (String) null, (byte[]) null, this.f227o, (String) null, (String) null, (List) null, false, 4024);
                                }
                                throw new Exception("El HLS PPV respondió HTTP " + c1855j80G2.f840o);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC3409z9.g(c1855j80G2, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                AbstractC3409z9.g(c1855j80G, th4);
                                throw th5;
                            }
                        }
                    }
                }
            }
        }
        if (AbstractC1119bh0.W(str, ".m3u8", true) || AbstractC1119bh0.W(str, ".mpd", true)) {
            Rh0 rh1 = F20.a;
            return new Js0(this.n, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"), new C1101bX("Referer", "https://ppv.st/")), AbstractC1119bh0.W(str, ".mpd", false) ? "dash" : "hls", (String) null, (String) null, (byte[]) null, this.f227o, (String) null, (String) null, (List) null, false, 4024);
        }
        try {
            String strA2 = F20.a(str, "https://ppv.st/");
            String strB3 = F20.b(strA2);
            if (strB3 != null) {
                return new Js0(strB3, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"), new C1101bX("Referer", str)), AbstractC1119bh0.W(strB3, ".mpd", false) ? "dash" : "hls", (String) null, (String) null, (byte[]) null, this.f227o, (String) null, (String) null, (List) null, false, 4024);
            }
            Pattern patternCompile = Pattern.compile("<iframe[^>]+src=[\"']([^\"']+)[\"']", C3325yL.p(2));
            AbstractC1474fG.i(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(strA2);
            AbstractC1474fG.i(matcher, "matcher(...)");
            JN jnA = AbstractC1370eA.a(matcher, 0, strA2);
            String strConcat = jnA != null ? (String) AbstractC0911Ye.e0(1, jnA.a()) : null;
            if (strConcat != null && strConcat.length() != 0) {
                if (!AbstractC1899jh0.U(strConcat, "http", false)) {
                    strConcat = "https:".concat(strConcat);
                }
                try {
                    String strB4 = F20.b(F20.a(strConcat, str));
                    if (strB4 != null) {
                        return new Js0(strB4, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"), new C1101bX("Referer", strConcat)), AbstractC1119bh0.W(strB4, ".mpd", false) ? "dash" : "hls", (String) null, (String) null, (byte[]) null, this.f227o, (String) null, (String) null, (List) null, false, 4024);
                    }
                } catch (Exception e) {
                    e.getMessage();
                    throw new Exception(AbstractC1701hf0.t("PpvExtractor: iframe anidado inaccesible: ", e.getMessage()));
                }
            }
            JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("(eval\\(function\\(p,a,c,k,e,[\\w,]*\\)[\\s\\S]*?)</script>", "compile(...)", strA2, "matcher(...)"), 0, strA2);
            String str4 = jnA2 != null ? (String) AbstractC0911Ye.e0(1, jnA2.a()) : null;
            if (str4 == null || str4.length() == 0 || (strA = new LH(str4).a()) == null || strA.length() == 0 || (strB = F20.b(strA)) == null) {
                throw new Exception("PpvExtractor: no se encontró stream por HTTP");
            }
            return new Js0(strB, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36"), new C1101bX("Referer", str)), AbstractC1119bh0.W(strB, ".mpd", false) ? "dash" : "hls", (String) null, (String) null, (byte[]) null, this.f227o, (String) null, (String) null, (List) null, false, 4024);
        } catch (Exception e2) {
            e2.getMessage();
            throw new Exception(AbstractC1701hf0.t("PpvExtractor: no se pudo cargar el embed: ", e2.getMessage()));
        }
    }
}
