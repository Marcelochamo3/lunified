package o;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class OZ extends WebChromeClient {
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            String strMessage = consoleMessage.message();
            AbstractC1474fG.i(strMessage, "message(...)");
            if (AbstractC1119bh0.W(strMessage, "error", true)) {
                consoleMessage.message();
            } else {
                String strMessage2 = consoleMessage.message();
                AbstractC1474fG.i(strMessage2, "message(...)");
                if (AbstractC1119bh0.W(strMessage2, "exception", true)) {
                    consoleMessage.message();
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.confirm("");
        return true;
    }
}
