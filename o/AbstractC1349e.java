package o;

import java.io.EOFException;

/* JADX INFO: renamed from: o.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1349e {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(E9 e9, long j) throws EOFException {
        AbstractC1474fG.j(e9, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (e9.K(j2) == 13) {
                String strY = e9.Y(j2, AbstractC1305dd.a);
                e9.skip(2L);
                return strY;
            }
        }
        String strY2 = e9.Y(j, AbstractC1305dd.a);
        e9.skip(1L);
        return strY2;
    }

    public static final int b(E9 e9, DW dw, boolean z) {
        int i;
        int i2;
        C3343yb0 c3343yb0;
        byte[] bArr;
        int i3;
        AbstractC1474fG.j(e9, "<this>");
        AbstractC1474fG.j(dw, "options");
        C3343yb0 c3343yb1 = e9.l;
        int i4 = -2;
        if (c3343yb1 == null) {
            return z ? -2 : -1;
        }
        int i5 = c3343yb1.b;
        int i6 = c3343yb1.c;
        byte[] bArr2 = c3343yb1.a;
        C3343yb0 c3343yb2 = c3343yb1;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int[] iArr = dw.n;
            int i10 = iArr[i7];
            int i11 = i7 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (c3343yb2 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c3343yb2 = c3343yb2.f;
                            AbstractC1474fG.g(c3343yb2);
                            i2 = c3343yb2.b;
                            i6 = c3343yb2.c;
                            bArr2 = c3343yb2.a;
                            if (c3343yb2 == c3343yb1) {
                                c3343yb2 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i8;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    AbstractC1474fG.g(c3343yb2);
                    C3343yb0 c3343yb3 = c3343yb2.f;
                    AbstractC1474fG.g(c3343yb3);
                    i3 = c3343yb3.b;
                    int i19 = c3343yb3.c;
                    bArr = c3343yb3.a;
                    if (c3343yb3 != c3343yb1) {
                        c3343yb0 = c3343yb3;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        c3343yb0 = null;
                    }
                } else {
                    c3343yb0 = c3343yb2;
                    bArr = bArr2;
                    i3 = i17;
                }
                if (z2) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    c3343yb2 = c3343yb0;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                c3343yb2 = c3343yb0;
                i11 = i18;
            }
            if (i >= 0) {
                return i;
            }
            i7 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i8;
    }
}
