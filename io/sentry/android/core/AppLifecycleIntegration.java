package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import io.sentry.RunnableC0059l;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppLifecycleIntegration implements InterfaceC0002a0, Closeable {
    public volatile S l;
    public SentryAndroidOptions m;
    public final G n = new G(3);

    public final void a(io.sentry.K k) {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.l = new S(k, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.m.isEnableAutoSessionTracking(), this.m.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.t.q.a(this.l);
            this.m.getLogger().h(EnumC0094u1.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            io.sentry.config.a.a(AppLifecycleIntegration.class);
        } catch (Throwable th) {
            this.l = null;
            this.m.getLogger().v(EnumC0094u1.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.l == null) {
            return;
        }
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            f();
            return;
        }
        G g = this.n;
        ((Handler) g.l).post(new RunnableC0006c(2, this));
    }

    public final void f() {
        S s = this.l;
        if (s != null) {
            ProcessLifecycleOwner.t.q.f(s);
            SentryAndroidOptions sentryAndroidOptions = this.m;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.l = null;
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        io.sentry.E e = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.m = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "enableSessionTracking enabled: %s", Boolean.valueOf(this.m.isEnableAutoSessionTracking()));
        this.m.getLogger().h(enumC0094u1, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.m.isEnableAppLifecycleBreadcrumbs()));
        if (this.m.isEnableAutoSessionTracking() || this.m.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.t;
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    a(e);
                } else {
                    ((Handler) this.n.l).post(new RunnableC0059l(this));
                }
            } catch (ClassNotFoundException e2) {
                i1.getLogger().v(EnumC0094u1.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e2);
            } catch (IllegalStateException e3) {
                i1.getLogger().v(EnumC0094u1.ERROR, "AppLifecycleIntegration could not be installed", e3);
            }
        }
    }
}
