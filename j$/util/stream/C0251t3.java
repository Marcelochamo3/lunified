package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0251t3 extends AbstractC0187g3 implements j$.util.K {
    @Override // j$.util.stream.AbstractC0187g3
    final void d() {
        X2 x2 = new X2();
        this.h = x2;
        Objects.requireNonNull(x2);
        this.e = this.b.S(new C0246s3(x2, 0));
        this.f = new C0153a(this, 4);
    }

    @Override // j$.util.stream.AbstractC0187g3
    final AbstractC0187g3 e(Spliterator spliterator) {
        return new C0251t3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.c(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        C0246s3 c0246s3 = new C0246s3(longConsumer, 1);
        this.b.R(this.d, c0246s3);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.h(this, consumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            X2 x2 = (X2) this.h;
            long j = this.g;
            int iT = x2.t(j);
            longConsumer.accept((x2.c == 0 && iT == 0) ? ((long[]) x2.e)[(int) j] : ((long[][]) x2.f)[iT][(int) (j - x2.d[iT])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.K trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final j$.util.N trySplit() {
        return (j$.util.K) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0187g3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.K) super.trySplit();
    }
}
