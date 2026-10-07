package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0271y1 extends C0157a3 implements L0, D0 {
    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(double d) {
        AbstractC0274z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ void accept(int i) {
        AbstractC0274z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC0274z0.l();
        throw null;
    }

    @Override // j$.util.stream.C0157a3, java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        super.p(obj);
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.C0157a3, java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.L0
    public final void i(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        clear();
        r(j);
    }

    @Override // j$.util.stream.InterfaceC0236q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.C0157a3, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
