package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o.lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2126lx implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C0670Ox l;
    public final /* synthetic */ LayoutInflaterFactory2C2223mx m;

    public ViewOnAttachStateChangeListenerC2126lx(LayoutInflaterFactory2C2223mx layoutInflaterFactory2C2223mx, C0670Ox c0670Ox) {
        this.m = layoutInflaterFactory2C2223mx;
        this.l = c0670Ox;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0670Ox c0670Ox = this.l;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
        c0670Ox.k();
        C0581Ll.i((ViewGroup) abstractComponentCallbacksC1247cx.S.getParent(), this.m.l).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
