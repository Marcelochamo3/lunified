package o;

import java.io.IOException;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433Ft {
    public static final C0433Ft a = new C0433Ft();
    public static final String b = AbstractC3238xV.a("1wyfWd7hFYxjuGrkSHWArwkuA9wBJYtf");
    public static final I60 c = new I60("^[a-fA-F0-9]{24}$");

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable a(C0433Ft c0433Ft, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0381Dt c0381Dt;
        int length;
        Object objK;
        c0433Ft.getClass();
        if (interfaceC0473Hh instanceof C0381Dt) {
            c0381Dt = (C0381Dt) interfaceC0473Hh;
            int i = c0381Dt.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0381Dt.n = i - Integer.MIN_VALUE;
            } else {
                c0381Dt = new C0381Dt(c0433Ft, interfaceC0473Hh);
            }
        } else {
            c0381Dt = new C0381Dt(c0433Ft, interfaceC0473Hh);
        }
        Object objJ = c0381Dt.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0381Dt.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            if (c.d(str)) {
                if (AbstractC1899jh0.U(str2, "sess:fanatiz=", false) && 24 <= (length = str2.length()) && length < 8193) {
                    for (int i3 = 0; i3 < str2.length(); i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt != '\r' && cCharAt != '\n') {
                        }
                    }
                    C0560Kq c0560Kq = new C0560Kq();
                    c0560Kq.u("https://watch.fanatiz.com/api/1.0/assets/videos/" + str + "?json=true");
                    c0560Kq.d();
                    c0560Kq.j("Cookie", str2);
                    c0560Kq.j("Accept", "application/json");
                    c0560Kq.j("Accept-Language", "es-419,es;q=0.9,en;q=0.7");
                    c0560Kq.j("Origin", "https://watch.fanatiz.com");
                    c0560Kq.j("Referer", "https://watch.fanatiz.com/");
                    c0560Kq.j("User-Agent", "Mozilla/5.0 (Linux; Android 12; TV) AppleWebKit/537.36 Chrome/124.0.0.0 Safari/537.36");
                    c0560Kq.j("Cache-Control", "no-cache");
                    C1951k70 c1951k70C = c0560Kq.c();
                    c0381Dt.getClass();
                    c0381Dt.n = 1;
                    objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C0485Ht(c1951k70C, "autorización regional", null), c0381Dt);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                }
            }
            throw new IOException("El servicio devolvió una autorización inválida");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Jp0.O(objJ);
        try {
            objK = new JSONObject((String) objJ);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (C2536q80.a(objK) != null) {
            throw new IOException("El servicio devolvió una repetición inválida");
        }
        JSONObject jSONObject = (JSONObject) objK;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("url") : null;
        if (strOptString == null) {
            strOptString = "";
        }
        String string = AbstractC1119bh0.E0(strOptString).toString();
        if (AbstractC1899jh0.O(string)) {
            string = AbstractC1701hf0.j(jSONObject, "url", "optString(...)");
        }
        String strX = AbstractC1376eG.x(string);
        if (strX != null) {
            return new C1101bX(string, strX);
        }
        throw new IOException("El servicio devolvió una URL regional inválida");
    }
}
