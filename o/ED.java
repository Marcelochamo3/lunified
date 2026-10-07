package o;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ED extends BD {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f232o;
    public final /* synthetic */ HD p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ED(HD hd, long j) {
        super(hd);
        this.p = hd;
        this.f232o = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        if (this.f232o != 0 && !Mr0.h(this, TimeUnit.MILLISECONDS)) {
            ((C50) this.p.e).l();
            a();
        }
        this.m = true;
    }

    @Override // o.BD, o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws ProtocolException {
        AbstractC1474fG.j(e9, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        if (!(!this.m)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.f232o;
        if (j2 == 0) {
            return -1L;
        }
        long jY = super.y(e9, Math.min(j2, j));
        if (jY == -1) {
            ((C50) this.p.e).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j3 = this.f232o - jY;
        this.f232o = j3;
        if (j3 == 0) {
            a();
        }
        return jY;
    }
}
