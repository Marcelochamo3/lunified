package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class Y1 extends AbstractC0161b2 implements InterfaceC0226o2 {
    @Override // j$.util.stream.AbstractC0161b2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        this.b++;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.b += ((AbstractC0161b2) v1).b;
    }

    @Override // j$.util.stream.W1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC0226o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC0274z0.g(this, num);
    }
}
