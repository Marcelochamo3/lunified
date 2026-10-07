package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: o.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1060b1 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ ActionBarOverlayLayout m;

    public /* synthetic */ RunnableC1060b1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.l = i;
        this.m = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.m;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.H = actionBarOverlayLayout.f7o.animate().translationY(0.0f).setListener(actionBarOverlayLayout.I);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.m;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.H = actionBarOverlayLayout2.f7o.animate().translationY(-actionBarOverlayLayout2.f7o.getHeight()).setListener(actionBarOverlayLayout2.I);
                break;
        }
    }
}
