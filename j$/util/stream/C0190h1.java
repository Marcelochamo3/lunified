package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0190h1 implements H0 {
    final int[] a;
    int b;

    C0190h1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    C0190h1(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
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
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.K0
    public final Object e() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.K0
    public final void f(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.r(this, consumer);
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
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        AbstractC0274z0.o(this, numArr, i);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.u(this, j, j2);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final j$.util.N spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return Spliterators.k(this.a, 0, this.b);
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
