package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class N implements Iterator {
    public final /* synthetic */ int l = 0;
    public final Iterator m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f407o;

    public N(X x) {
        this.f407o = x;
        Collection collection = x.m;
        this.n = collection;
        this.m = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        X x = (X) this.f407o;
        x.d();
        if (x.m != ((Collection) this.n)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.l) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                Map.Entry entry = (Map.Entry) this.m.next();
                this.n = (Collection) entry.getValue();
                return ((O) this.f407o).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.m.next();
                this.n = entry2;
                return entry2.getKey();
            default:
                a();
                return this.m.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                if (!(((Collection) this.n) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.m.remove();
                ((O) this.f407o).f423o.p -= ((Collection) this.n).size();
                ((Collection) this.n).clear();
                this.n = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.n;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.m.remove();
                ((P) this.f407o).m.p -= collection.size();
                collection.clear();
                this.n = null;
                return;
            default:
                this.m.remove();
                X x = (X) this.f407o;
                x.p.p--;
                x.e();
                return;
        }
    }

    public N(X x, ListIterator listIterator) {
        this.f407o = x;
        this.n = x.m;
        this.m = listIterator;
    }

    public N(P p, Iterator it) {
        this.f407o = p;
        this.m = it;
    }

    public N(O o2) {
        this.f407o = o2;
        this.m = o2.n.entrySet().iterator();
    }
}
