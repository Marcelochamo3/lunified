package o;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Lg0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Mg0 f386o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lg0(String str, String str2, Mg0 mg0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = str2;
        this.f386o = mg0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Lg0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Lg0(this.m, this.n, this.f386o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x018a A[Catch: Exception -> 0x0236, TryCatch #6 {Exception -> 0x0236, blocks: (B:3:0x000f, B:5:0x0089, B:8:0x009f, B:9:0x00a2, B:19:0x00c5, B:24:0x00ce, B:27:0x00d6, B:29:0x00e1, B:31:0x00ea, B:33:0x00f0, B:34:0x00f5, B:39:0x011a, B:49:0x014b, B:51:0x0150, B:54:0x0157, B:56:0x015d, B:61:0x0166, B:62:0x0169, B:63:0x016a, B:65:0x018a, B:68:0x019b, B:71:0x01a3, B:78:0x01db, B:89:0x0206, B:91:0x020f, B:93:0x0216, B:98:0x0222, B:99:0x0225, B:74:0x01b2, B:77:0x01c1, B:37:0x0100, B:103:0x0229, B:104:0x022c, B:110:0x0232, B:111:0x0235, B:107:0x022f, B:95:0x021f, B:10:0x00b1, B:12:0x00b7, B:14:0x00bb, B:58:0x0163, B:100:0x0226, B:40:0x0137, B:43:0x013f, B:45:0x0143, B:4:0x0083, B:79:0x01f5, B:81:0x01f9), top: B:126:0x000f, inners: #0, #1, #2, #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2 A[Catch: Exception -> 0x0236, TryCatch #6 {Exception -> 0x0236, blocks: (B:3:0x000f, B:5:0x0089, B:8:0x009f, B:9:0x00a2, B:19:0x00c5, B:24:0x00ce, B:27:0x00d6, B:29:0x00e1, B:31:0x00ea, B:33:0x00f0, B:34:0x00f5, B:39:0x011a, B:49:0x014b, B:51:0x0150, B:54:0x0157, B:56:0x015d, B:61:0x0166, B:62:0x0169, B:63:0x016a, B:65:0x018a, B:68:0x019b, B:71:0x01a3, B:78:0x01db, B:89:0x0206, B:91:0x020f, B:93:0x0216, B:98:0x0222, B:99:0x0225, B:74:0x01b2, B:77:0x01c1, B:37:0x0100, B:103:0x0229, B:104:0x022c, B:110:0x0232, B:111:0x0235, B:107:0x022f, B:95:0x021f, B:10:0x00b1, B:12:0x00b7, B:14:0x00bb, B:58:0x0163, B:100:0x0226, B:40:0x0137, B:43:0x013f, B:45:0x0143, B:4:0x0083, B:79:0x01f5, B:81:0x01f9), top: B:126:0x000f, inners: #0, #1, #2, #3, #4, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f9 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #8 {all -> 0x01fe, blocks: (B:79:0x01f5, B:81:0x01f9), top: B:129:0x01f5, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205  */
    @Override // o.R7
    public final Object r(Object obj) {
        String strConcat;
        JN jnA;
        String str;
        URL url;
        C1855j80 c1855j80G;
        AbstractC2051l80 abstractC2051l80;
        String strQ;
        String strF;
        AbstractC2051l80 abstractC2051l81;
        AbstractC2051l80 abstractC2051l82;
        String str2 = this.n;
        String str3 = this.m;
        Jp0.O(obj);
        try {
            Rh0 rh0 = AbstractC2011ko0.a;
            C3084vr0 c3084vr0 = C3084vr0.a;
            NV nv = new NV();
            C3084vr0.c(nv);
            nv.c.add(Sr0.a);
            nv.d.add(Sr0.b);
            X9 x9 = AbstractC1370eA.m;
            AbstractC1406ef.S(nv.c, X10.q);
            AbstractC1406ef.S(nv.d, X10.r);
            nv.c.add(x9);
            nv.d.add(x9);
            nv.j(AbstractC2011ko0.a().b, AbstractC2011ko0.a().a);
            nv.h = true;
            nv.i = true;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            nv.e(5L, timeUnit);
            nv.i(5L, timeUnit);
            OV ov = new OV(nv);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str3);
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
            c0560Kq.m("HEAD", null);
            C1855j80 c1855j80G2 = ov.c(c0560Kq.c()).g();
            try {
                String str4 = c1855j80G2.l.a.i;
                AbstractC3409z9.g(c1855j80G2, null);
                C0560Kq c0560Kq2 = new C0560Kq();
                c0560Kq2.u(str4);
                c0560Kq2.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                if (!AbstractC1474fG.b(str4, str3)) {
                    c0560Kq2.j("Referer", str3);
                }
                c0560Kq2.d();
                C1855j80 c1855j80G3 = ov.c(c0560Kq2.c()).g();
                try {
                    String strQ2 = (!c1855j80G3.p() || (abstractC2051l82 = c1855j80G3.r) == null) ? null : abstractC2051l82.q();
                    AbstractC3409z9.g(c1855j80G3, null);
                    if (strQ2 == null) {
                        strQ2 = "";
                    }
                    boolean zW = AbstractC1119bh0.W(str4, str2, false);
                    Mg0 mg0 = this.f386o;
                    if (!zW) {
                        String str5 = Mg0.c;
                        mg0.getClass();
                        if (Mg0.j(strQ2)) {
                            mg0.g(str4);
                            System.out.getClass();
                            return str4;
                        }
                    }
                    if (!AbstractC1119bh0.W(str4, str2, false)) {
                        System.out.getClass();
                    }
                    String str6 = Mg0.c;
                    mg0.getClass();
                    String str7 = Mg0.c;
                    if (str7 == null) {
                        strConcat = null;
                    } else {
                        String path = new URL(str3).getPath();
                        AbstractC1474fG.i(path, "getPath(...)");
                        strConcat = str7.concat(AbstractC1119bh0.y0(path, '/', path));
                    }
                    if (strConcat != null) {
                        C0560Kq c0560Kq3 = new C0560Kq();
                        c0560Kq3.u(strConcat);
                        c0560Kq3.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                        c0560Kq3.j("Referer", str3);
                        c0560Kq3.d();
                        C1855j80 c1855j80G4 = ov.c(c0560Kq3.c()).g();
                        try {
                            String strQ3 = (c1855j80G4.p() && (abstractC2051l81 = c1855j80G4.r) != null) ? abstractC2051l81.q() : null;
                            AbstractC3409z9.g(c1855j80G4, null);
                            if (strQ3 != null && strQ3.length() != 0 && Mg0.j(strQ3)) {
                                System.out.getClass();
                                return strConcat;
                            }
                            Pattern patternCompile = Pattern.compile("<script[^>]+src=[\"']([^\"']*main\\.js[^\"']*)[\"']", C3325yL.p(2));
                            AbstractC1474fG.i(patternCompile, "compile(...)");
                            Matcher matcher = patternCompile.matcher(strQ2);
                            AbstractC1474fG.i(matcher, "matcher(...)");
                            jnA = AbstractC1370eA.a(matcher, 0, strQ2);
                            if (jnA != null) {
                                str = (String) ((HN) jnA.a()).get(1);
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                url = new URL(str4);
                                if (AbstractC1899jh0.U(str, "http", false)) {
                                    str = url.getProtocol() + "://" + url.getHost() + (AbstractC1899jh0.U(str, "/", false) ? "" : "/") + str;
                                }
                                C0560Kq c0560Kq4 = new C0560Kq();
                                c0560Kq4.u(str);
                                c0560Kq4.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                                c0560Kq4.d();
                                c1855j80G = ov.c(c0560Kq4.c()).g();
                                try {
                                    abstractC2051l80 = c1855j80G.r;
                                    if (abstractC2051l80 != null) {
                                        strQ = abstractC2051l80.q();
                                    } else {
                                        strQ = null;
                                    }
                                    String str8 = strQ != null ? strQ : "";
                                    AbstractC3409z9.g(c1855j80G, null);
                                    strF = Mg0.f(mg0, ov, str8, str3);
                                    if (strF != null && !AbstractC1119bh0.W(strF, str2, false)) {
                                        mg0.g(strF);
                                        System.out.getClass();
                                        return strF;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        AbstractC3409z9.g(c1855j80G, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC3409z9.g(c1855j80G4, th3);
                                throw th4;
                            }
                        }
                    } else {
                        Pattern patternCompile2 = Pattern.compile("<script[^>]+src=[\"']([^\"']*main\\.js[^\"']*)[\"']", C3325yL.p(2));
                        AbstractC1474fG.i(patternCompile2, "compile(...)");
                        Matcher matcher2 = patternCompile2.matcher(strQ2);
                        AbstractC1474fG.i(matcher2, "matcher(...)");
                        jnA = AbstractC1370eA.a(matcher2, 0, strQ2);
                        if (jnA != null) {
                            str = (String) ((HN) jnA.a()).get(1);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            url = new URL(str4);
                            if (AbstractC1899jh0.U(str, "http", false)) {
                                if (AbstractC1899jh0.U(str, "/", false)) {
                                }
                                str = url.getProtocol() + "://" + url.getHost() + (AbstractC1899jh0.U(str, "/", false) ? "" : "/") + str;
                            }
                            C0560Kq c0560Kq5 = new C0560Kq();
                            c0560Kq5.u(str);
                            c0560Kq5.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                            c0560Kq5.d();
                            c1855j80G = ov.c(c0560Kq5.c()).g();
                            abstractC2051l80 = c1855j80G.r;
                            if (abstractC2051l80 != null) {
                                strQ = abstractC2051l80.q();
                            } else {
                                strQ = null;
                            }
                            if (strQ != null) {
                            }
                            AbstractC3409z9.g(c1855j80G, null);
                            strF = Mg0.f(mg0, ov, str8, str3);
                            if (strF != null) {
                                mg0.g(strF);
                                System.out.getClass();
                                return strF;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC3409z9.g(c1855j80G3, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    AbstractC3409z9.g(c1855j80G2, th7);
                    throw th8;
                }
            }
        } catch (Exception unused) {
            System.out.getClass();
        }
        return str3;
    }
}
