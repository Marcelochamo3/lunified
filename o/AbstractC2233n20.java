package o;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: o.n20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2233n20 {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
