package o;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2024kv implements InterfaceC2225my {
    public final Set l = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean m;

    @Override // o.InterfaceC2225my
    public final void e(Activity activity) {
        if (!this.m && this.l.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC1926jv(this, decorView));
        }
    }
}
