package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Vp0 implements Collection, InterfaceC1770iI {
    public final /* synthetic */ int l = 1;

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC1474fG.b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC1459f50.O(this);
    }

    public String toString() {
        switch (this.l) {
            case 1:
                return AbstractC0911Ye.h0(this, ", ", "[", "]", new io.sentry.android.replay.v(2, this), 24);
            default:
                return super.toString();
        }
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        AbstractC1474fG.j(objArr, "array");
        return AbstractC1459f50.P(this, objArr);
    }
}
