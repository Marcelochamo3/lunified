package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: o.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2587ql implements IV {
    public final HV l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Fg0 f993o;
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;

    public C2587ql(Fg0 fg0, long j, long j2, long j3, long j4, boolean z) {
        AbstractC0397Ej.c(j >= 0 && j2 > j);
        this.f993o = fg0;
        this.m = j;
        this.n = j2;
        if (j3 == j2 - j || z) {
            this.q = j4;
            this.p = 4;
        } else {
            this.p = 0;
        }
        this.l = new HV();
    }

    @Override // o.IV
    public final InterfaceC2664rb0 d() {
        if (this.q != 0) {
            return new C2490pl(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // o.IV
    public final long e(C0554Kk c0554Kk) throws IOException {
        long jK;
        long j;
        int i = this.p;
        long j2 = this.n;
        HV hv = this.l;
        if (i == 0) {
            long j3 = c0554Kk.f369o;
            this.r = j3;
            this.p = 1;
            long j4 = j2 - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.t;
                long j6 = this.u;
                if (j5 == j6) {
                    hv = hv;
                    j = -1;
                    jK = -1;
                } else {
                    long j7 = c0554Kk.f369o;
                    if (hv.b(c0554Kk, j6)) {
                        hv.a(c0554Kk, false);
                        c0554Kk.q = 0;
                        long j8 = this.s;
                        long j9 = hv.b;
                        long j10 = j8 - j9;
                        int i2 = hv.d + hv.e;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.u = j7;
                                this.w = j9;
                            } else {
                                this.t = c0554Kk.f369o + ((long) i2);
                                this.v = j9;
                            }
                            long j11 = this.u;
                            long j12 = this.t;
                            if (j11 - j12 < 100000) {
                                this.u = j12;
                                jK = j12;
                            } else {
                                jK = Lr0.k((((j11 - j12) * j10) / (this.w - this.v)) + (c0554Kk.f369o - (((long) i2) * (j10 <= 0 ? 2L : 1L))), j12, j11 - 1);
                            }
                            j = -1;
                        } else {
                            hv = hv;
                            j = -1;
                            jK = -1;
                        }
                    } else {
                        long j13 = this.t;
                        if (j13 == j7) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jK = j13;
                    }
                    j = -1;
                }
                if (jK != j) {
                    return jK;
                }
                this.p = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = -1;
                hv = hv;
            }
            HV hv2 = hv;
            while (true) {
                hv2.b(c0554Kk, j);
                hv2.a(c0554Kk, false);
                if (hv2.b > this.s) {
                    c0554Kk.q = 0;
                    this.p = 4;
                    return -(this.v + 2);
                }
                c0554Kk.q(hv2.d + hv2.e);
                this.t = c0554Kk.f369o;
                this.v = hv2.b;
                j = -1;
            }
        }
        hv.a = 0;
        hv.b = 0L;
        hv.c = 0;
        hv.d = 0;
        hv.e = 0;
        if (!hv.b(c0554Kk, -1L)) {
            throw new EOFException();
        }
        hv.a(c0554Kk, false);
        c0554Kk.q(hv.d + hv.e);
        long j14 = hv.b;
        while ((hv.a & 4) != 4 && hv.b(c0554Kk, -1L) && c0554Kk.f369o < j2 && hv.a(c0554Kk, true)) {
            try {
                c0554Kk.q(hv.d + hv.e);
                j14 = hv.b;
            } catch (EOFException unused) {
            }
        }
        this.q = j14;
        this.p = 4;
        return this.r;
    }

    @Override // o.IV
    public final void k(long j) {
        this.s = Lr0.k(j, 0L, this.q - 1);
        this.p = 2;
        this.t = this.m;
        this.u = this.n;
        this.v = 0L;
        this.w = this.q;
    }
}
