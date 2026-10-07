package o;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: o.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3162wi implements T9 {
    public static final C3162wi C = new C3162wi("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final S1 U;
    public final int A;
    public final float B;
    public final CharSequence l;
    public final Layout.Alignment m;
    public final Layout.Alignment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bitmap f1099o;
    public final float p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final float v;
    public final boolean w;
    public final int x;
    public final int y;
    public final float z;

    static {
        int i = Lr0.a;
        D = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
        G = Integer.toString(3, 36);
        H = Integer.toString(4, 36);
        I = Integer.toString(5, 36);
        J = Integer.toString(6, 36);
        K = Integer.toString(7, 36);
        L = Integer.toString(8, 36);
        M = Integer.toString(9, 36);
        N = Integer.toString(10, 36);
        O = Integer.toString(11, 36);
        P = Integer.toString(12, 36);
        Q = Integer.toString(13, 36);
        R = Integer.toString(14, 36);
        S = Integer.toString(15, 36);
        T = Integer.toString(16, 36);
        U = new S1(4);
    }

    public C3162wi(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0397Ej.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.l = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.l = charSequence.toString();
        } else {
            this.l = null;
        }
        this.m = alignment;
        this.n = alignment2;
        this.f1099o = bitmap;
        this.p = f;
        this.q = i;
        this.r = i2;
        this.s = f2;
        this.t = i3;
        this.u = f4;
        this.v = f5;
        this.w = z;
        this.x = i5;
        this.y = i4;
        this.z = f3;
        this.A = i6;
        this.B = f6;
    }

    public final C3065vi a() {
        C3065vi c3065vi = new C3065vi();
        c3065vi.a = this.l;
        c3065vi.b = this.f1099o;
        c3065vi.c = this.m;
        c3065vi.d = this.n;
        c3065vi.e = this.p;
        c3065vi.f = this.q;
        c3065vi.g = this.r;
        c3065vi.h = this.s;
        c3065vi.i = this.t;
        c3065vi.j = this.y;
        c3065vi.k = this.z;
        c3065vi.l = this.u;
        c3065vi.m = this.v;
        c3065vi.n = this.w;
        c3065vi.f1078o = this.x;
        c3065vi.p = this.A;
        c3065vi.q = this.B;
        return c3065vi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3162wi.class != obj.getClass()) {
            return false;
        }
        C3162wi c3162wi = (C3162wi) obj;
        if (TextUtils.equals(this.l, c3162wi.l) && this.m == c3162wi.m && this.n == c3162wi.n) {
            Bitmap bitmap = c3162wi.f1099o;
            Bitmap bitmap2 = this.f1099o;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.p == c3162wi.p && this.q == c3162wi.q && this.r == c3162wi.r && this.s == c3162wi.s && this.t == c3162wi.t && this.u == c3162wi.u && this.v == c3162wi.v && this.w == c3162wi.w && this.x == c3162wi.x && this.y == c3162wi.y && this.z == c3162wi.z && this.A == c3162wi.A && this.B == c3162wi.B) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f1099o, Float.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Float.valueOf(this.s), Integer.valueOf(this.t), Float.valueOf(this.u), Float.valueOf(this.v), Boolean.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Float.valueOf(this.z), Integer.valueOf(this.A), Float.valueOf(this.B)});
    }
}
