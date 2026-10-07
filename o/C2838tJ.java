package o;

import com.skidush.clonex.models.Video$Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.tJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2838tJ implements Q30 {
    public static final C2838tJ INSTANCE = new C2838tJ();
    private static final InterfaceC1181cG apiInterceptor;
    private static final String baseUrl = "https://lamovie.org/";
    private static final OV client;
    private static String dynamicApiPath = null;
    private static final Map<String, String> genresMap;
    private static final String imageBaseUrl = "https://lamovie.org//wp-content/uploads";
    private static final String language = "es";
    private static final String logo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS_8JCwXKSOdQ-ASPCcwpzENhIvfSlKeKfQg&s";
    private static final String name = "PELICULAS Y SERIES SOLO PARAGUAY";
    private static final InterfaceC3032vJ service;

    static {
        X9 x9 = new X9(3);
        apiInterceptor = x9;
        NV nvJ = AbstractC1370eA.j();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(15L, timeUnit);
        nvJ.e(15L, timeUnit);
        nvJ.c.add(x9);
        OV ov = new OV(nvJ);
        client = ov;
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://lamovie.org/");
        ((ArrayList) c1583gRK.f793o).add(DA.c());
        c1583gRK.m = ov;
        service = (InterfaceC3032vJ) c1583gRK.m().b(InterfaceC3032vJ.class);
        genresMap = AbstractC3327yN.z(new C1101bX("32", "Acción"), new C1101bX("520", "Animación"), new C1101bX("130", "Aventura"), new C1101bX("131", "Ciencia Ficción"), new C1101bX("18", "Comedia"), new C1101bX("180", "Crimen"), new C1101bX("164", "Documental"), new C1101bX("17", "Drama"), new C1101bX("398", "Familia"), new C1101bX("229", "Fantasía"), new C1101bX("165", "Historia"), new C1101bX("703", "Kids"), new C1101bX("97", "Misterio"), new C1101bX("8", "Música"), new C1101bX("115", "Romance"), new C1101bX("33", "Suspense"), new C1101bX("96", "Terror"), new C1101bX("674", "Western"));
    }

    public static C1855j80 p(D50 d50) {
        C1951k70 c1951k70C = d50.e;
        String str = c1951k70C.a.i;
        if (AbstractC1119bh0.W(str, "/wp-api/v1/", false)) {
            synchronized (INSTANCE) {
                try {
                    if (dynamicApiPath == null) {
                        try {
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
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            nv.i(10L, timeUnit);
                            nv.e(10L, timeUnit);
                            OV ov = new OV(nv);
                            C0560Kq c0560Kq = new C0560Kq();
                            String str2 = baseUrl;
                            c0560Kq.u(str2);
                            c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
                            C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
                            if (c1855j80G.p()) {
                                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : "";
                                Pattern patternCompile = Pattern.compile("fastApi:\\s*['\"]([^'\"]+)['\"]");
                                AbstractC1474fG.i(patternCompile, "compile(...)");
                                Matcher matcher = patternCompile.matcher(strQ);
                                AbstractC1474fG.i(matcher, "matcher(...)");
                                JN jnA = AbstractC1370eA.a(matcher, 0, strQ);
                                if (jnA != null) {
                                    String strM0 = AbstractC1119bh0.m0(AbstractC1119bh0.l0((String) ((HN) jnA.a()).get(1), str2), "/");
                                    dynamicApiPath = strM0;
                                    if (!AbstractC1899jh0.U(strM0, "/", false)) {
                                        dynamicApiPath = "/" + dynamicApiPath;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str3 = dynamicApiPath;
            if (str3 != null && !AbstractC1474fG.b(str3, "/wp-api/v1")) {
                String strR = AbstractC1899jh0.R(str, "/wp-api/v1", str3, false);
                C0560Kq c0560KqA = c1951k70C.a();
                c0560KqA.u(strR);
                c1951k70C = c0560KqA.c();
            }
        }
        return d50.b(c1951k70C);
    }

    public static C1387eR q(C1867jJ c1867jJ) {
        String strA;
        String strB;
        C1379eJ c1379eJB = c1867jJ.b();
        String strD = (c1379eJB == null || (strB = c1379eJB.b()) == null) ? null : AbstractC1701hf0.d(imageBaseUrl, strB);
        C1379eJ c1379eJB2 = c1867jJ.b();
        String strD2 = (c1379eJB2 == null || (strA = c1379eJB2.a()) == null) ? null : AbstractC1701hf0.d(imageBaseUrl, strA);
        Object objF = c1867jJ.f();
        if (objF == null) {
            objF = Long.valueOf(c1867jJ.a());
        }
        String str = objF + "|" + c1867jJ.a();
        String strG = c1867jJ.g();
        if (strG == null) {
            strG = "";
        }
        String str2 = strG;
        String strC = c1867jJ.c();
        String strD3 = c1867jJ.d();
        return new C1387eR(str, str2, strC, c1867jJ.e(), null, null, null, strD3 != null ? AbstractC1705hh0.I(strD3) : null, strD, strD2, null, null, null, null, null, 31856);
    }

    public static C2109lo0 r(C1867jJ c1867jJ) {
        String strA;
        String strB;
        C1379eJ c1379eJB = c1867jJ.b();
        String strD = (c1379eJB == null || (strB = c1379eJB.b()) == null) ? null : AbstractC1701hf0.d(imageBaseUrl, strB);
        C1379eJ c1379eJB2 = c1867jJ.b();
        String strD2 = (c1379eJB2 == null || (strA = c1379eJB2.a()) == null) ? null : AbstractC1701hf0.d(imageBaseUrl, strA);
        Object objF = c1867jJ.f();
        if (objF == null) {
            objF = Long.valueOf(c1867jJ.a());
        }
        String str = objF + "|" + c1867jJ.a();
        String strG = c1867jJ.g();
        if (strG == null) {
            strG = "";
        }
        String str2 = strG;
        String strC = c1867jJ.c();
        String strD3 = c1867jJ.d();
        return new C2109lo0(str, str2, strC, c1867jJ.e(), null, null, null, strD3 != null ? AbstractC1705hh0.I(strD3) : null, strD, strD2, null, null, null, null, null, null, 64624);
    }

    public static String s(String str) {
        Object objK;
        try {
            objK = new URI(str).getHost();
            if (objK == null) {
                objK = "";
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.l0((String) (objK instanceof C2439p80 ? "" : objK), "www."), ".");
        if (strB0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strB0.charAt(0));
            AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = strB0.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strB0 = sb.toString();
        }
        return AbstractC1899jh0.O(strB0) ? "Online" : strB0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C2741sJ c2741sJ;
        Cd0 cd0Q;
        if (interfaceC0473Hh instanceof C2741sJ) {
            c2741sJ = (C2741sJ) interfaceC0473Hh;
            int i2 = c2741sJ.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2741sJ.label = i2 - Integer.MIN_VALUE;
            } else {
                c2741sJ = new C2741sJ(this, interfaceC0473Hh);
            }
        } else {
            c2741sJ = new C2741sJ(this, interfaceC0473Hh);
        }
        Object objA = c2741sJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2741sJ.label;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i3 == 0) {
                Jp0.O(objA);
                if (AbstractC1899jh0.O(str)) {
                    Map<String, String> map = genresMap;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        arrayList.add(new C2420oz(entry.getKey(), entry.getValue()));
                    }
                    return arrayList;
                }
                InterfaceC3032vJ interfaceC3032vJ = service;
                c2741sJ.label = 1;
                objA = interfaceC3032vJ.a(str, i, c2741sJ);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objA);
            }
            C1477fJ c1477fJ = (C1477fJ) objA;
            if (!AbstractC1474fG.b(c1477fJ.b(), Boolean.FALSE)) {
                return c1233cq;
            }
            C0989aJ c0989aJA = c1477fJ.a();
            if ((c0989aJA != null ? c0989aJA.a() : null) == null) {
                return c1233cq;
            }
            List<C1867jJ> listA = c1477fJ.a().a();
            ArrayList arrayList2 = new ArrayList();
            for (C1867jJ c1867jJ : listA) {
                String strH = c1867jJ.h();
                if (AbstractC1474fG.b(strH, "tvshows")) {
                    INSTANCE.getClass();
                    cd0Q = r(c1867jJ);
                } else if (AbstractC1474fG.b(strH, "movies")) {
                    INSTANCE.getClass();
                    cd0Q = q(c1867jJ);
                } else {
                    cd0Q = null;
                }
                if (cd0Q != null) {
                    arrayList2.add(cd0Q);
                }
            }
            return arrayList2;
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C2257nJ c2257nJ;
        C2838tJ c2838tJ;
        String str2 = str;
        if (interfaceC0473Hh instanceof C2257nJ) {
            c2257nJ = (C2257nJ) interfaceC0473Hh;
            int i = c2257nJ.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2257nJ.label = i - Integer.MIN_VALUE;
            } else {
                c2257nJ = new C2257nJ(this, interfaceC0473Hh);
            }
        } else {
            c2257nJ = new C2257nJ(this, interfaceC0473Hh);
        }
        Object objE = c2257nJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2257nJ.label;
        try {
            if (i2 == 0) {
                Jp0.O(objE);
                String strB0 = AbstractC1119bh0.B0(str2, "|");
                InterfaceC3032vJ interfaceC3032vJ = service;
                AbstractC1474fG.i(interfaceC3032vJ, "service");
                c2257nJ.L$0 = this;
                c2257nJ.L$1 = str2;
                c2257nJ.label = 1;
                objE = interfaceC3032vJ.e(strB0, "movies", c2257nJ);
                if (objE == enumC1706hi) {
                    return enumC1706hi;
                }
                c2838tJ = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) c2257nJ.L$1;
                c2838tJ = (C2838tJ) c2257nJ.L$0;
                Jp0.O(objE);
            }
            C3129wJ c3129wJ = (C3129wJ) objE;
            if (AbstractC1474fG.b(c3129wJ.b(), Boolean.FALSE) && c3129wJ.a() != null) {
                C1867jJ c1867jJA = c3129wJ.a();
                c2838tJ.getClass();
                return q(c1867jJA);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        String str3 = str2;
        return new C1387eR(str3, AbstractC1701hf0.t("Movie ", str3), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x003a, B:28:0x0092, B:30:0x00a0, B:32:0x00a7, B:35:0x00af, B:37:0x00b9, B:39:0x00bf, B:41:0x00c5, B:42:0x00d1, B:44:0x00d7, B:46:0x00e3, B:48:0x00f1, B:50:0x010d, B:53:0x0114, B:55:0x012a, B:57:0x0132, B:59:0x013b, B:61:0x0141, B:63:0x0147, B:65:0x014d, B:66:0x015e, B:67:0x0176, B:25:0x007f, B:71:0x0183, B:19:0x004c, B:22:0x005f, B:24:0x0072), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008f -> B:28:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object c(java.lang.String r26, java.lang.String r27, o.InterfaceC0473Hh r28) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2838tJ.c(java.lang.String, java.lang.String, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C2644rJ c2644rJ;
        if (interfaceC0473Hh instanceof C2644rJ) {
            c2644rJ = (C2644rJ) interfaceC0473Hh;
            int i2 = c2644rJ.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2644rJ.label = i2 - Integer.MIN_VALUE;
            } else {
                c2644rJ = new C2644rJ(this, interfaceC0473Hh);
            }
        } else {
            c2644rJ = new C2644rJ(this, interfaceC0473Hh);
        }
        Object objB = c2644rJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2644rJ.label;
        try {
            if (i3 == 0) {
                Jp0.O(objB);
                InterfaceC3032vJ interfaceC3032vJ = service;
                AbstractC1474fG.i(interfaceC3032vJ, "service");
                c2644rJ.label = 1;
                objB = interfaceC3032vJ.b(i, 20, "tvshows", c2644rJ);
                if (objB == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objB);
            }
            C1477fJ c1477fJ = (C1477fJ) objB;
            if (AbstractC1474fG.b(c1477fJ.b(), Boolean.FALSE)) {
                C0989aJ c0989aJA = c1477fJ.a();
                if ((c0989aJA != null ? c0989aJA.a() : null) != null) {
                    List<C1867jJ> listA = c1477fJ.a().a();
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
                    for (C1867jJ c1867jJ : listA) {
                        INSTANCE.getClass();
                        arrayList.add(r(c1867jJ));
                    }
                    return arrayList;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return C1233cq.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C2451pJ c2451pJ;
        String str2 = str;
        if (interfaceC0473Hh instanceof C2451pJ) {
            c2451pJ = (C2451pJ) interfaceC0473Hh;
            int i = c2451pJ.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2451pJ.label = i - Integer.MIN_VALUE;
            } else {
                c2451pJ = new C2451pJ(this, interfaceC0473Hh);
            }
        } else {
            c2451pJ = new C2451pJ(this, interfaceC0473Hh);
        }
        Object objH = c2451pJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2451pJ.label;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i2 == 0) {
                Jp0.O(objH);
                String strX0 = AbstractC1119bh0.x0(str2, "|", str2);
                if (!(!AbstractC1899jh0.O(strX0)) || AbstractC1474fG.b(strX0, str2)) {
                    strX0 = null;
                }
                if (strX0 != null) {
                    str2 = strX0;
                }
                InterfaceC3032vJ interfaceC3032vJ = service;
                c2451pJ.L$0 = str2;
                c2451pJ.label = 1;
                objH = interfaceC3032vJ.h(str2, 0, c2451pJ);
                if (objH == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objH);
            }
            C1673hJ c1673hJA = ((C1771iJ) objH).a();
            if (c1673hJA == null || AbstractC1474fG.b(c1673hJA.b(), Boolean.TRUE)) {
                return c1233cq;
            }
            ArrayList arrayList = new ArrayList();
            List<C2935uJ> listA = c1673hJA.a();
            if (listA != null) {
                for (C2935uJ c2935uJ : listA) {
                    String strC = c2935uJ.c();
                    if (strC != null) {
                        String str3 = (!(AbstractC1899jh0.O(strC) ^ true) || AbstractC1119bh0.W(strC, "embed.html?v=", false)) ? null : strC;
                        if (str3 != null) {
                            INSTANCE.getClass();
                            String strS = s(str3);
                            String strA = c2935uJ.a();
                            if (strA == null) {
                                strA = "Latino";
                            }
                            String strB = c2935uJ.b();
                            if (strB == null) {
                                strB = "HD";
                            }
                            arrayList.add(new Ds0(str3, strS + " [" + strB + "][" + strA + "]", null, null, 60));
                        }
                    }
                }
            }
            arrayList.size();
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }

    @Override // o.Q30
    public final String f() {
        return logo;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x015b A[Catch: Exception -> 0x0204, TRY_LEAVE, TryCatch #2 {Exception -> 0x0204, blocks: (B:69:0x0155, B:71:0x015b, B:91:0x01ff, B:14:0x003c, B:76:0x019c, B:72:0x016d, B:78:0x01aa, B:80:0x01b0, B:83:0x01b8, B:85:0x01c7, B:86:0x01dc, B:88:0x01e2, B:89:0x01f5), top: B:97:0x0028, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:76:0x019c, B:72:0x016d, B:78:0x01aa, B:80:0x01b0, B:83:0x01b8, B:85:0x01c7, B:86:0x01dc, B:88:0x01e2, B:89:0x01f5), top: B:101:0x003c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b0 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:76:0x019c, B:72:0x016d, B:78:0x01aa, B:80:0x01b0, B:83:0x01b8, B:85:0x01c7, B:86:0x01dc, B:88:0x01e2, B:89:0x01f5), top: B:101:0x003c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b8 A[Catch: Exception -> 0x0041, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:76:0x019c, B:72:0x016d, B:78:0x01aa, B:80:0x01b0, B:83:0x01b8, B:85:0x01c7, B:86:0x01dc, B:88:0x01e2, B:89:0x01f5), top: B:101:0x003c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2 A[Catch: Exception -> 0x0041, LOOP:0: B:86:0x01dc->B:88:0x01e2, LOOP_END, TryCatch #3 {Exception -> 0x0041, blocks: (B:14:0x003c, B:76:0x019c, B:72:0x016d, B:78:0x01aa, B:80:0x01b0, B:83:0x01b8, B:85:0x01c7, B:86:0x01dc, B:88:0x01e2, B:89:0x01f5), top: B:101:0x003c, outer: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0199 -> B:76:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object g(o.InterfaceC0473Hh r15) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2838tJ.g(o.Hh):java.lang.Object");
    }

    @Override // o.Q30
    public final String getName() {
        return name;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C2063lJ c2063lJ;
        String string;
        Object next;
        String str2;
        String string2;
        Cd0 cd0Q;
        if (interfaceC0473Hh instanceof C2063lJ) {
            c2063lJ = (C2063lJ) interfaceC0473Hh;
            int i2 = c2063lJ.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2063lJ.label = i2 - Integer.MIN_VALUE;
            } else {
                c2063lJ = new C2063lJ(this, interfaceC0473Hh);
            }
        } else {
            c2063lJ = new C2063lJ(this, interfaceC0473Hh);
        }
        Object objD = c2063lJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2063lJ.label;
        try {
            if (i3 == 0) {
                Jp0.O(objD);
                Iterator<T> it = genresMap.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1899jh0.N((String) ((Map.Entry) next).getValue(), str, true));
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (str2 = (String) entry.getKey()) == null) {
                    str2 = str;
                }
                InterfaceC3032vJ interfaceC3032vJ = service;
                AbstractC1474fG.i(interfaceC3032vJ, "service");
                c2063lJ.L$0 = str;
                c2063lJ.label = 1;
                objD = interfaceC3032vJ.d(i, 20, "{\"genres\":[" + str2 + "]}", "latest", "DESC", "movies", c2063lJ);
                if (objD == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c2063lJ.L$0;
                Jp0.O(objD);
            }
            C1477fJ c1477fJ = (C1477fJ) objD;
            if (AbstractC1474fG.b(c1477fJ.b(), Boolean.FALSE)) {
                C0989aJ c0989aJA = c1477fJ.a();
                if ((c0989aJA != null ? c0989aJA.a() : null) != null) {
                    List<C1867jJ> listA = c1477fJ.a().a();
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
                    for (C1867jJ c1867jJ : listA) {
                        if (AbstractC1474fG.b(c1867jJ.h(), "tvshows")) {
                            INSTANCE.getClass();
                            cd0Q = r(c1867jJ);
                        } else {
                            INSTANCE.getClass();
                            cd0Q = q(c1867jJ);
                        }
                        arrayList.add(cd0Q);
                    }
                    if (str.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(str.charAt(0));
                        AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                        sb.append((Object) upperCase);
                        String strSubstring = str.substring(1);
                        AbstractC1474fG.i(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        string2 = sb.toString();
                    } else {
                        string2 = str;
                    }
                    return new C2420oz(str, string2, arrayList);
                }
            }
        } catch (Exception unused) {
        }
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String strValueOf2 = String.valueOf(str.charAt(0));
            AbstractC1474fG.h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase2, "toUpperCase(...)");
            sb2.append((Object) upperCase2);
            String strSubstring2 = str.substring(1);
            AbstractC1474fG.i(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            string = sb2.toString();
        } else {
            string = str;
        }
        return new C2420oz(str, string, C1233cq.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C2354oJ c2354oJ;
        if (interfaceC0473Hh instanceof C2354oJ) {
            c2354oJ = (C2354oJ) interfaceC0473Hh;
            int i2 = c2354oJ.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2354oJ.label = i2 - Integer.MIN_VALUE;
            } else {
                c2354oJ = new C2354oJ(this, interfaceC0473Hh);
            }
        } else {
            c2354oJ = new C2354oJ(this, interfaceC0473Hh);
        }
        Object objF = c2354oJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2354oJ.label;
        try {
            if (i3 == 0) {
                Jp0.O(objF);
                InterfaceC3032vJ interfaceC3032vJ = service;
                AbstractC1474fG.i(interfaceC3032vJ, "service");
                c2354oJ.label = 1;
                objF = interfaceC3032vJ.f(i, 20, "movies", c2354oJ);
                if (objF == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objF);
            }
            C1477fJ c1477fJ = (C1477fJ) objF;
            if (AbstractC1474fG.b(c1477fJ.b(), Boolean.FALSE)) {
                C0989aJ c0989aJA = c1477fJ.a();
                if ((c0989aJA != null ? c0989aJA.a() : null) != null) {
                    List<C1867jJ> listA = c1477fJ.a().a();
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
                    for (C1867jJ c1867jJ : listA) {
                        INSTANCE.getClass();
                        arrayList.add(q(c1867jJ));
                    }
                    return arrayList;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return C1233cq.l;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b7 A[Catch: Exception -> 0x0041, TryCatch #4 {Exception -> 0x0041, blocks: (B:13:0x003c, B:54:0x0147, B:56:0x0155, B:58:0x015b, B:60:0x0166, B:62:0x016c, B:64:0x0182, B:66:0x0188, B:68:0x018e, B:70:0x01a4, B:73:0x01ac, B:75:0x01b7, B:77:0x01c0), top: B:102:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb A[Catch: Exception -> 0x022e, TryCatch #0 {Exception -> 0x022e, blocks: (B:84:0x01ec, B:86:0x01fb, B:90:0x0231, B:83:0x01e8), top: B:94:0x01e8 }] */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C2548qJ c2548qJ;
        String strB0;
        String str2;
        List listA;
        ArrayList arrayList;
        String str3;
        String str4;
        List list;
        List listC;
        String strR;
        C3129wJ c3129wJ;
        C1379eJ c1379eJB;
        String str5;
        C1379eJ c1379eJB2;
        String str6;
        String strG;
        String strD;
        Double dI;
        String strA;
        String strB;
        String str7 = str;
        if (interfaceC0473Hh instanceof C2548qJ) {
            c2548qJ = (C2548qJ) interfaceC0473Hh;
            int i = c2548qJ.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2548qJ.label = i - Integer.MIN_VALUE;
            } else {
                c2548qJ = new C2548qJ(this, interfaceC0473Hh);
            }
        } else {
            c2548qJ = new C2548qJ(this, interfaceC0473Hh);
        }
        Object objC = c2548qJ.result;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2548qJ.label;
        try {
            if (i2 == 0) {
                Jp0.O(objC);
                try {
                    String strX0 = AbstractC1119bh0.x0(str7, "|", str7);
                    strB0 = AbstractC1119bh0.B0(str7, "|");
                    InterfaceC3032vJ interfaceC3032vJ = service;
                    c2548qJ.L$0 = str7;
                    c2548qJ.L$1 = strB0;
                    c2548qJ.label = 1;
                    objC = interfaceC3032vJ.c(strX0, 1, 1, c2548qJ);
                    if (objC == enumC1706hi) {
                        return enumC1706hi;
                    }
                } catch (Exception e) {
                    e = e;
                    str2 = str7;
                    e.getMessage();
                    return new C2109lo0(str2, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c2548qJ.L$2;
                    str4 = (String) c2548qJ.L$1;
                    str3 = (String) c2548qJ.L$0;
                    try {
                        Jp0.O(objC);
                        c3129wJ = (C3129wJ) objC;
                        if (AbstractC1474fG.b(c3129wJ.b(), Boolean.FALSE) && c3129wJ.a() != null) {
                            C1867jJ c1867jJA = c3129wJ.a();
                            c1379eJB = c1867jJA.b();
                            if (c1379eJB != null || (strB = c1379eJB.b()) == null) {
                                str5 = null;
                            } else {
                                str5 = imageBaseUrl + strB;
                            }
                            c1379eJB2 = c1867jJA.b();
                            if (c1379eJB2 != null || (strA = c1379eJB2.a()) == null) {
                                str6 = null;
                            } else {
                                str6 = imageBaseUrl + strA;
                            }
                            strG = c1867jJA.g();
                            if (strG == null) {
                                strG = "";
                            }
                            String str8 = strG;
                            String strC = c1867jJA.c();
                            strD = c1867jJA.d();
                            if (strD != null) {
                                dI = AbstractC1705hh0.I(strD);
                            } else {
                                dI = null;
                            }
                            return new C2109lo0(str3, str8, strC, c1867jJA.e(), null, null, null, dI, str5, str6, null, list, null, null, null, null, 62576);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            e.getMessage();
                        } catch (Exception e3) {
                            e = e3;
                            str2 = str3;
                            e.getMessage();
                            return new C2109lo0(str2, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
                        }
                    }
                    List list2 = list;
                    strR = AbstractC1899jh0.R(str4, "-", " ", false);
                    if (strR.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(strR.charAt(0));
                        AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                        sb.append((Object) upperCase);
                        String strSubstring = strR.substring(1);
                        AbstractC1474fG.i(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        strR = sb.toString();
                    }
                    return new C2109lo0(str3, strR, null, null, null, null, null, null, null, null, null, list2, null, null, null, null, 63484);
                }
                String str9 = (String) c2548qJ.L$1;
                str2 = (String) c2548qJ.L$0;
                try {
                    Jp0.O(objC);
                    strB0 = str9;
                    str7 = str2;
                } catch (Exception e4) {
                    e = e4;
                    e.getMessage();
                    return new C2109lo0(str2, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
                }
            }
            InterfaceC3032vJ interfaceC3032vJ2 = service;
            AbstractC1474fG.i(interfaceC3032vJ2, "service");
            c2548qJ.L$0 = str7;
            c2548qJ.L$1 = strB0;
            c2548qJ.L$2 = arrayList;
            c2548qJ.label = 2;
            objC = interfaceC3032vJ2.g(strB0, "tvshows", c2548qJ);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
            str3 = str7;
            str4 = strB0;
            list = arrayList;
            c3129wJ = (C3129wJ) objC;
            if (AbstractC1474fG.b(c3129wJ.b(), Boolean.FALSE)) {
                C1867jJ c1867jJA2 = c3129wJ.a();
                c1379eJB = c1867jJA2.b();
                if (c1379eJB != null) {
                    str5 = null;
                } else {
                    str5 = null;
                }
                c1379eJB2 = c1867jJA2.b();
                if (c1379eJB2 != null) {
                    str6 = null;
                } else {
                    str6 = null;
                }
                strG = c1867jJA2.g();
                if (strG == null) {
                    strG = "";
                }
                String str10 = strG;
                String strC2 = c1867jJA2.c();
                strD = c1867jJA2.d();
                if (strD != null) {
                    dI = AbstractC1705hh0.I(strD);
                } else {
                    dI = null;
                }
                return new C2109lo0(str3, str10, strC2, c1867jJA2.e(), null, null, null, dI, str5, str6, null, list, null, null, null, null, 62576);
            }
            List list3 = list;
            strR = AbstractC1899jh0.R(str4, "-", " ", false);
            if (strR.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String strValueOf2 = String.valueOf(strR.charAt(0));
                AbstractC1474fG.h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase2, "toUpperCase(...)");
                sb2.append((Object) upperCase2);
                String strSubstring2 = strR.substring(1);
                AbstractC1474fG.i(strSubstring2, "substring(...)");
                sb2.append(strSubstring2);
                strR = sb2.toString();
            }
            return new C2109lo0(str3, strR, null, null, null, null, null, null, null, null, null, list3, null, null, null, null, 63484);
        } catch (Exception e5) {
            e = e5;
            str3 = str7;
            str4 = strB0;
            list = arrayList;
            e.getMessage();
        }
        C1282dJ c1282dJ = (C1282dJ) objC;
        if (!AbstractC1474fG.b(c1282dJ.b(), Boolean.FALSE) || c1282dJ.a() == null || (listC = c1282dJ.a().c()) == null) {
            listA = AbstractC2506pt.A(new Integer(1));
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                Integer numJ = AbstractC1802ih0.J((String) it.next());
                if (numJ != null) {
                    arrayList2.add(numJ);
                }
            }
            listA = AbstractC0911Ye.q0(arrayList2);
        }
        listA.size();
        listA.toString();
        arrayList = new ArrayList(AbstractC1016af.O(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            arrayList.add(new Ma0(str7 + "|" + iIntValue, iIntValue, "Temporada " + iIntValue, null, null, null, 56));
        }
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Not supported");
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return language;
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        int i = AbstractC3473zs.a;
        return C0622Nb.m(ds0.l, ds0, interfaceC0473Hh, 4);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }
}
