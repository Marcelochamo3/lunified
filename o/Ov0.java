package o;

import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ov0 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static WebResourceResponse a() {
        return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(new byte[0]));
    }

    public static void b(WebView webView) {
        if (a.compareAndSet(false, true)) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        WebSettings settings = webView.getSettings();
        settings.setMixedContentMode(1);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
    }
}
