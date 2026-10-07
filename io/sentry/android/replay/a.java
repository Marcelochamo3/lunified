package io.sentry.android.replay;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.B;
import io.sentry.android.core.RunnableC0006c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.concurrent.Executors;
import o.AbstractC3226xJ;
import o.I60;
import o.InterfaceC0360Cy;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC3226xJ implements InterfaceC0360Cy {
    public static final a n = new a(0, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f89o = new a(0, 1);
    public static final a p = new a(0, 2);
    public static final a q = new a(0, 3);
    public static final a r = new a(0, 4);
    public static final a s = new a(0, 5);
    public static final a t = new a(0, 6);
    public static final a u = new a(0, 7);
    public static final a v = new a(0, 8);
    public static final a w = new a(0, 9);
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() throws NoSuchFieldException {
        Method method;
        String str;
        int i = 3;
        switch (this.m) {
            case 0:
                return new I60("_[a-z]");
            case 1:
                return new SecureRandom();
            case 2:
                return Executors.newSingleThreadScheduledExecutor(new B(2));
            case 3:
                Class cls = (Class) s.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                Class cls2 = (Class) s.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 6:
                return Executors.newSingleThreadScheduledExecutor(new B(3));
            case 7:
                n nVar = new n();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC0006c(i, nVar));
                return nVar;
            case 8:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 24) {
                    str = "com.android.internal.policy.DecorView";
                } else {
                    str = i2 == 23 ? "com.android.internal.policy.PhoneWindow$DecorView" : "com.android.internal.policy.impl.PhoneWindow$DecorView";
                }
                try {
                    return Class.forName(str);
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                Class cls3 = (Class) x.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField(Build.VERSION.SDK_INT >= 24 ? "mWindow" : "this$0");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused3) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
