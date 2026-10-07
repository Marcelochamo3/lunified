package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0163c extends AbstractC0173e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected AbstractC0163c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        super(abstractC0158b, spliterator);
        this.h = new AtomicReference(null);
    }

    protected AbstractC0163c(AbstractC0163c abstractC0163c, Spliterator spliterator) {
        super(abstractC0163c, spliterator);
        this.h = abstractC0163c.h;
    }

    @Override // j$.util.stream.AbstractC0173e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = AbstractC0173e.g(jEstimateSize);
            this.c = jG;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0163c abstractC0163c = this;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z2 = abstractC0163c.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC0163c.getCompleter();
                while (true) {
                    AbstractC0163c abstractC0163c2 = (AbstractC0163c) ((AbstractC0173e) completer);
                    if (z2 || abstractC0163c2 == null) {
                        break;
                    }
                    z2 = abstractC0163c2.i;
                    completer = abstractC0163c2.getCompleter();
                }
            }
            if (z2) {
                objJ = abstractC0163c.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objJ = abstractC0163c.a();
                break;
            }
            AbstractC0163c abstractC0163c3 = (AbstractC0163c) abstractC0163c.e(spliteratorTrySplit);
            abstractC0163c.d = abstractC0163c3;
            AbstractC0163c abstractC0163c4 = (AbstractC0163c) abstractC0163c.e(spliterator);
            abstractC0163c.e = abstractC0163c4;
            abstractC0163c.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0163c = abstractC0163c3;
                abstractC0163c3 = abstractC0163c4;
            } else {
                abstractC0163c = abstractC0163c4;
            }
            z = !z;
            abstractC0163c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0163c.f(objJ);
        abstractC0163c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        AbstractC0163c abstractC0163c = this;
        for (AbstractC0163c abstractC0163c2 = (AbstractC0163c) ((AbstractC0173e) getCompleter()); abstractC0163c2 != null; abstractC0163c2 = (AbstractC0163c) ((AbstractC0173e) abstractC0163c2.getCompleter())) {
            if (abstractC0163c2.d == abstractC0163c) {
                AbstractC0163c abstractC0163c3 = (AbstractC0163c) abstractC0163c2.e;
                if (!abstractC0163c3.i) {
                    abstractC0163c3.h();
                }
            }
            abstractC0163c = abstractC0163c2;
        }
    }

    protected abstract Object j();
}
