package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class B3 extends D3 implements j$.util.H, IntConsumer {
    int f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new B3((j$.util.H) spliterator, this);
    }

    @Override // j$.util.stream.D3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.D3
    protected final AbstractC0207k3 f(int i) {
        return new C0197i3(i);
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
