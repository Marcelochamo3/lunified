package o;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class D9 extends OutputStream {
    public final /* synthetic */ E9 l;

    public D9(E9 e9) {
        this.l = e9;
    }

    public final String toString() {
        return this.l + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.l.f0(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        AbstractC1474fG.j(bArr, "data");
        this.l.d0(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
