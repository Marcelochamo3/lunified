package o;

import android.os.Build;
import android.os.StrictMode;
import io.sentry.C0032c;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1325dn implements Closeable {
    public final File l;
    public final File m;
    public final File n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f742o;
    public final long q;
    public BufferedWriter t;
    public int v;
    public long s = 0;
    public final LinkedHashMap u = new LinkedHashMap(0, 0.75f, true);
    public long w = 0;
    public final ThreadPoolExecutor x = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0867Wm());
    public final CallableC0841Vm y = new CallableC0841Vm(this);
    public final int p = 1;
    public final int r = 1;

    public C1325dn(File file, long j) {
        this.l = file;
        this.m = new File(file, "journal");
        this.n = new File(file, "journal.tmp");
        this.f742o = new File(file, "journal.bkp");
        this.q = j;
    }

    public static C1325dn K(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Y(file2, file3, false);
            }
        }
        C1325dn c1325dn = new C1325dn(file, j);
        if (c1325dn.m.exists()) {
            try {
                c1325dn.R();
                c1325dn.Q();
                return c1325dn;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                Objects.toString(file);
                e.getMessage();
                printStream.getClass();
                c1325dn.close();
                Jr0.a(c1325dn.l);
            }
        }
        file.mkdirs();
        C1325dn c1325dn2 = new C1325dn(file, j);
        c1325dn2.X();
        return c1325dn2;
    }

    public static void Y(File file, File file2, boolean z) throws IOException {
        if (z) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(C1325dn c1325dn, C0032c c0032c, boolean z) {
        synchronized (c1325dn) {
            C0945Zm c0945Zm = (C0945Zm) c0032c.c;
            if (c0945Zm.f != c0032c) {
                throw new IllegalStateException();
            }
            if (z && !c0945Zm.e) {
                for (int i = 0; i < c1325dn.r; i++) {
                    if (!((boolean[]) c0032c.d)[i]) {
                        c0032c.e();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c0945Zm.d[i].exists()) {
                        c0032c.e();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c1325dn.r; i2++) {
                File file = c0945Zm.d[i2];
                if (!z) {
                    i(file);
                } else if (file.exists()) {
                    File file2 = c0945Zm.c[i2];
                    file.renameTo(file2);
                    long j = c0945Zm.b[i2];
                    long length = file2.length();
                    c0945Zm.b[i2] = length;
                    c1325dn.s = (c1325dn.s - j) + length;
                }
            }
            c1325dn.v++;
            c0945Zm.f = null;
            if (c0945Zm.e || z) {
                c0945Zm.e = true;
                c1325dn.t.append((CharSequence) "CLEAN");
                c1325dn.t.append(' ');
                c1325dn.t.append((CharSequence) c0945Zm.a);
                c1325dn.t.append((CharSequence) c0945Zm.a());
                c1325dn.t.append('\n');
                if (z) {
                    c1325dn.w++;
                    c0945Zm.getClass();
                }
            } else {
                c1325dn.u.remove(c0945Zm.a);
                c1325dn.t.append((CharSequence) "REMOVE");
                c1325dn.t.append(' ');
                c1325dn.t.append((CharSequence) c0945Zm.a);
                c1325dn.t.append('\n');
            }
            p(c1325dn.t);
            if (c1325dn.s > c1325dn.q || c1325dn.t()) {
                c1325dn.x.submit(c1325dn.y);
            }
        }
    }

    public static void f(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void i(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void p(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void Q() throws IOException {
        i(this.n);
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            C0945Zm c0945Zm = (C0945Zm) it.next();
            C0032c c0032c = c0945Zm.f;
            int i = this.r;
            int i2 = 0;
            if (c0032c == null) {
                while (i2 < i) {
                    this.s += c0945Zm.b[i2];
                    i2++;
                }
            } else {
                c0945Zm.f = null;
                while (i2 < i) {
                    i(c0945Zm.c[i2]);
                    i(c0945Zm.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void R() {
        File file = this.m;
        Vg0 vg0 = new Vg0(new FileInputStream(file), Jr0.a);
        try {
            String strA = vg0.a();
            String strA2 = vg0.a();
            String strA3 = vg0.a();
            String strA4 = vg0.a();
            String strA5 = vg0.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.p).equals(strA3) || !Integer.toString(this.r).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    W(vg0.a());
                    i++;
                } catch (EOFException unused) {
                    this.v = i - this.u.size();
                    if (vg0.p == -1) {
                        X();
                    } else {
                        this.t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Jr0.a));
                    }
                    try {
                        vg0.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                vg0.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void W(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.u;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0945Zm c0945Zm = (C0945Zm) linkedHashMap.get(strSubstring);
        if (c0945Zm == null) {
            c0945Zm = new C0945Zm(this, strSubstring);
            linkedHashMap.put(strSubstring, c0945Zm);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0945Zm.f = new C0032c(this, c0945Zm);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0945Zm.e = true;
        c0945Zm.f = null;
        if (strArrSplit.length != c0945Zm.g.r) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0945Zm.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void X() {
        try {
            BufferedWriter bufferedWriter = this.t;
            if (bufferedWriter != null) {
                f(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.n), Jr0.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.p));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.r));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C0945Zm c0945Zm : this.u.values()) {
                    if (c0945Zm.f != null) {
                        bufferedWriter2.write("DIRTY " + c0945Zm.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c0945Zm.a + c0945Zm.a() + '\n');
                    }
                }
                f(bufferedWriter2);
                if (this.m.exists()) {
                    Y(this.m, this.f742o, true);
                }
                Y(this.n, this.m, false);
                this.f742o.delete();
                this.t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.m, true), Jr0.a));
            } catch (Throwable th) {
                f(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Z() {
        while (this.s > this.q) {
            String str = (String) ((Map.Entry) this.u.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.t == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C0945Zm c0945Zm = (C0945Zm) this.u.get(str);
                    if (c0945Zm != null && c0945Zm.f == null) {
                        for (int i = 0; i < this.r; i++) {
                            File file = c0945Zm.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.s;
                            long[] jArr = c0945Zm.b;
                            this.s = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.v++;
                        this.t.append((CharSequence) "REMOVE");
                        this.t.append(' ');
                        this.t.append((CharSequence) str);
                        this.t.append('\n');
                        this.u.remove(str);
                        if (t()) {
                            this.x.submit(this.y);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.t == null) {
                return;
            }
            Iterator it = new ArrayList(this.u.values()).iterator();
            while (it.hasNext()) {
                C0032c c0032c = ((C0945Zm) it.next()).f;
                if (c0032c != null) {
                    c0032c.e();
                }
            }
            Z();
            f(this.t);
            this.t = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C0032c l(String str) {
        synchronized (this) {
            try {
                if (this.t == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C0945Zm c0945Zm = (C0945Zm) this.u.get(str);
                if (c0945Zm == null) {
                    c0945Zm = new C0945Zm(this, str);
                    this.u.put(str, c0945Zm);
                } else if (c0945Zm.f != null) {
                    return null;
                }
                C0032c c0032c = new C0032c(this, c0945Zm);
                c0945Zm.f = c0032c;
                this.t.append((CharSequence) "DIRTY");
                this.t.append(' ');
                this.t.append((CharSequence) str);
                this.t.append('\n');
                p(this.t);
                return c0032c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C2133m1 q(String str) {
        if (this.t == null) {
            throw new IllegalStateException("cache is closed");
        }
        C0945Zm c0945Zm = (C0945Zm) this.u.get(str);
        if (c0945Zm == null) {
            return null;
        }
        if (!c0945Zm.e) {
            return null;
        }
        for (File file : c0945Zm.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.v++;
        this.t.append((CharSequence) "READ");
        this.t.append(' ');
        this.t.append((CharSequence) str);
        this.t.append('\n');
        if (t()) {
            this.x.submit(this.y);
        }
        return new C2133m1(19, c0945Zm.c);
    }

    public final boolean t() {
        int i = this.v;
        return i >= 2000 && i >= this.u.size();
    }
}
