package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class O2 extends C2 {
    private int[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
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

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }
}
