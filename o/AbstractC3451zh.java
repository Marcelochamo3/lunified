package o;

import android.content.Context;

/* JADX INFO: renamed from: o.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3451zh {
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
