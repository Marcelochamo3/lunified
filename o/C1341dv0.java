package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: o.dv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1341dv0 extends AbstractC2237n40 {
    public final /* synthetic */ C1829iv0 a;
    public final /* synthetic */ InterfaceC0471Hf b;
    public final /* synthetic */ IF c;
    public final /* synthetic */ C2532q60 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IF f;
    public final /* synthetic */ String g;

    public C1341dv0(C1829iv0 c1829iv0, C0497If c0497If, IF r3, C2532q60 c2532q60, String str, IF r6, String str2) {
        this.a = c1829iv0;
        this.b = c0497If;
        this.c = r3;
        this.d = c2532q60;
        this.e = str;
        this.f = r6;
        this.g = str2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(final WebView webView, String str) {
        AbstractC1474fG.j(webView, "view");
        AbstractC1474fG.j(str, "url");
        super.onPageFinished(webView, str);
        this.c.m = str;
        if (((JH) this.b).U()) {
            return;
        }
        final C2532q60 c2532q60 = this.d;
        if (c2532q60.l) {
            int i = C1829iv0.e;
            C1829iv0 c1829iv0 = this.a;
            c1829iv0.getClass();
            webView.evaluateJavascript("(function() {\n    if (window.__waawBridgeInjected) {\n        return;\n    }\n    window.__waawBridgeInjected = true;\n\n    function report(url, from) {\n        try {\n            if (!url) return;\n            if (String(url).indexOf('data:') === 0) return;\n            if (String(url).indexOf('android-webview-video-poster:') === 0) return;\n            WaawBridge.onM3u8Found(String(url));\n        } catch (e) {}\n    }\n\n    function normalize(url) {\n        if (!url) return '';\n        if (String(url).startsWith('//')) return 'https:' + url;\n        return String(url);\n    }\n\n    function extractM3u8Urls(text) {\n        var results = [];\n        try {\n            var source = String(text || '');\n            var index = 0;\n            while (index < source.length) {\n                var start = source.indexOf('http', index);\n                if (start === -1) break;\n                var end = start;\n                while (end < source.length) {\n                    var ch = source.charAt(end);\n                    if (\n                        ch === ' ' ||\n                        ch === '\\n' ||\n                        ch === '\\r' ||\n                        ch === '\\t' ||\n                        ch === '\"' ||\n                        ch === \"'\" ||\n                        ch === '<' ||\n                        ch === '>'\n                    ) {\n                        break;\n                    }\n                    end++;\n                }\n                var candidate = source.substring(start, end);\n                if (candidate.indexOf('.m3u8') !== -1) {\n                    results.push(candidate);\n                }\n                index = end + 1;\n            }\n        } catch (e) {}\n        return results;\n    }\n\n    try {\n        var bootstrapMedia = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n        window.__waawBootstrapVurl = normalize(window.vurl || '');\n        window.__waawBootstrapCurrentSrc = normalize(\n            bootstrapMedia && bootstrapMedia.currentSrc ? bootstrapMedia.currentSrc : ''\n        );\n    } catch (e) {}\n\n    try {\n        var origOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function(method, url) {\n            report(normalize(url), 'xhr.open');\n            return origOpen.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        var origSend = XMLHttpRequest.prototype.send;\n        XMLHttpRequest.prototype.send = function(body) {\n            this.addEventListener('readystatechange', function() {\n                try {\n                    if (this.readyState === 4 && this.responseText) {\n                        var matches = extractM3u8Urls(this.responseText);\n                        for (var i = 0; i < matches.length; i++) report(matches[i], 'xhr.response');\n                    }\n                } catch (e) {}\n            });\n            return origSend.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        if (window.fetch) {\n            var origFetch = window.fetch;\n            window.fetch = function(input, init) {\n                var u = typeof input === 'string' ? input : (input && input.url ? input.url : '');\n                report(normalize(u), 'fetch');\n                return origFetch.apply(this, arguments).then(function(resp) {\n                    try {\n                        var cloned = resp.clone();\n                        cloned.text().then(function(text) {\n                            try {\n                                var matches = extractM3u8Urls(text);\n                                for (var i = 0; i < matches.length; i++) report(matches[i], 'fetch.response');\n                            } catch (e) {}\n                        });\n                    } catch (e) {}\n                    return resp;\n                });\n            };\n        }\n    } catch (e) {}\n\n    try {\n        var videoProto = HTMLMediaElement && HTMLMediaElement.prototype;\n        if (videoProto) {\n            var descriptor = Object.getOwnPropertyDescriptor(videoProto, 'src');\n            if (descriptor && descriptor.set) {\n                Object.defineProperty(videoProto, 'src', {\n                    configurable: true,\n                    enumerable: descriptor.enumerable,\n                    get: function() {\n                        return descriptor.get ? descriptor.get.call(this) : '';\n                    },\n                    set: function(value) {\n                        report(normalize(value), 'media.src');\n                        return descriptor.set.call(this, value);\n                    }\n                });\n            }\n        }\n    } catch (e) {}\n\n    try {\n        var checkPlayer = function() {\n            try {\n                if (window.olplayer && typeof window.olplayer.src === 'function' && !window.olplayer.__waawPatched) {\n                    var originalSrc = window.olplayer.src.bind(window.olplayer);\n                    window.olplayer.src = function(input) {\n                        try {\n                            if (typeof input === 'string') {\n                                report(normalize(input), 'olplayer.src.string');\n                            } else if (input && input.src) {\n                                report(normalize(input.src), 'olplayer.src.object');\n                            }\n                        } catch (e) {}\n                        return originalSrc(input);\n                    };\n                    window.olplayer.__waawPatched = true;\n                }\n\n                if (window.vurl && normalize(window.vurl) !== window.__waawBootstrapVurl) {\n                    report(normalize(window.vurl), 'window.vurl');\n                }\n\n                var media = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n                if (media && media.currentSrc && normalize(media.currentSrc) !== window.__waawBootstrapCurrentSrc) {\n                    report(normalize(media.currentSrc), 'video.currentSrc');\n                }\n            } catch (e) {}\n        };\n\n        checkPlayer();\n        window.setInterval(checkPlayer, 700);\n    } catch (e) {}\n})();", null);
            C1829iv0.f(c1829iv0, webView);
            return;
        }
        final IF r4 = this.f;
        final String str2 = this.g;
        final C1829iv0 c1829iv1 = this.a;
        final String str3 = this.e;
        webView.evaluateJavascript("(function() {\n    var iframe =\n        document.querySelector('iframe[src*=\"/e/\"]') ||\n        document.querySelector('iframe[src*=\"embed_player\"]') ||\n        document.querySelector('iframe');\n    return iframe ? iframe.src : '';\n})()", new ValueCallback() { // from class: o.cv0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String string;
                String str4 = (String) obj;
                C1829iv0 c1829iv2 = c1829iv1;
                AbstractC1474fG.j(c1829iv2, "this$0");
                WebView webView2 = webView;
                AbstractC1474fG.j(webView2, "$view");
                String str5 = str3;
                AbstractC1474fG.j(str5, "$baseUrl");
                IF r1 = r4;
                AbstractC1474fG.j(r1, "$resolvedIframeUrl");
                C2532q60 c2532q61 = c2532q60;
                AbstractC1474fG.j(c2532q61, "$iframeNavigated");
                String str6 = str2;
                AbstractC1474fG.j(str6, "$watchUrl");
                String strN0 = (str4 == null || (string = AbstractC1119bh0.E0(str4).toString()) == null) ? "" : AbstractC1119bh0.n0(string, "\"");
                if (strN0.length() == 0 || AbstractC1474fG.b(strN0, "null")) {
                    int i2 = C1829iv0.e;
                    webView2.evaluateJavascript("(function() {\n    if (window.__waawBridgeInjected) {\n        return;\n    }\n    window.__waawBridgeInjected = true;\n\n    function report(url, from) {\n        try {\n            if (!url) return;\n            if (String(url).indexOf('data:') === 0) return;\n            if (String(url).indexOf('android-webview-video-poster:') === 0) return;\n            WaawBridge.onM3u8Found(String(url));\n        } catch (e) {}\n    }\n\n    function normalize(url) {\n        if (!url) return '';\n        if (String(url).startsWith('//')) return 'https:' + url;\n        return String(url);\n    }\n\n    function extractM3u8Urls(text) {\n        var results = [];\n        try {\n            var source = String(text || '');\n            var index = 0;\n            while (index < source.length) {\n                var start = source.indexOf('http', index);\n                if (start === -1) break;\n                var end = start;\n                while (end < source.length) {\n                    var ch = source.charAt(end);\n                    if (\n                        ch === ' ' ||\n                        ch === '\\n' ||\n                        ch === '\\r' ||\n                        ch === '\\t' ||\n                        ch === '\"' ||\n                        ch === \"'\" ||\n                        ch === '<' ||\n                        ch === '>'\n                    ) {\n                        break;\n                    }\n                    end++;\n                }\n                var candidate = source.substring(start, end);\n                if (candidate.indexOf('.m3u8') !== -1) {\n                    results.push(candidate);\n                }\n                index = end + 1;\n            }\n        } catch (e) {}\n        return results;\n    }\n\n    try {\n        var bootstrapMedia = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n        window.__waawBootstrapVurl = normalize(window.vurl || '');\n        window.__waawBootstrapCurrentSrc = normalize(\n            bootstrapMedia && bootstrapMedia.currentSrc ? bootstrapMedia.currentSrc : ''\n        );\n    } catch (e) {}\n\n    try {\n        var origOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function(method, url) {\n            report(normalize(url), 'xhr.open');\n            return origOpen.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        var origSend = XMLHttpRequest.prototype.send;\n        XMLHttpRequest.prototype.send = function(body) {\n            this.addEventListener('readystatechange', function() {\n                try {\n                    if (this.readyState === 4 && this.responseText) {\n                        var matches = extractM3u8Urls(this.responseText);\n                        for (var i = 0; i < matches.length; i++) report(matches[i], 'xhr.response');\n                    }\n                } catch (e) {}\n            });\n            return origSend.apply(this, arguments);\n        };\n    } catch (e) {}\n\n    try {\n        if (window.fetch) {\n            var origFetch = window.fetch;\n            window.fetch = function(input, init) {\n                var u = typeof input === 'string' ? input : (input && input.url ? input.url : '');\n                report(normalize(u), 'fetch');\n                return origFetch.apply(this, arguments).then(function(resp) {\n                    try {\n                        var cloned = resp.clone();\n                        cloned.text().then(function(text) {\n                            try {\n                                var matches = extractM3u8Urls(text);\n                                for (var i = 0; i < matches.length; i++) report(matches[i], 'fetch.response');\n                            } catch (e) {}\n                        });\n                    } catch (e) {}\n                    return resp;\n                });\n            };\n        }\n    } catch (e) {}\n\n    try {\n        var videoProto = HTMLMediaElement && HTMLMediaElement.prototype;\n        if (videoProto) {\n            var descriptor = Object.getOwnPropertyDescriptor(videoProto, 'src');\n            if (descriptor && descriptor.set) {\n                Object.defineProperty(videoProto, 'src', {\n                    configurable: true,\n                    enumerable: descriptor.enumerable,\n                    get: function() {\n                        return descriptor.get ? descriptor.get.call(this) : '';\n                    },\n                    set: function(value) {\n                        report(normalize(value), 'media.src');\n                        return descriptor.set.call(this, value);\n                    }\n                });\n            }\n        }\n    } catch (e) {}\n\n    try {\n        var checkPlayer = function() {\n            try {\n                if (window.olplayer && typeof window.olplayer.src === 'function' && !window.olplayer.__waawPatched) {\n                    var originalSrc = window.olplayer.src.bind(window.olplayer);\n                    window.olplayer.src = function(input) {\n                        try {\n                            if (typeof input === 'string') {\n                                report(normalize(input), 'olplayer.src.string');\n                            } else if (input && input.src) {\n                                report(normalize(input.src), 'olplayer.src.object');\n                            }\n                        } catch (e) {}\n                        return originalSrc(input);\n                    };\n                    window.olplayer.__waawPatched = true;\n                }\n\n                if (window.vurl && normalize(window.vurl) !== window.__waawBootstrapVurl) {\n                    report(normalize(window.vurl), 'window.vurl');\n                }\n\n                var media = document.getElementById('olvideo_html5_api') || document.querySelector('video');\n                if (media && media.currentSrc && normalize(media.currentSrc) !== window.__waawBootstrapCurrentSrc) {\n                    report(normalize(media.currentSrc), 'video.currentSrc');\n                }\n            } catch (e) {}\n        };\n\n        checkPlayer();\n        window.setInterval(checkPlayer, 700);\n    } catch (e) {}\n})();", null);
                    C1829iv0.f(c1829iv2, webView2);
                    return;
                }
                if (!AbstractC1899jh0.U(strN0, "http", false)) {
                    if (AbstractC1899jh0.U(strN0, "//", false)) {
                        strN0 = "https:".concat(strN0);
                    } else {
                        strN0 = AbstractC1899jh0.U(strN0, "/", false) ? str5.concat(strN0) : AbstractC1701hf0.e(str5, "/", strN0);
                    }
                }
                String str7 = strN0;
                r1.m = str7;
                c2532q61.l = true;
                new Handler(Looper.getMainLooper()).post(new GP(webView2, str7, str6, str5, 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    @Override // o.AbstractC2237n40, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        WebResourceResponse webResourceResponse;
        String str;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        Uri url2 = webResourceRequest.getUrl();
        AbstractC1474fG.i(url2, "getUrl(...)");
        if (!AbstractC1370eA.z(url2)) {
            return Ov0.a();
        }
        int i = C1829iv0.e;
        C1829iv0 c1829iv0 = this.a;
        c1829iv0.getClass();
        List listK = AbstractC0937Ze.K("doubleclick.net", "googlesyndication.com", "adservice.", "admob.com", "chartbeat.com", "hotjar.com", "google-analytics.com", "googletagmanager.com", "facebook.com/tr", "pagead2.googlesyndication", "cdn.jsdelivr.net", "profitableexactly.com", "your-notice.com", "addthis.com", "disqus.com", "netu-tv.disqus.com");
        if (!listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(string, (String) it.next(), true)) {
                    return new WebResourceResponse("text/plain", "utf-8", null);
                }
            }
        }
        String string2 = webResourceRequest.getUrl().toString();
        AbstractC1474fG.i(string2, "toString(...)");
        String lowerCase = string2.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        if (!AbstractC1899jh0.U(lowerCase, "http", false) || AbstractC1119bh0.W(lowerCase, ".js", false) || AbstractC1119bh0.W(lowerCase, ".css", false) || AbstractC1119bh0.W(lowerCase, ".json", false) || !(AbstractC1119bh0.W(lowerCase, "/e/", false) || AbstractC1119bh0.W(lowerCase, "/player/embed_player.php", false) || AbstractC1119bh0.W(lowerCase, "/watch_video.php", false))) {
            webResourceResponse = null;
        } else {
            try {
                C1049av0 c1049av0G = c1829iv0.g(webResourceRequest);
                if (c1049av0G == null || (str = c1049av0G.a) == null) {
                    webResourceResponse = null;
                } else {
                    byte[] bytes = C1829iv0.h(str).getBytes(AbstractC1305dd.a);
                    AbstractC1474fG.i(bytes, "getBytes(...)");
                    LinkedHashMap linkedHashMapD = AbstractC3327yN.D(c1049av0G.e);
                    linkedHashMapD.remove("Content-Encoding");
                    linkedHashMapD.put("Cache-Control", "no-store");
                    linkedHashMapD.put("Content-Length", String.valueOf(bytes.length));
                    webResourceResponse = new WebResourceResponse(c1049av0G.b, "utf-8", c1049av0G.c, c1049av0G.d, linkedHashMapD, new ByteArrayInputStream(bytes));
                }
            } catch (Exception unused) {
            }
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        String lowerCase2 = string.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        if (AbstractC1119bh0.W(lowerCase2, ".m3u8", false) || AbstractC1119bh0.W(lowerCase2, ".mp4", false) || AbstractC1119bh0.W(lowerCase2, "manifest", false)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            AbstractC1474fG.i(requestHeaders, "getRequestHeaders(...)");
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (AbstractC1899jh0.N(key, "referer", true)) {
                    AbstractC1474fG.g(value);
                    linkedHashMap.put("Referer", value);
                } else if (AbstractC1899jh0.N(key, "origin", true)) {
                    AbstractC1474fG.g(value);
                    linkedHashMap.put("Origin", value);
                } else if (AbstractC1899jh0.N(key, "user-agent", true)) {
                    AbstractC1474fG.g(value);
                    linkedHashMap.put("User-Agent", value);
                } else if (AbstractC1899jh0.N(key, "cookie", true)) {
                    AbstractC1474fG.g(value);
                    linkedHashMap.put("Cookie", value);
                }
            }
            C1733hv0.w(c1829iv0, this.b, string, string, linkedHashMap);
        }
        return null;
    }
}
