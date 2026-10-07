package o;

import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.gy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1641gy0 extends AbstractC3473zs {
    public static final I60 d = new I60("(?:v=|youtu\\.be/|embed/|/v/|/e/|watch\\?v=|&v=)([^#&?]*).*");
    public static final I60 e = new I60("^[a-zA-Z0-9_-]{11}$");
    public static final List f = AbstractC0937Ze.K("@", "/c/", "/channel/", "/user/");
    public final List b = AbstractC0937Ze.K("https://youtu.be/", "https://m.youtube.com/");
    public final Rh0 c = new Rh0(C1693hb0.D);

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1543fy0(str, this, null), interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://www.youtube.com/";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "YouTube";
    }

    public final String f(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoId", str);
        jSONObject.put("contentCheckOk", "true");
        jSONObject.put("racyCheckOn", "true");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (AbstractC1474fG.b(str2, "ANDROID")) {
            jSONObject3.put("clientName", "ANDROID");
            jSONObject3.put("clientVersion", "21.03.36");
            jSONObject3.put("clientScreen", "WATCH");
            jSONObject3.put("platform", "MOBILE");
            jSONObject3.put("osName", "Android");
            jSONObject3.put("osVersion", "16");
            jSONObject3.put("androidSdkVersion", 36);
            jSONObject3.put("hl", "en-GB");
            jSONObject3.put("gl", "US");
            jSONObject3.put("utcOffsetMinutes", 0);
        } else if (AbstractC1474fG.b(str2, "IOS")) {
            jSONObject3.put("clientName", "IOS");
            jSONObject3.put("clientVersion", "19.14.3");
            jSONObject3.put("deviceMake", "Apple");
            jSONObject3.put("deviceModel", "iPhone15,4");
            jSONObject3.put("platform", "MOBILE");
            jSONObject3.put("osName", "iOS");
            jSONObject3.put("osVersion", "17.4.1.21E237");
            jSONObject3.put("hl", "en");
            jSONObject3.put("gl", "US");
            jSONObject3.put("utcOffsetMinutes", 0);
        }
        jSONObject2.put("client", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("internalExperimentFlags", new JSONArray());
        jSONObject4.put("useSsl", true);
        jSONObject2.put("request", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("lockedSafetyMode", false);
        jSONObject2.put("user", jSONObject5);
        jSONObject.put("context", jSONObject2);
        String str3 = AbstractC1474fG.b(str2, "ANDROID") ? "com.google.android.youtube/21.03.36 (Linux; U; Android 16; en_US) gzip" : AbstractC1474fG.b(str2, "IOS") ? "com.google.ios.youtube/19.14.3(iPhone15,4; U; CPU iOS 17_4_1 like Mac OS X; US)" : "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Mobile Safari/537.36";
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u("https://www.youtube.com/youtubei/v1/player?prettyPrint=false");
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json")));
        c0560Kq.j("Content-Type", "application/json");
        c0560Kq.j("User-Agent", str3);
        c0560Kq.j("X-Goog-Api-Format-Version", "2");
        AbstractC2051l80 abstractC2051l80 = ((OV) this.c.getValue()).c(c0560Kq.c()).g().r;
        String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
        if (strQ != null && strQ.length() != 0) {
            JSONObject jSONObject6 = new JSONObject(strQ);
            JSONObject jSONObjectOptJSONObject = jSONObject6.optJSONObject("error");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.optString("status");
                jSONObjectOptJSONObject.optString("message", "Unknown");
                AbstractC1119bh0.D0(500, strQ);
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject6.optJSONObject("playabilityStatus");
            String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("status") : null;
            if (AbstractC1474fG.b(strOptString, "ERROR")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject6.optJSONObject("playabilityStatus");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.optString("reason", "Unknown error");
                }
                return null;
            }
            if (AbstractC1474fG.b(strOptString, "LOGIN_REQUIRED")) {
                return null;
            }
            if (AbstractC1474fG.b(strOptString, "UNPLAYABLE")) {
                JSONObject jSONObjectOptJSONObject4 = jSONObject6.optJSONObject("playabilityStatus");
                if (jSONObjectOptJSONObject4 != null) {
                    jSONObjectOptJSONObject4.optString("reason", "Video not available");
                }
                return null;
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject6.optJSONObject("streamingData");
            String strOptString2 = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optString("hlsManifestUrl") : null;
            if (strOptString2 != null && strOptString2.length() != 0) {
                return strOptString2;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONArray("formats") : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONArray("adaptiveFormats") : null;
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject7 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString3 = jSONObject7.optString("url");
                    String strOptString4 = jSONObject7.optString("mimeType", "");
                    AbstractC1474fG.g(strOptString3);
                    if (strOptString3.length() > 0) {
                        AbstractC1474fG.g(strOptString4);
                        if (AbstractC1119bh0.W(strOptString4, "video", false)) {
                            return strOptString3;
                        }
                    }
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject8 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    String strOptString5 = jSONObject8.optString("url");
                    String strOptString6 = jSONObject8.optString("mimeType", "");
                    AbstractC1474fG.g(strOptString5);
                    if (strOptString5.length() > 0) {
                        AbstractC1474fG.g(strOptString6);
                        if (AbstractC1119bh0.W(strOptString6, "video", false)) {
                            return strOptString5;
                        }
                    }
                }
            }
            AbstractC1119bh0.D0(500, strQ);
        }
        return null;
    }
}
