package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3382yv implements Iterator, InterfaceC1770iI {
    public final Iterator l;
    public Iterator m;
    public final /* synthetic */ C3479zv n;

    public C3382yv(C3479zv c3479zv) {
        this.n = c3479zv;
        this.l = c3479zv.a.iterator();
    }

    public final boolean a() {
        Iterator it = this.m;
        if (it != null && !it.hasNext()) {
            this.m = null;
        }
        while (this.m == null) {
            Iterator it2 = this.l;
            if (!it2.hasNext()) {
                return false;
            }
            Object next = it2.next();
            C3479zv c3479zv = this.n;
            Iterator it3 = (Iterator) c3479zv.c.b(c3479zv.b.b(next));
            if (it3.hasNext()) {
                this.m = it3;
                break;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.m;
        AbstractC1474fG.g(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
