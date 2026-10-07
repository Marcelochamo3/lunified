package o;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class E9 implements N9, M9, Cloneable, ByteChannel {
    public C3343yb0 l;
    public long m;

    @Override // o.N9
    public final String A() {
        return I(Long.MAX_VALUE);
    }

    @Override // o.N9
    public final byte[] C() {
        return W(this.m);
    }

    @Override // o.N9
    public final boolean D() {
        return this.m == 0;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 E(C2468pa c2468pa) {
        c0(c2468pa);
        return this;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 F(int i) {
        f0(i);
        return this;
    }

    @Override // o.M9
    public final M9 G(byte[] bArr) {
        AbstractC1474fG.j(bArr, "source");
        d0(bArr, 0, bArr.length);
        return this;
    }

    @Override // o.N9
    public final String I(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jQ = Q((byte) 10, 0L, j2);
        if (jQ != -1) {
            return AbstractC1349e.a(this, jQ);
        }
        if (j2 < this.m && K(j2 - 1) == 13 && K(j2) == 10) {
            return AbstractC1349e.a(this, j2);
        }
        E9 e9 = new E9();
        t(e9, 0L, Math.min(32, this.m));
        throw new EOFException("\\n not found: limit=" + Math.min(this.m, j) + " content=" + e9.n(e9.m).e() + (char) 8230);
    }

    public final byte K(long j) {
        AbstractC2506pt.j(this.m, j, 1L);
        C3343yb0 c3343yb0 = this.l;
        if (c3343yb0 == null) {
            AbstractC1474fG.g(null);
            throw null;
        }
        long j2 = this.m;
        if (j2 - j < j) {
            while (j2 > j) {
                c3343yb0 = c3343yb0.g;
                AbstractC1474fG.g(c3343yb0);
                j2 -= (long) (c3343yb0.c - c3343yb0.b);
            }
            return c3343yb0.a[(int) ((((long) c3343yb0.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c3343yb0.c;
            int i2 = c3343yb0.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c3343yb0.a[(int) ((((long) i2) + j) - j3)];
            }
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
            j3 = j4;
        }
    }

    @Override // o.N9
    public final void M(long j) throws EOFException {
        if (this.m < j) {
            throw new EOFException();
        }
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 N(String str) {
        l0(str);
        return this;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 O(long j) {
        g0(j);
        return this;
    }

    public final long Q(byte b, long j, long j2) {
        C3343yb0 c3343yb0;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.m + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.m;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c3343yb0 = this.l) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c3343yb0 = c3343yb0.g;
                AbstractC1474fG.g(c3343yb0);
                j4 -= (long) (c3343yb0.c - c3343yb0.b);
            }
            while (j4 < j2) {
                int iMin = (int) Math.min(c3343yb0.c, (((long) c3343yb0.b) + j2) - j4);
                for (int i = (int) ((((long) c3343yb0.b) + j) - j4); i < iMin; i++) {
                    if (c3343yb0.a[i] == b) {
                        return ((long) (i - c3343yb0.b)) + j4;
                    }
                }
                j4 += (long) (c3343yb0.c - c3343yb0.b);
                c3343yb0 = c3343yb0.f;
                AbstractC1474fG.g(c3343yb0);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c3343yb0.c - c3343yb0.b)) + j3;
            if (j5 > j) {
                break;
            }
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
            j3 = j5;
        }
        while (j3 < j2) {
            int iMin2 = (int) Math.min(c3343yb0.c, (((long) c3343yb0.b) + j2) - j3);
            for (int i2 = (int) ((((long) c3343yb0.b) + j) - j3); i2 < iMin2; i2++) {
                if (c3343yb0.a[i2] == b) {
                    return ((long) (i2 - c3343yb0.b)) + j3;
                }
            }
            j3 += (long) (c3343yb0.c - c3343yb0.b);
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
            j = j3;
        }
        return -1L;
    }

    public final int R(byte[] bArr, int i, int i2) {
        AbstractC1474fG.j(bArr, "sink");
        AbstractC2506pt.j(bArr.length, i, i2);
        C3343yb0 c3343yb0 = this.l;
        if (c3343yb0 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c3343yb0.c - c3343yb0.b);
        int i3 = c3343yb0.b;
        X5.I(i, i3, i3 + iMin, c3343yb0.a, bArr);
        int i4 = c3343yb0.b + iMin;
        c3343yb0.b = i4;
        this.m -= (long) iMin;
        if (i4 == c3343yb0.c) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        }
        return iMin;
    }

    @Override // o.N9
    public final long S() throws EOFException {
        int i;
        if (this.m == 0) {
            throw new EOFException();
        }
        long j = 0;
        int i2 = 0;
        boolean z = false;
        do {
            C3343yb0 c3343yb0 = this.l;
            AbstractC1474fG.g(c3343yb0);
            int i3 = c3343yb0.b;
            int i4 = c3343yb0.c;
            while (i3 < i4) {
                byte b = c3343yb0.a[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        char[] cArr = AbstractC3021v9.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if ((j & (-1152921504606846976L)) != 0) {
                    E9 e9 = new E9();
                    e9.h0(j);
                    e9.f0(b);
                    throw new NumberFormatException("Number too large: ".concat(e9.Z()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.l = c3343yb0.a();
                Gb0.a(c3343yb0);
            } else {
                c3343yb0.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.l != null);
        this.m -= (long) i2;
        return j;
    }

    @Override // o.N9
    public final int T(DW dw) throws EOFException {
        AbstractC1474fG.j(dw, "options");
        int iB = AbstractC1349e.b(this, dw, false);
        if (iB == -1) {
            return -1;
        }
        skip(dw.m[iB].d());
        return iB;
    }

    @Override // o.N9
    public final String U(Charset charset) {
        return Y(this.m, charset);
    }

    @Override // o.N9
    public final InputStream V() {
        return new C9(this, 0);
    }

    public final byte[] W(long j) throws EOFException {
        if (j < 0 || j > C1707hi0.a) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount: ").toString());
        }
        if (this.m < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iR = R(bArr, i2, i - i2);
            if (iR == -1) {
                throw new EOFException();
            }
            i2 += iR;
        }
        return bArr;
    }

    public final long X() throws EOFException {
        int i;
        byte b;
        int i2;
        byte b2 = 48;
        if (this.m == 0) {
            throw new EOFException();
        }
        long j = -7;
        long j2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            C3343yb0 c3343yb0 = this.l;
            AbstractC1474fG.g(c3343yb0);
            int i4 = c3343yb0.b;
            int i5 = c3343yb0.c;
            while (true) {
                if (i4 >= i5) {
                    i = i5;
                    break;
                }
                b = c3343yb0.a[i4];
                if (b >= b2 && b <= 57) {
                    int i6 = 48 - b;
                    if (j2 < -922337203685477580L) {
                        break loop0;
                    }
                    i2 = i5;
                    if (j2 == -922337203685477580L && i6 < j) {
                        break loop0;
                    }
                    j2 = (j2 * 10) + ((long) i6);
                } else {
                    i2 = i5;
                    if (b != 45 || i3 != 0) {
                        i = i2;
                        z2 = true;
                        break;
                    }
                    j--;
                    z = true;
                }
                i4++;
                i3++;
                i5 = i2;
                b2 = 48;
            }
            if (i4 == i) {
                this.l = c3343yb0.a();
                Gb0.a(c3343yb0);
            } else {
                c3343yb0.b = i4;
            }
            if (z2 || this.l == null) {
                long j3 = this.m - ((long) i3);
                this.m = j3;
                if (i3 >= (z ? 2 : 1)) {
                    return z ? j2 : -j2;
                }
                if (j3 == 0) {
                    throw new EOFException();
                }
                StringBuilder sbS = AbstractC1674hK.s(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                byte bK = K(0L);
                char[] cArr = AbstractC3021v9.a;
                sbS.append(new String(new char[]{cArr[(bK >> 4) & 15], cArr[bK & 15]}));
                throw new NumberFormatException(sbS.toString());
            }
            b2 = 48;
        }
        E9 e9 = new E9();
        e9.g0(j2);
        e9.f0(b);
        if (!z) {
            e9.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(e9.Z()));
    }

    public final String Y(long j, Charset charset) throws EOFException {
        AbstractC1474fG.j(charset, "charset");
        if (j < 0 || j > C1707hi0.a) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount: ").toString());
        }
        if (this.m < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C3343yb0 c3343yb0 = this.l;
        AbstractC1474fG.g(c3343yb0);
        int i = c3343yb0.b;
        if (((long) i) + j > c3343yb0.c) {
            return new String(W(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c3343yb0.a, i, i2, charset);
        int i3 = c3343yb0.b + i2;
        c3343yb0.b = i3;
        this.m -= j;
        if (i3 == c3343yb0.c) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        }
        return str;
    }

    public final String Z() {
        return Y(this.m, AbstractC1305dd.a);
    }

    public final C2468pa a0(int i) {
        if (i == 0) {
            return C2468pa.f972o;
        }
        AbstractC2506pt.j(this.m, 0L, i);
        C3343yb0 c3343yb0 = this.l;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            AbstractC1474fG.g(c3343yb0);
            int i5 = c3343yb0.c;
            int i6 = c3343yb0.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c3343yb0 = c3343yb0.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C3343yb0 c3343yb1 = this.l;
        int i7 = 0;
        while (i2 < i) {
            AbstractC1474fG.g(c3343yb1);
            bArr[i7] = c3343yb1.a;
            i2 += c3343yb1.c - c3343yb1.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c3343yb1.b;
            c3343yb1.d = true;
            i7++;
            c3343yb1 = c3343yb1.f;
        }
        return new Hb0(bArr, iArr);
    }

    public final C3343yb0 b0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C3343yb0 c3343yb0 = this.l;
        if (c3343yb0 == null) {
            C3343yb0 c3343yb0B = Gb0.b();
            this.l = c3343yb0B;
            c3343yb0B.g = c3343yb0B;
            c3343yb0B.f = c3343yb0B;
            return c3343yb0B;
        }
        C3343yb0 c3343yb1 = c3343yb0.g;
        AbstractC1474fG.g(c3343yb1);
        if (c3343yb1.c + i <= 8192 && c3343yb1.e) {
            return c3343yb1;
        }
        C3343yb0 c3343yb0B2 = Gb0.b();
        c3343yb1.b(c3343yb0B2);
        return c3343yb0B2;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return Hj0.d;
    }

    public final void c0(C2468pa c2468pa) {
        AbstractC1474fG.j(c2468pa, "byteString");
        c2468pa.l(this, c2468pa.d());
    }

    public final Object clone() {
        E9 e9 = new E9();
        if (this.m != 0) {
            C3343yb0 c3343yb0 = this.l;
            AbstractC1474fG.g(c3343yb0);
            C3343yb0 c3343yb0C = c3343yb0.c();
            e9.l = c3343yb0C;
            c3343yb0C.g = c3343yb0C;
            c3343yb0C.f = c3343yb0C;
            for (C3343yb0 c3343yb1 = c3343yb0.f; c3343yb1 != c3343yb0; c3343yb1 = c3343yb1.f) {
                C3343yb0 c3343yb2 = c3343yb0C.g;
                AbstractC1474fG.g(c3343yb2);
                AbstractC1474fG.g(c3343yb1);
                c3343yb2.b(c3343yb1.c());
            }
            e9.m = this.m;
        }
        return e9;
    }

    public final void d0(byte[] bArr, int i, int i2) {
        AbstractC1474fG.j(bArr, "source");
        long j = i2;
        AbstractC2506pt.j(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C3343yb0 c3343yb0B0 = b0(1);
            int iMin = Math.min(i3 - i, 8192 - c3343yb0B0.c);
            int i4 = i + iMin;
            X5.I(c3343yb0B0.c, i, i4, bArr, c3343yb0B0.a);
            c3343yb0B0.c += iMin;
            i = i4;
        }
        this.m += j;
    }

    public final void e0(InterfaceC2091lf0 interfaceC2091lf0) {
        AbstractC1474fG.j(interfaceC2091lf0, "source");
        while (interfaceC2091lf0.y(this, 8192L) != -1) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9) {
                long j = this.m;
                E9 e9 = (E9) obj;
                if (j == e9.m) {
                    if (j != 0) {
                        C3343yb0 c3343yb0 = this.l;
                        AbstractC1474fG.g(c3343yb0);
                        C3343yb0 c3343yb1 = e9.l;
                        AbstractC1474fG.g(c3343yb1);
                        int i = c3343yb0.b;
                        int i2 = c3343yb1.b;
                        long j2 = 0;
                        while (j2 < this.m) {
                            long jMin = Math.min(c3343yb0.c - i, c3343yb1.c - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = c3343yb0.a[i];
                                int i4 = i2 + 1;
                                if (b == c3343yb1.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == c3343yb0.c) {
                                C3343yb0 c3343yb2 = c3343yb0.f;
                                AbstractC1474fG.g(c3343yb2);
                                i = c3343yb2.b;
                                c3343yb0 = c3343yb2;
                            }
                            if (i2 == c3343yb1.c) {
                                c3343yb1 = c3343yb1.f;
                                AbstractC1474fG.g(c3343yb1);
                                i2 = c3343yb1.b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f0(int i) {
        C3343yb0 c3343yb0B0 = b0(1);
        int i2 = c3343yb0B0.c;
        c3343yb0B0.c = i2 + 1;
        c3343yb0B0.a[i2] = (byte) i;
        this.m++;
    }

    public final void g0(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            f0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                l0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C3343yb0 c3343yb0B0 = b0(i);
        int i2 = c3343yb0B0.c + i;
        while (true) {
            bArr = c3343yb0B0.a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC1349e.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c3343yb0B0.c += i;
        this.m += (long) i;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 h(byte[] bArr, int i, int i2) {
        d0(bArr, i, i2);
        return this;
    }

    public final void h0(long j) {
        if (j == 0) {
            f0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C3343yb0 c3343yb0B0 = b0(i);
        int i2 = c3343yb0B0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            c3343yb0B0.a[i3] = AbstractC1349e.a[(int) (15 & j)];
            j >>>= 4;
        }
        c3343yb0B0.c += i;
        this.m += (long) i;
    }

    public final int hashCode() {
        C3343yb0 c3343yb0 = this.l;
        if (c3343yb0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c3343yb0.c;
            for (int i3 = c3343yb0.b; i3 < i2; i3++) {
                i = (i * 31) + c3343yb0.a[i3];
            }
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
        } while (c3343yb0 != this.l);
        return i;
    }

    public final void i0(int i) {
        C3343yb0 c3343yb0B0 = b0(4);
        int i2 = c3343yb0B0.c;
        byte[] bArr = c3343yb0B0.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c3343yb0B0.c = i2 + 4;
        this.m += 4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i) {
        C3343yb0 c3343yb0B0 = b0(2);
        int i2 = c3343yb0B0.c;
        byte[] bArr = c3343yb0B0.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c3343yb0B0.c = i2 + 2;
        this.m += 2;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 k(long j) {
        h0(j);
        return this;
    }

    public final void k0(int i, String str, int i2) {
        char cCharAt;
        AbstractC1474fG.j(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1674hK.m(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbR = AbstractC1674hK.r("endIndex > string.length: ", i2, " > ");
            sbR.append(str.length());
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C3343yb0 c3343yb0B0 = b0(1);
                int i3 = c3343yb0B0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = c3343yb0B0.a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c3343yb0B0.c;
                int i6 = (i3 + i) - i5;
                c3343yb0B0.c = i5 + i6;
                this.m += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C3343yb0 c3343yb0B1 = b0(2);
                    int i7 = c3343yb0B1.c;
                    byte[] bArr2 = c3343yb0B1.a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c3343yb0B1.c = i7 + 2;
                    this.m += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C3343yb0 c3343yb0B2 = b0(3);
                    int i8 = c3343yb0B2.c;
                    byte[] bArr3 = c3343yb0B2.a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c3343yb0B2.c = i8 + 3;
                    this.m += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        f0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C3343yb0 c3343yb0B3 = b0(4);
                        int i11 = c3343yb0B3.c;
                        byte[] bArr4 = c3343yb0B3.a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c3343yb0B3.c = i11 + 4;
                        this.m += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void l0(String str) {
        AbstractC1474fG.j(str, "string");
        k0(0, str, str.length());
    }

    @Override // o.N9
    public final C2468pa m() {
        return n(this.m);
    }

    public final void m0(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            f0(i);
            return;
        }
        if (i < 2048) {
            C3343yb0 c3343yb0B0 = b0(2);
            int i3 = c3343yb0B0.c;
            byte[] bArr = c3343yb0B0.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            c3343yb0B0.c = i3 + 2;
            this.m += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            f0(63);
            return;
        }
        if (i < 65536) {
            C3343yb0 c3343yb0B1 = b0(3);
            int i4 = c3343yb0B1.c;
            byte[] bArr2 = c3343yb0B1.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            c3343yb0B1.c = i4 + 3;
            this.m += 3;
            return;
        }
        if (i <= 1114111) {
            C3343yb0 c3343yb0B2 = b0(4);
            int i5 = c3343yb0B2.c;
            byte[] bArr3 = c3343yb0B2.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            c3343yb0B2.c = i5 + 4;
            this.m += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC3021v9.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException(AbstractC1674hK.p("startIndex: ", i2, ", endIndex: 8, size: 8"));
            }
            if (i2 > 8) {
                throw new IllegalArgumentException(AbstractC1674hK.p("startIndex: ", i2, " > endIndex: 8"));
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // o.N9
    public final C2468pa n(long j) throws EOFException {
        if (j < 0 || j > C1707hi0.a) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount: ").toString());
        }
        if (this.m < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C2468pa(W(j));
        }
        C2468pa c2468paA0 = a0((int) j);
        skip(j);
        return c2468paA0;
    }

    public final void p() throws EOFException {
        skip(this.m);
    }

    @Override // o.N9
    public final C3111w50 peek() {
        return Nr0.g(new DX(this));
    }

    public final long q() {
        long j = this.m;
        if (j == 0) {
            return 0L;
        }
        C3343yb0 c3343yb0 = this.l;
        AbstractC1474fG.g(c3343yb0);
        C3343yb0 c3343yb1 = c3343yb0.g;
        AbstractC1474fG.g(c3343yb1);
        int i = c3343yb1.c;
        if (i < 8192 && c3343yb1.e) {
            j -= (long) (i - c3343yb1.b);
        }
        return j;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 r(int i) {
        j0(i);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1474fG.j(byteBuffer, "sink");
        C3343yb0 c3343yb0 = this.l;
        if (c3343yb0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c3343yb0.c - c3343yb0.b);
        byteBuffer.put(c3343yb0.a, c3343yb0.b, iMin);
        int i = c3343yb0.b + iMin;
        c3343yb0.b = i;
        this.m -= (long) iMin;
        if (i == c3343yb0.c) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        }
        return iMin;
    }

    @Override // o.N9
    public final byte readByte() {
        if (this.m == 0) {
            throw new EOFException();
        }
        C3343yb0 c3343yb0 = this.l;
        AbstractC1474fG.g(c3343yb0);
        int i = c3343yb0.b;
        int i2 = c3343yb0.c;
        int i3 = i + 1;
        byte b = c3343yb0.a[i];
        this.m--;
        if (i3 == i2) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        } else {
            c3343yb0.b = i3;
        }
        return b;
    }

    @Override // o.N9
    public final int readInt() throws EOFException {
        if (this.m < 4) {
            throw new EOFException();
        }
        C3343yb0 c3343yb0 = this.l;
        AbstractC1474fG.g(c3343yb0);
        int i = c3343yb0.b;
        int i2 = c3343yb0.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c3343yb0.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.m -= 4;
        if (i5 == i2) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        } else {
            c3343yb0.b = i5;
        }
        return i6;
    }

    @Override // o.N9
    public final short readShort() throws EOFException {
        if (this.m < 2) {
            throw new EOFException();
        }
        C3343yb0 c3343yb0 = this.l;
        AbstractC1474fG.g(c3343yb0);
        int i = c3343yb0.b;
        int i2 = c3343yb0.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = c3343yb0.a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.m -= 2;
        if (i5 == i2) {
            this.l = c3343yb0.a();
            Gb0.a(c3343yb0);
        } else {
            c3343yb0.b = i5;
        }
        return (short) i6;
    }

    @Override // o.N9
    public final boolean s(long j) {
        return this.m >= j;
    }

    @Override // o.N9
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C3343yb0 c3343yb0 = this.l;
            if (c3343yb0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c3343yb0.c - c3343yb0.b);
            long j2 = iMin;
            this.m -= j2;
            j -= j2;
            int i = c3343yb0.b + iMin;
            c3343yb0.b = i;
            if (i == c3343yb0.c) {
                this.l = c3343yb0.a();
                Gb0.a(c3343yb0);
            }
        }
    }

    public final void t(E9 e9, long j, long j2) {
        AbstractC1474fG.j(e9, "out");
        AbstractC2506pt.j(this.m, j, j2);
        if (j2 == 0) {
            return;
        }
        e9.m += j2;
        C3343yb0 c3343yb0 = this.l;
        while (true) {
            AbstractC1474fG.g(c3343yb0);
            long j3 = c3343yb0.c - c3343yb0.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            c3343yb0 = c3343yb0.f;
        }
        while (j2 > 0) {
            AbstractC1474fG.g(c3343yb0);
            C3343yb0 c3343yb0C = c3343yb0.c();
            int i = c3343yb0C.b + ((int) j);
            c3343yb0C.b = i;
            c3343yb0C.c = Math.min(i + ((int) j2), c3343yb0C.c);
            C3343yb0 c3343yb1 = e9.l;
            if (c3343yb1 == null) {
                c3343yb0C.g = c3343yb0C;
                c3343yb0C.f = c3343yb0C;
                e9.l = c3343yb0C;
            } else {
                C3343yb0 c3343yb2 = c3343yb1.g;
                AbstractC1474fG.g(c3343yb2);
                c3343yb2.b(c3343yb0C);
            }
            j2 -= (long) (c3343yb0C.c - c3343yb0C.b);
            c3343yb0 = c3343yb0.f;
            j = 0;
        }
    }

    public final String toString() {
        long j = this.m;
        if (j <= C1707hi0.a) {
            return a0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.m).toString());
    }

    @Override // o.N9
    public final long u(E9 e9) {
        long j = this.m;
        if (j > 0) {
            e9.w(this, j);
        }
        return j;
    }

    @Override // o.M9
    public final /* bridge */ /* synthetic */ M9 v(int i) {
        i0(i);
        return this;
    }

    @Override // o.InterfaceC1991ke0
    public final void w(E9 e9, long j) {
        C3343yb0 c3343yb0B;
        AbstractC1474fG.j(e9, "source");
        if (e9 == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        AbstractC2506pt.j(e9.m, 0L, j);
        while (j > 0) {
            C3343yb0 c3343yb0 = e9.l;
            AbstractC1474fG.g(c3343yb0);
            int i = c3343yb0.c;
            C3343yb0 c3343yb1 = e9.l;
            AbstractC1474fG.g(c3343yb1);
            int i2 = 0;
            if (j < i - c3343yb1.b) {
                C3343yb0 c3343yb2 = this.l;
                C3343yb0 c3343yb3 = c3343yb2 != null ? c3343yb2.g : null;
                if (c3343yb3 != null && c3343yb3.e) {
                    if ((((long) c3343yb3.c) + j) - ((long) (c3343yb3.d ? 0 : c3343yb3.b)) <= 8192) {
                        C3343yb0 c3343yb4 = e9.l;
                        AbstractC1474fG.g(c3343yb4);
                        c3343yb4.d(c3343yb3, (int) j);
                        e9.m -= j;
                        this.m += j;
                        return;
                    }
                }
                C3343yb0 c3343yb5 = e9.l;
                AbstractC1474fG.g(c3343yb5);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c3343yb5.c - c3343yb5.b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    c3343yb0B = c3343yb5.c();
                } else {
                    c3343yb0B = Gb0.b();
                    int i4 = c3343yb5.b;
                    X5.I(0, i4, i4 + i3, c3343yb5.a, c3343yb0B.a);
                }
                c3343yb0B.c = c3343yb0B.b + i3;
                c3343yb5.b += i3;
                C3343yb0 c3343yb6 = c3343yb5.g;
                AbstractC1474fG.g(c3343yb6);
                c3343yb6.b(c3343yb0B);
                e9.l = c3343yb0B;
            }
            C3343yb0 c3343yb7 = e9.l;
            AbstractC1474fG.g(c3343yb7);
            long j2 = c3343yb7.c - c3343yb7.b;
            e9.l = c3343yb7.a();
            C3343yb0 c3343yb8 = this.l;
            if (c3343yb8 == null) {
                this.l = c3343yb7;
                c3343yb7.g = c3343yb7;
                c3343yb7.f = c3343yb7;
            } else {
                C3343yb0 c3343yb9 = c3343yb8.g;
                AbstractC1474fG.g(c3343yb9);
                c3343yb9.b(c3343yb7);
                C3343yb0 c3343yb10 = c3343yb7.g;
                if (c3343yb10 == c3343yb7) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                AbstractC1474fG.g(c3343yb10);
                if (c3343yb10.e) {
                    int i5 = c3343yb7.c - c3343yb7.b;
                    C3343yb0 c3343yb11 = c3343yb7.g;
                    AbstractC1474fG.g(c3343yb11);
                    int i6 = 8192 - c3343yb11.c;
                    C3343yb0 c3343yb12 = c3343yb7.g;
                    AbstractC1474fG.g(c3343yb12);
                    if (!c3343yb12.d) {
                        C3343yb0 c3343yb13 = c3343yb7.g;
                        AbstractC1474fG.g(c3343yb13);
                        i2 = c3343yb13.b;
                    }
                    if (i5 <= i6 + i2) {
                        C3343yb0 c3343yb14 = c3343yb7.g;
                        AbstractC1474fG.g(c3343yb14);
                        c3343yb7.d(c3343yb14, i5);
                        c3343yb7.a();
                        Gb0.a(c3343yb7);
                    }
                }
            }
            e9.m -= j2;
            this.m += j2;
            j -= j2;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1474fG.j(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C3343yb0 c3343yb0B0 = b0(1);
            int iMin = Math.min(i, 8192 - c3343yb0B0.c);
            byteBuffer.get(c3343yb0B0.a, c3343yb0B0.c, iMin);
            i -= iMin;
            c3343yb0B0.c += iMin;
        }
        this.m += (long) iRemaining;
        return iRemaining;
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) {
        AbstractC1474fG.j(e9, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        long j2 = this.m;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        e9.w(this, j);
        return j;
    }

    @Override // o.M9
    public final M9 H() {
        return this;
    }

    @Override // o.N9, o.M9
    public final E9 b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.InterfaceC1991ke0
    public final void close() {
    }

    @Override // o.M9, o.InterfaceC1991ke0, java.io.Flushable
    public final void flush() {
    }
}
