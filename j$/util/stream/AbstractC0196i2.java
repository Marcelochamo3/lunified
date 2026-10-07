package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0196i2 extends AbstractC0158b implements Stream {
    @Override // j$.util.stream.AbstractC0158b
    final L0 B(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0274z0.E(abstractC0158b, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC0158b
    final boolean D(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        boolean zN;
        do {
            zN = interfaceC0236q2.n();
            if (zN) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0236q2));
        return zN;
    }

    @Override // j$.util.stream.AbstractC0158b
    final EnumC0182f3 E() {
        return EnumC0182f3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC0158b
    final D0 J(long j, IntFunction intFunction) {
        return AbstractC0274z0.D(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator Q(AbstractC0158b abstractC0158b, Supplier supplier, boolean z) {
        return new I3(abstractC0158b, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC0274z0.a0(EnumC0262w0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC0274z0.a0(EnumC0262w0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object objZ;
        if (isParallel() && collector.characteristics().contains(EnumC0188h.CONCURRENT) && (!H() || collector.characteristics().contains(EnumC0188h.UNORDERED))) {
            objZ = collector.supplier().get();
            forEach(new C0208l(4, collector.accumulator(), objZ));
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            objZ = z(new M1(EnumC0182f3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        }
        return collector.characteristics().contains(EnumC0188h.IDENTITY_FINISH) ? objZ : collector.finisher().apply(objZ);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return z(new F1(EnumC0182f3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) z(new H1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, EnumC0177e3.m | EnumC0177e3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = U3.a;
        Objects.requireNonNull(predicate);
        return new Q3(this, U3.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C0257v(this, EnumC0177e3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) z(L.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) z(L.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        Objects.requireNonNull(function);
        return new C0181f2(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, function, 1);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        z(new S(consumer, true));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0229p0 k(C0153a c0153a) {
        Objects.requireNonNull(c0153a);
        return new C0199j0(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, c0153a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return AbstractC0274z0.b0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C0181f2(this, EnumC0177e3.p | EnumC0177e3.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final G mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new A(this, EnumC0177e3.p | EnumC0177e3.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new Y(this, EnumC0177e3.p | EnumC0177e3.n, toIntFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0229p0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C0199j0(this, EnumC0177e3.p | EnumC0177e3.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) z(AbstractC0274z0.a0(EnumC0262w0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final IntStream p(C0153a c0153a) {
        Objects.requireNonNull(c0153a);
        return new Y(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, c0153a, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0257v(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) z(new D1(EnumC0182f3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC0182f3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return z(new F1(EnumC0182f3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC0274z0.b0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = U3.a;
        Objects.requireNonNull(predicate);
        return new O3(this, U3.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C0174e0(11));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0274z0.M(A(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final G v(C0153a c0153a) {
        Objects.requireNonNull(c0153a);
        return new A(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, c0153a, 3);
    }
}
