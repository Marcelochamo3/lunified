package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import io.sentry.android.core.C0019p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1628gs implements Handler.Callback, InterfaceC2844tP {
    public final ArrayList A;
    public final Sh0 B;
    public final C0768Sr C;
    public final C3329yP D;
    public final QP E;
    public final C1809il F;
    public final long G;
    public C2761sb0 H;
    public C1493fZ I;
    public C1334ds J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public C1530fs V;
    public long W;
    public int X;
    public boolean Y;
    public Lr Z;
    public long a0 = -9223372036854775807L;
    public final AbstractC1952k8[] l;
    public final Set m;
    public final AbstractC1952k8[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC3133wN f800o;
    public final C1909jm0 p;
    public final C1906jl q;
    public final N7 r;
    public final Uh0 s;
    public final HandlerThread t;
    public final Looper u;
    public final Ej0 v;
    public final Dj0 w;
    public final long x;
    public final boolean y;
    public final C2004kl z;

    public C1628gs(AbstractC1952k8[] abstractC1952k8Arr, AbstractC3133wN abstractC3133wN, C1909jm0 c1909jm0, C1906jl c1906jl, N7 n7, int i, boolean z, C0942Zj c0942Zj, C2761sb0 c2761sb0, C1809il c1809il, long j, boolean z2, Looper looper, Sh0 sh0, C0768Sr c0768Sr, C3436zZ c3436zZ) {
        this.C = c0768Sr;
        this.l = abstractC1952k8Arr;
        this.f800o = abstractC3133wN;
        this.p = c1909jm0;
        this.q = c1906jl;
        this.r = n7;
        this.P = i;
        this.Q = z;
        this.H = c2761sb0;
        this.F = c1809il;
        this.G = j;
        this.L = z2;
        this.B = sh0;
        this.x = c1906jl.h;
        this.y = c1906jl.i;
        C1493fZ c1493fZI = C1493fZ.i(c1909jm0);
        this.I = c1493fZI;
        this.J = new C1334ds(c1493fZI);
        this.n = new AbstractC1952k8[abstractC1952k8Arr.length];
        C1128bm c1128bm = (C1128bm) abstractC3133wN;
        c1128bm.getClass();
        for (int i2 = 0; i2 < abstractC1952k8Arr.length; i2++) {
            AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i2];
            abstractC1952k8.p = i2;
            abstractC1952k8.q = c3436zZ;
            this.n[i2] = abstractC1952k8;
            synchronized (abstractC1952k8.l) {
                abstractC1952k8.y = c1128bm;
            }
        }
        this.z = new C2004kl(this, sh0);
        this.A = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new Ej0();
        this.w = new Dj0();
        abstractC3133wN.a = this;
        abstractC3133wN.b = n7;
        this.Y = true;
        Uh0 uh0A = sh0.a(looper, null);
        this.D = new C3329yP(c0942Zj, uh0A);
        this.E = new QP(this, c0942Zj, uh0A, c3436zZ);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.t = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.u = looper2;
        this.s = sh0.a(looper2, this);
    }

    public static Pair G(Fj0 fj0, C1530fs c1530fs, boolean z, int i, boolean z2, Ej0 ej0, Dj0 dj0) {
        Object objH;
        Fj0 fj1 = c1530fs.a;
        if (fj0.q()) {
            return null;
        }
        Fj0 fj2 = fj1.q() ? fj0 : fj1;
        try {
            Pair pairJ = fj2.j(ej0, dj0, c1530fs.b, c1530fs.c);
            if (fj0.equals(fj2)) {
                return pairJ;
            }
            if (fj0.b(pairJ.first) != -1) {
                return (fj2.h(pairJ.first, dj0).q && fj2.n(dj0.n, ej0, 0L).z == fj2.b(pairJ.first)) ? fj0.j(ej0, dj0, fj0.h(pairJ.first, dj0).n, c1530fs.c) : pairJ;
            }
            if (z && (objH = H(ej0, dj0, i, z2, pairJ.first, fj2, fj0)) != null) {
                return fj0.j(ej0, dj0, fj0.h(objH, dj0).n, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object H(Ej0 ej0, Dj0 dj0, int i, boolean z, Object obj, Fj0 fj0, Fj0 fj1) {
        int iB = fj0.b(obj);
        int i2 = fj0.i();
        int iD = iB;
        int iB2 = -1;
        for (int i3 = 0; i3 < i2 && iB2 == -1; i3++) {
            iD = fj0.d(iD, dj0, ej0, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = fj1.b(fj0.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return fj1.m(iB2);
    }

    public static void M(AbstractC1952k8 abstractC1952k8, long j) {
        abstractC1952k8.w = true;
        if (abstractC1952k8 instanceof Si0) {
            Si0 si0 = (Si0) abstractC1952k8;
            AbstractC0397Ej.f(si0.w);
            si0.N = j;
        }
    }

    public static boolean q(AbstractC1952k8 abstractC1952k8) {
        return abstractC1952k8.r != 0;
    }

    public final void A(int i, int i2, Jd0 jd0) throws Throwable {
        this.J.a(1);
        QP qp = this.E;
        qp.getClass();
        AbstractC0397Ej.c(i >= 0 && i <= i2 && i2 <= ((ArrayList) qp.c).size());
        qp.k = jd0;
        qp.i(i, i2);
        l(qp.c(), false);
    }

    public final void B() throws Lr {
        float f = this.z.b().l;
        C3329yP c3329yP = this.D;
        C3038vP c3038vP = c3329yP.h;
        C3038vP c3038vP2 = c3329yP.i;
        boolean z = true;
        for (C3038vP c3038vP3 = c3038vP; c3038vP3 != null && c3038vP3.d; c3038vP3 = c3038vP3.l) {
            C1909jm0 c1909jm0G = c3038vP3.g(f, this.I.a);
            C1909jm0 c1909jm0 = c3038vP3.n;
            if (c1909jm0 != null) {
                int length = ((InterfaceC1920js[]) c1909jm0.n).length;
                InterfaceC1920js[] interfaceC1920jsArr = (InterfaceC1920js[]) c1909jm0G.n;
                if (length == interfaceC1920jsArr.length) {
                    int i = 0;
                    while (true) {
                        if (i >= interfaceC1920jsArr.length) {
                            if (c3038vP3 == c3038vP2) {
                                z = false;
                            }
                        } else if (c1909jm0G.w(c1909jm0, i)) {
                            i++;
                        }
                    }
                }
            }
            if (z) {
                C3329yP c3329yP2 = this.D;
                C3038vP c3038vP4 = c3329yP2.h;
                boolean zL = c3329yP2.l(c3038vP4);
                boolean[] zArr = new boolean[this.l.length];
                long jA = c3038vP4.a(c1909jm0G, this.I.r, zL, zArr);
                C1493fZ c1493fZ = this.I;
                boolean z2 = (c1493fZ.e == 4 || jA == c1493fZ.r) ? false : true;
                C1493fZ c1493fZ2 = this.I;
                this.I = o(c1493fZ2.b, jA, c1493fZ2.c, c1493fZ2.d, z2, 5);
                if (z2) {
                    E(jA);
                }
                boolean[] zArr2 = new boolean[this.l.length];
                int i2 = 0;
                while (true) {
                    AbstractC1952k8[] abstractC1952k8Arr = this.l;
                    if (i2 >= abstractC1952k8Arr.length) {
                        break;
                    }
                    AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i2];
                    boolean zQ = q(abstractC1952k8);
                    zArr2[i2] = zQ;
                    D90 d90 = c3038vP4.c[i2];
                    if (zQ) {
                        if (d90 != abstractC1952k8.s) {
                            b(abstractC1952k8);
                        } else if (zArr[i2]) {
                            long j = this.W;
                            abstractC1952k8.w = false;
                            abstractC1952k8.v = j;
                            abstractC1952k8.n(j, false);
                        }
                    }
                    i2++;
                }
                f(zArr2);
            } else {
                this.D.l(c3038vP3);
                if (c3038vP3.d) {
                    c3038vP3.a(c1909jm0G, Math.max(c3038vP3.f.b, this.W - c3038vP3.f1072o), false, new boolean[c3038vP3.i.length]);
                }
            }
            k(true);
            if (this.I.e != 4) {
                s();
                e0();
                this.s.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[PHI: r5 r6 r8
  0x00c0: PHI (r5v4 o.CP) = (r5v3 o.CP), (r5v9 o.CP) binds: [B:34:0x0094, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r6v2 long) = (r6v1 long), (r6v17 long) binds: [B:34:0x0094, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:34:0x0094, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    public final void C(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        CP cp;
        Fj0 fj0;
        List list;
        this.s.a.removeMessages(2);
        this.Z = null;
        this.N = false;
        C2004kl c2004kl = this.z;
        c2004kl.q = false;
        C0019p c0019p = c2004kl.l;
        if (c0019p.l) {
            c0019p.c(c0019p.d());
            c0019p.l = false;
        }
        this.W = 1000000000000L;
        for (AbstractC1952k8 abstractC1952k8 : this.l) {
            try {
                b(abstractC1952k8);
            } catch (RuntimeException | Lr e) {
                AP.g("Disable failed.", e);
            }
        }
        if (z) {
            for (AbstractC1952k8 abstractC1952k9 : this.l) {
                if (this.m.remove(abstractC1952k9)) {
                    try {
                        abstractC1952k9.w();
                    } catch (RuntimeException e2) {
                        AP.g("Reset failed.", e2);
                    }
                }
            }
        }
        this.U = 0;
        C1493fZ c1493fZ = this.I;
        CP cp2 = c1493fZ.b;
        long jLongValue = c1493fZ.r;
        if (this.I.b.a()) {
            j = this.I.c;
        } else {
            C1493fZ c1493fZ2 = this.I;
            Dj0 dj0 = this.w;
            CP cp3 = c1493fZ2.b;
            Fj0 fj1 = c1493fZ2.a;
            if (fj1.q() || fj1.h(cp3.a, dj0).q) {
                j = this.I.c;
            } else {
                j = this.I.r;
            }
        }
        if (z2) {
            this.V = null;
            Pair pairH = h(this.I.a);
            cp2 = (CP) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            j = -9223372036854775807L;
            if (cp2.equals(this.I.b)) {
                j2 = jLongValue;
                j3 = j;
                z5 = false;
            } else {
                j2 = jLongValue;
                j3 = -9223372036854775807L;
                z5 = true;
            }
        } else {
            j2 = jLongValue;
            j3 = j;
            z5 = false;
        }
        this.D.b();
        this.O = false;
        Fj0 fj2 = this.I.a;
        if (z3 && (fj2 instanceof C1063b20)) {
            C1063b20 c1063b20 = (C1063b20) fj2;
            Jd0 jd0 = (Jd0) this.E.k;
            Fj0[] fj0Arr = c1063b20.s;
            Fj0[] fj0Arr2 = new Fj0[fj0Arr.length];
            for (int i = 0; i < fj0Arr.length; i++) {
                fj0Arr2[i] = new C0965a20(fj0Arr[i]);
            }
            C1063b20 c1063b21 = new C1063b20(fj0Arr2, c1063b20.t, jd0);
            if (cp2.b != -1) {
                c1063b21.h(cp2.a, this.w);
                int i2 = this.w.n;
                Ej0 ej0 = this.v;
                c1063b21.n(i2, ej0, 0L);
                if (ej0.a()) {
                    fj0 = c1063b21;
                    cp = new CP(cp2.d, cp2.a);
                } else {
                    fj0 = c1063b21;
                    cp = cp2;
                }
            } else {
                fj0 = c1063b21;
                cp = cp2;
            }
        } else {
            cp = cp2;
            fj0 = fj2;
        }
        C1493fZ c1493fZ3 = this.I;
        int i3 = c1493fZ3.e;
        Lr lr = z4 ? null : c1493fZ3.f;
        C1031am0 c1031am0 = z5 ? C1031am0.f678o : c1493fZ3.h;
        C1909jm0 c1909jm0 = z5 ? this.p : c1493fZ3.i;
        if (z5) {
            XE xe = AbstractC0985aF.m;
            list = M60.p;
        } else {
            list = c1493fZ3.j;
        }
        this.I = new C1493fZ(fj0, cp, j3, j2, i3, lr, false, c1031am0, c1909jm0, list, cp, c1493fZ3.l, c1493fZ3.m, c1493fZ3.n, j2, 0L, j2, 0L, false);
        if (z3) {
            QP qp = this.E;
            HashMap map = (HashMap) qp.f;
            for (OP op : map.values()) {
                try {
                    op.a.o(op.b);
                } catch (RuntimeException e3) {
                    AP.g("Failed to release child source.", e3);
                }
                AbstractC1464f8 abstractC1464f8 = op.a;
                C2994uv c2994uv = op.c;
                abstractC1464f8.r(c2994uv);
                op.a.q(c2994uv);
            }
            map.clear();
            ((HashSet) qp.h).clear();
            qp.a = false;
        }
    }

    public final void D() {
        C3038vP c3038vP = this.D.h;
        this.M = c3038vP != null && c3038vP.f.h && this.L;
    }

    public final void E(long j) {
        C3038vP c3038vP = this.D.h;
        long j2 = j + (c3038vP == null ? 1000000000000L : c3038vP.f1072o);
        this.W = j2;
        this.z.l.c(j2);
        for (AbstractC1952k8 abstractC1952k8 : this.l) {
            if (q(abstractC1952k8)) {
                long j3 = this.W;
                abstractC1952k8.w = false;
                abstractC1952k8.v = j3;
                abstractC1952k8.n(j3, false);
            }
        }
        for (C3038vP c3038vP2 = r0.h; c3038vP2 != null; c3038vP2 = c3038vP2.l) {
            for (InterfaceC1920js interfaceC1920js : (InterfaceC1920js[]) c3038vP2.n.n) {
                if (interfaceC1920js != null) {
                    interfaceC1920js.r();
                }
            }
        }
    }

    public final void F(Fj0 fj0, Fj0 fj1) {
        if (fj0.q() && fj1.q()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC1674hK.w(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z) throws Lr {
        CP cp = this.D.h.f.a;
        long jK = K(cp, this.I.r, true, false);
        if (jK != this.I.r) {
            C1493fZ c1493fZ = this.I;
            this.I = o(cp, jK, c1493fZ.c, c1493fZ.d, z, 5);
        }
    }

    public final void J(C1530fs c1530fs) throws Throwable {
        long j;
        long j2;
        boolean z;
        CP cp;
        long j3;
        long j4;
        long j5;
        C1493fZ c1493fZ;
        int i;
        this.J.a(1);
        Pair pairG = G(this.I.a, c1530fs, true, this.P, this.Q, this.v, this.w);
        if (pairG == null) {
            Pair pairH = h(this.I.a);
            cp = (CP) pairH.first;
            long jLongValue = ((Long) pairH.second).longValue();
            z = !this.I.a.q();
            j2 = jLongValue;
            j = -9223372036854775807L;
        } else {
            Object obj = pairG.first;
            long jLongValue2 = ((Long) pairG.second).longValue();
            j = c1530fs.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            CP cpN = this.D.n(this.I.a, obj, jLongValue2);
            if (cpN.a()) {
                this.I.a.h(cpN.a, this.w);
                j2 = this.w.f(cpN.b) == cpN.c ? this.w.r.n : 0L;
                z = true;
            } else {
                j2 = jLongValue2;
                z = c1530fs.c == -9223372036854775807L;
            }
            cp = cpN;
        }
        try {
            if (!this.I.a.q()) {
                if (pairG == null) {
                    if (this.I.e != 1) {
                        W(4);
                    }
                    C(false, true, false, true);
                } else {
                    if (cp.equals(this.I.b)) {
                        C3038vP c3038vP = this.D.h;
                        long jL = (c3038vP == null || !c3038vP.d || j2 == 0) ? j2 : c3038vP.a.L(j2, this.H);
                        if (Lr0.X(jL) == Lr0.X(this.I.r) && ((i = (c1493fZ = this.I).e) == 2 || i == 3)) {
                            long j6 = c1493fZ.r;
                            this.I = o(cp, j6, j, j6, z, 2);
                            return;
                        }
                        j4 = jL;
                    } else {
                        j4 = j2;
                    }
                    boolean z2 = this.I.e == 4;
                    C3329yP c3329yP = this.D;
                    long jK = K(cp, j4, c3329yP.h != c3329yP.i, z2);
                    z |= j2 != jK;
                    try {
                        C1493fZ c1493fZ2 = this.I;
                        Fj0 fj0 = c1493fZ2.a;
                        f0(fj0, cp, fj0, c1493fZ2.b, j, true);
                        j5 = jK;
                    } catch (Throwable th) {
                        th = th;
                        j3 = jK;
                        this.I = o(cp, j3, j, j3, z, 2);
                        throw th;
                    }
                }
                this.I = o(cp, j5, j, j5, z, 2);
            }
            this.V = c1530fs;
            j5 = j2;
            this.I = o(cp, j5, j, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j2;
        }
    }

    public final long K(CP cp, long j, boolean z, boolean z2) throws Lr {
        b0();
        this.N = false;
        if (z2 || this.I.e == 3) {
            W(2);
        }
        C3329yP c3329yP = this.D;
        C3038vP c3038vP = c3329yP.h;
        C3038vP c3038vP2 = c3038vP;
        while (c3038vP2 != null && !cp.equals(c3038vP2.f.a)) {
            c3038vP2 = c3038vP2.l;
        }
        if (z || c3038vP != c3038vP2 || (c3038vP2 != null && c3038vP2.f1072o + j < 0)) {
            AbstractC1952k8[] abstractC1952k8Arr = this.l;
            for (AbstractC1952k8 abstractC1952k8 : abstractC1952k8Arr) {
                b(abstractC1952k8);
            }
            if (c3038vP2 != null) {
                while (c3329yP.h != c3038vP2) {
                    c3329yP.a();
                }
                c3329yP.l(c3038vP2);
                c3038vP2.f1072o = 1000000000000L;
                f(new boolean[abstractC1952k8Arr.length]);
            }
        }
        if (c3038vP2 != null) {
            c3329yP.l(c3038vP2);
            if (!c3038vP2.d) {
                c3038vP2.f = c3038vP2.f.b(j);
            } else if (c3038vP2.e) {
                InterfaceC2941uP interfaceC2941uP = c3038vP2.a;
                j = interfaceC2941uP.I(j);
                interfaceC2941uP.E(j - this.x, this.y);
            }
            E(j);
            s();
        } else {
            c3329yP.b();
            E(j);
        }
        k(false);
        this.s.d(2);
        return j;
    }

    public final void L(BZ bz) {
        Looper looper = bz.f;
        if (looper.getThread().isAlive()) {
            this.B.a(looper, null).c(new O3(this, 8, bz));
        } else {
            AP.z();
            bz.b(false);
        }
    }

    public final void N(boolean z, AtomicBoolean atomicBoolean) {
        if (this.R != z) {
            this.R = z;
            if (!z) {
                for (AbstractC1952k8 abstractC1952k8 : this.l) {
                    if (!q(abstractC1952k8) && this.m.remove(abstractC1952k8)) {
                        abstractC1952k8.w();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(C1237cs c1237cs) throws Throwable {
        this.J.a(1);
        int i = c1237cs.c;
        Jd0 jd0 = c1237cs.b;
        List list = c1237cs.a;
        if (i != -1) {
            this.V = new C1530fs(new C1063b20(list, jd0), c1237cs.c, c1237cs.d);
        }
        QP qp = this.E;
        ArrayList arrayList = (ArrayList) qp.c;
        qp.i(0, arrayList.size());
        l(qp.a(arrayList.size(), list, jd0), false);
    }

    public final void P(boolean z) {
        if (z == this.T) {
            return;
        }
        this.T = z;
        if (z || !this.I.f774o) {
            return;
        }
        this.s.d(2);
    }

    public final void Q(boolean z) throws Lr {
        this.L = z;
        D();
        if (this.M) {
            C3329yP c3329yP = this.D;
            if (c3329yP.i != c3329yP.h) {
                I(true);
                k(false);
            }
        }
    }

    public final void R(int i, int i2, boolean z, boolean z2) {
        this.J.a(z2 ? 1 : 0);
        C1334ds c1334ds = this.J;
        c1334ds.a = true;
        c1334ds.f = true;
        c1334ds.g = i2;
        this.I = this.I.d(i, z);
        this.N = false;
        for (C3038vP c3038vP = this.D.h; c3038vP != null; c3038vP = c3038vP.l) {
            for (InterfaceC1920js interfaceC1920js : (InterfaceC1920js[]) c3038vP.n.n) {
                if (interfaceC1920js != null) {
                    interfaceC1920js.b(z);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i3 = this.I.e;
        Uh0 uh0 = this.s;
        if (i3 == 3) {
            Z();
            uh0.d(2);
        } else if (i3 == 2) {
            uh0.d(2);
        }
    }

    public final void S(C1591gZ c1591gZ) {
        this.s.a.removeMessages(16);
        C2004kl c2004kl = this.z;
        c2004kl.a(c1591gZ);
        C1591gZ c1591gZB = c2004kl.b();
        n(c1591gZB, c1591gZB.l, true, true);
    }

    public final void T(int i) throws Lr {
        this.P = i;
        Fj0 fj0 = this.I.a;
        C3329yP c3329yP = this.D;
        c3329yP.f = i;
        if (!c3329yP.o(fj0)) {
            I(true);
        }
        k(false);
    }

    public final void U(boolean z) throws Lr {
        this.Q = z;
        Fj0 fj0 = this.I.a;
        C3329yP c3329yP = this.D;
        c3329yP.g = z;
        if (!c3329yP.o(fj0)) {
            I(true);
        }
        k(false);
    }

    public final void V(Jd0 jd0) throws Throwable {
        this.J.a(1);
        QP qp = this.E;
        int size = ((ArrayList) qp.c).size();
        if (jd0.b.length != size) {
            jd0 = new Jd0(new Random(jd0.a.nextLong())).a(size);
        }
        qp.k = jd0;
        l(qp.c(), false);
    }

    public final void W(int i) {
        C1493fZ c1493fZ = this.I;
        if (c1493fZ.e != i) {
            if (i != 2) {
                this.a0 = -9223372036854775807L;
            }
            this.I = c1493fZ.g(i);
        }
    }

    public final boolean X() {
        C1493fZ c1493fZ = this.I;
        return c1493fZ.l && c1493fZ.m == 0;
    }

    public final boolean Y(Fj0 fj0, CP cp) {
        if (cp.a() || fj0.q()) {
            return false;
        }
        int i = fj0.h(cp.a, this.w).n;
        Ej0 ej0 = this.v;
        fj0.o(i, ej0);
        return ej0.a() && ej0.t && ej0.q != -9223372036854775807L;
    }

    public final void Z() {
        this.N = false;
        C2004kl c2004kl = this.z;
        c2004kl.q = true;
        c2004kl.l.e();
        for (AbstractC1952k8 abstractC1952k8 : this.l) {
            if (q(abstractC1952k8)) {
                AbstractC0397Ej.f(abstractC1952k8.r == 1);
                abstractC1952k8.r = 2;
                abstractC1952k8.q();
            }
        }
    }

    public final void a(C1237cs c1237cs, int i) throws Throwable {
        this.J.a(1);
        QP qp = this.E;
        if (i == -1) {
            i = ((ArrayList) qp.c).size();
        }
        l(qp.a(i, c1237cs.a, c1237cs.b), false);
    }

    public final void a0(boolean z, boolean z2) {
        C(z || !this.R, false, true, false);
        this.J.a(z2 ? 1 : 0);
        this.q.b(true);
        W(1);
    }

    public final void b(AbstractC1952k8 abstractC1952k8) {
        if (q(abstractC1952k8)) {
            C2004kl c2004kl = this.z;
            if (abstractC1952k8 == c2004kl.n) {
                c2004kl.f873o = null;
                c2004kl.n = null;
                c2004kl.p = true;
            }
            int i = abstractC1952k8.r;
            if (i == 2) {
                AbstractC0397Ej.f(i == 2);
                abstractC1952k8.r = 1;
                abstractC1952k8.r();
            }
            AbstractC0397Ej.f(abstractC1952k8.r == 1);
            abstractC1952k8.n.u();
            abstractC1952k8.r = 0;
            abstractC1952k8.s = null;
            abstractC1952k8.t = null;
            abstractC1952k8.w = false;
            abstractC1952k8.l();
            this.U--;
        }
    }

    public final void b0() {
        int i;
        C2004kl c2004kl = this.z;
        c2004kl.q = false;
        C0019p c0019p = c2004kl.l;
        if (c0019p.l) {
            c0019p.c(c0019p.d());
            c0019p.l = false;
        }
        for (AbstractC1952k8 abstractC1952k8 : this.l) {
            if (q(abstractC1952k8) && (i = abstractC1952k8.r) == 2) {
                AbstractC0397Ej.f(i == 2);
                abstractC1952k8.r = 1;
                abstractC1952k8.r();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x035b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0470  */
    /* JADX WARN: Code duplicated, block: B:285:0x0477  */
    /* JADX WARN: Code duplicated, block: B:287:0x047b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x0486  */
    /* JADX WARN: Code duplicated, block: B:291:0x048b  */
    /* JADX WARN: Code duplicated, block: B:293:0x048f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0493  */
    /* JADX WARN: Code duplicated, block: B:296:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:297:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04af  */
    /* JADX WARN: Code duplicated, block: B:307:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:310:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:313:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:315:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:345:0x0546  */
    /* JADX WARN: Code duplicated, block: B:348:0x054b  */
    /* JADX WARN: Code duplicated, block: B:350:0x0558  */
    /* JADX WARN: Code duplicated, block: B:352:0x055f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0568  */
    /* JADX WARN: Code duplicated, block: B:363:0x0583  */
    /* JADX WARN: Code duplicated, block: B:365:0x0589  */
    /* JADX WARN: Code duplicated, block: B:367:0x0593  */
    /* JADX WARN: Code duplicated, block: B:369:0x0597  */
    /* JADX WARN: Code duplicated, block: B:375:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:377:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:384:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:387:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:389:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:391:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:392:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:401:0x060c  */
    /* JADX WARN: Code duplicated, block: B:403:0x060f  */
    /* JADX WARN: Code duplicated, block: B:404:0x0617  */
    /* JADX WARN: Code duplicated, block: B:406:0x0622  */
    /* JADX WARN: Code duplicated, block: B:407:0x062e  */
    /* JADX WARN: Code duplicated, block: B:414:0x064f  */
    /* JADX WARN: Code duplicated, block: B:421:0x065c  */
    /* JADX WARN: Code duplicated, block: B:424:0x0663  */
    /* JADX WARN: Code duplicated, block: B:431:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:434:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:439:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:443:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:490:0x05f5 A[EDGE_INSN: B:490:0x05f5->B:394:0x05f5 BREAK  A[LOOP:8: B:385:0x05cc->B:393:0x05f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x059a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Instruction removed from duplicated block: B:365:0x0589, please report this as an issue */
    public final void c() throws Lr {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        C1493fZ c1493fZ;
        C3038vP c3038vP;
        C3038vP c3038vP2;
        C1809il c1809il;
        long j2;
        long j3;
        int i;
        C3038vP c3038vP3;
        long j4;
        C3038vP c3038vP4;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        C1493fZ c1493fZ2;
        int i3;
        int i4;
        int i5;
        AbstractC1952k8[] abstractC1952k8Arr;
        C1493fZ c1493fZ3;
        C3038vP c3038vP5;
        D90 d90;
        C3329yP c3329yP;
        C3038vP c3038vP6;
        C3038vP c3038vP7;
        boolean z9;
        AbstractC1952k8[] abstractC1952k8Arr2;
        C1628gs c1628gs = this;
        c1628gs.B.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        c1628gs.s.a.removeMessages(2);
        if (!c1628gs.I.a.q() && c1628gs.E.a) {
            C3329yP c3329yP2 = c1628gs.D;
            long j5 = c1628gs.W;
            C3038vP c3038vP8 = c3329yP2.j;
            if (c3038vP8 != null) {
                AbstractC0397Ej.f(c3038vP8.l == null);
                if (c3038vP8.d) {
                    c3038vP8.a.O(j5 - c3038vP8.f1072o);
                }
            }
            C3329yP c3329yP3 = c1628gs.D;
            C3038vP c3038vP9 = c3329yP3.j;
            if (c3038vP9 == null || (!c3038vP9.f.i && c3038vP9.d && ((!c3038vP9.e || c3038vP9.a.A() == Long.MIN_VALUE) && c3329yP3.j.f.e != -9223372036854775807L && c3329yP3.k < 100))) {
                C3329yP c3329yP4 = c1628gs.D;
                long j6 = c1628gs.W;
                C1493fZ c1493fZ4 = c1628gs.I;
                C3038vP c3038vP10 = c3329yP4.j;
                C3232xP c3232xPE = c3038vP10 == null ? c3329yP4.e(c1493fZ4.a, c1493fZ4.b, c1493fZ4.c, c1493fZ4.r) : c3329yP4.d(c1493fZ4.a, c3038vP10, j6);
                if (c3232xPE != null) {
                    C3329yP c3329yP5 = c1628gs.D;
                    AbstractC1952k8[] abstractC1952k8Arr3 = c1628gs.n;
                    AbstractC3133wN abstractC3133wN = c1628gs.f800o;
                    C1562g8 c1562g8 = c1628gs.q.a;
                    QP qp = c1628gs.E;
                    C1909jm0 c1909jm0 = c1628gs.p;
                    C3038vP c3038vP11 = c3329yP5.j;
                    C3038vP c3038vP12 = new C3038vP(abstractC1952k8Arr3, c3038vP11 == null ? 1000000000000L : (c3038vP11.f1072o + c3038vP11.f.e) - c3232xPE.b, abstractC3133wN, c1562g8, qp, c3232xPE, c1909jm0);
                    C3038vP c3038vP13 = c3329yP5.j;
                    if (c3038vP13 == null) {
                        c3329yP5.h = c3038vP12;
                        c3329yP5.i = c3038vP12;
                    } else if (c3038vP12 != c3038vP13.l) {
                        c3038vP13.b();
                        c3038vP13.l = c3038vP12;
                        c3038vP13.c();
                    }
                    c3329yP5.l = null;
                    c3329yP5.j = c3038vP12;
                    c3329yP5.k++;
                    c3329yP5.k();
                    c1628gs = this;
                    c3038vP12.a.c(c1628gs, c3232xPE.b);
                    if (c1628gs.D.h == c3038vP12) {
                        c1628gs.E(c3232xPE.b);
                    }
                    c1628gs.k(false);
                }
            }
            if (c1628gs.O) {
                c1628gs.O = p();
                c0();
            } else {
                s();
            }
            C3329yP c3329yP6 = c1628gs.D;
            C3038vP c3038vP14 = c3329yP6.i;
            if (c3038vP14 == null) {
                break;
            }
            C3038vP c3038vP15 = c3038vP14.l;
            AbstractC1952k8[] abstractC1952k8Arr4 = c1628gs.l;
            if (c3038vP15 != null && !c1628gs.M) {
                if (!c3038vP14.d) {
                    break;
                    break;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC1952k8Arr4.length) {
                        C3038vP c3038vP16 = c3038vP14.l;
                        if (c3038vP16.d || c1628gs.W >= c3038vP16.e()) {
                            C1909jm0 c1909jm1 = c3038vP14.n;
                            C3038vP c3038vP17 = c3329yP6.i;
                            AbstractC0397Ej.f((c3038vP17 == null || c3038vP17.l == null) ? false : true);
                            c3329yP6.i = c3329yP6.i.l;
                            c3329yP6.k();
                            C3038vP c3038vP18 = c3329yP6.i;
                            C1909jm0 c1909jm2 = c3038vP18.n;
                            Fj0 fj0 = c1628gs.I.a;
                            f0(fj0, c3038vP18.f.a, fj0, c3038vP14.f.a, -9223372036854775807L, false);
                            if (c3038vP18.d && c3038vP18.a.p() != -9223372036854775807L) {
                                long jE = c3038vP18.e();
                                for (AbstractC1952k8 abstractC1952k8 : abstractC1952k8Arr4) {
                                    if (abstractC1952k8.s != null) {
                                        M(abstractC1952k8, jE);
                                    }
                                }
                                break;
                            }
                            for (int i7 = 0; i7 < abstractC1952k8Arr4.length; i7++) {
                                boolean zX = c1909jm1.x(i7);
                                boolean zX2 = c1909jm2.x(i7);
                                if (zX && !abstractC1952k8Arr4[i7].w) {
                                    boolean z10 = c1628gs.n[i7].m == -2;
                                    Y60 y60 = ((Y60[]) c1909jm1.m)[i7];
                                    Y60 y61 = ((Y60[]) c1909jm2.m)[i7];
                                    if (!zX2 || !y61.equals(y60) || z10) {
                                        M(abstractC1952k8Arr4[i7], c3038vP18.e());
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        AbstractC1952k8 abstractC1952k9 = abstractC1952k8Arr4[i6];
                        D90 d91 = c3038vP14.c[i6];
                        if (abstractC1952k9.s == d91) {
                            if (d91 != null && !abstractC1952k9.i()) {
                                C3038vP c3038vP19 = c3038vP14.l;
                                if (!c3038vP14.f.f || !c3038vP19.d || (!(abstractC1952k9 instanceof Si0) && !(abstractC1952k9 instanceof GQ) && abstractC1952k9.v < c3038vP19.e())) {
                                }
                            }
                            i6++;
                        }
                    }
                    break;
                    break;
                }
            }
            if (c3038vP14.f.i || c1628gs.M) {
                for (int i8 = 0; i8 < abstractC1952k8Arr4.length; i8++) {
                    AbstractC1952k8 abstractC1952k10 = abstractC1952k8Arr4[i8];
                    D90 d92 = c3038vP14.c[i8];
                    if (d92 != null && abstractC1952k10.s == d92 && abstractC1952k10.i()) {
                        long j7 = c3038vP14.f.e;
                        M(abstractC1952k10, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : c3038vP14.f1072o + j7);
                    }
                }
            }
            C3329yP c3329yP7 = c1628gs.D;
            C3038vP c3038vP20 = c3329yP7.i;
            if (c3038vP20 != null && c3329yP7.h != c3038vP20 && !c3038vP20.g) {
                C1909jm0 c1909jm3 = c3038vP20.n;
                boolean z11 = false;
                int i9 = 0;
                while (true) {
                    abstractC1952k8Arr2 = c1628gs.l;
                    if (i9 >= abstractC1952k8Arr2.length) {
                        break;
                    }
                    AbstractC1952k8 abstractC1952k11 = abstractC1952k8Arr2[i9];
                    if (q(abstractC1952k11)) {
                        D90 d93 = abstractC1952k11.s;
                        D90[] d90Arr = c3038vP20.c;
                        boolean z12 = d93 != d90Arr[i9];
                        if (!c1909jm3.x(i9) || z12) {
                            if (!abstractC1952k11.w) {
                                InterfaceC1920js interfaceC1920js = ((InterfaceC1920js[]) c1909jm3.n)[i9];
                                int length = interfaceC1920js != null ? interfaceC1920js.length() : 0;
                                C0643Nw[] c0643NwArr = new C0643Nw[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    c0643NwArr[i10] = interfaceC1920js.d(i10);
                                }
                                abstractC1952k11.v(c0643NwArr, d90Arr[i9], c3038vP20.e(), c3038vP20.f1072o);
                            } else if (abstractC1952k11.j()) {
                                c1628gs.b(abstractC1952k11);
                            } else {
                                z11 = true;
                            }
                        }
                    }
                    i9++;
                }
                if (!z11) {
                    c1628gs.f(new boolean[abstractC1952k8Arr2.length]);
                }
            }
            boolean z13 = false;
            while (X() && !c1628gs.M && (c3038vP6 = (c3329yP = c1628gs.D).h) != null && (c3038vP7 = c3038vP6.l) != null && c1628gs.W >= c3038vP7.e() && c3038vP7.g) {
                if (z13) {
                    t();
                }
                C3038vP c3038vPA = c3329yP.a();
                c3038vPA.getClass();
                if (c1628gs.I.b.a.equals(c3038vPA.f.a.a)) {
                    CP cp = c1628gs.I.b;
                    if (cp.b == -1) {
                        CP cp2 = c3038vPA.f.a;
                        if (cp2.b != -1 || cp.e == cp2.e) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C3232xP c3232xP = c3038vPA.f;
                CP cp3 = c3232xP.a;
                long j8 = c3232xP.b;
                c1628gs.I = o(cp3, j8, c3232xP.c, j8, !z9, 0);
                D();
                e0();
                z13 = true;
            }
        }
        boolean zR = true;
        int i11 = c1628gs.I.e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        C3038vP c3038vP21 = c1628gs.D.h;
        if (c3038vP21 == null) {
            c1628gs.s.a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            return;
        }
        Pu0.c("doSomeWork");
        e0();
        if (c3038vP21.d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c3038vP21.a.E(c1628gs.I.r - c1628gs.x, c1628gs.y);
            boolean z14 = true;
            z = true;
            int i12 = 0;
            while (true) {
                AbstractC1952k8[] abstractC1952k8Arr5 = c1628gs.l;
                if (i12 >= abstractC1952k8Arr5.length) {
                    break;
                }
                AbstractC1952k8 abstractC1952k12 = abstractC1952k8Arr5[i12];
                if (q(abstractC1952k12)) {
                    abstractC1952k12.u(c1628gs.W, jElapsedRealtime);
                    z14 = z14 && abstractC1952k12.j();
                    boolean z15 = c3038vP21.c[i12] != abstractC1952k12.s;
                    boolean z16 = z15 || (!z15 && abstractC1952k12.i()) || abstractC1952k12.k() || abstractC1952k12.j();
                    z = z && z16;
                    if (!z16) {
                        D90 d94 = abstractC1952k12.s;
                        d94.getClass();
                        d94.a();
                    }
                }
                i12++;
            }
            z2 = z14;
        } else {
            c3038vP21.a.B();
            z = true;
            z2 = true;
        }
        long j9 = c3038vP21.f.e;
        if (z2 && c3038vP21.d) {
            j = -9223372036854775807L;
            z3 = j9 == -9223372036854775807L || j9 <= c1628gs.I.r;
            if (z3 && c1628gs.M) {
                c1628gs.M = false;
                c1628gs.R(c1628gs.I.m, 5, false, false);
            }
            if (z3 || !c3038vP21.f.i) {
                c1493fZ = c1628gs.I;
                if (c1493fZ.e == 2) {
                    if (c1628gs.U == 0) {
                        c3038vP = c3038vP21;
                        zR = r();
                    } else {
                        if (!z) {
                            c3038vP = c3038vP21;
                        } else if (c1493fZ.g) {
                            C3329yP c3329yP8 = c1628gs.D;
                            c3038vP3 = c3329yP8.h;
                            if (c1628gs.Y(c1493fZ.a, c3038vP3.f.a)) {
                                j4 = c1628gs.F.i;
                            } else {
                                j4 = j;
                            }
                            c3038vP4 = c3329yP8.j;
                            if (c3038vP4.d || ((c3038vP4.e && c3038vP4.a.A() != Long.MIN_VALUE) || !c3038vP4.f.i)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (c3038vP4.f.a.a() || c3038vP4.d) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (!z4 || z5) {
                                c3038vP = c3038vP21;
                            } else {
                                C1493fZ c1493fZ5 = c1628gs.I;
                                Fj0 fj1 = c1493fZ5.a;
                                CP cp4 = c3038vP3.f.a;
                                long j10 = c1493fZ5.p;
                                C3038vP c3038vP22 = c1628gs.D.j;
                                c3038vP = c3038vP21;
                                long jMax = c3038vP22 == null ? 0L : Math.max(0L, j10 - (c1628gs.W - c3038vP22.f1072o));
                                float f = c1628gs.z.b().l;
                                boolean z17 = c1628gs.N;
                                C1906jl c1906jl = c1628gs.q;
                                c1906jl.getClass();
                                long jZ = Lr0.z(jMax, f);
                                long jMin = z17 ? c1906jl.e : c1906jl.d;
                                if (j4 != -9223372036854775807L) {
                                    jMin = Math.min(j4 / 2, jMin);
                                }
                                if (jMin > 0 && jZ < jMin) {
                                    if (!c1906jl.g) {
                                        C1562g8 c1562g9 = c1906jl.a;
                                        synchronized (c1562g9) {
                                            i2 = c1562g9.e * c1562g9.c;
                                        }
                                        if (i2 >= c1906jl.j) {
                                        }
                                    }
                                }
                            }
                            zR = true;
                        } else {
                            c3038vP = c3038vP21;
                        }
                        zR = false;
                    }
                    if (zR) {
                        c1628gs.W(3);
                        c1628gs.Z = null;
                        if (X()) {
                            Z();
                        }
                    }
                } else {
                    c3038vP = c3038vP21;
                }
                if (c1628gs.I.e == 3 && (c1628gs.U != 0 ? !z : !r())) {
                    c1628gs.N = X();
                    c1628gs.W(2);
                    if (c1628gs.N) {
                        for (c3038vP2 = c1628gs.D.h; c3038vP2 != null; c3038vP2 = c3038vP2.l) {
                            for (InterfaceC1920js interfaceC1920js2 : (InterfaceC1920js[]) c3038vP2.n.n) {
                                if (interfaceC1920js2 != null) {
                                    interfaceC1920js2.t();
                                }
                            }
                        }
                        c1809il = c1628gs.F;
                        j2 = c1809il.i;
                        if (j2 != -9223372036854775807L) {
                            long j11 = j2 + c1809il.b;
                            c1809il.i = j11;
                            j3 = c1809il.h;
                            if (j3 != -9223372036854775807L && j11 > j3) {
                                c1809il.i = j3;
                            }
                            c1809il.m = -9223372036854775807L;
                        }
                    }
                    b0();
                }
            } else {
                c1628gs.W(4);
                b0();
                c3038vP = c3038vP21;
            }
            if (c1628gs.I.e == 2) {
                i5 = 0;
                while (true) {
                    abstractC1952k8Arr = c1628gs.l;
                    if (i5 < abstractC1952k8Arr.length) {
                        break;
                    }
                    if (q(abstractC1952k8Arr[i5])) {
                        d90 = c1628gs.l[i5].s;
                        c3038vP5 = c3038vP;
                        if (d90 == c3038vP5.c[i5]) {
                            d90.getClass();
                            d90.a();
                        }
                    } else {
                        c3038vP5 = c3038vP;
                    }
                    i5++;
                    c3038vP = c3038vP5;
                }
                c1493fZ3 = c1628gs.I;
                if (c1493fZ3.g && c1493fZ3.q < 500000 && p()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!z6) {
                c1628gs.a0 = -9223372036854775807L;
            } else if (c1628gs.a0 == -9223372036854775807L) {
                c1628gs.B.getClass();
                c1628gs.a0 = SystemClock.elapsedRealtime();
            } else {
                c1628gs.B.getClass();
                if (SystemClock.elapsedRealtime() - c1628gs.a0 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            if (X() || c1628gs.I.e != 3) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!c1628gs.T && c1628gs.S && z7) {
                z8 = true;
            } else {
                z8 = false;
            }
            c1493fZ2 = c1628gs.I;
            if (c1493fZ2.f774o != z8) {
                c1628gs.I = new C1493fZ(c1493fZ2.a, c1493fZ2.b, c1493fZ2.c, c1493fZ2.d, c1493fZ2.e, c1493fZ2.f, c1493fZ2.g, c1493fZ2.h, c1493fZ2.i, c1493fZ2.j, c1493fZ2.k, c1493fZ2.l, c1493fZ2.m, c1493fZ2.n, c1493fZ2.p, c1493fZ2.q, c1493fZ2.r, c1493fZ2.s, z8);
            }
            c1628gs.S = false;
            if (!z8 && (i3 = c1628gs.I.e) != 4) {
                if (z7) {
                    i4 = 2;
                } else {
                    i4 = 2;
                    if (i3 == 2) {
                        if (i3 == 3 && c1628gs.U != 0) {
                            c1628gs.s.a.sendEmptyMessageAtTime(2, jUptimeMillis + 1000);
                        }
                    }
                }
                c1628gs.s.a.sendEmptyMessageAtTime(i4, jUptimeMillis + 10);
            }
            Pu0.i();
        }
        j = -9223372036854775807L;
        if (z3) {
            c1628gs.M = false;
            c1628gs.R(c1628gs.I.m, 5, false, false);
        }
        if (z3) {
            c1493fZ = c1628gs.I;
            if (c1493fZ.e == 2) {
                if (c1628gs.U == 0) {
                    c3038vP = c3038vP21;
                    zR = r();
                } else {
                    if (!z) {
                        c3038vP = c3038vP21;
                    } else if (c1493fZ.g) {
                        c3038vP = c3038vP21;
                    } else {
                        C3329yP c3329yP9 = c1628gs.D;
                        c3038vP3 = c3329yP9.h;
                        if (c1628gs.Y(c1493fZ.a, c3038vP3.f.a)) {
                            j4 = c1628gs.F.i;
                        } else {
                            j4 = j;
                        }
                        c3038vP4 = c3329yP9.j;
                        if (c3038vP4.d) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (c3038vP4.f.a.a()) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                            c3038vP = c3038vP21;
                        } else {
                            c3038vP = c3038vP21;
                        }
                        zR = true;
                    }
                    zR = false;
                }
                if (zR) {
                    c1628gs.W(3);
                    c1628gs.Z = null;
                    if (X()) {
                        Z();
                    }
                }
            } else {
                c3038vP = c3038vP21;
            }
            if (c1628gs.I.e == 3) {
                c1628gs.N = X();
                c1628gs.W(2);
                if (c1628gs.N) {
                    while (c3038vP2 != null) {
                        while (i < r2) {
                            if (interfaceC1920js2 != null) {
                                interfaceC1920js2.t();
                            }
                        }
                    }
                    c1809il = c1628gs.F;
                    j2 = c1809il.i;
                    if (j2 != -9223372036854775807L) {
                        long j12 = j2 + c1809il.b;
                        c1809il.i = j12;
                        j3 = c1809il.h;
                        if (j3 != -9223372036854775807L) {
                            c1809il.i = j3;
                        }
                        c1809il.m = -9223372036854775807L;
                    }
                }
                b0();
            }
        } else {
            c1493fZ = c1628gs.I;
            if (c1493fZ.e == 2) {
                if (c1628gs.U == 0) {
                    c3038vP = c3038vP21;
                    zR = r();
                } else {
                    if (!z) {
                        c3038vP = c3038vP21;
                    } else if (c1493fZ.g) {
                        c3038vP = c3038vP21;
                    } else {
                        C3329yP c3329yP10 = c1628gs.D;
                        c3038vP3 = c3329yP10.h;
                        if (c1628gs.Y(c1493fZ.a, c3038vP3.f.a)) {
                            j4 = c1628gs.F.i;
                        } else {
                            j4 = j;
                        }
                        c3038vP4 = c3329yP10.j;
                        if (c3038vP4.d) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (c3038vP4.f.a.a()) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                            c3038vP = c3038vP21;
                        } else {
                            c3038vP = c3038vP21;
                        }
                        zR = true;
                    }
                    zR = false;
                }
                if (zR) {
                    c1628gs.W(3);
                    c1628gs.Z = null;
                    if (X()) {
                        Z();
                    }
                }
            } else {
                c3038vP = c3038vP21;
            }
            if (c1628gs.I.e == 3) {
                c1628gs.N = X();
                c1628gs.W(2);
                if (c1628gs.N) {
                    while (c3038vP2 != null) {
                        while (i < r2) {
                            if (interfaceC1920js2 != null) {
                                interfaceC1920js2.t();
                            }
                        }
                    }
                    c1809il = c1628gs.F;
                    j2 = c1809il.i;
                    if (j2 != -9223372036854775807L) {
                        long j13 = j2 + c1809il.b;
                        c1809il.i = j13;
                        j3 = c1809il.h;
                        if (j3 != -9223372036854775807L) {
                            c1809il.i = j3;
                        }
                        c1809il.m = -9223372036854775807L;
                    }
                }
                b0();
            }
        }
        if (c1628gs.I.e == 2) {
            i5 = 0;
            while (true) {
                abstractC1952k8Arr = c1628gs.l;
                if (i5 < abstractC1952k8Arr.length) {
                    break;
                    break;
                }
                if (q(abstractC1952k8Arr[i5])) {
                    d90 = c1628gs.l[i5].s;
                    c3038vP5 = c3038vP;
                    if (d90 == c3038vP5.c[i5]) {
                        d90.getClass();
                        d90.a();
                    }
                } else {
                    c3038vP5 = c3038vP;
                }
                i5++;
                c3038vP = c3038vP5;
            }
            c1493fZ3 = c1628gs.I;
            if (c1493fZ3.g) {
                z6 = false;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (!z6) {
            c1628gs.a0 = -9223372036854775807L;
        } else if (c1628gs.a0 == -9223372036854775807L) {
            c1628gs.B.getClass();
            c1628gs.a0 = SystemClock.elapsedRealtime();
        } else {
            c1628gs.B.getClass();
            if (SystemClock.elapsedRealtime() - c1628gs.a0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (X()) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (!c1628gs.T) {
            z8 = false;
        } else {
            z8 = false;
        }
        c1493fZ2 = c1628gs.I;
        if (c1493fZ2.f774o != z8) {
            c1628gs.I = new C1493fZ(c1493fZ2.a, c1493fZ2.b, c1493fZ2.c, c1493fZ2.d, c1493fZ2.e, c1493fZ2.f, c1493fZ2.g, c1493fZ2.h, c1493fZ2.i, c1493fZ2.j, c1493fZ2.k, c1493fZ2.l, c1493fZ2.m, c1493fZ2.n, c1493fZ2.p, c1493fZ2.q, c1493fZ2.r, c1493fZ2.s, z8);
        }
        c1628gs.S = false;
        if (!z8) {
            if (z7) {
                i4 = 2;
                if (i3 == 2) {
                    if (i3 == 3) {
                        c1628gs.s.a.sendEmptyMessageAtTime(2, jUptimeMillis + 1000);
                    }
                }
            } else {
                i4 = 2;
            }
            c1628gs.s.a.sendEmptyMessageAtTime(i4, jUptimeMillis + 10);
        }
        Pu0.i();
    }

    public final void c0() {
        C3038vP c3038vP = this.D.j;
        boolean z = this.O || (c3038vP != null && c3038vP.a.b());
        C1493fZ c1493fZ = this.I;
        if (z != c1493fZ.g) {
            this.I = new C1493fZ(c1493fZ.a, c1493fZ.b, c1493fZ.c, c1493fZ.d, c1493fZ.e, c1493fZ.f, z, c1493fZ.h, c1493fZ.i, c1493fZ.j, c1493fZ.k, c1493fZ.l, c1493fZ.m, c1493fZ.n, c1493fZ.p, c1493fZ.q, c1493fZ.r, c1493fZ.s, c1493fZ.f774o);
        }
    }

    @Override // o.InterfaceC2844tP
    public final void d(InterfaceC2941uP interfaceC2941uP) {
        this.s.a(8, interfaceC2941uP).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(C1909jm0 c1909jm0) {
        Fj0 fj0 = this.I.a;
        InterfaceC1920js[] interfaceC1920jsArr = (InterfaceC1920js[]) c1909jm0.n;
        C1906jl c1906jl = this.q;
        int iMax = c1906jl.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                AbstractC1952k8[] abstractC1952k8Arr = this.l;
                int i3 = 13107200;
                if (i < abstractC1952k8Arr.length) {
                    if (interfaceC1920jsArr[i] != null) {
                        switch (abstractC1952k8Arr[i].m) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        c1906jl.j = iMax;
        c1906jl.a.b(iMax);
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        this.s.a(9, (InterfaceC2941uP) ub0).b();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    public final void e0() {
        C1591gZ c1591gZB;
        C3038vP c3038vP = this.D.h;
        if (c3038vP == null) {
            return;
        }
        long jP = c3038vP.d ? c3038vP.a.p() : -9223372036854775807L;
        if (jP != -9223372036854775807L) {
            E(jP);
            if (jP != this.I.r) {
                C1493fZ c1493fZ = this.I;
                this.I = o(c1493fZ.b, jP, c1493fZ.c, jP, true, 5);
            }
        } else {
            C2004kl c2004kl = this.z;
            boolean z = c3038vP != this.D.i;
            AbstractC1952k8 abstractC1952k8 = c2004kl.n;
            C0019p c0019p = c2004kl.l;
            if (abstractC1952k8 == null || abstractC1952k8.j() || (!c2004kl.n.k() && (z || c2004kl.n.i()))) {
                c2004kl.p = true;
                if (c2004kl.q) {
                    c0019p.e();
                }
            } else {
                InterfaceC3037vO interfaceC3037vO = c2004kl.f873o;
                interfaceC3037vO.getClass();
                long jD = interfaceC3037vO.d();
                if (!c2004kl.p) {
                    c0019p.c(jD);
                    c1591gZB = interfaceC3037vO.b();
                    if (!c1591gZB.equals((C1591gZ) c0019p.p)) {
                        c0019p.a(c1591gZB);
                        c2004kl.m.s.a(16, c1591gZB).b();
                    }
                } else if (jD >= c0019p.d()) {
                    c2004kl.p = false;
                    if (c2004kl.q) {
                        c0019p.e();
                    }
                    c0019p.c(jD);
                    c1591gZB = interfaceC3037vO.b();
                    if (!c1591gZB.equals((C1591gZ) c0019p.p)) {
                        c0019p.a(c1591gZB);
                        c2004kl.m.s.a(16, c1591gZB).b();
                    }
                } else if (c0019p.l) {
                    c0019p.c(c0019p.d());
                    c0019p.l = false;
                }
            }
            long jD2 = c2004kl.d();
            this.W = jD2;
            long j = jD2 - c3038vP.f1072o;
            long j2 = this.I.r;
            if (!this.A.isEmpty() && !this.I.b.a()) {
                if (this.Y) {
                    this.Y = false;
                }
                C1493fZ c1493fZ2 = this.I;
                c1493fZ2.a.b(c1493fZ2.b.a);
                int iMin = Math.min(this.X, this.A.size());
                if (iMin > 0) {
                    AbstractC1674hK.w(this.A.get(iMin - 1));
                }
                if (iMin < this.A.size()) {
                    AbstractC1674hK.w(this.A.get(iMin));
                }
                this.X = iMin;
            }
            C1493fZ c1493fZ3 = this.I;
            c1493fZ3.r = j;
            c1493fZ3.s = SystemClock.elapsedRealtime();
        }
        this.I.p = this.D.j.d();
        C1493fZ c1493fZ4 = this.I;
        long j3 = c1493fZ4.p;
        C3038vP c3038vP2 = this.D.j;
        c1493fZ4.q = c3038vP2 == null ? 0L : Math.max(0L, j3 - (this.W - c3038vP2.f1072o));
        C1493fZ c1493fZ5 = this.I;
        if (c1493fZ5.l && c1493fZ5.e == 3 && Y(c1493fZ5.a, c1493fZ5.b)) {
            C1493fZ c1493fZ6 = this.I;
            float f = 1.0f;
            if (c1493fZ6.n.l == 1.0f) {
                C1809il c1809il = this.F;
                long jG = g(c1493fZ6.a, c1493fZ6.b.a, c1493fZ6.r);
                long j4 = this.I.p;
                C3038vP c3038vP3 = this.D.j;
                long jMax = c3038vP3 == null ? 0L : Math.max(0L, j4 - (this.W - c3038vP3.f1072o));
                if (c1809il.d != -9223372036854775807L) {
                    long j5 = jG - jMax;
                    long j6 = c1809il.n;
                    if (j6 == -9223372036854775807L) {
                        c1809il.n = j5;
                        c1809il.f835o = 0L;
                    } else {
                        float f2 = c1809il.c;
                        float f3 = 1.0f - f2;
                        long jMax2 = Math.max(j5, (long) ((j5 * f3) + (j6 * f2)));
                        c1809il.n = jMax2;
                        c1809il.f835o = (long) ((f3 * Math.abs(j5 - jMax2)) + (f2 * c1809il.f835o));
                    }
                    if (c1809il.m == -9223372036854775807L || SystemClock.elapsedRealtime() - c1809il.m >= 1000) {
                        c1809il.m = SystemClock.elapsedRealtime();
                        long j7 = (c1809il.f835o * 3) + c1809il.n;
                        if (c1809il.i > j7) {
                            float fK = Lr0.K(1000L);
                            long[] jArr = {j7, c1809il.f, c1809il.i - (((long) ((c1809il.l - 1.0f) * fK)) + ((long) ((c1809il.j - 1.0f) * fK)))};
                            long j8 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j8) {
                                    j8 = j9;
                                }
                            }
                            c1809il.i = j8;
                        } else {
                            long jK = Lr0.k(jG - ((long) (Math.max(0.0f, c1809il.l - 1.0f) / 1.0E-7f)), c1809il.i, j7);
                            c1809il.i = jK;
                            long j10 = c1809il.h;
                            if (j10 != -9223372036854775807L && jK > j10) {
                                c1809il.i = j10;
                            }
                        }
                        long j11 = jG - c1809il.i;
                        if (Math.abs(j11) < c1809il.a) {
                            c1809il.l = 1.0f;
                        } else {
                            c1809il.l = Lr0.i((1.0E-7f * j11) + 1.0f, c1809il.k, c1809il.j);
                        }
                        f = c1809il.l;
                    } else {
                        f = c1809il.l;
                    }
                }
                if (this.z.b().l != f) {
                    C1591gZ c1591gZ = new C1591gZ(f, this.I.n.m);
                    this.s.a.removeMessages(16);
                    this.z.a(c1591gZ);
                    n(this.I.n, this.z.b().l, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    public final void f(boolean[] zArr) throws Lr {
        AbstractC1952k8[] abstractC1952k8Arr;
        Set set;
        C3329yP c3329yP;
        C3038vP c3038vP;
        int i;
        AbstractC1952k8[] abstractC1952k8Arr2;
        InterfaceC3037vO interfaceC3037vO;
        C3329yP c3329yP2 = this.D;
        C3038vP c3038vP2 = c3329yP2.i;
        C1909jm0 c1909jm0 = c3038vP2.n;
        int i2 = 0;
        while (true) {
            abstractC1952k8Arr = this.l;
            int length = abstractC1952k8Arr.length;
            set = this.m;
            if (i2 >= length) {
                break;
            }
            if (!c1909jm0.x(i2) && set.remove(abstractC1952k8Arr[i2])) {
                abstractC1952k8Arr[i2].w();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < abstractC1952k8Arr.length) {
            if (c1909jm0.x(i3)) {
                boolean z = zArr[i3];
                AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i3];
                if (q(abstractC1952k8)) {
                    c3329yP = c3329yP2;
                    c3038vP = c3038vP2;
                    i = i3;
                    abstractC1952k8Arr2 = abstractC1952k8Arr;
                } else {
                    C3038vP c3038vP3 = c3329yP2.i;
                    boolean z2 = c3038vP3 == c3329yP2.h;
                    C1909jm0 c1909jm1 = c3038vP3.n;
                    Y60 y60 = ((Y60[]) c1909jm1.m)[i3];
                    InterfaceC1920js interfaceC1920js = ((InterfaceC1920js[]) c1909jm1.n)[i3];
                    int length2 = interfaceC1920js != null ? interfaceC1920js.length() : 0;
                    C0643Nw[] c0643NwArr = new C0643Nw[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        c0643NwArr[i4] = interfaceC1920js.d(i4);
                    }
                    boolean z3 = X() && this.I.e == 3;
                    boolean z4 = !z && z3;
                    this.U++;
                    set.add(abstractC1952k8);
                    D90 d90 = c3038vP3.c[i3];
                    c3329yP = c3329yP2;
                    c3038vP = c3038vP2;
                    long j = this.W;
                    long jE = c3038vP3.e();
                    i = i3;
                    abstractC1952k8Arr2 = abstractC1952k8Arr;
                    long j2 = c3038vP3.f1072o;
                    AbstractC0397Ej.f(abstractC1952k8.r == 0);
                    abstractC1952k8.f862o = y60;
                    abstractC1952k8.r = 1;
                    abstractC1952k8.m(z4, z2);
                    abstractC1952k8.v(c0643NwArr, d90, jE, j2);
                    abstractC1952k8.w = false;
                    abstractC1952k8.v = j;
                    abstractC1952k8.n(j, z4);
                    abstractC1952k8.c(11, new C1140bs(this));
                    C2004kl c2004kl = this.z;
                    c2004kl.getClass();
                    InterfaceC3037vO interfaceC3037vOG = abstractC1952k8.g();
                    if (interfaceC3037vOG != null && interfaceC3037vOG != (interfaceC3037vO = c2004kl.f873o)) {
                        if (interfaceC3037vO != null) {
                            throw new Lr(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c2004kl.f873o = interfaceC3037vOG;
                        c2004kl.n = abstractC1952k8;
                        ((AO) interfaceC3037vOG).a((C1591gZ) c2004kl.l.p);
                    }
                    if (z3) {
                        AbstractC0397Ej.f(abstractC1952k8.r == 1);
                        abstractC1952k8.r = 2;
                        abstractC1952k8.q();
                    }
                }
            } else {
                c3329yP = c3329yP2;
                c3038vP = c3038vP2;
                i = i3;
                abstractC1952k8Arr2 = abstractC1952k8Arr;
            }
            i3 = i + 1;
            c3329yP2 = c3329yP;
            c3038vP2 = c3038vP;
            abstractC1952k8Arr = abstractC1952k8Arr2;
        }
        c3038vP2.g = true;
    }

    public final void f0(Fj0 fj0, CP cp, Fj0 fj1, CP cp2, long j, boolean z) {
        if (!Y(fj0, cp)) {
            C1591gZ c1591gZ = cp.a() ? C1591gZ.f794o : this.I.n;
            C2004kl c2004kl = this.z;
            if (c2004kl.b().equals(c1591gZ)) {
                return;
            }
            this.s.a.removeMessages(16);
            c2004kl.a(c1591gZ);
            n(this.I.n, c1591gZ.l, false, false);
            return;
        }
        Object obj = cp.a;
        Dj0 dj0 = this.w;
        int i = fj0.h(obj, dj0).n;
        Ej0 ej0 = this.v;
        fj0.o(i, ej0);
        C1385eP c1385eP = ej0.v;
        int i2 = Lr0.a;
        C1809il c1809il = this.F;
        c1809il.getClass();
        c1809il.d = Lr0.K(c1385eP.l);
        c1809il.g = Lr0.K(c1385eP.m);
        c1809il.h = Lr0.K(c1385eP.n);
        float f = c1385eP.f752o;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c1809il.k = f;
        float f2 = c1385eP.p;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c1809il.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c1809il.d = -9223372036854775807L;
        }
        c1809il.a();
        if (j != -9223372036854775807L) {
            c1809il.e = g(fj0, obj, j);
            c1809il.a();
            return;
        }
        if (!Lr0.a(!fj1.q() ? fj1.n(fj1.h(cp2.a, dj0).n, ej0, 0L).l : null, ej0.l) || z) {
            c1809il.e = -9223372036854775807L;
            c1809il.a();
        }
    }

    public final long g(Fj0 fj0, Object obj, long j) {
        Dj0 dj0 = this.w;
        int i = fj0.h(obj, dj0).n;
        Ej0 ej0 = this.v;
        fj0.o(i, ej0);
        if (ej0.q != -9223372036854775807L && ej0.a() && ej0.t) {
            return Lr0.K(Lr0.w(ej0.r) - ej0.q) - (j + dj0.p);
        }
        return -9223372036854775807L;
    }

    public final synchronized void g0(C2296nl c2296nl, long j) {
        this.B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c2296nl.get()).booleanValue() && j > 0) {
            try {
                this.B.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.B.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair h(Fj0 fj0) {
        if (fj0.q()) {
            return Pair.create(C1493fZ.t, 0L);
        }
        Pair pairJ = fj0.j(this.v, this.w, fj0.a(this.Q), -9223372036854775807L);
        CP cpN = this.D.n(fj0, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (cpN.a()) {
            Object obj = cpN.a;
            Dj0 dj0 = this.w;
            fj0.h(obj, dj0);
            jLongValue = cpN.c == dj0.f(cpN.b) ? dj0.r.n : 0L;
        }
        return Pair.create(cpN, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        C3038vP c3038vP;
        C3038vP c3038vP2;
        int i = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    J((C1530fs) message.obj);
                    break;
                case 4:
                    S((C1591gZ) message.obj);
                    break;
                case 5:
                    this.H = (C2761sb0) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    m((InterfaceC2941uP) message.obj);
                    break;
                case 9:
                    i((InterfaceC2941uP) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    BZ bz = (BZ) message.obj;
                    bz.getClass();
                    Looper looper = bz.f;
                    Looper looper2 = this.u;
                    Uh0 uh0 = this.s;
                    if (looper != looper2) {
                        uh0.a(15, bz).b();
                    } else {
                        synchronized (bz) {
                        }
                        try {
                            bz.a.c(bz.d, bz.e);
                            bz.b(true);
                            int i2 = this.I.e;
                            if (i2 == 3 || i2 == 2) {
                                uh0.d(2);
                            }
                        } catch (Throwable th) {
                            bz.b(true);
                            throw th;
                        }
                    }
                    break;
                case 15:
                    L((BZ) message.obj);
                    break;
                case 16:
                    C1591gZ c1591gZ = (C1591gZ) message.obj;
                    n(c1591gZ, c1591gZ.l, true, false);
                    break;
                case 17:
                    O((C1237cs) message.obj);
                    break;
                case 18:
                    a((C1237cs) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC1674hK.w(message.obj);
                    v();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (Jd0) message.obj);
                    break;
                case 21:
                    V((Jd0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    B();
                    I(true);
                    break;
                case 26:
                    B();
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (B8 e) {
            j(1002, e);
        } catch (Lr e2) {
            Lr lrB = e2;
            int i3 = lrB.n;
            C3329yP c3329yP = this.D;
            if (i3 == 1 && (c3038vP2 = c3329yP.i) != null) {
                lrB = lrB.b(c3038vP2.f.a);
            }
            if (lrB.t && this.Z == null) {
                AP.A("Recoverable renderer error", lrB);
                this.Z = lrB;
                Uh0 uh1 = this.s;
                Th0 th0A = uh1.a(25, lrB);
                uh1.getClass();
                Message message2 = th0A.a;
                message2.getClass();
                uh1.a.sendMessageAtFrontOfQueue(message2);
                th0A.a();
            } else {
                Lr lr = this.Z;
                if (lr != null) {
                    lr.addSuppressed(lrB);
                    lrB = this.Z;
                }
                Lr lr2 = lrB;
                AP.g("Playback error", lr2);
                if (lr2.n == 1 && c3329yP.h != c3329yP.i) {
                    while (true) {
                        c3038vP = c3329yP.h;
                        if (c3038vP == c3329yP.i) {
                            break;
                        }
                        c3329yP.a();
                    }
                    c3038vP.getClass();
                    C3232xP c3232xP = c3038vP.f;
                    CP cp = c3232xP.a;
                    long j = c3232xP.b;
                    this.I = o(cp, j, c3232xP.c, j, true, 0);
                }
                a0(true, false);
                this.I = this.I.e(lr2);
            }
        } catch (C2679rj e3) {
            j(e3.l, e3);
        } catch (C2949uX e4) {
            boolean z = e4.l;
            int i4 = e4.m;
            if (i4 == 1) {
                i = z ? 3001 : 3003;
            } else if (i4 == 4) {
                i = z ? 3002 : 3004;
            }
            j(i, e4);
        } catch (C3368yo e5) {
            j(e5.l, e5);
        } catch (IOException e6) {
            j(2000, e6);
        } catch (RuntimeException e7) {
            Lr lr3 = new Lr(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AP.g("Playback error", lr3);
            a0(true, false);
            this.I = this.I.e(lr3);
        }
        t();
        return true;
    }

    public final void i(InterfaceC2941uP interfaceC2941uP) {
        C3038vP c3038vP = this.D.j;
        if (c3038vP == null || c3038vP.a != interfaceC2941uP) {
            return;
        }
        long j = this.W;
        if (c3038vP != null) {
            AbstractC0397Ej.f(c3038vP.l == null);
            if (c3038vP.d) {
                c3038vP.a.O(j - c3038vP.f1072o);
            }
        }
        s();
    }

    public final void j(int i, IOException iOException) {
        Lr lr = new Lr(0, iOException, i);
        C3038vP c3038vP = this.D.h;
        if (c3038vP != null) {
            lr = lr.b(c3038vP.f.a);
        }
        AP.g("Playback error", lr);
        a0(false, false);
        this.I = this.I.e(lr);
    }

    public final void k(boolean z) {
        C3038vP c3038vP = this.D.j;
        CP cp = c3038vP == null ? this.I.b : c3038vP.f.a;
        boolean z2 = !this.I.k.equals(cp);
        if (z2) {
            this.I = this.I.b(cp);
        }
        C1493fZ c1493fZ = this.I;
        c1493fZ.p = c3038vP == null ? c1493fZ.r : c3038vP.d();
        C1493fZ c1493fZ2 = this.I;
        long j = c1493fZ2.p;
        C3038vP c3038vP2 = this.D.j;
        c1493fZ2.q = c3038vP2 != null ? Math.max(0L, j - (this.W - c3038vP2.f1072o)) : 0L;
        if ((z2 || z) && c3038vP != null && c3038vP.d) {
            CP cp2 = c3038vP.f.a;
            d0(c3038vP.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02e7 A[Catch: all -> 0x02ec, TryCatch #4 {all -> 0x02ec, blocks: (B:166:0x02e1, B:168:0x02e7, B:175:0x02fb, B:177:0x0306, B:179:0x030c, B:181:0x0316, B:182:0x0323, B:183:0x0326, B:187:0x0331), top: B:251:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:235:0x0408  */
    /* JADX WARN: Code duplicated, block: B:236:0x040a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0431  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0201  */
    public final void l(Fj0 fj0, boolean z) throws Throwable {
        CP cp;
        int i;
        int i2;
        long j;
        int iA;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j2;
        boolean z6;
        long j3;
        C1432es c1432es;
        int i3;
        int iA3;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        long j4;
        Object obj;
        boolean z11;
        int i5;
        long j5;
        long j6;
        long jK;
        C1493fZ c1493fZ = this.I;
        C1530fs c1530fs = this.V;
        C3329yP c3329yP = this.D;
        int i6 = this.P;
        boolean z12 = this.Q;
        Ej0 ej0 = this.v;
        Dj0 dj0 = this.w;
        if (fj0.q()) {
            c1432es = new C1432es(C1493fZ.t, 0L, -9223372036854775807L, false, true, false);
            j = 0;
        } else {
            CP cp2 = c1493fZ.b;
            Object obj2 = cp2.a;
            Fj0 fj1 = c1493fZ.a;
            boolean z13 = fj1.q() || fj1.h(cp2.a, dj0).q;
            long jLongValue = (c1493fZ.b.a() || z13) ? c1493fZ.c : c1493fZ.r;
            if (c1530fs != null) {
                i = 4;
                Pair pairG = G(fj0, c1530fs, true, i6, z12, ej0, dj0);
                if (pairG == null) {
                    iA3 = fj0.a(z12);
                    jLongValue = jLongValue;
                    z9 = false;
                    z8 = false;
                    z10 = true;
                } else {
                    if (c1530fs.c == -9223372036854775807L) {
                        iA3 = fj0.h(pairG.first, dj0).n;
                        jLongValue = jLongValue;
                        z7 = false;
                    } else {
                        obj2 = pairG.first;
                        jLongValue = ((Long) pairG.second).longValue();
                        iA3 = -1;
                        z7 = true;
                    }
                    z8 = c1493fZ.e == 4;
                    z9 = z7;
                    z10 = false;
                }
                z4 = z9;
                z2 = z8;
                z3 = z10;
                cp = cp2;
                i2 = -1;
                j = 0;
                iA = iA3;
            } else {
                cp = cp2;
                i = 4;
                if (c1493fZ.a.q()) {
                    iA = fj0.a(z12);
                    i2 = -1;
                } else {
                    i2 = -1;
                    if (fj0.b(obj2) == -1) {
                        Object objH = H(ej0, dj0, i6, z12, obj2, c1493fZ.a, fj0);
                        if (objH == null) {
                            iA2 = fj0.a(z12);
                            z5 = true;
                        } else {
                            iA2 = fj0.h(objH, dj0).n;
                            z5 = false;
                        }
                        iA = iA2;
                        z3 = z5;
                        jLongValue = jLongValue;
                        cp = cp;
                        j = 0;
                        z2 = false;
                        z4 = false;
                    } else if (jLongValue == -9223372036854775807L) {
                        iA = fj0.h(obj2, dj0).n;
                    } else if (z13) {
                        cp = cp;
                        c1493fZ.a.h(cp.a, dj0);
                        j = 0;
                        if (c1493fZ.a.n(dj0.n, ej0, 0L).z == c1493fZ.a.b(cp.a)) {
                            Pair pairJ = fj0.j(ej0, dj0, fj0.h(obj2, dj0).n, jLongValue + dj0.p);
                            obj2 = pairJ.first;
                            jLongValue = ((Long) pairJ.second).longValue();
                        } else {
                            jLongValue = jLongValue;
                        }
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        cp = cp;
                        j = 0;
                        jLongValue = jLongValue;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                j = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != i2) {
                Pair pairJ2 = fj0.j(ej0, dj0, iA, -9223372036854775807L);
                obj2 = pairJ2.first;
                jLongValue = ((Long) pairJ2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j2 = jLongValue;
            }
            CP cpN = c3329yP.n(fj0, obj2, jLongValue);
            int i7 = cpN.e;
            boolean z14 = cp.a.equals(obj2) && !cp.a() && !cpN.a() && (i7 == i2 || ((i3 = cp.e) != i2 && i7 >= i3));
            Dj0 dj0H = fj0.h(obj2, dj0);
            if (z13 || jLongValue != j2 || !cp.a.equals(cpN.a)) {
                z6 = false;
            } else if (cp.a()) {
                int i8 = cp.b;
                if (dj0H.i(i8)) {
                    int i9 = cp.c;
                    if (dj0H.e(i8, i9) == i || dj0H.e(i8, i9) == 2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else if (cpN.a() || !dj0H.i(cpN.b)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else {
                if (cpN.a()) {
                }
                z6 = false;
            }
            if (z14 || z6) {
                cpN = cp;
            }
            if (!cpN.a()) {
                j3 = jLongValue;
            } else if (cpN.equals(cp)) {
                j3 = c1493fZ.r;
            } else {
                fj0.h(cpN.a, dj0);
                j3 = cpN.c == dj0.f(cpN.b) ? dj0.r.n : j;
            }
            c1432es = new C1432es(cpN, j3, j2, z2, z3, z4);
        }
        CP cp3 = c1432es.a;
        long j7 = c1432es.c;
        boolean z15 = c1432es.d;
        long j8 = c1432es.b;
        boolean z16 = (this.I.b.equals(cp3) && j8 == this.I.r) ? false : true;
        try {
            if (c1432es.e) {
                try {
                    if (this.I.e != 1) {
                        W(4);
                    }
                    C(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    j = j7;
                    i4 = -1;
                    j7 = j8;
                    C1493fZ c1493fZ2 = this.I;
                    Fj0 fj2 = c1493fZ2.a;
                    CP cp4 = c1493fZ2.b;
                    if (c1432es.f) {
                        j4 = j7;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    f0(fj0, cp3, fj2, cp4, j4, false);
                    if (z16) {
                        C1493fZ c1493fZ3 = this.I;
                        obj = c1493fZ3.b.a;
                        Fj0 fj3 = c1493fZ3.a;
                        if (z16) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long j9 = this.I.d;
                        if (fj0.b(obj) == i4) {
                            i5 = 4;
                        } else {
                            i5 = 3;
                        }
                        this.I = o(cp3, j7, j, j9, z11, i5);
                    } else {
                        C1493fZ c1493fZ4 = this.I;
                        obj = c1493fZ4.b.a;
                        Fj0 fj4 = c1493fZ4.a;
                        if (z16) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long j10 = this.I.d;
                        if (fj0.b(obj) == i4) {
                            i5 = 4;
                        } else {
                            i5 = 3;
                        }
                        this.I = o(cp3, j7, j, j10, z11, i5);
                    }
                    D();
                    F(fj0, this.I.a);
                    this.I = this.I.h(fj0);
                    if (!fj0.q()) {
                        this.V = null;
                    }
                    k(false);
                    throw th;
                }
            }
            try {
                if (z16) {
                    j = j7;
                    jK = j8;
                    if (!fj0.q()) {
                        for (C3038vP c3038vP = this.D.h; c3038vP != null; c3038vP = c3038vP.l) {
                            if (c3038vP.f.a.equals(cp3)) {
                                c3038vP.f = this.D.h(fj0, c3038vP.f);
                                c3038vP.h();
                            }
                        }
                        C3329yP c3329yP2 = this.D;
                        jK = K(cp3, jK, c3329yP2.h != c3329yP2.i, z15);
                    }
                } else {
                    try {
                        C3329yP c3329yP3 = this.D;
                        long j11 = this.W;
                        C3038vP c3038vP2 = c3329yP3.i;
                        if (c3038vP2 == null) {
                            j5 = j8;
                            j6 = j;
                        } else {
                            j5 = j8;
                            try {
                                long jMax = c3038vP2.f1072o;
                                if (c3038vP2.d) {
                                    int i10 = 0;
                                    while (true) {
                                        AbstractC1952k8[] abstractC1952k8Arr = this.l;
                                        if (i10 >= abstractC1952k8Arr.length) {
                                            j = j7;
                                            j6 = jMax;
                                            break;
                                        }
                                        if (q(abstractC1952k8Arr[i10])) {
                                            AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i10];
                                            j = j7;
                                            try {
                                                if (abstractC1952k8.s == c3038vP2.c[i10]) {
                                                    long j12 = abstractC1952k8.v;
                                                    j6 = Long.MIN_VALUE;
                                                    if (j12 == Long.MIN_VALUE) {
                                                        break;
                                                    } else {
                                                        jMax = Math.max(j12, jMax);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j7 = j5;
                                                i4 = -1;
                                                C1493fZ c1493fZ5 = this.I;
                                                Fj0 fj5 = c1493fZ5.a;
                                                CP cp5 = c1493fZ5.b;
                                                if (c1432es.f) {
                                                    j4 = j7;
                                                } else {
                                                    j4 = -9223372036854775807L;
                                                }
                                                f0(fj0, cp3, fj5, cp5, j4, false);
                                                if (z16 || j != this.I.c) {
                                                    C1493fZ c1493fZ6 = this.I;
                                                    obj = c1493fZ6.b.a;
                                                    Fj0 fj6 = c1493fZ6.a;
                                                    if (z16 || !z || fj6.q() || fj6.h(obj, this.w).q) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    long j13 = this.I.d;
                                                    if (fj0.b(obj) == i4) {
                                                        i5 = 4;
                                                    } else {
                                                        i5 = 3;
                                                    }
                                                    this.I = o(cp3, j7, j, j13, z11, i5);
                                                }
                                                D();
                                                F(fj0, this.I.a);
                                                this.I = this.I.h(fj0);
                                                if (!fj0.q()) {
                                                    this.V = null;
                                                }
                                                k(false);
                                                throw th;
                                            }
                                        } else {
                                            j = j7;
                                        }
                                        i10++;
                                        j7 = j;
                                    }
                                } else {
                                    j6 = jMax;
                                }
                                jK = j5;
                                if (!c3329yP3.p(fj0, j11, j6)) {
                                    I(false);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j = j7;
                            }
                        }
                        j = j7;
                        jK = j5;
                        if (!c3329yP3.p(fj0, j11, j6)) {
                            I(false);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j = j7;
                        j7 = j8;
                    }
                }
                C1493fZ c1493fZ7 = this.I;
                f0(fj0, cp3, c1493fZ7.a, c1493fZ7.b, c1432es.f ? jK : -9223372036854775807L, false);
                if (z16 || j != this.I.c) {
                    C1493fZ c1493fZ8 = this.I;
                    Object obj3 = c1493fZ8.b.a;
                    Fj0 fj7 = c1493fZ8.a;
                    this.I = o(cp3, jK, j, this.I.d, z16 && z && !fj7.q() && !fj7.h(obj3, this.w).q, fj0.b(obj3) == -1 ? 4 : 3);
                }
                D();
                F(fj0, this.I.a);
                this.I = this.I.h(fj0);
                if (!fj0.q()) {
                    this.V = null;
                }
                k(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void m(InterfaceC2941uP interfaceC2941uP) throws Lr {
        C3329yP c3329yP = this.D;
        C3038vP c3038vP = c3329yP.j;
        if (c3038vP == null || c3038vP.a != interfaceC2941uP) {
            return;
        }
        float f = this.z.b().l;
        Fj0 fj0 = this.I.a;
        c3038vP.d = true;
        c3038vP.m = c3038vP.a.t();
        C1909jm0 c1909jm0G = c3038vP.g(f, fj0);
        C3232xP c3232xP = c3038vP.f;
        long jMax = c3232xP.b;
        long j = c3232xP.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = c3038vP.a(c1909jm0G, jMax, false, new boolean[c3038vP.i.length]);
        long j2 = c3038vP.f1072o;
        C3232xP c3232xP2 = c3038vP.f;
        c3038vP.f1072o = (c3232xP2.b - jA) + j2;
        c3038vP.f = c3232xP2.b(jA);
        d0(c3038vP.n);
        if (c3038vP == c3329yP.h) {
            E(c3038vP.f.b);
            f(new boolean[this.l.length]);
            C1493fZ c1493fZ = this.I;
            CP cp = c1493fZ.b;
            long j3 = c3038vP.f.b;
            this.I = o(cp, j3, c1493fZ.c, j3, false, 5);
        }
        s();
    }

    public final void n(C1591gZ c1591gZ, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.J.a(1);
            }
            this.I = this.I.f(c1591gZ);
        }
        float f2 = c1591gZ.l;
        C3038vP c3038vP = this.D.h;
        while (true) {
            i = 0;
            if (c3038vP == null) {
                break;
            }
            InterfaceC1920js[] interfaceC1920jsArr = (InterfaceC1920js[]) c3038vP.n.n;
            int length = interfaceC1920jsArr.length;
            while (i < length) {
                InterfaceC1920js interfaceC1920js = interfaceC1920jsArr[i];
                if (interfaceC1920js != null) {
                    interfaceC1920js.p(f2);
                }
                i++;
            }
            c3038vP = c3038vP.l;
        }
        AbstractC1952k8[] abstractC1952k8Arr = this.l;
        int length2 = abstractC1952k8Arr.length;
        while (i < length2) {
            AbstractC1952k8 abstractC1952k8 = abstractC1952k8Arr[i];
            if (abstractC1952k8 != null) {
                abstractC1952k8.x(f, c1591gZ.l);
            }
            i++;
        }
    }

    public final C1493fZ o(CP cp, long j, long j2, long j3, boolean z, int i) {
        C1031am0 c1031am0;
        C1909jm0 c1909jm0;
        List list;
        M60 m60G;
        int i2;
        this.Y = (!this.Y && j == this.I.r && cp.equals(this.I.b)) ? false : true;
        D();
        C1493fZ c1493fZ = this.I;
        C1031am0 c1031am1 = c1493fZ.h;
        C1909jm0 c1909jm1 = c1493fZ.i;
        List list2 = c1493fZ.j;
        if (this.E.a) {
            C3038vP c3038vP = this.D.h;
            C1031am0 c1031am2 = c3038vP == null ? C1031am0.f678o : c3038vP.m;
            C1909jm0 c1909jm2 = c3038vP == null ? this.p : c3038vP.n;
            InterfaceC1920js[] interfaceC1920jsArr = (InterfaceC1920js[]) c1909jm2.n;
            WE we = new WE();
            int length = interfaceC1920jsArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                InterfaceC1920js interfaceC1920js = interfaceC1920jsArr[i3];
                if (interfaceC1920js == null) {
                    i2 = 1;
                } else {
                    CQ cq = interfaceC1920js.d(0).u;
                    if (cq == null) {
                        we.a(new CQ(new BQ[0]));
                        i2 = 1;
                    } else {
                        we.a(cq);
                        i2 = 1;
                        z2 = true;
                    }
                }
                i3 += i2;
            }
            if (z2) {
                m60G = we.g();
            } else {
                XE xe = AbstractC0985aF.m;
                m60G = M60.p;
            }
            if (c3038vP != null) {
                C3232xP c3232xP = c3038vP.f;
                if (c3232xP.c != j2) {
                    c3038vP.f = c3232xP.a(j2);
                }
            }
            list = m60G;
            c1031am0 = c1031am2;
            c1909jm0 = c1909jm2;
        } else if (cp.equals(c1493fZ.b)) {
            c1031am0 = c1031am1;
            c1909jm0 = c1909jm1;
            list = list2;
        } else {
            c1031am0 = C1031am0.f678o;
            c1909jm0 = this.p;
            list = M60.p;
        }
        if (z) {
            C1334ds c1334ds = this.J;
            if (!c1334ds.d || c1334ds.e == 5) {
                c1334ds.a = true;
                c1334ds.d = true;
                c1334ds.e = i;
            } else {
                AbstractC0397Ej.c(i == 5);
            }
        }
        C1493fZ c1493fZ2 = this.I;
        long j4 = c1493fZ2.p;
        C3038vP c3038vP2 = this.D.j;
        return c1493fZ2.c(cp, j, j2, j3, c3038vP2 == null ? 0L : Math.max(0L, j4 - (this.W - c3038vP2.f1072o)), c1031am0, c1909jm0, list);
    }

    public final boolean p() {
        C3038vP c3038vP = this.D.j;
        if (c3038vP == null) {
            return false;
        }
        return (!c3038vP.d ? 0L : c3038vP.a.o()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        C3038vP c3038vP = this.D.h;
        long j = c3038vP.f.e;
        return c3038vP.d && (j == -9223372036854775807L || this.I.r < j || !X());
    }

    public final void s() {
        boolean zC;
        if (p()) {
            C3038vP c3038vP = this.D.j;
            long jO = !c3038vP.d ? 0L : c3038vP.a.o();
            C3038vP c3038vP2 = this.D.j;
            long jMax = c3038vP2 == null ? 0L : Math.max(0L, jO - (this.W - c3038vP2.f1072o));
            if (c3038vP != this.D.h) {
                long j = c3038vP.f.b;
            }
            zC = this.q.c(jMax, this.z.b().l);
            if (!zC && jMax < 500000 && (this.x > 0 || this.y)) {
                this.D.h.a.E(this.I.r, false);
                zC = this.q.c(jMax, this.z.b().l);
            }
        } else {
            zC = false;
        }
        this.O = zC;
        if (zC) {
            C3038vP c3038vP3 = this.D.j;
            long j2 = this.W;
            AbstractC0397Ej.f(c3038vP3.l == null);
            c3038vP3.a.K(j2 - c3038vP3.f1072o);
        }
        c0();
    }

    public final void t() {
        C1334ds c1334ds = this.J;
        C1493fZ c1493fZ = this.I;
        boolean z = c1334ds.a | (c1334ds.b != c1493fZ);
        c1334ds.a = z;
        c1334ds.b = c1493fZ;
        if (z) {
            C1042as c1042as = this.C.m;
            c1042as.i.c(new O3(c1042as, 7, c1334ds));
            this.J = new C1334ds(this.I);
        }
    }

    public final void u() throws Throwable {
        l(this.E.c(), true);
    }

    public final void v() {
        this.J.a(1);
        throw null;
    }

    public final void w() {
        this.J.a(1);
        int i = 0;
        C(false, false, false, true);
        this.q.b(false);
        W(this.I.a.q() ? 4 : 2);
        C2197mk c2197mk = (C2197mk) this.r;
        c2197mk.getClass();
        QP qp = this.E;
        AbstractC0397Ej.f(!qp.a);
        qp.l = c2197mk;
        while (true) {
            ArrayList arrayList = (ArrayList) qp.c;
            if (i >= arrayList.size()) {
                qp.a = true;
                this.s.d(2);
                return;
            } else {
                PP pp = (PP) arrayList.get(i);
                qp.g(pp);
                ((HashSet) qp.h).add(pp);
                i++;
            }
        }
    }

    public final synchronized boolean x() {
        if (!this.K && this.u.getThread().isAlive()) {
            this.s.d(7);
            g0(new C2296nl(4, this), this.G);
            return this.K;
        }
        return true;
    }

    public final void y() {
        C(true, false, true, false);
        z();
        this.q.b(true);
        W(1);
        HandlerThread handlerThread = this.t;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }

    public final void z() {
        for (int i = 0; i < this.l.length; i++) {
            AbstractC1952k8 abstractC1952k8 = this.n[i];
            synchronized (abstractC1952k8.l) {
                abstractC1952k8.y = null;
            }
            AbstractC1952k8 abstractC1952k9 = this.l[i];
            AbstractC0397Ej.f(abstractC1952k9.r == 0);
            abstractC1952k9.o();
        }
    }
}
