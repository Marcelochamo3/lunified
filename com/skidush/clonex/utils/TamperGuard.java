package com.skidush.clonex.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import o.AbstractC0911Ye;
import o.AbstractC1305dd;
import o.AbstractC1474fG;
import o.AbstractC2506pt;
import o.AbstractC3238xV;
import o.C3421zK;
import o.X10;
import o.X5;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public final class TamperGuard {
    public static final TamperGuard a = new TamperGuard();
    public static final String b;
    public static volatile boolean c;

    static {
        try {
            System.loadLibrary("blindaje");
        } catch (Throwable unused) {
        }
        b = AbstractC3238xV.a("mQyfBIe1FsYuum28SjmLtkQ9V5sPf5kM3LIEgLpHKdxWtga/GlmjE3cleABu5YmDZ59F+kGqT5hn5xGzw+mUFQ==");
    }

    public static void a(Context context) {
        AbstractC1474fG.j(context, "$context");
        do {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused) {
            }
            TamperGuard tamperGuard = a;
            if (!d(context)) {
                c(context, "WATCHDOG_INVALID_SIGNATURE");
                throw null;
            }
            try {
                int iNativeIntegrityFlags = tamperGuard.nativeIntegrityFlags();
                if (iNativeIntegrityFlags != 0) {
                    c(context, "WATCHDOG_".concat(b(iNativeIntegrityFlags)));
                    throw null;
                }
            } catch (Throwable unused2) {
                c(context, "WATCHDOG_NATIVE_CHECK_UNAVAILABLE");
                throw null;
            }
        } while (!Debug.isDebuggerConnected());
        c(context, "WATCHDOG_JAVA_DEBUGGER");
        throw null;
    }

    public static String b(int i) {
        C3421zK c3421zK = new C3421zK();
        if ((i & 1) != 0) {
            c3421zK.add("NATIVE_DEBUG");
        }
        if ((i & 2) != 0) {
            c3421zK.add("NATIVE_INSTRUMENTATION");
        }
        if (c3421zK.isEmpty()) {
            c3421zK.add("NATIVE_FLAGS_" + i);
        }
        return AbstractC0911Ye.h0(AbstractC2506pt.h(c3421zK), "+", null, null, null, 62);
    }

    public static void c(Context context, String str) {
        zy0.x(context, "TG", str);
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        System.exit(10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static boolean d(Context context) {
        Signature[] apkContentsSigners;
        String strR = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                if (apkContentsSigners == null) {
                    apkContentsSigners = new Signature[0];
                }
            } else {
                apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
                if (apkContentsSigners == null) {
                    apkContentsSigners = new Signature[0];
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Signature signature = apkContentsSigners.length == 0 ? null : apkContentsSigners[0];
            if (signature != null) {
                byte[] bArrDigest = messageDigest.digest(signature.toByteArray());
                AbstractC1474fG.i(bArrDigest, "digest(...)");
                strR = X5.R(bArrDigest, X10.E);
            }
        } catch (Throwable unused) {
        }
        if (strR == null) {
            return false;
        }
        Charset charset = AbstractC1305dd.a;
        byte[] bytes = strR.getBytes(charset);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        byte[] bytes2 = b.getBytes(charset);
        AbstractC1474fG.i(bytes2, "getBytes(...)");
        return MessageDigest.isEqual(bytes, bytes2);
    }

    private final native int nativeIntegrityFlags();

    public final void e(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        AbstractC1474fG.g(applicationContext);
        if (!d(applicationContext)) {
            c(applicationContext, str + "INVALID_SIGNATURE");
            throw null;
        }
        try {
            int iNativeIntegrityFlags = nativeIntegrityFlags();
            if (iNativeIntegrityFlags != 0) {
                c(applicationContext, str + b(iNativeIntegrityFlags));
                throw null;
            }
            if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                c(applicationContext, str + "JAVA_DEBUGGER");
                throw null;
            }
        } catch (Throwable unused) {
            c(applicationContext, str + "NATIVE_CHECK_UNAVAILABLE");
            throw null;
        }
    }
}
