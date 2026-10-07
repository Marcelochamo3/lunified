package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.C0001a;
import io.sentry.C0066n0;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0027y implements Runnable {
    public final Context l;
    public final io.sentry.K m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f86o;

    public RunnableC0027y(Context context, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.E e = io.sentry.E.a;
        this.l = context;
        this.m = e;
        this.n = sentryAndroidOptions;
        this.f86o = System.currentTimeMillis() - AnrV2Integration.n;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[Catch: all -> 0x0029, SYNTHETIC, TRY_LEAVE, TryCatch #5 {all -> 0x0029, blocks: (B:6:0x0015, B:10:0x0024, B:26:0x004f, B:63:0x00d9, B:62:0x00d6, B:58:0x00d0, B:8:0x001b, B:16:0x0030, B:25:0x004c, B:56:0x00cd, B:55:0x00ca), top: B:94:0x0015, inners: #0, #7 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        io.sentry.r rVar;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.n;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    rVar = new io.sentry.r(A.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = traceInputStream.read(bArr2, 0, 1024);
                            if (i == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, i);
                            }
                            if (traceInputStream != null) {
                                throw th;
                            }
                            try {
                                traceInputStream.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                    aVar.a = line;
                                    arrayList.add(aVar);
                                }
                                ArrayList arrayListD = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2).d(new io.sentry.android.core.internal.threaddump.b(arrayList));
                                if (arrayListD.isEmpty()) {
                                    rVar = new io.sentry.r(A.ERROR, byteArray);
                                    bufferedReader.close();
                                } else {
                                    io.sentry.r rVar2 = new io.sentry.r(A.DUMP, byteArray, arrayListD);
                                    bufferedReader.close();
                                    rVar = rVar2;
                                }
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            sentryAndroidOptions.getLogger().v(EnumC0094u1.WARNING, "Failed to parse ANR thread dump", th4);
                            rVar = new io.sentry.r(A.ERROR, byteArray);
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th7) {
                if (traceInputStream != null) {
                    throw th7;
                }
                traceInputStream.close();
                throw th7;
            }
        } catch (Throwable th8) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.WARNING, "Failed to read ANR thread dump", th8);
            rVar = new io.sentry.r(A.NO_DUMP);
        }
        A a = A.NO_DUMP;
        A a2 = (A) rVar.a;
        if (a2 == a) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        C0028z c0028z = new C0028z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        C0104y c0104yB = io.sentry.config.a.b(c0028z);
        C0083q1 c0083q1 = new C0083q1();
        if (a2 == A.ERROR) {
            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
            kVar.l = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c0083q1.B = kVar;
        } else if (a2 == A.DUMP) {
            c0083q1.D = new C0066n0((List) rVar.c);
        }
        c0083q1.F = EnumC0094u1.FATAL;
        c0083q1.A = io.sentry.config.a.k(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) rVar.b) != null) {
            c0104yB.e = new C0001a(bArr, "thread-dump.txt", "text/plain");
        }
        if (this.m.w(c0083q1, c0104yB).equals(io.sentry.protocol.t.m) || c0028z.c()) {
            return;
        }
        sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c0083q1.l);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:29:0x00b2->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        Iterator it;
        long timestamp;
        long j;
        Iterator it2;
        ApplicationExitInfo applicationExitInfoC;
        ApplicationExitInfo applicationExitInfoC2;
        List historicalProcessExitReasons = ((ActivityManager) this.l.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        int size = historicalProcessExitReasons.size();
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (size == 0) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.g()) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.p.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        int i = io.sentry.android.core.cache.a.t;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.config.a.C(cacheDirPath, "Cache dir path should be set for getting ANRs reported");
        File file = new File(cacheDirPath, "last_anr_report");
        ApplicationExitInfo applicationExitInfo = null;
        try {
            if (file.exists() && file.canRead()) {
                String strB = io.sentry.config.a.B(file);
                if (!strB.equals("null")) {
                    lValueOf = Long.valueOf(Long.parseLong(strB.trim()));
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    applicationExitInfoC2 = AbstractC0026x.c(it.next());
                    if (applicationExitInfoC2.getReason() == 6) {
                        arrayList.remove(applicationExitInfoC2);
                        applicationExitInfo = applicationExitInfoC2;
                        break;
                    }
                }
                if (applicationExitInfo == null) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                    return;
                }
                timestamp = applicationExitInfo.getTimestamp();
                j = this.f86o;
                if (timestamp < j) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                    return;
                }
                if (lValueOf == null && applicationExitInfo.getTimestamp() <= lValueOf.longValue()) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                    return;
                }
                if (sentryAndroidOptions.isReportHistoricalAnrs()) {
                    Collections.reverse(arrayList);
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        applicationExitInfoC = AbstractC0026x.c(it2.next());
                        if (applicationExitInfoC.getReason() != 6) {
                            if (applicationExitInfoC.getTimestamp() < j) {
                                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "ANR happened too long ago %s.", applicationExitInfoC);
                            } else if (lValueOf != null || applicationExitInfoC.getTimestamp() > lValueOf.longValue()) {
                                a(applicationExitInfoC, false);
                            } else {
                                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "ANR has already been reported %s.", applicationExitInfoC);
                            }
                        }
                    }
                }
                a(applicationExitInfo, true);
            }
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error reading last ANR marker", th);
        }
        lValueOf = null;
        it = arrayList.iterator();
        while (it.hasNext()) {
            applicationExitInfoC2 = AbstractC0026x.c(it.next());
            if (applicationExitInfoC2.getReason() == 6) {
                arrayList.remove(applicationExitInfoC2);
                applicationExitInfo = applicationExitInfoC2;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
            return;
        }
        timestamp = applicationExitInfo.getTimestamp();
        j = this.f86o;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
            return;
        }
        if (lValueOf == null) {
        }
        if (sentryAndroidOptions.isReportHistoricalAnrs()) {
            Collections.reverse(arrayList);
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                applicationExitInfoC = AbstractC0026x.c(it2.next());
                if (applicationExitInfoC.getReason() != 6) {
                    if (applicationExitInfoC.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "ANR happened too long ago %s.", applicationExitInfoC);
                    } else {
                        if (lValueOf != null) {
                        }
                        a(applicationExitInfoC, false);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
