package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import io.sentry.Y1;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class UserInteractionIntegration implements InterfaceC0002a0, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application l;
    public io.sentry.K m;
    public SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f70o = W.a("androidx.core.view.GestureDetectorCompat", this.n);

    public UserInteractionIntegration(Application application) {
        this.l = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        io.sentry.E e = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        this.m = e;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.n.isEnableUserInteractionTracing();
        ILogger logger = this.n.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.f70o) {
                i1.getLogger().h(EnumC0094u1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.l.registerActivityLifecycleCallbacks(this);
            this.n.getLogger().h(enumC0094u1, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.config.a.a(UserInteractionIntegration.class);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.n;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) callback;
            gVar.n.e(Y1.CANCELLED);
            Window.Callback callback2 = gVar.m;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.n;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.m == null || this.n == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.g(callback, activity, new io.sentry.android.core.internal.gestures.f(activity, this.m, this.n), this.n));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
