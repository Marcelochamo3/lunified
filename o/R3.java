package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class R3 {
    public static final P3 l = new P3(new Q3(0));
    public static final int m = -100;
    public static C2356oL n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static C2356oL f480o = null;
    public static Boolean p = null;
    public static boolean q = false;
    public static final U5 r = new U5();
    public static final Object s = new Object();
    public static final Object t = new Object();

    public static boolean a(Context context) {
        if (p == null) {
            try {
                int i = AbstractServiceC2625r5.l;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC2625r5.class), Build.VERSION.SDK_INT >= 24 ? AbstractC2529q5.a() | 128 : 640).metaData;
                if (bundle != null) {
                    p = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p = Boolean.FALSE;
            }
        }
        return p.booleanValue();
    }

    public static void d(R3 r3) {
        synchronized (s) {
            try {
                U5 u5 = r;
                u5.getClass();
                O5 o5 = new O5(u5);
                while (o5.hasNext()) {
                    R3 r4 = (R3) ((WeakReference) o5.next()).get();
                    if (r4 == r3 || r4 == null) {
                        o5.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract boolean e(int i);

    public abstract void f(int i);

    public abstract void g(View view);

    public abstract void h(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void i(CharSequence charSequence);
}
