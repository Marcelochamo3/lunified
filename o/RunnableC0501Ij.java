package o;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: o.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0501Ij implements InterfaceC1708hj, Runnable, Comparable, InterfaceC0432Fs {
    public C2984uq A;
    public int B;
    public boolean C;
    public Object D;
    public Thread E;
    public InterfaceC2450pI F;
    public InterfaceC2450pI G;
    public Object H;
    public InterfaceC1610gj I;
    public volatile InterfaceC1805ij J;
    public volatile boolean K;
    public volatile boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3257xh f329o;
    public final InterfaceC1941k20 p;
    public C1566gA s;
    public InterfaceC2450pI t;
    public EnumC1651h30 u;
    public C3178wq v;
    public int w;
    public int x;
    public C0789Tm y;
    public FW z;
    public final C0449Gj l = new C0449Gj();
    public final ArrayList m = new ArrayList();
    public final C2965ug0 n = new C2965ug0();
    public final Na0 q = new Na0(12, false);
    public final C0475Hj r = new C0475Hj();

    public RunnableC0501Ij(C3257xh c3257xh, Na0 na0) {
        this.f329o = c3257xh;
        this.p = na0;
    }

    @Override // o.InterfaceC1708hj
    public final void a() {
        o(2);
    }

    @Override // o.InterfaceC1708hj
    public final void b(InterfaceC2450pI interfaceC2450pI, Exception exc, InterfaceC1610gj interfaceC1610gj, int i) {
        interfaceC1610gj.a();
        C1762iA c1762iA = new C1762iA("Fetching data failed", Collections.singletonList(exc));
        Class clsB = interfaceC1610gj.b();
        c1762iA.m = interfaceC2450pI;
        c1762iA.n = i;
        c1762iA.f826o = clsB;
        this.m.add(c1762iA);
        if (Thread.currentThread() != this.E) {
            o(2);
        } else {
            p();
        }
    }

    @Override // o.InterfaceC0432Fs
    public final C2965ug0 c() {
        return this.n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0501Ij runnableC0501Ij = (RunnableC0501Ij) obj;
        int iOrdinal = this.u.ordinal() - runnableC0501Ij.u.ordinal();
        return iOrdinal == 0 ? this.B - runnableC0501Ij.B : iOrdinal;
    }

    @Override // o.InterfaceC1708hj
    public final void d(InterfaceC2450pI interfaceC2450pI, Object obj, InterfaceC1610gj interfaceC1610gj, int i, InterfaceC2450pI interfaceC2450pI2) {
        this.F = interfaceC2450pI;
        this.H = obj;
        this.I = interfaceC1610gj;
        this.P = i;
        this.G = interfaceC2450pI2;
        this.M = interfaceC2450pI != this.l.a().get(0);
        if (Thread.currentThread() != this.E) {
            o(3);
        } else {
            g();
        }
    }

    public final M70 e(InterfaceC1610gj interfaceC1610gj, Object obj, int i) {
        if (obj == null) {
            interfaceC1610gj.a();
            return null;
        }
        try {
            int i2 = AL.a;
            SystemClock.elapsedRealtimeNanos();
            M70 m70F = f(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m70F.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.v);
                Thread.currentThread().getName();
            }
            return m70F;
        } finally {
            interfaceC1610gj.a();
        }
    }

    public final M70 f(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0449Gj c0449Gj = this.l;
        C1089bL c1089bLC = c0449Gj.c(cls);
        FW fw = this.z;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || c0449Gj.r;
            CW cw = C2010ko.i;
            Boolean bool = (Boolean) fw.c(cw);
            if (bool == null || (bool.booleanValue() && !z)) {
                fw = new FW();
                C0492Ia c0492Ia = this.z.b;
                C0492Ia c0492Ia2 = fw.b;
                c0492Ia2.g(c0492Ia);
                c0492Ia2.put(cw, Boolean.valueOf(z));
            }
        }
        FW fw2 = fw;
        InterfaceC2195mj interfaceC2195mjH = this.s.b().h(obj);
        try {
            return c1089bLC.a(this.w, this.x, interfaceC2195mjH, fw2, new C2295nk0(i, 3, this));
        } finally {
            interfaceC2195mjH.a();
        }
    }

    public final void g() {
        M70 m70E;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.H + ", cache key: " + this.F + ", fetcher: " + this.I;
            int i = AL.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.v);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C3422zL c3422zL = null;
        try {
            m70E = e(this.I, this.H, this.P);
        } catch (C1762iA e) {
            InterfaceC2450pI interfaceC2450pI = this.G;
            int i2 = this.P;
            e.m = interfaceC2450pI;
            e.n = i2;
            e.f826o = null;
            this.m.add(e);
            m70E = null;
        }
        if (m70E == null) {
            p();
            return;
        }
        int i3 = this.P;
        boolean z = this.M;
        if (m70E instanceof FF) {
            ((FF) m70E).a();
        }
        if (((C3422zL) this.q.f414o) != null) {
            c3422zL = (C3422zL) C3422zL.p.n();
            c3422zL.f1152o = false;
            c3422zL.n = true;
            c3422zL.m = m70E;
            m70E = c3422zL;
        }
        r();
        C2984uq c2984uq = this.A;
        synchronized (c2984uq) {
            c2984uq.B = m70E;
            c2984uq.C = i3;
            c2984uq.J = z;
        }
        c2984uq.h();
        this.N = 5;
        try {
            Na0 na0 = this.q;
            if (((C3422zL) na0.f414o) != null) {
                C3257xh c3257xh = this.f329o;
                FW fw = this.z;
                na0.getClass();
                try {
                    c3257xh.a().c((InterfaceC2450pI) na0.m, new Na0((T70) na0.n, (C3422zL) na0.f414o, fw, 11));
                    ((C3422zL) na0.f414o).a();
                } catch (Throwable th) {
                    ((C3422zL) na0.f414o).a();
                    throw th;
                }
            }
            if (c3422zL != null) {
                c3422zL.a();
            }
            k();
        } catch (Throwable th2) {
            if (c3422zL != null) {
                c3422zL.a();
            }
            throw th2;
        }
    }

    public final InterfaceC1805ij h() {
        int iW = AbstractC1701hf0.w(this.N);
        C0449Gj c0449Gj = this.l;
        if (iW == 1) {
            return new N70(c0449Gj, this);
        }
        if (iW == 2) {
            return new C1317dj(c0449Gj.a(), c0449Gj, this);
        }
        if (iW == 3) {
            return new C2188mf0(c0449Gj, this);
        }
        if (iW == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC1701hf0.A(this.N)));
    }

    public final int i(int i) {
        int iW = AbstractC1701hf0.w(i);
        if (iW == 0) {
            if (this.y.b()) {
                return 2;
            }
            return i(2);
        }
        if (iW == 1) {
            if (this.y.a()) {
                return 3;
            }
            return i(3);
        }
        if (iW == 2) {
            return this.C ? 6 : 4;
        }
        if (iW == 3 || iW == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC1701hf0.A(i)));
    }

    public final void j() {
        r();
        C1762iA c1762iA = new C1762iA("Failed to load resource", new ArrayList(this.m));
        C2984uq c2984uq = this.A;
        synchronized (c2984uq) {
            c2984uq.E = c1762iA;
        }
        c2984uq.g();
        l();
    }

    public final void k() {
        boolean zA;
        C0475Hj c0475Hj = this.r;
        synchronized (c0475Hj) {
            c0475Hj.b = true;
            zA = c0475Hj.a();
        }
        if (zA) {
            n();
        }
    }

    public final void l() {
        boolean zA;
        C0475Hj c0475Hj = this.r;
        synchronized (c0475Hj) {
            c0475Hj.c = true;
            zA = c0475Hj.a();
        }
        if (zA) {
            n();
        }
    }

    public final void m() {
        boolean zA;
        C0475Hj c0475Hj = this.r;
        synchronized (c0475Hj) {
            c0475Hj.a = true;
            zA = c0475Hj.a();
        }
        if (zA) {
            n();
        }
    }

    public final void n() {
        C0475Hj c0475Hj = this.r;
        synchronized (c0475Hj) {
            c0475Hj.b = false;
            c0475Hj.a = false;
            c0475Hj.c = false;
        }
        Na0 na0 = this.q;
        na0.m = null;
        na0.n = null;
        na0.f414o = null;
        C0449Gj c0449Gj = this.l;
        c0449Gj.c = null;
        c0449Gj.d = null;
        c0449Gj.n = null;
        c0449Gj.g = null;
        c0449Gj.k = null;
        c0449Gj.i = null;
        c0449Gj.f285o = null;
        c0449Gj.j = null;
        c0449Gj.p = null;
        c0449Gj.a.clear();
        c0449Gj.l = false;
        c0449Gj.b.clear();
        c0449Gj.m = false;
        this.K = false;
        this.s = null;
        this.t = null;
        this.z = null;
        this.u = null;
        this.v = null;
        this.A = null;
        this.N = 0;
        this.J = null;
        this.E = null;
        this.F = null;
        this.H = null;
        this.P = 0;
        this.I = null;
        this.L = false;
        this.m.clear();
        this.p.e(this);
    }

    public final void o(int i) {
        ExecutorServiceC1956kA executorServiceC1956kA;
        this.O = i;
        C2984uq c2984uq = this.A;
        if (c2984uq.y) {
            executorServiceC1956kA = c2984uq.t;
        } else {
            executorServiceC1956kA = c2984uq.z ? c2984uq.u : c2984uq.s;
        }
        executorServiceC1956kA.execute(this);
    }

    public final void p() {
        this.E = Thread.currentThread();
        int i = AL.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.L && this.J != null && !(zC = this.J.c())) {
            this.N = i(this.N);
            this.J = h();
            if (this.N == 4) {
                o(2);
                return;
            }
        }
        if ((this.N == 6 || this.L) && !zC) {
            j();
        }
    }

    public final void q() {
        int iW = AbstractC1701hf0.w(this.O);
        if (iW == 0) {
            this.N = i(1);
            this.J = h();
            p();
        } else if (iW == 1) {
            p();
        } else {
            if (iW != 2) {
                throw new IllegalStateException("Unrecognized run reason: ".concat(AbstractC1701hf0.z(this.O)));
            }
            g();
        }
    }

    public final void r() {
        this.n.a();
        if (this.K) {
            throw new IllegalStateException("Already notified", this.m.isEmpty() ? null : (Throwable) AbstractC1701hf0.c(1, this.m));
        }
        this.K = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1610gj interfaceC1610gj = this.I;
        try {
            try {
                try {
                    if (this.L) {
                        j();
                        if (interfaceC1610gj != null) {
                            interfaceC1610gj.a();
                            return;
                        }
                        return;
                    }
                    q();
                    if (interfaceC1610gj != null) {
                        interfaceC1610gj.a();
                    }
                } catch (Throwable th) {
                    Log.isLoggable("DecodeJob", 3);
                    if (this.N != 5) {
                        this.m.add(th);
                        j();
                    }
                    if (!this.L) {
                        throw th;
                    }
                    throw th;
                }
            } catch (C0829Va e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC1610gj != null) {
                interfaceC1610gj.a();
            }
            throw th2;
        }
    }
}
