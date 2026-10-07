package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: o.ib0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1791ib0 {
    public static final C1791ib0 a = new C1791ib0();
    public static final Rh0 b = new Rh0(C2428p3.P);
    public static final Rh0 c = new Rh0(C2428p3.Q);
    public static final Rh0 d = new Rh0(C1693hb0.n);
    public static volatile C1101bX e;

    public static OV a(boolean z, boolean z2, boolean z3) {
        NV nv;
        int i = 0;
        ArrayList arrayList = new ArrayList();
        String str = AbstractC1360e5.b;
        String[] strArr = {"sha256/kIdp6NNEd8wsugYyyIYFsi1ylMCED3hZbSR8ZFsa/A4=", "sha256/4Y3heIjtEQkOC6PpTJ55i1monTmrJM0jPwTraukdUas="};
        AbstractC1474fG.j(str, "pattern");
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(new C2956uc(str, strArr[i2]));
        }
        C3150wc c3150wc = new C3150wc(AbstractC0911Ye.B0(arrayList), null);
        X10 x10 = X10.r;
        X10 x11 = X10.q;
        X9 x9 = AbstractC1370eA.m;
        X9 x12 = Sr0.b;
        X9 x13 = Sr0.a;
        if (z2) {
            C3084vr0 c3084vr0 = C3084vr0.a;
            nv = AbstractC1701hf0.o();
            nv.c.add(x13);
            nv.d.add(x12);
            AbstractC1406ef.S(nv.c, x11);
            AbstractC1406ef.S(nv.d, x10);
            nv.c.add(x9);
            nv.d.add(x9);
        } else {
            nv = new NV();
            nv.g(Proxy.NO_PROXY);
            nv.h(InterfaceC2339o7.a);
            nv.c.add(x13);
            nv.d.add(x12);
            AbstractC1406ef.S(nv.c, x11);
            AbstractC1406ef.S(nv.d, x10);
            nv.c.add(x9);
            nv.d.add(x9);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nv.e(6L, timeUnit);
        nv.i(12L, timeUnit);
        nv.k(12L, timeUnit);
        nv.c(15L, timeUnit);
        nv.f = true;
        nv.d(c3150wc);
        if (z3) {
            C3084vr0 c3084vr1 = C3084vr0.a;
            C1041ar0 c1041ar0 = C3084vr0.t;
            if (c1041ar0 != null) {
                C1041ar0 c1041ar1 = c1041ar0.f > System.currentTimeMillis() + 90000 ? c1041ar0 : null;
                if (c1041ar1 != null) {
                    nv.g(c1041ar1.a());
                    nv.h(new Wq0(c1041ar1, i));
                }
            }
        }
        if (z) {
            nv.f(InterfaceC2784sn.a);
        } else {
            try {
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.b(nv);
            } catch (Throwable unused) {
            }
        }
        Rh0 rh0 = C2376oc0.a;
        C2376oc0.b(nv, true);
        return new OV(nv);
    }

    public static OV d(boolean z) {
        return z ? (OV) d.getValue() : (OV) c.getValue();
    }

    public static OV e() {
        return (OV) b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x0021, B:14:0x0029, B:18:0x0038, B:23:0x0041), top: B:28:0x0021 }] */
    public final OV c() {
        OV ovA;
        AtomicLong atomicLong = C3084vr0.v;
        long j = atomicLong.get();
        C1101bX c1101bX = e;
        if (c1101bX != null) {
            if (((Number) c1101bX.l).longValue() != j) {
                c1101bX = null;
            }
            if (c1101bX != null) {
                return (OV) c1101bX.m;
            }
        }
        synchronized (this) {
            try {
                long j2 = atomicLong.get();
                C1101bX c1101bX2 = e;
                if (c1101bX2 == null) {
                    ovA = a(false, false, true);
                    e = new C1101bX(Long.valueOf(j2), ovA);
                } else {
                    C1101bX c1101bX3 = ((Number) c1101bX2.l).longValue() == j2 ? c1101bX2 : null;
                    if (c1101bX3 == null || (ovA = (OV) c1101bX3.m) == null) {
                        ovA = a(false, false, true);
                        e = new C1101bX(Long.valueOf(j2), ovA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ovA;
    }
}
