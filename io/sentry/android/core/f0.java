package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.AbstractC0049h1;
import io.sentry.C0;
import io.sentry.C0103x1;
import io.sentry.D0;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements io.sentry.O, io.sentry.android.core.internal.util.l {
    public static final long h = TimeUnit.SECONDS.toNanos(1);
    public static final C0103x1 i = new C0103x1(new Date(0), 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.m c;
    public volatile String d;
    public final Object b = new Object();
    public final TreeSet e = new TreeSet(new d0(0));
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public f0(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.m mVar) {
        this.c = mVar;
        this.a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long h(AbstractC0049h1 abstractC0049h1) {
        if (abstractC0049h1 instanceof C0103x1) {
            return abstractC0049h1.b(i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC0049h1.d());
    }

    @Override // io.sentry.android.core.internal.util.l
    public final void c(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (h / ((double) f));
        this.g = j5;
        concurrentSkipListSet.add(new e0(j, j2, j3, j4, z, z2, j5));
    }

    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    public final void d(io.sentry.V v) throws Throwable {
        Object obj;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        long j3;
        long jLongValue;
        int i5;
        Field field;
        Iterator it;
        long j4;
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                try {
                    if (this.e.remove(v)) {
                        AbstractC0049h1 abstractC0049h1N = v.n();
                        if (abstractC0049h1N == null) {
                            return;
                        }
                        long jH = h(v.t());
                        long jH2 = h(abstractC0049h1N);
                        long j5 = jH2 - jH;
                        if (j5 <= 0) {
                            return;
                        }
                        long j6 = this.g;
                        if (!this.f.isEmpty()) {
                            Iterator it2 = this.f.tailSet(new e0(jH)).iterator();
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = obj2;
                                    break;
                                }
                                e0 e0Var = (e0) it2.next();
                                obj = obj2;
                                long j7 = e0Var.l;
                                if (j7 > jH2) {
                                    break;
                                }
                                if (j7 < jH || e0Var.m > jH2) {
                                    it = it2;
                                    if ((jH > j7 && jH < e0Var.m) || (jH2 > j7 && jH2 < e0Var.m)) {
                                        long jMin = Math.min(e0Var.f74o - Math.max(0L, Math.max(0L, jH - j7) - e0Var.r), j5);
                                        j4 = jH;
                                        long jMin2 = Math.min(jH2, e0Var.m) - Math.max(jH, e0Var.l);
                                        long j8 = e0Var.r;
                                        int i6 = io.sentry.android.core.internal.util.m.A;
                                        boolean z = jMin2 > j8;
                                        j += jMin2;
                                        if (jMin2 > io.sentry.android.core.internal.util.m.z) {
                                            j3 += jMin;
                                            i4++;
                                        } else if (z) {
                                            j2 += jMin;
                                            i3++;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    j6 = e0Var.r;
                                    obj2 = obj;
                                    it2 = it;
                                    jH = j4;
                                } else {
                                    long j9 = e0Var.n;
                                    long j10 = e0Var.f74o;
                                    boolean z2 = e0Var.p;
                                    it = it2;
                                    j += j9;
                                    if (e0Var.q) {
                                        j3 += j10;
                                        i4++;
                                    } else if (z2) {
                                        j2 += j10;
                                        i3++;
                                    } else {
                                        i2++;
                                    }
                                }
                                j4 = jH;
                                j6 = e0Var.r;
                                obj2 = obj;
                                it2 = it;
                                jH = j4;
                            }
                        } else {
                            obj = obj2;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        }
                        int i7 = i2 + i3 + i4;
                        io.sentry.android.core.internal.util.m mVar = this.c;
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
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jH2 - jLongValue);
                            if (jMax > j6) {
                                boolean z3 = jMax > io.sentry.android.core.internal.util.m.z;
                                long jMax2 = Math.max(0L, jMax - j6);
                                j += jMax;
                                if (z3) {
                                    j3 += jMax2;
                                    i5 = 1;
                                    i4++;
                                } else {
                                    i5 = 1;
                                    j2 += jMax2;
                                    i3++;
                                }
                            } else {
                                i5 = 0;
                            }
                            long j11 = j5 - j;
                            i7 = i7 + i5 + (j11 > 0 ? (int) (j11 / j6) : 0);
                        }
                        double d = (j2 + j3) / 1.0E9d;
                        v.r(Integer.valueOf(i7), "frames.total");
                        v.r(Integer.valueOf(i3), "frames.slow");
                        v.r(Integer.valueOf(i4), "frames.frozen");
                        v.r(Double.valueOf(d), "frames.delay");
                        if (v instanceof io.sentry.W) {
                            v.h(Integer.valueOf(i7), "frames_total");
                            v.h(Integer.valueOf(i3), "frames_slow");
                            v.h(Integer.valueOf(i4), "frames_frozen");
                            v.h(Double.valueOf(d), "frames_delay");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.b) {
            try {
                if (this.d != null) {
                    this.c.a(this.d);
                    this.d = null;
                }
                this.f.clear();
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(io.sentry.V v) throws Throwable {
        if (!this.a || (v instanceof C0) || (v instanceof D0)) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.e.contains(v)) {
                    d(v);
                    synchronized (this.b) {
                        try {
                            if (this.e.isEmpty()) {
                                e();
                            } else {
                                this.f.headSet(new e0(h(((io.sentry.V) this.e.first()).t()))).clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(io.sentry.V v) {
        String str;
        if (!this.a || (v instanceof C0) || (v instanceof D0)) {
            return;
        }
        synchronized (this.b) {
            try {
                this.e.add(v);
                if (this.d == null) {
                    io.sentry.android.core.internal.util.m mVar = this.c;
                    if (mVar.r) {
                        String string = UUID.randomUUID().toString();
                        mVar.q.put(string, this);
                        mVar.c();
                        str = string;
                    } else {
                        str = null;
                    }
                    this.d = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
