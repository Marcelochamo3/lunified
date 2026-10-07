package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class Hb0 extends C2468pa {
    public final transient byte[][] p;
    public final transient int[] q;

    public Hb0(byte[][] bArr, int[] iArr) {
        super(C2468pa.f972o.l);
        this.p = bArr;
        this.q = iArr;
    }

    private final Object writeReplace() {
        return n();
    }

    @Override // o.C2468pa
    public final String a() {
        return n().a();
    }

    @Override // o.C2468pa
    public final String b() {
        return n().b();
    }

    @Override // o.C2468pa
    public final C2468pa c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.p;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.q;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1474fG.g(bArrDigest);
        return new C2468pa(bArrDigest);
    }

    @Override // o.C2468pa
    public final int d() {
        return this.q[this.p.length - 1];
    }

    @Override // o.C2468pa
    public final String e() {
        return n().e();
    }

    @Override // o.C2468pa
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2468pa) {
            C2468pa c2468pa = (C2468pa) obj;
            if (c2468pa.d() == d() && i(c2468pa, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C2468pa
    public final byte[] f() {
        return m();
    }

    @Override // o.C2468pa
    public final byte g(int i) {
        byte[][] bArr = this.p;
        int length = bArr.length - 1;
        int[] iArr = this.q;
        AbstractC2506pt.j(iArr[length], i, 1L);
        int iE = AbstractC0397Ej.E(this, i);
        return bArr[iE][(i - (iE == 0 ? 0 : iArr[iE - 1])) + iArr[bArr.length + iE]];
    }

    @Override // o.C2468pa
    public final boolean h(int i, int i2, int i3, byte[] bArr) {
        AbstractC1474fG.j(bArr, "other");
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iE = AbstractC0397Ej.E(this, i);
        while (i < i4) {
            int[] iArr = this.q;
            int i5 = iE == 0 ? 0 : iArr[iE - 1];
            int i6 = iArr[iE] - i5;
            byte[][] bArr2 = this.p;
            int i7 = iArr[bArr2.length + iE];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!AbstractC2506pt.e((i - i5) + i7, i2, iMin, bArr2[iE], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iE++;
        }
        return true;
    }

    @Override // o.C2468pa
    public final int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.p;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.q;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.m = i3;
        return i3;
    }

    @Override // o.C2468pa
    public final boolean i(C2468pa c2468pa, int i) {
        AbstractC1474fG.j(c2468pa, "other");
        if (d() - i < 0) {
            return false;
        }
        int iE = AbstractC0397Ej.E(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.q;
            int i4 = iE == 0 ? 0 : iArr[iE - 1];
            int i5 = iArr[iE] - i4;
            byte[][] bArr = this.p;
            int i6 = iArr[bArr.length + iE];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!c2468pa.h(i3, (i2 - i4) + i6, iMin, bArr[iE])) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iE++;
        }
        return true;
    }

    @Override // o.C2468pa
    public final C2468pa j() {
        return n().j();
    }

    @Override // o.C2468pa
    public final void l(E9 e9, int i) {
        AbstractC1474fG.j(e9, "buffer");
        int iE = AbstractC0397Ej.E(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.q;
            int i3 = iE == 0 ? 0 : iArr[iE - 1];
            int i4 = iArr[iE] - i3;
            byte[][] bArr = this.p;
            int i5 = iArr[bArr.length + iE];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C3343yb0 c3343yb0 = new C3343yb0(bArr[iE], i6, i6 + iMin, true);
            C3343yb0 c3343yb1 = e9.l;
            if (c3343yb1 == null) {
                c3343yb0.g = c3343yb0;
                c3343yb0.f = c3343yb0;
                e9.l = c3343yb0;
            } else {
                C3343yb0 c3343yb2 = c3343yb1.g;
                AbstractC1474fG.g(c3343yb2);
                c3343yb2.b(c3343yb0);
            }
            i2 += iMin;
            iE++;
        }
        e9.m += (long) i;
    }

    public final byte[] m() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.p;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.q;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            X5.I(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final C2468pa n() {
        return new C2468pa(m());
    }

    @Override // o.C2468pa
    public final String toString() {
        return n().toString();
    }
}
