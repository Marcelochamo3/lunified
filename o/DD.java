package o;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class DD extends BD {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2446pE f211o;
    public long p;
    public boolean q;
    public final /* synthetic */ HD r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD(HD hd, C2446pE c2446pE) {
        super(hd);
        AbstractC1474fG.j(c2446pE, "url");
        this.r = hd;
        this.f211o = c2446pE;
        this.p = -1L;
        this.q = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        if (this.q && !Mr0.h(this, TimeUnit.MILLISECONDS)) {
            ((C50) this.r.e).l();
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
        if (!this.q) {
            return -1L;
        }
        long j2 = this.p;
        HD hd = this.r;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                hd.a.A();
            }
            try {
                this.p = hd.a.S();
                String string = AbstractC1119bh0.E0(hd.a.A()).toString();
                if (this.p < 0 || (string.length() > 0 && !AbstractC1899jh0.U(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.p + string + '\"');
                }
                if (this.p == 0) {
                    this.q = false;
                    C3306y6 c3306y6 = (C3306y6) hd.f;
                    c3306y6.getClass();
                    C2112lq c2112lq = new C2112lq(1);
                    while (true) {
                        String strI = ((N9) c3306y6.n).I(c3306y6.m);
                        c3306y6.m -= (long) strI.length();
                        if (strI.length() == 0) {
                            break;
                        }
                        c2112lq.b(strI);
                    }
                    hd.g = c2112lq.f();
                    OV ov = (OV) hd.d;
                    AbstractC1474fG.g(ov);
                    C2152mB c2152mB = (C2152mB) hd.g;
                    AbstractC1474fG.g(c2152mB);
                    AbstractC1960kE.b(ov.u, this.f211o, c2152mB);
                    a();
                }
                if (!this.q) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jY = super.y(e9, Math.min(j, this.p));
        if (jY != -1) {
            this.p -= jY;
            return jY;
        }
        ((C50) hd.e).l();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
