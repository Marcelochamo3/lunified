package j$.util.stream;

import j$.util.OptionalInt;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class J extends M implements InterfaceC0226o2 {
    static final H c;
    static final H d;

    static {
        EnumC0182f3 enumC0182f3 = EnumC0182f3.INT_VALUE;
        c = new H(true, enumC0182f3, OptionalInt.empty(), new C0223o(13), new C0203k(9));
        d = new H(false, enumC0182f3, OptionalInt.empty(), new C0223o(13), new C0203k(9));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        p(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
