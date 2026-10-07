package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: o.xK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3227xK extends AbstractMap implements Serializable {
    public static final N2 t = new N2(20);
    public final Comparator l;
    public final boolean m;
    public C3130wK n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1115o;
    public int p;
    public final C3130wK q;
    public C3033vK r;
    public C3033vK s;

    public C3227xK(boolean z) {
        N2 n2 = t;
        this.f1115o = 0;
        this.p = 0;
        this.l = n2;
        this.m = z;
        this.q = new C3130wK(z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final C3130wK a(Object obj, boolean z) {
        int iCompareTo;
        C3130wK c3130wK;
        C3130wK c3130wK2 = this.n;
        N2 n2 = t;
        Comparator comparator = this.l;
        if (c3130wK2 != null) {
            Comparable comparable = comparator == n2 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c3130wK2.q;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c3130wK2;
                }
                C3130wK c3130wK3 = iCompareTo < 0 ? c3130wK2.m : c3130wK2.n;
                if (c3130wK3 == null) {
                    break;
                }
                c3130wK2 = c3130wK3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C3130wK c3130wK4 = this.q;
        if (c3130wK2 != null) {
            c3130wK = new C3130wK(this.m, c3130wK2, obj, c3130wK4, c3130wK4.p);
            if (iCompareTo < 0) {
                c3130wK2.m = c3130wK;
            } else {
                c3130wK2.n = c3130wK;
            }
            b(c3130wK2, true);
        } else {
            if (comparator == n2 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c3130wK = new C3130wK(this.m, c3130wK2, obj, c3130wK4, c3130wK4.p);
            this.n = c3130wK;
        }
        this.f1115o++;
        this.p++;
        return c3130wK;
    }

    public final void b(C3130wK c3130wK, boolean z) {
        while (c3130wK != null) {
            C3130wK c3130wK2 = c3130wK.m;
            C3130wK c3130wK3 = c3130wK.n;
            int i = c3130wK2 != null ? c3130wK2.t : 0;
            int i2 = c3130wK3 != null ? c3130wK3.t : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C3130wK c3130wK4 = c3130wK3.m;
                C3130wK c3130wK5 = c3130wK3.n;
                int i4 = (c3130wK4 != null ? c3130wK4.t : 0) - (c3130wK5 != null ? c3130wK5.t : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(c3130wK);
                } else {
                    f(c3130wK3);
                    e(c3130wK);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C3130wK c3130wK6 = c3130wK2.m;
                C3130wK c3130wK7 = c3130wK2.n;
                int i5 = (c3130wK6 != null ? c3130wK6.t : 0) - (c3130wK7 != null ? c3130wK7.t : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(c3130wK);
                } else {
                    e(c3130wK2);
                    f(c3130wK);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c3130wK.t = i + 1;
                if (z) {
                    return;
                }
            } else {
                c3130wK.t = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c3130wK = c3130wK.l;
        }
    }

    public final void c(C3130wK c3130wK, boolean z) {
        C3130wK c3130wK2;
        C3130wK c3130wK3;
        int i;
        if (z) {
            C3130wK c3130wK4 = c3130wK.p;
            c3130wK4.f1091o = c3130wK.f1091o;
            c3130wK.f1091o.p = c3130wK4;
        }
        C3130wK c3130wK5 = c3130wK.m;
        C3130wK c3130wK6 = c3130wK.n;
        C3130wK c3130wK7 = c3130wK.l;
        int i2 = 0;
        if (c3130wK5 == null || c3130wK6 == null) {
            if (c3130wK5 != null) {
                d(c3130wK, c3130wK5);
                c3130wK.m = null;
            } else if (c3130wK6 != null) {
                d(c3130wK, c3130wK6);
                c3130wK.n = null;
            } else {
                d(c3130wK, null);
            }
            b(c3130wK7, false);
            this.f1115o--;
            this.p++;
            return;
        }
        if (c3130wK5.t > c3130wK6.t) {
            C3130wK c3130wK8 = c3130wK5.n;
            while (true) {
                C3130wK c3130wK9 = c3130wK8;
                c3130wK3 = c3130wK5;
                c3130wK5 = c3130wK9;
                if (c3130wK5 == null) {
                    break;
                } else {
                    c3130wK8 = c3130wK5.n;
                }
            }
        } else {
            C3130wK c3130wK10 = c3130wK6.m;
            while (true) {
                c3130wK2 = c3130wK6;
                c3130wK6 = c3130wK10;
                if (c3130wK6 == null) {
                    break;
                } else {
                    c3130wK10 = c3130wK6.m;
                }
            }
            c3130wK3 = c3130wK2;
        }
        c(c3130wK3, false);
        C3130wK c3130wK11 = c3130wK.m;
        if (c3130wK11 != null) {
            i = c3130wK11.t;
            c3130wK3.m = c3130wK11;
            c3130wK11.l = c3130wK3;
            c3130wK.m = null;
        } else {
            i = 0;
        }
        C3130wK c3130wK12 = c3130wK.n;
        if (c3130wK12 != null) {
            i2 = c3130wK12.t;
            c3130wK3.n = c3130wK12;
            c3130wK12.l = c3130wK3;
            c3130wK.n = null;
        }
        c3130wK3.t = Math.max(i, i2) + 1;
        d(c3130wK, c3130wK3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.n = null;
        this.f1115o = 0;
        this.p++;
        C3130wK c3130wK = this.q;
        c3130wK.p = c3130wK;
        c3130wK.f1091o = c3130wK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C3130wK c3130wKA = null;
        if (obj != null) {
            try {
                c3130wKA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c3130wKA != null;
    }

    public final void d(C3130wK c3130wK, C3130wK c3130wK2) {
        C3130wK c3130wK3 = c3130wK.l;
        c3130wK.l = null;
        if (c3130wK2 != null) {
            c3130wK2.l = c3130wK3;
        }
        if (c3130wK3 == null) {
            this.n = c3130wK2;
        } else if (c3130wK3.m == c3130wK) {
            c3130wK3.m = c3130wK2;
        } else {
            c3130wK3.n = c3130wK2;
        }
    }

    public final void e(C3130wK c3130wK) {
        C3130wK c3130wK2 = c3130wK.m;
        C3130wK c3130wK3 = c3130wK.n;
        C3130wK c3130wK4 = c3130wK3.m;
        C3130wK c3130wK5 = c3130wK3.n;
        c3130wK.n = c3130wK4;
        if (c3130wK4 != null) {
            c3130wK4.l = c3130wK;
        }
        d(c3130wK, c3130wK3);
        c3130wK3.m = c3130wK;
        c3130wK.l = c3130wK3;
        int iMax = Math.max(c3130wK2 != null ? c3130wK2.t : 0, c3130wK4 != null ? c3130wK4.t : 0) + 1;
        c3130wK.t = iMax;
        c3130wK3.t = Math.max(iMax, c3130wK5 != null ? c3130wK5.t : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3033vK c3033vK = this.r;
        if (c3033vK != null) {
            return c3033vK;
        }
        C3033vK c3033vK2 = new C3033vK(this, 0);
        this.r = c3033vK2;
        return c3033vK2;
    }

    public final void f(C3130wK c3130wK) {
        C3130wK c3130wK2 = c3130wK.m;
        C3130wK c3130wK3 = c3130wK.n;
        C3130wK c3130wK4 = c3130wK2.m;
        C3130wK c3130wK5 = c3130wK2.n;
        c3130wK.m = c3130wK5;
        if (c3130wK5 != null) {
            c3130wK5.l = c3130wK;
        }
        d(c3130wK, c3130wK2);
        c3130wK2.n = c3130wK;
        c3130wK.l = c3130wK2;
        int iMax = Math.max(c3130wK3 != null ? c3130wK3.t : 0, c3130wK5 != null ? c3130wK5.t : 0) + 1;
        c3130wK.t = iMax;
        c3130wK2.t = Math.max(iMax, c3130wK4 != null ? c3130wK4.t : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C3130wK c3130wKA;
        if (obj != null) {
            try {
                c3130wKA = a(obj, false);
            } catch (ClassCastException unused) {
                c3130wKA = null;
            }
        } else {
            c3130wKA = null;
        }
        if (c3130wKA != null) {
            return c3130wKA.s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3033vK c3033vK = this.s;
        if (c3033vK != null) {
            return c3033vK;
        }
        C3033vK c3033vK2 = new C3033vK(this, 1);
        this.s = c3033vK2;
        return c3033vK2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.m) {
            throw new NullPointerException("value == null");
        }
        C3130wK c3130wKA = a(obj, true);
        Object obj3 = c3130wKA.s;
        c3130wKA.s = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C3130wK c3130wKA;
        if (obj != null) {
            try {
                c3130wKA = a(obj, false);
            } catch (ClassCastException unused) {
                c3130wKA = null;
            }
        } else {
            c3130wKA = null;
        }
        if (c3130wKA != null) {
            c(c3130wKA, true);
        }
        if (c3130wKA != null) {
            return c3130wKA.s;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1115o;
    }
}
