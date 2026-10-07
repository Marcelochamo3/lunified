package o;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y3 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4) {
        Objects.requireNonNull(layoutInflaterFactory2C1456f4);
        X3 x3 = new X3(0, layoutInflaterFactory2C1456f4);
        C0.e(obj).registerOnBackInvokedCallback(1000000, x3);
        return x3;
    }

    public static void c(Object obj, Object obj2) {
        C0.e(obj).unregisterOnBackInvokedCallback(C0.b(obj2));
    }
}
