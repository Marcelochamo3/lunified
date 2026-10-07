package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1618gn extends R90 {
    public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(C1618gn.class, "_decision");
    private volatile int _decision;

    @Override // o.R90, o.JH
    public final void w(Object obj) {
        x(obj);
    }

    @Override // o.R90, o.JH
    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = p;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                Pu0.r(Ou0.p(this.f482o), AP.v(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
