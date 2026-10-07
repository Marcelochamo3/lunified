package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2189mg {
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(AbstractC2189mg.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(AbstractC2189mg.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC2189mg(AbstractC2189mg abstractC2189mg) {
        this._prev = abstractC2189mg;
    }

    public final void a() {
        m.lazySet(this, null);
    }

    public final AbstractC2189mg b() {
        Object obj = l.get(this);
        if (obj == Jp0.a) {
            return null;
        }
        return (AbstractC2189mg) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC2189mg abstractC2189mgB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            AbstractC2189mg abstractC2189mg = (AbstractC2189mg) atomicReferenceFieldUpdater.get(this);
            while (abstractC2189mg != null && abstractC2189mg.c()) {
                abstractC2189mg = (AbstractC2189mg) atomicReferenceFieldUpdater.get(abstractC2189mg);
            }
            AbstractC2189mg abstractC2189mgB2 = b();
            AbstractC1474fG.g(abstractC2189mgB2);
            while (abstractC2189mgB2.c() && (abstractC2189mgB = abstractC2189mgB2.b()) != null) {
                abstractC2189mgB2 = abstractC2189mgB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC2189mgB2);
                AbstractC2189mg abstractC2189mg2 = ((AbstractC2189mg) obj) == null ? null : abstractC2189mg;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC2189mgB2, obj, abstractC2189mg2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC2189mgB2) != obj) {
                    }
                }
            }
            if (abstractC2189mg != null) {
                l.set(abstractC2189mg, abstractC2189mgB2);
            }
            if (!abstractC2189mgB2.c() || abstractC2189mgB2.b() == null) {
                if (abstractC2189mg == null || !abstractC2189mg.c()) {
                    return;
                }
            }
        }
    }
}
