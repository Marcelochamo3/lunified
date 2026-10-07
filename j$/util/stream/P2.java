package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class P2 extends D2 {
    private long[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(j);
        if (this.b) {
            while (i < this.d && !interfaceC0236q2.n()) {
                interfaceC0236q2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                interfaceC0236q2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC0236q2.k();
        this.c = null;
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }
}
