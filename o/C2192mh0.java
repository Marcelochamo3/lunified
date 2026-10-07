package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2192mh0 extends AbstractC1332dr {
    public final ArrayList a;
    public int b;

    public C2192mh0(AbstractC1332dr abstractC1332dr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = 2;
        arrayList.add(abstractC1332dr);
        this.b = abstractC1332dr.a() + this.b;
    }

    @Override // o.AbstractC1332dr
    public final int a() {
        return this.b;
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        if (c3176wp2 == c3176wp) {
            return false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (c3176wp2 == null || !((AbstractC1332dr) arrayList.get(size)).b(c3176wp, c3176wp2)) {
                return false;
            }
            c3176wp2 = (C3176wp) c3176wp2.l;
        }
        return true;
    }

    public final String toString() {
        return AbstractC1021ah0.g(" > ", this.a);
    }
}
