package o;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.skidush.clonex.CloudflareChallengeActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0703Qe implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ CloudflareChallengeActivity b;

    public /* synthetic */ C0703Qe(CloudflareChallengeActivity cloudflareChallengeActivity, int i) {
        this.a = i;
        this.b = cloudflareChallengeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean z;
        boolean z2;
        CloudflareChallengeActivity cloudflareChallengeActivity = this.b;
        boolean z3 = false;
        int i = 1;
        String str = (String) obj;
        switch (this.a) {
            case 0:
                int i2 = CloudflareChallengeActivity.V;
                AbstractC1474fG.j(cloudflareChallengeActivity, "this$0");
                if (str != null) {
                    try {
                        if (!AbstractC1899jh0.O(str) && !AbstractC1474fG.b(str, "null")) {
                            JSONObject jSONObject = new JSONObject(new JSONObject("{\"value\":" + str + "}").getString("value"));
                            String strOptString = jSONObject.optString("title");
                            String strOptString2 = jSONObject.optString("href");
                            String strOptString3 = jSONObject.optString("ready");
                            String strOptString4 = jSONObject.optString("text");
                            AbstractC1474fG.g(strOptString);
                            if (AbstractC1119bh0.W(strOptString, "Just a moment", true) || jSONObject.optBoolean("challenge")) {
                                z = true;
                            } else {
                                AbstractC1474fG.g(strOptString4);
                                if (AbstractC1119bh0.W(strOptString4, "Performing security verification", true) || AbstractC1119bh0.W(strOptString4, "Verify you are human", true) || AbstractC1119bh0.W(strOptString4, "Verifique que usted es un ser humano", true) || AbstractC1119bh0.W(strOptString4, "Verificación de seguridad en curso", true) || AbstractC1119bh0.W(strOptString4, "Este sitio web utiliza un servicio de seguridad", true)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            CookieManager cookieManager = CookieManager.getInstance();
                            String str2 = cloudflareChallengeActivity.N;
                            if (str2 == null) {
                                AbstractC1474fG.U("targetUrl");
                                throw null;
                            }
                            String cookie = cookieManager.getCookie(str2);
                            if (cookie != null) {
                                List listS0 = AbstractC1119bh0.s0(cookie, new char[]{';'}, 0, 6);
                                if (!listS0.isEmpty()) {
                                    Iterator it = listS0.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (AbstractC1899jh0.U(AbstractC1119bh0.E0((String) it.next()).toString(), "cf_clearance=", false)) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (AbstractC1474fG.b(strOptString3, "complete")) {
                                AbstractC1474fG.g(strOptString2);
                                if (AbstractC1899jh0.U(strOptString2, "http", false) && (!AbstractC1899jh0.O(strOptString)) && strOptString4.length() >= 40) {
                                    z3 = true;
                                }
                            }
                            if (z || !z3 || !z2) {
                                cloudflareChallengeActivity.C(800L);
                                return;
                            }
                            if (cloudflareChallengeActivity.L.get()) {
                                return;
                            }
                            WebView webView = cloudflareChallengeActivity.O;
                            if (webView != null) {
                                webView.evaluateJavascript("document.documentElement ? document.documentElement.outerHTML : ''", new C0703Qe(cloudflareChallengeActivity, i));
                                return;
                            } else {
                                AbstractC1474fG.U("webView");
                                throw null;
                            }
                        }
                    } catch (Throwable unused) {
                        cloudflareChallengeActivity.C(800L);
                        return;
                    }
                }
                cloudflareChallengeActivity.C(800L);
                return;
            default:
                int i3 = CloudflareChallengeActivity.V;
                AbstractC1474fG.j(cloudflareChallengeActivity, "this$0");
                if (str != null) {
                    try {
                        if (!AbstractC1899jh0.O(str) && !AbstractC1474fG.b(str, "null")) {
                            String string = new JSONObject("{\"value\":" + str + "}").getString("value");
                            AbstractC1474fG.g(string);
                            if (!AbstractC1119bh0.W(string, "<body", true)) {
                                cloudflareChallengeActivity.C(800L);
                                return;
                            }
                            boolean z4 = AbstractC1119bh0.W(string, "/online/", true) || AbstractC1119bh0.W(string, "/pelicula/", true) || AbstractC1119bh0.W(string, "wp-admin/admin-ajax.php", true) || AbstractC1119bh0.W(string, "wp-content", true);
                            String str3 = cloudflareChallengeActivity.N;
                            if (str3 == null) {
                                AbstractC1474fG.U("targetUrl");
                                throw null;
                            }
                            if (AbstractC1119bh0.W(str3, "animeninjax.com", true) && !z4) {
                                cloudflareChallengeActivity.C(800L);
                                return;
                            }
                            CookieManager.getInstance().flush();
                            if (cloudflareChallengeActivity.L.compareAndSet(false, true)) {
                                cloudflareChallengeActivity.finish();
                                ConcurrentHashMap concurrentHashMap = AbstractC0807Ue.a;
                                String str4 = cloudflareChallengeActivity.M;
                                if (str4 == null) {
                                    AbstractC1474fG.U("requestId");
                                    throw null;
                                }
                                Object obj2 = (InterfaceC0471Hf) AbstractC0807Ue.a.get(str4);
                                if (obj2 != null) {
                                    Object obj3 = ((JH) obj2).U() ? null : obj2;
                                    if (obj3 != null) {
                                        ((C0497If) obj3).X(string);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } catch (Throwable unused2) {
                        cloudflareChallengeActivity.C(800L);
                        return;
                    }
                }
                cloudflareChallengeActivity.C(800L);
                return;
        }
    }
}
