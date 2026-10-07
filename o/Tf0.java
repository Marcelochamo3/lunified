package o;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Tf0 extends Rd0 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final Uf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f538o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public Tf0(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        String strO = Lr0.o((byte[]) list.get(0));
        AbstractC0397Ej.c(strO.startsWith("Format:"));
        Uf0 uf0B = Uf0.b(strO);
        uf0B.getClass();
        this.n = uf0B;
        j(new C2562qX((byte[]) list.get(1)), AbstractC1402ed.c);
    }

    public static int i(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long k(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = Lr0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // o.Rd0
    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) {
        C2562qX c2562qX;
        int i2;
        int i3;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        float f5;
        int i7;
        float f6;
        int i8;
        int i9;
        int i10;
        Integer num;
        int iA;
        int i11;
        Tf0 tf0 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2562qX c2562qX2 = new C2562qX(i, bArr);
        Charset charsetB = c2562qX2.B();
        if (charsetB == null) {
            charsetB = AbstractC1402ed.c;
        }
        boolean z2 = tf0.m;
        if (!z2) {
            tf0.j(c2562qX2, charsetB);
        }
        Uf0 uf0B = z2 ? tf0.n : null;
        while (true) {
            String strH = c2562qX2.h(charsetB);
            if (strH == null) {
                return new C2431p40(arrayList, arrayList2);
            }
            if (strH.startsWith("Format:")) {
                uf0B = Uf0.b(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (uf0B == null) {
                        "Skipping dialogue line before complete format: ".concat(strH);
                        AP.z();
                    } else {
                        AbstractC0397Ej.c(strH.startsWith("Dialogue:"));
                        String strSubstring = strH.substring(9);
                        int i12 = uf0B.e;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            "Skipping dialogue line with fewer columns than format: ".concat(strH);
                            AP.z();
                        } else {
                            long jK = k(strArrSplit[uf0B.a]);
                            if (jK == -9223372036854775807L) {
                                "Skipping invalid timing: ".concat(strH);
                                AP.z();
                            } else {
                                long jK2 = k(strArrSplit[uf0B.b]);
                                if (jK2 == -9223372036854775807L) {
                                    "Skipping invalid timing: ".concat(strH);
                                    AP.z();
                                } else {
                                    LinkedHashMap linkedHashMap = tf0.f538o;
                                    Xf0 xf0 = (linkedHashMap == null || (i11 = uf0B.c) == -1) ? null : (Xf0) linkedHashMap.get(strArrSplit[i11].trim());
                                    String str = strArrSplit[uf0B.d];
                                    Matcher matcher = Wf0.a.matcher(str);
                                    PointF pointF = null;
                                    int i13 = -1;
                                    while (matcher.find()) {
                                        C2562qX c2562qX3 = c2562qX2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = Wf0.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = Wf0.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = Xf0.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i13 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c2562qX2 = c2562qX3;
                                    }
                                    c2562qX = c2562qX2;
                                    String strReplace = Wf0.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = tf0.p;
                                    float f8 = tf0.q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (xf0 != null) {
                                        Integer num2 = xf0.c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (xf0.j == 3 && (num = xf0.d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f9 = xf0.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i7 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i7 = 1;
                                        }
                                        boolean z3 = xf0.g;
                                        boolean z4 = xf0.f;
                                        if (z4 && z3) {
                                            f6 = f5;
                                            i8 = i7;
                                            i9 = 0;
                                            i10 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f6 = f5;
                                            i8 = i7;
                                            i9 = 0;
                                            i10 = 33;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z3) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (xf0.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (xf0.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                        i3 = i8;
                                        f = f6;
                                        i2 = -1;
                                    } else {
                                        charsetB = charsetB;
                                        uf0B = uf0B;
                                        i2 = -1;
                                        i3 = Integer.MIN_VALUE;
                                        f = -3.4028235E38f;
                                    }
                                    if (i13 != i2) {
                                        i2 = i13;
                                    } else if (xf0 != null) {
                                        i2 = xf0.b;
                                    }
                                    switch (i2) {
                                        case 0:
                                        default:
                                            AP.z();
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i14 = Integer.MIN_VALUE;
                                    switch (i2) {
                                        case 0:
                                        default:
                                            AP.z();
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    switch (i2) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AP.z();
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i14 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i14 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i14 = 0;
                                            break;
                                    }
                                    float f10 = -3.4028235E38f;
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        if (i4 != 0) {
                                            i5 = 1;
                                            if (i4 != 1) {
                                                i6 = 2;
                                                f2 = i4 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i6 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i5 = 1;
                                            i6 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i14 == 0) {
                                            f10 = 0.05f;
                                        } else if (i14 == i5) {
                                            f10 = 0.5f;
                                        } else if (i14 == i6) {
                                            f10 = 0.95f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    C3162wi c3162wi = new C3162wi(spannableString, alignment2, null, null, f3, 0, i14, f4, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int i15 = i(jK2, arrayList2, arrayList);
                                    for (int i16 = i(jK, arrayList2, arrayList); i16 < i15; i16++) {
                                        ((List) arrayList.get(i16)).add(c3162wi);
                                    }
                                }
                            }
                        }
                    }
                    c2562qX = c2562qX2;
                    charsetB = charsetB;
                    uf0B = uf0B;
                } else {
                    c2562qX = c2562qX2;
                    charsetB = charsetB;
                    uf0B = uf0B;
                }
                tf0 = this;
                c2562qX2 = c2562qX;
                charsetB = charsetB;
                uf0B = uf0B;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:169:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    public final void j(C2562qX c2562qX, Charset charset) {
        float f;
        int i;
        Xf0 xf0;
        while (true) {
            String strH = c2562qX.h(charset);
            if (strH == null) {
                return;
            }
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(strH)) {
                while (true) {
                    String strH2 = c2562qX.h(charset);
                    if (strH2 == null || (c2562qX.a() != 0 && c2562qX.c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == 2) {
                        String strI = U9.I(strArrSplit[0].trim());
                        strI.getClass();
                        if (strI.equals("playresx")) {
                            this.p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strI.equals("playresy")) {
                            try {
                                this.q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    Vf0 vf0 = null;
                    while (true) {
                        String strH3 = c2562qX.h(charset);
                        if (strH3 != null && (c2562qX.a() == 0 || c2562qX.c(charset) != c)) {
                            int i2 = -1;
                            if (strH3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strH3.substring(7), ",");
                                int i3 = -1;
                                int i4 = -1;
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < strArrSplit2.length; i13++) {
                                    String strI2 = U9.I(strArrSplit2[i13].trim());
                                    strI2.getClass();
                                    switch (strI2) {
                                        case "italic":
                                            i9 = i13;
                                            break;
                                        case "underline":
                                            i10 = i13;
                                            break;
                                        case "strikeout":
                                            i11 = i13;
                                            break;
                                        case "primarycolour":
                                            i5 = i13;
                                            break;
                                        case "bold":
                                            i8 = i13;
                                            break;
                                        case "name":
                                            i3 = i13;
                                            break;
                                        case "fontsize":
                                            i7 = i13;
                                            break;
                                        case "borderstyle":
                                            i12 = i13;
                                            break;
                                        case "alignment":
                                            i4 = i13;
                                            break;
                                        case "outlinecolour":
                                            i6 = i13;
                                            break;
                                    }
                                }
                                if (i3 != -1) {
                                    vf0 = new Vf0(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, strArrSplit2.length);
                                }
                            } else {
                                if (strH3.startsWith("Style:")) {
                                    if (vf0 == null) {
                                        "Skipping 'Style:' line before 'Format:' line: ".concat(strH3);
                                        AP.z();
                                    } else {
                                        AbstractC0397Ej.c(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(6), ",");
                                        if (strArrSplit3.length != vf0.k) {
                                            int i14 = Lr0.a;
                                            Locale locale = Locale.US;
                                            AP.z();
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[vf0.a].trim();
                                                int i15 = vf0.b;
                                                int iA = i15 != -1 ? Xf0.a(strArrSplit3[i15].trim()) : -1;
                                                int i16 = vf0.c;
                                                Integer numC = i16 != -1 ? Xf0.c(strArrSplit3[i16].trim()) : null;
                                                int i17 = vf0.d;
                                                Integer numC2 = i17 != -1 ? Xf0.c(strArrSplit3[i17].trim()) : null;
                                                int i18 = vf0.e;
                                                float f2 = -3.4028235E38f;
                                                if (i18 != -1) {
                                                    String strTrim2 = strArrSplit3[i18].trim();
                                                    try {
                                                        f2 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        AP.A("Failed to parse font size: '" + strTrim2 + "'", e);
                                                    }
                                                    f = f2;
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                int i19 = vf0.f;
                                                boolean z = i19 != -1 && Xf0.b(strArrSplit3[i19].trim());
                                                int i20 = vf0.g;
                                                boolean z2 = i20 != -1 && Xf0.b(strArrSplit3[i20].trim());
                                                int i21 = vf0.h;
                                                boolean z3 = i21 != -1 && Xf0.b(strArrSplit3[i21].trim());
                                                int i22 = vf0.i;
                                                boolean z4 = i22 != -1 && Xf0.b(strArrSplit3[i22].trim());
                                                int i23 = vf0.j;
                                                if (i23 != -1) {
                                                    try {
                                                        int i24 = Integer.parseInt(strArrSplit3[i23].trim().trim());
                                                        if (i24 == 1 || i24 == 3) {
                                                            i2 = i24;
                                                        } else {
                                                            AP.z();
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i = i2;
                                                } else {
                                                    i = -1;
                                                }
                                                xf0 = new Xf0(strTrim, iA, numC, numC2, f, z, z2, z3, z4, i);
                                            } catch (RuntimeException e2) {
                                                AP.A("Skipping malformed 'Style:' line: '" + strH3 + "'", e2);
                                                xf0 = null;
                                            }
                                            if (xf0 != null) {
                                                linkedHashMap.put(xf0.a, xf0);
                                            }
                                        }
                                        xf0 = null;
                                        if (xf0 != null) {
                                            linkedHashMap.put(xf0.a, xf0);
                                        }
                                    }
                                }
                                c = '[';
                            }
                        }
                    }
                }
                this.f538o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                AP.j();
            } else if ("[Events]".equalsIgnoreCase(strH)) {
                return;
            }
        }
    }
}
