package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0245s2 extends AbstractC0191h2 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0245s2(AbstractC0158b abstractC0158b, int i, long j, long j2) {
        super(abstractC0158b, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long jMin;
        long jC = abstractC0158b.C(spliterator);
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0274z0.E(abstractC0158b, AbstractC0274z0.C(abstractC0158b.F(), spliterator, this.m, this.n), true, intFunction);
        }
        if (EnumC0177e3.ORDERED.u(abstractC0158b.G())) {
            return (L0) new A2(this, abstractC0158b, spliterator, intFunction, this.m, this.n).invoke();
        }
        Spliterator spliteratorT = abstractC0158b.T(spliterator);
        long j2 = this.m;
        long j3 = this.n;
        if (j2 <= jC) {
            jMin = j3 >= 0 ? Math.min(j3, jC - j2) : jC - j2;
            j = 0;
        } else {
            j = j2;
            jMin = j3;
        }
        return AbstractC0274z0.E(this, new E3(spliteratorT, j, jMin), true, intFunction);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator L(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        long j;
        long j2;
        long jC = abstractC0158b.C(spliterator);
        long j3 = this.n;
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorT = abstractC0158b.T(spliterator);
            long j4 = this.m;
            return new y3(spliteratorT, j4, AbstractC0274z0.B(j4, j3));
        }
        if (EnumC0177e3.ORDERED.u(abstractC0158b.G())) {
            return ((L0) new A2(this, abstractC0158b, spliterator, new C0174e0(10), this.m, this.n).invoke()).spliterator();
        }
        Spliterator spliteratorT2 = abstractC0158b.T(spliterator);
        long j5 = this.m;
        if (j5 <= jC) {
            long jMin = jC - j5;
            if (j3 >= 0) {
                jMin = Math.min(j3, jMin);
            }
            j = jMin;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new E3(spliteratorT2, j2, j);
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        return new C0240r2(this, interfaceC0236q2);
    }
}
