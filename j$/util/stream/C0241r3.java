package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0241r3 extends AbstractC0187g3 implements j$.util.H {
    @Override // j$.util.stream.AbstractC0187g3
    final void d() {
        V2 v2 = new V2();
        this.h = v2;
        Objects.requireNonNull(v2);
        this.e = this.b.S(new C0237q3(v2, 0));
        this.f = new C0153a(this, 3);
    }

    @Override // j$.util.stream.AbstractC0187g3
    final AbstractC0187g3 e(Spliterator spliterator) {
        return new C0241r3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.b(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C0237q3 c0237q3 = new C0237q3(intConsumer, 1);
        this.b.R(this.d, c0237q3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.g(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            V2 v2 = (V2) this.h;
            long j = this.g;
            int iT = v2.t(j);
            intConsumer.accept((v2.c == 0 && iT == 0) ? ((int[]) v2.e)[(int) j] : ((int[][]) v2.f)[iT][(int) (j - v2.d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.H) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.H) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.H) super.trySplit();
    }
}
