package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.X;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final long i = SystemClock.uptimeMillis();
    public static volatile c j;
    public b a = b.UNKNOWN;
    public X g = null;
    public e2 h = null;
    public final d b = new d();
    public final d c = new d();
    public final d d = new d();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();

    public static c c() {
        if (j == null) {
            synchronized (c.class) {
                try {
                    if (j == null) {
                        j = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public final X a() {
        return this.g;
    }

    public final d b(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            d dVar = this.b;
            if (dVar.a()) {
                return dVar;
            }
        }
        return this.c;
    }

    public final void d() {
        this.g = null;
    }
}
