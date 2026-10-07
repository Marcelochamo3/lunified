package o;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import io.sentry.C0032c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.vP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3038vP {
    public final InterfaceC2941uP a;
    public final Object b;
    public final D90[] c;
    public boolean d;
    public boolean e;
    public C3232xP f;
    public boolean g;
    public final boolean[] h;
    public final AbstractC1952k8[] i;
    public final AbstractC3133wN j;
    public final QP k;
    public C3038vP l;
    public C1031am0 m;
    public C1909jm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1072o;

    public C3038vP(AbstractC1952k8[] abstractC1952k8Arr, long j, AbstractC3133wN abstractC3133wN, C1562g8 c1562g8, QP qp, C3232xP c3232xP, C1909jm0 c1909jm0) {
        this.i = abstractC1952k8Arr;
        this.f1072o = j;
        this.j = abstractC3133wN;
        this.k = qp;
        CP cp = c3232xP.a;
        this.b = cp.a;
        this.f = c3232xP;
        this.m = C1031am0.f678o;
        this.n = c1909jm0;
        this.c = new D90[abstractC1952k8Arr.length];
        this.h = new boolean[abstractC1952k8Arr.length];
        qp.getClass();
        int i = C1063b20.v;
        Pair pair = (Pair) cp.a;
        Object obj = pair.first;
        CP cpB = cp.b(pair.second);
        PP pp = (PP) ((HashMap) qp.e).get(obj);
        pp.getClass();
        ((HashSet) qp.h).add(pp);
        OP op = (OP) ((HashMap) qp.f).get(pp);
        if (op != null) {
            op.a.e(op.b);
        }
        pp.c.add(cpB);
        InterfaceC2941uP interfaceC2941uPB = pp.a.b(cpB, c1562g8, c3232xP.b);
        ((IdentityHashMap) qp.d).put(interfaceC2941uPB, pp);
        qp.d();
        long j2 = c3232xP.d;
        this.a = j2 != -9223372036854775807L ? new C0392Ee(interfaceC2941uPB, true, 0L, j2) : interfaceC2941uPB;
    }

    public final long a(C1909jm0 c1909jm0, long j, boolean z, boolean[] zArr) {
        AbstractC1952k8[] abstractC1952k8Arr;
        D90[] d90Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c1909jm0.l) {
                break;
            }
            if (z || !c1909jm0.w(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC1952k8Arr = this.i;
            int length = abstractC1952k8Arr.length;
            d90Arr = this.c;
            if (i2 >= length) {
                break;
            }
            if (abstractC1952k8Arr[i2].m == -2) {
                d90Arr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = c1909jm0;
        c();
        long jF = this.a.F((InterfaceC1920js[]) c1909jm0.n, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < abstractC1952k8Arr.length; i3++) {
            if (abstractC1952k8Arr[i3].m == -2 && this.n.x(i3)) {
                d90Arr[i3] = new C1526fq();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < d90Arr.length; i4++) {
            if (d90Arr[i4] != null) {
                AbstractC0397Ej.f(c1909jm0.x(i4));
                if (abstractC1952k8Arr[i4].m != -2) {
                    this.e = true;
                }
            } else {
                AbstractC0397Ej.f(((InterfaceC1920js[]) c1909jm0.n)[i4] == null);
            }
        }
        return jF;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1909jm0 c1909jm0 = this.n;
            if (i >= c1909jm0.l) {
                return;
            }
            boolean zX = c1909jm0.x(i);
            InterfaceC1920js interfaceC1920js = ((InterfaceC1920js[]) this.n.n)[i];
            if (zX && interfaceC1920js != null) {
                interfaceC1920js.h();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1909jm0 c1909jm0 = this.n;
            if (i >= c1909jm0.l) {
                return;
            }
            boolean zX = c1909jm0.x(i);
            InterfaceC1920js interfaceC1920js = ((InterfaceC1920js[]) this.n.n)[i];
            if (zX && interfaceC1920js != null) {
                interfaceC1920js.e();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long jA = this.e ? this.a.A() : Long.MIN_VALUE;
        return jA == Long.MIN_VALUE ? this.f.e : jA;
    }

    public final long e() {
        return this.f.b + this.f1072o;
    }

    public final void f() {
        b();
        InterfaceC2941uP interfaceC2941uP = this.a;
        try {
            boolean z = interfaceC2941uP instanceof C0392Ee;
            QP qp = this.k;
            if (z) {
                qp.h(((C0392Ee) interfaceC2941uP).l);
            } else {
                qp.h(interfaceC2941uP);
            }
        } catch (RuntimeException e) {
            AP.g("Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a6  */
    public final C1909jm0 g(float f, Fj0 fj0) {
        final C0814Ul c0814Ul;
        C1031am0[] c1031am0Arr;
        int[] iArr;
        int i;
        final boolean z;
        String str;
        C1031am0[] c1031am0Arr2;
        int i2;
        boolean z2;
        int i3;
        M60 m60Q;
        boolean z3;
        int i4;
        int i5;
        C1823is c1823is;
        C1031am0[] c1031am0Arr3;
        int[] iArr2;
        Zl0 zl0;
        C0032c c0032c;
        int i6;
        int[] iArr3;
        AbstractC3133wN abstractC3133wN = this.j;
        AbstractC1952k8[] abstractC1952k8Arr = this.i;
        C1031am0 c1031am0 = this.m;
        CP cp = this.f.a;
        abstractC3133wN.getClass();
        int[] iArr4 = new int[abstractC1952k8Arr.length + 1];
        int length = abstractC1952k8Arr.length + 1;
        Zl0[][] zl0Arr = new Zl0[length][];
        int[][][] iArr5 = new int[abstractC1952k8Arr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = c1031am0.l;
            zl0Arr[i7] = new Zl0[i8];
            iArr5[i7] = new int[i8][];
        }
        int length2 = abstractC1952k8Arr.length;
        int[] iArr6 = new int[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            iArr6[i9] = abstractC1952k8Arr[i9].z();
        }
        int i10 = 0;
        while (i10 < c1031am0.l) {
            Zl0 zl0A = c1031am0.a(i10);
            boolean z4 = zl0A.n == 5;
            int length3 = abstractC1952k8Arr.length;
            int i11 = 0;
            int i12 = 0;
            boolean z5 = true;
            while (i11 < abstractC1952k8Arr.length) {
                AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i11];
                C1031am0 c1031am1 = c1031am0;
                int iMax = 0;
                for (int i13 = 0; i13 < zl0A.l; i13++) {
                    iMax = Math.max(iMax, abstractC1952k8.y(zl0A.f665o[i13]) & 7);
                }
                boolean z6 = iArr4[i11] == 0;
                if (iMax > i12 || (iMax == i12 && z4 && !z5 && z6)) {
                    length3 = i11;
                    i12 = iMax;
                    z5 = z6;
                }
                i11++;
                c1031am0 = c1031am1;
            }
            C1031am0 c1031am2 = c1031am0;
            if (length3 == abstractC1952k8Arr.length) {
                iArr3 = new int[zl0A.l];
                i6 = 1;
            } else {
                AbstractC1952k8 abstractC1952k9 = abstractC1952k8Arr[length3];
                int[] iArr7 = new int[zl0A.l];
                for (int i14 = 0; i14 < zl0A.l; i14++) {
                    iArr7[i14] = abstractC1952k9.y(zl0A.f665o[i14]);
                }
                i6 = 1;
                iArr3 = iArr7;
            }
            int i15 = iArr4[length3];
            zl0Arr[length3][i15] = zl0A;
            iArr5[length3][i15] = iArr3;
            iArr4[length3] = i15 + i6;
            i10 += i6;
            c1031am0 = c1031am2;
        }
        C1031am0[] c1031am0Arr4 = new C1031am0[abstractC1952k8Arr.length];
        String[] strArr = new String[abstractC1952k8Arr.length];
        int[] iArr8 = new int[abstractC1952k8Arr.length];
        for (int i16 = 0; i16 < abstractC1952k8Arr.length; i16++) {
            int i17 = iArr4[i16];
            c1031am0Arr4[i16] = new C1031am0((Zl0[]) Lr0.M(i17, zl0Arr[i16]));
            iArr5[i16] = (int[][]) Lr0.M(i17, iArr5[i16]);
            strArr[i16] = abstractC1952k8Arr[i16].h();
            iArr8[i16] = abstractC1952k8Arr[i16].m;
        }
        int i18 = 0;
        C3036vN c3036vN = new C3036vN(iArr8, c1031am0Arr4, iArr6, iArr5, new C1031am0((Zl0[]) Lr0.M(iArr4[abstractC1952k8Arr.length], zl0Arr[abstractC1952k8Arr.length])));
        final C1128bm c1128bm = (C1128bm) abstractC3133wN;
        synchronized (c1128bm.c) {
            try {
                c0814Ul = c1128bm.g;
                if (c0814Ul.U && Lr0.a >= 32 && (c0032c = c1128bm.h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC0397Ej.g(looperMyLooper);
                    if (((C0866Wl) c0032c.e) == null && ((Handler) c0032c.d) == null) {
                        c0032c.e = new C0866Wl(c1128bm);
                        Handler handler = new Handler(looperMyLooper);
                        c0032c.d = handler;
                        ((Spatializer) c0032c.c).addOnSpatializerStateChangedListener(new ExecutorC1710hk(handler), (C0866Wl) c0032c.e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i19 = c3036vN.a;
        C1823is[] c1823isArr = new C1823is[i19];
        Pair pairM = C1128bm.m(2, c3036vN, iArr5, new C0812Uj(c0814Ul, 2, iArr6), new C2147m8(7));
        if (pairM != null) {
            c1823isArr[((Integer) pairM.second).intValue()] = (C1823is) pairM.first;
        }
        int i20 = 0;
        while (true) {
            c1031am0Arr = c3036vN.c;
            iArr = c3036vN.b;
            if (i20 >= c3036vN.a) {
                i = 1;
                z = false;
                break;
            }
            if (2 == iArr[i20] && c1031am0Arr[i20].l > 0) {
                i = 1;
                z = true;
                break;
            }
            i20++;
        }
        Pair pairM2 = C1128bm.m(i, c3036vN, iArr5, new InterfaceC0918Yl() { // from class: o.Pl
            @Override // o.InterfaceC0918Yl
            public final M60 e(int i21, Zl0 zl1, int[] iArr9) {
                C1128bm c1128bm2 = c1128bm;
                c1128bm2.getClass();
                C0710Ql c0710Ql = new C0710Ql(c1128bm2);
                XE xe = AbstractC0985aF.m;
                U9.d(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i22 = 0;
                int i23 = 0;
                boolean z7 = false;
                while (i22 < zl1.l) {
                    int i24 = i22;
                    C0736Rl c0736Rl = new C0736Rl(i21, zl1, i24, c0814Ul, iArr9[i22], z, c0710Ql);
                    int i25 = i23 + 1;
                    if (objArrCopyOf.length < i25) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, TE.e(objArrCopyOf.length, i25));
                    } else {
                        if (z7) {
                            objArrCopyOf = (Object[]) objArrCopyOf.clone();
                        }
                        objArrCopyOf[i23] = c0736Rl;
                        i22++;
                        i23++;
                    }
                    z7 = false;
                    objArrCopyOf[i23] = c0736Rl;
                    i22++;
                    i23++;
                }
                return AbstractC0985aF.j(i23, objArrCopyOf);
            }
        }, new C2147m8(8));
        if (pairM2 != null) {
            c1823isArr[((Integer) pairM2.second).intValue()] = (C1823is) pairM2.first;
        }
        if (pairM2 == null) {
            str = null;
        } else {
            C1823is c1823is2 = (C1823is) pairM2.first;
            str = c1823is2.a.f665o[c1823is2.b[0]].n;
        }
        Pair pairM3 = C1128bm.m(3, c3036vN, iArr5, new C0812Uj(c0814Ul, 3, str), new C2147m8(9));
        if (pairM3 != null) {
            c1823isArr[((Integer) pairM3.second).intValue()] = (C1823is) pairM3.first;
        }
        int i21 = 0;
        while (i21 < i19) {
            int i22 = iArr[i21];
            if (i22 == 2 || i22 == 1 || i22 == 3) {
                c1031am0Arr3 = c1031am0Arr;
                iArr2 = iArr;
            } else {
                C1031am0 c1031am3 = c1031am0Arr[i21];
                int[][] iArr9 = iArr5[i21];
                Zl0 zl1 = null;
                int i23 = 0;
                int i24 = 0;
                C0762Sl c0762Sl = null;
                while (i23 < c1031am3.l) {
                    int[] iArr10 = iArr9[i23];
                    C1031am0[] c1031am0Arr5 = c1031am0Arr;
                    int[] iArr11 = iArr;
                    C0762Sl c0762Sl2 = c0762Sl;
                    for (Zl0 zl0A2 = c1031am3.a(i23); i18 < zl0A2.l; zl0A2 = zl0) {
                        C1031am0 c1031am4 = c1031am3;
                        if (C1128bm.i(iArr10[i18], c0814Ul.V)) {
                            zl0 = zl0A2;
                            C0762Sl c0762Sl3 = new C0762Sl(zl0A2.f665o[i18], iArr10[i18]);
                            if (c0762Sl2 != null) {
                                if (AbstractC0393Ef.a.c(c0762Sl3.m, c0762Sl2.m).c(c0762Sl3.l, c0762Sl2.l).e() > 0) {
                                }
                                i18++;
                                c1031am3 = c1031am4;
                            }
                            i24 = i18;
                            c0762Sl2 = c0762Sl3;
                            zl1 = zl0;
                            i18++;
                            c1031am3 = c1031am4;
                        } else {
                            zl0 = zl0A2;
                        }
                        zl1 = zl1;
                        i18++;
                        c1031am3 = c1031am4;
                    }
                    i23++;
                    c0762Sl = c0762Sl2;
                    c1031am0Arr = c1031am0Arr5;
                    iArr = iArr11;
                    i18 = 0;
                }
                c1031am0Arr3 = c1031am0Arr;
                iArr2 = iArr;
                c1823isArr[i21] = zl1 == null ? null : new C1823is(0, zl1, new int[]{i24});
            }
            i21++;
            c1031am0Arr = c1031am0Arr3;
            iArr = iArr2;
            i18 = 0;
        }
        int i25 = c3036vN.a;
        HashMap map = new HashMap();
        int i26 = 0;
        while (true) {
            c1031am0Arr2 = c3036vN.c;
            if (i26 >= i25) {
                break;
            }
            C1128bm.f(c1031am0Arr2[i26], c0814Ul, map);
            i26++;
        }
        C1128bm.f(c3036vN.f, c0814Ul, map);
        for (int i27 = 0; i27 < i25; i27++) {
            C1519fm0 c1519fm0 = (C1519fm0) map.get(Integer.valueOf(c3036vN.b[i27]));
            if (c1519fm0 != null) {
                AbstractC0985aF abstractC0985aF = c1519fm0.m;
                if (abstractC0985aF.isEmpty()) {
                    c1823is = null;
                } else {
                    C1031am0 c1031am5 = c1031am0Arr2[i27];
                    Zl0 zl2 = c1519fm0.l;
                    if (c1031am5.b(zl2) != -1) {
                        c1823is = new C1823is(0, zl2, Pu0.v(abstractC0985aF));
                    } else {
                        c1823is = null;
                    }
                }
                c1823isArr[i27] = c1823is;
            }
        }
        int i28 = c3036vN.a;
        for (int i29 = 0; i29 < i28; i29++) {
            C1031am0 c1031am6 = c3036vN.c[i29];
            Map map2 = (Map) c0814Ul.Z.get(i29);
            if (map2 != null && map2.containsKey(c1031am6)) {
                Map map3 = (Map) c0814Ul.Z.get(i29);
                if (map3 != null) {
                }
                c1823isArr[i29] = null;
            }
        }
        int i30 = 0;
        while (i30 < i19) {
            int i31 = c3036vN.b[i30];
            if (c0814Ul.a0.get(i30) || c0814Ul.K.contains(Integer.valueOf(i31))) {
                c1823isArr[i30] = null;
                i5 = 1;
            } else {
                i5 = 1;
            }
            i30 += i5;
        }
        C2691rp c2691rp = c1128bm.e;
        N7 n7 = c1128bm.b;
        AbstractC0397Ej.g(n7);
        InterfaceC1920js[] interfaceC1920jsArrQ = c2691rp.q(c1823isArr, n7);
        Y60[] y60Arr = new Y60[i19];
        for (int i32 = 0; i32 < i19; i32++) {
            y60Arr[i32] = (c0814Ul.a0.get(i32) || c0814Ul.K.contains(Integer.valueOf(c3036vN.b[i32])) || (c3036vN.b[i32] != -2 && interfaceC1920jsArrQ[i32] == null)) ? null : Y60.b;
        }
        if (c0814Ul.W) {
            int i33 = -1;
            int i34 = -1;
            int i35 = 0;
            while (true) {
                if (i35 >= c3036vN.a) {
                    z3 = true;
                    break;
                }
                int i36 = c3036vN.b[i35];
                InterfaceC1920js interfaceC1920js = interfaceC1920jsArrQ[i35];
                if (i36 != 1 && i36 != 2) {
                    i4 = 1;
                    break;
                    break;
                }
                if (interfaceC1920js != null) {
                    int[][] iArr12 = iArr5[i35];
                    int iB = c3036vN.c[i35].b(interfaceC1920js.j());
                    int i37 = 0;
                    while (true) {
                        if (i37 >= interfaceC1920js.length()) {
                            i4 = 1;
                            if (i36 != 1) {
                                if (i33 == -1) {
                                    i33 = i35;
                                    break;
                                }
                                z3 = false;
                                break;
                            }
                            if (i34 == -1) {
                                i34 = i35;
                                break;
                            }
                            z3 = false;
                            break;
                        }
                        if ((iArr12[iB][interfaceC1920js.f(i37)] & 32) == 32) {
                            i37++;
                        }
                    }
                }
                i4 = 1;
                break;
                i35 += i4;
            }
            if (((i34 == -1 || i33 == -1) ? false : true) & z3) {
                Y60 y60 = new Y60(true);
                y60Arr[i34] = y60;
                y60Arr[i33] = y60;
            }
        }
        Pair pairCreate = Pair.create(y60Arr, interfaceC1920jsArrQ);
        InterfaceC1920js[] interfaceC1920jsArr = (InterfaceC1920js[]) pairCreate.second;
        List[] listArr = new List[interfaceC1920jsArr.length];
        for (int i38 = 0; i38 < interfaceC1920jsArr.length; i38++) {
            InterfaceC1920js interfaceC1920js2 = interfaceC1920jsArr[i38];
            if (interfaceC1920js2 != null) {
                m60Q = AbstractC0985aF.q(interfaceC1920js2);
            } else {
                XE xe = AbstractC0985aF.m;
                m60Q = M60.p;
            }
            listArr[i38] = m60Q;
        }
        WE we = new WE();
        for (int i39 = 0; i39 < c3036vN.a; i39++) {
            C1031am0[] c1031am0Arr6 = c3036vN.c;
            C1031am0 c1031am7 = c1031am0Arr6[i39];
            List list = listArr[i39];
            int i40 = 0;
            while (i40 < c1031am7.l) {
                Zl0 zl0A3 = c1031am7.a(i40);
                int i41 = c1031am0Arr6[i39].a(i40).l;
                int[] iArr13 = new int[i41];
                int i42 = 0;
                int i43 = 0;
                while (i42 < i41) {
                    if ((c3036vN.e[i39][i40][i42] & 7) != 4) {
                        i3 = 1;
                    } else {
                        i3 = 1;
                        iArr13[i43] = i42;
                        i43++;
                    }
                    i42 += i3;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr13, i43);
                List[] listArr2 = listArr;
                String str2 = null;
                int iMin = 16;
                int i44 = 0;
                boolean z7 = false;
                int i45 = 0;
                while (i44 < iArrCopyOf.length) {
                    C1031am0 c1031am8 = c1031am7;
                    String str3 = c1031am0Arr6[i39].a(i40).f665o[iArrCopyOf[i44]].w;
                    int i46 = i45 + 1;
                    if (i45 == 0) {
                        str2 = str3;
                    } else {
                        z7 = (!Lr0.a(str2, str3)) | z7;
                    }
                    iMin = Math.min(iMin, c3036vN.e[i39][i40][i44] & 24);
                    i44++;
                    c1031am7 = c1031am8;
                    i45 = i46;
                }
                C1031am0 c1031am9 = c1031am7;
                if (z7) {
                    iMin = Math.min(iMin, c3036vN.d[i39]);
                }
                boolean z8 = iMin != 0;
                int i47 = zl0A3.l;
                int[] iArr14 = new int[i47];
                boolean[] zArr = new boolean[i47];
                int i48 = 0;
                while (i48 < zl0A3.l) {
                    iArr14[i48] = c3036vN.e[i39][i40][i48] & 7;
                    int i49 = 0;
                    while (true) {
                        if (i49 >= list.size()) {
                            i2 = 1;
                            z2 = false;
                            break;
                        }
                        InterfaceC1920js interfaceC1920js3 = (InterfaceC1920js) list.get(i49);
                        if (interfaceC1920js3.j().equals(zl0A3) && interfaceC1920js3.u(i48) != -1) {
                            i2 = 1;
                            z2 = true;
                            break;
                        }
                        i49++;
                    }
                    zArr[i48] = z2;
                    i48 += i2;
                }
                we.a(new C2007km0(zl0A3, z8, iArr14, zArr));
                i40++;
                listArr = listArr2;
                c1031am7 = c1031am9;
            }
        }
        int i50 = 0;
        while (true) {
            C1031am0 c1031am10 = c3036vN.f;
            if (i50 >= c1031am10.l) {
                break;
            }
            Zl0 zl0A4 = c1031am10.a(i50);
            int[] iArr15 = new int[zl0A4.l];
            Arrays.fill(iArr15, 0);
            we.a(new C2007km0(zl0A4, false, iArr15, new boolean[zl0A4.l]));
            i50++;
        }
        C1909jm0 c1909jm0 = new C1909jm0((Y60[]) pairCreate.first, (InterfaceC1920js[]) pairCreate.second, new C2105lm0(we.g()), c3036vN);
        for (InterfaceC1920js interfaceC1920js4 : (InterfaceC1920js[]) c1909jm0.n) {
            if (interfaceC1920js4 != null) {
                interfaceC1920js4.p(f);
            }
        }
        return c1909jm0;
    }

    public final void h() {
        InterfaceC2941uP interfaceC2941uP = this.a;
        if (interfaceC2941uP instanceof C0392Ee) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0392Ee c0392Ee = (C0392Ee) interfaceC2941uP;
            c0392Ee.p = 0L;
            c0392Ee.q = j;
        }
    }
}
