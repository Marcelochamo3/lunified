package o;

import android.app.Application;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: renamed from: o.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1938k1 implements Runnable {
    public final /* synthetic */ int l;
    public Object m;
    public final Object n;

    public /* synthetic */ RunnableC1938k1(Object obj, int i, Object obj2) {
        this.l = i;
        this.n = obj;
        this.m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XP xp;
        int i = 0;
        switch (this.l) {
            case 0:
                C2424p1 c2424p1 = (C2424p1) this.n;
                ZP zp = c2424p1.n;
                if (zp != null && (xp = zp.e) != null) {
                    xp.N(zp);
                }
                View view = (View) c2424p1.s;
                if (view != null && view.getWindowToken() != null) {
                    C1744i1 c1744i1 = (C1744i1) this.m;
                    if (c1744i1.b()) {
                        c2424p1.E = c1744i1;
                    } else if (c1744i1.f != null) {
                        c1744i1.d(0, 0, false, false);
                        c2424p1.E = c1744i1;
                    }
                }
                c2424p1.G = null;
                return;
            case 1:
                ((G1) this.m).l = this.n;
                return;
            case 2:
                ((Application) this.m).unregisterActivityLifecycleCallbacks((G1) this.n);
                return;
            case 3:
                try {
                    Method method = H1.d;
                    Object obj = this.n;
                    Object obj2 = this.m;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        H1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                AP ap = (AP) ((L80) this.m).l;
                if (ap != null) {
                    ap.r((Typeface) this.n);
                    return;
                }
                return;
            case 5:
                C1567gB c1567gBA = C1567gB.a();
                c1567gBA.getClass();
                Kr0.a();
                c1567gBA.d.set(true);
                ((ViewTreeObserverOnDrawListenerC1926jv) this.n).m.m = true;
                ((ViewTreeObserverOnDrawListenerC1926jv) this.n).l.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) this.m);
                ((ViewTreeObserverOnDrawListenerC1926jv) this.n).m.l.clear();
                return;
            case 6:
                ThreadFactoryC1858jA threadFactoryC1858jA = (ThreadFactoryC1858jA) this.n;
                if (threadFactoryC1858jA.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.m).run();
                    return;
                } catch (Throwable th) {
                    threadFactoryC1858jA.c.w(th);
                    return;
                }
            case 7:
                ((InterfaceC1594gb) this.m).m((C1079bB) this.n);
                return;
            case 8:
                Ou0.p((InterfaceC0473Hh) this.m).j(Jp0.k((Throwable) this.n));
                return;
            case 9:
                break;
            case 10:
                WebView webView = (WebView) this.m;
                if (webView != null) {
                    PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.n;
                    if (playerMobileFragment.t()) {
                        webView.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n        if (videos[i].paused) {\n            videos[i].play().catch(e => console.log('Auto-play prevented:', e));\n        }\n        videos[i].muted = false;\n        videos[i].style.zIndex = '2147483647';\n        videos[i].style.position = 'relative';\n        if (videos[i].offsetWidth < 200 || videos[i].offsetHeight < 150) {\n            videos[i].style.width = '100%';\n            videos[i].style.height = 'auto';\n        }\n        videos[i].setAttribute('data-protected', 'true');\n    }\n    \n    window.open = function() { return null; };\n    window.alert = function() { return null; };\n    window.prompt = function() { return null; };\n    window.confirm = function() { return null; };\n    \n    const originalSetTimeout = window.setTimeout;\n    window.setTimeout = function(func, delay) {\n        if (typeof func === 'string' && \n            (func.includes('window.open') || \n             func.includes('window.location') || \n             func.includes('popup') || \n             func.includes('redirect') ||\n             func.includes('download'))) {\n            console.log('Blocked suspicious setTimeout');\n            return null;\n        }\n        if (typeof func === 'function') {\n            const wrappedFunc = function() {\n                try {\n                    func.apply(this, arguments);\n                } catch (e) {\n                    console.log('Blocked exception in setTimeout:', e);\n                }\n            };\n            return originalSetTimeout(wrappedFunc, delay);\n        }\n        return originalSetTimeout(func, delay);\n    };\n    \n    const originalSetInterval = window.setInterval;\n    window.setInterval = function(func, delay) {\n        if (typeof func === 'string' && \n            (func.includes('window.open') || \n             func.includes('window.location') || \n             func.includes('popup'))) {\n            console.log('Blocked suspicious setInterval');\n            return null;\n        }\n        return originalSetInterval(func, delay);\n    };\n    \n    const originalAssign = window.location.assign;\n    window.location.assign = function(url) {\n        console.log('Blocked location.assign:', url);\n        return null;\n    };\n    \n    const originalReplace = window.location.replace;\n    window.location.replace = function(url) {\n        console.log('Blocked location.replace:', url);\n        return null;\n    };\n    \n    let locationHref = window.location.href;\n    Object.defineProperty(window.location, 'href', {\n        get: function() { return locationHref; },\n        set: function(val) { \n            console.log('Blocked changing location.href to:', val);\n            return locationHref; \n        }\n    });\n    \n    function injectBlockingCSS() {\n        var style = document.createElement('style');\n        style.id = 'ad-blocking-css';\n        style.innerHTML = `\n            div[style*=\"z-index:\"], \n            div[style*=\"z-index=\"],\n            div[style*=\"position: fixed\"],\n            div[style*=\"position:fixed\"],\n            div[class*=\"overlay\"], \n            div[id*=\"overlay\"], \n            div[class*=\"modal\"], \n            div[id*=\"modal\"],\n            div[class*=\"popup\"], \n            div[id*=\"popup\"],\n            div[class*=\"notif\"],\n            div[id*=\"notif\"],\n            div[role=\"dialog\"],\n            .overlay, .modal, .popup, .lightbox,\n            .ad, .ads, .advert, .advertisement,\n            div[id*=\"google_ads\"],\n            div[id*=\"div-gpt-ad\"],\n            div[class*=\"banner\"],\n            div[id*=\"banner\"],\n            div[class*=\"promo\"],\n            div[id*=\"promo\"],\n            div[class*=\"bsa\"],\n            div[id*=\"bsa\"],\n            div[class*=\"adsbox\"],\n            [aria-label*=\"ad\"],\n            [aria-label*=\"Ad\"],\n            [data-ad],\n            [id*=\"taboola\"],\n            [class*=\"taboola\"],\n            [id*=\"mgid\"],\n            [class*=\"mgid\"],\n            [id*=\"zergnet\"],\n            [class*=\"pub_\"],\n            [class*=\"promotions\"] {\n                display: none !important;\n                visibility: hidden !important;\n                opacity: 0 !important;\n                pointer-events: none !important;\n                height: 0 !important;\n                width: 0 !important;\n                max-height: 0 !important;\n                max-width: 0 !important;\n                overflow: hidden !important;\n            }\n            \n            html, body {\n                overflow: auto !important;\n                height: auto !important;\n            }\n            \n            video, .video-js, .vjs-tech, [class*=\"player\"] {\n                display: block !important;\n                visibility: visible !important;\n                opacity: 1 !important;\n                z-index: 2147483647 !important;\n            }\n        `;\n        \n        var existingStyle = document.getElementById('ad-blocking-css');\n        if (existingStyle) {\n            existingStyle.remove();\n        }\n        \n        document.head.appendChild(style);\n    }\n    \n    function removeAdElements() {\n        var adSelectors = [\n            'iframe[src*=\"ads\"]',\n            'iframe[src*=\"banner\"]',\n            'iframe[src*=\"pop\"]',\n            'iframe[src*=\"promo\"]',\n            'iframe:not([src*=\"player\"]):not([src*=\"embed\"]):not([src*=\"video\"])',\n            'div[class*=\"ad\"]:not([class*=\"player\"]):not([class*=\"video\"])',\n            'div[id*=\"ad\"]:not([id*=\"player\"]):not([id*=\"video\"])',\n            'ins[class*=\"adsbygoogle\"]',\n            'div[id*=\"taboola\"]',\n            'div[id*=\"mgid\"]',\n            'div[class*=\"outbrain\"]',\n            'div[data-ad]',\n            '[data-ad-slot]',\n            '[data-ad-client]',\n            '.ad-banner',\n            '.ad-container',\n            '.ad-slot',\n            '.ad-wrapper',\n            '.popup-ad',\n            '.popup-overlay',\n            '.modal-backdrop',\n            '.modal-container',\n            'div[style*=\"z-index\"][style*=\"position: fixed\"]'\n        ];\n        \n        adSelectors.forEach(function(selector) {\n            try {\n                var elements = document.querySelectorAll(selector);\n                elements.forEach(function(el) {\n                    if (!el.querySelector('video') && \n                        !el.id?.includes('player') && \n                        !el.className?.includes('player')) {\n                        el.remove();\n                    }\n                });\n            } catch (e) {\n                console.log('Error removing ads:', e);\n            }\n        });\n        \n        var allElements = document.querySelectorAll('div');\n        allElements.forEach(function(el) {\n            try {\n                var style = window.getComputedStyle(el);\n                var zIndex = parseInt(style.zIndex);\n                var position = style.position;\n                \n                if (!isNaN(zIndex) && zIndex > 999 && \n                   (position === 'fixed' || position === 'absolute')) {\n                    \n                    if (!el.querySelector('video') && \n                        !el.id?.includes('player') && \n                        !el.className?.includes('player') &&\n                        !el.querySelector('[class*=\"player\"]')) {\n                        el.style.display = 'none';\n                        el.style.visibility = 'hidden';\n                    }\n                }\n            } catch (e) {}\n        });\n    }\n    \n    function fixScrollIssues() {\n        document.documentElement.style.overflow = 'auto';\n        document.body.style.overflow = 'auto';\n        document.documentElement.style.position = 'static';\n        document.body.style.position = 'static';\n        document.documentElement.style.height = 'auto';\n        document.body.style.height = 'auto';\n    }\n    \n    injectBlockingCSS();\n    removeAdElements();\n    fixScrollIssues();\n    \n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target) {\n            if (target.tagName === 'A') {\n                var href = target.getAttribute('href');\n                if (href && (href.startsWith('http') || href.startsWith('//')) &&\n                    !href.includes(window.location.hostname)) {\n                    console.log('Blocked click on external link:', href);\n                    e.preventDefault();\n                    e.stopPropagation();\n                    return false;\n                }\n                \n                if (target.getAttribute('target') === '_blank' || \n                    (href && \n                     (href.includes('#ad') || \n                      href.includes('javascript:') || \n                      href.includes('popup') || \n                      href.includes('download')))) {\n                    console.log('Blocked suspicious link click');\n                    e.preventDefault();\n                    e.stopPropagation();\n                    return false;\n                }\n            }\n            target = target.parentNode;\n        }\n    }, true);\n    \n    window.addEventListener('beforeunload', function(e) {\n        e.preventDefault();\n        e.returnValue = '';\n        return '';\n    });\n})();", null);
                        playerMobileFragment.c1.postDelayed(this, 800L);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((InterfaceC0835Vg) this.m).accept(this.n);
                return;
            case 12:
                ((InterfaceC1594gb) this.n).m((AbstractC1217ci) this.m);
                return;
            case 13:
                Nt0 nt0 = ((SwipeDismissBehavior) this.n).a;
                if (nt0 == null || !nt0.f()) {
                    return;
                }
                WeakHashMap weakHashMap = It0.a;
                ((View) this.m).postOnAnimation(this);
                return;
            default:
                IF r0 = (IF) this.m;
                WebView webView2 = (WebView) this.n;
                try {
                    System.out.getClass();
                    C3025vC c3025vC = (C3025vC) r0.m;
                    if (c3025vC != null && c3025vC.h) {
                        c3025vC.h = false;
                        try {
                            L80 l80 = c3025vC.g;
                            if (l80 != null) {
                                ((ScriptHandlerBoundaryInterface) l80.l).remove();
                            }
                        } catch (Throwable th2) {
                            Jp0.k(th2);
                        }
                        c3025vC.g = null;
                        try {
                            c3025vC.a.removeJavascriptInterface("ClonexHlsBridge");
                        } catch (Throwable th3) {
                            Jp0.k(th3);
                        }
                        break;
                    }
                    r0.m = null;
                    webView2.stopLoading();
                    webView2.onPause();
                    webView2.setWebChromeClient(null);
                    webView2.setWebViewClient(new WebViewClient());
                    webView2.loadUrl("about:blank");
                    ViewParent parent = webView2.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView2);
                    }
                    webView2.removeAllViews();
                    webView2.destroy();
                    return;
                } catch (Exception e2) {
                    e2.getMessage();
                    System.out.getClass();
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.m).run();
            } catch (Throwable th4) {
                Pu0.m(C1038aq.l, th4);
            }
            C1868jK c1868jK = (C1868jK) this.n;
            Runnable runnableZ = c1868jK.Z();
            if (runnableZ == null) {
                return;
            }
            this.m = runnableZ;
            i++;
            if (i >= 16) {
                AbstractC1217ci abstractC1217ci = c1868jK.n;
                if (abstractC1217ci.Y()) {
                    abstractC1217ci.W(c1868jK, this);
                    return;
                }
            }
        }
    }

    public /* synthetic */ RunnableC1938k1(Object obj, Object obj2, int i, boolean z) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    public RunnableC1938k1(String str, IF r2, WebView webView) {
        this.l = 14;
        this.m = r2;
        this.n = webView;
    }

    public RunnableC1938k1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.l = 13;
        this.n = swipeDismissBehavior;
        this.m = view;
    }
}
