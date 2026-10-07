package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Bv0 extends AbstractC2237n40 {
    public final /* synthetic */ IF a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ C2628r60 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String f;
    public final /* synthetic */ InterfaceC1594gb g;
    public final /* synthetic */ C2628r60 h;
    public final /* synthetic */ C2628r60 i;
    public final /* synthetic */ IF j;
    public final /* synthetic */ AtomicBoolean k;
    public final /* synthetic */ Handler l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ WebView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191o;
    public final /* synthetic */ IF p;
    public final /* synthetic */ AtomicBoolean q;
    public final /* synthetic */ InterfaceC1608gi r;

    public Bv0(IF r3, AtomicBoolean atomicBoolean, C2628r60 c2628r60, String str, LinkedHashMap linkedHashMap, String str2, C1692hb c1692hb, C2628r60 c2628r61, C2628r60 c2628r62, IF r12, AtomicBoolean atomicBoolean2, Handler handler, Object obj, WebView webView, AtomicBoolean atomicBoolean3, IF r18, AtomicBoolean atomicBoolean4, InterfaceC1608gi interfaceC1608gi) {
        this.a = r3;
        this.b = atomicBoolean;
        this.c = c2628r60;
        this.d = str;
        this.e = linkedHashMap;
        this.f = str2;
        this.g = c1692hb;
        this.h = c2628r61;
        this.i = c2628r62;
        this.j = r12;
        this.k = atomicBoolean2;
        this.l = handler;
        this.m = obj;
        this.n = webView;
        this.f191o = atomicBoolean3;
        this.p = r18;
        this.q = atomicBoolean4;
        this.r = interfaceC1608gi;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2 = str;
        super.onPageFinished(webView, str);
        if (this.k.get() || !this.g.a()) {
            return;
        }
        C3025vC c3025vC = (C3025vC) this.a.m;
        if (c3025vC != null && c3025vC.h) {
            if (str2 != null && !AbstractC1899jh0.O(str)) {
                c3025vC.i = str2;
            }
            c3025vC.a.evaluateJavascript("(function () {\n    if (window.__clonexHlsDetectorInstalled) {\n        if (window.__clonexHlsDetectorScan) window.__clonexHlsDetectorScan();\n        return;\n    }\n    window.__clonexHlsDetectorInstalled = true;\n\n    var seen = {};\n    function text(value) { return typeof value === 'string' ? value : ''; }\n    function looksHls(url, type, body) {\n        url = text(url).toLowerCase();\n        type = text(type).toLowerCase();\n        body = text(body).replace(/^\\s+/, '');\n        if (body.indexOf('#EXTM3U') === 0) return true;\n        if (type.indexOf('mpegurl') !== -1 || type.indexOf('hls') !== -1) return true;\n        return url.indexOf('.m3u8') !== -1 || url.indexOf('/hls/') !== -1 ||\n            url.indexOf('/m3/') !== -1 || url.indexOf('master.php') !== -1 ||\n            url.indexOf('playlist.php') !== -1;\n    }\n    function send(url, source, contentType, declaredType, bodyPrefix, poster) {\n        url = text(url);\n        if (!url || !looksHls(url, contentType || declaredType, bodyPrefix)) return;\n        var key = url + '|' + text(contentType) + '|' + text(declaredType);\n        if (seen[key]) return;\n        seen[key] = true;\n        try {\n            ClonexHlsBridge.report(JSON.stringify({\n                url: url,\n                source: source || 'dom',\n                contentType: contentType || '',\n                declaredType: declaredType || '',\n                bodyPrefix: text(bodyPrefix).substring(0, 64),\n                frameUrl: location.href,\n                title: document.title || '',\n                poster: poster || ''\n            }));\n        } catch (ignored) {}\n    }\n    function inspectTextValue(value, source) {\n        value = text(value).replace(/^\\s+|\\s+$/g, '');\n        if (!value) return;\n        if ((value.charAt(0) === '{' && value.charAt(value.length - 1) === '}') ||\n            (value.charAt(0) === '[' && value.charAt(value.length - 1) === ']')) {\n            try { inspectValue(JSON.parse(value), 0); } catch (ignored) {}\n            return;\n        }\n        send(value, source || 'player', '', '', '', '');\n    }\n    function inspectMedia(root) {\n        if (!root || !root.querySelectorAll) return;\n        var nodes = root.querySelectorAll('video, audio, source');\n        for (var i = 0; i < nodes.length && i < 300; i++) {\n            var node = nodes[i];\n            var parent = node.parentNode || {};\n            var poster = node.poster || parent.poster || '';\n            send(node.currentSrc || node.src || node.getAttribute('data-src'), 'dom', '', node.type, '', poster);\n        }\n        var metas = root.querySelectorAll('meta[content]');\n        for (var j = 0; j < metas.length && j < 100; j++) {\n            send(metas[j].content, 'html', '', metas[j].getAttribute('type'), '', '');\n        }\n    }\n    function inspectDataAttributes(root) {\n        if (!root || !root.querySelectorAll) return;\n        var attrs = [\n            'data-src', 'data-url', 'data-file', 'data-hls', 'data-playlist',\n            'data-source', 'data-sources', 'data-config', 'data-setup', 'data-store'\n        ];\n        var selector = [];\n        for (var i = 0; i < attrs.length; i++) selector.push('[' + attrs[i] + ']');\n        var nodes = root.querySelectorAll(selector.join(','));\n        for (var j = 0; j < nodes.length && j < 300; j++) {\n            for (var k = 0; k < attrs.length; k++) {\n                var raw = nodes[j].getAttribute(attrs[k]);\n                if (raw) inspectTextValue(raw, 'html');\n            }\n        }\n    }\n    function inspectValue(value, depth) {\n        if (depth > 4 || value == null) return;\n        if (typeof value === 'string') {\n            inspectTextValue(value, 'player');\n            return;\n        }\n        if (typeof value !== 'object') return;\n        var keys = [\n            'file', 'url', 'src', 'source', 'hls', 'playlist', 'master',\n            'manifest', 'playbackUrl', 'playback_url', 'playlistUrl',\n            'playlist_url', 'sources', 'levels', 'tracks', 'config', 'setup'\n        ];\n        for (var i = 0; i < keys.length; i++) {\n            try { if (value[keys[i]] != null) inspectValue(value[keys[i]], depth + 1); } catch (ignored) {}\n        }\n        if (Object.prototype.toString.call(value) === '[object Array]') {\n            for (var j = 0; j < value.length && j < 30; j++) inspectValue(value[j], depth + 1);\n        }\n    }\n    function hookMethod(target, name, callback) {\n        try {\n            if (!target || typeof target[name] !== 'function' || target[name].__clonexHlsWrapped) return;\n            var original = target[name];\n            var wrapped = function () {\n                try { callback.call(this, arguments); } catch (ignored) {}\n                return original.apply(this, arguments);\n            };\n            wrapped.__clonexHlsWrapped = true;\n            target[name] = wrapped;\n        } catch (ignored) {}\n    }\n    function installPlayerHooks() {\n        try {\n            if (window.Hls && window.Hls.prototype) {\n                hookMethod(window.Hls.prototype, 'loadSource', function (args) {\n                    send(args[0], 'player', '', 'application/vnd.apple.mpegurl', '', '');\n                });\n            }\n        } catch (ignored) {}\n        try {\n            if (window.shaka && window.shaka.Player && window.shaka.Player.prototype) {\n                hookMethod(window.shaka.Player.prototype, 'load', function (args) {\n                    send(args[0], 'player', '', '', '', '');\n                });\n            }\n        } catch (ignored) {}\n    }\n    function inspectPlayers() {\n        installPlayerHooks();\n        try { if (typeof jwplayer === 'function') inspectValue(jwplayer().getPlaylist(), 0); } catch (ignored) {}\n        try { if (typeof flowplayer === 'function') inspectValue(flowplayer().video, 0); } catch (ignored) {}\n        try { if (window.Clappr && Clappr.PlayerInfo) inspectValue(Clappr.PlayerInfo._players, 0); } catch (ignored) {}\n        try {\n            if (typeof videojs === 'function' && videojs.getPlayers) {\n                var players = videojs.getPlayers();\n                for (var id in players) {\n                    if (!Object.prototype.hasOwnProperty.call(players, id)) continue;\n                    try { inspectValue(players[id].currentSources(), 0); } catch (ignored) {}\n                }\n            }\n        } catch (ignored) {}\n        try { inspectValue(window.playerConfig, 0); } catch (ignored) {}\n        try { inspectValue(window.videoUrl, 0); inspectValue(window.hlsUrl, 0); inspectValue(window.streamUrl, 0); } catch (ignored) {}\n    }\n    function inspectPerformance() {\n        try {\n            var entries = performance.getEntriesByType('resource');\n            for (var i = 0; i < entries.length; i++) send(entries[i].name, 'performance', '', '', '', '');\n        } catch (ignored) {}\n    }\n    function scan() {\n        inspectMedia(document);\n        inspectDataAttributes(document);\n        inspectPlayers();\n        inspectPerformance();\n        try {\n            var frames = document.querySelectorAll('iframe, frame');\n            for (var i = 0; i < frames.length && i < 20; i++) {\n                var frameDocument = frames[i].contentDocument;\n                if (!frameDocument) continue;\n                inspectMedia(frameDocument);\n                inspectDataAttributes(frameDocument);\n            }\n        } catch (ignored) {}\n    }\n    window.__clonexHlsDetectorScan = scan;\n\n    // MutationObserver ve el atributo después del cambio; este hook\n    // conserva también la URL asignada justo antes de que un player\n    // la sustituya por blob:/MediaSource.\n    try {\n        if (window.HTMLMediaElement && window.HTMLMediaElement.prototype) {\n            var mediaSrc = Object.getOwnPropertyDescriptor(window.HTMLMediaElement.prototype, 'src');\n            if (mediaSrc && mediaSrc.set && mediaSrc.get && mediaSrc.configurable) {\n                Object.defineProperty(window.HTMLMediaElement.prototype, 'src', {\n                    configurable: mediaSrc.configurable,\n                    enumerable: mediaSrc.enumerable,\n                    get: mediaSrc.get,\n                    set: function (value) {\n                        try { send(value, 'dom', '', this.type || '', '', this.poster || ''); } catch (ignored) {}\n                        return mediaSrc.set.call(this, value);\n                    }\n                });\n            }\n        }\n    } catch (ignored) {}\n\n    try {\n        var originalFetch = window.fetch;\n        if (originalFetch) window.fetch = function () {\n            return originalFetch.apply(this, arguments).then(function (response) {\n                try {\n                    var type = response.headers.get('content-type') || '';\n                    send(response.url, 'fetch', type, '', '', '');\n                    if (looksHls(response.url, type, '')) {\n                        response.clone().text().then(function (body) {\n                            send(response.url, 'fetch', type, '', body, '');\n                        }).catch(function () {});\n                    }\n                } catch (ignored) {}\n                return response;\n            });\n        };\n    } catch (ignored) {}\n\n    try {\n        var originalOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function (method, url) {\n            this.__clonexHlsUrl = url;\n            this.addEventListener('load', function () {\n                var finalUrl = this.responseURL || this.__clonexHlsUrl;\n                var type = '';\n                var prefix = '';\n                try { type = this.getResponseHeader('content-type') || ''; } catch (ignored) {}\n                try { prefix = typeof this.responseText === 'string' ? this.responseText.substring(0, 64) : ''; } catch (ignored) {}\n                send(finalUrl, 'xhr', type, '', prefix, '');\n            });\n            return originalOpen.apply(this, arguments);\n        };\n    } catch (ignored) {}\n\n    var scheduledScan = 0;\n    function scheduleScan() {\n        if (scheduledScan) return;\n        scheduledScan = setTimeout(function () {\n            scheduledScan = 0;\n            scan();\n        }, 150);\n    }\n    function installMutationObserver() {\n        try {\n            if (!document.documentElement || window.__clonexHlsMutationObserver) return;\n            window.__clonexHlsMutationObserver = new MutationObserver(scheduleScan);\n            window.__clonexHlsMutationObserver.observe(\n                document.documentElement,\n                {\n                    childList: true,\n                    subtree: true,\n                    attributes: true,\n                    attributeFilter: [\n                        'src', 'type', 'data-src', 'data-url', 'data-file', 'data-hls',\n                        'data-playlist', 'data-source', 'data-sources', 'data-config',\n                        'data-setup', 'data-store'\n                    ]\n                }\n            );\n        } catch (ignored) {}\n    }\n    installMutationObserver();\n    try {\n        if (window.PerformanceObserver) {\n            new PerformanceObserver(function (list) {\n                var entries = list.getEntries();\n                for (var i = 0; i < entries.length; i++) send(entries[i].name, 'performance', '', '', '', '');\n            }).observe({ entryTypes: ['resource'] });\n        }\n    } catch (ignored) {}\n\n    document.addEventListener('play', scheduleScan, true);\n    document.addEventListener('DOMContentLoaded', function () { installMutationObserver(); scan(); }, false);\n    scan();\n    var scans = 0;\n    var timer = setInterval(function () {\n        scan();\n        scans++;\n        if (scans >= 20) clearInterval(timer);\n    }, 1000);\n})();", null);
            c3025vC.a.evaluateJavascript("window.__clonexHlsDetectorScan && window.__clonexHlsDetectorScan();", null);
        }
        System.out.getClass();
        Context context = Hv0.b;
        if (str2 == null) {
            str2 = "";
        }
        C3325yL.y(str2);
        int i = this.c.l;
        int i2 = this.h.l;
        int i3 = this.i.l;
        this.b.get();
        if (this.f191o.compareAndSet(false, true)) {
            Dv0.z(this.k, this.g, this.l, this.m, 1500L, new C3383yv0(this.b, this.n, 0));
            Dv0.z(this.k, this.g, this.l, this.m, 5000L, new C3383yv0(this.b, this.n, 1));
            if (webView != null) {
                webView.evaluateJavascript("(function() {\n    try {\n        // Buscar elementos de video/audio\n        var videos = document.querySelectorAll('video, audio');\n        for (var i = 0; i < videos.length; i++) {\n            if (videos[i].src) return videos[i].src;\n            var sources = videos[i].querySelectorAll('source');\n            for (var j = 0; j < sources.length; j++) {\n                if (sources[j].src) return sources[j].src;\n            }\n        }\n\n        // Buscar en variables globales comunes\n        if (window.playerConfig && window.playerConfig.file) return window.playerConfig.file;\n        if (window.videoUrl) return window.videoUrl;\n        if (window.streamUrl) return window.streamUrl;\n        if (window.hlsUrl) return window.hlsUrl;\n        if (window.m3u8Url) return window.m3u8Url;\n        if (window.source) return window.source;\n\n        // Buscar en el HTML por URLs de m3u8/mp4 CON query params\n        if (document.documentElement) {\n            var html = document.documentElement.innerHTML;\n            \n            // Regex mejorado para capturar query params. NO excluimos la coma\n            // del charset porque parámetros legítimos la usan (ej. Kick manda\n            // \"supported_codecs=av1,h264\" en la query real) — cortar ahí trunca\n            // el token. En cambio, limpiamos después del match:\n            function cleanEmbeddedUrl(u) {\n                // Algunos sitios (ej. Kick) concatenan variantes separadas por\n                // coma+otra URL: \"url1?token=A:T409,https://url2?token=B\".\n                // Cortar solo en \",http(s)://\" (URL completa después), nunca en\n                // una coma cualquiera dentro de un parámetro legítimo.\n                var idx = u.search(/,https?:\\/\\//);\n                if (idx !== -1) u = u.substring(0, idx);\n                // Sufijo \":T<numero>\" pegado al final = anotación interna de\n                // latencia objetivo, no parte de la URL/token.\n                u = u.replace(/:T\\d+$/, '');\n                return u;\n            }\n\n            var m3u8Match = html.match(/https?:\\/\\/[^\\s\"'<>]+\\.m3u8[^\\s\"'<>]*/);\n            if (m3u8Match) {\n                var cleanedM3u8 = cleanEmbeddedUrl(m3u8Match[0]);\n                console.log('Found m3u8 in HTML:', cleanedM3u8);\n                return cleanedM3u8;\n            }\n\n            var mp4Match = html.match(/https?:\\/\\/[^\\s\"'<>]+\\.mp4[^\\s\"'<>]*/);\n            if (mp4Match) return cleanEmbeddedUrl(mp4Match[0]);\n        }\n\n        return null;\n    } catch(e) {\n        console.error('Error extracting video:', e);\n        return null;\n    }\n})();", new C3480zv0(this.b, this.f, this.j, this.e, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", this.g, this.p, this.q, this.k, this.r, this.l, this.m, this.a, this.n));
            }
            AtomicBoolean atomicBoolean = this.k;
            InterfaceC1594gb interfaceC1594gb = this.g;
            Handler handler = this.l;
            Object obj = this.m;
            Dv0.z(atomicBoolean, interfaceC1594gb, handler, obj, 45000L, new Av0(this.j, interfaceC1594gb, this.c, this.h, this.i, atomicBoolean, handler, obj, this.a, this.n));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        CharSequence description;
        String string2;
        Uri url;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String str = "unknown";
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "unknown";
        }
        if (Build.VERSION.SDK_INT >= 23 && webResourceError != null && (description = webResourceError.getDescription()) != null && (string2 = description.toString()) != null) {
            str = string2;
        }
        Context context = Hv0.b;
        C3325yL.y(string);
        System.out.getClass();
        if (AbstractC1474fG.b(string, this.f)) {
            InterfaceC1594gb interfaceC1594gb = this.g;
            if (interfaceC1594gb.a()) {
                Dv0.x(this.k, this.l, this.m, this.a, this.n, "error loading main page");
                interfaceC1594gb.j(Jp0.k(new Exception("WebView error loading main page: ".concat(str))));
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // o.AbstractC2237n40, android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r63, android.webkit.WebResourceRequest r64) {
        /*
            Method dump skipped, instruction units count: 2911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Bv0.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Context context = Hv0.b;
        C3325yL.y(str2 == null ? "" : str2);
        System.out.getClass();
        if (AbstractC1474fG.b(str2, this.f)) {
            InterfaceC1594gb interfaceC1594gb = this.g;
            if (interfaceC1594gb.a()) {
                Dv0.x(this.k, this.l, this.m, this.a, this.n, "legacy error loading main page");
                interfaceC1594gb.j(Jp0.k(new Exception(AbstractC1701hf0.t("WebView error: ", str))));
            }
        }
    }
}
