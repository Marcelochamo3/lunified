package j$.util.stream;

import j$.util.C0145k;
import j$.util.C0146l;
import j$.util.C0147m;
import j$.util.InterfaceC0282y;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0214m0 extends AbstractC0158b implements InterfaceC0229p0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.K V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.K) {
            return (j$.util.K) spliterator;
        }
        if (!N3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        N3.a(AbstractC0158b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 B(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0274z0.H(abstractC0158b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0158b
    final boolean D(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        LongConsumer c0179f0;
        boolean zN;
        j$.util.K kV = V(spliterator);
        if (interfaceC0236q2 instanceof LongConsumer) {
            c0179f0 = (LongConsumer) interfaceC0236q2;
        } else {
            if (N3.a) {
                N3.a(AbstractC0158b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC0236q2);
            c0179f0 = new C0179f0(interfaceC0236q2);
        }
        do {
            zN = interfaceC0236q2.n();
            if (zN) {
                break;
            }
        } while (kV.tryAdvance(c0179f0));
        return zN;
    }

    @Override // j$.util.stream.AbstractC0158b
    final EnumC0182f3 E() {
        return EnumC0182f3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0158b
    final D0 J(long j, IntFunction intFunction) {
        return AbstractC0274z0.T(j);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator Q(AbstractC0158b abstractC0158b, Supplier supplier, boolean z) {
        return new C0251t3(abstractC0158b, supplier, z);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 a() {
        Objects.requireNonNull(null);
        return new C0269y(this, EnumC0177e3.t, 5);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final G asDoubleStream() {
        return new C0261w(this, EnumC0177e3.n, 5);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0146l average() {
        long[] jArr = (long[]) collect(new C0174e0(4), new C0174e0(5), new C0174e0(6));
        long j = jArr[0];
        return j > 0 ? C0146l.d(jArr[1] / j) : C0146l.a();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 b() {
        Objects.requireNonNull(null);
        return new C0269y(this, EnumC0177e3.p | EnumC0177e3.n, 3);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final Stream boxed() {
        return new C0257v(this, 0, new C0174e0(3), 2);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 c(C0153a c0153a) {
        Objects.requireNonNull(c0153a);
        return new C0199j0(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, c0153a, 0);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0247t c0247t = new C0247t(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c0247t);
        return z(new F1(EnumC0182f3.LONG_VALUE, (BinaryOperator) c0247t, (Object) objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final long count() {
        return ((Long) z(new H1(0))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 distinct() {
        return ((AbstractC0196i2) ((AbstractC0196i2) boxed()).distinct()).mapToLong(new C0174e0(0));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0147m findAny() {
        return (C0147m) z(K.d);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0147m findFirst() {
        return (C0147m) z(K.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        z(new Q(longConsumer, true));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final G h() {
        Objects.requireNonNull(null);
        return new C0261w(this, EnumC0177e3.p | EnumC0177e3.n, 6);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final InterfaceC0282y iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final boolean j() {
        return ((Boolean) z(AbstractC0274z0.Z(EnumC0262w0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 limit(long j) {
        if (j >= 0) {
            return AbstractC0274z0.Y(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C0257v(this, EnumC0177e3.p | EnumC0177e3.n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0147m max() {
        return reduce(new C0174e0(7));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0147m min() {
        return reduce(new C0223o(29));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final boolean n() {
        return ((Boolean) z(AbstractC0274z0.Z(EnumC0262w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C0199j0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) z(new B1(EnumC0182f3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0147m reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (C0147m) z(new D1(EnumC0182f3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final boolean s() {
        return ((Boolean) z(AbstractC0274z0.Z(EnumC0262w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC0274z0.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final InterfaceC0229p0 sorted() {
        return new K2(this, EnumC0177e3.q | EnumC0177e3.f161o, 0);
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final j$.util.K spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final long sum() {
        return reduce(0L, new C0174e0(8));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final C0145k summaryStatistics() {
        return (C0145k) collect(new C0203k(25), new C0223o(28), new C0174e0(1));
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C0265x(this, EnumC0177e3.p | EnumC0177e3.n, 3);
    }

    @Override // j$.util.stream.InterfaceC0229p0
    public final long[] toArray() {
        return (long[]) AbstractC0274z0.P((J0) A(new C0174e0(2))).e();
    }
}
