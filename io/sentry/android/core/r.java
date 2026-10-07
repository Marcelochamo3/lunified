package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C0050i;
import io.sentry.C0096v0;
import io.sentry.EnumC0094u1;
import io.sentry.H0;
import io.sentry.ILogger;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.m g;
    public final G l;
    public final io.sentry.T m;
    public final ILogger n;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83o = false;

    public r(String str, int i, io.sentry.android.core.internal.util.m mVar, io.sentry.T t, ILogger iLogger, G g) {
        io.sentry.config.a.C(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.config.a.C(iLogger, "Logger is required");
        this.n = iLogger;
        io.sentry.config.a.C(t, "ExecutorService is required.");
        this.m = t;
        io.sentry.config.a.C(mVar, "SentryFrameMetricsCollector is required");
        this.g = mVar;
        io.sentry.config.a.C(g, "The BuildInfoProvider is required.");
        this.l = g;
    }

    public final synchronized C0019p a(List list, boolean z) {
        if (!this.f83o) {
            this.n.h(EnumC0094u1.WARNING, "Profiler not running", new Object[0]);
            return null;
        }
        this.l.getClass();
        try {
            Debug.stopMethodTracing();
        } catch (Throwable th) {
            try {
                this.n.v(EnumC0094u1.ERROR, "Error while stopping profiling: ", th);
            } catch (Throwable th2) {
                this.f83o = false;
                throw th2;
            }
        }
        this.f83o = false;
        this.g.a(this.f);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (this.e == null) {
            this.n.h(EnumC0094u1.ERROR, "Trace file does not exists", new Object[0]);
            return null;
        }
        if (!this.i.isEmpty()) {
            this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
        }
        if (!this.j.isEmpty()) {
            this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
        }
        if (!this.h.isEmpty()) {
            this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
        }
        b(list);
        Future future = this.d;
        if (future != null) {
            future.cancel(true);
            this.d = null;
        }
        return new C0019p(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
    }

    public final void b(List list) {
        this.l.getClass();
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        H0 h0 = (H0) it.next();
                        C0050i c0050i = h0.b;
                        C0096v0 c0096v0 = h0.a;
                        if (c0050i != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c0050i.a) + jElapsedRealtimeNanos), Double.valueOf(c0050i.b)));
                        }
                        if (c0096v0 != null && c0096v0.b > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c0096v0.a) + jElapsedRealtimeNanos), Long.valueOf(c0096v0.b)));
                        }
                        if (c0096v0 != null && c0096v0.c > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c0096v0.a) + jElapsedRealtimeNanos), Long.valueOf(c0096v0.c)));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }
}
