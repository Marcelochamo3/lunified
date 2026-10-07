package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class YD implements InterfaceC2091lf0 {
    public final long l;
    public boolean m;
    public final E9 n = new E9();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E9 f633o = new E9();
    public boolean p;
    public final /* synthetic */ C0984aE q;

    public YD(C0984aE c0984aE, long j, boolean z) {
        this.q = c0984aE;
        this.l = j;
        this.m = z;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.q.k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C0984aE c0984aE = this.q;
        synchronized (c0984aE) {
            this.p = true;
            E9 e9 = this.f633o;
            j = e9.m;
            e9.p();
            c0984aE.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = Mr0.a;
            this.q.b.t(j);
        }
        this.q.a();
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws Throwable {
        Throwable gg0;
        boolean z;
        long jY;
        AbstractC1474fG.j(e9, "sink");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        while (true) {
            C0984aE c0984aE = this.q;
            synchronized (c0984aE) {
                c0984aE.k.h();
                try {
                    if (c0984aE.f() == 0 || this.m) {
                        gg0 = null;
                    } else {
                        gg0 = c0984aE.n;
                        if (gg0 == null) {
                            int iF = c0984aE.f();
                            AbstractC1701hf0.p(iF);
                            gg0 = new Gg0(iF);
                        }
                    }
                    if (this.p) {
                        throw new IOException("stream closed");
                    }
                    E9 e10 = this.f633o;
                    long j3 = e10.m;
                    z = false;
                    if (j3 > j2) {
                        jY = e10.y(e9, Math.min(j, j3));
                        long j4 = c0984aE.c + jY;
                        c0984aE.c = j4;
                        long j5 = j4 - c0984aE.d;
                        if (gg0 == null && j5 >= c0984aE.b.C.a() / 2) {
                            c0984aE.b.R(c0984aE.a, j5);
                            c0984aE.d = c0984aE.c;
                        }
                    } else {
                        if (!this.m && gg0 == null) {
                            c0984aE.l();
                            z = true;
                        }
                        jY = -1;
                    }
                    c0984aE.k.l();
                } catch (Throwable th) {
                    c0984aE.k.l();
                    throw th;
                }
            }
            if (!z) {
                if (jY != -1) {
                    return jY;
                }
                if (gg0 == null) {
                    return -1L;
                }
                throw gg0;
            }
            j2 = 0;
        }
    }
}
