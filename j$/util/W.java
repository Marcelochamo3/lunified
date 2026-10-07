package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class W extends B implements E {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        B.a(this, consumer);
    }

    @Override // j$.util.E
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
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
        return B.f(this, consumer);
    }

    @Override // j$.util.E
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return false;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ E trySplit() {
        return null;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
