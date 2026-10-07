package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.O;
import io.sentry.android.core.internal.gestures.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public final Runnable m;

    public e(Window.Callback callback, O o2) {
        super(callback);
        this.m = o2;
    }

    @Override // io.sentry.android.core.internal.gestures.h, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.m.run();
    }
}
