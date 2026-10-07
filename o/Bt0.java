package o;

import android.view.View;
import com.skidush.clonex.R;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Bt0 {
    public static void a(View view, Gt0 gt0) {
        Nd0 nd0 = (Nd0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (nd0 == null) {
            nd0 = new Nd0();
            view.setTag(R.id.tag_unhandled_key_listeners, nd0);
        }
        Objects.requireNonNull(gt0);
        View.OnUnhandledKeyEventListener at0 = new At0();
        nd0.put(gt0, at0);
        view.addOnUnhandledKeyEventListener(at0);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, Gt0 gt0) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        Nd0 nd0 = (Nd0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (nd0 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) nd0.get(gt0)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC2726s7 abstractC2726s7) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
