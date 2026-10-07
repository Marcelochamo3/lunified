package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class R5 implements Collection {
    public final /* synthetic */ S5 l;

    public R5(S5 s5) {
        this.l = s5;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.l.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.l.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.l.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new O5(this.l, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        S5 s5 = this.l;
        int iA = s5.a(obj);
        if (iA < 0) {
            return false;
        }
        s5.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        S5 s5 = this.l;
        int i = s5.n;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(s5.j(i2))) {
                s5.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        S5 s5 = this.l;
        int i = s5.n;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(s5.j(i2))) {
                s5.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.l.n;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        S5 s5 = this.l;
        int i = s5.n;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = s5.j(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        S5 s5 = this.l;
        int i = s5.n;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = s5.j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
