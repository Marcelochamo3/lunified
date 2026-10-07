package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1101bX implements Serializable {
    public final Object l;
    public final Object m;

    public C1101bX(Object obj, Object obj2) {
        this.l = obj;
        this.m = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101bX)) {
            return false;
        }
        C1101bX c1101bX = (C1101bX) obj;
        return AbstractC1474fG.b(this.l, c1101bX.l) && AbstractC1474fG.b(this.m, c1101bX.m);
    }

    public final int hashCode() {
        Object obj = this.l;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.m;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.l + ", " + this.m + ')';
    }
}
