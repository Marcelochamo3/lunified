package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.w50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3111w50 implements N9 {
    public final InterfaceC2091lf0 l;
    public final E9 m;
    public boolean n;

    public C3111w50(InterfaceC2091lf0 interfaceC2091lf0) {
        AbstractC1474fG.j(interfaceC2091lf0, "source");
        this.l = interfaceC2091lf0;
        this.m = new E9();
    }

    @Override // o.N9
    public final String A() {
        return I(Long.MAX_VALUE);
    }

    @Override // o.N9
    public final byte[] C() {
        E9 e9 = this.m;
        e9.e0(this.l);
        return e9.W(e9.m);
    }

    @Override // o.N9
    public final boolean D() {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        E9 e9 = this.m;
        return e9.D() && this.l.y(e9, 8192L) == -1;
    }

    @Override // o.N9
    public final String I(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        E9 e9 = this.m;
        if (jA != -1) {
            return AbstractC1349e.a(e9, jA);
        }
        if (j2 < Long.MAX_VALUE && s(j2) && e9.K(j2 - 1) == 13 && s(1 + j2) && e9.K(j2) == 10) {
            return AbstractC1349e.a(e9, j2);
        }
        E9 e10 = new E9();
        e9.t(e10, 0L, Math.min(32, e9.m));
        throw new EOFException("\\n not found: limit=" + Math.min(e9.m, j) + " content=" + e10.n(e10.m).e() + (char) 8230);
    }

    @Override // o.N9
    public final void M(long j) throws EOFException {
        if (!s(j)) {
            throw new EOFException();
        }
    }

    @Override // o.N9
    public final long S() throws EOFException {
        E9 e9;
        M(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zS = s(i2);
            e9 = this.m;
            if (!zS) {
                break;
            }
            byte bK = e9.K(i);
            if ((bK < 48 || bK > 57) && ((bK < 97 || bK > 102) && (bK < 65 || bK > 70))) {
                if (i != 0) {
                    break;
                }
                AbstractC3021v9.e(16);
                AbstractC3021v9.e(16);
                String string = Integer.toString(bK, 16);
                AbstractC1474fG.i(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return e9.S();
    }

    @Override // o.N9
    public final int T(DW dw) throws EOFException {
        E9 e9;
        AbstractC1474fG.j(dw, "options");
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            e9 = this.m;
            int iB = AbstractC1349e.b(e9, dw, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                e9.skip(dw.m[iB].d());
                return iB;
            }
        } while (this.l.y(e9, 8192L) != -1);
        return -1;
    }

    @Override // o.N9
    public final String U(Charset charset) {
        E9 e9 = this.m;
        e9.e0(this.l);
        return e9.Y(e9.m, charset);
    }

    @Override // o.N9
    public final InputStream V() {
        return new C9(this, 1);
    }

    public final long a(byte b, long j, long j2) {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j2, "fromIndex=0 toIndex=").toString());
        }
        while (jMax < j2) {
            long jQ = this.m.Q(b, jMax, j2);
            if (jQ != -1) {
                return jQ;
            }
            E9 e9 = this.m;
            long j3 = e9.m;
            if (j3 >= j2 || this.l.y(e9, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // o.N9, o.M9
    public final E9 b() {
        return this.m;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.n) {
            return;
        }
        this.n = true;
        this.l.close();
        this.m.p();
    }

    public final long f() {
        E9 e9;
        M(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zS = s(j2);
            e9 = this.m;
            if (!zS) {
                break;
            }
            byte bK = e9.K(j);
            if ((bK < 48 || bK > 57) && !(j == 0 && bK == 45)) {
                if (j != 0) {
                    break;
                }
                AbstractC3021v9.e(16);
                AbstractC3021v9.e(16);
                String string = Integer.toString(bK, 16);
                AbstractC1474fG.i(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j = j2;
        }
        return e9.X();
    }

    public final int i() throws EOFException {
        M(4L);
        int i = this.m.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.n;
    }

    @Override // o.N9
    public final C2468pa m() {
        E9 e9 = this.m;
        e9.e0(this.l);
        return e9.n(e9.m);
    }

    @Override // o.N9
    public final C2468pa n(long j) throws EOFException {
        M(j);
        return this.m.n(j);
    }

    @Override // o.N9
    public final C3111w50 peek() {
        return Nr0.g(new DX(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1474fG.j(byteBuffer, "sink");
        E9 e9 = this.m;
        if (e9.m == 0 && this.l.y(e9, 8192L) == -1) {
            return -1;
        }
        return e9.read(byteBuffer);
    }

    @Override // o.N9
    public final byte readByte() throws EOFException {
        M(1L);
        return this.m.readByte();
    }

    @Override // o.N9
    public final int readInt() throws EOFException {
        M(4L);
        return this.m.readInt();
    }

    @Override // o.N9
    public final short readShort() throws EOFException {
        M(2L);
        return this.m.readShort();
    }

    @Override // o.N9
    public final boolean s(long j) {
        E9 e9;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            e9 = this.m;
            if (e9.m >= j) {
                return true;
            }
        } while (this.l.y(e9, 8192L) != -1);
        return false;
    }

    @Override // o.N9
    public final void skip(long j) throws EOFException {
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            E9 e9 = this.m;
            if (e9.m == 0 && this.l.y(e9, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, e9.m);
            e9.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.l + ')';
    }

    @Override // o.N9
    public final long u(E9 e9) {
        E9 e10;
        long j = 0;
        while (true) {
            InterfaceC2091lf0 interfaceC2091lf0 = this.l;
            e10 = this.m;
            if (interfaceC2091lf0.y(e10, 8192L) == -1) {
                break;
            }
            long jQ = e10.q();
            if (jQ > 0) {
                j += jQ;
                e9.w(e10, jQ);
            }
        }
        long j2 = e10.m;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        e9.w(e10, j2);
        return j3;
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) {
        AbstractC1474fG.j(e9, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        if (!(!this.n)) {
            throw new IllegalStateException("closed".toString());
        }
        E9 e10 = this.m;
        if (e10.m == 0 && this.l.y(e10, 8192L) == -1) {
            return -1L;
        }
        return e10.y(e9, Math.min(j, e10.m));
    }
}
