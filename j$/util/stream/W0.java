package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
abstract class W0 extends N0 implements K0 {
    @Override // j$.util.stream.K0
    public final void d(Object obj, int i) {
        L0 l0 = this.a;
        ((K0) l0).d(obj, i);
        ((K0) this.b).d(obj, i + ((int) ((K0) l0).count()));
    }

    @Override // j$.util.stream.K0
    public final Object e() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        d(objC, 0);
        return objC;
    }

    @Override // j$.util.stream.K0
    public final void f(Object obj) {
        ((K0) this.a).f(obj);
        ((K0) this.b).f(obj);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC0274z0.m(this, intFunction);
    }

    public final String toString() {
        long jCount = count();
        String name = getClass().getName();
        return jCount < 32 ? String.format("%s[%s.%s]", name, this.a, this.b) : String.format("%s[size=%d]", name, Long.valueOf(count()));
    }
}
