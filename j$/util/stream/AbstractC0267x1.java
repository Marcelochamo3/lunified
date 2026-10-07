package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0267x1 extends CountedCompleter implements InterfaceC0236q2 {
    protected final Spliterator a;
    protected final AbstractC0158b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    AbstractC0267x1(Spliterator spliterator, AbstractC0158b abstractC0158b, int i) {
        this.a = spliterator;
        this.b = abstractC0158b;
        this.c = AbstractC0173e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    AbstractC0267x1(AbstractC0267x1 abstractC0267x1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC0267x1);
        this.a = spliterator;
        this.b = abstractC0267x1.b;
        this.c = abstractC0267x1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC0267x1 b(Spliterator spliterator, long j, long j2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC0267x1 abstractC0267x1B = this;
        while (spliterator.estimateSize() > abstractC0267x1B.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC0267x1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC0267x1B.b(spliteratorTrySplit, abstractC0267x1B.d, jEstimateSize).fork();
            abstractC0267x1B = abstractC0267x1B.b(spliterator, abstractC0267x1B.d + jEstimateSize, abstractC0267x1B.e - jEstimateSize);
        }
        abstractC0267x1B.b.R(spliterator, abstractC0267x1B);
        abstractC0267x1B.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
