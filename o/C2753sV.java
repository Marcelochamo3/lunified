package o;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.sV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2753sV extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1027o;
    public final /* synthetic */ C2850tV p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2753sV(C2850tV c2850tV, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = c2850tV;
        this.q = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2753sV) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2753sV c2753sV = new C2753sV(this.p, this.q, interfaceC0473Hh);
        c2753sV.f1027o = obj;
        return c2753sV;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0328  */
    /* JADX WARN: Code duplicated, block: B:121:0x034e  */
    /* JADX WARN: Code duplicated, block: B:122:0x035a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0368  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e9 A[PHI: r1
  0x03e9: PHI (r1v28 java.lang.String) = (r1v27 java.lang.String), (r1v55 java.lang.String) binds: [B:136:0x03c8, B:141:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0405  */
    /* JADX WARN: Code duplicated, block: B:149:0x0414  */
    /* JADX WARN: Code duplicated, block: B:151:0x0420  */
    /* JADX WARN: Code duplicated, block: B:152:0x0439  */
    /* JADX WARN: Code duplicated, block: B:154:0x043e  */
    /* JADX WARN: Code duplicated, block: B:161:0x046a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0476  */
    /* JADX WARN: Code duplicated, block: B:166:0x048c  */
    /* JADX WARN: Code duplicated, block: B:168:0x048f  */
    /* JADX WARN: Code duplicated, block: B:173:0x049e  */
    /* JADX WARN: Code duplicated, block: B:176:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:179:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:182:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:196:0x050d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0553  */
    /* JADX WARN: Code duplicated, block: B:215:0x0560  */
    /* JADX WARN: Code duplicated, block: B:216:0x0569  */
    /* JADX WARN: Code duplicated, block: B:245:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:249:0x0601  */
    /* JADX WARN: Code duplicated, block: B:250:0x0604  */
    /* JADX WARN: Code duplicated, block: B:252:0x060d  */
    /* JADX WARN: Code duplicated, block: B:263:0x062c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0662  */
    /* JADX WARN: Code duplicated, block: B:277:0x0667  */
    /* JADX WARN: Code duplicated, block: B:281:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:284:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:286:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:287:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:289:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:291:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:294:0x0705  */
    /* JADX WARN: Code duplicated, block: B:298:0x0725  */
    /* JADX WARN: Code duplicated, block: B:324:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x063b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0626 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0551 A[EDGE_INSN: B:334:0x0551->B:212:0x0551 BREAK  A[LOOP:2: B:117:0x0322->B:210:0x054c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x04db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x04c8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0507 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x044d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        C2656rV c2656rV;
        String str;
        List listX;
        String str2;
        String str3;
        String str4;
        Object objM;
        String strD;
        Throwable th;
        Object objK;
        List list;
        C3176wp c3176wpX;
        String str5;
        String str6;
        C2656rV c2656rV2;
        List listK;
        Iterator it;
        String strF;
        String str7;
        JN jnA;
        String str8;
        JN jnA2;
        Iterator it2;
        Iterator it3;
        C1934jz c1934jz;
        String strI;
        String string;
        String strF2;
        JN jnB;
        String str9;
        String str10;
        Integer numJ;
        String str11;
        List listQ;
        Iterator it4;
        String string2;
        JN jnA3;
        String string3;
        String str12;
        String strI2;
        String strReplaceAll;
        Integer numJ2;
        JN jnA4;
        String str13;
        String str14;
        String str15;
        C0560Kq c0560Kq;
        C0560Kq c0560Kq2;
        Object objK2;
        Object obj2;
        C1855j80 c1855j80G;
        C0560Kq c0560Kq3;
        String str16;
        String str17;
        Iterator it5;
        String str18;
        ArrayList arrayList;
        String string4;
        String str19;
        String strD2;
        Object es0;
        String strD3;
        String string5;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        J60 j60 = J60.IGNORE_CASE;
        String str20 = "select(...)";
        String str21 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36";
        String str22 = "User-Agent";
        C2850tV c2850tV = this.p;
        if (i == 0) {
            Jp0.O(obj);
            int i2 = C2850tV.e;
            c2850tV.getClass();
            String str23 = this.q;
            String strG = C2850tV.g(str23);
            if (strG != null) {
                int i3 = AbstractC3473zs.a;
                this.n = 1;
                Object objM2 = C0622Nb.m(strG, null, this, 6);
                return objM2 == enumC1706hi ? enumC1706hi : objM2;
            }
            C0560Kq c0560Kq4 = new C0560Kq();
            c0560Kq4.u(str23);
            c0560Kq4.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
            c0560Kq4.j("Referer", "https://nupload.top/");
            C1855j80 c1855j80G2 = c2850tV.d.c(c0560Kq4.c()).g();
            try {
                String str24 = c1855j80G2.l.a.i;
                AbstractC2051l80 abstractC2051l80 = c1855j80G2.r;
                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                if (strQ == null) {
                    strQ = "";
                }
                C0660On c0660OnZ = RN.z(strQ, str24);
                str = "Referer";
                AbstractC1474fG.i(c0660OnZ, "parse(...)");
                c2656rV = new C2656rV(strQ, str24, c0660OnZ);
                AbstractC3409z9.g(c1855j80G2, null);
                C3421zK c3421zK = new C3421zK();
                c3421zK.add(strQ);
                C3370yp c3370ypW = c0660OnZ.W("script");
                AbstractC1474fG.i(c3370ypW, "select(...)");
                Iterator it6 = c3370ypW.iterator();
                while (it6.hasNext()) {
                    String strM = ((C3176wp) it6.next()).M();
                    AbstractC1474fG.g(strM);
                    if (!(!AbstractC1899jh0.O(strM))) {
                        strM = null;
                    }
                    if (strM != null) {
                        c3421zK.add(strM);
                    }
                }
                C3421zK c3421zKH = AbstractC2506pt.h(c3421zK);
                ArrayList arrayList2 = new ArrayList();
                ListIterator listIterator = c3421zKH.listIterator(0);
                while (true) {
                    C3324yK c3324yK = (C3324yK) listIterator;
                    if (!c3324yK.hasNext()) {
                        break;
                    }
                    String str25 = (String) c3324yK.next();
                    LH lh = new LH(str25);
                    AbstractC1474fG.g(str25);
                    ListIterator listIterator2 = listIterator;
                    if (!Pattern.compile("eval\\(function\\(p,a,c,k,e,[rd]").matcher(AbstractC1899jh0.R(str25, " ", "", false)).find()) {
                        lh = null;
                    }
                    AbstractC1406ef.Q(arrayList2, X5.P(new String[]{str25, lh != null ? lh.a() : null}));
                    listIterator = listIterator2;
                }
                listX = AbstractC0911Ye.X(arrayList2);
                C0660On c0660On = c2656rV.c;
                C3176wp c3176wpX2 = c0660On.X("iframe[src]");
                String strD4 = c3176wpX2 != null ? c3176wpX2.d("src") : null;
                C3176wp c3176wpX3 = c0660On.X("a[href*='embed'], a[href*='voe'], a[href*='filemoon']");
                String strD5 = c3176wpX3 != null ? c3176wpX3.d("href") : null;
                C3176wp c3176wpX4 = c0660On.X("meta[http-equiv=refresh]");
                Y5 y5U = AbstractC0911Ye.U(X5.P(new String[]{strD4, strD5, (c3176wpX4 == null || (strD = c3176wpX4.d("content")) == null) ? null : AbstractC1119bh0.x0(strD, "url=", "")}));
                String str26 = c2656rV.b;
                String strH = (String) Vb0.I(Vb0.N(y5U, new io.sentry.android.replay.capture.e(c2850tV, 8, str26)));
                if (strH == null) {
                    Iterator it7 = listX.iterator();
                    loop8: while (true) {
                        if (!it7.hasNext()) {
                            str2 = str22;
                            str3 = str20;
                            str4 = str21;
                            strH = null;
                            break;
                        }
                        String str27 = (String) it7.next();
                        Iterator it8 = it7;
                        str3 = str20;
                        str2 = str22;
                        str4 = str21;
                        Iterator it9 = AbstractC0937Ze.K(new I60("window\\.location(?:\\.href|\\.replace)?\\(['\"]([^'\"]+)['\"]\\)", j60), new I60("(?:window\\.)?location\\.href\\s*=\\s*['\"]([^'\"]+)['\"]", j60), new I60("[\"']((?:https?:)?//[^\"'\\\\\\s<]+(?:voe|streamtape|filemoon|vidhide|streamwish|upzone|nupload)[^\"'\\\\\\s<]*)[\"']", j60)).iterator();
                        while (it9.hasNext()) {
                            C1934jz c1934jz2 = new C1934jz(I60.c((I60) it9.next(), str27));
                            while (c1934jz2.hasNext()) {
                                String strH2 = C2850tV.h((String) AbstractC0911Ye.i0(((JN) c1934jz2.next()).a()), str26);
                                if (strH2 != null) {
                                    strH = strH2;
                                    break loop8;
                                }
                            }
                        }
                        C1934jz c1934jz3 = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str27));
                        while (c1934jz3.hasNext()) {
                            String strI3 = C2850tV.i((String) ((HN) ((JN) c1934jz3.next()).a()).get(1));
                            if (strI3 != null && (strH = C2850tV.h(strI3, str26)) != null) {
                                break loop8;
                            }
                        }
                        it7 = it8;
                        str20 = str3;
                        str22 = str2;
                        str21 = str4;
                    }
                } else {
                    str2 = "User-Agent";
                    str3 = "select(...)";
                    str4 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36";
                }
                if (strH != null) {
                    try {
                        int i4 = AbstractC3473zs.a;
                        this.f1027o = c2656rV;
                        this.m = listX;
                        this.n = 2;
                        objM = C0622Nb.m(strH, null, this, 6);
                        if (objM == enumC1706hi) {
                            return enumC1706hi;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        List list2 = listX;
                        objK = Jp0.k(th);
                        list = list2;
                    }
                }
                C0660On c0660On2 = c2656rV.c;
                int i5 = C2850tV.e;
                c2850tV.getClass();
                c3176wpX = c0660On2.X("source[src], video[src]");
                str5 = c2656rV.b;
                if (c3176wpX == null || (strD3 = c3176wpX.d("src")) == null || (string5 = AbstractC1119bh0.E0(strD3).toString()) == null) {
                    str6 = "src";
                    c2656rV2 = c2656rV;
                    listK = AbstractC0937Ze.K(new I60("[\"']file[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']src[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']hls\\d*[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.m3u8[^\"']*)[\"']", j60), new I60("sources?\\s*:\\s*\\[\\s*\\{[^}]*file\\s*:\\s*[\"']((?:https?://|/)[^\"']+)[\"']", j60), new I60("https?://[^\"'\\\\\\s<]+\\.m3u8[^\"'\\\\\\s<]*", j60), new I60("https?://[^\"'\\\\\\s<]+\\.mp4[^\"'\\\\\\s<]*", j60));
                    it = listX.iterator();
                    loop2: while (true) {
                        if (it.hasNext()) {
                            strF = null;
                            break;
                        }
                        str7 = (String) it.next();
                        Pattern patternCompile = Pattern.compile("(\\w+)\\.forEach\\s*\\(\\s*function\\s+\\w+\\s*\\(\\s*value\\s*\\)");
                        AbstractC1474fG.i(patternCompile, "compile(...)");
                        AbstractC1474fG.j(str7, "input");
                        Matcher matcher = patternCompile.matcher(str7);
                        AbstractC1474fG.i(matcher, "matcher(...)");
                        jnA = AbstractC1370eA.a(matcher, 0, str7);
                        if (jnA != null) {
                            str8 = (String) AbstractC0911Ye.e0(1, jnA.a());
                        } else {
                            str8 = null;
                        }
                        jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("String\\.fromCharCode\\(parseInt\\(atob\\(value\\)\\.replace\\(/\\\\D/g,''\\)\\)\\s*-\\s*(\\d+)\\)", "compile(...)", str7, "matcher(...)"), 0, str7);
                        if (jnA2 == null && (str10 = (String) AbstractC0911Ye.e0(1, jnA2.a())) != null && (numJ = AbstractC1802ih0.J(str10)) != null) {
                            int iIntValue = numJ.intValue();
                            if (str8 != null) {
                                String strQuote = Pattern.quote(str8);
                                AbstractC1474fG.i(strQuote, "quote(...)");
                                it2 = it;
                                String str28 = "var\\s+" + strQuote + "\\s*=\\s*\\[((?:[\"'][^\"']*[\"'])(?:\\s*,\\s*[\"'][^\"']*[\"'])*)]";
                                AbstractC1474fG.j(str28, "pattern");
                                Pattern patternCompile2 = Pattern.compile(str28);
                                AbstractC1474fG.i(patternCompile2, "compile(...)");
                                Matcher matcher2 = patternCompile2.matcher(str7);
                                AbstractC1474fG.i(matcher2, "matcher(...)");
                                JN jnA5 = AbstractC1370eA.a(matcher2, 0, str7);
                                str11 = jnA5 != null ? (String) AbstractC0911Ye.e0(1, jnA5.a()) : null;
                                if (str11 != null) {
                                    listQ = Vb0.Q(Vb0.M(I60.c(new I60("[\"']([^\"']+)[\"']"), str11), C1182cH.D));
                                    if (listQ.isEmpty()) {
                                        StringBuilder sb = new StringBuilder();
                                        for (it4 = listQ.iterator(); it4.hasNext(); it4 = it4) {
                                            strI2 = C2850tV.i((String) it4.next());
                                            if (strI2 != null) {
                                                Pattern patternCompile3 = Pattern.compile("\\D");
                                                AbstractC1474fG.i(patternCompile3, "compile(...)");
                                                strReplaceAll = patternCompile3.matcher(strI2).replaceAll("");
                                                AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                                            } else {
                                                strReplaceAll = null;
                                            }
                                            if (strReplaceAll == null && (numJ2 = AbstractC1802ih0.J(strReplaceAll)) != null) {
                                                sb.append((char) (numJ2.intValue() - iIntValue));
                                            }
                                        }
                                        String string6 = sb.toString();
                                        AbstractC1474fG.i(string6, "toString(...)");
                                        string2 = AbstractC1119bh0.E0(string6).toString();
                                        if (!AbstractC1899jh0.U(string2, "http", false)) {
                                            jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+sesz\\s*=\\s*[\"']([^\"']+)[\"']", "compile(...)", str7, "matcher(...)"), 0, str7);
                                            if (jnA3 != null || (str12 = (String) AbstractC0911Ye.e0(1, jnA3.a())) == null) {
                                                string3 = null;
                                            } else {
                                                string3 = AbstractC1119bh0.E0(str12).toString();
                                            }
                                            if (string3 != null && !AbstractC1899jh0.O(string3)) {
                                                string2 = string2 + (AbstractC1119bh0.X(string2, '?') ? '&' : '?') + "s=" + string3;
                                            }
                                            strF = C2850tV.f(string2, str5);
                                        }
                                    }
                                } else {
                                    jnA4 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+\\w+\\s*=\\s*\\[((?:[\"'][^\"']*[\"'])(?:\\s*,\\s*[\"'][^\"']*[\"'])*)]", "compile(...)", str7, "matcher(...)"), 0, str7);
                                    if (jnA4 != null) {
                                        str11 = (String) AbstractC0911Ye.e0(1, jnA4.a());
                                    } else {
                                        str11 = null;
                                    }
                                    if (str11 == null) {
                                        listQ = Vb0.Q(Vb0.M(I60.c(new I60("[\"']([^\"']+)[\"']"), str11), C1182cH.D));
                                        if (listQ.isEmpty()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            while (it4.hasNext()) {
                                                strI2 = C2850tV.i((String) it4.next());
                                                if (strI2 != null) {
                                                    Pattern patternCompile4 = Pattern.compile("\\D");
                                                    AbstractC1474fG.i(patternCompile4, "compile(...)");
                                                    strReplaceAll = patternCompile4.matcher(strI2).replaceAll("");
                                                    AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                                                } else {
                                                    strReplaceAll = null;
                                                }
                                                if (strReplaceAll == null) {
                                                }
                                            }
                                            String string7 = sb2.toString();
                                            AbstractC1474fG.i(string7, "toString(...)");
                                            string2 = AbstractC1119bh0.E0(string7).toString();
                                            if (!AbstractC1899jh0.U(string2, "http", false)) {
                                                jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+sesz\\s*=\\s*[\"']([^\"']+)[\"']", "compile(...)", str7, "matcher(...)"), 0, str7);
                                                if (jnA3 != null) {
                                                    string3 = null;
                                                } else {
                                                    string3 = null;
                                                }
                                                if (string3 != null) {
                                                    if (AbstractC1119bh0.X(string2, '?')) {
                                                    }
                                                    string2 = string2 + (AbstractC1119bh0.X(string2, '?') ? '&' : '?') + "s=" + string3;
                                                }
                                                strF = C2850tV.f(string2, str5);
                                            }
                                        }
                                    }
                                }
                                if (strF != null) {
                                    it3 = listK.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            jnB = ((I60) it3.next()).b(str7, 0);
                                            if (jnB == null && (str9 = (String) AbstractC0911Ye.j0(jnB.a())) != null) {
                                                if (!(!AbstractC1899jh0.O(str9))) {
                                                    str9 = null;
                                                }
                                                if (str9 != null) {
                                                    strF2 = C2850tV.f(str9, str5);
                                                }
                                            }
                                        } else {
                                            c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                                            while (true) {
                                                if (c1934jz.hasNext()) {
                                                    strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                                    if (strI == null && (string = AbstractC1119bh0.E0(strI).toString()) != null) {
                                                        if (!AbstractC1899jh0.U(string, "http", false) || (!AbstractC1119bh0.W(string, ".m3u8", false) && !AbstractC1119bh0.W(string, ".mp4", false))) {
                                                            string = null;
                                                        }
                                                        if (string != null) {
                                                            strF2 = C2850tV.f(string, str5);
                                                        }
                                                    }
                                                } else {
                                                    it = it2;
                                                }
                                            }
                                        }
                                        strF = strF2;
                                        break loop2;
                                    }
                                }
                                break;
                            }
                            it2 = it;
                            if (str11 != null) {
                                listQ = Vb0.Q(Vb0.M(I60.c(new I60("[\"']([^\"']+)[\"']"), str11), C1182cH.D));
                                if (listQ.isEmpty()) {
                                    StringBuilder sb3 = new StringBuilder();
                                    while (it4.hasNext()) {
                                        strI2 = C2850tV.i((String) it4.next());
                                        if (strI2 != null) {
                                            Pattern patternCompile5 = Pattern.compile("\\D");
                                            AbstractC1474fG.i(patternCompile5, "compile(...)");
                                            strReplaceAll = patternCompile5.matcher(strI2).replaceAll("");
                                            AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                                        } else {
                                            strReplaceAll = null;
                                        }
                                        if (strReplaceAll == null) {
                                        }
                                    }
                                    String string8 = sb3.toString();
                                    AbstractC1474fG.i(string8, "toString(...)");
                                    string2 = AbstractC1119bh0.E0(string8).toString();
                                    if (!AbstractC1899jh0.U(string2, "http", false)) {
                                        jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+sesz\\s*=\\s*[\"']([^\"']+)[\"']", "compile(...)", str7, "matcher(...)"), 0, str7);
                                        if (jnA3 != null) {
                                            string3 = null;
                                        } else {
                                            string3 = null;
                                        }
                                        if (string3 != null) {
                                            if (AbstractC1119bh0.X(string2, '?')) {
                                            }
                                            string2 = string2 + (AbstractC1119bh0.X(string2, '?') ? '&' : '?') + "s=" + string3;
                                        }
                                        strF = C2850tV.f(string2, str5);
                                    }
                                }
                            } else {
                                jnA4 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+\\w+\\s*=\\s*\\[((?:[\"'][^\"']*[\"'])(?:\\s*,\\s*[\"'][^\"']*[\"'])*)]", "compile(...)", str7, "matcher(...)"), 0, str7);
                                if (jnA4 != null) {
                                    str11 = (String) AbstractC0911Ye.e0(1, jnA4.a());
                                } else {
                                    str11 = null;
                                }
                                if (str11 == null) {
                                    listQ = Vb0.Q(Vb0.M(I60.c(new I60("[\"']([^\"']+)[\"']"), str11), C1182cH.D));
                                    if (listQ.isEmpty()) {
                                        StringBuilder sb4 = new StringBuilder();
                                        while (it4.hasNext()) {
                                            strI2 = C2850tV.i((String) it4.next());
                                            if (strI2 != null) {
                                                Pattern patternCompile6 = Pattern.compile("\\D");
                                                AbstractC1474fG.i(patternCompile6, "compile(...)");
                                                strReplaceAll = patternCompile6.matcher(strI2).replaceAll("");
                                                AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
                                            } else {
                                                strReplaceAll = null;
                                            }
                                            if (strReplaceAll == null) {
                                            }
                                        }
                                        String string9 = sb4.toString();
                                        AbstractC1474fG.i(string9, "toString(...)");
                                        string2 = AbstractC1119bh0.E0(string9).toString();
                                        if (!AbstractC1899jh0.U(string2, "http", false)) {
                                            jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+sesz\\s*=\\s*[\"']([^\"']+)[\"']", "compile(...)", str7, "matcher(...)"), 0, str7);
                                            if (jnA3 != null) {
                                                string3 = null;
                                            } else {
                                                string3 = null;
                                            }
                                            if (string3 != null) {
                                                if (AbstractC1119bh0.X(string2, '?')) {
                                                }
                                                string2 = string2 + (AbstractC1119bh0.X(string2, '?') ? '&' : '?') + "s=" + string3;
                                            }
                                            strF = C2850tV.f(string2, str5);
                                        }
                                    }
                                }
                            }
                            if (strF != null) {
                                it3 = listK.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        jnB = ((I60) it3.next()).b(str7, 0);
                                        if (jnB == null) {
                                        }
                                    } else {
                                        c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                                        while (true) {
                                            if (c1934jz.hasNext()) {
                                                strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                                if (strI == null) {
                                                }
                                            } else {
                                                it = it2;
                                            }
                                        }
                                    }
                                    strF = strF2;
                                    break loop2;
                                }
                            }
                            break;
                            break;
                        }
                        it2 = it;
                        strF = null;
                        if (strF != null) {
                            it3 = listK.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    jnB = ((I60) it3.next()).b(str7, 0);
                                    if (jnB == null) {
                                    }
                                } else {
                                    c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                                    while (true) {
                                        if (c1934jz.hasNext()) {
                                            strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                            if (strI == null) {
                                            }
                                        } else {
                                            it = it2;
                                        }
                                    }
                                }
                                strF = strF2;
                                break loop2;
                            }
                        }
                        break;
                        break;
                    }
                }
                if (!(!AbstractC1899jh0.O(string5))) {
                    string5 = null;
                }
                if (string5 == null) {
                    str6 = "src";
                    c2656rV2 = c2656rV;
                    listK = AbstractC0937Ze.K(new I60("[\"']file[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']src[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']hls\\d*[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.m3u8[^\"']*)[\"']", j60), new I60("sources?\\s*:\\s*\\[\\s*\\{[^}]*file\\s*:\\s*[\"']((?:https?://|/)[^\"']+)[\"']", j60), new I60("https?://[^\"'\\\\\\s<]+\\.m3u8[^\"'\\\\\\s<]*", j60), new I60("https?://[^\"'\\\\\\s<]+\\.mp4[^\"'\\\\\\s<]*", j60));
                    it = listX.iterator();
                    loop2: while (true) {
                        if (it.hasNext()) {
                            strF = null;
                            break;
                        }
                        str7 = (String) it.next();
                        Pattern patternCompile7 = Pattern.compile("(\\w+)\\.forEach\\s*\\(\\s*function\\s+\\w+\\s*\\(\\s*value\\s*\\)");
                        AbstractC1474fG.i(patternCompile7, "compile(...)");
                        AbstractC1474fG.j(str7, "input");
                        Matcher matcher3 = patternCompile7.matcher(str7);
                        AbstractC1474fG.i(matcher3, "matcher(...)");
                        jnA = AbstractC1370eA.a(matcher3, 0, str7);
                        if (jnA != null) {
                            str8 = (String) AbstractC0911Ye.e0(1, jnA.a());
                        } else {
                            str8 = null;
                        }
                        jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("String\\.fromCharCode\\(parseInt\\(atob\\(value\\)\\.replace\\(/\\\\D/g,''\\)\\)\\s*-\\s*(\\d+)\\)", "compile(...)", str7, "matcher(...)"), 0, str7);
                        if (jnA2 == null) {
                            it2 = it;
                            strF = null;
                        } else {
                            it2 = it;
                            strF = null;
                        }
                        if (strF != null) {
                            it3 = listK.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    jnB = ((I60) it3.next()).b(str7, 0);
                                    if (jnB == null) {
                                    }
                                } else {
                                    c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                                    while (true) {
                                        if (c1934jz.hasNext()) {
                                            strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                            if (strI == null) {
                                            }
                                        } else {
                                            it = it2;
                                        }
                                    }
                                }
                                strF = strF2;
                                break loop2;
                            }
                        }
                        break;
                        break;
                    }
                }
                strF = C2850tV.f(string5, str5);
                c2656rV2 = c2656rV;
                str6 = "src";
                if (strF != null) {
                    throw new Exception("No playable source found for Nuupload");
                }
                if (AbstractC1899jh0.U(strF, "http", false)) {
                    URL url = new URL(str5);
                    String strE = AbstractC1701hf0.e(url.getProtocol(), "://", url.getHost());
                    try {
                        OV ov = c2850tV.d;
                        c0560Kq = new C0560Kq();
                        c0560Kq.u(strF);
                        str14 = str2;
                        str15 = str4;
                        try {
                            c0560Kq.j(str14, str15);
                            str13 = str;
                            try {
                                c0560Kq.j(str13, strE + "/");
                                c0560Kq.j("Origin", strE);
                                c0560Kq.j("Accept", "*/*");
                                c1855j80G = ov.c(c0560Kq.c()).g();
                                try {
                                    try {
                                        String str29 = c1855j80G.l.a.i;
                                        c0560Kq2 = null;
                                        AbstractC3409z9.g(c1855j80G, null);
                                        objK2 = str29;
                                    } catch (Throwable th3) {
                                        c0560Kq = null;
                                        c0560Kq = null;
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            AbstractC3409z9.g(c1855j80G, th3);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    objK2 = Jp0.k(th);
                                    c0560Kq2 = c0560Kq;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                c0560Kq = null;
                                objK2 = Jp0.k(th);
                                c0560Kq2 = c0560Kq;
                                obj2 = strF;
                                if (!(objK2 instanceof C2439p80)) {
                                    obj2 = objK2;
                                }
                                str16 = (String) obj2;
                                c0560Kq3 = c0560Kq2;
                                URL url2 = new URL(str5);
                                String strE2 = AbstractC1701hf0.e(url2.getProtocol(), "://", url2.getHost());
                                if (AbstractC1119bh0.W(str16, ".m3u8", true)) {
                                    str17 = "hls";
                                } else {
                                    if (AbstractC1119bh0.W(str5, "/watch/", false)) {
                                        it5 = listX.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                str18 = (String) it5.next();
                                                if (!AbstractC1119bh0.W(str18, "jwplayer(", true)) {
                                                }
                                            }
                                        }
                                    }
                                    if (AbstractC1119bh0.W(str16, ".mp4", true)) {
                                        str17 = "video/mp4";
                                    } else {
                                        str17 = c0560Kq3;
                                    }
                                }
                                Map mapZ = AbstractC3327yN.z(new C1101bX(str14, str15), new C1101bX(str13, AbstractC1701hf0.d(strE2, "/")), new C1101bX("Origin", strE2));
                                String strD6 = AbstractC1701hf0.d(strE2, "/");
                                C3370yp<C3176wp> c3370ypW2 = c2656rV2.c.W("track[src]");
                                AbstractC1474fG.i(c3370ypW2, str3);
                                arrayList = new ArrayList();
                                for (C3176wp c3176wp : c3370ypW2) {
                                    String str30 = str6;
                                    String strD7 = c3176wp.d(str30);
                                    AbstractC1474fG.i(strD7, "attr(...)");
                                    string4 = AbstractC1119bh0.E0(strD7).toString();
                                    if (!(!AbstractC1899jh0.O(string4))) {
                                        str19 = string4;
                                        str19 = c0560Kq3;
                                    }
                                    if (str19 == 0) {
                                        es0 = c0560Kq3;
                                    } else {
                                        strD2 = c3176wp.d("label");
                                        if (AbstractC1899jh0.O(strD2)) {
                                            strD2 = c3176wp.d("srclang");
                                            if (AbstractC1899jh0.O(strD2)) {
                                                strD2 = "Subtitle";
                                            }
                                        }
                                        es0 = new Es0(strD2, C2850tV.f(str19, str5), c3176wp.r("default"), null, 8);
                                    }
                                    if (es0 != null) {
                                        arrayList.add(es0);
                                    }
                                    str6 = str30;
                                }
                                return new Js0(str16, mapZ, str17, (String) null, (String) null, (byte[]) null, (String) null, strD6, (String) null, (List) arrayList, false, 3448);
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str13 = str;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str13 = str;
                        str14 = str2;
                        str15 = str4;
                    }
                    obj2 = strF;
                    if (!(objK2 instanceof C2439p80)) {
                        obj2 = objK2;
                    }
                    str16 = (String) obj2;
                    c0560Kq3 = c0560Kq2;
                } else {
                    str13 = str;
                    str14 = str2;
                    str15 = str4;
                    c0560Kq3 = null;
                    str16 = strF;
                }
                URL url3 = new URL(str5);
                String strE3 = AbstractC1701hf0.e(url3.getProtocol(), "://", url3.getHost());
                if (AbstractC1119bh0.W(str16, ".m3u8", true)) {
                    if (AbstractC1119bh0.W(str5, "/watch/", false) && AbstractC1119bh0.W(str16, "?s=", false) && (!(listX instanceof Collection) || !listX.isEmpty())) {
                        it5 = listX.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                str18 = (String) it5.next();
                                if (!AbstractC1119bh0.W(str18, "jwplayer(", true) && (AbstractC1119bh0.W(str18, "type:\"hls\"", true) || AbstractC1119bh0.W(str18, "type:'hls'", true) || AbstractC1119bh0.W(str18, "type:\"application/vnd.apple.mpegurl\"", true) || AbstractC1119bh0.W(str18, "file:", true))) {
                                    str17 = "hls";
                                }
                            }
                        }
                    }
                    if (AbstractC1119bh0.W(str16, ".mp4", true)) {
                        str17 = "video/mp4";
                    } else {
                        str17 = c0560Kq3;
                    }
                } else {
                    str17 = "hls";
                }
                Map mapZ2 = AbstractC3327yN.z(new C1101bX(str14, str15), new C1101bX(str13, AbstractC1701hf0.d(strE3, "/")), new C1101bX("Origin", strE3));
                String strD8 = AbstractC1701hf0.d(strE3, "/");
                C3370yp<C3176wp> c3370ypW3 = c2656rV2.c.W("track[src]");
                AbstractC1474fG.i(c3370ypW3, str3);
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    String str31 = str6;
                    String strD9 = c3176wp.d(str31);
                    AbstractC1474fG.i(strD9, "attr(...)");
                    string4 = AbstractC1119bh0.E0(strD9).toString();
                    if (!(!AbstractC1899jh0.O(string4))) {
                        str19 = string4;
                        str19 = c0560Kq3;
                    }
                    if (str19 == 0) {
                        es0 = c0560Kq3;
                    } else {
                        strD2 = c3176wp.d("label");
                        if (AbstractC1899jh0.O(strD2)) {
                            strD2 = c3176wp.d("srclang");
                            if (AbstractC1899jh0.O(strD2)) {
                                strD2 = "Subtitle";
                            }
                        }
                        es0 = new Es0(strD2, C2850tV.f(str19, str5), c3176wp.r("default"), null, 8);
                    }
                    if (es0 != null) {
                        arrayList.add(es0);
                    }
                    str6 = str31;
                }
                return new Js0(str16, mapZ2, str17, (String) null, (String) null, (byte[]) null, (String) null, strD8, (String) null, (List) arrayList, false, 3448);
            } catch (Throwable th9) {
                try {
                    throw th9;
                } catch (Throwable th10) {
                    AbstractC3409z9.g(c1855j80G2, th9);
                    throw th10;
                }
            }
        }
        if (i == 1) {
            Jp0.O(obj);
            return obj;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        listX = this.m;
        C2656rV c2656rV3 = (C2656rV) this.f1027o;
        try {
            Jp0.O(obj);
            objM = obj;
            str2 = "User-Agent";
            str3 = "select(...)";
            str = "Referer";
            str4 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36";
            c2656rV = c2656rV3;
        } catch (Throwable th11) {
            th = th11;
            str2 = "User-Agent";
            str3 = "select(...)";
            str = "Referer";
            str4 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36";
            c2656rV = c2656rV3;
            List list3 = listX;
            objK = Jp0.k(th);
            list = list3;
        }
        list = listX;
        objK = (Js0) objM;
        if (objK instanceof C2439p80) {
            objK = null;
        }
        Js0 js0 = (Js0) objK;
        if (js0 != null) {
            return js0;
        }
        listX = list;
        C0660On c0660On3 = c2656rV.c;
        int i6 = C2850tV.e;
        c2850tV.getClass();
        c3176wpX = c0660On3.X("source[src], video[src]");
        str5 = c2656rV.b;
        if (c3176wpX == null) {
            str6 = "src";
            c2656rV2 = c2656rV;
            listK = AbstractC0937Ze.K(new I60("[\"']file[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']src[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']hls\\d*[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.m3u8[^\"']*)[\"']", j60), new I60("sources?\\s*:\\s*\\[\\s*\\{[^}]*file\\s*:\\s*[\"']((?:https?://|/)[^\"']+)[\"']", j60), new I60("https?://[^\"'\\\\\\s<]+\\.m3u8[^\"'\\\\\\s<]*", j60), new I60("https?://[^\"'\\\\\\s<]+\\.mp4[^\"'\\\\\\s<]*", j60));
            it = listX.iterator();
            loop2: while (true) {
                if (it.hasNext()) {
                    strF = null;
                    break;
                }
                str7 = (String) it.next();
                Pattern patternCompile8 = Pattern.compile("(\\w+)\\.forEach\\s*\\(\\s*function\\s+\\w+\\s*\\(\\s*value\\s*\\)");
                AbstractC1474fG.i(patternCompile8, "compile(...)");
                AbstractC1474fG.j(str7, "input");
                Matcher matcher4 = patternCompile8.matcher(str7);
                AbstractC1474fG.i(matcher4, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher4, 0, str7);
                if (jnA != null) {
                    str8 = (String) AbstractC0911Ye.e0(1, jnA.a());
                } else {
                    str8 = null;
                }
                jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("String\\.fromCharCode\\(parseInt\\(atob\\(value\\)\\.replace\\(/\\\\D/g,''\\)\\)\\s*-\\s*(\\d+)\\)", "compile(...)", str7, "matcher(...)"), 0, str7);
                if (jnA2 == null) {
                    it2 = it;
                    strF = null;
                } else {
                    it2 = it;
                    strF = null;
                }
                if (strF != null) {
                    it3 = listK.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            jnB = ((I60) it3.next()).b(str7, 0);
                            if (jnB == null) {
                            }
                        } else {
                            c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                            while (true) {
                                if (c1934jz.hasNext()) {
                                    strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                    if (strI == null) {
                                    }
                                } else {
                                    it = it2;
                                }
                            }
                        }
                        strF = strF2;
                        break loop2;
                    }
                }
                break;
                break;
            }
        }
        str6 = "src";
        c2656rV2 = c2656rV;
        listK = AbstractC0937Ze.K(new I60("[\"']file[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']src[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.(?:m3u8|mp4)[^\"']*)[\"']", j60), new I60("[\"']hls\\d*[\"']\\s*[:=]\\s*[\"']((?:https?://|/)[^\"']+\\.m3u8[^\"']*)[\"']", j60), new I60("sources?\\s*:\\s*\\[\\s*\\{[^}]*file\\s*:\\s*[\"']((?:https?://|/)[^\"']+)[\"']", j60), new I60("https?://[^\"'\\\\\\s<]+\\.m3u8[^\"'\\\\\\s<]*", j60), new I60("https?://[^\"'\\\\\\s<]+\\.mp4[^\"'\\\\\\s<]*", j60));
        it = listX.iterator();
        loop2: while (true) {
            if (it.hasNext()) {
                strF = null;
                break;
            }
            str7 = (String) it.next();
            Pattern patternCompile9 = Pattern.compile("(\\w+)\\.forEach\\s*\\(\\s*function\\s+\\w+\\s*\\(\\s*value\\s*\\)");
            AbstractC1474fG.i(patternCompile9, "compile(...)");
            AbstractC1474fG.j(str7, "input");
            Matcher matcher5 = patternCompile9.matcher(str7);
            AbstractC1474fG.i(matcher5, "matcher(...)");
            jnA = AbstractC1370eA.a(matcher5, 0, str7);
            if (jnA != null) {
                str8 = (String) AbstractC0911Ye.e0(1, jnA.a());
            } else {
                str8 = null;
            }
            jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("String\\.fromCharCode\\(parseInt\\(atob\\(value\\)\\.replace\\(/\\\\D/g,''\\)\\)\\s*-\\s*(\\d+)\\)", "compile(...)", str7, "matcher(...)"), 0, str7);
            if (jnA2 == null) {
                it2 = it;
                strF = null;
            } else {
                it2 = it;
                strF = null;
            }
            if (strF != null) {
                it3 = listK.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        jnB = ((I60) it3.next()).b(str7, 0);
                        if (jnB == null) {
                        }
                    } else {
                        c1934jz = new C1934jz(I60.c(new I60("[\"'](aHR0[a-zA-Z0-9+/=]{20,})[\"']"), str7));
                        while (true) {
                            if (c1934jz.hasNext()) {
                                strI = C2850tV.i((String) ((HN) ((JN) c1934jz.next()).a()).get(1));
                                if (strI == null) {
                                }
                            } else {
                                it = it2;
                            }
                        }
                    }
                    strF = strF2;
                    break loop2;
                }
            }
            break;
            break;
        }
        if (strF != null) {
            throw new Exception("No playable source found for Nuupload");
        }
        if (AbstractC1899jh0.U(strF, "http", false)) {
            str13 = str;
            str14 = str2;
            str15 = str4;
            c0560Kq3 = null;
            str16 = strF;
        } else {
            URL url4 = new URL(str5);
            String strE4 = AbstractC1701hf0.e(url4.getProtocol(), "://", url4.getHost());
            OV ov2 = c2850tV.d;
            c0560Kq = new C0560Kq();
            c0560Kq.u(strF);
            str14 = str2;
            str15 = str4;
            c0560Kq.j(str14, str15);
            str13 = str;
            c0560Kq.j(str13, strE4 + "/");
            c0560Kq.j("Origin", strE4);
            c0560Kq.j("Accept", "*/*");
            c1855j80G = ov2.c(c0560Kq.c()).g();
            String str210 = c1855j80G.l.a.i;
            c0560Kq2 = null;
            AbstractC3409z9.g(c1855j80G, null);
            objK2 = str210;
            obj2 = strF;
            if (!(objK2 instanceof C2439p80)) {
                obj2 = objK2;
            }
            str16 = (String) obj2;
            c0560Kq3 = c0560Kq2;
        }
        URL url5 = new URL(str5);
        String strE5 = AbstractC1701hf0.e(url5.getProtocol(), "://", url5.getHost());
        if (AbstractC1119bh0.W(str16, ".m3u8", true)) {
            if (AbstractC1119bh0.W(str5, "/watch/", false)) {
                it5 = listX.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        str18 = (String) it5.next();
                        if (!AbstractC1119bh0.W(str18, "jwplayer(", true)) {
                        }
                    }
                }
            }
            if (AbstractC1119bh0.W(str16, ".mp4", true)) {
                str17 = "video/mp4";
            } else {
                str17 = c0560Kq3;
            }
        } else {
            str17 = "hls";
        }
        Map mapZ3 = AbstractC3327yN.z(new C1101bX(str14, str15), new C1101bX(str13, AbstractC1701hf0.d(strE5, "/")), new C1101bX("Origin", strE5));
        String strD10 = AbstractC1701hf0.d(strE5, "/");
        C3370yp<C3176wp> c3370ypW4 = c2656rV2.c.W("track[src]");
        AbstractC1474fG.i(c3370ypW4, str3);
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            String str32 = str6;
            String strD11 = c3176wp.d(str32);
            AbstractC1474fG.i(strD11, "attr(...)");
            string4 = AbstractC1119bh0.E0(strD11).toString();
            if (!(!AbstractC1899jh0.O(string4))) {
                str19 = string4;
                str19 = c0560Kq3;
            }
            if (str19 == 0) {
                es0 = c0560Kq3;
            } else {
                strD2 = c3176wp.d("label");
                if (AbstractC1899jh0.O(strD2)) {
                    strD2 = c3176wp.d("srclang");
                    if (AbstractC1899jh0.O(strD2)) {
                        strD2 = "Subtitle";
                    }
                }
                es0 = new Es0(strD2, C2850tV.f(str19, str5), c3176wp.r("default"), null, 8);
            }
            if (es0 != null) {
                arrayList.add(es0);
            }
            str6 = str32;
        }
        return new Js0(str16, mapZ3, str17, (String) null, (String) null, (byte[]) null, (String) null, strD10, (String) null, (List) arrayList, false, 3448);
    }
}
