package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: renamed from: o.rw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2706rw0 extends AbstractC2997uw0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final C0537Jt f = new C0537Jt(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        C1508fh c1508fhJ = j(view);
        if (c1508fhJ != null) {
            ((View) c1508fhJ.p).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        C1508fh c1508fhJ = j(view);
        if (c1508fhJ != null) {
            c1508fhJ.m = windowInsets;
            if (!z) {
                View view2 = (View) c1508fhJ.p;
                int[] iArr = (int[]) c1508fhJ.q;
                view2.getLocationOnScreen(iArr);
                z = true;
                c1508fhJ.n = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, Kw0 kw0, List list) {
        C1508fh c1508fhJ = j(view);
        if (c1508fhJ != null) {
            c1508fhJ.a(kw0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), kw0, list);
            }
        }
    }

    public static void h(View view, Vm0 vm0) {
        C1508fh c1508fhJ = j(view);
        if (c1508fhJ != null) {
            View view2 = (View) c1508fhJ.p;
            int[] iArr = (int[]) c1508fhJ.q;
            view2.getLocationOnScreen(iArr);
            int i = c1508fhJ.n - iArr[1];
            c1508fhJ.f779o = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), vm0);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C1508fh j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2610qw0) {
            return ((ViewOnApplyWindowInsetsListenerC2610qw0) tag).a;
        }
        return null;
    }
}
