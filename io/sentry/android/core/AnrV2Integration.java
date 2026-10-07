package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements InterfaceC0002a0, Closeable {
    public static final long n = TimeUnit.DAYS.toMillis(91);
    public final Context l;
    public SentryAndroidOptions m;

    public AnrV2Integration(Context context) {
        this.l = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.m = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.m.isAnrEnabled()));
        if (this.m.getCacheDirPath() == null) {
            this.m.getLogger().h(EnumC0094u1.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.m.isAnrEnabled()) {
            try {
                i1.getExecutorService().submit(new RunnableC0027y(this.l, this.m));
            } catch (Throwable th) {
                i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to start AnrProcessor.", th);
            }
            i1.getLogger().h(EnumC0094u1.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.config.a.a(getClass());
        }
    }
}
