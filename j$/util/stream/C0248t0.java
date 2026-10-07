package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0248t0 extends AbstractC0258v0 implements InterfaceC0231p2 {
    @Override // j$.util.stream.AbstractC0258v0, j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }
}
