package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
final class O3 extends AbstractC0191h2 {
    final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O3(AbstractC0158b abstractC0158b, int i, Predicate predicate) {
        super(abstractC0158b, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        return (L0) new S3(this, abstractC0158b, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator L(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        return EnumC0177e3.ORDERED.u(abstractC0158b.G()) ? K(abstractC0158b, spliterator, new C0174e0(10)).spliterator() : new T3(abstractC0158b.T(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        return new C0228p(this, interfaceC0236q2);
    }
}
