package o;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: o.qX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2562qX {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final AbstractC1571gF f = AbstractC1571gF.k(5, AbstractC1402ed.a, AbstractC1402ed.c, AbstractC1402ed.f, AbstractC1402ed.d, AbstractC1402ed.e);
    public byte[] a;
    public int b;
    public int c;

    public C2562qX() {
        this.a = Lr0.e;
    }

    public final long A() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(AbstractC1674hK.o(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.a[this.b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC1674hK.o(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i2;
        return j;
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return AbstractC1402ed.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return AbstractC1402ed.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return AbstractC1402ed.e;
    }

    public final void C(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        D(i, bArr);
    }

    public final void D(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void E(int i) {
        AbstractC0397Ej.c(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void F(int i) {
        AbstractC0397Ej.c(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void G(int i) {
        F(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        AbstractC0397Ej.b("Unsupported charset: " + charset, f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b;
        int i;
        byte b2;
        byte b3;
        if ((charset.equals(AbstractC1402ed.c) || charset.equals(AbstractC1402ed.a)) && a() >= 1) {
            long j = this.a[this.b] & 255;
            char c = (char) j;
            AbstractC1459f50.g(((long) c) == j, "Out of range: %s", j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(AbstractC1402ed.f) || charset.equals(AbstractC1402ed.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else {
                if (!charset.equals(AbstractC1402ed.e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        AbstractC1459f50.g(((long) c2) == j2, "Out of range: %s", j2);
        return (c2 << 16) + i;
    }

    public final void e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c = (char) (iD >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.b += iD & AQ.w;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    public final String h(Charset charset) {
        int i;
        byte[] bArr;
        AbstractC0397Ej.b("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = AbstractC1402ed.a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (charset.equals(AbstractC1402ed.c) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(AbstractC1402ed.f) && !charset.equals(AbstractC1402ed.e) && !charset.equals(AbstractC1402ed.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(AbstractC1402ed.c) || charset.equals(AbstractC1402ed.a)) && Lr0.I(this.a[i2])) {
                break;
            }
            if (charset.equals(AbstractC1402ed.f) || charset.equals(AbstractC1402ed.d)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2] == 0 && Lr0.I(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(AbstractC1402ed.e)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0 && Lr0.I(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(AbstractC1402ed.e)) {
                    bArr = this.a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strS = s(i2 - this.b, charset);
        if (this.b != this.c && f(charset, d) == '\r') {
            f(charset, e);
        }
        return strS;
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public final long j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 7;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i2]) & 255) << 56) | j;
    }

    public final short k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 3;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i2]) & 255) << 24) | j;
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(AbstractC1674hK.n(i, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i2]) & 255) | j;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = Lr0.a;
        String str = new String(bArr, i2, i - i2, AbstractC1402ed.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = Lr0.a;
        String str = new String(bArr, i2, i4, AbstractC1402ed.c);
        this.b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final long v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 16) | ((((long) bArr[i + 2]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i2]) & 255) | j;
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final int x() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(AbstractC1674hK.n(iG, "Top bit not zero: "));
    }

    public final long y() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(AbstractC1674hK.o(jO, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public C2562qX(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public C2562qX(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public C2562qX(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
