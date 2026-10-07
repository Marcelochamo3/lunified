package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o.aF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985aF extends UE implements List, RandomAccess {
    public static final XE m = new XE(M60.p, 0);

    public static M60 j(int i, Object[] objArr) {
        return i == 0 ? M60.p : new M60(i, objArr);
    }

    public static WE k() {
        return new WE();
    }

    public static AbstractC0985aF l(Collection collection) {
        if (!(collection instanceof UE)) {
            Object[] array = collection.toArray();
            AbstractC3045vW.i(array.length, array);
            return j(array.length, array);
        }
        AbstractC0985aF abstractC0985aFA = ((UE) collection).a();
        if (!abstractC0985aFA.h()) {
            return abstractC0985aFA;
        }
        Object[] array2 = abstractC0985aFA.toArray(UE.l);
        return j(array2.length, array2);
    }

    public static M60 m(Object[] objArr) {
        if (objArr.length == 0) {
            return M60.p;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC3045vW.i(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static M60 o() {
        return M60.p;
    }

    public static M60 p(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        AbstractC3045vW.i(5, objArr);
        return j(5, objArr);
    }

    public static M60 q(Object obj) {
        Object[] objArr = {obj};
        AbstractC3045vW.i(1, objArr);
        return j(1, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // o.UE
    public int d(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (AbstractC1459f50.p(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC1459f50.p(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // o.UE
    /* JADX INFO: renamed from: i */
    public final Aq0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.UE, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final XE listIterator(int i) {
        AbstractC1459f50.i(i, size());
        return isEmpty() ? m : new XE(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC0985aF subList(int i, int i2) {
        AbstractC1459f50.j(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? M60.p : new ZE(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.UE
    public Object writeReplace() {
        return new YE(toArray(UE.l));
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o.UE
    public final AbstractC0985aF a() {
        return this;
    }
}
