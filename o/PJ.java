package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class PJ extends AbstractC2089le0 {
    public final Tv0 l;
    public final C1583gR m;
    public final C1689hZ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f454o;
    public AbstractC3226xJ p;
    public final LinkedHashSet q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PJ(Context context, py0 py0Var) {
        super(context, null, 0);
        AbstractC1474fG.j(context, "context");
        Tv0 tv0 = new Tv0(context, py0Var);
        this.l = tv0;
        Context applicationContext = context.getApplicationContext();
        AbstractC1474fG.i(applicationContext, "context.applicationContext");
        C1583gR c1583gR = new C1583gR(applicationContext);
        this.m = c1583gR;
        C1689hZ c1689hZ = new C1689hZ();
        this.n = c1689hZ;
        this.p = C2428p3.H;
        this.q = new LinkedHashSet();
        this.r = true;
        addView(tv0, new FrameLayout.LayoutParams(-1, -1));
        ny0 ny0Var = tv0.m;
        ny0Var.c.add(c1689hZ);
        ny0Var.c.add(new NJ(0, this));
        ny0Var.c.add(new NJ(1, this));
        ((ArrayList) c1583gR.n).add(new OJ(this));
    }

    public final boolean getCanPlay$core_release() {
        return this.r;
    }

    public final Tv0 getWebViewYouTubePlayer$core_release() {
        return this.l;
    }

    public final void setCustomPlayerUi(View view) {
        AbstractC1474fG.j(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.f454o = z;
    }
}
