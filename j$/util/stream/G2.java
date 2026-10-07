package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class G2 extends C2 {
    private V2 c;

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        int[] iArr = (int[]) this.c.e();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (interfaceC0236q2.n()) {
                    break;
                }
                interfaceC0236q2.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                interfaceC0236q2.accept(iArr[i]);
                i++;
            }
        }
        interfaceC0236q2.k();
    }

    @Override // j$.util.stream.AbstractC0206k2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new V2((int) j) : new V2();
    }
}
