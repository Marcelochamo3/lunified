package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Qm0 extends Q7 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f478o;

    @Override // o.Q7, o.X6
    public final ByteBuffer b() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // o.Q7, o.X6
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // o.X6
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.f478o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferL = l(length);
        int iJ = Lr0.j(length, 0, this.n);
        byteBufferL.put(this.m, 0, iJ);
        int iJ2 = Lr0.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferL.flip();
    }

    @Override // o.Q7
    public final V6 h(V6 v6) throws W6 {
        if (v6.c != 2) {
            throw new W6(v6);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? V6.e : v6;
    }

    @Override // o.Q7
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // o.Q7
    public final void j() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.f478o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // o.Q7
    public final void k() {
        this.m = Lr0.e;
    }
}
