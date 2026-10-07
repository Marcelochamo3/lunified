package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class JH implements AH, InterfaceC2086ld, InterfaceC2465pX {
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(JH.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(JH.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public JH(boolean z) {
        this._state = z ? AbstractC1376eG.h : AbstractC1376eG.g;
    }

    public static C1988kd a0(C2937uL c2937uL) {
        while (c2937uL.o()) {
            C2937uL c2937uLJ = c2937uL.j();
            if (c2937uLJ == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2937uL.m;
                Object obj = atomicReferenceFieldUpdater.get(c2937uL);
                while (true) {
                    c2937uL = (C2937uL) obj;
                    if (!c2937uL.o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2937uL);
                }
            } else {
                c2937uL = c2937uLJ;
            }
        }
        while (true) {
            c2937uL = c2937uL.m();
            if (!c2937uL.o()) {
                if (c2937uL instanceof C1988kd) {
                    return (C1988kd) c2937uL;
                }
                if (c2937uL instanceof C1294dV) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof HH)) {
            if (obj instanceof InterfaceC3028vF) {
                return ((InterfaceC3028vF) obj).a() ? "Active" : "New";
            }
            return obj instanceof C0678Pf ? "Cancelled" : "Completed";
        }
        HH hh = (HH) obj;
        if (hh.d()) {
            return "Cancelling";
        }
        return hh.e() ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean B(Throwable th) {
        if (V()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC1890jd interfaceC1890jd = (InterfaceC1890jd) m.get(this);
        if (interfaceC1890jd == null || interfaceC1890jd == C1489fV.l) {
            return z;
        }
        return interfaceC1890jd.g(th) || z;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && L();
    }

    public final void E(InterfaceC3028vF interfaceC3028vF, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        InterfaceC1890jd interfaceC1890jd = (InterfaceC1890jd) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1890jd != null) {
            interfaceC1890jd.d();
            atomicReferenceFieldUpdater.set(this, C1489fV.l);
        }
        C0730Rf c0730Rf = null;
        C0678Pf c0678Pf = obj instanceof C0678Pf ? (C0678Pf) obj : null;
        Throwable th = c0678Pf != null ? c0678Pf.a : null;
        if (interfaceC3028vF instanceof EH) {
            try {
                ((EH) interfaceC3028vF).q(th);
                return;
            } catch (Throwable th2) {
                R(new C0730Rf("Exception in completion handler " + interfaceC3028vF + " for " + this, th2));
                return;
            }
        }
        C1294dV c1294dVH = interfaceC3028vF.h();
        if (c1294dVH != null) {
            Object objL = c1294dVH.l();
            AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C2937uL c2937uLM = (C2937uL) objL; !AbstractC1474fG.b(c2937uLM, c1294dVH); c2937uLM = c2937uLM.m()) {
                if (c2937uLM instanceof EH) {
                    EH eh = (EH) c2937uLM;
                    try {
                        eh.q(th);
                    } catch (Throwable th3) {
                        if (c0730Rf != null) {
                            AbstractC3409z9.a(c0730Rf, th3);
                        } else {
                            c0730Rf = new C0730Rf("Exception in completion handler " + eh + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0730Rf != null) {
                R(c0730Rf);
            }
        }
    }

    public final Throwable F(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        JH jh = (JH) ((InterfaceC2465pX) obj);
        Object objO = jh.O();
        if (objO instanceof HH) {
            thC = ((HH) objO).c();
        } else if (objO instanceof C0678Pf) {
            thC = ((C0678Pf) objO).a;
        } else {
            if (objO instanceof InterfaceC3028vF) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO).toString());
            }
            thC = null;
        }
        CancellationException bh = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (bh == null) {
            bh = new BH("Parent job is ".concat(g0(objO)), thC, jh);
        }
        return bh;
    }

    public final Object G(HH hh, Object obj) {
        Throwable thJ;
        C0678Pf c0678Pf = obj instanceof C0678Pf ? (C0678Pf) obj : null;
        Throwable th = c0678Pf != null ? c0678Pf.a : null;
        synchronized (hh) {
            hh.d();
            ArrayList<Throwable> arrayListF = hh.f(th);
            thJ = J(hh, arrayListF);
            if (thJ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thJ && th2 != thJ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC3409z9.a(thJ, th2);
                    }
                }
            }
        }
        if (thJ != null && thJ != th) {
            obj = new C0678Pf(thJ, false);
        }
        if (thJ != null && (B(thJ) || P(thJ))) {
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0678Pf.b.compareAndSet((C0678Pf) obj, 0, 1);
        }
        c0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        Object c3125wF = obj instanceof InterfaceC3028vF ? new C3125wF((InterfaceC3028vF) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, hh, c3125wF) && atomicReferenceFieldUpdater.get(this) == hh) {
        }
        E(hh, obj);
        return obj;
    }

    public final CancellationException H() {
        CancellationException cancellationException;
        Object objO = O();
        if (!(objO instanceof HH)) {
            if (objO instanceof InterfaceC3028vF) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objO instanceof C0678Pf)) {
                return new BH(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0678Pf) objO).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new BH(C(), th, this) : cancellationException;
        }
        Throwable thC = ((HH) objO).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = C();
        }
        return new BH(strConcat, thC, this);
    }

    public final Object I() throws Throwable {
        Object objO = O();
        if (!(!(objO instanceof InterfaceC3028vF))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objO instanceof C0678Pf) {
            throw ((C0678Pf) objO).a;
        }
        return AbstractC1376eG.I(objO);
    }

    public final Throwable J(HH hh, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (hh.d()) {
                return new BH(C(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof Ij0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof Ij0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return this instanceof C0497If;
    }

    public final C1294dV N(InterfaceC3028vF interfaceC3028vF) {
        C1294dV c1294dVH = interfaceC3028vF.h();
        if (c1294dVH != null) {
            return c1294dVH;
        }
        if (interfaceC3028vF instanceof C0922Yp) {
            return new C1294dV();
        }
        if (interfaceC3028vF instanceof EH) {
            e0((EH) interfaceC3028vF);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3028vF).toString());
    }

    public final Object O() {
        while (true) {
            Object obj = l.get(this);
            if (!(obj instanceof AbstractC2851tW)) {
                return obj;
            }
            ((AbstractC2851tW) obj).a(this);
        }
    }

    public boolean P(Throwable th) {
        return false;
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai Q(InterfaceC1022ai interfaceC1022ai) {
        return Sr0.z(this, interfaceC1022ai);
    }

    public final void S(AH ah) {
        int iF0;
        C1489fV c1489fV = C1489fV.l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        if (ah == null) {
            atomicReferenceFieldUpdater.set(this, c1489fV);
            return;
        }
        JH jh = (JH) ah;
        do {
            iF0 = jh.f0(jh.O());
            if (iF0 == 0) {
                break;
            }
        } while (iF0 != 1);
        InterfaceC1890jd interfaceC1890jd = (InterfaceC1890jd) AbstractC3021v9.r(jh, true, new C1988kd(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC1890jd);
        if (U()) {
            interfaceC1890jd.d();
            atomicReferenceFieldUpdater.set(this, c1489fV);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c7 A[SYNTHETIC] */
    public final InterfaceC2300nn T(boolean z, boolean z2, InterfaceC0412Ey interfaceC0412Ey) {
        EH c2397on;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z) {
            c2397on = interfaceC0412Ey instanceof CH ? (CH) interfaceC0412Ey : null;
            if (c2397on == null) {
                c2397on = new C2545qG(interfaceC0412Ey);
            }
        } else {
            c2397on = interfaceC0412Ey instanceof EH ? (EH) interfaceC0412Ey : null;
            if (c2397on == null) {
                c2397on = new C2397on(1, interfaceC0412Ey);
            }
        }
        c2397on.f235o = this;
        while (true) {
            Object objO = O();
            if (objO instanceof C0922Yp) {
                C0922Yp c0922Yp = (C0922Yp) objO;
                if (c0922Yp.l) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objO, c2397on)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objO) {
                        }
                    }
                    return c2397on;
                }
                C1294dV c1294dV = new C1294dV();
                Object c2931uF = c0922Yp.l ? c1294dV : new C2931uF(c1294dV);
                do {
                    atomicReferenceFieldUpdater = l;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0922Yp, c2931uF)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c0922Yp);
            } else {
                if (!(objO instanceof InterfaceC3028vF)) {
                    if (z2) {
                        C0678Pf c0678Pf = objO instanceof C0678Pf ? (C0678Pf) objO : null;
                        interfaceC0412Ey.b(c0678Pf != null ? c0678Pf.a : null);
                    }
                    return C1489fV.l;
                }
                C1294dV c1294dVH = ((InterfaceC3028vF) objO).h();
                if (c1294dVH == null) {
                    AbstractC1474fG.h(objO, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    e0((EH) objO);
                } else {
                    InterfaceC2300nn interfaceC2300nn = C1489fV.l;
                    if (z && (objO instanceof HH)) {
                        synchronized (objO) {
                            try {
                                thC = ((HH) objO).c();
                                if (thC == null || ((interfaceC0412Ey instanceof C1988kd) && !((HH) objO).e())) {
                                    if (v((InterfaceC3028vF) objO, c1294dVH, c2397on)) {
                                        if (thC == null) {
                                            return c2397on;
                                        }
                                        interfaceC2300nn = c2397on;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z2) {
                                interfaceC0412Ey.b(thC);
                            }
                            return interfaceC2300nn;
                        }
                        if (v((InterfaceC3028vF) objO, c1294dVH, c2397on)) {
                            return c2397on;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z2) {
                                interfaceC0412Ey.b(thC);
                            }
                            return interfaceC2300nn;
                        }
                        if (v((InterfaceC3028vF) objO, c1294dVH, c2397on)) {
                            return c2397on;
                        }
                    }
                }
            }
        }
    }

    public final boolean U() {
        return !(O() instanceof InterfaceC3028vF);
    }

    public boolean V() {
        return this instanceof Y8;
    }

    public final Object W(InterfaceC0473Hh interfaceC0473Hh) {
        Object objO;
        C2985uq0 c2985uq0;
        do {
            objO = O();
            boolean z = objO instanceof InterfaceC3028vF;
            c2985uq0 = C2985uq0.a;
            if (!z) {
                AbstractC3409z9.l(interfaceC0473Hh.g());
                return c2985uq0;
            }
        } while (f0(objO) < 0);
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        c1692hb.A(new C1203cb(1, T(false, true, new C2397on(3, c1692hb))));
        Object objX = c1692hb.x();
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (objX != enumC1706hi) {
            objX = c2985uq0;
        }
        return objX == enumC1706hi ? objX : c2985uq0;
    }

    public final boolean X(Object obj) {
        Object objH0;
        do {
            objH0 = h0(O(), obj);
            if (objH0 == AbstractC1376eG.b) {
                return false;
            }
            if (objH0 == AbstractC1376eG.c) {
                return true;
            }
        } while (objH0 == AbstractC1376eG.d);
        w(objH0);
        return true;
    }

    public final Object Y(Object obj) {
        Object objH0;
        do {
            objH0 = h0(O(), obj);
            if (objH0 == AbstractC1376eG.b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0678Pf c0678Pf = obj instanceof C0678Pf ? (C0678Pf) obj : null;
                throw new IllegalStateException(str, c0678Pf != null ? c0678Pf.a : null);
            }
        } while (objH0 == AbstractC1376eG.d);
        return objH0;
    }

    public String Z() {
        return getClass().getSimpleName();
    }

    @Override // o.AH
    public boolean a() {
        Object objO = O();
        return (objO instanceof InterfaceC3028vF) && ((InterfaceC3028vF) objO).a();
    }

    public final void b0(C1294dV c1294dV, Throwable th) {
        Object objL = c1294dV.l();
        AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0730Rf c0730Rf = null;
        for (C2937uL c2937uLM = (C2937uL) objL; !AbstractC1474fG.b(c2937uLM, c1294dV); c2937uLM = c2937uLM.m()) {
            if (c2937uLM instanceof CH) {
                EH eh = (EH) c2937uLM;
                try {
                    eh.q(th);
                } catch (Throwable th2) {
                    if (c0730Rf != null) {
                        AbstractC3409z9.a(c0730Rf, th2);
                    } else {
                        c0730Rf = new C0730Rf("Exception in completion handler " + eh + " for " + this, th2);
                    }
                }
            }
        }
        if (c0730Rf != null) {
            R(c0730Rf);
        }
        B(th);
    }

    public final void e0(EH eh) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1294dV c1294dV = new C1294dV();
        eh.getClass();
        C2937uL.m.lazySet(c1294dV, eh);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2937uL.l;
        atomicReferenceFieldUpdater2.lazySet(c1294dV, eh);
        loop0: while (eh.l() == eh) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(eh, eh, c1294dV)) {
                    c1294dV.k(eh);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(eh) == eh);
        }
        C2937uL c2937uLM = eh.m();
        do {
            atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, eh, c2937uLM)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == eh);
    }

    @Override // o.AH
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new BH(C(), null, this);
        }
        A(cancellationException);
    }

    public final int f0(Object obj) {
        boolean z = obj instanceof C0922Yp;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        if (z) {
            if (((C0922Yp) obj).l) {
                return 0;
            }
            C0922Yp c0922Yp = AbstractC1376eG.h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0922Yp)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            d0();
            return 1;
        }
        if (!(obj instanceof C2931uF)) {
            return 0;
        }
        C1294dV c1294dV = ((C2931uF) obj).l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1294dV)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        d0();
        return 1;
    }

    @Override // o.InterfaceC0914Yh
    public final InterfaceC0940Zh getKey() {
        return C2691rp.v;
    }

    public final Object h0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC3028vF)) {
            return AbstractC1376eG.b;
        }
        if (((obj instanceof C0922Yp) || (obj instanceof EH)) && !(obj instanceof C1988kd) && !(obj2 instanceof C0678Pf)) {
            InterfaceC3028vF interfaceC3028vF = (InterfaceC3028vF) obj;
            Object c3125wF = obj2 instanceof InterfaceC3028vF ? new C3125wF((InterfaceC3028vF) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = l;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3028vF, c3125wF)) {
                    c0(obj2);
                    E(interfaceC3028vF, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC3028vF);
            return AbstractC1376eG.d;
        }
        InterfaceC3028vF interfaceC3028vF2 = (InterfaceC3028vF) obj;
        C1294dV c1294dVN = N(interfaceC3028vF2);
        if (c1294dVN == null) {
            return AbstractC1376eG.d;
        }
        C1988kd c1988kdA0 = null;
        HH hh = interfaceC3028vF2 instanceof HH ? (HH) interfaceC3028vF2 : null;
        if (hh == null) {
            hh = new HH(c1294dVN, null);
        }
        synchronized (hh) {
            if (hh.e()) {
                return AbstractC1376eG.b;
            }
            HH.m.set(hh, 1);
            if (hh != interfaceC3028vF2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC3028vF2, hh)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC3028vF2) {
                        return AbstractC1376eG.d;
                    }
                }
            }
            boolean zD = hh.d();
            C0678Pf c0678Pf = obj2 instanceof C0678Pf ? (C0678Pf) obj2 : null;
            if (c0678Pf != null) {
                hh.b(c0678Pf.a);
            }
            Throwable thC = hh.c();
            if (!(!zD)) {
                thC = null;
            }
            if (thC != null) {
                b0(c1294dVN, thC);
            }
            C1988kd c1988kd = interfaceC3028vF2 instanceof C1988kd ? (C1988kd) interfaceC3028vF2 : null;
            if (c1988kd == null) {
                C1294dV c1294dVH = interfaceC3028vF2.h();
                if (c1294dVH != null) {
                    c1988kdA0 = a0(c1294dVH);
                }
            } else {
                c1988kdA0 = c1988kd;
            }
            if (c1988kdA0 != null) {
                while (AbstractC3021v9.r(c1988kdA0.p, false, new GH(this, hh, c1988kdA0, obj2), 1) == C1489fV.l) {
                    c1988kdA0 = a0(c1988kdA0);
                    if (c1988kdA0 == null) {
                    }
                }
                return AbstractC1376eG.c;
            }
            return G(hh, obj2);
        }
    }

    public Object i() {
        return I();
    }

    @Override // o.InterfaceC1022ai
    public final Object l(Object obj, InterfaceC0775Sy interfaceC0775Sy) {
        return interfaceC0775Sy.i(obj, this);
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai p(InterfaceC0940Zh interfaceC0940Zh) {
        return Sr0.t(this, interfaceC0940Zh);
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC0914Yh q(InterfaceC0940Zh interfaceC0940Zh) {
        return Sr0.j(this, interfaceC0940Zh);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Z() + '{' + g0(O()) + '}');
        sb.append('@');
        sb.append(AbstractC0397Ej.r(this));
        return sb.toString();
    }

    public final boolean v(InterfaceC3028vF interfaceC3028vF, C1294dV c1294dV, EH eh) {
        char c;
        IH ih = new IH(eh, this, interfaceC3028vF);
        do {
            C2937uL c2937uLJ = c1294dV.j();
            if (c2937uLJ == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2937uL.m;
                Object obj = atomicReferenceFieldUpdater.get(c1294dV);
                while (true) {
                    c2937uLJ = (C2937uL) obj;
                    if (!c2937uLJ.o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2937uLJ);
                }
            }
            C2937uL.m.lazySet(eh, c2937uLJ);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2937uL.l;
            atomicReferenceFieldUpdater2.lazySet(eh, c1294dV);
            ih.c = c1294dV;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(c2937uLJ, c1294dV, ih)) {
                    if (ih.a(c2937uLJ) != null) {
                        c = 2;
                        break;
                    }
                    c = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(c2937uLJ) != c1294dV) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public void x(Object obj) {
        w(obj);
    }

    public final Object y(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Object objO;
        do {
            objO = O();
            if (!(objO instanceof InterfaceC3028vF)) {
                if (objO instanceof C0678Pf) {
                    throw ((C0678Pf) objO).a;
                }
                return AbstractC1376eG.I(objO);
            }
        } while (f0(objO) < 0);
        FH fh = new FH(Ou0.p(interfaceC0473Hh), this);
        fh.y();
        fh.A(new C1203cb(1, T(false, true, new C2397on(2, fh))));
        return fh.x();
    }

    public final boolean z(Object obj) {
        J2 j2;
        Object objH0 = AbstractC1376eG.b;
        if (M()) {
            do {
                Object objO = O();
                if (!(objO instanceof InterfaceC3028vF) || ((objO instanceof HH) && ((HH) objO).e())) {
                    objH0 = AbstractC1376eG.b;
                    break;
                }
                objH0 = h0(objO, new C0678Pf(F(obj), false));
            } while (objH0 == AbstractC1376eG.d);
            if (objH0 == AbstractC1376eG.c) {
                return true;
            }
        }
        if (objH0 == AbstractC1376eG.b) {
            Throwable thF = null;
            loop1: while (true) {
                Object objO2 = O();
                if (objO2 instanceof HH) {
                    synchronized (objO2) {
                        try {
                            HH hh = (HH) objO2;
                            hh.getClass();
                            if (HH.f298o.get(hh) == AbstractC1376eG.f) {
                                j2 = AbstractC1376eG.e;
                            } else {
                                boolean zD = ((HH) objO2).d();
                                if (thF == null) {
                                    thF = F(obj);
                                }
                                ((HH) objO2).b(thF);
                                Throwable thC = zD ^ true ? ((HH) objO2).c() : null;
                                if (thC != null) {
                                    b0(((HH) objO2).l, thC);
                                }
                                j2 = AbstractC1376eG.b;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objO2 instanceof InterfaceC3028vF) {
                    if (thF == null) {
                        thF = F(obj);
                    }
                    InterfaceC3028vF interfaceC3028vF = (InterfaceC3028vF) objO2;
                    if (interfaceC3028vF.a()) {
                        C1294dV c1294dVN = N(interfaceC3028vF);
                        if (c1294dVN == null) {
                            continue;
                        } else {
                            HH hh2 = new HH(c1294dVN, thF);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3028vF, hh2)) {
                                    b0(c1294dVN, thF);
                                    j2 = AbstractC1376eG.b;
                                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC3028vF) {
                                }
                            }
                        }
                    } else {
                        Object objH1 = h0(objO2, new C0678Pf(thF, false));
                        if (objH1 == AbstractC1376eG.b) {
                            throw new IllegalStateException(("Cannot happen in " + objO2).toString());
                        }
                        if (objH1 != AbstractC1376eG.d) {
                            objH0 = objH1;
                            break;
                        }
                    }
                } else {
                    j2 = AbstractC1376eG.e;
                }
                objH0 = j2;
                break;
            }
        }
        if (objH0 != AbstractC1376eG.b && objH0 != AbstractC1376eG.c) {
            if (objH0 == AbstractC1376eG.e) {
                return false;
            }
            w(objH0);
        }
        return true;
    }

    public void d0() {
    }

    public void R(C0730Rf c0730Rf) {
        throw c0730Rf;
    }

    public void c0(Object obj) {
    }

    public void w(Object obj) {
    }
}
