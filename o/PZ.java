package o;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Toast;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.io.ByteArrayInputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PZ extends AbstractC2237n40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Js0 b;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx c;

    public /* synthetic */ PZ(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Js0 js0, int i) {
        this.a = i;
        this.c = abstractComponentCallbacksC1247cx;
        this.b = js0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                super.onPageFinished(webView, str);
                PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.c;
                playerMobileFragment.getClass();
                if (webView != null) {
                    webView.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n        if (videos[i].paused) {\n            videos[i].play().catch(e => console.log('Auto-play prevented:', e));\n        }\n        videos[i].muted = false;\n        videos[i].style.zIndex = '2147483647';\n        videos[i].style.position = 'relative';\n        if (videos[i].offsetWidth < 200 || videos[i].offsetHeight < 150) {\n            videos[i].style.width = '100%';\n            videos[i].style.height = 'auto';\n        }\n        videos[i].setAttribute('data-protected', 'true');\n    }\n    \n    window.open = function() { return null; };\n    window.alert = function() { return null; };\n    window.prompt = function() { return null; };\n    window.confirm = function() { return null; };\n    \n    const originalSetTimeout = window.setTimeout;\n    window.setTimeout = function(func, delay) {\n        if (typeof func === 'string' && \n            (func.includes('window.open') || \n             func.includes('window.location') || \n             func.includes('popup') || \n             func.includes('redirect') ||\n             func.includes('download'))) {\n            console.log('Blocked suspicious setTimeout');\n            return null;\n        }\n        if (typeof func === 'function') {\n            const wrappedFunc = function() {\n                try {\n                    func.apply(this, arguments);\n                } catch (e) {\n                    console.log('Blocked exception in setTimeout:', e);\n                }\n            };\n            return originalSetTimeout(wrappedFunc, delay);\n        }\n        return originalSetTimeout(func, delay);\n    };\n    \n    const originalSetInterval = window.setInterval;\n    window.setInterval = function(func, delay) {\n        if (typeof func === 'string' && \n            (func.includes('window.open') || \n             func.includes('window.location') || \n             func.includes('popup'))) {\n            console.log('Blocked suspicious setInterval');\n            return null;\n        }\n        return originalSetInterval(func, delay);\n    };\n    \n    const originalAssign = window.location.assign;\n    window.location.assign = function(url) {\n        console.log('Blocked location.assign:', url);\n        return null;\n    };\n    \n    const originalReplace = window.location.replace;\n    window.location.replace = function(url) {\n        console.log('Blocked location.replace:', url);\n        return null;\n    };\n    \n    let locationHref = window.location.href;\n    Object.defineProperty(window.location, 'href', {\n        get: function() { return locationHref; },\n        set: function(val) { \n            console.log('Blocked changing location.href to:', val);\n            return locationHref; \n        }\n    });\n    \n    function injectBlockingCSS() {\n        var style = document.createElement('style');\n        style.id = 'ad-blocking-css';\n        style.innerHTML = `\n            div[style*=\"z-index:\"], \n            div[style*=\"z-index=\"],\n            div[style*=\"position: fixed\"],\n            div[style*=\"position:fixed\"],\n            div[class*=\"overlay\"], \n            div[id*=\"overlay\"], \n            div[class*=\"modal\"], \n            div[id*=\"modal\"],\n            div[class*=\"popup\"], \n            div[id*=\"popup\"],\n            div[class*=\"notif\"],\n            div[id*=\"notif\"],\n            div[role=\"dialog\"],\n            .overlay, .modal, .popup, .lightbox,\n            .ad, .ads, .advert, .advertisement,\n            div[id*=\"google_ads\"],\n            div[id*=\"div-gpt-ad\"],\n            div[class*=\"banner\"],\n            div[id*=\"banner\"],\n            div[class*=\"promo\"],\n            div[id*=\"promo\"],\n            div[class*=\"bsa\"],\n            div[id*=\"bsa\"],\n            div[class*=\"adsbox\"],\n            [aria-label*=\"ad\"],\n            [aria-label*=\"Ad\"],\n            [data-ad],\n            [id*=\"taboola\"],\n            [class*=\"taboola\"],\n            [id*=\"mgid\"],\n            [class*=\"mgid\"],\n            [id*=\"zergnet\"],\n            [class*=\"pub_\"],\n            [class*=\"promotions\"] {\n                display: none !important;\n                visibility: hidden !important;\n                opacity: 0 !important;\n                pointer-events: none !important;\n                height: 0 !important;\n                width: 0 !important;\n                max-height: 0 !important;\n                max-width: 0 !important;\n                overflow: hidden !important;\n            }\n            \n            html, body {\n                overflow: auto !important;\n                height: auto !important;\n            }\n            \n            video, .video-js, .vjs-tech, [class*=\"player\"] {\n                display: block !important;\n                visibility: visible !important;\n                opacity: 1 !important;\n                z-index: 2147483647 !important;\n            }\n        `;\n        \n        var existingStyle = document.getElementById('ad-blocking-css');\n        if (existingStyle) {\n            existingStyle.remove();\n        }\n        \n        document.head.appendChild(style);\n    }\n    \n    function removeAdElements() {\n        var adSelectors = [\n            'iframe[src*=\"ads\"]',\n            'iframe[src*=\"banner\"]',\n            'iframe[src*=\"pop\"]',\n            'iframe[src*=\"promo\"]',\n            'iframe:not([src*=\"player\"]):not([src*=\"embed\"]):not([src*=\"video\"])',\n            'div[class*=\"ad\"]:not([class*=\"player\"]):not([class*=\"video\"])',\n            'div[id*=\"ad\"]:not([id*=\"player\"]):not([id*=\"video\"])',\n            'ins[class*=\"adsbygoogle\"]',\n            'div[id*=\"taboola\"]',\n            'div[id*=\"mgid\"]',\n            'div[class*=\"outbrain\"]',\n            'div[data-ad]',\n            '[data-ad-slot]',\n            '[data-ad-client]',\n            '.ad-banner',\n            '.ad-container',\n            '.ad-slot',\n            '.ad-wrapper',\n            '.popup-ad',\n            '.popup-overlay',\n            '.modal-backdrop',\n            '.modal-container',\n            'div[style*=\"z-index\"][style*=\"position: fixed\"]'\n        ];\n        \n        adSelectors.forEach(function(selector) {\n            try {\n                var elements = document.querySelectorAll(selector);\n                elements.forEach(function(el) {\n                    if (!el.querySelector('video') && \n                        !el.id?.includes('player') && \n                        !el.className?.includes('player')) {\n                        el.remove();\n                    }\n                });\n            } catch (e) {\n                console.log('Error removing ads:', e);\n            }\n        });\n        \n        var allElements = document.querySelectorAll('div');\n        allElements.forEach(function(el) {\n            try {\n                var style = window.getComputedStyle(el);\n                var zIndex = parseInt(style.zIndex);\n                var position = style.position;\n                \n                if (!isNaN(zIndex) && zIndex > 999 && \n                   (position === 'fixed' || position === 'absolute')) {\n                    \n                    if (!el.querySelector('video') && \n                        !el.id?.includes('player') && \n                        !el.className?.includes('player') &&\n                        !el.querySelector('[class*=\"player\"]')) {\n                        el.style.display = 'none';\n                        el.style.visibility = 'hidden';\n                    }\n                }\n            } catch (e) {}\n        });\n    }\n    \n    function fixScrollIssues() {\n        document.documentElement.style.overflow = 'auto';\n        document.body.style.overflow = 'auto';\n        document.documentElement.style.position = 'static';\n        document.body.style.position = 'static';\n        document.documentElement.style.height = 'auto';\n        document.body.style.height = 'auto';\n    }\n    \n    injectBlockingCSS();\n    removeAdElements();\n    fixScrollIssues();\n    \n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target) {\n            if (target.tagName === 'A') {\n                var href = target.getAttribute('href');\n                if (href && (href.startsWith('http') || href.startsWith('//')) &&\n                    !href.includes(window.location.hostname)) {\n                    console.log('Blocked click on external link:', href);\n                    e.preventDefault();\n                    e.stopPropagation();\n                    return false;\n                }\n                \n                if (target.getAttribute('target') === '_blank' || \n                    (href && \n                     (href.includes('#ad') || \n                      href.includes('javascript:') || \n                      href.includes('popup') || \n                      href.includes('download')))) {\n                    console.log('Blocked suspicious link click');\n                    e.preventDefault();\n                    e.stopPropagation();\n                    return false;\n                }\n            }\n            target = target.parentNode;\n        }\n    }, true);\n    \n    window.addEventListener('beforeunload', function(e) {\n        e.preventDefault();\n        e.returnValue = '';\n        return '';\n    });\n})();", null);
                }
                RunnableC1938k1 runnableC1938k1 = playerMobileFragment.d1;
                Handler handler = playerMobileFragment.c1;
                if (runnableC1938k1 != null) {
                    handler.removeCallbacks(runnableC1938k1);
                }
                RunnableC1938k1 runnableC1938k2 = new RunnableC1938k1(webView, playerMobileFragment, 10, false);
                playerMobileFragment.d1 = runnableC1938k2;
                handler.postDelayed(runnableC1938k2, 800L);
                break;
            default:
                super.onPageFinished(webView, str);
                if (webView != null) {
                    webView.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n        videos[i].play();\n        videos[i].muted = false;\n        videos[i].addEventListener('play', function() {\n            this.style.position = 'fixed';\n            this.style.top = '0';\n            this.style.left = '0';\n            this.style.width = '100%';\n            this.style.height = '100%';\n            this.style.zIndex = '9999999';\n        });\n    }\n    window.open = function() { return null; };\n    window.alert = function() {};\n    window.confirm = function() { return true; };\n    window.prompt = function() { return ''; };\n    var originalSetTimeout = window.setTimeout;\n    window.setTimeout = function(func, delay) {\n        if (typeof func === 'string' && (\n            func.includes('ads') || \n            func.includes('pop') || \n            func.includes('banner') ||\n            func.includes('overlay')\n        )) {\n            return null;\n        }\n        return originalSetTimeout(func, delay);\n    };\n    var originalSetInterval = window.setInterval;\n    window.setInterval = function(func, delay) {\n        if (typeof func === 'string' && (\n            func.includes('ads') || \n            func.includes('pop') || \n            func.includes('banner') ||\n            func.includes('overlay')\n        )) {\n            return null;\n        }\n        return originalSetInterval(func, delay);\n    };\n    function removeAds() {\n        var adSelectors = [\n            'iframe[src*=\"ads\"]',\n            'iframe[src*=\"banner\"]',\n            'iframe[src*=\"pop\"]',\n            'div[class*=\"ad\"]',\n            'div[id*=\"ad\"]',\n            'div[class*=\"overlay\"]',\n            'div[id*=\"overlay\"]',\n            'div[class*=\"popup\"]',\n            'div[id*=\"popup\"]',\n            'div[class*=\"banner\"]',\n            'div[id*=\"banner\"]',\n            'ins[class*=\"adsbygoogle\"]',\n            'script[src*=\"ads\"]',\n            'script[src*=\"banner\"]',\n            'script[src*=\"pop\"]',\n            '[data-ad-slot]',\n            '.ad-banner', '.ad-container',\n            '.popup', '.popup-ad',\n            '.overlay', '.modal',\n            '[style*=\"z-index:\"][style*=\"position: fixed\"]',\n            '[style*=\"z-index:\"][style*=\"position:fixed\"]',\n            '[style*=\"z-index: \"][style*=\"position: fixed\"]',\n            'div[style*=\"position: fixed\"][style*=\"display: block\"]',\n            'div[style*=\"position:fixed\"][style*=\"display:block\"]'\n        ];\n        adSelectors.forEach(function(selector) {\n            var elements = document.querySelectorAll(selector);\n            elements.forEach(function(el) {\n                if (el.tagName !== 'VIDEO') {\n                    el.remove();\n                }\n            });\n        });\n        var fixedElements = document.querySelectorAll('[style*=\"position: fixed\"], [style*=\"position:fixed\"]');\n        fixedElements.forEach(function(el) {\n            if (el.tagName !== 'VIDEO' && !el.querySelector('video')) {\n                el.remove();\n            }\n        });\n        var overlays = document.querySelectorAll('[style*=\"z-index:\"]');\n        overlays.forEach(function(el) {\n            var style = window.getComputedStyle(el);\n            var zIndex = parseInt(style.zIndex);\n            if (zIndex > 100 && el.tagName !== 'VIDEO' && !el.querySelector('video')) {\n                el.remove();\n            }\n        });\n    }\n    removeAds();\n    var observer = new MutationObserver(function(mutations) {\n        removeAds();\n    });\n    observer.observe(document.body, {\n        childList: true,\n        subtree: true\n    });\n    setInterval(removeAds, 1000);\n})();", null);
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                PlayerTvFragment playerTvFragment = (PlayerTvFragment) this.c;
                Toast.makeText(playerTvFragment.Q(), "Error cargando video: " + str, 1).show();
                if (!playerTvFragment.F0.isEmpty()) {
                    List list = playerTvFragment.F0;
                    Ds0 ds0 = playerTvFragment.o0;
                    AbstractC1474fG.j(list, "<this>");
                    int iIndexOf = list.indexOf(ds0) + 1;
                    if (iIndexOf >= playerTvFragment.F0.size()) {
                        Toast.makeText(playerTvFragment.Q(), "No hay más servidores disponibles", 1).show();
                    } else {
                        playerTvFragment.n0().g((Ds0) playerTvFragment.F0.get(iIndexOf), null);
                    }
                }
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // o.AbstractC2237n40, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        Uri url2;
        switch (this.a) {
            case 0:
                if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (string = url2.toString()) == null) {
                    string = "";
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    url = Uri.EMPTY;
                }
                AbstractC1474fG.g(url);
                if (!AbstractC1370eA.z(url)) {
                    return Ov0.a();
                }
                if (AbstractC1119bh0.W(string, "player", false) || AbstractC1119bh0.W(string, "video", false) || AbstractC1119bh0.W(string, "embed", false) || AbstractC1119bh0.W(string, "stream", false)) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                if (!PlayerMobileFragment.X((PlayerMobileFragment) this.c, string) && !AbstractC1119bh0.W(string, "analytics", false) && !AbstractC1119bh0.W(string, "/ads/", true) && !AbstractC1119bh0.W(string, "/ad/", true) && !AbstractC1119bh0.W(string, "banner", true) && !AbstractC1119bh0.W(string, "pop.js", true) && !AbstractC1119bh0.W(string, "popup.js", true) && !AbstractC1119bh0.W(string, "tracker", false) && !AbstractC1119bh0.W(string, "pixel", false) && !AbstractC1119bh0.W(string, "stats", false)) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                byte[] bytes = "".getBytes(AbstractC1305dd.a);
                AbstractC1474fG.i(bytes, "getBytes(...)");
                return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(bytes));
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // o.AbstractC2237n40, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 1:
                if (PlayerTvFragment.a0((PlayerTvFragment) this.c, this.b.l, str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // o.AbstractC2237n40, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        Uri url2;
        Uri url3;
        switch (this.a) {
            case 0:
                if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (string = url2.toString()) == null) {
                    string = "";
                }
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    url = Uri.EMPTY;
                }
                AbstractC1474fG.g(url);
                if (AbstractC1370eA.z(url) && !PlayerMobileFragment.X((PlayerMobileFragment) this.c, string) && AbstractC3045vW.u(this.b.l, string)) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                return true;
            default:
                if (PlayerTvFragment.a0((PlayerTvFragment) this.c, this.b.l, (webResourceRequest == null || (url3 = webResourceRequest.getUrl()) == null) ? null : url3.toString())) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
