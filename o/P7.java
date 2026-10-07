package o;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class P7 extends AbstractC1660h8 {
    public static final byte[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, C3285xv.h, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7() {
        super(2);
        byte[] bArr = AbstractC1660h8.c;
        this.d = f;
        for (int i = 0; i < 2; i++) {
            byte b = bArr[i];
            if (this.a != b) {
                if (b >= 0) {
                    byte[] bArr2 = this.d;
                    if (b >= bArr2.length || bArr2[b] == -1) {
                    }
                }
            }
            throw new IllegalArgumentException(AbstractC1701hf0.u("lineSeparator must not contain base64 characters: [", new String(bArr, StandardCharsets.UTF_8), "]"));
        }
        this.e = 3;
    }

    public final void b(byte[] bArr, int i, C1562g8 c1562g8) {
        int i2;
        byte b;
        if (c1562g8.b) {
            return;
        }
        if (i < 0) {
            c1562g8.b = true;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.e;
            if (i3 >= i) {
                break;
            }
            byte[] bArrA = AbstractC1660h8.a(i2, c1562g8);
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == this.a) {
                c1562g8.b = true;
                break;
            }
            if (b2 >= 0 && b2 < 123 && (b = f[b2]) >= 0) {
                int i6 = (c1562g8.f + 1) % 4;
                c1562g8.f = i6;
                int i7 = (c1562g8.c << 6) + b;
                c1562g8.c = i7;
                if (i6 == 0) {
                    int i8 = c1562g8.d;
                    bArrA[i8] = (byte) ((i7 >> 16) & 255);
                    bArrA[i8 + 1] = (byte) ((i7 >> 8) & 255);
                    c1562g8.d = i8 + 3;
                    bArrA[i8 + 2] = (byte) (i7 & 255);
                }
            }
            i3++;
            i4 = i5;
        }
        if (!c1562g8.b || c1562g8.f == 0) {
            return;
        }
        byte[] bArrA2 = AbstractC1660h8.a(i2, c1562g8);
        int i9 = c1562g8.f;
        int i10 = this.b;
        if (i9 == 1) {
            if (i10 == 1) {
                throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
            }
            return;
        }
        if (i9 == 2) {
            if (i10 == 1 && (c1562g8.c & 15) != 0) {
                throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            }
            int i11 = c1562g8.c >> 4;
            c1562g8.c = i11;
            int i12 = c1562g8.d;
            c1562g8.d = i12 + 1;
            bArrA2[i12] = (byte) (i11 & 255);
            return;
        }
        if (i9 != 3) {
            throw new IllegalStateException("Impossible modulus " + c1562g8.f);
        }
        if (i10 == 1 && (c1562g8.c & 3) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
        int i13 = c1562g8.c;
        int i14 = i13 >> 2;
        c1562g8.c = i14;
        int i15 = c1562g8.d;
        bArrA2[i15] = (byte) ((i13 >> 10) & 255);
        c1562g8.d = i15 + 2;
        bArrA2[i15 + 1] = (byte) (i14 & 255);
    }
}
