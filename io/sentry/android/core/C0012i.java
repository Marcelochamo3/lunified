package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C0050i;
import io.sentry.EnumC0094u1;
import io.sentry.H0;
import io.sentry.ILogger;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.android.core.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012i implements io.sentry.P {
    public final ILogger g;
    public final G h;
    public long a = 0;
    public long b = 0;
    public long c = 1;
    public long d = 1;
    public double e = 1.0E9d / 1;
    public final File f = new File("/proc/self/stat");
    public boolean i = false;
    public final Pattern j = Pattern.compile("[\n\t\r ]");

    public C0012i(ILogger iLogger, G g) {
        io.sentry.config.a.C(iLogger, "Logger is required.");
        this.g = iLogger;
        this.h = g;
    }

    @Override // io.sentry.P
    public final void a(H0 h0) {
        this.h.getClass();
        if (this.i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long jC = c();
            long j2 = jC - this.b;
            this.b = jC;
            h0.b = new C0050i(System.currentTimeMillis(), ((j2 / j) / this.d) * 100.0d);
        }
    }

    @Override // io.sentry.P
    public final void b() {
        this.h.getClass();
        this.i = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.e = 1.0E9d / this.c;
        this.b = c();
    }

    public final long c() {
        String strB;
        ILogger iLogger = this.g;
        try {
            strB = io.sentry.config.a.B(this.f);
        } catch (IOException e) {
            this.i = false;
            iLogger.v(EnumC0094u1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strB = null;
        }
        if (strB != null) {
            String[] strArrSplit = this.j.split(strB.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.e);
            } catch (NumberFormatException e2) {
                iLogger.v(EnumC0094u1.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }
}
