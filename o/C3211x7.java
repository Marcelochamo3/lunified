package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3211x7 implements InterfaceC0302As {
    public int c;
    public C3308y7 e;
    public long h;
    public C2958ud i;
    public int m;
    public boolean n;
    public final C2562qX a = new C2562qX(12);
    public final C2712s0 b = new C2712s0();
    public InterfaceC0354Cs d = new C0622Nb(13);
    public C2958ud[] g = new C2958ud[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (C2958ud c2958ud : this.g) {
            if (c2958ud.j == 0) {
                c2958ud.h = 0;
            } else {
                c2958ud.h = c2958ud.l[Lr0.f(c2958ud.k, j, true)];
            }
        }
        if (j != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C2562qX c2562qX = this.a;
        ((C0554Kk) interfaceC0328Bs).x(c2562qX.a, 0, 12, false);
        c2562qX.F(0);
        if (c2562qX.i() != 1179011410) {
            return false;
        }
        c2562qX.G(4);
        return c2562qX.i() == 541677121;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.c = 0;
        this.d = interfaceC0354Cs;
        this.h = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0372  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        boolean z;
        C2958ud c2958ud;
        long j;
        C2958ud c2958ud2;
        int i;
        long j2 = this.h;
        if (j2 != -1) {
            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
            long j3 = c0554Kk.f369o;
            if (j2 < j3 || j2 > 262144 + j3) {
                c2800sv.a = j2;
                z = true;
            } else {
                c0554Kk.q((int) (j2 - j3));
                z = false;
            }
        } else {
            z = false;
        }
        this.h = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.c;
        C2958ud c2958ud3 = null;
        int i3 = 2;
        C2712s0 c2712s0 = this.b;
        C2562qX c2562qX = this.a;
        switch (i2) {
            case 0:
                if (!e(interfaceC0328Bs)) {
                    throw C2949uX.a("AVI Header List not found", null);
                }
                ((C0554Kk) interfaceC0328Bs).q(12);
                this.c = 1;
                return 0;
            case 1:
                ((C0554Kk) interfaceC0328Bs).a(c2562qX.a, 0, 12, false);
                c2562qX.F(0);
                c2712s0.getClass();
                c2712s0.a = c2562qX.i();
                c2712s0.b = c2562qX.i();
                c2712s0.c = 0;
                if (c2712s0.a != 1414744396) {
                    throw C2949uX.a("LIST expected, found: " + c2712s0.a, null);
                }
                int i4 = c2562qX.i();
                c2712s0.c = i4;
                if (i4 == 1819436136) {
                    this.j = c2712s0.b;
                    this.c = 2;
                    return 0;
                }
                throw C2949uX.a("hdrl expected, found: " + c2712s0.c, null);
            case 2:
                int i5 = this.j - 4;
                C2562qX c2562qX2 = new C2562qX(i5);
                ((C0554Kk) interfaceC0328Bs).a(c2562qX2.a, 0, i5, false);
                AK akB = AK.b(1819436136, c2562qX2);
                int i6 = akB.b;
                if (i6 != 1819436136) {
                    throw C2949uX.a("Unexpected header list type " + i6, null);
                }
                C3308y7 c3308y7 = (C3308y7) akB.a(C3308y7.class);
                if (c3308y7 == null) {
                    throw C2949uX.a("AviHeader not found", null);
                }
                this.e = c3308y7;
                this.f = ((long) c3308y7.c) * ((long) c3308y7.a);
                ArrayList arrayList = new ArrayList();
                XE xeListIterator = akB.a.listIterator(0);
                int i7 = 0;
                while (xeListIterator.hasNext()) {
                    InterfaceC3017v7 interfaceC3017v7 = (InterfaceC3017v7) xeListIterator.next();
                    if (interfaceC3017v7.getType() == 1819440243) {
                        AK ak = (AK) interfaceC3017v7;
                        int i8 = i7 + 1;
                        C3405z7 c3405z7 = (C3405z7) ak.a(C3405z7.class);
                        Ag0 ag0 = (Ag0) ak.a(Ag0.class);
                        if (c3405z7 == null || ag0 == null) {
                            AP.z();
                        } else {
                            long jR = Lr0.R(c3405z7.d, ((long) c3405z7.b) * 1000000, c3405z7.c);
                            C0643Nw c0643Nw = ag0.a;
                            C0617Mw c0617MwA = c0643Nw.a();
                            c0617MwA.a = Integer.toString(i7);
                            int i9 = c3405z7.e;
                            if (i9 != 0) {
                                c0617MwA.l = i9;
                            }
                            Eg0 eg0 = (Eg0) ak.a(Eg0.class);
                            if (eg0 != null) {
                                c0617MwA.b = eg0.a;
                            }
                            int i10 = IQ.i(c0643Nw.w);
                            if (i10 == 1 || i10 == i3) {
                                InterfaceC1324dm0 interfaceC1324dm0S = this.d.s(i7, i10);
                                interfaceC1324dm0S.a(new C0643Nw(c0617MwA));
                                c2958ud = new C2958ud(i7, i10, jR, c3405z7.d, interfaceC1324dm0S);
                                this.f = jR;
                            }
                            if (c2958ud != null) {
                                arrayList.add(c2958ud);
                            }
                            i7 = i8;
                        }
                        c2958ud = null;
                        if (c2958ud != null) {
                            arrayList.add(c2958ud);
                        }
                        i7 = i8;
                    }
                    i3 = 2;
                }
                this.g = (C2958ud[]) arrayList.toArray(new C2958ud[0]);
                this.d.f();
                this.c = 3;
                return 0;
            case 3:
                long j4 = this.k;
                if (j4 != -1 && ((C0554Kk) interfaceC0328Bs).f369o != j4) {
                    this.h = j4;
                    return 0;
                }
                C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
                c0554Kk2.x(c2562qX.a, 0, 12, false);
                c0554Kk2.q = 0;
                c2562qX.F(0);
                c2712s0.getClass();
                c2712s0.a = c2562qX.i();
                c2712s0.b = c2562qX.i();
                c2712s0.c = 0;
                int i11 = c2562qX.i();
                int i12 = c2712s0.a;
                if (i12 == 1179011410) {
                    c0554Kk2.q(12);
                    return 0;
                }
                if (i12 != 1414744396 || i11 != 1769369453) {
                    this.h = c0554Kk2.f369o + ((long) c2712s0.b) + 8;
                    return 0;
                }
                long j5 = c0554Kk2.f369o;
                this.k = j5;
                this.l = j5 + ((long) c2712s0.b) + 8;
                if (!this.n) {
                    C3308y7 c3308y8 = this.e;
                    c3308y8.getClass();
                    if ((c3308y8.b & 16) == 16) {
                        this.c = 4;
                        this.h = this.l;
                        return 0;
                    }
                    this.d.i(new C3114w7(this.f));
                    this.n = true;
                }
                this.h = c0554Kk2.f369o + 12;
                this.c = 6;
                return 0;
            case 4:
                C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
                c0554Kk3.a(c2562qX.a, 0, 8, false);
                c2562qX.F(0);
                int i13 = c2562qX.i();
                int i14 = c2562qX.i();
                if (i13 != 829973609) {
                    this.h = c0554Kk3.f369o + ((long) i14);
                    return 0;
                }
                this.c = 5;
                this.m = i14;
                return 0;
            case 5:
                C2562qX c2562qX3 = new C2562qX(this.m);
                ((C0554Kk) interfaceC0328Bs).a(c2562qX3.a, 0, this.m, false);
                if (c2562qX3.a() < 16) {
                    j = 0;
                } else {
                    int i15 = c2562qX3.b;
                    c2562qX3.G(8);
                    long jI = c2562qX3.i();
                    long j6 = this.k;
                    j = jI > j6 ? 0L : j6 + 8;
                    c2562qX3.F(i15);
                }
                while (c2562qX3.a() >= 16) {
                    int i16 = c2562qX3.i();
                    int i17 = c2562qX3.i();
                    long jI2 = ((long) c2562qX3.i()) + j;
                    c2562qX3.i();
                    C2958ud[] c2958udArr = this.g;
                    int length = c2958udArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            c2958ud2 = c2958udArr[i18];
                            if (c2958ud2.b != i16 && c2958ud2.c != i16) {
                                i18++;
                            }
                        } else {
                            c2958ud2 = null;
                        }
                    }
                    if (c2958ud2 != null) {
                        if ((i17 & 16) == 16) {
                            if (c2958ud2.j == c2958ud2.l.length) {
                                long[] jArr = c2958ud2.k;
                                c2958ud2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c2958ud2.l;
                                c2958ud2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c2958ud2.k;
                            int i19 = c2958ud2.j;
                            jArr2[i19] = jI2;
                            c2958ud2.l[i19] = c2958ud2.i;
                            i = 1;
                            c2958ud2.j = i19 + 1;
                        } else {
                            i = 1;
                        }
                        c2958ud2.i += i;
                    }
                }
                for (C2958ud c2958ud4 : this.g) {
                    c2958ud4.k = Arrays.copyOf(c2958ud4.k, c2958ud4.j);
                    c2958ud4.l = Arrays.copyOf(c2958ud4.l, c2958ud4.j);
                }
                this.n = true;
                this.d.i(new C3114w7(this, this.f, 0));
                this.c = 6;
                this.h = this.k;
                return 0;
            case 6:
                C0554Kk c0554Kk4 = (C0554Kk) interfaceC0328Bs;
                long j7 = c0554Kk4.f369o;
                if (j7 >= this.l) {
                    return -1;
                }
                C2958ud c2958ud5 = this.i;
                if (c2958ud5 != null) {
                    int i20 = c2958ud5.g;
                    int iB = i20 - c2958ud5.a.b(interfaceC0328Bs, i20, false);
                    c2958ud5.g = iB;
                    boolean z2 = iB == 0;
                    if (z2) {
                        if (c2958ud5.f > 0) {
                            int i21 = c2958ud5.h;
                            c2958ud5.a.d((c2958ud5.d * ((long) i21)) / ((long) c2958ud5.e), Arrays.binarySearch(c2958ud5.l, i21) >= 0 ? 1 : 0, c2958ud5.f, 0, null);
                        }
                        c2958ud5.h++;
                    }
                    if (!z2) {
                        return 0;
                    }
                    this.i = null;
                    return 0;
                }
                if ((j7 & 1) == 1) {
                    c0554Kk4.q(1);
                }
                c0554Kk4.x(c2562qX.a, 0, 12, false);
                c2562qX.F(0);
                int i22 = c2562qX.i();
                if (i22 == 1414744396) {
                    c2562qX.F(8);
                    c0554Kk4.q(c2562qX.i() == 1769369453 ? 12 : 8);
                    c0554Kk4.q = 0;
                    return 0;
                }
                int i23 = c2562qX.i();
                if (i22 == 1263424842) {
                    this.h = c0554Kk4.f369o + ((long) i23) + 8;
                    return 0;
                }
                c0554Kk4.q(8);
                c0554Kk4.q = 0;
                for (C2958ud c2958ud6 : this.g) {
                    if (c2958ud6.b == i22 || c2958ud6.c == i22) {
                        c2958ud3 = c2958ud6;
                        if (c2958ud3 == null) {
                            this.h = c0554Kk4.f369o + ((long) i23);
                            return 0;
                        }
                        c2958ud3.f = i23;
                        c2958ud3.g = i23;
                        this.i = c2958ud3;
                        return 0;
                    }
                }
                if (c2958ud3 == null) {
                    this.h = c0554Kk4.f369o + ((long) i23);
                    return 0;
                }
                c2958ud3.f = i23;
                c2958ud3.g = i23;
                this.i = c2958ud3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
