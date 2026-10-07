package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Sb0 implements Iterator, InterfaceC0473Hh, InterfaceC1770iI {
    public int l;
    public Object m;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0473Hh f516o;

    public final RuntimeException b() {
        int i = this.l;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.l);
    }

    public final void c(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        this.m = obj;
        this.l = 3;
        this.f516o = interfaceC0473Hh;
        AbstractC1474fG.j(interfaceC0473Hh, "frame");
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return C1038aq.l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.l;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.n;
                AbstractC1474fG.g(it);
                if (it.hasNext()) {
                    this.l = 2;
                    return true;
                }
                this.n = null;
            }
            this.l = 5;
            InterfaceC0473Hh interfaceC0473Hh = this.f516o;
            AbstractC1474fG.g(interfaceC0473Hh);
            this.f516o = null;
            interfaceC0473Hh.j(C2985uq0.a);
        }
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        Jp0.O(obj);
        this.l = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.l;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.l = 1;
            Iterator it = this.n;
            AbstractC1474fG.g(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.l = 0;
        Object obj = this.m;
        this.m = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
