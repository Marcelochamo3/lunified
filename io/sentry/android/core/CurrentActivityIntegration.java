package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentActivityIntegration implements InterfaceC0002a0, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application l;

    public CurrentActivityIntegration(Application application) {
        this.l = application;
    }

    public static void a(Activity activity) {
        G g = G.m;
        WeakReference weakReference = (WeakReference) g.l;
        if (weakReference == null || weakReference.get() != activity) {
            g.l = new WeakReference(activity);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.unregisterActivityLifecycleCallbacks(this);
        G.m.l = null;
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.l.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        G g = G.m;
        WeakReference weakReference = (WeakReference) g.l;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            g.l = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        G g = G.m;
        WeakReference weakReference = (WeakReference) g.l;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            g.l = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        G g = G.m;
        WeakReference weakReference = (WeakReference) g.l;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            g.l = null;
        }
    }
}
