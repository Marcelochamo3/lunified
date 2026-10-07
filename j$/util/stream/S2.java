package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class S2 extends Y2 implements j$.util.E {
    final /* synthetic */ T2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S2(T2 t2, int i, int i2, int i3, int i4) {
        super(t2, i, i2, i3, i4);
        this.g = t2;
    }

    @Override // j$.util.stream.Y2
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N b(Object obj, int i, int i2) {
        return Spliterators.j((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N c(int i, int i2, int i3, int i4) {
        return new S2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.f(this, consumer);
    }
}
