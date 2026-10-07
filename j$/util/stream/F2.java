package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class F2 extends B2 {
    private T2 c;

    @Override // j$.util.stream.InterfaceC0221n2, j$.util.stream.InterfaceC0236q2
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC0201j2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        double[] dArr = (double[]) this.c.e();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC0236q2.n()) {
                    break;
                }
                interfaceC0236q2.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                interfaceC0236q2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC0236q2.k();
    }

    @Override // j$.util.stream.AbstractC0201j2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new T2((int) j) : new T2();
    }
}
