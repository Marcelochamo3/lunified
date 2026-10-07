package o;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701Qc extends Q7 {
    public int[] i;
    public int[] j;

    @Override // o.X6
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferL.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // o.Q7
    public final V6 h(V6 v6) throws W6 {
        int[] iArr = this.i;
        if (iArr == null) {
            return V6.e;
        }
        if (v6.c != 2) {
            throw new W6(v6);
        }
        int length = iArr.length;
        int i = v6.b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new W6(v6);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new V6(v6.a, iArr.length, 2) : V6.e;
    }

    @Override // o.Q7
    public final void i() {
        this.j = this.i;
    }

    @Override // o.Q7
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
