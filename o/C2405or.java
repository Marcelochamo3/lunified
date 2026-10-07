package o;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: o.or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2405or extends AbstractC0773Sw {
    public final long m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f955o;
    public boolean p;
    public final /* synthetic */ C2599qr q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2405or(C2599qr c2599qr, InterfaceC1991ke0 interfaceC1991ke0, long j) {
        super(interfaceC1991ke0);
        AbstractC1474fG.j(interfaceC1991ke0, "delegate");
        this.q = c2599qr;
        this.m = j;
    }

    public final IOException a(IOException iOException) {
        if (this.n) {
            return iOException;
        }
        this.n = true;
        return this.q.a(false, true, iOException);
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.p) {
            return;
        }
        this.p = true;
        long j = this.m;
        if (j != -1 && this.f955o != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // o.AbstractC0773Sw, o.InterfaceC1991ke0
    public final void w(E9 e9, long j) throws IOException {
        AbstractC1474fG.j(e9, "source");
        if (!(!this.p)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.m;
        if (j2 == -1 || this.f955o + j <= j2) {
            try {
                super.w(e9, j);
                this.f955o += j;
                return;
            } catch (IOException e) {
                throw a(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f955o + j));
    }
}
