package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: o.yu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3381yu0 {
    public static final Du0 a;
    public static final C3441zc b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new Gu0(18);
        } else if (i >= 23) {
            a = new Fu0(18);
        } else {
            a = new Du0(18);
        }
        b = new C3441zc(Float.class, "translationAlpha", 10);
        new C3441zc(Rect.class, "clipBounds", 11);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.P(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.G(view, i);
    }
}
