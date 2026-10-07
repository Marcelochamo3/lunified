package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Q6 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public Q6(Context context, C2278nc c2278nc) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = c2278nc;
        int i = Lr0.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.d = handler;
        int i2 = Lr0.a;
        this.e = i2 >= 23 ? new O6(this) : null;
        this.f = i2 >= 21 ? new C1066b4(1, this) : null;
        Uri uriFor = M6.a() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new P6(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void a(Q6 q6, M6 m6) {
        X60 x60;
        if (!q6.a || m6.equals((M6) q6.h)) {
            return;
        }
        q6.h = m6;
        C1904jk c1904jk = (C1904jk) ((C2278nc) q6.c).m;
        AbstractC0397Ej.f(c1904jk.f0 == Looper.myLooper());
        if (m6.equals(c1904jk.e())) {
            return;
        }
        c1904jk.w = m6;
        C0334By c0334By = c1904jk.r;
        if (c0334By != null) {
            AO ao = (AO) c0334By.m;
            synchronized (ao.l) {
                x60 = ao.y;
            }
            if (x60 != null) {
                ((C1128bm) x60).l();
            }
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((InterfaceC2719s30) this.c).getClass();
            }
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new RunnableC2976um(this, i, serializable, 0));
    }

    public Q6(AssetManager assetManager, Executor executor, InterfaceC2719s30 interfaceC2719s30, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = interfaceC2719s30;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC0397Ej.m;
                    break;
                case 26:
                    bArr = AbstractC0397Ej.l;
                    break;
                case 27:
                    bArr = AbstractC0397Ej.k;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0397Ej.j;
                    break;
                case 31:
                case 32:
                case 33:
                case C3080vp0.H /* 34 */:
                    bArr = AbstractC0397Ej.i;
                    break;
            }
        }
        this.d = bArr;
    }
}
