package o;

import lombok.Generated;

/* JADX INFO: renamed from: o.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1104ba {
    private static final int a = 255;

    @Generated
    private C1104ba() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        if (bArr.length == bArr2.length) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    length = b & 255;
                    length2 = b2 & 255;
                }
            }
            return 0;
        }
        length = bArr.length;
        length2 = bArr2.length;
        return length - length2;
    }
}
