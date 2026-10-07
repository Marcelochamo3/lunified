package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class L2 extends AbstractC0191h2 {
    private final boolean m;
    private final Comparator n;

    L2(AbstractC0158b abstractC0158b) {
        super(abstractC0158b, EnumC0177e3.q | EnumC0177e3.f161o, 0);
        this.m = true;
        this.n = j$.util.Comparator.CC.a();
    }

    L2(AbstractC0158b abstractC0158b, Comparator comparator) {
        super(abstractC0158b, EnumC0177e3.q | EnumC0177e3.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC0158b
    public final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0177e3.SORTED.u(abstractC0158b.G()) && this.m) {
            return abstractC0158b.y(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC0158b.y(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.n);
        return new O0(objArrO);
    }

    @Override // j$.util.stream.AbstractC0158b
    public final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        if (EnumC0177e3.SORTED.u(i) && this.m) {
            return interfaceC0236q2;
        }
        boolean zU = EnumC0177e3.SIZED.u(i);
        Comparator comparator = this.n;
        return zU ? new Q2(interfaceC0236q2, comparator) : new M2(interfaceC0236q2, comparator);
    }
}
