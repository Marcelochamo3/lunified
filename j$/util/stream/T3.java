package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
final class T3 implements Consumer, Spliterator {
    final Spliterator a;
    final boolean b;
    final AtomicBoolean c;
    boolean d;
    int e;
    final Predicate f;
    Object g;
    public final /* synthetic */ int h;

    public T3(Spliterator spliterator, T3 t3, int i) {
        this.h = i;
        this.d = true;
        this.a = spliterator;
        this.b = t3.b;
        this.c = t3.c;
        this.f = t3.f;
    }

    public T3(Spliterator spliterator, Predicate predicate, int i) {
        this.h = i;
        this.d = true;
        this.a = spliterator;
        this.b = false;
        this.c = new AtomicBoolean();
        this.f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.e = (this.e + 1) & 63;
        this.g = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    final Spliterator b(Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return new T3(spliterator, this, 0);
            default:
                return new T3(spliterator, this, 1);
        }
    }

    public final Spliterator c() {
        Spliterator spliteratorTrySplit = this.b ? null : this.a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.B.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        AtomicBoolean atomicBoolean;
        boolean zTest;
        switch (this.h) {
            case 0:
                boolean z = this.d;
                Spliterator spliterator = this.a;
                if (!z) {
                    return spliterator.tryAdvance(consumer);
                }
                boolean z2 = false;
                this.d = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    atomicBoolean = this.c;
                    if (zTryAdvance && ((this.e != 0 || !atomicBoolean.get()) && this.f.test(this.g))) {
                        z2 = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z2) {
                    atomicBoolean.set(true);
                }
                consumer.accept(this.g);
                return zTryAdvance;
            default:
                boolean z3 = this.d;
                AtomicBoolean atomicBoolean2 = this.c;
                if (!z3 || ((this.e == 0 && atomicBoolean2.get()) || !this.a.tryAdvance(this))) {
                    zTest = true;
                } else {
                    zTest = this.f.test(this.g);
                    if (zTest) {
                        consumer.accept(this.g);
                        return true;
                    }
                }
                this.d = false;
                if (!zTest) {
                    atomicBoolean2.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.h) {
            case 1:
                if (this.c.get()) {
                    return null;
                }
                return c();
            default:
                return c();
        }
    }
}
