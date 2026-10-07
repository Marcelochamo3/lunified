package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[d.values().length];
        a = iArr;
        try {
            iArr[d.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[d.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[d.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[d.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
