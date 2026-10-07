package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Q extends T implements InterfaceC0231p2 {
    final LongConsumer b;

    Q(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b.accept(j);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
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

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }
}
