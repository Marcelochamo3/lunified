package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0205k1 extends AbstractC0220n1 implements j$.util.E {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.f(this, consumer);
    }
}
