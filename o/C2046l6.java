package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2046l6 implements InterfaceC2091lf0 {
    public final /* synthetic */ int l;
    public final Object m;
    public final Object n;

    public /* synthetic */ C2046l6(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        switch (this.l) {
            case 0:
                return (C2143m6) this.m;
            default:
                return (Hj0) this.n;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.l) {
            case 0:
                InterfaceC2091lf0 interfaceC2091lf0 = (InterfaceC2091lf0) this.n;
                C2143m6 c2143m6 = (C2143m6) this.m;
                c2143m6.h();
                try {
                    try {
                        interfaceC2091lf0.close();
                        if (c2143m6.i()) {
                            throw c2143m6.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c2143m6.i()) {
                            throw e;
                        }
                        throw c2143m6.j(e);
                    }
                } catch (Throwable th) {
                    c2143m6.i();
                    throw th;
                }
            default:
                ((InputStream) this.m).close();
                return;
        }
    }

    public final String toString() {
        switch (this.l) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC2091lf0) this.n) + ')';
            default:
                return "source(" + ((InputStream) this.m) + ')';
        }
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(e9, "sink");
                InterfaceC2091lf0 interfaceC2091lf0 = (InterfaceC2091lf0) this.n;
                C2143m6 c2143m6 = (C2143m6) this.m;
                c2143m6.h();
                try {
                    try {
                        long jY = interfaceC2091lf0.y(e9, j);
                        if (c2143m6.i()) {
                            throw c2143m6.j(null);
                        }
                        return jY;
                    } catch (Throwable th) {
                        c2143m6.i();
                        throw th;
                    }
                } catch (IOException e) {
                    if (c2143m6.i()) {
                        throw c2143m6.j(e);
                    }
                    throw e;
                }
            default:
                AbstractC1474fG.j(e9, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
                }
                try {
                    ((Hj0) this.n).f();
                    C3343yb0 c3343yb0B0 = e9.b0(1);
                    int i = ((InputStream) this.m).read(c3343yb0B0.a, c3343yb0B0.c, (int) Math.min(j, 8192 - c3343yb0B0.c));
                    if (i == -1) {
                        if (c3343yb0B0.b == c3343yb0B0.c) {
                            e9.l = c3343yb0B0.a();
                            Gb0.a(c3343yb0B0);
                        }
                        return -1L;
                    }
                    c3343yb0B0.c += i;
                    long j2 = i;
                    e9.m += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (Nr0.p(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }
}
