package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class X0 extends N0 {
    @Override // j$.util.stream.L0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.L0
    public final L0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.h(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 <= jCount) {
            return this.a.h(j, j2, intFunction);
        }
        return AbstractC0274z0.I(EnumC0182f3.REFERENCE, this.a.h(j, jCount, intFunction), this.b.h(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        L0 l0 = this.a;
        l0.i(objArr, i);
        this.b.i(objArr, i + ((int) l0.count()));
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return new C0225o1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
