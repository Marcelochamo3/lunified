package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends B implements K {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        B.c(this, consumer);
    }

    @Override // j$.util.K
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return B.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return B.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return B.h(this, consumer);
    }

    @Override // j$.util.K
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ K trySplit() {
        return null;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
