package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0159b0 extends AbstractC0169d0 {
    @Override // j$.util.stream.AbstractC0158b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0169d0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            AbstractC0169d0.V(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0169d0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC0169d0.V(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !H() ? this : new C0265x(this, EnumC0177e3.r, 1);
    }
}
