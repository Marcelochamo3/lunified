package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class A70 implements Handler.Callback {
    public static final C3325yL p = new C3325yL();
    public volatile ComponentCallbacks2C3406z70 l;
    public final C3325yL m;
    public final InterfaceC2225my n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2994uv f164o;

    public A70(C3325yL c3325yL) {
        c3325yL = c3325yL == null ? p : c3325yL;
        this.m = c3325yL;
        this.f164o = new C2994uv(c3325yL);
        this.n = (C1567gB.f && C1567gB.e) ? new C2024kv() : new C0622Nb(11);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final ComponentCallbacks2C3406z70 b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = Kr0.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1540fx) {
                AbstractActivityC1540fx abstractActivityC1540fx = (AbstractActivityC1540fx) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC1540fx.getApplicationContext());
                }
                if (abstractActivityC1540fx.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.n.e(abstractActivityC1540fx);
                Activity activityA = a(abstractActivityC1540fx);
                return this.f164o.Z(abstractActivityC1540fx, com.bumptech.glide.a.a(abstractActivityC1540fx.getApplicationContext()), abstractActivityC1540fx.f702o, abstractActivityC1540fx.u(), activityA == null || !activityA.isFinishing());
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(context.getApplicationContext());
                        C3325yL c3325yL = this.m;
                        C2691rp c2691rp = new C2691rp(22);
                        C0519Jb c0519Jb = new C0519Jb(16);
                        Context applicationContext = context.getApplicationContext();
                        c3325yL.getClass();
                        this.l = new ComponentCallbacks2C3406z70(aVarA, c2691rp, c0519Jb, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.l;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
