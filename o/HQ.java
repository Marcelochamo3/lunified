package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class HQ {
    public final SparseArray a;
    public Rp0 b;

    public HQ(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(Rp0 rp0, int i, int i2) {
        int iA = rp0.a(i);
        SparseArray sparseArray = this.a;
        HQ hq = sparseArray == null ? null : (HQ) sparseArray.get(iA);
        if (hq == null) {
            hq = new HQ(1);
            sparseArray.put(rp0.a(i), hq);
        }
        if (i2 > i) {
            hq.a(rp0, i + 1, i2);
        } else {
            hq.b = rp0;
        }
    }
}
