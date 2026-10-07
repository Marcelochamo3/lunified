package o;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: o.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1932jy implements InterfaceC0302As {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C0643Nw I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int a;
    public final List b;
    public final byte[] g;
    public final C2562qX h;
    public final Oj0 i;
    public final InterfaceC1324dm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f860o;
    public int p;
    public long q;
    public int r;
    public C2562qX s;
    public long t;
    public int u;
    public C1834iy y;
    public int z;
    public final C2720s4 j = new C2720s4(26, (byte) 0);
    public final C2562qX k = new C2562qX(16);
    public final C2562qX d = new C2562qX(Ou0.b);
    public final C2562qX e = new C2562qX(5);
    public final C2562qX f = new C2562qX();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray c = new SparseArray();
    public long w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long x = -9223372036854775807L;
    public InterfaceC0354Cs D = InterfaceC0354Cs.g;
    public InterfaceC1324dm0[] E = new InterfaceC1324dm0[0];
    public InterfaceC1324dm0[] F = new InterfaceC1324dm0[0];

    static {
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "application/x-emsg";
        I = c0617Mw.a();
    }

    public C1932jy(int i, Oj0 oj0, List list, InterfaceC1324dm0 interfaceC1324dm0) {
        this.a = i;
        this.i = oj0;
        this.b = Collections.unmodifiableList(list);
        this.n = interfaceC1324dm0;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new C2562qX(bArr);
    }

    public static C3271xo b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C2918u6 c2918u6 = (C2918u6) arrayList.get(i);
            if (c2918u6.m == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c2918u6.n.a;
                C2613qy c2613qyV = AbstractC3021v9.v(bArr);
                UUID uuid = c2613qyV == null ? null : (UUID) c2613qyV.n;
                if (uuid == null) {
                    AP.z();
                } else {
                    arrayList2.add(new C3174wo(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C3271xo(null, false, (C3174wo[]) arrayList2.toArray(new C3174wo[0]));
    }

    public static void c(C2562qX c2562qX, int i, Yl0 yl0) throws C2949uX {
        c2562qX.F(i + 8);
        int iG = c2562qX.g();
        if ((iG & 1) != 0) {
            throw C2949uX.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iG & 2) != 0;
        int iX = c2562qX.x();
        if (iX == 0) {
            Arrays.fill(yl0.l, 0, yl0.e, false);
            return;
        }
        if (iX != yl0.e) {
            StringBuilder sbR = AbstractC1674hK.r("Senc sample count ", iX, " is different from fragment sample count");
            sbR.append(yl0.e);
            throw C2949uX.a(sbR.toString(), null);
        }
        Arrays.fill(yl0.l, 0, iX, z);
        int iA = c2562qX.a();
        C2562qX c2562qX2 = yl0.n;
        c2562qX2.C(iA);
        yl0.k = true;
        yl0.f641o = true;
        c2562qX.e(c2562qX2.a, 0, c2562qX2.c);
        c2562qX2.F(0);
        yl0.f641o = false;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C1834iy) sparseArray.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        this.f860o = 0;
        this.r = 0;
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        return AbstractC1459f50.N(interfaceC0328Bs, true, false);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        int i;
        this.D = interfaceC0354Cs;
        int i2 = 0;
        this.f860o = 0;
        this.r = 0;
        InterfaceC1324dm0[] interfaceC1324dm0Arr = new InterfaceC1324dm0[2];
        this.E = interfaceC1324dm0Arr;
        InterfaceC1324dm0 interfaceC1324dm0 = this.n;
        if (interfaceC1324dm0 != null) {
            interfaceC1324dm0Arr[0] = interfaceC1324dm0;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            interfaceC1324dm0Arr[i] = interfaceC0354Cs.s(100, 5);
            i3 = 101;
            i++;
        }
        InterfaceC1324dm0[] interfaceC1324dm0Arr2 = (InterfaceC1324dm0[]) Lr0.M(i, this.E);
        this.E = interfaceC1324dm0Arr2;
        for (InterfaceC1324dm0 interfaceC1324dm1 : interfaceC1324dm0Arr2) {
            interfaceC1324dm1.a(I);
        }
        List list = this.b;
        this.F = new InterfaceC1324dm0[list.size()];
        while (i2 < this.F.length) {
            InterfaceC1324dm0 interfaceC1324dm0S = this.D.s(i3, 3);
            interfaceC1324dm0S.a((C0643Nw) list.get(i2));
            this.F[i2] = interfaceC1324dm0S;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x039c  */
    /* JADX WARN: Code duplicated, block: B:164:0x03af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x03de  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x0412  */
    /* JADX WARN: Code duplicated, block: B:185:0x041e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0431  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:352:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    public final void g(long j) throws C2949uX {
        C1932jy c1932jy;
        C1932jy c1932jy2;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        C1834iy c1834iy;
        boolean z2;
        boolean z3;
        C1834iy c1834iy2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z4;
        int i8;
        long j2;
        int i9;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        long jR;
        boolean z5;
        long[] jArr2;
        int i10;
        C3265xl c3265xl;
        C3265xl c3265xl2;
        ArrayList arrayList3;
        C1932jy c1932jy3 = this;
        while (true) {
            int i11 = 1;
            ArrayDeque arrayDeque = c1932jy3.l;
            if (arrayDeque.isEmpty() || ((C2821t6) arrayDeque.peek()).n != j) {
                break;
            }
            C2821t6 c2821t6 = (C2821t6) arrayDeque.pop();
            int i12 = c2821t6.m;
            SparseArray sparseArray2 = c1932jy3.c;
            ArrayList arrayList4 = c2821t6.f1040o;
            int i13 = c1932jy3.a;
            int i14 = 12;
            if (i12 == 1836019574) {
                C3271xo c3271xoB = b(arrayList4);
                C2821t6 c2821t6E = c2821t6.E(1836475768);
                c2821t6E.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList5 = c2821t6E.f1040o;
                int size = arrayList5.size();
                long jV = -9223372036854775807L;
                int i15 = 0;
                while (i15 < size) {
                    C2918u6 c2918u6 = (C2918u6) arrayList5.get(i15);
                    int i16 = c2918u6.m;
                    C2562qX c2562qX = c2918u6.n;
                    if (i16 == 1953654136) {
                        c2562qX.F(i14);
                        arrayList3 = arrayList5;
                        Pair pairCreate = Pair.create(Integer.valueOf(c2562qX.g()), new C3265xl(c2562qX.g() - i11, c2562qX.g(), c2562qX.g(), c2562qX.g()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (C3265xl) pairCreate.second);
                    } else {
                        arrayList3 = arrayList5;
                        if (i16 == 1835362404) {
                            c2562qX.F(8);
                            jV = AbstractC3015v6.B(c2562qX.g()) == 0 ? c2562qX.v() : c2562qX.y();
                        }
                    }
                    i15++;
                    arrayList5 = arrayList3;
                    i11 = 1;
                    i14 = 12;
                }
                ArrayList arrayListF = B6.f(c2821t6, new C1642gz(), jV, c3271xoB, (i13 & 16) != 0, false, new C2278nc(16, c1932jy3));
                int size2 = arrayListF.size();
                if (sparseArray2.size() == 0) {
                    for (int i17 = 0; i17 < size2; i17++) {
                        C1421em0 c1421em0 = (C1421em0) arrayListF.get(i17);
                        Wl0 wl0 = c1421em0.a;
                        InterfaceC1324dm0 interfaceC1324dm0S = c1932jy3.D.s(i17, wl0.b);
                        int size3 = sparseArray3.size();
                        int i18 = wl0.a;
                        if (size3 == 1) {
                            c3265xl2 = (C3265xl) sparseArray3.valueAt(0);
                        } else {
                            c3265xl2 = (C3265xl) sparseArray3.get(i18);
                            c3265xl2.getClass();
                        }
                        sparseArray2.put(i18, new C1834iy(interfaceC1324dm0S, c1421em0, c3265xl2));
                        c1932jy3.w = Math.max(c1932jy3.w, wl0.e);
                    }
                    c1932jy3.D.f();
                } else {
                    AbstractC0397Ej.f(sparseArray2.size() == size2);
                    for (int i19 = 0; i19 < size2; i19++) {
                        C1421em0 c1421em1 = (C1421em0) arrayListF.get(i19);
                        Wl0 wl1 = c1421em1.a;
                        C1834iy c1834iy3 = (C1834iy) sparseArray2.get(wl1.a);
                        if (sparseArray3.size() == 1) {
                            c3265xl = (C3265xl) sparseArray3.valueAt(0);
                        } else {
                            c3265xl = (C3265xl) sparseArray3.get(wl1.a);
                            c3265xl.getClass();
                        }
                        c1834iy3.d = c1421em1;
                        c1834iy3.e = c3265xl;
                        c1834iy3.a.a(c1421em1.a.f);
                        c1834iy3.d();
                    }
                }
                c1932jy = c1932jy3;
            } else {
                SparseArray sparseArray4 = sparseArray2;
                if (i12 == 1836019558) {
                    ArrayList arrayList6 = c2821t6.p;
                    int size4 = arrayList6.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        C2821t6 c2821t7 = (C2821t6) arrayList6.get(i20);
                        if (c2821t7.m == 1953653094) {
                            C2918u6 c2918u6F = c2821t7.F(1952868452);
                            c2918u6F.getClass();
                            C2562qX c2562qX2 = c2918u6F.n;
                            c2562qX2.F(8);
                            int iG5 = c2562qX2.g();
                            C1834iy c1834iy4 = (C1834iy) sparseArray4.get(c2562qX2.g());
                            if (c1834iy4 == null) {
                                c1834iy4 = null;
                            } else {
                                int i21 = iG5 & 1;
                                Yl0 yl0 = c1834iy4.b;
                                if (i21 != 0) {
                                    long jY = c2562qX2.y();
                                    yl0.b = jY;
                                    yl0.c = jY;
                                }
                                C3265xl c3265xl3 = c1834iy4.e;
                                yl0.a = new C3265xl((iG5 & 2) != 0 ? c2562qX2.g() - 1 : c3265xl3.a, (iG5 & 8) != 0 ? c2562qX2.g() : c3265xl3.b, (iG5 & 16) != 0 ? c2562qX2.g() : c3265xl3.c, (iG5 & 32) != 0 ? c2562qX2.g() : c3265xl3.d);
                            }
                            if (c1834iy4 != null) {
                                Yl0 yl1 = c1834iy4.b;
                                long j3 = yl1.p;
                                boolean z6 = yl1.q;
                                c1834iy4.d();
                                c1834iy4.l = true;
                                C2918u6 c2918u6F2 = c2821t7.F(1952867444);
                                if (c2918u6F2 == null || (i13 & 2) != 0) {
                                    yl1.p = j3;
                                    yl1.q = z6;
                                } else {
                                    C2562qX c2562qX3 = c2918u6F2.n;
                                    c2562qX3.F(8);
                                    yl1.p = AbstractC3015v6.B(c2562qX3.g()) == 1 ? c2562qX3.y() : c2562qX3.v();
                                    yl1.q = true;
                                }
                                ArrayList arrayList7 = c2821t7.f1040o;
                                int size5 = arrayList7.size();
                                int i22 = 0;
                                int i23 = 0;
                                int i24 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i22 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList8 = arrayList6;
                                    C2918u6 c2918u7 = (C2918u6) arrayList7.get(i22);
                                    int i25 = size4;
                                    if (c2918u7.m == 1953658222) {
                                        C2562qX c2562qX4 = c2918u7.n;
                                        c2562qX4.F(12);
                                        int iX = c2562qX4.x();
                                        if (iX > 0) {
                                            i24 += iX;
                                            i10 = 1;
                                            i23++;
                                        } else {
                                            i10 = 1;
                                        }
                                    } else {
                                        i10 = 1;
                                    }
                                    i22 += i10;
                                    size4 = i25;
                                    arrayList6 = arrayList8;
                                }
                                arrayList = arrayList6;
                                i = size4;
                                c1834iy4.h = 0;
                                c1834iy4.g = 0;
                                c1834iy4.f = 0;
                                yl1.d = i23;
                                yl1.e = i24;
                                if (yl1.g.length < i23) {
                                    yl1.f = new long[i23];
                                    yl1.g = new int[i23];
                                }
                                if (yl1.h.length < i24) {
                                    int i26 = (i24 * Yu0.b.j0) / 100;
                                    yl1.h = new int[i26];
                                    yl1.i = new long[i26];
                                    yl1.j = new boolean[i26];
                                    yl1.l = new boolean[i26];
                                }
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    long j4 = 0;
                                    if (i27 >= size5) {
                                        sparseArray = sparseArray4;
                                        i2 = i20;
                                        C2821t6 c2821t8 = c2821t7;
                                        arrayList2 = arrayList4;
                                        i3 = i13;
                                        Wl0 wl2 = c1834iy4.d.a;
                                        C3265xl c3265xl4 = yl1.a;
                                        c3265xl4.getClass();
                                        Xl0[] xl0Arr = wl2.k;
                                        Xl0 xl0 = xl0Arr == null ? null : xl0Arr[c3265xl4.a];
                                        C2918u6 c2918u6F3 = c2821t8.F(1935763834);
                                        if (c2918u6F3 != null) {
                                            xl0.getClass();
                                            C2562qX c2562qX5 = c2918u6F3.n;
                                            c2562qX5.F(8);
                                            if ((c2562qX5.g() & 1) == 1) {
                                                c2562qX5.G(8);
                                            }
                                            int iU = c2562qX5.u();
                                            int iX2 = c2562qX5.x();
                                            if (iX2 > yl1.e) {
                                                StringBuilder sbR = AbstractC1674hK.r("Saiz sample count ", iX2, " is greater than fragment sample count");
                                                sbR.append(yl1.e);
                                                throw C2949uX.a(sbR.toString(), null);
                                            }
                                            int i30 = xl0.d;
                                            if (iU == 0) {
                                                boolean[] zArr2 = yl1.l;
                                                i5 = 0;
                                                for (int i31 = 0; i31 < iX2; i31++) {
                                                    int iU2 = c2562qX5.u();
                                                    i5 += iU2;
                                                    zArr2[i31] = iU2 > i30;
                                                }
                                                z = false;
                                            } else {
                                                boolean z7 = iU > i30;
                                                i5 = iU * iX2;
                                                z = false;
                                                Arrays.fill(yl1.l, 0, iX2, z7);
                                            }
                                            Arrays.fill(yl1.l, iX2, yl1.e, z);
                                            if (i5 > 0) {
                                                yl1.n.C(i5);
                                                yl1.k = true;
                                                yl1.f641o = true;
                                            }
                                        }
                                        C2918u6 c2918u6F4 = c2821t8.F(1935763823);
                                        if (c2918u6F4 != null) {
                                            C2562qX c2562qX6 = c2918u6F4.n;
                                            c2562qX6.F(8);
                                            int iG6 = c2562qX6.g();
                                            if ((iG6 & 1) == 1) {
                                                c2562qX6.G(8);
                                            }
                                            int iX3 = c2562qX6.x();
                                            if (iX3 != 1) {
                                                throw C2949uX.a("Unexpected saio entry count: " + iX3, null);
                                            }
                                            yl1.c += AbstractC3015v6.B(iG6) == 0 ? c2562qX6.v() : c2562qX6.y();
                                        }
                                        byte[] bArr = null;
                                        C2918u6 c2918u6F5 = c2821t8.F(1936027235);
                                        if (c2918u6F5 != null) {
                                            c(c2918u6F5.n, 0, yl1);
                                        }
                                        String str = xl0 != null ? xl0.b : null;
                                        C2562qX c2562qX7 = null;
                                        C2562qX c2562qX8 = null;
                                        for (int i32 = 0; i32 < arrayList7.size(); i32++) {
                                            C2918u6 c2918u8 = (C2918u6) arrayList7.get(i32);
                                            C2562qX c2562qX9 = c2918u8.n;
                                            int i33 = c2918u8.m;
                                            if (i33 == 1935828848) {
                                                c2562qX9.F(12);
                                                if (c2562qX9.g() == 1936025959) {
                                                    c2562qX8 = c2562qX9;
                                                }
                                            } else if (i33 == 1936158820) {
                                                c2562qX9.F(12);
                                                if (c2562qX9.g() == 1936025959) {
                                                    c2562qX7 = c2562qX9;
                                                }
                                            }
                                        }
                                        if (c2562qX8 != null && c2562qX7 != null) {
                                            c2562qX8.F(8);
                                            int iB = AbstractC3015v6.B(c2562qX8.g());
                                            c2562qX8.G(4);
                                            if (iB == 1) {
                                                c2562qX8.G(4);
                                            }
                                            if (c2562qX8.g() != 1) {
                                                throw C2949uX.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c2562qX7.F(8);
                                            int iB2 = AbstractC3015v6.B(c2562qX7.g());
                                            c2562qX7.G(4);
                                            if (iB2 == 1) {
                                                if (c2562qX7.v() == 0) {
                                                    throw C2949uX.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iB2 >= 2) {
                                                c2562qX7.G(4);
                                            }
                                            if (c2562qX7.v() != 1) {
                                                throw C2949uX.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c2562qX7.G(1);
                                            int iU3 = c2562qX7.u();
                                            int i34 = (iU3 & 240) >> 4;
                                            int i35 = iU3 & 15;
                                            boolean z8 = c2562qX7.u() == 1;
                                            if (z8) {
                                                int iU4 = c2562qX7.u();
                                                byte[] bArr2 = new byte[16];
                                                c2562qX7.e(bArr2, 0, 16);
                                                if (iU4 == 0) {
                                                    int iU5 = c2562qX7.u();
                                                    bArr = new byte[iU5];
                                                    c2562qX7.e(bArr, 0, iU5);
                                                }
                                                yl1.k = true;
                                                yl1.m = new Xl0(z8, str, iU4, bArr2, i34, i35, bArr);
                                            }
                                        }
                                        int size6 = arrayList7.size();
                                        for (int i36 = 0; i36 < size6; i36++) {
                                            C2918u6 c2918u9 = (C2918u6) arrayList7.get(i36);
                                            if (c2918u9.m == 1970628964) {
                                                C2562qX c2562qX10 = c2918u9.n;
                                                c2562qX10.F(8);
                                                byte[] bArr3 = this.g;
                                                c2562qX10.e(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, H)) {
                                                    c(c2562qX10, 16, yl1);
                                                }
                                            }
                                        }
                                        c1932jy2 = this;
                                        break;
                                    }
                                    C2918u6 c2918u10 = (C2918u6) arrayList7.get(i27);
                                    if (c2918u10.m == i4) {
                                        int i37 = i28 + 1;
                                        C2562qX c2562qX11 = c2918u10.n;
                                        c2562qX11.F(8);
                                        int iG7 = c2562qX11.g();
                                        Wl0 wl3 = c1834iy4.d.a;
                                        C3265xl c3265xl5 = yl1.a;
                                        int i38 = Lr0.a;
                                        yl1.g[i28] = c2562qX11.x();
                                        long[] jArr3 = yl1.f;
                                        long j5 = yl1.b;
                                        jArr3[i28] = j5;
                                        if ((iG7 & 1) != 0) {
                                            jArr3[i28] = j5 + ((long) c2562qX11.g());
                                        }
                                        boolean z9 = (iG7 & 4) != 0;
                                        int iG8 = c3265xl5.d;
                                        if (z9) {
                                            iG8 = c2562qX11.g();
                                        }
                                        boolean z10 = (iG7 & 256) != 0;
                                        boolean z11 = (iG7 & 512) != 0;
                                        boolean z12 = (iG7 & 1024) != 0;
                                        boolean z13 = (iG7 & C1672hI.a.g) != 0;
                                        long[] jArr4 = wl3.h;
                                        int i39 = iG8;
                                        if (jArr4 != null) {
                                            i6 = i20;
                                            if (jArr4.length == 1 && (jArr2 = wl3.i) != null) {
                                                long j6 = jArr4[0];
                                                if (j6 == 0) {
                                                    z2 = z12;
                                                    z3 = z13;
                                                    c1834iy2 = c1834iy4;
                                                } else {
                                                    c1834iy2 = c1834iy4;
                                                    long jR2 = Lr0.R(j6 + jArr2[0], 1000000L, wl3.d);
                                                    z2 = z12;
                                                    z3 = z13;
                                                    if (jR2 >= wl3.e) {
                                                    }
                                                }
                                                j4 = jArr2[0];
                                            }
                                            iArr = yl1.h;
                                            jArr = yl1.i;
                                            zArr = yl1.j;
                                            if (wl3.b == 2 || (i13 & 1) == 0) {
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            i8 = i29 + yl1.g[i28];
                                            boolean z14 = z4;
                                            i7 = i13;
                                            j2 = yl1.p;
                                            i9 = i29;
                                            while (i9 < i8) {
                                                if (z10) {
                                                    iG = c2562qX11.g();
                                                } else {
                                                    iG = c3265xl5.b;
                                                }
                                                if (iG >= 0) {
                                                    throw C2949uX.a("Unexpected negative value: " + iG, null);
                                                }
                                                if (z11) {
                                                    iG2 = c2562qX11.g();
                                                } else {
                                                    iG2 = c3265xl5.c;
                                                }
                                                if (iG2 >= 0) {
                                                    throw C2949uX.a("Unexpected negative value: " + iG2, null);
                                                }
                                                if (z2) {
                                                    iG3 = c2562qX11.g();
                                                } else if (i9 == 0 || !z9) {
                                                    iG3 = c3265xl5.d;
                                                } else {
                                                    iG3 = i39;
                                                }
                                                if (z3) {
                                                    iG4 = c2562qX11.g();
                                                } else {
                                                    iG4 = 0;
                                                }
                                                jR = Lr0.R((((long) iG4) + j2) - j4, 1000000L, wl3.c);
                                                jArr[i9] = jR;
                                                if (!yl1.q) {
                                                    jArr[i9] = jR + c1834iy2.d.h;
                                                }
                                                iArr[i9] = iG2;
                                                if (((iG3 >> 16) & 1) == 0 || (z14 && i9 != 0)) {
                                                    z5 = false;
                                                } else {
                                                    z5 = true;
                                                }
                                                zArr[i9] = z5;
                                                j2 += (long) iG;
                                                i9++;
                                                z10 = z10;
                                                i8 = i8;
                                                z11 = z11;
                                                z9 = z9;
                                                c2562qX11 = c2562qX11;
                                                zArr = zArr;
                                                c3265xl5 = c3265xl5;
                                                c1834iy2 = c1834iy2;
                                            }
                                            int i40 = i8;
                                            c1834iy = c1834iy2;
                                            yl1.p = j2;
                                            i28 = i37;
                                            i29 = i40;
                                        } else {
                                            i6 = i20;
                                        }
                                        z2 = z12;
                                        z3 = z13;
                                        c1834iy2 = c1834iy4;
                                        iArr = yl1.h;
                                        jArr = yl1.i;
                                        zArr = yl1.j;
                                        if (wl3.b == 2) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        i8 = i29 + yl1.g[i28];
                                        boolean z15 = z4;
                                        i7 = i13;
                                        j2 = yl1.p;
                                        i9 = i29;
                                        while (i9 < i8) {
                                            if (z10) {
                                                iG = c2562qX11.g();
                                            } else {
                                                iG = c3265xl5.b;
                                            }
                                            if (iG >= 0) {
                                                throw C2949uX.a("Unexpected negative value: " + iG, null);
                                            }
                                            if (z11) {
                                                iG2 = c2562qX11.g();
                                            } else {
                                                iG2 = c3265xl5.c;
                                            }
                                            if (iG2 >= 0) {
                                                throw C2949uX.a("Unexpected negative value: " + iG2, null);
                                            }
                                            if (z2) {
                                                iG3 = c2562qX11.g();
                                            } else if (i9 == 0) {
                                                iG3 = c3265xl5.d;
                                            } else {
                                                iG3 = c3265xl5.d;
                                            }
                                            if (z3) {
                                                iG4 = c2562qX11.g();
                                            } else {
                                                iG4 = 0;
                                            }
                                            jR = Lr0.R((((long) iG4) + j2) - j4, 1000000L, wl3.c);
                                            jArr[i9] = jR;
                                            if (!yl1.q) {
                                                jArr[i9] = jR + c1834iy2.d.h;
                                            }
                                            iArr[i9] = iG2;
                                            if (((iG3 >> 16) & 1) == 0) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            zArr[i9] = z5;
                                            j2 += (long) iG;
                                            i9++;
                                            z10 = z10;
                                            i8 = i8;
                                            z11 = z11;
                                            z9 = z9;
                                            c2562qX11 = c2562qX11;
                                            zArr = zArr;
                                            c3265xl5 = c3265xl5;
                                            c1834iy2 = c1834iy2;
                                        }
                                        int i41 = i8;
                                        c1834iy = c1834iy2;
                                        yl1.p = j2;
                                        i28 = i37;
                                        i29 = i41;
                                    } else {
                                        i6 = i20;
                                        c2821t7 = c2821t7;
                                        arrayList4 = arrayList4;
                                        i7 = i13;
                                        c1834iy = c1834iy4;
                                    }
                                    i27++;
                                    size5 = size5;
                                    sparseArray4 = sparseArray4;
                                    arrayList4 = arrayList4;
                                    c2821t7 = c2821t7;
                                    i20 = i6;
                                    i13 = i7;
                                    c1834iy4 = c1834iy;
                                    i4 = 1953658222;
                                }
                            } else {
                                c1932jy2 = c1932jy3;
                                arrayList = arrayList6;
                                sparseArray = sparseArray4;
                                i = size4;
                                i2 = i20;
                                arrayList2 = arrayList4;
                                i3 = i13;
                            }
                        } else {
                            c1932jy2 = c1932jy3;
                            arrayList = arrayList6;
                            sparseArray = sparseArray4;
                            i = size4;
                            i2 = i20;
                            arrayList2 = arrayList4;
                            i3 = i13;
                        }
                        i20 = i2 + 1;
                        c1932jy3 = c1932jy2;
                        size4 = i;
                        arrayList6 = arrayList;
                        sparseArray4 = sparseArray;
                        arrayList4 = arrayList2;
                        i13 = i3;
                    }
                    c1932jy = c1932jy3;
                    SparseArray sparseArray5 = sparseArray4;
                    C3271xo c3271xoB2 = b(arrayList4);
                    if (c3271xoB2 != null) {
                        int size7 = sparseArray5.size();
                        int i42 = 0;
                        while (i42 < size7) {
                            SparseArray sparseArray6 = sparseArray5;
                            C1834iy c1834iy5 = (C1834iy) sparseArray6.valueAt(i42);
                            Wl0 wl4 = c1834iy5.d.a;
                            C3265xl c3265xl6 = c1834iy5.b.a;
                            int i43 = Lr0.a;
                            int i44 = c3265xl6.a;
                            Xl0[] xl0Arr2 = wl4.k;
                            Xl0 xl1 = xl0Arr2 == null ? null : xl0Arr2[i44];
                            C3271xo c3271xoA = c3271xoB2.a(xl1 != null ? xl1.b : null);
                            C0617Mw c0617MwA = c1834iy5.d.a.f.a();
                            c0617MwA.n = c3271xoA;
                            c1834iy5.a.a(new C0643Nw(c0617MwA));
                            i42++;
                            sparseArray5 = sparseArray6;
                        }
                    }
                    SparseArray sparseArray7 = sparseArray5;
                    if (c1932jy.v != -9223372036854775807L) {
                        int size8 = sparseArray7.size();
                        for (int i45 = 0; i45 < size8; i45++) {
                            C1834iy c1834iy6 = (C1834iy) sparseArray7.valueAt(i45);
                            long j7 = c1932jy.v;
                            int i46 = c1834iy6.f;
                            while (true) {
                                Yl0 yl2 = c1834iy6.b;
                                if (i46 >= yl2.e || yl2.i[i46] > j7) {
                                    break;
                                }
                                if (yl2.j[i46]) {
                                    c1834iy6.i = i46;
                                }
                                i46++;
                            }
                        }
                        c1932jy.v = -9223372036854775807L;
                    }
                } else {
                    c1932jy = c1932jy3;
                    if (!arrayDeque.isEmpty()) {
                        ((C2821t6) arrayDeque.peek()).p.add(c2821t6);
                    }
                }
            }
            c1932jy3 = c1932jy;
        }
        C1932jy c1932jy4 = c1932jy3;
        c1932jy4.f860o = 0;
        c1932jy4.r = 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        ArrayDeque arrayDeque;
        Oj0 oj0;
        C1834iy c1834iy;
        Oj0 oj1;
        int iB;
        int i;
        boolean z;
        long jR;
        String str;
        long j;
        String str2;
        long jV;
        long jA;
        long jY;
        long jY2;
        while (true) {
            int i2 = this.f860o;
            ArrayDeque arrayDeque2 = this.l;
            SparseArray sparseArray = this.c;
            if (i2 != 0) {
                arrayDeque = this.m;
                oj0 = this.i;
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i2 != 2) {
                        c1834iy = this.y;
                        if (c1834iy != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j3 = Long.MAX_VALUE;
                        C1834iy c1834iy2 = null;
                        for (int i3 = 0; i3 < size; i3++) {
                            C1834iy c1834iy3 = (C1834iy) sparseArray.valueAt(i3);
                            boolean z2 = c1834iy3.l;
                            if (z2 || c1834iy3.f != c1834iy3.d.b) {
                                Yl0 yl0 = c1834iy3.b;
                                if (!z2 || c1834iy3.h != yl0.d) {
                                    long j4 = !z2 ? c1834iy3.d.c[c1834iy3.f] : yl0.f[c1834iy3.h];
                                    if (j4 < j3) {
                                        c1834iy2 = c1834iy3;
                                        j3 = j4;
                                    }
                                }
                            }
                        }
                        if (c1834iy2 != null) {
                            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
                            int i4 = (int) ((!c1834iy2.l ? c1834iy2.d.c[c1834iy2.f] : c1834iy2.b.f[c1834iy2.h]) - c0554Kk.f369o);
                            if (i4 < 0) {
                                AP.z();
                                i4 = 0;
                            }
                            c0554Kk.q(i4);
                            this.y = c1834iy2;
                            c1834iy = c1834iy2;
                            break;
                        }
                        C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
                        int i5 = (int) (this.t - c0554Kk2.f369o);
                        if (i5 < 0) {
                            throw C2949uX.a("Offset to end of mdat was negative.", null);
                        }
                        c0554Kk2.q(i5);
                        this.f860o = 0;
                        this.r = 0;
                    } else {
                        int size2 = sparseArray.size();
                        C1834iy c1834iy4 = null;
                        for (int i6 = 0; i6 < size2; i6++) {
                            Yl0 yl1 = ((C1834iy) sparseArray.valueAt(i6)).b;
                            if (yl1.f641o) {
                                long j5 = yl1.c;
                                if (j5 < j2) {
                                    c1834iy4 = (C1834iy) sparseArray.valueAt(i6);
                                    j2 = j5;
                                }
                            }
                        }
                        if (c1834iy4 == null) {
                            this.f860o = 3;
                        } else {
                            C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
                            int i7 = (int) (j2 - c0554Kk3.f369o);
                            if (i7 < 0) {
                                throw C2949uX.a("Offset to encryption data was negative.", null);
                            }
                            c0554Kk3.q(i7);
                            Yl0 yl2 = c1834iy4.b;
                            C2562qX c2562qX = yl2.n;
                            c0554Kk3.a(c2562qX.a, 0, c2562qX.c, false);
                            c2562qX.F(0);
                            yl2.f641o = false;
                        }
                    }
                } else {
                    int i8 = ((int) this.q) - this.r;
                    C2562qX c2562qX2 = this.s;
                    if (c2562qX2 != null) {
                        C0554Kk c0554Kk4 = (C0554Kk) interfaceC0328Bs;
                        c0554Kk4.a(c2562qX2.a, 8, i8, false);
                        int i9 = this.p;
                        C2918u6 c2918u6 = new C2918u6(i9, c2562qX2);
                        long j6 = c0554Kk4.f369o;
                        if (!arrayDeque2.isEmpty()) {
                            ((C2821t6) arrayDeque2.peek()).f1040o.add(c2918u6);
                        } else if (i9 == 1936286840) {
                            c2562qX2.F(8);
                            int iB2 = AbstractC3015v6.B(c2562qX2.g());
                            c2562qX2.G(4);
                            long jV2 = c2562qX2.v();
                            if (iB2 == 0) {
                                jY = c2562qX2.v();
                                jY2 = c2562qX2.v();
                            } else {
                                jY = c2562qX2.y();
                                jY2 = c2562qX2.y();
                            }
                            long j7 = jY2 + j6;
                            long jR2 = Lr0.R(jY, 1000000L, jV2);
                            c2562qX2.G(2);
                            int iZ = c2562qX2.z();
                            int[] iArr = new int[iZ];
                            long[] jArr = new long[iZ];
                            long[] jArr2 = new long[iZ];
                            long[] jArr3 = new long[iZ];
                            long j8 = j7;
                            long jR3 = jR2;
                            int i10 = 0;
                            while (i10 < iZ) {
                                int iG = c2562qX2.g();
                                if ((iG & Integer.MIN_VALUE) != 0) {
                                    throw C2949uX.a("Unhandled indirect reference", null);
                                }
                                long jV3 = c2562qX2.v();
                                iArr[i10] = iG & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = jR3;
                                long j9 = jY + jV3;
                                jR3 = Lr0.R(j9, 1000000L, jV2);
                                jArr2[i10] = jR3 - jArr3[i10];
                                c2562qX2.G(4);
                                j8 += (long) iArr[i10];
                                i10++;
                                jY = j9;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jR2), new C2861td(iArr, jArr, jArr2, jArr3));
                            this.x = ((Long) pairCreate.first).longValue();
                            this.D.i((InterfaceC2664rb0) pairCreate.second);
                            this.G = true;
                        } else if (i9 == 1701671783 && this.E.length != 0) {
                            c2562qX2.F(8);
                            int iB3 = AbstractC3015v6.B(c2562qX2.g());
                            long j10 = -9223372036854775807L;
                            if (iB3 == 0) {
                                String strP = c2562qX2.p();
                                strP.getClass();
                                String strP2 = c2562qX2.p();
                                strP2.getClass();
                                long jV4 = c2562qX2.v();
                                long jR4 = Lr0.R(c2562qX2.v(), 1000000L, jV4);
                                long j11 = this.x;
                                long j12 = j11 != -9223372036854775807L ? j11 + jR4 : -9223372036854775807L;
                                jR = Lr0.R(c2562qX2.v(), 1000L, jV4);
                                str = strP;
                                j = jR4;
                                str2 = strP2;
                                jV = c2562qX2.v();
                                jA = j12;
                            } else if (iB3 != 1) {
                                AP.z();
                            } else {
                                long jV5 = c2562qX2.v();
                                jA = Lr0.R(c2562qX2.y(), 1000000L, jV5);
                                long jR5 = Lr0.R(c2562qX2.v(), 1000L, jV5);
                                long jV6 = c2562qX2.v();
                                String strP3 = c2562qX2.p();
                                strP3.getClass();
                                String strP4 = c2562qX2.p();
                                strP4.getClass();
                                jR = jR5;
                                str = strP3;
                                j = -9223372036854775807L;
                                str2 = strP4;
                                jV = jV6;
                            }
                            byte[] bArr = new byte[c2562qX2.a()];
                            c2562qX2.e(bArr, 0, c2562qX2.a());
                            C2562qX c2562qX3 = new C2562qX(this.j.X(new C2016kr(jR, str, str2, bArr, jV)));
                            int iA = c2562qX3.a();
                            InterfaceC1324dm0[] interfaceC1324dm0Arr = this.E;
                            int length = interfaceC1324dm0Arr.length;
                            int i11 = 0;
                            while (i11 < length) {
                                InterfaceC1324dm0 interfaceC1324dm0 = interfaceC1324dm0Arr[i11];
                                c2562qX3.F(0);
                                interfaceC1324dm0.e(iA, c2562qX3);
                                i11++;
                                j10 = -9223372036854775807L;
                            }
                            if (jA == j10) {
                                arrayDeque.addLast(new C1738hy(iA, j, true));
                                this.u += iA;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new C1738hy(iA, jA, false));
                                this.u += iA;
                            } else if (oj0 == null || oj0.e()) {
                                if (oj0 != null) {
                                    jA = oj0.a(jA);
                                }
                                for (InterfaceC1324dm0 interfaceC1324dm1 : this.E) {
                                    interfaceC1324dm1.d(jA, 1, iA, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new C1738hy(iA, jA, false));
                                this.u += iA;
                            }
                        }
                    } else {
                        ((C0554Kk) interfaceC0328Bs).q(i8);
                    }
                    g(((C0554Kk) interfaceC0328Bs).f369o);
                }
            } else {
                int i12 = this.r;
                C2562qX c2562qX4 = this.k;
                if (i12 == 0) {
                    if (!((C0554Kk) interfaceC0328Bs).a(c2562qX4.a, 0, 8, true)) {
                        return -1;
                    }
                    this.r = 8;
                    c2562qX4.F(0);
                    this.q = c2562qX4.v();
                    this.p = c2562qX4.g();
                }
                long j13 = this.q;
                if (j13 == 1) {
                    ((C0554Kk) interfaceC0328Bs).a(c2562qX4.a, 8, 8, false);
                    this.r += 8;
                    this.q = c2562qX4.y();
                } else if (j13 == 0) {
                    C0554Kk c0554Kk5 = (C0554Kk) interfaceC0328Bs;
                    long j14 = c0554Kk5.n;
                    if (j14 == -1 && !arrayDeque2.isEmpty()) {
                        j14 = ((C2821t6) arrayDeque2.peek()).n;
                    }
                    if (j14 != -1) {
                        this.q = (j14 - c0554Kk5.f369o) + ((long) this.r);
                    }
                }
                long j15 = this.q;
                int i13 = this.r;
                if (j15 < i13) {
                    throw C2949uX.c("Atom size less than header length (unsupported).");
                }
                C0554Kk c0554Kk6 = (C0554Kk) interfaceC0328Bs;
                long j16 = c0554Kk6.f369o - ((long) i13);
                int i14 = this.p;
                if ((i14 == 1836019558 || i14 == 1835295092) && !this.G) {
                    this.D.i(new C3114w7(this.w, j16));
                    this.G = true;
                }
                if (this.p == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        Yl0 yl3 = ((C1834iy) sparseArray.valueAt(i15)).b;
                        yl3.getClass();
                        yl3.c = j16;
                        yl3.b = j16;
                    }
                }
                int i16 = this.p;
                if (i16 == 1835295092) {
                    this.y = null;
                    this.t = j16 + this.q;
                    this.f860o = 2;
                } else if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1836019558 || i16 == 1953653094 || i16 == 1836475768 || i16 == 1701082227) {
                    long j17 = (c0554Kk6.f369o + this.q) - 8;
                    arrayDeque2.push(new C2821t6(i16, j17));
                    if (this.q == this.r) {
                        g(j17);
                    } else {
                        this.f860o = 0;
                        this.r = 0;
                    }
                } else if (i16 == 1751411826 || i16 == 1835296868 || i16 == 1836476516 || i16 == 1936286840 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1668576371 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1937011571 || i16 == 1952867444 || i16 == 1952868452 || i16 == 1953196132 || i16 == 1953654136 || i16 == 1953658222 || i16 == 1886614376 || i16 == 1935763834 || i16 == 1935763823 || i16 == 1936027235 || i16 == 1970628964 || i16 == 1935828848 || i16 == 1936158820 || i16 == 1701606260 || i16 == 1835362404 || i16 == 1701671783) {
                    if (this.r != 8) {
                        throw C2949uX.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.q > C1707hi0.a) {
                        throw C2949uX.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C2562qX c2562qX5 = new C2562qX((int) this.q);
                    System.arraycopy(c2562qX4.a, 0, c2562qX5.a, 0, 8);
                    this.s = c2562qX5;
                    this.f860o = 1;
                } else {
                    if (this.q > C1707hi0.a) {
                        throw C2949uX.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.s = null;
                    this.f860o = 1;
                }
            }
        }
        int i17 = this.f860o;
        Yl0 yl4 = c1834iy.b;
        if (i17 == 3) {
            int i18 = !c1834iy.l ? c1834iy.d.d[c1834iy.f] : yl4.h[c1834iy.f];
            this.z = i18;
            if (c1834iy.f < c1834iy.i) {
                ((C0554Kk) interfaceC0328Bs).q(i18);
                Xl0 xl0A = c1834iy.a();
                if (xl0A != null) {
                    C2562qX c2562qX6 = yl4.n;
                    int i19 = xl0A.d;
                    if (i19 != 0) {
                        c2562qX6.G(i19);
                    }
                    int i20 = c1834iy.f;
                    if (yl4.k && yl4.l[i20]) {
                        c2562qX6.G(c2562qX6.z() * 6);
                    }
                }
                if (!c1834iy.b()) {
                    this.y = null;
                }
                this.f860o = 3;
                return 0;
            }
            if (c1834iy.d.a.g == 1) {
                this.z = i18 - 8;
                ((C0554Kk) interfaceC0328Bs).q(8);
            }
            if ("audio/ac4".equals(c1834iy.d.a.f.w)) {
                this.A = c1834iy.c(this.z, 7);
                int i21 = this.z;
                C2562qX c2562qX7 = this.h;
                AbstractC2506pt.q(i21, c2562qX7);
                c1834iy.a.e(7, c2562qX7);
                this.A += 7;
            } else {
                this.A = c1834iy.c(this.z, 0);
            }
            this.z += this.A;
            this.f860o = 4;
            this.B = 0;
        }
        C1421em0 c1421em0 = c1834iy.d;
        Wl0 wl0 = c1421em0.a;
        long jA2 = c1834iy.l ? yl4.i[c1834iy.f] : c1421em0.f[c1834iy.f];
        if (oj0 != null) {
            jA2 = oj0.a(jA2);
        }
        int i22 = wl0.j;
        InterfaceC1324dm0 interfaceC1324dm2 = c1834iy.a;
        if (i22 == 0) {
            oj1 = oj0;
            while (true) {
                int i23 = this.A;
                int i24 = this.z;
                if (i23 >= i24) {
                    break;
                }
                this.A += interfaceC1324dm2.b(interfaceC0328Bs, i24 - i23, false);
            }
        } else {
            C2562qX c2562qX8 = this.e;
            byte[] bArr2 = c2562qX8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i25 = i22 + 1;
            int i26 = 4 - i22;
            while (this.A < this.z) {
                int i27 = this.B;
                Oj0 oj2 = oj0;
                C0643Nw c0643Nw = wl0.f;
                if (i27 == 0) {
                    Wl0 wl1 = wl0;
                    ((C0554Kk) interfaceC0328Bs).a(bArr2, i26, i25, false);
                    c2562qX8.F(0);
                    int iG2 = c2562qX8.g();
                    if (iG2 < 1) {
                        throw C2949uX.a("Invalid NAL length", null);
                    }
                    this.B = iG2 - 1;
                    C2562qX c2562qX9 = this.d;
                    c2562qX9.F(0);
                    interfaceC1324dm2.e(4, c2562qX9);
                    interfaceC1324dm2.e(1, c2562qX8);
                    if (this.F.length > 0) {
                        String str3 = c0643Nw.w;
                        int i28 = bArr2[4];
                        if ("video/avc".equals(str3)) {
                            i = i25;
                            if ((i28 & 31) != 6) {
                            }
                            z = true;
                            this.C = z;
                            this.A += 5;
                            this.z += i26;
                            wl0 = wl1;
                            i25 = i;
                        } else {
                            i = i25;
                        }
                        if ("video/hevc".equals(str3) && ((i28 & 126) >> 1) == 39) {
                            z = true;
                        }
                        this.C = z;
                        this.A += 5;
                        this.z += i26;
                        wl0 = wl1;
                        i25 = i;
                    } else {
                        i = i25;
                    }
                    z = false;
                    this.C = z;
                    this.A += 5;
                    this.z += i26;
                    wl0 = wl1;
                    i25 = i;
                } else {
                    Wl0 wl2 = wl0;
                    int i29 = i25;
                    if (this.C) {
                        C2562qX c2562qX10 = this.f;
                        c2562qX10.C(i27);
                        ((C0554Kk) interfaceC0328Bs).a(c2562qX10.a, 0, this.B, false);
                        interfaceC1324dm2.e(this.B, c2562qX10);
                        iB = this.B;
                        int iH = Ou0.H(c2562qX10.c, c2562qX10.a);
                        c2562qX10.F("video/hevc".equals(c0643Nw.w) ? 1 : 0);
                        c2562qX10.E(iH);
                        Sr0.c(jA2, c2562qX10, this.F);
                    } else {
                        iB = interfaceC1324dm2.b(interfaceC0328Bs, i27, false);
                    }
                    this.A += iB;
                    this.B -= iB;
                    wl0 = wl2;
                    i25 = i29;
                    i26 = i26;
                    c2562qX8 = c2562qX8;
                }
                oj0 = oj2;
            }
            oj1 = oj0;
        }
        int i30 = c1834iy.l ? yl4.j[c1834iy.f] ? 1 : 0 : c1834iy.d.g[c1834iy.f];
        int i31 = c1834iy.a() != null ? 1073741824 | i30 : i30;
        Xl0 xl0A2 = c1834iy.a();
        interfaceC1324dm2.d(jA2, i31, this.z, 0, xl0A2 != null ? xl0A2.c : null);
        while (!arrayDeque.isEmpty()) {
            C1738hy c1738hy = (C1738hy) arrayDeque.removeFirst();
            this.u -= c1738hy.c;
            boolean z3 = c1738hy.b;
            long jA3 = c1738hy.a;
            if (z3) {
                jA3 += jA2;
            }
            Oj0 oj3 = oj1;
            if (oj1 != null) {
                jA3 = oj3.a(jA3);
            }
            for (InterfaceC1324dm0 interfaceC1324dm3 : this.E) {
                interfaceC1324dm3.d(jA3, 1, c1738hy.c, this.u, null);
            }
            oj1 = oj3;
        }
        if (!c1834iy.b()) {
            this.y = null;
        }
        this.f860o = 3;
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
