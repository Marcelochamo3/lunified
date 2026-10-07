package o;

import com.skidush.clonex.utils.BlindajeCrypto;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3270xn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3270xn0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3270xn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3270xn0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objJ;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i == 0) {
                Jp0.O(obj);
                String str = this.n;
                if (!AbstractC1899jh0.U(str, "tv-", false)) {
                    return null;
                }
                String strL0 = AbstractC1119bh0.l0(str, "tv-");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", strL0);
                String string = jSONObject.toString();
                AbstractC1474fG.i(string, "toString(...)");
                byte[] bytes = string.getBytes(AbstractC1305dd.a);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                C1816io0 c1816io0 = C1816io0.b;
                String strA = AbstractC3238xV.a("1wyfWd7hFYxjjV/DcV6/5wk7A9sxLZhO3rtb1vhea90=");
                String str2 = C1816io0.d;
                this.m = 1;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1719ho0(true, strA, bytes, str2, null), this);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                objJ = obj;
            }
            JSONArray jSONArray = new JSONArray((String) objJ);
            if (jSONArray.length() == 0) {
                return null;
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("headers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONObjectOptJSONObject != null) {
                try {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    if (itKeys != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            AbstractC1474fG.g(next);
                            String string2 = jSONObjectOptJSONObject.getString(next);
                            AbstractC1474fG.i(string2, "getString(...)");
                            linkedHashMap.put(next, string2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (!linkedHashMap.isEmpty()) {
                linkedHashMap2.put("headers", linkedHashMap);
            }
            String strOptString = jSONObject2.optString("uri2", "");
            C1816io0 c1816io1 = C1816io0.b;
            AbstractC1474fG.g(strOptString);
            if (!BlindajeCrypto.a.g(strOptString)) {
                strOptString = null;
            }
            if (strOptString != null) {
                linkedHashMap2.put("flow_original_uri", C1816io0.H(strOptString, false));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("clearkey");
            if (jSONObjectOptJSONObject2 != null) {
                linkedHashMap2.put("clearkey_json", jSONObjectOptJSONObject2.toString());
            }
            String strOptString2 = jSONObject2.optString("uri");
            AbstractC1474fG.g(strOptString2);
            if (!(!AbstractC1899jh0.O(strOptString2))) {
                strOptString2 = null;
            }
            linkedHashMap2.put("stream_uri", C1816io0.H(strOptString2, false));
            if (jSONObject2.has("drm_scheme") && !jSONObject2.isNull("drm_scheme")) {
                String string3 = jSONObject2.getString("drm_scheme");
                AbstractC1474fG.g(string3);
                if (string3.length() > 0) {
                    linkedHashMap2.put("drm_scheme", string3);
                }
            }
            String strOptString3 = jSONObject2.optString("drm_license_uri", "");
            AbstractC1474fG.g(strOptString3);
            if (!(!AbstractC1899jh0.O(strOptString3))) {
                strOptString3 = null;
            }
            if (strOptString3 != null) {
                linkedHashMap2.put("drm_license_uri", C1816io0.H(strOptString3, true));
            }
            if (jSONObject2.has("default_KID") && !jSONObject2.isNull("default_KID")) {
                linkedHashMap2.put("default_KID", jSONObject2.getString("default_KID"));
            }
            if (jSONObject2.optBoolean("claroandina", false)) {
                linkedHashMap2.put("claroandina", Boolean.TRUE);
                if (jSONObject2.has("groupid")) {
                    linkedHashMap2.put("groupid", new Integer(jSONObject2.getInt("groupid")));
                }
                if (jSONObject2.has("region")) {
                    linkedHashMap2.put("region", jSONObject2.getString("region"));
                }
                if (jSONObject2.has("header_api")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("header_api");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    AbstractC1474fG.i(itKeys2, "keys(...)");
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        AbstractC1474fG.g(next2);
                        String string4 = jSONObject3.getString(next2);
                        AbstractC1474fG.i(string4, "getString(...)");
                        linkedHashMap3.put(next2, string4);
                    }
                    linkedHashMap2.put("header_api", linkedHashMap3);
                }
            }
            if (AbstractC1474fG.b(jSONObject2.optString("webview", "no"), "yes") || AbstractC1474fG.b(linkedHashMap2.get("drm_scheme"), "WEBVIEW")) {
                linkedHashMap2.put("webview", Boolean.TRUE);
            }
            String string5 = jSONObject2.getString("logo");
            String string6 = jSONObject2.getString("name");
            try {
                String str3 = this.n;
                AbstractC1474fG.g(string6);
                return new C1387eR(str3, string6, "", null, null, null, null, null, string5, string5, null, null, null, null, linkedHashMap2, 15456);
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
        }
        return null;
    }
}
