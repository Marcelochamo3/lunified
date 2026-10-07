package io.sentry.android.core;

import android.content.Context;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AnrIntegration implements InterfaceC0002a0, Closeable {
    public static C0004a p;
    public static final Object q = new Object();
    public final Context l;
    public boolean m = false;
    public final Object n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I1 f58o;

    public AnrIntegration(Context context) {
        this.l = context;
    }

    public final void a(io.sentry.K k, SentryAndroidOptions sentryAndroidOptions) {
        synchronized (q) {
            try {
                if (p == null) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
                    logger.h(enumC0094u1, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C0004a c0004a = new C0004a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C0011h(this, k, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.l);
                    p = c0004a;
                    c0004a.start();
                    sentryAndroidOptions.getLogger().h(enumC0094u1, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.n) {
            this.m = true;
        }
        synchronized (q) {
            try {
                C0004a c0004a = p;
                if (c0004a != null) {
                    c0004a.interrupt();
                    p = null;
                    I1 i1 = this.f58o;
                    if (i1 != null) {
                        i1.getLogger().h(EnumC0094u1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.f58o = i1;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) i1;
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.config.a.a(AnrIntegration.class);
            try {
                sentryAndroidOptions.getExecutorService().submit(new Z(this, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}
