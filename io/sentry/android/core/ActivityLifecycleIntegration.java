package io.sentry.android.core;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.AbstractC0049h1;
import io.sentry.C0042f0;
import io.sentry.C0100w1;
import io.sentry.C0101x;
import io.sentry.D0;
import io.sentry.EnumC0093u0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import io.sentry.L0;
import io.sentry.Y1;
import io.sentry.e2;
import io.sentry.f2;
import io.sentry.g2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.C0633Nm;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements InterfaceC0002a0, Closeable, Application.ActivityLifecycleCallbacks {
    public final L0 B;
    public final Application l;
    public final G m;
    public io.sentry.K n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SentryAndroidOptions f57o;
    public final boolean r;
    public io.sentry.V u;
    public boolean p = false;
    public boolean q = false;
    public boolean s = false;
    public C0101x t = null;
    public final WeakHashMap v = new WeakHashMap();
    public final WeakHashMap w = new WeakHashMap();
    public AbstractC0049h1 x = AbstractC0013j.a.y();
    public final Handler y = new Handler(Looper.getMainLooper());
    public Future z = null;
    public final WeakHashMap A = new WeakHashMap();

    public ActivityLifecycleIntegration(Application application, G g, L0 l0) {
        this.l = application;
        this.m = g;
        this.B = l0;
        if (Build.VERSION.SDK_INT >= 29) {
            this.r = true;
        }
    }

    public static void f(io.sentry.V v, io.sentry.V v2) {
        if (v == null || v.d()) {
            return;
        }
        String description = v.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = v.getDescription() + " - Deadline Exceeded";
        }
        v.c(description);
        AbstractC0049h1 abstractC0049h1N = v2 != null ? v2.n() : null;
        if (abstractC0049h1N == null) {
            abstractC0049h1N = v.t();
        }
        i(v, abstractC0049h1N, Y1.DEADLINE_EXCEEDED);
    }

    public static void i(io.sentry.V v, AbstractC0049h1 abstractC0049h1, Y1 y1) {
        if (v == null || v.d()) {
            return;
        }
        if (y1 == null) {
            y1 = v.m() != null ? v.m() : Y1.OK;
        }
        v.o(y1, abstractC0049h1);
    }

    public final void a() {
        C0100w1 c0100w1;
        io.sentry.android.core.performance.d dVarB = io.sentry.android.core.performance.c.c().b(this.f57o);
        if (dVarB.b()) {
            long j = 0;
            if (dVarB.a()) {
                j = (dVarB.b() ? dVarB.f82o - dVarB.n : 0L) + dVarB.m;
            }
            c0100w1 = new C0100w1(j * 1000000);
        } else {
            c0100w1 = null;
        }
        if (!this.p || c0100w1 == null) {
            return;
        }
        i(this.u, c0100w1, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f57o;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        L0 l0 = this.B;
        synchronized (l0) {
            try {
                if (l0.n()) {
                    l0.q(new RunnableC0006c(0, l0), "FrameMetricsAggregator.stop");
                    ((FrameMetricsAggregator) l0.a).a.F();
                }
                ((ConcurrentHashMap) l0.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        io.sentry.E e = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f57o = sentryAndroidOptions;
        this.n = e;
        this.p = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.t = this.f57o.getFullyDisplayedReporter();
        this.q = this.f57o.isEnableTimeToFullDisplayTracing();
        this.l.registerActivityLifecycleCallbacks(this);
        this.f57o.getLogger().h(EnumC0094u1.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.config.a.a(ActivityLifecycleIntegration.class);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        SentryAndroidOptions sentryAndroidOptions;
        SentryAndroidOptions sentryAndroidOptions2;
        try {
            if (!this.s && (sentryAndroidOptions2 = this.f57o) != null && !sentryAndroidOptions2.isEnablePerformanceV2()) {
                io.sentry.android.core.performance.c.c().a = bundle == null ? io.sentry.android.core.performance.b.COLD : io.sentry.android.core.performance.b.WARM;
            }
            if (this.n != null && (sentryAndroidOptions = this.f57o) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.n.m(new C0008e(0, io.sentry.config.a.i(activity)));
            }
            t(activity);
            this.s = true;
            C0101x c0101x = this.t;
            if (c0101x != null) {
                c0101x.a.add(new C0633Nm(0));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (this.p) {
                io.sentry.V v = this.u;
                Y1 y1 = Y1.CANCELLED;
                if (v != null && !v.d()) {
                    v.l(y1);
                }
                io.sentry.V v2 = (io.sentry.V) this.v.get(activity);
                io.sentry.V v3 = (io.sentry.V) this.w.get(activity);
                Y1 y2 = Y1.DEADLINE_EXCEEDED;
                if (v2 != null && !v2.d()) {
                    v2.l(y2);
                }
                f(v3, v2);
                Future future = this.z;
                if (future != null) {
                    future.cancel(false);
                    this.z = null;
                }
                if (this.p) {
                    p((io.sentry.W) this.A.get(activity), null, null);
                }
                this.u = null;
                this.v.remove(activity);
                this.w.remove(activity);
            }
            this.A.remove(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        try {
            if (!this.r) {
                this.s = true;
                io.sentry.K k = this.n;
                if (k == null) {
                    this.x = AbstractC0013j.a.y();
                } else {
                    this.x = k.t().getDateProvider().y();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (this.r) {
            this.s = true;
            io.sentry.K k = this.n;
            if (k == null) {
                this.x = AbstractC0013j.a.y();
            } else {
                this.x = k.t().getDateProvider().y();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.p) {
                io.sentry.V v = (io.sentry.V) this.v.get(activity);
                io.sentry.V v2 = (io.sentry.V) this.w.get(activity);
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    io.sentry.android.core.internal.util.g.a(viewFindViewById, new RunnableC0009f(this, v2, v, 0), this.m);
                } else {
                    this.y.post(new RunnableC0009f(this, v2, v, 1));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.p) {
            this.B.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
    }

    public final void p(io.sentry.W w, io.sentry.V v, io.sentry.V v2) {
        if (w == null || w.d()) {
            return;
        }
        Y1 y1 = Y1.DEADLINE_EXCEEDED;
        if (v != null && !v.d()) {
            v.l(y1);
        }
        f(v2, v);
        Future future = this.z;
        if (future != null) {
            future.cancel(false);
            this.z = null;
        }
        Y1 y1M = w.m();
        if (y1M == null) {
            y1M = Y1.OK;
        }
        w.l(y1M);
        io.sentry.K k = this.n;
        if (k != null) {
            k.m(new C0010g(this, w, 0));
        }
    }

    public final void q(io.sentry.V v, io.sentry.V v2) {
        io.sentry.android.core.performance.c cVarC = io.sentry.android.core.performance.c.c();
        io.sentry.android.core.performance.d dVar = cVarC.b;
        if (dVar.a() && dVar.f82o == 0) {
            dVar.d();
        }
        io.sentry.android.core.performance.d dVar2 = cVarC.c;
        if (dVar2.a() && dVar2.f82o == 0) {
            dVar2.d();
        }
        a();
        SentryAndroidOptions sentryAndroidOptions = this.f57o;
        if (sentryAndroidOptions == null || v2 == null) {
            if (v2 == null || v2.d()) {
                return;
            }
            v2.q();
            return;
        }
        AbstractC0049h1 abstractC0049h1Y = sentryAndroidOptions.getDateProvider().y();
        long millis = TimeUnit.NANOSECONDS.toMillis(abstractC0049h1Y.b(v2.t()));
        Long lValueOf = Long.valueOf(millis);
        EnumC0093u0 enumC0093u0 = EnumC0093u0.MILLISECOND;
        v2.j("time_to_initial_display", lValueOf, enumC0093u0);
        if (v != null && v.d()) {
            v.g(abstractC0049h1Y);
            v2.j("time_to_full_display", Long.valueOf(millis), enumC0093u0);
        }
        i(v2, abstractC0049h1Y, null);
    }

    public final void t(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        boolean z;
        Boolean boolValueOf;
        C0100w1 c0100w1;
        AbstractC0049h1 abstractC0049h1;
        WeakReference weakReference = new WeakReference(activity);
        if (this.n != null) {
            WeakHashMap weakHashMap3 = this.A;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.p) {
                weakHashMap3.put(activity, D0.a);
                this.n.m(new C0042f0(5));
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.w;
                weakHashMap2 = this.v;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                p((io.sentry.W) entry.getValue(), (io.sentry.V) weakHashMap2.get(entry.getKey()), (io.sentry.V) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.d dVarB = io.sentry.android.core.performance.c.c().b(this.f57o);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                z = runningAppProcessInfo.importance == 100;
            } catch (Throwable unused) {
            }
            e2 e2Var = null;
            if (z && dVarB.a()) {
                c0100w1 = dVarB.a() ? new C0100w1(dVarB.m * 1000000) : null;
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.c.c().a == io.sentry.android.core.performance.b.COLD);
            } else {
                boolValueOf = null;
                c0100w1 = null;
            }
            g2 g2Var = new g2();
            g2Var.f = 30000L;
            if (this.f57o.isEnableActivityLifecycleTracingAutoFinish()) {
                g2Var.e = this.f57o.getIdleTimeout();
                g2Var.a = true;
            }
            g2Var.d = true;
            g2Var.g = new C0011h(this, weakReference, simpleName);
            if (this.s || c0100w1 == null || boolValueOf == null) {
                abstractC0049h1 = this.x;
            } else {
                e2 e2Var2 = io.sentry.android.core.performance.c.c().h;
                io.sentry.android.core.performance.c.c().h = null;
                e2Var = e2Var2;
                abstractC0049h1 = c0100w1;
            }
            g2Var.b = abstractC0049h1;
            g2Var.c = e2Var != null;
            io.sentry.W wK = this.n.k(new f2(simpleName, io.sentry.protocol.C.COMPONENT, "ui.load", e2Var), g2Var);
            if (wK != null) {
                wK.k().t = "auto.ui.activity";
            }
            if (!this.s && c0100w1 != null && boolValueOf != null) {
                io.sentry.V vP = wK.p(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", c0100w1, io.sentry.Z.SENTRY);
                this.u = vP;
                vP.k().t = "auto.ui.activity";
                a();
            }
            String strConcat = simpleName.concat(" initial display");
            io.sentry.Z z2 = io.sentry.Z.SENTRY;
            io.sentry.V vP2 = wK.p("ui.load.initial_display", strConcat, abstractC0049h1, z2);
            weakHashMap2.put(activity, vP2);
            vP2.k().t = "auto.ui.activity";
            if (this.q && this.t != null && this.f57o != null) {
                io.sentry.V vP3 = wK.p("ui.load.full_display", simpleName.concat(" full display"), abstractC0049h1, z2);
                vP3.k().t = "auto.ui.activity";
                try {
                    weakHashMap.put(activity, vP3);
                    this.z = this.f57o.getExecutorService().u(new RunnableC0009f(this, vP3, vP2, 2), 30000L);
                } catch (RejectedExecutionException e) {
                    this.f57o.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            this.n.m(new C0010g(this, wK, 1));
            weakHashMap3.put(activity, wK);
        }
    }
}
