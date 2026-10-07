package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.RunnableC0059l;
import io.sentry.android.core.G;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int A = 0;
    public static final long y = TimeUnit.SECONDS.toNanos(1);
    public static final long z = TimeUnit.MILLISECONDS.toNanos(700);
    public final G l;
    public final CopyOnWriteArraySet m;
    public final ILogger n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f80o;
    public WeakReference p;
    public final ConcurrentHashMap q;
    public final boolean r;
    public final b s;
    public final j t;
    public Choreographer u;
    public final Field v;
    public long w;
    public long x;

    /* JADX WARN: Type inference failed for: r4v4, types: [io.sentry.android.core.internal.util.j] */
    public m(Context context, final ILogger iLogger, final G g) {
        b bVar = new b();
        this.m = new CopyOnWriteArraySet();
        this.q = new ConcurrentHashMap();
        this.r = false;
        this.w = 0L;
        this.x = 0L;
        io.sentry.config.a.C(context, "The context is required");
        io.sentry.config.a.C(iLogger, "Logger is required");
        this.n = iLogger;
        io.sentry.config.a.C(g, "BuildInfoProvider is required");
        this.l = g;
        this.s = bVar;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.r = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.m");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.k
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    iLogger.v(EnumC0094u1.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f80o = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new RunnableC0059l(this, 8, iLogger));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.v = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                iLogger.v(EnumC0094u1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.t = new Window$OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.j
                /* JADX WARN: Code duplicated, block: B:17:0x007e  */
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    long jLongValue;
                    Field field;
                    m mVar = this.a;
                    G g2 = g;
                    mVar.getClass();
                    long jNanoTime = System.nanoTime();
                    g2.getClass();
                    int i2 = Build.VERSION.SDK_INT;
                    float refreshRate = i2 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    float f = m.y;
                    long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                    long jMax = Math.max(0L, metric - ((long) (f / refreshRate)));
                    mVar.l.getClass();
                    if (i2 >= 26) {
                        jLongValue = frameMetrics.getMetric(10);
                    } else {
                        Choreographer choreographer = mVar.u;
                        if (choreographer == null || (field = mVar.v) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) field.get(choreographer);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                    }
                    if (jLongValue < 0) {
                        jLongValue = jNanoTime - metric;
                    }
                    long jMax2 = Math.max(jLongValue, mVar.x);
                    if (jMax2 == mVar.w) {
                        return;
                    }
                    mVar.w = jMax2;
                    mVar.x = jMax2 + metric;
                    boolean z2 = metric > ((long) (f / (refreshRate - 1.0f)));
                    boolean z3 = z2 && metric > m.z;
                    Iterator it = mVar.q.values().iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).c(jMax2, mVar.x, metric, jMax, z2, z3, refreshRate);
                    }
                }
            };
        }
    }

    public final void a(String str) {
        if (this.r) {
            ConcurrentHashMap concurrentHashMap = this.q;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.p;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            b(window);
        }
    }

    public final void b(Window window) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.m;
        if (copyOnWriteArraySet.contains(window)) {
            this.l.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    b bVar = this.s;
                    j jVar = this.t;
                    bVar.getClass();
                    window.removeOnFrameMetricsAvailableListener(jVar);
                } catch (Exception e) {
                    this.n.v(EnumC0094u1.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            copyOnWriteArraySet.remove(window);
        }
    }

    public final void c() {
        Handler handler;
        WeakReference weakReference = this.p;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.r) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.m;
        if (copyOnWriteArraySet.contains(window) || this.q.isEmpty()) {
            return;
        }
        this.l.getClass();
        if (Build.VERSION.SDK_INT < 24 || (handler = this.f80o) == null) {
            return;
        }
        copyOnWriteArraySet.add(window);
        j jVar = this.t;
        this.s.getClass();
        window.addOnFrameMetricsAvailableListener(jVar, handler);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() != window) {
            this.p = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        b(activity.getWindow());
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.p = null;
    }
}
