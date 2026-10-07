package io.sentry.android.core;

import io.sentry.EnumC0094u1;

/* JADX INFO: renamed from: io.sentry.android.core.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0014k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0094u1.values().length];
        a = iArr;
        try {
            iArr[EnumC0094u1.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0094u1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC0094u1.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC0094u1.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EnumC0094u1.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
