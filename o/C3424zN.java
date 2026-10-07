package o;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o.zN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3424zN extends FilterInputStream {
    public int l;

    public C3424zN(C2308nr c2308nr) {
        super(c2308nr);
        this.l = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.l;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.l;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void f(long j) {
        int i = this.l;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.l = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.l = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        f(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.l = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jA = a(j);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        f(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iA = (int) a(i2);
        if (iA == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iA);
        f(i3);
        return i3;
    }
}
