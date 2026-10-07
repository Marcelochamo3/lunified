package o;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ZD extends C2143m6 {
    public final /* synthetic */ C0984aE m;

    public ZD(C0984aE c0984aE) {
        this.m = c0984aE;
    }

    @Override // o.C2143m6
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.C2143m6
    public final void k() {
        this.m.e(9);
        TD td = this.m.b;
        synchronized (td) {
            long j = td.A;
            long j2 = td.z;
            if (j < j2) {
                return;
            }
            td.z = j2 + 1;
            td.B = System.nanoTime() + ((long) 1000000000);
            td.t.c(new C1130bn(AbstractC1701hf0.h(new StringBuilder(), td.f530o, " ping"), td, 1), 0L);
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
