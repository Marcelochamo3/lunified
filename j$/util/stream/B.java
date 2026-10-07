package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class B extends D {
    @Override // j$.util.stream.AbstractC0158b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEach(doubleConsumer);
        } else {
            D.V(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.D, j$.util.stream.G
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (isParallel()) {
            super.forEachOrdered(doubleConsumer);
        } else {
            D.V(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !H() ? this : new C0261w(this, EnumC0177e3.r, 1);
    }
}
