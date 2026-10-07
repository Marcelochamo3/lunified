package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1082bE implements Closeable {
    public static final Logger r = Logger.getLogger(ID.class.getName());
    public final M9 l;
    public final boolean m;
    public final E9 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f692o;
    public boolean p;
    public final ZC q;

    public C1082bE(M9 m9, boolean z) {
        this.l = m9;
        this.m = z;
        E9 e9 = new E9();
        this.n = e9;
        this.f692o = 16384;
        this.q = new ZC(e9);
    }

    public final synchronized void K(Nc0 nc0) {
        int i;
        try {
            AbstractC1474fG.j(nc0, "settings");
            if (this.p) {
                throw new IOException("closed");
            }
            int i2 = 0;
            i(0, Integer.bitCount(nc0.a) * 6, 4, 0);
            while (i2 < 10) {
                if (((1 << i2) & nc0.a) != 0) {
                    if (i2 != 4) {
                        i = i2 != 7 ? i2 : 4;
                    } else {
                        i = 3;
                    }
                    this.l.r(i);
                    this.l.v(nc0.b[i2]);
                }
                i2++;
            }
            this.l.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void Q(int i, long j) {
        if (this.p) {
            throw new IOException("closed");
        }
        if (j == 0 || j > C1707hi0.a) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        i(i, 4, 8, 0);
        this.l.v((int) j);
        this.l.flush();
    }

    public final void R(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.f692o, j);
            j -= jMin;
            i(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.l.w(this.n, jMin);
        }
    }

    public final synchronized void a(Nc0 nc0) {
        try {
            AbstractC1474fG.j(nc0, "peerSettings");
            if (this.p) {
                throw new IOException("closed");
            }
            int i = this.f692o;
            int i2 = nc0.a;
            if ((i2 & 32) != 0) {
                i = nc0.b[5];
            }
            this.f692o = i;
            if (((i2 & 2) != 0 ? nc0.b[1] : -1) != -1) {
                ZC zc = this.q;
                int i3 = (i2 & 2) != 0 ? nc0.b[1] : -1;
                zc.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = zc.e;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        zc.c = Math.min(zc.c, iMin);
                    }
                    zc.d = true;
                    zc.e = iMin;
                    int i5 = zc.i;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            C1957kB[] c1957kBArr = zc.f;
                            X5.N(c1957kBArr, null, 0, c1957kBArr.length);
                            zc.g = zc.f.length - 1;
                            zc.h = 0;
                            zc.i = 0;
                        } else {
                            zc.a(i5 - iMin);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.l.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.p = true;
        this.l.close();
    }

    public final synchronized void f(boolean z, int i, E9 e9, int i2) {
        if (this.p) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            AbstractC1474fG.g(e9);
            this.l.w(e9, i2);
        }
    }

    public final synchronized void flush() {
        if (this.p) {
            throw new IOException("closed");
        }
        this.l.flush();
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = r;
        if (logger.isLoggable(level)) {
            logger.fine(ID.a(false, i, i2, i3, i4));
        }
        if (i2 > this.f692o) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f692o + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "reserved bit set: ").toString());
        }
        byte[] bArr = Mr0.a;
        M9 m9 = this.l;
        AbstractC1474fG.j(m9, "<this>");
        m9.F((i2 >>> 16) & 255);
        m9.F((i2 >>> 8) & 255);
        m9.F(i2 & 255);
        m9.F(i3 & 255);
        m9.F(i4 & 255);
        m9.v(i & Integer.MAX_VALUE);
    }

    public final synchronized void l(byte[] bArr, int i, int i2) {
        try {
            AbstractC1701hf0.q(i2, "errorCode");
            if (this.p) {
                throw new IOException("closed");
            }
            if (AbstractC1701hf0.w(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            i(0, bArr.length + 8, 7, 0);
            this.l.v(i);
            this.l.v(AbstractC1701hf0.w(i2));
            if (!(bArr.length == 0)) {
                this.l.G(bArr);
            }
            this.l.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p(boolean z, int i, ArrayList arrayList) {
        if (this.p) {
            throw new IOException("closed");
        }
        this.q.d(arrayList);
        long j = this.n.m;
        long jMin = Math.min(this.f692o, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        i(i, (int) jMin, 1, i2);
        this.l.w(this.n, jMin);
        if (j > jMin) {
            R(i, j - jMin);
        }
    }

    public final synchronized void q(int i, int i2, boolean z) {
        if (this.p) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z ? 1 : 0);
        this.l.v(i);
        this.l.v(i2);
        this.l.flush();
    }

    public final synchronized void t(int i, int i2) {
        AbstractC1701hf0.q(i2, "errorCode");
        if (this.p) {
            throw new IOException("closed");
        }
        if (AbstractC1701hf0.w(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        i(i, 4, 3, 0);
        this.l.v(AbstractC1701hf0.w(i2));
        this.l.flush();
    }
}
