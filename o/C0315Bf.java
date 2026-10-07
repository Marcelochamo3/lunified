package o;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: o.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0315Bf extends HW implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator l;

    public C0315Bf(Comparator comparator) {
        this.l = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.l.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0315Bf) {
            return this.l.equals(((C0315Bf) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return this.l.toString();
    }
}
