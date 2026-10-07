package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class C9 extends InputStream {
    public final /* synthetic */ int l;
    public final /* synthetic */ N9 m;

    public /* synthetic */ C9(N9 n9, int i) {
        this.l = i;
        this.m = n9;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.l) {
            case 0:
                return (int) Math.min(((E9) this.m).m, Integer.MAX_VALUE);
            default:
                C3111w50 c3111w50 = (C3111w50) this.m;
                if (c3111w50.n) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c3111w50.m.m, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.l) {
            case 0:
                break;
            default:
                ((C3111w50) this.m).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.l) {
            case 0:
                E9 e9 = (E9) this.m;
                if (e9.m > 0) {
                    return e9.readByte() & 255;
                }
                return -1;
            default:
                C3111w50 c3111w50 = (C3111w50) this.m;
                if (c3111w50.n) {
                    throw new IOException("closed");
                }
                E9 e10 = c3111w50.m;
                if (e10.m == 0 && c3111w50.l.y(e10, 8192L) == -1) {
                    return -1;
                }
                return c3111w50.m.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.l) {
            case 0:
                return ((E9) this.m) + ".inputStream()";
            default:
                return ((C3111w50) this.m) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(bArr, "sink");
                return ((E9) this.m).R(bArr, i, i2);
            default:
                AbstractC1474fG.j(bArr, "data");
                C3111w50 c3111w50 = (C3111w50) this.m;
                if (!c3111w50.n) {
                    AbstractC2506pt.j(bArr.length, i, i2);
                    E9 e9 = c3111w50.m;
                    if (e9.m == 0 && c3111w50.l.y(e9, 8192L) == -1) {
                        return -1;
                    }
                    return c3111w50.m.R(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
