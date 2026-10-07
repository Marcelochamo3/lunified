package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1801ih extends FilterInputStream {
    public final long l;
    public int m;

    public C1801ih(InputStream inputStream, long j) {
        super(inputStream);
        this.l = j;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.m += i;
            return;
        }
        long j = this.m;
        long j2 = this.l;
        if (j2 - j <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j2 + ", but read: " + this.m);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.l - ((long) this.m), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
