package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: o.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2143m6 extends Hj0 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static C2143m6 l;
    public boolean e;
    public C2143m6 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC1474fG.i(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C2143m6 c2143m6;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (!(!this.e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.e = true;
                if (l == null) {
                    l = new C2143m6();
                    C1850j6 c1850j6 = new C1850j6("Okio Watchdog");
                    c1850j6.setDaemon(true);
                    c1850j6.start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - jNanoTime;
                C2143m6 c2143m7 = l;
                AbstractC1474fG.g(c2143m7);
                while (true) {
                    c2143m6 = c2143m7.f;
                    if (c2143m6 == null || j3 < c2143m6.g - jNanoTime) {
                        break;
                        break;
                    }
                    c2143m7 = c2143m6;
                }
                this.f = c2143m6;
                c2143m7.f = this;
                if (c2143m7 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            C2143m6 c2143m6 = l;
            while (c2143m6 != null) {
                C2143m6 c2143m7 = c2143m6.f;
                if (c2143m7 == this) {
                    c2143m6.f = this.f;
                    this.f = null;
                    return false;
                }
                c2143m6 = c2143m7;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
