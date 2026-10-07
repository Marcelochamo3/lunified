package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class I9 implements InterfaceC0416Fc {
    public static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(I9.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f321o = AtomicLongFieldUpdater.newUpdater(I9.class, "receivers");
    public static final AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(I9.class, "bufferEnd");
    public static final AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(I9.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(I9.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(I9.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(I9.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(I9.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(I9.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final int l;
    public final InterfaceC0412Ey m;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public I9(int i, InterfaceC0412Ey interfaceC0412Ey) {
        this.l = i;
        this.m = interfaceC0412Ey;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        C0805Uc c0805Uc = K9.a;
        this.bufferEnd = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = p.get(this);
        C0805Uc c0805Uc2 = new C0805Uc(0L, null, this, 3);
        this.sendSegment = c0805Uc2;
        this.receiveSegment = c0805Uc2;
        if (w()) {
            c0805Uc2 = K9.a;
            AbstractC1474fG.h(c0805Uc2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c0805Uc2;
        this._closeCause = K9.s;
    }

    public static boolean D(Object obj) {
        if (obj instanceof InterfaceC1594gb) {
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return K9.a((InterfaceC1594gb) obj, C2985uq0.a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final C0805Uc a(I9 i9, long j, C0805Uc c0805Uc) {
        Object objO;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        i9.getClass();
        C0805Uc c0805Uc2 = K9.a;
        J9 j9 = J9.t;
        loop0: while (true) {
            objO = Jp0.o(c0805Uc, j, j9);
            if (!UK.B(objO)) {
                AbstractC3440zb0 abstractC3440zb0X = UK.x(objO);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
                    AbstractC3440zb0 abstractC3440zb0 = (AbstractC3440zb0) atomicReferenceFieldUpdater.get(i9);
                    if (abstractC3440zb0.n >= abstractC3440zb0X.n) {
                        break loop0;
                    }
                    if (!abstractC3440zb0X.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(i9, abstractC3440zb0, abstractC3440zb0X)) {
                            if (!abstractC3440zb0.e()) {
                                break loop0;
                            }
                            abstractC3440zb0.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(i9) == abstractC3440zb0);
                    if (abstractC3440zb0X.e()) {
                        abstractC3440zb0X.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = UK.B(objO);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f321o;
        if (zB) {
            i9.r();
            if (c0805Uc.n * ((long) K9.b) >= atomicLongFieldUpdater2.get(i9)) {
                return null;
            }
            c0805Uc.a();
            return null;
        }
        C0805Uc c0805Uc3 = (C0805Uc) UK.x(objO);
        long j4 = c0805Uc3.n;
        if (j4 <= j) {
            return c0805Uc3;
        }
        long j5 = ((long) K9.b) * j4;
        do {
            atomicLongFieldUpdater = n;
            j2 = atomicLongFieldUpdater.get(i9);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(i9, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
        if (j4 * ((long) K9.b) >= atomicLongFieldUpdater2.get(i9)) {
            return null;
        }
        c0805Uc3.a();
        return null;
    }

    public static final void d(I9 i9, Object obj, C1692hb c1692hb) {
        C0730Rf c0730RfB;
        InterfaceC0412Ey interfaceC0412Ey = i9.m;
        if (interfaceC0412Ey != null && (c0730RfB = Sr0.b(interfaceC0412Ey, obj, null)) != null) {
            Pu0.m(c1692hb.p, c0730RfB);
        }
        c1692hb.j(Jp0.k(i9.q()));
    }

    public static final int g(I9 i9, C0805Uc c0805Uc, int i, Object obj, long j, Object obj2, boolean z) {
        i9.getClass();
        c0805Uc.m(i, obj);
        if (z) {
            return i9.F(c0805Uc, i, obj, j, obj2, z);
        }
        Object objK = c0805Uc.k(i);
        if (objK == null) {
            if (i9.h(j)) {
                if (c0805Uc.j(null, i, K9.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0805Uc.j(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof InterfaceC1927jv0) {
            c0805Uc.m(i, null);
            if (i9.C(objK, obj)) {
                c0805Uc.n(i, K9.i);
                return 0;
            }
            J2 j2 = K9.k;
            if (c0805Uc.q.getAndSet((i * 2) + 1, j2) != j2) {
                c0805Uc.l(i, true);
            }
            return 5;
        }
        return i9.F(c0805Uc, i, obj, j, obj2, z);
    }

    public static void t(I9 i9) {
        i9.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = q;
        if ((atomicLongFieldUpdater.addAndGet(i9, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(i9) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object z(I9 i9, InterfaceC0473Hh interfaceC0473Hh) {
        G9 g9;
        Object objA;
        if (interfaceC0473Hh instanceof G9) {
            g9 = (G9) interfaceC0473Hh;
            int i = g9.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9.n = i - Integer.MIN_VALUE;
            } else {
                g9 = new G9(i9, interfaceC0473Hh);
            }
        } else {
            g9 = new G9(i9, interfaceC0473Hh);
        }
        G9 g10 = g9;
        Object obj = g10.l;
        Object obj2 = EnumC1706hi.l;
        int i2 = g10.n;
        if (i2 == 0) {
            Jp0.O(obj);
            C0805Uc c0805Uc = (C0805Uc) s.get(i9);
            while (true) {
                i9.getClass();
                if (i9.u(n.get(i9), true)) {
                    return new C0727Rc(i9.p());
                }
                long andIncrement = f321o.getAndIncrement(i9);
                long j = K9.b;
                long j2 = andIncrement / j;
                int i3 = (int) (andIncrement % j);
                if (c0805Uc.n != j2) {
                    C0805Uc c0805UcM = i9.m(j2, c0805Uc);
                    if (c0805UcM == null) {
                        continue;
                    } else {
                        c0805Uc = c0805UcM;
                    }
                }
                Object objE = i9.E(c0805Uc, i3, andIncrement, null);
                if (objE == K9.m) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (objE == K9.f357o) {
                    if (andIncrement < i9.s()) {
                        c0805Uc.a();
                    }
                } else {
                    if (objE != K9.n) {
                        c0805Uc.a();
                        return objE;
                    }
                    g10.n = 1;
                    objA = i9.A(c0805Uc, i3, andIncrement, g10);
                    if (objA == obj2) {
                        return obj2;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            objA = ((C0779Tc) obj).a;
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object A(C0805Uc c0805Uc, int i, long j, InterfaceC0473Hh interfaceC0473Hh) {
        H9 h9;
        C0779Tc c0779Tc;
        io.sentry.android.replay.p pVar;
        C0805Uc c0805Uc2;
        if (interfaceC0473Hh instanceof H9) {
            h9 = (H9) interfaceC0473Hh;
            int i2 = h9.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h9.n = i2 - Integer.MIN_VALUE;
            } else {
                h9 = new H9(this, interfaceC0473Hh);
            }
        } else {
            h9 = new H9(this, interfaceC0473Hh);
        }
        Object objX = h9.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = h9.n;
        boolean z = true;
        if (i3 == 0) {
            Jp0.O(objX);
            h9.getClass();
            h9.getClass();
            h9.n = 1;
            C1692hb c1692hbT = Jp0.t(Ou0.p(h9));
            try {
                F50 f50 = new F50(c1692hbT);
                Object objE = E(c0805Uc, i, j, f50);
                if (objE != K9.m) {
                    Object obj = K9.f357o;
                    InterfaceC0412Ey interfaceC0412Ey = this.m;
                    InterfaceC1022ai interfaceC1022ai = c1692hbT.p;
                    if (objE == obj) {
                        if (j < s()) {
                            c0805Uc.a();
                        }
                        C0805Uc c0805Uc3 = (C0805Uc) s.get(this);
                        while (true) {
                            if (u(n.get(this), z)) {
                                c1692hbT.j(new C0779Tc(new C0727Rc(p())));
                                break;
                            }
                            long andIncrement = f321o.getAndIncrement(this);
                            long j2 = K9.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (c0805Uc3.n != j3) {
                                C0805Uc c0805UcM = m(j3, c0805Uc3);
                                if (c0805UcM != null) {
                                    c0805Uc2 = c0805UcM;
                                }
                            } else {
                                c0805Uc2 = c0805Uc3;
                            }
                            C0805Uc c0805Uc4 = c0805Uc2;
                            Object objE2 = E(c0805Uc2, i4, andIncrement, f50);
                            if (objE2 == K9.m) {
                                f50.b(c0805Uc4, i4);
                                break;
                            }
                            if (objE2 == K9.f357o) {
                                if (andIncrement < s()) {
                                    c0805Uc4.a();
                                }
                                c0805Uc3 = c0805Uc4;
                                z = true;
                            } else {
                                if (objE2 == K9.n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                c0805Uc4.a();
                                c0779Tc = new C0779Tc(objE2);
                                pVar = interfaceC0412Ey != null ? new io.sentry.android.replay.p(interfaceC0412Ey, objE2, interfaceC1022ai, 6) : null;
                            }
                        }
                    } else {
                        c0805Uc.a();
                        c0779Tc = new C0779Tc(objE);
                        pVar = interfaceC0412Ey != null ? new io.sentry.android.replay.p(interfaceC0412Ey, objE, interfaceC1022ai, 6) : null;
                    }
                    c1692hbT.h(c0779Tc, pVar);
                    break;
                }
                f50.b(c0805Uc, i);
                objX = c1692hbT.x();
                if (objX == enumC1706hi) {
                    return enumC1706hi;
                }
            } catch (Throwable th) {
                c1692hbT.F();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objX);
        }
        return ((C0779Tc) objX).a;
    }

    public final void B(InterfaceC1927jv0 interfaceC1927jv0, boolean z) {
        Throwable thQ;
        if (interfaceC1927jv0 instanceof InterfaceC1594gb) {
            InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) interfaceC1927jv0;
            if (z) {
                thQ = p();
                if (thQ == null) {
                    thQ = new C0574Le("Channel was closed");
                }
            } else {
                thQ = q();
            }
            interfaceC0473Hh.j(Jp0.k(thQ));
            return;
        }
        if (interfaceC1927jv0 instanceof F50) {
            ((F50) interfaceC1927jv0).l.j(new C0779Tc(new C0727Rc(p())));
            return;
        }
        if (!(interfaceC1927jv0 instanceof F9)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC1927jv0).toString());
        }
        F9 f9 = (F9) interfaceC1927jv0;
        C1692hb c1692hb = f9.m;
        AbstractC1474fG.g(c1692hb);
        f9.m = null;
        f9.l = K9.l;
        Throwable thP = f9.n.p();
        if (thP == null) {
            c1692hb.j(Boolean.FALSE);
        } else {
            c1692hb.j(Jp0.k(thP));
        }
    }

    public final boolean C(Object obj, Object obj2) {
        boolean z = obj instanceof F50;
        InterfaceC0412Ey interfaceC0412Ey = this.m;
        if (z) {
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C1692hb c1692hb = ((F50) obj).l;
            return K9.a(c1692hb, new C0779Tc(obj2), interfaceC0412Ey != null ? new io.sentry.android.replay.p(interfaceC0412Ey, obj2, c1692hb.p, 6) : null);
        }
        if (!(obj instanceof F9)) {
            if (obj instanceof InterfaceC1594gb) {
                AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC1594gb interfaceC1594gb = (InterfaceC1594gb) obj;
                return K9.a(interfaceC1594gb, obj2, interfaceC0412Ey != null ? new io.sentry.android.replay.p(interfaceC0412Ey, obj2, interfaceC1594gb.g(), 6) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        F9 f9 = (F9) obj;
        C1692hb c1692hb2 = f9.m;
        AbstractC1474fG.g(c1692hb2);
        f9.m = null;
        f9.l = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC0412Ey interfaceC0412Ey2 = f9.n.m;
        return K9.a(c1692hb2, bool, interfaceC0412Ey2 != null ? new io.sentry.android.replay.p(interfaceC0412Ey2, obj2, c1692hb2.p, 6) : null);
    }

    public final Object E(C0805Uc c0805Uc, int i, long j, Object obj) {
        Object objK = c0805Uc.k(i);
        AtomicReferenceArray atomicReferenceArray = c0805Uc.q;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return K9.n;
                }
                if (c0805Uc.j(objK, i, obj)) {
                    l();
                    return K9.m;
                }
            }
        } else if (objK == K9.d && c0805Uc.j(objK, i, K9.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c0805Uc.m(i, null);
            return obj2;
        }
        while (true) {
            Object objK2 = c0805Uc.k(i);
            if (objK2 == null || objK2 == K9.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0805Uc.j(objK2, i, K9.h)) {
                        l();
                        return K9.f357o;
                    }
                } else {
                    if (obj == null) {
                        return K9.n;
                    }
                    if (c0805Uc.j(objK2, i, obj)) {
                        l();
                        return K9.m;
                    }
                }
            } else if (objK2 != K9.d) {
                J2 j2 = K9.j;
                if (objK2 == j2) {
                    return K9.f357o;
                }
                if (objK2 == K9.h) {
                    return K9.f357o;
                }
                if (objK2 == K9.l) {
                    l();
                    return K9.f357o;
                }
                if (objK2 != K9.g && c0805Uc.j(objK2, i, K9.f)) {
                    boolean z = objK2 instanceof C2025kv0;
                    if (z) {
                        objK2 = ((C2025kv0) objK2).a;
                    }
                    if (D(objK2)) {
                        c0805Uc.n(i, K9.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c0805Uc.m(i, null);
                        return obj3;
                    }
                    c0805Uc.n(i, j2);
                    c0805Uc.l(i, false);
                    if (z) {
                        l();
                    }
                    return K9.f357o;
                }
            } else if (c0805Uc.j(objK2, i, K9.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c0805Uc.m(i, null);
                return obj4;
            }
        }
    }

    public final int F(C0805Uc c0805Uc, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objK = c0805Uc.k(i);
            if (objK == null) {
                if (!h(j) || z) {
                    if (z) {
                        if (c0805Uc.j(null, i, K9.j)) {
                            c0805Uc.l(i, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0805Uc.j(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0805Uc.j(null, i, K9.d)) {
                    return 1;
                }
            } else {
                if (objK != K9.e) {
                    J2 j2 = K9.k;
                    if (objK == j2) {
                        c0805Uc.m(i, null);
                        return 5;
                    }
                    if (objK == K9.h) {
                        c0805Uc.m(i, null);
                        return 5;
                    }
                    if (objK == K9.l) {
                        c0805Uc.m(i, null);
                        r();
                        return 4;
                    }
                    c0805Uc.m(i, null);
                    if (objK instanceof C2025kv0) {
                        objK = ((C2025kv0) objK).a;
                    }
                    if (C(objK, obj)) {
                        c0805Uc.n(i, K9.i);
                        return 0;
                    }
                    if (c0805Uc.q.getAndSet((i * 2) + 1, j2) != j2) {
                        c0805Uc.l(i, true);
                    }
                    return 5;
                }
                if (c0805Uc.j(objK, i, K9.d)) {
                    return 1;
                }
            }
        }
    }

    public final void G(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (w()) {
            return;
        }
        do {
            atomicLongFieldUpdater = p;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = K9.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = q;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // o.Pb0
    public final boolean b(Throwable th) {
        return i(th, false);
    }

    @Override // o.G50
    public final Object c(InterfaceC0473Hh interfaceC0473Hh) {
        return z(this, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d8, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.hb] */
    @Override // o.Pb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.Object r27, o.InterfaceC0473Hh r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.I9.e(java.lang.Object, o.Hh):java.lang.Object");
    }

    @Override // o.G50
    public final void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    public final boolean h(long j) {
        return j < p.get(this) || j < f321o.get(this) + ((long) this.l);
    }

    public final boolean i(Throwable th, boolean z) {
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                C0805Uc c0805Uc = K9.a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (((long) 1) << 60) + (j5 & 1152921504606846975L)));
        }
        J2 j6 = K9.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
            if (atomicReferenceFieldUpdater.compareAndSet(this, j6, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != j6) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        r();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v;
                obj = atomicReferenceFieldUpdater2.get(this);
                J2 j7 = obj == null ? K9.q : K9.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, j7)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                Jp0.d(1, obj);
                ((InterfaceC0412Ey) obj).b(p());
            }
        }
        return z2;
    }

    @Override // o.G50
    public final F9 iterator() {
        return new F9(this);
    }

    public final C0805Uc j(long j) {
        Object objA;
        long j2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = t.get(this);
        C0805Uc c0805Uc = (C0805Uc) r.get(this);
        if (c0805Uc.n > ((C0805Uc) obj).n) {
            obj = c0805Uc;
        }
        C0805Uc c0805Uc2 = (C0805Uc) s.get(this);
        if (c0805Uc2.n > ((C0805Uc) obj).n) {
            obj = c0805Uc2;
        }
        AbstractC2189mg abstractC2189mg = (AbstractC2189mg) obj;
        loop0: while (true) {
            abstractC2189mg.getClass();
            Object obj2 = AbstractC2189mg.l.get(abstractC2189mg);
            J2 j3 = Jp0.a;
            objA = null;
            if (obj2 == j3) {
                break;
            }
            AbstractC2189mg abstractC2189mg2 = (AbstractC2189mg) obj2;
            if (abstractC2189mg2 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC2189mg.l;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2189mg, null, j3)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC2189mg) == null);
            } else {
                abstractC2189mg = abstractC2189mg2;
            }
        }
        C0805Uc c0805Uc3 = (C0805Uc) abstractC2189mg;
        if (v()) {
            C0805Uc c0805Uc4 = c0805Uc3;
            loop2: while (true) {
                int i = K9.b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (c0805Uc4.n * ((long) K9.b)) + ((long) i);
                        if (j2 >= f321o.get(this)) {
                            while (true) {
                                Object objK = c0805Uc4.k(i);
                                if (objK != null && objK != K9.e) {
                                    if (objK != K9.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c0805Uc4.j(objK, i, K9.l)) {
                                    c0805Uc4.h();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        c0805Uc4 = (C0805Uc) ((AbstractC2189mg) AbstractC2189mg.m.get(c0805Uc4));
                        if (c0805Uc4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                k(j2);
            }
        }
        loop5: for (C0805Uc c0805Uc5 = c0805Uc3; c0805Uc5 != null; c0805Uc5 = (C0805Uc) ((AbstractC2189mg) AbstractC2189mg.m.get(c0805Uc5))) {
            for (int i2 = K9.b - 1; -1 < i2; i2--) {
                if ((c0805Uc5.n * ((long) K9.b)) + ((long) i2) < j) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = c0805Uc5.k(i2);
                    if (objK2 != null && objK2 != K9.e) {
                        if (!(objK2 instanceof C2025kv0)) {
                            if (!(objK2 instanceof InterfaceC1927jv0)) {
                                break;
                            }
                            if (c0805Uc5.j(objK2, i2, K9.l)) {
                                objA = Sr0.A(objA, objK2);
                                c0805Uc5.l(i2, true);
                                break;
                            }
                        } else {
                            if (c0805Uc5.j(objK2, i2, K9.l)) {
                                objA = Sr0.A(objA, ((C2025kv0) objK2).a);
                                c0805Uc5.l(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c0805Uc5.j(objK2, i2, K9.l)) {
                            c0805Uc5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (objA instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objA;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    B((InterfaceC1927jv0) arrayList.get(size), true);
                }
            } else {
                B((InterfaceC1927jv0) objA, true);
            }
        }
        return c0805Uc3;
    }

    public final void k(long j) {
        C0730Rf c0730RfB;
        C0805Uc c0805Uc = (C0805Uc) s.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f321o;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.l) + j2, p.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = K9.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0805Uc.n != j4) {
                    C0805Uc c0805UcM = m(j4, c0805Uc);
                    if (c0805UcM == null) {
                        continue;
                    } else {
                        c0805Uc = c0805UcM;
                    }
                }
                Object objE = E(c0805Uc, i, j2, null);
                if (objE != K9.f357o) {
                    c0805Uc.a();
                    InterfaceC0412Ey interfaceC0412Ey = this.m;
                    if (interfaceC0412Ey != null && (c0730RfB = Sr0.b(interfaceC0412Ey, objE, null)) != null) {
                        throw c0730RfB;
                    }
                } else if (j2 < s()) {
                    c0805Uc.a();
                }
            }
        }
    }

    public final void l() {
        Object objO;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        C0805Uc c0805Uc = (C0805Uc) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = p.getAndIncrement(this);
            long j = andIncrement / ((long) K9.b);
            if (s() <= andIncrement) {
                if (c0805Uc.n < j && c0805Uc.b() != null) {
                    x(j, c0805Uc);
                }
                t(this);
                return;
            }
            if (c0805Uc.n != j) {
                J9 j9 = J9.t;
                while (true) {
                    objO = Jp0.o(c0805Uc, j, j9);
                    if (!UK.B(objO)) {
                        AbstractC3440zb0 abstractC3440zb0X = UK.x(objO);
                        while (true) {
                            AbstractC3440zb0 abstractC3440zb0 = (AbstractC3440zb0) atomicReferenceFieldUpdater.get(this);
                            if (abstractC3440zb0.n >= abstractC3440zb0X.n) {
                                break;
                            }
                            if (!abstractC3440zb0X.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3440zb0, abstractC3440zb0X)) {
                                    if (!abstractC3440zb0.e()) {
                                        break;
                                    }
                                    abstractC3440zb0.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC3440zb0);
                            if (abstractC3440zb0X.e()) {
                                abstractC3440zb0X.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C0805Uc c0805Uc2 = null;
                if (UK.B(objO)) {
                    r();
                    x(j, c0805Uc);
                    t(this);
                } else {
                    C0805Uc c0805Uc3 = (C0805Uc) UK.x(objO);
                    long j2 = c0805Uc3.n;
                    if (j2 > j) {
                        long j3 = j2 * ((long) K9.b);
                        if (p.compareAndSet(this, andIncrement + 1, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = q;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        c0805Uc2 = c0805Uc3;
                    }
                }
                if (c0805Uc2 == null) {
                    continue;
                } else {
                    c0805Uc = c0805Uc2;
                }
            }
            int i = (int) (andIncrement % ((long) K9.b));
            Object objK = c0805Uc.k(i);
            boolean z = objK instanceof InterfaceC1927jv0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f321o;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c0805Uc.j(objK, i, K9.g)) {
                while (true) {
                    Object objK2 = c0805Uc.k(i);
                    if (objK2 instanceof InterfaceC1927jv0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c0805Uc.j(objK2, i, new C2025kv0((InterfaceC1927jv0) objK2))) {
                                t(this);
                                return;
                            }
                        } else if (c0805Uc.j(objK2, i, K9.g)) {
                            if (!D(objK2)) {
                                c0805Uc.n(i, K9.j);
                                c0805Uc.l(i, false);
                                break;
                            } else {
                                c0805Uc.n(i, K9.d);
                                t(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == K9.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (c0805Uc.j(objK2, i, K9.e)) {
                                t(this);
                                return;
                            }
                        } else if (objK2 == K9.d || objK2 == K9.h || objK2 == K9.i || objK2 == K9.k || objK2 == K9.l) {
                            t(this);
                            return;
                        } else if (objK2 != K9.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                t(this);
            } else if (D(objK)) {
                c0805Uc.n(i, K9.d);
                t(this);
                return;
            } else {
                c0805Uc.n(i, K9.j);
                c0805Uc.l(i, false);
                t(this);
            }
        }
    }

    public final C0805Uc m(long j, C0805Uc c0805Uc) {
        Object objO;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C0805Uc c0805Uc2 = K9.a;
        J9 j9 = J9.t;
        loop0: while (true) {
            objO = Jp0.o(c0805Uc, j, j9);
            if (!UK.B(objO)) {
                AbstractC3440zb0 abstractC3440zb0X = UK.x(objO);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                    AbstractC3440zb0 abstractC3440zb0 = (AbstractC3440zb0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3440zb0.n >= abstractC3440zb0X.n) {
                        break loop0;
                    }
                    if (!abstractC3440zb0X.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3440zb0, abstractC3440zb0X)) {
                            if (!abstractC3440zb0.e()) {
                                break loop0;
                            }
                            abstractC3440zb0.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC3440zb0);
                    if (abstractC3440zb0X.e()) {
                        abstractC3440zb0X.d();
                    }
                }
            } else {
                break;
            }
        }
        if (UK.B(objO)) {
            r();
            if (c0805Uc.n * ((long) K9.b) >= s()) {
                return null;
            }
            c0805Uc.a();
            return null;
        }
        C0805Uc c0805Uc3 = (C0805Uc) UK.x(objO);
        boolean zW = w();
        long j3 = c0805Uc3.n;
        if (!zW && j <= p.get(this) / ((long) K9.b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t;
                AbstractC3440zb0 abstractC3440zb1 = (AbstractC3440zb0) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3440zb1.n >= j3 || !c0805Uc3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC3440zb1, c0805Uc3)) {
                        if (!abstractC3440zb1.e()) {
                            break loop3;
                        }
                        abstractC3440zb1.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == abstractC3440zb1);
                if (c0805Uc3.e()) {
                    c0805Uc3.d();
                }
            }
        }
        if (j3 <= j) {
            return c0805Uc3;
        }
        long j4 = ((long) K9.b) * j3;
        do {
            atomicLongFieldUpdater = f321o;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (j3 * ((long) K9.b) >= s()) {
            return null;
        }
        c0805Uc3.a();
        return null;
    }

    @Override // o.G50
    public final Object n() {
        C0805Uc c0805Uc;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f321o;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = n;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (u(j2, true)) {
            return new C0727Rc(p());
        }
        long j3 = j2 & 1152921504606846975L;
        Object obj = C0779Tc.b;
        if (j >= j3) {
            return obj;
        }
        Object obj2 = K9.k;
        C0805Uc c0805Uc2 = (C0805Uc) s.get(this);
        while (!u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = K9.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c0805Uc2.n != j5) {
                C0805Uc c0805UcM = m(j5, c0805Uc2);
                if (c0805UcM == null) {
                    continue;
                } else {
                    c0805Uc = c0805UcM;
                }
            } else {
                c0805Uc = c0805Uc2;
            }
            Object objE = E(c0805Uc, i, andIncrement, obj2);
            if (objE == K9.m) {
                InterfaceC1927jv0 interfaceC1927jv0 = obj2 instanceof InterfaceC1927jv0 ? (InterfaceC1927jv0) obj2 : null;
                if (interfaceC1927jv0 != null) {
                    interfaceC1927jv0.b(c0805Uc, i);
                }
                G(andIncrement);
                c0805Uc.h();
            } else if (objE == K9.f357o) {
                if (andIncrement < s()) {
                    c0805Uc.a();
                }
                c0805Uc2 = c0805Uc;
            } else {
                if (objE == K9.n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c0805Uc.a();
                obj = objE;
            }
            return obj;
        }
        return new C0727Rc(p());
    }

    @Override // o.Pb0
    public Object o(Object obj) {
        C0805Uc c0805Uc;
        C0805Uc c0805Uc2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = u(j, false) ? false : !h(j & 1152921504606846975L);
        C0753Sc c0753Sc = C0779Tc.b;
        if (z) {
            return c0753Sc;
        }
        InterfaceC1518fm interfaceC1518fm = K9.j;
        C0805Uc c0805Uc3 = (C0805Uc) r.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i = K9.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c0805Uc3.n != j4) {
                C0805Uc c0805UcA = a(this, j4, c0805Uc3);
                if (c0805UcA != null) {
                    c0805Uc = c0805UcA;
                } else if (zU) {
                    return new C0727Rc(q());
                }
            } else {
                c0805Uc = c0805Uc3;
            }
            C0805Uc c0805Uc4 = c0805Uc;
            int iG = g(this, c0805Uc, i2, obj, j2, interfaceC1518fm, zU);
            C2985uq0 c2985uq0 = C2985uq0.a;
            if (iG == 0) {
                c0805Uc4.a();
            } else if (iG != 1) {
                if (iG == 2) {
                    if (zU) {
                        c0805Uc4.h();
                        return new C0727Rc(q());
                    }
                    InterfaceC1927jv0 interfaceC1927jv0 = interfaceC1518fm instanceof InterfaceC1927jv0 ? (InterfaceC1927jv0) interfaceC1518fm : null;
                    if (interfaceC1927jv0 != null) {
                        c0805Uc2 = c0805Uc4;
                        interfaceC1927jv0.b(c0805Uc2, i2 + i);
                    } else {
                        c0805Uc2 = c0805Uc4;
                    }
                    c0805Uc2.h();
                    return c0753Sc;
                }
                if (iG == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iG == 4) {
                    if (j2 < f321o.get(this)) {
                        c0805Uc4.a();
                    }
                    return new C0727Rc(q());
                }
                if (iG == 5) {
                    c0805Uc4.a();
                }
                c0805Uc3 = c0805Uc4;
            }
            return c2985uq0;
        }
    }

    public final Throwable p() {
        return (Throwable) u.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new C0599Me("Channel was closed") : thP;
    }

    @Override // o.Pb0
    public final boolean r() {
        return u(n.get(this), false);
    }

    public final long s() {
        return n.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (n.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.l + ',');
        sb.append("data=[");
        List listK = AbstractC0937Ze.K(s.get(this), r.get(this), t.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((C0805Uc) obj) != K9.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C0805Uc) next).n;
            do {
                Object next2 = it.next();
                long j2 = ((C0805Uc) next2).n;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C0805Uc c0805Uc = (C0805Uc) next;
        long j3 = f321o.get(this);
        long jS = s();
        loop2: do {
            int i2 = K9.b;
            for (int i3 = 0; i3 < i2; i3++) {
                long j4 = (c0805Uc.n * ((long) K9.b)) + ((long) i3);
                if (j4 >= jS && j4 >= j3) {
                    break loop2;
                }
                Object objK = c0805Uc.k(i3);
                Object obj2 = c0805Uc.q.get(i3 * 2);
                if (objK instanceof InterfaceC1594gb) {
                    string = (j4 >= j3 || j4 < jS) ? (j4 >= jS || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objK instanceof F50) {
                    string = "receiveCatching";
                } else if (objK instanceof C2025kv0) {
                    string = "EB(" + objK + ')';
                } else if (AbstractC1474fG.b(objK, K9.f) ? true : AbstractC1474fG.b(objK, K9.g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? true : AbstractC1474fG.b(objK, K9.e) ? true : AbstractC1474fG.b(objK, K9.i) ? true : AbstractC1474fG.b(objK, K9.h) ? true : AbstractC1474fG.b(objK, K9.k) ? true : AbstractC1474fG.b(objK, K9.j) ? true : AbstractC1474fG.b(objK, K9.l))) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            c0805Uc = (C0805Uc) c0805Uc.b();
        } while (c0805Uc != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC1119bh0.a0(sb)) == ',') {
            AbstractC1474fG.i(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f321o;
        if (i == 2) {
            j(j & 1152921504606846975L);
            if (z) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                    C0805Uc c0805UcM = (C0805Uc) atomicReferenceFieldUpdater.get(this);
                    long j2 = atomicLongFieldUpdater.get(this);
                    if (s() <= j2) {
                        break;
                    }
                    long j3 = K9.b;
                    long j4 = j2 / j3;
                    if (c0805UcM.n != j4 && (c0805UcM = m(j4, c0805UcM)) == null) {
                        if (((C0805Uc) atomicReferenceFieldUpdater.get(this)).n < j4) {
                            break;
                        }
                    } else {
                        c0805UcM.a();
                        int i2 = (int) (j2 % j3);
                        while (true) {
                            Object objK = c0805UcM.k(i2);
                            if (objK != null && objK != K9.e) {
                                if (objK != K9.d) {
                                    if (objK != K9.j && objK != K9.l && objK != K9.i && objK != K9.h) {
                                        if (objK != K9.g) {
                                            if (objK == K9.f || j2 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (c0805UcM.j(objK, i2, K9.h)) {
                                l();
                                break;
                            }
                        }
                        f321o.compareAndSet(this, j2, j2 + 1);
                    }
                }
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException(AbstractC1674hK.n(i, "unexpected close status: ").toString());
            }
            C0805Uc c0805UcJ = j(j & 1152921504606846975L);
            C0730Rf c0730RfB = null;
            Object objA = null;
            loop0: do {
                for (int i3 = K9.b - 1; -1 < i3; i3--) {
                    long j5 = (c0805UcJ.n * ((long) K9.b)) + ((long) i3);
                    while (true) {
                        Object objK2 = c0805UcJ.k(i3);
                        if (objK2 == K9.i) {
                            break loop0;
                        }
                        J2 j6 = K9.d;
                        AtomicReferenceArray atomicReferenceArray = c0805UcJ.q;
                        InterfaceC0412Ey interfaceC0412Ey = this.m;
                        if (objK2 != j6) {
                            if (objK2 != K9.e && objK2 != null) {
                                if (!(objK2 instanceof InterfaceC1927jv0) && !(objK2 instanceof C2025kv0)) {
                                    J2 j7 = K9.g;
                                    if (objK2 == j7 || objK2 == K9.f) {
                                        break loop0;
                                    }
                                    if (objK2 != j7) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    InterfaceC1927jv0 interfaceC1927jv0 = objK2 instanceof C2025kv0 ? ((C2025kv0) objK2).a : (InterfaceC1927jv0) objK2;
                                    if (c0805UcJ.j(objK2, i3, K9.l)) {
                                        if (interfaceC0412Ey != null) {
                                            c0730RfB = Sr0.b(interfaceC0412Ey, atomicReferenceArray.get(i3 * 2), c0730RfB);
                                        }
                                        objA = Sr0.A(objA, interfaceC1927jv0);
                                        c0805UcJ.m(i3, null);
                                        c0805UcJ.h();
                                        break;
                                    }
                                }
                            } else if (c0805UcJ.j(objK2, i3, K9.l)) {
                                c0805UcJ.h();
                                break;
                            }
                        } else {
                            if (j5 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (c0805UcJ.j(objK2, i3, K9.l)) {
                                if (interfaceC0412Ey != null) {
                                    c0730RfB = Sr0.b(interfaceC0412Ey, atomicReferenceArray.get(i3 * 2), c0730RfB);
                                }
                                c0805UcJ.m(i3, null);
                                c0805UcJ.h();
                                break;
                            }
                        }
                    }
                }
                c0805UcJ = (C0805Uc) ((AbstractC2189mg) AbstractC2189mg.m.get(c0805UcJ));
            } while (c0805UcJ != null);
            if (objA != null) {
                if (objA instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objA;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        B((InterfaceC1927jv0) arrayList.get(size), false);
                    }
                } else {
                    B((InterfaceC1927jv0) objA, false);
                }
            }
            if (c0730RfB != null) {
                throw c0730RfB;
            }
        }
        return true;
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j = p.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void x(long j, C0805Uc c0805Uc) {
        C0805Uc c0805Uc2;
        C0805Uc c0805Uc3;
        while (c0805Uc.n < j && (c0805Uc3 = (C0805Uc) c0805Uc.b()) != null) {
            c0805Uc = c0805Uc3;
        }
        while (true) {
            if (!c0805Uc.c() || (c0805Uc2 = (C0805Uc) c0805Uc.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
                    AbstractC3440zb0 abstractC3440zb0 = (AbstractC3440zb0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3440zb0.n >= c0805Uc.n) {
                        return;
                    }
                    if (!c0805Uc.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3440zb0, c0805Uc)) {
                            if (abstractC3440zb0.e()) {
                                abstractC3440zb0.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC3440zb0);
                    if (c0805Uc.e()) {
                        c0805Uc.d();
                    }
                }
            } else {
                c0805Uc = c0805Uc2;
            }
        }
    }

    public final Object y(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0730Rf c0730RfB;
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        InterfaceC0412Ey interfaceC0412Ey = this.m;
        if (interfaceC0412Ey == null || (c0730RfB = Sr0.b(interfaceC0412Ey, obj, null)) == null) {
            c1692hb.j(Jp0.k(q()));
        } else {
            AbstractC3409z9.a(c0730RfB, q());
            c1692hb.j(Jp0.k(c0730RfB));
        }
        Object objX = c1692hb.x();
        return objX == EnumC1706hi.l ? objX : C2985uq0.a;
    }
}
