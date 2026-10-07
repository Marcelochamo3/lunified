package o;

import java.io.InputStream;

/* JADX INFO: renamed from: o.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2776sj extends InputStream {
    public final InterfaceC2583qj l;
    public final C2970uj m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1031o = false;
    public boolean p = false;
    public final byte[] n = new byte[1];

    public C2776sj(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj) {
        this.l = interfaceC2583qj;
        this.m = c2970uj;
    }

    public final void a() {
        if (this.f1031o) {
            return;
        }
        this.l.v(this.m);
        this.f1031o = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.p) {
            return;
        }
        this.l.close();
        this.p = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.n;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0397Ej.f(!this.p);
        a();
        int iD = this.l.D(bArr, i, i2);
        if (iD == -1) {
            return -1;
        }
        return iD;
    }
}
