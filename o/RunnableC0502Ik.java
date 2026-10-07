package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0502Ik extends AbstractC1821ir implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0502Ik u;
    public static final long v;

    static {
        Long l;
        RunnableC0502Ik runnableC0502Ik = new RunnableC0502Ik();
        u = runnableC0502Ik;
        runnableC0502Ik.c0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        v = timeUnit.toNanos(l.longValue());
    }

    @Override // o.AbstractC1821ir, o.InterfaceC1714hm
    public final InterfaceC2300nn R(long j, Runnable runnable, InterfaceC1022ai interfaceC1022ai) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C1489fV.l;
        }
        long jNanoTime = System.nanoTime();
        C1528fr c1528fr = new C1528fr(runnable, j2 + jNanoTime);
        k0(jNanoTime, c1528fr);
        return c1528fr;
    }

    @Override // o.AbstractC1918jr
    public final Thread b0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "o.Ik");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // o.AbstractC1918jr
    public final void g0(long j, AbstractRunnableC1626gr abstractRunnableC1626gr) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o.AbstractC1821ir
    public final void h0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.h0(runnable);
    }

    public final synchronized void l0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1821ir.r.set(this, null);
            AbstractC1821ir.s.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1415ej0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jE0 = e0();
                        if (jE0 == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = v + jNanoTime;
                            }
                            long j2 = j - jNanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                l0();
                                if (j0()) {
                                    return;
                                }
                                b0();
                                return;
                            }
                            if (jE0 > j2) {
                                jE0 = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (jE0 > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                break;
                                break;
                            }
                            LockSupport.parkNanos(this, jE0);
                        }
                    }
                    _thread = null;
                    l0();
                    if (j0()) {
                        return;
                    }
                    b0();
                    return;
                }
                _thread = null;
                l0();
                if (j0()) {
                    return;
                }
                b0();
            }
        } catch (Throwable th) {
            _thread = null;
            l0();
            if (!j0()) {
                b0();
            }
            throw th;
        }
    }

    @Override // o.AbstractC1821ir, o.AbstractC1918jr
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
