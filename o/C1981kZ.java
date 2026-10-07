package o;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: o.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1981kZ implements T9 {
    public final C3188wv l;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC0397Ej.f(!false);
        new C3188wv(sparseBooleanArray);
        int i = Lr0.a;
        Integer.toString(0, 36);
    }

    public C1981kZ(C3188wv c3188wv) {
        this.l = c3188wv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1981kZ) {
            return this.l.equals(((C1981kZ) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
