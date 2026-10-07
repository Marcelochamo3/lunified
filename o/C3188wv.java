package o;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: o.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3188wv {
    public final SparseBooleanArray a;

    public C3188wv(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        AbstractC0397Ej.d(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3188wv)) {
            return false;
        }
        C3188wv c3188wv = (C3188wv) obj;
        int i = Lr0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(c3188wv.a);
        }
        if (sparseBooleanArray.size() != c3188wv.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != c3188wv.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Lr0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
