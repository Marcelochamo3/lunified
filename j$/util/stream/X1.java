package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class X1 extends AbstractC0161b2 implements InterfaceC0221n2 {
    @Override // j$.util.stream.AbstractC0161b2, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b += ((AbstractC0161b2) v1).b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC0221n2
    public final /* synthetic */ void p(Double d) {
        AbstractC0274z0.e(this, d);
    }
}
