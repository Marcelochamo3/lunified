package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class K50 extends FilterInputStream {
    public volatile byte[] l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f355o;
    public int p;
    public final C1813in q;

    public K50(InputStream inputStream, C1813in c1813in) {
        super(inputStream);
        this.f355o = -1;
        this.q = c1813in;
        this.l = (byte[]) c1813in.g(65536, byte[].class);
    }

    public static void i() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f355o;
        if (i != -1) {
            int i2 = this.p - i;
            int i3 = this.n;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.m == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.q.g(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.l = bArr2;
                    this.q.l(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.p - this.f355o;
                this.p = i4;
                this.f355o = 0;
                this.m = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.p;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.m = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f355o = -1;
            this.p = 0;
            this.m = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.l == null || inputStream == null) {
            i();
            throw null;
        }
        return (this.m - this.p) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.l != null) {
            this.q.l(this.l);
            this.l = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void f() {
        if (this.l != null) {
            this.q.l(this.l);
            this.l = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.n = Math.max(this.n, i);
        this.f355o = this.p;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.l;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            i();
            throw null;
        }
        if (this.p >= this.m && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.l && (bArr = this.l) == null) {
            i();
            throw null;
        }
        int i = this.m;
        int i2 = this.p;
        if (i - i2 <= 0) {
            return -1;
        }
        this.p = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.l == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f355o;
        if (-1 == i) {
            throw new J50("Mark has been invalidated, pos: " + this.p + " markLimit: " + this.n);
        }
        this.p = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.l;
        if (bArr == null) {
            i();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            i();
            throw null;
        }
        int i = this.m;
        int i2 = this.p;
        if (i - i2 >= j) {
            this.p = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.p = i;
        if (this.f355o == -1 || j > this.n) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f355o = -1;
            }
            return j2 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.m;
        int i4 = this.p;
        if (i3 - i4 >= j - j2) {
            this.p = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.p = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.l;
        if (bArr2 == null) {
            i();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.p;
            int i6 = this.m;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.p += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f355o == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.l && (bArr2 = this.l) == null) {
                        i();
                        throw null;
                    }
                    int i8 = this.m;
                    int i9 = this.p;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.p += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            i();
            throw null;
        }
    }
}
