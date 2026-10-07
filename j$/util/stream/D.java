package j$.util.stream;

import j$.util.C0142h;
import j$.util.C0146l;
import j$.util.InterfaceC0151q;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
abstract class D extends AbstractC0158b implements G {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.E V(Spliterator spliterator) {
        if (spliterator instanceof j$.util.E) {
            return (j$.util.E) spliterator;
        }
        if (!N3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        N3.a(AbstractC0158b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 B(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0274z0.F(abstractC0158b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0158b
    final boolean D(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        DoubleConsumer c0242s;
        boolean zN;
        j$.util.E eV = V(spliterator);
        if (interfaceC0236q2 instanceof DoubleConsumer) {
            c0242s = (DoubleConsumer) interfaceC0236q2;
        } else {
            if (N3.a) {
                N3.a(AbstractC0158b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC0236q2);
            c0242s = new C0242s(interfaceC0236q2);
        }
        do {
            zN = interfaceC0236q2.n();
            if (zN) {
                break;
            }
        } while (eV.tryAdvance(c0242s));
        return zN;
    }

    @Override // j$.util.stream.AbstractC0158b
    final EnumC0182f3 E() {
        return EnumC0182f3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0158b
    final D0 J(long j, IntFunction intFunction) {
        return AbstractC0274z0.J(j);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator Q(AbstractC0158b abstractC0158b, Supplier supplier, boolean z) {
        return new C0232p3(abstractC0158b, supplier, z);
    }

    @Override // j$.util.stream.G
    public final G a() {
        Objects.requireNonNull(null);
        return new C0261w(this, EnumC0177e3.t, 2);
    }

    @Override // j$.util.stream.G
    public final C0146l average() {
        double[] dArr = (double[]) collect(new C0223o(4), new C0203k(5), new C0203k(6));
        if (dArr[2] <= 0.0d) {
            return C0146l.a();
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return C0146l.d(d / dArr[2]);
    }

    @Override // j$.util.stream.G
    public final G b() {
        Objects.requireNonNull(null);
        return new C0261w(this, EnumC0177e3.p | EnumC0177e3.n, 0);
    }

    @Override // j$.util.stream.G
    public final Stream boxed() {
        return new C0257v(this, 0, new C0223o(7), 0);
    }

    @Override // j$.util.stream.G
    public final G c(C0153a c0153a) {
        Objects.requireNonNull(c0153a);
        return new A(this, EnumC0177e3.p | EnumC0177e3.n | EnumC0177e3.t, c0153a, 0);
    }

    @Override // j$.util.stream.G
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0247t c0247t = new C0247t(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c0247t);
        return z(new F1(EnumC0182f3.DOUBLE_VALUE, (BinaryOperator) c0247t, (Object) objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.G
    public final long count() {
        return ((Long) z(new H1(1))).longValue();
    }

    @Override // j$.util.stream.G
    public final G distinct() {
        return ((AbstractC0196i2) ((AbstractC0196i2) boxed()).distinct()).mapToDouble(new C0223o(8));
    }

    @Override // j$.util.stream.G
    public final boolean f() {
        return ((Boolean) z(AbstractC0274z0.V(EnumC0262w0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final C0146l findAny() {
        return (C0146l) z(I.d);
    }

    @Override // j$.util.stream.G
    public final C0146l findFirst() {
        return (C0146l) z(I.c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        z(new O(doubleConsumer, true));
    }

    @Override // j$.util.stream.G
    public final InterfaceC0229p0 g() {
        Objects.requireNonNull(null);
        return new C0269y(this, EnumC0177e3.p | EnumC0177e3.n, 0);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final InterfaceC0151q iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.G
    public final boolean l() {
        return ((Boolean) z(AbstractC0274z0.V(EnumC0262w0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.G
    public final G limit(long j) {
        if (j >= 0) {
            return AbstractC0274z0.U(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.G
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C0257v(this, EnumC0177e3.p | EnumC0177e3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.G
    public final C0146l max() {
        return reduce(new C0223o(10));
    }

    @Override // j$.util.stream.G
    public final C0146l min() {
        return reduce(new C0223o(3));
    }

    @Override // j$.util.stream.G
    public final G peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new A(this, doubleConsumer);
    }

    @Override // j$.util.stream.G
    public final IntStream q() {
        Objects.requireNonNull(null);
        return new C0265x(this, EnumC0177e3.p | EnumC0177e3.n, 0);
    }

    @Override // j$.util.stream.G
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) z(new J1(EnumC0182f3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.G
    public final C0146l reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C0146l) z(new D1(EnumC0182f3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.G
    public final G skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC0274z0.U(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.G
    public final G sorted() {
        return new I2(this, EnumC0177e3.q | EnumC0177e3.f161o, 0);
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final j$.util.E spliterator() {
        return V(super.spliterator());
    }

    @Override // j$.util.stream.G
    public final double sum() {
        double[] dArr = (double[]) collect(new C0223o(11), new C0203k(7), new C0203k(4));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.G
    public final C0142h summaryStatistics() {
        return (C0142h) collect(new C0203k(20), new C0223o(5), new C0223o(6));
    }

    @Override // j$.util.stream.G
    public final double[] toArray() {
        return (double[]) AbstractC0274z0.N((F0) A(new C0223o(9))).e();
    }

    @Override // j$.util.stream.G
    public final boolean u() {
        return ((Boolean) z(AbstractC0274z0.V(EnumC0262w0.NONE))).booleanValue();
    }
}
