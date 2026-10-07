package o;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: o.rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2692rp0 extends Rd0 {
    public final C2562qX m = new C2562qX();
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1013o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public C2692rp0(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f1013o = 0;
            this.p = -1;
            this.q = "sans-serif";
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f1013o = bArr[24];
        this.p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.q = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC1402ed.c)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.n = z;
        if (z) {
            this.r = Lr0.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.r = 0.85f;
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // o.Rd0
    public final InterfaceC2967uh0 f(byte[] bArr, int i, boolean z) throws C3161wh0 {
        String strS;
        C2562qX c2562qX = this.m;
        c2562qX.D(i, bArr);
        if (c2562qX.a() < 2) {
            throw new C3161wh0("Unexpected subtitle format.");
        }
        int iZ = c2562qX.z();
        if (iZ == 0) {
            strS = "";
        } else {
            int i2 = c2562qX.b;
            Charset charsetB = c2562qX.B();
            int i3 = iZ - (c2562qX.b - i2);
            if (charsetB == null) {
                charsetB = AbstractC1402ed.c;
            }
            strS = c2562qX.s(i3, charsetB);
        }
        if (strS.isEmpty()) {
            return C2789sp0.m;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        j(spannableStringBuilder, this.f1013o, 0, 0, spannableStringBuilder.length(), 16711680);
        i(spannableStringBuilder, this.p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.r;
        while (c2562qX.a() >= 8) {
            int i4 = c2562qX.b;
            int iG = c2562qX.g();
            int iG2 = c2562qX.g();
            if (iG2 == 1937013100) {
                if (c2562qX.a() < 2) {
                    throw new C3161wh0("Unexpected subtitle format.");
                }
                int iZ2 = c2562qX.z();
                for (int i5 = 0; i5 < iZ2; i5++) {
                    if (c2562qX.a() < 12) {
                        throw new C3161wh0("Unexpected subtitle format.");
                    }
                    int iZ3 = c2562qX.z();
                    int iZ4 = c2562qX.z();
                    c2562qX.G(2);
                    int iU = c2562qX.u();
                    c2562qX.G(1);
                    int iG3 = c2562qX.g();
                    if (iZ4 > spannableStringBuilder.length()) {
                        spannableStringBuilder.length();
                        AP.z();
                        iZ4 = spannableStringBuilder.length();
                    }
                    int i6 = iZ4;
                    if (iZ3 >= i6) {
                        AP.z();
                    } else {
                        j(spannableStringBuilder, iU, this.f1013o, iZ3, i6, 0);
                        i(spannableStringBuilder, iG3, this.p, iZ3, i6, 0);
                    }
                }
            } else if (iG2 == 1952608120 && this.n) {
                if (c2562qX.a() < 2) {
                    throw new C3161wh0("Unexpected subtitle format.");
                }
                fI = Lr0.i(c2562qX.z() / this.s, 0.0f, 0.95f);
            }
            c2562qX.F(i4 + iG);
        }
        return new C2789sp0(new C3162wi(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
