package o;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class DW extends J implements RandomAccess {
    public final C2468pa[] m;
    public final int[] n;

    public DW(C2468pa[] c2468paArr, int[] iArr) {
        this.m = c2468paArr;
        this.n = iArr;
    }

    @Override // o.Vp0
    public final int a() {
        return this.m.length;
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2468pa) {
            return super.contains((C2468pa) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.m[i];
    }

    @Override // o.J, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2468pa) {
            return super.indexOf((C2468pa) obj);
        }
        return -1;
    }

    @Override // o.J, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2468pa) {
            return super.lastIndexOf((C2468pa) obj);
        }
        return -1;
    }
}
