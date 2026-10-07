package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0255u2 extends AbstractC0164c0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0255u2(AbstractC0158b abstractC0158b, int i, long j, long j2) {
        super(abstractC0158b, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0158b
    final L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jC = abstractC0158b.C(spliterator);
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0274z0.G(abstractC0158b, AbstractC0274z0.C(abstractC0158b.F(), spliterator, this.m, this.n), true);
        }
        if (EnumC0177e3.ORDERED.u(abstractC0158b.G())) {
            return (L0) new A2(this, abstractC0158b, spliterator, intFunction, this.m, this.n).invoke();
        }
        j$.util.H h = (j$.util.H) abstractC0158b.T(spliterator);
        long j2 = this.m;
        long j3 = this.n;
        if (j2 <= jC) {
            jMin = j3 >= 0 ? Math.min(j3, jC - j2) : jC - j2;
            j = 0;
        } else {
            jMin = j3;
            j = j2;
        }
        return AbstractC0274z0.G(this, new B3(h, j, jMin), true);
    }

    @Override // j$.util.stream.AbstractC0158b
    final Spliterator L(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        long j;
        long j2;
        long jC = abstractC0158b.C(spliterator);
        long j3 = this.n;
        if (jC > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.H h = (j$.util.H) abstractC0158b.T(spliterator);
            long j4 = this.m;
            return new v3(h, j4, AbstractC0274z0.B(j4, j3));
        }
        if (EnumC0177e3.ORDERED.u(abstractC0158b.G())) {
            return ((L0) new A2(this, abstractC0158b, spliterator, new C0174e0(12), this.m, this.n).invoke()).spliterator();
        }
        j$.util.H h2 = (j$.util.H) abstractC0158b.T(spliterator);
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
        return new B3(h2, j2, j);
    }

    @Override // j$.util.stream.AbstractC0158b
    final InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2) {
        return new C0250t2(this, interfaceC0236q2);
    }
}
