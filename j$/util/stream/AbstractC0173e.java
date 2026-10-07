package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0173e extends CountedCompleter {
    private static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC0158b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC0173e d;
    protected AbstractC0173e e;
    private Object f;

    protected AbstractC0173e(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        super(null);
        this.a = abstractC0158b;
        this.b = spliterator;
        this.c = 0L;
    }

    protected AbstractC0173e(AbstractC0173e abstractC0173e, Spliterator spliterator) {
        super(abstractC0173e);
        this.b = spliterator;
        this.a = abstractC0173e.a;
        this.c = abstractC0173e.c;
    }

    public static int b() {
        return g;
    }

    public static long g(long j) {
        long j2 = j / ((long) g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.c = jG;
        }
        boolean z = false;
        AbstractC0173e abstractC0173e = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0173e abstractC0173eE = abstractC0173e.e(spliteratorTrySplit);
            abstractC0173e.d = abstractC0173eE;
            AbstractC0173e abstractC0173eE2 = abstractC0173e.e(spliterator);
            abstractC0173e.e = abstractC0173eE2;
            abstractC0173e.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0173e = abstractC0173eE;
                abstractC0173eE = abstractC0173eE2;
            } else {
                abstractC0173e = abstractC0173eE2;
            }
            z = !z;
            abstractC0173eE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0173e.f(abstractC0173e.a());
        abstractC0173e.tryComplete();
    }

    protected final boolean d() {
        return ((AbstractC0173e) getCompleter()) == null;
    }

    protected abstract AbstractC0173e e(Spliterator spliterator);

    protected void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
