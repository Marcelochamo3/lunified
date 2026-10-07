package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class GV {
    public final HV a = new HV();
    public final C2562qX b = new C2562qX(0, new byte[65025]);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            HV hv = this.a;
            if (i5 >= hv.c) {
                break;
            }
            int[] iArr = hv.f;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(C0554Kk c0554Kk) {
        int i;
        boolean z = this.e;
        C2562qX c2562qX = this.b;
        if (z) {
            this.e = false;
            c2562qX.C(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            HV hv = this.a;
            if (i2 < 0) {
                if (hv.b(c0554Kk, -1L) && hv.a(c0554Kk, true)) {
                    int iA = hv.d;
                    if ((hv.a & 1) == 1 && c2562qX.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        c0554Kk.q(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                c2562qX.b(c2562qX.c + iA2);
                try {
                    c0554Kk.a(c2562qX.a, c2562qX.c, iA2, false);
                    c2562qX.E(c2562qX.c + iA2);
                    this.e = hv.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == hv.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }
}
