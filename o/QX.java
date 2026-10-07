package o;

import android.util.Base64;
import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class QX implements Q30 {
    public static final QX b = new QX();
    public static final EX c;
    public static final I60 d;

    static {
        NV nvJ = AbstractC1370eA.j();
        nvJ.h = true;
        nvJ.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvJ);
        nvJ.c.add(new C2480pg(11));
        OV ov = new OV(nvJ);
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://pelisflix1.link/");
        ((ArrayList) c1583gRK.f793o).add(new P9(1));
        c1583gRK.m = ov;
        c = (EX) c1583gRK.m().b(EX.class);
        d = new I60("^https?://(?:www\\.)?(?:pelisflixhd\\.win|pelisflixhd\\.onl|pelisflix1\\.link)(?=/|$)", J60.IGNORE_CASE);
    }

    public static String A(String str) {
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC1899jh0.O(string)) {
            return "";
        }
        I60 i60 = d;
        if (i60.a(string)) {
            String strReplaceFirst = i60.l.matcher(string).replaceFirst("https://pelisflix1.link");
            AbstractC1474fG.i(strReplaceFirst, "replaceFirst(...)");
            return strReplaceFirst;
        }
        if (AbstractC1899jh0.U(string, "http://", true) || AbstractC1899jh0.U(string, "https://", true)) {
            return string;
        }
        if (AbstractC1899jh0.U(string, "//", false)) {
            return "https:".concat(string);
        }
        return AbstractC1899jh0.U(string, "/", false) ? "https://pelisflix1.link".concat(string) : "https://pelisflix1.link/".concat(AbstractC1119bh0.l0(string, "/"));
    }

    public static Integer B(String str) {
        String str2;
        Integer numJ;
        String str3;
        Integer numJ2;
        if (str == null || AbstractC1899jh0.O(str)) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("(\\d+)\\s*h", C3325yL.p(2));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC1474fG.i(matcher, "matcher(...)");
        int iIntValue = 0;
        JN jnA = AbstractC1370eA.a(matcher, 0, str);
        int iIntValue2 = (jnA == null || (str3 = (String) AbstractC0911Ye.e0(1, jnA.a())) == null || (numJ2 = AbstractC1802ih0.J(str3)) == null) ? 0 : numJ2.intValue();
        Pattern patternCompile2 = Pattern.compile("(\\d+)\\s*min", C3325yL.p(2));
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        Matcher matcher2 = patternCompile2.matcher(str);
        AbstractC1474fG.i(matcher2, "matcher(...)");
        JN jnA2 = AbstractC1370eA.a(matcher2, 0, str);
        if (jnA2 != null && (str2 = (String) AbstractC0911Ye.e0(1, jnA2.a())) != null && (numJ = AbstractC1802ih0.J(str2)) != null) {
            iIntValue = numJ.intValue();
        }
        int i = (iIntValue2 * 60) + iIntValue;
        Integer numValueOf = Integer.valueOf(i);
        if (i > 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0022  */
    public static Ds0 C(C3176wp c3176wp, String str, int i) {
        Object objK;
        String str2;
        Object objK2;
        C2446pE c2446pEB;
        C2446pE c2446pEB2;
        String strValueOf;
        String strH;
        Object objK3;
        String strD = c3176wp.d("data-url");
        AbstractC1474fG.i(strD, "attr(...)");
        String string = AbstractC1119bh0.E0(strD).toString();
        if (AbstractC1899jh0.O(string)) {
            str2 = null;
        } else {
            String strD2 = AbstractC1701hf0.d(string, AbstractC1899jh0.Q((4 - (string.length() % 4)) % 4, "="));
            try {
                byte[] bArrDecode = Base64.decode(strD2, 0);
                AbstractC1474fG.i(bArrDecode, "decode(...)");
                objK = AbstractC1119bh0.E0(new String(bArrDecode, AbstractC1305dd.a)).toString();
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            if (C2536q80.a(objK) != null) {
                try {
                    byte[] bArrDecode2 = Base64.decode(strD2, 10);
                    AbstractC1474fG.i(bArrDecode2, "decode(...)");
                    objK2 = AbstractC1119bh0.E0(new String(bArrDecode2, AbstractC1305dd.a)).toString();
                } catch (Throwable th2) {
                    objK2 = Jp0.k(th2);
                }
                objK = objK2;
            }
            if (objK instanceof C2439p80) {
                objK = null;
            }
            str2 = (String) objK;
            if (str2 == null || (!AbstractC1899jh0.U(str2, "http://", true) && !AbstractC1899jh0.U(str2, "https://", true))) {
                str2 = null;
            }
        }
        if (str2 == null) {
            return null;
        }
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str2);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB != null && (strH = c2446pEB.h()) != null) {
            try {
                objK3 = URLDecoder.decode(strH, "UTF-8");
            } catch (Throwable th3) {
                objK3 = Jp0.k(th3);
            }
            Object obj = strH;
            if (!(objK3 instanceof C2439p80)) {
                obj = objK3;
            }
            String str3 = (String) obj;
            AbstractC1474fG.g(str3);
            if (!AbstractC1899jh0.U(str3, "http://", true) && !AbstractC1899jh0.U(str3, "https://", true)) {
                str3 = null;
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        String str4 = str2;
        try {
            C2349oE c2349oE2 = new C2349oE();
            c2349oE2.g(null, str4);
            c2446pEB2 = c2349oE2.b();
        } catch (IllegalArgumentException unused2) {
            c2446pEB2 = null;
        }
        String str5 = c2446pEB2 != null ? c2446pEB2.d : null;
        if (str5 == null) {
            str5 = "";
        }
        String strL0 = AbstractC1119bh0.l0(str5, "www.");
        String strA0 = AbstractC1119bh0.A0(strL0, '.', strL0);
        if (AbstractC1119bh0.W(strA0, "nupload", true)) {
            strA0 = "Nupload";
        } else if (AbstractC1119bh0.W(strA0, "voe", true)) {
            strA0 = "Voe";
        } else if (AbstractC1119bh0.W(strA0, "waaw", true)) {
            strA0 = "Waaw";
        } else if (AbstractC1119bh0.W(strA0, "upstream", true)) {
            strA0 = "Upstream";
        } else if (AbstractC1119bh0.W(strA0, "streamtape", true)) {
            strA0 = "Streamtape";
        } else if (AbstractC1899jh0.O(strA0)) {
            strA0 = "Server";
        } else if (strA0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = strA0.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.ROOT;
                AbstractC1474fG.i(locale, "ROOT");
                strValueOf = AbstractC3021v9.D(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            String strSubstring = strA0.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strA0 = sb.toString();
        }
        return new Ds0(str4, str + " - " + strA0 + " " + i, str4, null, 56);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    public static List D(C3176wp c3176wp) {
        String str;
        C3176wp c3176wpX;
        String string;
        String str2;
        String strD;
        String strS;
        C3176wp c3176wpX2;
        String str3;
        C3176wp c3176wpX3;
        String str4;
        C3176wp c3176wpX4;
        String strZ;
        Integer numB;
        C3176wp c3176wpX5;
        String str5;
        String strI;
        String strZ2;
        String string2;
        String strZ3;
        String string3;
        String strZ4;
        String string4;
        String strZ5;
        String string5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3370yp<C3176wp> c3370ypW = c3176wp.W("article.TPost.B, div.TPost.B");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        for (C3176wp c3176wp2 : c3370ypW) {
            AbstractC1474fG.g(c3176wp2);
            C3176wp c3176wpX6 = c3176wp2.X("a[href*='/pelicula/'], a[href*='/serie/'], a[href*='/ver/']");
            Cd0 c1387eR = null;
            if (c3176wpX6 != null) {
                String strA = A(c3176wpX6.d("href"));
                C3176wp c3176wpX7 = c3176wp2.X("h2.Title, .TPMvCn .Title, .Title");
                if (c3176wpX7 == null || (strZ5 = c3176wpX7.Z()) == null || (string5 = AbstractC1119bh0.E0(strZ5).toString()) == null) {
                    c3176wpX = c3176wpX6.X("img");
                    if (c3176wpX != null || (strD = c3176wpX.d("alt")) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.l0(AbstractC1119bh0.l0(strD, "Poster "), "Image ")).toString()) == null || !(!AbstractC1899jh0.O(string))) {
                        string = null;
                    }
                    if (string != null) {
                        str2 = string;
                        strS = s(c3176wp2.X(".Image img, img"));
                        c3176wpX2 = c3176wp2.X(".Description > p:not(.Genre)");
                        if (c3176wpX2 != null || (strZ4 = c3176wpX2.Z()) == null || (string4 = AbstractC1119bh0.E0(strZ4).toString()) == null || !(!AbstractC1899jh0.O(string4))) {
                            str3 = null;
                        } else {
                            str3 = string4;
                        }
                        c3176wpX3 = c3176wp2.X(".Info .Date, .Qlty.Yr");
                        if (c3176wpX3 != null || (strZ3 = c3176wpX3.Z()) == null || (string3 = AbstractC1119bh0.E0(strZ3).toString()) == null || !(!AbstractC1899jh0.O(string3))) {
                            str4 = null;
                        } else {
                            str4 = string3;
                        }
                        c3176wpX4 = c3176wp2.X(".Info .Time");
                        if (c3176wpX4 != null) {
                            strZ = c3176wpX4.Z();
                        } else {
                            strZ = null;
                        }
                        numB = B(strZ);
                        c3176wpX5 = c3176wp2.X(".Qlty:not(.Yr)");
                        if (c3176wpX5 != null || (strZ2 = c3176wpX5.Z()) == null || (string2 = AbstractC1119bh0.E0(strZ2).toString()) == null) {
                            str5 = null;
                        } else {
                            if (AbstractC1899jh0.O(string2)) {
                                string2 = null;
                            }
                            str5 = string2;
                        }
                        Locale locale = Locale.ROOT;
                        strI = AbstractC1701hf0.i(locale, "ROOT", strA, locale, "toLowerCase(...)");
                        if (!AbstractC1119bh0.W(strI, "/pelicula/", false) || AbstractC1119bh0.W(strI, "/ver/", false)) {
                            c1387eR = new C1387eR(strA, str2, str3, str4, numB, null, str5, null, strS, null, null, null, null, null, null, 32416);
                        } else if (AbstractC1119bh0.W(strI, "/serie/", false)) {
                            c1387eR = new C2109lo0(strA, str2, str3, str4, numB, null, str5, null, strS, null, null, null, null, null, null, null, 65184);
                        }
                    }
                } else {
                    if (!(!AbstractC1899jh0.O(string5))) {
                        string5 = null;
                    }
                    if (string5 != null) {
                        str2 = string5;
                    } else {
                        c3176wpX = c3176wpX6.X("img");
                        if (c3176wpX != null) {
                            string = null;
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            str2 = string;
                        }
                    }
                    strS = s(c3176wp2.X(".Image img, img"));
                    c3176wpX2 = c3176wp2.X(".Description > p:not(.Genre)");
                    if (c3176wpX2 != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    c3176wpX3 = c3176wp2.X(".Info .Date, .Qlty.Yr");
                    if (c3176wpX3 != null) {
                        str4 = null;
                    } else {
                        str4 = null;
                    }
                    c3176wpX4 = c3176wp2.X(".Info .Time");
                    if (c3176wpX4 != null) {
                        strZ = c3176wpX4.Z();
                    } else {
                        strZ = null;
                    }
                    numB = B(strZ);
                    c3176wpX5 = c3176wp2.X(".Qlty:not(.Yr)");
                    if (c3176wpX5 != null) {
                        str5 = null;
                    } else {
                        str5 = null;
                    }
                    Locale locale2 = Locale.ROOT;
                    strI = AbstractC1701hf0.i(locale2, "ROOT", strA, locale2, "toLowerCase(...)");
                    if (AbstractC1119bh0.W(strI, "/pelicula/", false)) {
                        c1387eR = new C1387eR(strA, str2, str3, str4, numB, null, str5, null, strS, null, null, null, null, null, null, 32416);
                    } else {
                        c1387eR = new C1387eR(strA, str2, str3, str4, numB, null, str5, null, strS, null, null, null, null, null, null, 32416);
                    }
                }
            }
            if (c1387eR != null) {
                if (c1387eR instanceof C1387eR) {
                    str = ((C1387eR) c1387eR).a;
                } else if (c1387eR instanceof C2109lo0) {
                    str = ((C2109lo0) c1387eR).a;
                }
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, c1387eR);
                }
            }
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC1474fG.i(collectionValues, "<get-values>(...)");
        return AbstractC0911Ye.x0(collectionValues);
    }

    public static String p(int i, String str) {
        String strG0 = AbstractC1119bh0.G0(str, '/');
        if (i <= 1) {
            return AbstractC1701hf0.d(strG0, "/");
        }
        return strG0 + "/page/" + i + "/";
    }

    public static String q(C0660On c0660On) {
        String str;
        String strA;
        String strS = s(c0660On.X("img.TPostBg"));
        if (strS != null) {
            return strS;
        }
        C3176wp c3176wpX = c0660On.X(".backdrop-image, .backdrop-image img, .card-hover-backdrop");
        if (c3176wpX == null) {
            return null;
        }
        String strD = c3176wpX.d("data-backdrop");
        AbstractC1474fG.g(strD);
        if (!(!AbstractC1899jh0.O(strD))) {
            strD = null;
        }
        if (strD != null) {
            String strA2 = A(strD);
            if (AbstractC1899jh0.O(strA2)) {
                return null;
            }
            return strA2;
        }
        String strD2 = c3176wpX.d("src");
        AbstractC1474fG.g(strD2);
        if (!(!AbstractC1899jh0.O(strD2))) {
            strD2 = null;
        }
        if (strD2 != null) {
            String strA3 = A(strD2);
            if (AbstractC1899jh0.O(strA3)) {
                return null;
            }
            return strA3;
        }
        Pattern patternCompile = Pattern.compile("url\\([\"']?([^\"')]+)");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strD3 = c3176wpX.d("style");
        AbstractC1474fG.i(strD3, "attr(...)");
        Matcher matcher = patternCompile.matcher(strD3);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, strD3);
        if (jnA == null || (str = (String) AbstractC0911Ye.e0(1, jnA.a())) == null || (strA = A(str)) == null || AbstractC1899jh0.O(strA)) {
            return null;
        }
        return strA;
    }

    public static ArrayList r(C3176wp c3176wp) {
        C3370yp<C3176wp> c3370ypW = c3176wp.W(".Description .Genre a[href*='/genero/']");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp2 : c3370ypW) {
            String strA = A(c3176wp2.d("href"));
            String strZ = c3176wp2.Z();
            AbstractC1474fG.i(strZ, "text(...)");
            String strG0 = AbstractC1119bh0.G0(AbstractC1119bh0.E0(strZ).toString(), ',');
            C2420oz c2420oz = (AbstractC1899jh0.O(strA) || AbstractC1899jh0.O(strG0)) ? null : new C2420oz(strA, strG0, C1233cq.l);
            if (c2420oz != null) {
                arrayList.add(c2420oz);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C2420oz) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String s(C3176wp c3176wp) {
        Object objB;
        if (c3176wp == null) {
            return null;
        }
        C3074vm0 c3074vm0M = Vb0.M(Vb0.O("data-src", "data-lazy-src", "data-original", "src"), new C0717Qs(1, c3176wp, C3176wp.class, "attr", "attr(Ljava/lang/String;)Ljava/lang/String;", 0, 5));
        Iterator it = c3074vm0M.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                objB = null;
                break;
            }
            objB = c3074vm0M.b.b(it.next());
            String str = (String) objB;
            AbstractC1474fG.g(str);
            if ((!AbstractC1899jh0.O(str)) && !AbstractC1899jh0.U(str, "data:image", true)) {
                break;
            }
        }
        String strA0 = (String) objB;
        if (strA0 == null) {
            String strD = c3176wp.d("srcset");
            AbstractC1474fG.i(strD, "attr(...)");
            String string = AbstractC1119bh0.E0(AbstractC1119bh0.A0(strD, ',', strD)).toString();
            strA0 = AbstractC1119bh0.A0(string, ' ', string);
            if (!(!AbstractC1899jh0.O(strA0))) {
                strA0 = null;
            }
        }
        String strA = A(strA0);
        if (AbstractC1899jh0.O(strA)) {
            return null;
        }
        return strA;
    }

    public static String t(C3176wp c3176wp) {
        ZF zfB;
        Object objB;
        C3176wp c3176wpX = c3176wp.X(".Description");
        if (c3176wpX == null) {
            return null;
        }
        List listM = c3176wpX.m();
        AbstractC1474fG.i(listM, "childNodes(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (obj instanceof Qi0) {
                arrayList.add(obj);
            }
        }
        String strH0 = AbstractC0911Ye.h0(arrayList, " ", null, null, C1182cH.E, 30);
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strH0).replaceAll(" ");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        String string = AbstractC1119bh0.E0(AbstractC1119bh0.I0(AbstractC1119bh0.E0(strReplaceAll).toString(), ':')).toString();
        if (string.length() <= 20) {
            string = null;
        }
        if (string == null) {
            C3370yp c3370ypW = c3176wpX.W("p:not([class])");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            C3074vm0 c3074vm0M = Vb0.M(AbstractC0911Ye.U(c3370ypW), C1182cH.F);
            Iterator it = c3074vm0M.a.iterator();
            do {
                if (!it.hasNext()) {
                    objB = null;
                    break;
                }
                objB = c3074vm0M.b.b(it.next());
            } while (((String) objB).length() <= 20);
            string = (String) objB;
            if (string == null) {
                return null;
            }
        }
        Pattern patternCompile2 = Pattern.compile("\\bRecuerda\\s+que\\b", C3325yL.p(2));
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        Matcher matcher = patternCompile2.matcher(string);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, string);
        Integer numValueOf = (jnA == null || (zfB = jnA.b()) == null) ? null : Integer.valueOf(zfB.l);
        String strSubstring = string.substring(0, numValueOf != null ? numValueOf.intValue() : string.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        String string2 = AbstractC1119bh0.E0(strSubstring).toString();
        if (AbstractC1899jh0.O(string2)) {
            return null;
        }
        return string2;
    }

    public static ArrayList u(C3370yp c3370yp) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3370yp.iterator();
        while (it.hasNext()) {
            C3176wp c3176wp = (C3176wp) it.next();
            String strA = A(c3176wp.d("href"));
            String strZ = c3176wp.Z();
            AbstractC1474fG.i(strZ, "text(...)");
            String strG0 = AbstractC1119bh0.G0(AbstractC1119bh0.E0(strZ).toString(), ',');
            C1688hY c1688hY = (AbstractC1899jh0.O(strA) || AbstractC1899jh0.O(strG0)) ? null : new C1688hY(strA, strG0, null, null, 12);
            if (c1688hY != null) {
                arrayList.add(c1688hY);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C1688hY) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String v(C0660On c0660On) {
        I60 i60 = new I60("\\b(?:4K|2160p|1080p|720p|HD|CAM)\\b", J60.IGNORE_CASE);
        C3370yp c3370ypW = c0660On.W(".Button.sgty span");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        return (String) Vb0.I(Vb0.N(Vb0.M(AbstractC0911Ye.U(c3370ypW), C1182cH.G), new io.sentry.android.replay.v(14, i60)));
    }

    public static List w(C0660On c0660On, String str) {
        Object next;
        String str2;
        String str3;
        String strZ;
        C3370yp c3370ypW = c0660On.W("aside .Wdgt.widget_postlist");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        Iterator it = c3370ypW.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3176wp c3176wpX = ((C3176wp) next).X(".Title");
            if (c3176wpX != null && (strZ = c3176wpX.Z()) != null && AbstractC1119bh0.W(strZ, "Más títulos como este", true)) {
                break;
            }
        }
        C3176wp c3176wp = (C3176wp) next;
        if (c3176wp == null) {
            return C1233cq.l;
        }
        List listD = D(c3176wp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof Cd0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Cd0 cd0 = (Cd0) obj2;
            if (cd0 instanceof C1387eR) {
                str3 = ((C1387eR) cd0).a;
            } else {
                if (!(cd0 instanceof C2109lo0)) {
                    throw new C0730Rf();
                }
                str3 = ((C2109lo0) cd0).a;
            }
            if (!AbstractC1474fG.b(str3, str)) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            Cd0 cd1 = (Cd0) obj3;
            if (cd1 instanceof C1387eR) {
                str2 = ((C1387eR) cd1).a;
            } else {
                if (!(cd1 instanceof C2109lo0)) {
                    throw new C0730Rf();
                }
                str2 = ((C2109lo0) cd1).a;
            }
            if (hashSet.add(str2)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static String x(C3176wp c3176wp) {
        String strZ;
        C3176wp c3176wpX = c3176wp.X("h1.Title, h1");
        String string = (c3176wpX == null || (strZ = c3176wpX.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
        if (string == null) {
            string = "";
        }
        Pattern patternCompile = Pattern.compile("^Ver\\s+(?:Película\\s+|Serie\\s+)?", C3325yL.p(2));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("^Serie\\s+", C3325yL.p(2));
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
        return AbstractC1119bh0.E0(strReplaceAll2).toString();
    }

    public static String z(String str) {
        Locale locale = Locale.ROOT;
        AbstractC1474fG.i(locale, "ROOT");
        String upperCase = str.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
        if (AbstractC1119bh0.W(upperCase, "LATINO", false)) {
            return "Latino";
        }
        if (AbstractC1119bh0.W(upperCase, "CASTELLANO", false) || AbstractC1119bh0.W(upperCase, "ESPANOL", false) || AbstractC1119bh0.W(upperCase, "ESPAÑOL", false)) {
            return "Castellano";
        }
        if (AbstractC1119bh0.W(upperCase, "SUBTITULADO", false) || AbstractC1119bh0.W(upperCase, "SUBTITLED", false)) {
            return "Subtitulado";
        }
        if (AbstractC1899jh0.O(str)) {
            return "Server";
        }
        String string = AbstractC1119bh0.E0(str).toString();
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = string.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC3021v9.D(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = string.substring(1);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws UnsupportedEncodingException {
        PX px;
        String strT;
        QX qx;
        C3176wp c3176wp;
        C3176wp c3176wpX;
        if (interfaceC0473Hh instanceof PX) {
            px = (PX) interfaceC0473Hh;
            int i2 = px.f456o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                px.f456o = i2 - Integer.MIN_VALUE;
            } else {
                px = new PX(this, interfaceC0473Hh);
            }
        } else {
            px = new PX(this, interfaceC0473Hh);
        }
        Object objA = px.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = px.f456o;
        if (i3 != 0) {
            if (i3 == 1) {
                Jp0.O(objA);
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qx = px.l;
            Jp0.O(objA);
            c3176wp = (C0660On) objA;
            c3176wpX = c3176wp.X(".TpRwCont main > section");
            if (c3176wpX != null) {
                c3176wp = c3176wpX;
            }
            qx.getClass();
            return D(c3176wp);
        }
        Jp0.O(objA);
        if (AbstractC1899jh0.O(str)) {
            px.f456o = 1;
            objA = y(px);
            return objA == enumC1706hi ? enumC1706hi : objA;
        }
        String strEncode = URLEncoder.encode(AbstractC1119bh0.E0(str).toString(), "UTF-8");
        if (i <= 1) {
            strT = AbstractC1701hf0.t("https://pelisflix1.link/?s=", strEncode);
        } else {
            strT = "https://pelisflix1.link/page/" + i + "/?s=" + strEncode;
        }
        px.l = this;
        px.f456o = 2;
        objA = c.a(strT, px);
        if (objA == enumC1706hi) {
            return enumC1706hi;
        }
        qx = this;
        c3176wp = (C0660On) objA;
        c3176wpX = c3176wp.X(".TpRwCont main > section");
        if (c3176wpX != null) {
            c3176wp = c3176wpX;
        }
        qx.getClass();
        return D(c3176wp);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        JX jx;
        String str2;
        QX qx;
        String strZ;
        if (interfaceC0473Hh instanceof JX) {
            jx = (JX) interfaceC0473Hh;
            int i = jx.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx.p = i - Integer.MIN_VALUE;
            } else {
                jx = new JX(this, interfaceC0473Hh);
            }
        } else {
            jx = new JX(this, interfaceC0473Hh);
        }
        Object obj = jx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = jx.p;
        if (i2 == 0) {
            Jp0.O(obj);
            String strA = A(str);
            jx.l = this;
            jx.m = strA;
            jx.p = 1;
            Object objA = c.a(strA, jx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strA;
            obj = objA;
            qx = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = jx.m;
            qx = jx.l;
            Jp0.O(obj);
            str2 = str3;
        }
        C0660On c0660On = (C0660On) obj;
        C3176wp c3176wpX = c0660On.X("article.TPost.A .TPMvCn");
        if (c3176wpX == null) {
            return new C1387eR(str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766);
        }
        qx.getClass();
        String strQ = q(c0660On);
        String strX = x(c3176wpX);
        String strT = t(c3176wpX);
        C3176wp c3176wpX2 = c3176wpX.X(".Info .Date");
        String string = (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
        C3176wp c3176wpX3 = c3176wpX.X(".Info .Time");
        Integer numB = B(c3176wpX3 != null ? c3176wpX3.Z() : null);
        String strV = v(c0660On);
        String strS = s(c3176wpX.X(".Image img"));
        String str4 = strS == null ? strQ : strS;
        ArrayList arrayListR = r(c3176wpX);
        C3370yp c3370ypW = c3176wpX.W(".Description .Director a[href]");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayListU = u(c3370ypW);
        C3370yp c3370ypW2 = c3176wpX.W(".Description .Cast a[href]");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        return new C1387eR(str2, strX, strT, string, numB, null, strV, null, str4, strQ, arrayListR, arrayListU, u(c3370ypW2), w(c0660On, str2), null, 16544);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[PHI: r2
  0x0096: PHI (r2v11 java.lang.Integer) = (r2v7 java.lang.Integer), (r2v18 java.lang.Integer) binds: [B:38:0x00d3, B:30:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        FX fx;
        Integer numJ;
        String str3;
        String string;
        String str4;
        C3176wp c3176wpX;
        String strZ;
        String strZ2;
        String string2;
        if (interfaceC0473Hh instanceof FX) {
            fx = (FX) interfaceC0473Hh;
            int i = fx.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                fx.n = i - Integer.MIN_VALUE;
            } else {
                fx = new FX(this, interfaceC0473Hh);
            }
        } else {
            fx = new FX(this, interfaceC0473Hh);
        }
        Object objA = fx.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = fx.n;
        if (i2 == 0) {
            Jp0.O(objA);
            String strA = A(str);
            fx.n = 1;
            objA = c.a(strA, fx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C3370yp<C3176wp> c3370ypW = ((C0660On) objA).W("section.SeasonBx .TPTblCn tr");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX2 = c3176wp.X(".MvTbTtl a[href*='/episodio/']");
            Object c0456Gq = null;
            if (c3176wpX2 != null) {
                String strA2 = A(c3176wpX2.d("href"));
                C3176wp c3176wpX3 = c3176wp.X(".Num");
                if (c3176wpX3 == null || (strZ2 = c3176wpX3.Z()) == null || (string2 = AbstractC1119bh0.E0(strZ2).toString()) == null || (numJ = AbstractC1802ih0.J(string2)) == null) {
                    Pattern patternCompile = Pattern.compile("-(\\d+)x(\\d+)/?$", C3325yL.p(2));
                    AbstractC1474fG.i(patternCompile, "compile(...)");
                    AbstractC1474fG.j(strA2, "input");
                    Matcher matcher = patternCompile.matcher(strA2);
                    AbstractC1474fG.i(matcher, "matcher(...)");
                    JN jnA = AbstractC1370eA.a(matcher, 0, strA2);
                    numJ = (jnA == null || (str3 = (String) AbstractC0911Ye.e0(2, jnA.a())) == null) ? null : AbstractC1802ih0.J(str3);
                    if (numJ != null) {
                        int iIntValue = numJ.intValue();
                        String strZ3 = c3176wpX2.Z();
                        AbstractC1474fG.i(strZ3, "text(...)");
                        string = AbstractC1119bh0.E0(strZ3).toString();
                        if (AbstractC1899jh0.O(string)) {
                            str4 = null;
                        } else {
                            str4 = string;
                        }
                        c3176wpX = c3176wp.X(".Date");
                        if (c3176wpX != null && (strZ = c3176wpX.Z()) != null) {
                            c0456Gq = AbstractC1119bh0.E0(strZ).toString();
                        }
                        c0456Gq = new C0456Gq(strA2, iIntValue, str4, c0456Gq, s(c3176wp.X(".MvTbImg img")), null, null, 96);
                    }
                } else {
                    int iIntValue2 = numJ.intValue();
                    String strZ4 = c3176wpX2.Z();
                    AbstractC1474fG.i(strZ4, "text(...)");
                    string = AbstractC1119bh0.E0(strZ4).toString();
                    if (AbstractC1899jh0.O(string)) {
                        str4 = null;
                    } else {
                        str4 = string;
                    }
                    c3176wpX = c3176wp.X(".Date");
                    if (c3176wpX != null) {
                        c0456Gq = AbstractC1119bh0.E0(strZ).toString();
                    }
                    c0456Gq = new C0456Gq(strA2, iIntValue2, str4, c0456Gq, s(c3176wp.X(".MvTbImg img")), null, null, 96);
                }
            }
            if (c0456Gq != null) {
                arrayList.add(c0456Gq);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C0456Gq) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0911Ye.r0(arrayList2, new N2(21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        OX ox;
        QX qx;
        if (interfaceC0473Hh instanceof OX) {
            ox = (OX) interfaceC0473Hh;
            int i2 = ox.f434o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox.f434o = i2 - Integer.MIN_VALUE;
            } else {
                ox = new OX(this, interfaceC0473Hh);
            }
        } else {
            ox = new OX(this, interfaceC0473Hh);
        }
        Object objA = ox.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = ox.f434o;
        if (i3 == 0) {
            Jp0.O(objA);
            String strP = p(i, "https://pelisflix1.link/series-online/");
            ox.l = this;
            ox.f434o = 1;
            objA = c.a(strP, ox);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            qx = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qx = ox.l;
            Jp0.O(objA);
        }
        C3176wp c3176wp = (C0660On) objA;
        C3176wp c3176wpX = c3176wp.X(".TpRwCont main > section");
        if (c3176wpX != null) {
            c3176wp = c3176wpX;
        }
        qx.getClass();
        List listD = D(c3176wp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof C2109lo0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        MX mx;
        C3176wp c3176wpX;
        if (interfaceC0473Hh instanceof MX) {
            mx = (MX) interfaceC0473Hh;
            int i = mx.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx.n = i - Integer.MIN_VALUE;
            } else {
                mx = new MX(this, interfaceC0473Hh);
            }
        } else {
            mx = new MX(this, interfaceC0473Hh);
        }
        Object objA = mx.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = mx.n;
        if (i2 == 0) {
            Jp0.O(objA);
            String strA = A(str);
            mx.n = 1;
            objA = c.a(strA, mx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C0660On c0660On = (C0660On) objA;
        ArrayList arrayList = new ArrayList();
        C3370yp c3370ypW = c0660On.W(".optns-bx .drpdn");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        Iterator it = c3370ypW.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    C3370yp c3370ypW2 = c0660On.W(".Button.sgty[data-url]");
                    AbstractC1474fG.i(c3370ypW2, "select(...)");
                    for (Object obj : c3370ypW2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0937Ze.N();
                            throw null;
                        }
                        C3176wp c3176wp = (C3176wp) obj;
                        c3176wp.getClass();
                        AbstractC1332dr abstractC1332drK = A40.k(".drpdn");
                        Sr0.w(abstractC1332drK);
                        AbstractC1099bV abstractC1099bV = c3176wp;
                        while (true) {
                            AbstractC1099bV abstractC1099bV2 = abstractC1099bV.l;
                            if (abstractC1099bV2 == null) {
                                break;
                            }
                            abstractC1099bV = abstractC1099bV2;
                        }
                        C3176wp c3176wp2 = (C3176wp) abstractC1099bV;
                        C3176wp c3176wp3 = c3176wp;
                        while (!abstractC1332drK.b(c3176wp2, c3176wp3)) {
                            c3176wp3 = (C3176wp) c3176wp3.l;
                            if (c3176wp3 == null) {
                                c3176wp3 = null;
                                break;
                            }
                        }
                        String strU = (c3176wp3 == null || (c3176wpX = c3176wp3.X("button.bstd > span")) == null) ? null : c3176wpX.U();
                        if (strU == null) {
                            strU = "";
                        }
                        Ds0 ds0C = C(c3176wp, z(strU), i4);
                        if (ds0C != null) {
                            arrayList.add(ds0C);
                        }
                        i3 = i4;
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((Ds0) obj2).n)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
            C3176wp c3176wp4 = (C3176wp) it.next();
            C3176wp c3176wpX2 = c3176wp4.X("button.bstd > span");
            String strU2 = c3176wpX2 != null ? c3176wpX2.U() : null;
            if (strU2 == null) {
                strU2 = "";
            }
            if (AbstractC1899jh0.O(strU2)) {
                C3176wp c3176wpX3 = c3176wp4.X("button.bstd");
                String strU3 = c3176wpX3 != null ? c3176wpX3.U() : null;
                strU2 = strU3 != null ? strU3 : "";
            }
            String strZ = z(strU2);
            C3370yp c3370ypW3 = c3176wp4.W(".Button.sgty[data-url]");
            AbstractC1474fG.i(c3370ypW3, "select(...)");
            for (Object obj3 : c3370ypW3) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                C3176wp c3176wp5 = (C3176wp) obj3;
                AbstractC1474fG.g(c3176wp5);
                Ds0 ds0C2 = C(c3176wp5, strZ, i5);
                if (ds0C2 != null) {
                    arrayList.add(ds0C2);
                }
                i3 = i5;
            }
        }
    }

    @Override // o.Q30
    public final String f() {
        return "https://s.pelisflix1.link/flix/imgs/cropped-1F17F-p-button-128-192x192.png";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        IX ix;
        C0882Xb c0882Xb;
        Object next;
        C3176wp c3176wpX;
        String strZ;
        String string;
        if (interfaceC0473Hh instanceof IX) {
            ix = (IX) interfaceC0473Hh;
            int i = ix.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix.n = i - Integer.MIN_VALUE;
            } else {
                ix = new IX(this, interfaceC0473Hh);
            }
        } else {
            ix = new IX(this, interfaceC0473Hh);
        }
        Object objA = ix.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = ix.n;
        if (i2 == 0) {
            Jp0.O(objA);
            ix.n = 1;
            objA = c.a("https://pelisflix1.link/", ix);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C3370yp<C3176wp> c3370ypW = ((C0660On) objA).W(".TpRwCont main > section");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            c3176wp.getClass();
            Iterator it = new C3370yp(c3176wp.K()).iterator();
            do {
                c0882Xb = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C3176wp) next).Q("Top"));
            C3176wp c3176wp2 = (C3176wp) next;
            if (c3176wp2 != null && (c3176wpX = c3176wp2.X(".Title, h2, h3")) != null && (strZ = c3176wpX.Z()) != null && (string = AbstractC1119bh0.E0(strZ).toString()) != null) {
                if (!(!AbstractC1899jh0.O(string))) {
                    string = null;
                }
                if (string != null) {
                    List listD = D(c3176wp);
                    if (!(!listD.isEmpty())) {
                        listD = null;
                    }
                    if (listD != null) {
                        c0882Xb = new C0882Xb(string, listD);
                    }
                }
            }
            if (c0882Xb != null) {
                arrayList.add(c0882Xb);
            }
        }
        return arrayList;
    }

    @Override // o.Q30
    public final String getName() {
        return "PelisflixHD";
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        GX gx;
        String strA;
        QX qx;
        String strS;
        char cCharAt;
        String strValueOf;
        String strZ;
        if (interfaceC0473Hh instanceof GX) {
            gx = (GX) interfaceC0473Hh;
            int i2 = gx.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gx.p = i2 - Integer.MIN_VALUE;
            } else {
                gx = new GX(this, interfaceC0473Hh);
            }
        } else {
            gx = new GX(this, interfaceC0473Hh);
        }
        Object objA = gx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = gx.p;
        if (i3 == 0) {
            Jp0.O(objA);
            strA = A(str);
            String strP = p(i, strA);
            gx.l = this;
            gx.m = strA;
            gx.p = 1;
            objA = c.a(strP, gx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            qx = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strA = gx.m;
            qx = gx.l;
            Jp0.O(objA);
        }
        C3176wp c3176wp = (C0660On) objA;
        C3176wp c3176wpX = c3176wp.X(".TpRwCont main > section");
        if (c3176wpX != null) {
            c3176wp = c3176wpX;
        }
        C3176wp c3176wpX2 = c3176wp.X(".Top .Title, h1.Title, h1");
        if (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null || (strS = AbstractC1119bh0.E0(strZ).toString()) == null) {
            String strG0 = AbstractC1119bh0.G0(strA, '/');
            String strY0 = AbstractC1119bh0.y0(strG0, '/', strG0);
            qx.getClass();
            strS = AbstractC1899jh0.S(AbstractC1119bh0.A0(strY0, '?', strY0), '-', ' ');
            if (strS.length() > 0) {
                StringBuilder sb = new StringBuilder();
                cCharAt = strS.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    AbstractC1474fG.i(locale, "ROOT");
                    strValueOf = AbstractC3021v9.D(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                String strSubstring = strS.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb.append(strSubstring);
                strS = sb.toString();
            }
        } else {
            if (!(!AbstractC1899jh0.O(strS))) {
                strS = null;
            }
            if (strS == null) {
                String strG1 = AbstractC1119bh0.G0(strA, '/');
                String strY1 = AbstractC1119bh0.y0(strG1, '/', strG1);
                qx.getClass();
                strS = AbstractC1899jh0.S(AbstractC1119bh0.A0(strY1, '?', strY1), '-', ' ');
                if (strS.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    cCharAt = strS.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        Locale locale2 = Locale.ROOT;
                        AbstractC1474fG.i(locale2, "ROOT");
                        strValueOf = AbstractC3021v9.D(cCharAt, locale2);
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb2.append((Object) strValueOf);
                    String strSubstring2 = strS.substring(1);
                    AbstractC1474fG.i(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    strS = sb2.toString();
                }
            }
        }
        qx.getClass();
        List listD = D(c3176wp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof Cd0) {
                arrayList.add(obj);
            }
        }
        return new C2420oz(strA, strS, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        KX kx;
        QX qx;
        if (interfaceC0473Hh instanceof KX) {
            kx = (KX) interfaceC0473Hh;
            int i2 = kx.f363o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kx.f363o = i2 - Integer.MIN_VALUE;
            } else {
                kx = new KX(this, interfaceC0473Hh);
            }
        } else {
            kx = new KX(this, interfaceC0473Hh);
        }
        Object objA = kx.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = kx.f363o;
        if (i3 == 0) {
            Jp0.O(objA);
            String strP = p(i, "https://pelisflix1.link/peliculas-online/");
            kx.l = this;
            kx.f363o = 1;
            objA = c.a(strP, kx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            qx = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qx = kx.l;
            Jp0.O(objA);
        }
        C3176wp c3176wp = (C0660On) objA;
        C3176wp c3176wpX = c3176wp.X(".TpRwCont main > section");
        if (c3176wpX != null) {
            c3176wp = c3176wpX;
        }
        qx.getClass();
        List listD = D(c3176wp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        NX nx;
        String str2;
        QX qx;
        String strZ;
        Ma0 ma0;
        int iIntValue;
        String str3;
        String str4;
        Integer numJ;
        if (interfaceC0473Hh instanceof NX) {
            nx = (NX) interfaceC0473Hh;
            int i = nx.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                nx.p = i - Integer.MIN_VALUE;
            } else {
                nx = new NX(this, interfaceC0473Hh);
            }
        } else {
            nx = new NX(this, interfaceC0473Hh);
        }
        Object obj = nx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = nx.p;
        int i3 = 1;
        if (i2 == 0) {
            Jp0.O(obj);
            String strA = A(str);
            nx.l = this;
            nx.m = strA;
            nx.p = 1;
            Object objA = c.a(strA, nx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strA;
            obj = objA;
            qx = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = nx.m;
            qx = nx.l;
            Jp0.O(obj);
            str2 = str5;
        }
        C0660On c0660On = (C0660On) obj;
        C3176wp c3176wpX = c0660On.X("article.TPost.A .TPMvCn");
        if (c3176wpX == null) {
            return new C2109lo0(str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
        }
        qx.getClass();
        String strQ = q(c0660On);
        String strS = s(c3176wpX.X(".Image img"));
        if (strS == null) {
            strS = strQ;
        }
        C3370yp<C3176wp> c3370ypW = c0660On.W("section.SeasonBx a[href*='/temporada/']");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            String strA2 = A(c3176wp.d("href"));
            Pattern patternCompile = Pattern.compile("-(\\d+)/?$");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            AbstractC1474fG.j(strA2, "input");
            Matcher matcher = patternCompile.matcher(strA2);
            AbstractC1474fG.i(matcher, "matcher(...)");
            JN jnA = AbstractC1370eA.a(matcher, 0, strA2);
            if (jnA == null || (str4 = (String) AbstractC0911Ye.e0(i3, jnA.a())) == null || (numJ = AbstractC1802ih0.J(str4)) == null) {
                Pattern patternCompile2 = Pattern.compile("Temporada\\s+(\\d+)", C3325yL.p(2));
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                String strZ2 = c3176wp.Z();
                AbstractC1474fG.i(strZ2, "text(...)");
                Matcher matcher2 = patternCompile2.matcher(strZ2);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                JN jnA2 = AbstractC1370eA.a(matcher2, 0, strZ2);
                Integer numJ2 = (jnA2 == null || (str3 = (String) AbstractC0911Ye.e0(i3, jnA2.a())) == null) ? null : AbstractC1802ih0.J(str3);
                if (numJ2 != null) {
                    iIntValue = numJ2.intValue();
                } else {
                    ma0 = null;
                }
                if (ma0 != null) {
                    arrayList.add(ma0);
                }
                arrayList = arrayList;
                i3 = 1;
            } else {
                iIntValue = numJ.intValue();
            }
            int i4 = iIntValue;
            ma0 = new Ma0(strA2, i4, AbstractC1674hK.n(i4, "Temporada "), strS, null, null, 48);
            if (ma0 != null) {
                arrayList.add(ma0);
            }
            arrayList = arrayList;
            i3 = 1;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Ma0) obj2).a)) {
                arrayList2.add(obj2);
            }
        }
        List listR0 = AbstractC0911Ye.r0(arrayList2, new N2(22));
        String strX = x(c3176wpX);
        String strT = t(c3176wpX);
        C3176wp c3176wpX2 = c3176wpX.X(".Info .Date");
        String string = (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
        C3176wp c3176wpX3 = c3176wpX.X(".Info .Time");
        Integer numB = B(c3176wpX3 != null ? c3176wpX3.Z() : null);
        String strV = v(c0660On);
        ArrayList arrayListR = r(c3176wpX);
        C3370yp c3370ypW2 = c3176wpX.W(".Description .Director a[href]");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        ArrayList arrayListU = u(c3370ypW2);
        C3370yp c3370ypW3 = c3176wpX.W(".Description .Cast a[href]");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        return new C2109lo0(str2, strX, strT, string, numB, null, strV, null, strS, strQ, null, listR0, arrayListR, arrayListU, u(c3370ypW3), w(c0660On, str2), 1184);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws UnsupportedEncodingException {
        LX lx;
        String strA;
        QX qx;
        String str2;
        String strZ;
        String string;
        String string2;
        if (interfaceC0473Hh instanceof LX) {
            lx = (LX) interfaceC0473Hh;
            int i2 = lx.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lx.p = i2 - Integer.MIN_VALUE;
            } else {
                lx = new LX(this, interfaceC0473Hh);
            }
        } else {
            lx = new LX(this, interfaceC0473Hh);
        }
        Object objA = lx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = lx.p;
        if (i3 == 0) {
            Jp0.O(objA);
            strA = A(str);
            String strP = p(i, strA);
            lx.l = this;
            lx.m = strA;
            lx.p = 1;
            objA = c.a(strP, lx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            qx = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strA = lx.m;
            qx = lx.l;
            Jp0.O(objA);
        }
        String str3 = strA;
        C3176wp c3176wp = (C0660On) objA;
        C3176wp c3176wpX = c3176wp.X(".TpRwCont main > section");
        if (c3176wpX != null) {
            c3176wp = c3176wpX;
        }
        String strG0 = AbstractC1119bh0.G0(str3, '/');
        String strDecode = URLDecoder.decode(AbstractC1119bh0.y0(strG0, '/', strG0), "UTF-8");
        AbstractC1474fG.i(strDecode, "decode(...)");
        String string3 = AbstractC1119bh0.E0(AbstractC1899jh0.S(strDecode, '+', ' ')).toString();
        C3176wp c3176wpX2 = c3176wp.X(".Top .Title, h1.Title, h1");
        if (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null || (string = AbstractC1119bh0.E0(strZ).toString()) == null || (string2 = AbstractC1119bh0.E0(AbstractC1119bh0.w0(string, ':', string)).toString()) == null) {
            str2 = string3;
        } else {
            if (AbstractC1899jh0.O(string2)) {
                string2 = null;
            }
            if (string2 != null) {
                str2 = string2;
            } else {
                str2 = string3;
            }
        }
        qx.getClass();
        List listD = D(c3176wp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof Cd0) {
                arrayList.add(obj);
            }
        }
        return new C1688hY(str3, str2, null, arrayList, 4);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        int i = AbstractC3473zs.a;
        return C0622Nb.m(ds0.n, ds0, interfaceC0473Hh, 4);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable y(InterfaceC0473Hh interfaceC0473Hh) {
        HX hx;
        Object next;
        C3370yp<C3176wp> c3370ypW;
        Object next2;
        String strZ;
        if (interfaceC0473Hh instanceof HX) {
            hx = (HX) interfaceC0473Hh;
            int i = hx.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx.n = i - Integer.MIN_VALUE;
            } else {
                hx = new HX(this, interfaceC0473Hh);
            }
        } else {
            hx = new HX(this, interfaceC0473Hh);
        }
        Object objA = hx.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = hx.n;
        if (i2 == 0) {
            Jp0.O(objA);
            hx.n = 1;
            objA = c.a("https://pelisflix1.link/", hx);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C0660On c0660On = (C0660On) objA;
        C3370yp c3370ypW2 = c0660On.W("li.menu-item-has-children");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        Iterator it = c3370ypW2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3176wp c3176wp = (C3176wp) next;
            c3176wp.getClass();
            Iterator it2 = new C3370yp(c3176wp.K()).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!AbstractC1474fG.b(((C3176wp) next2).f1103o.l, "a"));
            C3176wp c3176wp2 = (C3176wp) next2;
            if (c3176wp2 != null && (strZ = c3176wp2.Z()) != null && AbstractC1119bh0.W(strZ, "GÉNEROS", true)) {
                break;
            }
        }
        C3176wp c3176wp3 = (C3176wp) next;
        if (c3176wp3 == null || (c3370ypW = c3176wp3.W("a[href*='/genero/']")) == null) {
            c3370ypW = c0660On.W("nav.Menu a[href*='/genero/']");
        }
        AbstractC1474fG.g(c3370ypW);
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp4 : c3370ypW) {
            String strA = A(c3176wp4.d("href"));
            String strZ2 = c3176wp4.Z();
            AbstractC1474fG.i(strZ2, "text(...)");
            String string = AbstractC1119bh0.E0(strZ2).toString();
            C2420oz c2420oz = (AbstractC1899jh0.O(strA) || AbstractC1899jh0.O(string)) ? null : new C2420oz(strA, string, C1233cq.l);
            if (c2420oz != null) {
                arrayList.add(c2420oz);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C2420oz) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
