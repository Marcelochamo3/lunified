package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class Mb0 implements Jb0 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(Mb0.class, Object.class, "head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(Mb0.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(Mb0.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(Mb0.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(Mb0.class, "_availablePermits");
    private volatile int _availablePermits;
    public final int a;
    public final io.sentry.android.replay.v b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public Mb0(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "The number of acquired permits should be in 0..").toString());
        }
        Ob0 ob0 = new Ob0(0L, null, 2);
        this.head = ob0;
        this.tail = ob0;
        this._availablePermits = i - i2;
        this.b = new io.sentry.android.replay.v(18, this);
    }

    public final Object a(InterfaceC0473Hh interfaceC0473Hh) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (andDecrement > 0) {
            return c2985uq0;
        }
        C1692hb c1692hbT = Jp0.t(Ou0.p(interfaceC0473Hh));
        try {
            if (!b(c1692hbT)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            c1692hbT.h(c2985uq0, this.b);
                            break;
                        }
                        if (b(c1692hbT)) {
                            break;
                        }
                    }
                }
            }
            Object objX = c1692hbT.x();
            EnumC1706hi enumC1706hi = EnumC1706hi.l;
            if (objX != enumC1706hi) {
                objX = c2985uq0;
            }
            return objX == enumC1706hi ? objX : c2985uq0;
        } catch (Throwable th) {
            c1692hbT.F();
            throw th;
        }
    }

    public final boolean b(InterfaceC1927jv0 interfaceC1927jv0) {
        Object objO;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        Ob0 ob0 = (Ob0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        Kb0 kb0 = Kb0.t;
        long j = andIncrement / ((long) Nb0.f);
        loop0: while (true) {
            objO = Jp0.o(ob0, j, kb0);
            if (!UK.B(objO)) {
                AbstractC3440zb0 abstractC3440zb0X = UK.x(objO);
                while (true) {
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
        Ob0 ob1 = (Ob0) UK.x(objO);
        int i = (int) (andIncrement % ((long) Nb0.f));
        AtomicReferenceArray atomicReferenceArray = ob1.p;
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC1927jv0)) {
            if (atomicReferenceArray.get(i) != null) {
                J2 j2 = Nb0.b;
                J2 j3 = Nb0.c;
                while (!atomicReferenceArray.compareAndSet(i, j2, j3)) {
                    if (atomicReferenceArray.get(i) != j2) {
                        return false;
                    }
                }
                ((InterfaceC1594gb) interfaceC1927jv0).h(C2985uq0.a, this.b);
                return true;
            }
        }
        interfaceC1927jv0.b(ob1, i);
        return true;
    }

    public final void c() {
        int i;
        Object objO;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            Ob0 ob0 = (Ob0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) Nb0.f);
            Lb0 lb0 = Lb0.t;
            while (true) {
                objO = Jp0.o(ob0, j, lb0);
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
            Ob0 ob1 = (Ob0) UK.x(objO);
            ob1.a();
            z = false;
            if (ob1.n <= j) {
                int i3 = (int) (andIncrement2 % ((long) Nb0.f));
                J2 j2 = Nb0.b;
                AtomicReferenceArray atomicReferenceArray = ob1.p;
                Object andSet = atomicReferenceArray.getAndSet(i3, j2);
                if (andSet == null) {
                    int i4 = Nb0.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            J2 j3 = Nb0.b;
                            J2 j4 = Nb0.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, j3, j4)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == j3);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == Nb0.c) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != Nb0.e) {
                    if (!(andSet instanceof InterfaceC1594gb)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1594gb interfaceC1594gb = (InterfaceC1594gb) andSet;
                    J2 j2K = interfaceC1594gb.k(C2985uq0.a, this.b);
                    if (j2K != null) {
                        interfaceC1594gb.u(j2K);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
