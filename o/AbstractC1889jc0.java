package o;

import android.os.SystemClock;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1889jc0 {
    public static final Object a = new Object();
    public static final AtomicReference b = new AtomicReference(null);
    public static volatile long c;
    public static volatile boolean d;

    public static void a(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1793ic0 c1793ic0 = new C1793ic0(j, jElapsedRealtime);
        while (true) {
            AtomicReference atomicReference = b;
            C1793ic0 c1793ic1 = (C1793ic0) atomicReference.get();
            if (c1793ic1 != null) {
                if (5000 + j < U9.f(jElapsedRealtime - c1793ic1.b, 0L) + c1793ic1.a) {
                    return;
                }
            }
            do {
                if (atomicReference.compareAndSet(c1793ic1, c1793ic0)) {
                    c = 0L;
                    return;
                }
            } while (atomicReference.get() == c1793ic1);
        }
    }

    public static Long b(long j, boolean z) {
        C1793ic0 c1793ic0 = (C1793ic0) b.get();
        if (c1793ic0 == null) {
            return null;
        }
        long j2 = c1793ic0.a;
        if (j2 > 0) {
            long j3 = c1793ic0.b;
            if (j3 > 0 && j >= j3) {
                long j4 = j - j3;
                if (!z || j4 <= 3600000) {
                    return Long.valueOf(j2 + j4);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    public static long c() {
        boolean z = true;
        Long lB = b(SystemClock.elapsedRealtime(), true);
        if (lB != null) {
            return lB.longValue() / 1000;
        }
        Object obj = a;
        synchronized (obj) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long lB2 = b(jElapsedRealtime, true);
            if (lB2 != null) {
                return lB2.longValue() / 1000;
            }
            if ((c <= 0 || jElapsedRealtime - c >= 60000) && !d) {
                d = true;
            } else {
                z = false;
            }
            if (!z) {
                if (d) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 6500;
                    synchronized (obj) {
                        while (d && b.get() == null) {
                            long jElapsedRealtime3 = jElapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (jElapsedRealtime3 <= 0) {
                                break;
                            }
                            try {
                                a.wait(jElapsedRealtime3);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                Long lB3 = b(SystemClock.elapsedRealtime(), false);
                                return lB3 != null ? lB3.longValue() / 1000 : System.currentTimeMillis() / 1000;
                            }
                        }
                    }
                }
            } else {
                C1791ib0 c1791ib0 = C1791ib0.a;
                NV nvB = C1791ib0.d(false).b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                nvB.e(4L, timeUnit);
                nvB.i(4L, timeUnit);
                nvB.c(6L, timeUnit);
                OV ov = new OV(nvB);
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.u(C1263d5.a);
                Long l = null;
                c0560Kq.m("OPTIONS", null);
                c0560Kq.j("Cache-Control", "no-cache");
                try {
                    C1855j80 c1855j80G = ov.c(c0560Kq.c()).g();
                    try {
                        int i = c1855j80G.f840o;
                        if (200 > i || i >= 500) {
                            AbstractC3409z9.g(c1855j80G, null);
                        } else {
                            Long lD = d(c1855j80G.f("Date", null));
                            AbstractC3409z9.g(c1855j80G, null);
                            l = lD;
                        }
                        if (l != null) {
                            a(l.longValue());
                            System.currentTimeMillis();
                        } else {
                            c = SystemClock.elapsedRealtime();
                        }
                        Object obj2 = a;
                        synchronized (obj2) {
                            d = false;
                            obj2.notifyAll();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3409z9.g(c1855j80G, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            Long lB4 = b(SystemClock.elapsedRealtime(), false);
            if (lB4 != null) {
            }
        }
    }

    public static Long d(String str) {
        if (str == null || AbstractC1899jh0.O(str)) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return Long.valueOf(date.getTime());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
