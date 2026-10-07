package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o.iG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1768iG extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final int[] l;
    public final int m;
    public final int n;

    public C1768iG(int i, int i2, int[] iArr) {
        this.l = iArr;
        this.m = i;
        this.n = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (Pu0.n(((Integer) obj).intValue(), this.m, this.n, this.l) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1768iG)) {
            return super.equals(obj);
        }
        C1768iG c1768iG = (C1768iG) obj;
        int size = size();
        if (c1768iG.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.l[this.m + i] != c1768iG.l[c1768iG.m + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC1459f50.h(i, size());
        return Integer.valueOf(this.l[this.m + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.m; i2 < this.n; i2++) {
            i = (i * 31) + this.l[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.l;
        int i = this.m;
        int iN = Pu0.n(iIntValue, i, this.n, iArr);
        if (iN >= 0) {
            return iN - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.n;
            do {
                i2--;
                i = this.m;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.l[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        AbstractC1459f50.h(i, size());
        int i2 = this.m + i;
        int[] iArr = this.l;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n - this.m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC1459f50.j(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int i3 = this.m;
        return new C1768iG(i + i3, i3 + i2, this.l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.l;
        int i = this.m;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.n) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
