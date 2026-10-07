package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1626gr implements Runnable, Comparable, InterfaceC2300nn {
    private volatile Object _heap;
    public long l;
    public int m = -1;

    public AbstractRunnableC1626gr(long j) {
        this.l = j;
    }

    public final C1513fj0 a() {
        Object obj = this._heap;
        if (obj instanceof C1513fj0) {
            return (C1513fj0) obj;
        }
        return null;
    }

    public final int b(long j, C1724hr c1724hr, AbstractC1821ir abstractC1821ir) {
        synchronized (this) {
            if (this._heap == U9.c) {
                return 2;
            }
            synchronized (c1724hr) {
                try {
                    AbstractRunnableC1626gr[] abstractRunnableC1626grArr = c1724hr.a;
                    AbstractRunnableC1626gr abstractRunnableC1626gr = abstractRunnableC1626grArr != null ? abstractRunnableC1626grArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1821ir.r;
                    abstractC1821ir.getClass();
                    if (AbstractC1821ir.t.get(abstractC1821ir) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC1626gr == null) {
                        c1724hr.c = j;
                    } else {
                        long j2 = abstractRunnableC1626gr.l;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c1724hr.c > 0) {
                            c1724hr.c = j;
                        }
                    }
                    long j3 = this.l;
                    long j4 = c1724hr.c;
                    if (j3 - j4 < 0) {
                        this.l = j4;
                    }
                    c1724hr.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(C1724hr c1724hr) {
        if (this._heap == U9.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = c1724hr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.l - ((AbstractRunnableC1626gr) obj).l;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // o.InterfaceC2300nn
    public final void d() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                J2 j2 = U9.c;
                if (obj == j2) {
                    return;
                }
                C1724hr c1724hr = obj instanceof C1724hr ? (C1724hr) obj : null;
                if (c1724hr != null) {
                    c1724hr.c(this);
                }
                this._heap = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.l + ']';
    }
}
