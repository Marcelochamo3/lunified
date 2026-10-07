package o;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: o.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1972kQ implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C2070lQ l;

    public C1972kQ(C2070lQ c2070lQ) {
        this.l = c2070lQ;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.l.c();
    }
}
