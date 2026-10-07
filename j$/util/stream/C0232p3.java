package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0232p3 extends AbstractC0187g3 implements j$.util.E {
    @Override // j$.util.stream.AbstractC0187g3
    final void d() {
        T2 t2 = new T2();
        this.h = t2;
        Objects.requireNonNull(t2);
        this.e = this.b.S(new C0227o3(t2, 0));
        this.f = new C0153a(this, 2);
    }

    @Override // j$.util.stream.AbstractC0187g3
    final AbstractC0187g3 e(Spliterator spliterator) {
        return new C0232p3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.a(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C0227o3 c0227o3 = new C0227o3(doubleConsumer, 1);
        this.b.R(this.d, c0227o3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.f(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            T2 t2 = (T2) this.h;
            long j = this.g;
            int iT = t2.t(j);
            doubleConsumer.accept((t2.c == 0 && iT == 0) ? ((double[]) t2.e)[(int) j] : ((double[][]) t2.f)[iT][(int) (j - t2.d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.E trySplit() {
        return (j$.util.E) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.E) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.E) super.trySplit();
    }
}
