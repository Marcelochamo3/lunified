package o;

/* JADX INFO: loaded from: classes.dex */
public final class FD implements InterfaceC1991ke0 {
    public final C0851Vw l;
    public boolean m;
    public final /* synthetic */ HD n;

    public FD(HD hd) {
        this.n = hd;
        this.l = new C0851Vw(hd.b.c());
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return this.l;
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        this.m = true;
        HD hd = this.n;
        hd.getClass();
        C0851Vw c0851Vw = this.l;
        Hj0 hj0 = c0851Vw.e;
        c0851Vw.e = Hj0.d;
        hj0.a();
        hj0.b();
        hd.c = 3;
    }

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
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
        Mr0.c(e9.m, 0L, j);
        this.n.b.w(e9, j);
    }
}
