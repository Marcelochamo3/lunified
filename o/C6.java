package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class C6 extends AbstractC2851tW {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C6.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC1376eG.a;

    @Override // o.AbstractC2851tW
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        J2 j2 = AbstractC1376eG.a;
        if (obj2 == j2) {
            J2 j2C = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == j2) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, j2, j2C)) {
                    if (atomicReferenceFieldUpdater.get(this) != j2) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = j2C;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract J2 c(Object obj);
}
