package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC0031b1;
import io.sentry.CallableC0107z;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.J0;
import io.sentry.K0;
import io.sentry.Q1;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.core.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021s implements io.sentry.X {
    public final Context l;
    public final ILogger m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f84o;
    public final int p;
    public final io.sentry.T q;
    public final G r;
    public boolean s;
    public int t;
    public final io.sentry.android.core.internal.util.m u;
    public K0 v;
    public r w;
    public long x;
    public long y;
    public Date z;

    public C0021s(Context context, SentryAndroidOptions sentryAndroidOptions, G g, io.sentry.android.core.internal.util.m mVar) {
        this(context, g, mVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    public final void a() {
        if (this.s) {
            return;
        }
        this.s = true;
        boolean z = this.f84o;
        ILogger iLogger = this.m;
        if (!z) {
            iLogger.h(EnumC0094u1.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.n;
        if (str == null) {
            iLogger.h(EnumC0094u1.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.p;
        if (i <= 0) {
            iLogger.h(EnumC0094u1.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.w = new r(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i, this.u, this.q, this.m, this.r);
        }
    }

    public final boolean b() {
        C0020q c0020q;
        String string;
        r rVar = this.w;
        if (rVar == null) {
            return false;
        }
        synchronized (rVar) {
            try {
                int i = rVar.c;
                c0020q = null;
                if (i == 0) {
                    rVar.n.h(EnumC0094u1.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                } else if (rVar.f83o) {
                    rVar.n.h(EnumC0094u1.WARNING, "Profiling has already started...", new Object[0]);
                } else {
                    rVar.l.getClass();
                    rVar.e = new File(rVar.b, UUID.randomUUID() + ".trace");
                    rVar.k.clear();
                    rVar.h.clear();
                    rVar.i.clear();
                    rVar.j.clear();
                    io.sentry.android.core.internal.util.m mVar = rVar.g;
                    C0018o c0018o = new C0018o(rVar);
                    if (mVar.r) {
                        string = UUID.randomUUID().toString();
                        mVar.q.put(string, c0018o);
                        mVar.c();
                    } else {
                        string = null;
                    }
                    rVar.f = string;
                    try {
                        rVar.d = rVar.m.u(new RunnableC0006c(1, rVar), 30000L);
                    } catch (RejectedExecutionException e) {
                        rVar.n.v(EnumC0094u1.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
                    }
                    rVar.a = SystemClock.elapsedRealtimeNanos();
                    Date dateJ = io.sentry.config.a.j();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    try {
                        Debug.startMethodTracingSampling(rVar.e.getPath(), 3000000, rVar.c);
                        rVar.f83o = true;
                        c0020q = new C0020q(rVar.a, elapsedCpuTime, dateJ);
                    } catch (Throwable th) {
                        rVar.a(null, false);
                        rVar.n.v(EnumC0094u1.ERROR, "Unable to start a profile: ", th);
                        rVar.f83o = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0020q == null) {
            return false;
        }
        this.x = c0020q.a;
        this.y = c0020q.b;
        this.z = (Date) c0020q.c;
        return true;
    }

    @Override // io.sentry.X
    public final synchronized void c(Q1 q1) {
        if (this.t > 0 && this.v == null) {
            this.v = new K0(q1, Long.valueOf(this.x), Long.valueOf(this.y));
        }
    }

    @Override // io.sentry.X
    public final void close() {
        K0 k0 = this.v;
        if (k0 != null) {
            d(k0.n, k0.l, k0.m, true, null, AbstractC0031b1.d().t());
        } else {
            int i = this.t;
            if (i != 0) {
                this.t = i - 1;
            }
        }
        r rVar = this.w;
        if (rVar != null) {
            synchronized (rVar) {
                try {
                    Future future = rVar.d;
                    if (future != null) {
                        future.cancel(true);
                        rVar.d = null;
                    }
                    if (rVar.f83o) {
                        rVar.a(null, true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized J0 d(String str, String str2, String str3, boolean z, List list, I1 i1) {
        try {
            ActivityManager.MemoryInfo memoryInfo = null;
            if (this.w == null) {
                return null;
            }
            this.r.getClass();
            K0 k0 = this.v;
            if (k0 != null && k0.l.equals(str2)) {
                int i = this.t;
                if (i > 0) {
                    this.t = i - 1;
                }
                this.m.h(EnumC0094u1.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.t != 0) {
                    K0 k1 = this.v;
                    if (k1 != null) {
                        k1.a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.x), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.y));
                    }
                    return null;
                }
                C0019p c0019pA = this.w.a(list, false);
                if (c0019pA == null) {
                    return null;
                }
                long j = c0019pA.m - this.x;
                ArrayList arrayList = new ArrayList(1);
                K0 k2 = this.v;
                if (k2 != null) {
                    arrayList.add(k2);
                }
                this.v = null;
                this.t = 0;
                ILogger iLogger = this.m;
                try {
                    ActivityManager activityManager = (ActivityManager) this.l.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    if (activityManager != null) {
                        activityManager.getMemoryInfo(memoryInfo2);
                        memoryInfo = memoryInfo2;
                    } else {
                        iLogger.h(EnumC0094u1.INFO, "Error getting MemoryInfo.", new Object[0]);
                    }
                } catch (Throwable th) {
                    iLogger.v(EnumC0094u1.ERROR, "Error getting MemoryInfo.", th);
                }
                String string = memoryInfo != null ? Long.toString(memoryInfo.totalMem) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((K0) it.next()).a(Long.valueOf(c0019pA.m), Long.valueOf(this.x), Long.valueOf(c0019pA.n), Long.valueOf(this.y));
                }
                File file = (File) c0019pA.f81o;
                Date date = this.z;
                String string2 = Long.toString(j);
                this.r.getClass();
                int i2 = Build.VERSION.SDK_INT;
                String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                CallableC0107z callableC0107z = new CallableC0107z(3);
                this.r.getClass();
                String str5 = Build.MANUFACTURER;
                this.r.getClass();
                String str6 = Build.MODEL;
                this.r.getClass();
                return new J0(file, date, arrayList, str, str2, str3, string2, i2, str4, callableC0107z, str5, str6, Build.VERSION.RELEASE, this.r.b(), string, i1.getProguardUuid(), i1.getRelease(), i1.getEnvironment(), (c0019pA.l || z) ? "timeout" : "normal", (Map) c0019pA.p);
            }
            this.m.h(EnumC0094u1.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.X
    public final boolean isRunning() {
        return this.t != 0;
    }

    @Override // io.sentry.X
    public final synchronized J0 l(io.sentry.W w, List list, I1 i1) {
        return d(w.getName(), w.e().toString(), w.k().l.toString(), false, list, i1);
    }

    @Override // io.sentry.X
    public final synchronized void start() {
        try {
            this.r.getClass();
            a();
            int i = this.t + 1;
            this.t = i;
            if (i == 1 && b()) {
                this.m.h(EnumC0094u1.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.t--;
                this.m.h(EnumC0094u1.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0021s(Context context, G g, io.sentry.android.core.internal.util.m mVar, ILogger iLogger, String str, boolean z, int i, io.sentry.T t) {
        this.s = false;
        this.t = 0;
        this.w = null;
        io.sentry.config.a.C(context, "The application context is required");
        this.l = context;
        io.sentry.config.a.C(iLogger, "ILogger is required");
        this.m = iLogger;
        this.u = mVar;
        io.sentry.config.a.C(g, "The BuildInfoProvider is required.");
        this.r = g;
        this.n = str;
        this.f84o = z;
        this.p = i;
        io.sentry.config.a.C(t, "The ISentryExecutorService is required.");
        this.q = t;
        this.z = io.sentry.config.a.j();
    }
}
