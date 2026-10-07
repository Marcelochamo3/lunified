package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class J {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.F.values().length];
        a = iArr;
        try {
            iArr[io.sentry.F.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.F.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
