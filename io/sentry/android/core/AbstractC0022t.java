package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0022t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.F.values().length];
        a = iArr;
        try {
            iArr[io.sentry.F.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.F.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[io.sentry.F.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
