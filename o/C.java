package o;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC1370eA {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f193o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new B());
            }
            try {
                q = unsafe.objectFieldOffset(E.class.getDeclaredField("g"));
                p = unsafe.objectFieldOffset(E.class.getDeclaredField("f"));
                r = unsafe.objectFieldOffset(E.class.getDeclaredField("e"));
                s = unsafe.objectFieldOffset(D.class.getDeclaredField("a"));
                t = unsafe.objectFieldOffset(D.class.getDeclaredField("b"));
                f193o = unsafe;
            } catch (Exception e) {
                AbstractC1709hj0.a(e);
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // o.AbstractC1370eA
    public final void J(D d, D d2) {
        f193o.putObject(d, t, d2);
    }

    @Override // o.AbstractC1370eA
    public final void K(D d, Thread thread) {
        f193o.putObject(d, s, thread);
    }

    @Override // o.AbstractC1370eA
    public final boolean d(E e, Object obj, Object obj2) {
        return AbstractC3390z.a(f193o, e, r, obj, obj2);
    }

    @Override // o.AbstractC1370eA
    public final boolean e(E e, D d, D d2) {
        return AbstractC3390z.a(f193o, e, q, d, d2);
    }

    @Override // o.AbstractC1370eA
    public final C3099w o(E e) {
        C3099w c3099w;
        C3099w c3099w2 = C3099w.b;
        do {
            c3099w = e.f;
            if (c3099w2 == c3099w) {
                return c3099w;
            }
        } while (!A.a(f193o, e, p, c3099w));
        return c3099w;
    }

    @Override // o.AbstractC1370eA
    public final D p(E e) {
        D d;
        D d2 = D.c;
        do {
            d = e.g;
            if (d2 == d) {
                return d;
            }
        } while (!e(e, d, d2));
        return d;
    }
}
