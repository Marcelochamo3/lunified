package o;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes.dex */
public final class Sv0 extends WebChromeClient {
    public final /* synthetic */ Tv0 a;

    public Sv0(Tv0 tv0) {
        this.a = tv0;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        this.a.l.b();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC1474fG.j(view, "view");
        AbstractC1474fG.j(customViewCallback, "callback");
        super.onShowCustomView(view, customViewCallback);
        this.a.l.a(view, new io.sentry.android.replay.f(26, customViewCallback));
    }
}
