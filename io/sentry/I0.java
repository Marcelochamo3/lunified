package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements Runnable {
    public static final Charset n = Charset.forName("UTF-8");
    public final I1 l;
    public final K m;

    public I0(I1 i1) {
        E e = E.a;
        this.l = i1;
        this.m = e;
    }

    public final Date a(File file) {
        I1 i1 = this.l;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), n));
            try {
                String line = bufferedReader.readLine();
                i1.getLogger().h(EnumC0094u1.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateL = io.sentry.config.a.l(line);
                bufferedReader.close();
                return dateL;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            i1.getLogger().s(EnumC0094u1.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateA;
        I1 i1 = this.l;
        String cacheDirPath = i1.getCacheDirPath();
        if (cacheDirPath == null) {
            i1.getLogger().h(EnumC0094u1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!i1.isEnableAutoSessionTracking()) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = i1.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).g()) {
            i1.getLogger().h(EnumC0094u1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.r;
        File file = new File(cacheDirPath, "previous_session.json");
        U serializer = i1.getSerializer();
        if (file.exists()) {
            i1.getLogger().h(EnumC0094u1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), n));
                try {
                    S1 s1 = (S1) serializer.b(bufferedReader, S1.class);
                    if (s1 == null) {
                        i1.getLogger().h(EnumC0094u1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(i1.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            i1.getLogger().h(EnumC0094u1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateA = a(file2);
                            if (!file2.delete()) {
                                i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            s1.c(R1.Crashed, null, true, null);
                        } else {
                            dateA = null;
                        }
                        if (s1.y == null) {
                            s1.b(dateA);
                        }
                        this.m.x(new C0088s1(null, i1.getSdkVersion(), C0070o1.b(serializer, s1)));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                i1.getLogger().v(EnumC0094u1.ERROR, "Error processing previous session.", th3);
            }
            if (file.delete()) {
                return;
            }
            i1.getLogger().h(EnumC0094u1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
