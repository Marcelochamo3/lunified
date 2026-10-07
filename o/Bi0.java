package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Bi0 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final C2691rp f;
    public static final C2102ll g;
    public static final C2102ll h;

    static {
        String property;
        int i = Vh0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = AbstractC0397Ej.H("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = Vh0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = AbstractC0397Ej.I("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = AbstractC0397Ej.I("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(AbstractC0397Ej.H("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = C2691rp.x;
        g = new C2102ll(0);
        h = new C2102ll(1);
    }
}
