package o;

import android.net.Uri;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class Mg0 extends AbstractC3473zs {
    public static volatile String c;
    public String b = "";

    public static final String f(Mg0 mg0, OV ov, String str, String str2) {
        String strConcat;
        AbstractC2051l80 abstractC2051l80;
        mg0.getClass();
        Pattern patternCompile = Pattern.compile("https?://[A-Za-z0-9.-]+/e/");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strR = AbstractC1899jh0.R(str, "\\/", "/", false);
        Matcher matcher = patternCompile.matcher(strR);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, strR);
        String str3 = null;
        String strM0 = jnA != null ? AbstractC1119bh0.m0(jnA.c(), "/") : null;
        if (strM0 != null) {
            String path = new URL(str2).getPath();
            AbstractC1474fG.i(path, "getPath(...)");
            return AbstractC1701hf0.e(strM0, "/", AbstractC1119bh0.y0(path, '/', path));
        }
        String path2 = new URL(str2).getPath();
        AbstractC1474fG.i(path2, "getPath(...)");
        String strY0 = AbstractC1119bh0.y0(path2, '/', path2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        String str4 = c;
        if (str4 == null) {
            strConcat = null;
        } else {
            String path3 = new URL(str2).getPath();
            AbstractC1474fG.i(path3, "getPath(...)");
            strConcat = str4.concat(AbstractC1119bh0.y0(path3, '/', path3));
        }
        if (strConcat != null) {
            linkedHashSet.add(strConcat);
        }
        linkedHashSet.add("https://hanerix.com/e/".concat(strY0));
        linkedHashSet.add("https://audinifer.com/e/".concat(strY0));
        linkedHashSet.add("https://vibuxer.com/e/".concat(strY0));
        linkedHashSet.add("https://hgplaycdn.com/e/".concat(strY0));
        linkedHashSet.add("https://hglamioz.com/e/".concat(strY0));
        linkedHashSet.add("https://playnixes.com/e/".concat(strY0));
        linkedHashSet.add("https://medixiru.com/e/".concat(strY0));
        linkedHashSet.add("https://dinisglows.com/e/".concat(strY0));
        linkedHashSet.add("https://callistanise.com/e/".concat(strY0));
        linkedHashSet.add("https://callistanise.com/v/".concat(strY0));
        linkedHashSet.add("https://niramirus.com/e/".concat(strY0));
        for (String str5 : linkedHashSet) {
            try {
                C0560Kq c0560Kq = new C0560Kq();
                AbstractC1474fG.g(str5);
                c0560Kq.u(str5);
                c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                c0560Kq.j("Referer", str2);
                c0560Kq.d();
                C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
                try {
                    String strQ = (c1855j80G.p() && (abstractC2051l80 = c1855j80G.r) != null) ? abstractC2051l80.q() : null;
                    AbstractC3409z9.g(c1855j80G, null);
                    if (strQ != null && j(strQ)) {
                        mg0.g(str5);
                        str3 = str5;
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3409z9.g(c1855j80G, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static Object h(Mg0 mg0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        Jg0 jg0;
        Mg0 mg1;
        String str2;
        String str3;
        if (interfaceC0473Hh instanceof Jg0) {
            jg0 = (Jg0) interfaceC0473Hh;
            int i = jg0.f348o;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg0.f348o = i - Integer.MIN_VALUE;
            } else {
                jg0 = new Jg0(mg0, interfaceC0473Hh);
            }
        } else {
            jg0 = new Jg0(mg0, interfaceC0473Hh);
        }
        Object objF = jg0.m;
        Object obj = EnumC1706hi.l;
        int i2 = jg0.f348o;
        try {
            try {
                if (i2 == 0) {
                    Jp0.O(objF);
                    Uri uri = Uri.parse(str);
                    AbstractC1474fG.i(uri, "parse(...)");
                    if (!AbstractC1370eA.z(uri)) {
                        throw new IOException("URL Web insegura o inválida");
                    }
                    System.out.getClass();
                    String strC = mg0.c();
                    jg0.l = mg0;
                    jg0.f348o = 1;
                    objF = AbstractC1376eG.J(AbstractC1910jn.b, new Lg0(str, strC, mg0, null), jg0);
                    if (objF == obj) {
                        mg1 = mg0;
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Jp0.O(objF);
                                return (Js0) objF;
                            }
                            String str4 = (String) jg0.l;
                            Jp0.O(objF);
                            mg0 = str4;
                            return (Js0) objF;
                        }
                        str3 = (String) jg0.l;
                        try {
                            Jp0.O(objF);
                        } catch (Exception unused) {
                            System.out.getClass();
                            LB lb = new LB(3);
                            jg0.l = str3;
                            jg0.f348o = 3;
                            objF = lb.a(str3, jg0);
                            mg0 = str3;
                            if (objF == obj) {
                                return obj;
                            }
                            return (Js0) objF;
                        }
                    }
                    Mg0 mg2 = (Mg0) jg0.l;
                    Jp0.O(objF);
                    mg1 = mg2;
                }
                jg0.l = str2;
                jg0.f348o = 2;
                objF = mg1.i(str2, jg0);
                return objF == obj ? obj : objF;
            } catch (Exception unused2) {
                str3 = str2;
                System.out.getClass();
                LB lb2 = new LB(3);
                jg0.l = str3;
                jg0.f348o = 3;
                objF = lb2.a(str3, jg0);
                mg0 = str3;
                if (objF == obj) {
                    return obj;
                }
                return (Js0) objF;
            }
            mg1 = mg0;
            str2 = (String) objF;
            System.out.getClass();
        } catch (Exception unused3) {
            System.out.getClass();
            C1340dv c1340dv = new C1340dv();
            jg0.l = null;
            jg0.f348o = 4;
            objF = C1340dv.f(c1340dv, mg0, jg0);
            if (objF == obj) {
                return obj;
            }
        }
    }

    public static boolean j(String str) {
        if (str.length() < 1500) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return AbstractC1119bh0.W(lowerCase, "jwplayer", false) || AbstractC1119bh0.W(lowerCase, "eval(function(p,a,c,k,e,d)", false) || AbstractC1119bh0.W(lowerCase, "var o={", false) || AbstractC1119bh0.W(lowerCase, "id='vplayer'", false) || AbstractC1119bh0.W(lowerCase, "id=\"vplayer\"", false);
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return h(this, str, interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public String c() {
        return "https://streamwish.to";
    }

    @Override // o.AbstractC3473zs
    public String d() {
        return "Streamwish";
    }

    public final void g(String str) {
        String strSubstring;
        String strConcat;
        if (AbstractC1899jh0.U(str, "http", false) && !AbstractC1119bh0.W(str, c(), false)) {
            int iG0 = AbstractC1119bh0.g0(str, '/', 0, 6);
            if (iG0 == -1) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(0, iG0);
                AbstractC1474fG.i(strSubstring, "substring(...)");
            }
            if (!AbstractC1899jh0.L(strSubstring, "/e", false) && !AbstractC1899jh0.L(strSubstring, "/v", false)) {
                strSubstring = null;
            }
            if (strSubstring == null || (strConcat = strSubstring.concat("/")) == null) {
                return;
            }
            c = strConcat;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object i(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        Kg0 kg0;
        Mg0 mg0;
        String str2;
        String strA;
        String str3;
        String str4;
        String str5 = str;
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        if (interfaceC0473Hh instanceof Kg0) {
            kg0 = (Kg0) interfaceC0473Hh;
            int i4 = kg0.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kg0.p = i4 - Integer.MIN_VALUE;
            } else {
                kg0 = new Kg0(this, interfaceC0473Hh);
            }
        } else {
            kg0 = new Kg0(this, interfaceC0473Hh);
        }
        Object objA = kg0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = kg0.p;
        if (i5 == 0) {
            Jp0.O(objA);
            String str6 = new URL(str5).getProtocol() + "://" + new URL(str5).getHost() + "/";
            AbstractC1474fG.j(str6, "baseUrl");
            C1583gR c1583gRM = AbstractC1370eA.m();
            c1583gRM.f(str6);
            P9 p9 = new P9(i2);
            ArrayList arrayList = (ArrayList) c1583gRM.f793o;
            arrayList.add(p9);
            arrayList.add(new P9(i3));
            Object objB = c1583gRM.m().b(Hg0.class);
            AbstractC1474fG.i(objB, "create(...)");
            String str7 = this.b;
            kg0.l = this;
            kg0.m = str5;
            kg0.p = 1;
            objA = ((Hg0) objB).a(str5, str7, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36", kg0);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            mg0 = this;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = kg0.m;
            mg0 = kg0.l;
            Jp0.O(objA);
        }
        Pattern patternCompile = Pattern.compile("<script .*>(eval.*?)</script>", C3325yL.p(32));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strR = ((C0660On) objA).R();
        AbstractC1474fG.i(strR, "toString(...)");
        Matcher matcher = patternCompile.matcher(strR);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, strR);
        if (jnA == null || (str2 = (String) ((HN) jnA.a()).get(1)) == null || (strA = new LH(str2).a()) == null) {
            throw new Exception("Can't retrieve script");
        }
        System.out.getClass();
        String str8 = (String) Vb0.I(Vb0.M(new C0927Yu(Vb0.M(I60.c(new I60("\"hls(\\d+)\"\\s*:\\s*\"(https:[^\"]+\\.m3u8[^\"]*)\""), strA), X10.A), i, new C1749i30(7)), X10.B));
        if (str8 == null) {
            JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("\"file\"\\s*:\\s*\"([^\"]+\\.m3u8[^\"]*)\"", "compile(...)", strA, "matcher(...)"), 0, strA);
            str8 = jnA2 != null ? (String) ((HN) jnA2.a()).get(1) : null;
            if (str8 == null) {
                throw new Exception("Can't retrieve m3u8 source");
            }
        }
        String str9 = str8;
        AbstractC1923jt0.G(str9);
        I60 i60 = new I60("file:\\s*\"(.*?)\"(?:,label:\\s*\"(.*?)\")?,kind:\\s*\"(.*?)\"");
        JN jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("tracks:\\s*\\[(.*?)]", "compile(...)", strA, "matcher(...)"), 0, strA);
        if (jnA3 == null || (str3 = (String) ((HN) jnA3.a()).get(1)) == null) {
            str3 = "";
        }
        List listQ = Vb0.Q(Vb0.M(new C1732hv(I60.c(i60, str3), true, X10.C), X10.D));
        mg0.getClass();
        Pattern patternCompile2 = Pattern.compile("https?://([^/]+)");
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        AbstractC1474fG.j(str5, "input");
        Matcher matcher2 = patternCompile2.matcher(str5);
        AbstractC1474fG.i(matcher2, "matcher(...)");
        JN jnA4 = AbstractC1370eA.a(matcher2, 0, str5);
        if (jnA4 == null || (str4 = (String) ((HN) jnA4.a()).get(1)) == null) {
            throw new Exception("Can't extract domain from ".concat(str5));
        }
        String strU = mg0.b;
        if (strU.length() == 0) {
            strU = AbstractC1701hf0.u("https://", str4, "/");
        }
        Js0 js0 = new Js0(str9, AbstractC3327yN.z(new C1101bX("Referer", strU), new C1101bX("Origin", "https://".concat(str4)), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36"), new C1101bX("Accept", "*/*"), new C1101bX("Accept-Language", "en-US,en;q=0.5"), new C1101bX("Connection", "keep-alive")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, listQ, false, 3580);
        AbstractC1923jt0.G(str9);
        return js0;
    }
}
