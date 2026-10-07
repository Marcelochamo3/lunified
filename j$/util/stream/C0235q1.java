package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0235q1 implements J0 {
    final long[] a;
    int b;

    C0235q1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    C0235q1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
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
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.K0
    public final Object e() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.K0
    public final void f(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.s(this, consumer);
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
    public final /* synthetic */ void i(Long[] lArr, int i) {
        AbstractC0274z0.p(this, lArr, i);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ J0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.v(this, j, j2);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.N spliterator() {
        return Spliterators.l(this.a, 0, this.b);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return Spliterators.l(this.a, 0, this.b);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
