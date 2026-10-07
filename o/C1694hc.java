package o;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1694hc {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public C1694hc(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1596gc c1596gc = (C1596gc) arrayList.get(size);
                int i = c1596gc.c;
                if (i != length) {
                    return;
                }
                c1596gc.c = i - 1;
            }
        }
    }

    public final C3162wi c(int i) {
        int i2;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i3));
            spannableStringBuilder.append('\n');
            i3++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i4 = this.e + this.f;
        int length = (32 - i4) - spannableStringBuilder.length();
        int i5 = i4 - length;
        if (i != Integer.MIN_VALUE) {
            i2 = i;
        } else if (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
            i2 = (this.g != 2 || i5 <= 0) ? 0 : 2;
        } else {
            i2 = 1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i4 = 32 - length;
            }
            f = ((i4 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        return new C3162wi(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            C1596gc c1596gc = (C1596gc) arrayList.get(i);
            boolean z2 = c1596gc.b;
            int i7 = c1596gc.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i6 = C1792ic.A[i7];
                }
                z = z3;
            }
            int i8 = c1596gc.c;
            i++;
            if (i8 != (i < arrayList.size() ? ((C1596gc) arrayList.get(i)).c : length)) {
                if (i2 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = i8;
                }
                if (i3 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                    i3 = -1;
                } else if (i3 == -1 && z) {
                    i3 = i8;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                    }
                    i5 = i6;
                    i4 = i8;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i4 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
