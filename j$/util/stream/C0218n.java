package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0218n implements Collector {
    private final Supplier a;
    private final BiConsumer b;
    private final BinaryOperator c;
    private final Function d;
    private final Set e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    C0218n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new C0203k(3), set);
        Set set2 = Collectors.a;
    }

    C0218n(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }
}
