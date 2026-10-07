package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class v3 extends x3 implements j$.util.H {
    @Override // j$.util.stream.z3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new v3((j$.util.H) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.x3
    protected final Object b() {
        return new G0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.g(this, consumer);
    }
}
