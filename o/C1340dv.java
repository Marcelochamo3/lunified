package o;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1340dv extends AbstractC3473zs {
    /* JADX WARN: Code duplicated, block: B:38:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    public static Object f(C1340dv c1340dv, String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C1146bv c1146bv;
        InterfaceC1048av interfaceC1048av;
        C0660On c0660On;
        C3176wp c3176wpX;
        C3176wp c3176wpX2;
        String strD;
        String str2;
        JN jnA;
        String str3;
        String str4;
        C1340dv c1340dv2 = c1340dv;
        String str5 = str;
        int i = 1;
        if (interfaceC0473Hh instanceof C1146bv) {
            c1146bv = (C1146bv) interfaceC0473Hh;
            int i2 = c1146bv.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1146bv.p = i2 - Integer.MIN_VALUE;
            } else {
                c1146bv = new C1146bv(c1340dv2, interfaceC0473Hh);
            }
        } else {
            c1146bv = new C1146bv(c1340dv2, interfaceC0473Hh);
        }
        Object objG = c1146bv.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1146bv.p;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    interfaceC1048av = (InterfaceC1048av) c1146bv.m;
                    str5 = (String) c1146bv.l;
                    Jp0.O(objG);
                    c0660On = (C0660On) objG;
                    c3176wpX = c0660On.X("iframe");
                    if (c3176wpX != null || (strD = c3176wpX.d("src")) == null) {
                        c3176wpX2 = c0660On.X("#iframe-holder iframe");
                        if (c3176wpX2 != null) {
                            strD = c3176wpX2.d("src");
                        } else {
                            strD = null;
                        }
                        if (strD == null) {
                            throw new Exception("FileMoon: Iframe not found");
                        }
                    }
                    System.out.getClass();
                    if (!AbstractC1899jh0.U(strD, "http", false)) {
                        strD = "https:".concat(strD);
                    }
                    c1146bv.l = str5;
                    c1146bv.m = null;
                    c1146bv.p = 3;
                    objG = interfaceC1048av.b(strD, str5, "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/115.0", c1146bv);
                    if (objG == enumC1706hi) {
                        return enumC1706hi;
                    }
                    str2 = str5;
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c1146bv.l;
                    Jp0.O(objG);
                }
                Pattern patternCompile = Pattern.compile("(eval\\(function\\(p,a,c,k,e,d\\)(.|\\n)*?)</script>");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                String strR = ((C0660On) objG).R();
                AbstractC1474fG.i(strR, "toString(...)");
                Matcher matcher = patternCompile.matcher(strR);
                AbstractC1474fG.i(matcher, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher, 0, strR);
                if (jnA != null || (str3 = (String) ((HN) jnA.a()).get(1)) == null) {
                    throw new Exception("FileMoon: Packed JS not found");
                }
                System.out.getClass();
                String strA = new LH(str3).a();
                if (strA == null) {
                    throw new Exception("FileMoon: Unpacked JS is null");
                }
                I60 i60 = new I60("file:\"(.*?)\"");
                JN jnA2 = AbstractC1370eA.a(AbstractC1701hf0.m("sources:\\[(.*?)]", "compile(...)", strA, "matcher(...)"), 0, strA);
                if (jnA2 == null || (str4 = (String) ((HN) jnA2.a()).get(1)) == null) {
                    throw new Exception("FileMoon: No sources found in unpacked JS");
                }
                String str6 = (String) AbstractC0911Ye.d0(Vb0.Q(Vb0.M(I60.c(i60, str4), E1.C)));
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = str6;
                if (str7.length() != 0) {
                    return new Js0(str7, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/115.0"), new C1101bX("Referer", str2)), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
                }
                throw new Exception("FileMoon: Final source is empty");
            }
            String str8 = (String) c1146bv.m;
            C1340dv c1340dv3 = (C1340dv) c1146bv.l;
            try {
                Jp0.O(objG);
            } catch (Exception e) {
                e = e;
                str5 = str8;
                c1340dv2 = c1340dv3;
                e.getMessage();
                System.out.getClass();
                if (!AbstractC1119bh0.W(str5, "bysejikuar", false) || AbstractC1119bh0.W(str5, "japiaguar", false)) {
                    throw e;
                }
                System.out.getClass();
                c1340dv2.getClass();
                C1583gR c1583gRM = AbstractC1370eA.m();
                c1583gRM.f("https://filemoon.site");
                ((ArrayList) c1583gRM.f793o).add(new P9(i));
                Object objB = c1583gRM.m().b(InterfaceC1048av.class);
                AbstractC1474fG.i(objB, "create(...)");
                interfaceC1048av = (InterfaceC1048av) objB;
                c1146bv.l = str5;
                c1146bv.m = interfaceC1048av;
                c1146bv.p = 2;
                objG = interfaceC1048av.a(str5, c1146bv);
                if (objG == enumC1706hi) {
                    return enumC1706hi;
                }
                c0660On = (C0660On) objG;
                c3176wpX = c0660On.X("iframe");
                if (c3176wpX != null) {
                    c3176wpX2 = c0660On.X("#iframe-holder iframe");
                    if (c3176wpX2 != null) {
                        strD = c3176wpX2.d("src");
                    } else {
                        strD = null;
                    }
                    if (strD == null) {
                        throw new Exception("FileMoon: Iframe not found");
                    }
                } else {
                    c3176wpX2 = c0660On.X("#iframe-holder iframe");
                    if (c3176wpX2 != null) {
                        strD = c3176wpX2.d("src");
                    } else {
                        strD = null;
                    }
                    if (strD == null) {
                        throw new Exception("FileMoon: Iframe not found");
                    }
                }
                System.out.getClass();
                if (!AbstractC1899jh0.U(strD, "http", false)) {
                    strD = "https:".concat(strD);
                }
                c1146bv.l = str5;
                c1146bv.m = null;
                c1146bv.p = 3;
                objG = interfaceC1048av.b(strD, str5, "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/115.0", c1146bv);
                if (objG == enumC1706hi) {
                    return enumC1706hi;
                }
                str2 = str5;
                Pattern patternCompile2 = Pattern.compile("(eval\\(function\\(p,a,c,k,e,d\\)(.|\\n)*?)</script>");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                String strR2 = ((C0660On) objG).R();
                AbstractC1474fG.i(strR2, "toString(...)");
                Matcher matcher2 = patternCompile2.matcher(strR2);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher2, 0, strR2);
                if (jnA != null) {
                }
                throw new Exception("FileMoon: Packed JS not found");
            }
        }
        Jp0.O(objG);
        if (AbstractC1119bh0.W(str5, "japiaguar", false) || AbstractC1119bh0.W(str5, "/e/", false)) {
            System.out.getClass();
            try {
                c1146bv.l = c1340dv2;
                c1146bv.m = str5;
                c1146bv.p = 1;
                objG = c1340dv2.g(str5, c1146bv);
                return objG == enumC1706hi ? enumC1706hi : objG;
            } catch (Exception e2) {
                e = e2;
                e.getMessage();
                System.out.getClass();
                if (!AbstractC1119bh0.W(str5, "bysejikuar", false)) {
                }
                throw e;
            }
        }
        System.out.getClass();
        c1340dv2.getClass();
        C1583gR c1583gRM2 = AbstractC1370eA.m();
        c1583gRM2.f("https://filemoon.site");
        ((ArrayList) c1583gRM2.f793o).add(new P9(i));
        Object objB2 = c1583gRM2.m().b(InterfaceC1048av.class);
        AbstractC1474fG.i(objB2, "create(...)");
        interfaceC1048av = (InterfaceC1048av) objB2;
        c1146bv.l = str5;
        c1146bv.m = interfaceC1048av;
        c1146bv.p = 2;
        objG = interfaceC1048av.a(str5, c1146bv);
        if (objG == enumC1706hi) {
            return enumC1706hi;
        }
        c0660On = (C0660On) objG;
        c3176wpX = c0660On.X("iframe");
        if (c3176wpX != null) {
            c3176wpX2 = c0660On.X("#iframe-holder iframe");
            if (c3176wpX2 != null) {
                strD = c3176wpX2.d("src");
            } else {
                strD = null;
            }
            if (strD == null) {
                throw new Exception("FileMoon: Iframe not found");
            }
        } else {
            c3176wpX2 = c0660On.X("#iframe-holder iframe");
            if (c3176wpX2 != null) {
                strD = c3176wpX2.d("src");
            } else {
                strD = null;
            }
            if (strD == null) {
                throw new Exception("FileMoon: Iframe not found");
            }
        }
        System.out.getClass();
        if (!AbstractC1899jh0.U(strD, "http", false)) {
            strD = "https:".concat(strD);
        }
        c1146bv.l = str5;
        c1146bv.m = null;
        c1146bv.p = 3;
        objG = interfaceC1048av.b(strD, str5, "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/115.0", c1146bv);
        if (objG == enumC1706hi) {
            return enumC1706hi;
        }
        str2 = str5;
        Pattern patternCompile3 = Pattern.compile("(eval\\(function\\(p,a,c,k,e,d\\)(.|\\n)*?)</script>");
        AbstractC1474fG.i(patternCompile3, "compile(...)");
        String strR3 = ((C0660On) objG).R();
        AbstractC1474fG.i(strR3, "toString(...)");
        Matcher matcher3 = patternCompile3.matcher(strR3);
        AbstractC1474fG.i(matcher3, "matcher(...)");
        jnA = AbstractC1370eA.a(matcher3, 0, strR3);
        if (jnA != null) {
        }
        throw new Exception("FileMoon: Packed JS not found");
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return f(this, str, interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public String c() {
        return "https://filemoon.site";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Filemoon";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final Object g(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C1243cv c1243cv;
        String str2;
        String strOptString;
        String str3 = str;
        int i = 1;
        if (interfaceC0473Hh instanceof C1243cv) {
            c1243cv = (C1243cv) interfaceC0473Hh;
            int i2 = c1243cv.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1243cv.p = i2 - Integer.MIN_VALUE;
            } else {
                c1243cv = new C1243cv(this, interfaceC0473Hh);
            }
        } else {
            c1243cv = new C1243cv(this, interfaceC0473Hh);
        }
        C1243cv c1243cv2 = c1243cv;
        Object objC = c1243cv2.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1243cv2.p;
        try {
            if (i3 == 0) {
                Jp0.O(objC);
                str2 = "https://" + new URI(str3).getHost();
                String str4 = str2 + "/api/videos/" + ((String) AbstractC0911Ye.i0(AbstractC1119bh0.t0(str3, new String[]{"/"}, 0, 6))) + "/embed/playback";
                AbstractC1474fG.j(str2, "baseUrl");
                C1583gR c1583gRM = AbstractC1370eA.m();
                c1583gRM.f(str2);
                ((ArrayList) c1583gRM.f793o).add(new P9(i));
                Object objB = c1583gRM.m().b(InterfaceC1048av.class);
                AbstractC1474fG.i(objB, "create(...)");
                c1243cv2.l = str3;
                c1243cv2.m = str2;
                c1243cv2.p = 1;
                objC = ((InterfaceC1048av) objB).c(str4, str, str2, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36", c1243cv2);
                if (objC == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str5 = c1243cv2.m;
                String str6 = c1243cv2.l;
                Jp0.O(objC);
                str2 = str5;
                str3 = str6;
            }
            JSONObject jSONObject = new JSONObject(((AbstractC2051l80) objC).q()).getJSONObject("playback");
            String string = jSONObject.getString("iv");
            String string2 = jSONObject.getString("payload");
            JSONArray jSONArray = jSONObject.getJSONArray("key_parts");
            byte[] bArrDecode = Base64.decode(string, 8);
            byte[] bArrDecode2 = Base64.decode(string2, 8);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                byteArrayOutputStream.write(Base64.decode(jSONArray.getString(i4), 8));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDecode);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(byteArray, "AES"), gCMParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode2);
            AbstractC1474fG.g(bArrDoFinal);
            String str7 = new String(bArrDoFinal, AbstractC1305dd.a);
            int iG0 = AbstractC1119bh0.g0(str7, '}', 0, 6);
            if (iG0 != -1) {
                str7 = str7.substring(0, iG0 + 1);
                AbstractC1474fG.i(str7, "substring(...)");
            }
            System.out.getClass();
            JSONObject jSONObject2 = new JSONObject(str7);
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("sources");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                strOptString = jSONObject2.optString("url");
                AbstractC1474fG.i(strOptString, "optString(...)");
            } else {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(0);
                strOptString = jSONObject3.optString("file");
                AbstractC1474fG.i(strOptString, "optString(...)");
                if (strOptString.length() == 0) {
                    strOptString = jSONObject3.optString("url");
                    AbstractC1474fG.i(strOptString, "optString(...)");
                }
            }
            String str8 = strOptString;
            if (str8.length() != 0) {
                return new Js0(str8, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"), new C1101bX("Referer", str3), new C1101bX("Origin", str2)), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
            }
            throw new Exception("No file found in decrypted JSON");
        } catch (Exception e) {
            throw new Exception(AbstractC1701hf0.t("Crypto Extraction failed: ", e.getMessage()));
        }
    }
}
