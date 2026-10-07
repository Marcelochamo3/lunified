package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0204k0 extends AbstractC0214m0 {
    @Override // j$.util.stream.AbstractC0158b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0214m0, j$.util.stream.InterfaceC0229p0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC0214m0.V(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0214m0, j$.util.stream.InterfaceC0229p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC0214m0.V(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC0229p0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC0229p0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !H() ? this : new C0269y(this, EnumC0177e3.r, 4);
    }
}
