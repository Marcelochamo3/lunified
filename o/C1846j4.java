package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* JADX INFO: renamed from: o.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1846j4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static C1846j4 c;
    public Y70 a;

    public static synchronized C1846j4 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return Y70.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            C1846j4 c1846j4 = new C1846j4();
            c = c1846j4;
            c1846j4.a = Y70.d();
            c.a.l(new C1750i4());
        }
    }

    public static void e(Drawable drawable, C2673rg c2673rg, int[] iArr) {
        PorterDuff.Mode mode = Y70.h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c2673rg.b;
            if (z || c2673rg.a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z ? (ColorStateList) c2673rg.c : null;
                PorterDuff.Mode mode2 = c2673rg.a ? (PorterDuff.Mode) c2673rg.d : Y70.h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = Y70.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
