package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884Xd extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f618o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884Xd(int i, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = i;
        this.n = str;
        this.f618o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0884Xd) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0884Xd(this.m, this.n, this.f618o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Jp0.O(obj);
        String strC = C1600ge.c();
        C1101bX c1101bX = new C1101bX("device_category", "web");
        C1101bX c1101bX2 = new C1101bX("group_id", String.valueOf(this.m));
        C1101bX c1101bX3 = new C1101bX("device_model", "web");
        C1101bX c1101bX4 = new C1101bX("device_type", "web");
        C1101bX c1101bX5 = new C1101bX("format", "json");
        C1101bX c1101bX6 = new C1101bX("device_manufacturer", "generic");
        C1101bX c1101bX7 = new C1101bX("authpn", "webclient");
        JSONObject jSONObject = O9.y;
        String str = null;
        String strOptString = jSONObject != null ? jSONObject.optString("claro_authpt") : null;
        if (strOptString != null && strOptString.length() != 0) {
            str = strOptString;
        }
        if (str == null) {
            str = AbstractC1165c5.c;
        }
        JSONObject jSONObject2 = new JSONObject(C1600ge.b(C1600ge.a(strC, AbstractC0937Ze.K(c1101bX, c1101bX2, c1101bX3, c1101bX4, c1101bX5, c1101bX6, c1101bX7, new C1101bX("authpt", str), new C1101bX("stream_type", "dashwv"), new C1101bX("crDomain", "https://www.clarovideo.com"), new C1101bX("api_version", "v5.94"), new C1101bX("device_id", C1600ge.b), new C1101bX("preview", "0"), new C1101bX("css", "0"), new C1101bX("region", this.n), new C1101bX("payway_token", this.f618o)))));
        if (jSONObject2.optInt("status") != 200) {
            throw new Exception(AbstractC1674hK.n(jSONObject2.optInt("status"), "Claro getmedia status: "));
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("response").getJSONObject("media");
        String string = jSONObject3.getString("video_url");
        String string2 = new JSONObject(jSONObject3.getString("challenge")).getString("token");
        AbstractC1474fG.g(string);
        AbstractC1474fG.g(string2);
        return new C0858Wd(string, string2);
    }
}
