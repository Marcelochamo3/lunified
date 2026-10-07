package o;

/* JADX INFO: loaded from: classes.dex */
public final class XD implements InterfaceC1991ke0 {
    public final boolean l;
    public final E9 m = new E9();
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0984aE f614o;

    public XD(C0984aE c0984aE, boolean z) {
        this.f614o = c0984aE;
        this.l = z;
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        C0984aE c0984aE = this.f614o;
        synchronized (c0984aE) {
            c0984aE.l.h();
            while (c0984aE.e >= c0984aE.f && !this.l && !this.n && c0984aE.f() == 0) {
                try {
                    c0984aE.l();
                } catch (Throwable th) {
                    c0984aE.l.l();
                    throw th;
                }
            }
            c0984aE.l.l();
            c0984aE.b();
            jMin = Math.min(c0984aE.f - c0984aE.e, this.m.m);
            c0984aE.e += jMin;
            z2 = z && jMin == this.m.m;
        }
        this.f614o.l.h();
        try {
            C0984aE c0984aE2 = this.f614o;
            c0984aE2.b.K(c0984aE2.a, z2, this.m, jMin);
        } finally {
            this.f614o.l.l();
        }
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return this.f614o.l;
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0984aE c0984aE = this.f614o;
        byte[] bArr = Mr0.a;
        synchronized (c0984aE) {
            if (this.n) {
                return;
            }
            boolean z = c0984aE.f() == 0;
            C0984aE c0984aE2 = this.f614o;
            if (!c0984aE2.j.l) {
                if (this.m.m > 0) {
                    while (this.m.m > 0) {
                        a(true);
                    }
                } else if (z) {
                    c0984aE2.b.K(c0984aE2.a, true, null, 0L);
                }
            }
            synchronized (this.f614o) {
                this.n = true;
            }
            this.f614o.b.flush();
            this.f614o.a();
        }
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
        C0984aE c0984aE = this.f614o;
        byte[] bArr = Mr0.a;
        synchronized (c0984aE) {
            c0984aE.b();
        }
        while (this.m.m > 0) {
            a(false);
            this.f614o.b.flush();
        }
    }

    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) {
        AbstractC1474fG.j(e9, "source");
        byte[] bArr = Mr0.a;
        E9 e10 = this.m;
        e10.w(e9, j);
        while (e10.m >= 16384) {
            a(false);
        }
    }
}
