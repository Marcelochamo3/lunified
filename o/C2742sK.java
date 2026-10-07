package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2742sK {
    public static boolean p = false;
    public static int q = 1000;
    public final C1845j30 c;
    public T5[] f;
    public final Na0 l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public T5 f1023o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public C1798if0[] m = new C1798if0[q];
    public int n = 0;

    public C2742sK() {
        this.f = null;
        this.f = new T5[32];
        s();
        Na0 na0 = new Na0(9, false);
        na0.m = new C2039l20();
        na0.n = new C2039l20();
        na0.f414o = new C1798if0[32];
        this.l = na0;
        C1845j30 c1845j30 = new C1845j30(na0);
        c1845j30.f = new C1798if0[128];
        c1845j30.g = new C1798if0[128];
        c1845j30.h = 0;
        c1845j30.i = new C2994uv(c1845j30);
        this.c = c1845j30;
        this.f1023o = new T5(na0);
    }

    public static int n(C0394Eg c0394Eg) {
        C1798if0 c1798if0 = c0394Eg.i;
        if (c1798if0 != null) {
            return (int) (c1798if0.p + 0.5f);
        }
        return 0;
    }

    public final C1798if0 a(int i) {
        C2039l20 c2039l20 = (C2039l20) this.l.n;
        int i2 = c2039l20.m;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c2039l20.l;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c2039l20.m = i3;
            obj = obj2;
        }
        C1798if0 c1798if0 = (C1798if0) obj;
        if (c1798if0 == null) {
            c1798if0 = new C1798if0(i);
            c1798if0.w = i;
        } else {
            c1798if0.c();
            c1798if0.w = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (C1798if0[]) Arrays.copyOf(this.m, i6);
        }
        C1798if0[] c1798if0Arr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        c1798if0Arr[i7] = c1798if0;
        return c1798if0;
    }

    public final void b(C1798if0 c1798if0, C1798if0 c1798if1, int i, float f, C1798if0 c1798if2, C1798if0 c1798if3, int i2, int i3) {
        T5 t5L = l();
        if (c1798if1 == c1798if2) {
            t5L.d.j(c1798if0, 1.0f);
            t5L.d.j(c1798if3, 1.0f);
            t5L.d.j(c1798if1, -2.0f);
        } else if (f == 0.5f) {
            t5L.d.j(c1798if0, 1.0f);
            t5L.d.j(c1798if1, -1.0f);
            t5L.d.j(c1798if2, -1.0f);
            t5L.d.j(c1798if3, 1.0f);
            if (i > 0 || i2 > 0) {
                t5L.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            t5L.d.j(c1798if0, -1.0f);
            t5L.d.j(c1798if1, 1.0f);
            t5L.b = i;
        } else if (f >= 1.0f) {
            t5L.d.j(c1798if3, -1.0f);
            t5L.d.j(c1798if2, 1.0f);
            t5L.b = -i2;
        } else {
            float f2 = 1.0f - f;
            t5L.d.j(c1798if0, f2 * 1.0f);
            t5L.d.j(c1798if1, f2 * (-1.0f));
            t5L.d.j(c1798if2, (-1.0f) * f);
            t5L.d.j(c1798if3, 1.0f * f);
            if (i > 0 || i2 > 0) {
                t5L.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            t5L.a(this, i3);
        }
        c(t5L);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    public final void c(T5 t5) {
        boolean z;
        boolean z2;
        C1798if0 c1798if0F;
        ArrayList arrayList;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (t5.e) {
            z = false;
        } else {
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iF = t5.d.f();
                    int i = 0;
                    while (true) {
                        arrayList = t5.c;
                        if (i >= iF) {
                            break;
                        }
                        C1798if0 c1798if0G = t5.d.g(i);
                        if (c1798if0G.n != -1 || c1798if0G.q) {
                            arrayList.add(c1798if0G);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C1798if0 c1798if0 = (C1798if0) arrayList.get(i2);
                            if (c1798if0.q) {
                                t5.h(this, c1798if0, true);
                            } else {
                                t5.i(this, this.f[c1798if0.n], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (t5.a != null && t5.d.f() == 0) {
                    t5.e = true;
                    this.a = true;
                }
            }
            if (t5.e()) {
                return;
            }
            float f = t5.b;
            if (f < 0.0f) {
                t5.b = f * (-1.0f);
                t5.d.i();
            }
            int iF2 = t5.d.f();
            C1798if0 c1798if1 = null;
            C1798if0 c1798if2 = null;
            float f2 = 0.0f;
            boolean z4 = false;
            float f3 = 0.0f;
            boolean z5 = false;
            for (int i3 = 0; i3 < iF2; i3++) {
                float fH = t5.d.h(i3);
                C1798if0 c1798if0G2 = t5.d.g(i3);
                if (c1798if0G2.w == 1) {
                    if (c1798if1 == null) {
                        if (c1798if0G2.v <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c1798if1 = c1798if0G2;
                        f2 = fH;
                    } else if (f2 > fH) {
                        if (c1798if0G2.v <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c1798if1 = c1798if0G2;
                        f2 = fH;
                    } else if (!z4 && c1798if0G2.v <= 1) {
                        c1798if1 = c1798if0G2;
                        f2 = fH;
                        z4 = true;
                    }
                } else if (c1798if1 == null && fH < 0.0f) {
                    if (c1798if2 == null) {
                        if (c1798if0G2.v <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c1798if2 = c1798if0G2;
                        f3 = fH;
                    } else if (f3 > fH) {
                        if (c1798if0G2.v <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c1798if2 = c1798if0G2;
                        f3 = fH;
                    } else if (!z5 && c1798if0G2.v <= 1) {
                        c1798if2 = c1798if0G2;
                        f3 = fH;
                        z5 = true;
                    }
                }
            }
            if (c1798if1 == null) {
                c1798if1 = c1798if2;
            }
            if (c1798if1 == null) {
                z2 = true;
            } else {
                t5.g(c1798if1);
                z2 = false;
            }
            if (t5.d.f() == 0) {
                t5.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                C1798if0 c1798if0A = a(3);
                int i4 = this.b + 1;
                this.b = i4;
                this.i++;
                c1798if0A.m = i4;
                Na0 na0 = this.l;
                ((C1798if0[]) na0.f414o)[i4] = c1798if0A;
                t5.a = c1798if0A;
                int i5 = this.j;
                h(t5);
                if (this.j == i5 + 1) {
                    T5 t6 = this.f1023o;
                    t6.getClass();
                    t6.a = null;
                    t6.d.b();
                    for (int i6 = 0; i6 < t5.d.f(); i6++) {
                        t6.d.a(t5.d.g(i6), t5.d.h(i6), true);
                    }
                    r(this.f1023o);
                    if (c1798if0A.n == -1) {
                        if (t5.a == c1798if0A && (c1798if0F = t5.f(null, c1798if0A)) != null) {
                            t5.g(c1798if0F);
                        }
                        if (!t5.e) {
                            t5.a.e(this, t5);
                        }
                        ((C2039l20) na0.m).a(t5);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            C1798if0 c1798if3 = t5.a;
            if (c1798if3 == null) {
                return;
            }
            if (c1798if3.w != 1 && t5.b < 0.0f) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(t5);
    }

    public final void d(C1798if0 c1798if0, int i) {
        int i2 = c1798if0.n;
        if (i2 == -1) {
            c1798if0.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                C1798if0 c1798if1 = ((C1798if0[]) this.l.f414o)[i3];
            }
            return;
        }
        if (i2 == -1) {
            T5 t5L = l();
            t5L.a = c1798if0;
            float f = i;
            c1798if0.p = f;
            t5L.b = f;
            t5L.e = true;
            c(t5L);
            return;
        }
        T5 t5 = this.f[i2];
        if (t5.e) {
            t5.b = i;
            return;
        }
        if (t5.d.f() == 0) {
            t5.e = true;
            t5.b = i;
            return;
        }
        T5 t5L2 = l();
        if (i < 0) {
            t5L2.b = i * (-1);
            t5L2.d.j(c1798if0, 1.0f);
        } else {
            t5L2.b = i;
            t5L2.d.j(c1798if0, -1.0f);
        }
        c(t5L2);
    }

    public final void e(C1798if0 c1798if0, C1798if0 c1798if1, int i, int i2) {
        if (i2 == 8 && c1798if1.q && c1798if0.n == -1) {
            c1798if0.d(this, c1798if1.p + i);
            return;
        }
        T5 t5L = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            t5L.b = i;
        }
        if (z) {
            t5L.d.j(c1798if0, 1.0f);
            t5L.d.j(c1798if1, -1.0f);
        } else {
            t5L.d.j(c1798if0, -1.0f);
            t5L.d.j(c1798if1, 1.0f);
        }
        if (i2 != 8) {
            t5L.a(this, i2);
        }
        c(t5L);
    }

    public final void f(C1798if0 c1798if0, C1798if0 c1798if1, int i, int i2) {
        T5 t5L = l();
        C1798if0 c1798if0M = m();
        c1798if0M.f833o = 0;
        t5L.b(c1798if0, c1798if1, c1798if0M, i);
        if (i2 != 8) {
            t5L.d.j(j(i2), (int) (t5L.d.e(c1798if0M) * (-1.0f)));
        }
        c(t5L);
    }

    public final void g(C1798if0 c1798if0, C1798if0 c1798if1, int i, int i2) {
        T5 t5L = l();
        C1798if0 c1798if0M = m();
        c1798if0M.f833o = 0;
        t5L.c(c1798if0, c1798if1, c1798if0M, i);
        if (i2 != 8) {
            t5L.d.j(j(i2), (int) (t5L.d.e(c1798if0M) * (-1.0f)));
        }
        c(t5L);
    }

    public final void h(T5 t5) {
        int i;
        if (t5.e) {
            t5.a.d(this, t5.b);
        } else {
            T5[] t5Arr = this.f;
            int i2 = this.j;
            t5Arr[i2] = t5;
            C1798if0 c1798if0 = t5.a;
            c1798if0.n = i2;
            this.j = i2 + 1;
            c1798if0.e(this, t5);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.getClass();
                }
                T5 t6 = this.f[i3];
                if (t6 != null && t6.e) {
                    t6.a.d(this, t6.b);
                    ((C2039l20) this.l.m).a(t6);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        T5[] t5Arr2 = this.f;
                        int i6 = i4 - 1;
                        T5 t7 = t5Arr2[i4];
                        t5Arr2[i6] = t7;
                        C1798if0 c1798if1 = t7.a;
                        if (c1798if1.n == i4) {
                            c1798if1.n = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            T5 t5 = this.f[i];
            t5.a.p = t5.b;
        }
    }

    public final C1798if0 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        C1798if0 c1798if0A = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        c1798if0A.m = i2;
        c1798if0A.f833o = i;
        ((C1798if0[]) this.l.f414o)[i2] = c1798if0A;
        C1845j30 c1845j30 = this.c;
        c1845j30.i.m = c1798if0A;
        float[] fArr = c1798if0A.s;
        Arrays.fill(fArr, 0.0f);
        fArr[c1798if0A.f833o] = 1.0f;
        c1845j30.j(c1798if0A);
        return c1798if0A;
    }

    public final C1798if0 k(Object obj) {
        C1798if0 c1798if0 = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof C0394Eg) {
            C0394Eg c0394Eg = (C0394Eg) obj;
            c1798if0 = c0394Eg.i;
            if (c1798if0 == null) {
                c0394Eg.k();
                c1798if0 = c0394Eg.i;
            }
            int i = c1798if0.m;
            Na0 na0 = this.l;
            if (i == -1 || i > this.b || ((C1798if0[]) na0.f414o)[i] == null) {
                if (i != -1) {
                    c1798if0.c();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                c1798if0.m = i2;
                c1798if0.w = 1;
                ((C1798if0[]) na0.f414o)[i2] = c1798if0;
            }
        }
        return c1798if0;
    }

    public final T5 l() {
        Object obj;
        Na0 na0 = this.l;
        C2039l20 c2039l20 = (C2039l20) na0.m;
        int i = c2039l20.m;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2039l20.l;
            obj = objArr[i2];
            objArr[i2] = null;
            c2039l20.m = i2;
        } else {
            obj = null;
        }
        T5 t5 = (T5) obj;
        if (t5 == null) {
            return new T5(na0);
        }
        t5.a = null;
        t5.d.b();
        t5.b = 0.0f;
        t5.e = false;
        return t5;
    }

    public final C1798if0 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        C1798if0 c1798if0A = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        c1798if0A.m = i;
        ((C1798if0[]) this.l.f414o)[i] = c1798if0A;
        return c1798if0A;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (T5[]) Arrays.copyOf(this.f, i);
        Na0 na0 = this.l;
        na0.f414o = (C1798if0[]) Arrays.copyOf((C1798if0[]) na0.f414o, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        C1845j30 c1845j30 = this.c;
        if (c1845j30.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(c1845j30);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(c1845j30);
                return;
            }
        }
        i();
    }

    public final void q(C1845j30 c1845j30) {
        for (int i = 0; i < this.j; i++) {
            T5 t5 = this.f[i];
            int i2 = 1;
            if (t5.a.w != 1) {
                float f = 0.0f;
                if (t5.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.j) {
                            T5 t6 = this.f[i4];
                            if (t6.a.w != i2 && !t6.e && t6.b < f) {
                                int iF = t6.d.f();
                                int i8 = 0;
                                while (i8 < iF) {
                                    C1798if0 c1798if0G = t6.d.g(i8);
                                    float fE = t6.d.e(c1798if0G);
                                    if (fE > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c1798if0G.r[i9] / fE;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i6 = c1798if0G.m;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            T5 t7 = this.f[i5];
                            t7.a.n = -1;
                            t7.g(((C1798if0[]) this.l.f414o)[i6]);
                            C1798if0 c1798if0 = t7.a;
                            c1798if0.n = i5;
                            c1798if0.e(this, t7);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(c1845j30);
        i();
    }

    public final void r(T5 t5) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            C1798if0 c1798if0 = t5.a;
            if (c1798if0 != null) {
                this.h[c1798if0.m] = true;
            }
            C1798if0 c1798if0D = t5.d(this.h);
            if (c1798if0D != null) {
                boolean[] zArr = this.h;
                int i3 = c1798if0D.m;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c1798if0D != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    T5 t6 = this.f[i5];
                    if (t6.a.w != 1 && !t6.e && t6.d.c(c1798if0D)) {
                        float fE = t6.d.e(c1798if0D);
                        if (fE < 0.0f) {
                            float f2 = (-t6.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    T5 t7 = this.f[i4];
                    t7.a.n = -1;
                    t7.g(c1798if0D);
                    C1798if0 c1798if1 = t7.a;
                    c1798if1.n = i4;
                    c1798if1.e(this, t7);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            T5 t5 = this.f[i];
            if (t5 != null) {
                ((C2039l20) this.l.m).a(t5);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        Na0 na0;
        int i = 0;
        while (true) {
            na0 = this.l;
            C1798if0[] c1798if0Arr = (C1798if0[]) na0.f414o;
            if (i >= c1798if0Arr.length) {
                break;
            }
            C1798if0 c1798if0 = c1798if0Arr[i];
            if (c1798if0 != null) {
                c1798if0.c();
            }
            i++;
        }
        C2039l20 c2039l20 = (C2039l20) na0.n;
        C1798if0[] c1798if0Arr2 = this.m;
        int length = this.n;
        c2039l20.getClass();
        if (length > c1798if0Arr2.length) {
            length = c1798if0Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C1798if0 c1798if1 = c1798if0Arr2[i2];
            int i3 = c2039l20.m;
            Object[] objArr = c2039l20.l;
            if (i3 < objArr.length) {
                objArr[i3] = c1798if1;
                c2039l20.m = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((C1798if0[]) na0.f414o, (Object) null);
        this.b = 0;
        C1845j30 c1845j30 = this.c;
        c1845j30.h = 0;
        c1845j30.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            T5 t5 = this.f[i4];
        }
        s();
        this.j = 0;
        this.f1023o = new T5(na0);
    }
}
