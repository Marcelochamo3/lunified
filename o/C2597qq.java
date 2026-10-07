package o;

import android.os.SystemClock;
import android.util.Log;
import io.sentry.C0032c;
import j$.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2597qq implements InterfaceC3081vq, UP, InterfaceC3275xq {
    public static final boolean i = Log.isLoggable("Engine", 2);
    public final C2994uv a;
    public final C0519Jb b;
    public final C3132wM c;
    public final Tl0 d;
    public final C2149m9 e;
    public final C3257xh f;
    public final C2613qy g;
    public final C0032c h;

    public C2597qq(C3132wM c3132wM, C0334By c0334By, ExecutorServiceC1956kA executorServiceC1956kA, ExecutorServiceC1956kA executorServiceC1956kA2, ExecutorServiceC1956kA executorServiceC1956kA3, ExecutorServiceC1956kA executorServiceC1956kA4) {
        this.c = c3132wM;
        C3257xh c3257xh = new C3257xh(c0334By);
        this.f = c3257xh;
        C0032c c0032c = new C0032c(1, (byte) 0);
        this.h = c0032c;
        synchronized (this) {
            synchronized (c0032c) {
                c0032c.e = this;
            }
        }
        this.b = new C0519Jb(17);
        this.a = new C2994uv(11);
        this.d = new Tl0(executorServiceC1956kA, executorServiceC1956kA2, executorServiceC1956kA3, executorServiceC1956kA4, this, this);
        this.g = new C2613qy(c3257xh);
        this.e = new C2149m9(3);
        c3132wM.d = this;
    }

    public static void f(M70 m70) {
        if (!(m70 instanceof C3372yq)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3372yq) m70).c();
    }

    public final Na0 a(C1566gA c1566gA, Object obj, InterfaceC2450pI interfaceC2450pI, int i2, int i3, Class cls, Class cls2, EnumC1651h30 enumC1651h30, C0789Tm c0789Tm, C0492Ia c0492Ia, boolean z, boolean z2, FW fw, boolean z3, boolean z4, boolean z5, boolean z6, P70 p70, Executor executor) {
        long jElapsedRealtimeNanos;
        if (i) {
            int i4 = AL.a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.b.getClass();
        C3178wq c3178wq = new C3178wq(obj, interfaceC2450pI, i2, i3, c0492Ia, cls, cls2, fw);
        synchronized (this) {
            try {
                C3372yq c3372yqC = c(c3178wq, z3, j);
                if (c3372yqC == null) {
                    return g(c1566gA, obj, interfaceC2450pI, i2, i3, cls, cls2, enumC1651h30, c0789Tm, c0492Ia, z, z2, fw, z3, z4, z5, z6, p70, executor, c3178wq, j);
                }
                ((Wd0) p70).h(c3372yqC, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3372yq b(InterfaceC2450pI interfaceC2450pI) {
        C3372yq c3372yq;
        Object obj;
        C3132wM c3132wM = this.c;
        synchronized (c3132wM) {
            C2744sM c2744sM = (C2744sM) ((LinkedHashMap) c3132wM.c).remove(interfaceC2450pI);
            c3372yq = null;
            if (c2744sM == null) {
                obj = null;
            } else {
                c3132wM.b -= (long) c2744sM.b;
                obj = c2744sM.a;
            }
        }
        M70 m70 = (M70) obj;
        if (m70 != null) {
            c3372yq = m70 instanceof C3372yq ? (C3372yq) m70 : new C3372yq(m70, true, true, interfaceC2450pI, this);
        }
        if (c3372yq != null) {
            c3372yq.a();
            this.h.f(interfaceC2450pI, c3372yq);
        }
        return c3372yq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3372yq c(C3178wq c3178wq, boolean z, long j) {
        C3372yq c3372yq;
        if (!z) {
            return null;
        }
        C0032c c0032c = this.h;
        synchronized (c0032c) {
            C3296y1 c3296y1 = (C3296y1) ((HashMap) c0032c.c).get(c3178wq);
            if (c3296y1 == null) {
                c3372yq = null;
            } else {
                c3372yq = (C3372yq) c3296y1.get();
                if (c3372yq == null) {
                    c0032c.h(c3296y1);
                }
            }
        }
        if (c3372yq != null) {
            c3372yq.a();
        }
        if (c3372yq != null) {
            if (i) {
                int i2 = AL.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c3178wq);
            }
            return c3372yq;
        }
        C3372yq c3372yqB = b(c3178wq);
        if (c3372yqB == null) {
            return null;
        }
        if (i) {
            int i3 = AL.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c3178wq);
        }
        return c3372yqB;
    }

    public final synchronized void d(C2984uq c2984uq, InterfaceC2450pI interfaceC2450pI, C3372yq c3372yq) {
        if (c3372yq != null) {
            try {
                if (c3372yq.l) {
                    this.h.f(interfaceC2450pI, c3372yq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2994uv c2994uv = this.a;
        c2994uv.getClass();
        HashMap map = (HashMap) (c2984uq.A ? c2994uv.n : c2994uv.m);
        if (c2984uq.equals(map.get(interfaceC2450pI))) {
            map.remove(interfaceC2450pI);
        }
    }

    public final void e(InterfaceC2450pI interfaceC2450pI, C3372yq c3372yq) {
        C0032c c0032c = this.h;
        synchronized (c0032c) {
            C3296y1 c3296y1 = (C3296y1) ((HashMap) c0032c.c).remove(interfaceC2450pI);
            if (c3296y1 != null) {
                c3296y1.c = null;
                c3296y1.clear();
            }
        }
        if (c3372yq.l) {
        } else {
            this.e.e(c3372yq, false);
        }
    }

    public final Na0 g(C1566gA c1566gA, Object obj, InterfaceC2450pI interfaceC2450pI, int i2, int i3, Class cls, Class cls2, EnumC1651h30 enumC1651h30, C0789Tm c0789Tm, C0492Ia c0492Ia, boolean z, boolean z2, FW fw, boolean z3, boolean z4, boolean z5, boolean z6, P70 p70, Executor executor, C3178wq c3178wq, long j) {
        C2994uv c2994uv = this.a;
        C2984uq c2984uq = (C2984uq) ((HashMap) (z6 ? c2994uv.n : c2994uv.m)).get(c3178wq);
        if (c2984uq != null) {
            c2984uq.a(p70, executor);
            if (i) {
                int i4 = AL.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c3178wq);
            }
            return new Na0(this, p70, c2984uq);
        }
        C2984uq c2984uq2 = (C2984uq) ((Na0) this.d.r).n();
        synchronized (c2984uq2) {
            c2984uq2.w = c3178wq;
            c2984uq2.x = z3;
            c2984uq2.y = z4;
            c2984uq2.z = z5;
            c2984uq2.A = z6;
        }
        C2613qy c2613qy = this.g;
        RunnableC0501Ij runnableC0501Ij = (RunnableC0501Ij) ((Na0) c2613qy.f996o).n();
        int i5 = c2613qy.m;
        c2613qy.m = i5 + 1;
        C0449Gj c0449Gj = runnableC0501Ij.l;
        c0449Gj.c = c1566gA;
        c0449Gj.d = obj;
        c0449Gj.n = interfaceC2450pI;
        c0449Gj.e = i2;
        c0449Gj.f = i3;
        c0449Gj.p = c0789Tm;
        c0449Gj.g = cls;
        c0449Gj.h = runnableC0501Ij.f329o;
        c0449Gj.k = cls2;
        c0449Gj.f285o = enumC1651h30;
        c0449Gj.i = fw;
        c0449Gj.j = c0492Ia;
        c0449Gj.q = z;
        c0449Gj.r = z2;
        runnableC0501Ij.s = c1566gA;
        runnableC0501Ij.t = interfaceC2450pI;
        runnableC0501Ij.u = enumC1651h30;
        runnableC0501Ij.v = c3178wq;
        runnableC0501Ij.w = i2;
        runnableC0501Ij.x = i3;
        runnableC0501Ij.y = c0789Tm;
        runnableC0501Ij.C = z6;
        runnableC0501Ij.z = fw;
        runnableC0501Ij.A = c2984uq2;
        runnableC0501Ij.B = i5;
        runnableC0501Ij.O = 1;
        runnableC0501Ij.D = obj;
        C2994uv c2994uv2 = this.a;
        c2994uv2.getClass();
        ((HashMap) (c2984uq2.A ? c2994uv2.n : c2994uv2.m)).put(c3178wq, c2984uq2);
        c2984uq2.a(p70, executor);
        c2984uq2.k(runnableC0501Ij);
        if (i) {
            int i6 = AL.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c3178wq);
        }
        return new Na0(this, p70, c2984uq2);
    }
}
