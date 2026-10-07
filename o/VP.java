package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class VP {
    public static final int e;
    public final Context a;
    public final ActivityManager b;
    public final C0334By c;
    public final float d;

    static {
        e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public VP(Context context) {
        this.d = e;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new C0334By(16, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }
}
