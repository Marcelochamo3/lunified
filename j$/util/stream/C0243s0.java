package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0243s0 extends AbstractC0258v0 implements InterfaceC0226o2 {
    @Override // j$.util.stream.AbstractC0258v0, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }
}
