package o;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: o.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1888jc {
    public static final C2147m8 c = new C2147m8(3);
    public final C3162wi a;
    public final int b;

    public C1888jc(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        boolean z2;
        int i5;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.a = new C3162wi(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.b = i4;
    }
}
