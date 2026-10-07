package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class H2 extends D2 {
    private X2 c;

    @Override // j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        long[] jArr = (long[]) this.c.e();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC0236q2.n()) {
                    break;
                }
                interfaceC0236q2.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                interfaceC0236q2.accept(jArr[i]);
                i++;
            }
        }
        interfaceC0236q2.k();
    }

    @Override // j$.util.stream.AbstractC0211l2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new X2((int) j) : new X2();
    }
}
