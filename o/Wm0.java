package o;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Wm0 implements InterfaceC0302As {
    public final int a;
    public final List b;
    public final C2562qX c;
    public final SparseIntArray d;
    public final C1225cm e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final Um0 i;
    public C2607qv j;
    public InterfaceC0354Cs k;
    public int l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f603o;
    public Zm0 p;
    public int q;
    public int r;

    public Wm0(int i, Oj0 oj0, C1225cm c1225cm) {
        this.e = c1225cm;
        this.a = i;
        if (i == 1 || i == 2) {
            this.b = Collections.singletonList(oj0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(oj0);
        }
        this.c = new C2562qX(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new Um0();
        this.k = InterfaceC0354Cs.g;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (Zm0) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new C1595gb0(new Vm0(this)));
        this.p = null;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        C2607qv c2607qv;
        AbstractC0397Ej.f(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Oj0 oj0 = (Oj0) list.get(i);
            boolean z = oj0.d() == -9223372036854775807L;
            if (!z) {
                long jC = oj0.c();
                z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
            }
            if (z) {
                oj0.f(j2);
            }
        }
        if (j2 != 0 && (c2607qv = this.j) != null) {
            c2607qv.d(j2);
        }
        this.c.C(0);
        this.d.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i2 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((Zm0) sparseArray.valueAt(i2)).a();
                i2++;
            }
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        byte[] bArr = this.c.a;
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        c0554Kk.x(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c0554Kk.q(i);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.k = interfaceC0354Cs;
    }

    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX, EOFException, InterruptedIOException {
        long j;
        int i;
        int i2;
        long jZ;
        long j2;
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        boolean z = this.m;
        long j3 = c0554Kk.n;
        int i3 = this.a;
        if (z) {
            Um0 um0 = this.i;
            if (j3 != -1 && i3 != 2 && !um0.d) {
                int i4 = this.r;
                if (i4 <= 0) {
                    um0.a(c0554Kk);
                    return 0;
                }
                boolean z2 = um0.f;
                C2562qX c2562qX = um0.c;
                int i5 = um0.a;
                if (!z2) {
                    int iMin = (int) Math.min(i5, j3);
                    long j4 = j3 - ((long) iMin);
                    if (c0554Kk.f369o == j4) {
                        c2562qX.C(iMin);
                        c0554Kk.q = 0;
                        c0554Kk.x(c2562qX.a, 0, iMin, false);
                        int i6 = c2562qX.b;
                        int i7 = c2562qX.c;
                        for (int i8 = i7 - 188; i8 >= i6; i8--) {
                            byte[] bArr = c2562qX.a;
                            int i9 = 0;
                            for (int i10 = -4; i10 <= 4; i10++) {
                                int i11 = (i10 * 188) + i8;
                                if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                                    i9 = 0;
                                } else {
                                    i9++;
                                    if (i9 == 5) {
                                        long jZ2 = AbstractC3409z9.z(c2562qX, i8, i4);
                                        if (jZ2 == -9223372036854775807L) {
                                            break;
                                        }
                                        j2 = jZ2;
                                        um0.h = j2;
                                        um0.f = true;
                                        return 0;
                                    }
                                }
                            }
                        }
                        j2 = -9223372036854775807L;
                        um0.h = j2;
                        um0.f = true;
                        return 0;
                    }
                    c2800sv.a = j4;
                } else {
                    if (um0.h == -9223372036854775807L) {
                        um0.a(c0554Kk);
                        return 0;
                    }
                    if (um0.e) {
                        long j5 = um0.g;
                        if (j5 == -9223372036854775807L) {
                            um0.a(c0554Kk);
                            return 0;
                        }
                        Oj0 oj0 = um0.b;
                        long jB = oj0.b(um0.h) - oj0.b(j5);
                        um0.i = jB;
                        if (jB < 0) {
                            AP.z();
                            um0.i = -9223372036854775807L;
                        }
                        um0.a(c0554Kk);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(i5, j3);
                    long j6 = 0;
                    if (c0554Kk.f369o == j6) {
                        c2562qX.C(iMin2);
                        c0554Kk.q = 0;
                        c0554Kk.x(c2562qX.a, 0, iMin2, false);
                        int i12 = c2562qX.c;
                        for (int i13 = c2562qX.b; i13 < i12; i13++) {
                            if (c2562qX.a[i13] == 71) {
                                jZ = AbstractC3409z9.z(c2562qX, i13, i4);
                                if (jZ != -9223372036854775807L) {
                                    um0.g = jZ;
                                    um0.e = true;
                                    return 0;
                                }
                            }
                        }
                        jZ = -9223372036854775807L;
                        um0.g = jZ;
                        um0.e = true;
                        return 0;
                    }
                    c2800sv.a = j6;
                }
                return 1;
            }
            if (this.n) {
                j = j3;
            } else {
                this.n = true;
                long j7 = um0.i;
                if (j7 != -9223372036854775807L) {
                    int i14 = this.r;
                    C2691rp c2691rp = new C2691rp(24);
                    Oj0 oj1 = um0.b;
                    C0709Qk c0709Qk = new C0709Qk();
                    c0709Qk.l = i14;
                    c0709Qk.n = oj1;
                    c0709Qk.m = 112800;
                    c0709Qk.f477o = new C2562qX();
                    j = j3;
                    C2607qv c2607qv = new C2607qv(c2691rp, c0709Qk, j7, 1 + j7, 0L, j, 188L, 940);
                    this.j = c2607qv;
                    this.k.i(c2607qv.a);
                } else {
                    j = j3;
                    this.k.i(new C3114w7(j7));
                }
            }
            if (this.f603o) {
                this.f603o = false;
                d(0L, 0L);
                if (c0554Kk.f369o != 0) {
                    c2800sv.a = 0L;
                    return 1;
                }
            }
            C2607qv c2607qv2 = this.j;
            if (c2607qv2 != null && c2607qv2.c != null) {
                return c2607qv2.b(c0554Kk, c2800sv);
            }
        } else {
            i3 = i3;
            j = j3;
        }
        C2562qX c2562qX2 = this.c;
        byte[] bArr2 = c2562qX2.a;
        if (9400 - c2562qX2.b < 188) {
            int iA = c2562qX2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, c2562qX2.b, bArr2, 0, iA);
            }
            c2562qX2.D(iA, bArr2);
        }
        while (c2562qX2.a() < 188) {
            int i15 = c2562qX2.c;
            int iD = c0554Kk.D(bArr2, i15, 9400 - i15);
            if (iD == -1) {
                return -1;
            }
            c2562qX2.E(i15 + iD);
        }
        int i16 = c2562qX2.b;
        int i17 = c2562qX2.c;
        byte[] bArr3 = c2562qX2.a;
        int i18 = i16;
        while (i18 < i17 && bArr3[i18] != 71) {
            i18++;
        }
        c2562qX2.F(i18);
        int i19 = i18 + 188;
        if (i19 > i17) {
            int i20 = (i18 - i16) + this.q;
            this.q = i20;
            i = i3;
            i2 = 2;
            if (i == 2 && i20 > 376) {
                throw C2949uX.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i = i3;
            i2 = 2;
            this.q = 0;
        }
        int i21 = c2562qX2.c;
        if (i19 > i21) {
            return 0;
        }
        int iG = c2562qX2.g();
        if ((8388608 & iG) != 0) {
            c2562qX2.F(i19);
            return 0;
        }
        int i22 = (4194304 & iG) != 0 ? 1 : 0;
        int i23 = (2096896 & iG) >> 8;
        boolean z3 = (iG & 32) != 0;
        Zm0 zm0 = (iG & 16) != 0 ? (Zm0) this.f.get(i23) : null;
        if (zm0 == null) {
            c2562qX2.F(i19);
            return 0;
        }
        if (i != i2) {
            int i24 = iG & 15;
            SparseIntArray sparseIntArray = this.d;
            int i25 = sparseIntArray.get(i23, i24 - 1);
            sparseIntArray.put(i23, i24);
            if (i25 == i24) {
                c2562qX2.F(i19);
                return 0;
            }
            if (i24 != ((i25 + 1) & 15)) {
                zm0.a();
            }
        }
        if (z3) {
            int iU = c2562qX2.u();
            i22 |= (c2562qX2.u() & 64) != 0 ? 2 : 0;
            c2562qX2.G(iU - 1);
        }
        boolean z4 = this.m;
        if (i == i2 || z4 || !this.h.get(i23, false)) {
            c2562qX2.E(i19);
            zm0.b(i22, c2562qX2);
            c2562qX2.E(i21);
        }
        if (i != i2 && !z4 && this.m && j != -1) {
            this.f603o = true;
        }
        c2562qX2.F(i19);
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
