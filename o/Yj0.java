package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Yj0 extends Q7 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // o.X6
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            byteBufferL = l((i2 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i4) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferL.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i2);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i4) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferL.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // o.Q7
    public final V6 h(V6 v6) throws W6 {
        int i2 = v6.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new V6(v6.a, v6.b, 4) : V6.e;
        }
        throw new W6(v6);
    }
}
