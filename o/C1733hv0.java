package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: o.hv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1733hv0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CookieManager f820o;
    public WebView p;
    public IF q;
    public IF r;
    public int s;
    public final /* synthetic */ String t;
    public final /* synthetic */ C1829iv0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733hv0(String str, C1829iv0 c1829iv0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.t = str;
        this.u = c1829iv0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(C1829iv0 c1829iv0, InterfaceC0471Hf interfaceC0471Hf, String str, String str2, Map map) {
        Object objK;
        int i = C1829iv0.e;
        c1829iv0.getClass();
        if (AbstractC1468fA.r(str, "cfglobalcdn.com")) {
            try {
                String rawPath = new URI(str).getRawPath();
                if (rawPath != null) {
                    objK = rawPath.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(objK, "toLowerCase(...)");
                } else {
                    objK = null;
                }
                if (objK == null) {
                    objK = "";
                }
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            String str3 = (String) (objK instanceof C2439p80 ? "" : objK);
            if (AbstractC1119bh0.W(str3, ".m3u8", false) && !AbstractC1119bh0.W(str3, "no_video", false) && AbstractC1119bh0.W(str3, "/secip/", false) && AbstractC1119bh0.W(str3, "/hls-", false) && AbstractC1119bh0.W(str3, ".mp4.m3u8", false) && !((JH) interfaceC0471Hf).U()) {
                ((C0497If) interfaceC0471Hf).X(new Zu0(str, str2, map));
            }
        }
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1733hv0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1733hv0(this.t, this.u, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        String strE;
        String strD;
        IF r2;
        CookieManager cookieManager;
        Object objJ;
        WebView webView;
        IF r1;
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.s;
        String str2 = this.t;
        if (i == 0) {
            Jp0.O(obj);
            Uri uri = Uri.parse(str2);
            AbstractC1474fG.i(uri, "parse(...)");
            if (!AbstractC1370eA.z(uri)) {
                throw new IOException("URL Web insegura o inválida");
            }
            URL url = new URL(str2);
            strE = AbstractC1701hf0.e(url.getProtocol(), "://", url.getHost());
            int i2 = C1829iv0.e;
            C1829iv0 c1829iv0 = this.u;
            c1829iv0.getClass();
            if (AbstractC1119bh0.W(str2, "/watch_video.php", true) || AbstractC1119bh0.W(str2, "/f/", true)) {
                strD = str2;
            } else if (AbstractC1119bh0.W(str2, "/e/", true)) {
                strD = AbstractC1899jh0.R(str2, "/e/", "/f/", false);
            } else {
                strD = AbstractC1701hf0.d(strE, AbstractC1899jh0.U(str2, "/", false) ? str2 : "/".concat(str2));
            }
            C0497If c0497IfA = AbstractC1474fG.a();
            CookieManager cookieManager2 = CookieManager.getInstance();
            WebView webView2 = new WebView(AbstractC1376eG.o(c1829iv0.b));
            webView2.addJavascriptInterface(new C1439ev0(c1829iv0, c0497IfA), "WaawBridge");
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36");
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setMixedContentMode(1);
            settings.setCacheMode(2);
            settings.setBlockNetworkLoads(false);
            settings.setBlockNetworkImage(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            Ov0.b(webView2);
            webView2.setInitialScale(100);
            webView2.measure(View.MeasureSpec.makeMeasureSpec(Qd0.j, 1073741824), View.MeasureSpec.makeMeasureSpec(720, 1073741824));
            webView2.layout(0, 0, Qd0.j, 720);
            C2532q60 c2532q60 = new C2532q60();
            r2 = new IF();
            r2.m = strD;
            IF r3 = new IF();
            cookieManager = cookieManager2;
            webView2.setWebViewClient(new C1341dv0(this.u, c0497IfA, r2, c2532q60, strE, r3, strD));
            webView2.loadUrl(strD, AbstractC3327yN.z(new C1101bX("Referer", strE), new C1101bX("Origin", strE), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36")));
            C1635gv0 c1635gv0 = new C1635gv0(c0497IfA, null);
            this.m = strE;
            this.n = strD;
            this.f820o = cookieManager;
            this.p = webView2;
            this.q = r2;
            this.r = r3;
            this.s = 1;
            objJ = Nr0.J(30000L, c1635gv0, this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            webView = webView2;
            r1 = r3;
            str = strD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r1 = this.r;
            r2 = this.q;
            webView = this.p;
            CookieManager cookieManager3 = this.f820o;
            String str3 = this.n;
            strE = this.m;
            Jp0.O(obj);
            str = str3;
            cookieManager = cookieManager3;
            objJ = obj;
        }
        Zu0 zu0 = (Zu0) objJ;
        new Handler(Looper.getMainLooper()).post(new RunnableC1147bv0(webView, 0));
        if (zu0 == null) {
            throw new Exception(AbstractC1701hf0.t("WaawExtractor: No se interceptó un HLS válido en 30s para ", str2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36");
        String str4 = (String) r1.m;
        if (str4 == null) {
            str4 = (String) r2.m;
        }
        linkedHashMap.put("Referer", str4);
        linkedHashMap.put("Origin", strE);
        linkedHashMap.put("Accept", "*/*");
        linkedHashMap.put("Accept-Language", "es-ES,es;q=0.9,en-US;q=0.8,en;q=0.7");
        Map map = zu0.c;
        String str5 = zu0.b;
        String str6 = zu0.a;
        for (Map.Entry entry : AbstractC1468fA.a(str5, str6, map).entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        String cookie = cookieManager.getCookie(str6);
        if (cookie != null && !AbstractC1899jh0.O(cookie)) {
            linkedHashMap.put("Cookie", cookie);
        }
        return new Js0(zu0.a, (Map) linkedHashMap, "hls", (String) null, (String) null, (byte[]) null, (String) null, str, (String) null, (List) null, false, 3960);
    }
}
