package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class H implements K3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    H(boolean z, EnumC0182f3 enumC0182f3, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC0177e3.r) | EnumC0177e3.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        L3 l3 = (L3) this.d.get();
        abstractC0158b.R(spliterator, l3);
        Object obj = l3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        return new N(this, EnumC0177e3.ORDERED.u(abstractC0158b.G()), abstractC0158b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return this.a;
    }
}
