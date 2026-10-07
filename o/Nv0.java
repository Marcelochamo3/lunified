package o;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public interface Nv0 {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    String[] e();

    ProxyControllerBoundaryInterface getProxyController();

    StaticsBoundaryInterface getStatics();
}
