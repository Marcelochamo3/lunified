package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
final class L extends M {
    static final H c;
    static final H d;

    static {
        EnumC0182f3 enumC0182f3 = EnumC0182f3.REFERENCE;
        c = new H(true, enumC0182f3, Optional.empty(), new C0223o(15), new C0203k(11));
        d = new H(false, enumC0182f3, Optional.empty(), new C0223o(15), new C0203k(11));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
