package o;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: o.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1904jk implements InterfaceC1852j7 {
    public static final Object g0 = new Object();
    public static ExecutorService h0;
    public static int i0;
    public C1612gk A;
    public C1591gZ B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public C2823t7 Y;
    public C1319dk Z;
    public final Context a;
    public boolean a0;
    public final Na0 b;
    public long b0;
    public final boolean c;
    public long c0;
    public final C0701Qc d;
    public boolean d0;
    public final Qm0 e;
    public boolean e0;
    public final M60 f;
    public Looper f0;
    public final M60 g;
    public final io.sentry.X1 h;
    public final C2242n7 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public Na0 m;
    public final C3306y6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3306y6 f851o;
    public final C2691rp p;
    public C3436zZ q;
    public C0334By r;
    public C1514fk s;
    public C1514fk t;
    public U6 u;
    public AudioTrack v;
    public M6 w;
    public Q6 x;
    public I6 y;
    public C1612gk z;

    public C1904jk(C1416ek c1416ek) {
        Context context = c1416ek.a;
        this.a = context;
        this.w = context != null ? M6.b(context) : c1416ek.b;
        this.b = c1416ek.c;
        int i = Lr0.a;
        this.c = i >= 21 && c1416ek.d;
        this.k = i >= 23 && c1416ek.e;
        this.l = i >= 29 ? c1416ek.f : 0;
        this.p = c1416ek.g;
        io.sentry.X1 x1 = new io.sentry.X1();
        this.h = x1;
        x1.b();
        this.i = new C2242n7(new C2133m1(17, this));
        C0701Qc c0701Qc = new C0701Qc();
        this.d = c0701Qc;
        Qm0 qm0 = new Qm0();
        qm0.m = Lr0.e;
        this.e = qm0;
        Zj0 zj0 = new Zj0();
        XE xe = AbstractC0985aF.m;
        Object[] objArr = {zj0, c0701Qc, qm0};
        AbstractC3045vW.i(3, objArr);
        this.f = AbstractC0985aF.j(3, objArr);
        this.g = AbstractC0985aF.q(new Yj0());
        this.N = 1.0f;
        this.y = I6.r;
        this.X = 0;
        this.Y = new C2823t7();
        C1591gZ c1591gZ = C1591gZ.f794o;
        this.A = new C1612gk(c1591gZ, 0L, 0L);
        this.B = c1591gZ;
        this.C = false;
        this.j = new ArrayDeque();
        this.n = new C3306y6(3);
        this.f851o = new C3306y6(3);
    }

    public static AudioFormat f(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return Lr0.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    public final void a(long j) {
        C1591gZ c1591gZ;
        boolean z;
        int i = 1;
        boolean zS = s();
        boolean z2 = this.c;
        Na0 na0 = this.b;
        if (zS) {
            c1591gZ = C1591gZ.f794o;
        } else {
            if (this.a0) {
                c1591gZ = C1591gZ.f794o;
            } else {
                C1514fk c1514fk = this.t;
                if (c1514fk.c == 0) {
                    int i2 = c1514fk.a.L;
                    if (z2) {
                        int i3 = Lr0.a;
                        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
                            c1591gZ = C1591gZ.f794o;
                        }
                    }
                    c1591gZ = this.B;
                    na0.getClass();
                    float f = c1591gZ.l;
                    C1993kf0 c1993kf0 = (C1993kf0) na0.f414o;
                    if (c1993kf0.c != f) {
                        c1993kf0.c = f;
                        c1993kf0.i = true;
                    }
                    float f2 = c1993kf0.d;
                    float f3 = c1591gZ.m;
                    if (f2 != f3) {
                        c1993kf0.d = f3;
                        c1993kf0.i = true;
                    }
                } else {
                    c1591gZ = C1591gZ.f794o;
                }
            }
            this.B = c1591gZ;
        }
        C1591gZ c1591gZ2 = c1591gZ;
        if (this.a0) {
            z = false;
        } else {
            C1514fk c1514fk2 = this.t;
            if (c1514fk2.c == 0) {
                int i4 = c1514fk2.a.L;
                if (z2) {
                    int i5 = Lr0.a;
                    if (i4 == 536870912 || i4 == 805306368 || i4 == 4) {
                        z = false;
                    }
                }
                z = this.C;
                ((Md0) na0.n).m = z;
            } else {
                z = false;
            }
        }
        this.C = z;
        ArrayDeque arrayDeque = this.j;
        long jMax = Math.max(0L, j);
        C1514fk c1514fk3 = this.t;
        arrayDeque.add(new C1612gk(c1591gZ2, jMax, Lr0.Q(c1514fk3.e, i())));
        U6 u6 = this.t.i;
        this.u = u6;
        u6.b();
        C0334By c0334By = this.r;
        if (c0334By != null) {
            boolean z3 = this.C;
            C1364e7 c1364e7 = ((AO) c0334By.m).R0;
            Handler handler = c1364e7.b;
            if (handler != null) {
                handler.post(new RunnableC1335ds0(i, c1364e7, z3));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:89:0x0199  */
    public final void b(C0643Nw c0643Nw, int[] iArr) {
        U6 u6;
        int iIntValue;
        int iD;
        boolean z;
        int iY;
        int i;
        int i2;
        int i3;
        int iJ;
        int iV;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(c0643Nw.w);
        boolean z2 = this.k;
        int i4 = c0643Nw.K;
        int i5 = c0643Nw.J;
        if (zEquals) {
            int i6 = c0643Nw.L;
            AbstractC0397Ej.c(Lr0.H(i6));
            int iY2 = Lr0.y(i6, i5);
            WE we = new WE();
            if (this.c && (i6 == 536870912 || i6 == 805306368 || i6 == 4)) {
                we.d(this.g);
            } else {
                we.d(this.f);
                X6[] x6Arr = (X6[]) this.b.m;
                int length = x6Arr.length;
                AbstractC3045vW.i(length, x6Arr);
                we.f(we.b + length);
                System.arraycopy(x6Arr, 0, we.a, we.b, length);
                we.b += length;
            }
            U6 u7 = new U6(we.g());
            if (u7.equals(this.u)) {
                u7 = this.u;
            }
            int i7 = c0643Nw.M;
            Qm0 qm0 = this.e;
            qm0.i = i7;
            qm0.j = c0643Nw.N;
            if (Lr0.a < 21 && i5 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            try {
                V6 v6A = u7.a(new V6(i4, i5, i6));
                int i9 = v6A.b;
                int iP = Lr0.p(i9);
                int i10 = v6A.c;
                u6 = u7;
                iY = Lr0.y(i10, i9);
                z = z2;
                i = iY2;
                i2 = 0;
                iD = i10;
                iIntValue = iP;
                i4 = v6A.a;
            } catch (W6 e) {
                throw new C1462f7(e, c0643Nw);
            }
        } else {
            XE xe = AbstractC0985aF.m;
            U6 u8 = new U6(M60.p);
            if (t(this.y, c0643Nw)) {
                String str = c0643Nw.w;
                str.getClass();
                u6 = u8;
                iD = IQ.d(str, c0643Nw.t);
                iIntValue = Lr0.p(i5);
                iY = -1;
                i = -1;
                i2 = 1;
                z = true;
            } else {
                Pair pairD = e().d(c0643Nw);
                if (pairD == null) {
                    throw new C1462f7("Unable to configure passthrough for: " + c0643Nw, c0643Nw);
                }
                int iIntValue2 = ((Integer) pairD.first).intValue();
                u6 = u8;
                iIntValue = ((Integer) pairD.second).intValue();
                iD = iIntValue2;
                z = z2;
                iY = -1;
                i = -1;
                i2 = 2;
            }
        }
        if (iD == 0) {
            throw new C1462f7("Invalid output encoding (mode=" + i2 + ") for: " + c0643Nw, c0643Nw);
        }
        if (iIntValue == 0) {
            throw new C1462f7("Invalid output channel config (mode=" + i2 + ") for: " + c0643Nw, c0643Nw);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iD);
        AbstractC0397Ej.f(minBufferSize != -2);
        int i11 = iY != -1 ? iY : 1;
        double d = z ? 8.0d : 1.0d;
        this.p.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                iJ = Pu0.d((((long) 50000000) * ((long) C2691rp.v(iD))) / 1000000);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                int i12 = iD == 5 ? 500000 : 250000;
                int i13 = c0643Nw.s;
                if (i13 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    iV = i13 / 8;
                    int i14 = i13 - (8 * iV);
                    if (i14 != 0) {
                        int i15 = ((i13 ^ 8) >> 31) | 1;
                        switch (WF.a[roundingMode.ordinal()]) {
                            case 1:
                                if (i14 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                if (i15 < 0) {
                                    iV += i15;
                                }
                                break;
                            case 4:
                                iV += i15;
                                break;
                            case 5:
                                if (i15 > 0) {
                                    iV += i15;
                                }
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int iAbs = Math.abs(i14);
                                int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                                if (iAbs2 == 0) {
                                    if (roundingMode == RoundingMode.HALF_UP) {
                                        iV += i15;
                                    } else if ((roundingMode == RoundingMode.HALF_EVEN) & ((iV & 1) != 0)) {
                                        iV += i15;
                                    }
                                } else if (iAbs2 > 0) {
                                    iV += i15;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    iV = C2691rp.v(iD);
                }
                iJ = Pu0.d((((long) i12) * ((long) iV)) / 1000000);
            }
            i3 = iD;
        } else {
            u6 = u6;
            z = z;
            long j = i4;
            long j2 = i11;
            i3 = iD;
            iJ = Lr0.j(minBufferSize * 4, Pu0.d(((((long) 250000) * j) * j2) / 1000000), Pu0.d(((((long) 750000) * j) * j2) / 1000000));
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + i11) - 1) / i11) * i11;
        this.d0 = false;
        C1514fk c1514fk = new C1514fk(c0643Nw, i, i2, iY, i4, iIntValue, i3, iMax, u6, z);
        if (m()) {
            this.s = c1514fk;
        } else {
            this.t = c1514fk;
        }
    }

    public final boolean c() throws Exception {
        if (!this.u.e()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            return this.Q == null;
        }
        U6 u6 = this.u;
        if (u6.e() && !u6.d) {
            u6.d = true;
            ((X6) u6.b.get(0)).c();
        }
        p(Long.MIN_VALUE);
        if (!this.u.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.Q;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void d() {
        if (m()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.e0 = false;
            this.J = 0;
            this.A = new C1612gk(this.B, 0L, 0L);
            this.M = 0L;
            this.z = null;
            this.j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.e.f478o = 0L;
            U6 u6 = this.t.i;
            this.u = u6;
            u6.b();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (n(this.v)) {
                Na0 na0 = this.m;
                na0.getClass();
                this.v.unregisterStreamEventCallback((C1807ik) na0.n);
                ((Handler) na0.m).removeCallbacksAndMessages(null);
            }
            if (Lr0.a < 21 && !this.W) {
                this.X = 0;
            }
            C1514fk c1514fk = this.s;
            if (c1514fk != null) {
                this.t = c1514fk;
                this.s = null;
            }
            C2242n7 c2242n7 = this.i;
            c2242n7.d();
            c2242n7.c = null;
            c2242n7.f = null;
            AudioTrack audioTrack2 = this.v;
            io.sentry.X1 x1 = this.h;
            x1.a();
            synchronized (g0) {
                try {
                    if (h0 == null) {
                        h0 = Executors.newSingleThreadExecutor(new ThreadFactoryC1896jg("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    i0++;
                    h0.execute(new O3(audioTrack2, 3, x1));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v = null;
        }
        this.f851o.n = null;
        this.n.n = null;
    }

    public final M6 e() {
        Context context;
        M6 m6C;
        O6 o6;
        if (this.x == null && (context = this.a) != null) {
            this.f0 = Looper.myLooper();
            Q6 q6 = new Q6(context, new C2278nc(5, this));
            this.x = q6;
            if (q6.a) {
                m6C = (M6) q6.h;
                m6C.getClass();
            } else {
                q6.a = true;
                P6 p6 = (P6) q6.g;
                if (p6 != null) {
                    p6.a.registerContentObserver(p6.b, false, p6);
                }
                int i = Lr0.a;
                Handler handler = (Handler) q6.d;
                Context context2 = (Context) q6.b;
                if (i >= 23 && (o6 = (O6) q6.e) != null) {
                    N6.a(context2, o6, handler);
                }
                C1066b4 c1066b4 = (C1066b4) q6.f;
                m6C = M6.c(context2, c1066b4 != null ? context2.registerReceiver(c1066b4, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                q6.h = m6C;
            }
            this.w = m6C;
        }
        return this.w;
    }

    public final int g(C0643Nw c0643Nw) {
        if (!"audio/raw".equals(c0643Nw.w)) {
            return ((this.d0 || !t(this.y, c0643Nw)) && e().d(c0643Nw) == null) ? 0 : 2;
        }
        int i = c0643Nw.L;
        if (Lr0.H(i)) {
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        AP.z();
        return 0;
    }

    public final long h() {
        C1514fk c1514fk = this.t;
        return c1514fk.c == 0 ? this.F / ((long) c1514fk.b) : this.G;
    }

    public final long i() {
        C1514fk c1514fk = this.t;
        return c1514fk.c == 0 ? this.H / ((long) c1514fk.d) : this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:173:0x034c A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        if (r10.b() == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1904jk.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        return m() && this.i.c(i());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
    public final boolean l() throws C1560g7 {
        boolean z;
        AudioTrack audioTrackA;
        C3436zZ c3436zZ;
        io.sentry.X1 x1 = this.h;
        synchronized (x1) {
            z = x1.a;
        }
        if (!z) {
            return false;
        }
        try {
            C1514fk c1514fk = this.t;
            c1514fk.getClass();
            try {
                audioTrackA = c1514fk.a(this.a0, this.y, this.X);
                this.v = audioTrackA;
                if (n(audioTrackA)) {
                    AudioTrack audioTrack = this.v;
                    if (this.m == null) {
                        this.m = new Na0(this);
                    }
                    Na0 na0 = this.m;
                    Handler handler = (Handler) na0.m;
                    Objects.requireNonNull(handler);
                    audioTrack.registerStreamEventCallback(new ExecutorC1710hk(handler), (C1807ik) na0.n);
                    if (this.l != 3) {
                        AudioTrack audioTrack2 = this.v;
                        C0643Nw c0643Nw = this.t.a;
                        audioTrack2.setOffloadDelayPadding(c0643Nw.M, c0643Nw.N);
                    }
                }
                int i = Lr0.a;
                if (i >= 31 && (c3436zZ = this.q) != null) {
                    AbstractC1221ck.a(this.v, c3436zZ);
                }
                this.X = this.v.getAudioSessionId();
                AudioTrack audioTrack3 = this.v;
                C1514fk c1514fk2 = this.t;
                boolean z2 = c1514fk2.c == 2;
                int i2 = c1514fk2.g;
                int i3 = c1514fk2.d;
                int i4 = c1514fk2.h;
                C2242n7 c2242n7 = this.i;
                c2242n7.c = audioTrack3;
                c2242n7.d = i3;
                c2242n7.e = i4;
                c2242n7.f = new C2145m7(audioTrack3);
                c2242n7.g = audioTrack3.getSampleRate();
                c2242n7.h = z2 && i < 23 && (i2 == 5 || i2 == 6);
                boolean zH = Lr0.H(i2);
                c2242n7.q = zH;
                c2242n7.i = zH ? Lr0.Q(c2242n7.g, i4 / i3) : -9223372036854775807L;
                c2242n7.t = 0L;
                c2242n7.u = 0L;
                c2242n7.v = 0L;
                c2242n7.p = false;
                c2242n7.y = -9223372036854775807L;
                c2242n7.z = -9223372036854775807L;
                c2242n7.r = 0L;
                c2242n7.f931o = 0L;
                c2242n7.j = 1.0f;
                if (m()) {
                    if (i >= 21) {
                        this.v.setVolume(this.N);
                    } else {
                        AudioTrack audioTrack4 = this.v;
                        float f = this.N;
                        audioTrack4.setStereoVolume(f, f);
                    }
                }
                this.Y.getClass();
                C1319dk c1319dk = this.Z;
                if (c1319dk != null && i >= 23) {
                    AbstractC1124bk.a(this.v, c1319dk);
                }
                this.L = true;
                return true;
            } catch (C1560g7 e) {
                C0334By c0334By = this.r;
                if (c0334By != null) {
                    c0334By.t(e);
                }
                throw e;
            }
        } catch (C1560g7 e2) {
            C1514fk c1514fk3 = this.t;
            if (c1514fk3.h > 1000000) {
                C1514fk c1514fk4 = new C1514fk(c1514fk3.a, c1514fk3.b, c1514fk3.c, c1514fk3.d, c1514fk3.e, c1514fk3.f, c1514fk3.g, 1000000, c1514fk3.i, c1514fk3.j);
                try {
                    try {
                        audioTrackA = c1514fk4.a(this.a0, this.y, this.X);
                        this.t = c1514fk4;
                    } catch (C1560g7 e3) {
                        e2.addSuppressed(e3);
                        if (this.t.c == 1) {
                            throw e2;
                        }
                        this.d0 = true;
                        throw e2;
                    }
                } catch (C1560g7 e4) {
                    C0334By c0334By2 = this.r;
                    if (c0334By2 != null) {
                        c0334By2.t(e4);
                    }
                    throw e4;
                }
            }
            if (this.t.c == 1) {
                throw e2;
            }
            this.d0 = true;
            throw e2;
        }
    }

    public final boolean m() {
        return this.v != null;
    }

    public final void o() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jI = i();
        C2242n7 c2242n7 = this.i;
        c2242n7.A = c2242n7.b();
        c2242n7.y = SystemClock.elapsedRealtime() * 1000;
        c2242n7.B = jI;
        this.v.stop();
        this.E = 0;
    }

    public final void p(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.u.e()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                byteBuffer2 = X6.a;
            }
            u(byteBuffer2, j);
            return;
        }
        while (!this.u.d()) {
            do {
                U6 u6 = this.u;
                if (u6.e()) {
                    ByteBuffer byteBuffer3 = u6.c[u6.c()];
                    if (!byteBuffer3.hasRemaining()) {
                        u6.f(X6.a);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = X6.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    U6 u7 = this.u;
                    ByteBuffer byteBuffer5 = this.O;
                    if (u7.e() && !u7.d) {
                        u7.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void q() {
        d();
        XE xeListIterator = this.f.listIterator(0);
        while (xeListIterator.hasNext()) {
            ((X6) xeListIterator.next()).g();
        }
        XE xeListIterator2 = this.g.listIterator(0);
        while (xeListIterator2.hasNext()) {
            ((X6) xeListIterator2.next()).g();
        }
        U6 u6 = this.u;
        if (u6 != null) {
            u6.g();
        }
        this.V = false;
        this.d0 = false;
    }

    public final void r() {
        if (m()) {
            try {
                this.v.setPlaybackParams(A0.d().allowDefaults().setSpeed(this.B.l).setPitch(this.B.m).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AP.A("Failed to set playback params", e);
            }
            C1591gZ c1591gZ = new C1591gZ(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.B = c1591gZ;
            float f = c1591gZ.l;
            C2242n7 c2242n7 = this.i;
            c2242n7.j = f;
            C2145m7 c2145m7 = c2242n7.f;
            if (c2145m7 != null) {
                c2145m7.a();
            }
            c2242n7.d();
        }
    }

    public final boolean s() {
        C1514fk c1514fk = this.t;
        return c1514fk != null && c1514fk.j && Lr0.a >= 23;
    }

    public final boolean t(I6 i6, C0643Nw c0643Nw) {
        int i;
        int iP;
        int playbackOffloadSupport;
        int i2 = Lr0.a;
        if (i2 < 29 || (i = this.l) == 0) {
            return false;
        }
        String str = c0643Nw.w;
        str.getClass();
        int iD = IQ.d(str, c0643Nw.t);
        if (iD == 0 || (iP = Lr0.p(c0643Nw.J)) == 0) {
            return false;
        }
        AudioFormat audioFormatF = f(c0643Nw.K, iP, iD);
        AudioAttributes audioAttributes = (AudioAttributes) i6.a().m;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatF, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatF, audioAttributes)) {
            playbackOffloadSupport = (i2 == 30 && Lr0.d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((c0643Nw.M != 0 || c0643Nw.N != 0) && (i == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    public final void u(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        C0334By c0334By;
        C1140bs c1140bs;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                AbstractC0397Ej.c(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (Lr0.a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.R = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.R, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.S = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = Lr0.a;
            if (i < 21) {
                long j2 = this.H;
                C2242n7 c2242n7 = this.i;
                int iB = c2242n7.e - ((int) (j2 - (c2242n7.b() * ((long) c2242n7.d))));
                if (iB > 0) {
                    iWrite = this.v.write(this.R, this.S, Math.min(iRemaining2, iB));
                    if (iWrite > 0) {
                        this.S += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.a0) {
                AbstractC0397Ej.f(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.b0;
                } else {
                    this.b0 = j;
                }
                AudioTrack audioTrack = this.v;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.D == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.D = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.D.putInt(1431633921);
                    }
                    if (this.E == 0) {
                        this.D.putInt(4, iRemaining2);
                        this.D.putLong(8, j * 1000);
                        this.D.position(0);
                        this.E = iRemaining2;
                    }
                    int iRemaining3 = this.D.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.E = 0;
                        } else {
                            this.E -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.D, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.E = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.E = 0;
                            } else {
                                this.E -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.v.write(byteBuffer, iRemaining2, 1);
            }
            this.c0 = SystemClock.elapsedRealtime();
            C3306y6 c3306y6 = this.f851o;
            if (iWrite < 0) {
                C1756i7 c1756i7 = new C1756i7(iWrite, this.t.a, ((i >= 24 && iWrite == -6) || iWrite == -32) && this.I > 0);
                C0334By c0334By2 = this.r;
                if (c0334By2 != null) {
                    c0334By2.t(c1756i7);
                }
                if (c1756i7.m) {
                    this.w = M6.c;
                    throw c1756i7;
                }
                c3306y6.P(c1756i7);
                return;
            }
            c3306y6.n = null;
            if (n(this.v)) {
                if (this.I > 0) {
                    this.e0 = false;
                }
                if (this.V && (c0334By = this.r) != null && iWrite < iRemaining2 && !this.e0 && (c1140bs = ((AO) c0334By.m).b1) != null) {
                    c1140bs.a.S = true;
                }
            }
            int i2 = this.t.c;
            if (i2 == 0) {
                this.H += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    AbstractC0397Ej.f(byteBuffer == this.O);
                    this.I = (((long) this.J) * ((long) this.P)) + this.I;
                }
                this.Q = null;
            }
        }
    }
}
