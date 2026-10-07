package o;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class TP {
    public static final Pattern e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public TP(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iN = Sr0.n(0, strArr.length - 1, 2);
        if (iN < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!AbstractC1899jh0.N(strArr[i], "charset", true)) {
                if (i == iN) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TP) && AbstractC1474fG.b(((TP) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
