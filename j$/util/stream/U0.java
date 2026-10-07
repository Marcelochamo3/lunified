package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class U0 extends W0 implements H0 {
    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Integer[] numArr, int i) {
        AbstractC0274z0.o(this, numArr, i);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.r(this, consumer);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.u(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final j$.util.N spliterator() {
        return new C0210l1(this);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return new C0210l1(this);
    }
}
