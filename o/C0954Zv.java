package o;

import android.util.Base64;
import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0954Zv implements Q30 {
    public static final C0954Zv b = new C0954Zv();
    public static final String c = "https://flixlatam.com/themes/dooplay/assets/img/favicon.png";
    public static final InterfaceC0305Av d;
    public static final Rh0 e;
    public static final List f;

    static {
        NV nvJ = AbstractC1370eA.j();
        nvJ.h = true;
        nvJ.i = true;
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvJ);
        nvJ.c.add(new C2480pg(5));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        OV ov = new OV(nvJ);
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://flixlatam.com");
        ((ArrayList) c1583gRK.f793o).add(new P9(1));
        c1583gRK.m = ov;
        Object objB = c1583gRK.m().b(InterfaceC0305Av.class);
        AbstractC1474fG.i(objB, "create(...)");
        d = (InterfaceC0305Av) objB;
        e = new Rh0(C2428p3.D);
        C1233cq c1233cq = C1233cq.l;
        f = AbstractC0937Ze.K(new C2420oz("accion", "Acción", c1233cq), new C2420oz("animacion", "Animación", c1233cq), new C2420oz("aventura", "Aventura", c1233cq), new C2420oz("belica", "Bélica", c1233cq), new C2420oz("ciencia-ficcion", "Ciencia Ficción", c1233cq), new C2420oz("comedia", "Comedia", c1233cq), new C2420oz("crimen", "Crimen", c1233cq), new C2420oz("documental", "Documental", c1233cq), new C2420oz("drama", "Drama", c1233cq), new C2420oz("fantasia", "Fantasía", c1233cq), new C2420oz("familia", "Familia", c1233cq), new C2420oz("guerra", "Guerra", c1233cq), new C2420oz("historia", "Historia", c1233cq), new C2420oz("misterio", "Misterio", c1233cq), new C2420oz("romance", "Romance", c1233cq), new C2420oz("suspense", "Suspense", c1233cq), new C2420oz("terror", "Terror", c1233cq), new C2420oz("western", "Western", c1233cq), new C2420oz("dorama", "Doramas", c1233cq));
    }

    public static ArrayList A(C3370yp c3370yp) {
        String string;
        String strD;
        String strD2;
        String strZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = c3370yp.iterator();
        while (it.hasNext()) {
            C3176wp c3176wp = (C3176wp) it.next();
            C3176wp c3176wpX = c3176wp.X(".poster a, .data h3 a, a");
            Cd0 c2109lo0 = null;
            if (c3176wpX != null) {
                String strB = c3176wpX.b("href");
                if (strB.length() == 0) {
                    String strD3 = c3176wpX.d("href");
                    AbstractC1474fG.i(strD3, "attr(...)");
                    strB = D(strD3);
                }
                AbstractC1474fG.g(strB);
                if (!AbstractC1899jh0.O(strB)) {
                    C3176wp c3176wpX2 = c3176wp.X(".data h3 a, .data h3");
                    if (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null || (string = AbstractC1119bh0.E0(strZ).toString()) == null) {
                        String strD4 = c3176wpX.d("title");
                        AbstractC1474fG.i(strD4, "attr(...)");
                        string = AbstractC1119bh0.E0(strD4).toString();
                    }
                    String str = string;
                    if (str != null && !AbstractC1899jh0.O(str)) {
                        C3176wp c3176wpX3 = c3176wp.X("img");
                        if (c3176wpX3 == null || (strD2 = c3176wpX3.d("src")) == null) {
                            C3176wp c3176wpX4 = c3176wp.X("img");
                            strD = c3176wpX4 != null ? c3176wpX4.d("data-src") : null;
                        } else {
                            strD = strD2;
                        }
                        if (AbstractC1119bh0.W(strB, "/pelicula/", false)) {
                            c2109lo0 = new C1387eR(y(strB, "/pelicula/"), str, null, null, null, null, null, null, strD, strD, null, null, null, null, null, 31996);
                        } else if (AbstractC1119bh0.W(strB, "/serie/", false)) {
                            c2109lo0 = new C2109lo0(y(strB, "/serie/"), str, null, null, null, null, null, null, strD, strD, null, null, null, null, null, null, 64764);
                        } else if (AbstractC1119bh0.W(strB, "/anime/", false)) {
                            c2109lo0 = new C2109lo0("anime/".concat(y(strB, "/anime/")), str, null, null, null, null, null, null, strD, strD, null, null, null, null, null, null, 64764);
                        }
                    }
                }
            }
            if (c2109lo0 != null) {
                arrayList.add(c2109lo0);
            }
        }
        return arrayList;
    }

    public static String B(String str) {
        List listS0 = AbstractC1119bh0.s0(str, new char[]{'-', '_'}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            if (!AbstractC1899jh0.O((String) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC0911Ye.h0(arrayList, " ", null, null, E1.D, 30);
    }

    public static byte[] C(String str) throws NoSuchAlgorithmException {
        String str2;
        JN jnA;
        String str3;
        Integer numJ;
        String str4;
        JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("POW_CHALLENGE\\s*=\\s*'([^']+)'", "compile(...)", str, "matcher(...)"), 0, str);
        if (jnA2 != null && (str2 = (String) ((HN) jnA2.a()).get(1)) != null && (jnA = AbstractC1370eA.a(AbstractC1701hf0.m("POW_DIFFICULTY\\s*=\\s*(\\d+)", "compile(...)", str, "matcher(...)"), 0, str)) != null && (str3 = (String) ((HN) jnA.a()).get(1)) != null && (numJ = AbstractC1802ih0.J(str3)) != null) {
            int iIntValue = numJ.intValue();
            JN jnA3 = AbstractC1370eA.a(AbstractC1701hf0.m("POW_SALT\\s*=\\s*'([^']+)'", "compile(...)", str, "matcher(...)"), 0, str);
            if (jnA3 == null || (str4 = (String) ((HN) jnA3.a()).get(1)) == null || iIntValue > 5) {
                return null;
            }
            String strQ = AbstractC1899jh0.Q(iIntValue, "0");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 2000001; i++) {
                Charset charset = AbstractC1305dd.a;
                byte[] bytes = (str2 + i).getBytes(charset);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                byte[] bArrDigest = messageDigest.digest(bytes);
                AbstractC1474fG.i(bArrDigest, "digest(...)");
                if (AbstractC1899jh0.U(X5.R(bArrDigest, E1.E), strQ, false)) {
                    byte[] bytes2 = (str2 + i + str4).getBytes(charset);
                    AbstractC1474fG.i(bytes2, "getBytes(...)");
                    return messageDigest.digest(bytes2);
                }
            }
        }
        return null;
    }

    public static String D(String str) {
        if (AbstractC1899jh0.U(str, "http://", false) || AbstractC1899jh0.U(str, "https://", false)) {
            return str;
        }
        return AbstractC1899jh0.U(str, "/", false) ? "https://flixlatam.com".concat(str) : "https://flixlatam.com/".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object p(C0954Zv c0954Zv, Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C0590Lv c0590Lv;
        c0954Zv.getClass();
        if (interfaceC0473Hh instanceof C0590Lv) {
            c0590Lv = (C0590Lv) interfaceC0473Hh;
            int i = c0590Lv.f388o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0590Lv.f388o = i - Integer.MIN_VALUE;
            } else {
                c0590Lv = new C0590Lv(c0954Zv, interfaceC0473Hh);
            }
        } else {
            c0590Lv = new C0590Lv(c0954Zv, interfaceC0473Hh);
        }
        Object objM = c0590Lv.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0590Lv.f388o;
        try {
            if (i2 == 0) {
                Jp0.O(objM);
                System.currentTimeMillis();
                int i3 = AbstractC3473zs.a;
                String str = ds0.l;
                c0590Lv.l = ds0;
                c0590Lv.f388o = 1;
                objM = C0622Nb.m(str, ds0, c0590Lv, 4);
                if (objM == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ds0 = c0590Lv.l;
                Jp0.O(objM);
            }
            Js0 js0 = (Js0) objM;
            String str2 = ds0.m;
            System.currentTimeMillis();
            return js0;
        } catch (Exception e2) {
            String str3 = ds0.m;
            System.currentTimeMillis();
            e2.getMessage();
            throw e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:126:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e A[PHI: r23
  0x016e: PHI (r23v10 java.lang.String) = (r23v8 java.lang.String), (r23v11 java.lang.String), (r23v11 java.lang.String) binds: [B:87:0x0197, B:82:0x016c, B:89:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final List q(Ds0 ds0) {
        String str;
        String strQ;
        Object next;
        String str2;
        String str3;
        String str4;
        Object objK;
        String str5;
        Object objK2;
        String strB;
        String str6;
        String strZ;
        String string;
        Object objK3;
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Object obj;
        String str13;
        String string2;
        String strM;
        AbstractC2051l80 abstractC2051l80;
        String str14 = ds0.l;
        Map map = ds0.f223o;
        if (map == null || (str = (String) map.get("Referer")) == null) {
            str = "https://flixlatam.com";
        }
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str14);
            c0560Kq.j("Referer", str);
            C1855j80 c1855j80G = ((OV) e.getValue()).c(c0560Kq.c()).g();
            strQ = (c1855j80G.p() && (abstractC2051l80 = c1855j80G.r) != null) ? abstractC2051l80.q() : null;
        } catch (Exception e2) {
            e2.getMessage();
            strQ = null;
        }
        if (strQ == null) {
            return AbstractC2506pt.A(ds0);
        }
        C3370yp c3370ypW = RN.z(strQ, "").W("script");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        Iterator it = c3370ypW.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            strM = ((C3176wp) next).M();
            AbstractC1474fG.i(strM, "data(...)");
        } while (!AbstractC1119bh0.W(strM, "let dataLink =", false));
        C3176wp c3176wp = (C3176wp) next;
        String strM2 = c3176wp != null ? c3176wp.M() : null;
        String str15 = "download";
        String str16 = "LAT";
        if (strM2 == null) {
            str2 = strQ;
            str3 = "download";
            str4 = "LAT";
        } else {
            JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("let\\s+dataLink\\s*=\\s*(\\[[\\s\\S]*?]);", "compile(...)", strM2, "matcher(...)"), 0, strM2);
            String str17 = jnA != null ? (String) AbstractC0911Ye.e0(1, jnA.a()) : null;
            if (str17 != null) {
                try {
                    objK3 = new JSONArray(str17);
                } catch (Throwable th) {
                    objK3 = Jp0.k(th);
                }
                if (objK3 instanceof C2439p80) {
                    objK3 = null;
                }
                jSONArray = (JSONArray) objK3;
            } else {
                jSONArray = null;
            }
            if (jSONArray == null) {
                jSONObjectOptJSONObject = null;
                break;
            }
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    jSONObjectOptJSONObject = null;
                    break;
                }
                jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONArray("sortedEmbeds") != null) {
                    break;
                }
                i++;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("sortedEmbeds") : null;
            if (jSONObjectOptJSONObject == null || jSONArrayOptJSONArray == null) {
                str2 = strQ;
                str3 = "download";
                str4 = "LAT";
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("video_language");
                String str18 = AbstractC1899jh0.O(strOptString) ? "LAT" : strOptString;
                ArrayList arrayList = new ArrayList();
                int length2 = jSONArrayOptJSONArray.length();
                Object objK4 = null;
                int i2 = 0;
                while (i2 < length2) {
                    int i3 = length2;
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONArray2 = jSONArrayOptJSONArray;
                        str8 = strQ;
                        str9 = strM2;
                        str10 = str15;
                        str7 = str16;
                    } else {
                        jSONArray2 = jSONArrayOptJSONArray;
                        String strOptString2 = jSONObjectOptJSONObject2.optString("servername");
                        str7 = str16;
                        str8 = strQ;
                        if (AbstractC1899jh0.N(strOptString2, str15, true) || AbstractC1899jh0.N(jSONObjectOptJSONObject2.optString("type"), str15, true)) {
                            str9 = strM2;
                            str10 = str15;
                        } else {
                            String strOptString3 = jSONObjectOptJSONObject2.optString("link");
                            AbstractC1474fG.g(strOptString3);
                            try {
                                char[] cArr = new char[1];
                                str10 = str15;
                                try {
                                    cArr[0] = '.';
                                    List listS0 = AbstractC1119bh0.s0(strOptString3, cArr, 0, 6);
                                    if (listS0.size() != 3) {
                                        str11 = null;
                                    } else {
                                        String str19 = (String) listS0.get(1);
                                        int length3 = str19.length() % 4;
                                        if (length3 != 0) {
                                            str19 = str19 + AbstractC1899jh0.Q(4 - length3, "=");
                                        }
                                        byte[] bArrDecode = Base64.decode(str19, 10);
                                        AbstractC1474fG.i(bArrDecode, "decode(...)");
                                        String str20 = new String(bArrDecode, AbstractC1305dd.a);
                                        Pattern patternCompile = Pattern.compile("\"link\"\\s*:\\s*\"([^\"]+)\"");
                                        AbstractC1474fG.i(patternCompile, "compile(...)");
                                        Matcher matcher = patternCompile.matcher(str20);
                                        AbstractC1474fG.i(matcher, "matcher(...)");
                                        JN jnA2 = AbstractC1370eA.a(matcher, 0, str20);
                                        if (jnA2 != null) {
                                            str11 = (String) ((HN) jnA2.a()).get(1);
                                        } else {
                                            str11 = null;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                str10 = str15;
                            }
                            if (str11 == null) {
                                if (objK4 == null) {
                                    try {
                                        objK4 = C(strM2);
                                    } catch (Throwable th2) {
                                        objK4 = Jp0.k(th2);
                                    }
                                    if (objK4 instanceof C2439p80) {
                                        objK4 = null;
                                    }
                                }
                                Object obj2 = objK4;
                                byte[] bArr = (byte[]) obj2;
                                if (bArr != null) {
                                    try {
                                        byte[] bArrDecode2 = Base64.decode(strOptString3, 0);
                                        if (bArrDecode2.length < 17) {
                                            str9 = strM2;
                                            obj = obj2;
                                            string2 = null;
                                        } else {
                                            str9 = strM2;
                                            try {
                                                byte[] bArrM = X5.M(bArrDecode2, 0, 16);
                                                byte[] bArrM2 = X5.M(bArrDecode2, 16, bArrDecode2.length);
                                                obj = obj2;
                                                try {
                                                    SecretKeySpec secretKeySpec = new SecretKeySpec(X5.M(bArr, 0, 32), "AES");
                                                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                                    cipher.init(2, secretKeySpec, new IvParameterSpec(bArrM));
                                                    byte[] bArrDoFinal = cipher.doFinal(bArrM2);
                                                    AbstractC1474fG.i(bArrDoFinal, "doFinal(...)");
                                                    string2 = AbstractC1119bh0.E0(new String(bArrDoFinal, AbstractC1305dd.a)).toString();
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    e.getMessage();
                                                    string2 = null;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                obj = obj2;
                                                e.getMessage();
                                                string2 = null;
                                                str13 = string2;
                                                if (str13 == null) {
                                                    objK4 = obj;
                                                } else {
                                                    str12 = str13;
                                                    objK4 = obj;
                                                    AbstractC1474fG.g(strOptString2);
                                                    arrayList.add(new Ds0(str12, B(strOptString2) + " [" + str18 + "]", null, AbstractC3327yN.y(new C1101bX("Referer", str14)), 52));
                                                }
                                                i2++;
                                                length2 = i3;
                                                jSONArrayOptJSONArray = jSONArray2;
                                                str16 = str7;
                                                strQ = str8;
                                                str15 = str10;
                                                strM2 = str9;
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        str9 = strM2;
                                    }
                                    str13 = string2;
                                } else {
                                    str9 = strM2;
                                    obj = obj2;
                                    str13 = null;
                                }
                                if (str13 == null) {
                                    objK4 = obj;
                                } else {
                                    str12 = str13;
                                    objK4 = obj;
                                }
                            } else {
                                str9 = strM2;
                                str12 = str11;
                            }
                            AbstractC1474fG.g(strOptString2);
                            arrayList.add(new Ds0(str12, B(strOptString2) + " [" + str18 + "]", null, AbstractC3327yN.y(new C1101bX("Referer", str14)), 52));
                        }
                    }
                    i2++;
                    length2 = i3;
                    jSONArrayOptJSONArray = jSONArray2;
                    str16 = str7;
                    strQ = str8;
                    str15 = str10;
                    strM2 = str9;
                }
                str2 = strQ;
                str3 = str15;
                str4 = str16;
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
        }
        String str21 = str2;
        if (AbstractC1119bh0.W(str21, "go_to_playerVast(", false) || AbstractC1119bh0.W(str21, "go_to_player(", false)) {
            try {
                objK = new URI(str14).getHost();
            } catch (Throwable th3) {
                objK = Jp0.k(th3);
            }
            if (objK instanceof C2439p80) {
                objK = null;
            }
            String str22 = (String) objK;
            String str23 = str22 == null ? "" : str22;
            C0660On c0660OnZ = RN.z(str21, str14);
            ArrayList arrayList2 = new ArrayList();
            for (C3176wp c3176wp2 : c0660OnZ.W("li[onclick*=go_to_player]")) {
                String strD = c3176wp2.d("onclick");
                Pattern patternCompile2 = Pattern.compile("go_to_player(?:Vast)?\\s*\\(\\s*['\"]([^'\"]+)['\"]");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                AbstractC1474fG.g(strD);
                Matcher matcher2 = patternCompile2.matcher(strD);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                JN jnA3 = AbstractC1370eA.a(matcher2, 0, strD);
                if (jnA3 == null || (str5 = (String) ((HN) jnA3.a()).get(1)) == null) {
                    str3 = str3;
                    str3 = str3;
                } else if (!AbstractC1899jh0.O(str5) && !AbstractC1899jh0.U(str5, "javascript", false)) {
                    try {
                        objK2 = new URI(str5).getHost();
                    } catch (Throwable th4) {
                        objK2 = Jp0.k(th4);
                    }
                    if (objK2 instanceof C2439p80) {
                        objK2 = null;
                    }
                    String str24 = (String) objK2;
                    if (str24 == null) {
                        str24 = r8;
                    }
                    if (!AbstractC1474fG.b(str24, str23)) {
                        C3176wp c3176wpX = c3176wp2.X("span");
                        if (c3176wpX != null && (strZ = c3176wpX.Z()) != null && (string = AbstractC1119bh0.E0(strZ).toString()) != null) {
                            if (AbstractC1899jh0.O(string)) {
                                string = null;
                            }
                            strB = string == null ? B(AbstractC1119bh0.A0(str24, '.', str24)) : string;
                        }
                        if (!AbstractC1899jh0.N(strB, str3, true)) {
                            String strD2 = c3176wp2.d("data-lang");
                            if (strD2 != null) {
                                switch (strD2.hashCode()) {
                                    case C3080vp0.V /* 48 */:
                                        strD2.equals("0");
                                        str6 = str4;
                                        break;
                                    case 49:
                                        if (strD2.equals("1")) {
                                            str6 = "SUB";
                                        } else {
                                            str6 = str4;
                                        }
                                        break;
                                    case C3080vp0.X /* 50 */:
                                        if (strD2.equals("2")) {
                                            str6 = "ENG";
                                        } else {
                                            str6 = str4;
                                        }
                                        break;
                                    default:
                                        str6 = str4;
                                        break;
                                }
                            } else {
                                str6 = str4;
                            }
                            arrayList2.add(new Ds0(str5, strB + " [" + str6 + "]", null, AbstractC3327yN.y(new C1101bX("Referer", str14)), 52));
                        }
                        str3 = str3;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return AbstractC2506pt.A(ds0);
    }

    public static final Ds0 r(Ds0 ds0) {
        String str;
        String strQ;
        String str2;
        AbstractC2051l80 abstractC2051l80;
        if (!AbstractC1899jh0.U(ds0.l, "flixlatam:ajax:", false)) {
            return ds0;
        }
        List listS0 = AbstractC1119bh0.s0(AbstractC1119bh0.l0(ds0.l, "flixlatam:ajax:"), new char[]{'|'}, 3, 2);
        if (listS0.size() >= 3) {
            Map map = ds0.f223o;
            if (map == null || (str = (String) map.get("Referer")) == null) {
                str = "https://flixlatam.com";
            }
            String str3 = (String) listS0.get(0);
            String str4 = (String) listS0.get(1);
            String str5 = (String) listS0.get(2);
            try {
                Na0 na0 = new Na0(22);
                na0.o("action", "doo_player_ajax");
                na0.o("post", str3);
                na0.o("nume", str5);
                na0.o("type", str4);
                C0540Jw c0540Jw = new C0540Jw((ArrayList) na0.n, (ArrayList) na0.f414o);
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u("https://flixlatam.com/wp-admin/admin-ajax.php");
                c0560Kq.m("POST", c0540Jw);
                c0560Kq.j("Referer", str);
                c0560Kq.j("X-Requested-With", "XMLHttpRequest");
                C1855j80 c1855j80G = ((OV) e.getValue()).c(c0560Kq.c()).g();
                strQ = (c1855j80G.p() && (abstractC2051l80 = c1855j80G.r) != null) ? abstractC2051l80.q() : null;
            } catch (Exception e2) {
                e2.getMessage();
            }
            if (strQ != null) {
                try {
                    String strOptString = new JSONObject(strQ).optString("embed");
                    if (!AbstractC1899jh0.O(strOptString)) {
                        strQ = strOptString;
                    }
                } catch (Exception unused) {
                }
                C3176wp c3176wpX = RN.z(strQ, str).X("iframe");
                if (c3176wpX == null) {
                    str2 = null;
                } else {
                    String strB = c3176wpX.b("src");
                    if (strB.length() == 0) {
                        strB = c3176wpX.d("src");
                    }
                    AbstractC1474fG.g(strB);
                    String strD = D(strB);
                    if (!(true ^ AbstractC1899jh0.O(strD))) {
                        strD = null;
                    }
                    str2 = strD;
                }
                if (str2 != null) {
                    return new Ds0(str2, ds0.m, null, AbstractC3327yN.y(new C1101bX("Referer", str)), 52);
                }
            }
        }
        return null;
    }

    public static final boolean s(String str) {
        Locale locale = Locale.ROOT;
        String strI = AbstractC1701hf0.i(locale, "ROOT", str, locale, "toLowerCase(...)");
        if (AbstractC1119bh0.W(strI, ".m3u8", false) || AbstractC1119bh0.W(strI, ".mp4", false) || AbstractC1119bh0.W(strI, ".mpd", false)) {
            return false;
        }
        List listK = AbstractC0937Ze.K("vidhide", "dhtpre", "peytonepre", "vidhideplus", "filemoon", "moonplayer", "streamwish", "uqloads", "hlswish", "hlwish", "voe.sx", "voe.", "streamtape", "dood", "vidoza", "vidsrc", "vidplay", "mycloud", "moflix", "vixcloud", "goodstream", "rabbitstream", "megacloud", "dokicloud", "streamruby", "rpmvid", "ok.ru", "odnoklassniki", "youtube.com", "youtu.be", "waaw", "netu", "myfilestorage", "uqload", "uqlink.php");
        if (!listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(strI, (String) it.next(), false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String t(int i, String str) {
        if (i <= 1) {
            return str;
        }
        return str + "?page=" + i;
    }

    public static String u(String str) {
        Pattern patternCompile = Pattern.compile("^\\s*[\\p{So}\\p{Sk}\\p{Punct}]+\\s*");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        return AbstractC1119bh0.E0(strReplaceAll).toString();
    }

    public static ArrayList x(C0660On c0660On) {
        String string;
        String strZ;
        ArrayList arrayList = new ArrayList();
        String str = c0660On.x;
        if (AbstractC1899jh0.O(str)) {
            str = "https://flixlatam.com";
        }
        C3370yp c3370ypW = c0660On.W("#playerOptions li .title");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        Iterator it = c3370ypW.iterator();
        while (it.hasNext()) {
            String strZ2 = ((C3176wp) it.next()).Z();
            AbstractC1474fG.i(strZ2, "text(...)");
            arrayList2.add(AbstractC1119bh0.E0(strZ2).toString());
        }
        C3370yp c3370ypW2 = c0660On.W("div[id^=player-]");
        AbstractC1474fG.i(c3370ypW2, "select(...)");
        List listX0 = AbstractC0911Ye.x0(c3370ypW2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listX0) {
            if (((C3176wp) obj).X("iframe") != null) {
                arrayList3.add(obj);
            }
        }
        List listR0 = AbstractC0911Ye.r0(arrayList3, new N2(14));
        ArrayList<C3176wp> arrayList4 = new ArrayList();
        Iterator it2 = listR0.iterator();
        while (it2.hasNext()) {
            C3176wp c3176wpX = ((C3176wp) it2.next()).X("iframe[src]");
            if (c3176wpX != null) {
                arrayList4.add(c3176wpX);
            }
        }
        int i = 0;
        if (!arrayList4.isEmpty()) {
            arrayList4.size();
            for (C3176wp c3176wp : arrayList4) {
                int i2 = i + 1;
                String strB = c3176wp.b("src");
                if (strB.length() == 0) {
                    String strD = c3176wp.d("src");
                    AbstractC1474fG.i(strD, "attr(...)");
                    strB = D(strD);
                }
                String str2 = strB;
                AbstractC1474fG.g(str2);
                if (!AbstractC1899jh0.O(str2)) {
                    String str3 = (String) ((i < 0 || i > AbstractC0937Ze.J(arrayList2)) ? AbstractC1674hK.n(i2, "Servidor ") : arrayList2.get(i));
                    if (!AbstractC1899jh0.N(str3, "download", true)) {
                        arrayList.add(new Ds0(str2, str3, null, AbstractC3327yN.y(new C1101bX("Referer", str)), 52));
                    }
                }
                i = i2;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((Ds0) obj2).l)) {
                    arrayList5.add(obj2);
                }
            }
            return arrayList5;
        }
        C3370yp<C3176wp> c3370ypW3 = c0660On.W("#playerOptions li[data-post], .TPlayerTb li[data-post]");
        AbstractC1474fG.g(c3370ypW3);
        if (!(!c3370ypW3.isEmpty())) {
            for (C3176wp c3176wp2 : c0660On.W(".dooplay_player iframe, .play iframe, #player iframe, iframe[src*=embed], iframe[src*=player]")) {
                int i3 = i + 1;
                String strB2 = c3176wp2.b("src");
                if (strB2.length() == 0) {
                    String strD2 = c3176wp2.d("src");
                    AbstractC1474fG.i(strD2, "attr(...)");
                    strB2 = D(strD2);
                }
                String str4 = strB2;
                AbstractC1474fG.g(str4);
                if (!AbstractC1899jh0.O(str4)) {
                    arrayList.add(new Ds0(str4, (String) ((i < 0 || i > AbstractC0937Ze.J(arrayList2)) ? AbstractC1674hK.n(i3, "Servidor ") : arrayList2.get(i)), null, AbstractC3327yN.y(new C1101bX("Referer", str)), 52));
                }
                i = i3;
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (hashSet2.add(((Ds0) obj3).l)) {
                    arrayList6.add(obj3);
                }
            }
            return arrayList6;
        }
        c3370ypW3.size();
        for (C3176wp c3176wp3 : c3370ypW3) {
            String strD3 = c3176wp3.d("data-post");
            String strD4 = c3176wp3.d("data-num");
            String strD5 = c3176wp3.d("data-type");
            if (AbstractC1899jh0.O(strD5)) {
                strD5 = AbstractC1119bh0.W(str, "/pelicula/", false) ? "movie" : "tv";
            }
            C3176wp c3176wpX2 = c3176wp3.X(".title");
            if (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null || (string = AbstractC1119bh0.E0(strZ).toString()) == null) {
                String strZ3 = c3176wp3.Z();
                AbstractC1474fG.i(strZ3, "text(...)");
                String string2 = AbstractC1119bh0.E0(strZ3).toString();
                if (AbstractC1899jh0.O(string2)) {
                    string2 = "Servidor";
                }
                string = string2;
            }
            String str5 = string;
            if (!AbstractC1899jh0.N(str5, "download", true)) {
                AbstractC1474fG.g(strD3);
                AbstractC1474fG.g(strD4);
                arrayList.add(new Ds0("flixlatam:ajax:" + strD3 + "|" + strD5 + "|" + strD4, str5, null, AbstractC3327yN.y(new C1101bX("Referer", str)), 52));
            }
        }
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (hashSet3.add(((Ds0) obj4).l)) {
                arrayList7.add(obj4);
            }
        }
        return arrayList7;
    }

    public static String y(String str, String str2) {
        String strX0 = AbstractC1119bh0.x0(str, str2, str);
        return AbstractC1119bh0.B0(AbstractC1119bh0.m0(AbstractC1119bh0.A0(strX0, '?', strX0), "/"), "/");
    }

    public static C0357Cv z(C0660On c0660On) {
        Object next;
        String str;
        Pattern patternCompile;
        String strZ;
        String string;
        C3176wp c3176wpX = c0660On.X(".sheader .poster img");
        Object obj = null;
        String strD = c3176wpX != null ? c3176wpX.d("src") : null;
        C3176wp c3176wpX2 = c0660On.X(".sbox .wp-content p");
        String strZ2 = c3176wpX2 != null ? c3176wpX2.Z() : null;
        C3176wp c3176wpX3 = c0660On.X(".srating .rating-value");
        Double dI = (c3176wpX3 == null || (strZ = c3176wpX3.Z()) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strZ, " ", strZ), "/")).toString()) == null) ? null : AbstractC1705hh0.I(string);
        C3370yp c3370ypW = c0660On.W(".sheader .extra .date");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        Iterator it = c3370ypW.iterator();
        while (it.hasNext()) {
            String strZ3 = ((C3176wp) it.next()).Z();
            AbstractC1474fG.i(strZ3, "text(...)");
            arrayList.add(AbstractC1119bh0.E0(strZ3).toString());
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            str = (String) next;
            patternCompile = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            AbstractC1474fG.j(str, "input");
        } while (!patternCompile.matcher(str).matches());
        String str2 = (String) next;
        if (str2 == null) {
            C3370yp c3370ypW2 = c0660On.W(".sheader .extra .date");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(c3370ypW2, 10));
            Iterator it3 = c3370ypW2.iterator();
            while (it3.hasNext()) {
                String strZ4 = ((C3176wp) it3.next()).Z();
                AbstractC1474fG.i(strZ4, "text(...)");
                arrayList2.add(AbstractC1119bh0.E0(strZ4).toString());
            }
            for (Object obj2 : arrayList2) {
                String str3 = (String) obj2;
                Pattern patternCompile2 = Pattern.compile("\\d{4}");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                AbstractC1474fG.j(str3, "input");
                if (patternCompile2.matcher(str3).matches()) {
                    obj = obj2;
                    break;
                }
            }
            str2 = (String) obj;
        }
        C3370yp<C3176wp> c3370ypW3 = c0660On.W(".sgeneros a");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(c3370ypW3, 10));
        for (C3176wp c3176wp : c3370ypW3) {
            String strD2 = c3176wp.d("href");
            AbstractC1474fG.i(strD2, "attr(...)");
            String strY = y(strD2, "/generos/");
            String strZ5 = c3176wp.Z();
            AbstractC1474fG.i(strZ5, "text(...)");
            arrayList3.add(new C2420oz(strY, strZ5, C1233cq.l));
        }
        return new C0357Cv(strD, strD, strZ2, dI, str2, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0902Xv c0902Xv;
        if (interfaceC0473Hh instanceof C0902Xv) {
            c0902Xv = (C0902Xv) interfaceC0473Hh;
            int i2 = c0902Xv.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0902Xv.n = i2 - Integer.MIN_VALUE;
            } else {
                c0902Xv = new C0902Xv(this, interfaceC0473Hh);
            }
        } else {
            c0902Xv = new C0902Xv(this, interfaceC0473Hh);
        }
        Object objT = c0902Xv.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0902Xv.n;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i3 == 0) {
                Jp0.O(objT);
                if (AbstractC1899jh0.O(str)) {
                    List list = f;
                    ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C2420oz.a((C2420oz) it.next(), null, 7));
                    }
                    return arrayList;
                }
                if (i > 1) {
                    return c1233cq;
                }
                C0928Yv c0928Yv = new C0928Yv(2, null);
                c0902Xv.n = 1;
                objT = Pu0.t(str, c0928Yv, c0902Xv);
                if (objT == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objT);
            }
            return (List) objT;
        } catch (Exception e2) {
            e2.getMessage();
            return c1233cq;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0746Rv c0746Rv;
        C0954Zv c0954Zv;
        String str2 = str;
        if (interfaceC0473Hh instanceof C0746Rv) {
            c0746Rv = (C0746Rv) interfaceC0473Hh;
            int i = c0746Rv.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0746Rv.p = i - Integer.MIN_VALUE;
            } else {
                c0746Rv = new C0746Rv(this, interfaceC0473Hh);
            }
        } else {
            c0746Rv = new C0746Rv(this, interfaceC0473Hh);
        }
        Object objA = c0746Rv.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0746Rv.p;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                c0746Rv.l = this;
                c0746Rv.m = str2;
                c0746Rv.p = 1;
                objA = d.a("https://flixlatam.com/pelicula/" + str2, "https://flixlatam.com", c0746Rv);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                c0954Zv = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = c0746Rv.m;
                c0954Zv = c0746Rv.l;
                Jp0.O(objA);
            }
            C0660On c0660On = (C0660On) objA;
            c0954Zv.getClass();
            C0357Cv c0357CvZ = z(c0660On);
            C3176wp c3176wpX = c0660On.X(".sheader .data h1");
            String strZ = c3176wpX != null ? c3176wpX.Z() : null;
            if (strZ == null) {
                strZ = "";
            }
            String str3 = strZ;
            String str4 = c0357CvZ.a;
            String str5 = c0357CvZ.b;
            String str6 = str5 == null ? str4 : str5;
            String str7 = c0357CvZ.c;
            Double d2 = c0357CvZ.d;
            String str8 = c0357CvZ.e;
            List list = c0357CvZ.f;
            C1233cq c1233cq = C1233cq.l;
            C3370yp c3370ypW = c0660On.W(".srelacionados article.item");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            return new C1387eR(str2, str3, str7, str8, null, null, null, d2, str4, str6, list, null, c1233cq, A(c3370ypW), null, 18544);
        } catch (Exception e2) {
            String str9 = str2;
            e2.getMessage();
            return new C1387eR(str9, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        C0668Ov c0668Ov;
        int i;
        Object next;
        Integer numJ;
        C0456Gq c0456Gq;
        String strZ;
        String string;
        C3176wp c3176wpX;
        if (interfaceC0473Hh instanceof C0668Ov) {
            c0668Ov = (C0668Ov) interfaceC0473Hh;
            int i2 = c0668Ov.f444o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0668Ov.f444o = i2 - Integer.MIN_VALUE;
            } else {
                c0668Ov = new C0668Ov(this, interfaceC0473Hh);
            }
        } else {
            c0668Ov = new C0668Ov(this, interfaceC0473Hh);
        }
        Object obj = c0668Ov.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0668Ov.f444o;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i3 == 0) {
                Jp0.O(obj);
                List listS0 = AbstractC1119bh0.s0(str, new char[]{'|'}, 0, 6);
                if (listS0.size() < 2) {
                    return c1233cq;
                }
                String str3 = (String) listS0.get(0);
                Integer numJ2 = AbstractC1802ih0.J((String) listS0.get(1));
                if (numJ2 == null) {
                    return c1233cq;
                }
                int iIntValue = numJ2.intValue();
                InterfaceC0305Av interfaceC0305Av = d;
                String strL0 = AbstractC1119bh0.l0(str3, "/");
                String strConcat = (AbstractC1899jh0.U(strL0, "anime/", false) ? "https://flixlatam.com/" : "https://flixlatam.com/serie/").concat(strL0);
                c0668Ov.l = iIntValue;
                c0668Ov.f444o = 1;
                Object objA = interfaceC0305Av.a(strConcat, "https://flixlatam.com", c0668Ov);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                i = iIntValue;
                obj = objA;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c0668Ov.l;
                Jp0.O(obj);
            }
            C0660On c0660On = (C0660On) obj;
            C3370yp c3370ypW = c0660On.W("#seasons .se-c");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            Iterator it = c3370ypW.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c3176wpX = ((C3176wp) next).X(".se-q .se-t");
            } while (!AbstractC1474fG.b(c3176wpX != null ? c3176wpX.Z() : null, String.valueOf(i)));
            C3176wp c3176wp = (C3176wp) next;
            if (c3176wp == null) {
                return c1233cq;
            }
            C3370yp<C3176wp> c3370ypW2 = c3176wp.W(".episodios li");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            ArrayList arrayList = new ArrayList();
            for (C3176wp c3176wp2 : c3370ypW2) {
                C3176wp c3176wpX2 = c3176wp2.X(".episodiotitle a");
                if (c3176wpX2 == null) {
                    c0456Gq = null;
                } else {
                    String strB = c3176wpX2.b("href");
                    if (strB.length() == 0) {
                        String strD = c3176wpX2.d("href");
                        AbstractC1474fG.i(strD, "attr(...)");
                        strB = D(strD);
                    }
                    C3176wp c3176wpX3 = c3176wp2.X(".numerando");
                    if (c3176wpX3 == null || (strZ = c3176wpX3.Z()) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.x0(strZ, "-", strZ)).toString()) == null || (numJ = AbstractC1802ih0.J(string)) == null) {
                        AbstractC1474fG.g(strB);
                        numJ = AbstractC1802ih0.J(AbstractC1119bh0.z0(strB, "/"));
                        if (numJ == null) {
                            c0456Gq = null;
                        }
                    }
                    int iIntValue2 = numJ.intValue();
                    AbstractC1474fG.g(strB);
                    String strL1 = AbstractC1119bh0.l0(strB, "https://flixlatam.com");
                    String strM0 = AbstractC1119bh0.m0(AbstractC1119bh0.A0(strL1, '?', strL1), "/");
                    String strZ2 = c3176wpX2.Z();
                    if (AbstractC1899jh0.O(strZ2)) {
                        strZ2 = "Episodio " + iIntValue2;
                    }
                    String str4 = strZ2;
                    C3176wp c3176wpX4 = c0660On.X(".sheader .poster img");
                    c0456Gq = new C0456Gq(strM0, iIntValue2, str4, null, c3176wpX4 != null ? c3176wpX4.d("src") : null, null, null, 104);
                }
                if (c0456Gq != null) {
                    arrayList.add(c0456Gq);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.getMessage();
            return c1233cq;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0850Vv c0850Vv;
        C0954Zv c0954Zv;
        if (interfaceC0473Hh instanceof C0850Vv) {
            c0850Vv = (C0850Vv) interfaceC0473Hh;
            int i2 = c0850Vv.f582o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0850Vv.f582o = i2 - Integer.MIN_VALUE;
            } else {
                c0850Vv = new C0850Vv(this, interfaceC0473Hh);
            }
        } else {
            c0850Vv = new C0850Vv(this, interfaceC0473Hh);
        }
        Object objA = c0850Vv.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0850Vv.f582o;
        try {
            if (i3 == 0) {
                Jp0.O(objA);
                InterfaceC0305Av interfaceC0305Av = d;
                String strT = t(i, "https://flixlatam.com/series");
                c0850Vv.l = this;
                c0850Vv.f582o = 1;
                objA = interfaceC0305Av.a(strT, "https://flixlatam.com", c0850Vv);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                c0954Zv = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0954Zv = c0850Vv.l;
                Jp0.O(objA);
            }
            C3370yp c3370ypW = ((C0660On) objA).W(".items article.item");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            c0954Zv.getClass();
            ArrayList arrayListA = A(c3370ypW);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListA) {
                if (obj instanceof C2109lo0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.getMessage();
            return C1233cq.l;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0798Tv c0798Tv;
        String str2;
        C0954Zv c0954Zv;
        if (interfaceC0473Hh instanceof C0798Tv) {
            c0798Tv = (C0798Tv) interfaceC0473Hh;
            int i = c0798Tv.f545o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0798Tv.f545o = i - Integer.MIN_VALUE;
            } else {
                c0798Tv = new C0798Tv(this, interfaceC0473Hh);
            }
        } else {
            c0798Tv = new C0798Tv(this, interfaceC0473Hh);
        }
        Object objA = c0798Tv.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0798Tv.f545o;
        C1233cq c1233cq = C1233cq.l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    c0954Zv = c0798Tv.l;
                    Jp0.O(objA);
                } else if (i2 == 2) {
                    c0954Zv = c0798Tv.l;
                    Jp0.O(objA);
                    c0798Tv.l = null;
                    c0798Tv.f545o = 3;
                    c0954Zv.getClass();
                    objA = zy0.n(new C0565Kv((List) objA, null), c0798Tv);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(objA);
                }
                return (List) objA;
            }
            Jp0.O(objA);
            if (video$Type instanceof Is0) {
                str2 = "https://flixlatam.com/pelicula/" + str;
            } else {
                if (!(video$Type instanceof Hs0)) {
                    return c1233cq;
                }
                if (!AbstractC1899jh0.U(str, "http://", false) && !AbstractC1899jh0.U(str, "https://", false)) {
                    str = "https://flixlatam.com/".concat(AbstractC1119bh0.l0(str, "/"));
                }
                str2 = str;
            }
            InterfaceC0305Av interfaceC0305Av = d;
            c0798Tv.l = this;
            c0798Tv.f545o = 1;
            objA = interfaceC0305Av.a(str2, "https://flixlatam.com", c0798Tv);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            c0954Zv = this;
            c0798Tv.l = c0954Zv;
            c0798Tv.f545o = 2;
            c0954Zv.getClass();
            objA = x((C0660On) objA);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            c0798Tv.l = null;
            c0798Tv.f545o = 3;
            c0954Zv.getClass();
            objA = zy0.n(new C0565Kv((List) objA, null), c0798Tv);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            return (List) objA;
        } catch (Exception e2) {
            e2.getMessage();
            return c1233cq;
        }
    }

    @Override // o.Q30
    public final String f() {
        return c;
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C0720Qv(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "PELICULAS Y SERIES 2";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0694Pv c0694Pv;
        C0954Zv c0954Zv;
        Object next;
        String strB;
        String strZ;
        if (interfaceC0473Hh instanceof C0694Pv) {
            c0694Pv = (C0694Pv) interfaceC0473Hh;
            int i2 = c0694Pv.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0694Pv.p = i2 - Integer.MIN_VALUE;
            } else {
                c0694Pv = new C0694Pv(this, interfaceC0473Hh);
            }
        } else {
            c0694Pv = new C0694Pv(this, interfaceC0473Hh);
        }
        Object objA = c0694Pv.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0694Pv.p;
        if (i3 == 0) {
            Jp0.O(objA);
            try {
                InterfaceC0305Av interfaceC0305Av = d;
                String strT = t(i, "https://flixlatam.com/generos/" + str);
                c0694Pv.l = this;
                c0694Pv.m = str;
                c0694Pv.p = 1;
                objA = interfaceC0305Av.a(strT, "https://flixlatam.com", c0694Pv);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                c0954Zv = this;
            } catch (Exception e2) {
                e = e2;
                c0954Zv = this;
                e.getMessage();
                c0954Zv.getClass();
                return new C2420oz(str, B(str), C1233cq.l);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c0694Pv.m;
            c0954Zv = c0694Pv.l;
            try {
                Jp0.O(objA);
            } catch (Exception e3) {
                e = e3;
                e.getMessage();
                c0954Zv.getClass();
                return new C2420oz(str, B(str), C1233cq.l);
            }
        }
        C0660On c0660On = (C0660On) objA;
        C3370yp c3370ypW = c0660On.W(".items article.item");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        c0954Zv.getClass();
        ArrayList arrayListA = A(c3370ypW);
        C3176wp c3176wpX = c0660On.X("header h1, header h2");
        if (c3176wpX == null || (strZ = c3176wpX.Z()) == null || (strB = u(strZ)) == null) {
            Iterator it = f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((C2420oz) next).a, str));
            C2420oz c2420oz = (C2420oz) next;
            strB = c2420oz != null ? c2420oz.b : B(str);
        }
        return new C2420oz(str, strB, arrayListA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0772Sv c0772Sv;
        C0954Zv c0954Zv;
        if (interfaceC0473Hh instanceof C0772Sv) {
            c0772Sv = (C0772Sv) interfaceC0473Hh;
            int i2 = c0772Sv.f521o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0772Sv.f521o = i2 - Integer.MIN_VALUE;
            } else {
                c0772Sv = new C0772Sv(this, interfaceC0473Hh);
            }
        } else {
            c0772Sv = new C0772Sv(this, interfaceC0473Hh);
        }
        Object objA = c0772Sv.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0772Sv.f521o;
        try {
            if (i3 == 0) {
                Jp0.O(objA);
                InterfaceC0305Av interfaceC0305Av = d;
                String strT = t(i, "https://flixlatam.com/peliculas");
                c0772Sv.l = this;
                c0772Sv.f521o = 1;
                objA = interfaceC0305Av.a(strT, "https://flixlatam.com", c0772Sv);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                c0954Zv = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0954Zv = c0772Sv.l;
                Jp0.O(objA);
            }
            C3370yp c3370ypW = ((C0660On) objA).W(".items article.item");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            c0954Zv.getClass();
            ArrayList arrayListA = A(c3370ypW);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListA) {
                if (obj instanceof C1387eR) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.getMessage();
            return C1233cq.l;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x013c A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x006d, B:30:0x007f, B:34:0x0089, B:38:0x0095, B:40:0x009f, B:41:0x00df, B:43:0x00e5, B:45:0x00f3, B:47:0x00f9, B:49:0x00ff, B:51:0x011f, B:53:0x0125, B:55:0x012f, B:62:0x014e, B:65:0x0172, B:61:0x013c, B:66:0x0177, B:19:0x0042, B:22:0x0055, B:24:0x005d), top: B:70:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x013c, please report this as an issue */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0824Uv c0824Uv;
        C0954Zv c0954Zv;
        Ma0 ma0;
        String strZ;
        Integer numJ;
        String string;
        String strU;
        String str2 = str;
        if (interfaceC0473Hh instanceof C0824Uv) {
            c0824Uv = (C0824Uv) interfaceC0473Hh;
            int i = c0824Uv.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0824Uv.p = i - Integer.MIN_VALUE;
            } else {
                c0824Uv = new C0824Uv(this, interfaceC0473Hh);
            }
        } else {
            c0824Uv = new C0824Uv(this, interfaceC0473Hh);
        }
        Object objA = c0824Uv.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0824Uv.p;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                InterfaceC0305Av interfaceC0305Av = d;
                String strL0 = AbstractC1119bh0.l0(str2, "/");
                String strConcat = (AbstractC1899jh0.U(strL0, "anime/", false) ? "https://flixlatam.com/" : "https://flixlatam.com/serie/").concat(strL0);
                c0824Uv.l = this;
                c0824Uv.m = str2;
                c0824Uv.p = 1;
                objA = interfaceC0305Av.a(strConcat, "https://flixlatam.com", c0824Uv);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
                c0954Zv = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = c0824Uv.m;
                c0954Zv = c0824Uv.l;
                Jp0.O(objA);
            }
            C0660On c0660On = (C0660On) objA;
            c0954Zv.getClass();
            C0357Cv c0357CvZ = z(c0660On);
            C3176wp c3176wpX = c0660On.X(".sheader .data h1");
            String strZ2 = c3176wpX != null ? c3176wpX.Z() : null;
            if (strZ2 == null) {
                strZ2 = "";
            }
            String str3 = strZ2;
            String str4 = c0357CvZ.a;
            String str5 = c0357CvZ.b;
            String str6 = str5 == null ? str4 : str5;
            String str7 = c0357CvZ.c;
            Double d2 = c0357CvZ.d;
            String str8 = c0357CvZ.e;
            List list = c0357CvZ.f;
            C1233cq c1233cq = C1233cq.l;
            C3370yp c3370ypW = c0660On.W(".srelacionados article.item");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            C2109lo0 c2109lo0 = new C2109lo0(str2, str3, str7, str8, null, null, null, d2, str4, str6, null, null, list, null, c1233cq, A(c3370ypW), 11376);
            C3370yp<C3176wp> c3370ypW2 = c0660On.W("#seasons .se-c");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            ArrayList arrayList = new ArrayList();
            for (C3176wp c3176wp : c3370ypW2) {
                C3176wp c3176wpX2 = c3176wp.X(".se-q .se-t");
                if (c3176wpX2 == null || (strZ = c3176wpX2.Z()) == null || (numJ = AbstractC1802ih0.J(strZ)) == null) {
                    ma0 = null;
                } else {
                    int iIntValue = numJ.intValue();
                    String str9 = str2 + "|" + iIntValue;
                    C3176wp c3176wpX3 = c3176wp.X(".se-q .title");
                    if (c3176wpX3 == null || (strU = c3176wpX3.U()) == null || (string = AbstractC1119bh0.E0(strU).toString()) == null) {
                        string = "Temporada " + iIntValue;
                    } else {
                        if (!(!AbstractC1899jh0.O(string))) {
                            string = null;
                        }
                        if (string == null) {
                            string = "Temporada " + iIntValue;
                        }
                    }
                    ma0 = new Ma0(str9, iIntValue, string, c0357CvZ.a, C2109lo0.a(c2109lo0, null, null, null, null, c1233cq, null, 63487), null, 32);
                }
                if (ma0 != null) {
                    arrayList.add(ma0);
                }
            }
            return C2109lo0.a(c2109lo0, null, null, null, null, AbstractC0911Ye.r0(arrayList, new N2(15)), null, 63487);
        } catch (Exception e2) {
            String str10 = str2;
            e2.getMessage();
            return new C2109lo0(str10, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
        }
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Esta función no está disponible");
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
        return AbstractC1376eG.J(AbstractC1910jn.b, new C0876Wv(ds0, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object v(List list, long j, long j2, C0642Nv c0642Nv, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0383Dv c0383Dv;
        C0421Fh c0421Fh;
        if (interfaceC0473Hh instanceof C0383Dv) {
            c0383Dv = (C0383Dv) interfaceC0473Hh;
            int i = c0383Dv.f224o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0383Dv.f224o = i - Integer.MIN_VALUE;
            } else {
                c0383Dv = new C0383Dv(this, interfaceC0473Hh);
            }
        } else {
            c0383Dv = new C0383Dv(this, interfaceC0473Hh);
        }
        Object objI = c0383Dv.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0383Dv.f224o;
        if (i2 == 0) {
            Jp0.O(objI);
            C0497If c0497IfA = AbstractC1474fG.a();
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            Fh0 fh0A = U9.a();
            executorC0891Xk.getClass();
            C0421Fh c0421FhC = zy0.c(Sr0.z(executorC0891Xk, fh0A));
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                arrayList.add(AbstractC1376eG.w(c0421FhC, null, 0, new C0487Hv(c0497IfA, j, (Ds0) it.next(), c0642Nv, null), 3));
            }
            AbstractC1376eG.w(c0421FhC, null, 0, new C0409Ev(arrayList, c0497IfA, null), 3);
            try {
                C0435Fv c0435Fv = new C0435Fv(c0497IfA, null);
                c0383Dv.l = c0421FhC;
                c0383Dv.f224o = 1;
                objI = Nr0.I(j2, c0435Fv, c0383Dv);
                if (objI == enumC1706hi) {
                    return enumC1706hi;
                }
                c0421Fh = c0421FhC;
            } catch (Throwable th) {
                th = th;
                c0421Fh = c0421FhC;
                zy0.i(c0421Fh);
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0421Fh = c0383Dv.l;
            try {
                Jp0.O(objI);
            } catch (Throwable th2) {
                th = th2;
                zy0.i(c0421Fh);
                throw th;
            }
        }
        C0331Bv c0331Bv = (C0331Bv) objI;
        zy0.i(c0421Fh);
        return c0331Bv;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object w(List list, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C0616Mv c0616Mv;
        Ds0 ds0;
        if (interfaceC0473Hh instanceof C0616Mv) {
            c0616Mv = (C0616Mv) interfaceC0473Hh;
            int i = c0616Mv.f404o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0616Mv.f404o = i - Integer.MIN_VALUE;
            } else {
                c0616Mv = new C0616Mv(this, interfaceC0473Hh);
            }
        } else {
            c0616Mv = new C0616Mv(this, interfaceC0473Hh);
        }
        C0616Mv c0616Mv2 = c0616Mv;
        Object objV = c0616Mv2.m;
        Object obj = EnumC1706hi.l;
        int i2 = c0616Mv2.f404o;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    Jp0.O(objV);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ds0 = c0616Mv2.l;
            Jp0.O(objV);
            return new C0331Bv((Js0) objV, ds0);
        }
        Jp0.O(objV);
        if (list.isEmpty()) {
            throw new Exception("No servers provided for FlixLatam");
        }
        if (list.size() != 1) {
            List listR0 = AbstractC0911Ye.r0(list, new C1698he(new N2(13), 2));
            C0642Nv c0642Nv = new C0642Nv(2, null);
            c0616Mv2.f404o = 2;
            objV = v(listR0, 10000L, 15000L, c0642Nv, c0616Mv2);
            return objV == obj ? obj : objV;
        }
        ds0 = (Ds0) AbstractC0911Ye.b0(list);
        c0616Mv2.l = ds0;
        c0616Mv2.f404o = 1;
        objV = n(ds0, c0616Mv2);
        if (objV == obj) {
            return obj;
        }
        return new C0331Bv((Js0) objV, ds0);
    }
}
