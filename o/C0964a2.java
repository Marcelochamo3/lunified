package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964a2 extends AbstractC2438p8 {
    public final N7 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0985aF f670o;
    public final Sh0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public AbstractC2843tO u;

    public C0964a2(Zl0 zl0, int[] iArr, int i, N7 n7, long j, long j2, long j3, int i2, int i3, float f, float f2, AbstractC0985aF abstractC0985aF, Sh0 sh0) {
        long j4;
        super(zl0, iArr);
        if (j3 < j) {
            AP.z();
            j4 = j;
        } else {
            j4 = j3;
        }
        this.g = n7;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j4 * 1000;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.f670o = AbstractC0985aF.l(abstractC0985aF);
        this.p = sh0;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static M60 v(C1823is[] c1823isArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= c1823isArr.length) {
                break;
            }
            C1823is c1823is = c1823isArr[i3];
            if (c1823is == null || c1823is.b.length <= 1) {
                arrayList.add(null);
            } else {
                WE weK = AbstractC0985aF.k();
                weK.c(new Z1(0L, 0L));
                arrayList.add(weK);
            }
            i3++;
        }
        int length = c1823isArr.length;
        long[][] jArr = new long[length][];
        for (int i4 = 0; i4 < c1823isArr.length; i4++) {
            C1823is c1823is2 = c1823isArr[i4];
            if (c1823is2 == null) {
                jArr[i4] = new long[0];
            } else {
                int[] iArr = c1823is2.b;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j = c1823is2.a.f665o[iArr[i5]].s;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        w(arrayList, jArr3);
        C3333yT c3333yT = C3333yT.l;
        c3333yT.getClass();
        OS osC = new MS(c3333yT).e().c();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    int i9 = length;
                    long j2 = jArr6[i8];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i8] = dLog;
                    i8++;
                    length = i9;
                }
                i2 = length;
                int i10 = length2 - 1;
                double d = dArr[i10] - dArr[0];
                int i11 = 0;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    osC.c(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i7));
                }
            }
            i7++;
            length = i2;
            i = 1;
        }
        C0960a0 c0960a0 = osC.m;
        if (c0960a0 == null) {
            c0960a0 = new C0960a0(0, osC);
            osC.m = c0960a0;
        }
        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(c0960a0);
        for (int i12 = 0; i12 < abstractC0985aFL.size(); i12++) {
            int iIntValue = ((Integer) abstractC0985aFL.get(i12)).intValue();
            int i13 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            w(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < c1823isArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr3[i14] = jArr3[i14] * 2;
            }
        }
        w(arrayList, jArr3);
        WE weK2 = AbstractC0985aF.k();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            WE we = (WE) arrayList.get(i15);
            weK2.c(we == null ? AbstractC0985aF.o() : we.g());
        }
        return weK2.g();
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            WE we = (WE) arrayList.get(i);
            if (we != null) {
                we.a(new Z1(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC2843tO abstractC2843tO = (AbstractC2843tO) UK.t(list);
        long j = abstractC2843tO.r;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = abstractC2843tO.s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // o.AbstractC2438p8, o.InterfaceC1920js
    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // o.AbstractC2438p8, o.InterfaceC1920js
    public final int g(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC2843tO) UK.t(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (AbstractC2843tO) UK.t(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jZ = Lr0.z(((AbstractC2843tO) list.get(size - 1)).r - j, this.q);
        long j3 = this.j;
        if (jZ < j3) {
            return size;
        }
        y(list);
        C0643Nw c0643Nw = this.d[x(jElapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2843tO abstractC2843tO = (AbstractC2843tO) list.get(i3);
            C0643Nw c0643Nw2 = abstractC2843tO.f1028o;
            if (Lr0.z(abstractC2843tO.r - j, this.q) >= j3 && c0643Nw2.s < c0643Nw.s && (i = c0643Nw2.C) != -1 && i <= this.l && (i2 = c0643Nw2.B) != -1 && i2 <= this.k && i < c0643Nw.C) {
                return i3;
            }
        }
        return size;
    }

    @Override // o.AbstractC2438p8, o.InterfaceC1920js
    public final void h() {
        this.u = null;
    }

    @Override // o.InterfaceC1920js
    public final int m() {
        return this.s;
    }

    @Override // o.InterfaceC1920js
    public final int n() {
        return this.r;
    }

    @Override // o.AbstractC2438p8, o.InterfaceC1920js
    public final void p(float f) {
        this.q = f;
    }

    @Override // o.InterfaceC1920js
    public final Object q() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    @Override // o.InterfaceC1920js
    public final void s(long j, long j2, long j3, List list, InterfaceC2940uO[] interfaceC2940uOArr) {
        long jY;
        long jA;
        long jD;
        int i;
        int i2;
        int iA;
        int iX;
        long jMin;
        int i3;
        int i4;
        long j4;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.r;
        if (i5 >= interfaceC2940uOArr.length || !interfaceC2940uOArr[i5].next()) {
            int length = interfaceC2940uOArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    jY = y(list);
                    break;
                }
                InterfaceC2940uO interfaceC2940uO = interfaceC2940uOArr[i6];
                if (interfaceC2940uO.next()) {
                    jA = interfaceC2940uO.a();
                    jD = interfaceC2940uO.d();
                } else {
                    i6++;
                }
            }
            i = this.s;
            if (i == 0) {
                this.s = 1;
                this.r = x(jElapsedRealtime);
                return;
            }
            i2 = this.r;
            if (list.isEmpty()) {
                iA = -1;
            } else {
                iA = a(((AbstractC2843tO) UK.t(list)).f1028o);
            }
            if (iA != -1) {
                i = ((AbstractC2843tO) UK.t(list)).p;
                i2 = iA;
            }
            iX = x(jElapsedRealtime);
            if (iX != i2 && !c(i2, jElapsedRealtime)) {
                C0643Nw[] c0643NwArr = this.d;
                C0643Nw c0643Nw = c0643NwArr[i2];
                C0643Nw c0643Nw2 = c0643NwArr[iX];
                jMin = this.h;
                if (j3 != -9223372036854775807L) {
                    if (jY != -9223372036854775807L) {
                        j4 = j3 - jY;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.n), jMin);
                }
                i3 = c0643Nw2.s;
                i4 = c0643Nw.s;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.i)) {
                }
            }
            if (iX != i2) {
                i = 3;
            }
            this.s = i;
            this.r = iX;
        }
        InterfaceC2940uO interfaceC2940uO2 = interfaceC2940uOArr[this.r];
        jA = interfaceC2940uO2.a();
        jD = interfaceC2940uO2.d();
        jY = jA - jD;
        i = this.s;
        if (i == 0) {
            this.s = 1;
            this.r = x(jElapsedRealtime);
            return;
        }
        i2 = this.r;
        if (list.isEmpty()) {
            iA = -1;
        } else {
            iA = a(((AbstractC2843tO) UK.t(list)).f1028o);
        }
        if (iA != -1) {
            i = ((AbstractC2843tO) UK.t(list)).p;
            i2 = iA;
        }
        iX = x(jElapsedRealtime);
        if (iX != i2) {
            C0643Nw[] c0643NwArr2 = this.d;
            C0643Nw c0643Nw3 = c0643NwArr2[i2];
            C0643Nw c0643Nw4 = c0643NwArr2[iX];
            jMin = this.h;
            if (j3 != -9223372036854775807L) {
                if (jY != -9223372036854775807L) {
                    j4 = j3 - jY;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.n), jMin);
            }
            i3 = c0643Nw4.s;
            i4 = c0643Nw3.s;
            iX = i3 <= i4 ? i2 : i2;
        }
        if (iX != i2) {
            i = 3;
        }
        this.s = i;
        this.r = iX;
    }

    public final int x(long j) {
        long j2;
        C2197mk c2197mk = (C2197mk) this.g;
        synchronized (c2197mk) {
            j2 = c2197mk.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.f670o.isEmpty()) {
            int i = 1;
            while (i < this.f670o.size() - 1 && ((Z1) this.f670o.get(i)).a < j4) {
                i++;
            }
            Z1 z1 = (Z1) this.f670o.get(i - 1);
            Z1 z2 = (Z1) this.f670o.get(i);
            long j5 = z1.a;
            float f = (j4 - j5) / (z2.a - j5);
            long j6 = z1.b;
            j4 = j6 + ((long) (f * (z2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !c(i3, j)) {
                if (d(i3).s <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
