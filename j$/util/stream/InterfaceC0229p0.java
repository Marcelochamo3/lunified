package j$.util.stream;

import j$.util.C0145k;
import j$.util.C0146l;
import j$.util.C0147m;
import j$.util.InterfaceC0282y;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0229p0 extends BaseStream {
    InterfaceC0229p0 a();

    G asDoubleStream();

    C0146l average();

    InterfaceC0229p0 b();

    Stream boxed();

    InterfaceC0229p0 c(C0153a c0153a);

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC0229p0 distinct();

    C0147m findAny();

    C0147m findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    G h();

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    InterfaceC0282y iterator();

    boolean j();

    InterfaceC0229p0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    C0147m max();

    C0147m min();

    boolean n();

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    InterfaceC0229p0 parallel();

    InterfaceC0229p0 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    C0147m reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    InterfaceC0229p0 sequential();

    InterfaceC0229p0 skip(long j);

    InterfaceC0229p0 sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.K spliterator();

    long sum();

    C0145k summaryStatistics();

    IntStream t();

    long[] toArray();
}
