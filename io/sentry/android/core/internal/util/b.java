package io.sentry.android.core.internal.util;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements io.sentry.transport.f, io.sentry.util.thread.a {
    public static final b l = new b();
    public static final b m = new b();

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    @Override // io.sentry.transport.f
    public long b() {
        return SystemClock.uptimeMillis();
    }
}
