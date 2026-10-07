package o;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.bw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1149bw0 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static void a(String str, Yv0 yv0, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b2;
        int i;
        int i2;
        int i3;
        int i4 = yv0.b;
        int length = spannableStringBuilder.length();
        String str2 = yv0.a;
        str2.getClass();
        int iHashCode = str2.hashCode();
        int i5 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("i")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : yv0.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case 7:
                int iC = c(list2, str, yv0);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, Xv0.c);
                int i6 = yv0.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((Xv0) arrayList.get(i7)).a.a)) {
                        Xv0 xv0 = (Xv0) arrayList.get(i7);
                        int iC2 = c(list2, str, xv0.a);
                        if (iC2 == i5) {
                            iC2 = iC != i5 ? iC : 1;
                        }
                        int i8 = xv0.a.b - length2;
                        int i9 = xv0.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new R80(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, yv0);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            Vv0 vv0 = ((Zv0) arrayListB.get(i10)).m;
            if (vv0 != null) {
                int i11 = vv0.l;
                if (i11 == -1 && vv0.m == -1) {
                    i = -1;
                } else {
                    i = (vv0.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
                }
                if (i != -1) {
                    int i12 = vv0.l;
                    if (i12 == -1 && vv0.m == -1) {
                        i3 = -1;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i3 = (i12 == 1 ? 1 : 0) | (vv0.m == 1 ? 2 : 0);
                    }
                    Sr0.a(spannableStringBuilder, new StyleSpan(i3), i4, length);
                } else {
                    i2 = 1;
                }
                if (vv0.j == i2) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
                }
                if (vv0.k == i2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                }
                if (vv0.g) {
                    if (!vv0.g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    Sr0.a(spannableStringBuilder, new ForegroundColorSpan(vv0.f), i4, length);
                }
                if (vv0.i) {
                    if (!vv0.i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    Sr0.a(spannableStringBuilder, new BackgroundColorSpan(vv0.h), i4, length);
                }
                if (vv0.e != null) {
                    Sr0.a(spannableStringBuilder, new TypefaceSpan(vv0.e), i4, length);
                }
                int i13 = vv0.n;
                if (i13 == 1) {
                    Sr0.a(spannableStringBuilder, new AbsoluteSizeSpan((int) vv0.f583o, true), i4, length);
                } else if (i13 == 2) {
                    Sr0.a(spannableStringBuilder, new RelativeSizeSpan(vv0.f583o), i4, length);
                } else if (i13 == 3) {
                    Sr0.a(spannableStringBuilder, new RelativeSizeSpan(vv0.f583o / 100.0f), i4, length);
                }
                if (vv0.q) {
                    spannableStringBuilder.setSpan(new SC(), i4, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, Yv0 yv0) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Vv0 vv0 = (Vv0) list.get(i);
            String str2 = yv0.a;
            if (vv0.a.isEmpty() && vv0.b.isEmpty() && vv0.c.isEmpty() && vv0.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = Vv0.a(Vv0.a(Vv0.a(0, 1073741824, vv0.a, str), 2, vv0.b, str2), 4, vv0.d, yv0.c);
                if (iA != -1) {
                    if (yv0.d.containsAll(vv0.c)) {
                        size = iA + (vv0.c.size() * 4);
                    } else {
                        r4 = 0;
                    }
                } else {
                    r4 = 0;
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new Zv0(r4, vv0));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, Yv0 yv0) {
        ArrayList arrayListB = b(list, str, yv0);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((Zv0) arrayListB.get(i)).m.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static Wv0 d(String str, Matcher matcher, C2562qX c2562qX, ArrayList arrayList) {
        C1051aw0 c1051aw0 = new C1051aw0();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c1051aw0.a = AbstractC1441ew0.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c1051aw0.b = AbstractC1441ew0.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, c1051aw0);
            StringBuilder sb = new StringBuilder();
            String strH = c2562qX.h(AbstractC1402ed.c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = c2562qX.h(AbstractC1402ed.c);
            }
            c1051aw0.c = f(str, sb.toString(), arrayList);
            return new Wv0(c1051aw0.a().a(), c1051aw0.a, c1051aw0.b);
        } catch (NumberFormatException unused) {
            matcher.group();
            AP.z();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    public static void e(String str, C1051aw0 c1051aw0) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, c1051aw0);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                break;
                            default:
                                "Invalid alignment value: ".concat(strGroup2);
                                AP.z();
                                i = 2;
                                break;
                        }
                        c1051aw0.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i = 0;
                                    break;
                                case "center":
                                case "middle":
                                    break;
                                case "line-right":
                                case "end":
                                    i = 2;
                                    break;
                                default:
                                    "Invalid anchor value: ".concat(strSubstring);
                                    AP.z();
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            c1051aw0.i = i;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c1051aw0.h = AbstractC1441ew0.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c1051aw0.j = AbstractC1441ew0.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i = 2;
                        } else if (!strGroup2.equals("rl")) {
                            "Invalid 'vertical' value: ".concat(strGroup2);
                            AP.z();
                            i = Integer.MIN_VALUE;
                        }
                        c1051aw0.k = i;
                    } else {
                        AP.z();
                    }
                }
            } catch (NumberFormatException unused) {
                matcher.group();
                AP.z();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fa. Please report as an issue. */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        int i = 2;
        int i2 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String strTrim = "";
            if (i3 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (Yv0) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new Yv0("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i3);
            if (cCharAt == '&') {
                i3 += i2;
                int iIndexOf = str2.indexOf(59, i3);
                int iIndexOf2 = str2.indexOf(32, i3);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i3, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AP.z();
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i3 += i2;
            } else {
                int length = i3 + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + i2;
                    int i4 = length - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    int i5 = i3 + (z ? 2 : 1);
                    if (!z2) {
                        i4 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i5, i4);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC0397Ej.c(strTrim2.isEmpty() ^ i2);
                        int i6 = Lr0.a;
                        String str3 = strTrim2.split("[ \\.]", i)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        AbstractC0397Ej.c(strTrim3.isEmpty() ^ i2);
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i7 = 1; i7 < strArrSplit.length; i7 += i2) {
                                            hashSet.add(strArrSplit[i7]);
                                        }
                                        arrayDeque.push(new Yv0(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        Yv0 yv0 = (Yv0) arrayDeque.pop();
                                        a(str, yv0, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new Xv0(yv0, spannableStringBuilder.length()));
                                        }
                                        if (yv0.a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    i3 = length;
                }
                i3 = length;
            }
            i = 2;
            i2 = 1;
        }
    }

    public static void g(String str, C1051aw0 c1051aw0) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    "Invalid anchor value: ".concat(strSubstring);
                    AP.z();
                    i = Integer.MIN_VALUE;
                    break;
            }
            c1051aw0.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c1051aw0.e = AbstractC1441ew0.b(str);
            c1051aw0.f = 0;
        } else {
            c1051aw0.e = Integer.parseInt(str);
            c1051aw0.f = 1;
        }
    }
}
