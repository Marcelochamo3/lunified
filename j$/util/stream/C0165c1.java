package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0165c1 extends AbstractC0180f1 implements H0 {
    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        AbstractC0274z0.o(this, numArr, i);
    }

    @Override // j$.util.stream.AbstractC0180f1, j$.util.stream.L0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC0180f1, j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.K0
    public final Object e() {
        return AbstractC0274z0.e;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0180f1, j$.util.stream.L0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.u(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final j$.util.N spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }
}
