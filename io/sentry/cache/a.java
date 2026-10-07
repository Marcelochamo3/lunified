package io.sentry.cache;

import io.sentry.C0038e;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(I1 i1, String str, String str2) {
        File file;
        String cacheDirPath = i1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            i1.getLogger().h(EnumC0094u1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Deleting %s from scope cache", str2);
            if (file3.delete()) {
                return;
            }
            i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
        }
    }

    public static Object b(SentryAndroidOptions sentryAndroidOptions, String str, String str2, Class cls, C0038e c0038e) {
        File file;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            file = new File(cacheDirPath, str);
            file.mkdirs();
        }
        if (file == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), a));
                try {
                    if (c0038e == null) {
                        Object objB = sentryAndroidOptions.getSerializer().b(bufferedReader, cls);
                        bufferedReader.close();
                        return objB;
                    }
                    Object objP = sentryAndroidOptions.getSerializer().p(bufferedReader, cls, c0038e);
                    bufferedReader.close();
                    return objP;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                sentryAndroidOptions.getLogger().s(EnumC0094u1.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static void c(I1 i1, Object obj, String str, String str2) {
        File file;
        String cacheDirPath = i1.getCacheDirPath();
        if (cacheDirPath == null) {
            file = null;
        } else {
            File file2 = new File(cacheDirPath, str);
            file2.mkdirs();
            file = file2;
        }
        if (file == null) {
            i1.getLogger().h(EnumC0094u1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file3 = new File(file, str2);
        if (file3.exists()) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file3.delete()) {
                i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete: %s", file3.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    i1.getSerializer().z(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            i1.getLogger().s(EnumC0094u1.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
