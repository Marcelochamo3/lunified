package o;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.uu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2993uu0 {
    public static Integer d;
    public final View a;
    public final ArrayList b = new ArrayList();
    public ViewTreeObserverOnPreDrawListenerC0810Uh c;

    public C2993uu0(View view) {
        this.a = view;
    }

    public final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Log.isLoggable("ViewTarget", 4);
        Context context = view.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC3045vW.k(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }
}
