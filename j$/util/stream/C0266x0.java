package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0266x0 implements K3 {
    final EnumC0262w0 a;
    final Supplier b;

    C0266x0(EnumC0182f3 enumC0182f3, EnumC0262w0 enumC0262w0, Supplier supplier) {
        this.a = enumC0262w0;
        this.b = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        AbstractC0258v0 abstractC0258v0 = (AbstractC0258v0) this.b.get();
        abstractC0158b.R(spliterator, abstractC0258v0);
        return Boolean.valueOf(abstractC0258v0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.K3
    public final Object c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        return (Boolean) new C0270y0(this, abstractC0158b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return EnumC0177e3.u | EnumC0177e3.r;
    }
}
