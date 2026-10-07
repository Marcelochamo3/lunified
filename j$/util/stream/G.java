package j$.util.stream;

import j$.util.C0142h;
import j$.util.C0146l;
import j$.util.InterfaceC0151q;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface G extends BaseStream {
    G a();

    C0146l average();

    G b();

    Stream boxed();

    G c(C0153a c0153a);

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    G distinct();

    boolean f();

    C0146l findAny();

    C0146l findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    InterfaceC0229p0 g();

    InterfaceC0151q iterator();

    boolean l();

    G limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    C0146l max();

    C0146l min();

    G parallel();

    G peek(DoubleConsumer doubleConsumer);

    IntStream q();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C0146l reduce(DoubleBinaryOperator doubleBinaryOperator);

    G sequential();

    G skip(long j);

    G sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.E spliterator();

    double sum();

    C0142h summaryStatistics();

    double[] toArray();

    boolean u();
}
