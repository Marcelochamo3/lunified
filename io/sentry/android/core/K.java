package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.protocol.C0079f;
import io.sentry.protocol.EnumC0078e;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public static volatile K h;
    public final Context a;
    public final SentryAndroidOptions b;
    public final G c;
    public final Boolean d;
    public final F e;
    public final io.sentry.protocol.m f;
    public final Long g;

    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[PHI: r8
  0x00cd: PHI (r8v5 java.lang.Process) = (r8v26 java.lang.Process), (r8v27 java.lang.Process) binds: [B:45:0x00cb, B:50:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public K(Context context, SentryAndroidOptions sentryAndroidOptions) {
        int length;
        Process processExec;
        Process process;
        Process process2;
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.a = context;
        this.b = sentryAndroidOptions;
        G g = new G(sentryAndroidOptions.getLogger());
        this.c = g;
        io.sentry.android.core.internal.util.c.b.a();
        io.sentry.protocol.m mVar = new io.sentry.protocol.m();
        mVar.l = "Android";
        mVar.m = Build.VERSION.RELEASE;
        mVar.f129o = Build.DISPLAY;
        String strD = AbstractC0024v.d(sentryAndroidOptions.getLogger());
        if (strD != null) {
            mVar.p = strD;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            io.sentry.android.core.internal.util.h hVar = new io.sentry.android.core.internal.util.h(context, sentryAndroidOptions.getLogger(), g);
            hVar.b.getClass();
            String str = Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                String[] strArr = hVar.d;
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    ILogger iLogger = hVar.c;
                    if (i < length2) {
                        String str2 = strArr[i];
                        try {
                            if (!new File(str2).exists()) {
                                i++;
                            }
                        } catch (RuntimeException e) {
                            length = new Object[]{str2};
                            iLogger.s(EnumC0094u1.ERROR, e, "Error when trying to check if root file %s exists.", length);
                        }
                    } else {
                        length = "su";
                        try {
                            try {
                                processExec = hVar.f.exec(new String[]{"/system/xbin/which", "su"});
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), io.sentry.android.core.internal.util.h.g));
                                    try {
                                        z = bufferedReader.readLine() != null;
                                        bufferedReader.close();
                                        processExec.destroy();
                                        length = processExec;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException unused) {
                                    iLogger.h(EnumC0094u1.DEBUG, "SU isn't found on this Device.", new Object[0]);
                                    process2 = processExec;
                                    process = processExec;
                                    if (processExec != null) {
                                        process.destroy();
                                        process2 = process;
                                    }
                                    z = false;
                                    length = process2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    iLogger.v(EnumC0094u1.DEBUG, "Error when trying to check if SU exists.", th);
                                    process2 = processExec;
                                    process = processExec;
                                    if (processExec != null) {
                                        process.destroy();
                                        process2 = process;
                                    }
                                    z = false;
                                    length = process2;
                                }
                            } catch (IOException unused2) {
                                processExec = null;
                            } catch (Throwable th4) {
                                th = th4;
                                processExec = null;
                            }
                            if (!z) {
                                io.sentry.config.a.C(iLogger, "The ILogger object is required.");
                                PackageManager packageManager = hVar.a.getPackageManager();
                                if (packageManager == null) {
                                    z2 = false;
                                    length = length;
                                    break;
                                }
                                String[] strArr2 = hVar.e;
                                length = strArr2.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        z2 = false;
                                        length = length;
                                        break;
                                    }
                                    String str3 = strArr2[i2];
                                    try {
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            packageManager.getPackageInfo(str3, PackageManager.PackageInfoFlags.of(0L));
                                        } else {
                                            packageManager.getPackageInfo(str3, 0);
                                        }
                                        z2 = true;
                                        length = length;
                                        break;
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                        i2++;
                                    }
                                }
                                if (!z2) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        } catch (Throwable th5) {
                            if (length != 0) {
                                length.destroy();
                            }
                            throw th5;
                        }
                    }
                    z3 = true;
                    break;
                }
                mVar.q = Boolean.valueOf(z3);
            } else {
                z3 = true;
                mVar.q = Boolean.valueOf(z3);
            }
        }
        this.f = mVar;
        this.d = this.c.b();
        this.e = AbstractC0024v.m(context, sentryAndroidOptions.getLogger(), this.c);
        ActivityManager.MemoryInfo memoryInfoE = AbstractC0024v.e(context, sentryAndroidOptions.getLogger());
        if (memoryInfoE != null) {
            this.g = Long.valueOf(memoryInfoE.totalMem);
        } else {
            this.g = null;
        }
    }

    public static Float b(Intent intent, SentryAndroidOptions sentryAndroidOptions) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static Boolean c(Intent intent, SentryAndroidOptions sentryAndroidOptions) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x0249  */
    /* JADX WARN: Code duplicated, block: B:129:0x029b  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:70:0x0190, B:72:0x0199), top: B:150:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f0  */
    public final C0079f a(boolean z, boolean z2) {
        EnumC0078e enumC0078e;
        Boolean bool;
        ILogger logger;
        DisplayMetrics displayMetrics;
        Date dateK;
        TimeZone timeZone;
        String strA;
        Locale locale;
        ArrayList arrayListA;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoE;
        File externalFilesDir;
        String externalStorageState;
        StatFs statFs;
        Long lValueOf;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        LocaleList locales;
        C0079f c0079f = new C0079f();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        boolean zIsSendDefaultPii = sentryAndroidOptions.isSendDefaultPii();
        Context context = this.a;
        if (zIsSendDefaultPii) {
            c0079f.l = Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        c0079f.m = Build.MANUFACTURER;
        c0079f.n = Build.BRAND;
        c0079f.f123o = AbstractC0024v.c(sentryAndroidOptions.getLogger());
        c0079f.p = Build.MODEL;
        c0079f.q = Build.ID;
        this.c.getClass();
        c0079f.r = Build.SUPPORTED_ABIS;
        Long lValueOf4 = null;
        try {
            int i2 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    try {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                enumC0078e = null;
                            } else {
                                enumC0078e = EnumC0078e.LANDSCAPE;
                            }
                            if (enumC0078e == null) {
                                try {
                                    sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                    enumC0078e = null;
                                } catch (Throwable th) {
                                    th = th;
                                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting device orientation.", th);
                                }
                            }
                            c0079f.v = enumC0078e;
                            bool = this.d;
                            if (bool != null) {
                                c0079f.w = bool;
                            }
                            logger = sentryAndroidOptions.getLogger();
                            displayMetrics = context.getResources().getDisplayMetrics();
                            if (displayMetrics != null) {
                                c0079f.F = Integer.valueOf(displayMetrics.widthPixels);
                                c0079f.G = Integer.valueOf(displayMetrics.heightPixels);
                                c0079f.H = Float.valueOf(displayMetrics.density);
                                c0079f.I = Integer.valueOf(displayMetrics.densityDpi);
                            }
                            dateK = io.sentry.config.a.k(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                            c0079f.J = dateK;
                            if (Build.VERSION.SDK_INT >= 24) {
                                locales = context.getResources().getConfiguration().getLocales();
                                if (locales.isEmpty()) {
                                    timeZone = Calendar.getInstance().getTimeZone();
                                } else {
                                    timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                                }
                            } else {
                                timeZone = Calendar.getInstance().getTimeZone();
                            }
                            c0079f.K = timeZone;
                            if (c0079f.L == null) {
                                try {
                                    strA = Q.a(context);
                                } catch (Throwable th2) {
                                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting installationId.", th2);
                                    strA = null;
                                }
                                c0079f.L = strA;
                            }
                            locale = Locale.getDefault();
                            if (c0079f.M == null) {
                                c0079f.M = locale.getLanguage();
                            }
                            if (c0079f.N == null) {
                                c0079f.N = locale.toString();
                            }
                            arrayListA = io.sentry.android.core.internal.util.c.b.a();
                            if (!arrayListA.isEmpty()) {
                                c0079f.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                                c0079f.Q = Integer.valueOf(arrayListA.size());
                            }
                            c0079f.x = this.g;
                            if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                                intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                                if (Build.VERSION.SDK_INT >= 33) {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
                                } else {
                                    intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                                }
                                if (intentRegisterReceiver != null) {
                                    c0079f.s = b(intentRegisterReceiver, sentryAndroidOptions);
                                    c0079f.t = c(intentRegisterReceiver, sentryAndroidOptions);
                                    try {
                                        intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                        if (intExtra != -1) {
                                            fValueOf = Float.valueOf(intExtra / 10.0f);
                                        } else {
                                            fValueOf = null;
                                        }
                                    } catch (Throwable th3) {
                                        sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting battery temperature.", th3);
                                    }
                                    c0079f.P = fValueOf;
                                }
                                i = J.a[sentryAndroidOptions.getConnectionStatusProvider().a().ordinal()];
                                if (i == 1) {
                                    bool2 = Boolean.FALSE;
                                } else if (i != 2) {
                                    bool2 = null;
                                } else {
                                    bool2 = Boolean.TRUE;
                                }
                                c0079f.u = bool2;
                                memoryInfoE = AbstractC0024v.e(context, sentryAndroidOptions.getLogger());
                                if (memoryInfoE != null && z2) {
                                    c0079f.y = Long.valueOf(memoryInfoE.availMem);
                                    c0079f.A = Boolean.valueOf(memoryInfoE.lowMemory);
                                }
                                externalFilesDir = context.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                                    try {
                                        lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th4) {
                                        sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting total internal storage amount.", th4);
                                        lValueOf2 = null;
                                    }
                                    c0079f.B = lValueOf2;
                                    try {
                                        lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                    } catch (Throwable th5) {
                                        sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting unused internal storage amount.", th5);
                                        lValueOf3 = null;
                                    }
                                    c0079f.C = lValueOf3;
                                }
                                externalStorageState = Environment.getExternalStorageState();
                                if ((!"mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated()) {
                                    sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                                } else {
                                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                                        int length = externalFilesDirs.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                                file = externalFilesDirs[i3];
                                                if (file != null && (absolutePath == null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath))) {
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Not possible to read external files directory", new Object[0]);
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th6) {
                                                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting total external storage amount.", th6);
                                                lValueOf = null;
                                            }
                                            c0079f.D = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th7) {
                                                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting unused external storage amount.", th7);
                                            }
                                            c0079f.E = lValueOf4;
                                        }
                                        if (c0079f.O == null) {
                                            c0079f.O = sentryAndroidOptions.getConnectionStatusProvider().c();
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Not possible to read external files directory", new Object[0]);
                                    }
                                    if (statFs != null) {
                                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                        c0079f.D = lValueOf;
                                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                        c0079f.E = lValueOf4;
                                    }
                                    if (c0079f.O == null) {
                                        c0079f.O = sentryAndroidOptions.getConnectionStatusProvider().c();
                                    }
                                }
                                statFs = null;
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    c0079f.D = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    c0079f.E = lValueOf4;
                                }
                                if (c0079f.O == null) {
                                    c0079f.O = sentryAndroidOptions.getConnectionStatusProvider().c();
                                }
                            }
                            return c0079f;
                        }
                        enumC0078e = EnumC0078e.PORTRAIT;
                        displayMetrics = context.getResources().getDisplayMetrics();
                    } catch (Throwable th8) {
                        logger.v(EnumC0094u1.ERROR, "Error getting DisplayMetrics.", th8);
                        displayMetrics = null;
                    }
                    if (enumC0078e == null) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        enumC0078e = null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    enumC0078e = null;
                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error getting device orientation.", th);
                    c0079f.v = enumC0078e;
                    bool = this.d;
                    if (bool != null) {
                        c0079f.w = bool;
                    }
                    logger = sentryAndroidOptions.getLogger();
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        c0079f.F = Integer.valueOf(displayMetrics.widthPixels);
                        c0079f.G = Integer.valueOf(displayMetrics.heightPixels);
                        c0079f.H = Float.valueOf(displayMetrics.density);
                        c0079f.I = Integer.valueOf(displayMetrics.densityDpi);
                    }
                    dateK = io.sentry.config.a.k(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    c0079f.J = dateK;
                    if (Build.VERSION.SDK_INT >= 24) {
                        locales = context.getResources().getConfiguration().getLocales();
                        if (locales.isEmpty()) {
                            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                        } else {
                            timeZone = Calendar.getInstance().getTimeZone();
                        }
                    } else {
                        timeZone = Calendar.getInstance().getTimeZone();
                    }
                    c0079f.K = timeZone;
                    if (c0079f.L == null) {
                        strA = Q.a(context);
                        c0079f.L = strA;
                    }
                    locale = Locale.getDefault();
                    if (c0079f.M == null) {
                        c0079f.M = locale.getLanguage();
                    }
                    if (c0079f.N == null) {
                        c0079f.N = locale.toString();
                    }
                    arrayListA = io.sentry.android.core.internal.util.c.b.a();
                    if (!arrayListA.isEmpty()) {
                        c0079f.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                        c0079f.Q = Integer.valueOf(arrayListA.size());
                    }
                    c0079f.x = this.g;
                    if (z) {
                        intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                        if (Build.VERSION.SDK_INT >= 33) {
                            intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
                        } else {
                            intentRegisterReceiver = context.registerReceiver(null, intentFilter);
                        }
                        if (intentRegisterReceiver != null) {
                            c0079f.s = b(intentRegisterReceiver, sentryAndroidOptions);
                            c0079f.t = c(intentRegisterReceiver, sentryAndroidOptions);
                            intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                            if (intExtra != -1) {
                                fValueOf = Float.valueOf(intExtra / 10.0f);
                            } else {
                                fValueOf = null;
                            }
                            c0079f.P = fValueOf;
                        }
                        i = J.a[sentryAndroidOptions.getConnectionStatusProvider().a().ordinal()];
                        if (i == 1) {
                            bool2 = Boolean.FALSE;
                        } else if (i != 2) {
                            bool2 = null;
                        } else {
                            bool2 = Boolean.TRUE;
                        }
                        c0079f.u = bool2;
                        memoryInfoE = AbstractC0024v.e(context, sentryAndroidOptions.getLogger());
                        if (memoryInfoE != null) {
                            c0079f.y = Long.valueOf(memoryInfoE.availMem);
                            c0079f.A = Boolean.valueOf(memoryInfoE.lowMemory);
                        }
                        externalFilesDir = context.getExternalFilesDir(null);
                        if (externalFilesDir != null) {
                            StatFs statFs3 = new StatFs(externalFilesDir.getPath());
                            lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                            c0079f.B = lValueOf2;
                            lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                            c0079f.C = lValueOf3;
                        }
                        externalStorageState = Environment.getExternalStorageState();
                        if ("mounted".equals(externalStorageState)) {
                            sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                        } else {
                            sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                        }
                        statFs = null;
                        if (statFs != null) {
                            lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                            c0079f.D = lValueOf;
                            lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                            c0079f.E = lValueOf4;
                        }
                        if (c0079f.O == null) {
                            c0079f.O = sentryAndroidOptions.getConnectionStatusProvider().c();
                        }
                    }
                    return c0079f;
                }
                dateK = io.sentry.config.a.k(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            } catch (IllegalArgumentException e) {
                sentryAndroidOptions.getLogger().s(EnumC0094u1.ERROR, e, "Error getting the device's boot time.", new Object[0]);
                dateK = null;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        c0079f.v = enumC0078e;
        bool = this.d;
        if (bool != null) {
            c0079f.w = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            c0079f.F = Integer.valueOf(displayMetrics.widthPixels);
            c0079f.G = Integer.valueOf(displayMetrics.heightPixels);
            c0079f.H = Float.valueOf(displayMetrics.density);
            c0079f.I = Integer.valueOf(displayMetrics.densityDpi);
        }
        c0079f.J = dateK;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
            } else {
                timeZone = Calendar.getInstance().getTimeZone();
            }
        } else {
            timeZone = Calendar.getInstance().getTimeZone();
        }
        c0079f.K = timeZone;
        if (c0079f.L == null) {
            strA = Q.a(context);
            c0079f.L = strA;
        }
        locale = Locale.getDefault();
        if (c0079f.M == null) {
            c0079f.M = locale.getLanguage();
        }
        if (c0079f.N == null) {
            c0079f.N = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.c.b.a();
        if (!arrayListA.isEmpty()) {
            c0079f.R = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            c0079f.Q = Integer.valueOf(arrayListA.size());
        }
        c0079f.x = this.g;
        if (z) {
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, 2);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter);
            }
            if (intentRegisterReceiver != null) {
                c0079f.s = b(intentRegisterReceiver, sentryAndroidOptions);
                c0079f.t = c(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                c0079f.P = fValueOf;
            }
            i = J.a[sentryAndroidOptions.getConnectionStatusProvider().a().ordinal()];
            if (i == 1) {
                bool2 = Boolean.FALSE;
            } else if (i != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            c0079f.u = bool2;
            memoryInfoE = AbstractC0024v.e(context, sentryAndroidOptions.getLogger());
            if (memoryInfoE != null) {
                c0079f.y = Long.valueOf(memoryInfoE.availMem);
                c0079f.A = Boolean.valueOf(memoryInfoE.lowMemory);
            }
            externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StatFs statFs4 = new StatFs(externalFilesDir.getPath());
                lValueOf2 = Long.valueOf(statFs4.getBlockCountLong() * statFs4.getBlockSizeLong());
                c0079f.B = lValueOf2;
                lValueOf3 = Long.valueOf(statFs4.getAvailableBlocksLong() * statFs4.getBlockSizeLong());
                c0079f.C = lValueOf3;
            }
            externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "External storage is not mounted or emulated.", new Object[0]);
            } else {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "External storage is not mounted or emulated.", new Object[0]);
            }
            statFs = null;
            if (statFs != null) {
                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                c0079f.D = lValueOf;
                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                c0079f.E = lValueOf4;
            }
            if (c0079f.O == null) {
                c0079f.O = sentryAndroidOptions.getConnectionStatusProvider().c();
            }
        }
        return c0079f;
    }
}
