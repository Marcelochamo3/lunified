package o;

/* JADX INFO: renamed from: o.zF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3416zF {
    public final int a;
    public final Object b;

    public C3416zF(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3416zF)) {
            return false;
        }
        C3416zF c3416zF = (C3416zF) obj;
        return this.a == c3416zF.a && AbstractC1474fG.b(this.b, c3416zF.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
