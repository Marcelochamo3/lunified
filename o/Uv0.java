package o;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Uv0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final C2562qX a = new C2562qX();
    public final StringBuilder b = new StringBuilder();

    public static String a(C2562qX c2562qX, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c2562qX.b;
        int i2 = c2562qX.c;
        while (i < i2 && !z) {
            char c2 = (char) c2562qX.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        c2562qX.G(i - c2562qX.b);
        return sb.toString();
    }

    public static String b(C2562qX c2562qX, StringBuilder sb) {
        c(c2562qX);
        if (c2562qX.a() == 0) {
            return null;
        }
        String strA = a(c2562qX, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) c2562qX.u());
    }

    public static void c(C2562qX c2562qX) {
        while (true) {
            for (boolean z = true; c2562qX.a() > 0 && z; z = false) {
                int i = c2562qX.b;
                byte[] bArr = c2562qX.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    c2562qX.G(1);
                } else {
                    int i2 = c2562qX.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            c2562qX.G(i2 - c2562qX.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
