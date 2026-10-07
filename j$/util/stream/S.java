package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class S extends T {
    final Consumer b;

    S(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        abstractC0158b.R(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        e(abstractC0158b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }
}
