package o;

import android.util.Base64;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.xV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3238xV {
    public static final Rh0 a = new Rh0(C2428p3.I);

    public static String a(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        int length = bArrDecode.length;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            messageDigest.reset();
            messageDigest.update((byte[]) a.getValue());
            messageDigest.update(new byte[]{(byte) (i2 >>> 24), (byte) (i2 >>> 16), (byte) (i2 >>> 8), (byte) i2});
            byte[] bArrDigest = messageDigest.digest();
            int iMin = Math.min(bArrDigest.length, length - i);
            System.arraycopy(bArrDigest, 0, bArr, i, iMin);
            i += iMin;
            i2++;
        }
        int length2 = bArrDecode.length;
        byte[] bArr2 = new byte[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            bArr2[i3] = (byte) (bArrDecode[i3] ^ bArr[i3]);
        }
        return new String(bArr2, AbstractC1305dd.a);
    }
}
