package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class r extends AbstractC0191h2 {
    static P0 U(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        C0223o c0223o = new C0223o(0);
        C0223o c0223o2 = new C0223o(1);
        C0223o c0223o3 = new C0223o(2);
        Objects.requireNonNull(c0223o);
        Objects.requireNonNull(c0223o2);
        Objects.requireNonNull(c0223o3);
        return new P0((Collection) new F1(EnumC0182f3.REFERENCE, c0223o3, c0223o2, c0223o, 3).c(abstractC0158b, spliterator));
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0177e3.DISTINCT.u(abstractC0158b.G())) {
            return abstractC0158b.y(spliterator, false, intFunction);
        }
        if (EnumC0177e3.ORDERED.u(abstractC0158b.G())) {
            return U(abstractC0158b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C0208l c0208l = new C0208l(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c0208l);
        new S(c0208l, false).e(abstractC0158b, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new P0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator L(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        if (EnumC0177e3.DISTINCT.u(abstractC0158b.G())) {
            return abstractC0158b.T(spliterator);
        }
        return EnumC0177e3.ORDERED.u(abstractC0158b.G()) ? U(abstractC0158b, spliterator).spliterator() : new C0222n3(abstractC0158b.T(spliterator));
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        if (EnumC0177e3.DISTINCT.u(i)) {
            return interfaceC0236q2;
        }
        return EnumC0177e3.SORTED.u(i) ? new C0228p(interfaceC0236q2) : new C0233q(interfaceC0236q2);
    }
}
