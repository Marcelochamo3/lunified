package o;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2971uj0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C2390oj0 m;
    public final /* synthetic */ C2196mj0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1059o;
    public final /* synthetic */ OV p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2971uj0(C2390oj0 c2390oj0, C2196mj0 c2196mj0, String str, OV ov, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c2390oj0;
        this.n = c2196mj0;
        this.f1059o = str;
        this.p = ov;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2971uj0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2971uj0(this.m, this.n, this.f1059o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Map mapUnmodifiableMap;
        Jp0.O(obj);
        String str = C3068vj0.a;
        C2390oj0 c2390oj0 = this.m;
        String str2 = c2390oj0.a;
        String str3 = c2390oj0.b;
        Map mapE = C3068vj0.e(str2, str3);
        C2196mj0 c2196mj0 = this.n;
        String str4 = c2196mj0.h;
        String str5 = c2196mj0.d;
        C1101bX c1101bX = new C1101bX("country", str5);
        String str6 = this.f1059o;
        String strA = C2196mj0.a(str4, AbstractC3327yN.z(c1101bX, new C1101bX("cid", str6)));
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(c2196mj0.b + "/" + strA);
        for (Map.Entry entry : mapE.entrySet()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1951k70 c1951k70C = c0560Kq.c();
        OV ov = this.p;
        AbstractC2051l80 abstractC2051l80 = ov.c(c1951k70C).g().r;
        if (abstractC2051l80 == null) {
            throw new Exception(AbstractC1701hf0.t("Sin detalle para ", str6));
        }
        String strP = Jp0.p(new JSONObject(abstractC2051l80.q()), c2196mj0.s);
        if (strP.length() <= 0) {
            strP = null;
        }
        if (strP == null) {
            throw new Exception(AbstractC1701hf0.t("Sin URL DASH para ", str6));
        }
        String strX0 = AbstractC1119bh0.x0(strP, "://", strP);
        String strX1 = AbstractC1119bh0.x0(strX0, "/", strX0);
        String str7 = (String) C3068vj0.e.get("tigo-" + str6);
        String str8 = str7 == null ? str6 : str7;
        String str9 = (String) C3068vj0.f.get("tigo-" + str6);
        if (str9 == null) {
            str9 = "live";
        }
        Map mapZ = AbstractC3327yN.z(new C1101bX("country", str5), new C1101bX("cid", str6), new C1101bX("eventType", str9));
        String strA2 = C2196mj0.a(c2196mj0.i, mapZ);
        String strA3 = C2196mj0.a(c2196mj0.j, mapZ);
        String str10 = c2196mj0.c + "/" + strA2;
        AbstractC1474fG.j(str10, "<this>");
        C2349oE c2349oE = new C2349oE();
        c2349oE.g(null, str10);
        C2349oE c2349oEF = c2349oE.b().f();
        c2349oEF.a("asset", strX1);
        c2349oEF.a("typeContent", strA3);
        String str11 = c2196mj0.k;
        if (str11 != null) {
            c2349oEF.a("indexCam", str11);
        }
        C2446pE c2446pEB = c2349oEF.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2112lq c2112lq = new C2112lq(1);
        for (Map.Entry entry2 : mapE.entrySet()) {
            String str12 = (String) entry2.getKey();
            String str13 = (String) entry2.getValue();
            AbstractC1474fG.j(str12, "name");
            AbstractC1474fG.j(str13, "value");
            c2112lq.q(str12, str13);
        }
        C2152mB c2152mBF = c2112lq.f();
        byte[] bArr = Mr0.a;
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C1330dq.l;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1474fG.i(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        C1855j80 c1855j80G = ov.c(new C1951k70(c2446pEB, "GET", c2152mBF, null, mapUnmodifiableMap)).g();
        AbstractC2051l80 abstractC2051l81 = c1855j80G.r;
        if (abstractC2051l81 == null) {
            throw new Exception(AbstractC1701hf0.t("Sin respuesta Vecima para ", str6));
        }
        String strQ = abstractC2051l81.q();
        int i = c1855j80G.f840o;
        if (i == 429) {
            throw new IOException("Tigo alcanzó el límite de reproducciones");
        }
        if (200 > i || i >= 300) {
            throw new IOException(AbstractC1674hK.p("Tigo rechazó la firma del stream (HTTP ", i, ")"));
        }
        JSONObject jSONObject = new JSONObject(strQ);
        if (!jSONObject.optBoolean("status", false)) {
            return new Js0(strP, (Map) null, AbstractC1119bh0.W(strP, "index.m3u8", false) ? "hls" : "tv", (String) null, (String) null, (byte[]) null, str8, (String) null, (String) null, (List) null, false, 4026);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString("t");
        String string2 = jSONObject2.getString("s");
        String string3 = jSONObject2.getString("e");
        String string4 = jSONObject2.getString("c");
        String string5 = jSONObject2.getString("v");
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("q");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next);
                sb2.append("&");
                sb2.append(next);
                sb2.append("=");
                sb2.append(URLEncoder.encode(strOptString, "UTF-8"));
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(next);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strP);
        sb3.append("?t=");
        sb3.append(string);
        sb3.append("&s=");
        sb3.append(string2);
        sb3.append("&c=");
        sb3.append(URLEncoder.encode(string4, "UTF-8"));
        sb3.append("&e=");
        sb3.append(URLEncoder.encode(string3, "UTF-8"));
        sb3.append("&v=");
        sb3.append(string5);
        if (str3.length() > 0) {
            sb3.append("&u=");
            sb3.append(str3);
        }
        if (sb2.length() > 0) {
            sb3.append((CharSequence) sb2);
        }
        if (sb.length() > 0) {
            sb3.append("&q=");
            sb3.append((CharSequence) sb);
        }
        String string6 = sb3.toString();
        AbstractC1474fG.i(string6, "toString(...)");
        return new Js0(string6, (Map) null, "tv", (String) null, (String) null, (byte[]) null, str8, (String) null, (String) null, (List) null, false, 4026);
    }
}
