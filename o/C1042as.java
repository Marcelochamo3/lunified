package o;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: o.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042as extends AbstractC1074b8 implements InterfaceC0664Or {
    public final T6 A;
    public final C2743sL B;
    public final C3325yL C;
    public final long D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public C2761sb0 K;
    public Jd0 L;
    public C1981kZ M;
    public C2263nP N;
    public C2263nP O;
    public C0643Nw P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public Af0 U;
    public boolean V;
    public TextureView W;
    public final int X;
    public C2186me0 Y;
    public final int Z;
    public I6 a0;
    public final C1909jm0 b;
    public final float b0;
    public final C1981kZ c;
    public boolean c0;
    public final io.sentry.X1 d;
    public C3259xi d0;
    public final Context e;
    public final boolean e0;
    public final InterfaceC2370oZ f;
    public boolean f0;
    public final AbstractC1952k8[] g;
    public boolean g0;
    public final AbstractC3133wN h;
    public C1045at0 h0;
    public final Uh0 i;
    public C2263nP i0;
    public final C0768Sr j;
    public C1493fZ j0;
    public final C1628gs k;
    public int k0;
    public final TK l;
    public long l0;
    public final CopyOnWriteArraySet m;
    public final Dj0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f682o;
    public final boolean p;
    public final BP q;
    public final C0942Zj r;
    public final Looper s;
    public final N7 t;
    public final long u;
    public final long v;
    public final Sh0 w;
    public final SurfaceHolderCallbackC0898Xr x;
    public final C0924Yr y;
    public final C1797ie0 z;

    static {
        AbstractC1726hs.a("goog.exo.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042as(C0638Nr c0638Nr) {
        super(1);
        int i = 2;
        int i2 = 1;
        this.d = new io.sentry.X1();
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i3 = Lr0.a;
            AP.j();
            Context context = c0638Nr.a;
            Looper looper = c0638Nr.i;
            this.e = context.getApplicationContext();
            InterfaceC0671Oy interfaceC0671Oy = c0638Nr.h;
            Sh0 sh0 = c0638Nr.b;
            this.r = (C0942Zj) interfaceC0671Oy.apply(sh0);
            this.a0 = c0638Nr.j;
            this.X = c0638Nr.k;
            this.c0 = false;
            this.D = c0638Nr.r;
            SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = new SurfaceHolderCallbackC0898Xr(this);
            this.x = surfaceHolderCallbackC0898Xr;
            this.y = new C0924Yr();
            Handler handler = new Handler(looper);
            AbstractC1952k8[] abstractC1952k8ArrA = ((C3168wl) c0638Nr.c.get()).a(handler, surfaceHolderCallbackC0898Xr, surfaceHolderCallbackC0898Xr, surfaceHolderCallbackC0898Xr, surfaceHolderCallbackC0898Xr);
            this.g = abstractC1952k8ArrA;
            AbstractC0397Ej.f(abstractC1952k8ArrA.length > 0);
            this.h = (AbstractC3133wN) c0638Nr.e.get();
            this.q = (BP) c0638Nr.d.get();
            this.t = (N7) c0638Nr.g.get();
            this.p = c0638Nr.l;
            this.K = c0638Nr.m;
            this.u = c0638Nr.n;
            this.v = c0638Nr.f418o;
            this.s = looper;
            this.w = sh0;
            this.f = this;
            this.l = new TK(looper, sh0, new C0768Sr(this, i2));
            this.m = new CopyOnWriteArraySet();
            this.f682o = new ArrayList();
            this.L = new Jd0();
            this.b = new C1909jm0(new Y60[abstractC1952k8ArrA.length], new InterfaceC1920js[abstractC1952k8ArrA.length], C2105lm0.m, (C3036vN) null);
            this.n = new Dj0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i4 = 0; i4 < 19; i4++) {
                int i5 = iArr[i4];
                AbstractC0397Ej.f(!false);
                sparseBooleanArray.append(i5, true);
            }
            this.h.getClass();
            AbstractC0397Ej.f(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0397Ej.f(!false);
            C3188wv c3188wv = new C3188wv(sparseBooleanArray);
            this.c = new C1981kZ(c3188wv);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i6 = 0; i6 < c3188wv.a.size(); i6++) {
                int iA = c3188wv.a(i6);
                AbstractC0397Ej.f(!false);
                sparseBooleanArray2.append(iA, true);
            }
            AbstractC0397Ej.f(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0397Ej.f(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0397Ej.f(!false);
            this.M = new C1981kZ(new C3188wv(sparseBooleanArray2));
            this.i = this.w.a(this.s, null);
            C0768Sr c0768Sr = new C0768Sr(this, i);
            this.j = c0768Sr;
            this.j0 = C1493fZ.i(this.b);
            this.r.U(this.f, this.s);
            int i7 = Lr0.a;
            this.k = new C1628gs(this.g, this.h, this.b, (C1906jl) c0638Nr.f.get(), this.t, this.E, this.F, this.r, this.K, c0638Nr.p, c0638Nr.q, false, this.s, this.w, c0768Sr, i7 < 31 ? new C3436zZ() : AbstractC0872Wr.a(this.e, this, c0638Nr.s));
            this.b0 = 1.0f;
            this.E = 0;
            C2263nP c2263nP = C2263nP.T;
            this.N = c2263nP;
            this.O = c2263nP;
            this.i0 = c2263nP;
            int iGenerateAudioSessionId = -1;
            this.k0 = -1;
            if (i7 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.Z = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.Z = iGenerateAudioSessionId;
            }
            this.d0 = C3259xi.m;
            this.e0 = true;
            C0942Zj c0942Zj = this.r;
            c0942Zj.getClass();
            this.l.a(c0942Zj);
            N7 n7 = this.t;
            Handler handler2 = new Handler(this.s);
            C0942Zj c0942Zj2 = this.r;
            C2197mk c2197mk = (C2197mk) n7;
            c2197mk.getClass();
            c0942Zj2.getClass();
            C2133m1 c2133m1 = c2197mk.b;
            c2133m1.getClass();
            CopyOnWriteArrayList<M7> copyOnWriteArrayList = (CopyOnWriteArrayList) c2133m1.m;
            for (M7 m7 : copyOnWriteArrayList) {
                if (m7.b == c0942Zj2) {
                    m7.c = true;
                    copyOnWriteArrayList.remove(m7);
                }
            }
            copyOnWriteArrayList.add(new M7(handler2, c0942Zj2));
            this.m.add(this.x);
            C1797ie0 c1797ie0 = new C1797ie0(context, handler, this.x);
            this.z = c1797ie0;
            c1797ie0.k();
            T6 t6 = new T6(context, handler, this.x);
            this.A = t6;
            t6.b(null);
            this.B = new C2743sL(context);
            C3325yL c3325yL = new C3325yL();
            this.C = c3325yL;
            t();
            this.h0 = C1045at0.p;
            this.Y = C2186me0.c;
            this.h.b(this.a0);
            U(1, 10, Integer.valueOf(this.Z));
            U(2, 10, Integer.valueOf(this.Z));
            U(1, 3, this.a0);
            U(2, 4, Integer.valueOf(this.X));
            U(2, 5, 0);
            U(1, 9, Boolean.valueOf(this.c0));
            U(2, 7, this.y);
            U(6, 8, this.y);
        } finally {
            this.d.b();
        }
    }

    public static long K(C1493fZ c1493fZ) {
        Ej0 ej0 = new Ej0();
        Dj0 dj0 = new Dj0();
        c1493fZ.a.h(c1493fZ.b.a, dj0);
        long j = c1493fZ.c;
        if (j != -9223372036854775807L) {
            return dj0.p + j;
        }
        return c1493fZ.a.n(dj0.n, ej0, 0L).x;
    }

    public static C2685rm t() {
        C2712s0 c2712s0 = new C2712s0(0);
        c2712s0.b = 0;
        c2712s0.c = 0;
        return c2712s0.a();
    }

    public final int A() {
        i0();
        int iG = G(this.j0);
        if (iG == -1) {
            return 0;
        }
        return iG;
    }

    public final int B() {
        i0();
        if (this.j0.a.q()) {
            return 0;
        }
        C1493fZ c1493fZ = this.j0;
        return c1493fZ.a.b(c1493fZ.b.a);
    }

    public final long C() {
        i0();
        return Lr0.X(D(this.j0));
    }

    public final long D(C1493fZ c1493fZ) {
        if (c1493fZ.a.q()) {
            return Lr0.K(this.l0);
        }
        long j = c1493fZ.f774o ? c1493fZ.j() : c1493fZ.r;
        if (c1493fZ.b.a()) {
            return j;
        }
        Fj0 fj0 = c1493fZ.a;
        Object obj = c1493fZ.b.a;
        Dj0 dj0 = this.n;
        fj0.h(obj, dj0);
        return j + dj0.p;
    }

    public final Fj0 E() {
        i0();
        return this.j0.a;
    }

    public final C2105lm0 F() {
        i0();
        return (C2105lm0) this.j0.i.f852o;
    }

    public final int G(C1493fZ c1493fZ) {
        if (c1493fZ.a.q()) {
            return this.k0;
        }
        return c1493fZ.a.h(c1493fZ.b.a, this.n).n;
    }

    public final long H() {
        i0();
        if (!M()) {
            Fj0 fj0E = E();
            if (fj0E.q()) {
                return -9223372036854775807L;
            }
            return Lr0.X(fj0E.n(A(), (Ej0) this.a, 0L).y);
        }
        C1493fZ c1493fZ = this.j0;
        CP cp = c1493fZ.b;
        Fj0 fj0 = c1493fZ.a;
        Object obj = cp.a;
        Dj0 dj0 = this.n;
        fj0.h(obj, dj0);
        return Lr0.X(dj0.a(cp.b, cp.c));
    }

    public final boolean I() {
        i0();
        return this.j0.l;
    }

    public final int J() {
        i0();
        return this.j0.e;
    }

    public final C0814Ul L() {
        i0();
        return ((C1128bm) this.h).h();
    }

    public final boolean M() {
        i0();
        return this.j0.b.a();
    }

    public final C1493fZ N(C1493fZ c1493fZ, Fj0 fj0, Pair pair) {
        List list;
        AbstractC0397Ej.c(fj0.q() || pair != null);
        Fj0 fj1 = c1493fZ.a;
        long jX = x(c1493fZ);
        C1493fZ c1493fZH = c1493fZ.h(fj0);
        if (fj0.q()) {
            CP cp = C1493fZ.t;
            long jK = Lr0.K(this.l0);
            C1493fZ c1493fZB = c1493fZH.c(cp, jK, jK, jK, 0L, C1031am0.f678o, this.b, M60.p).b(cp);
            c1493fZB.p = c1493fZB.r;
            return c1493fZB;
        }
        Object obj = c1493fZH.b.a;
        int i = Lr0.a;
        boolean z = !obj.equals(pair.first);
        CP cp2 = z ? new CP(pair.first) : c1493fZH.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jK2 = Lr0.K(jX);
        if (!fj1.q()) {
            jK2 -= fj1.h(obj, this.n).p;
        }
        if (z || jLongValue < jK2) {
            AbstractC0397Ej.f(!cp2.a());
            C1031am0 c1031am0 = z ? C1031am0.f678o : c1493fZH.h;
            C1909jm0 c1909jm0 = z ? this.b : c1493fZH.i;
            if (z) {
                XE xe = AbstractC0985aF.m;
                list = M60.p;
            } else {
                list = c1493fZH.j;
            }
            C1493fZ c1493fZB2 = c1493fZH.c(cp2, jLongValue, jLongValue, jLongValue, 0L, c1031am0, c1909jm0, list).b(cp2);
            c1493fZB2.p = jLongValue;
            return c1493fZB2;
        }
        if (jLongValue != jK2) {
            AbstractC0397Ej.f(!cp2.a());
            long jMax = Math.max(0L, c1493fZH.q - (jLongValue - jK2));
            long j = c1493fZH.p;
            if (c1493fZH.k.equals(c1493fZH.b)) {
                j = jLongValue + jMax;
            }
            C1493fZ c1493fZC = c1493fZH.c(cp2, jLongValue, jLongValue, jLongValue, jMax, c1493fZH.h, c1493fZH.i, c1493fZH.j);
            c1493fZC.p = j;
            return c1493fZC;
        }
        int iB = fj0.b(c1493fZH.k.a);
        if (iB != -1 && fj0.g(iB, this.n, false).n == fj0.h(cp2.a, this.n).n) {
            return c1493fZH;
        }
        fj0.h(cp2.a, this.n);
        long jA = cp2.a() ? this.n.a(cp2.b, cp2.c) : this.n.f219o;
        C1493fZ c1493fZB3 = c1493fZH.c(cp2, c1493fZH.r, c1493fZH.r, c1493fZH.d, jA - c1493fZH.r, c1493fZH.h, c1493fZH.i, c1493fZH.j).b(cp2);
        c1493fZB3.p = jA;
        return c1493fZB3;
    }

    public final Pair O(Fj0 fj0, int i, long j) {
        if (fj0.q()) {
            this.k0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.l0 = j;
            return null;
        }
        if (i == -1 || i >= fj0.p()) {
            i = fj0.a(this.F);
            j = Lr0.X(fj0.n(i, (Ej0) this.a, 0L).x);
        }
        return fj0.j((Ej0) this.a, this.n, i, Lr0.K(j));
    }

    public final void P(final int i, final int i2) {
        C2186me0 c2186me0 = this.Y;
        if (i == c2186me0.a && i2 == c2186me0.b) {
            return;
        }
        this.Y = new C2186me0(i, i2);
        this.l.e(24, new QK() { // from class: o.Tr
            @Override // o.QK
            public final void b(Object obj) {
                ((InterfaceC2176mZ) obj).G(i, i2);
            }
        });
        U(2, 14, new C2186me0(i, i2));
    }

    public final void Q() {
        i0();
        boolean zI = I();
        int iD = this.A.d(2, zI);
        f0(iD, (!zI || iD == 1) ? 1 : 2, zI);
        C1493fZ c1493fZ = this.j0;
        if (c1493fZ.e != 1) {
            return;
        }
        C1493fZ c1493fZE = c1493fZ.e(null);
        C1493fZ c1493fZG = c1493fZE.g(c1493fZE.a.q() ? 4 : 2);
        this.G++;
        Uh0 uh0 = this.k.s;
        uh0.getClass();
        Th0 th0B = Uh0.b();
        th0B.a = uh0.a.obtainMessage(0);
        th0B.b();
        g0(c1493fZG, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void R() {
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        int i = Lr0.a;
        HashSet hashSet = AbstractC1726hs.a;
        synchronized (AbstractC1726hs.class) {
            HashSet hashSet2 = AbstractC1726hs.a;
        }
        AP.j();
        i0();
        if (Lr0.a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.z.k();
        this.B.getClass();
        this.C.getClass();
        T6 t6 = this.A;
        t6.c = null;
        t6.a();
        if (!this.k.x()) {
            this.l.e(10, new C0633Nm(3));
        }
        this.l.d();
        this.i.a.removeCallbacksAndMessages(null);
        N7 n7 = this.t;
        C0942Zj c0942Zj = this.r;
        CopyOnWriteArrayList<M7> copyOnWriteArrayList = (CopyOnWriteArrayList) ((C2197mk) n7).b.m;
        for (M7 m7 : copyOnWriteArrayList) {
            if (m7.b == c0942Zj) {
                m7.c = true;
                copyOnWriteArrayList.remove(m7);
            }
        }
        C1493fZ c1493fZ = this.j0;
        if (c1493fZ.f774o) {
            this.j0 = c1493fZ.a();
        }
        C1493fZ c1493fZG = this.j0.g(1);
        this.j0 = c1493fZG;
        C1493fZ c1493fZB = c1493fZG.b(c1493fZG.b);
        this.j0 = c1493fZB;
        c1493fZB.p = c1493fZB.r;
        this.j0.q = 0L;
        C0942Zj c0942Zj2 = this.r;
        Uh0 uh0 = c0942Zj2.s;
        AbstractC0397Ej.g(uh0);
        uh0.c(new Jj0(9, c0942Zj2));
        this.h.a();
        T();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.d0 = C3259xi.m;
        this.g0 = true;
    }

    public final void S(InterfaceC2176mZ interfaceC2176mZ) {
        i0();
        interfaceC2176mZ.getClass();
        TK tk = this.l;
        tk.f();
        CopyOnWriteArraySet<SK> copyOnWriteArraySet = tk.d;
        for (SK sk : copyOnWriteArraySet) {
            if (sk.a.equals(interfaceC2176mZ)) {
                sk.d = true;
                if (sk.c) {
                    sk.c = false;
                    C3188wv c3188wvB = sk.b.b();
                    tk.c.d(sk.a, c3188wvB);
                }
                copyOnWriteArraySet.remove(sk);
            }
        }
    }

    public final void T() {
        Af0 af0 = this.U;
        SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = this.x;
        if (af0 != null) {
            BZ bzU = u(this.y);
            AbstractC0397Ej.f(!bzU.g);
            bzU.d = 10000;
            AbstractC0397Ej.f(!bzU.g);
            bzU.e = null;
            bzU.c();
            this.U.l.remove(surfaceHolderCallbackC0898Xr);
            this.U = null;
        }
        TextureView textureView = this.W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC0898Xr) {
                AP.z();
            } else {
                this.W.setSurfaceTextureListener(null);
            }
            this.W = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC0898Xr);
            this.T = null;
        }
    }

    public final void U(int i, int i2, Object obj) {
        for (AbstractC1952k8 abstractC1952k8 : this.g) {
            if (abstractC1952k8.m == i) {
                BZ bzU = u(abstractC1952k8);
                AbstractC0397Ej.f(!bzU.g);
                bzU.d = i2;
                AbstractC0397Ej.f(!bzU.g);
                bzU.e = obj;
                bzU.c();
            }
        }
    }

    public final void V(I6 i6) {
        i0();
        if (this.g0) {
            return;
        }
        boolean zA = Lr0.a(this.a0, i6);
        int i = 1;
        TK tk = this.l;
        if (!zA) {
            this.a0 = i6;
            U(1, 3, i6);
            tk.c(20, new C2278nc(9, i6));
        }
        T6 t6 = this.A;
        t6.b(i6);
        this.h.b(i6);
        boolean zI = I();
        int iD = t6.d(J(), zI);
        if (zI && iD != 1) {
            i = 2;
        }
        f0(iD, i, zI);
        tk.b();
    }

    public final void W(List list, int i, long j, boolean z) {
        long j2;
        int iA = i;
        int iG = G(this.j0);
        long jC = C();
        this.G++;
        ArrayList arrayList = this.f682o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                arrayList.remove(i2);
            }
            Jd0 jd0 = this.L;
            int[] iArr = jd0.b;
            int[] iArr2 = new int[iArr.length - size];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= size) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= size;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            this.L = new Jd0(iArr2, new Random(jd0.a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            PP pp = new PP((AbstractC1464f8) list.get(i7), this.p);
            arrayList2.add(pp);
            arrayList.add(i7, new C0950Zr(pp.b, pp.a.f236o));
        }
        this.L = this.L.a(arrayList2.size());
        C1063b20 c1063b20 = new C1063b20(arrayList, this.L);
        boolean zQ = c1063b20.q();
        int i8 = c1063b20.f688o;
        if (!zQ && iA >= i8) {
            throw new C0599Me();
        }
        if (z) {
            iA = c1063b20.a(this.F);
            j2 = -9223372036854775807L;
        } else if (iA == -1) {
            iA = iG;
            j2 = jC;
        } else {
            j2 = j;
        }
        C1493fZ c1493fZN = N(this.j0, c1063b20, O(c1063b20, iA, j2));
        int i9 = c1493fZN.e;
        if (iA != -1 && i9 != 1) {
            i9 = (c1063b20.q() || iA >= i8) ? 4 : 2;
        }
        C1493fZ c1493fZG = c1493fZN.g(i9);
        this.k.s.a(17, new C1237cs(arrayList2, this.L, iA, Lr0.K(j2))).b();
        g0(c1493fZG, 0, 1, (this.j0.b.a.equals(c1493fZG.b.a) || this.j0.a.q()) ? false : true, 4, D(c1493fZG), -1, false);
    }

    public final void X(SurfaceHolder surfaceHolder) {
        this.V = false;
        this.T = surfaceHolder;
        surfaceHolder.addCallback(this.x);
        Surface surface = this.T.getSurface();
        if (surface == null || !surface.isValid()) {
            P(0, 0);
        } else {
            Rect surfaceFrame = this.T.getSurfaceFrame();
            P(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void Y(C2263nP c2263nP) {
        i0();
        if (c2263nP.equals(this.O)) {
            return;
        }
        this.O = c2263nP;
        this.l.e(15, new C0768Sr(this, 0));
    }

    public final void Z(int i) {
        i0();
        if (this.E != i) {
            this.E = i;
            Uh0 uh0 = this.k.s;
            uh0.getClass();
            Th0 th0B = Uh0.b();
            th0B.a = uh0.a.obtainMessage(11, i, 0);
            th0B.b();
            C0864Wj c0864Wj = new C0864Wj(i, 1);
            TK tk = this.l;
            tk.c(8, c0864Wj);
            e0();
            tk.b();
        }
    }

    public final void a0(C1715hm0 c1715hm0) {
        i0();
        AbstractC3133wN abstractC3133wN = this.h;
        abstractC3133wN.getClass();
        if (c1715hm0.equals(((C1128bm) abstractC3133wN).h())) {
            return;
        }
        abstractC3133wN.c(c1715hm0);
        this.l.e(19, new C2278nc(10, c1715hm0));
    }

    public final void b0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC1952k8 abstractC1952k8 : this.g) {
            if (abstractC1952k8.m == 2) {
                BZ bzU = u(abstractC1952k8);
                AbstractC0397Ej.f(!bzU.g);
                bzU.d = 1;
                AbstractC0397Ej.f(true ^ bzU.g);
                bzU.e = obj;
                bzU.c();
                arrayList.add(bzU);
            }
        }
        Object obj2 = this.R;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((BZ) it.next()).a(this.D);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.R;
            Surface surface = this.S;
            if (obj3 == surface) {
                surface.release();
                this.S = null;
            }
        }
        this.R = obj;
        if (z) {
            d0(new Lr(2, new C0730Rf(3), 1003));
        }
    }

    public final void c0() {
        i0();
        this.A.d(1, I());
        d0(null);
        this.d0 = new C3259xi(this.j0.r, M60.p);
    }

    public final void d0(Lr lr) {
        C1493fZ c1493fZ = this.j0;
        C1493fZ c1493fZB = c1493fZ.b(c1493fZ.b);
        c1493fZB.p = c1493fZB.r;
        c1493fZB.q = 0L;
        C1493fZ c1493fZG = c1493fZB.g(1);
        if (lr != null) {
            c1493fZG = c1493fZG.e(lr);
        }
        C1493fZ c1493fZ2 = c1493fZG;
        this.G++;
        Uh0 uh0 = this.k.s;
        uh0.getClass();
        Th0 th0B = Uh0.b();
        th0B.a = uh0.a.obtainMessage(6);
        th0B.b();
        g0(c1493fZ2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void e0() {
        int iL;
        int iE;
        C1981kZ c1981kZ = this.M;
        int i = Lr0.a;
        C1042as c1042as = (C1042as) this.f;
        boolean zM = c1042as.M();
        boolean zE = c1042as.e();
        Fj0 fj0E = c1042as.E();
        if (fj0E.q()) {
            iL = -1;
        } else {
            int iA = c1042as.A();
            c1042as.i0();
            int i2 = c1042as.E;
            if (i2 == 1) {
                i2 = 0;
            }
            c1042as.i0();
            iL = fj0E.l(iA, i2, c1042as.F);
        }
        boolean z = iL != -1;
        Fj0 fj0E2 = c1042as.E();
        if (fj0E2.q()) {
            iE = -1;
        } else {
            int iA2 = c1042as.A();
            c1042as.i0();
            int i3 = c1042as.E;
            if (i3 == 1) {
                i3 = 0;
            }
            c1042as.i0();
            iE = fj0E2.e(iA2, i3, c1042as.F);
        }
        boolean z2 = iE != -1;
        boolean zD = c1042as.d();
        boolean zC = c1042as.c();
        boolean zQ = c1042as.E().q();
        C0334By c0334By = new C0334By(25);
        C3188wv c3188wv = this.c.l;
        C2149m9 c2149m9 = (C2149m9) c0334By.m;
        c2149m9.getClass();
        for (int i4 = 0; i4 < c3188wv.a.size(); i4++) {
            c2149m9.a(c3188wv.a(i4));
        }
        boolean z3 = !zM;
        c0334By.c(4, z3);
        c0334By.c(5, zE && !zM);
        c0334By.c(6, z && !zM);
        c0334By.c(7, !zQ && (z || !zD || zE) && !zM);
        c0334By.c(8, z2 && !zM);
        c0334By.c(9, !zQ && (z2 || (zD && zC)) && !zM);
        c0334By.c(10, z3);
        c0334By.c(11, zE && !zM);
        c0334By.c(12, zE && !zM);
        C1981kZ c1981kZ2 = new C1981kZ(c2149m9.b());
        this.M = c1981kZ2;
        if (c1981kZ2.equals(c1981kZ)) {
            return;
        }
        this.l.c(13, new C0768Sr(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void f0(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r15 = (!z || i == -1) ? 0 : 1;
        if (r15 != 0 && i != 1) {
            i3 = 1;
        }
        C1493fZ c1493fZ = this.j0;
        if (c1493fZ.l == r15 && c1493fZ.m == i3) {
            return;
        }
        this.G++;
        boolean z2 = c1493fZ.f774o;
        C1493fZ c1493fZA = c1493fZ;
        if (z2) {
            c1493fZA = c1493fZ.a();
        }
        C1493fZ c1493fZD = c1493fZA.d(i3, r15);
        Uh0 uh0 = this.k.s;
        uh0.getClass();
        Th0 th0B = Uh0.b();
        th0B.a = uh0.a.obtainMessage(1, r15, i3);
        th0B.b();
        g0(c1493fZD, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    public final void g0(final C1493fZ c1493fZ, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        Pair pair;
        int i5;
        C1971kP c1971kP;
        int i6;
        Object obj;
        C1971kP c1971kP2;
        Object obj2;
        int i7;
        long jK;
        long jK2;
        Object obj3;
        C1971kP c1971kP3;
        Object obj4;
        int i8;
        C1493fZ c1493fZ2 = this.j0;
        this.j0 = c1493fZ;
        boolean z3 = !c1493fZ2.a.equals(c1493fZ.a);
        Fj0 fj0 = c1493fZ2.a;
        Fj0 fj1 = c1493fZ.a;
        if (fj1.q() && fj0.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (fj1.q() != fj0.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            CP cp = c1493fZ2.b;
            Object obj5 = cp.a;
            Dj0 dj0 = this.n;
            int i9 = fj0.h(obj5, dj0).n;
            Ej0 ej0 = (Ej0) this.a;
            Object obj6 = fj0.n(i9, ej0, 0L).l;
            CP cp2 = c1493fZ.b;
            if (!obj6.equals(fj1.n(fj1.h(cp2.a, dj0).n, ej0, 0L).l)) {
                if (z && i3 == 0) {
                    i5 = 1;
                } else if (z && i3 == 1) {
                    i5 = 2;
                } else {
                    if (!z3) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            } else if (z && i3 == 0 && cp.d < cp2.d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z && i3 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        C2263nP c2263nPR = this.N;
        if (zBooleanValue) {
            c1971kP = c1493fZ.a.q() ? null : c1493fZ.a.n(c1493fZ.a.h(c1493fZ.b.a, this.n).n, (Ej0) this.a, 0L).n;
            this.i0 = C2263nP.T;
        } else {
            c1971kP = null;
        }
        if (zBooleanValue || !c1493fZ2.j.equals(c1493fZ.j)) {
            C2166mP c2166mPA = this.i0.a();
            List list = c1493fZ.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                CQ cq = (CQ) list.get(i10);
                int i11 = 0;
                while (true) {
                    BQ[] bqArr = cq.l;
                    if (i11 < bqArr.length) {
                        bqArr[i11].d(c2166mPA);
                        i11++;
                    }
                }
            }
            this.i0 = new C2263nP(c2166mPA);
            c2263nPR = r();
        }
        boolean z4 = !c2263nPR.equals(this.N);
        this.N = c2263nPR;
        boolean z5 = c1493fZ2.l != c1493fZ.l;
        boolean z6 = c1493fZ2.e != c1493fZ.e;
        if (z6 || z5) {
            h0();
        }
        boolean z7 = c1493fZ2.g != c1493fZ.g;
        if (z3) {
            final int i12 = 0;
            this.l.c(0, new QK() { // from class: o.Pr
                @Override // o.QK
                public final void b(Object obj7) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj7;
                    switch (i12) {
                        case 0:
                            Fj0 fj2 = c1493fZ.a;
                            interfaceC2176mZ.e(i);
                            break;
                        default:
                            interfaceC2176mZ.w(i, c1493fZ.l);
                            break;
                    }
                }
            });
        }
        if (z) {
            Dj0 dj1 = new Dj0();
            if (c1493fZ2.a.q()) {
                i6 = i4;
                obj = null;
                c1971kP2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = c1493fZ2.b.a;
                c1493fZ2.a.h(obj7, dj1);
                int i13 = dj1.n;
                int iB = c1493fZ2.a.b(obj7);
                obj2 = obj7;
                obj = c1493fZ2.a.n(i13, (Ej0) this.a, 0L).l;
                c1971kP2 = ((Ej0) this.a).n;
                i6 = i13;
                i7 = iB;
            }
            if (i3 == 0) {
                if (c1493fZ2.b.a()) {
                    CP cp3 = c1493fZ2.b;
                    jK = dj1.a(cp3.b, cp3.c);
                    jK2 = K(c1493fZ2);
                } else {
                    jK = c1493fZ2.b.e != -1 ? K(this.j0) : dj1.f219o + dj1.p;
                    jK2 = jK;
                }
            } else if (c1493fZ2.b.a()) {
                jK = c1493fZ2.r;
                jK2 = K(c1493fZ2);
            } else {
                jK = dj1.p + c1493fZ2.r;
                jK2 = jK;
            }
            long jX = Lr0.X(jK);
            long jX2 = Lr0.X(jK2);
            CP cp4 = c1493fZ2.b;
            final C2273nZ c2273nZ = new C2273nZ(obj, i6, c1971kP2, obj2, i7, jX, jX2, cp4.b, cp4.c);
            int iA = A();
            if (this.j0.a.q()) {
                obj3 = null;
                c1971kP3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                C1493fZ c1493fZ3 = this.j0;
                Object obj8 = c1493fZ3.b.a;
                c1493fZ3.a.h(obj8, this.n);
                int iB2 = this.j0.a.b(obj8);
                Fj0 fj2 = this.j0.a;
                Ej0 ej1 = (Ej0) this.a;
                Object obj9 = fj2.n(iA, ej1, 0L).l;
                i8 = iB2;
                c1971kP3 = ej1.n;
                obj3 = obj9;
                obj4 = obj8;
            }
            long jX3 = Lr0.X(j);
            long jX4 = this.j0.b.a() ? Lr0.X(K(this.j0)) : jX3;
            CP cp5 = this.j0.b;
            final C2273nZ c2273nZ2 = new C2273nZ(obj3, iA, c1971kP3, obj4, i8, jX3, jX4, cp5.b, cp5.c);
            this.l.c(11, new QK() { // from class: o.Ur
                @Override // o.QK
                public final void b(Object obj10) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj10;
                    interfaceC2176mZ.getClass();
                    interfaceC2176mZ.p(i3, c2273nZ, c2273nZ2);
                }
            });
        } else {
            z5 = z5;
            z4 = z4;
            z6 = z6;
            z7 = z7;
        }
        if (zBooleanValue) {
            this.l.c(1, new C0846Vr(iIntValue, c1971kP));
        }
        if (c1493fZ2.f != c1493fZ.f) {
            final int i14 = 6;
            this.l.c(10, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj10) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj10;
                    switch (i14) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
            if (c1493fZ.f != null) {
                final int i15 = 7;
                this.l.c(10, new QK() { // from class: o.Qr
                    @Override // o.QK
                    public final void b(Object obj10) {
                        InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj10;
                        switch (i15) {
                            case 0:
                                C1493fZ c1493fZ4 = c1493fZ;
                                boolean z8 = c1493fZ4.g;
                                interfaceC2176mZ.getClass();
                                interfaceC2176mZ.q(c1493fZ4.g);
                                break;
                            case 1:
                                C1493fZ c1493fZ5 = c1493fZ;
                                interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                                break;
                            case 2:
                                interfaceC2176mZ.A(c1493fZ.e);
                                break;
                            case 3:
                                interfaceC2176mZ.a(c1493fZ.m);
                                break;
                            case 4:
                                interfaceC2176mZ.N(c1493fZ.k());
                                break;
                            case 5:
                                interfaceC2176mZ.u(c1493fZ.n);
                                break;
                            case 6:
                                interfaceC2176mZ.F(c1493fZ.f);
                                break;
                            case 7:
                                interfaceC2176mZ.h(c1493fZ.f);
                                break;
                            default:
                                interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                                break;
                        }
                    }
                });
            }
        }
        C1909jm0 c1909jm0 = c1493fZ2.i;
        C1909jm0 c1909jm1 = c1493fZ.i;
        if (c1909jm0 != c1909jm1) {
            AbstractC3133wN abstractC3133wN = this.h;
            Object obj10 = c1909jm1.p;
            abstractC3133wN.getClass();
            final int i16 = 8;
            this.l.c(2, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i16) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (z4) {
            this.l.c(14, new C2278nc(8, this.N));
        }
        if (z7) {
            final int i17 = 0;
            this.l.c(3, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i17) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (z6 || z5) {
            final int i18 = 1;
            this.l.c(-1, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i18) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i19 = 2;
            this.l.c(4, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i19) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i20 = 1;
            this.l.c(5, new QK() { // from class: o.Pr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i20) {
                        case 0:
                            Fj0 fj3 = c1493fZ.a;
                            interfaceC2176mZ.e(i2);
                            break;
                        default:
                            interfaceC2176mZ.w(i2, c1493fZ.l);
                            break;
                    }
                }
            });
        }
        if (c1493fZ2.m != c1493fZ.m) {
            final int i21 = 3;
            this.l.c(6, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i21) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (c1493fZ2.k() != c1493fZ.k()) {
            final int i22 = 4;
            this.l.c(7, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i22) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        if (!c1493fZ2.n.equals(c1493fZ.n)) {
            final int i23 = 5;
            this.l.c(12, new QK() { // from class: o.Qr
                @Override // o.QK
                public final void b(Object obj11) {
                    InterfaceC2176mZ interfaceC2176mZ = (InterfaceC2176mZ) obj11;
                    switch (i23) {
                        case 0:
                            C1493fZ c1493fZ4 = c1493fZ;
                            boolean z8 = c1493fZ4.g;
                            interfaceC2176mZ.getClass();
                            interfaceC2176mZ.q(c1493fZ4.g);
                            break;
                        case 1:
                            C1493fZ c1493fZ5 = c1493fZ;
                            interfaceC2176mZ.v(c1493fZ5.e, c1493fZ5.l);
                            break;
                        case 2:
                            interfaceC2176mZ.A(c1493fZ.e);
                            break;
                        case 3:
                            interfaceC2176mZ.a(c1493fZ.m);
                            break;
                        case 4:
                            interfaceC2176mZ.N(c1493fZ.k());
                            break;
                        case 5:
                            interfaceC2176mZ.u(c1493fZ.n);
                            break;
                        case 6:
                            interfaceC2176mZ.F(c1493fZ.f);
                            break;
                        case 7:
                            interfaceC2176mZ.h(c1493fZ.f);
                            break;
                        default:
                            interfaceC2176mZ.f((C2105lm0) c1493fZ.i.f852o);
                            break;
                    }
                }
            });
        }
        e0();
        this.l.b();
        if (c1493fZ2.f774o != c1493fZ.f774o) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC0898Xr) it.next()).l.h0();
            }
        }
    }

    public final void h0() {
        int iJ = J();
        C3325yL c3325yL = this.C;
        C2743sL c2743sL = this.B;
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3) {
                i0();
                boolean z = this.j0.f774o;
                I();
                c2743sL.getClass();
                I();
                c3325yL.getClass();
                return;
            }
            if (iJ != 4) {
                throw new IllegalStateException();
            }
        }
        c2743sL.getClass();
        c3325yL.getClass();
    }

    public final void i0() {
        io.sentry.X1 x1 = this.d;
        synchronized (x1) {
            boolean z = false;
            while (!x1.a) {
                try {
                    x1.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.s.getThread().getName();
            int i = Lr0.a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.e0) {
                throw new IllegalStateException(str);
            }
            AP.A(str, this.f0 ? null : new IllegalStateException());
            this.f0 = true;
        }
    }

    @Override // o.AbstractC1074b8
    public final void k(int i, long j, boolean z) {
        i0();
        AbstractC0397Ej.c(i >= 0);
        C0942Zj c0942Zj = this.r;
        if (!c0942Zj.t) {
            C3201x2 c3201x2O = c0942Zj.O();
            c0942Zj.t = true;
            c0942Zj.T(c3201x2O, -1, new S1(12));
        }
        Fj0 fj0 = this.j0.a;
        if (fj0.q() || i < fj0.p()) {
            this.G++;
            if (M()) {
                AP.z();
                C1334ds c1334ds = new C1334ds(this.j0);
                c1334ds.a(1);
                C1042as c1042as = this.j.m;
                c1042as.i.c(new O3(c1042as, 7, c1334ds));
                return;
            }
            C1493fZ c1493fZG = this.j0;
            int i2 = c1493fZG.e;
            if (i2 == 3 || (i2 == 4 && !fj0.q())) {
                c1493fZG = this.j0.g(2);
            }
            int iA = A();
            C1493fZ c1493fZN = N(c1493fZG, fj0, O(fj0, i, j));
            this.k.s.a(3, new C1530fs(fj0, i, Lr0.K(j))).b();
            g0(c1493fZN, 0, 1, true, 1, D(c1493fZN), iA, z);
        }
    }

    public final C2263nP r() {
        Fj0 fj0E = E();
        if (fj0E.q()) {
            return this.i0;
        }
        C1971kP c1971kP = fj0E.n(A(), (Ej0) this.a, 0L).n;
        C2166mP c2166mPA = this.i0.a();
        C2263nP c2263nP = c1971kP.f866o;
        if (c2263nP != null) {
            CharSequence charSequence = c2263nP.l;
            if (charSequence != null) {
                c2166mPA.a = charSequence;
            }
            CharSequence charSequence2 = c2263nP.m;
            if (charSequence2 != null) {
                c2166mPA.b = charSequence2;
            }
            CharSequence charSequence3 = c2263nP.n;
            if (charSequence3 != null) {
                c2166mPA.c = charSequence3;
            }
            CharSequence charSequence4 = c2263nP.f935o;
            if (charSequence4 != null) {
                c2166mPA.d = charSequence4;
            }
            CharSequence charSequence5 = c2263nP.p;
            if (charSequence5 != null) {
                c2166mPA.e = charSequence5;
            }
            CharSequence charSequence6 = c2263nP.q;
            if (charSequence6 != null) {
                c2166mPA.f = charSequence6;
            }
            CharSequence charSequence7 = c2263nP.r;
            if (charSequence7 != null) {
                c2166mPA.g = charSequence7;
            }
            AbstractC2530q50 abstractC2530q50 = c2263nP.s;
            if (abstractC2530q50 != null) {
                c2166mPA.h = abstractC2530q50;
            }
            AbstractC2530q50 abstractC2530q51 = c2263nP.t;
            if (abstractC2530q51 != null) {
                c2166mPA.i = abstractC2530q51;
            }
            byte[] bArr = c2263nP.u;
            if (bArr != null) {
                c2166mPA.j = (byte[]) bArr.clone();
                c2166mPA.k = c2263nP.v;
            }
            Uri uri = c2263nP.w;
            if (uri != null) {
                c2166mPA.l = uri;
            }
            Integer num = c2263nP.x;
            if (num != null) {
                c2166mPA.m = num;
            }
            Integer num2 = c2263nP.y;
            if (num2 != null) {
                c2166mPA.n = num2;
            }
            Integer num3 = c2263nP.z;
            if (num3 != null) {
                c2166mPA.f912o = num3;
            }
            Boolean bool = c2263nP.A;
            if (bool != null) {
                c2166mPA.p = bool;
            }
            Boolean bool2 = c2263nP.B;
            if (bool2 != null) {
                c2166mPA.q = bool2;
            }
            Integer num4 = c2263nP.C;
            if (num4 != null) {
                c2166mPA.r = num4;
            }
            Integer num5 = c2263nP.D;
            if (num5 != null) {
                c2166mPA.r = num5;
            }
            Integer num6 = c2263nP.E;
            if (num6 != null) {
                c2166mPA.s = num6;
            }
            Integer num7 = c2263nP.F;
            if (num7 != null) {
                c2166mPA.t = num7;
            }
            Integer num8 = c2263nP.G;
            if (num8 != null) {
                c2166mPA.u = num8;
            }
            Integer num9 = c2263nP.H;
            if (num9 != null) {
                c2166mPA.v = num9;
            }
            Integer num10 = c2263nP.I;
            if (num10 != null) {
                c2166mPA.w = num10;
            }
            CharSequence charSequence8 = c2263nP.J;
            if (charSequence8 != null) {
                c2166mPA.x = charSequence8;
            }
            CharSequence charSequence9 = c2263nP.K;
            if (charSequence9 != null) {
                c2166mPA.y = charSequence9;
            }
            CharSequence charSequence10 = c2263nP.L;
            if (charSequence10 != null) {
                c2166mPA.z = charSequence10;
            }
            Integer num11 = c2263nP.M;
            if (num11 != null) {
                c2166mPA.A = num11;
            }
            Integer num12 = c2263nP.N;
            if (num12 != null) {
                c2166mPA.B = num12;
            }
            CharSequence charSequence11 = c2263nP.O;
            if (charSequence11 != null) {
                c2166mPA.C = charSequence11;
            }
            CharSequence charSequence12 = c2263nP.P;
            if (charSequence12 != null) {
                c2166mPA.D = charSequence12;
            }
            CharSequence charSequence13 = c2263nP.Q;
            if (charSequence13 != null) {
                c2166mPA.E = charSequence13;
            }
            Integer num13 = c2263nP.R;
            if (num13 != null) {
                c2166mPA.F = num13;
            }
            Bundle bundle = c2263nP.S;
            if (bundle != null) {
                c2166mPA.G = bundle;
            }
        }
        return new C2263nP(c2166mPA);
    }

    public final void s() {
        i0();
        T();
        b0(null);
        P(0, 0);
    }

    public final BZ u(AZ az) {
        int iG = G(this.j0);
        Fj0 fj0 = this.j0.a;
        int i = iG == -1 ? 0 : iG;
        C1628gs c1628gs = this.k;
        return new BZ(c1628gs, az, fj0, i, this.w, c1628gs.u);
    }

    public final long v() {
        i0();
        if (!M()) {
            return w();
        }
        C1493fZ c1493fZ = this.j0;
        return c1493fZ.k.equals(c1493fZ.b) ? Lr0.X(this.j0.p) : H();
    }

    public final long w() {
        i0();
        if (this.j0.a.q()) {
            return this.l0;
        }
        C1493fZ c1493fZ = this.j0;
        if (c1493fZ.k.d != c1493fZ.b.d) {
            return Lr0.X(c1493fZ.a.n(A(), (Ej0) this.a, 0L).y);
        }
        long j = c1493fZ.p;
        if (this.j0.k.a()) {
            C1493fZ c1493fZ2 = this.j0;
            Dj0 dj0H = c1493fZ2.a.h(c1493fZ2.k.a, this.n);
            long jD = dj0H.d(this.j0.k.b);
            j = jD == Long.MIN_VALUE ? dj0H.f219o : jD;
        }
        C1493fZ c1493fZ3 = this.j0;
        Fj0 fj0 = c1493fZ3.a;
        Object obj = c1493fZ3.k.a;
        Dj0 dj0 = this.n;
        fj0.h(obj, dj0);
        return Lr0.X(j + dj0.p);
    }

    public final long x(C1493fZ c1493fZ) {
        if (!c1493fZ.b.a()) {
            return Lr0.X(D(c1493fZ));
        }
        Object obj = c1493fZ.b.a;
        Fj0 fj0 = c1493fZ.a;
        Dj0 dj0 = this.n;
        fj0.h(obj, dj0);
        long j = c1493fZ.c;
        return j == -9223372036854775807L ? Lr0.X(fj0.n(G(c1493fZ), (Ej0) this.a, 0L).x) : Lr0.X(dj0.p) + Lr0.X(j);
    }

    public final int y() {
        i0();
        if (M()) {
            return this.j0.b.b;
        }
        return -1;
    }

    public final int z() {
        i0();
        if (M()) {
            return this.j0.b.c;
        }
        return -1;
    }
}
