package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class J2 extends AbstractC0164c0 {
    @Override // j$.util.stream.AbstractC0158b
    public final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0177e3.SORTED.u(abstractC0158b.G())) {
            return abstractC0158b.y(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((H0) abstractC0158b.y(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new C0190h1(iArr);
    }

    @Override // j$.util.stream.AbstractC0158b
    public final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        if (EnumC0177e3.SORTED.u(i)) {
            return interfaceC0236q2;
        }
        return EnumC0177e3.SIZED.u(i) ? new O2(interfaceC0236q2) : new G2(interfaceC0236q2);
    }
}
