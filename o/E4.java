package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class E4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener l;
    public final /* synthetic */ F4 m;

    public E4(F4 f4, ViewTreeObserverOnGlobalLayoutListenerC3399z4 viewTreeObserverOnGlobalLayoutListenerC3399z4) {
        this.m = f4;
        this.l = viewTreeObserverOnGlobalLayoutListenerC3399z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.m.S.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        }
    }
}
