package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0230p1 implements Spliterator {
    L0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    AbstractC0230p1(L0 l0) {
        this.a = l0;
    }

    protected static L0 a(ArrayDeque arrayDeque) {
        while (true) {
            L0 l0 = (L0) arrayDeque.pollFirst();
            if (l0 == null) {
                return null;
            }
            if (l0.q() != 0) {
                for (int iQ = l0.q() - 1; iQ >= 0; iQ--) {
                    arrayDeque.addFirst(l0.b(iQ));
                }
            } else if (l0.count() > 0) {
                return l0;
            }
        }
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iQ = this.a.q();
        while (true) {
            iQ--;
            if (iQ < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(iQ));
        }
    }

    protected final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque arrayDequeB = b();
            this.e = arrayDequeB;
            L0 l0A = a(arrayDequeB);
            if (l0A == null) {
                this.a = null;
                return false;
            }
            spliterator = l0A.spliterator();
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.q(); i++) {
            jCount += this.a.b(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.B.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.B.e(this, i);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        L0 l0 = this.a;
        if (l0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < l0.q() - 1) {
            L0 l1 = this.a;
            int i = this.b;
            this.b = i + 1;
            return l1.b(i).spliterator();
        }
        L0 l0B = this.a.b(this.b);
        this.a = l0B;
        if (l0B.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        L0 l2 = this.a;
        this.b = 1;
        return l2.b(0).spliterator();
    }
}
