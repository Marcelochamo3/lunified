package o;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: o.pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2502pr extends AbstractC0799Tw {
    public final long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f980o;
    public boolean p;
    public boolean q;
    public final /* synthetic */ C2599qr r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502pr(C2599qr c2599qr, InterfaceC2091lf0 interfaceC2091lf0, long j) {
        super(interfaceC2091lf0);
        AbstractC1474fG.j(interfaceC2091lf0, "delegate");
        this.r = c2599qr;
        this.m = j;
        this.f980o = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.p) {
            return iOException;
        }
        this.p = true;
        C2599qr c2599qr = this.r;
        if (iOException == null && this.f980o) {
            this.f980o = false;
            c2599qr.b.getClass();
            AbstractC1474fG.j(c2599qr.a, "call");
        }
        return c2599qr.a(true, false, iOException);
    }

    @Override // o.AbstractC0799Tw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.q) {
            return;
        }
        this.q = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // o.AbstractC0799Tw, o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        AbstractC1474fG.j(e9, "sink");
        if (!(!this.q)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long jY = this.l.y(e9, j);
            if (this.f980o) {
                this.f980o = false;
                C2599qr c2599qr = this.r;
                C2691rp c2691rp = c2599qr.b;
                A50 a50 = c2599qr.a;
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
            }
            if (jY == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.n + jY;
            long j3 = this.m;
            if (j3 == -1 || j2 <= j3) {
                this.n = j2;
                if (j2 == j3) {
                    a(null);
                }
                return jY;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
