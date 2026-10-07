package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Q2 extends E2 {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(j);
        if (this.c) {
            while (i < this.e && !interfaceC0236q2.n()) {
                interfaceC0236q2.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC0236q2.accept(this.d[i]);
                i++;
            }
        }
        interfaceC0236q2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
