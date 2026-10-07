package o;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ny0 implements InterfaceC1739hy0 {
    public final WebView a;
    public final Handler b;
    public final LinkedHashSet c;

    public ny0(WebView webView) {
        AbstractC1474fG.j(webView, "webView");
        this.a = webView;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new LinkedHashSet();
    }

    public final void a(WebView webView, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? "'" + obj + '\'' : obj.toString());
        }
        this.b.post(new RunnableC1169c7(webView, str, arrayList, 12));
    }
}
