package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class M5 extends AbstractC1155c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object[] f391o = new Object[0];
    public int l;
    public Object[] m = f391o;
    public int n;

    @Override // o.AbstractC1155c0
    public final int a() {
        return this.n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.n;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            f(obj);
            return;
        }
        if (i == 0) {
            e(obj);
            return;
        }
        h(i2 + 1);
        int iK = k(this.l + i);
        int i3 = this.n;
        if (i < ((i3 + 1) >> 1)) {
            if (iK == 0) {
                Object[] objArr = this.m;
                AbstractC1474fG.j(objArr, "<this>");
                iK = objArr.length;
            }
            int i4 = iK - 1;
            int i5 = this.l;
            if (i5 == 0) {
                Object[] objArr2 = this.m;
                AbstractC1474fG.j(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.l;
            if (i4 >= i6) {
                Object[] objArr3 = this.m;
                objArr3[length] = objArr3[i6];
                X5.K(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.m;
                X5.K(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.m;
                objArr5[objArr5.length - 1] = objArr5[0];
                X5.K(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.m[i4] = obj;
            this.l = length;
        } else {
            int iK2 = k(i3 + this.l);
            if (iK < iK2) {
                Object[] objArr6 = this.m;
                X5.K(iK + 1, iK, iK2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.m;
                X5.K(1, 0, iK2, objArr7, objArr7);
                Object[] objArr8 = this.m;
                objArr8[0] = objArr8[objArr8.length - 1];
                X5.K(iK + 1, iK, objArr8.length - 1, objArr8, objArr8);
            }
            this.m[iK] = obj;
        }
        this.n++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        int i2 = this.n;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.n;
        if (i == i3) {
            return addAll(collection);
        }
        h(collection.size() + i3);
        int iK = k(this.n + this.l);
        int iK2 = k(this.l + i);
        int size = collection.size();
        if (i < ((this.n + 1) >> 1)) {
            int i4 = this.l;
            int length = i4 - size;
            if (iK2 < i4) {
                Object[] objArr = this.m;
                X5.K(length, i4, objArr.length, objArr, objArr);
                if (size >= iK2) {
                    Object[] objArr2 = this.m;
                    X5.K(objArr2.length - size, 0, iK2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.m;
                    X5.K(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.m;
                    X5.K(0, size, iK2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.m;
                X5.K(length, i4, iK2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.m;
                length += objArr6.length;
                int i5 = iK2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    X5.K(length, i4, iK2, objArr6, objArr6);
                } else {
                    X5.K(length, i4, i4 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.m;
                    X5.K(0, this.l + length2, iK2, objArr7, objArr7);
                }
            }
            this.l = length;
            int length3 = iK2 - size;
            if (length3 < 0) {
                length3 += this.m.length;
            }
            g(length3, collection);
        } else {
            int i6 = iK2 + size;
            if (iK2 < iK) {
                int i7 = size + iK;
                Object[] objArr8 = this.m;
                if (i7 <= objArr8.length) {
                    X5.K(i6, iK2, iK, objArr8, objArr8);
                } else if (i6 >= objArr8.length) {
                    X5.K(i6 - objArr8.length, iK2, iK, objArr8, objArr8);
                } else {
                    int length4 = iK - (i7 - objArr8.length);
                    X5.K(0, length4, iK, objArr8, objArr8);
                    Object[] objArr9 = this.m;
                    X5.K(i6, iK2, length4, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.m;
                X5.K(size, 0, iK, objArr10, objArr10);
                Object[] objArr11 = this.m;
                if (i6 >= objArr11.length) {
                    X5.K(i6 - objArr11.length, iK2, objArr11.length, objArr11, objArr11);
                } else {
                    X5.K(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.m;
                    X5.K(i6, iK2, objArr12.length - size, objArr12, objArr12);
                }
            }
            g(iK2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iK = k(this.n + this.l);
        int i = this.l;
        if (i < iK) {
            X5.N(this.m, null, i, iK);
        } else if (!isEmpty()) {
            Object[] objArr = this.m;
            Arrays.fill(objArr, this.l, objArr.length, (Object) null);
            X5.N(this.m, null, 0, iK);
        }
        this.l = 0;
        this.n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // o.AbstractC1155c0
    public final Object d(int i) {
        int i2 = this.n;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, i2, "index: ", ", size: "));
        }
        if (i == AbstractC0937Ze.J(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iK = k(AbstractC0937Ze.J(this) + this.l);
            Object[] objArr = this.m;
            Object obj = objArr[iK];
            objArr[iK] = null;
            this.n--;
            return obj;
        }
        if (i == 0) {
            return l();
        }
        int iK2 = k(this.l + i);
        Object[] objArr2 = this.m;
        Object obj2 = objArr2[iK2];
        if (i < (this.n >> 1)) {
            int i3 = this.l;
            if (iK2 >= i3) {
                X5.K(i3 + 1, i3, iK2, objArr2, objArr2);
            } else {
                X5.K(1, 0, iK2, objArr2, objArr2);
                Object[] objArr3 = this.m;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.l;
                X5.K(i4 + 1, i4, objArr3.length - 1, objArr3, objArr3);
            }
            Object[] objArr4 = this.m;
            int i5 = this.l;
            objArr4[i5] = null;
            this.l = i(i5);
        } else {
            int iK3 = k(AbstractC0937Ze.J(this) + this.l);
            if (iK2 <= iK3) {
                Object[] objArr5 = this.m;
                X5.K(iK2, iK2 + 1, iK3 + 1, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.m;
                X5.K(iK2, iK2 + 1, objArr6.length, objArr6, objArr6);
                Object[] objArr7 = this.m;
                objArr7[objArr7.length - 1] = objArr7[0];
                X5.K(0, 1, iK3 + 1, objArr7, objArr7);
            }
            this.m[iK3] = null;
        }
        this.n--;
        return obj2;
    }

    public final void e(Object obj) {
        h(this.n + 1);
        int length = this.l;
        if (length == 0) {
            Object[] objArr = this.m;
            AbstractC1474fG.j(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.l = i;
        this.m[i] = obj;
        this.n++;
    }

    public final void f(Object obj) {
        h(a() + 1);
        this.m[k(a() + this.l)] = obj;
        this.n = a() + 1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.m[this.l];
    }

    public final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.m.length;
        while (i < length && it.hasNext()) {
            this.m[i] = it.next();
            i++;
        }
        int i2 = this.l;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.m[i3] = it.next();
        }
        this.n = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, iA, "index: ", ", size: "));
        }
        return this.m[k(this.l + i)];
    }

    public final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.m;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f391o) {
            if (i < 10) {
                i = 10;
            }
            this.m = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        X5.K(0, this.l, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.m;
        int length2 = objArr3.length;
        int i3 = this.l;
        X5.K(length2 - i3, 0, i3, objArr3, objArr2);
        this.l = 0;
        this.m = objArr2;
    }

    public final int i(int i) {
        Object[] objArr = this.m;
        AbstractC1474fG.j(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iK = k(a() + this.l);
        int length = this.l;
        if (length < iK) {
            while (length < iK) {
                if (AbstractC1474fG.b(obj, this.m[length])) {
                    i = this.l;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iK) {
            return -1;
        }
        int length2 = this.m.length;
        while (length < length2) {
            if (AbstractC1474fG.b(obj, this.m[length])) {
                i = this.l;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iK; i2++) {
            if (AbstractC1474fG.b(obj, this.m[i2])) {
                length = i2 + this.m.length;
                i = this.l;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.m[k(AbstractC0937Ze.J(this) + this.l)];
    }

    public final int k(int i) {
        Object[] objArr = this.m;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final Object l() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.m;
        int i = this.l;
        Object obj = objArr[i];
        objArr[i] = null;
        this.l = i(i);
        this.n = a() - 1;
        return obj;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.m[k(AbstractC0937Ze.J(this) + this.l)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iK = k(this.n + this.l);
        int i2 = this.l;
        if (i2 < iK) {
            length = iK - 1;
            if (i2 <= length) {
                while (!AbstractC1474fG.b(obj, this.m[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.l;
                return length - i;
            }
            return -1;
        }
        if (i2 > iK) {
            for (int i3 = iK - 1; -1 < i3; i3--) {
                if (AbstractC1474fG.b(obj, this.m[i3])) {
                    length = i3 + this.m.length;
                    i = this.l;
                    return length - i;
                }
            }
            Object[] objArr = this.m;
            AbstractC1474fG.j(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.l;
            if (i4 <= length) {
                while (!AbstractC1474fG.b(obj, this.m[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.l;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iK;
        AbstractC1474fG.j(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.m.length != 0) {
            int iK2 = k(this.n + this.l);
            int i = this.l;
            if (i < iK2) {
                iK = i;
                while (i < iK2) {
                    Object obj = this.m[i];
                    if (!collection.contains(obj)) {
                        this.m[iK] = obj;
                        iK++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                X5.N(this.m, null, iK, iK2);
            } else {
                int length = this.m.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.m;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.m[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iK = k(i2);
                for (int i3 = 0; i3 < iK2; i3++) {
                    Object[] objArr2 = this.m;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.m[iK] = obj3;
                        iK = i(iK);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iK - this.l;
                if (length2 < 0) {
                    length2 += this.m.length;
                }
                this.n = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iK;
        AbstractC1474fG.j(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.m.length != 0) {
            int iK2 = k(this.n + this.l);
            int i = this.l;
            if (i < iK2) {
                iK = i;
                while (i < iK2) {
                    Object obj = this.m[i];
                    if (collection.contains(obj)) {
                        this.m[iK] = obj;
                        iK++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                X5.N(this.m, null, iK, iK2);
            } else {
                int length = this.m.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.m;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.m[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iK = k(i2);
                for (int i3 = 0; i3 < iK2; i3++) {
                    Object[] objArr2 = this.m;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.m[iK] = obj3;
                        iK = i(iK);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iK - this.l;
                if (length2 < 0) {
                    length2 += this.m.length;
                }
                this.n = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, iA, "index: ", ", size: "));
        }
        int iK = k(this.l + i);
        Object[] objArr = this.m;
        Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1474fG.j(objArr, "array");
        int length = objArr.length;
        int i = this.n;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC1474fG.h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iK = k(this.n + this.l);
        int i2 = this.l;
        if (i2 < iK) {
            X5.L(i2, iK, 2, this.m, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.m;
            X5.K(0, this.l, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.m;
            X5.K(objArr3.length - this.l, 0, iK, objArr3, objArr);
        }
        int i3 = this.n;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        h(collection.size() + a());
        g(k(a() + this.l), collection);
        return true;
    }
}
