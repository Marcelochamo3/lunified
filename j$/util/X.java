package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class X extends B implements H {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        B.b(this, consumer);
    }

    @Override // j$.util.H
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
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
        return B.g(this, consumer);
    }

    @Override // j$.util.H
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ H trySplit() {
        return null;
    }

    @Override // j$.util.B, j$.util.E, j$.util.N, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ N trySplit() {
        return null;
    }
}
