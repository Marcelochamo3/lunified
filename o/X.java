package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class X extends AbstractCollection implements List {
    public final Object l;
    public Collection m;
    public final X n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Collection f610o;
    public final /* synthetic */ Y p;
    public final /* synthetic */ Y q;

    public X(Y y, Object obj, List list, X x) {
        this.q = y;
        this.p = y;
        this.l = obj;
        this.m = list;
        this.n = x;
        this.f610o = x == null ? null : x.m;
    }

    public final void a() {
        X x = this.n;
        if (x != null) {
            x.a();
        } else {
            this.p.f629o.put(this.l, this.m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        boolean zIsEmpty = this.m.isEmpty();
        boolean zAdd = this.m.add(obj);
        if (zAdd) {
            this.p.p++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.m.addAll(collection);
        if (zAddAll) {
            this.p.p += this.m.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.m.clear();
        this.p.p -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        d();
        return this.m.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        d();
        return this.m.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        X x = this.n;
        if (x != null) {
            x.d();
            if (x.m != this.f610o) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.m.isEmpty() || (collection = (Collection) this.p.f629o.get(this.l)) == null) {
                return;
            }
            this.m = collection;
        }
    }

    public final void e() {
        X x = this.n;
        if (x != null) {
            x.e();
        } else if (this.m.isEmpty()) {
            this.p.f629o.remove(this.l);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.m.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        d();
        return ((List) this.m).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        return this.m.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        return ((List) this.m).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d();
        return new N(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.m).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        d();
        return new W(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        boolean zRemove = this.m.remove(obj);
        if (zRemove) {
            this.p.p--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.m.removeAll(collection);
        if (zRemoveAll) {
            this.p.p += this.m.size() - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.m.retainAll(collection);
        if (zRetainAll) {
            this.p.p += this.m.size() - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        d();
        return ((List) this.m).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        d();
        return this.m.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        d();
        List listSubList = ((List) this.m).subList(i, i2);
        X x = this.n;
        if (x == null) {
            x = this;
        }
        Y y = this.q;
        y.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.l;
        return z ? new T(y, obj, listSubList, x) : new X(y, obj, listSubList, x);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return this.m.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        d();
        return new W(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = ((List) this.m).remove(i);
        this.q.p--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        d();
        boolean zIsEmpty = this.m.isEmpty();
        ((List) this.m).add(i, obj);
        this.q.p++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.m).addAll(i, collection);
        if (zAddAll) {
            this.q.p += this.m.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
