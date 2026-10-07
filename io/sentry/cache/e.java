package io.sentry.cache;

import io.sentry.I1;
import io.sentry.M;
import io.sentry.android.core.SentryAndroidOptions;

/* JADX INFO: loaded from: classes.dex */
public final class e implements M {
    public final I1 a;

    public e(I1 i1) {
        this.a = i1;
    }

    public static Object a(SentryAndroidOptions sentryAndroidOptions, String str, Class cls) {
        return a.b(sentryAndroidOptions, ".options-cache", str, cls, null);
    }

    public final void b(Object obj, String str) {
        a.c(this.a, obj, ".options-cache", str);
    }
}
