package o;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.cw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1246cw0 extends Rd0 {
    public final C2562qX m = new C2562qX();
    public final Uv0 n = new Uv0();

    /* JADX WARN: Code duplicated, block: B:129:0x0249  */
    /* JADX WARN: Code duplicated, block: B:130:0x0254  */
    /* JADX WARN: Code duplicated, block: B:132:0x025d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0267  */
    /* JADX WARN: Code duplicated, block: B:135:0x026f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0277  */
    /* JADX WARN: Code duplicated, block: B:138:0x027b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0283  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:143:0x0290  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:173:0x030f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0313  */
    /* JADX WARN: Code duplicated, block: B:177:0x0324  */
    /* JADX WARN: Code duplicated, block: B:180:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x032f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0338  */
    /* JADX WARN: Code duplicated, block: B:185:0x033a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0343  */
    /* JADX WARN: Code duplicated, block: B:192:0x034d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0352  */
    /* JADX WARN: Code duplicated, block: B:194:0x0357  */
    /* JADX WARN: Code duplicated, block: B:196:0x036a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // o.Rd0
    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) throws C3161wh0 {
        Wv0 wv0D;
        String strTrim;
        String str;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        int i2;
        boolean z2;
        String strSubstring;
        C1246cw0 c1246cw0 = this;
        int i3 = -1;
        int i4 = 1;
        C2562qX c2562qX = c1246cw0.m;
        c2562qX.D(i, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC1441ew0.d(c2562qX);
            while (!TextUtils.isEmpty(c2562qX.h(AbstractC1402ed.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r6 = 0;
                int i5 = -1;
                int i6 = 0;
                while (i5 == i3) {
                    i6 = c2562qX.b;
                    String strH = c2562qX.h(AbstractC1402ed.c);
                    if (strH == null) {
                        i5 = 0;
                    } else if ("STYLE".equals(strH)) {
                        i5 = 2;
                    } else {
                        i5 = strH.startsWith("NOTE") ? 1 : 3;
                    }
                }
                c2562qX.F(i6);
                if (i5 == 0) {
                    return new RN(arrayList2);
                }
                if (i5 == i4) {
                    while (!TextUtils.isEmpty(c2562qX.h(AbstractC1402ed.c))) {
                    }
                } else {
                    String str2 = null;
                    if (i5 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new C3161wh0("A style block was found after the first cue.");
                        }
                        c2562qX.h(AbstractC1402ed.c);
                        Uv0 uv0 = c1246cw0.n;
                        StringBuilder sb = uv0.b;
                        sb.setLength(0);
                        int i7 = c2562qX.b;
                        while (!TextUtils.isEmpty(c2562qX.h(AbstractC1402ed.c))) {
                            i4 = 1;
                        }
                        byte[] bArr2 = c2562qX.a;
                        int i8 = c2562qX.b;
                        C2562qX c2562qX2 = uv0.a;
                        c2562qX2.D(i8, bArr2);
                        c2562qX2.F(i7);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            Uv0.c(c2562qX2);
                            if (c2562qX2.a() >= 5 && "::cue".equals(c2562qX2.s(5, AbstractC1402ed.c))) {
                                int i9 = c2562qX2.b;
                                String strB = Uv0.b(c2562qX2, sb);
                                if (strB == null) {
                                    str = str2;
                                } else if ("{".equals(strB)) {
                                    c2562qX2.F(i9);
                                    str = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i10 = c2562qX2.b;
                                        int i11 = c2562qX2.c;
                                        boolean z3 = false;
                                        while (i10 < i11 && !z3) {
                                            int i12 = i10 + 1;
                                            boolean z4 = ((char) c2562qX2.a[i10]) == ')';
                                            i10 = i12;
                                            z3 = z4;
                                        }
                                        strTrim = c2562qX2.s((i10 + i3) - c2562qX2.b, AbstractC1402ed.c).trim();
                                    } else {
                                        strTrim = str2;
                                    }
                                    str = strTrim;
                                    if (!")".equals(Uv0.b(c2562qX2, sb))) {
                                        str = str2;
                                    }
                                }
                            } else {
                                str = str2;
                            }
                            if (str != 0 && "{".equals(Uv0.b(c2562qX2, sb))) {
                                Vv0 vv0 = new Vv0();
                                vv0.a = "";
                                vv0.b = "";
                                vv0.c = Collections.emptySet();
                                vv0.d = "";
                                vv0.e = str2;
                                vv0.g = r6;
                                vv0.i = r6;
                                vv0.j = i3;
                                vv0.k = i3;
                                vv0.l = i3;
                                vv0.m = i3;
                                vv0.n = i3;
                                vv0.p = i3;
                                vv0.q = r6;
                                if (!"".equals(str)) {
                                    int iIndexOf = str.indexOf(91);
                                    if (iIndexOf != i3) {
                                        Matcher matcher2 = Uv0.c.matcher(str.substring(iIndexOf));
                                        if (matcher2.matches()) {
                                            strSubstring = str;
                                            String strGroup2 = matcher2.group(i4);
                                            strGroup2.getClass();
                                            vv0.d = strGroup2;
                                        }
                                        strSubstring = str;
                                        strSubstring = str.substring(r6, iIndexOf);
                                    }
                                    strSubstring = str;
                                    int i13 = Lr0.a;
                                    String[] strArrSplit = strSubstring.split("\\.", i3);
                                    String str3 = strArrSplit[r6];
                                    int iIndexOf2 = str3.indexOf(35);
                                    if (iIndexOf2 != i3) {
                                        vv0.b = str3.substring(r6, iIndexOf2);
                                        vv0.a = str3.substring(iIndexOf2 + i4);
                                    } else {
                                        vv0.b = str3;
                                    }
                                    if (strArrSplit.length > i4) {
                                        int length = strArrSplit.length;
                                        AbstractC0397Ej.c(length <= strArrSplit.length);
                                        vv0.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i4, length)));
                                    }
                                }
                                boolean z5 = false;
                                String strB2 = null;
                                while (!z5) {
                                    int i14 = c2562qX2.b;
                                    strB2 = Uv0.b(c2562qX2, sb);
                                    boolean z6 = strB2 == null || "}".equals(strB2);
                                    if (!z6) {
                                        c2562qX2.F(i14);
                                        Uv0.c(c2562qX2);
                                        String strA = Uv0.a(c2562qX2, sb);
                                        if (!"".equals(strA) && ":".equals(Uv0.b(c2562qX2, sb))) {
                                            Uv0.c(c2562qX2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z7 = false;
                                            while (true) {
                                                if (z7) {
                                                    string = sb2.toString();
                                                } else {
                                                    int i15 = c2562qX2.b;
                                                    boolean z8 = z7;
                                                    String strB3 = Uv0.b(c2562qX2, sb);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                        c2562qX2.F(i15);
                                                        z7 = true;
                                                    } else {
                                                        sb2.append(strB3);
                                                        z7 = z8;
                                                    }
                                                }
                                            }
                                            if (string != null && !"".equals(string)) {
                                                int i16 = c2562qX2.b;
                                                String strB4 = Uv0.b(c2562qX2, sb);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        vv0.f = AbstractC1700hf.a(string, true);
                                                        vv0.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        vv0.h = AbstractC1700hf.a(string, true);
                                                        vv0.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            vv0.p = 1;
                                                        } else if ("under".equals(string)) {
                                                            vv0.p = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if ("all".equals(string)) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = true;
                                                        }
                                                        vv0.q = z2;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            vv0.k = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        vv0.e = U9.I(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            vv0.l = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if ("italic".equals(string)) {
                                                            vv0.m = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = Uv0.d.matcher(U9.I(string));
                                                        if (matcher.matches()) {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            switch (strGroup.hashCode()) {
                                                                case 37:
                                                                    if (!strGroup.equals("%")) {
                                                                        b = 0;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup3 = matcher.group(i2);
                                                                    strGroup3.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup3);
                                                                    break;
                                                                case 3240:
                                                                    if (!strGroup.equals("em")) {
                                                                        b = 1;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup4 = matcher.group(i2);
                                                                    strGroup4.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup4);
                                                                    break;
                                                                case 3592:
                                                                    if (!strGroup.equals("px")) {
                                                                        b = 2;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup5 = matcher.group(i2);
                                                                    strGroup5.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup5);
                                                                    break;
                                                            }
                                                            b = -1;
                                                            switch (b) {
                                                                case 0:
                                                                    i2 = 1;
                                                                    vv0.n = 3;
                                                                    break;
                                                                case 1:
                                                                    i2 = 1;
                                                                    vv0.n = 2;
                                                                    break;
                                                                case 2:
                                                                    i2 = 1;
                                                                    vv0.n = 1;
                                                                    break;
                                                                default:
                                                                    throw new IllegalStateException();
                                                            }
                                                            String strGroup6 = matcher.group(i2);
                                                            strGroup6.getClass();
                                                            vv0.f583o = Float.parseFloat(strGroup6);
                                                        } else {
                                                            AP.z();
                                                        }
                                                    }
                                                } else if ("}".equals(strB4)) {
                                                    c2562qX2.F(i16);
                                                    if ("color".equals(strA)) {
                                                        vv0.f = AbstractC1700hf.a(string, true);
                                                        vv0.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        vv0.h = AbstractC1700hf.a(string, true);
                                                        vv0.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            vv0.p = 1;
                                                        } else if ("under".equals(string)) {
                                                            vv0.p = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        vv0.q = z2;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            vv0.k = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        vv0.e = U9.I(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            vv0.l = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if ("italic".equals(string)) {
                                                            vv0.m = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = Uv0.d.matcher(U9.I(string));
                                                        if (matcher.matches()) {
                                                            AP.z();
                                                        } else {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            switch (strGroup.hashCode()) {
                                                                case 37:
                                                                    if (!strGroup.equals("%")) {
                                                                        b = 0;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup7 = matcher.group(i2);
                                                                    strGroup7.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup7);
                                                                    break;
                                                                case 3240:
                                                                    if (!strGroup.equals("em")) {
                                                                        b = 1;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup8 = matcher.group(i2);
                                                                    strGroup8.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup8);
                                                                    break;
                                                                case 3592:
                                                                    if (!strGroup.equals("px")) {
                                                                        b = 2;
                                                                    }
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            vv0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            vv0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            vv0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup9 = matcher.group(i2);
                                                                    strGroup9.getClass();
                                                                    vv0.f583o = Float.parseFloat(strGroup9);
                                                                    break;
                                                            }
                                                            b = -1;
                                                            switch (b) {
                                                                case 0:
                                                                    i2 = 1;
                                                                    vv0.n = 3;
                                                                    break;
                                                                case 1:
                                                                    i2 = 1;
                                                                    vv0.n = 2;
                                                                    break;
                                                                case 2:
                                                                    i2 = 1;
                                                                    vv0.n = 1;
                                                                    break;
                                                                default:
                                                                    throw new IllegalStateException();
                                                            }
                                                            String strGroup10 = matcher.group(i2);
                                                            strGroup10.getClass();
                                                            vv0.f583o = Float.parseFloat(strGroup10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z5 = z6;
                                }
                                if ("}".equals(strB2)) {
                                    arrayList3.add(vv0);
                                }
                                i3 = -1;
                                i4 = 1;
                                r6 = 0;
                                str2 = null;
                            }
                        }
                        arrayList.addAll(arrayList3);
                    } else if (i5 == 3) {
                        Pattern pattern = AbstractC1149bw0.a;
                        Charset charset = AbstractC1402ed.c;
                        String strH2 = c2562qX.h(charset);
                        if (strH2 == null) {
                            wv0D = null;
                        } else {
                            Pattern pattern2 = AbstractC1149bw0.a;
                            Matcher matcher3 = pattern2.matcher(strH2);
                            if (matcher3.matches()) {
                                wv0D = AbstractC1149bw0.d(null, matcher3, c2562qX, arrayList);
                            } else {
                                wv0D = null;
                                String strH3 = c2562qX.h(charset);
                                if (strH3 != null) {
                                    Matcher matcher4 = pattern2.matcher(strH3);
                                    if (matcher4.matches()) {
                                        wv0D = AbstractC1149bw0.d(strH2.trim(), matcher4, c2562qX, arrayList);
                                    }
                                }
                            }
                        }
                        if (wv0D != null) {
                            arrayList2.add(wv0D);
                        }
                    }
                    c1246cw0 = this;
                    i3 = -1;
                    i4 = 1;
                }
            }
        } catch (C2949uX e) {
            throw new C3161wh0(e);
        }
    }
}
