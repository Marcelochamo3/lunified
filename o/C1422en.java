package o;

import android.util.Log;
import io.sentry.C0032c;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: o.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1422en implements InterfaceC0763Sm {
    public final File m;
    public final long n;
    public C1325dn p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2720s4 f762o = new C2720s4(23, (byte) 0);
    public final C2994uv l = new C2994uv(24);

    public C1422en(File file, long j) {
        this.m = file;
        this.n = j;
    }

    public final synchronized C1325dn a() {
        try {
            if (this.p == null) {
                this.p = C1325dn.K(this.m, this.n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final synchronized void b() {
        this.p = null;
    }

    @Override // o.InterfaceC0763Sm
    public final void c(InterfaceC2450pI interfaceC2450pI, Na0 na0) {
        C0815Um c0815UmA;
        String strB0 = this.l.b0(interfaceC2450pI);
        C2720s4 c2720s4 = this.f762o;
        synchronized (c2720s4) {
            try {
                c0815UmA = (C0815Um) ((HashMap) c2720s4.m).get(strB0);
                if (c0815UmA == null) {
                    c0815UmA = ((C1788ia) c2720s4.n).a();
                    ((HashMap) c2720s4.m).put(strB0, c0815UmA);
                }
                c0815UmA.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c0815UmA.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC2450pI);
            }
            try {
                C1325dn c1325dnA = a();
                if (c1325dnA.q(strB0) != null) {
                    this.f762o.k0(strB0);
                    return;
                }
                C0032c c0032cL = c1325dnA.l(strB0);
                if (c0032cL == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strB0));
                }
                try {
                    if (((InterfaceC1916jq) na0.m).K(na0.n, c0032cL.o(), (FW) na0.f414o)) {
                        C1325dn.a((C1325dn) c0032cL.e, c0032cL, true);
                        c0032cL.b = true;
                    }
                    if (!c0032cL.b) {
                        try {
                            c0032cL.e();
                        } catch (IOException unused) {
                        }
                    }
                    this.f762o.k0(strB0);
                } catch (Throwable th2) {
                    if (!c0032cL.b) {
                        try {
                            c0032cL.e();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } catch (Throwable th3) {
            this.f762o.k0(strB0);
            throw th3;
        }
    }

    @Override // o.InterfaceC0763Sm
    public final synchronized void clear() {
        try {
            try {
                C1325dn c1325dnA = a();
                c1325dnA.close();
                Jr0.a(c1325dnA.l);
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    @Override // o.InterfaceC0763Sm
    public final File m(InterfaceC2450pI interfaceC2450pI) {
        String strB0 = this.l.b0(interfaceC2450pI);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC2450pI);
        }
        try {
            C2133m1 c2133m1Q = a().q(strB0);
            if (c2133m1Q != null) {
                return ((File[]) c2133m1Q.m)[0];
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }
}
