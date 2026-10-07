package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Sw0 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(Sw0.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(Sw0.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(Sw0.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(Sw0.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final AbstractRunnableC3163wi0 a(AbstractRunnableC3163wi0 abstractRunnableC3163wi0) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return abstractRunnableC3163wi0;
        }
        if (abstractRunnableC3163wi0.m.l == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & Yu0.b.k0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC3163wi0);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final AbstractRunnableC3163wi0 b() {
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & Yu0.b.k0;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC3163wi0 = (AbstractRunnableC3163wi0) this.a.getAndSet(i2, null)) != null) {
                if (abstractRunnableC3163wi0.m.l == 1) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC3163wi0;
            }
        }
    }

    public final AbstractRunnableC3163wi0 c(int i, boolean z) {
        int i2 = i & Yu0.b.k0;
        AtomicReferenceArray atomicReferenceArray = this.a;
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = (AbstractRunnableC3163wi0) atomicReferenceArray.get(i2);
        if (abstractRunnableC3163wi0 != null) {
            if ((abstractRunnableC3163wi0.m.l == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC3163wi0, null)) {
                    if (atomicReferenceArray.get(i2) != abstractRunnableC3163wi0) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC3163wi0;
            }
        }
        return null;
    }
}
