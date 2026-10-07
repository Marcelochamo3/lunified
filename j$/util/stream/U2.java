package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class U2 extends Y2 implements j$.util.H {
    final /* synthetic */ V2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U2(V2 v2, int i, int i2, int i3, int i4) {
        super(v2, i, i2, i3, i4);
        this.g = v2;
    }

    @Override // j$.util.stream.Y2
    final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N b(Object obj, int i, int i2) {
        return Spliterators.k((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.Y2
    final j$.util.N c(int i, int i2, int i3, int i4) {
        return new U2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.g(this, consumer);
    }
}
