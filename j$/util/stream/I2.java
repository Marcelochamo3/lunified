package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class I2 extends C {
    @Override // j$.util.stream.AbstractC0158b
    public final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0177e3.SORTED.u(abstractC0158b.G())) {
            return abstractC0158b.y(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((F0) abstractC0158b.y(spliterator, true, intFunction)).e();
        Arrays.sort(dArr);
        return new Y0(dArr);
    }

    @Override // j$.util.stream.AbstractC0158b
    public final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        if (EnumC0177e3.SORTED.u(i)) {
            return interfaceC0236q2;
        }
        return EnumC0177e3.SIZED.u(i) ? new N2(interfaceC0236q2) : new F2(interfaceC0236q2);
    }
}
