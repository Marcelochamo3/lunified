package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C0096v0;
import io.sentry.H0;

/* JADX INFO: renamed from: io.sentry.android.core.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0015l implements io.sentry.P {
    @Override // io.sentry.P
    public final void a(H0 h0) {
        h0.a = new C0096v0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize());
    }

    @Override // io.sentry.P
    public final void b() {
    }
}
