package o;

/* JADX INFO: loaded from: classes.dex */
public final class CD implements InterfaceC1991ke0 {
    public final C0851Vw l;
    public boolean m;
    public final /* synthetic */ HD n;

    public CD(HD hd) {
        this.n = hd;
        this.l = new C0851Vw(hd.b.c());
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return this.l;
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.n.b.N("0\r\n\r\n");
        HD hd = this.n;
        C0851Vw c0851Vw = this.l;
        hd.getClass();
        Hj0 hj0 = c0851Vw.e;
        c0851Vw.e = Hj0.d;
        hj0.a();
        hj0.b();
        this.n.c = 3;
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public final synchronized void flush() {
        if (this.m) {
            return;
        }
        this.n.b.flush();
    }

    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) {
        AbstractC1474fG.j(e9, "source");
        if (!(!this.m)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return;
        }
        HD hd = this.n;
        hd.b.k(j);
        M9 m9 = hd.b;
        m9.N("\r\n");
        m9.w(e9, j);
        m9.N("\r\n");
    }
}
