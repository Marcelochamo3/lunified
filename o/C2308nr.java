package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2308nr extends InputStream {
    public static final ArrayDeque n;
    public InputStream l;
    public IOException m;

    static {
        char[] cArr = Kr0.a;
        n = new ArrayDeque(0);
    }

    public final void a() {
        this.m = null;
        this.l = null;
        ArrayDeque arrayDeque = n;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.l.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.l.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.l.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.l.read();
        } catch (IOException e) {
            this.m = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.l.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.l.skip(j);
        } catch (IOException e) {
            this.m = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.l.read(bArr);
        } catch (IOException e) {
            this.m = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.l.read(bArr, i, i2);
        } catch (IOException e) {
            this.m = e;
            throw e;
        }
    }
}
