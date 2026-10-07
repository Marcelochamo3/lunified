package o;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: o.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1169c7 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f708o;

    public /* synthetic */ RunnableC1169c7(Object obj, Object obj2, Object obj3, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f708o = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C1364e7 c1364e7 = (C1364e7) this.m;
                c1364e7.getClass();
                int i = Lr0.a;
                SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = c1364e7.c;
                surfaceHolderCallbackC0898Xr.getClass();
                C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
                c1042as.getClass();
                C0942Zj c0942Zj = c1042as.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1009, new S1(c3201x2S, (C0643Nw) this.n, (C0708Qj) this.f708o, 7));
                return;
            case 1:
                C2294nk c2294nk = (C2294nk) ((C2720s4) this.m).n;
                boolean zL = c2294nk.m.l();
                InterfaceC0777Ta interfaceC0777Ta = (InterfaceC0777Ta) this.n;
                if (zL) {
                    interfaceC0777Ta.w(c2294nk, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC0777Ta.E(c2294nk, (C1759i80) this.f708o);
                    return;
                }
            case 2:
                ((InterfaceC0777Ta) this.n).w((C2294nk) ((C2720s4) this.m).n, (Throwable) this.f708o);
                return;
            case 3:
                ViewGroup viewGroup = (ViewGroup) this.m;
                AbstractC1474fG.j(viewGroup, "$container");
                C0321Bl c0321Bl = (C0321Bl) this.f708o;
                AbstractC1474fG.j(c0321Bl, "this$0");
                viewGroup.endViewTransition((View) this.n);
                ((C3157wf0) c0321Bl.c.a).c(c0321Bl);
                return;
            case 4:
                C0350Co c0350Co = (C0350Co) this.m;
                ((InterfaceC0376Do) this.n).y(c0350Co.a, c0350Co.b, (Exception) this.f708o);
                return;
            case 5:
                C0533Jp c0533Jp = (C0533Jp) this.m;
                Pu0 pu0 = (Pu0) this.n;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f708o;
                c0533Jp.getClass();
                try {
                    C3287xw c3287xwG = AbstractC1370eA.g(c0533Jp.l);
                    if (c3287xwG == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C3190ww c3190ww = (C3190ww) ((InterfaceC0429Fp) c3287xwG.b);
                    synchronized (c3190ww.f1104o) {
                        c3190ww.q = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC0429Fp) c3287xwG.b).a(new C0507Ip(pu0, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    pu0.o(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 6:
                C3329yP c3329yP = (C3329yP) this.m;
                c3329yP.getClass();
                M60 m60G = ((WE) this.n).g();
                C0942Zj c0942Zj2 = c3329yP.c;
                InterfaceC2370oZ interfaceC2370oZ = c0942Zj2.r;
                interfaceC2370oZ.getClass();
                C1750i4 c1750i4 = c0942Zj2.f663o;
                c1750i4.getClass();
                c1750i4.n = AbstractC0985aF.l(m60G);
                if (!m60G.isEmpty()) {
                    c1750i4.q = (CP) m60G.get(0);
                    CP cp = (CP) this.f708o;
                    cp.getClass();
                    c1750i4.r = cp;
                }
                if (((CP) c1750i4.p) == null) {
                    c1750i4.p = C1750i4.e(interfaceC2370oZ, (AbstractC0985aF) c1750i4.n, (CP) c1750i4.q, (Dj0) c1750i4.m);
                }
                c1750i4.j(((C1042as) interfaceC2370oZ).E());
                return;
            case 7:
                C2613qy c2613qy = (C2613qy) this.m;
                ((IP) this.n).B(c2613qy.m, (CP) c2613qy.n, (C2069lP) this.f708o);
                return;
            case 8:
                C0942Zj c0942Zj3 = (C0942Zj) ((QP) ((C2994uv) this.m).n).i;
                Pair pair = (Pair) this.n;
                c0942Zj3.y(((Integer) pair.first).intValue(), (CP) pair.second, (Exception) this.f708o);
                return;
            case 9:
                ((Qd0) this.m).y((CompletableFuture) this.n, (AQ) this.f708o);
                return;
            case 10:
                C1364e7 c1364e8 = (C1364e7) this.m;
                c1364e8.getClass();
                int i2 = Lr0.a;
                SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr2 = c1364e8.c;
                surfaceHolderCallbackC0898Xr2.getClass();
                C1042as c1042as2 = surfaceHolderCallbackC0898Xr2.l;
                C0643Nw c0643Nw = (C0643Nw) this.n;
                c1042as2.P = c0643Nw;
                C0942Zj c0942Zj4 = c1042as2.r;
                C3201x2 c3201x2S2 = c0942Zj4.S();
                c0942Zj4.T(c3201x2S2, 1017, new S1(c3201x2S2, c0643Nw, (C0708Qj) this.f708o, 19));
                return;
            case 11:
                AbstractC1474fG.j((C1829iv0) this.m, "this$0");
                WebView webView = (WebView) this.n;
                AbstractC1474fG.j(webView, "$webView");
                String str = (String) this.f708o;
                AbstractC1474fG.j(str, "$script");
                try {
                    webView.evaluateJavascript("(function() {\n    if (window.__waawBridgeInjected) {\n        return;\n    }\n    window.__waawBridgeInjected = true;\n\n    function report(url, from) {\n        try {\n            if (!url) return;\n            if (String(url).indexOf('data:') === 0) return;\n            if (String(url).indexOf('android-webview-video-poster:') === 0) return;\n            WaawBridge.onM3u8Found(String(url));\n        } catch (e) {}\n    }\n\n    function normalize(url) {\n        if (!url) return '';\n        if (String(url).startsWith('//')) return 'https:' + url;\n        return String(url);\n    }\n\n    function extractM3u8Urls(text) {\n        var results = [];\n        try {\n            var source = String(text || '');\n            var index = 0;\n            while (index < source.length) {\n                var start = source.indexOf('http', index);\n                if (start === -1) break;\n                var end = start;\n                while (end < source.length) {\n                    var ch = source.charAt(end);\n                    if (\n                        ch === ' ' ||\n                        ch === '\\n' ||\n                        ch === '\\r' ||\n                        ch === '\\t' ||\n                        ch === '\"' ||\n                        ch === \"'\" ||\n                        ch === '<' ||\n                        ch === '>'\n                    ) {\n                        break;\n                    }\n                    end++;\n                }\n                var candidate = source.substring(start, end);\n                if (candidate.indexOf('.m3u8') !== -1) {\n                    results.push(candidate);\n                }\n                index = end + 1;\n            }\n        } catch (e) {}\n        return results;\n    }\n\n    try {\n        var bootstrapMedia = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n        window.__waawBootstrapVurl = normalize(window.vurl || '');\n        window.__waawBootstrapCurrentSrc = normalize(\n            bootstrapMedia && bootstrapMedia.currentSrc ? bootstrapMedia.currentSrc : ''\n        );\n    } catch (e) {}\n\n    try {\n        var origOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function(method, url) {\n            report(normalize(url), 'xhr.open');\n            return origOpen.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        var origSend = XMLHttpRequest.prototype.send;\n        XMLHttpRequest.prototype.send = function(body) {\n            this.addEventListener('readystatechange', function() {\n                try {\n                    if (this.readyState === 4 && this.responseText) {\n                        var matches = extractM3u8Urls(this.responseText);\n                        for (var i = 0; i < matches.length; i++) report(matches[i], 'xhr.response');\n                    }\n                } catch (e) {}\n            });\n            return origSend.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        if (window.fetch) {\n            var origFetch = window.fetch;\n            window.fetch = function(input, init) {\n                var u = typeof input === 'string' ? input : (input && input.url ? input.url : '');\n                report(normalize(u), 'fetch');\n                return origFetch.apply(this, arguments).then(function(resp) {\n                    try {\n                        var cloned = resp.clone();\n                        cloned.text().then(function(text) {\n                            try {\n                                var matches = extractM3u8Urls(text);\n                                for (var i = 0; i < matches.length; i++) report(matches[i], 'fetch.response');\n                            } catch (e) {}\n                        });\n                    } catch (e) {}\n                    return resp;\n                });\n            };\n        }\n    } catch (e) {}\n\n    try {\n        var videoProto = HTMLMediaElement && HTMLMediaElement.prototype;\n        if (videoProto) {\n            var descriptor = Object.getOwnPropertyDescriptor(videoProto, 'src');\n            if (descriptor && descriptor.set) {\n                Object.defineProperty(videoProto, 'src', {\n                    configurable: true,\n                    enumerable: descriptor.enumerable,\n                    get: function() {\n                        return descriptor.get ? descriptor.get.call(this) : '';\n                    },\n                    set: function(value) {\n                        report(normalize(value), 'media.src');\n                        return descriptor.set.call(this, value);\n                    }\n                });\n            }\n        }\n    } catch (e) {}\n\n    try {\n        var checkPlayer = function() {\n            try {\n                if (window.olplayer && typeof window.olplayer.src === 'function' && !window.olplayer.__waawPatched) {\n                    var originalSrc = window.olplayer.src.bind(window.olplayer);\n                    window.olplayer.src = function(input) {\n                        try {\n                            if (typeof input === 'string') {\n                                report(normalize(input), 'olplayer.src.string');\n                            } else if (input && input.src) {\n                                report(normalize(input.src), 'olplayer.src.object');\n                            }\n                        } catch (e) {}\n                        return originalSrc(input);\n                    };\n                    window.olplayer.__waawPatched = true;\n                }\n\n                if (window.vurl && normalize(window.vurl) !== window.__waawBootstrapVurl) {\n                    report(normalize(window.vurl), 'window.vurl');\n                }\n\n                var media = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n                if (media && media.currentSrc && normalize(media.currentSrc) !== window.__waawBootstrapCurrentSrc) {\n                    report(normalize(media.currentSrc), 'video.currentSrc');\n                }\n            } catch (e) {}\n        };\n\n        checkPlayer();\n        window.setInterval(checkPlayer, 700);\n    } catch (e) {}\n})();", null);
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                WebView webView2 = (WebView) this.m;
                AbstractC1474fG.j(webView2, "$this_invoke");
                String str2 = (String) this.n;
                AbstractC1474fG.j(str2, "$function");
                List list = (List) this.f708o;
                AbstractC1474fG.j(list, "$stringArgs");
                webView2.loadUrl("javascript:" + str2 + '(' + AbstractC0911Ye.h0(list, ",", null, null, null, 62) + ')');
                return;
        }
    }
}
