package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3164wj {
    public static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset b;
    public static final String c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        b = charsetForName;
        c = charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    public static io.sentry.android.core.F a(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b2 = bArr[0];
        if ((b2 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new io.sentry.android.core.F("UTF-32", false);
        }
        if ((b2 == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2)) {
            return new io.sentry.android.core.F("UTF-16", false);
        }
        if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new io.sentry.android.core.F("UTF-8", true);
        }
        return null;
    }

    public static String b(String str) {
        if (str != null && str.length() != 0) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
