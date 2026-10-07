package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, C3099w c3099w) {
        C3099w c3099w2 = C3099w.b;
        while (!unsafe.compareAndSwapObject(obj, j, c3099w, c3099w2)) {
            if (unsafe.getObject(obj, j) != c3099w) {
                return false;
            }
        }
        return true;
    }
}
