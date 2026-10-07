package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0920Yn extends AbstractC3473zs {
    public final /* synthetic */ int b;
    public final Object c;
    public final Serializable d;

    public C0920Yn(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = AbstractC0937Ze.K("https://yadi.sk", "https://disk.yandex.ru");
                this.d = new Rh0(C1693hb0.C);
                break;
            default:
                this.c = new Random();
                this.d = new I60("^https?://[\\w.-]+(/[\\w.-/~]+)*$");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0127  */
    /* JADX WARN: Code duplicated, block: B:31:0x0131  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b A[LOOP:0: B:32:0x0137->B:34:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0194  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static Object f(C0920Yn c0920Yn, String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C0894Xn c0894Xn;
        String str2;
        InterfaceC0868Wn interfaceC0868Wn;
        String str3;
        String str4;
        C0920Yn c0920Yn2;
        String str5;
        String str6;
        StringBuilder sb;
        int i;
        String str7;
        String strD;
        C0920Yn c0920Yn3 = c0920Yn;
        int i2 = 4;
        int i3 = 1;
        if (interfaceC0473Hh instanceof C0894Xn) {
            c0894Xn = (C0894Xn) interfaceC0473Hh;
            int i4 = c0894Xn.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0894Xn.r = i4 - Integer.MIN_VALUE;
            } else {
                c0894Xn = new C0894Xn(c0920Yn3, interfaceC0473Hh);
            }
        } else {
            c0894Xn = new C0894Xn(c0920Yn3, interfaceC0473Hh);
        }
        Object obj = c0894Xn.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = c0894Xn.r;
        if (i5 != 0) {
            if (i5 == 1) {
                String str8 = c0894Xn.f623o;
                InterfaceC0868Wn interfaceC0868Wn2 = (InterfaceC0868Wn) c0894Xn.n;
                str2 = c0894Xn.m;
                C0920Yn c0920Yn4 = c0894Xn.l;
                Jp0.O(obj);
                interfaceC0868Wn = interfaceC0868Wn2;
                str3 = str8;
                c0920Yn3 = c0920Yn4;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = c0894Xn.f623o;
                str4 = (String) c0894Xn.n;
                str3 = c0894Xn.m;
                c0920Yn2 = c0894Xn.l;
                Jp0.O(obj);
            }
            str6 = (String) obj;
            if (str6.length() != 0) {
                throw new Exception(AbstractC1701hf0.t("Empty response from ", str4));
            }
            if (((I60) c0920Yn2.d).d(str6)) {
                throw new Exception("Invalid video base URL: ".concat(str6));
            }
            sb = new StringBuilder();
            for (i = 0; i < 10; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(((Random) c0920Yn2.c).nextInt(62)));
            }
            String string = sb.toString();
            AbstractC1474fG.i(string, "toString(...)");
            str7 = "~" + string + "?token=" + str5 + "&expiry=" + System.currentTimeMillis();
            if (AbstractC1899jh0.L(str6, "~", false) || !AbstractC1899jh0.U(str7, "~", false)) {
                strD = AbstractC1701hf0.d(str6, str7);
            } else {
                String strSubstring = str7.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                strD = str6.concat(strSubstring);
            }
            return new Js0(strD, AbstractC3327yN.z(new C1101bX("Referer", str3), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36"), new C1101bX("Accept", "*/*"), new C1101bX("Accept-Encoding", "identity"), new C1101bX("Icy-MetaData", "1")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
        }
        Jp0.O(obj);
        c0920Yn.getClass();
        NV nvJ = AbstractC1370eA.j();
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvJ);
        nvJ.h = true;
        nvJ.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.e(15L, timeUnit);
        nvJ.i(15L, timeUnit);
        OV ov = new OV(nvJ);
        C1583gR c1583gRK = AbstractC1370eA.k();
        str2 = "https://do7go.com";
        c1583gRK.f("https://do7go.com");
        P9 p9 = new P9(i3);
        ArrayList arrayList = (ArrayList) c1583gRK.f793o;
        arrayList.add(p9);
        arrayList.add(new P9(i2));
        c1583gRK.m = ov;
        Object objB = c1583gRK.m().b(InterfaceC0868Wn.class);
        AbstractC1474fG.i(objB, "create(...)");
        InterfaceC0868Wn interfaceC0868Wn3 = (InterfaceC0868Wn) objB;
        String strR = AbstractC1899jh0.R(AbstractC1899jh0.R(str, "/d/", "/e/", false), "doodstream.com", "do7go.com", false);
        c0894Xn.l = c0920Yn3;
        c0894Xn.m = "https://do7go.com";
        c0894Xn.n = interfaceC0868Wn3;
        c0894Xn.f623o = strR;
        c0894Xn.r = 1;
        Object objA = interfaceC0868Wn3.a(strR, strR, c0894Xn);
        if (objA == enumC1706hi) {
            return enumC1706hi;
        }
        interfaceC0868Wn = interfaceC0868Wn3;
        str3 = strR;
        obj = objA;
        String str9 = str2;
        InterfaceC0868Wn interfaceC0868Wn4 = interfaceC0868Wn;
        Pattern patternCompile = Pattern.compile("/pass_md5/[^']*");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strR2 = ((C0660On) obj).R();
        AbstractC1474fG.i(strR2, "toString(...)");
        Matcher matcher = patternCompile.matcher(strR2);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, strR2);
        if (jnA == null) {
            throw new Exception(AbstractC1701hf0.t("Can't find md5 in ", str3));
        }
        String strC = jnA.c();
        String strD2 = AbstractC1701hf0.d(str9, strC);
        String strZ0 = AbstractC1119bh0.z0(strC, "/");
        c0894Xn.l = c0920Yn3;
        c0894Xn.m = str3;
        c0894Xn.n = strD2;
        c0894Xn.f623o = strZ0;
        c0894Xn.r = 2;
        Object objB2 = interfaceC0868Wn4.b(strD2, str3, c0894Xn);
        if (objB2 == enumC1706hi) {
            return enumC1706hi;
        }
        str4 = strD2;
        c0920Yn2 = c0920Yn3;
        str5 = strZ0;
        obj = objB2;
        str6 = (String) obj;
        if (str6.length() != 0) {
            throw new Exception(AbstractC1701hf0.t("Empty response from ", str4));
        }
        if (((I60) c0920Yn2.d).d(str6)) {
            throw new Exception("Invalid video base URL: ".concat(str6));
        }
        sb = new StringBuilder();
        while (i < 10) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(((Random) c0920Yn2.c).nextInt(62)));
        }
        String string2 = sb.toString();
        AbstractC1474fG.i(string2, "toString(...)");
        str7 = "~" + string2 + "?token=" + str5 + "&expiry=" + System.currentTimeMillis();
        if (AbstractC1899jh0.L(str6, "~", false)) {
            strD = AbstractC1701hf0.d(str6, str7);
        } else {
            strD = AbstractC1701hf0.d(str6, str7);
        }
        return new Js0(strD, AbstractC3327yN.z(new C1101bX("Referer", str3), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36"), new C1101bX("Accept", "*/*"), new C1101bX("Accept-Encoding", "identity"), new C1101bX("Icy-MetaData", "1")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        JSONObject jSONObject;
        int i;
        Object objK;
        switch (this.b) {
            case 0:
                return f(this, str, interfaceC0473Hh);
            default:
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u(str);
                c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
                C1855j80 c1855j80G = ((OV) ((Rh0) this.d).getValue()).c(c0560Kq.c()).g();
                try {
                    if (!c1855j80G.p()) {
                        throw new Exception("Yandex: HTTP " + c1855j80G.f840o + " fetching " + str);
                    }
                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                    String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                    AbstractC3409z9.g(c1855j80G, null);
                    if (strQ == null) {
                        throw new Exception("Yandex: empty response for ".concat(str));
                    }
                    int iE0 = AbstractC1119bh0.e0(strQ, "\"videoStreams\":", 0, false, 6);
                    Integer numValueOf = Integer.valueOf(iE0);
                    if (iE0 < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iD0 = AbstractC1119bh0.d0(strQ, '{', numValueOf.intValue() + 15, false, 4);
                        Integer numValueOf2 = Integer.valueOf(iD0);
                        if (iD0 < 0) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            int iIntValue = numValueOf2.intValue();
                            int length = strQ.length();
                            int i2 = iIntValue;
                            int i3 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    i = -1;
                                } else {
                                    char cCharAt = strQ.charAt(i2);
                                    if (cCharAt == '{') {
                                        i3++;
                                    } else if (cCharAt == '}' && (i3 = i3 - 1) == 0) {
                                        i = i2 + 1;
                                    }
                                    i2++;
                                }
                            }
                            if (i == -1) {
                                jSONObject = null;
                            } else {
                                try {
                                    String strSubstring = strQ.substring(iIntValue, i);
                                    AbstractC1474fG.i(strSubstring, "substring(...)");
                                    objK = new JSONObject(strSubstring);
                                } catch (Throwable th) {
                                    objK = Jp0.k(th);
                                }
                                if (objK instanceof C2439p80) {
                                    objK = null;
                                }
                                jSONObject = (JSONObject) objK;
                            }
                        } else {
                            jSONObject = null;
                        }
                        break;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        throw new Exception("Yandex: no videoStreams found (not a public video, or not video-playable) for ".concat(str));
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("videos");
                    if (jSONArrayOptJSONArray == null) {
                        throw new Exception("Yandex: videoStreams has no 'videos' array for ".concat(str));
                    }
                    int length2 = jSONArrayOptJSONArray.length();
                    String str2 = null;
                    String str3 = null;
                    int i4 = -1;
                    for (int i5 = 0; i5 < length2; i5++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("url");
                            AbstractC1474fG.g(strOptString);
                            if (!(!AbstractC1899jh0.O(strOptString))) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                if (AbstractC1474fG.b(jSONObjectOptJSONObject.optString("dimension"), "adaptive")) {
                                    str2 = strOptString;
                                } else {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("size");
                                    int iOptInt = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("height", -1) : -1;
                                    if (iOptInt > i4) {
                                        i4 = iOptInt;
                                        str3 = strOptString;
                                    }
                                }
                            }
                        }
                    }
                    if (str2 == null) {
                        if (str3 == null) {
                            throw new Exception("Yandex: videoStreams had no usable HLS url for ".concat(str));
                        }
                        str2 = str3;
                    }
                    return new Js0(str2, AbstractC3327yN.y(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36")), "hls", (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4088);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3409z9.g(c1855j80G, th2);
                        throw th3;
                    }
                }
        }
    }

    @Override // o.AbstractC3473zs
    public List b() {
        switch (this.b) {
            case 1:
                return (List) this.c;
            default:
                return super.b();
        }
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        switch (this.b) {
            case 0:
                return "https://do7go.com";
            default:
                return "https://disk.yandex.com";
        }
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        switch (this.b) {
            case 0:
                return "DoodStream";
            default:
                return "Yandex";
        }
    }
}
