package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: o.xt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3282xt0 {
    public static Kw0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Kw0 kw0G = Kw0.g(null, rootWindowInsets);
        Hw0 hw0 = kw0G.a;
        hw0.p(kw0G);
        hw0.d(view.getRootView());
        return kw0G;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
