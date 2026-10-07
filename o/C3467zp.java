package o;

import android.content.Context;
import android.graphics.Color;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3467zp {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C3467zp(Context context) {
        boolean z = zy0.z(context, R.attr.elevationOverlayEnabled, false);
        int iN = UK.n(context, R.attr.elevationOverlayColor, 0);
        int iN2 = UK.n(context, R.attr.elevationOverlayAccentColor, 0);
        int iN3 = UK.n(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iN;
        this.c = iN2;
        this.d = iN3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || AbstractC1894jf.f(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int I = UK.I(AbstractC1894jf.f(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            I = AbstractC1894jf.d(AbstractC1894jf.f(i2, f), I);
        }
        return AbstractC1894jf.f(I, iAlpha);
    }
}
