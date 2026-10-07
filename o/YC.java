package o;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class YC {
    public final C3111w50 c;
    public int f;
    public int g;
    public int a = C1672hI.a.f;
    public final ArrayList b = new ArrayList();
    public C1957kB[] d = new C1957kB[8];
    public int e = 7;

    public YC(VD vd) {
        this.c = Nr0.g(vd);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C1957kB c1957kB = this.d[length];
                AbstractC1474fG.g(c1957kB);
                int i4 = c1957kB.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            C1957kB[] c1957kBArr = this.d;
            System.arraycopy(c1957kBArr, i2 + 1, c1957kBArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final C2468pa b(int i) throws IOException {
        if (i >= 0) {
            C1957kB[] c1957kBArr = AbstractC0983aD.a;
            if (i <= c1957kBArr.length - 1) {
                return c1957kBArr[i].a;
            }
        }
        int length = this.e + 1 + (i - AbstractC0983aD.a.length);
        if (length >= 0) {
            C1957kB[] c1957kBArr2 = this.d;
            if (length < c1957kBArr2.length) {
                C1957kB c1957kB = c1957kBArr2[length];
                AbstractC1474fG.g(c1957kB);
                return c1957kB.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C1957kB c1957kB) {
        this.b.add(c1957kB);
        int i = this.a;
        int i2 = c1957kB.c;
        if (i2 > i) {
            C1957kB[] c1957kBArr = this.d;
            X5.N(c1957kBArr, null, 0, c1957kBArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i2) - i);
        int i3 = this.f + 1;
        C1957kB[] c1957kBArr2 = this.d;
        if (i3 > c1957kBArr2.length) {
            C1957kB[] c1957kBArr3 = new C1957kB[c1957kBArr2.length * 2];
            System.arraycopy(c1957kBArr2, 0, c1957kBArr3, c1957kBArr2.length, c1957kBArr2.length);
            this.e = this.d.length - 1;
            this.d = c1957kBArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = c1957kB;
        this.f++;
        this.g += i2;
    }

    public final C2468pa d() {
        int i;
        C3111w50 c3111w50 = this.c;
        byte b = c3111w50.readByte();
        byte[] bArr = Mr0.a;
        int i2 = b & 255;
        int i3 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i2, Yu0.b.k0);
        if (!z) {
            return c3111w50.n(jE);
        }
        E9 e9 = new E9();
        int[] iArr = AbstractC2736sE.a;
        AbstractC1474fG.j(c3111w50, "source");
        FV fv = AbstractC2736sE.c;
        FV fv2 = fv;
        int i4 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = c3111w50.readByte();
            byte[] bArr2 = Mr0.a;
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                FV[] fvArr = (FV[]) fv2.n;
                AbstractC1474fG.g(fvArr);
                fv2 = fvArr[(i3 >>> (i4 - 8)) & 255];
                AbstractC1474fG.g(fv2);
                if (((FV[]) fv2.n) == null) {
                    e9.f0(fv2.l);
                    i4 -= fv2.m;
                    fv2 = fv;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            FV[] fvArr2 = (FV[]) fv2.n;
            AbstractC1474fG.g(fvArr2);
            FV fv3 = fvArr2[(i3 << (8 - i4)) & 255];
            AbstractC1474fG.g(fv3);
            if (((FV[]) fv3.n) != null || (i = fv3.m) > i4) {
                break;
            }
            e9.f0(fv3.l);
            i4 -= i;
            fv2 = fv;
        }
        return e9.n(e9.m);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = Mr0.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
