package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC0002a0, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application l;
    public io.sentry.K m;
    public boolean n;

    public ActivityBreadcrumbsIntegration(Application application) {
        this.l = application;
    }

    public final void a(Activity activity, String str) {
        if (this.m == null) {
            return;
        }
        C0041f c0041f = new C0041f();
        c0041f.n = "navigation";
        c0041f.b(str, "state");
        c0041f.b(activity.getClass().getSimpleName(), "screen");
        c0041f.p = "ui.lifecycle";
        c0041f.q = EnumC0094u1.INFO;
        C0104y c0104y = new C0104y();
        c0104y.c(activity, "android:activity");
        this.m.c(c0041f, c0104y);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            this.l.unregisterActivityLifecycleCallbacks(this);
            io.sentry.K k = this.m;
            if (k != null) {
                k.t().getLogger().h(EnumC0094u1.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        io.sentry.E e = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.m = e;
        this.n = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.n));
        if (this.n) {
            this.l.registerActivityLifecycleCallbacks(this);
            i1.getLogger().h(enumC0094u1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.config.a.a(ActivityBreadcrumbsIntegration.class);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        a(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        a(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        a(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        a(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        a(activity, "stopped");
    }
}
