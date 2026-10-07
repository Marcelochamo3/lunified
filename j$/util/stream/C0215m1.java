package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0215m1 extends AbstractC0220n1 implements j$.util.K {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.h(this, consumer);
    }
}
