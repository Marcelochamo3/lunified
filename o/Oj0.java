package o;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class Oj0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public Oj0(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long jLongValue = this.a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.b = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long d() {
        return this.b;
    }

    public final synchronized boolean e() {
        return this.b != -9223372036854775807L;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized void g(boolean z, long j, long j2) {
        try {
            AbstractC0397Ej.f(this.a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!e()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        AbstractC0397Ej.f(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !e()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
