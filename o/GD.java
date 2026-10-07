package o;

/* JADX INFO: loaded from: classes.dex */
public final class GD extends BD {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f274o;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        if (!this.f274o) {
            a();
        }
        this.m = true;
    }

    @Override // o.BD, o.InterfaceC2091lf0
    public final long y(E9 e9, long j) {
        AbstractC1474fG.j(e9, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        if (!(!this.m)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f274o) {
            return -1L;
        }
        long jY = super.y(e9, j);
        if (jY != -1) {
            return jY;
        }
        this.f274o = true;
        a();
        return -1L;
    }
}
