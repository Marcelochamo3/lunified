package o;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.yv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3383yv0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ AtomicBoolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ WebView f1140o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3383yv0(AtomicBoolean atomicBoolean, WebView webView, int i) {
        super(0);
        this.m = i;
        this.n = atomicBoolean;
        this.f1140o = webView;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                if (!this.n.get()) {
                    System.out.getClass();
                    this.f1140o.evaluateJavascript("(function() {\n    try {\n        // 1. Selectores CSS clásicos de reproductores\n        var sel = 'button[class*=\"play\"], div[class*=\"play\"], #player-button, [id*=\"player-button\"], .vjs-big-play-button, .plyr__control--overlaid, [aria-label*=\"Play\"], .btn-md, .btn-warning, [onclick*=\"play\"]';\n        // 2. Selectores de sitios live-sports (live-box-btn, live-stream, watch-btn)\n        sel += ', [class*=\"live-box\"], [class*=\"liveBox\"], [class*=\"live-stream\"], [class*=\"liveStream\"], [class*=\"watch-btn\"], [class*=\"watchBtn\"]';\n        var playButtons = document.querySelectorAll(sel);\n        console.log('Found ' + playButtons.length + ' play buttons (CSS)');\n        for (var i = 0; i < playButtons.length; i++) {\n            if (playButtons[i].offsetParent !== null) playButtons[i].click();\n        }\n\n        // 3. Buscar por texto visible (covers sites without known classes)\n        var textClicked = 0;\n        document.querySelectorAll('button, a, span, div').forEach(function(el) {\n            if (el.children.length > 0 || el.offsetParent === null) return;\n            var t = (el.textContent || '').trim();\n            if (/^(ver|watch|live|play|stream|en vivo|go live|directo)$/i.test(t)) {\n                el.click(); textClicked++;\n                console.log('Text-clicked:', t);\n            }\n        });\n\n        // 4. Intentar iniciar video directamente\n        var videos = document.querySelectorAll('video');\n        for (var i = 0; i < videos.length; i++) {\n            videos[i].play().catch(function(e) {});\n        }\n\n        return 'CSS:' + playButtons.length + ' Text:' + textClicked + ' Videos:' + videos.length;\n    } catch(e) {\n        return 'Error: ' + e.message;\n    }\n})();", C3286xv0.b);
                }
                break;
            default:
                if (!this.n.get()) {
                    System.out.getClass();
                    this.f1140o.evaluateJavascript("(function() {\n    try {\n        // 1. Selectores CSS clásicos de reproductores\n        var sel = 'button[class*=\"play\"], div[class*=\"play\"], #player-button, [id*=\"player-button\"], .vjs-big-play-button, .plyr__control--overlaid, [aria-label*=\"Play\"], .btn-md, .btn-warning, [onclick*=\"play\"]';\n        // 2. Selectores de sitios live-sports (live-box-btn, live-stream, watch-btn)\n        sel += ', [class*=\"live-box\"], [class*=\"liveBox\"], [class*=\"live-stream\"], [class*=\"liveStream\"], [class*=\"watch-btn\"], [class*=\"watchBtn\"]';\n        var playButtons = document.querySelectorAll(sel);\n        console.log('Found ' + playButtons.length + ' play buttons (CSS)');\n        for (var i = 0; i < playButtons.length; i++) {\n            if (playButtons[i].offsetParent !== null) playButtons[i].click();\n        }\n\n        // 3. Buscar por texto visible (covers sites without known classes)\n        var textClicked = 0;\n        document.querySelectorAll('button, a, span, div').forEach(function(el) {\n            if (el.children.length > 0 || el.offsetParent === null) return;\n            var t = (el.textContent || '').trim();\n            if (/^(ver|watch|live|play|stream|en vivo|go live|directo)$/i.test(t)) {\n                el.click(); textClicked++;\n                console.log('Text-clicked:', t);\n            }\n        });\n\n        // 4. Intentar iniciar video directamente\n        var videos = document.querySelectorAll('video');\n        for (var i = 0; i < videos.length; i++) {\n            videos[i].play().catch(function(e) {});\n        }\n\n        return 'CSS:' + playButtons.length + ' Text:' + textClicked + ' Videos:' + videos.length;\n    } catch(e) {\n        return 'Error: ' + e.message;\n    }\n})();", C3286xv0.c);
                }
                break;
        }
        return C2985uq0.a;
    }
}
