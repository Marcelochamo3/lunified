package o;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.Hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0474Hi {
    private final ByteBuffer a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public C0474Hi(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    private void l(int i) throws Rw0 {
        if (i > k()) {
            throw new Rw0("end of input");
        }
    }

    public void a() {
        this.a.limit(this.c);
    }

    public int b() {
        return this.a.position() - this.b;
    }

    public void c(int i) {
        int i2 = this.b;
        if (i + i2 >= this.c) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.a.position(i2 + i);
        this.a.limit(this.c);
    }

    public void d(byte[] bArr, int i, int i2) throws Rw0 {
        l(i2);
        this.a.get(bArr, i, i2);
    }

    public byte[] e() {
        int iK = k();
        byte[] bArr = new byte[iK];
        this.a.get(bArr, 0, iK);
        return bArr;
    }

    public byte[] f(int i) throws Rw0 {
        l(i);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        return bArr;
    }

    public byte[] g() {
        return f(j());
    }

    public int h() throws Rw0 {
        l(2);
        return this.a.getShort() & 65535;
    }

    public long i() throws Rw0 {
        l(4);
        return ((long) this.a.getInt()) & 4294967295L;
    }

    public int j() throws Rw0 {
        l(1);
        return this.a.get() & 255;
    }

    public int k() {
        return this.a.remaining();
    }

    public void m() {
        int i = this.d;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.a.position(i);
        this.a.limit(this.e);
        this.d = -1;
        this.e = -1;
    }

    public void n(int i) {
        int i2 = this.b;
        if (i + i2 > this.c) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        this.a.limit(i + i2);
    }

    public void o() {
        this.d = this.a.position();
        this.e = this.a.limit();
    }

    public int p() {
        return this.a.limit() - this.b;
    }

    public void q(int i) {
        if (i > this.c - this.a.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer = this.a;
        byteBuffer.limit(byteBuffer.position() + i);
    }

    public C0474Hi(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.position();
        this.c = byteBuffer.limit();
        this.d = -1;
        this.e = -1;
    }
}
