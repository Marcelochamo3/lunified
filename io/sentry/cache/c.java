package io.sentry.cache;

import io.sentry.C0046g1;
import io.sentry.C0055j1;
import io.sentry.C0070o1;
import io.sentry.C0073p1;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.EnumC0091t1;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.R1;
import io.sentry.S1;
import io.sentry.U;
import io.sentry.android.core.d0;
import io.sentry.hints.h;
import io.sentry.hints.i;
import io.sentry.i2;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {
    public static final Charset r = Charset.forName("UTF-8");
    public final I1 l;
    public final U m;
    public final File n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f106o;
    public final CountDownLatch p;
    public final WeakHashMap q;

    public c(I1 i1, String str, int i) {
        io.sentry.config.a.C(i1, "SentryOptions is required.");
        this.l = i1;
        this.m = i1.getSerializer();
        this.n = new File(str);
        this.f106o = i;
        this.q = new WeakHashMap();
        this.p = new CountDownLatch(1);
    }

    public final File[] a() {
        File file = this.n;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.l.getLogger().h(EnumC0094u1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0218 A[PHI: r5 r6 r9
  0x0218: PHI (r5v5 java.io.File[]) = 
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v10 java.io.File[])
 binds: [B:10:0x0043, B:12:0x0051, B:25:0x008a, B:32:0x009d, B:35:0x00a3, B:37:0x00a9, B:311:0x0218] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r6v31 int) = (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v30 int), (r6v34 int) binds: [B:10:0x0043, B:12:0x0051, B:25:0x008a, B:32:0x009d, B:35:0x00a3, B:37:0x00a9, B:311:0x0218] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r9v18 java.io.File[]) = 
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v20 java.io.File[])
 binds: [B:10:0x0043, B:12:0x0051, B:25:0x008a, B:32:0x009d, B:35:0x00a3, B:37:0x00a9, B:311:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    @Override // io.sentry.cache.d
    public void b(C0088s1 c0088s1, C0104y c0104y) {
        Date dateK;
        int i;
        S1 s1F;
        Boolean bool;
        U u;
        C0070o1 c0070o1B;
        S1 s1F2;
        io.sentry.config.a.C(c0088s1, "Envelope is required.");
        File[] fileArrA = a();
        int length = fileArrA.length;
        int i2 = this.f106o;
        if (length >= i2) {
            I1 i1 = this.l;
            i1.getLogger().h(EnumC0094u1.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i3 = (length - i2) + 1;
            if (fileArrA.length > 1) {
                Arrays.sort(fileArrA, new d0(1));
            }
            File[] fileArr = (File[]) Arrays.copyOfRange(fileArrA, i3, length);
            int i4 = 0;
            while (i4 < i3) {
                File file = fileArrA[i4];
                C0088s1 c0088s1E = e(file);
                if (c0088s1E != null && ((Iterable) c0088s1E.m).iterator().hasNext()) {
                    i1.getClientReportRecorder().e(io.sentry.clientreport.d.CACHE_OVERFLOW, c0088s1E);
                    Iterator it = ((Iterable) c0088s1E.m).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            s1F = null;
                            break;
                        }
                        C0070o1 c0070o1 = (C0070o1) it.next();
                        if (c0070o1 == null ? false : c0070o1.a.n.equals(EnumC0091t1.Session)) {
                            s1F = f(c0070o1);
                            break;
                        }
                    }
                    if (s1F != null) {
                        if (!(s1F.r.equals(R1.Ok) && s1F.p != null) || (bool = s1F.q) == null || !bool.booleanValue()) {
                            fileArrA = fileArrA;
                            i3 = i3;
                            fileArr = fileArr;
                            break;
                        }
                        int length2 = fileArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                fileArrA = fileArrA;
                                i3 = i3;
                                fileArr = fileArr;
                                break;
                            }
                            File file2 = fileArr[i5];
                            C0088s1 c0088s1E2 = e(file2);
                            if (c0088s1E2 != null && ((Iterable) c0088s1E2.m).iterator().hasNext()) {
                                Iterable iterable = (Iterable) c0088s1E2.m;
                                Iterator it2 = iterable.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    u = this.m;
                                    if (!zHasNext) {
                                        fileArrA = fileArrA;
                                        i3 = i3;
                                        fileArr = fileArr;
                                        c0070o1B = null;
                                        break;
                                    }
                                    fileArrA = fileArrA;
                                    C0070o1 c0070o2 = (C0070o1) it2.next();
                                    if ((c0070o2 == null ? false : c0070o2.a.n.equals(EnumC0091t1.Session)) && (s1F2 = f(c0070o2)) != null) {
                                        if (s1F2.r.equals(R1.Ok) && s1F2.p != null) {
                                            Boolean bool2 = s1F2.q;
                                            UUID uuid = s1F.p;
                                            if (bool2 != null && bool2.booleanValue()) {
                                                i1.getLogger().h(EnumC0094u1.ERROR, "Session %s has 2 times the init flag.", uuid);
                                                break;
                                            }
                                            if (uuid == null || !uuid.equals(s1F2.p)) {
                                                s1F = s1F;
                                                length2 = length2;
                                            } else {
                                                s1F2.q = Boolean.TRUE;
                                                try {
                                                    c0070o1B = C0070o1.b(u, s1F2);
                                                    try {
                                                        it2.remove();
                                                        break;
                                                    } catch (IOException e) {
                                                        e = e;
                                                        i1.getLogger().s(EnumC0094u1.ERROR, e, "Failed to create new envelope item for the session %s", uuid);
                                                        c0070o1B = c0070o1B;
                                                        break;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    c0070o1B = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (c0070o1B != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it3 = iterable.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.add((C0070o1) it3.next());
                                    }
                                    arrayList.add(c0070o1B);
                                    C0088s1 c0088s2 = new C0088s1((C0055j1) c0088s1E2.l, arrayList);
                                    long jLastModified = file2.lastModified();
                                    if (!file2.delete()) {
                                        i1.getLogger().h(EnumC0094u1.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                    }
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            u.r(c0088s2, fileOutputStream);
                                            file2.setLastModified(jLastModified);
                                            fileOutputStream.close();
                                            break;
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        i1.getLogger().v(EnumC0094u1.ERROR, "Failed to serialize the new envelope to the disk.", th3);
                                        break;
                                    }
                                }
                            } else {
                                fileArrA = fileArrA;
                                i3 = i3;
                                fileArr = fileArr;
                                s1F = s1F;
                                length2 = length2;
                            }
                            i5++;
                            i3 = i3;
                            fileArrA = fileArrA;
                            fileArr = fileArr;
                            s1F = s1F;
                            length2 = length2;
                        }
                    } else {
                        fileArrA = fileArrA;
                        i3 = i3;
                        fileArr = fileArr;
                        break;
                    }
                } else {
                    fileArrA = fileArrA;
                    i3 = i3;
                    fileArr = fileArr;
                    break;
                }
                if (file.delete()) {
                    i = 1;
                } else {
                    i = 1;
                    i1.getLogger().h(EnumC0094u1.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
                i4 += i;
                i3 = i3;
                fileArrA = fileArrA;
                fileArr = fileArr;
            }
        }
        File file3 = new File(this.n.getAbsolutePath(), "session.json");
        File file4 = new File(this.n.getAbsolutePath(), "previous_session.json");
        if (io.sentry.config.a.u(c0104y, h.class) && !file3.delete()) {
            this.l.getLogger().h(EnumC0094u1.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.hints.a.class.isInstance(io.sentry.config.a.q(c0104y))) {
            Object objQ = io.sentry.config.a.q(c0104y);
            if (objQ instanceof io.sentry.hints.a) {
                File file5 = new File(this.n.getAbsolutePath(), "previous_session.json");
                boolean zExists = file5.exists();
                I1 i6 = this.l;
                if (zExists) {
                    ILogger logger = i6.getLogger();
                    EnumC0094u1 enumC0094u1 = EnumC0094u1.WARNING;
                    logger.h(enumC0094u1, "Previous session is not ended, we'd need to end it.", new Object[0]);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file5), r));
                        try {
                            S1 s1 = (S1) this.m.b(bufferedReader, S1.class);
                            if (s1 != null) {
                                io.sentry.hints.a aVar = (io.sentry.hints.a) objQ;
                                Long lA = aVar.a();
                                if (lA != null) {
                                    dateK = io.sentry.config.a.k(lA.longValue());
                                    Date date = s1.l;
                                    Date date2 = date == null ? null : (Date) date.clone();
                                    if (date2 == null || dateK.before(date2)) {
                                        i6.getLogger().h(enumC0094u1, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                    }
                                } else {
                                    dateK = null;
                                }
                                s1.c(R1.Abnormal, null, true, aVar.d());
                                s1.b(dateK);
                                h(file5, s1);
                            }
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            try {
                                bufferedReader.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        i6.getLogger().v(EnumC0094u1.ERROR, "Error processing previous session.", th6);
                    }
                } else {
                    i6.getLogger().h(EnumC0094u1.DEBUG, "No previous session file to end.", new Object[0]);
                }
            }
        }
        if (i.class.isInstance(io.sentry.config.a.q(c0104y))) {
            if (file3.exists()) {
                this.l.getLogger().h(EnumC0094u1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file3), r));
                    try {
                        S1 s2 = (S1) this.m.b(bufferedReader2, S1.class);
                        if (s2 != null) {
                            h(file4, s2);
                        }
                        bufferedReader2.close();
                    } catch (Throwable th7) {
                        try {
                            bufferedReader2.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (Throwable th9) {
                    this.l.getLogger().v(EnumC0094u1.ERROR, "Error processing session.", th9);
                }
            }
            Iterable iterable2 = (Iterable) c0088s1.m;
            boolean zHasNext2 = iterable2.iterator().hasNext();
            I1 i7 = this.l;
            if (zHasNext2) {
                C0070o1 c0070o3 = (C0070o1) iterable2.iterator().next();
                boolean zEquals = EnumC0091t1.Session.equals(c0070o3.a.n);
                C0073p1 c0073p1 = c0070o3.a;
                if (zEquals) {
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c0070o3.d()), r));
                        try {
                            S1 s3 = (S1) this.m.b(bufferedReader3, S1.class);
                            if (s3 == null) {
                                i7.getLogger().h(EnumC0094u1.ERROR, "Item of type %s returned null by the parser.", c0073p1.n);
                            } else {
                                h(file3, s3);
                            }
                            bufferedReader3.close();
                        } catch (Throwable th10) {
                            try {
                                bufferedReader3.close();
                                throw th10;
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                                throw th10;
                            }
                        }
                    } catch (Throwable th12) {
                        i7.getLogger().v(EnumC0094u1.ERROR, "Item failed to process.", th12);
                    }
                } else {
                    i7.getLogger().h(EnumC0094u1.INFO, "Current envelope has a different envelope type %s", c0073p1.n);
                }
            } else {
                i7.getLogger().h(EnumC0094u1.INFO, "Current envelope %s is empty", file3.getAbsolutePath());
            }
            if (!new File(this.l.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file6 = new File(this.l.getCacheDirPath(), "last_crash");
                if (file6.exists()) {
                    this.l.getLogger().h(EnumC0094u1.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file6.delete()) {
                        this.l.getLogger().h(EnumC0094u1.ERROR, "Failed to delete the crash marker file. %s.", file6.getAbsolutePath());
                    }
                }
            }
            C0046g1 c0046g1 = C0046g1.c;
            synchronized (c0046g1.b) {
                try {
                    if (!c0046g1.a) {
                        c0046g1.a = true;
                    }
                } catch (Throwable th13) {
                    throw th13;
                }
            }
            this.p.countDown();
        }
        File fileD = d(c0088s1);
        if (fileD.exists()) {
            this.l.getLogger().h(EnumC0094u1.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileD.getAbsolutePath());
            return;
        }
        ILogger logger2 = this.l.getLogger();
        EnumC0094u1 enumC0094u2 = EnumC0094u1.DEBUG;
        logger2.h(enumC0094u2, "Adding Envelope to offline storage: %s", fileD.getAbsolutePath());
        boolean zExists2 = fileD.exists();
        I1 i8 = this.l;
        if (zExists2) {
            i8.getLogger().h(enumC0094u2, "Overwriting envelope to offline storage: %s", fileD.getAbsolutePath());
            if (!fileD.delete()) {
                i8.getLogger().h(EnumC0094u1.ERROR, "Failed to delete: %s", fileD.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileD);
            try {
                this.m.r(c0088s1, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th14) {
                try {
                    fileOutputStream2.close();
                    throw th14;
                } catch (Throwable th15) {
                    th14.addSuppressed(th15);
                    throw th14;
                }
            }
        } catch (Throwable th16) {
            i8.getLogger().s(EnumC0094u1.ERROR, th16, "Error writing Envelope %s to offline storage", fileD.getAbsolutePath());
        }
        if (i2.class.isInstance(io.sentry.config.a.q(c0104y))) {
            I1 i9 = this.l;
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(i9.getCacheDirPath(), "last_crash"));
                try {
                    fileOutputStream3.write(io.sentry.config.a.r(io.sentry.config.a.j()).getBytes(r));
                    fileOutputStream3.flush();
                    fileOutputStream3.close();
                } catch (Throwable th17) {
                    try {
                        fileOutputStream3.close();
                        throw th17;
                    } catch (Throwable th18) {
                        th17.addSuppressed(th18);
                        throw th17;
                    }
                }
            } catch (Throwable th19) {
                i9.getLogger().v(EnumC0094u1.ERROR, "Error writing the crash marker file to the disk", th19);
            }
        }
    }

    @Override // io.sentry.cache.d
    public final void c(C0088s1 c0088s1) {
        io.sentry.config.a.C(c0088s1, "Envelope is required.");
        File fileD = d(c0088s1);
        boolean zExists = fileD.exists();
        I1 i1 = this.l;
        if (!zExists) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Envelope was not cached: %s", fileD.getAbsolutePath());
            return;
        }
        i1.getLogger().h(EnumC0094u1.DEBUG, "Discarding envelope from cache: %s", fileD.getAbsolutePath());
        if (fileD.delete()) {
            return;
        }
        i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete envelope: %s", fileD.getAbsolutePath());
    }

    public final synchronized File d(C0088s1 c0088s1) {
        String str;
        try {
            if (this.q.containsKey(c0088s1)) {
                str = (String) this.q.get(c0088s1);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.q.put(c0088s1, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.n.getAbsolutePath(), str);
    }

    public final C0088s1 e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C0088s1 c0088s1K = this.m.k(bufferedInputStream);
                bufferedInputStream.close();
                return c0088s1K;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.l.getLogger().v(EnumC0094u1.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final S1 f(C0070o1 c0070o1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c0070o1.d()), r));
            try {
                S1 s1 = (S1) this.m.b(bufferedReader, S1.class);
                bufferedReader.close();
                return s1;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.l.getLogger().v(EnumC0094u1.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public final boolean g() {
        I1 i1 = this.l;
        try {
            return this.p.await(i1.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            i1.getLogger().h(EnumC0094u1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void h(File file, S1 s1) {
        boolean zExists = file.exists();
        UUID uuid = s1.p;
        I1 i1 = this.l;
        if (zExists) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, r));
                try {
                    this.m.z(s1, bufferedWriter);
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
            i1.getLogger().s(EnumC0094u1.ERROR, th5, "Error writing Session to offline storage: %s", uuid);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        I1 i1 = this.l;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.m.k(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                i1.getLogger().v(EnumC0094u1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }
}
