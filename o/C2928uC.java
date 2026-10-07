package o;

import android.webkit.JavascriptInterface;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.uC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2928uC {
    public final /* synthetic */ C3025vC a;

    public C2928uC(C3025vC c3025vC) {
        this.a = c3025vC;
    }

    @JavascriptInterface
    public final void report(String str) {
        if (str == null || AbstractC1899jh0.O(str)) {
            return;
        }
        C3025vC c3025vC = this.a;
        if (c3025vC.h) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("url");
                String strOptString2 = jSONObject.optString("frameUrl");
                if (!(!AbstractC1899jh0.O(strOptString2))) {
                    strOptString2 = null;
                }
                if (strOptString2 == null) {
                    strOptString2 = c3025vC.b;
                }
                String str2 = strOptString2;
                String strOptString3 = jSONObject.optString("contentType");
                String str3 = AbstractC1899jh0.O(strOptString3) ^ true ? strOptString3 : null;
                String strOptString4 = jSONObject.optString("declaredType");
                if (!(!AbstractC1899jh0.O(strOptString4))) {
                    strOptString4 = null;
                }
                String strOptString5 = jSONObject.optString("bodyPrefix");
                if (!(!AbstractC1899jh0.O(strOptString5))) {
                    strOptString5 = null;
                }
                I60 i60 = SB.a;
                AbstractC1474fG.g(strOptString);
                String strE = SB.e(strOptString, str2);
                if (strE != null && AbstractC1468fA.s(strE) && SB.a(strE, str3, strOptString4, strOptString5)) {
                    String strOptString6 = jSONObject.optString("source");
                    AbstractC1474fG.i(strOptString6, "optString(...)");
                    TB tbA = C3025vC.a(c3025vC, strOptString6);
                    String strOptString7 = jSONObject.optString("title");
                    String str4 = AbstractC1899jh0.O(strOptString7) ^ true ? strOptString7 : null;
                    String strOptString8 = jSONObject.optString("poster");
                    c3025vC.c(new RB(strE, tbA, str3, str2, str4, AbstractC1899jh0.O(strOptString8) ^ true ? strOptString8 : null, null, null, 192));
                }
            } catch (Throwable th) {
                Jp0.k(th);
            }
        }
    }
}
