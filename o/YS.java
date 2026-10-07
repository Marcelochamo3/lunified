package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class YS extends Mb0 implements VS {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(YS.class, Object.class, "owner");
    private volatile Object owner;

    public YS(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : AbstractC1923jt0.b;
    }

    public final Object d(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        char c;
        while (true) {
            atomicIntegerFieldUpdater = Mb0.g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            i = this.a;
            if (i3 > i) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i));
            } else {
                atomicReferenceFieldUpdater = h;
                c = 0;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (Math.max(atomicIntegerFieldUpdater.get(this), 0) == 0) {
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != AbstractC1923jt0.b) {
                                if (obj2 != obj) {
                                    c = 2;
                                    break;
                                }
                                c = 1;
                                break;
                            }
                        }
                        if (c == 1) {
                            c = 2;
                            break;
                        }
                        if (c != 2) {
                        }
                    }
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    break;
                }
            }
        }
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (c == 0) {
            return c2985uq0;
        }
        if (c != 1) {
            if (c != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        C1692hb c1692hbT = Jp0.t(Ou0.p(interfaceC0473Hh));
        try {
            XS xs = new XS(this, c1692hbT, obj);
            while (true) {
                int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                if (andDecrement <= i) {
                    if (andDecrement > 0) {
                        Object obj3 = xs.m;
                        YS ys = xs.n;
                        atomicReferenceFieldUpdater.set(ys, obj3);
                        xs.l.h(c2985uq0, new WS(ys, xs, 0));
                        break;
                    }
                    if (b(xs)) {
                        break;
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

    public final void e(Object obj) {
        while (Math.max(Mb0.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            J2 j2 = AbstractC1923jt0.b;
            if (obj2 != j2) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, j2)) {
                        c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0397Ej.r(this));
        sb.append("[isLocked=");
        sb.append(Math.max(Mb0.g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
