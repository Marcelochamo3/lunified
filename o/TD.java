package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class TD implements Closeable {
    public static final Nc0 M;
    public long A;
    public long B;
    public final Nc0 C;
    public Nc0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final Socket I;
    public final C1082bE J;
    public final OD K;
    public final LinkedHashSet L;
    public final KD m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f530o;
    public int p;
    public int q;
    public boolean r;
    public final C3454zi0 s;
    public final C3357yi0 t;
    public final C3357yi0 u;
    public final C3357yi0 v;
    public final C2691rp w;
    public long x;
    public long y;
    public long z;
    public final boolean l = true;
    public final LinkedHashMap n = new LinkedHashMap();

    static {
        Nc0 nc0 = new Nc0();
        nc0.c(7, AQ.w);
        nc0.c(5, 16384);
        M = nc0;
    }

    public TD(HD hd) {
        this.m = (KD) hd.g;
        String str = (String) hd.f;
        if (str == null) {
            AbstractC1474fG.U("connectionName");
            throw null;
        }
        this.f530o = str;
        this.q = 3;
        C3454zi0 c3454zi0 = (C3454zi0) hd.d;
        this.s = c3454zi0;
        C3357yi0 c3357yi0F = c3454zi0.f();
        this.t = c3357yi0F;
        this.u = c3454zi0.f();
        this.v = c3454zi0.f();
        this.w = C2691rp.y;
        Nc0 nc0 = new Nc0();
        nc0.c(7, 16777216);
        this.C = nc0;
        Nc0 nc1 = M;
        this.D = nc1;
        this.H = nc1.a();
        Socket socket = (Socket) hd.e;
        if (socket == null) {
            AbstractC1474fG.U("socket");
            throw null;
        }
        this.I = socket;
        M9 m9 = hd.b;
        if (m9 == null) {
            AbstractC1474fG.U("sink");
            throw null;
        }
        this.J = new C1082bE(m9, true);
        N9 n9 = hd.a;
        if (n9 == null) {
            AbstractC1474fG.U("source");
            throw null;
        }
        this.K = new OD(this, new WD(n9, true));
        this.L = new LinkedHashSet();
        int i = hd.c;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            c3357yi0F.c(new RD(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final void K(int i, boolean z, E9 e9, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.J.f(z, i, e9, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.G;
                            j3 = this.H;
                            if (j2 >= j3) {
                                if (!this.n.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.J.f692o);
                j4 = iMin;
                this.G += j4;
            }
            j -= j4;
            this.J.f(z && j == 0, i, e9, iMin);
        }
    }

    public final void Q(int i, int i2) {
        AbstractC1701hf0.q(i2, "errorCode");
        this.t.c(new MD(this.f530o + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void R(int i, long j) {
        this.t.c(new SD(this.f530o + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        AbstractC1701hf0.q(i, "connectionCode");
        AbstractC1701hf0.q(i2, "streamCode");
        byte[] bArr = Mr0.a;
        try {
            q(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.n.isEmpty()) {
                array = this.n.values().toArray(new C0984aE[0]);
                this.n.clear();
            } else {
                array = null;
            }
        }
        C0984aE[] c0984aEArr = (C0984aE[]) array;
        if (c0984aEArr != null) {
            for (C0984aE c0984aE : c0984aEArr) {
                try {
                    c0984aE.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.J.close();
        } catch (IOException unused3) {
        }
        try {
            this.I.close();
        } catch (IOException unused4) {
        }
        this.t.f();
        this.u.f();
        this.v.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final void f(IOException iOException) {
        a(2, 2, iOException);
    }

    public final void flush() {
        this.J.flush();
    }

    public final synchronized C0984aE i(int i) {
        return (C0984aE) this.n.get(Integer.valueOf(i));
    }

    public final synchronized boolean l(long j) {
        if (this.r) {
            return false;
        }
        return this.A >= this.z || j < this.B;
    }

    public final synchronized C0984aE p(int i) {
        C0984aE c0984aE;
        c0984aE = (C0984aE) this.n.remove(Integer.valueOf(i));
        notifyAll();
        return c0984aE;
    }

    public final void q(int i) {
        AbstractC1701hf0.q(i, "statusCode");
        synchronized (this.J) {
            synchronized (this) {
                if (this.r) {
                    return;
                }
                this.r = true;
                this.J.l(Mr0.a, this.p, i);
            }
        }
    }

    public final synchronized void t(long j) {
        long j2 = this.E + j;
        this.E = j2;
        long j3 = j2 - this.F;
        if (j3 >= this.C.a() / 2) {
            R(0, j3);
            this.F += j3;
        }
    }
}
