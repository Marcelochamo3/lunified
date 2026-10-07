package o;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: o.bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1131bn0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final C1326dn0 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final C1131bn0 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public C1131bn0(String str, String str2, long j, long j2, C1326dn0 c1326dn0, String[] strArr, String str3, String str4, C1131bn0 c1131bn0) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = c1326dn0;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = c1131bn0;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static C1131bn0 a(String str) {
        return new C1131bn0(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C3065vi c3065vi = new C3065vi();
            c3065vi.a = new SpannableStringBuilder();
            treeMap.put(str, c3065vi);
        }
        CharSequence charSequence = ((C3065vi) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C1131bn0 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (C1131bn0) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((C1131bn0) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.e;
        long j3 = this.d;
        return (j3 == -9223372036854775807L && j2 == -9223372036854775807L) || (j3 <= j && j2 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j < j2) || (j3 <= j && j < j2));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0204  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x0225  */
    /* JADX WARN: Code duplicated, block: B:151:0x0230  */
    /* JADX WARN: Code duplicated, block: B:154:0x0246  */
    /* JADX WARN: Code duplicated, block: B:156:0x024f  */
    /* JADX WARN: Code duplicated, block: B:159:0x025a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0260  */
    /* JADX WARN: Code duplicated, block: B:175:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    public final void h(long j, Map map, Map map2, String str, TreeMap treeMap) {
        int i;
        C1131bn0 c1131bn0;
        int i2;
        int i3;
        C1326dn0 c1326dn0D;
        int i4;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = -1;
        int i10 = 1;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map3 = this.k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C3065vi c3065vi = (C3065vi) treeMap.get(str4);
                    c3065vi.getClass();
                    C1228cn0 c1228cn0 = (C1228cn0) map2.get(str3);
                    c1228cn0.getClass();
                    C1326dn0 c1326dn0D2 = U9.D(this.f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c3065vi.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c3065vi.a = spannableStringBuilder;
                    }
                    if (c1326dn0D2 != null) {
                        int i11 = c1326dn0D2.h;
                        if (((i11 == i9 && c1326dn0D2.i == i9) ? -1 : (i11 == i10 ? 1 : 0) | (c1326dn0D2.i == i10 ? 2 : 0)) != i9) {
                            int i12 = c1326dn0D2.h;
                            if (i12 != i9) {
                                if (i12 == i10) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (c1326dn0D2.i == i10) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                i8 = i6 | i7;
                            } else if (c1326dn0D2.i == i9) {
                                i10 = 1;
                                i8 = -1;
                            } else {
                                i10 = 1;
                                if (i12 == i10) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (c1326dn0D2.i == i10) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                i8 = i6 | i7;
                            }
                            StyleSpan styleSpan = new StyleSpan(i8);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c1326dn0D2.f == i10) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c1326dn0D2.g == i10) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c1326dn0D2.c) {
                            if (!c1326dn0D2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            Sr0.a(spannableStringBuilder, new ForegroundColorSpan(c1326dn0D2.b), iIntValue, iIntValue2);
                        }
                        if (c1326dn0D2.e) {
                            if (!c1326dn0D2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            Sr0.a(spannableStringBuilder, new BackgroundColorSpan(c1326dn0D2.d), iIntValue, iIntValue2);
                        }
                        if (c1326dn0D2.a != null) {
                            Sr0.a(spannableStringBuilder, new TypefaceSpan(c1326dn0D2.a), iIntValue, iIntValue2);
                        }
                        Ji0 ji0 = c1326dn0D2.r;
                        if (ji0 != null) {
                            int i13 = ji0.a;
                            if (i13 == i9) {
                                int i14 = c1228cn0.j;
                                i13 = (i14 == 2 || i14 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = ji0.b;
                            }
                            int i15 = ji0.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            Sr0.a(spannableStringBuilder, new Ki0(i13, i5, i15), iIntValue, iIntValue2);
                        }
                        int i16 = c1326dn0D2.m;
                        if (i16 == 2) {
                            C1131bn0 c1131bn1 = this.j;
                            while (true) {
                                if (c1131bn1 == null) {
                                    c1131bn1 = null;
                                    break;
                                }
                                C1326dn0 c1326dn0D3 = U9.D(c1131bn1.f, c1131bn1.g, map);
                                if (c1326dn0D3 != null && c1326dn0D3.m == 1) {
                                    break;
                                } else {
                                    c1131bn1 = c1131bn1.j;
                                }
                            }
                            if (c1131bn1 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c1131bn1);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c1131bn0 = null;
                                        break;
                                    }
                                    C1131bn0 c1131bn2 = (C1131bn0) arrayDeque.pop();
                                    C1326dn0 c1326dn0D4 = U9.D(c1131bn2.f, c1131bn2.g, map);
                                    if (c1326dn0D4 != null && c1326dn0D4.m == 3) {
                                        c1131bn0 = c1131bn2;
                                        break;
                                    }
                                    for (int iC = c1131bn2.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(c1131bn2.b(iC));
                                    }
                                }
                                if (c1131bn0 != null) {
                                    if (c1131bn0.c() != 1 || c1131bn0.b(0).b == null) {
                                        AP.j();
                                    } else {
                                        String str5 = c1131bn0.b(0).b;
                                        int i17 = Lr0.a;
                                        C1326dn0 c1326dn0D5 = U9.D(c1131bn0.f, c1131bn0.g, map);
                                        if (c1326dn0D5 != null) {
                                            i3 = c1326dn0D5.n;
                                            i2 = -1;
                                        } else {
                                            i2 = -1;
                                            i3 = -1;
                                        }
                                        if (i3 == i2 && (c1326dn0D = U9.D(c1131bn1.f, c1131bn1.g, map)) != null) {
                                            i3 = c1326dn0D.n;
                                        }
                                        spannableStringBuilder.setSpan(new R80(str5, i3), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (c1326dn0D2.q == 1) {
                                Sr0.a(spannableStringBuilder, new SC(), iIntValue, iIntValue2);
                            }
                            i4 = c1326dn0D2.j;
                            if (i4 != 1) {
                                Sr0.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c1326dn0D2.k, true), iIntValue, iIntValue2);
                            } else if (i4 != 2) {
                                Sr0.a(spannableStringBuilder, new RelativeSizeSpan(c1326dn0D2.k), iIntValue, iIntValue2);
                            } else if (i4 == 3) {
                                Sr0.a(spannableStringBuilder, new RelativeSizeSpan(c1326dn0D2.k / 100.0f), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.a)) {
                                f = c1326dn0D2.s;
                                if (f != Float.MAX_VALUE) {
                                    c3065vi.q = (f * (-90.0f)) / 100.0f;
                                }
                                alignment = c1326dn0D2.f743o;
                                if (alignment != null) {
                                    c3065vi.c = alignment;
                                }
                                alignment2 = c1326dn0D2.p;
                                if (alignment2 != null) {
                                    c3065vi.d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new C1908jm(), iIntValue, iIntValue2, 33);
                        }
                        if (c1326dn0D2.q == 1) {
                            Sr0.a(spannableStringBuilder, new SC(), iIntValue, iIntValue2);
                        }
                        i4 = c1326dn0D2.j;
                        if (i4 != 1) {
                            Sr0.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c1326dn0D2.k, true), iIntValue, iIntValue2);
                        } else if (i4 != 2) {
                            Sr0.a(spannableStringBuilder, new RelativeSizeSpan(c1326dn0D2.k), iIntValue, iIntValue2);
                        } else if (i4 == 3) {
                            Sr0.a(spannableStringBuilder, new RelativeSizeSpan(c1326dn0D2.k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.a)) {
                            f = c1326dn0D2.s;
                            if (f != Float.MAX_VALUE) {
                                c3065vi.q = (f * (-90.0f)) / 100.0f;
                            }
                            alignment = c1326dn0D2.f743o;
                            if (alignment != null) {
                                c3065vi.c = alignment;
                            }
                            alignment2 = c1326dn0D2.p;
                            if (alignment2 != null) {
                                c3065vi.d = alignment2;
                            }
                        }
                    }
                    i9 = -1;
                    i10 = 1;
                }
                i9 = -1;
                i10 = 1;
            }
            for (int i18 = 0; i18 < c(); i18++) {
                b(i18).h(j, map, map2, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C3065vi) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C3065vi) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
