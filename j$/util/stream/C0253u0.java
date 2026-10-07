package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0253u0 extends AbstractC0258v0 implements InterfaceC0221n2 {
    @Override // j$.util.stream.AbstractC0258v0, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0221n2
    public final /* synthetic */ void p(Double d) {
        AbstractC0274z0.e(this, d);
    }
}
