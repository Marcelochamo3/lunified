package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1899jh0 extends AbstractC1802ih0 {
    public static boolean L(String str, String str2, boolean z) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "suffix");
        return !z ? str.endsWith(str2) : P(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean N(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean O(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable zf = new ZF(0, charSequence.length() - 1, 1);
        if ((zf instanceof Collection) && ((Collection) zf).isEmpty()) {
            return true;
        }
        Iterator it = zf.iterator();
        while (it.hasNext()) {
            if (!AbstractC3021v9.u(charSequence.charAt(((VF) it).a()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean P(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String Q(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        YF yfA = new ZF(1, i, 1).iterator();
        while (yfA.n) {
            yfA.a();
            sb.append((CharSequence) str);
        }
        String string = sb.toString();
        AbstractC1474fG.g(string);
        return string;
    }

    public static String R(String str, String str2, String str3, boolean z) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "oldValue");
        AbstractC1474fG.j(str3, "newValue");
        int i = 0;
        int iB0 = AbstractC1119bh0.b0(0, str, str2, z);
        if (iB0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iB0);
            sb.append(str3);
            i = iB0 + length;
            if (iB0 >= str.length()) {
                break;
            }
            iB0 = AbstractC1119bh0.b0(iB0 + i2, str, str2, z);
        } while (iB0 > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static String S(String str, char c, char c2) {
        AbstractC1474fG.j(str, "<this>");
        String strReplace = str.replace(c, c2);
        AbstractC1474fG.i(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean T(int i, String str, String str2, boolean z) {
        AbstractC1474fG.j(str, "<this>");
        return !z ? str.startsWith(str2, i) : P(i, 0, str2.length(), str, str2, z);
    }

    public static boolean U(String str, String str2, boolean z) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "prefix");
        return !z ? str.startsWith(str2) : P(0, 0, str2.length(), str, str2, z);
    }
}
