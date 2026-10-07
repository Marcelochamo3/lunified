package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Md0 extends Q7 {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f398o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public Md0() {
        byte[] bArr = Lr0.e;
        this.n = bArr;
        this.f398o = bArr;
    }

    @Override // o.Q7, o.X6
    public final boolean a() {
        return this.m;
    }

    @Override // o.X6
    public final void f(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i2 = this.l;
                            iPosition = ((iLimit2 / i2) * i2) + i2;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    l(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iM = m(byteBuffer);
                int iPosition2 = iM - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i3 = this.q;
                int i4 = length - i3;
                if (iM >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.n, this.q, iMin);
                    int i5 = this.q + iMin;
                    this.q = i5;
                    byte[] bArr2 = this.n;
                    if (i5 == bArr2.length) {
                        if (this.s) {
                            n(this.r, bArr2);
                            this.t += (long) ((this.q - (this.r * 2)) / this.l);
                        } else {
                            this.t += (long) ((i5 - this.r) / this.l);
                        }
                        o(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    n(i3, bArr);
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iM2 = m(byteBuffer);
                byteBuffer.limit(iM2);
                this.t += (long) (byteBuffer.remaining() / this.l);
                o(byteBuffer, this.f398o, this.r);
                if (iM2 < iLimit4) {
                    n(this.r, this.f398o);
                    this.p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // o.Q7
    public final V6 h(V6 v6) throws W6 {
        if (v6.c == 2) {
            return this.m ? v6 : V6.e;
        }
        throw new W6(v6);
    }

    @Override // o.Q7
    public final void i() {
        if (this.m) {
            V6 v6 = this.b;
            int i = v6.d;
            this.l = i;
            int i2 = v6.a;
            int i3 = ((int) ((this.i * ((long) i2)) / 1000000)) * i;
            if (this.n.length != i3) {
                this.n = new byte[i3];
            }
            int i4 = ((int) ((this.j * ((long) i2)) / 1000000)) * i;
            this.r = i4;
            if (this.f398o.length != i4) {
                this.f398o = new byte[i4];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // o.Q7
    public final void j() {
        int i = this.q;
        if (i > 0) {
            n(i, this.n);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.r / this.l);
    }

    @Override // o.Q7
    public final void k() {
        this.m = false;
        this.r = 0;
        byte[] bArr = Lr0.e;
        this.n = bArr;
        this.f398o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i = this.l;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(int i, byte[] bArr) {
        l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - iMin;
        System.arraycopy(bArr, i - i2, this.f398o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f398o, i2, iMin);
    }
}
