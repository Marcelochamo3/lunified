package o;

import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Pn0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f462o;
    public Serializable p;
    public String q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Ds0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pn0(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.t = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Pn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Pn0 pn0 = new Pn0(this.t, interfaceC0473Hh);
        pn0.s = obj;
        return pn0;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:174:0x0404  */
    /* JADX WARN: Code duplicated, block: B:189:0x0454  */
    /* JADX WARN: Code duplicated, block: B:190:0x0456  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r22v9 */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Object objQ;
        String str;
        String str2;
        String str3;
        String str4;
        LinkedHashMap linkedHashMap;
        ?? r1;
        String upperCase;
        Object objG;
        String str5;
        String str6;
        Object objR;
        String str7;
        Integer numJ;
        Object objG2;
        String str8;
        String str9;
        Object objJ;
        String str10;
        String str11;
        byte[] bArrV;
        String str12;
        String str13;
        Map map;
        ?? r2;
        String str14;
        Map map2;
        String str15;
        Map map3;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        ?? r19;
        String str21;
        String str22;
        Map map4;
        String str23;
        Object objJ2;
        ?? r110;
        Map map5;
        byte[] bArr;
        String str24;
        Map map6;
        Map map7;
        ?? r3;
        Map map8;
        String str25;
        String str26;
        ?? r22;
        String str27;
        Object objJ3;
        Map map9;
        ?? r4;
        Map map10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.r;
        Ds0 ds0 = this.t;
        switch (i) {
            case 0:
                Jp0.O(obj);
                if (AbstractC1899jh0.U(ds0.l, "fctvevent-", false)) {
                    C2379oe c2379oe = C2379oe.b;
                    this.r = 1;
                    Object objN = c2379oe.n(ds0, this);
                    return objN == enumC1706hi ? enumC1706hi : objN;
                }
                String str28 = ds0.l;
                if (AbstractC1899jh0.U(str28, "tigo-", false)) {
                    String strL0 = AbstractC1119bh0.l0(str28, "tigo-");
                    String str29 = C3068vj0.a;
                    this.r = 2;
                    Object objJ4 = AbstractC1376eG.J(AbstractC1910jn.b, new C2680rj0(strL0, null), this);
                    return objJ4 == enumC1706hi ? enumC1706hi : objJ4;
                }
                if (!AbstractC1899jh0.U(str28, "tv-", false)) {
                    C1816io0 c1816io0 = C1816io0.b;
                    this.r = 10;
                    objQ = C1816io0.q(c1816io0, ds0, str28, this);
                    if (objQ == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return Js0.a((Js0) objQ, null, null, null, null, null, null, true, 2047);
                }
                Map map11 = ds0.f223o;
                if (map11 == null || (str = (String) map11.get("_channel_title")) == null) {
                    str = "TV Channel";
                }
                if (map11 == null || (str2 = (String) map11.get("_channel_stream_url")) == null) {
                    str2 = ds0.n;
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        throw new Exception("Stream URL not found in server data");
                    }
                }
                if (map11 == null || (str3 = (String) map11.get("_channel_drm_scheme")) == null) {
                    str3 = ds0.p;
                }
                boolean zB = AbstractC1474fG.b(map11 != null ? (String) map11.get("_channel_webview") : null, "true");
                boolean zB2 = AbstractC1474fG.b(map11 != null ? (String) map11.get("_channel_claroandina") : null, "true");
                str4 = map11 != null ? (String) map11.get("_channel_default_kid") : null;
                if (map11 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map11.entrySet()) {
                        if (!AbstractC1899jh0.U((String) entry.getKey(), "_channel_", false)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                if (map11 == null || (str11 = (String) map11.get("_channel_clearkey_json")) == null) {
                    r1 = 0;
                } else {
                    bArrV = C1816io0.v(str11);
                }
                if (str3 != null) {
                    r1 = bArrV;
                    upperCase = str3.toUpperCase(Locale.ROOT);
                    AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                } else {
                    r1 = bArrV;
                    upperCase = null;
                }
                if (AbstractC1474fG.b(upperCase, "WEBVIEW") || zB) {
                    Hv0 hv0 = new Hv0();
                    Map map12 = linkedHashMap;
                    if (linkedHashMap == null) {
                        map12 = C1330dq.l;
                    }
                    this.s = str;
                    this.r = 3;
                    objG = hv0.g(str2, map12, this);
                    if (objG == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Js0 js0 = (Js0) objG;
                    str12 = js0.r;
                    if (str12 == null) {
                        str13 = str;
                    } else {
                        str13 = str12;
                    }
                    return Js0.a(js0, "tv", null, null, str13, null, null, false, 4027);
                }
                I60 i60 = C1641gy0.d;
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (AbstractC1119bh0.W(lowerCase, "youtube.com", false) || AbstractC1119bh0.W(lowerCase, "youtu.be", false) || AbstractC1119bh0.W(lowerCase, "youtube.com/@", false) || AbstractC1119bh0.W(lowerCase, "youtube.com/channel/", false) || AbstractC1119bh0.W(lowerCase, "youtube.com/c/", false) || AbstractC1119bh0.W(lowerCase, "youtube.com/user/", false)) {
                    C1641gy0 c1641gy0 = new C1641gy0();
                    this.r = 4;
                    Object objA = c1641gy0.a(str2, this);
                    return objA == enumC1706hi ? enumC1706hi : objA;
                }
                if (!zB2) {
                    String str30 = map11 != null ? (String) map11.get("_channel_flow_original_url") : null;
                    if (str30 != null) {
                        C1816io0 c1816io1 = C1816io0.b;
                        if (BlindajeCrypto.a.g(str30)) {
                            this.s = str;
                            this.m = str4;
                            this.n = linkedHashMap;
                            this.f462o = r1;
                            this.r = 8;
                            objR = C1816io0.r(c1816io1, str30, str2, this);
                            if (objR == enumC1706hi) {
                                return enumC1706hi;
                            }
                            str5 = str;
                            r4 = r1;
                            map9 = linkedHashMap;
                            str6 = (String) objR;
                            r3 = r4;
                            map7 = map9;
                        }
                        if (AbstractC1474fG.b(ds0.p, "clearkey") || (str27 = ds0.q) == null) {
                            map8 = map7;
                            str25 = str6;
                            str26 = str5;
                            r22 = 0;
                        } else if (r3 == 0) {
                            C1816io0 c1816io2 = C1816io0.b;
                            this.s = str5;
                            this.m = str4;
                            this.n = map7;
                            this.f462o = str6;
                            this.r = 9;
                            objJ3 = AbstractC1376eG.J(AbstractC1910jn.b, new C3367yn0(str27, null), this);
                            if (objJ3 == enumC1706hi) {
                                map10 = map7;
                                return enumC1706hi;
                            }
                            map10 = map7;
                            map8 = map10;
                            str25 = str6;
                            str26 = str5;
                            r22 = (byte[]) objJ3;
                        } else {
                            r22 = r3;
                            map8 = map7;
                            str25 = str6;
                            str26 = str5;
                        }
                        return new Js0(str25, map8, "tv", ds0.p, ds0.q, (byte[]) r22, str26, (String) null, str4, (List) null, false, 3712);
                    }
                    str5 = str;
                    str6 = str2;
                    r3 = r1;
                    map7 = linkedHashMap;
                    if (AbstractC1474fG.b(ds0.p, "clearkey")) {
                        map8 = map7;
                        str25 = str6;
                        str26 = str5;
                        r22 = 0;
                    } else {
                        map8 = map7;
                        str25 = str6;
                        str26 = str5;
                        r22 = 0;
                    }
                    return new Js0(str25, map8, "tv", ds0.p, ds0.q, (byte[]) r22, str26, (String) null, str4, (List) null, false, 3712);
                }
                if (map11 == null || (str7 = (String) map11.get("_channel_groupid")) == null || (numJ = AbstractC1802ih0.J(str7)) == null) {
                    throw new Exception("Group ID not found for Claro Andina channel");
                }
                int iIntValue = numJ.intValue();
                String str31 = map11 != null ? (String) map11.get("_channel_region") : null;
                String str32 = map11 != null ? (String) map11.get("_channel_header_api") : null;
                if (str31 != null) {
                    C1600ge c1600ge = C1600ge.a;
                    this.s = str;
                    this.r = 5;
                    objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1112be(str31, iIntValue, null), this);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                    str10 = str;
                    C0858Wd c0858Wd = (C0858Wd) objJ;
                    return new Js0(c0858Wd.a, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"), new C1101bX("Origin", "https://www.clarovideo.com"), new C1101bX("Referer", "https://www.clarovideo.com/")), "dash", "widevine", "claroandina-drm://", (byte[]) null, str10, "claroandina_token:" + c0858Wd.b, (String) null, (List) null, false, 3872);
                }
                if (str32 == null) {
                    throw new Exception("header_api not found for Claro Andina channel (legacy flow)");
                }
                JSONObject jSONObject = new JSONObject(str32);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                AbstractC1474fG.i(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    AbstractC1474fG.g(next);
                    String string = jSONObject.getString(next);
                    AbstractC1474fG.i(string, "getString(...)");
                    linkedHashMap2.put(next, string);
                }
                C1600ge c1600ge2 = C1600ge.a;
                this.s = str;
                this.m = str3;
                this.n = str4;
                this.f462o = linkedHashMap;
                this.p = r1;
                this.r = 6;
                objG2 = c1600ge2.g(iIntValue, linkedHashMap2, this);
                if (objG2 == enumC1706hi) {
                    return enumC1706hi;
                }
                str8 = str;
                str9 = str4;
                r2 = r1;
                map = linkedHashMap;
                str14 = (String) objG2;
                map2 = ds0.f223o;
                if (map2 != null || (str15 = (String) map2.get("_channel_drm_license_uri")) == null) {
                    str15 = ds0.q;
                }
                if (AbstractC1474fG.b(str3, "clearkey") || str15 == null) {
                    map3 = map;
                    str16 = str14;
                    str17 = str9;
                    str18 = str8;
                    str19 = str15;
                    str20 = str3;
                    r19 = 0;
                } else {
                    if (r2 == 0) {
                        try {
                            C1816io0 c1816io3 = C1816io0.b;
                            this.s = str8;
                            this.m = str3;
                            this.n = str9;
                            this.f462o = map;
                            this.p = str14;
                            this.q = str15;
                            this.r = 7;
                            objJ2 = AbstractC1376eG.J(AbstractC1910jn.b, new C3367yn0(str15, null), this);
                            if (objJ2 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            str22 = str3;
                            map4 = map;
                            str23 = str14;
                            try {
                                str3 = str22;
                                String str33 = str15;
                                bArr = (byte[]) objJ2;
                                str21 = str33;
                                Map map13 = map4;
                                str24 = str23;
                                map6 = map13;
                            } catch (Exception unused) {
                                str21 = str15;
                                str3 = str22;
                                bArr = null;
                                Map map14 = map4;
                                str24 = str23;
                                map6 = map14;
                            }
                            str19 = str21;
                            map5 = map6;
                            str16 = str24;
                            str17 = str9;
                            str18 = str8;
                            r110 = bArr;
                        } catch (Exception unused2) {
                            str21 = str15;
                            str22 = str3;
                            map4 = map;
                            str23 = str14;
                            str3 = str22;
                            bArr = null;
                            Map map15 = map4;
                            str24 = str23;
                            map6 = map15;
                            str19 = str21;
                            map5 = map6;
                            str16 = str24;
                            str17 = str9;
                            str18 = str8;
                            r110 = bArr;
                            str20 = str3;
                            map3 = map5;
                            r19 = r110;
                            return new Js0(str16, map3, "dash", str20, str19, (byte[]) r19, str18, (String) null, str17, (List) null, false, 3712);
                        }
                    } else {
                        r110 = r2;
                        map5 = map;
                        str16 = str14;
                        str17 = str9;
                        str18 = str8;
                        str19 = str15;
                    }
                    str20 = str3;
                    map3 = map5;
                    r19 = r110;
                }
                return new Js0(str16, map3, "dash", str20, str19, (byte[]) r19, str18, (String) null, str17, (List) null, false, 3712);
            case 1:
                Jp0.O(obj);
                return obj;
            case 2:
                Jp0.O(obj);
                return obj;
            case 3:
                String str34 = (String) this.s;
                Jp0.O(obj);
                str = str34;
                objG = obj;
                Js0 js1 = (Js0) objG;
                str12 = js1.r;
                if (str12 == null) {
                    str13 = str;
                } else {
                    str13 = str12;
                }
                return Js0.a(js1, "tv", null, null, str13, null, null, false, 4027);
            case 4:
                Jp0.O(obj);
                return obj;
            case 5:
                String str35 = (String) this.s;
                Jp0.O(obj);
                objJ = obj;
                str10 = str35;
                C0858Wd c0858Wd2 = (C0858Wd) objJ;
                return new Js0(c0858Wd2.a, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36"), new C1101bX("Origin", "https://www.clarovideo.com"), new C1101bX("Referer", "https://www.clarovideo.com/")), "dash", "widevine", "claroandina-drm://", (byte[]) null, str10, "claroandina_token:" + c0858Wd2.b, (String) null, (List) null, false, 3872);
            case 6:
                byte[] bArr2 = (byte[]) this.p;
                Map map16 = (Map) this.f462o;
                String str36 = (String) this.n;
                String str37 = this.m;
                str8 = (String) this.s;
                Jp0.O(obj);
                str3 = str37;
                str9 = str36;
                objG2 = obj;
                r2 = bArr2;
                map = map16;
                str14 = (String) objG2;
                map2 = ds0.f223o;
                if (map2 != null) {
                    str15 = ds0.q;
                } else {
                    str15 = ds0.q;
                }
                if (AbstractC1474fG.b(str3, "clearkey")) {
                }
                map3 = map;
                str16 = str14;
                str17 = str9;
                str18 = str8;
                str19 = str15;
                str20 = str3;
                r19 = 0;
                return new Js0(str16, map3, "dash", str20, str19, (byte[]) r19, str18, (String) null, str17, (List) null, false, 3712);
            case 7:
                str21 = this.q;
                str23 = (String) this.p;
                map4 = (Map) this.f462o;
                str9 = (String) this.n;
                str22 = this.m;
                str8 = (String) this.s;
                try {
                    Jp0.O(obj);
                    str15 = str21;
                    objJ2 = obj;
                    map4 = map4;
                    str3 = str22;
                    String str38 = str15;
                    bArr = (byte[]) objJ2;
                    str21 = str38;
                    Map map17 = map4;
                    str24 = str23;
                    map6 = map17;
                } catch (Exception unused3) {
                    str3 = str22;
                    bArr = null;
                    Map map18 = map4;
                    str24 = str23;
                    map6 = map18;
                    str19 = str21;
                    map5 = map6;
                    str16 = str24;
                    str17 = str9;
                    str18 = str8;
                    r110 = bArr;
                    str20 = str3;
                    map3 = map5;
                    r19 = r110;
                    return new Js0(str16, map3, "dash", str20, str19, (byte[]) r19, str18, (String) null, str17, (List) null, false, 3712);
                }
                str19 = str21;
                map5 = map6;
                str16 = str24;
                str17 = str9;
                str18 = str8;
                r110 = bArr;
                str20 = str3;
                map3 = map5;
                r19 = r110;
                return new Js0(str16, map3, "dash", str20, str19, (byte[]) r19, str18, (String) null, str17, (List) null, false, 3712);
            case 8:
                byte[] bArr3 = (byte[]) this.f462o;
                Map map19 = (Map) this.n;
                String str39 = this.m;
                str5 = (String) this.s;
                Jp0.O(obj);
                str4 = str39;
                objR = obj;
                r4 = bArr3;
                map9 = map19;
                str6 = (String) objR;
                r3 = r4;
                map7 = map9;
                if (AbstractC1474fG.b(ds0.p, "clearkey")) {
                    map8 = map7;
                    str25 = str6;
                    str26 = str5;
                    r22 = 0;
                } else {
                    map8 = map7;
                    str25 = str6;
                    str26 = str5;
                    r22 = 0;
                }
                return new Js0(str25, map8, "tv", ds0.p, ds0.q, (byte[]) r22, str26, (String) null, str4, (List) null, false, 3712);
            case 9:
                String str40 = (String) this.f462o;
                Map map20 = (Map) this.n;
                String str41 = this.m;
                str5 = (String) this.s;
                Jp0.O(obj);
                str4 = str41;
                str6 = str40;
                objJ3 = obj;
                map10 = map20;
                map10 = map7;
                map8 = map10;
                str25 = str6;
                str26 = str5;
                r22 = (byte[]) objJ3;
                return new Js0(str25, map8, "tv", ds0.p, ds0.q, (byte[]) r22, str26, (String) null, str4, (List) null, false, 3712);
            case 10:
                Jp0.O(obj);
                objQ = obj;
                return Js0.a((Js0) objQ, null, null, null, null, null, null, true, 2047);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
