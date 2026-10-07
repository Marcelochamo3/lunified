package o;

import android.os.SystemClock;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.skidush.clonex.CloudflareChallengeActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0677Pe implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ CloudflareChallengeActivity m;

    public /* synthetic */ RunnableC0677Pe(CloudflareChallengeActivity cloudflareChallengeActivity, int i) {
        this.l = i;
        this.m = cloudflareChallengeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        CloudflareChallengeActivity cloudflareChallengeActivity = this.m;
        switch (this.l) {
            case 0:
                int i2 = CloudflareChallengeActivity.V;
                AbstractC1474fG.j(cloudflareChallengeActivity, "this$0");
                FrameLayout frameLayout = cloudflareChallengeActivity.P;
                if (frameLayout == null) {
                    AbstractC1474fG.U("webContainer");
                    throw null;
                }
                float width = frameLayout.getWidth() * 0.5f;
                if (width < 0.0f) {
                    width = 0.0f;
                }
                cloudflareChallengeActivity.R = width;
                FrameLayout frameLayout2 = cloudflareChallengeActivity.P;
                if (frameLayout2 == null) {
                    AbstractC1474fG.U("webContainer");
                    throw null;
                }
                float height = frameLayout2.getHeight() * 0.45f;
                cloudflareChallengeActivity.S = height >= 0.0f ? height : 0.0f;
                C0729Re c0729Re = cloudflareChallengeActivity.Q;
                if (c0729Re != null) {
                    c0729Re.setTranslationX(cloudflareChallengeActivity.R);
                    c0729Re.setTranslationY(cloudflareChallengeActivity.S);
                    c0729Re.setVisibility(0);
                    c0729Re.bringToFront();
                }
                WebView webView = cloudflareChallengeActivity.O;
                if (webView != null) {
                    webView.requestFocus();
                    return;
                } else {
                    AbstractC1474fG.U("webView");
                    throw null;
                }
            default:
                int i3 = CloudflareChallengeActivity.V;
                AbstractC1474fG.j(cloudflareChallengeActivity, "this$0");
                AtomicBoolean atomicBoolean = cloudflareChallengeActivity.L;
                if (atomicBoolean.get()) {
                    return;
                }
                ConcurrentHashMap concurrentHashMap = AbstractC0807Ue.a;
                String str = cloudflareChallengeActivity.M;
                if (str == null) {
                    AbstractC1474fG.U("requestId");
                    throw null;
                }
                InterfaceC1022ai interfaceC1022ai = (InterfaceC0471Hf) AbstractC0807Ue.a.get(str);
                if (interfaceC1022ai == null || ((JH) interfaceC1022ai).U()) {
                    atomicBoolean.set(true);
                    cloudflareChallengeActivity.finish();
                    return;
                } else {
                    if (SystemClock.uptimeMillis() - cloudflareChallengeActivity.U > 175000) {
                        cloudflareChallengeActivity.B(new IllegalStateException("Cloudflare no completó la verificación"));
                        return;
                    }
                    WebView webView2 = cloudflareChallengeActivity.O;
                    if (webView2 != null) {
                        webView2.evaluateJavascript("(function() {\n  return JSON.stringify({\n    title: document.title || '',\n    href: location.href || '',\n    ready: document.readyState || '',\n    text: document.body ? (document.body.innerText || '').slice(0, 1200) : '',\n    challenge: !!document.querySelector(\n      '#challenge-running, #challenge-stage, .cf-turnstile, iframe[src*=\"challenges.cloudflare.com\"]'\n    )\n  });\n})();", new C0703Qe(cloudflareChallengeActivity, i));
                        return;
                    } else {
                        AbstractC1474fG.U("webView");
                        throw null;
                    }
                }
        }
    }
}
