package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.android.core.G;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnDrawListener {
    public final Handler l = new Handler(Looper.getMainLooper());
    public final AtomicReference m;
    public final Runnable n;

    public g(View view, Runnable runnable) {
        this.m = new AtomicReference(view);
        this.n = runnable;
    }

    public static void a(View view, Runnable runnable, G g) {
        g gVar = new g(view, runnable);
        g.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(gVar);
        } else {
            view.addOnAttachStateChangeListener(new f(gVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.m.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                g gVar = this.l;
                gVar.getClass();
                view.getViewTreeObserver().removeOnDrawListener(gVar);
            }
        });
        this.l.postAtFrontOfQueue(this.n);
    }
}
