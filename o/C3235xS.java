package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.xS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3235xS {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.g = Sr0.c[3 - i3];
        int i6 = Sr0.d[i5];
        this.c = i6;
        if (i2 == 2) {
            this.c = i6 / 2;
        } else if (i2 == 0) {
            this.c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? Sr0.e[i4 - 1] : Sr0.f[i4 - 1];
            this.e = i9;
            this.b = (((i9 * 12) / this.c) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? Sr0.g[i4 - 1] : Sr0.h[i4 - 1];
                this.e = i10;
                this.b = ((i10 * 144) / this.c) + i7;
            } else {
                int i11 = Sr0.i[i4 - 1];
                this.e = i11;
                this.b = (((i3 == 1 ? 72 : 144) * i11) / this.c) + i7;
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
