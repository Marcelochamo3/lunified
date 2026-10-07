package o;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: renamed from: o.vC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3025vC {
    public final WebView a;
    public final String b;
    public final InterfaceC0412Ey c;
    public final Handler d;
    public final LinkedHashMap e;
    public final C2928uC f;
    public L80 g;
    public boolean h;
    public volatile String i;

    public C3025vC(WebView webView, String str, C3189wv0 c3189wv0) {
        AbstractC1474fG.j(str, "fallbackPageUrl");
        this.a = webView;
        this.b = str;
        this.c = c3189wv0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new LinkedHashMap();
        this.f = new C2928uC(this);
        this.i = str;
    }

    public static final TB a(C3025vC c3025vC, String str) {
        c3025vC.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        TB tb = TB.f529o;
        switch (iHashCode) {
            case -1480388560:
                return !lowerCase.equals("performance") ? tb : TB.q;
            case -985752863:
                return !lowerCase.equals("player") ? tb : TB.p;
            case 99650:
                lowerCase.equals("dom");
                return tb;
            case 118658:
                return !lowerCase.equals("xhr") ? tb : TB.n;
            case 3213227:
                return !lowerCase.equals("html") ? tb : TB.r;
            case 97322682:
                return !lowerCase.equals("fetch") ? tb : TB.m;
            default:
                return tb;
        }
    }

    public final void b() {
        Mv0 mv0;
        if (!AbstractC1474fG.b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("HlsWebViewDetector.attach debe ejecutarse en el hilo principal".toString());
        }
        if (this.h) {
            return;
        }
        this.h = true;
        WebView webView = this.a;
        webView.addJavascriptInterface(this.f, "ClonexHlsBridge");
        if (AbstractC1474fG.G("DOCUMENT_START_SCRIPT")) {
            Set setO = AbstractC1370eA.O("*");
            boolean z = AbstractC2995uv0.a;
            if (!Kv0.c.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            if (Kv0.e.b() && AbstractC2995uv0.a) {
                WeakHashMap weakHashMap = AbstractC2995uv0.b;
                mv0 = (Mv0) weakHashMap.get(webView);
                if (mv0 == null) {
                    mv0 = new Mv0(Lv0.a.createWebView(webView));
                    weakHashMap.put(webView, mv0);
                }
            } else {
                mv0 = new Mv0(Lv0.a.createWebView(webView));
            }
            this.g = new L80((ScriptHandlerBoundaryInterface) AbstractC3409z9.d(ScriptHandlerBoundaryInterface.class, mv0.a.addDocumentStartJavaScript("(function () {\n    if (window.__clonexHlsDetectorInstalled) {\n        if (window.__clonexHlsDetectorScan) window.__clonexHlsDetectorScan();\n        return;\n    }\n    window.__clonexHlsDetectorInstalled = true;\n\n    var seen = {};\n    function text(value) { return typeof value === 'string' ? value : ''; }\n    function looksHls(url, type, body) {\n        url = text(url).toLowerCase();\n        type = text(type).toLowerCase();\n        body = text(body).replace(/^\\s+/, '');\n        if (body.indexOf('#EXTM3U') === 0) return true;\n        if (type.indexOf('mpegurl') !== -1 || type.indexOf('hls') !== -1) return true;\n        return url.indexOf('.m3u8') !== -1 || url.indexOf('/hls/') !== -1 ||\n            url.indexOf('/m3/') !== -1 || url.indexOf('master.php') !== -1 ||\n            url.indexOf('playlist.php') !== -1;\n    }\n    function send(url, source, contentType, declaredType, bodyPrefix, poster) {\n        url = text(url);\n        if (!url || !looksHls(url, contentType || declaredType, bodyPrefix)) return;\n        var key = url + '|' + text(contentType) + '|' + text(declaredType);\n        if (seen[key]) return;\n        seen[key] = true;\n        try {\n            ClonexHlsBridge.report(JSON.stringify({\n                url: url,\n                source: source || 'dom',\n                contentType: contentType || '',\n                declaredType: declaredType || '',\n                bodyPrefix: text(bodyPrefix).substring(0, 64),\n                frameUrl: location.href,\n                title: document.title || '',\n                poster: poster || ''\n            }));\n        } catch (ignored) {}\n    }\n    function inspectTextValue(value, source) {\n        value = text(value).replace(/^\\s+|\\s+$/g, '');\n        if (!value) return;\n        if ((value.charAt(0) === '{' && value.charAt(value.length - 1) === '}') ||\n            (value.charAt(0) === '[' && value.charAt(value.length - 1) === ']')) {\n            try { inspectValue(JSON.parse(value), 0); } catch (ignored) {}\n            return;\n        }\n        send(value, source || 'player', '', '', '', '');\n    }\n    function inspectMedia(root) {\n        if (!root || !root.querySelectorAll) return;\n        var nodes = root.querySelectorAll('video, audio, source');\n        for (var i = 0; i < nodes.length && i < 300; i++) {\n            var node = nodes[i];\n            var parent = node.parentNode || {};\n            var poster = node.poster || parent.poster || '';\n            send(node.currentSrc || node.src || node.getAttribute('data-src'), 'dom', '', node.type, '', poster);\n        }\n        var metas = root.querySelectorAll('meta[content]');\n        for (var j = 0; j < metas.length && j < 100; j++) {\n            send(metas[j].content, 'html', '', metas[j].getAttribute('type'), '', '');\n        }\n    }\n    function inspectDataAttributes(root) {\n        if (!root || !root.querySelectorAll) return;\n        var attrs = [\n            'data-src', 'data-url', 'data-file', 'data-hls', 'data-playlist',\n            'data-source', 'data-sources', 'data-config', 'data-setup', 'data-store'\n        ];\n        var selector = [];\n        for (var i = 0; i < attrs.length; i++) selector.push('[' + attrs[i] + ']');\n        var nodes = root.querySelectorAll(selector.join(','));\n        for (var j = 0; j < nodes.length && j < 300; j++) {\n            for (var k = 0; k < attrs.length; k++) {\n                var raw = nodes[j].getAttribute(attrs[k]);\n                if (raw) inspectTextValue(raw, 'html');\n            }\n        }\n    }\n    function inspectValue(value, depth) {\n        if (depth > 4 || value == null) return;\n        if (typeof value === 'string') {\n            inspectTextValue(value, 'player');\n            return;\n        }\n        if (typeof value !== 'object') return;\n        var keys = [\n            'file', 'url', 'src', 'source', 'hls', 'playlist', 'master',\n            'manifest', 'playbackUrl', 'playback_url', 'playlistUrl',\n            'playlist_url', 'sources', 'levels', 'tracks', 'config', 'setup'\n        ];\n        for (var i = 0; i < keys.length; i++) {\n            try { if (value[keys[i]] != null) inspectValue(value[keys[i]], depth + 1); } catch (ignored) {}\n        }\n        if (Object.prototype.toString.call(value) === '[object Array]') {\n            for (var j = 0; j < value.length && j < 30; j++) inspectValue(value[j], depth + 1);\n        }\n    }\n    function hookMethod(target, name, callback) {\n        try {\n            if (!target || typeof target[name] !== 'function' || target[name].__clonexHlsWrapped) return;\n            var original = target[name];\n            var wrapped = function () {\n                try { callback.call(this, arguments); } catch (ignored) {}\n                return original.apply(this, arguments);\n            };\n            wrapped.__clonexHlsWrapped = true;\n            target[name] = wrapped;\n        } catch (ignored) {}\n    }\n    function installPlayerHooks() {\n        try {\n            if (window.Hls && window.Hls.prototype) {\n                hookMethod(window.Hls.prototype, 'loadSource', function (args) {\n                    send(args[0], 'player', '', 'application/vnd.apple.mpegurl', '', '');\n                });\n            }\n        } catch (ignored) {}\n        try {\n            if (window.shaka && window.shaka.Player && window.shaka.Player.prototype) {\n                hookMethod(window.shaka.Player.prototype, 'load', function (args) {\n                    send(args[0], 'player', '', '', '', '');\n                });\n            }\n        } catch (ignored) {}\n    }\n    function inspectPlayers() {\n        installPlayerHooks();\n        try { if (typeof jwplayer === 'function') inspectValue(jwplayer().getPlaylist(), 0); } catch (ignored) {}\n        try { if (typeof flowplayer === 'function') inspectValue(flowplayer().video, 0); } catch (ignored) {}\n        try { if (window.Clappr && Clappr.PlayerInfo) inspectValue(Clappr.PlayerInfo._players, 0); } catch (ignored) {}\n        try {\n            if (typeof videojs === 'function' && videojs.getPlayers) {\n                var players = videojs.getPlayers();\n                for (var id in players) {\n                    if (!Object.prototype.hasOwnProperty.call(players, id)) continue;\n                    try { inspectValue(players[id].currentSources(), 0); } catch (ignored) {}\n                }\n            }\n        } catch (ignored) {}\n        try { inspectValue(window.playerConfig, 0); } catch (ignored) {}\n        try { inspectValue(window.videoUrl, 0); inspectValue(window.hlsUrl, 0); inspectValue(window.streamUrl, 0); } catch (ignored) {}\n    }\n    function inspectPerformance() {\n        try {\n            var entries = performance.getEntriesByType('resource');\n            for (var i = 0; i < entries.length; i++) send(entries[i].name, 'performance', '', '', '', '');\n        } catch (ignored) {}\n    }\n    function scan() {\n        inspectMedia(document);\n        inspectDataAttributes(document);\n        inspectPlayers();\n        inspectPerformance();\n        try {\n            var frames = document.querySelectorAll('iframe, frame');\n            for (var i = 0; i < frames.length && i < 20; i++) {\n                var frameDocument = frames[i].contentDocument;\n                if (!frameDocument) continue;\n                inspectMedia(frameDocument);\n                inspectDataAttributes(frameDocument);\n            }\n        } catch (ignored) {}\n    }\n    window.__clonexHlsDetectorScan = scan;\n\n    // MutationObserver ve el atributo después del cambio; este hook\n    // conserva también la URL asignada justo antes de que un player\n    // la sustituya por blob:/MediaSource.\n    try {\n        if (window.HTMLMediaElement && window.HTMLMediaElement.prototype) {\n            var mediaSrc = Object.getOwnPropertyDescriptor(window.HTMLMediaElement.prototype, 'src');\n            if (mediaSrc && mediaSrc.set && mediaSrc.get && mediaSrc.configurable) {\n                Object.defineProperty(window.HTMLMediaElement.prototype, 'src', {\n                    configurable: mediaSrc.configurable,\n                    enumerable: mediaSrc.enumerable,\n                    get: mediaSrc.get,\n                    set: function (value) {\n                        try { send(value, 'dom', '', this.type || '', '', this.poster || ''); } catch (ignored) {}\n                        return mediaSrc.set.call(this, value);\n                    }\n                });\n            }\n        }\n    } catch (ignored) {}\n\n    try {\n        var originalFetch = window.fetch;\n        if (originalFetch) window.fetch = function () {\n            return originalFetch.apply(this, arguments).then(function (response) {\n                try {\n                    var type = response.headers.get('content-type') || '';\n                    send(response.url, 'fetch', type, '', '', '');\n                    if (looksHls(response.url, type, '')) {\n                        response.clone().text().then(function (body) {\n                            send(response.url, 'fetch', type, '', body, '');\n                        }).catch(function () {});\n                    }\n                } catch (ignored) {}\n                return response;\n            });\n        };\n    } catch (ignored) {}\n\n    try {\n        var originalOpen = XMLHttpRequest.prototype.open;\n        XMLHttpRequest.prototype.open = function (method, url) {\n            this.__clonexHlsUrl = url;\n            this.addEventListener('load', function () {\n                var finalUrl = this.responseURL || this.__clonexHlsUrl;\n                var type = '';\n                var prefix = '';\n                try { type = this.getResponseHeader('content-type') || ''; } catch (ignored) {}\n                try { prefix = typeof this.responseText === 'string' ? this.responseText.substring(0, 64) : ''; } catch (ignored) {}\n                send(finalUrl, 'xhr', type, '', prefix, '');\n            });\n            return originalOpen.apply(this, arguments);\n        };\n    } catch (ignored) {}\n\n    var scheduledScan = 0;\n    function scheduleScan() {\n        if (scheduledScan) return;\n        scheduledScan = setTimeout(function () {\n            scheduledScan = 0;\n            scan();\n        }, 150);\n    }\n    function installMutationObserver() {\n        try {\n            if (!document.documentElement || window.__clonexHlsMutationObserver) return;\n            window.__clonexHlsMutationObserver = new MutationObserver(scheduleScan);\n            window.__clonexHlsMutationObserver.observe(\n                document.documentElement,\n                {\n                    childList: true,\n                    subtree: true,\n                    attributes: true,\n                    attributeFilter: [\n                        'src', 'type', 'data-src', 'data-url', 'data-file', 'data-hls',\n                        'data-playlist', 'data-source', 'data-sources', 'data-config',\n                        'data-setup', 'data-store'\n                    ]\n                }\n            );\n        } catch (ignored) {}\n    }\n    installMutationObserver();\n    try {\n        if (window.PerformanceObserver) {\n            new PerformanceObserver(function (list) {\n                var entries = list.getEntries();\n                for (var i = 0; i < entries.length; i++) send(entries[i].name, 'performance', '', '', '', '');\n            }).observe({ entryTypes: ['resource'] });\n        }\n    } catch (ignored) {}\n\n    document.addEventListener('play', scheduleScan, true);\n    document.addEventListener('DOMContentLoaded', function () { installMutationObserver(); scan(); }, false);\n    scan();\n    var scans = 0;\n    var timer = setInterval(function () {\n        scan();\n        scans++;\n        if (scans >= 20) clearInterval(timer);\n    }, 1000);\n})();", (String[]) setO.toArray(new String[0]))));
        }
    }

    public final void c(RB rb) {
        int i;
        if (this.h) {
            switch (rb.b.ordinal()) {
                case 0:
                    i = 50;
                    break;
                case 1:
                case 2:
                    i = 40;
                    break;
                case 3:
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 30;
                    break;
                case 6:
                    i = 20;
                    break;
                default:
                    throw new C0730Rf();
            }
            boolean z = true;
            int i2 = i + (!rb.g.isEmpty() ? 1 : 0);
            synchronized (this.e) {
                try {
                    Integer num = (Integer) this.e.get(rb.a);
                    if ((num != null ? num.intValue() : -1) >= i2) {
                        z = false;
                    } else {
                        this.e.put(rb.a, Integer.valueOf(i2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.d.post(new O3(this, 9, rb));
            }
        }
    }

    public final void d(String str, Map map) {
        I60 i60 = SB.a;
        String strE = SB.e(str, this.i);
        if (strE != null && AbstractC1468fA.s(strE) && SB.b(14, strE, null, null)) {
            c(new RB(strE, TB.l, null, this.i, null, null, AbstractC1468fA.a(strE, strE, map), strE, 52));
        }
    }

    public final boolean e(String str, String str2, String str3, Map map) {
        AbstractC1474fG.j(str, "url");
        I60 i60 = SB.a;
        String strE = SB.e(str, this.i);
        boolean z = false;
        if (strE == null || !AbstractC1468fA.s(strE)) {
            return false;
        }
        String str4 = str3;
        if (SB.b(4, strE, str2, str4)) {
            c(new RB(strE, TB.l, str2, this.i, null, null, AbstractC1468fA.a(strE, strE, map), strE, 48));
            z = true;
        }
        if (!(!AbstractC1899jh0.O(str3))) {
            str4 = null;
        }
        if (str4 != null) {
            ArrayList arrayList = new ArrayList();
            C1934jz c1934jz = new C1934jz(I60.c(SB.d, str4));
            while (true) {
                boolean zHasNext = c1934jz.hasNext();
                I60 i61 = SB.a;
                if (!zHasNext) {
                    break;
                }
                JN jn = (JN) c1934jz.next();
                String strE2 = SB.e(jn.c(), strE);
                if (strE2 != null) {
                    arrayList.add(new C1101bX(Integer.valueOf(jn.b().l), strE2));
                }
            }
            C1934jz c1934jz2 = new C1934jz(I60.c(SB.e, str4));
            while (c1934jz2.hasNext()) {
                JN jn2 = (JN) c1934jz2.next();
                String strE3 = SB.e((String) ((HN) jn2.a()).get(1), strE);
                if (strE3 != null && SB.b(14, strE3, null, null)) {
                    arrayList.add(new C1101bX(Integer.valueOf(jn2.b().l), strE3));
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = AbstractC0911Ye.r0(arrayList, new N2(17)).iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) ((C1101bX) it.next()).m);
            }
            for (String str5 : AbstractC0911Ye.x0(linkedHashSet)) {
                if (AbstractC1468fA.s(str5)) {
                    c(new RB(str5, TB.r, null, this.i, null, null, AbstractC1468fA.a(strE, str5, map), strE, 52));
                    z = true;
                }
            }
        }
        return z;
    }
}
