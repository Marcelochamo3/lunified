package io.sentry.android.core.performance;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {
    public String l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f82o;

    public final boolean a() {
        return this.n != 0;
    }

    public final boolean b() {
        return this.f82o != 0;
    }

    public final void c(long j) {
        this.n = j;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.n;
        this.m = System.currentTimeMillis() - jUptimeMillis;
        System.nanoTime();
        TimeUnit.MILLISECONDS.toNanos(jUptimeMillis);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.m, ((d) obj).m);
    }

    public final void d() {
        this.f82o = SystemClock.uptimeMillis();
    }
}
