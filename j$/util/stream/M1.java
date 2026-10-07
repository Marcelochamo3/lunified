package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class M1 extends AbstractC0274z0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M1(EnumC0182f3 enumC0182f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC0182f3);
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        return new N1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.AbstractC0274z0, j$.util.stream.K3
    public final int d() {
        if (this.k.characteristics().contains(EnumC0188h.UNORDERED)) {
            return EnumC0177e3.r;
        }
        return 0;
    }
}
