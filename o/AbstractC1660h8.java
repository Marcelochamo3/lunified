package o;

/* JADX INFO: renamed from: o.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1660h8 {
    public static final byte[] c = {13, 10};
    public final byte a = 61;
    public final int b;

    public AbstractC1660h8(int i) {
        AbstractC1701hf0.a(2, "codecPolicy");
        this.b = 2;
    }

    public static byte[] a(int i, C1562g8 c1562g8) {
        byte[] bArr = (byte[]) c1562g8.g;
        if (bArr == null) {
            c1562g8.g = new byte[Math.max(i, C1672hI.a.e)];
            c1562g8.d = 0;
            c1562g8.e = 0;
        } else {
            int i2 = c1562g8.d + i;
            if (i2 - bArr.length > 0) {
                int length = bArr.length * 2;
                if (Integer.compare(length - Integer.MIN_VALUE, i2 - Integer.MIN_VALUE) < 0) {
                    length = i2;
                }
                if (Integer.compare(Integer.MIN_VALUE + length, -9) > 0) {
                    if (i2 < 0) {
                        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i2) & 4294967295L));
                    }
                    if (i2 <= 2147483639) {
                        i2 = 2147483639;
                    }
                    length = i2;
                }
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = (byte[]) c1562g8.g;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                c1562g8.g = bArr2;
                return bArr2;
            }
        }
        return (byte[]) c1562g8.g;
    }
}
