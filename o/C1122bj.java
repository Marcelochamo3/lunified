package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122bj extends AbstractC1464f8 {
    public InterfaceC2583qj A;
    public Na0 B;
    public InterfaceC2590qm0 C;
    public C0811Ui D;
    public Handler E;
    public C1385eP F;
    public Uri G;
    public final Uri H;
    public C0733Ri I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public final C1971kP h;
    public final boolean i;
    public final InterfaceC2486pj j;
    public final C2681rk k;
    public final C0622Nb l;
    public final InterfaceC0428Fo m;
    public final C0622Nb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1583gR f703o;
    public final long p;
    public final long q;
    public final C2613qy r;
    public final InterfaceC3046vX s;
    public final C0915Yi t;
    public final Object u;
    public final SparseArray v;
    public final RunnableC0889Xi w;
    public final RunnableC0889Xi x;
    public final C0915Yi y;
    public final InterfaceC1773iL z;

    static {
        AbstractC1726hs.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [o.Xi] */
    /* JADX WARN: Type inference failed for: r2v12, types: [o.Xi] */
    public C1122bj(C1971kP c1971kP, InterfaceC2486pj interfaceC2486pj, InterfaceC3046vX interfaceC3046vX, C2681rk c2681rk, C0622Nb c0622Nb, InterfaceC0428Fo interfaceC0428Fo, C0622Nb c0622Nb2, long j, long j2) {
        this.h = c1971kP;
        this.F = c1971kP.n;
        C1483fP c1483fP = c1971kP.m;
        c1483fP.getClass();
        Uri uri = c1483fP.l;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.j = interfaceC2486pj;
        this.s = interfaceC3046vX;
        this.k = c2681rk;
        this.m = interfaceC0428Fo;
        this.n = c0622Nb2;
        this.p = j;
        this.q = j2;
        this.l = c0622Nb;
        this.f703o = new C1583gR(2);
        this.i = false;
        this.r = a(null);
        this.u = new Object();
        this.v = new SparseArray();
        this.y = new C0915Yi(this, 1);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.t = new C0915Yi(this, 2);
        this.z = new C0915Yi(this, 3);
        final int i = 0;
        this.w = new Runnable(this) { // from class: o.Xi
            public final /* synthetic */ C1122bj m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.m.v();
                        break;
                    default:
                        this.m.u(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.x = new Runnable(this) { // from class: o.Xi
            public final /* synthetic */ C1122bj m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.m.v();
                        break;
                    default:
                        this.m.u(false);
                        break;
                }
            }
        };
    }

    public static boolean s(EY ey) {
        int i = 0;
        while (true) {
            List list = ey.c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((V1) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            i++;
        }
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        int iIntValue = ((Integer) cp.a).intValue() - this.P;
        C2613qy c2613qyA = a(cp);
        C0350Co c0350Co = new C0350Co(this.d.c, 0, cp);
        int i = this.P + iIntValue;
        C0733Ri c0733Ri = this.I;
        InterfaceC2590qm0 interfaceC2590qm0 = this.C;
        long j2 = this.M;
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        C0863Wi c0863Wi = new C0863Wi(i, c0733Ri, this.f703o, iIntValue, this.k, interfaceC2590qm0, this.m, c0350Co, this.n, c2613qyA, j2, this.z, c1562g8, this.l, this.y, c3436zZ);
        this.v.put(i, c0863Wi);
        return c0863Wi;
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        return this.h;
    }

    @Override // o.AbstractC1464f8
    public final void j() {
        this.z.a();
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.C = interfaceC2590qm0;
        Looper looperMyLooper = Looper.myLooper();
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        InterfaceC0428Fo interfaceC0428Fo = this.m;
        interfaceC0428Fo.d(looperMyLooper, c3436zZ);
        interfaceC0428Fo.r();
        if (this.i) {
            u(false);
            return;
        }
        this.A = this.j.H();
        this.B = new Na0("DashMediaSource");
        this.E = Lr0.n(null);
        v();
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        C0863Wi c0863Wi = (C0863Wi) interfaceC2941uP;
        C3242xZ c3242xZ = c0863Wi.x;
        c3242xZ.t = true;
        c3242xZ.f1116o.removeCallbacksAndMessages(null);
        for (C3249xd c3249xd : c0863Wi.C) {
            c3249xd.s(c0863Wi);
        }
        c0863Wi.B = null;
        this.v.remove(c0863Wi.l);
    }

    @Override // o.AbstractC1464f8
    public final void p() {
        this.J = false;
        this.A = null;
        Na0 na0 = this.B;
        if (na0 != null) {
            na0.Q(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.I = this.i ? this.I : null;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.v.clear();
        C1583gR c1583gR = this.f703o;
        ((HashMap) c1583gR.m).clear();
        ((HashMap) c1583gR.n).clear();
        ((HashMap) c1583gR.f793o).clear();
        this.m.a();
    }

    public final void t() {
        boolean z;
        Na0 na0 = this.B;
        C0915Yi c0915Yi = new C0915Yi(this, 0);
        synchronized (Jp0.d) {
            z = Jp0.e;
        }
        if (z) {
            c0915Yi.b();
            return;
        }
        if (na0 == null) {
            na0 = new Na0("SntpClient");
        }
        na0.S(new C2743sL(14), new L80(c0915Yi), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x04af  */
    public final void u(boolean z) {
        EY ey;
        List list;
        boolean z2;
        long j;
        long j2;
        long j3;
        InterfaceC1219cj interfaceC1219cjD;
        long jMin;
        float f;
        float f2;
        C1288dP c1288dP;
        long j4;
        boolean z3 = false;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.v;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt >= this.P) {
                C0863Wi c0863Wi = (C0863Wi) sparseArray.valueAt(i);
                C0733Ri c0733Ri = this.I;
                int i2 = iKeyAt - this.P;
                c0863Wi.F = c0733Ri;
                c0863Wi.G = i2;
                C3242xZ c3242xZ = c0863Wi.x;
                c3242xZ.s = z3;
                c3242xZ.q = c0733Ri;
                Iterator it = c3242xZ.p.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < c3242xZ.q.h) {
                        it.remove();
                    }
                }
                C3249xd[] c3249xdArr = c0863Wi.C;
                if (c3249xdArr != null) {
                    for (C3249xd c3249xd : c3249xdArr) {
                        C2972uk c2972uk = c3249xd.p;
                        C2778sk[] c2778skArr = c2972uk.h;
                        try {
                            c2972uk.j = c0733Ri;
                            c2972uk.k = i2;
                            long jD = c0733Ri.d(i2);
                            ArrayList arrayListA = c2972uk.a();
                            for (int i3 = 0; i3 < c2778skArr.length; i3++) {
                                c2778skArr[i3] = c2778skArr[i3].a(jD, (AbstractC1853j70) arrayListA.get(c2972uk.i.f(i3)));
                            }
                        } catch (B8 e) {
                            c2972uk.l = e;
                        }
                    }
                    c0863Wi.B.e(c0863Wi);
                }
                c0863Wi.H = c0733Ri.b(i2).d;
                for (C2114lr c2114lr : c0863Wi.D) {
                    for (C2211mr c2211mr : c0863Wi.H) {
                        if (c2211mr.a().equals(c2114lr.p.a())) {
                            c2114lr.b(c2211mr, c0733Ri.d && i2 == c0733Ri.m.size() - 1);
                            break;
                        }
                    }
                }
            }
            i++;
            z3 = false;
        }
        EY eyB = this.I.b(0);
        int size = this.I.m.size() - 1;
        EY eyB2 = this.I.b(size);
        long jD2 = this.I.d(size);
        long jK = Lr0.K(Lr0.w(this.M));
        long jD3 = this.I.d(0);
        long jK2 = Lr0.K(eyB.b);
        boolean zS = s(eyB);
        long jMax = jK2;
        int i4 = 0;
        while (true) {
            List list2 = eyB.c;
            ey = eyB;
            boolean z4 = zS;
            if (i4 >= list2.size()) {
                jK2 = jMax;
                break;
            }
            V1 v1 = (V1) list2.get(i4);
            List list3 = v1.c;
            int i5 = v1.b;
            boolean z5 = (i5 == 1 || i5 == 2) ? false : true;
            if ((!z4 || !z5) && !list3.isEmpty()) {
                InterfaceC1219cj interfaceC1219cjD2 = ((AbstractC1853j70) list3.get(0)).d();
                if (interfaceC1219cjD2 == null || interfaceC1219cjD2.z(jD3, jK) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, interfaceC1219cjD2.b(interfaceC1219cjD2.j(jD3, jK)) + jK2);
                }
            }
            i4++;
            eyB = ey;
            zS = z4;
        }
        long jK3 = Lr0.K(eyB2.b);
        boolean zS2 = s(eyB2);
        long jMin2 = Long.MAX_VALUE;
        int i6 = 0;
        while (true) {
            list = eyB2.c;
            if (i6 >= list.size()) {
                jK3 = jMin2;
                break;
            }
            V1 v2 = (V1) list.get(i6);
            List list4 = v2.c;
            int i7 = v2.b;
            EY ey2 = eyB2;
            boolean z6 = (i7 == 1 || i7 == 2) ? false : true;
            if ((!zS2 || !z6) && !list4.isEmpty()) {
                InterfaceC1219cj interfaceC1219cjD3 = ((AbstractC1853j70) list4.get(0)).d();
                if (interfaceC1219cjD3 == null) {
                    jK3 += jD2;
                } else {
                    long jZ = interfaceC1219cjD3.z(jD2, jK);
                    if (jZ != 0) {
                        long j5 = (interfaceC1219cjD3.j(jD2, jK) + jZ) - 1;
                        long jB = interfaceC1219cjD3.b(j5) + jK3;
                        j4 = jD2;
                        jMin2 = Math.min(jMin2, interfaceC1219cjD3.g(j5, j4) + jB);
                    }
                }
                break;
            }
            j4 = jD2;
            i6++;
            jD2 = j4;
            eyB2 = ey2;
            jK3 = jK3;
        }
        if (!this.I.d) {
            z2 = false;
            break;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= list.size()) {
                z2 = true;
                break;
            }
            InterfaceC1219cj interfaceC1219cjD4 = ((AbstractC1853j70) ((V1) list.get(i8)).c.get(0)).d();
            if (interfaceC1219cjD4 == null || interfaceC1219cjD4.r()) {
                z2 = false;
                break;
            }
            i8++;
        }
        if (z2) {
            long j6 = this.I.f;
            if (j6 != -9223372036854775807L) {
                jK2 = Math.max(jK2, jK3 - Lr0.K(j6));
            }
        }
        long j7 = jK3 - jK2;
        C0733Ri c0733Ri2 = this.I;
        if (c0733Ri2.d) {
            AbstractC0397Ej.f(c0733Ri2.a != -9223372036854775807L);
            long jK4 = (jK - Lr0.K(this.I.a)) - jK2;
            long jX = Lr0.X(jK4);
            C1971kP c1971kP = this.h;
            long j8 = c1971kP.n.n;
            if (j8 != -9223372036854775807L) {
                jMin = Math.min(jX, j8);
            } else {
                C1288dP c1288dP2 = this.I.j;
                if (c1288dP2 != null) {
                    long j9 = c1288dP2.c;
                    if (j9 != -9223372036854775807L) {
                        jMin = Math.min(jX, j9);
                    } else {
                        jMin = jX;
                    }
                } else {
                    jMin = jX;
                }
            }
            long jX2 = Lr0.X(jK4 - j7);
            if (jX2 < 0 && jMin > 0) {
                jX2 = 0;
            }
            j = jK2;
            long j10 = this.I.c;
            long jMin3 = j10 != -9223372036854775807L ? Math.min(jX2 + j10, jX) : jX2;
            C1385eP c1385eP = c1971kP.n;
            long j11 = c1385eP.m;
            if (j11 != -9223372036854775807L) {
                jMin3 = Lr0.k(j11, jMin3, jX);
            } else {
                C1288dP c1288dP3 = this.I.j;
                if (c1288dP3 != null) {
                    long j12 = c1288dP3.b;
                    if (j12 != -9223372036854775807L) {
                        jMin3 = Lr0.k(j12, jMin3, jX);
                    }
                }
            }
            long j13 = jMin3;
            long j14 = j13 > jMin ? j13 : jMin;
            long jK5 = this.F.l;
            if (jK5 == -9223372036854775807L) {
                C0733Ri c0733Ri3 = this.I;
                C1288dP c1288dP4 = c0733Ri3.j;
                if (c1288dP4 != null) {
                    long j15 = c1288dP4.a;
                    if (j15 != -9223372036854775807L) {
                        jK5 = j15;
                    } else {
                        jK5 = c0733Ri3.g;
                        if (jK5 == -9223372036854775807L) {
                            jK5 = this.p;
                        }
                    }
                } else {
                    jK5 = c0733Ri3.g;
                    if (jK5 == -9223372036854775807L) {
                        jK5 = this.p;
                    }
                }
            }
            if (jK5 < j13) {
                jK5 = j13;
            }
            long j16 = this.q;
            if (jK5 > j14) {
                jK5 = Lr0.k(Lr0.X(jK4 - Math.min(j16, j7 / 2)), j13, j14);
            }
            long j17 = jK5;
            float f3 = c1385eP.f752o;
            if (f3 == -3.4028235E38f) {
                C1288dP c1288dP5 = this.I.j;
                f3 = c1288dP5 != null ? c1288dP5.d : -3.4028235E38f;
            }
            float f4 = c1385eP.p;
            if (f4 == -3.4028235E38f) {
                C1288dP c1288dP6 = this.I.j;
                f4 = c1288dP6 != null ? c1288dP6.e : -3.4028235E38f;
            }
            if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((c1288dP = this.I.j) == null || c1288dP.a == -9223372036854775807L)) {
                f = 1.0f;
                f2 = 1.0f;
            } else {
                f = f3;
                f2 = f4;
            }
            this.F = new C1385eP(j17, j13, j14, f, f2);
            long jX3 = Lr0.X(j) + this.I.a;
            long jK6 = jK4 - Lr0.K(this.F.l);
            long jMin4 = Math.min(j16, j7 / 2);
            j3 = jK6 < jMin4 ? jMin4 : jK6;
            j2 = jX3;
        } else {
            j = jK2;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jK7 = j - Lr0.K(ey.b);
        C0733Ri c0733Ri4 = this.I;
        m(new C0941Zi(c0733Ri4.a, j2, this.M, this.P, jK7, j7, j3, c0733Ri4, this.h, c0733Ri4.d ? this.F : null));
        if (this.i) {
            return;
        }
        Handler handler = this.E;
        RunnableC0889Xi runnableC0889Xi = this.x;
        handler.removeCallbacks(runnableC0889Xi);
        if (z2) {
            Handler handler2 = this.E;
            C0733Ri c0733Ri5 = this.I;
            long jW = Lr0.w(this.M);
            int size2 = c0733Ri5.m.size() - 1;
            EY eyB3 = c0733Ri5.b(size2);
            long jK8 = Lr0.K(eyB3.b);
            long jD4 = c0733Ri5.d(size2);
            long jK9 = Lr0.K(jW);
            long jK10 = Lr0.K(c0733Ri5.a);
            long jK11 = Lr0.K(5000L);
            int i9 = 0;
            while (true) {
                List list5 = eyB3.c;
                if (i9 >= list5.size()) {
                    break;
                }
                List list6 = ((V1) list5.get(i9)).c;
                if (!list6.isEmpty() && (interfaceC1219cjD = ((AbstractC1853j70) list6.get(0)).d()) != null) {
                    long jM = (interfaceC1219cjD.m(jD4, jK9) + (jK10 + jK8)) - jK9;
                    if (jM < jK11 - 100000 || (jM > jK11 && jM < jK11 + 100000)) {
                        jK11 = jM;
                    }
                }
                i9++;
            }
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j18 = jK11 / 1000;
            long j19 = jK11 - (1000 * j18);
            if (j19 != 0) {
                int i10 = 1 | ((int) ((jK11 ^ 1000) >> 63));
                switch (AbstractC0992aM.a[roundingMode.ordinal()]) {
                    case 1:
                        if (j19 != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i10 < 0) {
                            j18 += (long) i10;
                        }
                        break;
                    case 4:
                        j18 += (long) i10;
                        break;
                    case 5:
                        if (i10 > 0) {
                            j18 += (long) i10;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j19);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 != 0 ? jAbs2 > 0 : !(roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (j18 & 1) == 0))) {
                            j18 += (long) i10;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler2.postDelayed(runnableC0889Xi, j18);
        }
        if (this.J) {
            v();
            return;
        }
        if (z) {
            C0733Ri c0733Ri6 = this.I;
            if (c0733Ri6.d) {
                long j20 = c0733Ri6.e;
                if (j20 != -9223372036854775807L) {
                    this.E.postDelayed(this.w, Math.max(0L, (this.K + (j20 == 0 ? 5000L : j20)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void v() {
        Uri uri;
        this.E.removeCallbacks(this.w);
        if (this.B.F()) {
            return;
        }
        if (this.B.M()) {
            this.J = true;
            return;
        }
        synchronized (this.u) {
            uri = this.G;
        }
        this.J = false;
        C3143wX c3143wX = new C3143wX(this.A, uri, 4, this.s);
        this.B.S(c3143wX, this.t, this.n.v(4));
        this.r.G(new C0991aL(c3143wX.m), c3143wX.n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
