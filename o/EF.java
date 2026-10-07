package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class EF implements InterfaceC2091lf0 {
    public final N9 l;
    public final Inflater m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f233o;

    public EF(C3111w50 c3111w50, Inflater inflater) {
        this.l = c3111w50;
        this.m = inflater;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f233o) {
            return;
        }
        this.m.end();
        this.f233o = true;
        this.l.close();
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        long j2;
        AbstractC1474fG.j(e9, "sink");
        while (j >= 0) {
            if (!(!this.f233o)) {
                throw new IllegalStateException("closed".toString());
            }
            N9 n9 = this.l;
            Inflater inflater = this.m;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    C3343yb0 c3343yb0B0 = e9.b0(1);
                    int iMin = (int) Math.min(j, 8192 - c3343yb0B0.c);
                    if (inflater.needsInput() && !n9.D()) {
                        C3343yb0 c3343yb0 = n9.b().l;
                        AbstractC1474fG.g(c3343yb0);
                        int i = c3343yb0.c;
                        int i2 = c3343yb0.b;
                        int i3 = i - i2;
                        this.n = i3;
                        inflater.setInput(c3343yb0.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(c3343yb0B0.a, c3343yb0B0.c, iMin);
                    int i4 = this.n;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.n -= remaining;
                        n9.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c3343yb0B0.c += iInflate;
                        j2 = iInflate;
                        e9.m += j2;
                    } else {
                        if (c3343yb0B0.b == c3343yb0B0.c) {
                            e9.l = c3343yb0B0.a();
                            Gb0.a(c3343yb0B0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (n9.D()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
    }
}
