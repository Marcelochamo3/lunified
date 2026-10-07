package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1692hb extends AbstractC1716hn implements InterfaceC1594gb, InterfaceC1803ii, InterfaceC1927jv0 {
    public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(C1692hb.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(C1692hb.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(C1692hb.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0473Hh f813o;
    public final InterfaceC1022ai p;

    public C1692hb(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(i);
        this.f813o = interfaceC0473Hh;
        this.p = interfaceC0473Hh.g();
        this._decisionAndIndex = 536870911;
        this._state = C3005v1.l;
    }

    public static void D(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object H(InterfaceC1685hV interfaceC1685hV, Object obj, int i, InterfaceC0412Ey interfaceC0412Ey) {
        if ((obj instanceof C0678Pf) || !AP.k(i)) {
            return obj;
        }
        if (interfaceC0412Ey != null || (interfaceC1685hV instanceof AbstractC1301db)) {
            return new C0626Nf(obj, interfaceC1685hV instanceof AbstractC1301db ? (AbstractC1301db) interfaceC1685hV : null, interfaceC0412Ey, (CancellationException) null, 16);
        }
        return obj;
    }

    public final void A(InterfaceC0412Ey interfaceC0412Ey) {
        B(interfaceC0412Ey instanceof AbstractC1301db ? (AbstractC1301db) interfaceC0412Ey : new C1203cb(2, interfaceC0412Ey));
    }

    public final void B(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3005v1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            if (obj2 instanceof AbstractC1301db ? true : obj2 instanceof AbstractC3440zb0) {
                D(obj, obj2);
                throw null;
            }
            if (obj2 instanceof C0678Pf) {
                C0678Pf c0678Pf = (C0678Pf) obj2;
                c0678Pf.getClass();
                if (!C0678Pf.b.compareAndSet(c0678Pf, 0, 1)) {
                    D(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof C1886jb) {
                    if (!(obj2 instanceof C0678Pf)) {
                        c0678Pf = null;
                    }
                    Throwable th = c0678Pf != null ? c0678Pf.a : null;
                    if (obj instanceof AbstractC1301db) {
                        o((AbstractC1301db) obj, th);
                        return;
                    } else {
                        AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        q((AbstractC3440zb0) obj, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj2 instanceof C0626Nf)) {
                if (obj instanceof AbstractC3440zb0) {
                    return;
                }
                AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0626Nf c0626Nf = new C0626Nf(obj2, (AbstractC1301db) obj, (InterfaceC0412Ey) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0626Nf)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0626Nf c0626Nf2 = (C0626Nf) obj2;
            if (c0626Nf2.b != null) {
                D(obj, obj2);
                throw null;
            }
            if (obj instanceof AbstractC3440zb0) {
                return;
            }
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            AbstractC1301db abstractC1301db = (AbstractC1301db) obj;
            Throwable th2 = c0626Nf2.e;
            if (th2 != null) {
                o(abstractC1301db, th2);
                return;
            }
            C0626Nf c0626NfA = C0626Nf.a(c0626Nf2, abstractC1301db, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0626NfA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                }
            }
            return;
        }
    }

    public final boolean C() {
        if (this.n == 2) {
            InterfaceC0473Hh interfaceC0473Hh = this.f813o;
            AbstractC1474fG.h(interfaceC0473Hh, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C1520fn.s.get((C1520fn) interfaceC0473Hh) != null) {
                return true;
            }
        }
        return false;
    }

    public String E() {
        return "CancellableContinuation";
    }

    public final void F() {
        InterfaceC0473Hh interfaceC0473Hh = this.f813o;
        Throwable th = null;
        C1520fn c1520fn = interfaceC0473Hh instanceof C1520fn ? (C1520fn) interfaceC0473Hh : null;
        if (c1520fn != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1520fn.s;
                Object obj = atomicReferenceFieldUpdater.get(c1520fn);
                J2 j2 = Pu0.b;
                if (obj != j2) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1520fn, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1520fn) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c1520fn, j2, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c1520fn) == j2);
            }
            if (th == null) {
                return;
            }
            t();
            r(th);
        }
    }

    public final void G(Object obj, int i, InterfaceC0412Ey interfaceC0412Ey) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC1685hV)) {
                if (obj2 instanceof C1886jb) {
                    C1886jb c1886jb = (C1886jb) obj2;
                    c1886jb.getClass();
                    if (C1886jb.c.compareAndSet(c1886jb, 0, 1)) {
                        if (interfaceC0412Ey != null) {
                            p(interfaceC0412Ey, c1886jb.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objH = H((InterfaceC1685hV) obj2, obj, i, interfaceC0412Ey);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objH)) {
                    if (!C()) {
                        t();
                    }
                    v(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final J2 I(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof InterfaceC1685hV;
            J2 j2 = AP.a;
            if (!z) {
                boolean z2 = obj2 instanceof C0626Nf;
                return null;
            }
            Object objH = H((InterfaceC1685hV) obj2, obj, this.n, interfaceC0412Ey);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objH)) {
                    if (!C()) {
                        t();
                    }
                    return j2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // o.InterfaceC1594gb
    public final boolean a() {
        return r.get(this) instanceof InterfaceC1685hV;
    }

    @Override // o.InterfaceC1927jv0
    public final void b(AbstractC3440zb0 abstractC3440zb0, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = q;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        B(abstractC3440zb0);
    }

    @Override // o.AbstractC1716hn
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1685hV) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C0678Pf) {
                return;
            }
            if (!(obj2 instanceof C0626Nf)) {
                C0626Nf c0626Nf = new C0626Nf(obj2, (AbstractC1301db) null, (InterfaceC0412Ey) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0626Nf)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0626Nf c0626Nf2 = (C0626Nf) obj2;
            if (!(!(c0626Nf2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C0626Nf c0626NfA = C0626Nf.a(c0626Nf2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0626NfA)) {
                    AbstractC1301db abstractC1301db = c0626Nf2.b;
                    if (abstractC1301db != null) {
                        o(abstractC1301db, cancellationException);
                    }
                    InterfaceC0412Ey interfaceC0412Ey = c0626Nf2.c;
                    if (interfaceC0412Ey != null) {
                        p(interfaceC0412Ey, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // o.InterfaceC1803ii
    public final InterfaceC1803ii d() {
        InterfaceC0473Hh interfaceC0473Hh = this.f813o;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.AbstractC1716hn
    public final InterfaceC0473Hh e() {
        return this.f813o;
    }

    @Override // o.AbstractC1716hn
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return this.p;
    }

    @Override // o.InterfaceC1594gb
    public final void h(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        G(obj, this.n, interfaceC0412Ey);
    }

    @Override // o.AbstractC1716hn
    public final Object i(Object obj) {
        return obj instanceof C0626Nf ? ((C0626Nf) obj).a : obj;
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        Throwable thA = C2536q80.a(obj);
        if (thA != null) {
            obj = new C0678Pf(thA, false);
        }
        G(obj, this.n, null);
    }

    @Override // o.InterfaceC1594gb
    public final J2 k(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        return I(obj, interfaceC0412Ey);
    }

    @Override // o.InterfaceC1594gb
    public final void m(AbstractC1217ci abstractC1217ci) {
        C2985uq0 c2985uq0 = C2985uq0.a;
        InterfaceC0473Hh interfaceC0473Hh = this.f813o;
        C1520fn c1520fn = interfaceC0473Hh instanceof C1520fn ? (C1520fn) interfaceC0473Hh : null;
        G(c2985uq0, (c1520fn != null ? c1520fn.f783o : null) == abstractC1217ci ? 4 : this.n, null);
    }

    @Override // o.AbstractC1716hn
    public final Object n() {
        return r.get(this);
    }

    public final void o(AbstractC1301db abstractC1301db, Throwable th) {
        try {
            abstractC1301db.a(th);
        } catch (Throwable th2) {
            Pu0.m(this.p, new C0730Rf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void p(InterfaceC0412Ey interfaceC0412Ey, Throwable th) {
        try {
            interfaceC0412Ey.b(th);
        } catch (Throwable th2) {
            Pu0.m(this.p, new C0730Rf("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q(AbstractC3440zb0 abstractC3440zb0, Throwable th) {
        InterfaceC1022ai interfaceC1022ai = this.p;
        int i = q.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            abstractC3440zb0.g(i, interfaceC1022ai);
        } catch (Throwable th2) {
            Pu0.m(interfaceC1022ai, new C0730Rf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void r(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1685hV)) {
                return;
            }
            C1886jb c1886jb = new C1886jb(this, th, (obj instanceof AbstractC1301db) || (obj instanceof AbstractC3440zb0));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1886jb)) {
                    InterfaceC1685hV interfaceC1685hV = (InterfaceC1685hV) obj;
                    if (interfaceC1685hV instanceof AbstractC1301db) {
                        o((AbstractC1301db) obj, th);
                    } else if (interfaceC1685hV instanceof AbstractC3440zb0) {
                        q((AbstractC3440zb0) obj, th);
                    }
                    if (!C()) {
                        t();
                    }
                    v(this.n);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // o.InterfaceC1594gb
    public final J2 s(Throwable th) {
        return I(new C0678Pf(th, false), null);
    }

    public final void t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        InterfaceC2300nn interfaceC2300nn = (InterfaceC2300nn) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2300nn == null) {
            return;
        }
        interfaceC2300nn.d();
        atomicReferenceFieldUpdater.set(this, C1489fV.l);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(E());
        sb.append('(');
        sb.append(AbstractC0397Ej.L(this.f813o));
        sb.append("){");
        Object obj = r.get(this);
        if (obj instanceof InterfaceC1685hV) {
            str = "Active";
        } else {
            str = obj instanceof C1886jb ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0397Ej.r(this));
        return sb.toString();
    }

    @Override // o.InterfaceC1594gb
    public final void u(Object obj) {
        v(this.n);
    }

    public final void v(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = q;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = i == 4;
                InterfaceC0473Hh interfaceC0473Hh = this.f813o;
                if (z || !(interfaceC0473Hh instanceof C1520fn) || AP.k(i) != AP.k(this.n)) {
                    AP.w(this, interfaceC0473Hh, z);
                    return;
                }
                AbstractC1217ci abstractC1217ci = ((C1520fn) interfaceC0473Hh).f783o;
                InterfaceC1022ai interfaceC1022aiG = ((C1520fn) interfaceC0473Hh).p.g();
                if (abstractC1217ci.Y()) {
                    abstractC1217ci.W(interfaceC1022aiG, this);
                    return;
                }
                AbstractC1918jr abstractC1918jrA = AbstractC1415ej0.a();
                if (abstractC1918jrA.d0()) {
                    abstractC1918jrA.a0(this);
                    return;
                }
                abstractC1918jrA.c0(true);
                try {
                    AP.w(this, interfaceC0473Hh, true);
                    do {
                    } while (abstractC1918jrA.f0());
                } catch (Throwable th) {
                    try {
                        l(th, null);
                    } finally {
                        abstractC1918jrA.Z(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable w(JH jh) {
        return jh.H();
    }

    public final Object x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zC = C();
        do {
            atomicIntegerFieldUpdater = q;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zC) {
                    F();
                }
                Object obj = r.get(this);
                if (obj instanceof C0678Pf) {
                    throw ((C0678Pf) obj).a;
                }
                if (AP.k(this.n)) {
                    AH ah = (AH) this.p.q(C2691rp.v);
                    if (ah != null && !ah.a()) {
                        CancellationException cancellationExceptionH = ((JH) ah).H();
                        c(obj, cancellationExceptionH);
                        throw cancellationExceptionH;
                    }
                }
                return i(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC2300nn) s.get(this)) == null) {
            z();
        }
        if (zC) {
            F();
        }
        return EnumC1706hi.l;
    }

    public final void y() {
        InterfaceC2300nn interfaceC2300nnZ = z();
        if (interfaceC2300nnZ != null && (!(r.get(this) instanceof InterfaceC1685hV))) {
            interfaceC2300nnZ.d();
            s.set(this, C1489fV.l);
        }
    }

    public final InterfaceC2300nn z() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AH ah = (AH) this.p.q(C2691rp.v);
        if (ah == null) {
            return null;
        }
        InterfaceC2300nn interfaceC2300nnR = AbstractC3021v9.r(ah, true, new C1794id(this), 2);
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC2300nnR)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC2300nnR;
    }
}
