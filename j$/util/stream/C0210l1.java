package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0210l1 extends AbstractC0220n1 implements j$.util.H {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.g(this, consumer);
    }
}
