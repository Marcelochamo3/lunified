package o;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0554Kk implements InterfaceC0328Bs {
    public final InterfaceC2000kj m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f369o;
    public int q;
    public int r;
    public byte[] p = new byte[65536];
    public final byte[] l = new byte[C1672hI.a.f];

    static {
        AbstractC1726hs.a("goog.exo.extractor");
    }

    public C0554Kk(InterfaceC2000kj interfaceC2000kj, long j, long j2) {
        this.m = interfaceC2000kj;
        this.f369o = j;
        this.n = j2;
    }

    @Override // o.InterfaceC0328Bs
    public final long A() {
        return this.f369o + ((long) this.q);
    }

    @Override // o.InterfaceC0328Bs
    public final void B(byte[] bArr, int i, int i2) {
        x(bArr, i, i2, false);
    }

    @Override // o.InterfaceC0328Bs
    public final void C(int i) {
        b(i, false);
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.r;
        int iF = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.p, 0, bArr, i, iMin);
            h(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            iF = f(bArr, i, i2, 0, true);
        }
        if (iF != -1) {
            this.f369o += (long) iF;
        }
        return iF;
    }

    @Override // o.InterfaceC0328Bs
    public final long F() {
        return this.f369o;
    }

    @Override // o.InterfaceC0328Bs
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int iMin;
        int i3 = this.r;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.p, 0, bArr, i, iMin);
            h(iMin);
        }
        int iF = iMin;
        while (iF < i2 && iF != -1) {
            iF = f(bArr, i, i2, iF, z);
        }
        if (iF != -1) {
            this.f369o += (long) iF;
        }
        return iF != -1;
    }

    public final boolean b(int i, boolean z) {
        c(i);
        int iF = this.r - this.q;
        while (iF < i) {
            iF = f(this.p, this.q, i, iF, z);
            if (iF == -1) {
                return false;
            }
            this.r = this.q + iF;
        }
        this.q += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.q + i;
        byte[] bArr = this.p;
        if (i2 > bArr.length) {
            this.p = Arrays.copyOf(this.p, Lr0.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // o.InterfaceC0328Bs
    public final long d() {
        return this.n;
    }

    public final int e(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        c(i2);
        int i3 = this.r;
        int i4 = this.q;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = f(this.p, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.r += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.p, this.q, bArr, i, iMin);
        this.q += iMin;
        return iMin;
    }

    public final int f(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.m.D(bArr, i + i3, i2 - i3);
        if (iD != -1) {
            return i3 + iD;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int g(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.r, i);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.l;
            iMin = f(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f369o += (long) iMin;
        }
        return iMin;
    }

    public final void h(int i) {
        int i2 = this.r - i;
        this.r = i2;
        this.q = 0;
        byte[] bArr = this.p;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.p = bArr2;
    }

    @Override // o.InterfaceC0328Bs
    public final void o() {
        this.q = 0;
    }

    @Override // o.InterfaceC0328Bs
    public final void q(int i) {
        int iMin = Math.min(this.r, i);
        h(iMin);
        int iF = iMin;
        while (iF < i && iF != -1) {
            iF = f(this.l, -iF, Math.min(i, this.l.length + iF), iF, false);
        }
        if (iF != -1) {
            this.f369o += (long) iF;
        }
    }

    @Override // o.InterfaceC0328Bs
    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    @Override // o.InterfaceC0328Bs
    public final boolean x(byte[] bArr, int i, int i2, boolean z) {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.p, this.q - i2, bArr, i, i2);
        return true;
    }
}
