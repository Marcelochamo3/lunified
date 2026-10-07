package io.sentry;

import io.sentry.android.core.C0016m;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {
    public final /* synthetic */ int a;
    public final C0016m b;

    public /* synthetic */ X0(C0016m c0016m, int i) {
        this.a = i;
        this.b = c0016m;
    }

    public final W0 a(K k, SentryAndroidOptions sentryAndroidOptions) {
        switch (this.a) {
            case 0:
                io.sentry.config.a.C(k, "Hub is required");
                String strA = this.b.a();
                if (strA == null || !AbstractC0035d.b(strA, sentryAndroidOptions.getLogger())) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new W0(sentryAndroidOptions.getLogger(), strA, new C0089t(k, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), new File(strA));
            default:
                io.sentry.config.a.C(k, "Hub is required");
                String strA2 = this.b.a();
                if (strA2 == null || !AbstractC0035d.b(strA2, sentryAndroidOptions.getLogger())) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new W0(sentryAndroidOptions.getLogger(), strA2, new G0(k, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), new File(strA2));
        }
    }

    public final boolean b(String str, ILogger iLogger) {
        int i = this.a;
        return AbstractC0035d.b(str, iLogger);
    }
}
