package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0186g2 extends AbstractC0196i2 {
    @Override // j$.util.stream.AbstractC0158b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0196i2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (isParallel()) {
            super.forEach(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0196i2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (isParallel()) {
            super.forEachOrdered(consumer);
        } else {
            P().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !H() ? this : new C0176e2(this, EnumC0177e3.r, 1);
    }
}
