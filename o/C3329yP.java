package o;

import android.util.Pair;

/* JADX INFO: renamed from: o.yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3329yP {
    public final Dj0 a = new Dj0();
    public final Ej0 b = new Ej0();
    public final C0942Zj c;
    public final InterfaceC1274dB d;
    public long e;
    public int f;
    public boolean g;
    public C3038vP h;
    public C3038vP i;
    public C3038vP j;
    public int k;
    public Object l;
    public long m;

    public C3329yP(C0942Zj c0942Zj, Uh0 uh0) {
        this.c = c0942Zj;
        this.d = uh0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[LOOP:0: B:3:0x0017->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[EDGE_INSN: B:40:0x0071->B:29:0x0071 BREAK  A[LOOP:0: B:3:0x0017->B:28:0x0066], SYNTHETIC] */
    public static CP m(Fj0 fj0, Object obj, long j, long j2, Ej0 ej0, Dj0 dj0) {
        fj0.h(obj, dj0);
        fj0.o(dj0.n, ej0);
        int iB = fj0.b(obj);
        Object obj2 = obj;
        while (true) {
            int i = dj0.r.m;
            if (i == 0) {
                break;
            }
            if ((i == 1 && dj0.h(0)) || !dj0.i(dj0.r.p)) {
                break;
            }
            long j3 = 0;
            if (dj0.c(0L) != -1) {
                break;
            }
            if (dj0.f219o == 0) {
                if (iB <= ej0.A) {
                    break;
                    break;
                }
                fj0.g(iB, dj0, true);
                obj2 = dj0.m;
                obj2.getClass();
                iB++;
            } else {
                int i2 = i - (dj0.h(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += dj0.r.a(i3).r;
                }
                if (dj0.f219o > j3) {
                    break;
                }
                if (iB <= ej0.A) {
                    break;
                }
                fj0.g(iB, dj0, true);
                obj2 = dj0.m;
                obj2.getClass();
                iB++;
            }
        }
        fj0.h(obj2, dj0);
        int iC = dj0.c(j);
        return iC == -1 ? new CP(obj2, j2, dj0.b(j)) : new CP(obj2, iC, dj0.f(iC), j2, -1);
    }

    public final C3038vP a() {
        C3038vP c3038vP = this.h;
        if (c3038vP == null) {
            return null;
        }
        if (c3038vP == this.i) {
            this.i = c3038vP.l;
        }
        c3038vP.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            C3038vP c3038vP2 = this.h;
            this.l = c3038vP2.b;
            this.m = c3038vP2.f.a.d;
        }
        this.h = this.h.l;
        k();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        C3038vP c3038vP = this.h;
        AbstractC0397Ej.g(c3038vP);
        this.l = c3038vP.b;
        this.m = c3038vP.f.a.d;
        while (c3038vP != null) {
            c3038vP.f();
            c3038vP = c3038vP.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        k();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00df A[PHI: r18
  0x00df: PHI (r18v2 long) = (r18v1 long), (r18v1 long), (r18v1 long), (r18v4 long) binds: [B:19:0x00a5, B:21:0x00ab, B:35:0x00db, B:36:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    public final C3232xP c(Fj0 fj0, C3038vP c3038vP, long j) {
        C3232xP c3232xP;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        C3232xP c3232xP2 = c3038vP.f;
        int iD = fj0.d(fj0.b(c3232xP2.a.a), this.a, this.b, this.f, this.g);
        if (iD == -1) {
            return null;
        }
        Dj0 dj0 = this.a;
        boolean z = true;
        int i = fj0.g(iD, dj0, true).n;
        Object obj2 = dj0.m;
        obj2.getClass();
        CP cp = c3232xP2.a;
        long j7 = cp.d;
        if (fj0.n(i, this.b, 0L).z == iD) {
            Pair pairK = fj0.k(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairK == null) {
                return null;
            }
            Object obj3 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            C3038vP c3038vP2 = c3038vP.l;
            if (c3038vP2 == null || !c3038vP2.b.equals(obj3)) {
                j6 = this.e;
                this.e = 1 + j6;
            } else {
                j6 = c3038vP2.f.a.d;
            }
            c3232xP = c3232xP2;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
            j4 = j6;
            obj = obj3;
        } else {
            c3232xP = c3232xP2;
            j2 = 0;
            j3 = 0;
            j4 = j7;
            obj = obj2;
        }
        CP cpM = m(fj0, obj, j2, j4, this.b, this.a);
        if (j3 != -9223372036854775807L) {
            long j8 = c3232xP.c;
            if (j8 != -9223372036854775807L) {
                int i2 = fj0.h(cp.a, dj0).r.m;
                int i3 = dj0.r.p;
                if (i2 <= 0 || !dj0.i(i3) || (i2 <= 1 && dj0.d(i3) == Long.MIN_VALUE)) {
                    z = false;
                }
                if (cpM.a() && z) {
                    j5 = j8;
                } else {
                    if (z) {
                        j2 = j8;
                    }
                    j5 = j3;
                }
            } else {
                j5 = j3;
            }
        } else {
            j5 = j3;
        }
        return e(fj0, cpM, j5, j2);
    }

    public final C3232xP d(Fj0 fj0, C3038vP c3038vP, long j) {
        C3232xP c3232xP = c3038vP.f;
        long j2 = (c3038vP.f1072o + c3232xP.e) - j;
        if (c3232xP.g) {
            return c(fj0, c3038vP, j2);
        }
        CP cp = c3232xP.a;
        Object obj = cp.a;
        Dj0 dj0 = this.a;
        fj0.h(obj, dj0);
        boolean zA = cp.a();
        Object obj2 = cp.a;
        if (!zA) {
            int i = cp.e;
            if (i != -1 && dj0.h(i)) {
                return c(fj0, c3038vP, j2);
            }
            int iF = dj0.f(i);
            boolean z = dj0.i(i) && dj0.e(i, iF) == 3;
            if (iF != dj0.r.a(i).m && !z) {
                return f(fj0, cp.a, cp.e, iF, c3232xP.e, cp.d);
            }
            fj0.h(obj2, dj0);
            long jD = dj0.d(i);
            return g(fj0, cp.a, jD == Long.MIN_VALUE ? dj0.f219o : dj0.r.a(i).r + jD, c3232xP.e, cp.d);
        }
        U1 u1 = dj0.r;
        int i2 = cp.b;
        int i3 = u1.a(i2).m;
        if (i3 != -1) {
            int iA = dj0.r.a(i2).a(cp.c);
            if (iA < i3) {
                return f(fj0, cp.a, i2, iA, c3232xP.c, cp.d);
            }
            long jLongValue = c3232xP.c;
            if (jLongValue == -9223372036854775807L) {
                Pair pairK = fj0.k(this.b, dj0, dj0.n, -9223372036854775807L, Math.max(0L, j2));
                if (pairK != null) {
                    jLongValue = ((Long) pairK.second).longValue();
                }
            }
            fj0.h(obj2, dj0);
            int i4 = cp.b;
            long jD2 = dj0.d(i4);
            return g(fj0, cp.a, Math.max(jD2 == Long.MIN_VALUE ? dj0.f219o : dj0.r.a(i4).r + jD2, jLongValue), c3232xP.c, cp.d);
        }
        return null;
    }

    public final C3232xP e(Fj0 fj0, CP cp, long j, long j2) {
        fj0.h(cp.a, this.a);
        if (!cp.a()) {
            return g(fj0, cp.a, j2, j, cp.d);
        }
        return f(fj0, cp.a, cp.b, cp.c, j, cp.d);
    }

    public final C3232xP f(Fj0 fj0, Object obj, int i, int i2, long j, long j2) {
        CP cp = new CP(obj, i, i2, j2, -1);
        Dj0 dj0 = this.a;
        long jA = fj0.h(obj, dj0).a(i, i2);
        long j3 = i2 == dj0.f(i) ? dj0.r.n : 0L;
        return new C3232xP(cp, (jA == -9223372036854775807L || j3 < jA) ? j3 : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, dj0.i(i), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    public final C3232xP g(Fj0 fj0, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long jD;
        long j5;
        long jMax = j;
        Dj0 dj0 = this.a;
        fj0.h(obj, dj0);
        int iB = dj0.b(jMax);
        boolean z3 = iB != -1 && dj0.h(iB);
        if (iB == -1) {
            U1 u1 = dj0.r;
            z2 = u1.m > 0 && dj0.i(u1.p);
        } else {
            if (dj0.i(iB) && dj0.d(iB) == dj0.f219o) {
                T1 t1A = dj0.r.a(iB);
                int i = t1A.m;
                if (i == -1) {
                    z = true;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = false;
                        break;
                    }
                    int i3 = t1A.p[i2];
                    if (i3 == 0 || i3 == 1) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    iB = -1;
                }
            }
        }
        CP cp = new CP(obj, j3, iB);
        boolean z4 = !cp.a() && iB == -1;
        boolean zJ = j(fj0, cp);
        boolean zI = i(fj0, cp, z4);
        boolean z5 = (iB == -1 || !dj0.i(iB) || z3) ? false : true;
        if (iB == -1 || z3) {
            if (z2) {
                jD = dj0.f219o;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = dj0.f219o;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L && jMax >= j5) {
                jMax = Math.max(0L, j5 - ((long) ((zI && z2) ? 0 : 1)));
            }
            return new C3232xP(cp, jMax, j2, j4, j5, z5, z4, zJ, zI);
        }
        jD = dj0.d(iB);
        j4 = jD;
        if (j4 != -9223372036854775807L) {
            j5 = dj0.f219o;
        } else {
            j5 = dj0.f219o;
        }
        if (j5 != -9223372036854775807L) {
            jMax = Math.max(0L, j5 - ((long) ((zI && z2) ? 0 : 1)));
        }
        return new C3232xP(cp, jMax, j2, j4, j5, z5, z4, zJ, zI);
    }

    public final C3232xP h(Fj0 fj0, C3232xP c3232xP) {
        long jA;
        boolean zI;
        CP cp = c3232xP.a;
        boolean zA = cp.a();
        int i = cp.e;
        boolean z = !zA && i == -1;
        boolean zJ = j(fj0, cp);
        boolean zI2 = i(fj0, cp, z);
        Object obj = c3232xP.a.a;
        Dj0 dj0 = this.a;
        fj0.h(obj, dj0);
        long jD = (cp.a() || i == -1) ? -9223372036854775807L : dj0.d(i);
        boolean zA2 = cp.a();
        int i2 = cp.b;
        if (zA2) {
            jA = dj0.a(i2, cp.c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? dj0.f219o : jD;
        }
        if (cp.a()) {
            zI = dj0.i(i2);
        } else {
            zI = i != -1 && dj0.i(i);
        }
        return new C3232xP(cp, c3232xP.b, c3232xP.c, jD, jA, zI, z, zJ, zI2);
    }

    public final boolean i(Fj0 fj0, CP cp, boolean z) {
        int iB = fj0.b(cp.a);
        if (fj0.n(fj0.g(iB, this.a, false).n, this.b, 0L).t) {
            return false;
        }
        return fj0.d(iB, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean j(Fj0 fj0, CP cp) {
        if (!(!cp.a() && cp.e == -1)) {
            return false;
        }
        Object obj = cp.a;
        return fj0.n(fj0.h(obj, this.a).n, this.b, 0L).A == fj0.b(obj);
    }

    public final void k() {
        XE xe = AbstractC0985aF.m;
        WE we = new WE();
        for (C3038vP c3038vP = this.h; c3038vP != null; c3038vP = c3038vP.l) {
            we.a(c3038vP.f.a);
        }
        C3038vP c3038vP2 = this.i;
        ((Uh0) this.d).c(new RunnableC1169c7(this, we, c3038vP2 == null ? null : c3038vP2.f.a, 6));
    }

    public final boolean l(C3038vP c3038vP) {
        boolean z = false;
        AbstractC0397Ej.f(c3038vP != null);
        if (c3038vP.equals(this.j)) {
            return false;
        }
        this.j = c3038vP;
        while (true) {
            c3038vP = c3038vP.l;
            if (c3038vP == null) {
                break;
            }
            if (c3038vP == this.i) {
                this.i = this.h;
                z = true;
            }
            c3038vP.f();
            this.k--;
        }
        C3038vP c3038vP2 = this.j;
        if (c3038vP2.l != null) {
            c3038vP2.b();
            c3038vP2.l = null;
            c3038vP2.c();
        }
        k();
        return z;
    }

    public final CP n(Fj0 fj0, Object obj, long j) {
        long j2;
        int iB;
        Object obj2 = obj;
        Dj0 dj0 = this.a;
        int i = fj0.h(obj2, dj0).n;
        Object obj3 = this.l;
        if (obj3 == null || (iB = fj0.b(obj3)) == -1 || fj0.g(iB, dj0, false).n != i) {
            C3038vP c3038vP = this.h;
            while (true) {
                if (c3038vP == null) {
                    C3038vP c3038vP2 = this.h;
                    while (true) {
                        if (c3038vP2 == null) {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h != null) {
                                break;
                            }
                            this.l = obj2;
                            this.m = j2;
                            break;
                        }
                        int iB2 = fj0.b(c3038vP2.b);
                        if (iB2 != -1 && fj0.g(iB2, dj0, false).n == i) {
                            j2 = c3038vP2.f.a.d;
                            break;
                        }
                        c3038vP2 = c3038vP2.l;
                    }
                } else {
                    if (c3038vP.b.equals(obj2)) {
                        j2 = c3038vP.f.a.d;
                        break;
                    }
                    c3038vP = c3038vP.l;
                }
            }
        } else {
            j2 = this.m;
        }
        long j3 = j2;
        fj0.h(obj2, dj0);
        int i2 = dj0.n;
        Ej0 ej0 = this.b;
        fj0.o(i2, ej0);
        boolean z = false;
        for (int iB3 = fj0.b(obj); iB3 >= ej0.z; iB3--) {
            fj0.g(iB3, dj0, true);
            boolean z2 = dj0.r.m > 0;
            z |= z2;
            if (dj0.c(dj0.f219o) != -1) {
                obj2 = dj0.m;
                obj2.getClass();
            }
            if (z && (!z2 || dj0.f219o != 0)) {
                break;
            }
        }
        return m(fj0, obj2, j, j3, this.b, this.a);
    }

    public final boolean o(Fj0 fj0) {
        C3038vP c3038vP;
        C3038vP c3038vP2 = this.h;
        if (c3038vP2 == null) {
            return true;
        }
        int iB = fj0.b(c3038vP2.b);
        while (true) {
            iB = fj0.d(iB, this.a, this.b, this.f, this.g);
            while (true) {
                c3038vP = c3038vP2.l;
                if (c3038vP == null || c3038vP2.f.g) {
                    break;
                }
                c3038vP2 = c3038vP;
            }
            if (iB == -1 || c3038vP == null || fj0.b(c3038vP.b) != iB) {
                break;
            }
            c3038vP2 = c3038vP;
        }
        boolean zL = l(c3038vP2);
        c3038vP2.f = h(fj0, c3038vP2.f);
        return !zL;
    }

    public final boolean p(Fj0 fj0, long j, long j2) {
        C3232xP c3232xPH;
        C3038vP c3038vP = this.h;
        C3038vP c3038vP2 = null;
        while (c3038vP != null) {
            C3232xP c3232xP = c3038vP.f;
            if (c3038vP2 == null) {
                c3232xPH = h(fj0, c3232xP);
            } else {
                C3232xP c3232xPD = d(fj0, c3038vP2, j);
                if (c3232xPD == null) {
                    return !l(c3038vP2);
                }
                if (c3232xP.b != c3232xPD.b || !c3232xP.a.equals(c3232xPD.a)) {
                    return !l(c3038vP2);
                }
                c3232xPH = c3232xPD;
            }
            c3038vP.f = c3232xPH.a(c3232xP.c);
            long j3 = c3232xP.e;
            if (j3 != -9223372036854775807L) {
                long j4 = c3232xPH.e;
                if (j3 != j4) {
                    c3038vP.h();
                    return (l(c3038vP) || (c3038vP == this.i && !c3038vP.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c3038vP.f1072o + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c3038vP.f1072o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c3038vP2 = c3038vP;
            c3038vP = c3038vP.l;
        }
        return true;
    }
}
