package o;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class my0 {
    public final ly0 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public my0(Tv0 tv0) {
        this.a = tv0;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.b.post(new RunnableC1933jy0(this, 2));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        AbstractC1474fG.j(str, "error");
        int i = 1;
        if (AbstractC1899jh0.N(str, "2", true)) {
            i = 2;
        } else if (AbstractC1899jh0.N(str, "5", true)) {
            i = 3;
        } else if (AbstractC1899jh0.N(str, "100", true)) {
            i = 4;
        } else if (AbstractC1899jh0.N(str, "101", true) || AbstractC1899jh0.N(str, "150", true)) {
            i = 5;
        }
        this.b.post(new RunnableC2031ky0(this, i, 2));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        AbstractC1474fG.j(str, "quality");
        int i = 1;
        if (AbstractC1899jh0.N(str, "small", true)) {
            i = 2;
        } else if (AbstractC1899jh0.N(str, "medium", true)) {
            i = 3;
        } else if (AbstractC1899jh0.N(str, "large", true)) {
            i = 4;
        } else if (AbstractC1899jh0.N(str, "hd720", true)) {
            i = 5;
        } else if (AbstractC1899jh0.N(str, "hd1080", true)) {
            i = 6;
        } else if (AbstractC1899jh0.N(str, "highres", true)) {
            i = 7;
        } else if (AbstractC1899jh0.N(str, "default", true)) {
            i = 8;
        }
        this.b.post(new RunnableC2031ky0(this, i, 0));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        AbstractC1474fG.j(str, "rate");
        int i = 1;
        if (AbstractC1899jh0.N(str, "0.25", true)) {
            i = 2;
        } else if (AbstractC1899jh0.N(str, "0.5", true)) {
            i = 3;
        } else if (AbstractC1899jh0.N(str, "1", true)) {
            i = 4;
        } else if (AbstractC1899jh0.N(str, "1.5", true)) {
            i = 5;
        } else if (AbstractC1899jh0.N(str, "2", true)) {
            i = 6;
        }
        this.b.post(new RunnableC2031ky0(this, i, 1));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.b.post(new RunnableC1933jy0(this, 3));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        AbstractC1474fG.j(str, "state");
        int i = 1;
        if (AbstractC1899jh0.N(str, "UNSTARTED", true)) {
            i = 2;
        } else if (AbstractC1899jh0.N(str, "ENDED", true)) {
            i = 3;
        } else if (AbstractC1899jh0.N(str, "PLAYING", true)) {
            i = 4;
        } else if (AbstractC1899jh0.N(str, "PAUSED", true)) {
            i = 5;
        } else if (AbstractC1899jh0.N(str, "BUFFERING", true)) {
            i = 6;
        } else if (AbstractC1899jh0.N(str, "CUED", true)) {
            i = 7;
        }
        this.b.post(new RunnableC2031ky0(this, i, 3));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        AbstractC1474fG.j(str, "seconds");
        try {
            final float f = Float.parseFloat(str);
            this.b.post(new Runnable() { // from class: o.iy0
                @Override // java.lang.Runnable
                public final void run() {
                    my0 my0Var = this.l;
                    AbstractC1474fG.j(my0Var, "this$0");
                    Tv0 tv0 = (Tv0) my0Var.a;
                    Iterator<T> it = tv0.getListeners().iterator();
                    while (it.hasNext()) {
                        ((AbstractC2325o0) it.next()).a(tv0.getInstance(), f);
                    }
                }
            });
        } catch (NumberFormatException unused) {
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        AbstractC1474fG.j(str, "seconds");
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.b.post(new RunnableC1933jy0(this, Float.parseFloat(str), 1));
        } catch (NumberFormatException unused) {
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(String str) {
        AbstractC1474fG.j(str, "videoId");
        return this.b.post(new O3(this, 24, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        AbstractC1474fG.j(str, "fraction");
        try {
            this.b.post(new RunnableC1933jy0(this, Float.parseFloat(str), 4));
        } catch (NumberFormatException unused) {
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.b.post(new RunnableC1933jy0(this, 0));
    }
}
