package o;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f277o;
    public final /* synthetic */ Object p;

    public /* synthetic */ GP(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f277o = obj3;
        this.p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.p;
        Object obj2 = this.f277o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        switch (this.l) {
            case 0:
                ((IP) obj3).K(((C2613qy) obj4).m, (CP) obj2, (C2069lP) obj);
                break;
            default:
                WebView webView = (WebView) obj4;
                AbstractC1474fG.j(webView, "$view");
                String str = (String) obj3;
                AbstractC1474fG.j(str, "$iframeUrl");
                String str2 = (String) obj2;
                AbstractC1474fG.j(str2, "$watchUrl");
                String str3 = (String) obj;
                AbstractC1474fG.j(str3, "$baseUrl");
                webView.loadUrl(str, AbstractC3327yN.z(new C1101bX("Referer", str2), new C1101bX("Origin", str3), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36")));
                break;
        }
    }
}
