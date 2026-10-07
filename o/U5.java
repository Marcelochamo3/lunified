package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class U5 implements Collection, Set, InterfaceC1866jI {
    public int[] l = Nr0.c;
    public Object[] m = Nr0.d;
    public int n;

    public final Object a(int i) {
        int i2 = this.n;
        Object[] objArr = this.m;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.l;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    X5.J(i, i4, i2, iArr, iArr);
                    Object[] objArr2 = this.m;
                    X5.K(i, i4, i2, objArr2, objArr2);
                }
                this.m[i3] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = new int[i5];
                this.l = iArr2;
                this.m = new Object[i5];
                if (i > 0) {
                    X5.J(0, 0, i, iArr, iArr2);
                    X5.L(0, i, 6, objArr, this.m);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    X5.J(i, i6, i2, iArr, this.l);
                    X5.K(i, i6, i2, objArr, this.m);
                }
            }
            if (i2 != this.n) {
                throw new ConcurrentModificationException();
            }
            this.n = i3;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iQ;
        int i2 = this.n;
        if (obj == null) {
            iQ = AbstractC3021v9.q(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iQ = AbstractC3021v9.q(this, obj, iHashCode);
        }
        if (iQ >= 0) {
            return false;
        }
        int i3 = ~iQ;
        int[] iArr = this.l;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.m;
            int[] iArr2 = new int[i4];
            this.l = iArr2;
            this.m = new Object[i4];
            if (i2 != this.n) {
                throw new ConcurrentModificationException();
            }
            if (!(iArr2.length == 0)) {
                X5.J(0, 0, iArr.length, iArr, iArr2);
                X5.L(0, objArr.length, 6, objArr, this.m);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.l;
            int i5 = i3 + 1;
            X5.J(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.m;
            X5.K(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.n;
        if (i2 == i6) {
            int[] iArr4 = this.l;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.m[i3] = obj;
                this.n = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        int size = collection.size() + this.n;
        int i = this.n;
        int[] iArr = this.l;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.m;
            int[] iArr2 = new int[size];
            this.l = iArr2;
            this.m = new Object[size];
            int i2 = this.n;
            if (i2 > 0) {
                X5.J(0, 0, i2, iArr, iArr2);
                X5.L(0, this.n, 6, objArr, this.m);
            }
        }
        if (this.n != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.n != 0) {
            this.l = Nr0.c;
            this.m = Nr0.d;
            this.n = 0;
        }
        if (this.n != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC3021v9.q(this, null, 0) : AbstractC3021v9.q(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
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
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.n == ((Set) obj).size()) {
            try {
                int i = this.n;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.m[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.l;
        int i = this.n;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new O5(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iQ = obj == null ? AbstractC3021v9.q(this, null, 0) : AbstractC3021v9.q(this, obj, obj.hashCode());
        if (iQ < 0) {
            return false;
        }
        a(iQ);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        boolean z = false;
        for (int i = this.n - 1; -1 < i; i--) {
            if (!AbstractC0911Ye.W(collection, this.m[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.m;
        int i = this.n;
        AbstractC1474fG.j(objArr, "<this>");
        AbstractC3409z9.h(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        AbstractC1474fG.i(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.n * 14);
        sb.append('{');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.m[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC1474fG.j(objArr, "array");
        int i = this.n;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        X5.K(0, 0, this.n, this.m, objArr);
        return objArr;
    }
}
