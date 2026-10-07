package o;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.v50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3014v50 implements M9 {
    public final InterfaceC1991ke0 l;
    public final E9 m;
    public boolean n;

    public C3014v50(InterfaceC1991ke0 interfaceC1991ke0) {
        AbstractC1474fG.j(interfaceC1991ke0, "sink");
        this.l = interfaceC1991ke0;
        this.m = new E9();
    }

    @Override // o.M9
    public final M9 E(C2468pa c2468pa) {
        AbstractC1474fG.j(c2468pa, "byteString");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.c0(c2468pa);
        H();
        return this;
    }

    @Override // o.M9
    public final M9 F(int i) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.f0(i);
        H();
        return this;
    }

    @Override // o.M9
    public final M9 G(byte[] bArr) {
        AbstractC1474fG.j(bArr, "source");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        E9 e9 = this.m;
        e9.getClass();
        e9.d0(bArr, 0, bArr.length);
        H();
        return this;
    }

    @Override // o.M9
    public final M9 H() {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        E9 e9 = this.m;
        long jQ = e9.q();
        if (jQ > 0) {
            this.l.w(e9, jQ);
        }
        return this;
    }

    @Override // o.M9
    public final M9 N(String str) {
        AbstractC1474fG.j(str, "string");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.l0(str);
        H();
        return this;
    }

    @Override // o.M9
    public final M9 O(long j) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.g0(j);
        H();
        return this;
    }

    @Override // o.M9
    public final E9 b() {
        return this.m;
    }

    @Override // o.InterfaceC1991ke0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // o.InterfaceC1991ke0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC1991ke0 interfaceC1991ke0 = this.l;
        if (this.n) {
            return;
        }
        E9 e9 = this.m;
        long j = e9.m;
        if (j > 0) {
            interfaceC1991ke0.w(e9, j);
        }
        th = null;
        try {
            interfaceC1991ke0.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.n = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.M9, o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        E9 e9 = this.m;
        long j = e9.m;
        InterfaceC1991ke0 interfaceC1991ke0 = this.l;
        if (j > 0) {
            interfaceC1991ke0.w(e9, j);
        }
        interfaceC1991ke0.flush();
    }

    @Override // o.M9
    public final M9 h(byte[] bArr, int i, int i2) {
        AbstractC1474fG.j(bArr, "source");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.d0(bArr, i, i2);
        H();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.n;
    }

    @Override // o.M9
    public final M9 k(long j) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.h0(j);
        H();
        return this;
    }

    @Override // o.M9
    public final M9 r(int i) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.j0(i);
        H();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.l + ')';
    }

    @Override // o.M9
    public final M9 v(int i) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.i0(i);
        H();
        return this;
    }

    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) {
        AbstractC1474fG.j(e9, "source");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        this.m.w(e9, j);
        H();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1474fG.j(byteBuffer, "source");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.m.write(byteBuffer);
        H();
        return iWrite;
    }
}
