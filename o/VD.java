package o;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class VD implements InterfaceC2091lf0 {
    public final N9 l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f568o;
    public int p;
    public int q;

    public VD(N9 n9) {
        this.l = n9;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        int i;
        int i2;
        AbstractC1474fG.j(e9, "sink");
        do {
            int i3 = this.p;
            N9 n9 = this.l;
            if (i3 != 0) {
                long jY = n9.y(e9, Math.min(j, i3));
                if (jY == -1) {
                    return -1L;
                }
                this.p -= (int) jY;
                return jY;
            }
            n9.skip(this.q);
            this.q = 0;
            if ((this.n & 4) != 0) {
                return -1L;
            }
            i = this.f568o;
            int iT = Mr0.t(n9);
            this.p = iT;
            this.m = iT;
            int i4 = n9.readByte() & 255;
            this.n = n9.readByte() & 255;
            Logger logger = WD.p;
            if (logger.isLoggable(Level.FINE)) {
                C2468pa c2468pa = ID.a;
                logger.fine(ID.a(true, this.f568o, this.m, i4, this.n));
            }
            i2 = n9.readInt() & Integer.MAX_VALUE;
            this.f568o = i2;
            if (i4 != 9) {
                throw new IOException(i4 + " != TYPE_CONTINUATION");
            }
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
