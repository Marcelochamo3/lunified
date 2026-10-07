package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.j30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845j30 extends T5 {
    public C1798if0[] f;
    public C1798if0[] g;
    public int h;
    public C2994uv i;

    @Override // o.T5
    public final C1798if0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C1798if0[] c1798if0Arr = this.f;
            C1798if0 c1798if0 = c1798if0Arr[i2];
            if (!zArr[c1798if0.m]) {
                C2994uv c2994uv = this.i;
                c2994uv.m = c1798if0;
                int i3 = 8;
                if (i != -1) {
                    C1798if0 c1798if1 = c1798if0Arr[i];
                    while (i3 >= 0) {
                        float f = c1798if1.s[i3];
                        float f2 = ((C1798if0) c2994uv.m).s[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((C1798if0) c2994uv.m).s[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // o.T5
    public final boolean e() {
        return this.h == 0;
    }

    @Override // o.T5
    public final void i(C2742sK c2742sK, T5 t5, boolean z) {
        C1798if0 c1798if0 = t5.a;
        if (c1798if0 == null) {
            return;
        }
        N5 n5 = t5.d;
        int iF = n5.f();
        for (int i = 0; i < iF; i++) {
            C1798if0 c1798if0G = n5.g(i);
            float fH = n5.h(i);
            C2994uv c2994uv = this.i;
            c2994uv.m = c1798if0G;
            boolean z2 = c1798if0G.l;
            float[] fArr = c1798if0.s;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C1798if0) c2994uv.m).s;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1798if0) c2994uv.m).s[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((C1845j30) c2994uv.n).k((C1798if0) c2994uv.m);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1798if0) c2994uv.m).s[i3] = f3;
                    } else {
                        ((C1798if0) c2994uv.m).s[i3] = 0.0f;
                    }
                }
                j(c1798if0G);
            }
            this.b = (t5.b * fH) + this.b;
        }
        k(c1798if0);
    }

    public final void j(C1798if0 c1798if0) {
        int i;
        int i2 = this.h + 1;
        C1798if0[] c1798if0Arr = this.f;
        if (i2 > c1798if0Arr.length) {
            C1798if0[] c1798if0Arr2 = (C1798if0[]) Arrays.copyOf(c1798if0Arr, c1798if0Arr.length * 2);
            this.f = c1798if0Arr2;
            this.g = (C1798if0[]) Arrays.copyOf(c1798if0Arr2, c1798if0Arr2.length * 2);
        }
        C1798if0[] c1798if0Arr3 = this.f;
        int i3 = this.h;
        c1798if0Arr3[i3] = c1798if0;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c1798if0Arr3[i3].m > c1798if0.m) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new C1749i30(0));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        c1798if0.l = true;
        c1798if0.a(this);
    }

    public final void k(C1798if0 c1798if0) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == c1798if0) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c1798if0.l = false;
                        return;
                    } else {
                        C1798if0[] c1798if0Arr = this.f;
                        int i3 = i + 1;
                        c1798if0Arr[i] = c1798if0Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o.T5
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C1798if0 c1798if0 = this.f[i];
            C2994uv c2994uv = this.i;
            c2994uv.m = c1798if0;
            str = str + c2994uv + " ";
        }
        return str;
    }
}
