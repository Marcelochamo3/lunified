package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: o.yi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3357yi0 {
    public final C3454zi0 a;
    public final String b;
    public boolean c;
    public AbstractC3066vi0 d;
    public final ArrayList e;
    public boolean f;

    public C3357yi0(C3454zi0 c3454zi0, String str) {
        AbstractC1474fG.j(c3454zi0, "taskRunner");
        AbstractC1474fG.j(str, "name");
        this.a = c3454zi0;
        this.b = str;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Mr0.a;
        synchronized (this.a) {
            if (b()) {
                this.a.e(this);
            }
        }
    }

    public final boolean b() {
        AbstractC3066vi0 abstractC3066vi0 = this.d;
        if (abstractC3066vi0 != null && abstractC3066vi0.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC3066vi0) arrayList.get(size)).b) {
                AbstractC3066vi0 abstractC3066vi1 = (AbstractC3066vi0) arrayList.get(size);
                C3325yL c3325yL = C3454zi0.h;
                if (C3454zi0.j.isLoggable(Level.FINE)) {
                    AbstractC1376eG.b(abstractC3066vi1, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(AbstractC3066vi0 abstractC3066vi0, long j) {
        AbstractC1474fG.j(abstractC3066vi0, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (e(abstractC3066vi0, j, false)) {
                    this.a.e(this);
                }
            } else if (abstractC3066vi0.b) {
                C3454zi0.h.getClass();
                if (C3454zi0.j.isLoggable(Level.FINE)) {
                    AbstractC1376eG.b(abstractC3066vi0, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                C3454zi0.h.getClass();
                if (C3454zi0.j.isLoggable(Level.FINE)) {
                    AbstractC1376eG.b(abstractC3066vi0, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(AbstractC3066vi0 abstractC3066vi0, long j, boolean z) {
        AbstractC1474fG.j(abstractC3066vi0, "task");
        C3357yi0 c3357yi0 = abstractC3066vi0.c;
        if (c3357yi0 != this) {
            if (c3357yi0 != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            abstractC3066vi0.c = this;
        }
        this.a.a.getClass();
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(abstractC3066vi0);
        if (iIndexOf != -1) {
            if (abstractC3066vi0.d <= j2) {
                C3325yL c3325yL = C3454zi0.h;
                if (C3454zi0.j.isLoggable(Level.FINE)) {
                    AbstractC1376eG.b(abstractC3066vi0, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        abstractC3066vi0.d = j2;
        C3325yL c3325yL2 = C3454zi0.h;
        if (C3454zi0.j.isLoggable(Level.FINE)) {
            AbstractC1376eG.b(abstractC3066vi0, this, z ? "run again after ".concat(AbstractC1376eG.r(j2 - jNanoTime)) : "scheduled after ".concat(AbstractC1376eG.r(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC3066vi0) it.next()).d - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, abstractC3066vi0);
        return size == 0;
    }

    public final void f() {
        byte[] bArr = Mr0.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.e(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
