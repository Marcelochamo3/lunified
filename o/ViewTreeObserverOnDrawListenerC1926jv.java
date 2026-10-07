package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: o.jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1926jv implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View l;
    public final /* synthetic */ C2024kv m;

    public ViewTreeObserverOnDrawListenerC1926jv(C2024kv c2024kv, View view) {
        this.m = c2024kv;
        this.l = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Kr0.f().post(new RunnableC1938k1(this, 5, this));
    }
}
