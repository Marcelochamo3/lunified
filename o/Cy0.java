package o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Cy0 {
    private static final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
    private static final String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";

    private Cy0() {
    }

    public static String a(byte[] bArr, int i, String str, boolean z) {
        String strC = c(bArr);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < strC.length()) {
            sb.append(str);
            int i3 = i2 + i;
            if (i3 >= strC.length()) {
                sb.append(strC.substring(i2));
                if (z) {
                    sb.append(" )");
                }
            } else {
                sb.append((CharSequence) strC, i2, i3);
                sb.append("\n");
            }
            i2 = i3;
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        char c = 0;
        for (byte b2 : str.getBytes()) {
            if (!Character.isWhitespace((char) b2)) {
                byteArrayOutputStream.write(b2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length % 4 != 0) {
            return null;
        }
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i = 0;
        while (i < (byteArray.length + 3) / 4) {
            short[] sArr = new short[4];
            short[] sArr2 = new short[3];
            for (int i2 = 0; i2 < 4; i2++) {
                sArr[i2] = (short) a.indexOf(byteArray[(i * 4) + i2]);
            }
            int i3 = sArr[c] << 2;
            short s = sArr[1];
            sArr2[c] = (short) (i3 + (s >> 4));
            short s2 = sArr[2];
            if (s2 == 64) {
                sArr2[2] = -1;
                sArr2[1] = -1;
                if ((sArr[1] & 15) != 0) {
                    return null;
                }
            } else {
                short s3 = sArr[3];
                if (s3 == 64) {
                    sArr2[1] = (short) (((s << 4) + (s2 >> 2)) & 255);
                    sArr2[2] = -1;
                    if ((sArr[2] & 3) != 0) {
                        return null;
                    }
                } else {
                    sArr2[1] = (short) (((s << 4) + (s2 >> 2)) & 255);
                    sArr2[2] = (short) (((s2 << 6) + s3) & 255);
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                try {
                    short s4 = sArr2[i4];
                    if (s4 >= 0) {
                        dataOutputStream.writeByte(s4);
                    }
                } catch (IOException unused) {
                }
            }
            i++;
            c = 0;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String c(byte[] bArr) {
        return d(bArr, false);
    }

    public static String d(byte[] bArr, boolean z) {
        String str = z ? b : a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr.length + 2) / 3; i++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = (i * 3) + i2;
                if (i3 < bArr.length) {
                    sArr[i2] = (short) (bArr[i3] & 255);
                } else {
                    sArr[i2] = -1;
                }
            }
            sArr2[0] = (short) (sArr[0] >> 2);
            short s = sArr[1];
            if (s == -1) {
                sArr2[1] = (short) ((sArr[0] & 3) << 4);
            } else {
                sArr2[1] = (short) (((sArr[0] & 3) << 4) + (s >> 4));
            }
            short s2 = sArr[1];
            if (s2 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                short s3 = sArr[2];
                if (s3 == -1) {
                    sArr2[2] = (short) ((s2 & 15) << 2);
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (((s2 & 15) << 2) + (s3 >> 6));
                    sArr2[3] = (short) (sArr[2] & 63);
                }
            }
            for (int i4 = 0; i4 < 4; i4++) {
                short s4 = sArr2[i4];
                if (s4 != 64 || !z) {
                    byteArrayOutputStream.write(str.charAt(s4));
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}
