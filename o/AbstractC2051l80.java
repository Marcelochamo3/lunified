package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.l80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2051l80 implements Closeable {
    public C1953k80 l;

    public final InputStream a() {
        return p().V();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Mr0.d(p());
    }

    public final byte[] f() throws IOException {
        long jI = i();
        if (jI > C1707hi0.a) {
            throw new IOException(AbstractC1674hK.o(jI, "Cannot buffer entire body for content length: "));
        }
        N9 n9P = p();
        try {
            byte[] bArrC = n9P.C();
            AbstractC3409z9.g(n9P, null);
            int length = bArrC.length;
            if (jI == -1 || jI == length) {
                return bArrC;
            }
            throw new IOException("Content-Length (" + jI + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(n9P, th);
                throw th2;
            }
        }
    }

    public abstract long i();

    public abstract TP l();

    public abstract N9 p();

    public final String q() {
        Charset charsetA;
        N9 n9P = p();
        try {
            TP tpL = l();
            if (tpL == null || (charsetA = tpL.a(AbstractC1305dd.a)) == null) {
                charsetA = AbstractC1305dd.a;
            }
            String strU = n9P.U(Mr0.s(n9P, charsetA));
            AbstractC3409z9.g(n9P, null);
            return strU;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(n9P, th);
                throw th2;
            }
        }
    }
}
