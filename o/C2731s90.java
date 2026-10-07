package o;

import java.util.Map;

/* JADX INFO: renamed from: o.s90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2731s90 implements Map.Entry {
    public final Object l;
    public final Object m;
    public C2731s90 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2731s90 f1020o;

    public C2731s90(Object obj, Object obj2) {
        this.l = obj;
        this.m = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2731s90)) {
            return false;
        }
        C2731s90 c2731s90 = (C2731s90) obj;
        return this.l.equals(c2731s90.l) && this.m.equals(c2731s90.m);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.l.hashCode() ^ this.m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.l + "=" + this.m;
    }
}
