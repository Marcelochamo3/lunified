package o;

import android.content.Context;
import android.webkit.WebView;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Tv0 extends WebView implements ly0 {
    public final py0 l;
    public final ny0 m;
    public InterfaceC0412Ey n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f546o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tv0(Context context, py0 py0Var) {
        super(context, null, 0);
        AbstractC1474fG.j(context, "context");
        this.l = py0Var;
        this.m = new ny0(this);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ny0 ny0Var = this.m;
        ny0Var.c.clear();
        ny0Var.b.removeCallbacksAndMessages(null);
        super.destroy();
    }

    public InterfaceC1739hy0 getInstance() {
        return this.m;
    }

    public Collection<AbstractC2325o0> getListeners() {
        return AbstractC0911Ye.B0(this.m.c);
    }

    public final InterfaceC1739hy0 getYoutubePlayer$core_release() {
        return this.m;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (this.f546o && (i == 8 || i == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.f546o = z;
    }
}
