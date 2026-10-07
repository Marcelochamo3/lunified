package o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o.zK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3421zK extends AbstractC1155c0 implements RandomAccess, Serializable {
    public static final C3421zK r;
    public Object[] l;
    public final int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1151o;
    public final C3421zK p;
    public final C3421zK q;

    static {
        C3421zK c3421zK = new C3421zK(0);
        c3421zK.f1151o = true;
        r = c3421zK;
    }

    public C3421zK(Object[] objArr, int i, int i2, boolean z, C3421zK c3421zK, C3421zK c3421zK2) {
        this.l = objArr;
        this.m = i;
        this.n = i2;
        this.f1151o = z;
        this.p = c3421zK;
        this.q = c3421zK2;
        if (c3421zK != null) {
            ((AbstractList) this).modCount = ((AbstractList) c3421zK).modCount;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        C3421zK c3421zK;
        if (this.f1151o || ((c3421zK = this.q) != null && c3421zK.f1151o)) {
            return new C1499fc0(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // o.AbstractC1155c0
    public final int a() {
        h();
        return this.n;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.m + this.n, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        i();
        h();
        int size = collection.size();
        f(this.m + this.n, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        l(this.m, this.n);
    }

    @Override // o.AbstractC1155c0
    public final Object d(int i) {
        i();
        h();
        int i2 = this.n;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        return k(this.m + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.l;
            int i = this.n;
            if (i != list.size()) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!AbstractC1474fG.b(objArr[this.m + i2], list.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C3421zK c3421zK = this.p;
        if (c3421zK != null) {
            c3421zK.f(i, collection, i2);
            this.l = c3421zK.l;
            this.n += i2;
        } else {
            j(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.l[i + i3] = it.next();
            }
        }
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C3421zK c3421zK = this.p;
        if (c3421zK == null) {
            j(i, 1);
            this.l[i] = obj;
        } else {
            c3421zK.g(i, obj);
            this.l = c3421zK.l;
            this.n++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        int i2 = this.n;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        return this.l[this.m + i];
    }

    public final void h() {
        C3421zK c3421zK = this.q;
        if (c3421zK != null && ((AbstractList) c3421zK).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.l;
        int i = this.n;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.m + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        C3421zK c3421zK;
        if (this.f1151o || ((c3421zK = this.q) != null && c3421zK.f1151o)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.n; i++) {
            if (AbstractC1474fG.b(this.l[this.m + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.n == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        int i3 = this.n + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.l;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(...)");
            this.l = objArrCopyOf;
        }
        Object[] objArr2 = this.l;
        X5.K(i + i2, i, this.m + this.n, objArr2, objArr2);
        this.n += i2;
    }

    public final Object k(int i) {
        ((AbstractList) this).modCount++;
        C3421zK c3421zK = this.p;
        if (c3421zK != null) {
            Object objK = c3421zK.k(i);
            this.n--;
            return objK;
        }
        Object[] objArr = this.l;
        Object obj = objArr[i];
        int i2 = this.n;
        int i3 = this.m;
        X5.K(i, i + 1, i2 + i3, objArr, objArr);
        Object[] objArr2 = this.l;
        int i4 = (i3 + this.n) - 1;
        AbstractC1474fG.j(objArr2, "<this>");
        objArr2[i4] = null;
        this.n--;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C3421zK c3421zK = this.p;
        if (c3421zK != null) {
            c3421zK.l(i, i2);
        } else {
            Object[] objArr = this.l;
            X5.K(i, i + i2, this.n, objArr, objArr);
            Object[] objArr2 = this.l;
            int i3 = this.n;
            Jp0.I(objArr2, i3 - i2, i3);
        }
        this.n -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.n - 1; i >= 0; i--) {
            if (AbstractC1474fG.b(this.l[this.m + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m(int i, int i2, Collection collection, boolean z) {
        int iM;
        C3421zK c3421zK = this.p;
        if (c3421zK != null) {
            iM = c3421zK.m(i, i2, collection, z);
        } else {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i + i3;
                if (collection.contains(this.l[i5]) == z) {
                    Object[] objArr = this.l;
                    i3++;
                    objArr[i4 + i] = objArr[i5];
                    i4++;
                } else {
                    i3++;
                }
            }
            int i6 = i2 - i4;
            Object[] objArr2 = this.l;
            X5.K(i + i4, i2 + i, this.n, objArr2, objArr2);
            Object[] objArr3 = this.l;
            int i7 = this.n;
            Jp0.I(objArr3, i7 - i6, i7);
            iM = i6;
        }
        if (iM > 0) {
            ((AbstractList) this).modCount++;
        }
        this.n -= iM;
        return iM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        i();
        h();
        return m(this.m, this.n, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        i();
        h();
        return m(this.m, this.n, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        int i2 = this.n;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.l;
        int i3 = this.m;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1468fA.d(i, i2, this.n);
        Object[] objArr = this.l;
        int i3 = this.m + i;
        int i4 = i2 - i;
        boolean z = this.f1151o;
        C3421zK c3421zK = this.q;
        return new C3421zK(objArr, i3, i4, z, this, c3421zK == null ? this : c3421zK);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1474fG.j(objArr, "destination");
        h();
        int length = objArr.length;
        int i = this.n;
        int i2 = this.m;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.l, i2, i + i2, objArr.getClass());
            AbstractC1474fG.i(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        X5.K(0, i2, i + i2, this.l, objArr);
        int i3 = this.n;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        Object[] objArr = this.l;
        int i = this.n;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.m + i2];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        int i2 = this.n;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        return new C3324yK(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        int i2 = this.n;
        if (i >= 0 && i <= i2) {
            g(this.m + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        i();
        h();
        int i2 = this.n;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            f(this.m + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.l;
        int i = this.n;
        int i2 = this.m;
        int i3 = i + i2;
        AbstractC1474fG.j(objArr, "<this>");
        AbstractC3409z9.h(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        AbstractC1474fG.i(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public C3421zK() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3421zK(int i) {
        this(new Object[i], 0, 0, false, null, null);
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
