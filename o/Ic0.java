package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Ic0 extends AbstractCollection implements Set {
    public final Collection l;
    public final I20 m;

    public Ic0(Set set, I20 i20) {
        this.l = set;
        this.m = i20;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.m.apply(obj)) {
            return this.l.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.m.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.l.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Collection collection = this.l;
        boolean z = collection instanceof RandomAccess;
        I20 i20 = this.m;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            i20.getClass();
            while (it.hasNext()) {
                if (i20.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        i20.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!i20.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        UK.T(list, i20, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        UK.T(list, i20, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.l;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.m.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC2506pt.n(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2506pt.v(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.l.iterator();
        I20 i20 = this.m;
        if (i20 == null) {
            throw new NullPointerException("predicate");
        }
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (i20.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.l.iterator();
        it.getClass();
        I20 i20 = this.m;
        i20.getClass();
        return new WG(it, i20);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.l.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.l.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.m.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.l.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.m.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.m.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        WG wg = (WG) iterator();
        ArrayList arrayList = new ArrayList();
        while (wg.hasNext()) {
            arrayList.add(wg.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        WG wg = (WG) iterator();
        ArrayList arrayList = new ArrayList();
        while (wg.hasNext()) {
            arrayList.add(wg.next());
        }
        return arrayList.toArray(objArr);
    }
}
