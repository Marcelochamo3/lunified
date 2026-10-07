package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamSupport {
    public static G a(j$.util.E e) {
        return new B(e, EnumC0177e3.t(e), false);
    }

    public static IntStream b(j$.util.H h) {
        return new C0159b0(h, EnumC0177e3.t(h), false);
    }

    public static InterfaceC0229p0 c(j$.util.K k) {
        return new C0204k0(k, EnumC0177e3.t(k), false);
    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new C0186g2(spliterator, EnumC0177e3.t(spliterator), z);
    }
}
