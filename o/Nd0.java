package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Nd0 {
    public int[] l;
    public Object[] m;
    public int n;

    public Nd0() {
        this(0);
    }

    public final int a(Object obj) {
        int i = this.n * 2;
        Object[] objArr = this.m;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (AbstractC1474fG.b(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.n;
        int[] iArr = this.l;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            AbstractC1474fG.i(iArrCopyOf, "copyOf(this, newSize)");
            this.l = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.m, i * 2);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.m = objArrCopyOf;
        }
        if (this.n != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.n;
        if (i2 == 0) {
            return -1;
        }
        int iD = Nr0.d(i2, i, this.l);
        if (iD < 0 || AbstractC1474fG.b(obj, this.m[iD << 1])) {
            return iD;
        }
        int i3 = iD + 1;
        while (i3 < i2 && this.l[i3] == i) {
            if (AbstractC1474fG.b(obj, this.m[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iD - 1; i4 >= 0 && this.l[i4] == i; i4--) {
            if (AbstractC1474fG.b(obj, this.m[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.n > 0) {
            this.l = Nr0.c;
            this.m = Nr0.d;
            this.n = 0;
        }
        if (this.n > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.n;
        if (i == 0) {
            return -1;
        }
        int iD = Nr0.d(i, 0, this.l);
        if (iD < 0 || this.m[iD << 1] == null) {
            return iD;
        }
        int i2 = iD + 1;
        while (i2 < i && this.l[i2] == 0) {
            if (this.m[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iD - 1; i3 >= 0 && this.l[i3] == 0; i3--) {
            if (this.m[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Nd0) {
                int i = this.n;
                if (i != ((Nd0) obj).n) {
                    return false;
                }
                Nd0 nd0 = (Nd0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objJ = j(i2);
                    Object obj2 = nd0.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !nd0.containsKey(objF)) {
                            return false;
                        }
                    } else if (!AbstractC1474fG.b(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.n != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.n;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!AbstractC1474fG.b(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.n) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.m[i << 1];
    }

    public void g(S5 s5) {
        AbstractC1474fG.j(s5, "map");
        int i = s5.n;
        b(this.n + i);
        if (this.n != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(s5.f(i2), s5.j(i2));
            }
        } else if (i > 0) {
            X5.J(0, 0, i, s5.l, this.l);
            X5.K(0, 0, i << 1, s5.m, this.m);
            this.n = i;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.m[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.m[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.n)) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.m;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.l;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    X5.J(i, i5, i2, iArr, iArr);
                    Object[] objArr2 = this.m;
                    X5.K(i3, i5 << 1, i2 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.m;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
                AbstractC1474fG.i(iArrCopyOf, "copyOf(this, newSize)");
                this.l = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.m, i7 << 1);
                AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
                this.m = objArrCopyOf;
                if (i2 != this.n) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    X5.J(0, 0, i, iArr, this.l);
                    X5.K(0, 0, i3, objArr, this.m);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    X5.J(i, i8, i2, iArr, this.l);
                    X5.K(i3, i8 << 1, i2 << 1, objArr, this.m);
                }
            }
            if (i2 != this.n) {
                throw new ConcurrentModificationException();
            }
            this.n = i4;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.l;
        Object[] objArr = this.m;
        int i = this.n;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public Object i(int i, Object obj) {
        if (i < 0 || i >= this.n) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.m;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.n <= 0;
    }

    public final Object j(int i) {
        if (i < 0 || i >= this.n) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.m[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.n;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.m;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.l;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            AbstractC1474fG.i(iArrCopyOf, "copyOf(this, newSize)");
            this.l = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.m, i4 << 1);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.m = objArrCopyOf;
            if (i != this.n) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.l;
            int i5 = i3 + 1;
            X5.J(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.m;
            X5.K(i5 << 1, i3 << 1, this.n << 1, objArr2, objArr2);
        }
        int i6 = this.n;
        if (i == i6) {
            int[] iArr3 = this.l;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.m;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.n = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.n;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.n * 28);
        sb.append('{');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public Nd0(int i) {
        this.l = i == 0 ? Nr0.c : new int[i];
        this.m = i == 0 ? Nr0.d : new Object[i << 1];
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC1474fG.b(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC1474fG.b(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
