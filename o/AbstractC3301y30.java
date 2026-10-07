package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: o.y30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3301y30 {
    public static final E70 a = new E70();
    public static final Object b = new Object();
    public static C2743sL c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC3107w30.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C2743sL b() {
        C2743sL c2743sL = new C2743sL(8);
        c = c2743sL;
        E70 e70 = a;
        e70.getClass();
        if (AbstractFutureC2034l0.f.g(e70, null, c2743sL)) {
            AbstractFutureC2034l0.b(e70);
        }
        return c;
    }

    public static void c(Context context, boolean z) {
        C3204x30 c3204x30A;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c3204x30A = C3204x30.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            c3204x30A = null;
                        }
                        if (c3204x30A != null && c3204x30A.c == jA && (i = c3204x30A.b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        C3204x30 c3204x30 = new C3204x30(1, (c3204x30A == null || c3204x30A.b != 2 || i3 != 1 || length >= c3204x30A.d) ? i3 : 3, jA, length2);
                        if (c3204x30A == null || !c3204x30A.equals(c3204x30)) {
                            try {
                                c3204x30.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
