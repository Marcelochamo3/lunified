package j$.util.stream;

import j$.util.C0146l;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class I extends M implements InterfaceC0221n2 {
    static final H c;
    static final H d;

    static {
        EnumC0182f3 enumC0182f3 = EnumC0182f3.DOUBLE_VALUE;
        c = new H(true, enumC0182f3, C0146l.a(), new C0223o(12), new C0203k(8));
        d = new H(false, enumC0182f3, C0146l.a(), new C0223o(12), new C0203k(8));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0236q2
    public final void accept(double d2) {
        p(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C0146l.d(((Double) this.b).doubleValue());
        }
        return null;
    }
}
