package o;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707Qi extends AbstractC3473zs {
    public static final I60 d;
    public static final I60 e;
    public static final I60 f;
    public final List b = AbstractC0937Ze.K("https://dailymotion.com/", "https://dai.ly/", "https://cdndirector.dailymotion.com/");
    public final OV c;

    static {
        J60 j60 = J60.IGNORE_CASE;
        d = new I60("(?:dailymotion\\.com/(?:embed/)?video/|dai\\.ly/)([A-Za-z0-9]+)", j60);
        e = new I60("dailymotion\\.com/player/metadata/video/([A-Za-z0-9]+)", j60);
        f = new I60("^[A-Za-z0-9]+$");
    }

    public C0707Qi() {
        NV nvH = AbstractC1370eA.h();
        nvH.h = true;
        nvH.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(20L, timeUnit);
        nvH.i(30L, timeUnit);
        this.c = new OV(nvH);
    }

    public static final String f(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("url");
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                AbstractC1474fG.g(strOptString);
                if (!AbstractC1899jh0.O(strOptString)) {
                    if (!AbstractC1119bh0.W(strOptString, ".m3u8", true)) {
                        AbstractC1474fG.g(strOptString2);
                        if (AbstractC1119bh0.W(strOptString2, "mpegurl", true)) {
                        }
                    }
                    return strOptString;
                }
                continue;
            }
        }
        return null;
    }

    public static Js0 g(String str, String str2, String str3) {
        C2552qN c2552qN = new C2552qN();
        c2552qN.put("User-Agent", "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Mobile Safari/537.36");
        if (str2 != null) {
            c2552qN.put("Referer", str2);
        }
        return new Js0(str, (Map) c2552qN.b(), "hls", (String) null, (String) null, (byte[]) null, str3, str2, (String) null, (List) null, false, 3896);
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C0681Pi(str, this, null), interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://www.dailymotion.com/";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Dailymotion";
    }
}
