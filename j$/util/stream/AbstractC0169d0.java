package j$.util.stream;

import j$.util.C0143i;
import j$.util.C0146l;
import j$.util.InterfaceC0278u;
import j$.util.Objects;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0169d0 extends AbstractC0158b implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.H V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.H) {
            return (j$.util.H) spliterator;
        }
        if (!N3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        N3.a(AbstractC0158b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 B(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0274z0.G(abstractC0158b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0158b
    final boolean D(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        IntConsumer w;
        boolean zN;
        j$.util.H hV = V(spliterator);
        if (interfaceC0236q2 instanceof IntConsumer) {
            w = (IntConsumer) interfaceC0236q2;
        } else {
            if (N3.a) {
                N3.a(AbstractC0158b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC0236q2);
            w = new W(interfaceC0236q2);
        }
        do {
            zN = interfaceC0236q2.n();
            if (zN) {
                break;
            }
        } while (hV.tryAdvance(w));
        return zN;
    }

    @Override // j$.util.stream.AbstractC0158b
    final EnumC0182f3 E() {
        return EnumC0182f3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0158b
    final D0 J(long j, IntFunction intFunction) {
        return AbstractC0274z0.S(j);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator Q(AbstractC0158b abstractC0158b, Supplier supplier, boolean z) {
        return new C0241r3(abstractC0158b, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new C0265x(this, EnumC0177e3.t, 2);
    }

    @Override // j$.util.stream.IntStream
    public final G asDoubleStream() {
        return new C0261w(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0229p0 asLongStream() {
        return new C0269y(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C0146l average() {
        long[] jArr = (long[]) collect(new C0223o(25), new C0223o(26), new C0223o(27));
        long j = jArr[0];
        return j > 0 ? C0146l.d(jArr[1] / j) : C0146l.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0257v(this, 0, new C0223o(19), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0247t c0247t = new C0247t(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c0247t);
        return z(new F1(EnumC0182f3.INT_VALUE, (BinaryOperator) c0247t, (Object) objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) z(new H1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final G d() {
        Objects.requireNonNull(null);
        return new C0261w(this, EnumC0177e3.p | EnumC0177e3.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0196i2) ((AbstractC0196i2) boxed()).distinct()).mapToInt(new C0223o(18));
    }

    @Override // j$.util.stream.IntStream
    public final boolean e() {
        return ((Boolean) z(AbstractC0274z0.X(EnumC0262w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) z(J.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) z(J.c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        z(new P(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC0229p0 i() {
        Objects.requireNonNull(null);
        return new C0269y(this, EnumC0177e3.p | EnumC0177e3.n, 2);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final InterfaceC0278u iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC0274z0.W(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream m(R0 r0) {
        Objects.requireNonNull(r0);
        return new Y(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, r0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new Y(this, EnumC0177e3.p | EnumC0177e3.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C0257v(this, EnumC0177e3.p | EnumC0177e3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new C0223o(24));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new C0223o(20));
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((Boolean) z(AbstractC0274z0.X(EnumC0262w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new Y(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) z(AbstractC0274z0.X(EnumC0262w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) z(new Q1(EnumC0182f3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (OptionalInt) z(new D1(EnumC0182f3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC0274z0.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new J2(this, EnumC0177e3.q | EnumC0177e3.f161o, 0);
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final j$.util.H spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C0223o(23));
    }

    @Override // j$.util.stream.IntStream
    public final C0143i summaryStatistics() {
        return (C0143i) collect(new C0203k(24), new C0223o(21), new C0223o(22));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0274z0.O((H0) A(new C0223o(17))).e();
    }
}
