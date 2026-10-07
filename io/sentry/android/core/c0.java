package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import io.sentry.A0;
import io.sentry.RunnableC0059l;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Application.ActivityLifecycleCallbacks {
    public final WeakHashMap l = new WeakHashMap();
    public final /* synthetic */ io.sentry.android.core.performance.c m;
    public final /* synthetic */ AtomicBoolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SentryPerformanceProvider f73o;

    public c0(SentryPerformanceProvider sentryPerformanceProvider, io.sentry.android.core.performance.c cVar, AtomicBoolean atomicBoolean) {
        this.f73o = sentryPerformanceProvider;
        this.m = cVar;
        this.n = atomicBoolean;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.c cVar = this.m;
        if (cVar.a == io.sentry.android.core.performance.b.UNKNOWN) {
            cVar.a = bundle == null ? io.sentry.android.core.performance.b.COLD : io.sentry.android.core.performance.b.WARM;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.l.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.a aVar;
        if (this.m.b.b() || (aVar = (io.sentry.android.core.performance.a) this.l.get(activity)) == null) {
            return;
        }
        io.sentry.android.core.performance.d dVar = aVar.l;
        dVar.d();
        dVar.l = activity.getClass().getName().concat(".onCreate");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.l.remove(activity);
        io.sentry.android.core.performance.c cVar = this.m;
        if (cVar.b.b() || aVar == null) {
            return;
        }
        io.sentry.android.core.performance.d dVar = aVar.m;
        dVar.d();
        dVar.l = activity.getClass().getName().concat(".onStart");
        cVar.f.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.m.b.b()) {
            return;
        }
        io.sentry.android.core.performance.a aVar = new io.sentry.android.core.performance.a();
        aVar.l.c(jUptimeMillis);
        this.l.put(activity, aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.a aVar;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.m.b.b() || (aVar = (io.sentry.android.core.performance.a) this.l.get(activity)) == null) {
            return;
        }
        aVar.m.c(jUptimeMillis);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AtomicBoolean atomicBoolean = this.n;
        if (atomicBoolean.get()) {
            return;
        }
        RunnableC0059l runnableC0059l = new RunnableC0059l(this, 6, atomicBoolean);
        G g = new G(A0.l);
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                io.sentry.android.core.internal.util.g.a(viewPeekDecorView, runnableC0059l, g);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.e(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new O(window, callback, runnableC0059l, g, 1)));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
