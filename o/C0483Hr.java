package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483Hr extends FilterInputStream {
    public static final byte[] n = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f311o = 31;
    public final byte l;
    public int m;

    public C0483Hr(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Cannot add invalid orientation: "));
        }
        this.l = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.m;
        if (i3 < 2 || i3 > (i2 = f311o)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.l : n[i3 - 2] & 255;
        }
        if (i != -1) {
            this.m++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.m = (int) (((long) this.m) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.m;
        int i5 = f311o;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.l;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(n, this.m - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.m += i3;
        }
        return i3;
    }
}
