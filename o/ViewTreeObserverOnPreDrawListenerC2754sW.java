package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.sW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2754sW implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View l;
    public ViewTreeObserver m;
    public final Runnable n;

    public ViewTreeObserverOnPreDrawListenerC2754sW(View view, Runnable runnable) {
        this.l = view;
        this.m = view.getViewTreeObserver();
        this.n = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC2754sW viewTreeObserverOnPreDrawListenerC2754sW = new ViewTreeObserverOnPreDrawListenerC2754sW(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2754sW);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2754sW);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.m.isAlive();
        View view = this.l;
        if (zIsAlive) {
            this.m.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.n.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.m = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.m.isAlive();
        View view2 = this.l;
        if (zIsAlive) {
            this.m.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
