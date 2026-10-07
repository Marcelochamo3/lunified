package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ZC {
    public final E9 b;
    public boolean d;
    public int h;
    public int i;
    public final boolean a = true;
    public int c = Integer.MAX_VALUE;
    public int e = C1672hI.a.f;
    public C1957kB[] f = new C1957kB[8];
    public int g = 7;

    public ZC(E9 e9) {
        this.b = e9;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C1957kB c1957kB = this.f[length];
                AbstractC1474fG.g(c1957kB);
                i -= c1957kB.c;
                int i4 = this.i;
                C1957kB c1957kB2 = this.f[length];
                AbstractC1474fG.g(c1957kB2);
                this.i = i4 - c1957kB2.c;
                this.h--;
                i3++;
                length--;
            }
            C1957kB[] c1957kBArr = this.f;
            int i5 = i2 + 1;
            System.arraycopy(c1957kBArr, i5, c1957kBArr, i5 + i3, this.h);
            C1957kB[] c1957kBArr2 = this.f;
            int i6 = this.g + 1;
            Arrays.fill(c1957kBArr2, i6, i6 + i3, (Object) null);
            this.g += i3;
        }
    }

    public final void b(C1957kB c1957kB) {
        int i = this.e;
        int i2 = c1957kB.c;
        if (i2 > i) {
            C1957kB[] c1957kBArr = this.f;
            X5.N(c1957kBArr, null, 0, c1957kBArr.length);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C1957kB[] c1957kBArr2 = this.f;
        if (i3 > c1957kBArr2.length) {
            C1957kB[] c1957kBArr3 = new C1957kB[c1957kBArr2.length * 2];
            System.arraycopy(c1957kBArr2, 0, c1957kBArr3, c1957kBArr2.length, c1957kBArr2.length);
            this.g = this.f.length - 1;
            this.f = c1957kBArr3;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.f[i4] = c1957kB;
        this.h++;
        this.i += i2;
    }

    public final void c(C2468pa c2468pa) throws EOFException {
        AbstractC1474fG.j(c2468pa, "data");
        boolean z = this.a;
        E9 e9 = this.b;
        if (z) {
            int[] iArr = AbstractC2736sE.a;
            int iD = c2468pa.d();
            long j = 0;
            for (int i = 0; i < iD; i++) {
                byte bG = c2468pa.g(i);
                byte[] bArr = Mr0.a;
                j += (long) AbstractC2736sE.b[bG & 255];
            }
            if (((int) ((j + ((long) 7)) >> 3)) < c2468pa.d()) {
                E9 e10 = new E9();
                int[] iArr2 = AbstractC2736sE.a;
                int iD2 = c2468pa.d();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iD2; i3++) {
                    byte bG2 = c2468pa.g(i3);
                    byte[] bArr2 = Mr0.a;
                    int i4 = bG2 & 255;
                    int i5 = AbstractC2736sE.a[i4];
                    byte b = AbstractC2736sE.b[i4];
                    j2 = (j2 << b) | ((long) i5);
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        e10.f0((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    e10.f0((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                C2468pa c2468paN = e10.n(e10.m);
                e(c2468paN.d(), Yu0.b.k0, 128);
                e9.c0(c2468paN);
                return;
            }
        }
        e(c2468pa.d(), Yu0.b.k0, 0);
        e9.c0(c2468pa);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9 A[SYNTHETIC] */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        C2468pa c2468pa;
        int i;
        int length3;
        C1957kB c1957kB;
        C1957kB c1957kB2;
        if (this.d) {
            int i2 = this.c;
            if (i2 < this.e) {
                e(i2, 31, 32);
            }
            this.d = false;
            this.c = Integer.MAX_VALUE;
            e(this.e, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1957kB c1957kB3 = (C1957kB) arrayList.get(i3);
            C2468pa c2468paJ = c1957kB3.a.j();
            Integer num = (Integer) AbstractC0983aD.b.get(c2468paJ);
            C2468pa c2468pa2 = c1957kB3.b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 <= length2 && length2 < 8) {
                    C1957kB[] c1957kBArr = AbstractC0983aD.a;
                    if (AbstractC1474fG.b(c1957kBArr[iIntValue].b, c2468pa2)) {
                        length = length2;
                    } else if (AbstractC1474fG.b(c1957kBArr[length2].b, c2468pa2)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                    if (length2 == -1) {
                        length3 = this.f.length;
                        for (i = this.g + 1; i < length3; i++) {
                            c1957kB = this.f[i];
                            AbstractC1474fG.g(c1957kB);
                            if (AbstractC1474fG.b(c1957kB.a, c2468paJ)) {
                                c1957kB2 = this.f[i];
                                AbstractC1474fG.g(c1957kB2);
                                if (AbstractC1474fG.b(c1957kB2.b, c2468pa2)) {
                                    length2 = AbstractC0983aD.a.length + (i - this.g);
                                    break;
                                } else if (length == -1) {
                                    length = (i - this.g) + AbstractC0983aD.a.length;
                                }
                            }
                        }
                    }
                    if (length2 != -1) {
                        e(length2, Yu0.b.k0, 128);
                    } else if (length == -1) {
                        this.b.f0(64);
                        c(c2468paJ);
                        c(c2468pa2);
                        b(c1957kB3);
                    } else {
                        c2468pa = C1957kB.d;
                        c2468paJ.getClass();
                        AbstractC1474fG.j(c2468pa, "prefix");
                        if (c2468paJ.i(c2468pa, c2468pa.d()) || AbstractC1474fG.b(C1957kB.i, c2468paJ)) {
                            e(length, 63, 64);
                            c(c2468pa2);
                            b(c1957kB3);
                        } else {
                            e(length, 15, 0);
                            c(c2468pa2);
                        }
                    }
                }
                length = length2;
            } else {
                length = -1;
            }
            length2 = -1;
            if (length2 == -1) {
                length3 = this.f.length;
                while (i < length3) {
                    c1957kB = this.f[i];
                    AbstractC1474fG.g(c1957kB);
                    if (AbstractC1474fG.b(c1957kB.a, c2468paJ)) {
                        c1957kB2 = this.f[i];
                        AbstractC1474fG.g(c1957kB2);
                        if (AbstractC1474fG.b(c1957kB2.b, c2468pa2)) {
                            length2 = AbstractC0983aD.a.length + (i - this.g);
                            break;
                        } else if (length == -1) {
                            length = (i - this.g) + AbstractC0983aD.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, Yu0.b.k0, 128);
            } else if (length == -1) {
                this.b.f0(64);
                c(c2468paJ);
                c(c2468pa2);
                b(c1957kB3);
            } else {
                c2468pa = C1957kB.d;
                c2468paJ.getClass();
                AbstractC1474fG.j(c2468pa, "prefix");
                if (c2468paJ.i(c2468pa, c2468pa.d())) {
                    e(length, 63, 64);
                    c(c2468pa2);
                    b(c1957kB3);
                } else {
                    e(length, 63, 64);
                    c(c2468pa2);
                    b(c1957kB3);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        E9 e9 = this.b;
        if (i < i2) {
            e9.f0(i | i3);
            return;
        }
        e9.f0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            e9.f0(128 | (i4 & Yu0.b.k0));
            i4 >>>= 7;
        }
        e9.f0(i4);
    }
}
