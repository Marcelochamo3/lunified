package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
abstract class G3 {
    protected final Spliterator a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    G3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    G3(Spliterator spliterator, G3 g3) {
        this.a = spliterator;
        this.b = g3.b;
        this.e = g3.e;
        this.d = g3.d;
        this.c = g3.c;
    }

    protected final long b(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    protected final F3 d() {
        if (this.e.get() > 0) {
            return F3.MAYBE_MORE;
        }
        return this.b ? F3.UNLIMITED : F3.NO_MORE;
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m3trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m0trySplit() {
        return (j$.util.H) m3trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m1trySplit() {
        return (j$.util.K) m3trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m2trySplit() {
        return (j$.util.N) m3trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m3trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.e.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }
}
