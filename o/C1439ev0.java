package o;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: o.ev0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439ev0 {
    public final /* synthetic */ C1829iv0 a;
    public final /* synthetic */ InterfaceC0471Hf b;

    public C1439ev0(C1829iv0 c1829iv0, C0497If c0497If) {
        AbstractC1474fG.j(c1829iv0, "this$0");
        this.a = c1829iv0;
        this.b = c0497If;
    }

    @JavascriptInterface
    public final void onM3u8Found(String str) {
        AbstractC1474fG.j(str, "url");
        C1733hv0.w(this.a, this.b, str, null, C1330dq.l);
    }
}
