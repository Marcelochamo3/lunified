package o;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757Sg extends C0731Rg {
    public int A0;
    public C3247xc[] B0;
    public C3247xc[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final C3213x8 L0;
    public ArrayList q0 = new ArrayList();
    public final Na0 r0 = new Na0(this);
    public final C2298nm s0;
    public int t0;
    public K30 u0;
    public boolean v0;
    public final C2742sK w0;
    public int x0;
    public int y0;
    public int z0;

    public C0757Sg() {
        C2298nm c2298nm = new C2298nm();
        c2298nm.b = true;
        c2298nm.c = true;
        c2298nm.e = new ArrayList();
        new ArrayList();
        c2298nm.f = null;
        c2298nm.g = new C3213x8();
        c2298nm.h = new ArrayList();
        c2298nm.a = this;
        c2298nm.d = this;
        this.s0 = c2298nm;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new C2742sK();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new C3247xc[4];
        this.C0 = new C3247xc[4];
        this.D0 = C3080vp0.F0;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new C3213x8();
    }

    public static void V(C0731Rg c0731Rg, K30 k30, C3213x8 c3213x8) {
        int i;
        int i2;
        if (k30 == null) {
            return;
        }
        if (c0731Rg.g0 == 8 || (c0731Rg instanceof HA) || (c0731Rg instanceof O7)) {
            c3213x8.e = 0;
            c3213x8.f = 0;
            return;
        }
        int[] iArr = c0731Rg.p0;
        c3213x8.a = iArr[0];
        c3213x8.b = iArr[1];
        c3213x8.c = c0731Rg.q();
        c3213x8.d = c0731Rg.k();
        c3213x8.i = false;
        c3213x8.j = 0;
        boolean z = c3213x8.a == 3;
        boolean z2 = c3213x8.b == 3;
        boolean z3 = z && c0731Rg.W > 0.0f;
        boolean z4 = z2 && c0731Rg.W > 0.0f;
        if (z && c0731Rg.t(0) && c0731Rg.r == 0 && !z3) {
            c3213x8.a = 2;
            if (z2 && c0731Rg.s == 0) {
                c3213x8.a = 1;
            }
            z = false;
        }
        if (z2 && c0731Rg.t(1) && c0731Rg.s == 0 && !z4) {
            c3213x8.b = 2;
            if (z && c0731Rg.r == 0) {
                c3213x8.b = 1;
            }
            z2 = false;
        }
        if (c0731Rg.A()) {
            c3213x8.a = 1;
            z = false;
        }
        if (c0731Rg.B()) {
            c3213x8.b = 1;
            z2 = false;
        }
        int[] iArr2 = c0731Rg.t;
        if (z3) {
            if (iArr2[0] == 4) {
                c3213x8.a = 1;
            } else if (!z2) {
                if (c3213x8.b == 1) {
                    i2 = c3213x8.d;
                } else {
                    c3213x8.a = 2;
                    k30.d(c0731Rg, c3213x8);
                    i2 = c3213x8.f;
                }
                c3213x8.a = 1;
                c3213x8.c = (int) (c0731Rg.W * i2);
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                c3213x8.b = 1;
            } else if (!z) {
                if (c3213x8.a == 1) {
                    i = c3213x8.c;
                } else {
                    c3213x8.b = 2;
                    k30.d(c0731Rg, c3213x8);
                    i = c3213x8.e;
                }
                c3213x8.b = 1;
                if (c0731Rg.X == -1) {
                    c3213x8.d = (int) (i / c0731Rg.W);
                } else {
                    c3213x8.d = (int) (c0731Rg.W * i);
                }
            }
        }
        k30.d(c0731Rg, c3213x8);
        c0731Rg.O(c3213x8.e);
        c0731Rg.L(c3213x8.f);
        c0731Rg.E = c3213x8.h;
        c0731Rg.I(c3213x8.g);
        c3213x8.j = 0;
    }

    @Override // o.C0731Rg
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        X();
    }

    @Override // o.C0731Rg
    public final void F(Na0 na0) {
        super.F(na0);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((C0731Rg) this.q0.get(i)).F(na0);
        }
    }

    @Override // o.C0731Rg
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((C0731Rg) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(C0731Rg c0731Rg, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            C3247xc[] c3247xcArr = this.C0;
            if (i2 >= c3247xcArr.length) {
                this.C0 = (C3247xc[]) Arrays.copyOf(c3247xcArr, c3247xcArr.length * 2);
            }
            C3247xc[] c3247xcArr2 = this.C0;
            int i3 = this.z0;
            c3247xcArr2[i3] = new C3247xc(c0731Rg, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            C3247xc[] c3247xcArr3 = this.B0;
            if (i4 >= c3247xcArr3.length) {
                this.B0 = (C3247xc[]) Arrays.copyOf(c3247xcArr3, c3247xcArr3.length * 2);
            }
            C3247xc[] c3247xcArr4 = this.B0;
            int i5 = this.A0;
            c3247xcArr4[i5] = new C3247xc(c0731Rg, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(C2742sK c2742sK) {
        boolean zW = W(64);
        b(c2742sK, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0731Rg c0731Rg = (C0731Rg) this.q0.get(i);
            boolean[] zArr = c0731Rg.S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0731Rg instanceof O7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0731Rg c0731Rg2 = (C0731Rg) this.q0.get(i2);
                if (c0731Rg2 instanceof O7) {
                    O7 o7 = (O7) c0731Rg2;
                    for (int i3 = 0; i3 < o7.r0; i3++) {
                        C0731Rg c0731Rg3 = o7.q0[i3];
                        if (o7.t0 || c0731Rg3.c()) {
                            int i4 = o7.s0;
                            if (i4 == 0 || i4 == 1) {
                                c0731Rg3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0731Rg3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0731Rg c0731Rg4 = (C0731Rg) this.q0.get(i5);
            c0731Rg4.getClass();
            boolean z2 = c0731Rg4 instanceof C1636gw;
            if (z2 || (c0731Rg4 instanceof HA)) {
                if (z2) {
                    hashSet.add(c0731Rg4);
                } else {
                    c0731Rg4.b(c2742sK, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1636gw c1636gw = (C1636gw) ((C0731Rg) it.next());
                for (int i6 = 0; i6 < c1636gw.r0; i6++) {
                    if (hashSet.contains(c1636gw.q0[i6])) {
                        c1636gw.b(c2742sK, zW);
                        hashSet.remove(c1636gw);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0731Rg) it2.next()).b(c2742sK, zW);
                }
                hashSet.clear();
            }
        }
        if (C2742sK.p) {
            HashSet<C0731Rg> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0731Rg c0731Rg5 = (C0731Rg) this.q0.get(i7);
                c0731Rg5.getClass();
                if (!(c0731Rg5 instanceof C1636gw) && !(c0731Rg5 instanceof HA)) {
                    hashSet2.add(c0731Rg5);
                }
            }
            a(this, c2742sK, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            for (C0731Rg c0731Rg6 : hashSet2) {
                zy0.j(this, c2742sK, c0731Rg6);
                c0731Rg6.b(c2742sK, zW);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0731Rg c0731Rg7 = (C0731Rg) this.q0.get(i8);
                if (c0731Rg7 instanceof C0757Sg) {
                    int[] iArr = c0731Rg7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0731Rg7.M(1);
                    }
                    if (i10 == 2) {
                        c0731Rg7.N(1);
                    }
                    c0731Rg7.b(c2742sK, zW);
                    if (i9 == 2) {
                        c0731Rg7.M(i9);
                    }
                    if (i10 == 2) {
                        c0731Rg7.N(i10);
                    }
                } else {
                    zy0.j(this, c2742sK, c0731Rg7);
                    if (!(c0731Rg7 instanceof C1636gw) && !(c0731Rg7 instanceof HA)) {
                        c0731Rg7.b(c2742sK, zW);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            Pu0.b(this, c2742sK, null, 0);
        }
        if (this.A0 > 0) {
            Pu0.b(this, c2742sK, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    public final boolean T(int i, boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        C2298nm c2298nm = this.s0;
        C0757Sg c0757Sg = c2298nm.a;
        int iJ = c0757Sg.j(0);
        int iJ2 = c0757Sg.j(1);
        int iR = c0757Sg.r();
        int iS = c0757Sg.s();
        ArrayList<AbstractC1637gw0> arrayList = c2298nm.e;
        if (z4 && (iJ == 2 || iJ2 == 2)) {
            for (AbstractC1637gw0 abstractC1637gw0 : arrayList) {
                if (abstractC1637gw0.f == i && !abstractC1637gw0.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iJ == 2) {
                    c0757Sg.M(1);
                    c0757Sg.O(c2298nm.d(c0757Sg, 0));
                    c0757Sg.d.e.d(c0757Sg.q());
                }
            } else if (z4 && iJ2 == 2) {
                c0757Sg.N(1);
                c0757Sg.L(c2298nm.d(c0757Sg, 1));
                c0757Sg.e.e.d(c0757Sg.k());
            }
        }
        int[] iArr = c0757Sg.p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iQ = c0757Sg.q() + iR;
                c0757Sg.d.i.d(iQ);
                c0757Sg.d.e.d(iQ - iR);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = c0757Sg.k() + iS;
                c0757Sg.e.i.d(iK);
                c0757Sg.e.e.d(iK - iS);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c2298nm.g();
        for (AbstractC1637gw0 abstractC1637gw1 : arrayList) {
            if (abstractC1637gw1.f == i && (abstractC1637gw1.b != c0757Sg || abstractC1637gw1.g)) {
                abstractC1637gw1.e();
            }
        }
        for (AbstractC1637gw0 abstractC1637gw2 : arrayList) {
            if (abstractC1637gw2.f == i && (z2 || abstractC1637gw2.b != c0757Sg)) {
                if (!abstractC1637gw2.h.j || !abstractC1637gw2.i.j || (!(abstractC1637gw2 instanceof C3344yc) && !abstractC1637gw2.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        c0757Sg.M(iJ);
        c0757Sg.N(iJ2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:349:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:352:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:360:0x0601  */
    /* JADX WARN: Code duplicated, block: B:361:0x0608  */
    /* JADX WARN: Code duplicated, block: B:367:0x061c  */
    /* JADX WARN: Code duplicated, block: B:373:0x0635  */
    /* JADX WARN: Code duplicated, block: B:376:0x063b  */
    /* JADX WARN: Code duplicated, block: B:378:0x0643 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x0651  */
    /* JADX WARN: Code duplicated, block: B:387:0x0661  */
    /* JADX WARN: Code duplicated, block: B:391:0x066c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x067d  */
    /* JADX WARN: Code duplicated, block: B:399:0x0685  */
    /* JADX WARN: Code duplicated, block: B:403:0x068c  */
    /* JADX WARN: Code duplicated, block: B:406:0x0696  */
    /* JADX WARN: Code duplicated, block: B:408:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:412:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c4 A[Catch: Exception -> 0x06d2, LOOP:12: B:414:0x06c2->B:415:0x06c4, LOOP_END, TryCatch #7 {Exception -> 0x06d2, blocks: (B:413:0x06b6, B:415:0x06c4, B:419:0x06d9), top: B:555:0x06b6 }] */
    /* JADX WARN: Code duplicated, block: B:424:0x06e6 A[Catch: Exception -> 0x0711, TRY_LEAVE, TryCatch #9 {Exception -> 0x0711, blocks: (B:422:0x06e0, B:424:0x06e6), top: B:559:0x06e0 }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0715  */
    /* JADX WARN: Code duplicated, block: B:439:0x071b A[Catch: Exception -> 0x0707, TRY_ENTER, TryCatch #3 {Exception -> 0x0707, blocks: (B:428:0x0700, B:439:0x071b, B:441:0x0721, B:444:0x0741, B:446:0x0747, B:450:0x075f), top: B:547:0x0700 }] */
    /* JADX WARN: Code duplicated, block: B:444:0x0741 A[Catch: Exception -> 0x0707, TRY_ENTER, TryCatch #3 {Exception -> 0x0707, blocks: (B:428:0x0700, B:439:0x071b, B:441:0x0721, B:444:0x0741, B:446:0x0747, B:450:0x075f), top: B:547:0x0700 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x076e A[Catch: Exception -> 0x0799, TryCatch #1 {Exception -> 0x0799, blocks: (B:437:0x0717, B:442:0x073d, B:454:0x076a, B:456:0x076e, B:458:0x0774), top: B:543:0x0717 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x079d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:480:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:482:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:484:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:486:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:489:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:491:0x07f7 A[LOOP:15: B:490:0x07f5->B:491:0x07f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x0817 A[LOOP:14: B:499:0x0815->B:500:0x0817, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x084b  */
    /* JADX WARN: Code duplicated, block: B:507:0x085d  */
    /* JADX WARN: Code duplicated, block: B:512:0x087d  */
    /* JADX WARN: Code duplicated, block: B:513:0x0889  */
    /* JADX WARN: Code duplicated, block: B:516:0x089c  */
    /* JADX WARN: Code duplicated, block: B:517:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:519:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:521:0x08af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x08c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:534:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:538:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:559:0x06e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:611:0x08e5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void U() {
        int i;
        Object[] objArr;
        Object obj;
        int i2;
        int i3;
        C0394Eg c0394Eg;
        int i4;
        C2742sK c2742sK;
        int i5;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i6;
        int i7;
        boolean zW;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        int i9;
        boolean z7;
        boolean[] zArr;
        int i10;
        boolean z8;
        int iMax;
        ?? r6;
        boolean z9;
        int iMax2;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i13;
        C0731Rg c0731Rg;
        int i14;
        WeakReference weakReference;
        C0394Eg c0394Eg2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        Object obj2;
        C0731Rg c0731Rg2;
        int i15;
        int i16;
        int i17;
        char c2;
        C1539fw0 c1539fw0;
        C1539fw0 c1539fw1;
        int i18;
        int iQ;
        int i19;
        int iK;
        int i20;
        int iB;
        C1539fw0 c1539fw2;
        C1539fw0 c1539fw3;
        int[] iArr;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size2 = this.q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr2 = this.p0;
        int i21 = iArr2[1];
        int i22 = iArr2[0];
        int i23 = this.t0;
        C0394Eg c0394Eg3 = this.J;
        C0394Eg c0394Eg4 = this.I;
        if (i23 == 0 && zy0.s(this.D0, 1)) {
            K30 k30 = this.u0;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            E();
            ArrayList arrayList = this.q0;
            int size3 = arrayList.size();
            for (int i26 = 0; i26 < size3; i26++) {
                ((C0731Rg) arrayList.get(i26)).E();
            }
            boolean z12 = this.v0;
            if (i24 == 1) {
                J(0, q());
            } else {
                c0394Eg4.l(0);
                this.Y = 0;
            }
            int i27 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i27 < size3) {
                C0394Eg c0394Eg5 = c0394Eg4;
                C0731Rg c0731Rg3 = (C0731Rg) arrayList.get(i27);
                int i28 = iMax8;
                if (c0731Rg3 instanceof HA) {
                    HA ha = (HA) c0731Rg3;
                    iArr = iArr2;
                    if (ha.u0 == 1) {
                        int i29 = ha.r0;
                        if (i29 != -1) {
                            ha.R(i29);
                        } else if (ha.s0 != -1 && A()) {
                            ha.R(q() - ha.s0);
                        } else if (A()) {
                            ha.R((int) ((ha.q0 * q()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0731Rg3 instanceof O7) && ((O7) c0731Rg3).U() == 0) {
                        z14 = true;
                    }
                }
                i27++;
                iMax8 = i28;
                c0394Eg4 = c0394Eg5;
                iArr2 = iArr;
            }
            i = iMax8;
            objArr = iArr2;
            obj = c0394Eg4;
            if (z13) {
                for (int i30 = 0; i30 < size3; i30++) {
                    C0731Rg c0731Rg4 = (C0731Rg) arrayList.get(i30);
                    if (c0731Rg4 instanceof HA) {
                        HA ha2 = (HA) c0731Rg4;
                        if (ha2.u0 == 1) {
                            Ou0.o(0, ha2, k30, z12);
                        }
                    }
                }
            }
            Ou0.o(0, this, k30, z12);
            if (z14) {
                for (int i31 = 0; i31 < size3; i31++) {
                    C0731Rg c0731Rg5 = (C0731Rg) arrayList.get(i31);
                    if (c0731Rg5 instanceof O7) {
                        O7 o7 = (O7) c0731Rg5;
                        if (o7.U() == 0 && o7.T()) {
                            Ou0.o(1, o7, k30, z12);
                        }
                    }
                }
            }
            if (i25 == 1) {
                K(0, k());
            } else {
                c0394Eg3.l(0);
                this.Z = 0;
            }
            boolean z15 = false;
            boolean z16 = false;
            for (int i32 = 0; i32 < size3; i32++) {
                C0731Rg c0731Rg6 = (C0731Rg) arrayList.get(i32);
                if (c0731Rg6 instanceof HA) {
                    HA ha3 = (HA) c0731Rg6;
                    if (ha3.u0 == 0) {
                        int i33 = ha3.r0;
                        if (i33 != -1) {
                            ha3.R(i33);
                        } else if (ha3.s0 != -1 && B()) {
                            ha3.R(k() - ha3.s0);
                        } else if (B()) {
                            ha3.R((int) ((ha3.q0 * k()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((c0731Rg6 instanceof O7) && ((O7) c0731Rg6).U() == 1) {
                    z16 = true;
                }
            }
            if (z15) {
                for (int i34 = 0; i34 < size3; i34++) {
                    C0731Rg c0731Rg7 = (C0731Rg) arrayList.get(i34);
                    if (c0731Rg7 instanceof HA) {
                        HA ha4 = (HA) c0731Rg7;
                        if (ha4.u0 == 0) {
                            Ou0.J(1, ha4, k30);
                        }
                    }
                }
            }
            Ou0.J(0, this, k30);
            if (z16) {
                for (int i35 = 0; i35 < size3; i35++) {
                    C0731Rg c0731Rg8 = (C0731Rg) arrayList.get(i35);
                    if (c0731Rg8 instanceof O7) {
                        O7 o8 = (O7) c0731Rg8;
                        if (o8.U() == 1 && o8.T()) {
                            Ou0.J(1, o8, k30);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size3; i36++) {
                C0731Rg c0731Rg9 = (C0731Rg) arrayList.get(i36);
                if (c0731Rg9.z() && Ou0.b(c0731Rg9)) {
                    V(c0731Rg9, k30, Ou0.a);
                    if (!(c0731Rg9 instanceof HA)) {
                        Ou0.o(0, c0731Rg9, k30, z12);
                        Ou0.J(0, c0731Rg9, k30);
                    } else if (((HA) c0731Rg9).u0 == 0) {
                        Ou0.J(0, c0731Rg9, k30);
                    } else {
                        Ou0.o(0, c0731Rg9, k30, z12);
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                C0731Rg c0731Rg10 = (C0731Rg) this.q0.get(i37);
                if (c0731Rg10.z() && !(c0731Rg10 instanceof HA) && !(c0731Rg10 instanceof O7) && !(c0731Rg10 instanceof C1636gw) && !c0731Rg10.F) {
                    int iJ = c0731Rg10.j(0);
                    int iJ2 = c0731Rg10.j(1);
                    if (iJ != 3 || c0731Rg10.r == 1 || iJ2 != 3 || c0731Rg10.s == 1) {
                        V(c0731Rg10, this.u0, new C3213x8());
                    }
                }
            }
        } else {
            i = iMax8;
            objArr = iArr2;
            obj = c0394Eg4;
        }
        C2742sK c2742sK2 = this.w0;
        if (size2 <= 2 || !((i22 == 2 || i21 == 2) && zy0.s(this.D0, 1024))) {
            i2 = size2;
            i3 = i21;
            c0394Eg = c0394Eg3;
            i4 = iMax7;
            c2742sK = c2742sK2;
            i5 = i22;
        } else {
            K30 k31 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size4 = arrayList2.size();
            int i38 = 0;
            while (true) {
                if (i38 < size4) {
                    C0731Rg c0731Rg11 = (C0731Rg) arrayList2.get(i38);
                    byte b = objArr[0];
                    byte b2 = objArr[1];
                    int[] iArr3 = c0731Rg11.p0;
                    c0394Eg = c0394Eg3;
                    if (AbstractC0397Ej.N(b, b2, iArr3[0], iArr3[1]) && !(c0731Rg11 instanceof C1636gw)) {
                        i38++;
                        c0394Eg3 = c0394Eg;
                    } else {
                        i15 = iMax7;
                        i2 = size2;
                        i16 = i21;
                        i17 = i22;
                        c2742sK = c2742sK2;
                    }
                } else {
                    c0394Eg = c0394Eg3;
                    int i39 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList<AbstractC2636rB> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<AbstractC2636rB> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i39 < size4) {
                        int i40 = size2;
                        C0731Rg c0731Rg12 = (C0731Rg) arrayList2.get(i39);
                        int i41 = i21;
                        byte b3 = objArr[0];
                        int i42 = iMax7;
                        byte b4 = objArr[1];
                        int i43 = i22;
                        int[] iArr4 = c0731Rg12.p0;
                        C2742sK c2742sK3 = c2742sK2;
                        if (!AbstractC0397Ej.N(b3, b4, iArr4[0], iArr4[1])) {
                            V(c0731Rg12, k31, this.L0);
                        }
                        boolean z17 = c0731Rg12 instanceof HA;
                        if (z17) {
                            HA ha5 = (HA) c0731Rg12;
                            if (ha5.u0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(ha5);
                            }
                            if (ha5.u0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(ha5);
                            }
                        }
                        if (c0731Rg12 instanceof AbstractC2636rB) {
                            if (c0731Rg12 instanceof O7) {
                                O7 o9 = (O7) c0731Rg12;
                                if (o9.U() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(o9);
                                }
                                if (o9.U() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(o9);
                                }
                            } else {
                                AbstractC2636rB abstractC2636rB = (AbstractC2636rB) c0731Rg12;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(abstractC2636rB);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(abstractC2636rB);
                            }
                        }
                        if (c0731Rg12.I.f == null && c0731Rg12.K.f == null && !z17 && !(c0731Rg12 instanceof O7)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(c0731Rg12);
                        }
                        if (c0731Rg12.J.f == null && c0731Rg12.L.f == null && c0731Rg12.M.f == null && !z17 && !(c0731Rg12 instanceof O7)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(c0731Rg12);
                        }
                        i39++;
                        i21 = i41;
                        size2 = i40;
                        iMax7 = i42;
                        i22 = i43;
                        c2742sK2 = c2742sK3;
                    }
                    i15 = iMax7;
                    C2742sK c2742sK4 = c2742sK2;
                    i2 = size2;
                    i16 = i21;
                    i17 = i22;
                    ArrayList<C1539fw0> arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            AbstractC0397Ej.l((HA) it.next(), 0, arrayList9, null);
                        }
                    }
                    int i44 = 0;
                    C1539fw0 c1539fw4 = null;
                    if (arrayList4 != null) {
                        for (AbstractC2636rB abstractC2636rB2 : arrayList4) {
                            C1539fw0 c1539fw0L = AbstractC0397Ej.l(abstractC2636rB2, i44, arrayList9, c1539fw4);
                            abstractC2636rB2.R(i44, arrayList9, c1539fw0L);
                            c1539fw0L.a(arrayList9);
                            i44 = 0;
                            c1539fw4 = null;
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it4.next()).d, 0, arrayList9, null);
                        }
                    }
                    C1539fw0 c1539fw5 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            AbstractC0397Ej.l((C0731Rg) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            AbstractC0397Ej.l((HA) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i45 = 1;
                    if (arrayList6 != null) {
                        for (AbstractC2636rB abstractC2636rB3 : arrayList6) {
                            C1539fw0 c1539fw0L2 = AbstractC0397Ej.l(abstractC2636rB3, i45, arrayList9, c1539fw5);
                            abstractC2636rB3.R(i45, arrayList9, c1539fw0L2);
                            c1539fw0L2.a(arrayList9);
                            i45 = 1;
                            c1539fw5 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it8.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it9.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC0397Ej.l(((C0394Eg) it10.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            AbstractC0397Ej.l((C0731Rg) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i46 = 0; i46 < size4; i46++) {
                        C0731Rg c0731Rg13 = (C0731Rg) arrayList2.get(i46);
                        int[] iArr5 = c0731Rg13.p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i47 = c0731Rg13.n0;
                            int size5 = arrayList9.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size5) {
                                    c1539fw2 = null;
                                    break;
                                }
                                c1539fw2 = (C1539fw0) arrayList9.get(i48);
                                if (i47 == c1539fw2.b) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            int i49 = c0731Rg13.o0;
                            int size6 = arrayList9.size();
                            int i50 = 0;
                            while (true) {
                                if (i50 >= size6) {
                                    c1539fw3 = null;
                                    break;
                                }
                                c1539fw3 = (C1539fw0) arrayList9.get(i50);
                                if (i49 == c1539fw3.b) {
                                    break;
                                } else {
                                    i50++;
                                }
                            }
                            if (c1539fw2 != null && c1539fw3 != null) {
                                c1539fw2.c(0, c1539fw3);
                                c1539fw3.c = 2;
                                arrayList9.remove(c1539fw2);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (objArr[0] == 2) {
                            int i51 = 0;
                            c1539fw0 = null;
                            for (C1539fw0 c1539fw6 : arrayList9) {
                                if (c1539fw6.c != 1) {
                                    C2742sK c2742sK5 = c2742sK4;
                                    int iB2 = c1539fw6.b(c2742sK5, 0);
                                    if (iB2 > i51) {
                                        c1539fw0 = c1539fw6;
                                        i51 = iB2;
                                    }
                                    c2742sK4 = c2742sK5;
                                }
                            }
                            c2742sK = c2742sK4;
                            c2 = 1;
                            if (c1539fw0 != null) {
                                M(1);
                                O(i51);
                            }
                            if (objArr[c2] == 2) {
                                i20 = 0;
                                c1539fw1 = null;
                                for (C1539fw0 c1539fw7 : arrayList9) {
                                    if (c1539fw7.c != 0 && (iB = c1539fw7.b(c2742sK, 1)) > i20) {
                                        c1539fw1 = c1539fw7;
                                        i20 = iB;
                                    }
                                }
                                if (c1539fw1 != null) {
                                    N(1);
                                    L(i20);
                                } else {
                                    c1539fw1 = null;
                                }
                            } else {
                                c1539fw1 = null;
                            }
                            if (c1539fw0 == null || c1539fw1 != null) {
                                i5 = i17;
                                if (i5 == 2) {
                                    i18 = i15;
                                    if (i18 < q() || i18 <= 0) {
                                        iQ = q();
                                    } else {
                                        O(i18);
                                        this.E0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        i19 = i;
                                        if (i19 < k() || i19 <= 0) {
                                            iK = k();
                                        } else {
                                            L(i19);
                                            this.F0 = true;
                                        }
                                        i = iK;
                                        i4 = iQ;
                                        z = true;
                                    } else {
                                        i19 = i;
                                    }
                                    iK = i19;
                                    i = iK;
                                    i4 = iQ;
                                    z = true;
                                } else {
                                    i18 = i15;
                                }
                                iQ = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    i19 = i;
                                    if (i19 < k()) {
                                    }
                                    iK = k();
                                    i = iK;
                                    i4 = iQ;
                                    z = true;
                                } else {
                                    i19 = i;
                                }
                                iK = i19;
                                i = iK;
                                i4 = iQ;
                                z = true;
                            }
                            if (!W(64) || W(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2742sK.getClass();
                            c2742sK.g = false;
                            if (this.D0 == 0 && z2) {
                                c = 1;
                                c2742sK.g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.q0;
                            if (objArr[0] != 2 || objArr[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            for (i7 = 0; i7 < i6; i7++) {
                                c0731Rg2 = (C0731Rg) this.q0.get(i7);
                                if (c0731Rg2 instanceof C0757Sg) {
                                    ((C0757Sg) c0731Rg2).U();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i8 = 0;
                            z5 = true;
                            while (z5) {
                                i9 = i8 + 1;
                                try {
                                    c2742sK.t();
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    g(c2742sK);
                                    for (i14 = 0; i14 < i6; i14++) {
                                        ((C0731Rg) this.q0.get(i14)).g(c2742sK);
                                    }
                                    S(c2742sK);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    C0394Eg c0394Eg6 = (C0394Eg) this.G0.get();
                                                    c0394Eg2 = c0394Eg;
                                                    try {
                                                        C1798if0 c1798if0K = c2742sK.k(c0394Eg2);
                                                        C2742sK c2742sK6 = this.w0;
                                                        z7 = z4;
                                                        c0394Eg = c0394Eg2;
                                                        try {
                                                            c2742sK6.f(c2742sK6.k(c0394Eg6), c1798if0K, 0, 5);
                                                            this.G0 = null;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            z5 = true;
                                                            PrintStream printStream = System.out;
                                                            e.toString();
                                                            printStream.getClass();
                                                            zArr = zy0.m;
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(c2742sK, zW2);
                                                                size = this.q0.size();
                                                                i13 = 0;
                                                                z8 = false;
                                                                while (i13 < size) {
                                                                    c0731Rg = (C0731Rg) this.q0.get(i13);
                                                                    c0731Rg.Q(c2742sK, zW2);
                                                                    int i52 = size;
                                                                    boolean z18 = zW2;
                                                                    if (c0731Rg.h == -1) {
                                                                        z8 = true;
                                                                    } else {
                                                                        z8 = true;
                                                                    }
                                                                    i13++;
                                                                    size = i52;
                                                                    zW2 = z18;
                                                                }
                                                            } else {
                                                                Q(c2742sK, zW);
                                                                for (i10 = 0; i10 < i6; i10++) {
                                                                    ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z3) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                for (i12 = 0; i12 < i6; i12++) {
                                                                    C0731Rg c0731Rg14 = (C0731Rg) this.q0.get(i12);
                                                                    iMax3 = Math.max(iMax3, c0731Rg14.q() + c0731Rg14.Y);
                                                                    iMax4 = Math.max(iMax4, c0731Rg14.k() + c0731Rg14.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax3);
                                                                iMax6 = Math.max(this.c0, iMax4);
                                                                if (i5 == 2) {
                                                                    O(iMax5);
                                                                    objArr[0] = 2;
                                                                    z8 = true;
                                                                    z7 = true;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    objArr[1] = 2;
                                                                    z8 = true;
                                                                    z7 = true;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r6 = 1;
                                                                objArr[0] = 1;
                                                                z9 = true;
                                                                z8 = true;
                                                            } else {
                                                                r6 = 1;
                                                                z9 = z7;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                objArr[r6] = r6;
                                                                z10 = true;
                                                                z8 = true;
                                                            } else {
                                                                z10 = z9;
                                                            }
                                                            if (z10) {
                                                                if (objArr[0] == 2) {
                                                                    this.E0 = r6;
                                                                    objArr[0] = r6;
                                                                    O(i4);
                                                                    z10 = true;
                                                                    z8 = true;
                                                                }
                                                                if (objArr[r6] != 2) {
                                                                }
                                                                if (i9 > i11) {
                                                                    z11 = false;
                                                                }
                                                                z5 = z11;
                                                                i8 = i9;
                                                            }
                                                            z4 = z10;
                                                            z11 = z8;
                                                            i11 = 8;
                                                            if (i9 > i11) {
                                                                z11 = false;
                                                            }
                                                            z5 = z11;
                                                            i8 = i9;
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        z7 = z4;
                                                        c0394Eg = c0394Eg2;
                                                    }
                                                } else {
                                                    z7 = z4;
                                                }
                                                try {
                                                    weakReference2 = this.I0;
                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                        C0394Eg c0394Eg7 = (C0394Eg) this.I0.get();
                                                        C1798if0 c1798if0K2 = c2742sK.k(this.L);
                                                        C2742sK c2742sK7 = this.w0;
                                                        c2742sK7.f(c1798if0K2, c2742sK7.k(c0394Eg7), 0, 5);
                                                        this.I0 = null;
                                                    }
                                                    weakReference3 = this.H0;
                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                        C0394Eg c0394Eg8 = (C0394Eg) this.H0.get();
                                                        obj2 = obj;
                                                        try {
                                                            C1798if0 c1798if0K3 = c2742sK.k(obj2);
                                                            C2742sK c2742sK8 = this.w0;
                                                            obj = obj2;
                                                            c2742sK8.f(c2742sK8.k(c0394Eg8), c1798if0K3, 0, 5);
                                                            this.H0 = null;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            obj = obj2;
                                                            z5 = true;
                                                            PrintStream printStream2 = System.out;
                                                            e.toString();
                                                            printStream2.getClass();
                                                        }
                                                    }
                                                    weakReference4 = this.J0;
                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                        C0394Eg c0394Eg9 = (C0394Eg) this.J0.get();
                                                        C1798if0 c1798if0K4 = c2742sK.k(this.K);
                                                        try {
                                                            C2742sK c2742sK9 = this.w0;
                                                            try {
                                                                c2742sK9.f(c1798if0K4, c2742sK9.k(c0394Eg9), 0, 5);
                                                                try {
                                                                    this.J0 = null;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    z5 = true;
                                                                    PrintStream printStream3 = System.out;
                                                                    e.toString();
                                                                    printStream3.getClass();
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z5 = true;
                                                            PrintStream printStream4 = System.out;
                                                            e.toString();
                                                            printStream4.getClass();
                                                            zArr = zy0.m;
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(c2742sK, zW2);
                                                                size = this.q0.size();
                                                                i13 = 0;
                                                                z8 = false;
                                                                while (i13 < size) {
                                                                    c0731Rg = (C0731Rg) this.q0.get(i13);
                                                                    c0731Rg.Q(c2742sK, zW2);
                                                                    int i53 = size;
                                                                    boolean z19 = zW2;
                                                                    if (c0731Rg.h == -1) {
                                                                        z8 = true;
                                                                    } else {
                                                                        z8 = true;
                                                                    }
                                                                    i13++;
                                                                    size = i53;
                                                                    zW2 = z19;
                                                                }
                                                            } else {
                                                                Q(c2742sK, zW);
                                                                while (i10 < i6) {
                                                                    ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z3) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i12 < i6) {
                                                                    C0731Rg c0731Rg15 = (C0731Rg) this.q0.get(i12);
                                                                    iMax3 = Math.max(iMax3, c0731Rg15.q() + c0731Rg15.Y);
                                                                    iMax4 = Math.max(iMax4, c0731Rg15.k() + c0731Rg15.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax3);
                                                                iMax6 = Math.max(this.c0, iMax4);
                                                                if (i5 == 2) {
                                                                    O(iMax5);
                                                                    objArr[0] = 2;
                                                                    z8 = true;
                                                                    z7 = true;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    objArr[1] = 2;
                                                                    z8 = true;
                                                                    z7 = true;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r6 = 1;
                                                                objArr[0] = 1;
                                                                z9 = true;
                                                                z8 = true;
                                                            } else {
                                                                r6 = 1;
                                                                z9 = z7;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                objArr[r6] = r6;
                                                                z10 = true;
                                                                z8 = true;
                                                            } else {
                                                                z10 = z9;
                                                            }
                                                            if (z10) {
                                                                if (objArr[0] == 2) {
                                                                    this.E0 = r6;
                                                                    objArr[0] = r6;
                                                                    O(i4);
                                                                    z10 = true;
                                                                    z8 = true;
                                                                }
                                                                if (objArr[r6] != 2) {
                                                                }
                                                                if (i9 > i11) {
                                                                    z11 = false;
                                                                }
                                                                z5 = z11;
                                                                i8 = i9;
                                                            }
                                                            z4 = z10;
                                                            z11 = z8;
                                                            i11 = 8;
                                                            if (i9 > i11) {
                                                                z11 = false;
                                                            }
                                                            z5 = z11;
                                                            i8 = i9;
                                                        }
                                                    }
                                                    c2742sK.p();
                                                    z5 = true;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                z7 = z4;
                                            }
                                        } else {
                                            z7 = z4;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                C0394Eg c0394Eg10 = (C0394Eg) this.I0.get();
                                                C1798if0 c1798if0K5 = c2742sK.k(this.L);
                                                C2742sK c2742sK10 = this.w0;
                                                c2742sK10.f(c1798if0K5, c2742sK10.k(c0394Eg10), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                C0394Eg c0394Eg11 = (C0394Eg) this.H0.get();
                                                obj2 = obj;
                                                C1798if0 c1798if0K6 = c2742sK.k(obj2);
                                                C2742sK c2742sK11 = this.w0;
                                                obj = obj2;
                                                c2742sK11.f(c2742sK11.k(c0394Eg11), c1798if0K6, 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            c2742sK.p();
                                            z5 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        z7 = z4;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    z7 = z4;
                                }
                                zArr = zy0.m;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(c2742sK, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z8 = false;
                                    while (i13 < size) {
                                        c0731Rg = (C0731Rg) this.q0.get(i13);
                                        c0731Rg.Q(c2742sK, zW2);
                                        int i54 = size;
                                        boolean z110 = zW2;
                                        if (c0731Rg.h == -1 || c0731Rg.i != -1) {
                                            z8 = true;
                                        }
                                        i13++;
                                        size = i54;
                                        zW2 = z110;
                                    }
                                } else {
                                    Q(c2742sK, zW);
                                    while (i10 < i6) {
                                        ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                    }
                                    z8 = false;
                                }
                                if (z3 && i9 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0731Rg c0731Rg16 = (C0731Rg) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0731Rg16.q() + c0731Rg16.Y);
                                        iMax4 = Math.max(iMax4, c0731Rg16.k() + c0731Rg16.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    if (i5 == 2 && q() < iMax5) {
                                        O(iMax5);
                                        objArr[0] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                    if (i3 == 2 && k() < iMax6) {
                                        L(iMax6);
                                        objArr[1] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    objArr[0] = 1;
                                    z9 = true;
                                    z8 = true;
                                } else {
                                    r6 = 1;
                                    z9 = z7;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    objArr[r6] = r6;
                                    z10 = true;
                                    z8 = true;
                                } else {
                                    z10 = z9;
                                }
                                if (z10) {
                                    if (objArr[0] == 2 && i4 > 0 && q() > i4) {
                                        this.E0 = r6;
                                        objArr[0] = r6;
                                        O(i4);
                                        z10 = true;
                                        z8 = true;
                                    }
                                    if (objArr[r6] != 2 && i > 0 && k() > i) {
                                        this.F0 = r6;
                                        objArr[r6] = r6;
                                        L(i);
                                        i11 = 8;
                                        z11 = true;
                                        z4 = true;
                                    }
                                    if (i9 > i11) {
                                        z11 = false;
                                    }
                                    z5 = z11;
                                    i8 = i9;
                                }
                                z4 = z10;
                                z11 = z8;
                                i11 = 8;
                                if (i9 > i11) {
                                    z11 = false;
                                }
                                z5 = z11;
                                i8 = i9;
                            }
                            z6 = z4;
                            this.q0 = arrayList10;
                            if (z6) {
                                objArr[0] = i5;
                                objArr[1] = i3;
                            }
                            F(c2742sK.l);
                        }
                        c2742sK = c2742sK4;
                        c2 = 1;
                        c1539fw0 = null;
                        if (objArr[c2] == 2) {
                            i20 = 0;
                            c1539fw1 = null;
                            while (r0.hasNext()) {
                                if (c1539fw7.c != 0) {
                                    c1539fw1 = c1539fw7;
                                    i20 = iB;
                                }
                            }
                            if (c1539fw1 != null) {
                                N(1);
                                L(i20);
                            } else {
                                c1539fw1 = null;
                            }
                        } else {
                            c1539fw1 = null;
                        }
                        if (c1539fw0 == null) {
                        }
                        i5 = i17;
                        if (i5 == 2) {
                            i18 = i15;
                            if (i18 < q()) {
                            }
                            iQ = q();
                            i3 = i16;
                            if (i3 == 2) {
                                i19 = i;
                                if (i19 < k()) {
                                }
                                iK = k();
                                i = iK;
                                i4 = iQ;
                                z = true;
                                if (W(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                c2742sK.getClass();
                                c2742sK.g = false;
                                if (this.D0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList arrayList11 = this.q0;
                                if (objArr[0] != 2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.z0 = 0;
                                this.A0 = 0;
                                i6 = i2;
                                while (i7 < i6) {
                                    c0731Rg2 = (C0731Rg) this.q0.get(i7);
                                    if (c0731Rg2 instanceof C0757Sg) {
                                        ((C0757Sg) c0731Rg2).U();
                                    }
                                }
                                zW = W(64);
                                z4 = z;
                                i8 = 0;
                                z5 = true;
                                while (z5) {
                                    i9 = i8 + 1;
                                    c2742sK.t();
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    g(c2742sK);
                                    while (i14 < i6) {
                                        ((C0731Rg) this.q0.get(i14)).g(c2742sK);
                                    }
                                    S(c2742sK);
                                    weakReference = this.G0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            C0394Eg c0394Eg12 = (C0394Eg) this.G0.get();
                                            c0394Eg2 = c0394Eg;
                                            C1798if0 c1798if0K7 = c2742sK.k(c0394Eg2);
                                            C2742sK c2742sK12 = this.w0;
                                            z7 = z4;
                                            c0394Eg = c0394Eg2;
                                            c2742sK12.f(c2742sK12.k(c0394Eg12), c1798if0K7, 0, 5);
                                            this.G0 = null;
                                        } else {
                                            z7 = z4;
                                        }
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            C0394Eg c0394Eg13 = (C0394Eg) this.I0.get();
                                            C1798if0 c1798if0K8 = c2742sK.k(this.L);
                                            C2742sK c2742sK13 = this.w0;
                                            c2742sK13.f(c1798if0K8, c2742sK13.k(c0394Eg13), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            C0394Eg c0394Eg14 = (C0394Eg) this.H0.get();
                                            obj2 = obj;
                                            C1798if0 c1798if0K9 = c2742sK.k(obj2);
                                            C2742sK c2742sK14 = this.w0;
                                            obj = obj2;
                                            c2742sK14.f(c2742sK14.k(c0394Eg14), c1798if0K9, 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        c2742sK.p();
                                        z5 = true;
                                    } else {
                                        z7 = z4;
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            C0394Eg c0394Eg15 = (C0394Eg) this.I0.get();
                                            C1798if0 c1798if0K10 = c2742sK.k(this.L);
                                            C2742sK c2742sK15 = this.w0;
                                            c2742sK15.f(c1798if0K10, c2742sK15.k(c0394Eg15), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            C0394Eg c0394Eg16 = (C0394Eg) this.H0.get();
                                            obj2 = obj;
                                            C1798if0 c1798if0K11 = c2742sK.k(obj2);
                                            C2742sK c2742sK16 = this.w0;
                                            obj = obj2;
                                            c2742sK16.f(c2742sK16.k(c0394Eg16), c1798if0K11, 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        c2742sK.p();
                                        z5 = true;
                                    }
                                    zArr = zy0.m;
                                    if (z5) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(c2742sK, zW2);
                                        size = this.q0.size();
                                        i13 = 0;
                                        z8 = false;
                                        while (i13 < size) {
                                            c0731Rg = (C0731Rg) this.q0.get(i13);
                                            c0731Rg.Q(c2742sK, zW2);
                                            int i55 = size;
                                            boolean z111 = zW2;
                                            if (c0731Rg.h == -1) {
                                                z8 = true;
                                            } else {
                                                z8 = true;
                                            }
                                            i13++;
                                            size = i55;
                                            zW2 = z111;
                                        }
                                    } else {
                                        Q(c2742sK, zW);
                                        while (i10 < i6) {
                                            ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                        }
                                        z8 = false;
                                    }
                                    if (z3) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i12 < i6) {
                                            C0731Rg c0731Rg17 = (C0731Rg) this.q0.get(i12);
                                            iMax3 = Math.max(iMax3, c0731Rg17.q() + c0731Rg17.Y);
                                            iMax4 = Math.max(iMax4, c0731Rg17.k() + c0731Rg17.Z);
                                        }
                                        iMax5 = Math.max(this.b0, iMax3);
                                        iMax6 = Math.max(this.c0, iMax4);
                                        if (i5 == 2) {
                                            O(iMax5);
                                            objArr[0] = 2;
                                            z8 = true;
                                            z7 = true;
                                        }
                                        if (i3 == 2) {
                                            L(iMax6);
                                            objArr[1] = 2;
                                            z8 = true;
                                            z7 = true;
                                        }
                                    }
                                    iMax = Math.max(this.b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r6 = 1;
                                        objArr[0] = 1;
                                        z9 = true;
                                        z8 = true;
                                    } else {
                                        r6 = 1;
                                        z9 = z7;
                                    }
                                    iMax2 = Math.max(this.c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        objArr[r6] = r6;
                                        z10 = true;
                                        z8 = true;
                                    } else {
                                        z10 = z9;
                                    }
                                    if (z10) {
                                        if (objArr[0] == 2) {
                                            this.E0 = r6;
                                            objArr[0] = r6;
                                            O(i4);
                                            z10 = true;
                                            z8 = true;
                                        }
                                        if (objArr[r6] != 2) {
                                        }
                                        if (i9 > i11) {
                                            z11 = false;
                                        }
                                        z5 = z11;
                                        i8 = i9;
                                    }
                                    z4 = z10;
                                    z11 = z8;
                                    i11 = 8;
                                    if (i9 > i11) {
                                        z11 = false;
                                    }
                                    z5 = z11;
                                    i8 = i9;
                                }
                                z6 = z4;
                                this.q0 = arrayList11;
                                if (z6) {
                                    objArr[0] = i5;
                                    objArr[1] = i3;
                                }
                                F(c2742sK.l);
                            }
                            i19 = i;
                            iK = i19;
                            i = iK;
                            i4 = iQ;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            c2742sK.getClass();
                            c2742sK.g = false;
                            if (this.D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList12 = this.q0;
                            if (objArr[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            while (i7 < i6) {
                                c0731Rg2 = (C0731Rg) this.q0.get(i7);
                                if (c0731Rg2 instanceof C0757Sg) {
                                    ((C0757Sg) c0731Rg2).U();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i8 = 0;
                            z5 = true;
                            while (z5) {
                                i9 = i8 + 1;
                                c2742sK.t();
                                this.z0 = 0;
                                this.A0 = 0;
                                g(c2742sK);
                                while (i14 < i6) {
                                    ((C0731Rg) this.q0.get(i14)).g(c2742sK);
                                }
                                S(c2742sK);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C0394Eg c0394Eg17 = (C0394Eg) this.G0.get();
                                        c0394Eg2 = c0394Eg;
                                        C1798if0 c1798if0K12 = c2742sK.k(c0394Eg2);
                                        C2742sK c2742sK17 = this.w0;
                                        z7 = z4;
                                        c0394Eg = c0394Eg2;
                                        c2742sK17.f(c2742sK17.k(c0394Eg17), c1798if0K12, 0, 5);
                                        this.G0 = null;
                                    } else {
                                        z7 = z4;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0394Eg c0394Eg18 = (C0394Eg) this.I0.get();
                                        C1798if0 c1798if0K13 = c2742sK.k(this.L);
                                        C2742sK c2742sK18 = this.w0;
                                        c2742sK18.f(c1798if0K13, c2742sK18.k(c0394Eg18), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0394Eg c0394Eg19 = (C0394Eg) this.H0.get();
                                        obj2 = obj;
                                        C1798if0 c1798if0K14 = c2742sK.k(obj2);
                                        C2742sK c2742sK19 = this.w0;
                                        obj = obj2;
                                        c2742sK19.f(c2742sK19.k(c0394Eg19), c1798if0K14, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    c2742sK.p();
                                    z5 = true;
                                } else {
                                    z7 = z4;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0394Eg c0394Eg110 = (C0394Eg) this.I0.get();
                                        C1798if0 c1798if0K15 = c2742sK.k(this.L);
                                        C2742sK c2742sK110 = this.w0;
                                        c2742sK110.f(c1798if0K15, c2742sK110.k(c0394Eg110), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0394Eg c0394Eg111 = (C0394Eg) this.H0.get();
                                        obj2 = obj;
                                        C1798if0 c1798if0K16 = c2742sK.k(obj2);
                                        C2742sK c2742sK111 = this.w0;
                                        obj = obj2;
                                        c2742sK111.f(c2742sK111.k(c0394Eg111), c1798if0K16, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    c2742sK.p();
                                    z5 = true;
                                }
                                zArr = zy0.m;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(c2742sK, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z8 = false;
                                    while (i13 < size) {
                                        c0731Rg = (C0731Rg) this.q0.get(i13);
                                        c0731Rg.Q(c2742sK, zW2);
                                        int i56 = size;
                                        boolean z112 = zW2;
                                        if (c0731Rg.h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i13++;
                                        size = i56;
                                        zW2 = z112;
                                    }
                                } else {
                                    Q(c2742sK, zW);
                                    while (i10 < i6) {
                                        ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                    }
                                    z8 = false;
                                }
                                if (z3) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0731Rg c0731Rg18 = (C0731Rg) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0731Rg18.q() + c0731Rg18.Y);
                                        iMax4 = Math.max(iMax4, c0731Rg18.k() + c0731Rg18.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    if (i5 == 2) {
                                        O(iMax5);
                                        objArr[0] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                    if (i3 == 2) {
                                        L(iMax6);
                                        objArr[1] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    objArr[0] = 1;
                                    z9 = true;
                                    z8 = true;
                                } else {
                                    r6 = 1;
                                    z9 = z7;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    objArr[r6] = r6;
                                    z10 = true;
                                    z8 = true;
                                } else {
                                    z10 = z9;
                                }
                                if (z10) {
                                    if (objArr[0] == 2) {
                                        this.E0 = r6;
                                        objArr[0] = r6;
                                        O(i4);
                                        z10 = true;
                                        z8 = true;
                                    }
                                    if (objArr[r6] != 2) {
                                    }
                                    if (i9 > i11) {
                                        z11 = false;
                                    }
                                    z5 = z11;
                                    i8 = i9;
                                }
                                z4 = z10;
                                z11 = z8;
                                i11 = 8;
                                if (i9 > i11) {
                                    z11 = false;
                                }
                                z5 = z11;
                                i8 = i9;
                            }
                            z6 = z4;
                            this.q0 = arrayList12;
                            if (z6) {
                                objArr[0] = i5;
                                objArr[1] = i3;
                            }
                            F(c2742sK.l);
                        }
                        i18 = i15;
                        iQ = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            i19 = i;
                            if (i19 < k()) {
                            }
                            iK = k();
                            i = iK;
                            i4 = iQ;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            c2742sK.getClass();
                            c2742sK.g = false;
                            if (this.D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList13 = this.q0;
                            if (objArr[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            while (i7 < i6) {
                                c0731Rg2 = (C0731Rg) this.q0.get(i7);
                                if (c0731Rg2 instanceof C0757Sg) {
                                    ((C0757Sg) c0731Rg2).U();
                                }
                            }
                            zW = W(64);
                            z4 = z;
                            i8 = 0;
                            z5 = true;
                            while (z5) {
                                i9 = i8 + 1;
                                c2742sK.t();
                                this.z0 = 0;
                                this.A0 = 0;
                                g(c2742sK);
                                while (i14 < i6) {
                                    ((C0731Rg) this.q0.get(i14)).g(c2742sK);
                                }
                                S(c2742sK);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C0394Eg c0394Eg112 = (C0394Eg) this.G0.get();
                                        c0394Eg2 = c0394Eg;
                                        C1798if0 c1798if0K17 = c2742sK.k(c0394Eg2);
                                        C2742sK c2742sK112 = this.w0;
                                        z7 = z4;
                                        c0394Eg = c0394Eg2;
                                        c2742sK112.f(c2742sK112.k(c0394Eg112), c1798if0K17, 0, 5);
                                        this.G0 = null;
                                    } else {
                                        z7 = z4;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0394Eg c0394Eg113 = (C0394Eg) this.I0.get();
                                        C1798if0 c1798if0K18 = c2742sK.k(this.L);
                                        C2742sK c2742sK113 = this.w0;
                                        c2742sK113.f(c1798if0K18, c2742sK113.k(c0394Eg113), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0394Eg c0394Eg114 = (C0394Eg) this.H0.get();
                                        obj2 = obj;
                                        C1798if0 c1798if0K19 = c2742sK.k(obj2);
                                        C2742sK c2742sK114 = this.w0;
                                        obj = obj2;
                                        c2742sK114.f(c2742sK114.k(c0394Eg114), c1798if0K19, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    c2742sK.p();
                                    z5 = true;
                                } else {
                                    z7 = z4;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0394Eg c0394Eg115 = (C0394Eg) this.I0.get();
                                        C1798if0 c1798if0K110 = c2742sK.k(this.L);
                                        C2742sK c2742sK115 = this.w0;
                                        c2742sK115.f(c1798if0K110, c2742sK115.k(c0394Eg115), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0394Eg c0394Eg116 = (C0394Eg) this.H0.get();
                                        obj2 = obj;
                                        C1798if0 c1798if0K111 = c2742sK.k(obj2);
                                        C2742sK c2742sK116 = this.w0;
                                        obj = obj2;
                                        c2742sK116.f(c2742sK116.k(c0394Eg116), c1798if0K111, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    c2742sK.p();
                                    z5 = true;
                                }
                                zArr = zy0.m;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(c2742sK, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z8 = false;
                                    while (i13 < size) {
                                        c0731Rg = (C0731Rg) this.q0.get(i13);
                                        c0731Rg.Q(c2742sK, zW2);
                                        int i57 = size;
                                        boolean z113 = zW2;
                                        if (c0731Rg.h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i13++;
                                        size = i57;
                                        zW2 = z113;
                                    }
                                } else {
                                    Q(c2742sK, zW);
                                    while (i10 < i6) {
                                        ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                    }
                                    z8 = false;
                                }
                                if (z3) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0731Rg c0731Rg19 = (C0731Rg) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0731Rg19.q() + c0731Rg19.Y);
                                        iMax4 = Math.max(iMax4, c0731Rg19.k() + c0731Rg19.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    if (i5 == 2) {
                                        O(iMax5);
                                        objArr[0] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                    if (i3 == 2) {
                                        L(iMax6);
                                        objArr[1] = 2;
                                        z8 = true;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    objArr[0] = 1;
                                    z9 = true;
                                    z8 = true;
                                } else {
                                    r6 = 1;
                                    z9 = z7;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    objArr[r6] = r6;
                                    z10 = true;
                                    z8 = true;
                                } else {
                                    z10 = z9;
                                }
                                if (z10) {
                                    if (objArr[0] == 2) {
                                        this.E0 = r6;
                                        objArr[0] = r6;
                                        O(i4);
                                        z10 = true;
                                        z8 = true;
                                    }
                                    if (objArr[r6] != 2) {
                                    }
                                    if (i9 > i11) {
                                        z11 = false;
                                    }
                                    z5 = z11;
                                    i8 = i9;
                                }
                                z4 = z10;
                                z11 = z8;
                                i11 = 8;
                                if (i9 > i11) {
                                    z11 = false;
                                }
                                z5 = z11;
                                i8 = i9;
                            }
                            z6 = z4;
                            this.q0 = arrayList13;
                            if (z6) {
                                objArr[0] = i5;
                                objArr[1] = i3;
                            }
                            F(c2742sK.l);
                        }
                        i19 = i;
                        iK = i19;
                        i = iK;
                        i4 = iQ;
                        z = true;
                        if (W(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        c2742sK.getClass();
                        c2742sK.g = false;
                        if (this.D0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList14 = this.q0;
                        if (objArr[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i6 = i2;
                        while (i7 < i6) {
                            c0731Rg2 = (C0731Rg) this.q0.get(i7);
                            if (c0731Rg2 instanceof C0757Sg) {
                                ((C0757Sg) c0731Rg2).U();
                            }
                        }
                        zW = W(64);
                        z4 = z;
                        i8 = 0;
                        z5 = true;
                        while (z5) {
                            i9 = i8 + 1;
                            c2742sK.t();
                            this.z0 = 0;
                            this.A0 = 0;
                            g(c2742sK);
                            while (i14 < i6) {
                                ((C0731Rg) this.q0.get(i14)).g(c2742sK);
                            }
                            S(c2742sK);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    C0394Eg c0394Eg117 = (C0394Eg) this.G0.get();
                                    c0394Eg2 = c0394Eg;
                                    C1798if0 c1798if0K112 = c2742sK.k(c0394Eg2);
                                    C2742sK c2742sK117 = this.w0;
                                    z7 = z4;
                                    c0394Eg = c0394Eg2;
                                    c2742sK117.f(c2742sK117.k(c0394Eg117), c1798if0K112, 0, 5);
                                    this.G0 = null;
                                } else {
                                    z7 = z4;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    C0394Eg c0394Eg118 = (C0394Eg) this.I0.get();
                                    C1798if0 c1798if0K113 = c2742sK.k(this.L);
                                    C2742sK c2742sK118 = this.w0;
                                    c2742sK118.f(c1798if0K113, c2742sK118.k(c0394Eg118), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    C0394Eg c0394Eg119 = (C0394Eg) this.H0.get();
                                    obj2 = obj;
                                    C1798if0 c1798if0K114 = c2742sK.k(obj2);
                                    C2742sK c2742sK119 = this.w0;
                                    obj = obj2;
                                    c2742sK119.f(c2742sK119.k(c0394Eg119), c1798if0K114, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                c2742sK.p();
                                z5 = true;
                            } else {
                                z7 = z4;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    C0394Eg c0394Eg1110 = (C0394Eg) this.I0.get();
                                    C1798if0 c1798if0K115 = c2742sK.k(this.L);
                                    C2742sK c2742sK1110 = this.w0;
                                    c2742sK1110.f(c1798if0K115, c2742sK1110.k(c0394Eg1110), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    C0394Eg c0394Eg1111 = (C0394Eg) this.H0.get();
                                    obj2 = obj;
                                    C1798if0 c1798if0K116 = c2742sK.k(obj2);
                                    C2742sK c2742sK1111 = this.w0;
                                    obj = obj2;
                                    c2742sK1111.f(c2742sK1111.k(c0394Eg1111), c1798if0K116, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                c2742sK.p();
                                z5 = true;
                            }
                            zArr = zy0.m;
                            if (z5) {
                                zArr[2] = false;
                                zW2 = W(64);
                                Q(c2742sK, zW2);
                                size = this.q0.size();
                                i13 = 0;
                                z8 = false;
                                while (i13 < size) {
                                    c0731Rg = (C0731Rg) this.q0.get(i13);
                                    c0731Rg.Q(c2742sK, zW2);
                                    int i58 = size;
                                    boolean z114 = zW2;
                                    if (c0731Rg.h == -1) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    i13++;
                                    size = i58;
                                    zW2 = z114;
                                }
                            } else {
                                Q(c2742sK, zW);
                                while (i10 < i6) {
                                    ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                                }
                                z8 = false;
                            }
                            if (z3) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i12 < i6) {
                                    C0731Rg c0731Rg110 = (C0731Rg) this.q0.get(i12);
                                    iMax3 = Math.max(iMax3, c0731Rg110.q() + c0731Rg110.Y);
                                    iMax4 = Math.max(iMax4, c0731Rg110.k() + c0731Rg110.Z);
                                }
                                iMax5 = Math.max(this.b0, iMax3);
                                iMax6 = Math.max(this.c0, iMax4);
                                if (i5 == 2) {
                                    O(iMax5);
                                    objArr[0] = 2;
                                    z8 = true;
                                    z7 = true;
                                }
                                if (i3 == 2) {
                                    L(iMax6);
                                    objArr[1] = 2;
                                    z8 = true;
                                    z7 = true;
                                }
                            }
                            iMax = Math.max(this.b0, q());
                            if (iMax > q()) {
                                O(iMax);
                                r6 = 1;
                                objArr[0] = 1;
                                z9 = true;
                                z8 = true;
                            } else {
                                r6 = 1;
                                z9 = z7;
                            }
                            iMax2 = Math.max(this.c0, k());
                            if (iMax2 > k()) {
                                L(iMax2);
                                objArr[r6] = r6;
                                z10 = true;
                                z8 = true;
                            } else {
                                z10 = z9;
                            }
                            if (z10) {
                                if (objArr[0] == 2) {
                                    this.E0 = r6;
                                    objArr[0] = r6;
                                    O(i4);
                                    z10 = true;
                                    z8 = true;
                                }
                                if (objArr[r6] != 2) {
                                }
                                if (i9 > i11) {
                                    z11 = false;
                                }
                                z5 = z11;
                                i8 = i9;
                            }
                            z4 = z10;
                            z11 = z8;
                            i11 = 8;
                            if (i9 > i11) {
                                z11 = false;
                            }
                            z5 = z11;
                            i8 = i9;
                        }
                        z6 = z4;
                        this.q0 = arrayList14;
                        if (z6) {
                            objArr[0] = i5;
                            objArr[1] = i3;
                        }
                        F(c2742sK.l);
                    }
                    c2742sK = c2742sK4;
                }
                i3 = i16;
                i4 = i15;
                i5 = i17;
            }
        }
        z = false;
        if (W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        c2742sK.getClass();
        c2742sK.g = false;
        if (this.D0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList15 = this.q0;
        if (objArr[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.z0 = 0;
        this.A0 = 0;
        i6 = i2;
        while (i7 < i6) {
            c0731Rg2 = (C0731Rg) this.q0.get(i7);
            if (c0731Rg2 instanceof C0757Sg) {
                ((C0757Sg) c0731Rg2).U();
            }
        }
        zW = W(64);
        z4 = z;
        i8 = 0;
        z5 = true;
        while (z5) {
            i9 = i8 + 1;
            c2742sK.t();
            this.z0 = 0;
            this.A0 = 0;
            g(c2742sK);
            while (i14 < i6) {
                ((C0731Rg) this.q0.get(i14)).g(c2742sK);
            }
            S(c2742sK);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    C0394Eg c0394Eg1112 = (C0394Eg) this.G0.get();
                    c0394Eg2 = c0394Eg;
                    C1798if0 c1798if0K117 = c2742sK.k(c0394Eg2);
                    C2742sK c2742sK1112 = this.w0;
                    z7 = z4;
                    c0394Eg = c0394Eg2;
                    c2742sK1112.f(c2742sK1112.k(c0394Eg1112), c1798if0K117, 0, 5);
                    this.G0 = null;
                } else {
                    z7 = z4;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    C0394Eg c0394Eg1113 = (C0394Eg) this.I0.get();
                    C1798if0 c1798if0K118 = c2742sK.k(this.L);
                    C2742sK c2742sK1113 = this.w0;
                    c2742sK1113.f(c1798if0K118, c2742sK1113.k(c0394Eg1113), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    C0394Eg c0394Eg1114 = (C0394Eg) this.H0.get();
                    obj2 = obj;
                    C1798if0 c1798if0K119 = c2742sK.k(obj2);
                    C2742sK c2742sK1114 = this.w0;
                    obj = obj2;
                    c2742sK1114.f(c2742sK1114.k(c0394Eg1114), c1798if0K119, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                c2742sK.p();
                z5 = true;
            } else {
                z7 = z4;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    C0394Eg c0394Eg1115 = (C0394Eg) this.I0.get();
                    C1798if0 c1798if0K1110 = c2742sK.k(this.L);
                    C2742sK c2742sK1115 = this.w0;
                    c2742sK1115.f(c1798if0K1110, c2742sK1115.k(c0394Eg1115), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    C0394Eg c0394Eg1116 = (C0394Eg) this.H0.get();
                    obj2 = obj;
                    C1798if0 c1798if0K1111 = c2742sK.k(obj2);
                    C2742sK c2742sK1116 = this.w0;
                    obj = obj2;
                    c2742sK1116.f(c2742sK1116.k(c0394Eg1116), c1798if0K1111, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                c2742sK.p();
                z5 = true;
            }
            zArr = zy0.m;
            if (z5) {
                zArr[2] = false;
                zW2 = W(64);
                Q(c2742sK, zW2);
                size = this.q0.size();
                i13 = 0;
                z8 = false;
                while (i13 < size) {
                    c0731Rg = (C0731Rg) this.q0.get(i13);
                    c0731Rg.Q(c2742sK, zW2);
                    int i59 = size;
                    boolean z115 = zW2;
                    if (c0731Rg.h == -1) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    i13++;
                    size = i59;
                    zW2 = z115;
                }
            } else {
                Q(c2742sK, zW);
                while (i10 < i6) {
                    ((C0731Rg) this.q0.get(i10)).Q(c2742sK, zW);
                }
                z8 = false;
            }
            if (z3) {
                iMax3 = 0;
                iMax4 = 0;
                while (i12 < i6) {
                    C0731Rg c0731Rg111 = (C0731Rg) this.q0.get(i12);
                    iMax3 = Math.max(iMax3, c0731Rg111.q() + c0731Rg111.Y);
                    iMax4 = Math.max(iMax4, c0731Rg111.k() + c0731Rg111.Z);
                }
                iMax5 = Math.max(this.b0, iMax3);
                iMax6 = Math.max(this.c0, iMax4);
                if (i5 == 2) {
                    O(iMax5);
                    objArr[0] = 2;
                    z8 = true;
                    z7 = true;
                }
                if (i3 == 2) {
                    L(iMax6);
                    objArr[1] = 2;
                    z8 = true;
                    z7 = true;
                }
            }
            iMax = Math.max(this.b0, q());
            if (iMax > q()) {
                O(iMax);
                r6 = 1;
                objArr[0] = 1;
                z9 = true;
                z8 = true;
            } else {
                r6 = 1;
                z9 = z7;
            }
            iMax2 = Math.max(this.c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                objArr[r6] = r6;
                z10 = true;
                z8 = true;
            } else {
                z10 = z9;
            }
            if (z10) {
                if (objArr[0] == 2) {
                    this.E0 = r6;
                    objArr[0] = r6;
                    O(i4);
                    z10 = true;
                    z8 = true;
                }
                if (objArr[r6] != 2) {
                }
                if (i9 > i11) {
                    z11 = false;
                }
                z5 = z11;
                i8 = i9;
            }
            z4 = z10;
            z11 = z8;
            i11 = 8;
            if (i9 > i11) {
                z11 = false;
            }
            z5 = z11;
            i8 = i9;
        }
        z6 = z4;
        this.q0 = arrayList15;
        if (z6) {
            objArr[0] = i5;
            objArr[1] = i3;
        }
        F(c2742sK.l);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    public final void X() {
        this.q0.clear();
        super.C();
    }

    @Override // o.C0731Rg
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((C0731Rg) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
