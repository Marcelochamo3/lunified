package j$.util.stream;

import j$.util.C0140f;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0274z0 implements K3 {
    private static final C0175e1 a = new C0175e1();
    private static final H0 b = new C0165c1();
    private static final J0 c = new C0170d1();
    private static final F0 d = new C0160b1();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    AbstractC0274z0(EnumC0182f3 enumC0182f3) {
    }

    static long A(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    static long B(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator C(EnumC0182f3 enumC0182f3, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC0276z2.a[enumC0182f3.ordinal()];
        if (i == 1) {
            return new y3(spliterator, j, j4);
        }
        if (i == 2) {
            return new v3((j$.util.H) spliterator, j, j4);
        }
        if (i == 3) {
            return new w3((j$.util.K) spliterator, j, j4);
        }
        if (i == 4) {
            return new C0256u3((j$.util.E) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape " + enumC0182f3);
    }

    static D0 D(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0271y1() : new C0185g1(j, intFunction);
    }

    public static L0 E(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jC = abstractC0158b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            R0 r0 = new R0();
            r0.a = intFunction;
            L0 l0 = (L0) new Q0(abstractC0158b, spliterator, r0, new C0203k(18), 3).invoke();
            return z ? M(l0, intFunction) : l0;
        }
        if (jC >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jC);
        new C0263w1(spliterator, abstractC0158b, objArr).invoke();
        return new O0(objArr);
    }

    public static F0 F(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z) {
        long jC = abstractC0158b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f0 = (F0) new Q0(abstractC0158b, spliterator, new C0203k(12), new C0203k(13), 0).invoke();
            return z ? N(f0) : f0;
        }
        if (jC >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jC];
        new C0249t1(spliterator, abstractC0158b, dArr).invoke();
        return new Y0(dArr);
    }

    public static H0 G(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z) {
        long jC = abstractC0158b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h0 = (H0) new Q0(abstractC0158b, spliterator, new C0203k(14), new C0203k(15), 1).invoke();
            return z ? O(h0) : h0;
        }
        if (jC >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jC];
        new C0254u1(spliterator, abstractC0158b, iArr).invoke();
        return new C0190h1(iArr);
    }

    public static J0 H(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z) {
        long jC = abstractC0158b.C(spliterator);
        if (jC < 0 || !spliterator.hasCharacteristics(16384)) {
            J0 j0 = (J0) new Q0(abstractC0158b, spliterator, new C0203k(16), new C0203k(17), 2).invoke();
            return z ? P(j0) : j0;
        }
        if (jC >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jC];
        new C0259v1(spliterator, abstractC0158b, jArr).invoke();
        return new C0235q1(jArr);
    }

    static N0 I(EnumC0182f3 enumC0182f3, L0 l0, L0 l1) {
        int i = M0.a[enumC0182f3.ordinal()];
        if (i == 1) {
            return new X0(l0, l1);
        }
        if (i == 2) {
            return new U0((H0) l0, (H0) l1);
        }
        if (i == 3) {
            return new V0((J0) l0, (J0) l1);
        }
        if (i == 4) {
            return new T0((F0) l0, (F0) l1);
        }
        throw new IllegalStateException("Unknown shape " + enumC0182f3);
    }

    static A0 J(long j) {
        return (j < 0 || j >= 2147483639) ? new C0155a1() : new Z0(j);
    }

    static AbstractC0180f1 K(EnumC0182f3 enumC0182f3) {
        L0 l0;
        int i = M0.a[enumC0182f3.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            l0 = b;
        } else if (i == 3) {
            l0 = c;
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape " + enumC0182f3);
            }
            l0 = d;
        }
        return (AbstractC0180f1) l0;
    }

    private static int L(long j) {
        return (j != -1 ? EnumC0177e3.u : 0) | EnumC0177e3.t;
    }

    public static L0 M(L0 l0, IntFunction intFunction) {
        if (l0.q() <= 0) {
            return l0;
        }
        long jCount = l0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new A1(l0, objArr, 1).invoke();
        return new O0(objArr);
    }

    public static F0 N(F0 f0) {
        if (f0.q() <= 0) {
            return f0;
        }
        long jCount = f0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C0275z1(f0, dArr, 0).invoke();
        return new Y0(dArr);
    }

    public static H0 O(H0 h0) {
        if (h0.q() <= 0) {
            return h0;
        }
        long jCount = h0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C0275z1(h0, iArr, 0).invoke();
        return new C0190h1(iArr);
    }

    public static J0 P(J0 j0) {
        if (j0.q() <= 0) {
            return j0;
        }
        long jCount = j0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C0275z1(j0, jArr, 0).invoke();
        return new C0235q1(jArr);
    }

    public static Set Q(Set set) {
        EnumC0188h enumC0188h;
        java.util.stream.Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC0188h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC0188h enumC0188h2 = (EnumC0188h) it.next();
                    if (enumC0188h2 == null) {
                        characteristics = null;
                    } else if (enumC0188h2 == EnumC0188h.CONCURRENT) {
                        characteristics = java.util.stream.Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = enumC0188h2 == EnumC0188h.UNORDERED ? java.util.stream.Collector.Characteristics.UNORDERED : java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e2) {
                    C0140f.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof java.util.stream.Collector.Characteristics)) {
            C0140f.a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                java.util.stream.Collector.Characteristics characteristics2 = (java.util.stream.Collector.Characteristics) it2.next();
                if (characteristics2 == null) {
                    enumC0188h = null;
                } else if (characteristics2 == java.util.stream.Collector.Characteristics.CONCURRENT) {
                    enumC0188h = EnumC0188h.CONCURRENT;
                } else {
                    enumC0188h = characteristics2 == java.util.stream.Collector.Characteristics.UNORDERED ? EnumC0188h.UNORDERED : EnumC0188h.IDENTITY_FINISH;
                }
                hashSet.add(enumC0188h);
            } catch (ClassCastException e3) {
                C0140f.a("java.util.stream.Collector.Characteristics", e3);
                throw null;
            }
        }
        return hashSet;
    }

    public static C0153a R(Function function) {
        C0153a c0153a = new C0153a(8);
        c0153a.b = function;
        return c0153a;
    }

    static B0 S(long j) {
        return (j < 0 || j >= 2147483639) ? new C0200j1() : new C0195i1(j);
    }

    static C0 T(long j) {
        return (j < 0 || j >= 2147483639) ? new C0244s1() : new C0239r1(j);
    }

    public static G U(AbstractC0158b abstractC0158b, long j, long j2) {
        if (j >= 0) {
            return new C0272y2(abstractC0158b, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0266x0 V(EnumC0262w0 enumC0262w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0262w0);
        return new C0266x0(EnumC0182f3.DOUBLE_VALUE, enumC0262w0, new C0234q0(enumC0262w0, 2));
    }

    public static IntStream W(AbstractC0158b abstractC0158b, long j, long j2) {
        if (j >= 0) {
            return new C0255u2(abstractC0158b, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0266x0 X(EnumC0262w0 enumC0262w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0262w0);
        return new C0266x0(EnumC0182f3.INT_VALUE, enumC0262w0, new C0234q0(enumC0262w0, 1));
    }

    public static InterfaceC0229p0 Y(AbstractC0158b abstractC0158b, long j, long j2) {
        if (j >= 0) {
            return new C0264w2(abstractC0158b, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0266x0 Z(EnumC0262w0 enumC0262w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC0262w0);
        return new C0266x0(EnumC0182f3.LONG_VALUE, enumC0262w0, new C0234q0(enumC0262w0, 0));
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C0266x0 a0(EnumC0262w0 enumC0262w0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC0262w0);
        return new C0266x0(EnumC0182f3.REFERENCE, enumC0262w0, new C0208l(1, enumC0262w0, predicate));
    }

    public static Stream b0(AbstractC0158b abstractC0158b, long j, long j2) {
        if (j >= 0) {
            return new C0245s2(abstractC0158b, L(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void e(InterfaceC0221n2 interfaceC0221n2, Double d2) {
        if (N3.a) {
            N3.a(interfaceC0221n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC0221n2.accept(d2.doubleValue());
    }

    public static void g(InterfaceC0226o2 interfaceC0226o2, Integer num) {
        if (N3.a) {
            N3.a(interfaceC0226o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC0226o2.accept(num.intValue());
    }

    public static void i(InterfaceC0231p2 interfaceC0231p2, Long l) {
        if (N3.a) {
            N3.a(interfaceC0231p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC0231p2.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(K0 k0, IntFunction intFunction) {
        if (N3.a) {
            N3.a(k0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (k0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) k0.count());
        k0.i(objArr, 0);
        return objArr;
    }

    public static void n(F0 f0, Double[] dArr, int i) {
        if (N3.a) {
            N3.a(f0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) f0.e();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(H0 h0, Integer[] numArr, int i) {
        if (N3.a) {
            N3.a(h0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) h0.e();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(J0 j0, Long[] lArr, int i) {
        if (N3.a) {
            N3.a(j0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) j0.e();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(F0 f0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f0.f((DoubleConsumer) consumer);
        } else {
            if (N3.a) {
                N3.a(f0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.E) f0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(H0 h0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h0.f((IntConsumer) consumer);
        } else {
            if (N3.a) {
                N3.a(h0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.H) h0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(J0 j0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            j0.f((LongConsumer) consumer);
        } else {
            if (N3.a) {
                N3.a(j0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.K) j0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static F0 t(F0 f0, long j, long j2) {
        if (j == 0 && j2 == f0.count()) {
            return f0;
        }
        long j3 = j2 - j;
        j$.util.E e2 = (j$.util.E) f0.spliterator();
        A0 a0J = J(j3);
        a0J.l(j3);
        for (int i = 0; i < j && e2.tryAdvance((DoubleConsumer) new E0(0)); i++) {
        }
        if (j2 == f0.count()) {
            e2.forEachRemaining((DoubleConsumer) a0J);
        } else {
            for (int i2 = 0; i2 < j3 && e2.tryAdvance((DoubleConsumer) a0J); i2++) {
            }
        }
        a0J.k();
        return a0J.a();
    }

    public static H0 u(H0 h0, long j, long j2) {
        if (j == 0 && j2 == h0.count()) {
            return h0;
        }
        long j3 = j2 - j;
        j$.util.H h = (j$.util.H) h0.spliterator();
        B0 b0S = S(j3);
        b0S.l(j3);
        for (int i = 0; i < j && h.tryAdvance((IntConsumer) new G0(0)); i++) {
        }
        if (j2 == h0.count()) {
            h.forEachRemaining((IntConsumer) b0S);
        } else {
            for (int i2 = 0; i2 < j3 && h.tryAdvance((IntConsumer) b0S); i2++) {
            }
        }
        b0S.k();
        return b0S.a();
    }

    public static J0 v(J0 j0, long j, long j2) {
        if (j == 0 && j2 == j0.count()) {
            return j0;
        }
        long j3 = j2 - j;
        j$.util.K k = (j$.util.K) j0.spliterator();
        C0 c0T = T(j3);
        c0T.l(j3);
        for (int i = 0; i < j && k.tryAdvance((LongConsumer) new I0(0)); i++) {
        }
        if (j2 == j0.count()) {
            k.forEachRemaining((LongConsumer) c0T);
        } else {
            for (int i2 = 0; i2 < j3 && k.tryAdvance((LongConsumer) c0T); i2++) {
            }
        }
        c0T.k();
        return c0T.a();
    }

    public static L0 w(L0 l0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == l0.count()) {
            return l0;
        }
        Spliterator spliterator = l0.spliterator();
        long j3 = j2 - j;
        D0 d0D = D(j3, intFunction);
        d0D.l(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C0174e0(9)); i++) {
        }
        if (j2 == l0.count()) {
            spliterator.forEachRemaining(d0D);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(d0D); i2++) {
            }
        }
        d0D.k();
        return d0D.a();
    }

    @Override // j$.util.stream.K3
    public Object b(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        V1 v1C0 = c0();
        abstractC0158b.R(spliterator, v1C0);
        return v1C0.get();
    }

    @Override // j$.util.stream.K3
    public Object c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        return ((V1) new C0166c2(this, abstractC0158b, spliterator).invoke()).get();
    }

    public abstract V1 c0();

    @Override // j$.util.stream.K3
    public /* synthetic */ int d() {
        return 0;
    }
}
