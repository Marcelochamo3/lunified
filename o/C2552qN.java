package o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: o.qN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2552qN implements Map, Serializable, InterfaceC2062lI {
    public static final C2552qN y;
    public Object[] l;
    public Object[] m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f990o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public C2648rN u;
    public C2745sN v;
    public C2648rN w;
    public boolean x;

    static {
        C2552qN c2552qN = new C2552qN(0);
        c2552qN.x = true;
        y = c2552qN;
    }

    public C2552qN() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.x) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        C1597gc0 c1597gc0 = new C1597gc0();
        c1597gc0.l = this;
        return c1597gc0;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.p * 2;
            int length = this.f990o.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f990o;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.q;
                    Object[] objArr = this.l;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.q = i6;
                    objArr[i5] = obj;
                    this.n[i5] = i;
                    iArr[i] = i6;
                    this.t++;
                    this.s++;
                    if (i3 > this.p) {
                        this.p = i3;
                    }
                    return i5;
                }
                if (AbstractC1474fG.b(this.l[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.f990o.length * 2);
                    break;
                }
                i = i == 0 ? this.f990o.length - 1 : i - 1;
            }
        }
    }

    public final C2552qN b() {
        c();
        this.x = true;
        if (this.t > 0) {
            return this;
        }
        C2552qN c2552qN = y;
        AbstractC1474fG.h(c2552qN, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2552qN;
    }

    public final void c() {
        if (this.x) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        YF it = new ZF(0, this.q - 1, 1).iterator();
        while (it.n) {
            int iA = it.a();
            int[] iArr = this.n;
            int i = iArr[iA];
            if (i >= 0) {
                this.f990o[i] = 0;
                iArr[iA] = -1;
            }
        }
        Jp0.I(this.l, 0, this.q);
        Object[] objArr = this.m;
        if (objArr != null) {
            Jp0.I(objArr, 0, this.q);
        }
        this.t = 0;
        this.q = 0;
        this.s++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        AbstractC1474fG.j(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        AbstractC1474fG.j(entry, "entry");
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = this.m;
        AbstractC1474fG.g(objArr);
        return AbstractC1474fG.b(objArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2648rN c2648rN = this.w;
        if (c2648rN != null) {
            return c2648rN;
        }
        C2648rN c2648rN2 = new C2648rN(this, 0);
        this.w = c2648rN2;
        return c2648rN2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.t != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.l;
        int length = objArr.length;
        int i2 = this.q;
        int i3 = length - i2;
        int i4 = i2 - this.t;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            j(this.f990o.length);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            AbstractC1474fG.i(objArrCopyOf2, "copyOf(...)");
            this.l = objArrCopyOf2;
            Object[] objArr2 = this.m;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                AbstractC1474fG.i(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.m = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.n, i6);
            AbstractC1474fG.i(iArrCopyOf, "copyOf(...)");
            this.n = iArrCopyOf;
            if (i6 < 1) {
                i6 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i6 * 3);
            if (iHighestOneBit > this.f990o.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.p;
        while (true) {
            int i3 = this.f990o[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (AbstractC1474fG.b(this.l[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.f990o.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.m;
        AbstractC1474fG.g(objArr);
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.q;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.n[i] >= 0) {
                Object[] objArr = this.m;
                AbstractC1474fG.g(objArr);
                if (AbstractC1474fG.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2261nN c2261nN = new C2261nN(this, 0);
        int i = 0;
        while (c2261nN.hasNext()) {
            int i2 = c2261nN.l;
            C2552qN c2552qN = (C2552qN) c2261nN.f969o;
            if (i2 >= c2552qN.q) {
                throw new NoSuchElementException();
            }
            c2261nN.l = i2 + 1;
            c2261nN.m = i2;
            Object obj = c2552qN.l[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2552qN.m;
            AbstractC1474fG.g(objArr);
            Object obj2 = objArr[c2261nN.m];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c2261nN.f();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.r;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.t == 0;
    }

    public final void j(int i) {
        int[] iArr;
        int i2;
        this.s++;
        int i3 = 0;
        if (this.q > this.t) {
            Object[] objArr = this.m;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i2 = this.q;
                if (i4 >= i2) {
                    break;
                }
                if (this.n[i4] >= 0) {
                    Object[] objArr2 = this.l;
                    objArr2[i5] = objArr2[i4];
                    if (objArr != null) {
                        objArr[i5] = objArr[i4];
                    }
                    i5++;
                }
                i4++;
            }
            Jp0.I(this.l, i5, i2);
            if (objArr != null) {
                Jp0.I(objArr, i5, this.q);
            }
            this.q = i5;
        }
        int[] iArr2 = this.f990o;
        if (i != iArr2.length) {
            this.f990o = new int[i];
            this.r = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr2, 0, iArr2.length, 0);
        }
        while (i3 < this.q) {
            int i6 = i3 + 1;
            int i7 = i(this.l[i3]);
            int i8 = this.p;
            while (true) {
                iArr = this.f990o;
                if (iArr[i7] == 0) {
                    break;
                }
                i8--;
                if (i8 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i7 = i7 == 0 ? iArr.length - 1 : i7 - 1;
            }
            iArr[i7] = i6;
            this.n[i3] = i7;
            i3 = i6;
        }
    }

    public final void k(int i) {
        Object[] objArr = this.l;
        AbstractC1474fG.j(objArr, "<this>");
        objArr[i] = null;
        int length = this.n[i];
        int i2 = this.p * 2;
        int length2 = this.f990o.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.f990o.length - 1 : length - 1;
            i4++;
            if (i4 > this.p) {
                this.f990o[i5] = 0;
            } else {
                int[] iArr = this.f990o;
                int i6 = iArr[length];
                if (i6 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i6 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i7 = i6 - 1;
                        int i8 = i(this.l[i7]) - length;
                        int[] iArr2 = this.f990o;
                        if ((i8 & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i6;
                            this.n[i7] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.n[i] = -1;
            this.t--;
            this.s++;
        } while (i3 >= 0);
        this.f990o[i5] = -1;
        this.n[i] = -1;
        this.t--;
        this.s++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2648rN c2648rN = this.u;
        if (c2648rN != null) {
            return c2648rN;
        }
        C2648rN c2648rN2 = new C2648rN(this, 1);
        this.u = c2648rN2;
        return c2648rN2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.m;
        if (objArr == null) {
            int length = this.l.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.m = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC1474fG.j(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.m;
            if (objArr == null) {
                int length = this.l.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.m = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!AbstractC1474fG.b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            iG = -1;
        } else {
            k(iG);
        }
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.m;
        AbstractC1474fG.g(objArr);
        Object obj2 = objArr[iG];
        objArr[iG] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.t * 3) + 2);
        sb.append("{");
        C2261nN c2261nN = new C2261nN(this, 0);
        int i = 0;
        while (c2261nN.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c2261nN.l;
            C2552qN c2552qN = (C2552qN) c2261nN.f969o;
            if (i2 >= c2552qN.q) {
                throw new NoSuchElementException();
            }
            c2261nN.l = i2 + 1;
            c2261nN.m = i2;
            Object obj = c2552qN.l[i2];
            if (obj == c2552qN) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2552qN.m;
            AbstractC1474fG.g(objArr);
            Object obj2 = objArr[c2261nN.m];
            if (obj2 == c2552qN) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c2261nN.f();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C2745sN c2745sN = this.v;
        if (c2745sN != null) {
            return c2745sN;
        }
        C2745sN c2745sN2 = new C2745sN(this);
        this.v = c2745sN2;
        return c2745sN2;
    }

    public C2552qN(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.l = objArr;
        this.m = null;
        this.n = iArr;
        this.f990o = new int[iHighestOneBit];
        this.p = 2;
        this.q = 0;
        this.r = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
