package io.sentry;

/* JADX INFO: renamed from: io.sentry.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0045g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
        a = iArr;
        try {
            iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
