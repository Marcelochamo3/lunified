package o;

import java.util.Map;

/* JADX INFO: renamed from: o.oN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2358oN implements Map.Entry, InterfaceC1770iI {
    public final C2552qN l;
    public final int m;

    public C2358oN(C2552qN c2552qN, int i) {
        AbstractC1474fG.j(c2552qN, "map");
        this.l = c2552qN;
        this.m = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC1474fG.b(entry.getKey(), getKey()) && AbstractC1474fG.b(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l.l[this.m];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.l.m;
        AbstractC1474fG.g(objArr);
        return objArr[this.m];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2552qN c2552qN = this.l;
        c2552qN.c();
        Object[] objArr = c2552qN.m;
        if (objArr == null) {
            int length = c2552qN.l.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            c2552qN.m = objArr;
        }
        int i = this.m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
