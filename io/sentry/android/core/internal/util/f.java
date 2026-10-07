package io.sentry.android.core.internal.util;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {
    public final /* synthetic */ g l;

    public f(g gVar) {
        this.l = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.l);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
