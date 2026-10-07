package o;

import android.util.Base64;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1603gf0 implements Q30 {
    public static final C1603gf0 b = new C1603gf0();
    public static final OV c;
    public static final OV d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    public static final Pe0 g;

    static {
        C2938uM c2938uM = new C2938uM(3);
        NV nvJ = AbstractC1370eA.j();
        nvJ.h = true;
        nvJ.i = true;
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvJ);
        nvJ.c.add(new C2480pg(17));
        nvJ.j = c2938uM;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(10L, timeUnit);
        nvJ.e(8L, timeUnit);
        OV ov = new OV(nvJ);
        c = ov;
        NV nvB = ov.b();
        nvB.i(30L, timeUnit);
        nvB.k(15L, timeUnit);
        nvB.c(40L, timeUnit);
        d = new OV(nvB);
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://sololatino.net");
        ((ArrayList) c1583gRK.f793o).add(new P9(1));
        c1583gRK.m = ov;
        g = (Pe0) c1583gRK.m().b(Pe0.class);
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    public static final Me0 p(String str, String str2, boolean z) throws Exception {
        C2446pE c2446pEB;
        Ke0 ke0;
        JN jnA;
        String str3;
        JN jnA2;
        String str4;
        String str5;
        ConcurrentHashMap concurrentHashMap;
        Object next;
        Me0 me0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap2 = e;
        if (!z && (me0 = (Me0) concurrentHashMap2.get(str)) != null) {
            if (jCurrentTimeMillis - me0.c >= 120000) {
                me0 = null;
            }
            if (me0 != null) {
                return me0;
            }
        }
        concurrentHashMap2.remove(str);
        if (concurrentHashMap2.size() >= 64) {
            Set setEntrySet = concurrentHashMap2.entrySet();
            AbstractC1474fG.i(setEntrySet, "<get-entries>(...)");
            Iterator it = setEntrySet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                concurrentHashMap = f;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Me0) entry.getValue()).c >= 120000) {
                    concurrentHashMap2.remove(entry.getKey(), entry.getValue());
                    concurrentHashMap.remove(entry.getKey());
                }
            }
            if (concurrentHashMap2.size() >= 64) {
                Set setEntrySet2 = concurrentHashMap2.entrySet();
                AbstractC1474fG.i(setEntrySet2, "<get-entries>(...)");
                Iterator it2 = setEntrySet2.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long j = ((Me0) ((Map.Entry) next).getValue()).c;
                        do {
                            Object next2 = it2.next();
                            long j2 = ((Me0) ((Map.Entry) next2).getValue()).c;
                            if (j > j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    concurrentHashMap2.remove(entry2.getKey(), entry2.getValue());
                }
            }
        }
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.d();
        c0560Kq.j("Referer", AbstractC1899jh0.O(str2) ? "https://sololatino.net" : str2);
        c0560Kq.j("Accept", "text/html,application/xhtml+xml");
        C1855j80 c1855j80G = d.c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.p()) {
                throw new Exception("El reproductor Premium respondió HTTP " + c1855j80G.f840o);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            AbstractC3409z9.g(c1855j80G, null);
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, str);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
                c2446pEB = null;
            }
            if (c2446pEB == null) {
                ke0 = null;
            } else {
                String lowerCase = c2446pEB.d.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (c2446pEB.j) {
                    if (!(AbstractC1474fG.b(lowerCase, "pelisserieshoy.com") || AbstractC1899jh0.L(lowerCase, ".pelisserieshoy.com", false)) || (jnA = AbstractC1370eA.a(AbstractC1701hf0.m("const\\s+_t\\s*=\\s*['\\\"]([^'\\\"]+)['\\\"]", "compile(...)", strQ, "matcher(...)"), 0, strQ)) == null || (str3 = (String) AbstractC0911Ye.e0(1, jnA.a())) == null) {
                        ke0 = null;
                    } else {
                        String str6 = AbstractC1899jh0.O(str3) ^ true ? str3 : null;
                        if (str6 == null || (jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("var\\s+_qc\\s*=\\s*['\\\"]([^'\\\"]+)['\\\"]", "compile(...)", strQ, "matcher(...)"), 0, strQ)) == null || (str4 = (String) AbstractC0911Ye.e0(1, jnA2.a())) == null) {
                            ke0 = null;
                        } else {
                            if (!(!AbstractC1899jh0.O(str4))) {
                                str4 = null;
                            }
                            if (str4 == null) {
                                ke0 = null;
                            } else {
                                Pattern patternCompile = Pattern.compile("var\\s+_qk\\s*=\\s*\\[(.*?)]", C3325yL.p(32));
                                AbstractC1474fG.i(patternCompile, "compile(...)");
                                Matcher matcher = patternCompile.matcher(strQ);
                                AbstractC1474fG.i(matcher, "matcher(...)");
                                JN jnA3 = AbstractC1370eA.a(matcher, 0, strQ);
                                if (jnA3 == null || (str5 = (String) AbstractC0911Ye.e0(1, jnA3.a())) == null) {
                                    ke0 = null;
                                } else {
                                    List listQ = Vb0.Q(Vb0.M(I60.c(new I60("['\\\"]([^'\\\"]+)['\\\"]"), str5), X10.y));
                                    if (listQ.size() < 4) {
                                        ke0 = null;
                                    } else {
                                        Object obj = listQ.get(1);
                                        Object obj2 = listQ.get(3);
                                        Object obj3 = listQ.get(0);
                                        Object obj4 = listQ.get(2);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(obj);
                                        sb.append(obj2);
                                        sb.append(obj3);
                                        sb.append(obj4);
                                        String string = sb.toString();
                                        String strE = AbstractC1701hf0.e(string, "|clk|", str4);
                                        int length = strE.length();
                                        int iCharAt = -2128831035;
                                        for (int i = 0; i < length; i++) {
                                            iCharAt = (iCharAt ^ strE.charAt(i)) * 16777619;
                                        }
                                        AbstractC3021v9.e(16);
                                        String string2 = Long.toString(((long) iCharAt) & 4294967295L, 16);
                                        AbstractC1474fG.i(string2, "toString(...)");
                                        C2349oE c2349oE2 = new C2349oE();
                                        c2349oE2.g(null, str);
                                        C2349oE c2349oEF = c2349oE2.b().f();
                                        c2349oEF.d("/");
                                        c2349oEF.i = null;
                                        c2349oEF.h = null;
                                        ke0 = new Ke0(str, AbstractC1119bh0.m0(c2349oEF.b().i, "/"), str6, string, string2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ke0 = null;
                }
            }
            if (ke0 == null) {
                throw new Exception("El reproductor Premium cambió su protocolo");
            }
            JSONObject jSONObjectX = x(ke0, "1", C1330dq.l);
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            JSONObject jSONObjectOptJSONObject = jSONObjectX.optJSONObject("langs_s");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next3 = itKeys.next();
                    s(arrayList, linkedHashSet, jSONObjectOptJSONObject.optJSONArray(next3), next3);
                }
            }
            s(arrayList, linkedHashSet, jSONObjectX.optJSONArray("s"), null);
            if (!arrayList.isEmpty()) {
                Me0 me1 = new Me0(ke0, arrayList, jCurrentTimeMillis);
                concurrentHashMap2.put(str, me1);
                return me1;
            }
            String strOptString = jSONObjectX.optString("msg");
            AbstractC1474fG.g(strOptString);
            String str7 = AbstractC1899jh0.O(strOptString) ^ true ? strOptString : null;
            if (str7 == null) {
                str7 = "Premium no devolvió servidores disponibles";
            }
            throw new Exception(str7);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList q(C0660On c0660On) {
        C3176wp c3176wpX;
        String str;
        String strZ;
        String string;
        String str2;
        String strZ2;
        String strZ3;
        C3370yp<C3176wp> c3370ypW = c0660On.W(".hero__slide");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX2 = c3176wp.X("a.btn-accent");
            Object c1387eR = null;
            if (c3176wpX2 != null) {
                String strD = c3176wpX2.d("href");
                AbstractC1474fG.g(strD);
                if (!AbstractC1899jh0.U(strD, "http", false)) {
                    strD = "https://sololatino.net".concat(strD);
                }
                String str3 = strD;
                C3176wp c3176wpX3 = c3176wp.X(".hero__bg");
                String strD2 = c3176wpX3 != null ? c3176wpX3.d("style") : null;
                if (strD2 == null) {
                    strD2 = "";
                }
                String strB0 = AbstractC1119bh0.W(strD2, "url('", false) ? AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD2, "url('", strD2), "')") : "";
                C3176wp c3176wpX4 = c3176wp.X(".hero__logo-img");
                if (c3176wpX4 == null || (string = c3176wpX4.d("alt")) == null) {
                    c3176wpX = c3176wp.X(".hero__content p.font-display");
                    if (c3176wpX != null || (strZ = c3176wpX.Z()) == null) {
                        str = "";
                    } else {
                        string = AbstractC1119bh0.E0(strZ).toString();
                        str = string;
                    }
                } else {
                    if (!(!AbstractC1899jh0.O(string))) {
                        string = null;
                    }
                    if (string == null) {
                        c3176wpX = c3176wp.X(".hero__content p.font-display");
                        if (c3176wpX != null) {
                        }
                        str = "";
                    } else {
                        str = string;
                    }
                }
                C3176wp c3176wpX5 = c3176wp.X("div.flex.items-center span");
                if (c3176wpX5 == null || (strZ3 = c3176wpX5.Z()) == null) {
                    str2 = null;
                } else {
                    Pattern patternCompile = Pattern.compile("\\d{4}");
                    AbstractC1474fG.i(patternCompile, "compile(...)");
                    if (patternCompile.matcher(strZ3).matches()) {
                        str2 = strZ3;
                    } else {
                        str2 = null;
                    }
                }
                C3176wp c3176wpX6 = c3176wp.X(".text-sm.leading-relaxed.line-clamp-4");
                if (c3176wpX6 != null && (strZ2 = c3176wpX6.Z()) != null) {
                    c1387eR = AbstractC1119bh0.E0(strZ2).toString();
                }
                String str4 = c1387eR;
                AbstractC1474fG.g(str3);
                c1387eR = AbstractC1119bh0.W(str3, "/pelicula/", false) ? new C1387eR(str3, str, str4, str2, null, null, null, null, null, strB0, null, null, null, null, null, 32240) : new C2109lo0(str3, str, str4, str2, null, null, null, null, null, strB0, null, null, null, null, null, null, 65008);
            }
            if (c1387eR != null) {
                arrayList.add(c1387eR);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    public static final Object r(C1603gf0 c1603gf0, Me0 me0, Le0 le0, String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C1407ef0 c1407ef0;
        C1603gf0 c1603gf1;
        Object next;
        String str2;
        Oe0 oe0;
        int i;
        C1407ef0 c1407ef1;
        int i2;
        Object next2;
        JSONObject jSONObjectX;
        String strOptString;
        Js0 js0;
        String str3;
        String str4;
        String str5;
        Me0 me1 = me0;
        c1603gf0.getClass();
        if (interfaceC0473Hh instanceof C1407ef0) {
            c1407ef0 = (C1407ef0) interfaceC0473Hh;
            int i3 = c1407ef0.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1407ef0.t = i3 - Integer.MIN_VALUE;
                c1603gf1 = c1603gf0;
            } else {
                c1603gf1 = c1603gf0;
                c1407ef0 = new C1407ef0(c1603gf1, interfaceC0473Hh);
            }
        } else {
            c1603gf1 = c1603gf0;
            c1407ef0 = new C1407ef0(c1603gf1, interfaceC0473Hh);
        }
        Object objM = c1407ef0.r;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = c1407ef0.t;
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                int i5 = c1407ef0.q;
                int i6 = c1407ef0.p;
                Oe0 oe1 = c1407ef0.f758o;
                String str6 = c1407ef0.n;
                Me0 me2 = c1407ef0.m;
                C1603gf0 c1603gf2 = c1407ef0.l;
                Jp0.O(objM);
                i = i5;
                oe0 = oe1;
                me1 = me2;
                c1603gf1 = c1603gf2;
                C1407ef0 c1407ef2 = c1407ef0;
                i2 = i6;
                str2 = str6;
                c1407ef1 = c1407ef2;
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objM);
            }
            return (Js0) objM;
        }
        Jp0.O(objM);
        Iterator it = me1.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Oe0 oe2 = (Oe0) next;
            if (AbstractC1474fG.b(oe2.a, le0.c) && AbstractC1474fG.b(oe2.b, le0.d)) {
                break;
            }
        }
        Oe0 oe3 = (Oe0) next;
        if (oe3 == null) {
            Iterator it2 = me1.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                Oe0 oe4 = (Oe0) next2;
                if (AbstractC1474fG.b(oe4.a, le0.c) && (le0.d == null || oe4.b == null)) {
                    break;
                }
            }
            oe3 = (Oe0) next2;
            if (oe3 == null) {
                throw new Ne0();
            }
        }
        C1330dq c1330dq = C1330dq.l;
        Ke0 ke0 = me1.a;
        if (!x(ke0, "click", c1330dq).optBoolean("ok", false)) {
            throw new Ne0();
        }
        if (!x(ke0, "click", AbstractC3327yN.z(new C1101bX("v", oe3.c), new C1101bX("ts", "0"))).optBoolean("ok", false)) {
            throw new Ne0();
        }
        str2 = str;
        oe0 = oe3;
        i = 0;
        c1407ef1 = c1407ef0;
        i2 = 0;
        while (true) {
            Ke0 ke1 = me1.a;
            Map mapY = AbstractC3327yN.y(new C1101bX("v", oe0.c));
            c1603gf1.getClass();
            jSONObjectX = x(ke1, "2", mapY);
            strOptString = jSONObjectX.optString("error");
            String strOptString2 = jSONObjectX.optString("msg");
            if (jSONObjectX.optBoolean("dead", false) || AbstractC1474fG.b(strOptString, "no_click") || AbstractC1474fG.b(strOptString2, "no_click")) {
                throw new Ne0();
            }
            if (AbstractC1474fG.b(strOptString, "busy") && i2 == 0) {
                long jH = ((long) U9.h(jSONObjectX.optInt("retry", 5), 1, 25)) * 1000;
                c1407ef1.l = c1603gf1;
                c1407ef1.m = me1;
                c1407ef1.n = str2;
                c1407ef1.f758o = oe0;
                c1407ef1.p = 1;
                c1407ef1.q = i;
                c1407ef1.t = 1;
                if (AbstractC1376eG.q(jH, c1407ef1) == enumC1706hi) {
                    return enumC1706hi;
                }
                i2 = 1;
            } else {
                if (!AbstractC1474fG.b(strOptString, "retry_once") || i != 0) {
                    break;
                }
                c1407ef1.l = c1603gf1;
                c1407ef1.m = me1;
                c1407ef1.n = str2;
                c1407ef1.f758o = oe0;
                c1407ef1.p = i2;
                c1407ef1.q = 1;
                c1407ef1.t = 2;
                if (AbstractC1376eG.q(600L, c1407ef1) == enumC1706hi) {
                    return enumC1706hi;
                }
                i = 1;
            }
        }
        AbstractC1474fG.g(strOptString);
        if (!AbstractC1899jh0.O(strOptString)) {
            switch (strOptString) {
                case "rate_limited":
                    str5 = "Premium alcanzó temporalmente su límite";
                    break;
                case "busy":
                    str5 = "El mirror Premium continúa ocupado";
                    break;
                case "not_found":
                    str5 = "El mirror Premium ya no está disponible";
                    break;
                case "geoblock":
                    str5 = "Este mirror Premium no está disponible en tu región";
                    break;
                default:
                    str5 = "No se pudo resolver el mirror Premium";
                    break;
            }
            throw new Exception(str5);
        }
        Ke0 ke2 = me1.a;
        Map mapW = w(ke2);
        String strOptString3 = jSONObjectX.optString("type");
        AbstractC1474fG.i(strOptString3, "optString(...)");
        String lowerCase = strOptString3.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        boolean zB = AbstractC1474fG.b(lowerCase, "iframe");
        String str7 = ke2.a;
        if (zB) {
            String strOptString4 = jSONObjectX.optString("url");
            AbstractC1474fG.g(strOptString4);
            if (AbstractC1899jh0.O(strOptString4)) {
                throw new Exception("Premium devolvió un iframe vacío");
            }
            AbstractC1474fG.j(str7, "playerUrl");
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str7);
            C2446pE c2446pEJ = c2349oE.b().j(strOptString4);
            if (c2446pEJ == null || (str4 = c2446pEJ.i) == null) {
                throw new IllegalArgumentException("Fuente Premium inválida");
            }
            int i7 = AbstractC3473zs.a;
            Ds0 ds0 = new Ds0(str4, str2, null, mapW, 52);
            c1407ef1.l = null;
            c1407ef1.m = null;
            c1407ef1.n = null;
            c1407ef1.f758o = null;
            c1407ef1.t = 3;
            objM = C0622Nb.m(str4, ds0, c1407ef1, 4);
            if (objM == enumC1706hi) {
                return enumC1706hi;
            }
            return (Js0) objM;
        }
        if (AbstractC1474fG.b(lowerCase, "mp4")) {
            String strOptString5 = jSONObjectX.optString("u");
            AbstractC1474fG.g(strOptString5);
            if (AbstractC1899jh0.O(strOptString5)) {
                throw new Exception("Player+ no devolvió un MP4");
            }
            AbstractC1474fG.j(str7, "playerUrl");
            C2349oE c2349oE2 = new C2349oE();
            c2349oE2.g(null, str7);
            C2446pE c2446pEJ2 = c2349oE2.b().j(strOptString5);
            if (c2446pEJ2 == null || (str3 = c2446pEJ2.i) == null) {
                throw new IllegalArgumentException("Fuente Premium inválida");
            }
            js0 = new Js0(str3, mapW, "video/mp4", (String) null, (String) null, (byte[]) null, (String) null, ke2.a, (String) null, (List) null, false, 3960);
        } else {
            String strOptString6 = jSONObjectX.optString("u");
            AbstractC1474fG.g(strOptString6);
            if (AbstractC1899jh0.O(strOptString6)) {
                throw new Exception("Premium no devolvió una fuente reproducible");
            }
            String strOptString7 = jSONObjectX.optString("sig");
            AbstractC1474fG.i(strOptString7, "optString(...)");
            AbstractC1474fG.j(str7, "playerUrl");
            C2349oE c2349oE3 = new C2349oE();
            c2349oE3.g(null, str7);
            C2446pE c2446pEJ3 = c2349oE3.b().j("/p.php");
            if (c2446pEJ3 == null) {
                throw new IllegalArgumentException("Proxy Premium inválido");
            }
            C2349oE c2349oEF = c2446pEJ3.f();
            c2349oEF.a("url", strOptString6);
            c2349oEF.a("sig", strOptString7);
            js0 = new Js0(c2349oEF.b().i, mapW, "hls", (String) null, (String) null, (byte[]) null, (String) null, ke2.a, (String) null, (List) null, false, 3960);
        }
        return js0;
    }

    public static void s(ArrayList arrayList, LinkedHashSet linkedHashSet, JSONArray jSONArray, String str) {
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray != null) {
                String strOptString = jSONArrayOptJSONArray.optString(0);
                AbstractC1474fG.i(strOptString, "optString(...)");
                String string = AbstractC1119bh0.E0(strOptString).toString();
                String strOptString2 = jSONArrayOptJSONArray.optString(1);
                AbstractC1474fG.i(strOptString2, "optString(...)");
                String string2 = AbstractC1119bh0.E0(strOptString2).toString();
                if (!AbstractC1899jh0.O(string) && !AbstractC1899jh0.O(string2) && linkedHashSet.add(string2)) {
                    String str2 = null;
                    if (str != null && (true ^ AbstractC1899jh0.O(str))) {
                        str2 = str;
                    }
                    arrayList.add(new Oe0(string, str2, string2));
                }
            }
        }
    }

    public static String t(String str) {
        int i;
        int iE0;
        try {
            List listT0 = AbstractC1119bh0.t0(str, new String[]{"."}, 0, 6);
            if (listT0.size() != 3) {
                return null;
            }
            String str2 = (String) listT0.get(1);
            int length = str2.length() % 4;
            if (length != 0) {
                str2 = str2 + AbstractC1899jh0.Q(4 - length, "=");
            }
            byte[] bArrDecode = Base64.decode(str2, 0);
            AbstractC1474fG.i(bArrDecode, "decode(...)");
            String str3 = new String(bArrDecode, AbstractC1305dd.a);
            int iE1 = AbstractC1119bh0.e0(str3, "\"link\":\"", 0, false, 6);
            if (iE1 == -1 || (iE0 = AbstractC1119bh0.e0(str3, "\"", (i = iE1 + 8), false, 4)) == -1) {
                return null;
            }
            String strSubstring = str3.substring(i, iE0);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String u(String str, byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC1474fG.g(bArrDecode);
            byte[] bArrM = X5.M(bArrDecode, 0, 16);
            byte[] bArrM2 = X5.M(bArrDecode, 16, bArrDecode.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArrM));
            byte[] bArrDoFinal = cipher.doFinal(bArrM2);
            AbstractC1474fG.i(bArrDoFinal, "doFinal(...)");
            return new String(bArrDoFinal, AbstractC1305dd.a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList v(C3176wp c3176wp) {
        Object next;
        C3370yp<C3176wp> c3370ypW = c3176wp.W("div.card");
        AbstractC1474fG.g(c3370ypW);
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp2 : c3370ypW) {
            C3176wp c3176wpX = c3176wp2.X("a");
            Object c1387eR = null;
            if (c3176wpX == null) {
                C3370yp c3370yp = new C3370yp();
                for (C3176wp c3176wp3 = (C3176wp) c3176wp2.l; c3176wp3 != null && !c3176wp3.u("#root"); c3176wp3 = (C3176wp) c3176wp3.l) {
                    c3370yp.add(c3176wp3);
                }
                Iterator it = c3370yp.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1474fG.b(((C3176wp) next).f1103o.l, "a"));
                c3176wpX = (C3176wp) next;
            }
            String strD = c3176wpX != null ? c3176wpX.d("href") : null;
            if (strD != null) {
                if (!AbstractC1899jh0.U(strD, "http", false)) {
                    strD = "https://sololatino.net".concat(strD);
                }
                String str = strD;
                C3176wp c3176wpX2 = c3176wp2.X("img.card__poster");
                String strD2 = c3176wpX2 != null ? c3176wpX2.d("src") : null;
                String str2 = strD2 == null ? "" : strD2;
                C3176wp c3176wpX3 = c3176wp2.X(".card__title");
                String strZ = c3176wpX3 != null ? c3176wpX3.Z() : null;
                String str3 = strZ == null ? "" : strZ;
                C3176wp c3176wpX4 = c3176wp2.X(".card__year");
                String strZ2 = c3176wpX4 != null ? c3176wpX4.Z() : null;
                c1387eR = (c3176wp2.X(".badge-movie") != null || AbstractC1119bh0.W(str, "/pelicula/", false)) ? new C1387eR(str, str3, null, strZ2, null, null, null, null, str2, null, null, null, null, null, null, 32500) : new C2109lo0(str, str3, null, strZ2, null, null, null, null, str2, null, null, null, null, null, null, null, 65268);
            }
            if (c1387eR != null) {
                arrayList.add(c1387eR);
            }
        }
        return arrayList;
    }

    public static Map w(Ke0 ke0) {
        return AbstractC3327yN.z(new C1101bX("Referer", ke0.a), new C1101bX("Origin", ke0.b), new C1101bX("Accept", "*/*"), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36"), new C1101bX("Sec-Fetch-Dest", "empty"), new C1101bX("Sec-Fetch-Mode", "cors"), new C1101bX("Sec-Fetch-Site", "same-origin"));
    }

    public static JSONObject x(Ke0 ke0, String str, Map map) {
        String str2;
        Na0 na0 = new Na0(22);
        na0.o("a", str);
        na0.o("tok", ke0.c);
        for (Map.Entry entry : map.entrySet()) {
            na0.o((String) entry.getKey(), (String) entry.getValue());
        }
        na0.o("rt", ke0.d);
        na0.o("tk", ke0.e);
        C0540Jw c0540Jw = new C0540Jw((ArrayList) na0.n, (ArrayList) na0.f414o);
        C0560Kq c0560Kq = new C0560Kq();
        String str3 = ke0.a;
        AbstractC1474fG.j(str3, "playerUrl");
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str3);
        C2446pE c2446pEJ = c2349oE.b().j("/s.php");
        if (c2446pEJ == null || (str2 = c2446pEJ.i) == null) {
            throw new IllegalArgumentException("Ruta Premium inválida");
        }
        c0560Kq.u(str2);
        c0560Kq.m("POST", c0540Jw);
        c0560Kq.j("Origin", ke0.b);
        c0560Kq.j("Referer", str3);
        c0560Kq.j("Accept", "application/json, text/plain, */*");
        c0560Kq.j("Sec-Fetch-Dest", "empty");
        c0560Kq.j("Sec-Fetch-Mode", "cors");
        c0560Kq.j("Sec-Fetch-Site", "same-origin");
        C1855j80 c1855j80G = d.c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.p()) {
                throw new Exception("Premium respondió HTTP " + c1855j80G.f840o);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            try {
                JSONObject jSONObject = new JSONObject(strQ);
                AbstractC3409z9.g(c1855j80G, null);
                return jSONObject;
            } catch (Exception unused) {
                throw new Exception("Premium devolvió una respuesta inválida");
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

    public static byte[] z(String str, int i, String str2) throws NoSuchAlgorithmException {
        String strQ = AbstractC1899jh0.Q(i, "0");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int i2 = 0;
        while (true) {
            Charset charset = AbstractC1305dd.a;
            byte[] bytes = (str + i2).getBytes(charset);
            AbstractC1474fG.i(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AbstractC1474fG.i(bArrDigest, "digest(...)");
            if (AbstractC1899jh0.U(X5.R(bArrDigest, X10.z), strQ, false)) {
                byte[] bytes2 = (str + i2 + str2).getBytes(charset);
                AbstractC1474fG.i(bytes2, "getBytes(...)");
                byte[] bArrDigest2 = messageDigest.digest(bytes2);
                AbstractC1474fG.i(bArrDigest2, "digest(...)");
                return bArrDigest2;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C1505ff0 c1505ff0;
        String strConcat;
        C1603gf0 c1603gf0;
        if (interfaceC0473Hh instanceof C1505ff0) {
            c1505ff0 = (C1505ff0) interfaceC0473Hh;
            int i2 = c1505ff0.f777o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1505ff0.f777o = i2 - Integer.MIN_VALUE;
            } else {
                c1505ff0 = new C1505ff0(this, interfaceC0473Hh);
            }
        } else {
            c1505ff0 = new C1505ff0(this, interfaceC0473Hh);
        }
        Object objA = c1505ff0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1505ff0.f777o;
        C1233cq c1233cq = C1233cq.l;
        if (i3 == 0) {
            Jp0.O(objA);
            if (AbstractC1899jh0.O(str)) {
                return AbstractC0937Ze.K(new C2420oz("accion", "Acción", c1233cq), new C2420oz("action-adventure", "Action & Adventure", c1233cq), new C2420oz("animacion", "Animación", c1233cq), new C2420oz("aventura", "Aventura", c1233cq), new C2420oz("belica", "Bélica", c1233cq), new C2420oz("ciencia-ficcion", "Ciencia Ficción", c1233cq), new C2420oz("comedia", "Comedia", c1233cq), new C2420oz("crimen", "Crimen", c1233cq), new C2420oz("disney", "Disney", c1233cq), new C2420oz("documental", "Documental", c1233cq), new C2420oz("drama", "Drama", c1233cq), new C2420oz("familia", "Familia", c1233cq), new C2420oz("fantasia", "Fantasía", c1233cq), new C2420oz("hbo", "HBO", c1233cq), new C2420oz("historia", "Historia", c1233cq), new C2420oz("kids", "Kids", c1233cq), new C2420oz("misterio", "Misterio", c1233cq), new C2420oz("musica", "Música", c1233cq), new C2420oz("romance", "Romance", c1233cq), new C2420oz("sci-fi-fantasy", "Sci-Fi & Fantasy", c1233cq), new C2420oz("soap", "Soap", c1233cq), new C2420oz("suspense", "Suspense", c1233cq), new C2420oz("talk", "Talk", c1233cq), new C2420oz("terror", "Terror", c1233cq), new C2420oz("war-politics", "War & Politics", c1233cq), new C2420oz("western", "Western", c1233cq));
            }
            try {
                if (i > 1) {
                    strConcat = "https://sololatino.net/buscar?q=" + str + "&page=" + i;
                } else {
                    strConcat = "https://sololatino.net/buscar?q=".concat(str);
                }
                Pe0 pe0 = g;
                try {
                    c1505ff0.l = this;
                    c1505ff0.f777o = 1;
                    objA = pe0.a(strConcat, c1505ff0);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1603gf0 = this;
                } catch (Exception unused) {
                    return c1233cq;
                }
            } catch (Exception unused2) {
                return c1233cq;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1603gf0 = c1505ff0.l;
            try {
                Jp0.O(objA);
            } catch (Exception unused3) {
                return c1233cq;
            }
        }
        c1603gf0.getClass();
        return v((C3176wp) objA);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c A[PHI: r7
  0x008c: PHI (r7v52 java.lang.String) = (r7v5 java.lang.String), (r7v9 java.lang.String), (r7v13 java.lang.String), (r7v53 java.lang.String) binds: [B:42:0x009c, B:47:0x00ac, B:52:0x00bc, B:35:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        Ue0 ue0;
        String strD;
        String strZ;
        String str2;
        Double dI;
        Object next;
        Integer num;
        String str3;
        ArrayList arrayList;
        String str4;
        Double d2;
        ArrayList arrayList2;
        C3176wp c3176wpX;
        C1387eR c1387eR;
        String strD2;
        String str5;
        Integer numJ;
        String str6;
        Integer numJ2;
        String strZ2;
        String strD3;
        String str7 = str;
        if (interfaceC0473Hh instanceof Ue0) {
            ue0 = (Ue0) interfaceC0473Hh;
            int i = ue0.f557o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue0.f557o = i - Integer.MIN_VALUE;
            } else {
                ue0 = new Ue0(this, interfaceC0473Hh);
            }
        } else {
            ue0 = new Ue0(this, interfaceC0473Hh);
        }
        Object objA = ue0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = ue0.f557o;
        if (i2 == 0) {
            Jp0.O(objA);
            ue0.l = str7;
            ue0.f557o = 1;
            objA = g.a(str7, ue0);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str7 = ue0.l;
            Jp0.O(objA);
        }
        String str8 = str7;
        C0660On c0660On = (C0660On) objA;
        C3176wp c3176wpX2 = c0660On.X("h1");
        if (c3176wpX2 == null || (strD = c3176wpX2.Z()) == null) {
            strD = c0660On.W("nav[aria-label=breadcrumb] span:last-child").d();
        }
        String str9 = strD;
        C3176wp c3176wpX3 = c0660On.X("div.-mt-28 img, div.flex-shrink-0.mx-auto img, img.card__poster");
        String str10 = "src";
        String strD4 = c3176wpX3 != null ? c3176wpX3.d("src") : null;
        String str11 = "";
        if (strD4 == null) {
            strD4 = "";
        }
        C3176wp c3176wpX4 = c0660On.X(".description");
        if (c3176wpX4 == null || (strZ = c3176wpX4.Z()) == null) {
            C3176wp c3176wpX5 = c0660On.X(".storyline");
            strZ = c3176wpX5 != null ? c3176wpX5.Z() : null;
            if (strZ != null) {
                str2 = strZ;
            } else {
                C3176wp c3176wpX6 = c0660On.X("p.leading-relaxed");
                strZ = c3176wpX6 != null ? c3176wpX6.Z() : null;
                if (strZ != null) {
                    str2 = strZ;
                } else {
                    C3176wp c3176wpX7 = c0660On.X("p.text-sm");
                    strZ = c3176wpX7 != null ? c3176wpX7.Z() : null;
                    if (strZ == null) {
                        str2 = "";
                    } else {
                        str2 = strZ;
                    }
                }
            }
        } else {
            str2 = strZ;
        }
        C3176wp c3176wpX8 = c0660On.X(".hero__bg, .detail-hero__bg");
        String strB0 = (c3176wpX8 == null || (strD3 = c3176wpX8.d("style")) == null) ? null : AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD3, "url('", strD3), "')");
        C3176wp c3176wpX9 = c0660On.X(".rating-badge--tmdb");
        if (c3176wpX9 == null || (strZ2 = c3176wpX9.Z()) == null) {
            dI = null;
        } else {
            JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("(\\d+\\.?\\d*)", "compile(...)", strZ2, "matcher(...)"), 0, strZ2);
            dI = jnA != null ? AbstractC1705hh0.I(jnA.c()) : null;
        }
        C3370yp c3370ypW = c0660On.W("div.flex.flex-wrap.items-center.gap-4.text-sm.mb-5 span");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        Iterator it = c3370ypW.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3176wp) it.next()).Z());
        }
        Iterator it2 = arrayList3.iterator();
        loop1: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String str12 = (String) next;
            AbstractC1474fG.g(str12);
            if (AbstractC1119bh0.W(str12, "h", false)) {
                break;
            }
            if (AbstractC1119bh0.W(str12, "m", false)) {
                for (int i3 = 0; i3 < str12.length(); i3++) {
                    if (Character.isDigit(str12.charAt(i3))) {
                        break loop1;
                    }
                }
            }
        }
        String str13 = (String) next;
        if (str13 != null) {
            JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("(\\d+)h", "compile(...)", str13, "matcher(...)"), 0, str13);
            int iIntValue = (jnA2 == null || (str6 = (String) ((HN) jnA2.a()).get(1)) == null || (numJ2 = AbstractC1802ih0.J(str6)) == null) ? 0 : numJ2.intValue();
            JN jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("(\\d+)m", "compile(...)", str13, "matcher(...)"), 0, str13);
            int iIntValue2 = (jnA3 == null || (str5 = (String) ((HN) jnA3.a()).get(1)) == null || (numJ = AbstractC1802ih0.J(str5)) == null) ? 0 : numJ.intValue();
            num = (iIntValue == 0 && iIntValue2 == 0) ? null : new Integer((iIntValue * 60) + iIntValue2);
        } else {
            num = null;
        }
        C3176wp c3176wpX10 = c0660On.X("span.date");
        if (c3176wpX10 == null || (strZ = c3176wpX10.Z()) == null) {
            C3176wp c3176wpX11 = c0660On.X(".card__year");
            if (c3176wpX11 != null) {
                String strZ3 = c3176wpX11.Z();
                str3 = strZ3;
            } else {
                str3 = null;
            }
        } else {
            str3 = strZ3;
        }
        C3176wp c3176wpX12 = c0660On.X("button[data-trailer]");
        String strConcat = (c3176wpX12 == null || (strD2 = c3176wpX12.d("data-trailer")) == null) ? null : "https://www.youtube.com/watch?v=".concat(strD2);
        C3370yp c3370ypW2 = c0660On.W("div.flex-1.min-w-0 a[href*=/genero/]");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(c3370ypW2, 10));
        for (Iterator it3 = c3370ypW2.iterator(); it3.hasNext(); it3 = it3) {
            String strZ4 = ((C3176wp) it3.next()).Z();
            AbstractC1474fG.i(strZ4, "text(...)");
            arrayList4.add(new C2420oz("", strZ4, C1233cq.l));
        }
        C3370yp c3370ypW3 = c0660On.W("div.cast-card");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(c3370ypW3, 10));
        Iterator it4 = c3370ypW3.iterator();
        while (true) {
            String str14 = str11;
            arrayList = arrayList4;
            str4 = "href";
            d2 = dI;
            if (!it4.hasNext()) {
                break;
            }
            C3176wp c3176wp = (C3176wp) it4.next();
            Iterator it5 = it4;
            C3176wp c3176wpX13 = c3176wp.X("a");
            String strD5 = c3176wpX13 != null ? c3176wpX13.d("href") : null;
            String str15 = strD5 == null ? str14 : strD5;
            C3176wp c3176wpX14 = c3176wp.X("p.font-semibold");
            String strZ5 = c3176wpX14 != null ? c3176wpX14.Z() : null;
            String str16 = strZ5 == null ? str14 : strZ5;
            C3176wp c3176wpX15 = c3176wp.X("img");
            arrayList5.add(new C1688hY(str15, str16, c3176wpX15 != null ? c3176wpX15.d("src") : null, null, 8));
            str11 = str14;
            arrayList4 = arrayList;
            it4 = it5;
            dI = d2;
        }
        C3370yp c3370ypW4 = c0660On.W("div.card, article.card");
        AbstractC1474fG.i(c3370ypW4, "select(...)");
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = c3370ypW4.iterator();
        while (true) {
            arrayList2 = arrayList5;
            if (!it6.hasNext()) {
                break;
            }
            C3176wp c3176wp2 = (C3176wp) it6.next();
            Iterator it7 = it6;
            C3176wp c3176wpX16 = c3176wp2.X("a");
            if (c3176wpX16 == null || (c3176wpX = c3176wp2.X("img")) == null) {
                c1387eR = null;
            } else {
                String strD6 = c3176wpX16.d(str4);
                AbstractC1474fG.g(strD6);
                if (!AbstractC1899jh0.U(strD6, "http", false)) {
                    strD6 = "https://sololatino.net".concat(strD6);
                }
                String str17 = strD6;
                String strD7 = c3176wpX.d(str10);
                if (strD7.length() == 0) {
                    strD7 = c3176wpX.d("data-srcset");
                }
                AbstractC1474fG.g(str17);
                String strD8 = c3176wpX.d("alt");
                AbstractC1474fG.i(strD8, "attr(...)");
                AbstractC1474fG.g(strD7);
                if (!AbstractC1899jh0.U(strD7, "http", false)) {
                    strD7 = "https://sololatino.net".concat(strD7);
                }
                c1387eR = new C1387eR(str17, strD8, null, null, null, null, null, null, strD7, null, null, null, null, null, null, 32508);
            }
            if (c1387eR != null) {
                arrayList6.add(c1387eR);
            }
            arrayList5 = arrayList2;
            it6 = it7;
            str4 = str4;
            str10 = str10;
        }
        if (!AbstractC1899jh0.U(strD4, "http", false)) {
            strD4 = "https://sololatino.net".concat(strD4);
        }
        String str18 = strD4;
        AbstractC1474fG.g(str9);
        return new C1387eR(str8, str9, str2, str3, num, strConcat, null, d2, str18, strB0, arrayList, null, arrayList2, arrayList6, null, 18496);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        Re0 re0;
        String strX0;
        C3176wp c3176wpX;
        if (interfaceC0473Hh instanceof Re0) {
            re0 = (Re0) interfaceC0473Hh;
            int i = re0.f491o;
            if ((i & Integer.MIN_VALUE) != 0) {
                re0.f491o = i - Integer.MIN_VALUE;
            } else {
                re0 = new Re0(this, interfaceC0473Hh);
            }
        } else {
            re0 = new Re0(this, interfaceC0473Hh);
        }
        Object objA = re0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = re0.f491o;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                String strB0 = AbstractC1119bh0.B0(str, "@");
                strX0 = AbstractC1119bh0.x0(str, "@", str);
                Pe0 pe0 = g;
                re0.l = strX0;
                re0.f491o = 1;
                objA = pe0.a(strB0, re0);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strX0 = re0.l;
                Jp0.O(objA);
            }
            C3370yp c3370ypW = ((C0660On) objA).W("div[data-season-panel=" + strX0 + "]");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            C3176wp c3176wp = (C3176wp) AbstractC0911Ye.d0(c3370ypW);
            if (c3176wp == null) {
                return c1233cq;
            }
            C3370yp<C3176wp> c3370ypW2 = c3176wp.W("a.ep-item");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW2, 10));
            for (C3176wp c3176wp2 : c3370ypW2) {
                C3176wp c3176wpX2 = c3176wp2.X("p.ep-num");
                String strD = null;
                String strZ = c3176wpX2 != null ? c3176wpX2.Z() : null;
                if (strZ == null) {
                    strZ = "E0";
                }
                StringBuilder sb = new StringBuilder();
                int length = strZ.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = strZ.charAt(i3);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                AbstractC1474fG.i(string, "toString(...)");
                Integer numJ = AbstractC1802ih0.J(string);
                int iIntValue = numJ != null ? numJ.intValue() : 0;
                C3176wp c3176wpX3 = c3176wp2.X("p.leading-tight");
                String strZ2 = c3176wpX3 != null ? c3176wpX3.Z() : null;
                if (strZ2 == null) {
                    strZ2 = "Episodio " + iIntValue;
                }
                C3176wp c3176wpX4 = c3176wp2.X("p.text-xs.line-clamp-2");
                if ((c3176wpX4 == null || c3176wpX4.Z() == null) && (c3176wpX = c3176wp2.X("p[style*='color:#5050a0']")) != null) {
                    c3176wpX.Z();
                }
                String strD2 = c3176wp2.d("href");
                AbstractC1474fG.i(strD2, "attr(...)");
                String string2 = AbstractC1119bh0.E0(strZ2).toString();
                C3176wp c3176wpX5 = c3176wp2.X("img.ep-thumb");
                if (c3176wpX5 != null) {
                    strD = c3176wpX5.d("src");
                }
                arrayList.add(new C0456Gq(strD2, iIntValue, string2, null, strD, null, null, 104));
            }
            return arrayList;
        } catch (Exception unused) {
            return c1233cq;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:13:0x0030, B:43:0x00b2, B:44:0x00c4, B:46:0x00ca, B:48:0x00d2), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b1 -> B:43:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object d(int r11, o.InterfaceC0473Hh r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1603gf0.d(int, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:15:0x003a, B:34:0x009a, B:36:0x00a0, B:38:0x00c8, B:41:0x00e2, B:43:0x00eb, B:47:0x0103, B:48:0x010c, B:50:0x0115, B:52:0x011e, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:61:0x016b, B:20:0x0053, B:23:0x0061, B:26:0x006b, B:33:0x0082, B:29:0x0072), top: B:65:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:15:0x003a, B:34:0x009a, B:36:0x00a0, B:38:0x00c8, B:41:0x00e2, B:43:0x00eb, B:47:0x0103, B:48:0x010c, B:50:0x0115, B:52:0x011e, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:61:0x016b, B:20:0x0053, B:23:0x0061, B:26:0x006b, B:33:0x0082, B:29:0x0072), top: B:65:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115 A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:15:0x003a, B:34:0x009a, B:36:0x00a0, B:38:0x00c8, B:41:0x00e2, B:43:0x00eb, B:47:0x0103, B:48:0x010c, B:50:0x0115, B:52:0x011e, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:61:0x016b, B:20:0x0053, B:23:0x0061, B:26:0x006b, B:33:0x0082, B:29:0x0072), top: B:65:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011e A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:15:0x003a, B:34:0x009a, B:36:0x00a0, B:38:0x00c8, B:41:0x00e2, B:43:0x00eb, B:47:0x0103, B:48:0x010c, B:50:0x0115, B:52:0x011e, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:61:0x016b, B:20:0x0053, B:23:0x0061, B:26:0x006b, B:33:0x0082, B:29:0x0072), top: B:65:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x015c A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:15:0x003a, B:34:0x009a, B:36:0x00a0, B:38:0x00c8, B:41:0x00e2, B:43:0x00eb, B:47:0x0103, B:48:0x010c, B:50:0x0115, B:52:0x011e, B:56:0x0148, B:57:0x0156, B:59:0x015c, B:61:0x016b, B:20:0x0053, B:23:0x0061, B:26:0x006b, B:33:0x0082, B:29:0x0072), top: B:65:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0113 -> B:55:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x011c -> B:55:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0141 -> B:55:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:79:0x016b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object e(com.skidush.clonex.models.Video$Type r19, java.lang.String r20, o.InterfaceC0473Hh r21) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1603gf0.e(com.skidush.clonex.models.Video$Type, java.lang.String, o.Hh):java.lang.Object");
    }

    @Override // o.Q30
    public final String f() {
        return "https://pngdownload.io/wp-content/uploads/2025/06/Netflix-Logo-Streaming-Platform-PNG.webp";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new Te0(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "PELICULAS Y SERIES 3";
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:49:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0193  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x016d -> B:75:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0188 -> B:53:0x017e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object h(java.lang.String r19, int r20, o.InterfaceC0473Hh r21) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1603gf0.h(java.lang.String, int, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:13:0x0030, B:43:0x00b2, B:44:0x00c4, B:46:0x00ca, B:48:0x00d2), top: B:61:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b1 -> B:43:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.attributes.AttributeStorage.contains(AttributeStorage.java:94)
        	at jadx.core.dex.attributes.AttrNode.contains(AttrNode.java:103)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIfNodeInfo(IfRegionMaker.java:613)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIf(IfRegionMaker.java:602)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.mergeNestedIfNodes(IfRegionMaker.java:409)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        */
    @Override // o.Q30
    public final java.lang.Object i(int r11, o.InterfaceC0473Hh r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1603gf0.i(int, o.Hh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1017af0 c1017af0;
        String strD;
        String strZ;
        Double dI;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3176wp c3176wpX;
        C2109lo0 c2109lo0;
        String strD2;
        String strZ2;
        String strD3;
        String str3 = str;
        if (interfaceC0473Hh instanceof C1017af0) {
            c1017af0 = (C1017af0) interfaceC0473Hh;
            int i = c1017af0.f677o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1017af0.f677o = i - Integer.MIN_VALUE;
            } else {
                c1017af0 = new C1017af0(this, interfaceC0473Hh);
            }
        } else {
            c1017af0 = new C1017af0(this, interfaceC0473Hh);
        }
        Object objA = c1017af0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1017af0.f677o;
        if (i2 == 0) {
            Jp0.O(objA);
            c1017af0.l = str3;
            c1017af0.f677o = 1;
            objA = g.a(str3, c1017af0);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c1017af0.l;
            Jp0.O(objA);
        }
        String str4 = str3;
        C0660On c0660On = (C0660On) objA;
        C3176wp c3176wpX2 = c0660On.X("h1");
        if (c3176wpX2 == null || (strD = c3176wpX2.Z()) == null) {
            strD = c0660On.W("nav[aria-label=breadcrumb] span:last-child").d();
        }
        String str5 = strD;
        C3176wp c3176wpX3 = c0660On.X("div.-mt-28 img, div.flex-shrink-0.mx-auto img, img.card__poster");
        String str6 = "src";
        String strD4 = c3176wpX3 != null ? c3176wpX3.d("src") : null;
        String str7 = "";
        if (strD4 == null) {
            strD4 = "";
        }
        C3176wp c3176wpX4 = c0660On.X(".description");
        if (c3176wpX4 == null || (strZ = c3176wpX4.Z()) == null) {
            C3176wp c3176wpX5 = c0660On.X(".storyline");
            strZ = c3176wpX5 != null ? c3176wpX5.Z() : null;
            if (strZ == null) {
                C3176wp c3176wpX6 = c0660On.X("p.leading-relaxed");
                strZ = c3176wpX6 != null ? c3176wpX6.Z() : null;
                if (strZ == null) {
                    C3176wp c3176wpX7 = c0660On.X("p.text-sm");
                    strZ = c3176wpX7 != null ? c3176wpX7.Z() : null;
                    if (strZ == null) {
                        strZ = "";
                    }
                }
            }
        }
        C3370yp c3370ypW = c0660On.W("div[data-season-panel]");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        Iterator it = c3370ypW.iterator();
        while (true) {
            int iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            String strD5 = ((C3176wp) it.next()).d("data-season-panel");
            AbstractC1474fG.i(strD5, "attr(...)");
            Integer numJ = AbstractC1802ih0.J(strD5);
            if (numJ != null) {
                iIntValue = numJ.intValue();
            }
            arrayList3.add(new Ma0(str4 + "@" + iIntValue, iIntValue, AbstractC1674hK.n(iIntValue, "Temporada "), null, null, null, 56));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Ma0) obj).b != 0) {
                arrayList4.add(obj);
            }
        }
        C3176wp c3176wpX8 = c0660On.X(".hero__bg, .detail-hero__bg");
        String strB0 = (c3176wpX8 == null || (strD3 = c3176wpX8.d("style")) == null) ? null : AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD3, "url('", strD3), "')");
        C3176wp c3176wpX9 = c0660On.X(".rating-badge--tmdb");
        if (c3176wpX9 == null || (strZ2 = c3176wpX9.Z()) == null) {
            dI = null;
        } else {
            JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("(\\d+\\.?\\d*)", "compile(...)", strZ2, "matcher(...)"), 0, strZ2);
            dI = jnA != null ? AbstractC1705hh0.I(jnA.c()) : null;
        }
        Pattern patternCompile = Pattern.compile("\\d{4}");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strZ3 = c0660On.Z();
        AbstractC1474fG.i(strZ3, "text(...)");
        Matcher matcher = patternCompile.matcher(strZ3);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA2 = AbstractC1370eA.a(matcher, 0, strZ3);
        String strC = jnA2 != null ? jnA2.c() : null;
        C3176wp c3176wpX10 = c0660On.X("button[data-trailer]");
        String strConcat = (c3176wpX10 == null || (strD2 = c3176wpX10.d("data-trailer")) == null) ? null : "https://www.youtube.com/watch?v=".concat(strD2);
        C3370yp c3370ypW2 = c0660On.W("div.flex-1.min-w-0 a[href*=/genero/]");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        String str8 = strConcat;
        ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(c3370ypW2, 10));
        for (Iterator it2 = c3370ypW2.iterator(); it2.hasNext(); it2 = it2) {
            String strZ4 = ((C3176wp) it2.next()).Z();
            AbstractC1474fG.i(strZ4, "text(...)");
            arrayList5.add(new C2420oz("", strZ4, C1233cq.l));
        }
        C3370yp c3370ypW3 = c0660On.W("div.cast-card, div.sbox.srepart div.person");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        ArrayList arrayList6 = new ArrayList(AbstractC1016af.O(c3370ypW3, 10));
        Iterator it3 = c3370ypW3.iterator();
        while (true) {
            String str9 = str7;
            str2 = "href";
            arrayList = arrayList5;
            if (!it3.hasNext()) {
                break;
            }
            C3176wp c3176wp = (C3176wp) it3.next();
            Iterator it4 = it3;
            C3176wp c3176wpX11 = c3176wp.X("a");
            String strD6 = c3176wpX11 != null ? c3176wpX11.d("href") : null;
            String str10 = strD6 == null ? str9 : strD6;
            C3176wp c3176wpX12 = c3176wp.X("p.font-semibold, .name a");
            String strZ5 = c3176wpX12 != null ? c3176wpX12.Z() : null;
            String str11 = strZ5 == null ? str9 : strZ5;
            C3176wp c3176wpX13 = c3176wp.X("img");
            arrayList6.add(new C1688hY(str10, str11, c3176wpX13 != null ? c3176wpX13.d("src") : null, null, 8));
            str7 = str9;
            it3 = it4;
            arrayList5 = arrayList;
        }
        C3370yp c3370ypW4 = c0660On.W("div.card, article.card");
        AbstractC1474fG.i(c3370ypW4, "select(...)");
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = c3370ypW4.iterator();
        while (true) {
            arrayList2 = arrayList6;
            if (!it5.hasNext()) {
                break;
            }
            C3176wp c3176wp2 = (C3176wp) it5.next();
            Iterator it6 = it5;
            C3176wp c3176wpX14 = c3176wp2.X("a");
            if (c3176wpX14 == null || (c3176wpX = c3176wp2.X("img")) == null) {
                c2109lo0 = null;
            } else {
                String strD7 = c3176wpX14.d(str2);
                AbstractC1474fG.g(strD7);
                if (!AbstractC1899jh0.U(strD7, "http", false)) {
                    strD7 = "https://sololatino.net".concat(strD7);
                }
                String str12 = strD7;
                String strD8 = c3176wpX.d(str6);
                if (strD8.length() == 0) {
                    strD8 = c3176wpX.d("data-srcset");
                }
                AbstractC1474fG.g(str12);
                String strD9 = c3176wpX.d("alt");
                AbstractC1474fG.i(strD9, "attr(...)");
                AbstractC1474fG.g(strD8);
                if (!AbstractC1899jh0.U(strD8, "http", false)) {
                    strD8 = "https://sololatino.net".concat(strD8);
                }
                c2109lo0 = new C2109lo0(str12, strD9, null, null, null, null, null, null, strD8, null, null, null, null, null, null, null, 65276);
            }
            if (c2109lo0 != null) {
                arrayList7.add(c2109lo0);
            }
            arrayList6 = arrayList2;
            it5 = it6;
            str2 = str2;
            str6 = str6;
        }
        if (!AbstractC1899jh0.U(strD4, "http", false)) {
            strD4 = "https://sololatino.net".concat(strD4);
        }
        String str13 = strD4;
        List listR0 = AbstractC0911Ye.r0(arrayList4, new C1749i30(6));
        AbstractC1474fG.g(str5);
        return new C2109lo0(str4, str5, strZ, strC, null, str8, null, dI, str13, strB0, null, listR0, arrayList, null, arrayList2, arrayList7, 9280);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        We0 we0;
        C1603gf0 c1603gf0;
        if (interfaceC0473Hh instanceof We0) {
            we0 = (We0) interfaceC0473Hh;
            int i2 = we0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                we0.p = i2 - Integer.MIN_VALUE;
            } else {
                we0 = new We0(this, interfaceC0473Hh);
            }
        } else {
            we0 = new We0(this, interfaceC0473Hh);
        }
        Object objA = we0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = we0.p;
        if (i3 == 0) {
            Jp0.O(objA);
            if (i > 1) {
                return new C1688hY(str, "", null, null, 12);
            }
            we0.l = this;
            we0.m = str;
            we0.p = 1;
            objA = g.a(str, we0);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            c1603gf0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = we0.m;
            c1603gf0 = we0.l;
            Jp0.O(objA);
        }
        C0660On c0660On = (C0660On) objA;
        C3176wp c3176wpX = c0660On.X(".data h1");
        String strConcat = null;
        String strZ = c3176wpX != null ? c3176wpX.Z() : null;
        if (strZ == null) {
            strZ = "";
        }
        C3176wp c3176wpX2 = c0660On.X(".poster img");
        String strD = c3176wpX2 != null ? c3176wpX2.d("src") : null;
        if (strD != null) {
            strConcat = AbstractC1899jh0.U(strD, "http", false) ? strD : "https://sololatino.net".concat(strD);
        }
        c1603gf0.getClass();
        return new C1688hY(str, strZ, strConcat, v(c0660On));
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
        C2446pE c2446pEB;
        Le0 le0;
        int iIntValue;
        int i;
        String str = ds0.l;
        AbstractC1474fG.j(str, "id");
        if (!AbstractC1899jh0.U(str, "sololatino-premium-v1:", false)) {
            le0 = null;
            break;
        }
        String strL0 = AbstractC1119bh0.l0(str, "sololatino-premium-v1:");
        ArrayList arrayList = new ArrayList(4);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 4) {
                if (i3 == strL0.length()) {
                    Object obj = arrayList.get(0);
                    AbstractC1474fG.i(obj, "get(...)");
                    String str2 = (String) obj;
                    try {
                        C2349oE c2349oE = new C2349oE();
                        c2349oE.g(null, str2);
                        c2446pEB = c2349oE.b();
                    } catch (IllegalArgumentException unused) {
                        c2446pEB = null;
                    }
                    if (c2446pEB != null) {
                        String lowerCase = c2446pEB.d.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                        if (!c2446pEB.j || (!AbstractC1474fG.b(lowerCase, "pelisserieshoy.com") && !AbstractC1899jh0.L(lowerCase, ".pelisserieshoy.com", false))) {
                            break;
                        }
                        Object obj2 = arrayList.get(1);
                        AbstractC1474fG.i(obj2, "get(...)");
                        if (!AbstractC1899jh0.O((CharSequence) obj2)) {
                            Object obj3 = arrayList.get(2);
                            AbstractC1474fG.i(obj3, "get(...)");
                            if (!AbstractC1899jh0.O((CharSequence) obj3)) {
                                Object obj4 = arrayList.get(0);
                                AbstractC1474fG.i(obj4, "get(...)");
                                String str3 = (String) obj4;
                                Object obj5 = arrayList.get(1);
                                AbstractC1474fG.i(obj5, "get(...)");
                                String str4 = (String) obj5;
                                Object obj6 = arrayList.get(2);
                                AbstractC1474fG.i(obj6, "get(...)");
                                String str5 = (String) obj6;
                                Object obj7 = arrayList.get(3);
                                String str6 = (String) obj7;
                                AbstractC1474fG.g(str6);
                                if (!(true ^ AbstractC1899jh0.O(str6))) {
                                    obj7 = null;
                                }
                                le0 = new Le0(str3, str4, str5, (String) obj7);
                                break;
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                int iD0 = AbstractC1119bh0.d0(strL0, ':', i3, false, 4);
                if (iD0 > i3) {
                    String strSubstring = strL0.substring(i3, iD0);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    Integer numJ = AbstractC1802ih0.J(strSubstring);
                    if (numJ != null && (iIntValue = numJ.intValue()) >= 0 && (i3 = iIntValue + (i = iD0 + 1)) <= strL0.length()) {
                        String strSubstring2 = strL0.substring(i, i3);
                        AbstractC1474fG.i(strSubstring2, "substring(...)");
                        arrayList.add(strSubstring2);
                        i2++;
                    }
                }
            }
            le0 = null;
            break;
        }
        if (le0 != null) {
            return AbstractC1376eG.J(AbstractC1910jn.b, new C1310df0(le0, ds0.m, null), interfaceC0473Hh);
        }
        int i4 = AbstractC3473zs.a;
        return C0622Nb.m(ds0.l, ds0, interfaceC0473Hh, 4);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee A[Catch: Exception -> 0x028c, TryCatch #2 {Exception -> 0x028c, blocks: (B:103:0x01de, B:107:0x01ee, B:109:0x01ff, B:111:0x020f), top: B:194:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ff A[Catch: Exception -> 0x028c, TryCatch #2 {Exception -> 0x028c, blocks: (B:103:0x01de, B:107:0x01ee, B:109:0x01ff, B:111:0x020f), top: B:194:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:111:0x020f A[Catch: Exception -> 0x028c, TRY_LEAVE, TryCatch #2 {Exception -> 0x028c, blocks: (B:103:0x01de, B:107:0x01ee, B:109:0x01ff, B:111:0x020f), top: B:194:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0224 A[Catch: Exception -> 0x028e, TryCatch #1 {Exception -> 0x028e, blocks: (B:113:0x0219, B:115:0x0224, B:122:0x0240, B:119:0x0234), top: B:192:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0234 A[Catch: Exception -> 0x028e, TryCatch #1 {Exception -> 0x028e, blocks: (B:113:0x0219, B:115:0x0224, B:122:0x0240, B:119:0x0234), top: B:192:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0240 A[Catch: Exception -> 0x028e, TRY_LEAVE, TryCatch #1 {Exception -> 0x028e, blocks: (B:113:0x0219, B:115:0x0224, B:122:0x0240, B:119:0x0234), top: B:192:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x028a A[PHI: r8 r14
  0x028a: PHI (r8v23 o.cq) = (r8v0 o.cq), (r8v3 o.cq), (r8v4 o.cq) binds: [B:68:0x0160, B:188:0x028a, B:236:0x028a] A[DONT_GENERATE, DONT_INLINE]
  0x028a: PHI (r14v10 java.lang.String) = (r14v0 java.lang.String), (r14v1 java.lang.String), (r14v2 java.lang.String) binds: [B:68:0x0160, B:188:0x028a, B:236:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x029e A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0311 A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:156:0x031b A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0357  */
    /* JADX WARN: Code duplicated, block: B:167:0x0358  */
    /* JADX WARN: Code duplicated, block: B:169:0x035b A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:171:0x037a A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b5 A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03bf A[Catch: Exception -> 0x03e2, TryCatch #6 {Exception -> 0x03e2, blocks: (B:127:0x028e, B:128:0x0298, B:130:0x029e, B:132:0x02c4, B:134:0x02d1, B:136:0x02db, B:138:0x02e1, B:140:0x02e9, B:142:0x02ef, B:145:0x02fa, B:147:0x0303, B:150:0x030a, B:159:0x032b, B:153:0x0311, B:154:0x0315, B:156:0x031b, B:160:0x0341, B:162:0x0349, B:164:0x0351, B:169:0x035b, B:171:0x037a, B:172:0x03ac, B:181:0x03ce, B:175:0x03b5, B:176:0x03b9, B:178:0x03bf), top: B:201:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:? A[LOOP:2: B:176:0x03b9->B:235:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: Exception -> 0x0142, TryCatch #7 {Exception -> 0x0142, blocks: (B:46:0x00bb, B:48:0x00d4, B:50:0x00e2, B:52:0x00f8, B:54:0x0106, B:56:0x010c, B:58:0x0122, B:63:0x0136), top: B:203:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: Exception -> 0x0142, TryCatch #7 {Exception -> 0x0142, blocks: (B:46:0x00bb, B:48:0x00d4, B:50:0x00e2, B:52:0x00f8, B:54:0x0106, B:56:0x010c, B:58:0x0122, B:63:0x0136), top: B:203:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0192 A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6 A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1 A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd A[Catch: Exception -> 0x028a, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3 A[Catch: Exception -> 0x028a, TRY_LEAVE, TryCatch #5 {Exception -> 0x028a, blocks: (B:69:0x0162, B:71:0x017a, B:75:0x018a, B:77:0x0192, B:78:0x0196, B:80:0x019a, B:96:0x01ca, B:99:0x01d3, B:84:0x01a6, B:87:0x01b1, B:91:0x01bd), top: B:199:0x0162 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0240, please report this as an issue */
    public final Object y(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1212cf0 c1212cf0;
        C1233cq c1233cq;
        C2446pE c2446pEB;
        C1603gf0 c1603gf0;
        ArrayList arrayList;
        byte[] bArrZ;
        JN jnA;
        String str3;
        JSONArray jSONArray;
        int length;
        int i;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        String str4;
        JSONArray jSONArrayOptJSONArray;
        int length2;
        int i2;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArray2;
        String strOptString2;
        int i3;
        String strOptString3;
        String str5;
        JSONArray jSONArray3;
        String str6;
        String strU;
        C3176wp c3176wpX;
        String strD;
        String strB0;
        Iterator it;
        JN jnA2;
        String str7;
        String string;
        C3176wp c3176wpX2;
        String strZ;
        String string2;
        Iterator it2;
        JN jnA3;
        String str8;
        JN jnA4;
        Integer numJ;
        JN jnA5;
        String str9;
        String str10;
        if (interfaceC0473Hh instanceof C1212cf0) {
            c1212cf0 = (C1212cf0) interfaceC0473Hh;
            int i4 = c1212cf0.f721o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1212cf0.f721o = i4 - Integer.MIN_VALUE;
            } else {
                c1212cf0 = new C1212cf0(this, interfaceC0473Hh);
            }
        } else {
            c1212cf0 = new C1212cf0(this, interfaceC0473Hh);
        }
        Object objA = c1212cf0.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = c1212cf0.f721o;
        C1233cq c1233cq2 = C1233cq.l;
        try {
            try {
                if (i5 == 0) {
                    Jp0.O(objA);
                    AbstractC1474fG.j(str, "url");
                    try {
                        C2349oE c2349oE = new C2349oE();
                        c2349oE.g(null, str);
                        c2446pEB = c2349oE.b();
                    } catch (IllegalArgumentException unused) {
                        c2446pEB = null;
                    }
                    if (c2446pEB != null) {
                        String lowerCase = c2446pEB.d.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                        if (c2446pEB.j && (AbstractC1474fG.b(lowerCase, "pelisserieshoy.com") || AbstractC1899jh0.L(lowerCase, ".pelisserieshoy.com", false))) {
                            c1212cf0.f721o = 1;
                            objA = AbstractC1376eG.J(AbstractC1910jn.b, new Qe0(str, str2, null), c1212cf0);
                            if (objA == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return (List) objA;
                        }
                    }
                    Pe0 pe0 = g;
                    c1212cf0.l = this;
                    c1212cf0.f721o = 2;
                    objA = pe0.a(str, c1212cf0);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1603gf0 = this;
                    C0660On c0660On = (C0660On) objA;
                    String strR = c0660On.R();
                    arrayList = new ArrayList();
                    Pattern patternCompile = Pattern.compile("const\\s+POW_CHALLENGE\\s*=\\s*'([^']+)';");
                    AbstractC1474fG.i(patternCompile, "compile(...)");
                    AbstractC1474fG.g(strR);
                    Matcher matcher = patternCompile.matcher(strR);
                    AbstractC1474fG.i(matcher, "matcher(...)");
                    jnA3 = AbstractC1370eA.a(matcher, 0, strR);
                    if (jnA3 != null) {
                        str8 = (String) ((HN) jnA3.a()).get(1);
                    } else {
                        str8 = null;
                    }
                    Pattern patternCompile2 = Pattern.compile("const\\s+POW_DIFFICULTY\\s*=\\s*(\\d+);");
                    AbstractC1474fG.i(patternCompile2, "compile(...)");
                    Matcher matcher2 = patternCompile2.matcher(strR);
                    AbstractC1474fG.i(matcher2, "matcher(...)");
                    jnA4 = AbstractC1370eA.a(matcher2, 0, strR);
                    if (jnA4 != null) {
                        numJ = null;
                    } else {
                        numJ = null;
                    }
                    Pattern patternCompile3 = Pattern.compile("const\\s+POW_SALT\\s*=\\s*'([^']+)';");
                    AbstractC1474fG.i(patternCompile3, "compile(...)");
                    Matcher matcher3 = patternCompile3.matcher(strR);
                    AbstractC1474fG.i(matcher3, "matcher(...)");
                    jnA5 = AbstractC1370eA.a(matcher3, 0, strR);
                    if (jnA5 != null) {
                        str9 = (String) ((HN) jnA5.a()).get(1);
                    } else {
                        str9 = null;
                    }
                    if (str8 != null) {
                        bArrZ = null;
                    } else {
                        bArrZ = null;
                    }
                    Pattern patternCompile4 = Pattern.compile("dataLink = (\\[.+?\\]);");
                    AbstractC1474fG.i(patternCompile4, "compile(...)");
                    AbstractC1474fG.g(strR);
                    Matcher matcher4 = patternCompile4.matcher(strR);
                    AbstractC1474fG.i(matcher4, "matcher(...)");
                    jnA = AbstractC1370eA.a(matcher4, 0, strR);
                    str3 = ".";
                    if (jnA != null) {
                        jSONArray = new JSONArray((String) ((HN) jnA.a()).get(1));
                        length = jSONArray.length();
                        i = 0;
                        while (i < length) {
                            jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                strOptString = jSONObjectOptJSONObject.optString("video_language");
                                if (strOptString != null) {
                                    switch (strOptString.hashCode()) {
                                        case 68962:
                                            if (strOptString.equals("ESP")) {
                                                str4 = "[CAST]";
                                            } else {
                                                str4 = "";
                                            }
                                            break;
                                        case 73209:
                                            if (strOptString.equals("JAP")) {
                                                str4 = "[JAP]";
                                            } else {
                                                str4 = "";
                                            }
                                            break;
                                        case 75135:
                                            if (strOptString.equals("LAT")) {
                                                str4 = "[LAT]";
                                            } else {
                                                str4 = "";
                                            }
                                            break;
                                        case 82464:
                                            if (strOptString.equals("SUB")) {
                                                str4 = "[SUB]";
                                            } else {
                                                str4 = "";
                                            }
                                            break;
                                        default:
                                            str4 = "";
                                            break;
                                    }
                                } else {
                                    str4 = "";
                                }
                                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("sortedEmbeds");
                                if (jSONArrayOptJSONArray == null) {
                                    length2 = jSONArrayOptJSONArray.length();
                                    i2 = 0;
                                    while (i2 < length2) {
                                        c1233cq = c1233cq2;
                                        jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                                        if (jSONObjectOptJSONObject2 == null) {
                                            jSONArray2 = jSONArrayOptJSONArray;
                                            i3 = length2;
                                        } else {
                                            jSONArray2 = jSONArrayOptJSONArray;
                                            strOptString2 = jSONObjectOptJSONObject2.optString("servername");
                                            i3 = length2;
                                            if (!AbstractC1899jh0.N(strOptString2, "download", true)) {
                                                strOptString3 = jSONObjectOptJSONObject2.optString("link");
                                                AbstractC1474fG.g(strOptString3);
                                                if (AbstractC1119bh0.W(strOptString3, str3, false)) {
                                                    jSONArray3 = jSONArray;
                                                    str5 = str3;
                                                    if (AbstractC1119bh0.t0(strOptString3, new String[]{str3}, 0, 6).size() == 3) {
                                                        c1603gf0.getClass();
                                                        strU = t(strOptString3);
                                                    }
                                                    str6 = strU;
                                                    if (str6 != null) {
                                                        arrayList.add(new Ds0(str6, AbstractC1119bh0.E0(strOptString2 + " " + str4).toString(), null, null, 60));
                                                    }
                                                } else {
                                                    str5 = str3;
                                                    jSONArray3 = jSONArray;
                                                }
                                                if (bArrZ != null) {
                                                    c1603gf0.getClass();
                                                    strU = u(strOptString3, bArrZ);
                                                    str6 = strU;
                                                } else {
                                                    str6 = null;
                                                }
                                                if (str6 != null) {
                                                    arrayList.add(new Ds0(str6, AbstractC1119bh0.E0(strOptString2 + " " + str4).toString(), null, null, 60));
                                                }
                                            }
                                            i2++;
                                            jSONArrayOptJSONArray = jSONArray2;
                                            c1233cq2 = c1233cq;
                                            length2 = i3;
                                            jSONArray = jSONArray3;
                                            str3 = str5;
                                        }
                                        str5 = str3;
                                        jSONArray3 = jSONArray;
                                        i2++;
                                        jSONArrayOptJSONArray = jSONArray2;
                                        c1233cq2 = c1233cq;
                                        length2 = i3;
                                        jSONArray = jSONArray3;
                                        str3 = str5;
                                    }
                                }
                            }
                            i++;
                            length = length;
                            c1233cq2 = c1233cq2;
                            jSONArray = jSONArray;
                            str3 = str3;
                        }
                        c1233cq = c1233cq2;
                        str5 = str3;
                    } else {
                        c1233cq = c1233cq2;
                        str5 = str3;
                    }
                    for (C3176wp c3176wp : c0660On.W(".ODDIV .OD_1 li[onclick]")) {
                        String strD2 = c3176wp.d("onclick");
                        Pattern patternCompile5 = Pattern.compile("go_to_playerVast\\(\\s*'([^']+)'");
                        AbstractC1474fG.i(patternCompile5, "compile(...)");
                        AbstractC1474fG.g(strD2);
                        Matcher matcher5 = patternCompile5.matcher(strD2);
                        AbstractC1474fG.i(matcher5, "matcher(...)");
                        jnA2 = AbstractC1370eA.a(matcher5, 0, strD2);
                        if (jnA2 != null) {
                            if (arrayList.isEmpty()) {
                                it2 = arrayList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                    }
                                } while (!AbstractC1474fG.b(((Ds0) it2.next()).l, string));
                            }
                            arrayList.add(new Ds0(string, string2, null, null, 60));
                            break;
                            break;
                        }
                    }
                    c3176wpX = c0660On.X("iframe");
                    if (c3176wpX != null) {
                        if (strD.length() > 0) {
                            strD = null;
                        }
                        if (strD != null) {
                            strB0 = AbstractC1119bh0.B0(AbstractC1899jh0.R(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD, "//", strD), "/"), "www.", "", false), str5);
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
                            String str11 = strB0;
                            if (arrayList.isEmpty()) {
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC1474fG.b(((Ds0) it.next()).l, strD)) {
                                    }
                                }
                            }
                            arrayList.add(new Ds0(strD, str11, null, null, 60));
                        }
                    }
                    return arrayList;
                }
                if (i5 == 1) {
                    Jp0.O(objA);
                    return (List) objA;
                }
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1603gf0 = c1212cf0.l;
                Jp0.O(objA);
                C0660On c0660On2 = (C0660On) objA;
                String strR2 = c0660On2.R();
                arrayList = new ArrayList();
                try {
                    Pattern patternCompile6 = Pattern.compile("const\\s+POW_CHALLENGE\\s*=\\s*'([^']+)';");
                    AbstractC1474fG.i(patternCompile6, "compile(...)");
                    AbstractC1474fG.g(strR2);
                    Matcher matcher6 = patternCompile6.matcher(strR2);
                    AbstractC1474fG.i(matcher6, "matcher(...)");
                    jnA3 = AbstractC1370eA.a(matcher6, 0, strR2);
                    if (jnA3 != null) {
                        str8 = (String) ((HN) jnA3.a()).get(1);
                    } else {
                        str8 = null;
                    }
                    Pattern patternCompile7 = Pattern.compile("const\\s+POW_DIFFICULTY\\s*=\\s*(\\d+);");
                    AbstractC1474fG.i(patternCompile7, "compile(...)");
                    Matcher matcher7 = patternCompile7.matcher(strR2);
                    AbstractC1474fG.i(matcher7, "matcher(...)");
                    jnA4 = AbstractC1370eA.a(matcher7, 0, strR2);
                    if (jnA4 != null || (str10 = (String) ((HN) jnA4.a()).get(1)) == null) {
                        numJ = null;
                    } else {
                        numJ = AbstractC1802ih0.J(str10);
                    }
                    Pattern patternCompile8 = Pattern.compile("const\\s+POW_SALT\\s*=\\s*'([^']+)';");
                    AbstractC1474fG.i(patternCompile8, "compile(...)");
                    Matcher matcher8 = patternCompile8.matcher(strR2);
                    AbstractC1474fG.i(matcher8, "matcher(...)");
                    jnA5 = AbstractC1370eA.a(matcher8, 0, strR2);
                    if (jnA5 != null) {
                        str9 = (String) ((HN) jnA5.a()).get(1);
                    } else {
                        str9 = null;
                    }
                    if (str8 != null || numJ == null || str9 == null) {
                        bArrZ = null;
                    } else {
                        int iIntValue = numJ.intValue();
                        c1603gf0.getClass();
                        bArrZ = z(str8, iIntValue, str9);
                    }
                } catch (Exception unused2) {
                }
                Pattern patternCompile9 = Pattern.compile("dataLink = (\\[.+?\\]);");
                AbstractC1474fG.i(patternCompile9, "compile(...)");
                AbstractC1474fG.g(strR2);
                Matcher matcher9 = patternCompile9.matcher(strR2);
                AbstractC1474fG.i(matcher9, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher9, 0, strR2);
                str3 = ".";
                if (jnA != null) {
                    try {
                        jSONArray = new JSONArray((String) ((HN) jnA.a()).get(1));
                        length = jSONArray.length();
                        i = 0;
                        while (i < length) {
                            jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                strOptString = jSONObjectOptJSONObject.optString("video_language");
                                if (strOptString != null) {
                                    switch (strOptString.hashCode()) {
                                        case 68962:
                                            if (strOptString.equals("ESP")) {
                                                str4 = "";
                                            } else {
                                                str4 = "[CAST]";
                                            }
                                            break;
                                        case 73209:
                                            if (strOptString.equals("JAP")) {
                                                str4 = "";
                                            } else {
                                                str4 = "[JAP]";
                                            }
                                            break;
                                        case 75135:
                                            if (strOptString.equals("LAT")) {
                                                str4 = "[LAT]";
                                            } else {
                                                str4 = "";
                                            }
                                            break;
                                        case 82464:
                                            if (strOptString.equals("SUB")) {
                                                str4 = "";
                                            } else {
                                                str4 = "[SUB]";
                                            }
                                            break;
                                        default:
                                            str4 = "";
                                            break;
                                    }
                                } else {
                                    str4 = "";
                                }
                                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("sortedEmbeds");
                                if (jSONArrayOptJSONArray == null) {
                                    length2 = jSONArrayOptJSONArray.length();
                                    i2 = 0;
                                    while (i2 < length2) {
                                        c1233cq = c1233cq2;
                                        try {
                                            jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                                            if (jSONObjectOptJSONObject2 == null) {
                                                jSONArray2 = jSONArrayOptJSONArray;
                                                i3 = length2;
                                            } else {
                                                jSONArray2 = jSONArrayOptJSONArray;
                                                strOptString2 = jSONObjectOptJSONObject2.optString("servername");
                                                i3 = length2;
                                                if (!AbstractC1899jh0.N(strOptString2, "download", true)) {
                                                    strOptString3 = jSONObjectOptJSONObject2.optString("link");
                                                    AbstractC1474fG.g(strOptString3);
                                                    if (AbstractC1119bh0.W(strOptString3, str3, false)) {
                                                        jSONArray3 = jSONArray;
                                                        str5 = str3;
                                                        try {
                                                            if (AbstractC1119bh0.t0(strOptString3, new String[]{str3}, 0, 6).size() == 3) {
                                                                c1603gf0.getClass();
                                                                strU = t(strOptString3);
                                                            }
                                                            str6 = strU;
                                                            if (str6 != null) {
                                                                arrayList.add(new Ds0(str6, AbstractC1119bh0.E0(strOptString2 + " " + str4).toString(), null, null, 60));
                                                            }
                                                        } catch (Exception unused3) {
                                                        }
                                                    } else {
                                                        str5 = str3;
                                                        jSONArray3 = jSONArray;
                                                    }
                                                    if (bArrZ != null) {
                                                        c1603gf0.getClass();
                                                        strU = u(strOptString3, bArrZ);
                                                        str6 = strU;
                                                    } else {
                                                        str6 = null;
                                                    }
                                                    if (str6 != null) {
                                                        arrayList.add(new Ds0(str6, AbstractC1119bh0.E0(strOptString2 + " " + str4).toString(), null, null, 60));
                                                    }
                                                }
                                                i2++;
                                                jSONArrayOptJSONArray = jSONArray2;
                                                c1233cq2 = c1233cq;
                                                length2 = i3;
                                                jSONArray = jSONArray3;
                                                str3 = str5;
                                            }
                                            str5 = str3;
                                            jSONArray3 = jSONArray;
                                            i2++;
                                            jSONArrayOptJSONArray = jSONArray2;
                                            c1233cq2 = c1233cq;
                                            length2 = i3;
                                            jSONArray = jSONArray3;
                                            str3 = str5;
                                        } catch (Exception unused4) {
                                            str5 = str3;
                                        }
                                    }
                                }
                            }
                            i++;
                            length = length;
                            c1233cq2 = c1233cq2;
                            jSONArray = jSONArray;
                            str3 = str3;
                        }
                    } catch (Exception unused5) {
                    }
                    c1233cq = c1233cq2;
                    str5 = str3;
                } else {
                    c1233cq = c1233cq2;
                    str5 = str3;
                }
                try {
                    while (r0.hasNext()) {
                        String strD3 = c3176wp.d("onclick");
                        Pattern patternCompile10 = Pattern.compile("go_to_playerVast\\(\\s*'([^']+)'");
                        AbstractC1474fG.i(patternCompile10, "compile(...)");
                        AbstractC1474fG.g(strD3);
                        Matcher matcher10 = patternCompile10.matcher(strD3);
                        AbstractC1474fG.i(matcher10, "matcher(...)");
                        jnA2 = AbstractC1370eA.a(matcher10, 0, strD3);
                        if (jnA2 != null && (str7 = (String) AbstractC0911Ye.e0(1, jnA2.a())) != null && (string = AbstractC1119bh0.E0(str7).toString()) != null && !AbstractC1899jh0.O(string) && (c3176wpX2 = c3176wp.X("span")) != null && (strZ = c3176wpX2.Z()) != null && (string2 = AbstractC1119bh0.E0(strZ).toString()) != null && !AbstractC1899jh0.N(string2, "1fichier", true) && !AbstractC1899jh0.N(string2, "download", true)) {
                            if (arrayList.isEmpty()) {
                                it2 = arrayList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                    }
                                } while (!AbstractC1474fG.b(((Ds0) it2.next()).l, string));
                            }
                            arrayList.add(new Ds0(string, string2, null, null, 60));
                            break;
                        }
                    }
                    c3176wpX = c0660On2.X("iframe");
                    if (c3176wpX != null && (strD = c3176wpX.d("src")) != null) {
                        if (strD.length() > 0) {
                            strD = null;
                        }
                        if (strD != null) {
                            strB0 = AbstractC1119bh0.B0(AbstractC1899jh0.R(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD, "//", strD), "/"), "www.", "", false), str5);
                            if (strB0.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                String strValueOf2 = String.valueOf(strB0.charAt(0));
                                AbstractC1474fG.h(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                                AbstractC1474fG.i(upperCase2, "toUpperCase(...)");
                                sb2.append((Object) upperCase2);
                                String strSubstring2 = strB0.substring(1);
                                AbstractC1474fG.i(strSubstring2, "substring(...)");
                                sb2.append(strSubstring2);
                                strB0 = sb2.toString();
                            }
                            String str12 = strB0;
                            if (arrayList.isEmpty()) {
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC1474fG.b(((Ds0) it.next()).l, strD)) {
                                    }
                                }
                            }
                            arrayList.add(new Ds0(strD, str12, null, null, 60));
                        }
                    }
                    return arrayList;
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                c1233cq = c1233cq2;
            }
        } catch (Exception e2) {
            e2.getMessage();
            return c1233cq2;
        }
        return c1233cq;
    }
}
