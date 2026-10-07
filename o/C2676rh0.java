package o;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.rh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2676rh0 extends Rd0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f1007o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long i(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    @Override // o.Rd0
    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) {
        String str;
        byte b;
        byte b2;
        int i2;
        int i3;
        float f;
        float f2;
        C3162wi c3162wi;
        this = this;
        ArrayList arrayList = new ArrayList();
        long[] jArrCopyOf = new long[32];
        C2562qX c2562qX = new C2562qX(i, bArr);
        Charset charsetB = c2562qX.B();
        if (charsetB == null) {
            charsetB = AbstractC1402ed.c;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String strH = c2562qX.h(charsetB);
            if (strH != null) {
                if (strH.length() != 0) {
                    try {
                        Integer.parseInt(strH);
                        String strH2 = c2562qX.h(charsetB);
                        if (strH2 == null) {
                            AP.z();
                        } else {
                            Matcher matcher = f1007o.matcher(strH2);
                            if (matcher.matches()) {
                                long jI = i(matcher, 1);
                                if (i5 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i5 * 2);
                                }
                                int i6 = i5 + 1;
                                jArrCopyOf[i5] = jI;
                                long jI2 = i(matcher, 6);
                                if (i6 == jArrCopyOf.length) {
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6 * 2);
                                }
                                i5 += 2;
                                jArrCopyOf[i6] = jI2;
                                StringBuilder sb = this.m;
                                sb.setLength(i4);
                                ArrayList arrayList2 = this.n;
                                arrayList2.clear();
                                for (String strH3 = c2562qX.h(charsetB); !TextUtils.isEmpty(strH3); strH3 = c2562qX.h(charsetB)) {
                                    if (sb.length() > 0) {
                                        sb.append("<br>");
                                    }
                                    String strTrim = strH3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = p.matcher(strTrim);
                                    int i7 = 0;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i7;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i7 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList2.size()) {
                                        str = (String) arrayList2.get(i8);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i8++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    c3162wi = new C3162wi(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str) {
                                        case "{\an1}":
                                            b = 0;
                                            break;
                                        case "{\an2}":
                                            b = 6;
                                            break;
                                        case "{\an3}":
                                            b = 3;
                                            break;
                                        case "{\an4}":
                                            b = 1;
                                            break;
                                        case "{\an5}":
                                            b = 7;
                                            break;
                                        case "{\an6}":
                                            b = 4;
                                            break;
                                        case "{\an7}":
                                            b = 2;
                                            break;
                                        case "{\an8}":
                                            b = 8;
                                            break;
                                        case "{\an9}":
                                            b = 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    int i9 = (b == 0 || b == 1 || b == 2) ? 0 : (b == 3 || b == 4 || b == 5) ? 2 : 1;
                                    switch (str) {
                                        case "{\an1}":
                                            b2 = 0;
                                            break;
                                        case "{\an2}":
                                            b2 = 1;
                                            break;
                                        case "{\an3}":
                                            b2 = 2;
                                            break;
                                        case "{\an4}":
                                            b2 = 6;
                                            break;
                                        case "{\an5}":
                                            b2 = 7;
                                            break;
                                        case "{\an6}":
                                            b2 = 8;
                                            break;
                                        case "{\an7}":
                                            b2 = 3;
                                            break;
                                        case "{\an8}":
                                            b2 = 4;
                                            break;
                                        case "{\an9}":
                                            b2 = 5;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    int i10 = (b2 == 0 || b2 == 1 || b2 == 2) ? 2 : (b2 == 3 || b2 == 4 || b2 == 5) ? 0 : 1;
                                    if (i9 != 0) {
                                        i2 = 1;
                                        if (i9 != 1) {
                                            i3 = 2;
                                            if (i9 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f = 0.92f;
                                        } else {
                                            i3 = 2;
                                            f = 0.5f;
                                        }
                                    } else {
                                        i2 = 1;
                                        i3 = 2;
                                        f = 0.08f;
                                    }
                                    if (i10 == 0) {
                                        f2 = 0.08f;
                                    } else if (i10 == i2) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i10 != i3) {
                                            throw new IllegalArgumentException();
                                        }
                                        f2 = 0.92f;
                                    }
                                    c3162wi = new C3162wi(spannedFromHtml, null, null, null, f2, 0, i10, f, i9, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(c3162wi);
                                arrayList.add(C3162wi.C);
                                jArrCopyOf = jArrCopyOf;
                                c2562qX = c2562qX;
                            } else {
                                "Skipping invalid timing: ".concat(strH2);
                                AP.z();
                            }
                            i4 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        "Skipping invalid index: ".concat(strH);
                        AP.z();
                    }
                }
            }
        }
        return new C2994uv((C3162wi[]) arrayList.toArray(new C3162wi[0]), Arrays.copyOf(jArrCopyOf, i5), 29, false);
    }
}
