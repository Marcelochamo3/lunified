package o;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Ay0 {
    private static final String a = "0123456789ABCDEF";

    private Ay0() {
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'F')) {
                byteArrayOutputStream.write(cCharAt);
            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                byteArrayOutputStream.write(cCharAt - ' ');
            } else if (!Character.isWhitespace(cCharAt)) {
                return null;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if ((byteArray.length & 1) != 0) {
            return null;
        }
        byteArrayOutputStream.reset();
        for (int i2 = 0; i2 < byteArray.length; i2 += 2) {
            byteArrayOutputStream.write((((byte) a.indexOf(byteArray[i2])) << 4) + (((byte) a.indexOf(byteArray[i2 + 1])) & 15));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            short s = (short) (b & 255);
            sb.append(a.charAt((byte) (s >> 4)));
            sb.append(a.charAt((byte) (s & 15)));
        }
        return sb.toString();
    }
}
