package o;

import io.sentry.C0032c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1227cn implements Closeable, Flushable {
    public static final I60 E = new I60("[a-z0-9_-]{1,120}");
    public static final String F = "CLEAN";
    public static final String G = "DIRTY";
    public static final String H = "REMOVE";
    public static final String I = "READ";
    public boolean A;
    public long B;
    public final C3357yi0 C;
    public final C1130bn D;
    public final O9 l;
    public final File m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f723o;
    public final File p;
    public final File q;
    public long r;
    public M9 s;
    public final LinkedHashMap t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public C1227cn(File file, C3454zi0 c3454zi0) {
        O9 o9 = O9.t;
        AbstractC1474fG.j(c3454zi0, "taskRunner");
        this.l = o9;
        this.m = file;
        this.n = 10485760L;
        this.t = new LinkedHashMap(0, 0.75f, true);
        this.C = c3454zi0.f();
        this.D = new C1130bn(this, AbstractC1701hf0.h(new StringBuilder(), Mr0.g, " Cache"), 0);
        this.f723o = new File(file, "journal");
        this.p = new File(file, "journal.tmp");
        this.q = new File(file, "journal.bkp");
    }

    public static void Z(String str) {
        if (E.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final void K() throws IOException {
        File file = this.p;
        O9 o9 = this.l;
        o9.s(file);
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC1474fG.i(next, "i.next()");
            C0919Ym c0919Ym = (C0919Ym) next;
            int i = 0;
            if (c0919Ym.g == null) {
                while (i < 2) {
                    this.r += c0919Ym.b[i];
                    i++;
                }
            } else {
                c0919Ym.g = null;
                while (i < 2) {
                    o9.s((File) c0919Ym.c.get(i));
                    o9.s((File) c0919Ym.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void Q() {
        File file = this.f723o;
        this.l.getClass();
        AbstractC1474fG.j(file, "file");
        Logger logger = SV.a;
        C3111w50 c3111w50G = Nr0.g(new C2046l6(new FileInputStream(file), 1, Hj0.d));
        try {
            String strI = c3111w50G.I(Long.MAX_VALUE);
            String strI2 = c3111w50G.I(Long.MAX_VALUE);
            String strI3 = c3111w50G.I(Long.MAX_VALUE);
            String strI4 = c3111w50G.I(Long.MAX_VALUE);
            String strI5 = c3111w50G.I(Long.MAX_VALUE);
            if (!AbstractC1474fG.b("libcore.io.DiskLruCache", strI) || !AbstractC1474fG.b("1", strI2) || !AbstractC1474fG.b(String.valueOf(201105), strI3) || !AbstractC1474fG.b(String.valueOf(2), strI4) || strI5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strI + ", " + strI2 + ", " + strI4 + ", " + strI5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    R(c3111w50G.I(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.u = i - this.t.size();
                    if (c3111w50G.D()) {
                        this.s = t();
                    } else {
                        W();
                    }
                    AbstractC3409z9.g(c3111w50G, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c3111w50G, th);
                throw th2;
            }
        }
    }

    public final void R(String str) throws IOException {
        String strSubstring;
        int iD0 = AbstractC1119bh0.d0(str, ' ', 0, false, 6);
        if (iD0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iD0 + 1;
        int iD1 = AbstractC1119bh0.d0(str, ' ', i, false, 4);
        LinkedHashMap linkedHashMap = this.t;
        if (iD1 == -1) {
            strSubstring = str.substring(i);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = H;
            if (iD0 == str2.length() && AbstractC1899jh0.U(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iD1);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C0919Ym c0919Ym = (C0919Ym) linkedHashMap.get(strSubstring);
        if (c0919Ym == null) {
            c0919Ym = new C0919Ym(this, strSubstring);
            linkedHashMap.put(strSubstring, c0919Ym);
        }
        if (iD1 != -1) {
            String str3 = F;
            if (iD0 == str3.length() && AbstractC1899jh0.U(str, str3, false)) {
                String strSubstring2 = str.substring(iD1 + 1);
                AbstractC1474fG.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listS0 = AbstractC1119bh0.s0(strSubstring2, new char[]{' '}, 0, 6);
                c0919Ym.e = true;
                c0919Ym.g = null;
                int size = listS0.size();
                c0919Ym.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listS0);
                }
                try {
                    int size2 = listS0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c0919Ym.b[i2] = Long.parseLong((String) listS0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listS0);
                }
            }
        }
        if (iD1 == -1) {
            String str4 = G;
            if (iD0 == str4.length() && AbstractC1899jh0.U(str, str4, false)) {
                c0919Ym.g = new C0032c(this, c0919Ym);
                return;
            }
        }
        if (iD1 == -1) {
            String str5 = I;
            if (iD0 == str5.length() && AbstractC1899jh0.U(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void W() {
        try {
            M9 m9 = this.s;
            if (m9 != null) {
                m9.close();
            }
            C3014v50 c3014v50F = Nr0.f(this.l.F(this.p));
            try {
                c3014v50F.N("libcore.io.DiskLruCache");
                c3014v50F.F(10);
                c3014v50F.N("1");
                c3014v50F.F(10);
                c3014v50F.O(201105);
                c3014v50F.F(10);
                c3014v50F.O(2);
                c3014v50F.F(10);
                c3014v50F.F(10);
                Iterator it = this.t.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0919Ym c0919Ym = (C0919Ym) it.next();
                    if (c0919Ym.g != null) {
                        c3014v50F.N(G);
                        c3014v50F.F(32);
                        c3014v50F.N(c0919Ym.a);
                        c3014v50F.F(10);
                    } else {
                        c3014v50F.N(F);
                        c3014v50F.F(32);
                        c3014v50F.N(c0919Ym.a);
                        for (long j : c0919Ym.b) {
                            c3014v50F.F(32);
                            c3014v50F.O(j);
                        }
                        c3014v50F.F(10);
                    }
                }
                AbstractC3409z9.g(c3014v50F, null);
                if (this.l.u(this.f723o)) {
                    this.l.C(this.f723o, this.q);
                }
                this.l.C(this.p, this.f723o);
                this.l.s(this.q);
                this.s = t();
                this.v = false;
                this.A = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c3014v50F, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void X(C0919Ym c0919Ym) throws IOException {
        M9 m9;
        AbstractC1474fG.j(c0919Ym, "entry");
        boolean z = this.w;
        String str = c0919Ym.a;
        if (!z) {
            if (c0919Ym.h > 0 && (m9 = this.s) != null) {
                m9.N(G);
                m9.F(32);
                m9.N(str);
                m9.F(10);
                m9.flush();
            }
            if (c0919Ym.h > 0 || c0919Ym.g != null) {
                c0919Ym.f = true;
                return;
            }
        }
        C0032c c0032c = c0919Ym.g;
        if (c0032c != null) {
            c0032c.k();
        }
        for (int i = 0; i < 2; i++) {
            this.l.s((File) c0919Ym.c.get(i));
            long j = this.r;
            long[] jArr = c0919Ym.b;
            this.r = j - jArr[i];
            jArr[i] = 0;
        }
        this.u++;
        M9 m10 = this.s;
        if (m10 != null) {
            m10.N(H);
            m10.F(32);
            m10.N(str);
            m10.F(10);
        }
        this.t.remove(str);
        if (q()) {
            this.C.c(this.D, 0L);
        }
    }

    public final void Y() throws IOException {
        while (this.r > this.n) {
            for (C0919Ym c0919Ym : this.t.values()) {
                if (!c0919Ym.f) {
                    X(c0919Ym);
                }
            }
            return;
        }
        this.z = false;
    }

    public final synchronized void a() {
        if (!(!this.y)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.x && !this.y) {
                Collection collectionValues = this.t.values();
                AbstractC1474fG.i(collectionValues, "lruEntries.values");
                for (C0919Ym c0919Ym : (C0919Ym[]) collectionValues.toArray(new C0919Ym[0])) {
                    C0032c c0032c = c0919Ym.g;
                    if (c0032c != null && c0032c != null) {
                        c0032c.k();
                    }
                }
                Y();
                M9 m9 = this.s;
                AbstractC1474fG.g(m9);
                m9.close();
                this.s = null;
                this.y = true;
                return;
            }
            this.y = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(C0032c c0032c, boolean z) {
        AbstractC1474fG.j(c0032c, "editor");
        C0919Ym c0919Ym = (C0919Ym) c0032c.c;
        if (!AbstractC1474fG.b(c0919Ym.g, c0032c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z && !c0919Ym.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) c0032c.d;
                AbstractC1474fG.g(zArr);
                if (!zArr[i]) {
                    c0032c.e();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.l.u((File) c0919Ym.d.get(i))) {
                    c0032c.e();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            File file = (File) c0919Ym.d.get(i2);
            if (!z || c0919Ym.f) {
                this.l.s(file);
            } else if (this.l.u(file)) {
                File file2 = (File) c0919Ym.c.get(i2);
                this.l.C(file, file2);
                long j = c0919Ym.b[i2];
                this.l.getClass();
                long length = file2.length();
                c0919Ym.b[i2] = length;
                this.r = (this.r - j) + length;
            }
        }
        c0919Ym.g = null;
        if (c0919Ym.f) {
            X(c0919Ym);
            return;
        }
        this.u++;
        M9 m9 = this.s;
        AbstractC1474fG.g(m9);
        if (c0919Ym.e || z) {
            c0919Ym.e = true;
            m9.N(F).F(32);
            m9.N(c0919Ym.a);
            for (long j2 : c0919Ym.b) {
                m9.F(32).O(j2);
            }
            m9.F(10);
            if (z) {
                long j3 = this.B;
                this.B = 1 + j3;
                c0919Ym.i = j3;
            }
        } else {
            this.t.remove(c0919Ym.a);
            m9.N(H).F(32);
            m9.N(c0919Ym.a);
            m9.F(10);
        }
        m9.flush();
        if (this.r > this.n || q()) {
            this.C.c(this.D, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.x) {
            a();
            Y();
            M9 m9 = this.s;
            AbstractC1474fG.g(m9);
            m9.flush();
        }
    }

    public final synchronized C0032c i(long j, String str) {
        try {
            AbstractC1474fG.j(str, "key");
            p();
            a();
            Z(str);
            C0919Ym c0919Ym = (C0919Ym) this.t.get(str);
            if (j != -1 && (c0919Ym == null || c0919Ym.i != j)) {
                return null;
            }
            if ((c0919Ym != null ? c0919Ym.g : null) != null) {
                return null;
            }
            if (c0919Ym != null && c0919Ym.h != 0) {
                return null;
            }
            if (!this.z && !this.A) {
                M9 m9 = this.s;
                AbstractC1474fG.g(m9);
                m9.N(G).F(32).N(str).F(10);
                m9.flush();
                if (this.v) {
                    return null;
                }
                if (c0919Ym == null) {
                    c0919Ym = new C0919Ym(this, str);
                    this.t.put(str, c0919Ym);
                }
                C0032c c0032c = new C0032c(this, c0919Ym);
                c0919Ym.g = c0032c;
                return c0032c;
            }
            this.C.c(this.D, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1032an l(String str) {
        AbstractC1474fG.j(str, "key");
        p();
        a();
        Z(str);
        C0919Ym c0919Ym = (C0919Ym) this.t.get(str);
        if (c0919Ym == null) {
            return null;
        }
        C1032an c1032anA = c0919Ym.a();
        if (c1032anA == null) {
            return null;
        }
        this.u++;
        M9 m9 = this.s;
        AbstractC1474fG.g(m9);
        m9.N(I).F(32).N(str).F(10);
        if (q()) {
            this.C.c(this.D, 0L);
        }
        return c1032anA;
    }

    public final synchronized void p() {
        boolean z;
        try {
            byte[] bArr = Mr0.a;
            if (this.x) {
                return;
            }
            if (this.l.u(this.q)) {
                if (this.l.u(this.f723o)) {
                    this.l.s(this.q);
                } else {
                    this.l.C(this.q, this.f723o);
                }
            }
            O9 o9 = this.l;
            File file = this.q;
            AbstractC1474fG.j(o9, "<this>");
            AbstractC1474fG.j(file, "file");
            C1948k6 c1948k6F = o9.F(file);
            try {
                o9.s(file);
                AbstractC3409z9.g(c1948k6F, null);
                z = true;
            } catch (IOException unused) {
                AbstractC3409z9.g(c1948k6F, null);
                o9.s(file);
                z = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1948k6F, th);
                    throw th2;
                }
            }
            this.w = z;
            if (this.l.u(this.f723o)) {
                try {
                    Q();
                    K();
                    this.x = true;
                    return;
                } catch (IOException e) {
                    VY vy = VY.a;
                    VY vy2 = VY.a;
                    String str = "DiskLruCache " + this.m + " is corrupt: " + e.getMessage() + ", removing";
                    vy2.getClass();
                    VY.i(5, str, e);
                    try {
                        close();
                        this.l.t(this.m);
                        this.y = false;
                        W();
                        this.x = true;
                    } catch (Throwable th3) {
                        this.y = false;
                        throw th3;
                    }
                }
            }
            W();
            this.x = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean q() {
        int i = this.u;
        return i >= 2000 && i >= this.t.size();
    }

    public final C3014v50 t() {
        C1948k6 c1948k6;
        int i = 1;
        File file = this.f723o;
        this.l.getClass();
        AbstractC1474fG.j(file, "file");
        try {
            Logger logger = SV.a;
            c1948k6 = new C1948k6(new FileOutputStream(file, true), i, new Hj0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = SV.a;
            c1948k6 = new C1948k6(new FileOutputStream(file, true), i, new Hj0());
        }
        return Nr0.f(new C0666Ot(c1948k6, new io.sentry.android.replay.v(3, this)));
    }
}
