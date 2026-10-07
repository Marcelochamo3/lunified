package io.sentry.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final boolean a;
    public static final boolean b;

    static {
        try {
            a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                b = false;
            }
        } catch (Throwable unused2) {
            b = false;
        }
    }
}
