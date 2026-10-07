package o;

import java.util.Map;

/* JADX INFO: renamed from: o.wK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3130wK implements Map.Entry {
    public C3130wK l;
    public C3130wK m;
    public C3130wK n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3130wK f1091o;
    public C3130wK p;
    public final Object q;
    public final boolean r;
    public Object s;
    public int t;

    public C3130wK(boolean z) {
        this.q = null;
        this.r = z;
        this.p = this;
        this.f1091o = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.q;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.s;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.q;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.s;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.r) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.s;
        this.s = obj;
        return obj2;
    }

    public final String toString() {
        return this.q + "=" + this.s;
    }

    public C3130wK(boolean z, C3130wK c3130wK, Object obj, C3130wK c3130wK2, C3130wK c3130wK3) {
        this.l = c3130wK;
        this.q = obj;
        this.r = z;
        this.t = 1;
        this.f1091o = c3130wK2;
        this.p = c3130wK3;
        c3130wK3.f1091o = this;
        c3130wK2.p = this;
    }
}
