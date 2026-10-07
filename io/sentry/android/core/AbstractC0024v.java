package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0024v {
    public static InterfaceC0002a0 a(Context context, G g) {
        return Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }

    public static String b(Context context, ILogger iLogger) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    public static String c(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static String d(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            iLogger.v(EnumC0094u1.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo e(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.h(EnumC0094u1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo f(Context context, int i, ILogger iLogger, G g) {
        try {
            g.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            iLogger.v(EnumC0094u1.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static String g(PackageInfo packageInfo, G g) {
        g.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean h(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.h(EnumC0094u1.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    public static Double i(Bundle bundle, ILogger iLogger, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        iLogger.h(EnumC0094u1.DEBUG, "%s read: %s", str, dValueOf);
        return dValueOf;
    }

    public static List j(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.h(EnumC0094u1.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long k(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.h(EnumC0094u1.DEBUG, "%s read: %s", str, Long.valueOf(j2));
        return j2;
    }

    public static String l(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.h(EnumC0094u1.DEBUG, "%s read: %s", str, string);
        return string;
    }

    public static F m(Context context, ILogger iLogger, G g) {
        String str;
        try {
            PackageInfo packageInfoF = f(context, 0, iLogger, g);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoF != null && packageManager != null) {
                str = packageInfoF.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new F(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.h(EnumC0094u1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }
}
