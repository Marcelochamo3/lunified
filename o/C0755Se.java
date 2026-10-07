package o;

import android.webkit.WebView;
import com.skidush.clonex.CloudflareChallengeActivity;

/* JADX INFO: renamed from: o.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0755Se extends AbstractC2237n40 {
    public final /* synthetic */ CloudflareChallengeActivity a;

    public C0755Se(CloudflareChallengeActivity cloudflareChallengeActivity) {
        this.a = cloudflareChallengeActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC1474fG.j(webView, "view");
        AbstractC1474fG.j(str, "url");
        super.onPageFinished(webView, str);
        int i = CloudflareChallengeActivity.V;
        this.a.C(300L);
    }
}
