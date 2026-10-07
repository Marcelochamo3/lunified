package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
final class V extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC0236q2 b;
    private final AbstractC0158b c;
    private long d;

    V(V v, Spliterator spliterator) {
        super(v);
        this.a = spliterator;
        this.b = v.b;
        this.d = v.d;
        this.c = v.c;
    }

    V(AbstractC0158b abstractC0158b, Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        super(null);
        this.b = interfaceC0236q2;
        this.c = abstractC0158b;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = AbstractC0173e.g(jEstimateSize);
            this.d = jG;
        }
        boolean zU = EnumC0177e3.SHORT_CIRCUIT.u(this.c.G());
        InterfaceC0236q2 interfaceC0236q2 = this.b;
        boolean z = false;
        V v = this;
        while (true) {
            if (zU && interfaceC0236q2.n()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                v.c.w(spliterator, interfaceC0236q2);
                break;
            }
            V v2 = new V(v, spliteratorTrySplit);
            v.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                V v3 = v;
                v = v2;
                v2 = v3;
            }
            z = !z;
            v.fork();
            v = v2;
            jEstimateSize = spliterator.estimateSize();
        }
        v.a = null;
        v.propagateCompletion();
    }
}
