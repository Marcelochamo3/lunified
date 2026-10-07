package o;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: o.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161c3 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final C0537Jt b = new C0537Jt(1);
    public static final C0537Jt c = new C0537Jt(0);
    public static final C0537Jt d = new C0537Jt(2);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
