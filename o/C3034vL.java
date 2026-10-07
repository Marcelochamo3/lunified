package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.vL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3034vL {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C3034vL.class, Object.class, "_cur");
    private volatile Object _cur = new C3228xL(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3228xL c3228xL = (C3228xL) atomicReferenceFieldUpdater.get(this);
            int iA = c3228xL.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3228xL c3228xLC = c3228xL.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3228xL, c3228xLC) && atomicReferenceFieldUpdater.get(this) == c3228xL) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3228xL c3228xL = (C3228xL) atomicReferenceFieldUpdater.get(this);
            if (c3228xL.b()) {
                return;
            }
            C3228xL c3228xLC = c3228xL.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3228xL, c3228xLC) && atomicReferenceFieldUpdater.get(this) == c3228xL) {
            }
        }
    }

    public final int c() {
        C3228xL c3228xL = (C3228xL) a.get(this);
        c3228xL.getClass();
        long j = C3228xL.f.get(c3228xL);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3228xL c3228xL = (C3228xL) atomicReferenceFieldUpdater.get(this);
            Object objD = c3228xL.d();
            if (objD != C3228xL.g) {
                return objD;
            }
            C3228xL c3228xLC = c3228xL.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3228xL, c3228xLC) && atomicReferenceFieldUpdater.get(this) == c3228xL) {
            }
        }
    }
}
