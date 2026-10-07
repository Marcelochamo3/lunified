package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0332Bw {
    public static final C2841tM a = new C2841tM(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final Nd0 d;

    static {
        ThreadFactoryC2921u70 threadFactoryC2921u70 = new ThreadFactoryC2921u70();
        threadFactoryC2921u70.a = "fonts-androidx";
        threadFactoryC2921u70.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC2921u70);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new Nd0(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static C0306Aw a(String str, Context context, C0560Kq c0560Kq, int i) {
        C2841tM c2841tM = a;
        Typeface typeface = (Typeface) c2841tM.f(str);
        if (typeface != null) {
            return new C0306Aw(typeface);
        }
        try {
            C2295nk0 c2295nk0R = AbstractC1370eA.r(context, c0560Kq);
            int i2 = 1;
            C0488Hw[] c0488HwArr = (C0488Hw[]) c2295nk0R.n;
            int i3 = c2295nk0R.m;
            if (i3 != 0) {
                if (i3 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else if (c0488HwArr != null && c0488HwArr.length != 0) {
                i2 = 0;
                for (C0488Hw c0488Hw : c0488HwArr) {
                    int i4 = c0488Hw.e;
                    if (i4 != 0) {
                        if (i4 >= 0) {
                            i2 = i4;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                }
            }
            if (i2 != 0) {
                return new C0306Aw(i2);
            }
            Typeface typefaceH = Lp0.a.h(context, c0488HwArr, i);
            if (typefaceH == null) {
                return new C0306Aw(-3);
            }
            c2841tM.k(str, typefaceH);
            return new C0306Aw(typefaceH);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0306Aw(-1);
        }
    }
}
