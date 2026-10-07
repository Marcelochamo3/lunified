package j$.util.stream;

import j$.util.C0147m;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
final class K extends M implements InterfaceC0231p2 {
    static final H c;
    static final H d;

    static {
        EnumC0182f3 enumC0182f3 = EnumC0182f3.LONG_VALUE;
        c = new H(true, enumC0182f3, C0147m.a(), new C0223o(14), new C0203k(10));
        d = new H(false, enumC0182f3, C0147m.a(), new C0223o(14), new C0203k(10));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C0147m.d(((Long) this.b).longValue());
        }
        return null;
    }
}
