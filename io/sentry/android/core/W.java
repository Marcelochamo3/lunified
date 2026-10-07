package io.sentry.android.core;

import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;

/* JADX INFO: loaded from: classes.dex */
public final class W implements P, ILogger {
    public static final W l = new W();

    public static boolean a(String str, I1 i1) {
        return b(str, i1 != null ? i1.getLogger() : null) != null;
    }

    public static Class b(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.v(EnumC0094u1.DEBUG, "Class not available:".concat(str), e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.v(EnumC0094u1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e2);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.v(EnumC0094u1.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.ILogger
    public void h(EnumC0094u1 enumC0094u1, String str, Object... objArr) {
        int i = AbstractC0014k.a[enumC0094u1.ordinal()];
        String.format(str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean n(EnumC0094u1 enumC0094u1) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void s(EnumC0094u1 enumC0094u1, Throwable th, String str, Object... objArr) {
        v(enumC0094u1, String.format(str, objArr), th);
    }

    @Override // io.sentry.ILogger
    public void v(EnumC0094u1 enumC0094u1, String str, Throwable th) {
        int i = AbstractC0014k.a[enumC0094u1.ordinal()];
    }
}
