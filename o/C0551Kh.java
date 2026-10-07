package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: o.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0551Kh extends FilterInputStream {
    public static final /* synthetic */ int q = 0;
    public final boolean l;
    public final int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f368o;
    public boolean p;

    public C0551Kh(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.l = false;
        this.m = 0;
        this.n = 0;
        this.f368o = -1;
        System.nanoTime();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.f368o = this.m - this.n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        int i3;
        if (this.p || ((z = this.l) && this.n <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.p = true;
            return -1;
        }
        if (z && i2 > (i3 = this.n)) {
            i2 = i3;
        }
        try {
            int i4 = super.read(bArr, i, i2);
            this.n -= i4;
            return i4;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        this.n = this.m - this.f368o;
    }
}
