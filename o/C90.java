package o;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public class C90 implements InterfaceC1324dm0 {
    public C0643Nw A;
    public C0643Nw B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final C3313y90 a;
    public final InterfaceC0428Fo d;
    public final C0350Co e;
    public B90 f;
    public C0643Nw g;
    public InterfaceC3465zo h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final C3410z90 b = new C3410z90();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1226cm0[] f195o = new C1226cm0[1000];
    public final C2613qy c = new C2613qy(new C0633Nm(27));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public C90(C1562g8 c1562g8, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co) {
        this.d = interfaceC0428Fo;
        this.e = c0350Co;
        this.a = new C3313y90(c1562g8);
    }

    public final int A(C2994uv c2994uv, C0656Oj c0656Oj, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C3410z90 c3410z90 = this.b;
        synchronized (this) {
            try {
                c0656Oj.p = false;
                i2 = -3;
                if (u()) {
                    C0643Nw c0643Nw = ((A90) this.c.s(q())).a;
                    if (z2 || c0643Nw != this.g) {
                        y(c0643Nw, c2994uv);
                        i2 = -5;
                    } else {
                        int iR = r(this.s);
                        if (w(iR)) {
                            c0656Oj.m = this.m[iR];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                c0656Oj.b(536870912);
                            }
                            long j = this.n[iR];
                            c0656Oj.q = j;
                            if (j < this.t) {
                                c0656Oj.b(Integer.MIN_VALUE);
                            }
                            c3410z90.a = this.l[iR];
                            c3410z90.b = this.k[iR];
                            c3410z90.c = this.f195o[iR];
                            i2 = -4;
                        } else {
                            c0656Oj.p = true;
                        }
                    }
                } else if (z || this.w) {
                    c0656Oj.m = 4;
                    i2 = -4;
                } else {
                    C0643Nw c0643Nw2 = this.B;
                    if (c0643Nw2 != null && (z2 || c0643Nw2 != this.g)) {
                        y(c0643Nw2, c2994uv);
                        i2 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !c0656Oj.j(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    C3313y90 c3313y90 = this.a;
                    C3313y90.f(c3313y90.e, c0656Oj, this.b, c3313y90.c);
                } else {
                    C3313y90 c3313y91 = this.a;
                    c3313y91.e = C3313y90.f(c3313y91.e, c0656Oj, this.b, c3313y91.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void B(boolean z) {
        C2613qy c2613qy;
        SparseArray sparseArray;
        C3313y90 c3313y90 = this.a;
        c3313y90.a(c3313y90.d);
        C3209x6 c3209x6 = c3313y90.d;
        int i = 0;
        AbstractC0397Ej.f(((C2813t2) c3209x6.n) == null);
        c3209x6.l = 0L;
        c3209x6.m = c3313y90.b;
        C3209x6 c3209x7 = c3313y90.d;
        c3313y90.e = c3209x7;
        c3313y90.f = c3209x7;
        c3313y90.g = 0L;
        c3313y90.a.c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            c2613qy = this.c;
            sparseArray = (SparseArray) c2613qy.n;
            if (i >= sparseArray.size()) {
                break;
            }
            ((InterfaceC0809Ug) c2613qy.f996o).accept(sparseArray.valueAt(i));
            i++;
        }
        c2613qy.m = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized void C() {
        this.s = 0;
        C3313y90 c3313y90 = this.a;
        c3313y90.e = c3313y90.d;
    }

    public final int D(InterfaceC2000kj interfaceC2000kj, int i, boolean z) throws EOFException {
        C3313y90 c3313y90 = this.a;
        int iC = c3313y90.c(i);
        C3209x6 c3209x6 = c3313y90.f;
        C2813t2 c2813t2 = (C2813t2) c3209x6.n;
        int iD = interfaceC2000kj.D(c2813t2.a, ((int) (c3313y90.g - c3209x6.l)) + c2813t2.b, iC);
        if (iD == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c3313y90.g + ((long) iD);
        c3313y90.g = j;
        C3209x6 c3209x7 = c3313y90.f;
        if (j != c3209x7.m) {
            return iD;
        }
        c3313y90.f = (C3209x6) c3209x7.f1112o;
        return iD;
    }

    public final synchronized boolean E(long j, boolean z) {
        C();
        int iR = r(this.s);
        if (u() && j >= this.n[iR] && (j <= this.v || z)) {
            int iL = l(iR, this.p - this.s, j, true);
            if (iL == -1) {
                return false;
            }
            this.t = j;
            this.s += iL;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void F(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        AbstractC0397Ej.c(z);
        this.s += i;
    }

    @Override // o.InterfaceC1324dm0
    public final void a(C0643Nw c0643Nw) {
        C0643Nw c0643NwM = m(c0643Nw);
        boolean z = false;
        this.z = false;
        this.A = c0643Nw;
        synchronized (this) {
            try {
                this.y = false;
                if (!Lr0.a(c0643NwM, this.B)) {
                    if (((SparseArray) this.c.n).size() != 0) {
                        SparseArray sparseArray = (SparseArray) this.c.n;
                        if (((A90) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(c0643NwM)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.n;
                            this.B = ((A90) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        }
                        C0643Nw c0643Nw2 = this.B;
                        this.D = IQ.a(c0643Nw2.w, c0643Nw2.t);
                        this.E = false;
                        z = true;
                    }
                    this.B = c0643NwM;
                    C0643Nw c0643Nw3 = this.B;
                    this.D = IQ.a(c0643Nw3.w, c0643Nw3.t);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B90 b90 = this.f;
        if (b90 == null || !z) {
            return;
        }
        b90.a();
    }

    @Override // o.InterfaceC1324dm0
    public final int b(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        return D(interfaceC2000kj, i, z);
    }

    @Override // o.InterfaceC1324dm0
    public final void c(int i, C2562qX c2562qX) {
        while (true) {
            C3313y90 c3313y90 = this.a;
            if (i <= 0) {
                c3313y90.getClass();
                return;
            }
            int iC = c3313y90.c(i);
            C3209x6 c3209x6 = c3313y90.f;
            C2813t2 c2813t2 = (C2813t2) c3209x6.n;
            c2562qX.e(c2813t2.a, ((int) (c3313y90.g - c3209x6.l)) + c2813t2.b, iC);
            i -= iC;
            long j = c3313y90.g + ((long) iC);
            c3313y90.g = j;
            C3209x6 c3209x7 = c3313y90.f;
            if (j == c3209x7.m) {
                c3313y90.f = (C3209x6) c3209x7.f1112o;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    @Override // o.InterfaceC1324dm0
    public void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        int i4;
        if (this.z) {
            C0643Nw c0643Nw = this.A;
            AbstractC0397Ej.g(c0643Nw);
            a(c0643Nw);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.x) {
            if (!z2) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = this.F + j;
        if (!this.D) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.E) {
                    Objects.toString(this.B);
                    AP.z();
                    this.E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.G) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z = j2 > this.u;
                } else if (o() >= j2) {
                    z = false;
                } else {
                    int i6 = this.p;
                    int iR = r(i6 - 1);
                    while (i6 > this.s && this.n[iR] >= j2) {
                        i6--;
                        iR--;
                        if (iR == -1) {
                            iR = this.i - 1;
                        }
                    }
                    j(this.q + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.G = false;
            }
        }
        f(j2, i4, (this.a.g - ((long) i2)) - ((long) i3), i2, c1226cm0);
    }

    @Override // o.InterfaceC1324dm0
    public final /* synthetic */ void e(int i, C2562qX c2562qX) {
        AbstractC1674hK.c(this, c2562qX, i);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ea A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x007e, B:23:0x0082, B:25:0x008d, B:27:0x00a7, B:31:0x00b0, B:32:0x00b5, B:34:0x00bb, B:38:0x00c9, B:40:0x00ce, B:41:0x00de, B:42:0x00e1, B:44:0x00ea, B:24:0x008b, B:19:0x0063), top: B:49:0x0001 }] */
    public final synchronized void f(long j, int i, long j2, int i2, C1226cm0 c1226cm0) {
        int i3;
        int i4;
        try {
            int i5 = this.p;
            if (i5 > 0) {
                int iR = r(i5 - 1);
                AbstractC0397Ej.c(this.k[iR] + ((long) this.l[iR]) <= j2);
            }
            this.w = (536870912 & i) != 0;
            this.v = Math.max(this.v, j);
            int iR2 = r(this.p);
            this.n[iR2] = j;
            this.k[iR2] = j2;
            this.l[iR2] = i2;
            this.m[iR2] = i;
            this.f195o[iR2] = c1226cm0;
            this.j[iR2] = this.C;
            if (((SparseArray) this.c.n).size() != 0) {
                SparseArray sparseArray = (SparseArray) this.c.n;
                if (!((A90) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(this.B)) {
                }
                i3 = this.p + 1;
                this.p = i3;
                i4 = this.i;
                if (i3 == i4) {
                    int i6 = i4 + 1000;
                    long[] jArr = new long[i6];
                    long[] jArr2 = new long[i6];
                    long[] jArr3 = new long[i6];
                    int[] iArr = new int[i6];
                    int[] iArr2 = new int[i6];
                    C1226cm0[] c1226cm0Arr = new C1226cm0[i6];
                    int i7 = this.r;
                    int i8 = i4 - i7;
                    System.arraycopy(this.k, i7, jArr2, 0, i8);
                    System.arraycopy(this.n, this.r, jArr3, 0, i8);
                    System.arraycopy(this.m, this.r, iArr, 0, i8);
                    System.arraycopy(this.l, this.r, iArr2, 0, i8);
                    System.arraycopy(this.f195o, this.r, c1226cm0Arr, 0, i8);
                    System.arraycopy(this.j, this.r, jArr, 0, i8);
                    int i9 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i8, i9);
                    System.arraycopy(this.n, 0, jArr3, i8, i9);
                    System.arraycopy(this.m, 0, iArr, i8, i9);
                    System.arraycopy(this.l, 0, iArr2, i8, i9);
                    System.arraycopy(this.f195o, 0, c1226cm0Arr, i8, i9);
                    System.arraycopy(this.j, 0, jArr, i8, i9);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.f195o = c1226cm0Arr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i6;
                }
            }
            InterfaceC0428Fo interfaceC0428Fo = this.d;
            InterfaceC0402Eo interfaceC0402EoK = interfaceC0428Fo != null ? interfaceC0428Fo.k(this.e, this.B) : InterfaceC0402Eo.e;
            C2613qy c2613qy = this.c;
            int i10 = this.q + this.p;
            C0643Nw c0643Nw = this.B;
            c0643Nw.getClass();
            A90 a90 = new A90(c0643Nw, interfaceC0402EoK);
            int i11 = c2613qy.m;
            SparseArray sparseArray2 = (SparseArray) c2613qy.n;
            if (i11 == -1) {
                AbstractC0397Ej.f(sparseArray2.size() == 0);
                c2613qy.m = 0;
            }
            if (sparseArray2.size() > 0) {
                int iKeyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                AbstractC0397Ej.c(i10 >= iKeyAt);
                if (iKeyAt == i10) {
                    ((InterfaceC0809Ug) c2613qy.f996o).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i10, a90);
            i3 = this.p + 1;
            this.p = i3;
            i4 = this.i;
            if (i3 == i4) {
                int i12 = i4 + 1000;
                long[] jArr4 = new long[i12];
                long[] jArr5 = new long[i12];
                long[] jArr6 = new long[i12];
                int[] iArr3 = new int[i12];
                int[] iArr4 = new int[i12];
                C1226cm0[] c1226cm0Arr2 = new C1226cm0[i12];
                int i13 = this.r;
                int i14 = i4 - i13;
                System.arraycopy(this.k, i13, jArr5, 0, i14);
                System.arraycopy(this.n, this.r, jArr6, 0, i14);
                System.arraycopy(this.m, this.r, iArr3, 0, i14);
                System.arraycopy(this.l, this.r, iArr4, 0, i14);
                System.arraycopy(this.f195o, this.r, c1226cm0Arr2, 0, i14);
                System.arraycopy(this.j, this.r, jArr4, 0, i14);
                int i15 = this.r;
                System.arraycopy(this.k, 0, jArr5, i14, i15);
                System.arraycopy(this.n, 0, jArr6, i14, i15);
                System.arraycopy(this.m, 0, iArr3, i14, i15);
                System.arraycopy(this.l, 0, iArr4, i14, i15);
                System.arraycopy(this.f195o, 0, c1226cm0Arr2, i14, i15);
                System.arraycopy(this.j, 0, jArr4, i14, i15);
                this.k = jArr5;
                this.n = jArr6;
                this.m = iArr3;
                this.l = iArr4;
                this.f195o = c1226cm0Arr2;
                this.j = jArr4;
                this.r = 0;
                this.i = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long g(int i) {
        this.u = Math.max(this.u, p(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        while (true) {
            C2613qy c2613qy = this.c;
            SparseArray sparseArray = (SparseArray) c2613qy.n;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((InterfaceC0809Ug) c2613qy.f996o).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = c2613qy.m;
            if (i8 > 0) {
                c2613qy.m = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    public final void h(long j, boolean z, boolean z2) {
        long jG;
        int i;
        C3313y90 c3313y90 = this.a;
        synchronized (this) {
            try {
                int i2 = this.p;
                jG = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z2 && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int iL = l(i3, i2, j, z);
                        if (iL != -1) {
                            jG = g(iL);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c3313y90.b(jG);
    }

    public final void i() {
        long jG;
        C3313y90 c3313y90 = this.a;
        synchronized (this) {
            int i = this.p;
            jG = i == 0 ? -1L : g(i);
        }
        c3313y90.b(jG);
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        AbstractC0397Ej.c(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, p(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        C2613qy c2613qy = this.c;
        SparseArray sparseArray = (SparseArray) c2613qy.n;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((InterfaceC0809Ug) c2613qy.f996o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c2613qy.m = sparseArray.size() > 0 ? Math.min(c2613qy.m, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iR = r(i6 - 1);
        return this.k[iR] + ((long) this.l[iR]);
    }

    public final void k(int i) {
        long j = j(i);
        C3313y90 c3313y90 = this.a;
        AbstractC0397Ej.c(j <= c3313y90.g);
        c3313y90.g = j;
        int i2 = c3313y90.b;
        if (j != 0) {
            C3209x6 c3209x6 = c3313y90.d;
            if (j != c3209x6.l) {
                while (c3313y90.g > c3209x6.m) {
                    c3209x6 = (C3209x6) c3209x6.f1112o;
                }
                C3209x6 c3209x7 = (C3209x6) c3209x6.f1112o;
                c3209x7.getClass();
                c3313y90.a(c3209x7);
                C3209x6 c3209x8 = new C3209x6(i2, c3209x6.m);
                c3209x6.f1112o = c3209x8;
                if (c3313y90.g == c3209x6.m) {
                    c3209x6 = c3209x8;
                }
                c3313y90.f = c3209x6;
                if (c3313y90.e == c3209x7) {
                    c3313y90.e = c3209x8;
                    return;
                }
                return;
            }
        }
        c3313y90.a(c3313y90.d);
        C3209x6 c3209x9 = new C3209x6(i2, c3313y90.g);
        c3313y90.d = c3209x9;
        c3313y90.e = c3209x9;
        c3313y90.f = c3209x9;
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public C0643Nw m(C0643Nw c0643Nw) {
        if (this.F == 0 || c0643Nw.A == Long.MAX_VALUE) {
            return c0643Nw;
        }
        C0617Mw c0617MwA = c0643Nw.a();
        c0617MwA.f405o = c0643Nw.A + this.F;
        return c0617MwA.a();
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iR]);
            if ((this.m[iR] & 1) != 0) {
                break;
            }
            iR--;
            if (iR == -1) {
                iR = this.i - 1;
            }
        }
        return jMax;
    }

    public final int q() {
        return this.q + this.s;
    }

    public final int r(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int s(long j, boolean z) {
        int iR = r(this.s);
        if (u() && j >= this.n[iR]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int iL = l(iR, this.p - this.s, j, true);
            if (iL == -1) {
                return 0;
            }
            return iL;
        }
        return 0;
    }

    public final synchronized C0643Nw t() {
        return this.y ? null : this.B;
    }

    public final boolean u() {
        return this.s != this.p;
    }

    public final synchronized boolean v(boolean z) {
        C0643Nw c0643Nw;
        boolean z2 = true;
        if (u()) {
            if (((A90) this.c.s(q())).a != this.g) {
                return true;
            }
            return w(r(this.s));
        }
        if (!z && !this.w && ((c0643Nw = this.B) == null || c0643Nw == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean w(int i) {
        InterfaceC3465zo interfaceC3465zo = this.h;
        return interfaceC3465zo == null || interfaceC3465zo.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.a());
    }

    public final void x() throws C3368yo {
        InterfaceC3465zo interfaceC3465zo = this.h;
        if (interfaceC3465zo == null || interfaceC3465zo.getState() != 1) {
            return;
        }
        C3368yo c3368yoF = this.h.f();
        c3368yoF.getClass();
        throw c3368yoF;
    }

    public final void y(C0643Nw c0643Nw, C2994uv c2994uv) {
        C0643Nw c0643NwA;
        C0643Nw c0643Nw2 = this.g;
        boolean z = c0643Nw2 == null;
        C3271xo c3271xo = z ? null : c0643Nw2.z;
        this.g = c0643Nw;
        C3271xo c3271xo2 = c0643Nw.z;
        InterfaceC0428Fo interfaceC0428Fo = this.d;
        if (interfaceC0428Fo != null) {
            int iO = interfaceC0428Fo.o(c0643Nw);
            C0617Mw c0617MwA = c0643Nw.a();
            c0617MwA.F = iO;
            c0643NwA = c0617MwA.a();
        } else {
            c0643NwA = c0643Nw;
        }
        c2994uv.n = c0643NwA;
        c2994uv.m = this.h;
        if (interfaceC0428Fo == null) {
            return;
        }
        if (z || !Lr0.a(c3271xo, c3271xo2)) {
            InterfaceC3465zo interfaceC3465zo = this.h;
            C0350Co c0350Co = this.e;
            InterfaceC3465zo interfaceC3465zoB = interfaceC0428Fo.B(c0350Co, c0643Nw);
            this.h = interfaceC3465zoB;
            c2994uv.m = interfaceC3465zoB;
            if (interfaceC3465zo != null) {
                interfaceC3465zo.d(c0350Co);
            }
        }
    }

    public final synchronized long z() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return u() ? this.j[r(this.s)] : this.C;
    }
}
