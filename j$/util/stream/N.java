package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class N extends AbstractC0163c {
    private final H j;
    private final boolean k;

    N(H h, boolean z, AbstractC0158b abstractC0158b, Spliterator spliterator) {
        super(abstractC0158b, spliterator);
        this.k = z;
        this.j = h;
    }

    N(N n, Spliterator spliterator) {
        super(n, spliterator);
        this.k = n.k;
        this.j = n.j;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final Object a() {
        AbstractC0158b abstractC0158b = this.a;
        L3 l3 = (L3) this.j.d.get();
        abstractC0158b.R(this.b, l3);
        Object obj = l3.get();
        if (!this.k) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC0173e abstractC0173e = this;
        while (abstractC0173e != null) {
            AbstractC0173e abstractC0173e2 = (AbstractC0173e) abstractC0173e.getCompleter();
            if (abstractC0173e2 != null && abstractC0173e2.d != abstractC0173e) {
                i();
                return obj;
            }
            abstractC0173e = abstractC0173e2;
        }
        AtomicReference atomicReference2 = this.h;
        while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC0173e
    protected final AbstractC0173e e(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0163c
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0173e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            N n = (N) this.d;
            N n2 = null;
            while (n != n2) {
                Object objC = n.c();
                if (objC != null && this.j.c.test(objC)) {
                    f(objC);
                    AbstractC0173e abstractC0173e = this;
                    while (abstractC0173e != null) {
                        AbstractC0173e abstractC0173e2 = (AbstractC0173e) abstractC0173e.getCompleter();
                        if (abstractC0173e2 != null && abstractC0173e2.d != abstractC0173e) {
                            i();
                            break;
                        }
                        abstractC0173e = abstractC0173e2;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
                    }
                    break;
                }
                n2 = n;
                n = (N) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
