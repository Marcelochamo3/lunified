package o;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863Wi implements InterfaceC2941uP, Tb0, InterfaceC3152wd {
    public static final Pattern I = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final C0350Co A;
    public InterfaceC2844tP B;
    public C2133m1 E;
    public C0733Ri F;
    public int G;
    public List H;
    public final int l;
    public final C2681rk m;
    public final InterfaceC2590qm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0428Fo f602o;
    public final C0622Nb p;
    public final C1583gR q;
    public final long r;
    public final InterfaceC1773iL s;
    public final C1562g8 t;
    public final C1031am0 u;
    public final C0837Vi[] v;
    public final C0622Nb w;
    public final C3242xZ x;
    public final C2613qy z;
    public C3249xd[] C = new C3249xd[0];
    public C2114lr[] D = new C2114lr[0];
    public final IdentityHashMap y = new IdentityHashMap();

    public C0863Wi(int i, C0733Ri c0733Ri, C1583gR c1583gR, int i2, C2681rk c2681rk, InterfaceC2590qm0 interfaceC2590qm0, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, C0622Nb c0622Nb, C2613qy c2613qy, long j, InterfaceC1773iL interfaceC1773iL, C1562g8 c1562g8, C0622Nb c0622Nb2, C0915Yi c0915Yi, C3436zZ c3436zZ) {
        int i3;
        int i4;
        int i5;
        int i6;
        C0643Nw[] c0643NwArr;
        C0643Nw[] c0643NwArrG;
        C2589qm c2589qmA;
        Integer num;
        InterfaceC0428Fo interfaceC0428Fo2 = interfaceC0428Fo;
        int i7 = 0;
        this.l = i;
        this.F = c0733Ri;
        this.q = c1583gR;
        this.G = i2;
        this.m = c2681rk;
        this.n = interfaceC2590qm0;
        this.f602o = interfaceC0428Fo2;
        this.A = c0350Co;
        this.p = c0622Nb;
        this.z = c2613qy;
        this.r = j;
        this.s = interfaceC1773iL;
        this.t = c1562g8;
        this.w = c0622Nb2;
        this.x = new C3242xZ(c0733Ri, c0915Yi, c1562g8);
        C3249xd[] c3249xdArr = this.C;
        c0622Nb2.getClass();
        this.E = new C2133m1(10, c3249xdArr);
        EY eyB = c0733Ri.b(i2);
        List list = eyB.d;
        this.H = list;
        List list2 = eyB.c;
        int size = list2.size();
        HashMap map = new HashMap(Ou0.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            map.put(Long.valueOf(((V1) list2.get(i8)).a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            V1 v1 = (V1) list2.get(i9);
            C2589qm c2589qmA2 = a("http://dashif.org/guidelines/trickmode", v1.e);
            List list3 = v1.f;
            c2589qmA2 = c2589qmA2 == null ? a("http://dashif.org/guidelines/trickmode", list3) : c2589qmA2;
            int iIntValue = (c2589qmA2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c2589qmA2.b)))) == null) ? i9 : num.intValue();
            if (iIntValue == i9 && (c2589qmA = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i10 = Lr0.a;
                for (String str : c2589qmA.b.split(",", -1)) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i9) {
                List list4 = (List) sparseArray.get(i9);
                List list5 = (List) sparseArray.get(iIntValue);
                list5.addAll(list4);
                sparseArray.put(i9, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] iArrV = Pu0.v((Collection) arrayList.get(i11));
            iArr[i11] = iArrV;
            Arrays.sort(iArrV);
        }
        boolean[] zArr = new boolean[size2];
        C0643Nw[][] c0643NwArr2 = new C0643Nw[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            int[] iArr2 = iArr[i12];
            int length = iArr2.length;
            int i14 = 0;
            while (i14 < length) {
                List list6 = ((V1) list2.get(iArr2[i14])).c;
                while (i7 < list6.size()) {
                    if (!((AbstractC1853j70) list6.get(i7)).f839o.isEmpty()) {
                        zArr[i12] = true;
                        i13++;
                        break;
                    }
                    i7++;
                }
                i14++;
                i7 = 0;
            }
            int[] iArr3 = iArr[i12];
            int length2 = iArr3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    i6 = 1;
                    c0643NwArr = new C0643Nw[0];
                    break;
                }
                int i16 = iArr3[i15];
                V1 v2 = (V1) list2.get(i16);
                List list7 = ((V1) list2.get(i16)).d;
                int[] iArr4 = iArr3;
                int i17 = 0;
                while (true) {
                    if (i17 < list7.size()) {
                        C2589qm c2589qm = (C2589qm) list7.get(i17);
                        int i18 = length2;
                        List list8 = list7;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(c2589qm.a)) {
                            C0617Mw c0617Mw = new C0617Mw();
                            c0617Mw.k = "application/cea-608";
                            c0617Mw.a = AbstractC1674hK.q(new StringBuilder(), v2.a, ":cea608");
                            c0643NwArrG = g(c2589qm, I, new C0643Nw(c0617Mw));
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(c2589qm.a)) {
                            C0617Mw c0617Mw2 = new C0617Mw();
                            c0617Mw2.k = "application/cea-708";
                            c0617Mw2.a = AbstractC1674hK.q(new StringBuilder(), v2.a, ":cea708");
                            c0643NwArrG = g(c2589qm, J, new C0643Nw(c0617Mw2));
                        } else {
                            i17++;
                            length2 = i18;
                            list7 = list8;
                        }
                        c0643NwArr = c0643NwArrG;
                        i6 = 1;
                        break;
                    }
                    i15++;
                    iArr3 = iArr4;
                }
            }
            c0643NwArr2[i12] = c0643NwArr;
            if (c0643NwArr.length != 0) {
                i13 += i6;
            }
            i12 += i6;
            i7 = 0;
        }
        int size3 = list.size() + i13 + size2;
        Zl0[] zl0Arr = new Zl0[size3];
        C0837Vi[] c0837ViArr = new C0837Vi[size3];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr5 = iArr[i19];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i21 = size2;
            int i22 = 0;
            while (i22 < length3) {
                arrayList3.addAll(((V1) list2.get(iArr5[i22])).c);
                i22++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            C0643Nw[] c0643NwArr3 = new C0643Nw[size4];
            int i23 = 0;
            while (i23 < size4) {
                int i24 = size4;
                C0643Nw c0643Nw = ((AbstractC1853j70) arrayList3.get(i23)).l;
                ArrayList arrayList4 = arrayList3;
                int iO = interfaceC0428Fo2.o(c0643Nw);
                C0617Mw c0617MwA = c0643Nw.a();
                c0617MwA.F = iO;
                c0643NwArr3[i23] = c0617MwA.a();
                i23++;
                size4 = i24;
                arrayList3 = arrayList4;
            }
            V1 v3 = (V1) list2.get(iArr5[0]);
            long j2 = v3.a;
            String string = j2 != -1 ? Long.toString(j2) : AbstractC1674hK.n(i19, "unset:");
            int i25 = i20 + 1;
            if (zArr[i19]) {
                i3 = i20 + 2;
                i4 = i25;
            } else {
                i3 = i25;
                i4 = -1;
            }
            if (c0643NwArr2[i19].length != 0) {
                i5 = i3;
                i3++;
            } else {
                i5 = -1;
            }
            zl0Arr[i20] = new Zl0(string, c0643NwArr3);
            c0837ViArr[i20] = new C0837Vi(v3.b, 0, iArr5, i20, i4, i5, -1);
            int i26 = i4;
            int i27 = -1;
            if (i26 != -1) {
                String strD = AbstractC1701hf0.d(string, ":emsg");
                C0617Mw c0617Mw3 = new C0617Mw();
                c0617Mw3.a = strD;
                c0617Mw3.k = "application/x-emsg";
                zl0Arr[i26] = new Zl0(strD, new C0643Nw(c0617Mw3));
                c0837ViArr[i26] = new C0837Vi(5, 1, iArr5, i20, -1, -1, -1);
                i27 = -1;
            }
            if (i5 != i27) {
                zl0Arr[i5] = new Zl0(AbstractC1701hf0.d(string, ":cc"), c0643NwArr2[i19]);
                c0837ViArr[i5] = new C0837Vi(3, 1, iArr5, i20, -1, -1, -1);
            }
            i19++;
            size2 = i21;
            iArr = iArr6;
            interfaceC0428Fo2 = interfaceC0428Fo;
            i20 = i3;
            list2 = list2;
            zArr = zArr;
        }
        int i28 = 0;
        while (i28 < list.size()) {
            C2211mr c2211mr = (C2211mr) list.get(i28);
            C0617Mw c0617Mw4 = new C0617Mw();
            c0617Mw4.a = c2211mr.a();
            c0617Mw4.k = "application/x-emsg";
            zl0Arr[i20] = new Zl0(c2211mr.a() + ":" + i28, new C0643Nw(c0617Mw4));
            c0837ViArr[i20] = new C0837Vi(5, 2, new int[0], -1, -1, -1, i28);
            i28++;
            i20++;
        }
        Pair pairCreate = Pair.create(new C1031am0(zl0Arr), c0837ViArr);
        this.u = (C1031am0) pairCreate.first;
        this.v = (C0837Vi[]) pairCreate.second;
    }

    public static C2589qm a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C2589qm c2589qm = (C2589qm) list.get(i);
            if (str.equals(c2589qm.a)) {
                return c2589qm;
            }
        }
        return null;
    }

    public static C0643Nw[] g(C2589qm c2589qm, Pattern pattern, C0643Nw c0643Nw) {
        String str = c2589qm.b;
        if (str == null) {
            return new C0643Nw[]{c0643Nw};
        }
        int i = Lr0.a;
        String[] strArrSplit = str.split(";", -1);
        C0643Nw[] c0643NwArr = new C0643Nw[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new C0643Nw[]{c0643Nw};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            C0617Mw c0617MwA = c0643Nw.a();
            c0617MwA.a = c0643Nw.l + ":" + i3;
            c0617MwA.C = i3;
            c0617MwA.c = matcher.group(2);
            c0643NwArr[i2] = new C0643Nw(c0617MwA);
        }
        return c0643NwArr;
    }

    @Override // o.Ub0
    public final long A() {
        return this.E.A();
    }

    @Override // o.InterfaceC2941uP
    public final void B() {
        this.s.a();
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        long j2;
        for (C3249xd c3249xd : this.C) {
            if (!c3249xd.n()) {
                C90 c90 = c3249xd.x;
                int i = c90.q;
                c90.h(j, z, true);
                C90 c91 = c3249xd.x;
                int i2 = c91.q;
                if (i2 > i) {
                    synchronized (c91) {
                        j2 = c91.p == 0 ? Long.MIN_VALUE : c91.n[c91.r];
                    }
                    int i3 = 0;
                    while (true) {
                        C90[] c90Arr = c3249xd.y;
                        if (i3 >= c90Arr.length) {
                            break;
                        }
                        c90Arr[i3].h(j2, z, c3249xd.f1120o[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(c3249xd.r(i2, 0), c3249xd.F);
                if (iMin > 0) {
                    Lr0.P(c3249xd.v, 0, iMin);
                    c3249xd.F -= iMin;
                }
            }
        }
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        D90[] d90Arr2;
        Zl0 zl0A;
        int i3;
        Zl0 zl0A2;
        int i4;
        C3145wZ c3145wZ;
        boolean z2;
        InterfaceC1920js[] interfaceC1920jsArr2 = interfaceC1920jsArr;
        D90[] d90Arr3 = d90Arr;
        int[] iArr3 = new int[interfaceC1920jsArr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= interfaceC1920jsArr2.length) {
                break;
            }
            InterfaceC1920js interfaceC1920js = interfaceC1920jsArr2[i5];
            if (interfaceC1920js != null) {
                iArr3[i5] = this.u.b(interfaceC1920js.j());
            } else {
                iArr3[i5] = -1;
            }
            i5++;
        }
        for (int i6 = 0; i6 < interfaceC1920jsArr2.length; i6++) {
            if (interfaceC1920jsArr2[i6] == null || !zArr[i6]) {
                D90 d90 = d90Arr3[i6];
                if (d90 instanceof C3249xd) {
                    ((C3249xd) d90).s(this);
                } else if (d90 instanceof C3055vd) {
                    C3055vd c3055vd = (C3055vd) d90;
                    C3249xd c3249xd = c3055vd.p;
                    boolean[] zArr3 = c3249xd.f1120o;
                    int i7 = c3055vd.n;
                    AbstractC0397Ej.f(zArr3[i7]);
                    c3249xd.f1120o[i7] = false;
                }
                d90Arr3[i6] = null;
            }
        }
        int i8 = 0;
        while (true) {
            z = true;
            if (i8 >= interfaceC1920jsArr2.length) {
                break;
            }
            D90 d91 = d90Arr3[i8];
            if ((d91 instanceof C1526fq) || (d91 instanceof C3055vd)) {
                int iF = f(i8, iArr3);
                if (iF == -1) {
                    z2 = d90Arr3[i8] instanceof C1526fq;
                } else {
                    D90 d92 = d90Arr3[i8];
                    z2 = (d92 instanceof C3055vd) && ((C3055vd) d92).l == d90Arr3[iF];
                }
                if (!z2) {
                    D90 d93 = d90Arr3[i8];
                    if (d93 instanceof C3055vd) {
                        C3055vd c3055vd2 = (C3055vd) d93;
                        C3249xd c3249xd2 = c3055vd2.p;
                        boolean[] zArr4 = c3249xd2.f1120o;
                        int i9 = c3055vd2.n;
                        AbstractC0397Ej.f(zArr4[i9]);
                        c3249xd2.f1120o[i9] = false;
                    }
                    d90Arr3[i8] = null;
                }
            }
            i8++;
        }
        int i10 = 0;
        while (i10 < interfaceC1920jsArr2.length) {
            InterfaceC1920js interfaceC1920js2 = interfaceC1920jsArr2[i10];
            if (interfaceC1920js2 == null) {
                i2 = i10;
                iArr2 = iArr3;
                d90Arr2 = d90Arr3;
            } else {
                D90 d94 = d90Arr3[i10];
                if (d94 == null) {
                    zArr2[i10] = z;
                    C0837Vi c0837Vi = this.v[iArr3[i10]];
                    int i11 = c0837Vi.c;
                    if (i11 == 0) {
                        int i12 = c0837Vi.f;
                        boolean z3 = i12 != i;
                        if (z3) {
                            zl0A = this.u.a(i12);
                            i3 = 1;
                        } else {
                            zl0A = null;
                            i3 = 0;
                        }
                        int i13 = c0837Vi.g;
                        boolean z4 = i13 != i;
                        if (z4) {
                            zl0A2 = this.u.a(i13);
                            i3 += zl0A2.l;
                        } else {
                            zl0A2 = null;
                        }
                        C0643Nw[] c0643NwArr = new C0643Nw[i3];
                        int[] iArr4 = new int[i3];
                        if (z3) {
                            c0643NwArr[0] = zl0A.f665o[0];
                            iArr4[0] = 5;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z4) {
                            for (int i14 = 0; i14 < zl0A2.l; i14++) {
                                C0643Nw c0643Nw = zl0A2.f665o[i14];
                                c0643NwArr[i4] = c0643Nw;
                                iArr4[i4] = 3;
                                arrayList.add(c0643Nw);
                                i4++;
                            }
                        }
                        if (this.F.d && z3) {
                            C3242xZ c3242xZ = this.x;
                            c3145wZ = new C3145wZ(c3242xZ, c3242xZ.l);
                        } else {
                            c3145wZ = null;
                        }
                        C2681rk c2681rk = this.m;
                        InterfaceC1773iL interfaceC1773iL = this.s;
                        C0733Ri c0733Ri = this.F;
                        int i15 = i10;
                        C1583gR c1583gR = this.q;
                        int[] iArr5 = iArr3;
                        int i16 = this.G;
                        int[] iArr6 = c0837Vi.a;
                        int i17 = c0837Vi.b;
                        C3145wZ c3145wZ2 = c3145wZ;
                        long j2 = this.r;
                        InterfaceC2590qm0 interfaceC2590qm0 = this.n;
                        InterfaceC2583qj interfaceC2583qjH = c2681rk.a.H();
                        if (interfaceC2590qm0 != null) {
                            interfaceC2583qjH.k(interfaceC2590qm0);
                        }
                        i2 = i15;
                        iArr2 = iArr5;
                        C3249xd c3249xd3 = new C3249xd(c0837Vi.b, iArr4, c0643NwArr, new C2972uk(interfaceC1773iL, c0733Ri, c1583gR, i16, iArr6, interfaceC1920js2, i17, interfaceC2583qjH, j2, z3, arrayList, c3145wZ2), this, this.t, j, this.f602o, this.A, this.p, this.z);
                        synchronized (this) {
                            this.y.put(c3249xd3, c3145wZ2);
                        }
                        d90Arr2 = d90Arr;
                        d90Arr2[i2] = c3249xd3;
                    } else {
                        i2 = i10;
                        iArr2 = iArr3;
                        d90Arr2 = d90Arr3;
                        if (i11 == 2) {
                            d90Arr2[i2] = new C2114lr((C2211mr) this.H.get(c0837Vi.d), interfaceC1920js2.j().f665o[0], this.F.d);
                        }
                    }
                } else {
                    i2 = i10;
                    iArr2 = iArr3;
                    d90Arr2 = d90Arr3;
                    if (d94 instanceof C3249xd) {
                        ((C3249xd) d94).p.i = interfaceC1920js2;
                    }
                }
            }
            i10 = i2 + 1;
            d90Arr3 = d90Arr2;
            iArr3 = iArr2;
            z = true;
            i = -1;
            interfaceC1920jsArr2 = interfaceC1920jsArr;
        }
        int[] iArr7 = iArr3;
        D90[] d90Arr4 = d90Arr3;
        int i18 = 0;
        while (i18 < interfaceC1920jsArr.length) {
            if (d90Arr4[i18] != null || interfaceC1920jsArr[i18] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C0837Vi c0837Vi2 = this.v[iArr[i18]];
                if (c0837Vi2.c == 1) {
                    int iF2 = f(i18, iArr);
                    if (iF2 == -1) {
                        d90Arr4[i18] = new C1526fq();
                    } else {
                        C3249xd c3249xd4 = (C3249xd) d90Arr4[iF2];
                        int i19 = c0837Vi2.b;
                        int i20 = 0;
                        while (true) {
                            C90[] c90Arr = c3249xd4.y;
                            if (i20 >= c90Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c3249xd4.m[i20] == i19) {
                                boolean[] zArr5 = c3249xd4.f1120o;
                                AbstractC0397Ej.f(!zArr5[i20]);
                                zArr5[i20] = true;
                                c90Arr[i20].E(j, true);
                                d90Arr4[i18] = new C3055vd(c3249xd4, c3249xd4, c90Arr[i20], i20);
                                break;
                            }
                            i20++;
                        }
                    }
                }
                i18++;
                iArr7 = iArr;
            }
            i18++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (D90 d95 : d90Arr4) {
            if (d95 instanceof C3249xd) {
                arrayList2.add((C3249xd) d95);
            } else if (d95 instanceof C2114lr) {
                arrayList3.add((C2114lr) d95);
            }
        }
        C3249xd[] c3249xdArr = new C3249xd[arrayList2.size()];
        this.C = c3249xdArr;
        arrayList2.toArray(c3249xdArr);
        C2114lr[] c2114lrArr = new C2114lr[arrayList3.size()];
        this.D = c2114lrArr;
        arrayList3.toArray(c2114lrArr);
        C0622Nb c0622Nb = this.w;
        C3249xd[] c3249xdArr2 = this.C;
        c0622Nb.getClass();
        this.E = new C2133m1(10, c3249xdArr2);
        return j;
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        AbstractC1269d8 abstractC1269d8;
        boolean zE;
        for (C3249xd c3249xd : this.C) {
            c3249xd.E = j;
            if (c3249xd.n()) {
                c3249xd.D = j;
            } else {
                int i = 0;
                while (true) {
                    if (i < c3249xd.v.size()) {
                        abstractC1269d8 = (AbstractC1269d8) c3249xd.v.get(i);
                        long j2 = abstractC1269d8.r;
                        if (j2 == j && abstractC1269d8.v == -9223372036854775807L) {
                            break;
                        }
                        if (j2 <= j) {
                            i++;
                        }
                    }
                    abstractC1269d8 = null;
                    break;
                }
                if (abstractC1269d8 != null) {
                    C90 c90 = c3249xd.x;
                    int iD = abstractC1269d8.d(0);
                    synchronized (c90) {
                        c90.C();
                        int i2 = c90.q;
                        if (iD < i2 || iD > c90.p + i2) {
                            zE = false;
                        } else {
                            c90.t = Long.MIN_VALUE;
                            c90.s = iD - i2;
                            zE = true;
                        }
                    }
                } else {
                    zE = c3249xd.x.E(j, j < c3249xd.o());
                }
                if (zE) {
                    c3249xd.F = c3249xd.r(c3249xd.x.q(), 0);
                    C90[] c90Arr = c3249xd.y;
                    for (C90 c91 : c90Arr) {
                        c91.E(j, true);
                    }
                } else {
                    c3249xd.D = j;
                    c3249xd.H = false;
                    c3249xd.v.clear();
                    c3249xd.F = 0;
                    if (c3249xd.t.M()) {
                        c3249xd.x.i();
                        for (C90 c92 : c3249xd.y) {
                            c92.i();
                        }
                        c3249xd.t.r();
                    } else {
                        c3249xd.t.f414o = null;
                        c3249xd.x.B(false);
                        for (C90 c93 : c3249xd.y) {
                            c93.B(false);
                        }
                    }
                }
            }
        }
        for (C2114lr c2114lr : this.D) {
            int iB = Lr0.b(c2114lr.n, j, true);
            c2114lr.r = iB;
            c2114lr.s = (c2114lr.f901o && iB == c2114lr.n.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        return this.E.K(j);
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        for (C3249xd c3249xd : this.C) {
            if (c3249xd.l == 2) {
                for (C2778sk c2778sk : c3249xd.p.h) {
                    InterfaceC1219cj interfaceC1219cj = c2778sk.d;
                    if (interfaceC1219cj != null) {
                        long j2 = c2778sk.e;
                        long jY = interfaceC1219cj.y(j2);
                        if (jY != 0) {
                            InterfaceC1219cj interfaceC1219cj2 = c2778sk.d;
                            long jC = interfaceC1219cj2.c(j, j2);
                            long j3 = c2778sk.f;
                            long j4 = jC + j3;
                            long jD = c2778sk.d(j4);
                            return c2761sb0.a(j, jD, (jD >= j || (jY != -1 && j4 >= ((interfaceC1219cj2.u() + j3) + jY) - 1)) ? jD : c2778sk.d(j4 + 1));
                        }
                    }
                }
                return j;
            }
        }
        return j;
    }

    @Override // o.Ub0
    public final void O(long j) {
        this.E.O(j);
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.E.b();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.B = interfaceC2844tP;
        interfaceC2844tP.d(this);
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        this.B.e(this);
    }

    public final int f(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        C0837Vi[] c0837ViArr = this.v;
        int i3 = c0837ViArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && c0837ViArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // o.Ub0
    public final long o() {
        return this.E.o();
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        return this.u;
    }
}
