package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014ae extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1014ae(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1014ae) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1014ae(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C1600ge c1600ge = C1600ge.a;
        JSONObject jSONObject = O9.y;
        String strOptString = jSONObject != null ? jSONObject.optString("claro_base_url") : null;
        if (strOptString == null || strOptString.length() == 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            strOptString = AbstractC1165c5.a;
        }
        String strD = AbstractC1701hf0.d(strOptString, "/services/payway/linealchannels");
        C1101bX c1101bX = new C1101bX("device_id", "web");
        C1101bX c1101bX2 = new C1101bX("device_category", "web");
        C1101bX c1101bX3 = new C1101bX("device_model", "web");
        C1101bX c1101bX4 = new C1101bX("device_type", "web");
        C1101bX c1101bX5 = new C1101bX("device_so", "Chrome");
        C1101bX c1101bX6 = new C1101bX("format", "json");
        C1101bX c1101bX7 = new C1101bX("device_manufacturer", "generic");
        C1101bX c1101bX8 = new C1101bX("authpn", "webclient");
        JSONObject jSONObject2 = O9.y;
        String strOptString2 = jSONObject2 != null ? jSONObject2.optString("claro_authpt") : null;
        if (strOptString2 == null || strOptString2.length() == 0) {
            strOptString2 = null;
        }
        if (strOptString2 == null) {
            strOptString2 = AbstractC1165c5.c;
        }
        C1101bX c1101bX9 = new C1101bX("authpt", strOptString2);
        C1101bX c1101bX10 = new C1101bX("api_version", "v5.93");
        C1101bX c1101bX11 = new C1101bX("region", this.m);
        JSONObject jSONObject3 = O9.y;
        String strOptString3 = jSONObject3 != null ? jSONObject3.optString("claro_hks") : null;
        if (strOptString3 == null || strOptString3.length() == 0) {
            strOptString3 = null;
        }
        if (strOptString3 == null) {
            strOptString3 = AbstractC1165c5.b;
        }
        return new JSONObject(C1600ge.b(C1600ge.a(strD, AbstractC0937Ze.K(c1101bX, c1101bX2, c1101bX3, c1101bX4, c1101bX5, c1101bX6, c1101bX7, c1101bX8, c1101bX9, c1101bX10, c1101bX11, new C1101bX("HKS", strOptString3))))).getJSONObject("response").getJSONObject("paqs").getJSONArray("paq").getJSONObject(0).getString("payway_token");
    }
}
