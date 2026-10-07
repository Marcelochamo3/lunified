package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1119bh0 extends AbstractC1899jh0 {
    public static String A0(String str, char c, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "missingDelimiterValue");
        int iD0 = d0(str, c, 0, false, 6);
        if (iD0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iD0);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String B0(String str, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str, "missingDelimiterValue");
        int iE0 = e0(str, str2, 0, false, 6);
        if (iE0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iE0);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(String str, String str2) {
        int iH0 = h0(str, str2, 6);
        if (iH0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iH0);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String D0(int i, String str) {
        AbstractC1474fG.j(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence E0(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zU = AbstractC3021v9.u(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zU) {
                    break;
                }
                length--;
            } else if (zU) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String F0(String str, char... cArr) {
        AbstractC1474fG.j(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zG = X5.G(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zG) {
                    break;
                }
                length--;
            } else if (zG) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static String G0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC1474fG.j(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!X5.G(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence H0(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC3021v9.u(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String I0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC1474fG.j(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!X5.G(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static ArrayList V(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        Jp0.j(2, 2);
        int length = charSequence.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 2;
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, (i2 < 0 || i2 > length) ? length : i2);
            AbstractC1474fG.j(charSequenceSubSequence, "it");
            arrayList.add(charSequenceSubSequence.toString());
            i = i2;
        }
        return arrayList;
    }

    public static boolean W(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (e0(charSequence, (String) charSequence2, 0, z, 2) < 0) {
                return false;
            }
        } else if (c0(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean X(CharSequence charSequence, char c) {
        AbstractC1474fG.j(charSequence, "<this>");
        return d0(charSequence, c, 0, false, 2) >= 0;
    }

    public static /* synthetic */ boolean Y(CharSequence charSequence, CharSequence charSequence2) {
        return W(charSequence, charSequence2, false);
    }

    public static boolean Z(CharSequence charSequence, String str) {
        AbstractC1474fG.j(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC1899jh0.L((String) charSequence, str, false) : k0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int a0(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int b0(int i, CharSequence charSequence, String str, boolean z) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(str, "string");
        return (z || !(charSequence instanceof String)) ? c0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int c0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        XF xf;
        if (z2) {
            int iA0 = a0(charSequence);
            if (i > iA0) {
                i = iA0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            xf = new XF(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            xf = new ZF(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = xf.n;
        int i4 = xf.m;
        int i5 = xf.l;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!AbstractC1899jh0.P(0, i, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!k0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int d0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        AbstractC1474fG.j(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? f0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b0(i, charSequence, str, z);
    }

    public static final int f0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(X5.U(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        YF yfA = new ZF(i, a0(charSequence), 1).iterator();
        while (yfA.n) {
            int iA = yfA.a();
            char cCharAt = charSequence.charAt(iA);
            for (char c : cArr) {
                if (AbstractC3021v9.i(c, cCharAt, z)) {
                    return iA;
                }
            }
        }
        return -1;
    }

    public static int g0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = a0(charSequence);
        }
        AbstractC1474fG.j(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(X5.U(cArr), i);
        }
        int iA0 = a0(charSequence);
        if (i > iA0) {
            i = iA0;
        }
        while (-1 < i) {
            if (AbstractC3021v9.i(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int h0(CharSequence charSequence, String str, int i) {
        int iA0 = (i & 2) != 0 ? a0(charSequence) : 0;
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(str, "string");
        return !(charSequence instanceof String) ? c0(charSequence, str, iA0, 0, false, true) : ((String) charSequence).lastIndexOf(str, iA0);
    }

    public static C3074vm0 i0(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "<this>");
        return Vb0.M(j0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new io.sentry.android.replay.v(20, charSequence));
    }

    public static C2104lm j0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        p0(i);
        return new C2104lm(charSequence, 0, i, new C1997kh0(1, X5.F(strArr), z));
    }

    public static final boolean k0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC3021v9.i(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String l0(String str, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "prefix");
        if (!u0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String m0(String str, String str2) {
        AbstractC1474fG.j(str, "<this>");
        if (!Z(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String n0(String str, String str2) {
        if (str.length() < str2.length() + str2.length() || !u0(str, str2) || !Z(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length(), str.length() - str2.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder o0(CharSequence charSequence, int i, int i2, String str) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append((CharSequence) str);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void p0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static StringBuilder q0(String str) {
        StringBuilder sbReverse = new StringBuilder((CharSequence) str).reverse();
        AbstractC1474fG.i(sbReverse, "reverse(...)");
        return sbReverse;
    }

    public static final List r0(int i, CharSequence charSequence, String str, boolean z) {
        p0(i);
        int length = 0;
        int iB0 = b0(0, charSequence, str, z);
        if (iB0 == -1 || i == 1) {
            return AbstractC2506pt.A(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iB0).toString());
            length = str.length() + iB0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iB0 = b0(length, charSequence, str, z);
        } while (iB0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List s0(CharSequence charSequence, char[] cArr, int i, int i2) {
        boolean z = false;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        AbstractC1474fG.j(charSequence, "<this>");
        if (cArr.length == 1) {
            return r0(i, charSequence, String.valueOf(cArr[0]), false);
        }
        p0(i);
        C2104lm c2104lm = new C2104lm(charSequence, 0, i, new C1997kh0(0, cArr, z));
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(new AF(1, c2104lm), 10));
        Iterator it = c2104lm.iterator();
        while (it.hasNext()) {
            arrayList.add(v0(charSequence, (ZF) it.next()));
        }
        return arrayList;
    }

    public static List t0(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        AbstractC1474fG.j(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return r0(i, charSequence, str, false);
            }
        }
        C2104lm c2104lmJ0 = j0(charSequence, strArr, false, i);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(new AF(1, c2104lmJ0), 10));
        Iterator it = c2104lmJ0.iterator();
        while (it.hasNext()) {
            arrayList.add(v0(charSequence, (ZF) it.next()));
        }
        return arrayList;
    }

    public static boolean u0(CharSequence charSequence, String str) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(str, "prefix");
        return charSequence instanceof String ? AbstractC1899jh0.U((String) charSequence, str, false) : k0(charSequence, 0, str, 0, str.length(), false);
    }

    public static final String v0(CharSequence charSequence, ZF zf) {
        AbstractC1474fG.j(charSequence, "<this>");
        AbstractC1474fG.j(zf, "range");
        return charSequence.subSequence(zf.l, zf.m + 1).toString();
    }

    public static String w0(String str, char c, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "missingDelimiterValue");
        int iD0 = d0(str, c, 0, false, 6);
        if (iD0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iD0 + 1, str.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String x0(String str, String str2, String str3) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "delimiter");
        AbstractC1474fG.j(str3, "missingDelimiterValue");
        int iE0 = e0(str, str2, 0, false, 6);
        if (iE0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iE0, str.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y0(String str, char c, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str2, "missingDelimiterValue");
        int iG0 = g0(str, c, 0, 6);
        if (iG0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iG0 + 1, str.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z0(String str, String str2) {
        AbstractC1474fG.j(str, "<this>");
        AbstractC1474fG.j(str, "missingDelimiterValue");
        int iH0 = h0(str, str2, 6);
        if (iH0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iH0, str.length());
        AbstractC1474fG.i(strSubstring, "substring(...)");
        return strSubstring;
    }
}
