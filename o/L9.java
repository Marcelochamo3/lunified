package o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class L9 extends OutputStream {
    public final OutputStream l;
    public byte[] m;
    public final C1813in n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f375o;

    public L9(FileOutputStream fileOutputStream, C1813in c1813in) {
        this.l = fileOutputStream;
        this.n = c1813in;
        this.m = (byte[]) c1813in.g(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.l;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.m;
            if (bArr != null) {
                this.n.l(bArr);
                this.m = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f375o;
        OutputStream outputStream = this.l;
        if (i > 0) {
            outputStream.write(this.m, 0, i);
            this.f375o = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.m;
        int i2 = this.f375o;
        int i3 = i2 + 1;
        this.f375o = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.l.write(bArr, 0, i3);
        this.f375o = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f375o;
            OutputStream outputStream = this.l;
            if (i6 == 0 && i4 >= this.m.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.m.length - i6);
            System.arraycopy(bArr, i5, this.m, this.f375o, iMin);
            int i7 = this.f375o + iMin;
            this.f375o = i7;
            i3 += iMin;
            byte[] bArr2 = this.m;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.f375o = 0;
            }
        } while (i3 < i2);
    }
}
