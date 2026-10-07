package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
class Y0 implements F0 {
    final double[] a;
    int b;

    Y0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    Y0(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.K0
    public final void d(Object obj, int i) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.K0
    public final Object e() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.K0
    public final void f(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.q(this, consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC0274z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Double[] dArr, int i) {
        AbstractC0274z0.n(this, dArr, i);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ F0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.N spliterator() {
        return Spliterators.j(this.a, 0, this.b);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return Spliterators.j(this.a, 0, this.b);
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
