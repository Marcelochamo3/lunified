package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class T0 extends W0 implements F0 {
    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void i(Double[] dArr, int i) {
        AbstractC0274z0.n(this, dArr, i);
    }

    @Override // j$.util.stream.K0
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0274z0.q(this, consumer);
    }

    @Override // j$.util.stream.L0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ F0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.t(this, j, j2);
    }

    @Override // j$.util.stream.L0
    public final j$.util.N spliterator() {
        return new C0205k1(this);
    }

    @Override // j$.util.stream.L0
    public final Spliterator spliterator() {
        return new C0205k1(this);
    }
}
