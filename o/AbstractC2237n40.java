package o;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: o.n40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2237n40 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC1474fG.j(webView, "view");
        AbstractC1474fG.j(httpAuthHandler, "handler");
        AbstractC1474fG.j(str, "host");
        AbstractC1474fG.j(str2, "realm");
        C3084vr0 c3084vr0 = C3084vr0.a;
        C1041ar0 c1041ar0 = C3084vr0.p;
        if (c1041ar0 != null) {
            if (!C3084vr0.s()) {
                c1041ar0 = null;
            }
            if (c1041ar0 != null && AbstractC1899jh0.N(str, c1041ar0.b, true)) {
                httpAuthHandler.proceed(c1041ar0.d, c1041ar0.e);
                return;
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        return (url == null || AbstractC1370eA.z(url)) ? super.shouldInterceptRequest(webView, webResourceRequest) : Ov0.a();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null || AbstractC1370eA.z(url)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null && !AbstractC1899jh0.O(str)) {
            Uri uri = Uri.parse(str);
            AbstractC1474fG.i(uri, "parse(...)");
            if (!AbstractC1370eA.z(uri)) {
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str != null && !AbstractC1899jh0.O(str)) {
            Uri uri = Uri.parse(str);
            AbstractC1474fG.i(uri, "parse(...)");
            if (!AbstractC1370eA.z(uri)) {
                return Ov0.a();
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
