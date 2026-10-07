package o;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.zu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3478zu0 {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        c = Build.VERSION.SDK_INT >= 27;
    }
}
