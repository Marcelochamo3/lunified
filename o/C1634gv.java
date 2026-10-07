package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1634gv implements Iterator, InterfaceC1770iI {
    public final Iterator m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f801o;
    public final /* synthetic */ Rb0 p;
    public final /* synthetic */ int l = 0;
    public int n = -1;

    public C1634gv(C1732hv c1732hv) {
        this.p = c1732hv;
        this.m = c1732hv.a.iterator();
    }

    public void a() {
        Object next;
        C1732hv c1732hv;
        do {
            Iterator it = this.m;
            if (!it.hasNext()) {
                this.n = 0;
                return;
            } else {
                next = it.next();
                c1732hv = (C1732hv) this.p;
            }
        } while (((Boolean) c1732hv.c.b(next)).booleanValue() != c1732hv.b);
        this.f801o = next;
        this.n = 1;
    }

    public void b() {
        Iterator it = this.m;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((C2591qn) this.p).c.b(next)).booleanValue()) {
                this.n = 1;
                this.f801o = next;
                return;
            }
        }
        this.n = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.l) {
            case 0:
                if (this.n == -1) {
                    a();
                }
                return this.n == 1;
            default:
                if (this.n == -1) {
                    b();
                }
                return this.n == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                if (this.n == -1) {
                    a();
                }
                if (this.n == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f801o;
                this.f801o = null;
                this.n = -1;
                return obj;
            default:
                if (this.n == -1) {
                    b();
                }
                if (this.n == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f801o;
                this.f801o = null;
                this.n = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1634gv(C2591qn c2591qn) {
        this.p = c2591qn;
        this.m = c2591qn.b.iterator();
    }
}
